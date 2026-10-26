package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r4 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f1869b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1870c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f1871d;
    private final /* synthetic */ m4 e;

    public r4(m4 m4Var, String str, Bundle bundle) {
        this.e = m4Var;
        com.google.android.gms.common.internal.q.g(str);
        this.a = str;
        this.f1869b = new Bundle();
    }

    private final String c(Bundle bundle) throws JSONException {
        String str;
        JSONArray jSONArray = new JSONArray();
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", str2);
                    jSONObject.put("v", String.valueOf(obj));
                    if (obj instanceof String) {
                        str = "s";
                    } else if (obj instanceof Long) {
                        str = "l";
                    } else if (obj instanceof Double) {
                        str = "d";
                    } else {
                        this.e.m().G().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                    }
                    jSONObject.put("t", str);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    this.e.m().G().b("Cannot serialize bundle value to SharedPreferences", e);
                }
            }
        }
        return jSONArray.toString();
    }

    public final Bundle a() throws JSONException {
        if (!this.f1870c) {
            this.f1870c = true;
            String string = this.e.C().getString(this.a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            char c2 = 65535;
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode == 115 && string3.equals("s")) {
                                        c2 = 0;
                                    }
                                } else if (string3.equals("l")) {
                                    c2 = 2;
                                }
                            } else if (string3.equals("d")) {
                                c2 = 1;
                            }
                            if (c2 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c2 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c2 != 2) {
                                this.e.m().G().b("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.e.m().G().a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f1871d = bundle;
                } catch (JSONException unused2) {
                    this.e.m().G().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f1871d == null) {
                this.f1871d = this.f1869b;
            }
        }
        return this.f1871d;
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor editorEdit = this.e.C().edit();
        if (bundle.size() == 0) {
            editorEdit.remove(this.a);
        } else {
            editorEdit.putString(this.a, c(bundle));
        }
        editorEdit.apply();
        this.f1871d = bundle;
    }
}

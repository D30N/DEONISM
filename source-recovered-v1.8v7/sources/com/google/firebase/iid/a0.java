package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class a0 {

    /* renamed from: d, reason: collision with root package name */
    private static final long f2208d = TimeUnit.DAYS.toMillis(7);
    final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2209b;

    /* renamed from: c, reason: collision with root package name */
    private final long f2210c;

    private a0(String str, String str2, long j) {
        this.a = str;
        this.f2209b = str2;
        this.f2210c = j;
    }

    static a0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new a0(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new a0(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    static String b(String str, String str2, long j) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    final boolean c(String str) {
        return System.currentTimeMillis() > this.f2210c + f2208d || !str.equals(this.f2209b);
    }
}

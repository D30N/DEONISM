package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
final class b0 {
    private final SharedPreferences a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f2214b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Long> f2215c = new b.d.a();

    public b0(Context context) {
        this.f2214b = context;
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(b.g.d.a.g(this.f2214b), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || f()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            c();
            FirebaseInstanceId.b().w();
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e.getMessage());
                Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(strValueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    private static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    private final synchronized boolean f() {
        return this.a.getAll().isEmpty();
    }

    private static String g(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    private final long i(String str) {
        String string = this.a.getString(b(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public final synchronized a0 a(String str, String str2, String str3) {
        return a0.a(this.a.getString(g(str, str2, str3), null));
    }

    public final synchronized void c() {
        this.f2215c.clear();
        this.a.edit().clear().commit();
    }

    public final synchronized void d(String str, String str2, String str3, String str4, String str5) {
        String strB = a0.b(str4, str5, System.currentTimeMillis());
        if (strB == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString(g(str, str2, str3), strB);
        editorEdit.commit();
    }

    public final synchronized long e(String str) {
        long jCurrentTimeMillis;
        jCurrentTimeMillis = System.currentTimeMillis();
        if (this.a.contains(b(str, "cre"))) {
            jCurrentTimeMillis = i(str);
        } else {
            SharedPreferences.Editor editorEdit = this.a.edit();
            editorEdit.putString(b(str, "cre"), String.valueOf(jCurrentTimeMillis));
            editorEdit.commit();
        }
        this.f2215c.put(str, Long.valueOf(jCurrentTimeMillis));
        return jCurrentTimeMillis;
    }

    public final synchronized void h(String str) {
        String strConcat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor editorEdit = this.a.edit();
        for (String str2 : this.a.getAll().keySet()) {
            if (str2.startsWith(strConcat)) {
                editorEdit.remove(str2);
            }
        }
        editorEdit.commit();
    }
}

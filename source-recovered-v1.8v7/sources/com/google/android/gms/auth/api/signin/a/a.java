package com.google.android.gms.auth.api.signin.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.q;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final Lock f1475c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("sLk")
    private static a f1476d;
    private final Lock a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("mLk")
    private final SharedPreferences f1477b;

    private a(Context context) {
        this.f1477b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        q.k(context);
        f1475c.lock();
        try {
            if (f1476d == null) {
                f1476d = new a(context.getApplicationContext());
            }
            return f1476d;
        } finally {
            f1475c.unlock();
        }
    }

    private static String c(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @Nullable
    private final GoogleSignInAccount d(String str) {
        String strE;
        if (!TextUtils.isEmpty(str) && (strE = e(c("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.y(strE);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Nullable
    private final String e(String str) {
        this.a.lock();
        try {
            return this.f1477b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }

    @Nullable
    public GoogleSignInAccount b() {
        return d(e("defaultGoogleSignInAccount"));
    }
}

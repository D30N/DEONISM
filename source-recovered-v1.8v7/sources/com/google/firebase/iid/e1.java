package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import d.b.b.g.c;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e1 {
    private final d.b.b.c a;

    /* renamed from: b, reason: collision with root package name */
    private final q f2229b;

    /* renamed from: c, reason: collision with root package name */
    private final w f2230c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f2231d;
    private final d.b.b.j.h e;
    private final d.b.b.g.c f;
    private final com.google.firebase.installations.h g;

    private e1(d.b.b.c cVar, q qVar, Executor executor, w wVar, d.b.b.j.h hVar, d.b.b.g.c cVar2, com.google.firebase.installations.h hVar2) {
        this.a = cVar;
        this.f2229b = qVar;
        this.f2230c = wVar;
        this.f2231d = executor;
        this.e = hVar;
        this.f = cVar2;
        this.g = hVar2;
    }

    public e1(d.b.b.c cVar, q qVar, Executor executor, d.b.b.j.h hVar, d.b.b.g.c cVar2, com.google.firebase.installations.h hVar2) {
        this(cVar, qVar, executor, new w(cVar.g(), qVar), hVar, cVar2, hVar2);
    }

    private final d.b.a.a.h.h<Bundle> b(final String str, final String str2, final String str3, final Bundle bundle) {
        final d.b.a.a.h.i iVar = new d.b.a.a.h.i();
        this.f2231d.execute(new Runnable(this, str, str2, str3, bundle, iVar) { // from class: com.google.firebase.iid.d1

            /* renamed from: b, reason: collision with root package name */
            private final e1 f2220b;

            /* renamed from: c, reason: collision with root package name */
            private final String f2221c;

            /* renamed from: d, reason: collision with root package name */
            private final String f2222d;
            private final String e;
            private final Bundle f;
            private final d.b.a.a.h.i g;

            {
                this.f2220b = this;
                this.f2221c = str;
                this.f2222d = str2;
                this.e = str3;
                this.f = bundle;
                this.g = iVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f2220b.d(this.f2221c, this.f2222d, this.e, this.f, this.g);
            }
        });
        return iVar.a();
    }

    private final String c() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.a.i().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private final Bundle e(String str, String str2, String str3, Bundle bundle) throws IOException {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.a.j().c());
        bundle.putString("gmsv", Integer.toString(this.f2229b.g()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f2229b.e());
        bundle.putString("app_ver_name", this.f2229b.f());
        bundle.putString("firebase-app-name-hash", c());
        try {
            String strB = ((com.google.firebase.installations.m) d.b.a.a.h.k.a(this.g.a(false))).b();
            if (TextUtils.isEmpty(strB)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strB);
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        }
        String strB2 = com.google.android.gms.common.internal.o.a().b("firebase-iid");
        if ("UNKNOWN".equals(strB2)) {
            int i = d.b.a.a.c.f.a;
            StringBuilder sb = new StringBuilder(19);
            sb.append("unknown_");
            sb.append(i);
            strB2 = sb.toString();
        }
        String strValueOf = String.valueOf(strB2);
        bundle.putString("cliv", strValueOf.length() != 0 ? "fiid-".concat(strValueOf) : new String("fiid-"));
        c.a aVarA = this.f.a("fire-iid");
        if (aVarA != c.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarA.f()));
            bundle.putString("Firebase-Client", this.e.a());
        }
        return bundle;
    }

    private final d.b.a.a.h.h<String> f(d.b.a.a.h.h<Bundle> hVar) {
        return hVar.e(this.f2231d, new d.b.a.a.h.a(this) { // from class: com.google.firebase.iid.f1
            @Override // d.b.a.a.h.a
            public final Object a(d.b.a.a.h.h hVar2) throws IOException {
                Bundle bundle = (Bundle) hVar2.i(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null) {
                    return string;
                }
                String string2 = bundle.getString("unregistered");
                if (string2 != null) {
                    return string2;
                }
                String string3 = bundle.getString("error");
                if ("RST".equals(string3)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string3 != null) {
                    throw new IOException(string3);
                }
                String strValueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(strValueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        });
    }

    public final d.b.a.a.h.h<String> a(String str, String str2, String str3) {
        return f(b(str, str2, str3, new Bundle()));
    }

    final /* synthetic */ void d(String str, String str2, String str3, Bundle bundle, d.b.a.a.h.i iVar) {
        try {
            e(str, str2, str3, bundle);
            iVar.c(this.f2230c.a(bundle));
        } catch (IOException e) {
            iVar.b(e);
        }
    }
}

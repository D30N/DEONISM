package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
final class e0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final long f2226b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager.WakeLock f2227c;

    /* renamed from: d, reason: collision with root package name */
    private final FirebaseInstanceId f2228d;

    e0(FirebaseInstanceId firebaseInstanceId, long j) {
        this.f2228d = firebaseInstanceId;
        this.f2226b = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f2227c = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    private final boolean c() throws IOException {
        String string;
        a0 a0VarR = this.f2228d.r();
        boolean z = true;
        if (!this.f2228d.q(a0VarR)) {
            return true;
        }
        try {
            String strU = this.f2228d.u();
            if (strU == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if ((a0VarR == null || (a0VarR != null && !strU.equals(a0VarR.a))) && "[DEFAULT]".equals(this.f2228d.h().i())) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String strValueOf = String.valueOf(this.f2228d.h().i());
                    Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(strValueOf) : new String("Invoking onNewToken for app: "));
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", strU);
                Context contextA = a();
                Intent intent2 = new Intent(contextA, (Class<?>) FirebaseInstanceIdReceiver.class);
                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                intent2.putExtra("wrapped_intent", intent);
                contextA.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (z) {
                String message2 = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message2).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message2);
                sb.append(". Will retry token retrieval");
                string = sb.toString();
            } else {
                if (e.getMessage() != null) {
                    throw e;
                }
                string = "Token retrieval failed without exception message. Will retry token retrieval";
            }
            Log.w("FirebaseInstanceId", string);
            return false;
        } catch (SecurityException unused) {
            string = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseInstanceId", string);
            return false;
        }
    }

    final Context a() {
        return this.f2228d.h().g();
    }

    final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        if (y.b().c(a())) {
            this.f2227c.acquire();
        }
        try {
            try {
                this.f2228d.p(true);
            } catch (IOException e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                Log.e("FirebaseInstanceId", sb.toString());
                this.f2228d.p(false);
                if (!y.b().c(a())) {
                    return;
                }
            }
            if (!this.f2228d.x()) {
                this.f2228d.p(false);
                if (y.b().c(a())) {
                    this.f2227c.release();
                    return;
                }
                return;
            }
            if (y.b().e(a()) && !b()) {
                new d0(this).a();
                if (y.b().c(a())) {
                    this.f2227c.release();
                    return;
                }
                return;
            }
            if (c()) {
                this.f2228d.p(false);
            } else {
                this.f2228d.l(this.f2226b);
            }
            if (!y.b().c(a())) {
                return;
            }
            this.f2227c.release();
        } catch (Throwable th) {
            if (y.b().c(a())) {
                this.f2227c.release();
            }
            throw th;
        }
    }
}

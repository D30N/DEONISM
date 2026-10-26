package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
abstract class p<T> {
    final int a;

    /* renamed from: b, reason: collision with root package name */
    final d.b.a.a.h.i<T> f2253b = new d.b.a.a.h.i<>();

    /* renamed from: c, reason: collision with root package name */
    final int f2254c;

    /* renamed from: d, reason: collision with root package name */
    final Bundle f2255d;

    p(int i, int i2, Bundle bundle) {
        this.a = i;
        this.f2254c = i2;
        this.f2255d = bundle;
    }

    abstract void a(Bundle bundle);

    final void b(o oVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(oVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 14 + String.valueOf(strValueOf2).length());
            sb.append("Failing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f2253b.b(oVar);
    }

    final void c(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 16 + String.valueOf(strValueOf2).length());
            sb.append("Finishing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f2253b.c(t);
    }

    abstract boolean d();

    public String toString() {
        int i = this.f2254c;
        int i2 = this.a;
        boolean zD = d();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(zD);
        sb.append("}");
        return sb.toString();
    }
}

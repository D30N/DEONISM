package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* loaded from: classes.dex */
public abstract class h {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static h f1557b;

    protected static final class a {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final String f1558b;

        /* renamed from: c, reason: collision with root package name */
        private final ComponentName f1559c;

        /* renamed from: d, reason: collision with root package name */
        private final int f1560d;

        public a(String str, String str2, int i) {
            q.g(str);
            this.a = str;
            q.g(str2);
            this.f1558b = str2;
            this.f1559c = null;
            this.f1560d = i;
        }

        public final ComponentName a() {
            return this.f1559c;
        }

        public final String b() {
            return this.f1558b;
        }

        public final Intent c(Context context) {
            return this.a != null ? new Intent(this.a).setPackage(this.f1558b) : new Intent().setComponent(this.f1559c);
        }

        public final int d() {
            return this.f1560d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p.a(this.a, aVar.a) && p.a(this.f1558b, aVar.f1558b) && p.a(this.f1559c, aVar.f1559c) && this.f1560d == aVar.f1560d;
        }

        public final int hashCode() {
            return p.b(this.a, this.f1558b, this.f1559c, Integer.valueOf(this.f1560d));
        }

        public final String toString() {
            String str = this.a;
            return str == null ? this.f1559c.flattenToString() : str;
        }
    }

    public static h a(Context context) {
        synchronized (a) {
            if (f1557b == null) {
                f1557b = new e0(context.getApplicationContext());
            }
        }
        return f1557b;
    }

    public final void b(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        d(new a(str, str2, i), serviceConnection, str3);
    }

    protected abstract boolean c(a aVar, ServiceConnection serviceConnection, String str);

    protected abstract void d(a aVar, ServiceConnection serviceConnection, String str);
}

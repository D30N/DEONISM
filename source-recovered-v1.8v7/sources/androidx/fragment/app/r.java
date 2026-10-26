package androidx.fragment.app;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
class r implements androidx.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    private androidx.lifecycle.h f511b = null;

    r() {
    }

    @Override // androidx.lifecycle.g
    public androidx.lifecycle.d a() {
        e();
        return this.f511b;
    }

    void d(d.a aVar) {
        this.f511b.i(aVar);
    }

    void e() {
        if (this.f511b == null) {
            this.f511b = new androidx.lifecycle.h(this);
        }
    }

    boolean f() {
        return this.f511b != null;
    }
}

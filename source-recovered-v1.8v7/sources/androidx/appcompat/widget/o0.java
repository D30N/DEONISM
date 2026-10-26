package androidx.appcompat.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class o0 {
    private int a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f261b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f262c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d, reason: collision with root package name */
    private int f263d = RecyclerView.UNDEFINED_DURATION;
    private int e = 0;
    private int f = 0;
    private boolean g = false;
    private boolean h = false;

    o0() {
    }

    public int a() {
        return this.g ? this.a : this.f261b;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.f261b;
    }

    public int d() {
        return this.g ? this.f261b : this.a;
    }

    public void e(int i, int i2) {
        this.h = false;
        if (i != Integer.MIN_VALUE) {
            this.e = i;
            this.a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f = i2;
            this.f261b = i2;
        }
    }

    public void f(boolean z) {
        int i;
        if (z == this.g) {
            return;
        }
        this.g = z;
        if (this.h) {
            if (z) {
                int i2 = this.f263d;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.e;
                }
                this.a = i2;
                i = this.f262c;
                if (i == Integer.MIN_VALUE) {
                }
            } else {
                int i3 = this.f262c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.e;
                }
                this.a = i3;
                i = this.f263d;
                if (i == Integer.MIN_VALUE) {
                }
            }
            this.f261b = i;
        }
        this.a = this.e;
        i = this.f;
        this.f261b = i;
    }

    public void g(int i, int i2) {
        this.f262c = i;
        this.f263d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f261b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f261b = i2;
        }
    }
}

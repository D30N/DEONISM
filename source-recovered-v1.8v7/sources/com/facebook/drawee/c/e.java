package com.facebook.drawee.c;

/* loaded from: classes.dex */
public class e {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private int f1166b;

    /* renamed from: c, reason: collision with root package name */
    private int f1167c;

    public e() {
        a();
    }

    public void a() {
        this.a = false;
        this.f1166b = 4;
        c();
    }

    public void b() {
        this.f1167c++;
    }

    public void c() {
        this.f1167c = 0;
    }

    public void d(boolean z) {
        this.a = z;
    }

    public boolean e() {
        return this.a && this.f1167c < this.f1166b;
    }
}

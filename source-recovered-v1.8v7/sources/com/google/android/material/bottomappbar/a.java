package com.google.android.material.bottomappbar;

import d.b.a.b.z.f;
import d.b.a.b.z.m;

/* loaded from: classes.dex */
public class a extends f implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    private float f2012b;

    /* renamed from: c, reason: collision with root package name */
    private float f2013c;

    /* renamed from: d, reason: collision with root package name */
    private float f2014d;
    private float e;
    private float f;

    @Override // d.b.a.b.z.f
    public void b(float f, float f2, float f3, m mVar) {
        float f4 = this.f2014d;
        if (f4 == 0.0f) {
            mVar.l(f, 0.0f);
            return;
        }
        float f5 = ((this.f2013c * 2.0f) + f4) / 2.0f;
        float f6 = f3 * this.f2012b;
        float f7 = f2 + this.f;
        float f8 = (this.e * f3) + ((1.0f - f3) * f5);
        if (f8 / f5 >= 1.0f) {
            mVar.l(f, 0.0f);
            return;
        }
        float f9 = f5 + f6;
        float f10 = f8 + f6;
        float fSqrt = (float) Math.sqrt((f9 * f9) - (f10 * f10));
        float f11 = f7 - fSqrt;
        float f12 = f7 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f10));
        float f13 = 90.0f - degrees;
        mVar.l(f11, 0.0f);
        float f14 = f6 * 2.0f;
        mVar.a(f11 - f6, 0.0f, f11 + f6, f14, 270.0f, degrees);
        mVar.a(f7 - f5, (-f5) - f8, f7 + f5, f5 - f8, 180.0f - f13, (f13 * 2.0f) - 180.0f);
        mVar.a(f12 - f6, 0.0f, f12 + f6, f14, 270.0f - degrees, degrees);
        mVar.l(f, 0.0f);
    }

    float c() {
        return this.e;
    }

    float d() {
        return this.f2013c;
    }

    float e() {
        return this.f2012b;
    }

    public float f() {
        return this.f2014d;
    }

    void g(float f) {
        this.e = f;
    }

    void j(float f) {
        this.f2013c = f;
    }

    void k(float f) {
        this.f2012b = f;
    }

    public void n(float f) {
        this.f2014d = f;
    }

    void o(float f) {
        this.f = f;
    }
}

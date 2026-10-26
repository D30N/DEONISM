package com.facebook.drawee.g;

import d.a.b.d.i;
import java.util.Arrays;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class e {
    private a a = a.BITMAP_ONLY;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1215b = false;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private float[] f1216c = null;

    /* renamed from: d, reason: collision with root package name */
    private int f1217d = 0;
    private float e = 0.0f;
    private int f = 0;
    private float g = 0.0f;
    private boolean h = false;
    private boolean i = false;

    public enum a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    private float[] d() {
        if (this.f1216c == null) {
            this.f1216c = new float[8];
        }
        return this.f1216c;
    }

    public int a() {
        return this.f;
    }

    public float b() {
        return this.e;
    }

    @Nullable
    public float[] c() {
        return this.f1216c;
    }

    public int e() {
        return this.f1217d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f1215b == eVar.f1215b && this.f1217d == eVar.f1217d && Float.compare(eVar.e, this.e) == 0 && this.f == eVar.f && Float.compare(eVar.g, this.g) == 0 && this.a == eVar.a && this.h == eVar.h && this.i == eVar.i) {
            return Arrays.equals(this.f1216c, eVar.f1216c);
        }
        return false;
    }

    public float f() {
        return this.g;
    }

    public boolean g() {
        return this.i;
    }

    public boolean h() {
        return this.f1215b;
    }

    public int hashCode() {
        a aVar = this.a;
        int iHashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + (this.f1215b ? 1 : 0)) * 31;
        float[] fArr = this.f1216c;
        int iHashCode2 = (((iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f1217d) * 31;
        float f = this.e;
        int iFloatToIntBits = (((iHashCode2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f) * 31;
        float f2 = this.g;
        return ((((iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }

    public a i() {
        return this.a;
    }

    public boolean j() {
        return this.h;
    }

    public e k(int i) {
        this.f = i;
        return this;
    }

    public e l(float f) {
        i.c(f >= 0.0f, "the border width cannot be < 0");
        this.e = f;
        return this;
    }

    public e m(float f, float f2, float f3, float f4) {
        float[] fArrD = d();
        fArrD[1] = f;
        fArrD[0] = f;
        fArrD[3] = f2;
        fArrD[2] = f2;
        fArrD[5] = f3;
        fArrD[4] = f3;
        fArrD[7] = f4;
        fArrD[6] = f4;
        return this;
    }

    public e n(int i) {
        this.f1217d = i;
        this.a = a.OVERLAY_COLOR;
        return this;
    }

    public e o(float f) {
        i.c(f >= 0.0f, "the padding cannot be < 0");
        this.g = f;
        return this;
    }

    public e p(boolean z) {
        this.f1215b = z;
        return this;
    }
}

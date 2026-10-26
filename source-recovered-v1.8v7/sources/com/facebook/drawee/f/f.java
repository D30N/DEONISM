package com.facebook.drawee.f;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* loaded from: classes.dex */
public class f extends a {
    private final Drawable[] h;
    private final boolean i;
    private final int j;
    int k;
    int l;
    long m;
    int[] n;
    int[] o;
    int p;
    boolean[] q;
    int r;

    public f(Drawable[] drawableArr) {
        this(drawableArr, false);
    }

    public f(Drawable[] drawableArr, boolean z) {
        super(drawableArr);
        d.a.b.d.i.j(drawableArr.length >= 1, "At least one layer required!");
        this.h = drawableArr;
        this.n = new int[drawableArr.length];
        this.o = new int[drawableArr.length];
        this.p = 255;
        this.q = new boolean[drawableArr.length];
        this.r = 0;
        this.i = z;
        this.j = z ? 255 : 0;
        n();
    }

    private void f(Canvas canvas, Drawable drawable, int i) {
        if (drawable == null || i <= 0) {
            return;
        }
        this.r++;
        drawable.mutate().setAlpha(i);
        this.r--;
        drawable.draw(canvas);
    }

    private void n() {
        this.k = 2;
        Arrays.fill(this.n, this.j);
        this.n[0] = 255;
        Arrays.fill(this.o, this.j);
        this.o[0] = 255;
        Arrays.fill(this.q, this.i);
        this.q[0] = true;
    }

    private boolean p(float f) {
        boolean z = true;
        for (int i = 0; i < this.h.length; i++) {
            int i2 = this.q[i] ? 1 : -1;
            int[] iArr = this.o;
            iArr[i] = (int) (this.n[i] + (i2 * 255 * f));
            if (iArr[i] < 0) {
                iArr[i] = 0;
            }
            int[] iArr2 = this.o;
            if (iArr2[i] > 255) {
                iArr2[i] = 255;
            }
            if (this.q[i] && this.o[i] < 255) {
                z = false;
            }
            if (!this.q[i] && this.o[i] > 0) {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[PHI: r0
      0x0046: PHI (r0v10 boolean) = (r0v5 boolean), (r0v16 boolean) binds: [B:18:0x0043, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.facebook.drawee.f.a, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            int r0 = r8.k
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L27
            if (r0 == r3) goto La
            goto L4a
        La:
            int r0 = r8.l
            if (r0 <= 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            d.a.b.d.i.i(r0)
            long r4 = r8.m()
            long r6 = r8.m
            long r4 = r4 - r6
            float r0 = (float) r4
            int r4 = r8.l
            float r4 = (float) r4
            float r0 = r0 / r4
            boolean r0 = r8.p(r0)
            if (r0 == 0) goto L46
            goto L47
        L27:
            int[] r0 = r8.o
            int[] r4 = r8.n
            android.graphics.drawable.Drawable[] r5 = r8.h
            int r5 = r5.length
            java.lang.System.arraycopy(r0, r2, r4, r2, r5)
            long r4 = r8.m()
            r8.m = r4
            int r0 = r8.l
            if (r0 != 0) goto L3e
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L3f
        L3e:
            r0 = 0
        L3f:
            boolean r0 = r8.p(r0)
            if (r0 == 0) goto L46
            goto L47
        L46:
            r1 = 1
        L47:
            r8.k = r1
            r3 = r0
        L4a:
            android.graphics.drawable.Drawable[] r0 = r8.h
            int r1 = r0.length
            if (r2 >= r1) goto L61
            r0 = r0[r2]
            int[] r1 = r8.o
            r1 = r1[r2]
            int r4 = r8.p
            int r1 = r1 * r4
            int r1 = r1 / 255
            r8.f(r9, r0, r1)
            int r2 = r2 + 1
            goto L4a
        L61:
            if (r3 != 0) goto L66
            r8.invalidateSelf()
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.f.f.draw(android.graphics.Canvas):void");
    }

    public void e() {
        this.r++;
    }

    public void g() {
        this.r--;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.p;
    }

    public void i() {
        this.k = 0;
        Arrays.fill(this.q, true);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.r == 0) {
            super.invalidateSelf();
        }
    }

    public void j(int i) {
        this.k = 0;
        this.q[i] = true;
        invalidateSelf();
    }

    public void k(int i) {
        this.k = 0;
        this.q[i] = false;
        invalidateSelf();
    }

    public void l() {
        this.k = 2;
        for (int i = 0; i < this.h.length; i++) {
            this.o[i] = this.q[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    protected long m() {
        return SystemClock.uptimeMillis();
    }

    public void o(int i) {
        this.l = i;
        if (this.k == 1) {
            this.k = 0;
        }
    }

    @Override // com.facebook.drawee.f.a, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.p != i) {
            this.p = i;
            invalidateSelf();
        }
    }
}

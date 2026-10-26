package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.b;
import com.google.android.material.internal.f;
import d.b.a.b.l.h;
import d.b.a.b.w.d;
import d.b.a.b.z.g;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a extends g implements b, Drawable.Callback, f.b {
    private static final int[] G0 = {R.attr.state_enabled};
    private static final ShapeDrawable H0 = new ShapeDrawable(new OvalShape());
    private float A;
    private ColorStateList A0;
    private ColorStateList B;
    private WeakReference<InterfaceC0069a> B0;
    private float C;
    private TextUtils.TruncateAt C0;
    private ColorStateList D;
    private boolean D0;
    private CharSequence E;
    private int E0;
    private boolean F;
    private boolean F0;
    private Drawable G;
    private ColorStateList H;
    private float I;
    private boolean J;
    private boolean K;
    private Drawable L;
    private Drawable M;
    private ColorStateList N;
    private float O;
    private CharSequence P;
    private boolean Q;
    private boolean R;
    private Drawable S;
    private h T;
    private h U;
    private float V;
    private float W;
    private float X;
    private float Y;
    private float Z;
    private float a0;
    private float b0;
    private float c0;
    private final Context d0;
    private final Paint e0;
    private final Paint f0;
    private final Paint.FontMetrics g0;
    private final RectF h0;
    private final PointF i0;
    private final Path j0;
    private final f k0;
    private int l0;
    private int m0;
    private int n0;
    private int o0;
    private int p0;
    private int q0;
    private boolean r0;
    private int s0;
    private int t0;
    private ColorFilter u0;
    private PorterDuffColorFilter v0;
    private ColorStateList w0;
    private ColorStateList x;
    private PorterDuff.Mode x0;
    private ColorStateList y;
    private int[] y0;
    private float z;
    private boolean z0;

    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0069a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e0 = new Paint(1);
        this.g0 = new Paint.FontMetrics();
        this.h0 = new RectF();
        this.i0 = new PointF();
        this.j0 = new Path();
        this.t0 = 255;
        this.x0 = PorterDuff.Mode.SRC_IN;
        Paint paint = null;
        this.B0 = new WeakReference<>(null);
        L(context);
        this.d0 = context;
        f fVar = new f(this);
        this.k0 = fVar;
        this.E = "";
        fVar.e().density = context.getResources().getDisplayMetrics().density;
        this.f0 = null;
        if (0 != 0) {
            paint.setStyle(Paint.Style.STROKE);
        }
        setState(G0);
        b2(G0);
        this.D0 = true;
        if (d.b.a.b.x.b.a) {
            H0.setTint(-1);
        }
    }

    private boolean C2() {
        return this.R && this.S != null && this.r0;
    }

    private boolean D2() {
        return this.F && this.G != null;
    }

    private boolean E2() {
        return this.K && this.L != null;
    }

    private void F2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void G2() {
        this.A0 = this.z0 ? d.b.a.b.x.b.a(this.D) : null;
    }

    @TargetApi(21)
    private void H2() {
        this.M = new RippleDrawable(d.b.a.b.x.b.a(X0()), this.L, H0);
    }

    private void R1(ColorStateList colorStateList) {
        if (this.x != colorStateList) {
            this.x = colorStateList;
            onStateChange(getState());
        }
    }

    private ColorFilter d1() {
        ColorFilter colorFilter = this.u0;
        return colorFilter != null ? colorFilter : this.v0;
    }

    private void f0(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.L) {
            if (drawable.isStateful()) {
                drawable.setState(Q0());
            }
            androidx.core.graphics.drawable.a.o(drawable, this.N);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.G;
        if (drawable == drawable2 && this.J) {
            androidx.core.graphics.drawable.a.o(drawable2, this.H);
        }
    }

    private static boolean f1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void g0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (D2() || C2()) {
            float f = this.V + this.W;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + this.I;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - this.I;
            }
            float fExactCenterY = rect.exactCenterY();
            float f4 = this.I;
            float f5 = fExactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    private void i0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (E2()) {
            float f = this.c0 + this.b0 + this.O + this.a0 + this.Z;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    private void j0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (E2()) {
            float f = this.c0 + this.b0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.O;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.O;
            }
            float fExactCenterY = rect.exactCenterY();
            float f4 = this.O;
            float f5 = fExactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    private static boolean j1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private void k0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (E2()) {
            float f = this.c0 + this.b0 + this.O + this.a0 + this.Z;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean k1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean l1(d dVar) {
        ColorStateList colorStateList;
        return (dVar == null || (colorStateList = dVar.f2979b) == null || !colorStateList.isStateful()) ? false : true;
    }

    private void m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.E != null) {
            float fH0 = this.V + h0() + this.Y;
            float fL0 = this.c0 + l0() + this.Z;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.left = rect.left + fH0;
                rectF.right = rect.right - fL0;
            } else {
                rectF.left = rect.left + fL0;
                rectF.right = rect.right - fH0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m1(android.util.AttributeSet r8, int r9, int r10) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.m1(android.util.AttributeSet, int, int):void");
    }

    private float n0() {
        this.k0.e().getFontMetrics(this.g0);
        Paint.FontMetrics fontMetrics = this.g0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private boolean o1(int[] iArr, int[] iArr2) {
        boolean z;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.x;
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, this.l0) : 0;
        boolean state = true;
        if (this.l0 != colorForState) {
            this.l0 = colorForState;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.y;
        int colorForState2 = colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.m0) : 0;
        if (this.m0 != colorForState2) {
            this.m0 = colorForState2;
            zOnStateChange = true;
        }
        int iE = d.b.a.b.q.a.e(colorForState, colorForState2);
        if ((this.n0 != iE) | (w() == null)) {
            this.n0 = iE;
            T(ColorStateList.valueOf(iE));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.B;
        int colorForState3 = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.o0) : 0;
        if (this.o0 != colorForState3) {
            this.o0 = colorForState3;
            zOnStateChange = true;
        }
        int colorForState4 = (this.A0 == null || !d.b.a.b.x.b.b(iArr)) ? 0 : this.A0.getColorForState(iArr, this.p0);
        if (this.p0 != colorForState4) {
            this.p0 = colorForState4;
            if (this.z0) {
                zOnStateChange = true;
            }
        }
        int colorForState5 = (this.k0.d() == null || this.k0.d().f2979b == null) ? 0 : this.k0.d().f2979b.getColorForState(iArr, this.q0);
        if (this.q0 != colorForState5) {
            this.q0 = colorForState5;
            zOnStateChange = true;
        }
        boolean z2 = f1(getState(), R.attr.state_checked) && this.Q;
        if (this.r0 == z2 || this.S == null) {
            z = false;
        } else {
            float fH0 = h0();
            this.r0 = z2;
            if (fH0 != h0()) {
                zOnStateChange = true;
                z = true;
            } else {
                zOnStateChange = true;
                z = false;
            }
        }
        ColorStateList colorStateList4 = this.w0;
        int colorForState6 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.s0) : 0;
        if (this.s0 != colorForState6) {
            this.s0 = colorForState6;
            this.v0 = d.b.a.b.r.a.a(this, this.w0, this.x0);
        } else {
            state = zOnStateChange;
        }
        if (k1(this.G)) {
            state |= this.G.setState(iArr);
        }
        if (k1(this.S)) {
            state |= this.S.setState(iArr);
        }
        if (k1(this.L)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.L.setState(iArr3);
        }
        if (d.b.a.b.x.b.a && k1(this.M)) {
            state |= this.M.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z) {
            n1();
        }
        return state;
    }

    private boolean p0() {
        return this.R && this.S != null && this.Q;
    }

    public static a q0(Context context, AttributeSet attributeSet, int i, int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        a aVar = new a(context, attributeSet, i, i2);
        aVar.m1(attributeSet, i, i2);
        return aVar;
    }

    private void r0(Canvas canvas, Rect rect) {
        if (C2()) {
            g0(rect, this.h0);
            RectF rectF = this.h0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.S.setBounds(0, 0, (int) this.h0.width(), (int) this.h0.height());
            this.S.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void s0(Canvas canvas, Rect rect) {
        if (this.F0) {
            return;
        }
        this.e0.setColor(this.m0);
        this.e0.setStyle(Paint.Style.FILL);
        this.e0.setColorFilter(d1());
        this.h0.set(rect);
        canvas.drawRoundRect(this.h0, C0(), C0(), this.e0);
    }

    private void t0(Canvas canvas, Rect rect) {
        if (D2()) {
            g0(rect, this.h0);
            RectF rectF = this.h0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.G.setBounds(0, 0, (int) this.h0.width(), (int) this.h0.height());
            this.G.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void u0(Canvas canvas, Rect rect) {
        if (this.C <= 0.0f || this.F0) {
            return;
        }
        this.e0.setColor(this.o0);
        this.e0.setStyle(Paint.Style.STROKE);
        if (!this.F0) {
            this.e0.setColorFilter(d1());
        }
        RectF rectF = this.h0;
        float f = rect.left;
        float f2 = this.C;
        rectF.set(f + (f2 / 2.0f), rect.top + (f2 / 2.0f), rect.right - (f2 / 2.0f), rect.bottom - (f2 / 2.0f));
        float f3 = this.A - (this.C / 2.0f);
        canvas.drawRoundRect(this.h0, f3, f3, this.e0);
    }

    private void v0(Canvas canvas, Rect rect) {
        if (this.F0) {
            return;
        }
        this.e0.setColor(this.l0);
        this.e0.setStyle(Paint.Style.FILL);
        this.h0.set(rect);
        canvas.drawRoundRect(this.h0, C0(), C0(), this.e0);
    }

    private void w0(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (E2()) {
            j0(rect, this.h0);
            RectF rectF = this.h0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.L.setBounds(0, 0, (int) this.h0.width(), (int) this.h0.height());
            if (d.b.a.b.x.b.a) {
                this.M.setBounds(this.L.getBounds());
                this.M.jumpToCurrentState();
                drawable = this.M;
            } else {
                drawable = this.L;
            }
            drawable.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void x0(Canvas canvas, Rect rect) {
        this.e0.setColor(this.p0);
        this.e0.setStyle(Paint.Style.FILL);
        this.h0.set(rect);
        if (!this.F0) {
            canvas.drawRoundRect(this.h0, C0(), C0(), this.e0);
        } else {
            g(new RectF(rect), this.j0);
            super.o(canvas, this.e0, this.j0, t());
        }
    }

    private void y0(Canvas canvas, Rect rect) {
        Paint paint = this.f0;
        if (paint != null) {
            paint.setColor(b.g.e.a.d(-16777216, 127));
            canvas.drawRect(rect, this.f0);
            if (D2() || C2()) {
                g0(rect, this.h0);
                canvas.drawRect(this.h0, this.f0);
            }
            if (this.E != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f0);
            }
            if (E2()) {
                j0(rect, this.h0);
                canvas.drawRect(this.h0, this.f0);
            }
            this.f0.setColor(b.g.e.a.d(-65536, 127));
            i0(rect, this.h0);
            canvas.drawRect(this.h0, this.f0);
            this.f0.setColor(b.g.e.a.d(-16711936, 127));
            k0(rect, this.h0);
            canvas.drawRect(this.h0, this.f0);
        }
    }

    private void z0(Canvas canvas, Rect rect) {
        if (this.E != null) {
            Paint.Align alignO0 = o0(rect, this.i0);
            m0(rect, this.h0);
            if (this.k0.d() != null) {
                this.k0.e().drawableState = getState();
                this.k0.j(this.d0);
            }
            this.k0.e().setTextAlign(alignO0);
            int iSave = 0;
            boolean z = Math.round(this.k0.f(Z0().toString())) > Math.round(this.h0.width());
            if (z) {
                iSave = canvas.save();
                canvas.clipRect(this.h0);
            }
            CharSequence charSequenceEllipsize = this.E;
            if (z && this.C0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.k0.e(), this.h0.width(), this.C0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.i0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.k0.e());
            if (z) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    public Drawable A0() {
        return this.S;
    }

    public void A1(int i) {
        z1(this.d0.getResources().getDimension(i));
    }

    public void A2(boolean z) {
        if (this.z0 != z) {
            this.z0 = z;
            G2();
            onStateChange(getState());
        }
    }

    public ColorStateList B0() {
        return this.y;
    }

    public void B1(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawableE0 = E0();
        if (drawableE0 != drawable) {
            float fH0 = h0();
            this.G = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            float fH02 = h0();
            F2(drawableE0);
            if (D2()) {
                f0(this.G);
            }
            invalidateSelf();
            if (fH0 != fH02) {
                n1();
            }
        }
    }

    boolean B2() {
        return this.D0;
    }

    public float C0() {
        return this.F0 ? E() : this.A;
    }

    public void C1(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        B1(b.a.k.a.a.d(this.d0, i));
    }

    public float D0() {
        return this.c0;
    }

    public void D1(float f) {
        if (this.I != f) {
            float fH0 = h0();
            this.I = f;
            float fH02 = h0();
            invalidateSelf();
            if (fH0 != fH02) {
                n1();
            }
        }
    }

    public Drawable E0() {
        Drawable drawable = this.G;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void E1(int i) {
        D1(this.d0.getResources().getDimension(i));
    }

    public float F0() {
        return this.I;
    }

    public void F1(ColorStateList colorStateList) {
        this.J = true;
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (D2()) {
                androidx.core.graphics.drawable.a.o(this.G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public ColorStateList G0() {
        return this.H;
    }

    public void G1(int i) {
        F1(b.a.k.a.a.c(this.d0, i));
    }

    public float H0() {
        return this.z;
    }

    public void H1(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        I1(this.d0.getResources().getBoolean(i));
    }

    public float I0() {
        return this.V;
    }

    public void I1(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.F != z) {
            boolean zD2 = D2();
            this.F = z;
            boolean zD22 = D2();
            if (zD2 != zD22) {
                if (zD22) {
                    f0(this.G);
                } else {
                    F2(this.G);
                }
                invalidateSelf();
                n1();
            }
        }
    }

    public ColorStateList J0() {
        return this.B;
    }

    public void J1(float f) {
        if (this.z != f) {
            this.z = f;
            invalidateSelf();
            n1();
        }
    }

    public float K0() {
        return this.C;
    }

    public void K1(int i) {
        J1(this.d0.getResources().getDimension(i));
    }

    public Drawable L0() {
        Drawable drawable = this.L;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void L1(float f) {
        if (this.V != f) {
            this.V = f;
            invalidateSelf();
            n1();
        }
    }

    public CharSequence M0() {
        return this.P;
    }

    public void M1(int i) {
        L1(this.d0.getResources().getDimension(i));
    }

    public float N0() {
        return this.b0;
    }

    public void N1(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            if (this.F0) {
                a0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float O0() {
        return this.O;
    }

    public void O1(int i) {
        N1(b.a.k.a.a.c(this.d0, i));
    }

    public float P0() {
        return this.a0;
    }

    public void P1(float f) {
        if (this.C != f) {
            this.C = f;
            this.e0.setStrokeWidth(f);
            if (this.F0) {
                super.b0(f);
            }
            invalidateSelf();
        }
    }

    public int[] Q0() {
        return this.y0;
    }

    public void Q1(int i) {
        P1(this.d0.getResources().getDimension(i));
    }

    public ColorStateList R0() {
        return this.N;
    }

    public void S0(RectF rectF) {
        k0(getBounds(), rectF);
    }

    public void S1(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawableL0 = L0();
        if (drawableL0 != drawable) {
            float fL0 = l0();
            this.L = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            if (d.b.a.b.x.b.a) {
                H2();
            }
            float fL02 = l0();
            F2(drawableL0);
            if (E2()) {
                f0(this.L);
            }
            invalidateSelf();
            if (fL0 != fL02) {
                n1();
            }
        }
    }

    public TextUtils.TruncateAt T0() {
        return this.C0;
    }

    public void T1(CharSequence charSequence) {
        if (this.P != charSequence) {
            this.P = b.g.j.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public h U0() {
        return this.U;
    }

    public void U1(float f) {
        if (this.b0 != f) {
            this.b0 = f;
            invalidateSelf();
            if (E2()) {
                n1();
            }
        }
    }

    public float V0() {
        return this.X;
    }

    public void V1(int i) {
        U1(this.d0.getResources().getDimension(i));
    }

    public float W0() {
        return this.W;
    }

    public void W1(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        S1(b.a.k.a.a.d(this.d0, i));
    }

    public ColorStateList X0() {
        return this.D;
    }

    public void X1(float f) {
        if (this.O != f) {
            this.O = f;
            invalidateSelf();
            if (E2()) {
                n1();
            }
        }
    }

    public h Y0() {
        return this.T;
    }

    public void Y1(int i) {
        X1(this.d0.getResources().getDimension(i));
    }

    public CharSequence Z0() {
        return this.E;
    }

    public void Z1(float f) {
        if (this.a0 != f) {
            this.a0 = f;
            invalidateSelf();
            if (E2()) {
                n1();
            }
        }
    }

    @Override // com.google.android.material.internal.f.b
    public void a() {
        n1();
        invalidateSelf();
    }

    public d a1() {
        return this.k0.d();
    }

    public void a2(int i) {
        Z1(this.d0.getResources().getDimension(i));
    }

    public float b1() {
        return this.Z;
    }

    public boolean b2(int[] iArr) {
        if (Arrays.equals(this.y0, iArr)) {
            return false;
        }
        this.y0 = iArr;
        if (E2()) {
            return o1(getState(), iArr);
        }
        return false;
    }

    public float c1() {
        return this.Y;
    }

    public void c2(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            if (E2()) {
                androidx.core.graphics.drawable.a.o(this.L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void d2(int i) {
        c2(b.a.k.a.a.c(this.d0, i));
    }

    @Override // d.b.a.b.z.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = this.t0;
        int iA = i < 255 ? d.b.a.b.m.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        v0(canvas, bounds);
        s0(canvas, bounds);
        if (this.F0) {
            super.draw(canvas);
        }
        u0(canvas, bounds);
        x0(canvas, bounds);
        t0(canvas, bounds);
        r0(canvas, bounds);
        if (this.D0) {
            z0(canvas, bounds);
        }
        w0(canvas, bounds);
        y0(canvas, bounds);
        if (this.t0 < 255) {
            canvas.restoreToCount(iA);
        }
    }

    public boolean e1() {
        return this.z0;
    }

    public void e2(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.K != z) {
            boolean zE2 = E2();
            this.K = z;
            boolean zE22 = E2();
            if (zE2 != zE22) {
                if (zE22) {
                    f0(this.L);
                } else {
                    F2(this.L);
                }
                invalidateSelf();
                n1();
            }
        }
    }

    public void f2(InterfaceC0069a interfaceC0069a) {
        this.B0 = new WeakReference<>(interfaceC0069a);
    }

    public boolean g1() {
        return this.Q;
    }

    public void g2(TextUtils.TruncateAt truncateAt) {
        this.C0 = truncateAt;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.t0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.u0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.V + h0() + this.Y + this.k0.f(Z0().toString()) + this.Z + l0() + this.c0), this.E0);
    }

    @Override // d.b.a.b.z.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // d.b.a.b.z.g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.F0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.A);
        } else {
            outline.setRoundRect(bounds, this.A);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    float h0() {
        if (D2() || C2()) {
            return this.W + this.I + this.X;
        }
        return 0.0f;
    }

    public boolean h1() {
        return k1(this.L);
    }

    public void h2(h hVar) {
        this.U = hVar;
    }

    public boolean i1() {
        return this.K;
    }

    public void i2(int i) {
        h2(h.c(this.d0, i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // d.b.a.b.z.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return j1(this.x) || j1(this.y) || j1(this.B) || (this.z0 && j1(this.A0)) || l1(this.k0.d()) || p0() || k1(this.G) || k1(this.S) || j1(this.w0);
    }

    public void j2(float f) {
        if (this.X != f) {
            float fH0 = h0();
            this.X = f;
            float fH02 = h0();
            invalidateSelf();
            if (fH0 != fH02) {
                n1();
            }
        }
    }

    public void k2(int i) {
        j2(this.d0.getResources().getDimension(i));
    }

    float l0() {
        if (E2()) {
            return this.a0 + this.O + this.b0;
        }
        return 0.0f;
    }

    public void l2(float f) {
        if (this.W != f) {
            float fH0 = h0();
            this.W = f;
            float fH02 = h0();
            invalidateSelf();
            if (fH0 != fH02) {
                n1();
            }
        }
    }

    public void m2(int i) {
        l2(this.d0.getResources().getDimension(i));
    }

    protected void n1() {
        InterfaceC0069a interfaceC0069a = this.B0.get();
        if (interfaceC0069a != null) {
            interfaceC0069a.a();
        }
    }

    public void n2(int i) {
        this.E0 = i;
    }

    Paint.Align o0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.E != null) {
            float fH0 = this.V + h0() + this.Y;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF.x = rect.left + fH0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - fH0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - n0();
        }
        return align;
    }

    public void o2(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            G2();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (D2()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.G, i);
        }
        if (C2()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.S, i);
        }
        if (E2()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.L, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (D2()) {
            zOnLevelChange |= this.G.setLevel(i);
        }
        if (C2()) {
            zOnLevelChange |= this.S.setLevel(i);
        }
        if (E2()) {
            zOnLevelChange |= this.L.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // d.b.a.b.z.g, android.graphics.drawable.Drawable, com.google.android.material.internal.f.b
    public boolean onStateChange(int[] iArr) {
        if (this.F0) {
            super.onStateChange(iArr);
        }
        return o1(iArr, Q0());
    }

    public void p1(boolean z) {
        if (this.Q != z) {
            this.Q = z;
            float fH0 = h0();
            if (!z && this.r0) {
                this.r0 = false;
            }
            float fH02 = h0();
            invalidateSelf();
            if (fH0 != fH02) {
                n1();
            }
        }
    }

    public void p2(int i) {
        o2(b.a.k.a.a.c(this.d0, i));
    }

    public void q1(int i) {
        p1(this.d0.getResources().getBoolean(i));
    }

    void q2(boolean z) {
        this.D0 = z;
    }

    public void r1(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.S != drawable) {
            float fH0 = h0();
            this.S = drawable;
            float fH02 = h0();
            F2(this.S);
            f0(this.S);
            invalidateSelf();
            if (fH0 != fH02) {
                n1();
            }
        }
    }

    public void r2(h hVar) {
        this.T = hVar;
    }

    public void s1(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        r1(b.a.k.a.a.d(this.d0, i));
    }

    public void s2(int i) {
        r2(h.c(this.d0, i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // d.b.a.b.z.g, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.t0 != i) {
            this.t0 = i;
            invalidateSelf();
        }
    }

    @Override // d.b.a.b.z.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.u0 != colorFilter) {
            this.u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // d.b.a.b.z.g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        if (this.w0 != colorStateList) {
            this.w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // d.b.a.b.z.g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.x0 != mode) {
            this.x0 = mode;
            this.v0 = d.b.a.b.r.a.a(this, this.w0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (D2()) {
            visible |= this.G.setVisible(z, z2);
        }
        if (C2()) {
            visible |= this.S.setVisible(z, z2);
        }
        if (E2()) {
            visible |= this.L.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t1(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        u1(this.d0.getResources().getBoolean(i));
    }

    public void t2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.E, charSequence)) {
            return;
        }
        this.E = charSequence;
        this.k0.i(true);
        invalidateSelf();
        n1();
    }

    public void u1(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.R != z) {
            boolean zC2 = C2();
            this.R = z;
            boolean zC22 = C2();
            if (zC2 != zC22) {
                if (zC22) {
                    f0(this.S);
                } else {
                    F2(this.S);
                }
                invalidateSelf();
                n1();
            }
        }
    }

    public void u2(d dVar) {
        this.k0.h(dVar, this.d0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v1(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            onStateChange(getState());
        }
    }

    public void v2(int i) {
        u2(new d(this.d0, i));
    }

    public void w1(int i) {
        v1(b.a.k.a.a.c(this.d0, i));
    }

    public void w2(float f) {
        if (this.Z != f) {
            this.Z = f;
            invalidateSelf();
            n1();
        }
    }

    @Deprecated
    public void x1(float f) {
        if (this.A != f) {
            this.A = f;
            setShapeAppearanceModel(B().w(f));
        }
    }

    public void x2(int i) {
        w2(this.d0.getResources().getDimension(i));
    }

    @Deprecated
    public void y1(int i) {
        x1(this.d0.getResources().getDimension(i));
    }

    public void y2(float f) {
        if (this.Y != f) {
            this.Y = f;
            invalidateSelf();
            n1();
        }
    }

    public void z1(float f) {
        if (this.c0 != f) {
            this.c0 = f;
            invalidateSelf();
            n1();
        }
    }

    public void z2(int i) {
        y2(this.d0.getResources().getDimension(i));
    }
}

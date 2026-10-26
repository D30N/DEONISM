package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.g.l.a0.c;
import b.g.l.a0.f;
import b.g.l.r;
import b.i.b.c;
import com.facebook.ads.AdError;
import d.b.a.b.j;
import d.b.a.b.z.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final int K = j.Widget_Design_BottomSheet_Modal;
    int A;
    WeakReference<V> B;
    WeakReference<View> C;
    private final ArrayList<e> D;
    private VelocityTracker E;
    int F;
    private int G;
    boolean H;
    private Map<View, Integer> I;
    private final c.AbstractC0038c J;
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2015b;

    /* renamed from: c, reason: collision with root package name */
    private float f2016c;

    /* renamed from: d, reason: collision with root package name */
    private int f2017d;
    private boolean e;
    private int f;
    private boolean g;
    private d.b.a.b.z.g h;
    private k i;
    private boolean j;
    private BottomSheetBehavior<V>.g k;
    private ValueAnimator l;
    int m;
    int n;
    int o;
    float p;
    int q;
    float r;
    boolean s;
    private boolean t;
    int u;
    b.i.b.c v;
    private boolean w;
    private int x;
    private boolean y;
    int z;

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2018b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2019c;

        a(View view, int i) {
            this.f2018b = view;
            this.f2019c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.f0(this.f2018b, this.f2019c);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.h != null) {
                BottomSheetBehavior.this.h.U(fFloatValue);
            }
        }
    }

    class c extends c.AbstractC0038c {
        c() {
        }

        @Override // b.i.b.c.AbstractC0038c
        public int a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // b.i.b.c.AbstractC0038c
        public int b(View view, int i, int i2) {
            int iR = BottomSheetBehavior.this.R();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return b.g.g.a.b(i, iR, bottomSheetBehavior.s ? bottomSheetBehavior.A : bottomSheetBehavior.q);
        }

        @Override // b.i.b.c.AbstractC0038c
        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.s ? bottomSheetBehavior.A : bottomSheetBehavior.q;
        }

        @Override // b.i.b.c.AbstractC0038c
        public void j(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.e0(1);
            }
        }

        @Override // b.i.b.c.AbstractC0038c
        public void k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.P(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
        
            if (java.lang.Math.abs(r8 - r6.a.o) < java.lang.Math.abs(r8 - r6.a.q)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
        
            if (java.lang.Math.abs(r8 - r6.a.n) < java.lang.Math.abs(r8 - r6.a.q)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
        
            if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - r6.a.q)) goto L31;
         */
        @Override // b.i.b.c.AbstractC0038c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l(android.view.View r7, float r8, float r9) {
            /*
                Method dump skipped, instructions count: 222
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.l(android.view.View, float, float):void");
        }

        @Override // b.i.b.c.AbstractC0038c
        public boolean m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.u;
            if (i2 == 1 || bottomSheetBehavior.H) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.F == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.C;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.B;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class d implements b.g.l.a0.f {
        final /* synthetic */ int a;

        d(int i) {
            this.a = i;
        }

        @Override // b.g.l.a0.f
        public boolean a(View view, f.a aVar) {
            BottomSheetBehavior.this.d0(this.a);
            return true;
        }
    }

    public static abstract class e {
        public abstract void a(View view, float f);

        public abstract void b(View view, int i);
    }

    protected static class f extends b.i.a.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        final int f2022d;
        int e;
        boolean f;
        boolean g;
        boolean h;

        static class a implements Parcelable.ClassLoaderCreator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2022d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1;
            this.h = parcel.readInt() == 1;
        }

        public f(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f2022d = bottomSheetBehavior.u;
            this.e = ((BottomSheetBehavior) bottomSheetBehavior).f2017d;
            this.f = ((BottomSheetBehavior) bottomSheetBehavior).f2015b;
            this.g = bottomSheetBehavior.s;
            this.h = ((BottomSheetBehavior) bottomSheetBehavior).t;
        }

        @Override // b.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2022d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.h ? 1 : 0);
        }
    }

    private class g implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final View f2023b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f2024c;

        /* renamed from: d, reason: collision with root package name */
        int f2025d;

        g(View view, int i) {
            this.f2023b = view;
            this.f2025d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.i.b.c cVar = BottomSheetBehavior.this.v;
            if (cVar == null || !cVar.k(true)) {
                BottomSheetBehavior.this.e0(this.f2025d);
            } else {
                r.V(this.f2023b, this);
            }
            this.f2024c = false;
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.f2015b = true;
        this.k = null;
        this.p = 0.5f;
        this.r = -1.0f;
        this.u = 4;
        this.D = new ArrayList<>();
        this.J = new c();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.a = 0;
        this.f2015b = true;
        this.k = null;
        this.p = 0.5f;
        this.r = -1.0f;
        this.u = 4;
        this.D = new ArrayList<>();
        this.J = new c();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.b.a.b.k.BottomSheetBehavior_Layout);
        this.g = typedArrayObtainStyledAttributes.hasValue(d.b.a.b.k.BottomSheetBehavior_Layout_shapeAppearance);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(d.b.a.b.k.BottomSheetBehavior_Layout_backgroundTint);
        if (zHasValue) {
            N(context, attributeSet, zHasValue, d.b.a.b.w.c.a(context, typedArrayObtainStyledAttributes, d.b.a.b.k.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            M(context, attributeSet, zHasValue);
        }
        O();
        if (Build.VERSION.SDK_INT >= 21) {
            this.r = typedArrayObtainStyledAttributes.getDimension(d.b.a.b.k.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(d.b.a.b.k.BottomSheetBehavior_Layout_behavior_peekHeight);
        Z((typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) ? typedArrayObtainStyledAttributes.getDimensionPixelSize(d.b.a.b.k.BottomSheetBehavior_Layout_behavior_peekHeight, -1) : i);
        Y(typedArrayObtainStyledAttributes.getBoolean(d.b.a.b.k.BottomSheetBehavior_Layout_behavior_hideable, false));
        W(typedArrayObtainStyledAttributes.getBoolean(d.b.a.b.k.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        c0(typedArrayObtainStyledAttributes.getBoolean(d.b.a.b.k.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        b0(typedArrayObtainStyledAttributes.getInt(d.b.a.b.k.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        X(typedArrayObtainStyledAttributes.getFloat(d.b.a.b.k.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        V(typedArrayObtainStyledAttributes.getInt(d.b.a.b.k.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        typedArrayObtainStyledAttributes.recycle();
        this.f2016c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private void J(V v, c.a aVar, int i) {
        r.Z(v, aVar, null, new d(i));
    }

    private void K() {
        int iMax = this.e ? Math.max(this.f, this.A - ((this.z * 9) / 16)) : this.f2017d;
        if (this.f2015b) {
            this.q = Math.max(this.A - iMax, this.n);
        } else {
            this.q = this.A - iMax;
        }
    }

    private void L() {
        this.o = (int) (this.A * (1.0f - this.p));
    }

    private void M(Context context, AttributeSet attributeSet, boolean z) {
        N(context, attributeSet, z, null);
    }

    private void N(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.g) {
            this.i = k.e(context, attributeSet, d.b.a.b.b.bottomSheetStyle, K).m();
            d.b.a.b.z.g gVar = new d.b.a.b.z.g(this.i);
            this.h = gVar;
            gVar.L(context);
            if (z && colorStateList != null) {
                this.h.T(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.h.setTint(typedValue.data);
        }
    }

    private void O() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.l.addUpdateListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int R() {
        return this.f2015b ? this.n : this.m;
    }

    private float S() {
        VelocityTracker velocityTracker = this.E;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, this.f2016c);
        return this.E.getYVelocity(this.F);
    }

    private void T() {
        this.F = -1;
        VelocityTracker velocityTracker = this.E;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.E = null;
        }
    }

    private void U(f fVar) {
        int i = this.a;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.f2017d = fVar.e;
        }
        int i2 = this.a;
        if (i2 == -1 || (i2 & 2) == 2) {
            this.f2015b = fVar.f;
        }
        int i3 = this.a;
        if (i3 == -1 || (i3 & 4) == 4) {
            this.s = fVar.g;
        }
        int i4 = this.a;
        if (i4 == -1 || (i4 & 8) == 8) {
            this.t = fVar.h;
        }
    }

    private void g0(int i) {
        V v = this.B.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && r.I(v)) {
            v.post(new a(v, i));
        } else {
            f0(v, i);
        }
    }

    private void j0() {
        V v;
        int i;
        c.a aVar;
        WeakReference<V> weakReference = this.B;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        r.X(v, 524288);
        r.X(v, 262144);
        r.X(v, 1048576);
        if (this.s && this.u != 5) {
            J(v, c.a.h, 5);
        }
        int i2 = this.u;
        if (i2 == 3) {
            i = this.f2015b ? 4 : 6;
            aVar = c.a.g;
        } else {
            if (i2 != 4) {
                if (i2 != 6) {
                    return;
                }
                J(v, c.a.g, 4);
                J(v, c.a.f, 3);
                return;
            }
            i = this.f2015b ? 3 : 6;
            aVar = c.a.f;
        }
        J(v, aVar, i);
    }

    private void k0(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.j != z) {
            this.j = z;
            if (this.h == null || (valueAnimator = this.l) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.l.reverse();
                return;
            }
            float f2 = z ? 0.0f : 1.0f;
            this.l.setFloatValues(1.0f - f2, f2);
            this.l.start();
        }
    }

    private void l0(boolean z) {
        int iIntValue;
        WeakReference<V> weakReference = this.B;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                if (this.I != null) {
                    return;
                } else {
                    this.I = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.B.get()) {
                    if (z) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.I.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        iIntValue = 4;
                    } else {
                        Map<View, Integer> map = this.I;
                        if (map != null && map.containsKey(childAt)) {
                            iIntValue = this.I.get(childAt).intValue();
                        }
                    }
                    r.l0(childAt, iIntValue);
                }
            }
            if (z) {
                return;
            }
            this.I = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.x = 0;
        this.y = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.R()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.e0(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.C
            if (r3 == 0) goto La4
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto La4
            boolean r3 = r2.y
            if (r3 != 0) goto L1f
            goto La4
        L1f:
            int r3 = r2.x
            r5 = 6
            r6 = 4
            if (r3 <= 0) goto L2b
            int r3 = r2.R()
            goto L9e
        L2b:
            boolean r3 = r2.s
            if (r3 == 0) goto L3d
            float r3 = r2.S()
            boolean r3 = r2.h0(r4, r3)
            if (r3 == 0) goto L3d
            int r3 = r2.A
            r0 = 5
            goto L9e
        L3d:
            int r3 = r2.x
            if (r3 != 0) goto L7e
            int r3 = r4.getTop()
            boolean r1 = r2.f2015b
            if (r1 == 0) goto L5d
            int r5 = r2.n
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.q
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L82
            int r3 = r2.n
            goto L9e
        L5d:
            int r1 = r2.o
            if (r3 >= r1) goto L6e
            int r6 = r2.q
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L9b
            int r3 = r2.m
            goto L9e
        L6e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.q
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L82
            goto L9b
        L7e:
            boolean r3 = r2.f2015b
            if (r3 == 0) goto L86
        L82:
            int r3 = r2.q
            r0 = 4
            goto L9e
        L86:
            int r3 = r4.getTop()
            int r0 = r2.o
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.q
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L82
        L9b:
            int r3 = r2.o
            r0 = 6
        L9e:
            r5 = 0
            r2.i0(r4, r0, r3, r5)
            r2.y = r5
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.u == 1 && actionMasked == 0) {
            return true;
        }
        b.i.b.c cVar = this.v;
        if (cVar != null) {
            cVar.z(motionEvent);
        }
        if (actionMasked == 0) {
            T();
        }
        if (this.E == null) {
            this.E = VelocityTracker.obtain();
        }
        this.E.addMovement(motionEvent);
        if (actionMasked == 2 && !this.w && Math.abs(this.G - motionEvent.getY()) > this.v.u()) {
            this.v.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.w;
    }

    void P(int i) {
        float f2;
        float fR;
        V v = this.B.get();
        if (v == null || this.D.isEmpty()) {
            return;
        }
        int i2 = this.q;
        if (i > i2) {
            f2 = i2 - i;
            fR = this.A - i2;
        } else {
            f2 = i2 - i;
            fR = i2 - R();
        }
        float f3 = f2 / fR;
        for (int i3 = 0; i3 < this.D.size(); i3++) {
            this.D.get(i3).a(v, f3);
        }
    }

    View Q(View view) {
        if (r.K(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewQ = Q(viewGroup.getChildAt(i));
            if (viewQ != null) {
                return viewQ;
            }
        }
        return null;
    }

    public void V(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.m = i;
    }

    public void W(boolean z) {
        if (this.f2015b == z) {
            return;
        }
        this.f2015b = z;
        if (this.B != null) {
            K();
        }
        e0((this.f2015b && this.u == 6) ? 3 : this.u);
        j0();
    }

    public void X(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.p = f2;
    }

    public void Y(boolean z) {
        if (this.s != z) {
            this.s = z;
            if (!z && this.u == 5) {
                d0(4);
            }
            j0();
        }
    }

    public void Z(int i) {
        a0(i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto Lc
            boolean r4 = r3.e
            if (r4 != 0) goto L15
            r3.e = r0
            goto L1f
        Lc:
            boolean r2 = r3.e
            if (r2 != 0) goto L17
            int r2 = r3.f2017d
            if (r2 == r4) goto L15
            goto L17
        L15:
            r0 = 0
            goto L1f
        L17:
            r3.e = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f2017d = r4
        L1f:
            if (r0 == 0) goto L42
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r3.B
            if (r4 == 0) goto L42
            r3.K()
            int r4 = r3.u
            r0 = 4
            if (r4 != r0) goto L42
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r3.B
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L42
            if (r5 == 0) goto L3f
            int r4 = r3.u
            r3.g0(r4)
            goto L42
        L3f:
            r4.requestLayout()
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.a0(int, boolean):void");
    }

    public void b0(int i) {
        this.a = i;
    }

    public void c0(boolean z) {
        this.t = z;
    }

    public void d0(int i) {
        if (i == this.u) {
            return;
        }
        if (this.B != null) {
            g0(i);
            return;
        }
        if (i == 4 || i == 3 || i == 6 || (this.s && i == 5)) {
            this.u = i;
        }
    }

    void e0(int i) {
        V v;
        if (this.u == i) {
            return;
        }
        this.u = i;
        WeakReference<V> weakReference = this.B;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 6 || i == 3) {
            l0(true);
        } else if (i == 5 || i == 4) {
            l0(false);
        }
        k0(i);
        for (int i2 = 0; i2 < this.D.size(); i2++) {
            this.D.get(i2).b(v, i);
        }
        j0();
    }

    void f0(View view, int i) {
        int iR;
        int i2;
        if (i == 4) {
            iR = this.q;
        } else if (i == 6) {
            int i3 = this.o;
            if (!this.f2015b || i3 > (i2 = this.n)) {
                iR = i3;
            } else {
                iR = i2;
                i = 3;
            }
        } else if (i == 3) {
            iR = R();
        } else {
            if (!this.s || i != 5) {
                throw new IllegalArgumentException("Illegal state argument: " + i);
            }
            iR = this.A;
        }
        i0(view, i, iR, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.B = null;
        this.v = null;
    }

    boolean h0(View view, float f2) {
        if (this.t) {
            return true;
        }
        return view.getTop() >= this.q && Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.q)) / ((float) this.f2017d) > 0.5f;
    }

    void i0(View view, int i, int i2, boolean z) {
        if (!(z ? this.v.F(view.getLeft(), i2) : this.v.H(view, view.getLeft(), i2))) {
            e0(i);
            return;
        }
        e0(2);
        k0(i);
        if (this.k == null) {
            this.k = new g(view, i);
        }
        if (((g) this.k).f2024c) {
            this.k.f2025d = i;
            return;
        }
        BottomSheetBehavior<V>.g gVar = this.k;
        gVar.f2025d = i;
        r.V(view, gVar);
        ((g) this.k).f2024c = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.B = null;
        this.v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        b.i.b.c cVar;
        if (!v.isShown()) {
            this.w = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            T();
        }
        if (this.E == null) {
            this.E = VelocityTracker.obtain();
        }
        this.E.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.G = (int) motionEvent.getY();
            if (this.u != 2) {
                WeakReference<View> weakReference = this.C;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.B(view, x, this.G)) {
                    this.F = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.H = true;
                }
            }
            this.w = this.F == -1 && !coordinatorLayout.B(v, x, this.G);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.H = false;
            this.F = -1;
            if (this.w) {
                this.w = false;
                return false;
            }
        }
        if (!this.w && (cVar = this.v) != null && cVar.G(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.C;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.w || this.u == 1 || coordinatorLayout.B(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.v == null || Math.abs(((float) this.G) - motionEvent.getY()) <= ((float) this.v.u())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        int iR;
        d.b.a.b.z.g gVar;
        if (r.s(coordinatorLayout) && !r.s(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.B == null) {
            this.f = coordinatorLayout.getResources().getDimensionPixelSize(d.b.a.b.d.design_bottom_sheet_peek_height_min);
            this.B = new WeakReference<>(v);
            if (this.g && (gVar = this.h) != null) {
                r.f0(v, gVar);
            }
            d.b.a.b.z.g gVar2 = this.h;
            if (gVar2 != null) {
                float fQ = this.r;
                if (fQ == -1.0f) {
                    fQ = r.q(v);
                }
                gVar2.S(fQ);
                boolean z = this.u == 3;
                this.j = z;
                this.h.U(z ? 0.0f : 1.0f);
            }
            j0();
            if (r.t(v) == 0) {
                r.l0(v, 1);
            }
        }
        if (this.v == null) {
            this.v = b.i.b.c.m(coordinatorLayout, this.J);
        }
        int top = v.getTop();
        coordinatorLayout.I(v, i);
        this.z = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.A = height;
        this.n = Math.max(0, height - v.getHeight());
        L();
        K();
        int i2 = this.u;
        if (i2 == 3) {
            iR = R();
        } else if (i2 == 6) {
            iR = this.o;
        } else if (this.s && i2 == 5) {
            iR = this.A;
        } else {
            int i3 = this.u;
            if (i3 != 4) {
                if (i3 == 1 || i3 == 2) {
                    r.P(v, top - v.getTop());
                }
                this.C = new WeakReference<>(Q(v));
                return true;
            }
            iR = this.q;
        }
        r.P(v, iR);
        this.C = new WeakReference<>(Q(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.C;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.u != 3 || super.o(coordinatorLayout, v, view, f2, f3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.C;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i5 = top - i2;
        if (i2 > 0) {
            if (i5 < R()) {
                iArr[1] = top - R();
                r.P(v, -iArr[1]);
                i4 = 3;
                e0(i4);
            } else {
                iArr[1] = i2;
                r.P(v, -i2);
                e0(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.q;
            if (i5 <= i6 || this.s) {
                iArr[1] = i2;
                r.P(v, -i2);
                e0(1);
            } else {
                iArr[1] = top - i6;
                r.P(v, -iArr[1]);
                i4 = 4;
                e0(i4);
            }
        }
        P(v.getTop());
        this.x = i2;
        this.y = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.x(coordinatorLayout, v, fVar.a());
        U(fVar);
        int i = fVar.f2022d;
        if (i == 1 || i == 2) {
            i = 4;
        }
        this.u = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v) {
        return new f(super.y(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }
}

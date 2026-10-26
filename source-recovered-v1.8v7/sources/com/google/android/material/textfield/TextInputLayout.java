package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.w0;
import androidx.appcompat.widget.z;
import b.g.l.r;
import com.google.android.material.internal.CheckableImageButton;
import d.b.a.b.i;
import d.b.a.b.j;
import d.b.a.b.z.k;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    private static final int s0 = j.Widget_Design_TextInputLayout;
    private int A;
    private int B;
    private final Rect C;
    private final Rect D;
    private final RectF E;
    private Typeface F;
    private final CheckableImageButton G;
    private ColorStateList H;
    private boolean I;
    private PorterDuff.Mode J;
    private boolean K;
    private Drawable L;
    private View.OnLongClickListener M;
    private final LinkedHashSet<f> N;
    private int O;
    private final SparseArray<com.google.android.material.textfield.e> P;
    private final CheckableImageButton Q;
    private final LinkedHashSet<g> R;
    private ColorStateList S;
    private boolean T;
    private PorterDuff.Mode U;
    private boolean V;
    private Drawable W;
    private Drawable a0;

    /* renamed from: b, reason: collision with root package name */
    private final FrameLayout f2131b;
    private final CheckableImageButton b0;

    /* renamed from: c, reason: collision with root package name */
    private final FrameLayout f2132c;
    private View.OnLongClickListener c0;

    /* renamed from: d, reason: collision with root package name */
    EditText f2133d;
    private ColorStateList d0;
    private CharSequence e;
    private ColorStateList e0;
    private final com.google.android.material.textfield.f f;
    private final int f0;
    boolean g;
    private final int g0;
    private int h;
    private int h0;
    private boolean i;
    private int i0;
    private TextView j;
    private final int j0;
    private int k;
    private final int k0;
    private int l;
    private final int l0;
    private ColorStateList m;
    private boolean m0;
    private ColorStateList n;
    final com.google.android.material.internal.a n0;
    private boolean o;
    private boolean o0;
    private CharSequence p;
    private ValueAnimator p0;
    private boolean q;
    private boolean q0;
    private d.b.a.b.z.g r;
    private boolean r0;
    private d.b.a.b.z.g s;
    private k t;
    private final int u;
    private int v;
    private final int w;
    private int x;
    private final int y;
    private final int z;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.c0(!r0.r0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.g) {
                textInputLayout.V(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.Q.performClick();
            TextInputLayout.this.Q.jumpDrawablesToCurrentState();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f2133d.requestLayout();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.n0.O(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends b.g.l.a {

        /* renamed from: d, reason: collision with root package name */
        private final TextInputLayout f2137d;

        public e(TextInputLayout textInputLayout) {
            this.f2137d = textInputLayout;
        }

        @Override // b.g.l.a
        public void g(View view, b.g.l.a0.c cVar) {
            super.g(view, cVar);
            EditText editText = this.f2137d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f2137d.getHint();
            CharSequence error = this.f2137d.getError();
            CharSequence counterOverflowDescription = this.f2137d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(error);
            boolean z4 = false;
            boolean z5 = z3 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z) {
                cVar.p0(text);
            } else if (z2) {
                cVar.p0(hint);
            }
            if (z2) {
                cVar.g0(hint);
                if (!z && z2) {
                    z4 = true;
                }
                cVar.n0(z4);
            }
            if (z5) {
                if (!z3) {
                    error = counterOverflowDescription;
                }
                cVar.c0(error);
                cVar.a0(true);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i);
    }

    static class h extends b.i.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        CharSequence f2138d;
        boolean e;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i) {
                return new h[i];
            }
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2138d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.e = parcel.readInt() == 1;
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f2138d) + "}";
        }

        @Override // b.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f2138d, parcel, i);
            parcel.writeInt(this.e ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.b.a.b.b.textInputStyle);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        int colorForState;
        super(com.google.android.material.internal.g.f(context, attributeSet, i, s0), attributeSet, i);
        this.f = new com.google.android.material.textfield.f(this);
        this.C = new Rect();
        this.D = new Rect();
        this.E = new RectF();
        this.N = new LinkedHashSet<>();
        this.O = 0;
        this.P = new SparseArray<>();
        this.R = new LinkedHashSet<>();
        this.n0 = new com.google.android.material.internal.a(this);
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f2131b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(this.f2131b);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f2132c = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388629));
        this.f2131b.addView(this.f2132c);
        this.n0.T(d.b.a.b.l.a.a);
        this.n0.Q(d.b.a.b.l.a.a);
        this.n0.F(8388659);
        w0 w0VarL = com.google.android.material.internal.g.l(context2, attributeSet, d.b.a.b.k.TextInputLayout, i, s0, d.b.a.b.k.TextInputLayout_counterTextAppearance, d.b.a.b.k.TextInputLayout_counterOverflowTextAppearance, d.b.a.b.k.TextInputLayout_errorTextAppearance, d.b.a.b.k.TextInputLayout_helperTextTextAppearance, d.b.a.b.k.TextInputLayout_hintTextAppearance);
        this.o = w0VarL.a(d.b.a.b.k.TextInputLayout_hintEnabled, true);
        setHint(w0VarL.p(d.b.a.b.k.TextInputLayout_android_hint));
        this.o0 = w0VarL.a(d.b.a.b.k.TextInputLayout_hintAnimationEnabled, true);
        this.t = k.e(context2, attributeSet, i, s0).m();
        this.u = context2.getResources().getDimensionPixelOffset(d.b.a.b.d.mtrl_textinput_box_label_cutout_padding);
        this.w = w0VarL.e(d.b.a.b.k.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.y = w0VarL.f(d.b.a.b.k.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(d.b.a.b.d.mtrl_textinput_box_stroke_width_default));
        this.z = w0VarL.f(d.b.a.b.k.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(d.b.a.b.d.mtrl_textinput_box_stroke_width_focused));
        this.x = this.y;
        float fD = w0VarL.d(d.b.a.b.k.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float fD2 = w0VarL.d(d.b.a.b.k.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float fD3 = w0VarL.d(d.b.a.b.k.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float fD4 = w0VarL.d(d.b.a.b.k.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        k.b bVarV = this.t.v();
        if (fD >= 0.0f) {
            bVarV.z(fD);
        }
        if (fD2 >= 0.0f) {
            bVarV.D(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarV.v(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarV.r(fD4);
        }
        this.t = bVarV.m();
        ColorStateList colorStateListB = d.b.a.b.w.c.b(context2, w0VarL, d.b.a.b.k.TextInputLayout_boxBackgroundColor);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.i0 = defaultColor;
            this.B = defaultColor;
            if (colorStateListB.isStateful()) {
                this.j0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateListB.getColorForState(new int[]{R.attr.state_hovered}, -1);
            } else {
                ColorStateList colorStateListC = b.a.k.a.a.c(context2, d.b.a.b.c.mtrl_filled_background_color);
                this.j0 = colorStateListC.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateListC.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
            this.k0 = colorForState;
        } else {
            this.B = 0;
            this.i0 = 0;
            this.j0 = 0;
            this.k0 = 0;
        }
        if (w0VarL.r(d.b.a.b.k.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateListC2 = w0VarL.c(d.b.a.b.k.TextInputLayout_android_textColorHint);
            this.e0 = colorStateListC2;
            this.d0 = colorStateListC2;
        }
        ColorStateList colorStateListB2 = d.b.a.b.w.c.b(context2, w0VarL, d.b.a.b.k.TextInputLayout_boxStrokeColor);
        if (colorStateListB2 == null || !colorStateListB2.isStateful()) {
            this.h0 = w0VarL.b(d.b.a.b.k.TextInputLayout_boxStrokeColor, 0);
            this.f0 = b.g.d.a.d(context2, d.b.a.b.c.mtrl_textinput_default_box_stroke_color);
            this.l0 = b.g.d.a.d(context2, d.b.a.b.c.mtrl_textinput_disabled_color);
            this.g0 = b.g.d.a.d(context2, d.b.a.b.c.mtrl_textinput_hovered_box_stroke_color);
        } else {
            this.f0 = colorStateListB2.getDefaultColor();
            this.l0 = colorStateListB2.getColorForState(new int[]{-16842910}, -1);
            this.g0 = colorStateListB2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            this.h0 = colorStateListB2.getColorForState(new int[]{R.attr.state_focused}, -1);
        }
        if (w0VarL.n(d.b.a.b.k.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(w0VarL.n(d.b.a.b.k.TextInputLayout_hintTextAppearance, 0));
        }
        int iN = w0VarL.n(d.b.a.b.k.TextInputLayout_errorTextAppearance, 0);
        boolean zA = w0VarL.a(d.b.a.b.k.TextInputLayout_errorEnabled, false);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(d.b.a.b.h.design_text_input_end_icon, (ViewGroup) this.f2131b, false);
        this.b0 = checkableImageButton;
        this.f2131b.addView(checkableImageButton);
        this.b0.setVisibility(8);
        if (w0VarL.r(d.b.a.b.k.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(w0VarL.g(d.b.a.b.k.TextInputLayout_errorIconDrawable));
        }
        if (w0VarL.r(d.b.a.b.k.TextInputLayout_errorIconTint)) {
            setErrorIconTintList(d.b.a.b.w.c.b(context2, w0VarL, d.b.a.b.k.TextInputLayout_errorIconTint));
        }
        if (w0VarL.r(d.b.a.b.k.TextInputLayout_errorIconTintMode)) {
            setErrorIconTintMode(com.google.android.material.internal.h.c(w0VarL.k(d.b.a.b.k.TextInputLayout_errorIconTintMode, -1), null));
        }
        this.b0.setContentDescription(getResources().getText(i.error_icon_content_description));
        r.l0(this.b0, 2);
        this.b0.setClickable(false);
        this.b0.setPressable(false);
        this.b0.setFocusable(false);
        int iN2 = w0VarL.n(d.b.a.b.k.TextInputLayout_helperTextTextAppearance, 0);
        boolean zA2 = w0VarL.a(d.b.a.b.k.TextInputLayout_helperTextEnabled, false);
        CharSequence charSequenceP = w0VarL.p(d.b.a.b.k.TextInputLayout_helperText);
        boolean zA3 = w0VarL.a(d.b.a.b.k.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(w0VarL.k(d.b.a.b.k.TextInputLayout_counterMaxLength, -1));
        this.l = w0VarL.n(d.b.a.b.k.TextInputLayout_counterTextAppearance, 0);
        this.k = w0VarL.n(d.b.a.b.k.TextInputLayout_counterOverflowTextAppearance, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(d.b.a.b.h.design_text_input_start_icon, (ViewGroup) this.f2131b, false);
        this.G = checkableImageButton2;
        this.f2131b.addView(checkableImageButton2);
        this.G.setVisibility(8);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (w0VarL.r(d.b.a.b.k.TextInputLayout_startIconDrawable)) {
            setStartIconDrawable(w0VarL.g(d.b.a.b.k.TextInputLayout_startIconDrawable));
            if (w0VarL.r(d.b.a.b.k.TextInputLayout_startIconContentDescription)) {
                setStartIconContentDescription(w0VarL.p(d.b.a.b.k.TextInputLayout_startIconContentDescription));
            }
            setStartIconCheckable(w0VarL.a(d.b.a.b.k.TextInputLayout_startIconCheckable, true));
        }
        if (w0VarL.r(d.b.a.b.k.TextInputLayout_startIconTint)) {
            setStartIconTintList(d.b.a.b.w.c.b(context2, w0VarL, d.b.a.b.k.TextInputLayout_startIconTint));
        }
        if (w0VarL.r(d.b.a.b.k.TextInputLayout_startIconTintMode)) {
            setStartIconTintMode(com.google.android.material.internal.h.c(w0VarL.k(d.b.a.b.k.TextInputLayout_startIconTintMode, -1), null));
        }
        setHelperTextEnabled(zA2);
        setHelperText(charSequenceP);
        setHelperTextTextAppearance(iN2);
        setErrorEnabled(zA);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.l);
        setCounterOverflowTextAppearance(this.k);
        if (w0VarL.r(d.b.a.b.k.TextInputLayout_errorTextColor)) {
            setErrorTextColor(w0VarL.c(d.b.a.b.k.TextInputLayout_errorTextColor));
        }
        if (w0VarL.r(d.b.a.b.k.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(w0VarL.c(d.b.a.b.k.TextInputLayout_helperTextTextColor));
        }
        if (w0VarL.r(d.b.a.b.k.TextInputLayout_hintTextColor)) {
            setHintTextColor(w0VarL.c(d.b.a.b.k.TextInputLayout_hintTextColor));
        }
        if (w0VarL.r(d.b.a.b.k.TextInputLayout_counterTextColor)) {
            setCounterTextColor(w0VarL.c(d.b.a.b.k.TextInputLayout_counterTextColor));
        }
        if (w0VarL.r(d.b.a.b.k.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(w0VarL.c(d.b.a.b.k.TextInputLayout_counterOverflowTextColor));
        }
        setCounterEnabled(zA3);
        setBoxBackgroundMode(w0VarL.k(d.b.a.b.k.TextInputLayout_boxBackgroundMode, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(d.b.a.b.h.design_text_input_end_icon, (ViewGroup) this.f2132c, false);
        this.Q = checkableImageButton3;
        this.f2132c.addView(checkableImageButton3);
        this.Q.setVisibility(8);
        this.P.append(-1, new com.google.android.material.textfield.b(this));
        this.P.append(0, new com.google.android.material.textfield.g(this));
        this.P.append(1, new com.google.android.material.textfield.h(this));
        this.P.append(2, new com.google.android.material.textfield.a(this));
        this.P.append(3, new com.google.android.material.textfield.d(this));
        if (w0VarL.r(d.b.a.b.k.TextInputLayout_endIconMode)) {
            setEndIconMode(w0VarL.k(d.b.a.b.k.TextInputLayout_endIconMode, 0));
            if (w0VarL.r(d.b.a.b.k.TextInputLayout_endIconDrawable)) {
                setEndIconDrawable(w0VarL.g(d.b.a.b.k.TextInputLayout_endIconDrawable));
            }
            if (w0VarL.r(d.b.a.b.k.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(w0VarL.p(d.b.a.b.k.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(w0VarL.a(d.b.a.b.k.TextInputLayout_endIconCheckable, true));
        } else if (w0VarL.r(d.b.a.b.k.TextInputLayout_passwordToggleEnabled)) {
            setEndIconMode(w0VarL.a(d.b.a.b.k.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconDrawable(w0VarL.g(d.b.a.b.k.TextInputLayout_passwordToggleDrawable));
            setEndIconContentDescription(w0VarL.p(d.b.a.b.k.TextInputLayout_passwordToggleContentDescription));
            if (w0VarL.r(d.b.a.b.k.TextInputLayout_passwordToggleTint)) {
                setEndIconTintList(d.b.a.b.w.c.b(context2, w0VarL, d.b.a.b.k.TextInputLayout_passwordToggleTint));
            }
            if (w0VarL.r(d.b.a.b.k.TextInputLayout_passwordToggleTintMode)) {
                setEndIconTintMode(com.google.android.material.internal.h.c(w0VarL.k(d.b.a.b.k.TextInputLayout_passwordToggleTintMode, -1), null));
            }
        }
        if (!w0VarL.r(d.b.a.b.k.TextInputLayout_passwordToggleEnabled)) {
            if (w0VarL.r(d.b.a.b.k.TextInputLayout_endIconTint)) {
                setEndIconTintList(d.b.a.b.w.c.b(context2, w0VarL, d.b.a.b.k.TextInputLayout_endIconTint));
            }
            if (w0VarL.r(d.b.a.b.k.TextInputLayout_endIconTintMode)) {
                setEndIconTintMode(com.google.android.material.internal.h.c(w0VarL.k(d.b.a.b.k.TextInputLayout_endIconTintMode, -1), null));
            }
        }
        w0VarL.v();
        r.l0(this, 2);
    }

    private void A(Canvas canvas) {
        if (this.o) {
            this.n0.i(canvas);
        }
    }

    private void B(boolean z) {
        ValueAnimator valueAnimator = this.p0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.p0.cancel();
        }
        if (z && this.o0) {
            e(0.0f);
        } else {
            this.n0.O(0.0f);
        }
        if (w() && ((com.google.android.material.textfield.c) this.r).f0()) {
            u();
        }
        this.m0 = true;
    }

    private boolean C() {
        return this.O != 0;
    }

    private boolean D() {
        return getStartIconDrawable() != null;
    }

    private boolean H() {
        return this.v == 1 && (Build.VERSION.SDK_INT < 16 || this.f2133d.getMinLines() <= 1);
    }

    private void J() {
        l();
        M();
        e0();
        if (this.v != 0) {
            b0();
        }
    }

    private void K() {
        if (w()) {
            RectF rectF = this.E;
            this.n0.k(rectF);
            h(rectF);
            rectF.offset(-getPaddingLeft(), 0.0f);
            ((com.google.android.material.textfield.c) this.r).l0(rectF);
        }
    }

    private static void L(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                L((ViewGroup) childAt, z);
            }
        }
    }

    private void M() {
        if (R()) {
            r.f0(this.f2133d, this.r);
        }
    }

    private static void N(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zE = r.E(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zE || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zE);
        checkableImageButton.setPressable(zE);
        checkableImageButton.setLongClickable(z);
        r.l0(checkableImageButton, z2 ? 1 : 2);
    }

    private static void O(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        N(checkableImageButton, onLongClickListener);
    }

    private static void P(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        N(checkableImageButton, onLongClickListener);
    }

    private boolean R() {
        EditText editText = this.f2133d;
        return (editText == null || this.r == null || editText.getBackground() != null || this.v == 0) ? false : true;
    }

    private void S(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            i();
            return;
        }
        Drawable drawableMutate = androidx.core.graphics.drawable.a.r(getEndIconDrawable()).mutate();
        androidx.core.graphics.drawable.a.n(drawableMutate, this.f.n());
        this.Q.setImageDrawable(drawableMutate);
    }

    private void T(Rect rect) {
        d.b.a.b.z.g gVar = this.s;
        if (gVar != null) {
            int i = rect.bottom;
            gVar.setBounds(rect.left, i - this.z, rect.right, i);
        }
    }

    private void U() {
        if (this.j != null) {
            EditText editText = this.f2133d;
            V(editText == null ? 0 : editText.getText().length());
        }
    }

    private static void W(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? i.character_counter_overflowed_content_description : i.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private void X() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.j;
        if (textView != null) {
            Q(textView, this.i ? this.k : this.l);
            if (!this.i && (colorStateList2 = this.m) != null) {
                this.j.setTextColor(colorStateList2);
            }
            if (!this.i || (colorStateList = this.n) == null) {
                return;
            }
            this.j.setTextColor(colorStateList);
        }
    }

    private boolean Z() {
        int iMax;
        if (this.f2133d == null || this.f2133d.getMeasuredHeight() >= (iMax = Math.max(this.Q.getMeasuredHeight(), this.G.getMeasuredHeight()))) {
            return false;
        }
        this.f2133d.setMinimumHeight(iMax);
        return true;
    }

    private boolean a0() {
        boolean z;
        if (this.f2133d == null) {
            return false;
        }
        boolean z2 = true;
        if (D() && I() && this.G.getMeasuredWidth() > 0) {
            if (this.L == null) {
                this.L = new ColorDrawable();
                this.L.setBounds(0, 0, (this.G.getMeasuredWidth() - this.f2133d.getPaddingLeft()) + b.g.l.f.a((ViewGroup.MarginLayoutParams) this.G.getLayoutParams()), 1);
            }
            Drawable[] drawableArrA = androidx.core.widget.i.a(this.f2133d);
            Drawable drawable = drawableArrA[0];
            Drawable drawable2 = this.L;
            if (drawable != drawable2) {
                androidx.core.widget.i.i(this.f2133d, drawable2, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.L != null) {
                Drawable[] drawableArrA2 = androidx.core.widget.i.a(this.f2133d);
                androidx.core.widget.i.i(this.f2133d, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
                this.L = null;
                z = true;
            }
            z = false;
        }
        CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
        if (endIconToUpdateDummyDrawable != null && endIconToUpdateDummyDrawable.getMeasuredWidth() > 0) {
            if (this.W == null) {
                this.W = new ColorDrawable();
                this.W.setBounds(0, 0, (endIconToUpdateDummyDrawable.getMeasuredWidth() - this.f2133d.getPaddingRight()) + b.g.l.f.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()), 1);
            }
            Drawable[] drawableArrA3 = androidx.core.widget.i.a(this.f2133d);
            Drawable drawable3 = drawableArrA3[2];
            Drawable drawable4 = this.W;
            if (drawable3 != drawable4) {
                this.a0 = drawableArrA3[2];
                androidx.core.widget.i.i(this.f2133d, drawableArrA3[0], drawableArrA3[1], drawable4, drawableArrA3[3]);
            } else {
                z2 = z;
            }
        } else {
            if (this.W == null) {
                return z;
            }
            Drawable[] drawableArrA4 = androidx.core.widget.i.a(this.f2133d);
            if (drawableArrA4[2] == this.W) {
                androidx.core.widget.i.i(this.f2133d, drawableArrA4[0], drawableArrA4[1], this.a0, drawableArrA4[3]);
            } else {
                z2 = z;
            }
            this.W = null;
        }
        return z2;
    }

    private void b0() {
        if (this.v != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2131b.getLayoutParams();
            int iR = r();
            if (iR != layoutParams.topMargin) {
                layoutParams.topMargin = iR;
                this.f2131b.requestLayout();
            }
        }
    }

    private void d0(boolean z, boolean z2) {
        ColorStateList textColors;
        com.google.android.material.internal.a aVar;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f2133d;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f2133d;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean zK = this.f.k();
        ColorStateList colorStateList = this.d0;
        if (colorStateList != null) {
            this.n0.E(colorStateList);
            this.n0.K(this.d0);
        }
        if (!zIsEnabled) {
            this.n0.E(ColorStateList.valueOf(this.l0));
            this.n0.K(ColorStateList.valueOf(this.l0));
        } else if (zK) {
            this.n0.E(this.f.o());
        } else {
            if (this.i && (textView = this.j) != null) {
                aVar = this.n0;
                textColors = textView.getTextColors();
            } else if (z4 && (textColors = this.e0) != null) {
                aVar = this.n0;
            }
            aVar.E(textColors);
        }
        if (z3 || (isEnabled() && (z4 || zK))) {
            if (z2 || this.m0) {
                v(z);
                return;
            }
            return;
        }
        if (z2 || !this.m0) {
            B(z);
        }
    }

    private void f() {
        d.b.a.b.z.g gVar = this.r;
        if (gVar == null) {
            return;
        }
        gVar.setShapeAppearanceModel(this.t);
        if (s()) {
            this.r.Y(this.x, this.A);
        }
        int iM = m();
        this.B = iM;
        this.r.T(ColorStateList.valueOf(iM));
        if (this.O == 3) {
            this.f2133d.getBackground().invalidateSelf();
        }
        g();
        invalidate();
    }

    private void g() {
        if (this.s == null) {
            return;
        }
        if (t()) {
            this.s.T(ColorStateList.valueOf(this.A));
        }
        invalidate();
    }

    private com.google.android.material.textfield.e getEndIconDelegate() {
        com.google.android.material.textfield.e eVar = this.P.get(this.O);
        return eVar != null ? eVar : this.P.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.b0.getVisibility() == 0) {
            return this.b0;
        }
        if (C() && E()) {
            return this.Q;
        }
        return null;
    }

    private void h(RectF rectF) {
        float f2 = rectF.left;
        int i = this.u;
        rectF.left = f2 - i;
        rectF.top -= i;
        rectF.right += i;
        rectF.bottom += i;
    }

    private void i() {
        j(this.Q, this.T, this.S, this.V, this.U);
    }

    private void j(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (z) {
                androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            }
            if (z2) {
                androidx.core.graphics.drawable.a.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void k() {
        j(this.G, this.I, this.H, this.K, this.J);
    }

    private void l() {
        int i = this.v;
        if (i == 0) {
            this.r = null;
        } else if (i == 1) {
            this.r = new d.b.a.b.z.g(this.t);
            this.s = new d.b.a.b.z.g();
            return;
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.v + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            this.r = (!this.o || (this.r instanceof com.google.android.material.textfield.c)) ? new d.b.a.b.z.g(this.t) : new com.google.android.material.textfield.c(this.t);
        }
        this.s = null;
    }

    private int m() {
        return this.v == 1 ? d.b.a.b.q.a.e(d.b.a.b.q.a.d(this, d.b.a.b.b.colorSurface, 0), this.B) : this.B;
    }

    private Rect n(Rect rect) {
        int paddingTop;
        int i;
        int compoundPaddingRight;
        EditText editText = this.f2133d;
        if (editText == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.D;
        rect2.bottom = rect.bottom;
        int i2 = this.v;
        if (i2 == 1) {
            rect2.left = rect.left + editText.getCompoundPaddingLeft();
            paddingTop = rect.top + this.w;
        } else {
            if (i2 == 2) {
                rect2.left = rect.left + editText.getPaddingLeft();
                rect2.top = rect.top - r();
                i = rect.right;
                compoundPaddingRight = this.f2133d.getPaddingRight();
                rect2.right = i - compoundPaddingRight;
                return rect2;
            }
            rect2.left = rect.left + editText.getCompoundPaddingLeft();
            paddingTop = getPaddingTop();
        }
        rect2.top = paddingTop;
        i = rect.right;
        compoundPaddingRight = this.f2133d.getCompoundPaddingRight();
        rect2.right = i - compoundPaddingRight;
        return rect2;
    }

    private int o(Rect rect, Rect rect2, float f2) {
        return this.v == 1 ? (int) (rect2.top + f2) : rect.bottom - this.f2133d.getCompoundPaddingBottom();
    }

    private int p(Rect rect, float f2) {
        return H() ? (int) (rect.centerY() - (f2 / 2.0f)) : rect.top + this.f2133d.getCompoundPaddingTop();
    }

    private Rect q(Rect rect) {
        if (this.f2133d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.D;
        float fQ = this.n0.q();
        rect2.left = rect.left + this.f2133d.getCompoundPaddingLeft();
        rect2.top = p(rect, fQ);
        rect2.right = rect.right - this.f2133d.getCompoundPaddingRight();
        rect2.bottom = o(rect, rect2, fQ);
        return rect2;
    }

    private int r() {
        float fM;
        if (!this.o) {
            return 0;
        }
        int i = this.v;
        if (i == 0 || i == 1) {
            fM = this.n0.m();
        } else {
            if (i != 2) {
                return 0;
            }
            fM = this.n0.m() / 2.0f;
        }
        return (int) fM;
    }

    private boolean s() {
        return this.v == 2 && t();
    }

    private void setEditText(EditText editText) {
        if (this.f2133d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.O != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f2133d = editText;
        J();
        setTextInputAccessibilityDelegate(new e(this));
        this.n0.U(this.f2133d.getTypeface());
        this.n0.M(this.f2133d.getTextSize());
        int gravity = this.f2133d.getGravity();
        this.n0.F((gravity & (-113)) | 48);
        this.n0.L(gravity);
        this.f2133d.addTextChangedListener(new a());
        if (this.d0 == null) {
            this.d0 = this.f2133d.getHintTextColors();
        }
        if (this.o) {
            if (TextUtils.isEmpty(this.p)) {
                CharSequence hint = this.f2133d.getHint();
                this.e = hint;
                setHint(hint);
                this.f2133d.setHint((CharSequence) null);
            }
            this.q = true;
        }
        if (this.j != null) {
            V(this.f2133d.getText().length());
        }
        Y();
        this.f.e();
        this.G.bringToFront();
        this.f2132c.bringToFront();
        this.b0.bringToFront();
        x();
        d0(false, true);
    }

    private void setErrorIconVisible(boolean z) {
        this.b0.setVisibility(z ? 0 : 8);
        this.f2132c.setVisibility(z ? 8 : 0);
        if (C()) {
            return;
        }
        a0();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.p)) {
            return;
        }
        this.p = charSequence;
        this.n0.S(charSequence);
        if (this.m0) {
            return;
        }
        K();
    }

    private boolean t() {
        return this.x > -1 && this.A != 0;
    }

    private void u() {
        if (w()) {
            ((com.google.android.material.textfield.c) this.r).i0();
        }
    }

    private void v(boolean z) {
        ValueAnimator valueAnimator = this.p0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.p0.cancel();
        }
        if (z && this.o0) {
            e(1.0f);
        } else {
            this.n0.O(1.0f);
        }
        this.m0 = false;
        if (w()) {
            K();
        }
    }

    private boolean w() {
        return this.o && !TextUtils.isEmpty(this.p) && (this.r instanceof com.google.android.material.textfield.c);
    }

    private void x() {
        Iterator<f> it = this.N.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void y(int i) {
        Iterator<g> it = this.R.iterator();
        while (it.hasNext()) {
            it.next().a(this, i);
        }
    }

    private void z(Canvas canvas) {
        d.b.a.b.z.g gVar = this.s;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.x;
            this.s.draw(canvas);
        }
    }

    public boolean E() {
        return this.f2132c.getVisibility() == 0 && this.Q.getVisibility() == 0;
    }

    public boolean F() {
        return this.f.w();
    }

    boolean G() {
        return this.q;
    }

    public boolean I() {
        return this.G.getVisibility() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void Q(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.i.n(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = d.b.a.b.j.TextAppearance_AppCompat_Caption
            androidx.core.widget.i.n(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = d.b.a.b.c.design_error
            int r4 = b.g.d.a.d(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.Q(android.widget.TextView, int):void");
    }

    void V(int i) {
        boolean z = this.i;
        if (this.h == -1) {
            this.j.setText(String.valueOf(i));
            this.j.setContentDescription(null);
            this.i = false;
        } else {
            if (r.j(this.j) == 1) {
                r.e0(this.j, 0);
            }
            this.i = i > this.h;
            W(getContext(), this.j, i, this.h, this.i);
            if (z != this.i) {
                X();
                if (this.i) {
                    r.e0(this.j, 1);
                }
            }
            this.j.setText(getContext().getString(i.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.h)));
        }
        if (this.f2133d == null || z == this.i) {
            return;
        }
        c0(false);
        e0();
        Y();
    }

    void Y() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f2133d;
        if (editText == null || this.v != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (e0.a(background)) {
            background = background.mutate();
        }
        if (this.f.k()) {
            currentTextColor = this.f.n();
        } else {
            if (!this.i || (textView = this.j) == null) {
                androidx.core.graphics.drawable.a.c(background);
                this.f2133d.refreshDrawableState();
                return;
            }
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(androidx.appcompat.widget.j.e(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f2131b.addView(view, layoutParams2);
        this.f2131b.setLayoutParams(layoutParams);
        b0();
        setEditText((EditText) view);
    }

    public void c(f fVar) {
        this.N.add(fVar);
        if (this.f2133d != null) {
            fVar.a(this);
        }
    }

    void c0(boolean z) {
        d0(z, false);
    }

    public void d(g gVar) {
        this.R.add(gVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.e == null || (editText = this.f2133d) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.q;
        this.q = false;
        CharSequence hint = editText.getHint();
        this.f2133d.setHint(this.e);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f2133d.setHint(hint);
            this.q = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.r0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.r0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        A(canvas);
        z(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.q0) {
            return;
        }
        this.q0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.n0;
        boolean zR = aVar != null ? aVar.R(drawableState) | false : false;
        c0(r.J(this) && isEnabled());
        Y();
        e0();
        if (zR) {
            invalidate();
        }
        this.q0 = false;
    }

    void e(float f2) {
        if (this.n0.r() == f2) {
            return;
        }
        if (this.p0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.p0 = valueAnimator;
            valueAnimator.setInterpolator(d.b.a.b.l.a.f2958b);
            this.p0.setDuration(167L);
            this.p0.addUpdateListener(new d());
        }
        this.p0.setFloatValues(this.n0.r(), f2);
        this.p0.start();
    }

    void e0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.r == null || this.v == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f2133d) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.f2133d) != null && editText.isHovered());
        this.A = !isEnabled() ? this.l0 : this.f.k() ? this.f.n() : (!this.i || (textView = this.j) == null) ? z2 ? this.h0 : z3 ? this.g0 : this.f0 : textView.getCurrentTextColor();
        S(this.f.k() && getEndIconDelegate().c());
        if (getErrorIconDrawable() != null && this.f.v() && this.f.k()) {
            z = true;
        }
        setErrorIconVisible(z);
        this.x = ((z3 || z2) && isEnabled()) ? this.z : this.y;
        if (this.v == 1) {
            this.B = !isEnabled() ? this.j0 : z3 ? this.k0 : this.i0;
        }
        f();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f2133d;
        return editText != null ? editText.getBaseline() + getPaddingTop() + r() : super.getBaseline();
    }

    d.b.a.b.z.g getBoxBackground() {
        int i = this.v;
        if (i == 1 || i == 2) {
            return this.r;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.B;
    }

    public int getBoxBackgroundMode() {
        return this.v;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.r.r();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.r.s();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.r.F();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.r.E();
    }

    public int getBoxStrokeColor() {
        return this.h0;
    }

    public int getCounterMaxLength() {
        return this.h;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.g && this.i && (textView = this.j) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.m;
    }

    public ColorStateList getCounterTextColor() {
        return this.m;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.d0;
    }

    public EditText getEditText() {
        return this.f2133d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.Q.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.Q.getDrawable();
    }

    public int getEndIconMode() {
        return this.O;
    }

    CheckableImageButton getEndIconView() {
        return this.Q;
    }

    public CharSequence getError() {
        if (this.f.v()) {
            return this.f.m();
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        return this.f.n();
    }

    public Drawable getErrorIconDrawable() {
        return this.b0.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.f.n();
    }

    public CharSequence getHelperText() {
        if (this.f.w()) {
            return this.f.p();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f.q();
    }

    public CharSequence getHint() {
        if (this.o) {
            return this.p;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.n0.m();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.n0.n();
    }

    public ColorStateList getHintTextColor() {
        return this.e0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.Q.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.Q.getDrawable();
    }

    public CharSequence getStartIconContentDescription() {
        return this.G.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.G.getDrawable();
    }

    public Typeface getTypeface() {
        return this.F;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f2133d;
        if (editText != null) {
            Rect rect = this.C;
            com.google.android.material.internal.b.a(this, editText, rect);
            T(rect);
            if (this.o) {
                this.n0.C(n(rect));
                this.n0.J(q(rect));
                this.n0.z();
                if (!w() || this.m0) {
                    return;
                }
                K();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean Z = Z();
        boolean zA0 = a0();
        if (Z || zA0) {
            this.f2133d.post(new c());
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f2138d);
        if (hVar.e) {
            this.Q.post(new b());
        }
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f.k()) {
            hVar.f2138d = getError();
        }
        hVar.e = C() && this.Q.isChecked();
        return hVar;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.B != i) {
            this.B = i;
            this.i0 = i;
            f();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(b.g.d.a.d(getContext(), i));
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.v) {
            return;
        }
        this.v = i;
        if (this.f2133d != null) {
            J();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.h0 != i) {
            this.h0 = i;
            e0();
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.g != z) {
            if (z) {
                z zVar = new z(getContext());
                this.j = zVar;
                zVar.setId(d.b.a.b.f.textinput_counter);
                Typeface typeface = this.F;
                if (typeface != null) {
                    this.j.setTypeface(typeface);
                }
                this.j.setMaxLines(1);
                this.f.d(this.j, 2);
                X();
                U();
            } else {
                this.f.x(this.j, 2);
                this.j = null;
            }
            this.g = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.h != i) {
            if (i <= 0) {
                i = -1;
            }
            this.h = i;
            if (this.g) {
                U();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.k != i) {
            this.k = i;
            X();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            X();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.l != i) {
            this.l = i;
            X();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            X();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.d0 = colorStateList;
        this.e0 = colorStateList;
        if (this.f2133d != null) {
            c0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        L(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.Q.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.Q.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.Q.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? b.a.k.a.a.d(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.Q.setImageDrawable(drawable);
    }

    public void setEndIconMode(int i) {
        int i2 = this.O;
        this.O = i;
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().b(this.v)) {
            getEndIconDelegate().a();
            i();
            y(i2);
        } else {
            throw new IllegalStateException("The current box background mode " + this.v + " is not supported by the end icon mode " + i);
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        O(this.Q, onClickListener, this.c0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.c0 = onLongClickListener;
        P(this.Q, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            this.T = true;
            i();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.U != mode) {
            this.U = mode;
            this.V = true;
            i();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (E() != z) {
            this.Q.setVisibility(z ? 0 : 4);
            a0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f.v()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f.r();
        } else {
            this.f.J(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        this.f.z(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? b.a.k.a.a.d(getContext(), i) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.b0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f.v());
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        Drawable drawable = this.b0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        }
        if (this.b0.getDrawable() != drawable) {
            this.b0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.b0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.p(drawable, mode);
        }
        if (this.b0.getDrawable() != drawable) {
            this.b0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f.A(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f.B(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (F()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!F()) {
                setHelperTextEnabled(true);
            }
            this.f.K(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f.E(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f.D(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f.C(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.o) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.o0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.o) {
            this.o = z;
            if (z) {
                CharSequence hint = this.f2133d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.p)) {
                        setHint(hint);
                    }
                    this.f2133d.setHint((CharSequence) null);
                }
                this.q = true;
            } else {
                this.q = false;
                if (!TextUtils.isEmpty(this.p) && TextUtils.isEmpty(this.f2133d.getHint())) {
                    this.f2133d.setHint(this.p);
                }
                setHintInternal(null);
            }
            if (this.f2133d != null) {
                b0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.n0.D(i);
        this.e0 = this.n0.l();
        if (this.f2133d != null) {
            c0(false);
            b0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.e0 != colorStateList) {
            if (this.d0 == null) {
                this.n0.E(colorStateList);
            }
            this.e0 = colorStateList;
            if (this.f2133d != null) {
                c0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.Q.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? b.a.k.a.a.d(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.Q.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.O != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.S = colorStateList;
        this.T = true;
        i();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.U = mode;
        this.V = true;
        i();
    }

    public void setStartIconCheckable(boolean z) {
        this.G.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.G.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? b.a.k.a.a.d(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.G.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            k();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        O(this.G, onClickListener, this.M);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.M = onLongClickListener;
        P(this.G, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            this.I = true;
            k();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.J != mode) {
            this.J = mode;
            this.K = true;
            k();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (I() != z) {
            this.G.setVisibility(z ? 0 : 8);
            a0();
        }
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f2133d;
        if (editText != null) {
            r.c0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.F) {
            this.F = typeface;
            this.n0.U(typeface);
            this.f.G(typeface);
            TextView textView = this.j;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }
}

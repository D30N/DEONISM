package com.google.android.material.textfield;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import b.g.l.r;
import com.google.android.material.textfield.TextInputLayout;
import d.b.a.b.z.k;

/* loaded from: classes.dex */
class d extends com.google.android.material.textfield.e {
    private static final boolean o;

    /* renamed from: d, reason: collision with root package name */
    private final TextWatcher f2142d;
    private final TextInputLayout.e e;
    private final TextInputLayout.f f;
    private boolean g;
    private boolean h;
    private long i;
    private StateListDrawable j;
    private d.b.a.b.z.g k;
    private AccessibilityManager l;
    private ValueAnimator m;
    private ValueAnimator n;

    class a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.d$a$a, reason: collision with other inner class name */
        class RunnableC0075a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f2144b;

            RunnableC0075a(AutoCompleteTextView autoCompleteTextView) {
                this.f2144b = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zIsPopupShowing = this.f2144b.isPopupShowing();
                d.this.z(zIsPopupShowing);
                d.this.g = zIsPopupShowing;
            }
        }

        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            d dVar = d.this;
            AutoCompleteTextView autoCompleteTextViewU = dVar.u(dVar.a.getEditText());
            autoCompleteTextViewU.post(new RunnableC0075a(autoCompleteTextViewU));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class b extends TextInputLayout.e {
        b(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, b.g.l.a
        public void g(View view, b.g.l.a0.c cVar) {
            super.g(view, cVar);
            cVar.V(Spinner.class.getName());
            if (cVar.I()) {
                cVar.g0(null);
            }
        }

        @Override // b.g.l.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            d dVar = d.this;
            AutoCompleteTextView autoCompleteTextViewU = dVar.u(dVar.a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && d.this.l.isTouchExplorationEnabled()) {
                d.this.C(autoCompleteTextViewU);
            }
        }
    }

    class c implements TextInputLayout.f {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView autoCompleteTextViewU = d.this.u(textInputLayout.getEditText());
            d.this.A(autoCompleteTextViewU);
            d.this.r(autoCompleteTextViewU);
            d.this.B(autoCompleteTextViewU);
            autoCompleteTextViewU.setThreshold(0);
            autoCompleteTextViewU.removeTextChangedListener(d.this.f2142d);
            autoCompleteTextViewU.addTextChangedListener(d.this.f2142d);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(d.this.e);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d, reason: collision with other inner class name */
    class ViewOnClickListenerC0076d implements View.OnClickListener {
        ViewOnClickListenerC0076d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.C((AutoCompleteTextView) d.this.a.getEditText());
        }
    }

    class e implements View.OnTouchListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AutoCompleteTextView f2147b;

        e(AutoCompleteTextView autoCompleteTextView) {
            this.f2147b = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.y()) {
                    d.this.g = false;
                }
                d.this.C(this.f2147b);
                view.performClick();
            }
            return false;
        }
    }

    class f implements View.OnFocusChangeListener {
        f() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            d.this.a.setEndIconActivated(z);
            if (z) {
                return;
            }
            d.this.z(false);
            d.this.g = false;
        }
    }

    class g implements AutoCompleteTextView.OnDismissListener {
        g() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            d.this.g = true;
            d.this.i = System.currentTimeMillis();
            d.this.z(false);
        }
    }

    class h extends AnimatorListenerAdapter {
        h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f2151c.setChecked(dVar.h);
            d.this.n.start();
        }
    }

    class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.f2151c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    static {
        o = Build.VERSION.SDK_INT >= 21;
    }

    d(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f2142d = new a();
        this.e = new b(this.a);
        this.f = new c();
        this.g = false;
        this.h = false;
        this.i = Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (o) {
            int boxBackgroundMode = this.a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.k;
            } else if (boxBackgroundMode != 1) {
                return;
            } else {
                drawable = this.j;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new e(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(new f());
        if (o) {
            autoCompleteTextView.setOnDismissListener(new g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (y()) {
            this.g = false;
        }
        if (this.g) {
            this.g = false;
            return;
        }
        if (o) {
            z(!this.h);
        } else {
            this.h = !this.h;
            this.f2151c.toggle();
        }
        if (!this.h) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        int boxBackgroundMode = this.a.getBoxBackgroundMode();
        d.b.a.b.z.g boxBackground = this.a.getBoxBackground();
        int iC = d.b.a.b.q.a.c(autoCompleteTextView, d.b.a.b.b.colorControlHighlight);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            t(autoCompleteTextView, iC, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            s(autoCompleteTextView, iC, iArr, boxBackground);
        }
    }

    private void s(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, d.b.a.b.z.g gVar) {
        int boxBackgroundColor = this.a.getBoxBackgroundColor();
        int[] iArr2 = {d.b.a.b.q.a.f(i2, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (o) {
            r.f0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        d.b.a.b.z.g gVar2 = new d.b.a.b.z.g(gVar.B());
        gVar2.T(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int iA = r.A(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int iZ = r.z(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        r.f0(autoCompleteTextView, layerDrawable);
        r.o0(autoCompleteTextView, iA, paddingTop, iZ, paddingBottom);
    }

    private void t(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, d.b.a.b.z.g gVar) {
        LayerDrawable layerDrawable;
        int iC = d.b.a.b.q.a.c(autoCompleteTextView, d.b.a.b.b.colorSurface);
        d.b.a.b.z.g gVar2 = new d.b.a.b.z.g(gVar.B());
        int iF = d.b.a.b.q.a.f(i2, iC, 0.1f);
        gVar2.T(new ColorStateList(iArr, new int[]{iF, 0}));
        if (o) {
            gVar2.setTint(iC);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iF, iC});
            d.b.a.b.z.g gVar3 = new d.b.a.b.z.g(gVar.B());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        r.f0(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AutoCompleteTextView u(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator v(int i2, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(d.b.a.b.l.a.a);
        valueAnimatorOfFloat.setDuration(i2);
        valueAnimatorOfFloat.addUpdateListener(new i());
        return valueAnimatorOfFloat;
    }

    private d.b.a.b.z.g w(float f2, float f3, float f4, int i2) {
        k.b bVarA = k.a();
        bVarA.z(f2);
        bVarA.D(f2);
        bVarA.r(f3);
        bVarA.v(f3);
        k kVarM = bVarA.m();
        d.b.a.b.z.g gVarL = d.b.a.b.z.g.l(this.f2150b, f4);
        gVarL.setShapeAppearanceModel(kVarM);
        gVarL.V(0, i2, 0, i2);
        return gVarL;
    }

    private void x() {
        this.n = v(67, 0.0f, 1.0f);
        ValueAnimator valueAnimatorV = v(50, 1.0f, 0.0f);
        this.m = valueAnimatorV;
        valueAnimatorV.addListener(new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.i;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(boolean z) {
        if (this.h != z) {
            this.h = z;
            this.n.cancel();
            this.m.start();
        }
    }

    @Override // com.google.android.material.textfield.e
    void a() throws Resources.NotFoundException {
        float dimensionPixelOffset = this.f2150b.getResources().getDimensionPixelOffset(d.b.a.b.d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f2150b.getResources().getDimensionPixelOffset(d.b.a.b.d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f2150b.getResources().getDimensionPixelOffset(d.b.a.b.d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        d.b.a.b.z.g gVarW = w(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        d.b.a.b.z.g gVarW2 = w(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.k = gVarW;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.j = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, gVarW);
        this.j.addState(new int[0], gVarW2);
        this.a.setEndIconDrawable(b.a.k.a.a.d(this.f2150b, o ? d.b.a.b.e.mtrl_dropdown_arrow : d.b.a.b.e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(d.b.a.b.i.exposed_dropdown_menu_content_description));
        this.a.setEndIconOnClickListener(new ViewOnClickListenerC0076d());
        this.a.c(this.f);
        x();
        r.l0(this.f2151c, 2);
        this.l = (AccessibilityManager) this.f2150b.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.e
    boolean b(int i2) {
        return i2 != 0;
    }

    @Override // com.google.android.material.textfield.e
    boolean c() {
        return true;
    }
}

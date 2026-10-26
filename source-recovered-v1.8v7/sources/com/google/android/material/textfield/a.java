package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import d.b.a.b.i;

/* loaded from: classes.dex */
class a extends com.google.android.material.textfield.e {

    /* renamed from: d, reason: collision with root package name */
    private final TextWatcher f2139d;
    private final TextInputLayout.f e;
    private AnimatorSet f;
    private ValueAnimator g;

    /* renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    class C0074a implements TextWatcher {
        C0074a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!a.j(editable)) {
                a.this.f.cancel();
                a.this.g.start();
            } else {
                if (a.this.a.E()) {
                    return;
                }
                a.this.g.cancel();
                a.this.f.start();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.j(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.removeTextChangedListener(a.this.f2139d);
            editText.addTextChangedListener(a.this.f2139d);
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.a.getEditText().setText((CharSequence) null);
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.a.setEndIconVisible(true);
        }
    }

    class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.a.setEndIconVisible(false);
        }
    }

    class f implements ValueAnimator.AnimatorUpdateListener {
        f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f2151c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {
        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f2151c.setScaleX(fFloatValue);
            a.this.f2151c.setScaleY(fFloatValue);
        }
    }

    a(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f2139d = new C0074a();
        this.e = new b();
    }

    private ValueAnimator h(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(d.b.a.b.l.a.a);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new f());
        return valueAnimatorOfFloat;
    }

    private ValueAnimator i() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(d.b.a.b.l.a.f2960d);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new g());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(Editable editable) {
        return editable.length() > 0;
    }

    private void k() {
        ValueAnimator valueAnimatorI = i();
        ValueAnimator valueAnimatorH = h(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f = animatorSet;
        animatorSet.playTogether(valueAnimatorI, valueAnimatorH);
        this.f.addListener(new d());
        ValueAnimator valueAnimatorH2 = h(1.0f, 0.0f);
        this.g = valueAnimatorH2;
        valueAnimatorH2.addListener(new e());
    }

    @Override // com.google.android.material.textfield.e
    void a() {
        this.a.setEndIconDrawable(b.a.k.a.a.d(this.f2150b, d.b.a.b.e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(i.clear_text_end_icon_content_description));
        this.a.setEndIconOnClickListener(new c());
        this.a.c(this.e);
        k();
    }
}

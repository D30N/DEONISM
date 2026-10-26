package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
abstract class e {
    TextInputLayout a;

    /* renamed from: b, reason: collision with root package name */
    Context f2150b;

    /* renamed from: c, reason: collision with root package name */
    CheckableImageButton f2151c;

    e(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
        this.f2150b = textInputLayout.getContext();
        this.f2151c = textInputLayout.getEndIconView();
    }

    abstract void a();

    boolean b(int i) {
        return true;
    }

    boolean c() {
        return false;
    }
}

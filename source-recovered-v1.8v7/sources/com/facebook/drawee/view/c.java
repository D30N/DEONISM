package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.facebook.drawee.i.b;
import com.facebook.drawee.view.a;
import d.a.b.d.h;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class c<DH extends com.facebook.drawee.i.b> extends ImageView {
    private static boolean g = false;

    /* renamed from: b, reason: collision with root package name */
    private final a.C0053a f1228b;

    /* renamed from: c, reason: collision with root package name */
    private float f1229c;

    /* renamed from: d, reason: collision with root package name */
    private b<DH> f1230d;
    private boolean e;
    private boolean f;

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1228b = new a.C0053a();
        this.f1229c = 0.0f;
        this.e = false;
        this.f = false;
        c(context);
    }

    private void c(Context context) {
        boolean zD;
        try {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("DraweeView#init");
            }
            if (this.e) {
                if (zD) {
                    return;
                } else {
                    return;
                }
            }
            boolean z = true;
            this.e = true;
            this.f1230d = b.e(null, context);
            if (Build.VERSION.SDK_INT >= 21) {
                ColorStateList imageTintList = getImageTintList();
                if (imageTintList == null) {
                    if (d.a.e.m.b.d()) {
                        d.a.e.m.b.b();
                        return;
                    }
                    return;
                }
                setColorFilter(imageTintList.getDefaultColor());
            }
            if (!g || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.f = z;
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        } finally {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        }
    }

    private void d() {
        Drawable drawable;
        if (!this.f || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        g = z;
    }

    protected void a() {
        this.f1230d.k();
    }

    protected void b() {
        this.f1230d.l();
    }

    protected void e() {
        a();
    }

    protected void f() {
        b();
    }

    public float getAspectRatio() {
        return this.f1229c;
    }

    @Nullable
    public com.facebook.drawee.i.a getController() {
        return this.f1230d.g();
    }

    public DH getHierarchy() {
        return (DH) this.f1230d.h();
    }

    @Nullable
    public Drawable getTopLevelDrawable() {
        return this.f1230d.i();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        f();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        a.C0053a c0053a = this.f1228b;
        c0053a.a = i;
        c0053a.f1224b = i2;
        a.b(c0053a, this.f1229c, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        a.C0053a c0053a2 = this.f1228b;
        super.onMeasure(c0053a2.a, c0053a2.f1224b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        d();
        f();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1230d.m(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        d();
    }

    public void setAspectRatio(float f) {
        if (f == this.f1229c) {
            return;
        }
        this.f1229c = f;
        requestLayout();
    }

    public void setController(@Nullable com.facebook.drawee.i.a aVar) {
        this.f1230d.o(aVar);
        super.setImageDrawable(this.f1230d.i());
    }

    public void setHierarchy(DH dh) {
        this.f1230d.p(dh);
        super.setImageDrawable(this.f1230d.i());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        c(getContext());
        this.f1230d.o(null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        c(getContext());
        this.f1230d.o(null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i) {
        c(getContext());
        this.f1230d.o(null);
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        c(getContext());
        this.f1230d.o(null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.f = z;
    }

    @Override // android.view.View
    public String toString() {
        h.b bVarD = h.d(this);
        b<DH> bVar = this.f1230d;
        bVarD.b("holder", bVar != null ? bVar.toString() : "<no holder set>");
        return bVarD.toString();
    }
}

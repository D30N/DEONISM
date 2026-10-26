package com.facebook.drawee.f;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class d {
    private int a = -1;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1191b = false;

    /* renamed from: c, reason: collision with root package name */
    private ColorFilter f1192c = null;

    /* renamed from: d, reason: collision with root package name */
    private int f1193d = -1;
    private int e = -1;

    @SuppressLint({"Range"})
    public void a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i = this.a;
        if (i != -1) {
            drawable.setAlpha(i);
        }
        if (this.f1191b) {
            drawable.setColorFilter(this.f1192c);
        }
        int i2 = this.f1193d;
        if (i2 != -1) {
            drawable.setDither(i2 != 0);
        }
        int i3 = this.e;
        if (i3 != -1) {
            drawable.setFilterBitmap(i3 != 0);
        }
    }

    public void b(int i) {
        this.a = i;
    }

    public void c(ColorFilter colorFilter) {
        this.f1192c = colorFilter;
        this.f1191b = true;
    }

    public void d(boolean z) {
        this.f1193d = z ? 1 : 0;
    }

    public void e(boolean z) {
        this.e = z ? 1 : 0;
    }
}

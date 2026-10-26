package com.facebook.drawee.i;

import android.graphics.drawable.Drawable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public interface c extends b {
    void a(float f, boolean z);

    void b(Drawable drawable);

    void d(Drawable drawable, float f, boolean z);

    void e(Throwable th);

    void f(Throwable th);

    void g();
}

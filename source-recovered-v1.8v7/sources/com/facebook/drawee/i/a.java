package com.facebook.drawee.i;

import android.view.MotionEvent;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public interface a {
    void b();

    @Nullable
    b c();

    void e();

    void f(@Nullable b bVar);

    boolean onTouchEvent(MotionEvent motionEvent);
}

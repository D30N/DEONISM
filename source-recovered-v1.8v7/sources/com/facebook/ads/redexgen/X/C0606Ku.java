package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.facebook.ads.internal.shield.NoAutoExceptionHandling;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@NoAutoExceptionHandling
@SuppressLint({"EmptyCatchBlock", "CatchGeneralException", "WrongCall"})
/* renamed from: com.facebook.ads.redexgen.X.Ku, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0606Ku extends LinearLayout {
    public static final AtomicBoolean A00 = new AtomicBoolean();
    public static final AtomicReference<InterfaceC0599Km> A01 = new AtomicReference<>();

    private final void A00() {
        super.onAttachedToWindow();
    }

    private final void A01() {
        super.onDetachedFromWindow();
    }

    private final void A02() {
        super.onFinishInflate();
    }

    private final void A03(int i) {
        super.onWindowVisibilityChanged(i);
    }

    private final void A04(int i, int i2) {
        super.onMeasure(i, i2);
    }

    private final void A05(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    private final void A06(Canvas canvas) {
        super.onDraw(canvas);
    }

    private void A07(Throwable th) {
        L3.A00().A7u(3305, th);
        InterfaceC0599Km interfaceC0599Km = A01.get();
        if (interfaceC0599Km != null) {
            interfaceC0599Km.ACX(th, this);
        }
    }

    private final void A08(boolean z) {
        super.onWindowFocusChanged(z);
    }

    private final void A09(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    private final void A0A(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
    }

    public static void A0B(boolean z, InterfaceC0599Km interfaceC0599Km) {
        A00.set(z);
        A01.set(interfaceC0599Km);
    }

    private final boolean A0C() {
        return super.performClick();
    }

    private final boolean A0D(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    private final boolean A0E(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    private final boolean A0F(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    private final boolean A0G(MotionEvent motionEvent) {
        return super.onTrackballEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws Throwable {
        C0606Ku c0606Ku = this;
        Throwable th = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0606Ku = c0606Ku;
                        c0606Ku.A00();
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        if (!A00.get()) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 4;
                            break;
                        }
                    }
                case 4:
                    C0606Ku c0606Ku2 = c0606Ku;
                    c0606Ku2.A07(th);
                    super.onAttachedToWindow();
                    return;
                case 6:
                    throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() throws Throwable {
        C0606Ku c0606Ku = this;
        Throwable th = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0606Ku = c0606Ku;
                        c0606Ku.A01();
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        if (!A00.get()) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 4;
                            break;
                        }
                    }
                case 4:
                    C0606Ku c0606Ku2 = c0606Ku;
                    c0606Ku2.A07(th);
                    super.onDetachedFromWindow();
                    return;
                case 6:
                    throw th;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) throws Throwable {
        C0606Ku c0606Ku = this;
        Throwable th = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0606Ku = c0606Ku;
                        canvas = canvas;
                        c0606Ku.A06(canvas);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        if (!A00.get()) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 4;
                            break;
                        }
                    }
                case 4:
                    C0606Ku c0606Ku2 = c0606Ku;
                    c0606Ku2.A07(th);
                    super.onDraw(canvas);
                    return;
                case 6:
                    throw th;
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() throws Throwable {
        C0606Ku c0606Ku = this;
        Throwable th = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0606Ku = c0606Ku;
                        c0606Ku.A02();
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        if (!A00.get()) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 4;
                            break;
                        }
                    }
                case 4:
                    C0606Ku c0606Ku2 = c0606Ku;
                    c0606Ku2.A07(th);
                    super.onFinishInflate();
                    return;
                case 6:
                    throw th;
            }
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) throws Throwable {
        C0606Ku c0606Ku = this;
        Throwable th = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0606Ku = c0606Ku;
                        rect = rect;
                        c0606Ku.A0A(z, i, rect);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        if (!A00.get()) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 4;
                            break;
                        }
                    }
                case 4:
                    C0606Ku c0606Ku2 = c0606Ku;
                    c0606Ku2.A07(th);
                    super.onFocusChanged(z, i, rect);
                    return;
                case 6:
                    throw th;
            }
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) throws Throwable {
        C0606Ku c0606Ku = this;
        Throwable th = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0606Ku = c0606Ku;
                        keyEvent = keyEvent;
                        return c0606Ku.A0D(i, keyEvent);
                    } catch (Throwable th2) {
                        th = th2;
                        if (!A00.get()) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 5;
                            break;
                        }
                    }
                case 5:
                    C0606Ku c0606Ku2 = c0606Ku;
                    c0606Ku2.A07(th);
                    return super.onKeyDown(i, keyEvent);
                case 6:
                    throw th;
            }
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) throws Throwable {
        C0606Ku c0606Ku = this;
        Throwable th = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0606Ku = c0606Ku;
                        keyEvent = keyEvent;
                        return c0606Ku.A0E(i, keyEvent);
                    } catch (Throwable th2) {
                        th = th2;
                        if (!A00.get()) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 5;
                            break;
                        }
                    }
                case 5:
                    C0606Ku c0606Ku2 = c0606Ku;
                    c0606Ku2.A07(th);
                    return super.onKeyUp(i, keyEvent);
                case 6:
                    throw th;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Throwable {
        C0606Ku c0606Ku = this;
        Throwable th = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0606Ku = c0606Ku;
                        c0606Ku.A09(z, i, i2, i3, i4);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        if (!A00.get()) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 4;
                            break;
                        }
                    }
                case 4:
                    C0606Ku c0606Ku2 = c0606Ku;
                    c0606Ku2.A07(th);
                    super.onLayout(z, i, i2, i3, i4);
                    return;
                case 6:
                    throw th;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Throwable {
        C0606Ku c0606Ku = this;
        Throwable th = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0606Ku = c0606Ku;
                        c0606Ku.A04(i, i2);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        if (!A00.get()) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 4;
                            break;
                        }
                    }
                case 4:
                    C0606Ku c0606Ku2 = c0606Ku;
                    c0606Ku2.A07(th);
                    super.onMeasure(i, i2);
                    return;
                case 6:
                    throw th;
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) throws Throwable {
        C0606Ku c0606Ku = this;
        Throwable th = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0606Ku = c0606Ku;
                        c0606Ku.A05(i, i2, i3, i4);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        if (!A00.get()) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 4;
                            break;
                        }
                    }
                case 4:
                    C0606Ku c0606Ku2 = c0606Ku;
                    c0606Ku2.A07(th);
                    super.onSizeChanged(i, i2, i3, i4);
                    return;
                case 6:
                    throw th;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) throws Throwable {
        C0606Ku c0606Ku = this;
        Throwable th = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0606Ku = c0606Ku;
                        motionEvent = motionEvent;
                        return c0606Ku.A0F(motionEvent);
                    } catch (Throwable th2) {
                        th = th2;
                        if (!A00.get()) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 5;
                            break;
                        }
                    }
                case 5:
                    C0606Ku c0606Ku2 = c0606Ku;
                    c0606Ku2.A07(th);
                    return super.onTouchEvent(motionEvent);
                case 6:
                    throw th;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) throws Throwable {
        C0606Ku c0606Ku = this;
        Throwable th = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0606Ku = c0606Ku;
                        motionEvent = motionEvent;
                        return c0606Ku.A0G(motionEvent);
                    } catch (Throwable th2) {
                        th = th2;
                        if (!A00.get()) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 5;
                            break;
                        }
                    }
                case 5:
                    C0606Ku c0606Ku2 = c0606Ku;
                    c0606Ku2.A07(th);
                    return super.onTrackballEvent(motionEvent);
                case 6:
                    throw th;
            }
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) throws Throwable {
        C0606Ku c0606Ku = this;
        Throwable th = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0606Ku = c0606Ku;
                        c0606Ku.A08(z);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        if (!A00.get()) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 4;
                            break;
                        }
                    }
                case 4:
                    C0606Ku c0606Ku2 = c0606Ku;
                    c0606Ku2.A07(th);
                    super.onWindowFocusChanged(z);
                    return;
                case 6:
                    throw th;
            }
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) throws Throwable {
        C0606Ku c0606Ku = this;
        Throwable th = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0606Ku = c0606Ku;
                        c0606Ku.A03(i);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        if (!A00.get()) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 4;
                            break;
                        }
                    }
                case 4:
                    C0606Ku c0606Ku2 = c0606Ku;
                    c0606Ku2.A07(th);
                    super.onWindowVisibilityChanged(i);
                    return;
                case 6:
                    throw th;
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() throws Throwable {
        C0606Ku c0606Ku = this;
        Throwable th = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0606Ku = c0606Ku;
                        return c0606Ku.A0C();
                    } catch (Throwable th2) {
                        th = th2;
                        if (!A00.get()) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 5;
                            break;
                        }
                    }
                case 5:
                    C0606Ku c0606Ku2 = c0606Ku;
                    c0606Ku2.A07(th);
                    return super.performClick();
                case 6:
                    throw th;
            }
        }
    }
}

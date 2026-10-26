package com.facebook.drawee.h;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class a {

    @Nullable
    InterfaceC0052a a;

    /* renamed from: b, reason: collision with root package name */
    final float f1221b;

    /* renamed from: c, reason: collision with root package name */
    boolean f1222c;

    /* renamed from: d, reason: collision with root package name */
    boolean f1223d;
    long e;
    float f;
    float g;

    /* renamed from: com.facebook.drawee.h.a$a, reason: collision with other inner class name */
    public interface InterfaceC0052a {
        boolean d();
    }

    public a(Context context) {
        this.f1221b = ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }

    public static a c(Context context) {
        return new a(context);
    }

    public void a() {
        this.a = null;
        e();
    }

    public boolean b() {
        return this.f1222c;
    }

    public boolean d(MotionEvent motionEvent) {
        InterfaceC0052a interfaceC0052a;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.f1222c = false;
                if (Math.abs(motionEvent.getX() - this.f) > this.f1221b || Math.abs(motionEvent.getY() - this.g) > this.f1221b) {
                    this.f1223d = false;
                }
                if (this.f1223d && motionEvent.getEventTime() - this.e <= ViewConfiguration.getLongPressTimeout() && (interfaceC0052a = this.a) != null) {
                    interfaceC0052a.d();
                }
            } else if (action != 2) {
                if (action == 3) {
                    this.f1222c = false;
                }
            } else if (Math.abs(motionEvent.getX() - this.f) > this.f1221b || Math.abs(motionEvent.getY() - this.g) > this.f1221b) {
            }
            this.f1223d = false;
        } else {
            this.f1222c = true;
            this.f1223d = true;
            this.e = motionEvent.getEventTime();
            this.f = motionEvent.getX();
            this.g = motionEvent.getY();
        }
        return true;
    }

    public void e() {
        this.f1222c = false;
        this.f1223d = false;
    }

    public void f(InterfaceC0052a interfaceC0052a) {
        this.a = interfaceC0052a;
    }
}

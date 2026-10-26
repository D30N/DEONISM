package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
class q extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f277b;
    private boolean a;

    static {
        f277b = Build.VERSION.SDK_INT < 21;
    }

    public q(Context context, AttributeSet attributeSet, int i, int i2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        w0 w0VarU = w0.u(context, attributeSet, b.a.j.PopupWindow, i, i2);
        if (w0VarU.r(b.a.j.PopupWindow_overlapAnchor)) {
            b(w0VarU.a(b.a.j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(w0VarU.g(b.a.j.PopupWindow_android_popupBackground));
        w0VarU.v();
    }

    private void b(boolean z) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (f277b) {
            this.a = z;
        } else {
            androidx.core.widget.h.a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f277b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f277b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f277b && this.a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}

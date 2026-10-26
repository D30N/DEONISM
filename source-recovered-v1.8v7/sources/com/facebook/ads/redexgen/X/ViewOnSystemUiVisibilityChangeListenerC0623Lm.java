package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: com.facebook.ads.redexgen.X.Lm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class ViewOnSystemUiVisibilityChangeListenerC0623Lm implements View.OnSystemUiVisibilityChangeListener {
    public int A00;

    @Nullable
    public Window A01;
    public final View A03;
    public EnumC0622Ll A02 = EnumC0622Ll.A02;
    public final Runnable A04 = new C1162cn(this);

    public ViewOnSystemUiVisibilityChangeListenerC0623Lm(View view) {
        this.A03 = view;
        this.A03.setOnSystemUiVisibilityChangeListener(this);
    }

    private void A00(int i, boolean z) {
        WindowManager.LayoutParams attributes = null;
        Window window = this.A01;
        char c2 = window == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    window = window;
                    attributes = window.getAttributes();
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    attributes = attributes;
                    attributes.flags |= i;
                    c2 = 5;
                    break;
                case 5:
                    this.A01.setAttributes(attributes);
                    return;
                case 6:
                    attributes = attributes;
                    attributes.flags &= i ^ (-1);
                    c2 = 5;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(boolean z) {
        ViewOnSystemUiVisibilityChangeListenerC0623Lm viewOnSystemUiVisibilityChangeListenerC0623Lm = this;
        Handler handler = null;
        int i = 0;
        char c2 = EnumC0622Ll.A02.equals(viewOnSystemUiVisibilityChangeListenerC0623Lm.A02) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    i = 3840;
                    if (!z) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    i |= 7;
                    c2 = 5;
                    break;
                case 5:
                    viewOnSystemUiVisibilityChangeListenerC0623Lm = viewOnSystemUiVisibilityChangeListenerC0623Lm;
                    handler = viewOnSystemUiVisibilityChangeListenerC0623Lm.A03.getHandler();
                    if (handler == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (!z) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    viewOnSystemUiVisibilityChangeListenerC0623Lm = viewOnSystemUiVisibilityChangeListenerC0623Lm;
                    handler = handler;
                    handler.removeCallbacks(viewOnSystemUiVisibilityChangeListenerC0623Lm.A04);
                    handler.postDelayed(viewOnSystemUiVisibilityChangeListenerC0623Lm.A04, 2000L);
                    c2 = '\b';
                    break;
                case '\b':
                    viewOnSystemUiVisibilityChangeListenerC0623Lm.A03.setSystemUiVisibility(i);
                    return;
            }
        }
    }

    public final void A03() {
        this.A01 = null;
    }

    public final void A04(Window window) {
        this.A01 = window;
    }

    public final void A05(EnumC0622Ll enumC0622Ll) {
        ViewOnSystemUiVisibilityChangeListenerC0623Lm viewOnSystemUiVisibilityChangeListenerC0623Lm = this;
        viewOnSystemUiVisibilityChangeListenerC0623Lm.A02 = enumC0622Ll;
        char c2 = C0621Lk.A00[viewOnSystemUiVisibilityChangeListenerC0623Lm.A02.ordinal()] != 1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    viewOnSystemUiVisibilityChangeListenerC0623Lm = viewOnSystemUiVisibilityChangeListenerC0623Lm;
                    viewOnSystemUiVisibilityChangeListenerC0623Lm.A00(67108864, false);
                    viewOnSystemUiVisibilityChangeListenerC0623Lm.A00(134217728, false);
                    viewOnSystemUiVisibilityChangeListenerC0623Lm.A03.setSystemUiVisibility(0);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    viewOnSystemUiVisibilityChangeListenerC0623Lm = viewOnSystemUiVisibilityChangeListenerC0623Lm;
                    viewOnSystemUiVisibilityChangeListenerC0623Lm.A00(67108864, true);
                    viewOnSystemUiVisibilityChangeListenerC0623Lm.A00(134217728, true);
                    viewOnSystemUiVisibilityChangeListenerC0623Lm.A02(false);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        ViewOnSystemUiVisibilityChangeListenerC0623Lm viewOnSystemUiVisibilityChangeListenerC0623Lm = this;
        int i2 = viewOnSystemUiVisibilityChangeListenerC0623Lm.A00 ^ i;
        viewOnSystemUiVisibilityChangeListenerC0623Lm.A00 = i;
        char c2 = (i2 & 2) != 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if ((i & 2) != 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    viewOnSystemUiVisibilityChangeListenerC0623Lm = viewOnSystemUiVisibilityChangeListenerC0623Lm;
                    viewOnSystemUiVisibilityChangeListenerC0623Lm.A02(true);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }
}

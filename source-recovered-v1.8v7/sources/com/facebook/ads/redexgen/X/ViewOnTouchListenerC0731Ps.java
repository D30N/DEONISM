package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ps, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0731Ps implements View.OnTouchListener {
    public final /* synthetic */ HN A00;

    public ViewOnTouchListenerC0731Ps(HN hn) {
        this.A00 = hn;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewOnTouchListenerC0731Ps viewOnTouchListenerC0731Ps = this;
        char c2 = viewOnTouchListenerC0731Ps.A00.A09 != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    motionEvent = motionEvent;
                    if (motionEvent.getAction() != 1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    viewOnTouchListenerC0731Ps = viewOnTouchListenerC0731Ps;
                    if (!viewOnTouchListenerC0731Ps.A00.A09.isShowing()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    viewOnTouchListenerC0731Ps = viewOnTouchListenerC0731Ps;
                    viewOnTouchListenerC0731Ps.A00.A09.hide();
                    c2 = 5;
                    break;
                case 5:
                    return true;
                case 6:
                    viewOnTouchListenerC0731Ps = viewOnTouchListenerC0731Ps;
                    viewOnTouchListenerC0731Ps.A00.A09.show();
                    c2 = 5;
                    break;
            }
        }
    }
}

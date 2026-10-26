package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0734Pv implements View.OnTouchListener {
    public final /* synthetic */ HK A00;

    public ViewOnTouchListenerC0734Pv(HK hk) {
        this.A00 = hk;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewOnTouchListenerC0734Pv viewOnTouchListenerC0734Pv = this;
        char c2 = viewOnTouchListenerC0734Pv.A00.A0H ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return true;
                case 3:
                    viewOnTouchListenerC0734Pv = viewOnTouchListenerC0734Pv;
                    if (viewOnTouchListenerC0734Pv.A00.A0A == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    motionEvent = motionEvent;
                    if (motionEvent.getAction() != 1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    viewOnTouchListenerC0734Pv = viewOnTouchListenerC0734Pv;
                    if (!viewOnTouchListenerC0734Pv.A00.A0A.isShowing()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    viewOnTouchListenerC0734Pv = viewOnTouchListenerC0734Pv;
                    viewOnTouchListenerC0734Pv.A00.A0A.hide();
                    c2 = 7;
                    break;
                case 7:
                    return true;
                case '\b':
                    viewOnTouchListenerC0734Pv = viewOnTouchListenerC0734Pv;
                    viewOnTouchListenerC0734Pv.A00.A0A.show();
                    c2 = 7;
                    break;
            }
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OG implements View.OnTouchListener {
    public final /* synthetic */ YY A00;

    public OG(YY yy) {
        this.A00 = yy;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        OG og = this;
        int actionMasked = motionEvent.getActionMasked();
        char c2 = actionMasked != 0 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (actionMasked == 1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return true;
                case 4:
                    og = og;
                    motionEvent = motionEvent;
                    if (og.A00.A00 >= motionEvent.getY()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    og = og;
                    og.A00.A0R(false);
                    c2 = 3;
                    break;
                case 6:
                    og = og;
                    motionEvent = motionEvent;
                    og.A00.A00 = motionEvent.getY();
                    c2 = 3;
                    break;
            }
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NP implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = false;
        char c2 = action != 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (action == 1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return z;
                case 4:
                    view = view;
                    z = false;
                    C0635Ly.A0P(view, 0);
                    c2 = 3;
                    break;
                case 5:
                    view = view;
                    C0635Ly.A0P(view, NT.A07);
                    c2 = 3;
                    break;
            }
        }
    }
}

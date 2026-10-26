package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Jl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0573Jl implements View.OnTouchListener {
    public final /* synthetic */ C1131cH A00;

    public ViewOnTouchListenerC0573Jl(C1131cH c1131cH) {
        this.A00 = c1131cH;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewOnTouchListenerC0573Jl viewOnTouchListenerC0573Jl = this;
        char c2 = viewOnTouchListenerC0573Jl.A00.A04 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    motionEvent = motionEvent;
                    if (motionEvent.getAction() != 1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    viewOnTouchListenerC0573Jl = viewOnTouchListenerC0573Jl;
                    viewOnTouchListenerC0573Jl.A00.A04.A0k();
                    c2 = 4;
                    break;
                case 4:
                    return true;
            }
        }
    }
}

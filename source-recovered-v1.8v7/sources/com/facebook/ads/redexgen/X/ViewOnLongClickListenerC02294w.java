package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnLongClickListenerC02294w implements View.OnLongClickListener {
    public final /* synthetic */ C02304x A00;

    public ViewOnLongClickListenerC02294w(C02304x c02304x) {
        this.A00 = c02304x;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ViewOnLongClickListenerC02294w viewOnLongClickListenerC02294w = this;
        char c2 = viewOnLongClickListenerC02294w.A00.A0B != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    viewOnLongClickListenerC02294w = viewOnLongClickListenerC02294w;
                    if (viewOnLongClickListenerC02294w.A00.A06 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    viewOnLongClickListenerC02294w = viewOnLongClickListenerC02294w;
                    viewOnLongClickListenerC02294w.A00.A0B.setBounds(0, 0, viewOnLongClickListenerC02294w.A00.A06.getWidth(), viewOnLongClickListenerC02294w.A00.A06.getHeight());
                    viewOnLongClickListenerC02294w.A00.A0B.A0D(!viewOnLongClickListenerC02294w.A00.A0B.A0E());
                    c2 = 4;
                    break;
                case 4:
                    return true;
            }
        }
    }
}

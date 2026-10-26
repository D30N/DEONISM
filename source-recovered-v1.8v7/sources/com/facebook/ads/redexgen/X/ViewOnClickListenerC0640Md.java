package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Md, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0640Md implements View.OnClickListener {
    public final /* synthetic */ MZ A00;
    public final /* synthetic */ C1029ab A01;

    public ViewOnClickListenerC0640Md(C1029ab c1029ab, MZ mz) {
        this.A01 = c1029ab;
        this.A00 = mz;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        ViewOnClickListenerC0640Md viewOnClickListenerC0640Md = this;
        ViewOnClickListenerC0640Md viewOnClickListenerC0640Md2 = null;
        char c2 = C0601Ko.A02(viewOnClickListenerC0640Md) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    viewOnClickListenerC0640Md = viewOnClickListenerC0640Md;
                    viewOnClickListenerC0640Md2 = viewOnClickListenerC0640Md;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        viewOnClickListenerC0640Md2 = viewOnClickListenerC0640Md2;
                        C0635Ly.A0M(viewOnClickListenerC0640Md2.A00);
                        C0635Ly.A0O(viewOnClickListenerC0640Md2.A01.A0N);
                        C0635Ly.A0O(viewOnClickListenerC0640Md2.A01.A04);
                        if (viewOnClickListenerC0640Md2.A01.A09 == null) {
                            return;
                        }
                        viewOnClickListenerC0640Md2.A01.A09.A0Y(PC.A03, 15);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, viewOnClickListenerC0640Md2);
                        return;
                    }
            }
        }
    }
}

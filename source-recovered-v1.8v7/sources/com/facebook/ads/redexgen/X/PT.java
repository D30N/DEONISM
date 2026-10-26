package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class PT implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass76 A00;

    public PT(AnonymousClass76 anonymousClass76) {
        this.A00 = anonymousClass76;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        PT pt = this;
        boolean z = false;
        PT pt2 = null;
        int i = 0;
        char c2 = C0601Ko.A02(pt) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    pt = pt;
                    pt2 = pt;
                    c2 = 4;
                    break;
                case 4:
                    pt2 = pt2;
                    View v = pt2.A00.getVideoView();
                    if (v != null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return;
                case '\b':
                    try {
                        pt2 = pt2;
                        if (pt2.A00.A02 != null) {
                            pt2.A00.A02.A02(EnumC0564Jc.A0k, null);
                        }
                        pt2.A00.A01.A0A().A2w();
                        i = PU.A00[pt2.A00.getVideoView().getState().ordinal()];
                        z = true;
                        if (i == 1) {
                            c2 = 26;
                            break;
                        } else {
                            c2 = 30;
                            break;
                        }
                    } catch (Throwable th) {
                        C0601Ko.A00(th, pt2);
                        return;
                    }
                case 26:
                    pt2.A00.getVideoView().A0Y(PC.A05, 12);
                    return;
                case 30:
                    if (i == 2) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 31;
                        break;
                    }
                case 31:
                    if (i == 3) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = ' ';
                        break;
                    }
                case ' ':
                    if (i == 4) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = '!';
                        break;
                    }
                case '!':
                    if (i == 5) {
                        pt2.A00.getVideoView().A0b(z, 8);
                        return;
                    }
                    return;
            }
        }
    }
}

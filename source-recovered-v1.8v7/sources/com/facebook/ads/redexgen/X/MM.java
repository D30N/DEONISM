package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public class MM implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ C1170cv A00;

    public MM(C1170cv c1170cv) {
        this.A00 = c1170cv;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        MM mm = this;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        RelativeLayout.LayoutParams layoutParams = null;
        int i8 = 0;
        char c2 = mm.A00.getResources().getConfiguration().orientation == 1 ? (char) 2 : (char) 28;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    if (!z) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    mm = mm;
                    layoutParams = mm.A00.A09;
                    c2 = 5;
                    break;
                case 5:
                    if ((i & 2) != 0) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    mm = mm;
                    mm.A00.A02 = true;
                    if (!z) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    i7 = C1170cv.A0L;
                    c2 = '\b';
                    break;
                case '\b':
                    if (!z) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    i6 = C1170cv.A0L;
                    c2 = '\n';
                    break;
                case '\n':
                    if (!z) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    i5 = C1170cv.A0L * 3;
                    c2 = '\f';
                    break;
                case '\f':
                    layoutParams = layoutParams;
                    i8 = 0;
                    layoutParams.setMargins(i7, 0, i6, i5);
                    c2 = '\r';
                    break;
                case '\r':
                    mm.A00.setLayoutParams(layoutParams);
                    return;
                case 14:
                    i5 = 0;
                    c2 = '\f';
                    break;
                case 15:
                    i6 = 0;
                    c2 = '\n';
                    break;
                case 16:
                    i7 = 0;
                    c2 = '\b';
                    break;
                case 17:
                    mm = mm;
                    i8 = 0;
                    mm.A00.A02 = false;
                    if (!z) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    i4 = C1170cv.A0L;
                    c2 = 19;
                    break;
                case 19:
                    if (!z) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    i3 = C1170cv.A0L;
                    c2 = 21;
                    break;
                case 21:
                    if (!z) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    i2 = C1170cv.A0L;
                    c2 = 23;
                    break;
                case 23:
                    layoutParams = layoutParams;
                    layoutParams.setMargins(i4, i8, i3, i2);
                    c2 = '\r';
                    break;
                case 24:
                    i2 = 0;
                    c2 = 23;
                    break;
                case 25:
                    i3 = 0;
                    c2 = 21;
                    break;
                case 26:
                    i4 = 0;
                    c2 = 19;
                    break;
                case 27:
                    mm = mm;
                    layoutParams = mm.A00.A08;
                    c2 = 5;
                    break;
                case 28:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.AdChoicesView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaViewVideoRenderer;

/* renamed from: com.facebook.ads.redexgen.X.cO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1138cO implements InterfaceC0579Jr {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0579Jr
    public final boolean ADF(View view) {
        boolean z = false;
        char c2 = !(view instanceof MediaViewVideoRenderer) ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    view = view;
                    if (!(view instanceof AdChoicesView)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 3:
                    view = view;
                    if (!(view instanceof AdOptionsView)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 4:
                    view = view;
                    if (!(view instanceof C1V)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    view = view;
                    if (!(view instanceof C0703Op)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    z = true;
                    c2 = 7;
                    break;
                case 7:
                    return z;
                case '\b':
                    z = false;
                    c2 = 7;
                    break;
            }
        }
    }
}

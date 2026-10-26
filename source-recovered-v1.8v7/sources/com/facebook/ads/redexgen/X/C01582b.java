package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;

/* renamed from: com.facebook.ads.redexgen.X.2b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01582b {
    public static boolean A00(MotionEvent motionEvent, int i) {
        boolean z = false;
        char c2 = (motionEvent.getSource() & i) == i ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }
}

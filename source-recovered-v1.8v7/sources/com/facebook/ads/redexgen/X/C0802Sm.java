package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Sm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0802Sm implements InterfaceC01622f {
    public final Rect A00 = new Rect();
    public final /* synthetic */ AnonymousClass39 A01;

    public C0802Sm(AnonymousClass39 anonymousClass39) {
        this.A01 = anonymousClass39;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01622f
    public final C3C A8t(View view, C3C c3c) {
        C0802Sm c0802Sm = this;
        Rect rect = null;
        int childCount = 0;
        int i = 0;
        C3C c3cA06 = C2v.A06(view, c3c);
        char c2 = c3cA06.A07() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return c3cA06;
                case 3:
                    c0802Sm = c0802Sm;
                    c3cA06 = c3cA06;
                    rect = c0802Sm.A00;
                    rect.left = c3cA06.A03();
                    rect.top = c3cA06.A05();
                    rect.right = c3cA06.A04();
                    rect.bottom = c3cA06.A02();
                    i = 0;
                    childCount = c0802Sm.A01.getChildCount();
                    c2 = 4;
                    break;
                case 4:
                    if (i >= childCount) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0802Sm = c0802Sm;
                    c3cA06 = c3cA06;
                    rect = rect;
                    C3C c3cA05 = C2v.A05(c0802Sm.A01.getChildAt(i), c3cA06);
                    rect.left = Math.min(c3cA05.A03(), rect.left);
                    rect.top = Math.min(c3cA05.A05(), rect.top);
                    rect.right = Math.min(c3cA05.A04(), rect.right);
                    rect.bottom = Math.min(c3cA05.A02(), rect.bottom);
                    i++;
                    c2 = 4;
                    break;
                case 6:
                    Rect rect2 = rect;
                    return c3cA06.A06(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
    }
}

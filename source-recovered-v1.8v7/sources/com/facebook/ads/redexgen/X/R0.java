package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class R0 extends AnonymousClass44<C0763Qy> {
    public static final int A05 = (int) (C0635Ly.A01 * 250.0f);
    public int A00 = 0;
    public boolean A01 = false;
    public final int A02;
    public final XI A03;
    public final List<String> A04;

    public R0(XI xi, List<String> list, int i) {
        this.A04 = list;
        this.A02 = i;
        this.A03 = xi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass44
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C0763Qy A0C(ViewGroup viewGroup, int i) {
        return new C0763Qy(new C0764Qz(this.A03));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass44
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0E(C0763Qy c0763Qy, int startSpacing) {
        R0 r0 = this;
        int leftMargin = 0;
        int rightMargin = 0;
        int i = 0;
        String str = r0.A04.get(startSpacing);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        char c2 = r0.A00 == 2 ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    r0 = r0;
                    if (!r0.A01) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i = A05;
                    c2 = 4;
                    break;
                case 4:
                    if (startSpacing != 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    leftMargin = i;
                    c2 = 6;
                    break;
                case 6:
                    r0 = r0;
                    if (startSpacing < r0.A0D() - 1) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    r0 = r0;
                    rightMargin = r0.A02 * 4;
                    c2 = '\b';
                    break;
                case '\b':
                    C0763Qy c0763Qy2 = c0763Qy;
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                    marginLayoutParams2.setMargins(leftMargin, 0, rightMargin, 0);
                    c0763Qy2.A0l().setLayoutParams(marginLayoutParams2);
                    c0763Qy2.A0l().A00(str);
                    return;
                case '\t':
                    r0 = r0;
                    rightMargin = r0.A02;
                    c2 = '\b';
                    break;
                case '\n':
                    r0 = r0;
                    leftMargin = r0.A02;
                    c2 = 6;
                    break;
                case 11:
                    r0 = r0;
                    i = r0.A02 * 4;
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass44
    public final int A0D() {
        return this.A04.size();
    }

    public final void A0F(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}

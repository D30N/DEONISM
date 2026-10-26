package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1171cw extends ML {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;

    @Nullable
    public MK A00;
    public final XI A01;
    public final C0565Jd A02;
    public final MJ A03;
    public final C1172cx A04;
    public final MQ A05;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 19);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A06 = new byte[]{85, 66, 50, 70, 70, 70, 70, 70, 70, 80, 103, 113, 119, 111, 103, 34, 67, 102, 17, 41, 43, 50, 98, 3, 38, 69, 118, 97, 36, 125, 107, 113, 36, 119, 113, 118, 97, 36, 125, 107, 113, 36, 115, 101, 106, 112, 36, 112, 107, 36, 119, 111, 109, 116, 36, 112, 108, 97, 36, 101, 96, 59, 36, 93, 107, 113, 36, 115, 109, 104, 104, 36, 104, 107, 119, 97, 36, 125, 107, 113, 118, 36, 118, 97, 115, 101, 118, 96, 42, 15, 55, 53, 44, 124, 29, 56, 124, 61, 50, 56, 124, 16, 51, 47, 57, 124, 14, 57, 43, 61, 46, 56, 69, 106, 105, 117, 99, 38, 71, 98};
    }

    static {
        A03();
        A08 = (int) (C0635Ly.A01 * 16.0f);
        A07 = Color.parseColor(A02(0, 9, 101));
    }

    public C1171cw(XI xi, MQ mq, C0565Jd c0565Jd, int i, int i2) {
        super(xi);
        this.A01 = xi;
        this.A05 = mq;
        this.A02 = c0565Jd;
        setGravity(16);
        this.A04 = new C1172cx(xi, i);
        this.A04.setBackgroundColor(A07);
        this.A04.setContentDescription(A02(112, 8, 21));
        this.A04.setActionClickListener(new MN(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        View view = new View(xi);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        this.A03 = new MJ(xi, i2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        int i3 = A08;
        layoutParams3.setMargins(i3, 0, i3, 0);
        this.A03.setBackgroundColor(A07);
        if (JQ.A1L(xi)) {
            addView(this.A03, layoutParams3);
            addView(view, layoutParams2);
            addView(this.A04, layoutParams);
        } else {
            addView(this.A04, layoutParams);
            addView(view, layoutParams2);
            addView(this.A03, layoutParams3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public final void A04(C1I c1i, boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public final void A05(InterfaceC0647Mk interfaceC0647Mk) {
        Activity activityA09 = this.A01.A09();
        if (activityA09 != null) {
            DialogC1169cu dialogC1169cu = new DialogC1169cu(this.A01, activityA09);
            setUpSkipDialog(dialogC1169cu, interfaceC0647Mk);
            dialogC1169cu.show();
        }
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public final boolean A06() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public int getToolbarHeight() {
        return ML.A00;
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public void setAdReportingVisible(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public void setPageDetails(C1R c1r, String str, int i, C1Y c1y) {
        this.A04.setInitialUnskippableSeconds(i);
        this.A03.setAdDetails(c1r, str, this.A02, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public void setPageDetailsVisible(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public void setProgress(float f) {
        this.A04.setProgress(f);
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public void setToolbarActionMode(int i) {
        this.A04.setToolbarActionMode(i);
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public void setToolbarListener(MK mk) {
        this.A00 = mk;
    }

    private void setUpSkipDialog(DialogC1169cu dialogC1169cu, InterfaceC0647Mk interfaceC0647Mk) {
        dialogC1169cu.A08(A02(89, 23, 79));
        dialogC1169cu.A05(A02(25, 64, 23));
        dialogC1169cu.A06(A02(18, 7, 81));
        dialogC1169cu.A07(A02(9, 9, 17));
        dialogC1169cu.A03(new MO(this, interfaceC0647Mk, dialogC1169cu));
        dialogC1169cu.A04(new MP(this, interfaceC0647Mk, dialogC1169cu));
    }
}

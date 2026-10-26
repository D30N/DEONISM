package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0463Fb extends AbstractC0785Ru {
    public static byte[] A02;
    public final XI A00;
    public final C0582Ju A01;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 68);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A02 = new byte[]{126, 115, 119, 114, 122, Byte.MAX_VALUE, 120, 115, 70, 68, 73, 73, 122, 81, 74, 122, 68, 70, 81, 76, 74, 75, 120, 125, 122, Byte.MAX_VALUE, 75, 112, 113, 103, 119, 102, 125, 100, 96, 125, 123, 122};
    }

    public C0463Fb(XI xi, C1V c1v, List<C1141cR> list, @Nullable C0582Ju c0582Ju) {
        super(c1v, list, xi);
        this.A00 = xi;
        this.A01 = c0582Ju == null ? new C0582Ju() : c0582Ju;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass44
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C1111bw A0C(ViewGroup viewGroup, int i) {
        return new C1111bw(new MS(this.A00, this.A01));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0785Ru, com.facebook.ads.redexgen.X.AnonymousClass44
    /* renamed from: A0H */
    public final void A0E(C1111bw c1111bw, int i) {
        super.A0E(c1111bw, i);
        MS ms = (MS) c1111bw.A0l();
        A0F(ms.getImageCardView(), i);
        ms.setTitle(((AbstractC0785Ru) this).A01.get(i).A1A(A02(0, 8, 82)));
        ms.setSubtitle(((AbstractC0785Ru) this).A01.get(i).A1A(A02(22, 16, 80)));
        ms.setButtonText(((AbstractC0785Ru) this).A01.get(i).A1A(A02(8, 14, 97)));
        C1141cR c1141cR = ((AbstractC0785Ru) this).A01.get(i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ms);
        c1141cR.A1H(ms, ms, arrayList);
    }
}

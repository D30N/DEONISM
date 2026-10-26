package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Tt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0833Tt implements C5P {
    public static byte[] A02;
    public static final String A03;
    public final C5S A00;
    public final C7C A01;

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 37);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{-93, -100, -103, -100, -99, -91, -100, -43, -92, -41, -41, -89, -88, -91, -91, -98, -45, -87, -92, -93, -98, -94, -94, -42, -86, -98, -46, -93, -46, -92, -98, -93, -46, -93, -46, -42, -93, -43, -45, -44, -44, -42, -91, -116, -82, -95, -88, -85, -99, -96, -91, -86, -93, 92, -78, -91, -96, -95, -85, 118, 92, 97, -81, -117, -83, -96, -89, -86, -100, -97, -92, -87, -94, 91, 96, -97, 91, -100, -82, -82, -96, -81, -82, -101, -99, -112, -111, -112, -97, -114, -109, -72, -38, -51, -44, -41, -55, -52, -47, -42, -49, -120, -47, -43, -55, -49, -51, -94, -120, -115, -37, -33, 1, -12, -5, -2, -16, -13, -8, -3, -10, -81, -4, -16, 1, -6, 4, -1, -55, -81, -76, 2};
    }

    static {
        A02();
        A03 = C0833Tt.class.getSimpleName();
    }

    public C0833Tt(C5S c5s, XJ xj) {
        this.A00 = c5s;
        this.A00.A3F(new C0831Tr(this));
        this.A01 = new C7C(xj);
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        C0833Tt c0833Tt = this;
        C5V asset = null;
        int i = 0;
        String.format(Locale.US, A00(63, 20, 22), Integer.valueOf(c0833Tt.A00.A5O().size()));
        Iterator<C5V> it = c0833Tt.A00.A5O().iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    it = it;
                    asset = it.next();
                    i = C5R.A00[asset.A7E().ordinal()];
                    if (i == 1) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == 3) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 2;
                        break;
                    }
                case 6:
                    c0833Tt = c0833Tt;
                    asset = asset;
                    c0833Tt.A05(asset.getUrl());
                    c2 = 2;
                    break;
                case 7:
                    c0833Tt = c0833Tt;
                    asset = asset;
                    c0833Tt.A06(asset.getUrl());
                    c2 = 2;
                    break;
                case '\b':
                    c0833Tt = c0833Tt;
                    asset = asset;
                    c0833Tt.A04(asset.getUrl());
                    c2 = 2;
                    break;
                case '\t':
                    C0833Tt c0833Tt2 = c0833Tt;
                    c0833Tt2.A01.A0P(new C0832Ts(c0833Tt2), new AnonymousClass75(A00(7, 36, 76), A00(0, 7, 9)));
                    return;
            }
        }
    }

    private void A04(String str) {
        String.format(Locale.US, A00(91, 20, 67), str);
        AnonymousClass79 anonymousClass79 = new AnonymousClass79(str, -1, -1, A00(7, 36, 76), A00(0, 7, 9));
        anonymousClass79.A01 = A00(83, 8, 6);
        this.A01.A0Q(anonymousClass79);
    }

    private void A05(String str) {
        String.format(Locale.US, A00(111, 21, 106), str);
        C7B c7b = new C7B(str, A00(7, 36, 76), A00(0, 7, 9));
        c7b.A04 = true;
        c7b.A02 = A00(83, 8, 6);
        this.A01.A0S(c7b);
    }

    private void A06(String str) {
        String.format(Locale.US, A00(43, 20, 23), str);
        C7B c7b = new C7B(str, A00(7, 36, 76), A00(0, 7, 9));
        c7b.A04 = false;
        c7b.A02 = A00(83, 8, 6);
        this.A01.A0V(c7b);
    }
}

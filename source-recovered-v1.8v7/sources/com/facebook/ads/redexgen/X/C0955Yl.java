package com.facebook.ads.redexgen.X;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0955Yl implements CF {
    public static byte[] A06;
    public static final Constructor<? extends CC> A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 1;

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 17);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A06 = new byte[]{98, 110, 108, 47, 103, 96, 98, 100, 99, 110, 110, 106, 47, 96, 101, 114, 47, 104, 111, 117, 100, 115, 111, 96, 109, 47, 100, 121, 110, 113, 109, 96, 120, 100, 115, 51, 47, 100, 121, 117, 47, 103, 109, 96, 98, 47, 71, 109, 96, 98, 68, 121, 117, 115, 96, 98, 117, 110, 115, 61, 10, 10, 23, 10, 88, 17, 22, 11, 12, 25, 22, 12, 17, 25, 12, 17, 22, 31, 88, 62, 52, 57, 59, 88, 29, 0, 12, 29, 22, 11, 17, 23, 22, 22, 45, 38, 59, 51, 38, 32, 55, 38, 39, 99, 38, 49, 49, 44, 49, 99, 32, 49, 38, 34, 55, 42, 45, 36, 99, 5, 15, 2, 0, 99, 38, 59, 55, 49, 34, 32, 55, 44, 49};
    }

    static {
        A01();
        Constructor<? extends CC> constructor = null;
        try {
            constructor = Class.forName(A00(0, 59, 16)).asSubclass(CC.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException(A00(59, 34, 105), e);
        }
        A07 = constructor;
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final synchronized CC[] A4H() {
        CC[] ccArr;
        ccArr = new CC[A07 == null ? 12 : 13];
        ccArr[0] = new Z0(this.A01);
        ccArr[1] = new ZA(this.A00);
        ccArr[2] = new ZC(this.A03);
        ccArr[3] = new Z3(this.A02);
        ccArr[4] = new ZR();
        ccArr[5] = new ZO();
        ccArr[6] = new C0980Zk(this.A05, this.A04);
        ccArr[7] = new C0963Yt();
        ccArr[8] = new ZI();
        ccArr[9] = new C0974Ze();
        ccArr[10] = new C0982Zm();
        ccArr[11] = new C0960Yq();
        if (A07 != null) {
            try {
                ccArr[12] = A07.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException(A00(93, 40, 82), e);
            }
        }
        return ccArr;
    }
}

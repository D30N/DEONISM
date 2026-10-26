package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Y6 implements IZ {
    public static byte[] A04;

    @Nullable
    public YC A00;

    @Nullable
    public IZ A01;
    public final InterfaceC03449t A02;
    public final C1113by A03;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 5);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A04 = new byte[]{102, 94, 71, 95, 66, 91, 71, 78, 11, 89, 78, 69, 79, 78, 89, 78, 89, 11, 70, 78, 79, 66, 74, 11, 72, 71, 68, 72, 64, 88, 11, 78, 69, 74, 73, 71, 78, 79, 5};
    }

    public Y6(InterfaceC03449t interfaceC03449t, IM im) {
        this.A02 = interfaceC03449t;
        this.A03 = new C1113by(im);
    }

    private void A01() {
        this.A03.A02(this.A01.A6p());
        AH playbackParameters = this.A01.A6m();
        if (!playbackParameters.equals(this.A03.A6m())) {
            this.A03.AD9(playbackParameters);
            this.A02.AAY(playbackParameters);
        }
    }

    private boolean A03() {
        Y6 y6 = this;
        boolean z = false;
        YC yc = y6.A00;
        char c2 = yc != null ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    yc = yc;
                    if (!yc.A7c()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 3:
                    y6 = y6;
                    if (!y6.A00.A7k()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    y6 = y6;
                    if (!y6.A00.A7N()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 5:
                    z = true;
                    c2 = 6;
                    break;
                case 6:
                    return z;
                case 7:
                    z = false;
                    c2 = 6;
                    break;
            }
        }
    }

    public final long A04() {
        if (A03()) {
            A01();
            return this.A01.A6p();
        }
        return this.A03.A6p();
    }

    public final void A05() {
        this.A03.A00();
    }

    public final void A06() {
        this.A03.A01();
    }

    public final void A07(long j) {
        this.A03.A02(j);
    }

    public final void A08(YC yc) {
        if (yc == this.A00) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A09(YC yc) throws C03479w {
        Y6 y6 = this;
        IZ iz = null;
        IZ izA6W = yc.A6W();
        char c2 = izA6W != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    y6 = y6;
                    izA6W = izA6W;
                    iz = y6.A01;
                    if (izA6W == iz) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    iz = iz;
                    if (iz != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    y6 = y6;
                    yc = yc;
                    izA6W = izA6W;
                    y6.A01 = izA6W;
                    y6.A00 = yc;
                    y6.A01.AD9(y6.A03.A6m());
                    y6.A01();
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    throw C03479w.A02(new IllegalStateException(A00(0, 39, 46)));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final AH A6m() {
        Y6 y6 = this;
        AH ahA6m = null;
        IZ iz = y6.A01;
        char c2 = iz != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    iz = iz;
                    ahA6m = iz.A6m();
                    c2 = 3;
                    break;
                case 3:
                    return ahA6m;
                case 4:
                    y6 = y6;
                    ahA6m = y6.A03.A6m();
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final long A6p() {
        if (A03()) {
            return this.A01.A6p();
        }
        return this.A03.A6p();
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final AH AD9(AH ah) {
        IZ iz = this.A01;
        if (iz != null) {
            ah = iz.AD9(ah);
        }
        this.A03.AD9(ah);
        this.A02.AAY(ah);
        return ah;
    }
}

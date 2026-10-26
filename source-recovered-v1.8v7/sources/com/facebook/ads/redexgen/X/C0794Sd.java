package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0794Sd implements InterfaceC0619Li<Bundle> {
    public static byte[] A06;
    public AnonymousClass23 A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass21 A04;
    public final AnonymousClass23 A05;

    static {
        A04();
    }

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 100);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A06 = new byte[]{65, 80, 70, 65, 102, 65, 84, 65, 70, 16, 1, 19, 19, 5, 4, 108, 103, 109, 108, 109, 72, 68, 70, 91, 71, 78, 95, 78, 1, 30, 18, 0, 22, 21, 27, 18, 36, 3, 22, 3, 4};
    }

    public C0794Sd(AnonymousClass21 anonymousClass21) {
        this.A02 = false;
        this.A03 = false;
        this.A01 = false;
        this.A04 = anonymousClass21;
        this.A05 = new AnonymousClass23(anonymousClass21.A01);
        this.A00 = new AnonymousClass23(anonymousClass21.A01);
    }

    public C0794Sd(AnonymousClass21 anonymousClass21, Bundle bundle) {
        this.A02 = false;
        this.A03 = false;
        this.A01 = false;
        this.A04 = anonymousClass21;
        this.A05 = (AnonymousClass23) C0614Lc.A00(bundle.getByteArray(A00(0, 9, 81)));
        this.A00 = (AnonymousClass23) C0614Lc.A00(bundle.getByteArray(A00(28, 13, 19)));
        this.A02 = bundle.getBoolean(A00(15, 5, 109));
        this.A03 = bundle.getBoolean(A00(9, 6, 4));
        this.A01 = bundle.getBoolean(A00(20, 8, 79));
    }

    private void A01() {
        this.A01 = true;
        A02();
    }

    private void A02() {
        C0794Sd c0794Sd = this;
        AnonymousClass23 anonymousClass23 = null;
        c0794Sd.A02 = true;
        char c2 = c0794Sd.A03 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0794Sd = c0794Sd;
                    anonymousClass23 = c0794Sd.A00;
                    c2 = 3;
                    break;
                case 3:
                    C0794Sd c0794Sd2 = c0794Sd;
                    c0794Sd2.A04.A00(c0794Sd2.A01, c0794Sd2.A03, anonymousClass23);
                    return;
                case 4:
                    c0794Sd = c0794Sd;
                    anonymousClass23 = c0794Sd.A05;
                    c2 = 3;
                    break;
            }
        }
    }

    private void A03() {
        this.A03 = true;
        A01();
    }

    public final void A05() {
        if (!this.A02) {
            this.A00.A03();
        }
    }

    public final void A06(double d2, double d3) {
        C0794Sd c0794Sd = this;
        double dA01 = 0.0d;
        double d4 = 0.0d;
        char c2 = c0794Sd.A02 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0794Sd = c0794Sd;
                    c0794Sd.A05.A04(d2, d3);
                    c0794Sd.A00.A04(d2, d3);
                    if (!c0794Sd.A04.A03) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0794Sd = c0794Sd;
                    dA01 = c0794Sd.A00.A00().A03();
                    c2 = 5;
                    break;
                case 5:
                    c0794Sd = c0794Sd;
                    d4 = 0.0d;
                    if (c0794Sd.A04.A00 < 0.0d) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0794Sd = c0794Sd;
                    if (c0794Sd.A05.A00().A04() <= c0794Sd.A04.A00) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (dA01 != d4) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0794Sd.A01();
                    return;
                case '\t':
                    c0794Sd = c0794Sd;
                    dA01 = c0794Sd.A00.A00().A01();
                    c2 = 5;
                    break;
                case '\n':
                    c0794Sd = c0794Sd;
                    if (dA01 < c0794Sd.A04.A02) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0794Sd = c0794Sd;
                    c0794Sd.A03();
                    c2 = '\f';
                    break;
                case '\f':
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0619Li
    public final Bundle getSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(28, 13, 19), C0614Lc.A01(this.A00));
        bundle.putByteArray(A00(0, 9, 81), C0614Lc.A01(this.A05));
        bundle.putBoolean(A00(15, 5, 109), this.A02);
        bundle.putBoolean(A00(9, 6, 4), this.A03);
        bundle.putBoolean(A00(20, 8, 79), this.A01);
        return bundle;
    }
}

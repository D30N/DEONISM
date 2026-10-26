package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02274u {
    public static byte[] A04;
    public final Intent A00;
    public final C02304x A01;
    public final XI A02;
    public final JW A03;

    static {
        A0N();
    }

    public static String A0M(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 48);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0N() {
        A04 = new byte[]{0, 31, 18, 19, 25, 41, 2, 31, 27, 19, 41, 6, 25, 26, 26, 31, 24, 17, 41, 31, 24, 2, 19, 4, 0, 23, 26, 80, 71, 85, 67, 80, 70, 71, 70, 116, 75, 70, 71, 77, 99, 70, 102, 67, 86, 67, 96, 87, 76, 70, 78, 71, 17, 20, 47, 20, 17, 4, 17, 47, 18, 5, 30, 20, 28, 21};
    }

    public C02274u(C02304x c02304x, Intent intent, JW jw, XI xi) {
        this.A01 = c02304x;
        this.A00 = intent;
        this.A03 = jw;
        this.A02 = xi;
    }

    public /* synthetic */ C02274u(C02304x c02304x, Intent intent, JW jw, XI xi, C02264t c02264t) {
        this(c02304x, intent, jw, xi);
    }

    private C0786Rv A00() {
        return (C0786Rv) this.A00.getSerializableExtra(A0M(52, 14, 64));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MR A02() {
        C02304x c02304x = this.A01;
        return new C1112bx(c02304x, this.A02, this.A03, new TM(c02304x));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MR A03() {
        return new Y4(this.A02, this.A03, new TM(this.A01), A00(), new C1025aX(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MR A04() {
        return new Y4(this.A02, this.A03, new TM(this.A01), (C0787Rw) this.A00.getSerializableExtra(A0M(27, 25, 18)), new C1024aW(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MR A05() {
        XI xi = this.A02;
        return new AnonymousClass83(xi, this.A03, new C7C(xi), new TM(this.A01), A00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MR A06() {
        C0786Rv c0786RvA00 = A00();
        C02264t c02264t = null;
        if (c0786RvA00.A0e()) {
            return new C03148o(this.A02, new C1025aX(), this.A03, c0786RvA00, new C7C(this.A02), new TM(this.A01));
        }
        return new C0359Ai(this.A02, c0786RvA00, this.A03, new TM(this.A01));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MR A07() {
        return new C1040am(this.A02, this.A03, new TM(this.A01), A00(), null, new C1025aX());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MR A08() {
        C0786Rv c0786RvA00 = A00();
        C02264t c02264t = null;
        if (c0786RvA00.A0e()) {
            return new AnonymousClass85(this.A02, new C1025aX(), this.A03, c0786RvA00, new C7C(this.A02), new TM(this.A01));
        }
        XI xi = this.A02;
        JW jw = this.A03;
        C0786Rv dataBundle = A00();
        return new C03469v(xi, jw, dataBundle, new C7C(this.A02), new TM(this.A01));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MR A09() {
        C0787Rw c0787Rw = (C0787Rw) this.A00.getSerializableExtra(A0M(27, 25, 18));
        C02264t c02264t = null;
        if (c0787Rw.A0e()) {
            return new AnonymousClass85(this.A02, new C1024aW(), this.A03, c0787Rw, new C7C(this.A02), new C0450Eo(this.A01));
        }
        XI xi = this.A02;
        return new C1029ab(xi, this.A03, new C0755Qq(xi), new C0450Eo(this.A01), c0787Rw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MR A0A() {
        C0787Rw c0787Rw = (C0787Rw) this.A00.getSerializableExtra(A0M(27, 25, 18));
        return new C1040am(this.A02, this.A03, new C0450Eo(this.A01), c0787Rw, c0787Rw.A0U(), new C1024aW());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MR A0B(RelativeLayout relativeLayout) {
        C1027aZ c1027aZ = new C1027aZ(this.A02, new TN(this), this.A03, new TM(this.A01));
        c1027aZ.A05(relativeLayout);
        c1027aZ.A04(this.A00.getIntExtra(A0M(0, 27, 70), 200));
        C0635Ly.A0P(relativeLayout, -16777216);
        return c1027aZ;
    }
}

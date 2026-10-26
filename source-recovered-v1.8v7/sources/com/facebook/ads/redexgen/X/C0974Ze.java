package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ze, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0974Ze implements CC {
    public static final CF A08 = new C0973Zd();
    public long A00;
    public CE A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray<DP> A05;
    public final C0544Ii A06;
    public final C0556Iu A07;

    public C0974Ze() {
        this(new C0556Iu(0L));
    }

    public C0974Ze(C0556Iu c0556Iu) {
        this.A07 = c0556Iu;
        this.A06 = new C0544Ii(4096);
        this.A05 = new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void A7T(CE ce) {
        this.A01 = ce;
        ce.ACq(new C0958Yo(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final int AC3(CD cd, CJ cj) throws InterruptedException, IOException {
        CD cd2 = cd;
        C0974Ze c0974Ze = this;
        int streamId = 0;
        DP payloadReader = null;
        long maxSearchPosition = 0;
        DI zw = null;
        int i = 0;
        int iA08 = 0;
        int i2 = 0;
        char c2 = !cd2.ABg(c0974Ze.A06.A00, 0, 4, true) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return -1;
                case 3:
                    c0974Ze = c0974Ze;
                    c0974Ze.A06.A0Y(0);
                    iA08 = c0974Ze.A06.A08();
                    if (iA08 != 441) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return -1;
                case 5:
                    if (iA08 != 442) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    C0974Ze c0974Ze2 = c0974Ze;
                    CD cd3 = cd2;
                    cd3.ABf(c0974Ze2.A06.A00, 0, 10);
                    c0974Ze2.A06.A0Y(9);
                    cd3.ADL((c0974Ze2.A06.A0E() & 7) + 14);
                    return 0;
                case 7:
                    i2 = 2;
                    if (iA08 != 443) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    C0974Ze c0974Ze3 = c0974Ze;
                    CD cd4 = cd2;
                    cd4.ABf(c0974Ze3.A06.A00, 0, i2);
                    c0974Ze3.A06.A0Y(0);
                    cd4.ADL(c0974Ze3.A06.A0I() + 6);
                    return 0;
                case '\t':
                    if (((iA08 & (-256)) >> 8) == 1) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    cd2.ADL(1);
                    return 0;
                case 11:
                    c0974Ze = c0974Ze;
                    i = iA08 & 255;
                    payloadReader = c0974Ze.A05.get(i);
                    if (!c0974Ze.A02) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case '\f':
                    payloadReader = payloadReader;
                    if (payloadReader != null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    zw = null;
                    if (i != 189) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c0974Ze = c0974Ze;
                    cd2 = cd2;
                    zw = new ZP();
                    c0974Ze.A03 = true;
                    c0974Ze.A00 = cd2.A6n();
                    c2 = 15;
                    break;
                case 15:
                    if (zw == null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c0974Ze = c0974Ze;
                    zw.A4U(c0974Ze.A01, new DW(i, 256));
                    payloadReader = new DP(zw, c0974Ze.A07);
                    c0974Ze.A05.put(i, payloadReader);
                    c2 = 17;
                    break;
                case 17:
                    c0974Ze = c0974Ze;
                    if (!c0974Ze.A03) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c0974Ze = c0974Ze;
                    if (!c0974Ze.A04) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    c0974Ze = c0974Ze;
                    maxSearchPosition = c0974Ze.A00 + 8192;
                    c2 = 20;
                    break;
                case 20:
                    cd2 = cd2;
                    if (cd2.A6n() <= maxSearchPosition) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    c0974Ze = c0974Ze;
                    c0974Ze.A02 = true;
                    c0974Ze.A01.A4w();
                    c2 = 22;
                    break;
                case 22:
                    c0974Ze = c0974Ze;
                    cd2 = cd2;
                    payloadReader = payloadReader;
                    cd2.ABf(c0974Ze.A06.A00, 0, i2);
                    c0974Ze.A06.A0Y(0);
                    streamId = c0974Ze.A06.A0I() + 6;
                    if (payloadReader != null) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    cd2 = cd2;
                    cd2.ADL(streamId);
                    c2 = 24;
                    break;
                case 24:
                    return 0;
                case 25:
                    c0974Ze = c0974Ze;
                    cd2 = cd2;
                    payloadReader = payloadReader;
                    c0974Ze.A06.A0W(streamId);
                    cd2.readFully(c0974Ze.A06.A00, 0, streamId);
                    c0974Ze.A06.A0Y(6);
                    payloadReader.A03(c0974Ze.A06);
                    C0544Ii c0544Ii = c0974Ze.A06;
                    c0544Ii.A0X(c0544Ii.A05());
                    c2 = 24;
                    break;
                case 26:
                    maxSearchPosition = 1048576;
                    c2 = 20;
                    break;
                case 27:
                    if ((i & 224) != 192) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    c0974Ze = c0974Ze;
                    cd2 = cd2;
                    zw = new C0971Zb();
                    c0974Ze.A03 = true;
                    c0974Ze.A00 = cd2.A6n();
                    c2 = 15;
                    break;
                case 29:
                    if ((i & 240) != 224) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    c0974Ze = c0974Ze;
                    cd2 = cd2;
                    zw = new ZW();
                    c0974Ze.A04 = true;
                    c0974Ze.A00 = cd2.A6n();
                    c2 = 15;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void ACp(long j, long j2) {
        C0974Ze c0974Ze = this;
        c0974Ze.A07.A08();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0974Ze = c0974Ze;
                    if (i >= c0974Ze.A05.size()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0974Ze = c0974Ze;
                    c0974Ze.A05.valueAt(i).A02();
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.X.CC
    public final boolean ADM(CD cd) throws InterruptedException, IOException {
        byte b2 = 0;
        byte[] bArr = new byte[14];
        boolean z = false;
        cd.ABf(bArr, 0, 14);
        char c2 = 442 != (((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16)) | ((bArr[2] & 255) << 8)) | (bArr[3] & 255)) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return z;
                case 3:
                    bArr = bArr;
                    b2 = 4;
                    if ((bArr[4] & 196) == 68) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return z;
                case 5:
                    bArr = bArr;
                    if ((bArr[6] & b2) == b2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return z;
                case 7:
                    bArr = bArr;
                    if ((bArr[8] & b2) == b2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return z;
                case '\t':
                    bArr = bArr;
                    if ((bArr[9] & 1) == 1) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    return z;
                case 11:
                    bArr = bArr;
                    if ((bArr[12] & 3) == 3) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    return z;
                case '\r':
                    cd = cd;
                    bArr = bArr;
                    cd.A3L(bArr[13] & 7);
                    cd.ABf(bArr, z ? 1 : 0, 3);
                    if (1 != ((bArr[2] & 255) | ((bArr[z ? 1 : 0] & 255) << 16) | ((bArr[1] & 255) << 8))) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    z = true;
                    c2 = 15;
                    break;
                case 15:
                    return z;
            }
        }
    }
}

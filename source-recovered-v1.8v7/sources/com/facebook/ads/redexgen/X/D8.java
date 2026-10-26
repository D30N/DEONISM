package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public abstract class D8 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public CE A06;
    public CO A07;
    public D5 A08;
    public D7 A09;
    public boolean A0A;
    public boolean A0B;
    public final D3 A0C = new D3();

    public abstract long A07(C0544Ii c0544Ii);

    public abstract boolean A0A(C0544Ii c0544Ii, long j, D7 d7) throws InterruptedException, IOException;

    private int A00(CD cd) throws InterruptedException, IOException {
        boolean zA0A = true;
        while (zA0A) {
            if (!this.A0C.A05(cd)) {
                this.A01 = 3;
                return -1;
            }
            this.A03 = cd.A6n() - this.A04;
            zA0A = A0A(this.A0C.A02(), this.A04, this.A09);
            if (zA0A) {
                this.A04 = cd.A6n();
            }
        }
        this.A00 = this.A09.A00.A0C;
        if (!this.A0A) {
            this.A07.A5A(this.A09.A00);
            this.A0A = true;
        }
        if (this.A09.A01 != null) {
            this.A08 = this.A09.A01;
        } else if (cd.A6U() == -1) {
            this.A08 = new ZK();
        } else {
            D4 d4A01 = this.A0C.A01();
            this.A08 = new ZE(this.A04, cd.A6U(), this, d4A01.A01 + d4A01.A00, d4A01.A05);
        }
        this.A09 = null;
        this.A01 = 2;
        this.A0C.A04();
        return 0;
    }

    private int A01(CD cd, CJ cj) throws InterruptedException, IOException {
        CD cd2 = cd;
        C0544Ii payload = null;
        long timeUs = 0;
        long jA07 = 0;
        long j = 0;
        D8 d8 = this;
        long jAC4 = d8.A08.AC4(cd2);
        char c2 = jAC4 >= 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    cj.A00 = jAC4;
                    return 1;
                case 3:
                    timeUs = -1;
                    if (jAC4 >= -1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    d8 = d8;
                    d8.A08(-(2 + jAC4));
                    c2 = 5;
                    break;
                case 5:
                    d8 = d8;
                    if (!d8.A0B) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    d8 = d8;
                    CL seekMap = d8.A08.A4R();
                    d8.A06.ACq(seekMap);
                    d8.A0B = true;
                    c2 = 7;
                    break;
                case 7:
                    d8 = d8;
                    if (d8.A03 > 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    d8 = d8;
                    cd2 = cd2;
                    if (!d8.A0C.A05(cd2)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    d8 = d8;
                    d8.A03 = 0L;
                    payload = d8.A0C.A02();
                    jA07 = d8.A07(payload);
                    if (jA07 < 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    d8 = d8;
                    j = d8.A02;
                    if (j + jA07 < d8.A05) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    d8 = d8;
                    payload = payload;
                    long jA03 = d8.A03(j);
                    d8.A07.ACk(payload, payload.A07());
                    d8.A07.ACl(jA03, 1, payload.A07(), 0, null);
                    d8.A05 = timeUs;
                    c2 = '\f';
                    break;
                case '\f':
                    d8.A02 += jA07;
                    return 0;
                case '\r':
                    d8.A01 = 3;
                    return -1;
            }
        }
    }

    public final int A02(CD cd, CJ cj) throws InterruptedException, IOException {
        int i = 0;
        int i2 = this.A01;
        char c2 = i2 != 0 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    i = 2;
                    if (i2 == 1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i2 != i) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return A01(cd, cj);
                case 5:
                    throw new IllegalStateException();
                case 6:
                    D8 d8 = this;
                    cd.ADL((int) d8.A04);
                    d8.A01 = i;
                    return 0;
                case 7:
                    return A00(cd);
            }
        }
    }

    public final long A03(long j) {
        return (1000000 * j) / this.A00;
    }

    public final long A04(long j) {
        return (this.A00 * j) / 1000000;
    }

    public final void A05(long j, long j2) {
        D8 d8 = this;
        d8.A0C.A03();
        char c2 = j == 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    d8 = d8;
                    d8.A09(!d8.A0B);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    d8 = d8;
                    if (d8.A01 == 0) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    d8 = d8;
                    d8.A05 = d8.A08.ADS(j2);
                    d8.A01 = 2;
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A06(CE ce, CO co) {
        this.A06 = ce;
        this.A07 = co;
        A09(true);
    }

    public void A08(long j) {
        this.A02 = j;
    }

    public void A09(boolean z) {
        D8 d8 = this;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    d8 = d8;
                    d8.A09 = new D7();
                    d8.A04 = 0L;
                    d8.A01 = 0;
                    c2 = 3;
                    break;
                case 3:
                    D8 d82 = d8;
                    d82.A05 = -1L;
                    d82.A02 = 0L;
                    return;
                case 4:
                    d8 = d8;
                    d8.A01 = 1;
                    c2 = 3;
                    break;
            }
        }
    }
}

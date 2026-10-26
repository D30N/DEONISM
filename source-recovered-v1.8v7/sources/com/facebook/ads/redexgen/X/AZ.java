package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class AZ {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public long A04;
    public C0469Fj A05;

    public final int A00() {
        return this.A05.A00;
    }

    public final int A01(int i) {
        return this.A05.A04[i].A00;
    }

    public final int A02(int i) {
        return this.A05.A04[i].A00();
    }

    public final int A03(int i, int i2) {
        return this.A05.A04[i].A01(i2);
    }

    public final int A04(long j) {
        return this.A05.A00(j);
    }

    public final int A05(long j) {
        return this.A05.A01(j);
    }

    public final long A06() {
        return this.A05.A01;
    }

    public final long A07() {
        return this.A01;
    }

    public final long A08() {
        return C03419q.A01(this.A04);
    }

    public final long A09(int i) {
        return this.A05.A03[i];
    }

    public final long A0A(int i, int i2) {
        long j = 0;
        C0467Fh c0467Fh = this.A05.A04[i];
        char c2 = c0467Fh.A00 != -1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0467Fh = c0467Fh;
                    j = c0467Fh.A02[i2];
                    c2 = 3;
                    break;
                case 3:
                    return j;
                case 4:
                    j = -9223372036854775807L;
                    c2 = 3;
                    break;
            }
        }
    }

    public final AZ A0B(Object obj, Object obj2, int i, long j, long j2) {
        return A0C(obj, obj2, i, j, j2, C0469Fj.A05);
    }

    public final AZ A0C(Object obj, Object obj2, int i, long j, long j2, C0469Fj c0469Fj) {
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = i;
        this.A01 = j;
        this.A04 = j2;
        this.A05 = c0469Fj;
        return this;
    }

    public final boolean A0D(int i) {
        return !this.A05.A04[i].A02();
    }

    public final boolean A0E(int i, int i2) {
        boolean z = false;
        C0467Fh c0467Fh = this.A05.A04[i];
        char c2 = c0467Fh.A00 != -1 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0467Fh = c0467Fh;
                    if (c0467Fh.A01[i2] == 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }
}

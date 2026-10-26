package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
import android.support.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class BB {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;

    @Nullable
    public final B9 A05;

    public BB(AudioTrack audioTrack) {
        if (C0560Iy.A01 >= 19) {
            this.A05 = new B9(audioTrack);
            A05();
        } else {
            this.A05 = null;
            A00(3);
        }
    }

    private void A00(int i) {
        BB bb = this;
        bb.A00 = i;
        char c2 = i != 0 ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 1) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 3) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i != 4) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    bb = bb;
                    bb.A04 = 500000L;
                    c2 = 7;
                    break;
                case 7:
                    return;
                case '\b':
                    bb = bb;
                    bb.A04 = 10000000L;
                    c2 = 7;
                    break;
                case '\t':
                    bb = bb;
                    bb.A04 = 5000L;
                    c2 = 7;
                    break;
                case '\n':
                    bb = bb;
                    bb.A03 = 0L;
                    bb.A01 = -1L;
                    bb.A02 = System.nanoTime() / 1000;
                    bb.A04 = 5000L;
                    c2 = 7;
                    break;
                case 11:
                    throw new IllegalStateException();
            }
        }
    }

    public final long A01() {
        long jA00 = 0;
        B9 b9 = this.A05;
        char c2 = b9 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    b9 = b9;
                    jA00 = b9.A00();
                    c2 = 3;
                    break;
                case 3:
                    return jA00;
                case 4:
                    jA00 = -1;
                    c2 = 3;
                    break;
            }
        }
    }

    public final long A02() {
        long jA01 = 0;
        B9 b9 = this.A05;
        char c2 = b9 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    b9 = b9;
                    jA01 = b9.A01();
                    c2 = 3;
                    break;
                case 3:
                    return jA01;
                case 4:
                    jA01 = -9223372036854775807L;
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A03() {
        if (this.A00 == 4) {
            A05();
        }
    }

    public final void A04() {
        A00(4);
    }

    public final void A05() {
        if (this.A05 != null) {
            A00(0);
        }
    }

    public final boolean A06() {
        int i = this.A00;
        boolean z = true;
        char c2 = i != 1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (i != 2) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final boolean A07() {
        boolean z = false;
        char c2 = this.A00 == 2 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final boolean A08(long timestampPositionFrames) {
        BB bb = this;
        boolean zA02 = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        B9 b9 = bb.A05;
        char c2 = b9 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    bb = bb;
                    if (timestampPositionFrames - bb.A03 >= bb.A04) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    bb = bb;
                    b9 = b9;
                    bb.A03 = timestampPositionFrames;
                    zA02 = b9.A02();
                    i3 = bb.A00;
                    i = 3;
                    i2 = 1;
                    if (i3 == 0) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i4 = 2;
                    if (i3 == i2) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i3 == i4) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i3 == i) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (i3 != 4) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return zA02;
                case '\n':
                    if (!zA02) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    bb = bb;
                    bb.A05();
                    c2 = '\t';
                    break;
                case '\f':
                    if (!zA02) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\r':
                    bb = bb;
                    bb.A05();
                    c2 = '\t';
                    break;
                case 14:
                    if (!zA02) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    bb = bb;
                    if (bb.A05.A00() <= bb.A01) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    bb = bb;
                    bb.A00(i4);
                    c2 = '\t';
                    break;
                case 17:
                    bb = bb;
                    bb.A05();
                    c2 = '\t';
                    break;
                case 18:
                    if (!zA02) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    bb = bb;
                    if (bb.A05.A01() < bb.A02) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    bb = bb;
                    bb.A01 = bb.A05.A00();
                    bb.A00(i2);
                    c2 = '\t';
                    break;
                case 21:
                    zA02 = false;
                    c2 = '\t';
                    break;
                case 22:
                    bb = bb;
                    if (timestampPositionFrames - bb.A02 <= 500000) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    bb = bb;
                    bb.A00(i);
                    c2 = '\t';
                    break;
                case 24:
                    throw new IllegalStateException();
            }
        }
    }
}

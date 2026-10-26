package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class BE {
    public static byte[] A0P;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public AudioTrack A0H;
    public BB A0I;
    public Method A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final BC A0N;
    public final long[] A0O;

    static {
        A06();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0P, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 99);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A0P = new byte[]{33, 31, 46, 6, 27, 46, 31, 40, 29, 51};
    }

    public BE(BC bc) {
        this.A0N = (BC) IJ.A01(bc);
        if (C0560Iy.A01 >= 18) {
            try {
                this.A0J = AudioTrack.class.getMethod(A03(0, 10, 87), (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.A0O = new long[10];
    }

    private long A00() {
        BE be = this;
        long playbackHeadPosition = 0;
        int playState = 0;
        long rawPlaybackHeadPosition = 0;
        char c2 = be.A0G != -9223372036854775807L ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    BE be2 = be;
                    long jElapsedRealtime = (be2.A03 * ((SystemClock.elapsedRealtime() * 1000) - be2.A0G)) / 1000000;
                    long framesSinceStop = be2.A06;
                    return Math.min(framesSinceStop, be2.A0F + jElapsedRealtime);
                case 3:
                    be = be;
                    playState = be.A0H.getPlayState();
                    rawPlaybackHeadPosition = 0;
                    if (playState != 1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return rawPlaybackHeadPosition;
                case 5:
                    be = be;
                    playbackHeadPosition = 4294967295L & be.A0H.getPlaybackHeadPosition();
                    if (!be.A0M) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (playState != 2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (playbackHeadPosition != rawPlaybackHeadPosition) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    be = be;
                    be.A0C = be.A0A;
                    c2 = '\t';
                    break;
                case '\t':
                    be = be;
                    playbackHeadPosition += be.A0C;
                    c2 = '\n';
                    break;
                case '\n':
                    if (C0560Iy.A01 > 28) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    if (playbackHeadPosition != rawPlaybackHeadPosition) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    be = be;
                    if (be.A0A <= rawPlaybackHeadPosition) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    if (playState != 3) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    be = be;
                    if (be.A07 != -9223372036854775807L) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    be = be;
                    be.A07 = SystemClock.elapsedRealtime();
                    c2 = 16;
                    break;
                case 16:
                    return be.A0A;
                case 17:
                    be = be;
                    be.A07 = -9223372036854775807L;
                    c2 = 18;
                    break;
                case 18:
                    be = be;
                    if (be.A0A <= playbackHeadPosition) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    be = be;
                    be.A0D++;
                    c2 = 20;
                    break;
                case 20:
                    BE be3 = be;
                    be3.A0A = playbackHeadPosition;
                    return (be3.A0D << 32) + playbackHeadPosition;
            }
        }
    }

    private long A01() {
        return A02(A00());
    }

    private long A02(long j) {
        return (1000000 * j) / this.A03;
    }

    private void A04() {
        BE be = this;
        int i = 0;
        int i2 = 0;
        long jNanoTime = 0;
        int i3 = 0;
        long jA01 = be.A01();
        int i4 = jA01 == 0 ? 2 : 3;
        while (true) {
            switch (i4) {
                case 2:
                    return;
                case 3:
                    be = be;
                    jNanoTime = System.nanoTime() / 1000;
                    if (jNanoTime - be.A09 < 30000) {
                        i4 = 9;
                        break;
                    } else {
                        i4 = 4;
                        break;
                    }
                case 4:
                    be = be;
                    long[] jArr = be.A0O;
                    int i5 = be.A01;
                    jArr[i5] = jA01 - jNanoTime;
                    be.A01 = (i5 + 1) % 10;
                    i3 = be.A04;
                    if (i3 >= 10) {
                        i4 = 6;
                        break;
                    } else {
                        i4 = 5;
                        break;
                    }
                case 5:
                    be = be;
                    be.A04 = i3 + 1;
                    i4 = 6;
                    break;
                case 6:
                    be = be;
                    be.A09 = jNanoTime;
                    be.A0E = 0L;
                    i2 = 0;
                    i4 = 7;
                    break;
                case 7:
                    be = be;
                    i = be.A04;
                    if (i2 >= i) {
                        i4 = 9;
                        break;
                    } else {
                        i4 = 8;
                        break;
                    }
                case 8:
                    be = be;
                    be.A0E += be.A0O[i2] / i;
                    i2++;
                    i4 = 7;
                    break;
                case 9:
                    be = be;
                    if (!be.A0M) {
                        i4 = 11;
                        break;
                    } else {
                        i4 = 10;
                        break;
                    }
                case 10:
                    return;
                case 11:
                    BE be2 = be;
                    be2.A08(jNanoTime, jA01);
                    be2.A07(jNanoTime);
                    return;
            }
        }
    }

    private void A05() {
        this.A0E = 0L;
        this.A04 = 0;
        this.A01 = 0;
        this.A09 = 0L;
    }

    private void A07(long j) {
        BE be = this;
        Method method = null;
        Method method2 = null;
        char c2 = be.A0L ? (char) 2 : (char) 23;
        while (true) {
            switch (c2) {
                case 2:
                    be = be;
                    method2 = be.A0J;
                    if (method2 == null) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    be = be;
                    if (j - be.A08 < 500000) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    method = null;
                    c2 = 5;
                    break;
                case 5:
                    try {
                        be = be;
                        be.A0B = (((Integer) method2.invoke(be.A0H, (Object[]) method)).intValue() * 1000) - be.A05;
                        be.A0B = Math.max(be.A0B, 0L);
                        if (be.A0B > 5000000) {
                            be.A0N.AA1(be.A0B);
                            be.A0B = 0L;
                        }
                    } catch (Exception unused) {
                        be.A0J = method;
                    }
                    be.A08 = j;
                    c2 = 23;
                    break;
                case 23:
                    return;
            }
        }
    }

    private void A08(long j, long j2) {
        long j3 = 0;
        long jA02 = 0;
        long jA01 = 0;
        BE be = this;
        char c2 = !be.A0I.A08(j) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    be = be;
                    jA02 = be.A0I.A02();
                    jA01 = be.A0I.A01();
                    j3 = 5000000;
                    if (Math.abs(jA02 - j) <= 5000000) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    be = be;
                    be.A0N.AB9(jA01, jA02, j, j2);
                    be.A0I.A04();
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    be = be;
                    if (Math.abs(be.A02(jA01) - j2) <= j3) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    be = be;
                    be.A0N.AAf(jA01, jA02, j, j2);
                    be.A0I.A04();
                    c2 = 5;
                    break;
                case '\b':
                    be = be;
                    be.A0I.A03();
                    c2 = 5;
                    break;
            }
        }
    }

    private boolean A09() {
        BE be = this;
        boolean z = false;
        char c2 = be.A0M ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    be = be;
                    if (be.A0H.getPlayState() != 2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    be = be;
                    if (be.A00() != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    public static boolean A0A(int i) {
        boolean z = false;
        char c2 = C0560Iy.A01 < 23 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 5) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i != 6) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    public final int A0B(long j) {
        return this.A00 - ((int) (j - (A00() * this.A02)));
    }

    public final long A0C(boolean z) {
        BE be = this;
        long timestampPositionFrames = 0;
        long timestampPositionUs = 0;
        long elapsedSinceTimestampUs = 0;
        char c2 = be.A0H.getPlayState() == 3 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    be = be;
                    be.A04();
                    c2 = 3;
                    break;
                case 3:
                    be = be;
                    long timestampPositionUs2 = System.nanoTime();
                    timestampPositionUs = timestampPositionUs2 / 1000;
                    if (!be.A0I.A06()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    be = be;
                    elapsedSinceTimestampUs = be.A02(be.A0I.A01());
                    if (!be.A0I.A07()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    return elapsedSinceTimestampUs;
                case 6:
                    return elapsedSinceTimestampUs + (timestampPositionUs - be.A0I.A02());
                case 7:
                    be = be;
                    if (be.A04 != 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    be = be;
                    timestampPositionFrames = be.A01();
                    c2 = '\t';
                    break;
                case '\t':
                    if (!z) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case '\n':
                    be = be;
                    timestampPositionFrames -= be.A0B;
                    c2 = 11;
                    break;
                case 11:
                    return timestampPositionFrames;
                case '\f':
                    be = be;
                    timestampPositionFrames = be.A0E + timestampPositionUs;
                    c2 = '\t';
                    break;
            }
        }
    }

    public final void A0D() {
        A05();
        this.A0H = null;
        this.A0I = null;
    }

    public final void A0E() {
        this.A0I.A05();
    }

    public final void A0F(long j) {
        this.A0F = A00();
        this.A0G = SystemClock.elapsedRealtime() * 1000;
        this.A06 = j;
    }

    public final void A0G(AudioTrack audioTrack, int i, int i2, int i3) {
        BE be = this;
        long jA02 = 0;
        be.A0H = audioTrack;
        be.A02 = i2;
        be.A00 = i3;
        be.A0I = new BB(audioTrack);
        be.A03 = audioTrack.getSampleRate();
        be.A0M = A0A(i);
        be.A0L = C0560Iy.A0f(i);
        char c2 = be.A0L ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    be = be;
                    jA02 = be.A02(i3 / i2);
                    c2 = 3;
                    break;
                case 3:
                    BE be2 = be;
                    be2.A05 = jA02;
                    be2.A0A = 0L;
                    be2.A0D = 0L;
                    be2.A0C = 0L;
                    be2.A0K = false;
                    be2.A0G = -9223372036854775807L;
                    be2.A07 = -9223372036854775807L;
                    be2.A0B = 0L;
                    return;
                case 4:
                    jA02 = -9223372036854775807L;
                    c2 = 3;
                    break;
            }
        }
    }

    public final boolean A0H() {
        boolean z = false;
        char c2 = this.A0H.getPlayState() == 3 ? (char) 2 : (char) 4;
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

    public final boolean A0I() {
        A05();
        if (this.A0G == -9223372036854775807L) {
            this.A0I.A05();
            return true;
        }
        return false;
    }

    public final boolean A0J(long j) {
        BE be = this;
        boolean z = false;
        char c2 = j <= be.A00() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    be = be;
                    if (!be.A09()) {
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

    public final boolean A0K(long j) {
        BE be = this;
        boolean z = false;
        char c2 = be.A07 != -9223372036854775807L ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (j <= 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    be = be;
                    if (SystemClock.elapsedRealtime() - be.A07 < 200) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    public final boolean A0L(long j) {
        BE be = this;
        BC bc = null;
        int playState = be.A0H.getPlayState();
        char c2 = be.A0M ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    if (playState != 2) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    be.A0K = false;
                    return false;
                case 4:
                    if (playState != 1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    be = be;
                    if (be.A00() != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return false;
                case 7:
                    be = be;
                    boolean z = be.A0K;
                    be.A0K = be.A0J(j);
                    if (!z) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    be = be;
                    if (!be.A0K) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\t':
                    if (playState == 1) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    be = be;
                    bc = be.A0N;
                    if (bc == null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    be = be;
                    bc = bc;
                    bc.ABG(be.A00, C03419q.A01(be.A05));
                    c2 = '\f';
                    break;
                case '\f':
                    return true;
            }
        }
    }
}

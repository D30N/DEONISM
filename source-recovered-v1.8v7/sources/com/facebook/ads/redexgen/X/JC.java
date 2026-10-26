package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.support.annotation.Nullable;
import android.view.Display;
import android.view.WindowManager;
import java.util.Arrays;

@TargetApi(16)
/* loaded from: assets/audience_network.dex */
public final class JC {
    public static byte[] A0C;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final JA A0A;
    public final JB A0B;

    static {
        A04();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 62);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A0C = new byte[]{61, 48, 42, 41, 53, 56, 32, 64, 94, 89, 83, 88, 64};
    }

    public JC() {
        this(null);
    }

    public JC(@Nullable Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.A09 = (WindowManager) context.getSystemService(A02(7, 6, 9));
        } else {
            this.A09 = null;
        }
        if (this.A09 != null) {
            this.A0A = C0560Iy.A01 >= 17 ? A01(context) : null;
            this.A0B = JB.A00();
        } else {
            this.A0A = null;
            this.A0B = null;
        }
        this.A06 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
    }

    public static long A00(long vsyncCount, long j, long snappedBeforeNs) {
        long j2 = 0;
        long snappedAfterDiff = 0;
        long snappedBeforeDiff = 0;
        long snappedTimeNs = j + (snappedBeforeNs * ((vsyncCount - j) / snappedBeforeNs));
        char c2 = vsyncCount <= snappedTimeNs ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    snappedBeforeDiff = snappedTimeNs - snappedBeforeNs;
                    snappedAfterDiff = snappedTimeNs;
                    c2 = 3;
                    break;
                case 3:
                    if (snappedAfterDiff - vsyncCount >= vsyncCount - snappedBeforeDiff) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    j2 = snappedAfterDiff;
                    c2 = 5;
                    break;
                case 5:
                    return j2;
                case 6:
                    j2 = snappedBeforeDiff;
                    c2 = 5;
                    break;
                case 7:
                    snappedBeforeDiff = snappedTimeNs;
                    snappedAfterDiff = snappedTimeNs + snappedBeforeNs;
                    c2 = 3;
                    break;
            }
        }
    }

    @TargetApi(17)
    private JA A01(Context context) {
        JC jc = this;
        JA ja = null;
        DisplayManager displayManager = (DisplayManager) context.getSystemService(A02(0, 7, 103));
        char c2 = displayManager == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    ja = null;
                    c2 = 3;
                    break;
                case 3:
                    return ja;
                case 4:
                    jc = jc;
                    displayManager = displayManager;
                    ja = new JA(jc, displayManager);
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        Display defaultDisplay = this.A09.getDefaultDisplay();
        if (defaultDisplay != null) {
            double defaultDisplayRefreshRate = defaultDisplay.getRefreshRate();
            this.A06 = (long) (1.0E9d / defaultDisplayRefreshRate);
            this.A07 = (this.A06 * 80) / 100;
        }
    }

    private boolean A06(long j, long j2) {
        boolean z = false;
        char c2 = Math.abs((j2 - this.A05) - (j - this.A04)) > 20000000 ? (char) 2 : (char) 4;
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

    public final long A07(long j, long j2) {
        long framePresentationTimeNs = 0;
        JB jb = null;
        long adjustedReleaseTimeNs = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        JC jc = this;
        long j6 = 1000 * j;
        long j7 = j6;
        long j8 = j2;
        char c2 = jc.A08 ? (char) 2 : (char) 16;
        while (true) {
            switch (c2) {
                case 2:
                    jc = jc;
                    if (j == jc.A02) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    jc = jc;
                    jc.A01++;
                    jc.A00 = jc.A03;
                    c2 = 4;
                    break;
                case 4:
                    jc = jc;
                    j5 = jc.A01;
                    if (j5 < 6) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    jc = jc;
                    long j9 = (j6 - jc.A04) / j5;
                    long adjustedReleaseTimeNs2 = jc.A00;
                    adjustedReleaseTimeNs = adjustedReleaseTimeNs2 + j9;
                    if (!jc.A06(adjustedReleaseTimeNs, j2)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    jc = jc;
                    jc.A08 = false;
                    c2 = 7;
                    break;
                case 7:
                    j4 = j8;
                    c2 = '\b';
                    break;
                case '\b':
                    jc = jc;
                    if (!jc.A08) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\t':
                    jc = jc;
                    jc.A04 = j6;
                    jc.A05 = j2;
                    jc.A01 = 0L;
                    jc.A08 = true;
                    c2 = '\n';
                    break;
                case '\n':
                    jc = jc;
                    jc.A02 = j;
                    jc.A03 = j7;
                    jb = jc.A0B;
                    if (jb == null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    jc = jc;
                    j3 = -9223372036854775807L;
                    if (jc.A06 != -9223372036854775807L) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    return j4;
                case '\r':
                    jc = jc;
                    j7 = adjustedReleaseTimeNs;
                    j8 = (jc.A05 + adjustedReleaseTimeNs) - jc.A04;
                    c2 = 7;
                    break;
                case 14:
                    jc = jc;
                    j4 = j8;
                    if (!jc.A06(j6, j2)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    jc = jc;
                    jc.A08 = false;
                    c2 = '\b';
                    break;
                case 16:
                    j4 = j8;
                    c2 = '\b';
                    break;
                case 17:
                    jb = jb;
                    framePresentationTimeNs = jb.A04;
                    if (framePresentationTimeNs != j3) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    return j4;
                case 19:
                    JC jc2 = jc;
                    long sampledVsyncTimeNs = jc2.A06;
                    long snappedTimeNs = A00(j4, framePresentationTimeNs, sampledVsyncTimeNs);
                    long sampledVsyncTimeNs2 = jc2.A07;
                    return snappedTimeNs - sampledVsyncTimeNs2;
            }
        }
    }

    public final void A08() {
        JC jc = this;
        JA ja = null;
        char c2 = jc.A09 != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    jc = jc;
                    ja = jc.A0A;
                    if (ja == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ja = ja;
                    ja.A01();
                    c2 = 4;
                    break;
                case 4:
                    jc = jc;
                    jc.A0B.A07();
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    public final void A09() {
        JC jc = this;
        JA ja = null;
        jc.A08 = false;
        char c2 = jc.A09 != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    jc = jc;
                    jc.A0B.A06();
                    ja = jc.A0A;
                    if (ja == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ja = ja;
                    ja.A00();
                    c2 = 4;
                    break;
                case 4:
                    jc = jc;
                    jc.A03();
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }
}

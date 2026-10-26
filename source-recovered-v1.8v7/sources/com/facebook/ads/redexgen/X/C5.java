package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.support.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class C5 implements InterfaceC1019aR, CE, InterfaceC0525Hp<C1014aM>, InterfaceC0528Hs, FU {
    public static byte[] A0c;
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public CL A07;

    @Nullable
    public InterfaceC1018aQ A08;
    public TrackGroupArray A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean[] A0L;
    public boolean[] A0M;
    public boolean[] A0N;
    public final int A0O;
    public final long A0P;
    public final Uri A0Q;
    public final F4 A0S;
    public final F5 A0T;
    public final FL A0U;
    public final HW A0V;
    public final InterfaceC0516He A0W;

    @Nullable
    public final String A0b;
    public final C1093bd A0X = new C1093bd(A07(0, 27, 54));
    public final IP A0Y = new IP();
    public final Runnable A0Z = new F2(this);
    public final Runnable A0a = new F3(this);
    public final Handler A0R = new Handler();
    public int[] A0J = new int[0];
    public C1020aS[] A0K = new C1020aS[0];
    public long A06 = -9223372036854775807L;
    public long A05 = -1;
    public long A03 = -9223372036854775807L;

    static {
        A0B();
    }

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0c, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 37);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0B() {
        A0c = new byte[]{-89, -54, -68, -65, -64, -51, -107, -96, -45, -49, -51, -68, -66, -49, -54, -51, -88, -64, -65, -60, -68, -85, -64, -51, -60, -54, -65};
    }

    public C5(Uri uri, InterfaceC0516He interfaceC0516He, CC[] ccArr, int i, FL fl, F5 f5, HW hw, @Nullable String str, int i2) {
        this.A0Q = uri;
        this.A0W = interfaceC0516He;
        this.A0O = i;
        this.A0U = fl;
        this.A0T = f5;
        this.A0V = hw;
        this.A0b = str;
        this.A0P = i2;
        this.A0S = new F4(ccArr, this);
        this.A00 = i == -1 ? 3 : i;
        fl.A03();
    }

    private int A00() {
        int iA0C = 0;
        C1020aS[] c1020aSArr = this.A0K;
        int length = c1020aSArr.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1020aSArr = c1020aSArr;
                    C1020aS sampleQueue = c1020aSArr[i];
                    iA0C += sampleQueue.A0C();
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return iA0C;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0525Hp
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int AA7(C1014aM c1014aM, long j, long j2, IOException iOException) {
        C1014aM c1014aM2 = c1014aM;
        C5 c5 = this;
        int i = 0;
        boolean z = false;
        int iA00 = 0;
        C5 c52 = c5;
        boolean zA0N = A0N(iOException);
        c52.A0U.A0H(c1014aM2.A03, 1, -1, null, 0, null, c1014aM2.A02, c52.A03, j, j2, c1014aM2.A00, iOException, zA0N);
        c5.A0E(c1014aM2);
        char c2 = zA0N ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 3;
                case 3:
                    c5 = c5;
                    c52 = c52;
                    iA00 = c5.A00();
                    i = 1;
                    if (iA00 <= c52.A02) {
                        c2 = '\n';
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
                    c1014aM2 = c1014aM2;
                    c52 = c52;
                    if (!c52.A0L(c1014aM2, iA00)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (!z) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return i;
                case '\b':
                    i = 0;
                    c2 = 7;
                    break;
                case '\t':
                    i = 2;
                    c2 = 7;
                    break;
                case '\n':
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    private long A02() {
        long jMax = Long.MIN_VALUE;
        C1020aS[] c1020aSArr = this.A0K;
        int length = c1020aSArr.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1020aSArr = c1020aSArr;
                    C1020aS sampleQueue = c1020aSArr[i];
                    jMax = Math.max(jMax, sampleQueue.A0F());
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return jMax;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        C5 c5 = this;
        String str = null;
        TrackGroup[] trackGroupArr = null;
        char c2 = 0;
        int length = 0;
        int length2 = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        C1020aS[] c1020aSArr = null;
        char c3 = !c5.A0G ? (char) 2 : (char) 5;
        while (true) {
            switch (c3) {
                case 2:
                    c5 = c5;
                    if (!c5.A0F) {
                        c3 = 3;
                        break;
                    } else {
                        c3 = 5;
                        break;
                    }
                case 3:
                    c5 = c5;
                    if (c5.A07 == null) {
                        c3 = 5;
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    c5 = c5;
                    if (!c5.A0H) {
                        c3 = 5;
                        break;
                    } else {
                        c3 = 6;
                        break;
                    }
                case 5:
                    return;
                case 6:
                    c5 = c5;
                    c1020aSArr = c5.A0K;
                    length = c1020aSArr.length;
                    c2 = 0;
                    i2 = 0;
                    c3 = 7;
                    break;
                case 7:
                    if (i2 >= length) {
                        c3 = 11;
                        break;
                    } else {
                        c3 = '\b';
                        break;
                    }
                case '\b':
                    c1020aSArr = c1020aSArr;
                    if (c1020aSArr[i2].A0G() != null) {
                        c3 = '\n';
                        break;
                    } else {
                        c3 = '\t';
                        break;
                    }
                case '\t':
                    return;
                case '\n':
                    i2++;
                    c3 = 7;
                    break;
                case 11:
                    c5 = c5;
                    c5.A0Y.A01();
                    length2 = c5.A0K.length;
                    trackGroupArr = new TrackGroup[length2];
                    c5.A0N = new boolean[length2];
                    c5.A0L = new boolean[length2];
                    c5.A0M = new boolean[length2];
                    c5.A03 = c5.A07.A65();
                    i = 0;
                    c3 = '\f';
                    break;
                case '\f':
                    z = true;
                    z = true;
                    if (i >= length2) {
                        c3 = 17;
                        break;
                    } else {
                        c3 = '\r';
                        break;
                    }
                case '\r':
                    c5 = c5;
                    trackGroupArr = trackGroupArr;
                    Format formatA0G = c5.A0K[i].A0G();
                    Format[] formatArr = new Format[z ? 1 : 0];
                    formatArr[c2] = formatA0G;
                    trackGroupArr[i] = new TrackGroup(formatArr);
                    str = formatA0G.A0O;
                    if (!C0537Ib.A0D(str)) {
                        c3 = 14;
                        break;
                    } else {
                        c3 = 15;
                        break;
                    }
                case 14:
                    str = str;
                    if (!C0537Ib.A0B(str)) {
                        c3 = 16;
                        break;
                    } else {
                        c3 = 15;
                        break;
                    }
                case 15:
                    c5 = c5;
                    c5.A0N[i] = z;
                    c5.A0A = (c5.A0A ? 1 : 0) | (z ? 1 : 0);
                    i++;
                    c3 = '\f';
                    break;
                case 16:
                    z = false;
                    c3 = 15;
                    break;
                case 17:
                    c5 = c5;
                    trackGroupArr = trackGroupArr;
                    c5.A09 = new TrackGroupArray(trackGroupArr);
                    if (c5.A0O != -1) {
                        c3 = 21;
                        break;
                    } else {
                        c3 = 18;
                        break;
                    }
                case 18:
                    c5 = c5;
                    if (c5.A05 != -1) {
                        c3 = 21;
                        break;
                    } else {
                        c3 = 19;
                        break;
                    }
                case 19:
                    c5 = c5;
                    if (c5.A07.A65() != -9223372036854775807L) {
                        c3 = 21;
                        break;
                    } else {
                        c3 = 20;
                        break;
                    }
                case 20:
                    c5 = c5;
                    c5.A00 = 6;
                    c3 = 21;
                    break;
                case 21:
                    C5 c52 = c5;
                    c52.A0F = z;
                    c52.A0T.AB1(c52.A03, c52.A07.A7n());
                    c52.A08.AAg(c52);
                    return;
            }
        }
    }

    private void A0A() {
        C1014aM c1014aM = new C1014aM(this, this.A0Q, this.A0W, this.A0S, this.A0Y);
        if (this.A0F) {
            IJ.A04(A0I());
            long j = this.A03;
            if (j != -9223372036854775807L && this.A06 >= j) {
                this.A0B = true;
                this.A06 = -9223372036854775807L;
                return;
            } else {
                c1014aM.A04(this.A07.A6t(this.A06).A00.A00, this.A06);
                this.A06 = -9223372036854775807L;
            }
        }
        this.A02 = A00();
        this.A0U.A0E(c1014aM.A03, 1, -1, null, 0, null, c1014aM.A02, this.A03, this.A0X.A04(c1014aM, this, this.A00));
    }

    private void A0C(int i) {
        if (!this.A0M[i]) {
            Format formatA01 = this.A09.A01(i).A01(0);
            this.A0U.A06(C0537Ib.A01(formatA01.A0O), formatA01, 0, null, this.A04);
            this.A0M[i] = true;
        }
    }

    private void A0D(int i) {
        C5 c5 = this;
        C1020aS[] c1020aSArr = null;
        int length = 0;
        int i2 = 0;
        char c2 = c5.A0E ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c5 = c5;
                    if (!c5.A0N[i]) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c5 = c5;
                    if (!c5.A0K[i].A0M()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    c5 = c5;
                    c5.A06 = 0L;
                    i2 = 0;
                    c5.A0E = false;
                    c5.A0D = true;
                    c5.A04 = 0L;
                    c5.A02 = 0;
                    c1020aSArr = c5.A0K;
                    length = c1020aSArr.length;
                    c2 = 6;
                    break;
                case 6:
                    if (i2 >= length) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c1020aSArr = c1020aSArr;
                    c1020aSArr[i2].A0I();
                    i2++;
                    c2 = 6;
                    break;
                case '\b':
                    C5 c52 = c5;
                    c52.A08.A9G(c52);
                    return;
            }
        }
    }

    private void A0E(C1014aM c1014aM) {
        if (this.A05 != -1) {
            return;
        }
        this.A05 = c1014aM.A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0525Hp
    /* renamed from: A0F, reason: merged with bridge method [inline-methods] */
    public final void AA6(C1014aM c1014aM, long j, long j2) {
        C5 c5 = this;
        long jA02 = 0;
        long j3 = 0;
        C5 c52 = c5;
        char c2 = c52.A03 == -9223372036854775807L ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c5 = c5;
                    jA02 = c5.A02();
                    if (jA02 != Long.MIN_VALUE) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    j3 = 0;
                    c2 = 4;
                    break;
                case 4:
                    c52 = c52;
                    c52.A03 = j3;
                    c52.A0T.AB1(c52.A03, c52.A07.A7n());
                    c2 = 5;
                    break;
                case 5:
                    C1014aM c1014aM2 = c1014aM;
                    C5 c53 = c52;
                    c53.A0U.A0G(c1014aM2.A03, 1, -1, null, 0, null, c1014aM2.A02, c53.A03, j, j2, c1014aM2.A00);
                    c5.A0E(c1014aM2);
                    c53.A0B = true;
                    c53.A08.A9G(c53);
                    return;
                case 6:
                    j3 = 10000 + jA02;
                    c2 = 4;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0525Hp
    /* renamed from: A0G, reason: merged with bridge method [inline-methods] */
    public final void AA4(C1014aM c1014aM, long j, long j2, boolean z) {
        C1014aM c1014aM2 = c1014aM;
        C5 c5 = this;
        C1020aS[] c1020aSArr = null;
        int i = 0;
        int length = 0;
        C5 c52 = c5;
        c52.A0U.A0F(c1014aM2.A03, 1, -1, null, 0, null, c1014aM2.A02, c52.A03, j, j2, c1014aM2.A00);
        char c2 = !z ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    c5 = c5;
                    c1014aM2 = c1014aM2;
                    c52 = c52;
                    c5.A0E(c1014aM2);
                    c1020aSArr = c52.A0K;
                    length = c1020aSArr.length;
                    i = 0;
                    c2 = 3;
                    break;
                case 3:
                    if (i >= length) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1020aSArr = c1020aSArr;
                    c1020aSArr[i].A0I();
                    i++;
                    c2 = 3;
                    break;
                case 5:
                    c52 = c52;
                    if (c52.A01 <= 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c52 = c52;
                    c52.A08.A9G(c52);
                    c2 = 7;
                    break;
                case 7:
                    return;
            }
        }
    }

    private boolean A0I() {
        boolean z = false;
        char c2 = this.A06 != -9223372036854775807L ? (char) 2 : (char) 4;
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

    private boolean A0J() {
        C5 c5 = this;
        boolean z = false;
        char c2 = !c5.A0D ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c5 = c5;
                    if (!c5.A0I()) {
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

    private boolean A0K(long j) {
        C5 c5 = this;
        boolean z = false;
        boolean z2 = false;
        int length = c5.A0K.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    z2 = true;
                    if (i >= length) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c5 = c5;
                    C1020aS c1020aS = c5.A0K[i];
                    c1020aS.A0J();
                    z = false;
                    if (c1020aS.A0D(j, z2, false) == -1) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (!z2) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 5:
                    c5 = c5;
                    if (!c5.A0N[i]) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    c5 = c5;
                    if (!c5.A0A) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    return z;
                case '\b':
                    i++;
                    c2 = 2;
                    break;
                case '\t':
                    z2 = false;
                    c2 = 4;
                    break;
                case '\n':
                    return z2;
            }
        }
    }

    private boolean A0L(C1014aM c1014aM, int i) {
        C5 c5 = this;
        C1020aS[] c1020aSArr = null;
        CL cl = null;
        long j = 0;
        int i2 = 0;
        int length = 0;
        char c2 = c5.A05 == -1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c5 = c5;
                    cl = c5.A07;
                    if (cl == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    cl = cl;
                    if (cl.A65() == -9223372036854775807L) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c5.A02 = i;
                    return true;
                case 5:
                    c5 = c5;
                    i2 = 0;
                    if (!c5.A0F) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c5 = c5;
                    if (!c5.A0J()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    c5.A0E = true;
                    return false;
                case '\b':
                    c5 = c5;
                    i2 = 0;
                    c5.A0D = c5.A0F;
                    j = 0;
                    c5.A04 = 0L;
                    c5.A02 = 0;
                    c1020aSArr = c5.A0K;
                    length = c1020aSArr.length;
                    c2 = '\t';
                    break;
                case '\t':
                    if (i2 >= length) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c1020aSArr = c1020aSArr;
                    c1020aSArr[i2].A0I();
                    i2++;
                    c2 = '\t';
                    break;
                case 11:
                    c1014aM.A04(j, j);
                    return true;
            }
        }
    }

    public static boolean A0N(IOException iOException) {
        return iOException instanceof C1026aY;
    }

    public final int A0O(int skipCount, long j) {
        C5 c5 = this;
        int iA0D = 0;
        C1020aS c1020aS = null;
        char c2 = c5.A0J() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 0;
                case 3:
                    c5 = c5;
                    c1020aS = c5.A0K[skipCount];
                    if (!c5.A0B) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1020aS = c1020aS;
                    if (j <= c1020aS.A0F()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1020aS = c1020aS;
                    iA0D = c1020aS.A0A();
                    c2 = 6;
                    break;
                case 6:
                    if (iA0D <= 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c5 = c5;
                    c5.A0C(skipCount);
                    c2 = '\b';
                    break;
                case '\b':
                    return iA0D;
                case '\t':
                    c5 = c5;
                    c5.A0D(skipCount);
                    c2 = '\b';
                    break;
                case '\n':
                    c1020aS = c1020aS;
                    iA0D = c1020aS.A0D(j, true, true);
                    if (iA0D != -1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    iA0D = 0;
                    c2 = 6;
                    break;
            }
        }
    }

    public final int A0P(int i, A9 a9, YT yt, boolean z) {
        A9 a92 = a9;
        YT yt2 = yt;
        C5 c5 = this;
        int iA0E = 0;
        char c2 = c5.A0J() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return -3;
                case 3:
                    c5 = c5;
                    a92 = a92;
                    yt2 = yt2;
                    iA0E = c5.A0K[i].A0E(a92, yt2, z, c5.A0B, c5.A04);
                    if (iA0E != -4) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c5 = c5;
                    c5.A0C(i);
                    c2 = 5;
                    break;
                case 5:
                    return iA0E;
                case 6:
                    if (iA0E != -3) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c5 = c5;
                    c5.A0D(i);
                    c2 = 5;
                    break;
            }
        }
    }

    public final void A0Q() throws IOException {
        this.A0X.A06(this.A00);
    }

    public final void A0R() {
        C5 c5 = this;
        C1020aS[] c1020aSArr = null;
        int i = 0;
        int length = 0;
        char c2 = c5.A0F ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c5 = c5;
                    c1020aSArr = c5.A0K;
                    length = c1020aSArr.length;
                    i = 0;
                    c2 = 3;
                    break;
                case 3:
                    if (i >= length) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1020aSArr = c1020aSArr;
                    c1020aSArr[i].A0H();
                    i++;
                    c2 = 3;
                    break;
                case 5:
                    C5 c52 = c5;
                    c52.A0X.A07(c52);
                    c52.A0R.removeCallbacksAndMessages(null);
                    c52.A08 = null;
                    c52.A0G = true;
                    c52.A0U.A04();
                    return;
            }
        }
    }

    public final boolean A0S(int i) {
        C5 c5 = this;
        boolean z = false;
        char c2 = !c5.A0J() ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c5 = c5;
                    if (!c5.A0B) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c5 = c5;
                    if (!c5.A0K[i].A0M()) {
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

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final boolean A49(long j) {
        C5 c5 = this;
        boolean zA02 = false;
        char c2 = !c5.A0B ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c5 = c5;
                    if (!c5.A0E) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 3:
                    c5 = c5;
                    if (!c5.A0F) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c5 = c5;
                    if (c5.A01 != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    c5 = c5;
                    zA02 = c5.A0Y.A02();
                    if (!c5.A0X.A08()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    c5 = c5;
                    c5.A0A();
                    zA02 = true;
                    c2 = '\b';
                    break;
                case '\b':
                    return zA02;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final void A4m(long j, boolean z) {
        C5 c5 = this;
        int length = c5.A0K.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c5 = c5;
                    c5.A0K[i].A0K(j, z, c5.A0L[i]);
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CE
    public final void A4w() {
        this.A0H = true;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final long A5J(long j, AX ax) {
        if (!this.A07.A7n()) {
            return 0L;
        }
        CK ckA6t = this.A07.A6t(j);
        return C0560Iy.A0J(j, ax, ckA6t.A00.A01, ckA6t.A01.A01);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final long A5Y() {
        C5 c5 = this;
        long j = 0;
        long largestQueuedTimestampUs = 0;
        int i = 0;
        int length = 0;
        char c2 = c5.A0B ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return Long.MIN_VALUE;
                case 3:
                    c5 = c5;
                    if (!c5.A0I()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return c5.A06;
                case 5:
                    c5 = c5;
                    if (!c5.A0A) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c5 = c5;
                    largestQueuedTimestampUs = Long.MAX_VALUE;
                    length = c5.A0K.length;
                    i = 0;
                    c2 = 7;
                    break;
                case 7:
                    if (i >= length) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c5 = c5;
                    if (!c5.A0N[i]) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c5 = c5;
                    largestQueuedTimestampUs = Math.min(largestQueuedTimestampUs, c5.A0K[i].A0F());
                    c2 = '\n';
                    break;
                case '\n':
                    i++;
                    c2 = 7;
                    break;
                case 11:
                    c5 = c5;
                    largestQueuedTimestampUs = c5.A02();
                    c2 = '\f';
                    break;
                case '\f':
                    if (largestQueuedTimestampUs != Long.MIN_VALUE) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c5 = c5;
                    j = c5.A04;
                    c2 = 14;
                    break;
                case 14:
                    return j;
                case 15:
                    j = largestQueuedTimestampUs;
                    c2 = 14;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final long A6a() {
        C5 c5 = this;
        long jA5Y = 0;
        char c2 = c5.A01 == 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    jA5Y = Long.MIN_VALUE;
                    c2 = 3;
                    break;
                case 3:
                    return jA5Y;
                case 4:
                    c5 = c5;
                    jA5Y = c5.A5Y();
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final TrackGroupArray A7C() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final void A8W() throws IOException {
        A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0528Hs
    public final void AAB() {
        C1020aS[] c1020aSArr = this.A0K;
        int length = c1020aSArr.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1020aSArr = c1020aSArr;
                    C1020aS sampleQueue = c1020aSArr[i];
                    sampleQueue.A0I();
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    this.A0S.A03();
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final void ABI(Format format) {
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final void ABo(InterfaceC1018aQ interfaceC1018aQ, long j) {
        this.A08 = interfaceC1018aQ;
        this.A0Y.A02();
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final long AC7() {
        C5 c5 = this;
        char c2 = !c5.A0C ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c5 = c5;
                    c5.A0U.A05();
                    c5.A0C = true;
                    c2 = 3;
                    break;
                case 3:
                    c5 = c5;
                    if (!c5.A0D) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c5 = c5;
                    if (!c5.A0B) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    c5 = c5;
                    if (c5.A00() <= c5.A02) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    C5 c52 = c5;
                    c52.A0D = false;
                    return c52.A04;
                case 7:
                    return -9223372036854775807L;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final void ACF(long j) {
    }

    @Override // com.facebook.ads.redexgen.X.CE
    public final void ACq(CL cl) {
        this.A07 = cl;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final long ACt(long j) {
        if (!this.A07.A7n()) {
            j = 0;
        }
        this.A04 = j;
        this.A0D = false;
        if (!A0I() && A0K(j)) {
            return j;
        }
        this.A0E = false;
        this.A06 = j;
        this.A0B = false;
        if (this.A0X.A08()) {
            this.A0X.A05();
        } else {
            for (C1020aS sampleQueue : this.A0K) {
                sampleQueue.A0I();
            }
        }
        return j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final long ACu(HQ[] hqArr, boolean[] zArr, FV[] fvArr, boolean[] zArr2, long j) {
        int i;
        IJ.A04(this.A0F);
        int i2 = this.A01;
        int i3 = 0;
        while (true) {
            i = 0;
            if (i3 >= hqArr.length) {
                break;
            }
            if (fvArr[i3] != null && (hqArr[i3] == null || !zArr[i3])) {
                int i4 = ((C1015aN) fvArr[i3]).A00;
                IJ.A04(this.A0L[i4]);
                this.A01--;
                this.A0L[i4] = false;
                fvArr[i3] = null;
            }
            i3++;
        }
        boolean z = !this.A0I ? j == 0 : i2 != 0;
        for (int i5 = 0; i5 < hqArr.length; i5++) {
            if (fvArr[i5] == null && hqArr[i5] != null) {
                HQ hq = hqArr[i5];
                IJ.A04(hq.length() == 1);
                IJ.A04(hq.A6P(0) == 0);
                int iA00 = this.A09.A00(hq.A7B());
                IJ.A04(!this.A0L[iA00]);
                this.A01++;
                this.A0L[iA00] = true;
                fvArr[i5] = new C1015aN(this, iA00);
                zArr2[i5] = true;
                if (!z) {
                    C1020aS c1020aS = this.A0K[iA00];
                    c1020aS.A0J();
                    z = c1020aS.A0D(j, true, true) == -1 && c1020aS.A0B() != 0;
                }
            }
        }
        if (this.A01 == 0) {
            this.A0E = false;
            this.A0D = false;
            if (this.A0X.A08()) {
                C1020aS[] c1020aSArr = this.A0K;
                int length = c1020aSArr.length;
                while (i < length) {
                    c1020aSArr[i].A0H();
                    i++;
                }
                this.A0X.A05();
            } else {
                C1020aS[] c1020aSArr2 = this.A0K;
                int length2 = c1020aSArr2.length;
                while (i < length2) {
                    c1020aSArr2[i].A0I();
                    i++;
                }
            }
        } else if (z) {
            j = ACt(j);
            for (int i6 = 0; i6 < fvArr.length; i6++) {
                if (fvArr[i6] != null) {
                    zArr2[i6] = true;
                }
            }
        }
        this.A0I = true;
        return j;
    }

    @Override // com.facebook.ads.redexgen.X.CE
    public final CO ADd(int i, int i2) {
        C5 c5 = this;
        int length = c5.A0K.length;
        int i3 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 >= length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c5 = c5;
                    if (c5.A0J[i3] != i) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return c5.A0K[i3];
                case 5:
                    i3++;
                    c2 = 2;
                    break;
                case 6:
                    C5 c52 = c5;
                    C1020aS c1020aS = new C1020aS(c52.A0V);
                    c1020aS.A0L(c52);
                    c52.A0J = Arrays.copyOf(c52.A0J, length + 1);
                    c52.A0J[length] = i;
                    c52.A0K = (C1020aS[]) Arrays.copyOf(c52.A0K, length + 1);
                    c52.A0K[length] = c1020aS;
                    return c1020aS;
            }
        }
    }
}

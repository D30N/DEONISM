package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: assets/audience_network.dex */
public final class EM implements YA {
    public static byte[] A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;

    @Nullable
    public C03479w A05;
    public AG A06;
    public AH A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final Handler A0D;
    public final EL A0E;
    public final AZ A0F;
    public final C0351Aa A0G;
    public final HT A0H;
    public final HU A0I;
    public final ArrayDeque<A0> A0J;
    public final CopyOnWriteArraySet<AK> A0K;
    public final YC[] A0L;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0M, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 27);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A0M = new byte[]{113, 76, 91, 100, 88, 85, 77, 81, 70, 125, 89, 68, 88, 85, 40, 83, 0, 55, 62, 55, 51, 33, 55, 114, 54, 17, 22, 11, 95, 46, 14, 51, 36, 27, 39, 42, 50, 46, 57, 7, 34, 41, 100, 121, 101, 115, 101, Byte.MAX_VALUE, 15, 116, 55, 33, 33, 47, 16, 43, 100, 45, 35, 42, 43, 54, 33, 32, 100, 38, 33, 39, 37, 49, 55, 33, 100, 37, 42, 100, 37, 32, 100, 45, 55, 100, 52, 40, 37, 61, 45, 42, 35};
    }

    @SuppressLint({"HandlerLeak"})
    public EM(YC[] ycArr, HT ht, AB ab, IM im) {
        Log.i(A02(0, 13, 47), A02(24, 5, 100) + Integer.toHexString(System.identityHashCode(this)) + A02(48, 2, 52) + A02(30, 18, 80) + A02(13, 3, 19) + C0560Iy.A03 + A02(29, 1, 104));
        IJ.A04(ycArr.length > 0);
        this.A0L = (YC[]) IJ.A01(ycArr);
        this.A0H = (HT) IJ.A01(ht);
        this.A0A = false;
        this.A03 = 0;
        this.A0B = false;
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0I = new HU(new AV[ycArr.length], new HQ[ycArr.length], null);
        this.A0G = new C0351Aa();
        this.A0F = new AZ();
        this.A07 = AH.A04;
        final Looper looperMyLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
        this.A0C = new Handler(looperMyLooper) { // from class: com.facebook.ads.redexgen.X.9z
            @Override // android.os.Handler
            public final void handleMessage(Message message) throws Throwable {
                HandlerC03509z handlerC03509z = this;
                HandlerC03509z handlerC03509z2 = null;
                char c2 = C0601Ko.A02(handlerC03509z) ? (char) 2 : (char) 3;
                while (true) {
                    switch (c2) {
                        case 2:
                            return;
                        case 3:
                            handlerC03509z = handlerC03509z;
                            handlerC03509z2 = handlerC03509z;
                            c2 = 4;
                            break;
                        case 4:
                            try {
                                handlerC03509z2 = handlerC03509z2;
                                handlerC03509z2.A00.A0A(message);
                                return;
                            } catch (Throwable th) {
                                C0601Ko.A00(th, handlerC03509z2);
                                return;
                            }
                    }
                }
            }
        };
        this.A06 = new AG(AbstractC0352Ab.A00, 0L, TrackGroupArray.A03, this.A0I);
        this.A0J = new ArrayDeque<>();
        this.A0E = new EL(ycArr, ht, this.A0I, ab, this.A0A, this.A03, this.A0B, this.A0C, this, im);
        Looper eventLooper = this.A0E.A0w();
        this.A0D = new Handler(eventLooper);
    }

    private long A00(long j) {
        long jA01 = C03419q.A01(j);
        if (!this.A06.A04.A01()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            return jA01 + this.A0F.A08();
        }
        return jA01;
    }

    private AG A01(boolean z, boolean z2, int i) {
        if (z) {
            this.A01 = 0;
            this.A00 = 0;
            this.A04 = 0L;
        } else {
            this.A01 = A5x();
            this.A00 = A07();
            this.A04 = A5u();
        }
        return new AG(z2 ? AbstractC0352Ab.A00 : this.A06.A03, z2 ? null : this.A06.A07, this.A06.A04, this.A06.A02, this.A06.A01, i, false, z2 ? TrackGroupArray.A03 : this.A06.A05, z2 ? this.A0I : this.A06.A06);
    }

    private void A04(AG ag, int i, boolean z, int timelineChangeReason) {
        AG agA04 = ag;
        EM em = this;
        int i2 = 0;
        boolean z2 = false;
        em.A02 -= i;
        char c2 = em.A02 == 0 ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    agA04 = agA04;
                    if (agA04.A02 != -9223372036854775807L) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    AG ag2 = agA04;
                    agA04 = ag2.A04(ag2.A04, 0L, ag2.A01);
                    c2 = 4;
                    break;
                case 4:
                    em = em;
                    z2 = false;
                    if (!em.A06.A03.A0E()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    em = em;
                    if (!em.A08) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    agA04 = agA04;
                    if (!agA04.A03.A0E()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    em = em;
                    z2 = false;
                    em.A00 = 0;
                    em.A01 = 0;
                    em.A04 = 0L;
                    c2 = '\b';
                    break;
                case '\b':
                    em = em;
                    if (!em.A08) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    i2 = 0;
                    c2 = '\n';
                    break;
                case '\n':
                    em = em;
                    agA04 = agA04;
                    boolean z3 = em.A09;
                    em.A08 = z2;
                    em.A09 = z2;
                    em.A05(agA04, z, timelineChangeReason, i2, z3, false);
                    c2 = 11;
                    break;
                case 11:
                    return;
                case '\f':
                    i2 = 2;
                    c2 = '\n';
                    break;
            }
        }
    }

    private void A05(AG ag, boolean z, int i, int i2, boolean z2, boolean z3) {
        boolean z4 = !this.A0J.isEmpty();
        this.A0J.addLast(new A0(ag, this.A06, this.A0K, this.A0H, z, i, i2, z2, this.A0A, z3));
        this.A06 = ag;
        if (z4) {
            return;
        }
        while (!this.A0J.isEmpty()) {
            this.A0J.peekFirst().A00();
            this.A0J.removeFirst();
        }
    }

    private boolean A06() {
        EM em = this;
        boolean z = false;
        char c2 = !em.A06.A03.A0E() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    em = em;
                    if (em.A02 <= 0) {
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

    public final int A07() {
        if (A06()) {
            return this.A00;
        }
        return this.A06.A04.A02;
    }

    public final void A08(int i) {
        A09(i, -9223372036854775807L);
    }

    public final void A09(int i, long j) {
        EM em = this;
        long j2 = 0;
        Iterator<AK> it = null;
        long jA00 = 0;
        int i2 = 0;
        long j3 = 0;
        AbstractC0352Ab abstractC0352Ab = em.A06.A03;
        char c2 = i >= 0 ? (char) 2 : (char) 19;
        while (true) {
            switch (c2) {
                case 2:
                    abstractC0352Ab = abstractC0352Ab;
                    if (!abstractC0352Ab.A0E()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    abstractC0352Ab = abstractC0352Ab;
                    if (i >= abstractC0352Ab.A01()) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    em = em;
                    i2 = 1;
                    em.A09 = true;
                    em.A02++;
                    if (!em.A0B()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    EM em2 = em;
                    Log.w(A02(0, 13, 47), A02(50, 39, 95));
                    em2.A0C.obtainMessage(0, i2, -1, em2.A06).sendToTarget();
                    return;
                case 6:
                    em = em;
                    abstractC0352Ab = abstractC0352Ab;
                    em.A01 = i;
                    j2 = -9223372036854775807L;
                    if (!abstractC0352Ab.A0E()) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (j != j2) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    j3 = 0;
                    c2 = '\t';
                    break;
                case '\t':
                    em = em;
                    em.A04 = j3;
                    em.A00 = 0;
                    c2 = '\n';
                    break;
                case '\n':
                    em = em;
                    abstractC0352Ab = abstractC0352Ab;
                    em.A0E.A0y(abstractC0352Ab, i, C03419q.A00(j));
                    it = em.A0K.iterator();
                    c2 = 11;
                    break;
                case 11:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    it = it;
                    AK listener = it.next();
                    listener.AAe(i2);
                    c2 = 11;
                    break;
                case '\r':
                    j3 = j;
                    c2 = '\t';
                    break;
                case 14:
                    if (j != j2) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    em = em;
                    abstractC0352Ab = abstractC0352Ab;
                    jA00 = abstractC0352Ab.A0B(i, em.A0G).A01();
                    c2 = 16;
                    break;
                case 16:
                    em = em;
                    abstractC0352Ab = abstractC0352Ab;
                    Pair<Integer, Long> pairA07 = abstractC0352Ab.A07(em.A0G, em.A0F, i, jA00);
                    em.A04 = C03419q.A01(jA00);
                    em.A00 = ((Integer) pairA07.first).intValue();
                    c2 = '\n';
                    break;
                case 17:
                    jA00 = C03419q.A00(j);
                    c2 = 16;
                    break;
                case 18:
                    return;
                case 19:
                    throw new AA(abstractC0352Ab, i, j);
            }
        }
    }

    public final void A0A(Message message) {
        EM em = this;
        int i = 0;
        AH ah = null;
        Iterator<AK> it = null;
        Iterator<AK> it2 = null;
        AG ag = null;
        C03479w c03479w = null;
        int i2 = message.what;
        boolean z = true;
        char c2 = i2 != 0 ? (char) 2 : '\f';
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 == z) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i2 != 2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    em = em;
                    message = message;
                    c03479w = (C03479w) message.obj;
                    em.A05 = c03479w;
                    it2 = em.A0K.iterator();
                    c2 = 5;
                    break;
                case 5:
                    it2 = it2;
                    if (!it2.hasNext()) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c03479w = c03479w;
                    it2 = it2;
                    it2.next().AAa(c03479w);
                    c2 = 5;
                    break;
                case 7:
                    throw new IllegalStateException();
                case '\b':
                    em = em;
                    message = message;
                    ah = (AH) message.obj;
                    if (!em.A07.equals(ah)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case '\t':
                    em = em;
                    ah = ah;
                    em.A07 = ah;
                    it = em.A0K.iterator();
                    c2 = '\n';
                    break;
                case '\n':
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    ah = ah;
                    it = it;
                    it.next().AAY(ah);
                    c2 = '\n';
                    break;
                case '\f':
                    message = message;
                    ag = (AG) message.obj;
                    i = message.arg1;
                    if (message.arg2 == -1) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    em = em;
                    message = message;
                    ag = ag;
                    em.A04(ag, i, z, message.arg2);
                    c2 = 14;
                    break;
                case 14:
                    return;
                case 15:
                    z = false;
                    c2 = '\r';
                    break;
            }
        }
    }

    public final boolean A0B() {
        EM em = this;
        boolean z = false;
        char c2 = !em.A06() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    em = em;
                    if (!em.A06.A04.A01()) {
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

    @Override // com.facebook.ads.redexgen.X.AP
    public final void A3G(AK ak) {
        this.A0K.add(ak);
    }

    @Override // com.facebook.ads.redexgen.X.YA
    public final AS A4K(AR ar) {
        return new AS(this.A0E, ar, this.A06.A03, A5x(), this.A0D);
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final int A5W() {
        long jA5X = A5X();
        long jA64 = A64();
        int iA06 = 100;
        char c2 = jA5X != -9223372036854775807L ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (jA64 != -9223372036854775807L) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    iA06 = 0;
                    c2 = 4;
                    break;
                case 4:
                    return iA06;
                case 5:
                    if (jA64 != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 6:
                    iA06 = C0560Iy.A06((int) ((100 * jA5X) / jA64), 0, iA06);
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final long A5X() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A09);
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final long A5p() {
        if (A0B()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            return this.A0F.A08() + C03419q.A01(this.A06.A01);
        }
        return A5u();
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final int A5r() {
        EM em = this;
        int i = 0;
        char c2 = em.A0B() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    em = em;
                    i = em.A06.A04.A00;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    i = -1;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final int A5s() {
        EM em = this;
        int i = 0;
        char c2 = em.A0B() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    em = em;
                    i = em.A06.A04.A01;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    i = -1;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final long A5u() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final AbstractC0352Ab A5w() {
        return this.A06.A03;
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final int A5x() {
        if (A06()) {
            return this.A01;
        }
        return this.A06.A03.A09(this.A06.A04.A02, this.A0F).A00;
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final long A64() {
        EM em = this;
        AbstractC0352Ab abstractC0352Ab = em.A06.A03;
        char c2 = abstractC0352Ab.A0E() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return -9223372036854775807L;
                case 3:
                    em = em;
                    if (!em.A0B()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    EM em2 = em;
                    F8 f8 = em2.A06.A04;
                    abstractC0352Ab.A09(f8.A02, em2.A0F);
                    long adDurationUs = em2.A0F.A0A(f8.A00, f8.A01);
                    return C03419q.A01(adDurationUs);
                case 5:
                    EM em3 = em;
                    return abstractC0352Ab.A0B(em3.A5x(), em3.A0G).A02();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final boolean A6l() {
        return this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.YA
    public final void ABp(FA fa, boolean z, boolean z2) {
        this.A05 = null;
        AG agA01 = A01(z, z2, 2);
        this.A08 = true;
        this.A02++;
        this.A0E.A0z(fa, z, z2);
        A05(agA01, false, 4, 1, false, false);
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void ACJ() {
        StringBuilder sb = new StringBuilder();
        sb.append(A02(16, 8, 73));
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(A02(48, 2, 52));
        sb.append(A02(30, 18, 80));
        String strA02 = A02(13, 3, 19);
        sb.append(strA02);
        sb.append(C0560Iy.A03);
        sb.append(strA02);
        sb.append(A6.A00());
        sb.append(A02(29, 1, 104));
        Log.i(A02(0, 13, 47), sb.toString());
        this.A0E.A0x();
        this.A0C.removeCallbacksAndMessages(null);
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void ACr(long j) {
        A09(A5x(), j);
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void ACs() {
        A08(A5x());
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void AD8(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            this.A0E.A10(z);
            A05(this.A06, false, 4, 1, false, true);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void ADU(boolean z) {
        if (z) {
            this.A05 = null;
        }
        AG agA01 = A01(z, z, 1);
        this.A02++;
        this.A0E.A11(z);
        A05(agA01, false, 4, 1, false, false);
    }
}

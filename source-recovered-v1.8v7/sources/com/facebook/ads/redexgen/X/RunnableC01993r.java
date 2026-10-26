package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.ads.redexgen.X.3r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class RunnableC01993r implements Runnable {
    public static Comparator<C01983q> A04;
    public static byte[] A05;
    public static final ThreadLocal<RunnableC01993r> A06;
    public long A00;
    public long A01;
    public ArrayList<C0452Eq> A02 = new ArrayList<>();
    public ArrayList<C01983q> A03 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 84);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A05 = new byte[]{-34, -30, -84, -36, -2, -15, -14, -15, 0, -17, -12, -45, -41, -95, -49, -26, -12, -11, -26, -27, -95, -47, -13, -26, -25, -26, -11, -28, -23};
    }

    static {
        A03();
        A06 = new ThreadLocal<>();
        A04 = new Comparator<C01983q>() { // from class: com.facebook.ads.redexgen.X.3p
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(C01983q c01983q, C01983q c01983q2) {
                boolean z = false;
                boolean z2 = false;
                int i = 0;
                int i2 = 0;
                int i3 = 1;
                char c2 = c01983q.A03 == null ? (char) 2 : '\n';
                while (true) {
                    switch (c2) {
                        case 2:
                            z = true;
                            c2 = 3;
                            break;
                        case 3:
                            c01983q2 = c01983q2;
                            if (c01983q2.A03 != null) {
                                c2 = '\t';
                                break;
                            } else {
                                c2 = 4;
                                break;
                            }
                        case 4:
                            z2 = true;
                            c2 = 5;
                            break;
                        case 5:
                            if (z == z2) {
                                c2 = 11;
                                break;
                            } else {
                                c2 = 6;
                                break;
                            }
                        case 6:
                            c01983q = c01983q;
                            if (c01983q.A03 != null) {
                                c2 = '\b';
                                break;
                            } else {
                                c2 = 7;
                                break;
                            }
                        case 7:
                            return i3;
                        case '\b':
                            i3 = -1;
                            c2 = 7;
                            break;
                        case '\t':
                            z2 = false;
                            c2 = 5;
                            break;
                        case '\n':
                            z = false;
                            c2 = 3;
                            break;
                        case 11:
                            c01983q = c01983q;
                            c01983q2 = c01983q2;
                            if (c01983q.A04 == c01983q2.A04) {
                                c2 = 15;
                                break;
                            } else {
                                c2 = '\f';
                                break;
                            }
                        case '\f':
                            c01983q = c01983q;
                            if (!c01983q.A04) {
                                c2 = 14;
                                break;
                            } else {
                                c2 = '\r';
                                break;
                            }
                        case '\r':
                            i3 = -1;
                            c2 = 14;
                            break;
                        case 14:
                            return i3;
                        case 15:
                            c01983q = c01983q;
                            c01983q2 = c01983q2;
                            i2 = c01983q2.A02 - c01983q.A02;
                            if (i2 == 0) {
                                c2 = 17;
                                break;
                            } else {
                                c2 = 16;
                                break;
                            }
                        case 16:
                            return i2;
                        case 17:
                            c01983q = c01983q;
                            c01983q2 = c01983q2;
                            i = c01983q.A00 - c01983q2.A00;
                            if (i == 0) {
                                c2 = 19;
                                break;
                            } else {
                                c2 = 18;
                                break;
                            }
                        case 18:
                            return i;
                        case 19:
                            return 0;
                    }
                }
            }
        };
    }

    private C4Y A00(C0452Eq c0452Eq, int i, long j) {
        C4O c4o = null;
        boolean z = false;
        C4Y c4yA0I = null;
        char c2 = A08(c0452Eq, i) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (C4Y) null;
                case 3:
                    c0452Eq = c0452Eq;
                    c4o = c0452Eq.A0r;
                    z = false;
                    c2 = 4;
                case 4:
                    c0452Eq = c0452Eq;
                    c0452Eq.A1J();
                    c4yA0I = c4o.A0I(i, z, j);
                    if (c4yA0I == null) {
                        break;
                    } else {
                        c2 = c4yA0I.A0a() ? '\t' : '\r';
                    }
                case '\t':
                    try {
                        c4yA0I = c4yA0I;
                        c2 = !c4yA0I.A0b() ? (char) 11 : '\r';
                    } catch (Throwable th) {
                        c0452Eq.A1o(z);
                        throw th;
                    }
                case 11:
                    c4yA0I = c4yA0I;
                    c4o.A0X(c4yA0I.A0H);
                    break;
                case '\r':
                    c4yA0I = c4yA0I;
                    c4o.A0d(c4yA0I, z);
                    break;
            }
        }
        c0452Eq.A1o(z);
        return c4yA0I;
    }

    private void A02() {
        RunnableC01993r runnableC01993r = this;
        C01983q c01983q = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        C0452Eq c0452Eq = null;
        int j = 0;
        boolean z = false;
        C0814Sz c0814Sz = null;
        int iAbs = 0;
        C0452Eq c0452Eq2 = null;
        int size = runnableC01993r.A02.size();
        int i4 = 0;
        int i5 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i5 >= size) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    runnableC01993r = runnableC01993r;
                    c0452Eq2 = runnableC01993r.A02.get(i5);
                    if (c0452Eq2.getWindowVisibility() != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq2 = c0452Eq2;
                    c0452Eq2.A02.A04(c0452Eq2, false);
                    i4 += c0452Eq2.A02.A00;
                    c2 = 5;
                    break;
                case 5:
                    i5++;
                    c2 = 2;
                    break;
                case 6:
                    runnableC01993r = runnableC01993r;
                    runnableC01993r.A03.ensureCapacity(i4);
                    i = 0;
                    j = 0;
                    c2 = 7;
                    break;
                case 7:
                    if (j >= size) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    runnableC01993r = runnableC01993r;
                    c0452Eq = runnableC01993r.A02.get(j);
                    if (c0452Eq.getWindowVisibility() == 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    j++;
                    c2 = 7;
                    break;
                case '\n':
                    c0452Eq = c0452Eq;
                    c0814Sz = c0452Eq.A02;
                    iAbs = Math.abs(c0814Sz.A01) + Math.abs(c0814Sz.A02);
                    i2 = 0;
                    c2 = 11;
                    break;
                case 11:
                    c0814Sz = c0814Sz;
                    if (i2 >= c0814Sz.A00 * 2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    runnableC01993r = runnableC01993r;
                    if (i < runnableC01993r.A03.size()) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    runnableC01993r = runnableC01993r;
                    c01983q = new C01983q();
                    runnableC01993r.A03.add(c01983q);
                    c2 = 14;
                    break;
                case 14:
                    c0814Sz = c0814Sz;
                    i3 = c0814Sz.A03[i2 + 1];
                    if (i3 > iAbs) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    z = true;
                    c2 = 16;
                    break;
                case 16:
                    c0452Eq = c0452Eq;
                    c0814Sz = c0814Sz;
                    c01983q = c01983q;
                    c01983q.A04 = z;
                    c01983q.A02 = iAbs;
                    c01983q.A00 = i3;
                    c01983q.A03 = c0452Eq;
                    c01983q.A01 = c0814Sz.A03[i2];
                    i++;
                    i2 += 2;
                    c2 = 11;
                    break;
                case 17:
                    z = false;
                    c2 = 16;
                    break;
                case 18:
                    runnableC01993r = runnableC01993r;
                    c01983q = runnableC01993r.A03.get(i);
                    c2 = 14;
                    break;
                case 19:
                    Collections.sort(runnableC01993r.A03, A04);
                    return;
            }
        }
    }

    private void A04(long j) {
        RunnableC01993r runnableC01993r = this;
        C01983q c01983q = null;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    runnableC01993r = runnableC01993r;
                    if (i >= runnableC01993r.A03.size()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    runnableC01993r = runnableC01993r;
                    c01983q = runnableC01993r.A03.get(i);
                    if (c01983q.A03 != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    runnableC01993r = runnableC01993r;
                    c01983q = c01983q;
                    runnableC01993r.A06(c01983q, j);
                    c01983q.A00();
                    i++;
                    c2 = 2;
                    break;
            }
        }
    }

    private final void A05(long j) {
        A02();
        A04(j);
    }

    private void A06(C01983q c01983q, long j) {
        RunnableC01993r runnableC01993r = this;
        C4Y c4yA00 = null;
        long j2 = 0;
        char c2 = c01983q.A04 ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    j2 = Long.MAX_VALUE;
                    c2 = 3;
                    break;
                case 3:
                    runnableC01993r = runnableC01993r;
                    c01983q = c01983q;
                    c4yA00 = runnableC01993r.A00(c01983q.A03, c01983q.A01, j2);
                    if (c4yA00 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4yA00 = c4yA00;
                    if (c4yA00.A09 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c4yA00 = c4yA00;
                    if (!c4yA00.A0a()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c4yA00 = c4yA00;
                    if (!c4yA00.A0b()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    runnableC01993r = runnableC01993r;
                    c4yA00 = c4yA00;
                    runnableC01993r.A07(c4yA00.A09.get(), j);
                    c2 = '\b';
                    break;
                case '\b':
                    return;
                case '\t':
                    j2 = j;
                    c2 = 3;
                    break;
            }
        }
    }

    private void A07(@Nullable C0452Eq c0452Eq, long j) {
        int i = 0;
        C0814Sz c0814Sz = null;
        char c2 = c0452Eq == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0C) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A01.A06() == 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0452Eq = c0452Eq;
                    c0452Eq.A1M();
                    c2 = 6;
                    break;
                case 6:
                    c0452Eq = c0452Eq;
                    c0814Sz = c0452Eq.A02;
                    c0814Sz.A04(c0452Eq, true);
                    if (c0814Sz.A00 == 0) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    C2I.A01(A01(11, 18, 45));
                    c0452Eq.A0s.A05(c0452Eq.A04);
                    i = 0;
                    c2 = '\r';
                    break;
                case '\r':
                    c0814Sz = c0814Sz;
                    if (i >= c0814Sz.A00 * 2) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    try {
                        c0814Sz = c0814Sz;
                        A00(c0452Eq, c0814Sz.A03[i], j);
                        i += 2;
                        c2 = '\r';
                        break;
                    } catch (Throwable th) {
                        C2I.A00();
                        throw th;
                    }
                case 20:
                    C2I.A00();
                    c2 = 21;
                    break;
                case 21:
                    return;
            }
        }
    }

    public static boolean A08(C0452Eq c0452Eq, int i) {
        C4Y holder = null;
        int iA06 = c0452Eq.A01.A06();
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= iA06) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    holder = C0452Eq.A0E(c0452Eq.A01.A0A(i2));
                    if (holder.A03 != i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    holder = holder;
                    if (!holder.A0b()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    return true;
                case 6:
                    i2++;
                    c2 = 2;
                    break;
                case 7:
                    return false;
            }
        }
    }

    public final void A09(C0452Eq c0452Eq) {
        this.A02.add(c0452Eq);
    }

    public final void A0A(C0452Eq c0452Eq) {
        this.A02.remove(c0452Eq);
    }

    public final void A0B(C0452Eq c0452Eq, int i, int i2) {
        RunnableC01993r runnableC01993r = this;
        char c2 = c0452Eq.isAttachedToWindow() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    runnableC01993r = runnableC01993r;
                    if (runnableC01993r.A01 != 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    runnableC01993r = runnableC01993r;
                    c0452Eq = c0452Eq;
                    runnableC01993r.A01 = c0452Eq.getNanoTime();
                    c0452Eq.post(runnableC01993r);
                    c2 = 4;
                    break;
                case 4:
                    c0452Eq.A02.A03(i, i2);
                    return;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC01993r runnableC01993r = this;
        int i = 0;
        int i2 = 0;
        C0452Eq c0452Eq = null;
        long jMax = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    C2I.A01(A01(0, 11, 56));
                    if (runnableC01993r.A02.isEmpty()) {
                        c2 = 7;
                    } else {
                        c2 = '\b';
                        continue;
                    }
                case 7:
                    runnableC01993r.A01 = 0L;
                    C2I.A00();
                    return;
                case '\b':
                    runnableC01993r = runnableC01993r;
                    i = runnableC01993r.A02.size();
                    jMax = 0;
                    i2 = 0;
                    c2 = 11;
                    continue;
                case 11:
                    if (i2 < i) {
                        c2 = '\f';
                    } else {
                        c2 = 21;
                        continue;
                    }
                case '\f':
                    try {
                        runnableC01993r = runnableC01993r;
                        c0452Eq = runnableC01993r.A02.get(i2);
                        if (c0452Eq.getWindowVisibility() == 0) {
                            c2 = 17;
                        } else {
                            c2 = 20;
                            continue;
                        }
                    } finally {
                    }
                case 17:
                    c0452Eq = c0452Eq;
                    jMax = Math.max(c0452Eq.getDrawingTime(), jMax);
                    c2 = 20;
                    continue;
                case 20:
                    i2++;
                    c2 = 11;
                    continue;
                case 21:
                    if (jMax == 0) {
                        c2 = 22;
                    } else {
                        c2 = 23;
                        continue;
                    }
                case 22:
                    runnableC01993r.A01 = 0L;
                    C2I.A00();
                    return;
                case 23:
                    long nanos = TimeUnit.MILLISECONDS.toNanos(jMax);
                    long latestFrameVsyncMs = runnableC01993r.A00;
                    runnableC01993r.A05(nanos + latestFrameVsyncMs);
                    return;
            }
            runnableC01993r.A01 = 0L;
            C2I.A00();
        }
    }
}

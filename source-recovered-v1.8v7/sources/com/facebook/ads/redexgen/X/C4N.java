package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.4N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4N {
    public SparseArray<C4M> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        return ((j / 4) * 3) + (j2 / 4);
    }

    private C4M A01(int i) {
        C4M c4m = this.A00.get(i);
        if (c4m == null) {
            C4M c4m2 = new C4M();
            this.A00.put(i, c4m2);
            return c4m2;
        }
        return c4m;
    }

    private final void A02() {
        C4N c4n = this;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c4n = c4n;
                    if (i >= c4n.A00.size()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4n = c4n;
                    C4M data = c4n.A00.valueAt(i);
                    data.A03.clear();
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final C4Y A03(int i) {
        C4M c4m = this.A00.get(i);
        char c2 = c4m != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c4m = c4m;
                    if (!c4m.A03.isEmpty()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return c4m.A03.remove(r1.size() - 1);
                case 4:
                    return (C4Y) null;
            }
        }
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i, long j) {
        C4M c4mA01 = A01(i);
        c4mA01.A01 = A00(c4mA01.A01, j);
    }

    public final void A06(int i, long j) {
        C4M c4mA01 = A01(i);
        c4mA01.A02 = A00(c4mA01.A02, j);
    }

    public final void A07(AnonymousClass44 anonymousClass44) {
        this.A01++;
    }

    public final void A08(AnonymousClass44 anonymousClass44, AnonymousClass44 anonymousClass442, boolean z) {
        C4N c4n = this;
        char c2 = anonymousClass44 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4n = c4n;
                    c4n.A04();
                    c2 = 3;
                    break;
                case 3:
                    if (!z) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 4:
                    c4n = c4n;
                    if (c4n.A01 != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c4n = c4n;
                    c4n.A02();
                    c2 = 6;
                    break;
                case 6:
                    anonymousClass442 = anonymousClass442;
                    if (anonymousClass442 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c4n = c4n;
                    anonymousClass442 = anonymousClass442;
                    c4n.A07(anonymousClass442);
                    c2 = '\b';
                    break;
                case '\b':
                    return;
            }
        }
    }

    public final void A09(C4Y c4y) {
        int iA0H = c4y.A0H();
        ArrayList<C4Y> arrayList = A01(iA0H).A03;
        if (this.A00.get(iA0H).A00 <= arrayList.size()) {
            return;
        }
        c4y.A0Q();
        arrayList.add(c4y);
    }

    public final boolean A0A(int i, long j, long j2) {
        boolean z = false;
        long j3 = A01(i).A01;
        char c2 = j3 != 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (j + j3 >= j2) {
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

    public final boolean A0B(int i, long j, long j2) {
        boolean z = false;
        long j3 = A01(i).A02;
        char c2 = j3 != 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (j + j3 >= j2) {
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

package com.facebook.ads.redexgen.X;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: assets/audience_network.dex */
public abstract class BO implements InterfaceC1056b2 {
    public long A00;
    public long A01;
    public C01732q A02;
    public final ArrayDeque<C01732q> A03 = new ArrayDeque<>();
    public final ArrayDeque<BP> A04;
    public final PriorityQueue<C01732q> A05;

    public abstract GY A0L();

    public abstract void A0P(BX bx);

    public abstract boolean A0R();

    public BO() {
        for (int i = 0; i < 10; i++) {
            this.A03.add(new C01732q());
        }
        this.A04 = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.A04.add(new C01722p(this));
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0K(C01732q c01732q) {
        c01732q.A07();
        this.A03.add(c01732q);
    }

    @Override // com.facebook.ads.redexgen.X.BV
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public BX A4h() throws GZ {
        BO bo = this;
        boolean z = false;
        char c2 = bo.A02 == null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    bo = bo;
                    IJ.A04(z);
                    if (!bo.A03.isEmpty()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return (BX) null;
                case 5:
                    z = false;
                    c2 = 3;
                    break;
                case 6:
                    BO bo2 = bo;
                    bo2.A02 = bo2.A03.pollFirst();
                    return bo2.A02;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BV
    /* renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public BP A4i() throws GZ {
        BO bo = this;
        GY gyA0L = null;
        C01732q c01732qPoll = null;
        char c2 = bo.A04.isEmpty() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (BP) null;
                case 3:
                    bo = bo;
                    if (!bo.A05.isEmpty()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 4:
                    bo = bo;
                    if (((YT) bo.A05.peek()).A00 > bo.A00) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    bo = bo;
                    c01732qPoll = bo.A05.poll();
                    if (!c01732qPoll.A04()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    BO bo2 = bo;
                    BP bpPollFirst = bo2.A04.pollFirst();
                    bpPollFirst.A00(4);
                    bo2.A0K(c01732qPoll);
                    return bpPollFirst;
                case 7:
                    bo = bo;
                    c01732qPoll = c01732qPoll;
                    bo.A0P(c01732qPoll);
                    if (!bo.A0R()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    bo = bo;
                    c01732qPoll = c01732qPoll;
                    gyA0L = bo.A0L();
                    if (!c01732qPoll.A03()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\t':
                    BO bo3 = bo;
                    C01732q c01732q = c01732qPoll;
                    BP bpPollFirst2 = bo3.A04.pollFirst();
                    bpPollFirst2.A09(((YT) c01732q).A00, gyA0L, Long.MAX_VALUE);
                    bo3.A0K(c01732q);
                    return bpPollFirst2;
                case '\n':
                    bo = bo;
                    c01732qPoll = c01732qPoll;
                    bo.A0K(c01732qPoll);
                    c2 = 3;
                    break;
                case 11:
                    return (BP) null;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BV
    /* renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public void AC2(BX bx) throws GZ {
        BO bo = this;
        boolean z = false;
        char c2 = bx == bo.A02 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    bx = bx;
                    IJ.A03(z);
                    if (!bx.A03()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    bo = bo;
                    bo.A0K(bo.A02);
                    c2 = 5;
                    break;
                case 5:
                    bo.A02 = null;
                    return;
                case 6:
                    bo = bo;
                    C01732q c01732q = bo.A02;
                    long j = bo.A01;
                    bo.A01 = 1 + j;
                    c01732q.A00 = j;
                    bo.A05.add(bo.A02);
                    c2 = 5;
                    break;
                case 7:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A0Q(BP bp) {
        bp.A07();
        this.A04.add(bp);
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public void ACJ() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1056b2
    public void ADA(long j) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public void flush() {
        BO bo = this;
        C01732q c01732q = null;
        bo.A01 = 0L;
        bo.A00 = 0L;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bo = bo;
                    if (!bo.A05.isEmpty()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    bo = bo;
                    bo.A0K(bo.A05.poll());
                    c2 = 2;
                    break;
                case 4:
                    bo = bo;
                    c01732q = bo.A02;
                    if (c01732q == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    bo = bo;
                    c01732q = c01732q;
                    bo.A0K(c01732q);
                    bo.A02 = null;
                    c2 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }
}

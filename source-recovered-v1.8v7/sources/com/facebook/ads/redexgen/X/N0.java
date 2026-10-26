package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.widget.FrameLayout;

/* loaded from: assets/audience_network.dex */
public abstract class N0 extends FrameLayout {
    public int A00;
    public AnonymousClass25 A01;
    public AnonymousClass26 A02;

    @Nullable
    public AnonymousClass27 A03;
    public final XI A04;
    public final JW A05;

    @Nullable
    public final MQ A06;

    @Nullable
    public final MR A07;
    public final String A08;

    @Nullable
    public final C1R A09;
    public final N2 A0A;

    public abstract void A0K();

    public abstract void A0L();

    public abstract void A0M(AnonymousClass27 anonymousClass27, AnonymousClass25 anonymousClass25);

    public abstract void A0N(AnonymousClass27 anonymousClass27, AnonymousClass25 anonymousClass25);

    public abstract boolean A0O();

    public N0(XI xi, JW jw, String str) {
        this(xi, jw, str, null, null, null);
    }

    public N0(XI xi, JW jw, String str, @Nullable C1R c1r, @Nullable MR mr, @Nullable MQ mq) {
        super(xi);
        this.A00 = 0;
        this.A01 = AnonymousClass25.A04;
        this.A03 = null;
        this.A0A = new C1022aU(this);
        this.A04 = xi;
        this.A05 = jw;
        this.A07 = mr;
        this.A06 = mq;
        this.A08 = str;
        this.A09 = c1r;
    }

    public static /* synthetic */ int A00(N0 n0) {
        int i = n0.A00;
        n0.A00 = i + 1;
        return i;
    }

    public static /* synthetic */ int A01(N0 n0) {
        int i = n0.A00;
        n0.A00 = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        if (this.A02.A0A()) {
            this.A05.A7w(this.A08, this.A02.A02());
            this.A02.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        this.A03 = null;
        this.A02.A05();
        A0K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(AnonymousClass27 anonymousClass27) {
        this.A02.A08(this.A01);
        A0M(anonymousClass27, this.A01);
        C01250u.A03();
        if (A0O()) {
            A0A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(AnonymousClass27 anonymousClass27) {
        this.A03 = anonymousClass27;
        this.A02.A09(this.A01, this.A00);
        A0N(anonymousClass27, this.A01);
    }

    public final void A0I() {
        A0A();
    }

    public final void A0J() {
        this.A02 = new AnonymousClass26(new C0565Jd(this.A08, this.A05));
        MR mr = this.A07;
        if (mr != null) {
            mr.AAT(true);
        }
        A0B();
    }
}

package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OB {

    @Nullable
    public View A02;

    @Nullable
    public ML A03;

    @Nullable
    public IS A04;
    public final View A05;
    public final AnonymousClass17 A06;
    public final XI A07;
    public final JW A08;
    public final C0628Lr A09;
    public final MQ A0A;
    public final Q1 A0B;
    public int A01 = 0;
    public int A00 = 1;

    public OB(XI xi, JW jw, MQ mq, AnonymousClass17 anonymousClass17, View view, Q1 q1, C0628Lr c0628Lr) {
        this.A07 = xi;
        this.A08 = jw;
        this.A0A = mq;
        this.A06 = anonymousClass17;
        this.A05 = view;
        this.A0B = q1;
        this.A09 = c0628Lr;
    }

    public final OB A0C(int i) {
        this.A00 = i;
        return this;
    }

    public final OB A0D(int i) {
        this.A01 = i;
        return this;
    }

    public final OB A0E(View view) {
        this.A02 = view;
        return this;
    }

    public final OB A0F(ML ml) {
        this.A03 = ml;
        return this;
    }

    public final OB A0G(IS is) {
        this.A04 = is;
        return this;
    }

    public final OC A0H() {
        return new OC(this);
    }
}

package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class R8 extends AnonymousClass44<R2> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    @Nullable
    public MQ A04;
    public String A05;
    public List<C0698Ok> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AnonymousClass17 A08;
    public final C7C A09;
    public final XI A0A;
    public final JW A0B;
    public final C0628Lr A0C;
    public final C0804Sp A0D;
    public final Q1 A0E;

    public R8(XI xi, List<C0698Ok> list, AnonymousClass17 anonymousClass17, JW jw, C7C c7c, Q1 q1, C0628Lr c0628Lr, MQ mq, String str, int i, int i2, int i3, int i4, C0804Sp c0804Sp) {
        this.A0A = xi;
        this.A0B = jw;
        this.A09 = c7c;
        this.A0E = q1;
        this.A0C = c0628Lr;
        this.A04 = mq;
        this.A08 = anonymousClass17;
        this.A06 = list;
        this.A00 = i;
        this.A03 = i4;
        this.A05 = str;
        this.A01 = i3;
        this.A02 = i2;
        this.A0D = c0804Sp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass44
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final R2 A0C(ViewGroup viewGroup, int i) {
        return new R2(OQ.A00(new OB(this.A0A, this.A0B, this.A04, this.A08, null, this.A0E, this.A0C).A0H(), this.A03, this.A05, this.A0D), this.A07, this.A0E, this.A00, this.A01, this.A02, this.A06.size(), this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass44
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0E(R2 r2, int i) {
        r2.A0l(this.A06.get(i), this.A0B, this.A09, this.A0C, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass44
    public final int A0D() {
        return this.A06.size();
    }
}

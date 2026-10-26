package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.7y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02997y extends C0654Ms {
    public int A00;
    public boolean A01;
    public final C9C<C02987x> A02;
    public final C9C<C02977v> A03;
    public final C9C<L4> A04;
    public final C9C<C02967u> A05;
    public final C9C<C0595Ki> A06;
    public final C9C<C0593Kf> A07;
    public final C9C<C0591Kd> A08;
    public final C9C<KO> A09;
    public final C9C<KN> A0A;
    public final C0755Qq A0B;
    public final AbstractC0602Kp A0C;
    public final KP A0D;

    public C02997y(XI xi, JW jw, C0755Qq c0755Qq, String str) {
        this(xi, jw, c0755Qq, new ArrayList(), str);
    }

    public C02997y(XI xi, JW jw, C0755Qq c0755Qq, String str, @Nullable Bundle bundle) {
        this(xi, jw, c0755Qq, new ArrayList(), str, bundle, null);
    }

    public C02997y(XI xi, JW jw, C0755Qq c0755Qq, String str, @Nullable Map<String, String> extraParams) {
        this(xi, jw, c0755Qq, new ArrayList(), str, null, extraParams);
    }

    public C02997y(XI xi, JW jw, C0755Qq c0755Qq, List<AnonymousClass21> list, String str) {
        super(xi, jw, c0755Qq, list, str, !c0755Qq.A0e());
        this.A0D = new KP() { // from class: com.facebook.ads.redexgen.X.80
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(KQ kq) {
                this.A00.A0Y();
            }
        };
        this.A07 = new Q3(this);
        this.A03 = new P1(this);
        this.A04 = new C0694Og(this);
        this.A05 = new C0693Of(this);
        this.A02 = new OK(this);
        this.A06 = new O4(this);
        this.A09 = new O3(this);
        this.A0A = new C0678Nq(this);
        this.A08 = new C0754Qp(this);
        this.A0C = new AbstractC0602Kp() { // from class: com.facebook.ads.redexgen.X.81
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0603Kr c0603Kr) {
                C02997y c02997y = this.A00;
                c02997y.A00 = c02997y.A0B.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = c0755Qq;
        this.A0B.getEventBus().A03(this.A0D, this.A05, this.A07, this.A04, this.A03, this.A02, this.A06, this.A09, this.A0A, this.A0C, this.A08);
    }

    public C02997y(XI xi, JW jw, C0755Qq c0755Qq, List<AnonymousClass21> list, String str, @Nullable Bundle bundle, @Nullable Map<String, String> map) {
        super(xi, jw, c0755Qq, list, str, !c0755Qq.A0e(), bundle, map);
        this.A0D = new KP() { // from class: com.facebook.ads.redexgen.X.80
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(KQ kq) {
                this.A00.A0Y();
            }
        };
        this.A07 = new Q3(this);
        this.A03 = new P1(this);
        this.A04 = new C0694Og(this);
        this.A05 = new C0693Of(this);
        this.A02 = new OK(this);
        this.A06 = new O4(this);
        this.A09 = new O3(this);
        this.A0A = new C0678Nq(this);
        this.A08 = new C0754Qp(this);
        this.A0C = new AbstractC0602Kp() { // from class: com.facebook.ads.redexgen.X.81
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0603Kr c0603Kr) {
                C02997y c02997y = this.A00;
                c02997y.A00 = c02997y.A0B.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = c0755Qq;
        this.A0B.getEventBus().A03(this.A0D, this.A05, this.A07, this.A04, this.A03, this.A02, this.A06, this.A09, this.A0A, this.A08);
    }

    public final void A0f() {
        this.A0B.getStateHandler().post(new C0751Qm(this));
    }
}

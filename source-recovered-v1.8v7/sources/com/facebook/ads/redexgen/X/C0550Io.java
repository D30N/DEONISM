package com.facebook.ads.redexgen.X;

import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.View;

@TargetApi(12)
/* renamed from: com.facebook.ads.redexgen.X.Io, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0550Io implements PD {
    public View A00;

    @Nullable
    public C0755Qq A01;

    @Nullable
    public PO A02;
    public boolean A03;
    public final Handler A04;
    public final AbstractC0644Mh A05;
    public final LM A06;
    public final AbstractC0604Ks A07;
    public final KR A08;
    public final boolean A09;
    public final boolean A0A;

    public C0550Io(View view, PO po) {
        this(view, po, false);
    }

    public C0550Io(View view, PO po, boolean z) {
        this(view, po, z, false);
    }

    public C0550Io(View view, @Nullable PO po, boolean z, boolean z2) {
        this.A06 = new LM() { // from class: com.facebook.ads.redexgen.X.7f
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C02977v c02977v) {
                this.A00.A06(1, 0);
            }
        };
        this.A07 = new AbstractC0604Ks() { // from class: com.facebook.ads.redexgen.X.7d
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(L4 l4) {
                C02857d c02857d = this;
                char c2 = !c02857d.A00.A03 ? (char) 2 : (char) 3;
                while (true) {
                    switch (c2) {
                        case 2:
                            return;
                        case 3:
                            c02857d = c02857d;
                            if (c02857d.A00.A02 == PO.A02) {
                                c2 = 5;
                                break;
                            } else {
                                c2 = 4;
                                break;
                            }
                        case 4:
                            c02857d = c02857d;
                            if (!c02857d.A00.A09) {
                                c2 = 6;
                                break;
                            } else {
                                c2 = 5;
                                break;
                            }
                        case 5:
                            C02857d c02857d2 = c02857d;
                            c02857d2.A00.A02 = null;
                            c02857d2.A00.A05();
                            return;
                        case 6:
                            c02857d.A00.A06(0, 8);
                            return;
                    }
                }
            }
        };
        this.A05 = new AbstractC0644Mh() { // from class: com.facebook.ads.redexgen.X.7c
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C02987x c02987x) {
                if (this.A00.A02 == PO.A03) {
                    return;
                }
                this.A00.A00.setAlpha(1.0f);
                this.A00.A00.setVisibility(0);
            }
        };
        this.A08 = new C7Z(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z;
        this.A0A = z2;
        A08(view, po);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new PN(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(int i, int i2) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i);
        this.A00.setVisibility(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, PO po) {
        C0550Io c0550Io = this;
        c0550Io.A02 = po;
        c0550Io.A00 = view;
        c0550Io.A00.clearAnimation();
        char c2 = po == PO.A03 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0550Io = c0550Io;
                    c0550Io.A00.setAlpha(0.0f);
                    c0550Io.A00.setVisibility(8);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c0550Io = c0550Io;
                    c0550Io.A00.setAlpha(1.0f);
                    c0550Io.A00.setVisibility(0);
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A0F() {
        this.A03 = false;
        A07(null);
    }

    public final boolean A0G() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.PD
    public final void A7t(C0755Qq c0755Qq) {
        this.A01 = c0755Qq;
        c0755Qq.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.PD
    public final void ADf(C0755Qq c0755Qq) {
        A06(1, 0);
        c0755Qq.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}

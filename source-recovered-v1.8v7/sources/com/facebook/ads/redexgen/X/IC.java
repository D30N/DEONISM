package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class IC implements PY {
    public TransitionDrawable A00;
    public TransitionDrawable A01;
    public final int A03;
    public final Drawable A04;
    public final Drawable A05;
    public final View A07;
    public final Handler A06 = new Handler();
    public PX A02 = PX.A04;

    public IC(View view, int i, Drawable drawable, Drawable drawable2) {
        this.A03 = i;
        this.A07 = view;
        this.A05 = drawable;
        this.A04 = drawable2;
        this.A01 = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        this.A01.setCrossFadeEnabled(true);
        this.A00 = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        this.A00.setCrossFadeEnabled(true);
        C0635Ly.A0W(this.A07, this.A01);
    }

    private void A04(boolean z) {
        IC ic = this;
        ic.A06.removeCallbacksAndMessages(null);
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    ic = ic;
                    ic.A02 = PX.A05;
                    C0635Ly.A0W(ic.A07, ic.A00);
                    ic.A00.startTransition(ic.A03);
                    ic.A06.postDelayed(new IH(ic), ic.A03);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    ic = ic;
                    C0635Ly.A0W(ic.A07, ic.A05);
                    ic.A02 = PX.A04;
                    c2 = 3;
                    break;
            }
        }
    }

    private void A05(boolean z) {
        IC ic = this;
        ic.A06.removeCallbacksAndMessages(null);
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    ic = ic;
                    ic.A02 = PX.A03;
                    C0635Ly.A0W(ic.A07, ic.A01);
                    ic.A01.startTransition(ic.A03);
                    ic.A06.postDelayed(new II(ic), ic.A03);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    ic = ic;
                    C0635Ly.A0W(ic.A07, ic.A04);
                    ic.A02 = PX.A02;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.PY
    public final void A3N(boolean z, boolean z2) {
        IC ic = this;
        char c2 = z2 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    ic = ic;
                    ic.A04(z);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    ic = ic;
                    ic.A05(z);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.PY
    public final PX A74() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.PY
    public final void cancel() {
        PX px = null;
        this.A06.removeCallbacksAndMessages(null);
        this.A01.resetTransition();
        this.A00.resetTransition();
        char c2 = this.A02 == PX.A03 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    px = PX.A04;
                    c2 = 3;
                    break;
                case 3:
                    this.A02 = px;
                    return;
                case 4:
                    px = PX.A02;
                    c2 = 3;
                    break;
            }
        }
    }
}

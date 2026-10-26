package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.7W, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7W extends AbstractC0653Mr {
    public final ImageView A00;
    public final XI A01;
    public final C9C<C02987x> A02;
    public final C9C<L4> A03;

    public C7W(XI xi) {
        super(xi);
        this.A03 = new C0542Ig(this);
        this.A02 = new C0541If(this);
        this.A01 = xi;
        this.A00 = new ImageView(xi);
        this.A00.setScaleType(ImageView.ScaleType.FIT_CENTER);
        C0635Ly.A0P(this.A00, -16777216);
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0653Mr
    public final void A09() {
        super.A09();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0653Mr
    public final void A0A() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A03);
        }
        super.A0A();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A00.layout(0, 0, i3 - i, i4 - i2);
    }

    public void setImage(@Nullable String str) {
        setImage(str, null);
    }

    public void setImage(@Nullable String str, @Nullable InterfaceC0675Nn interfaceC0675Nn) {
        C7W c7w = this;
        AsyncTaskC1002aA asyncTaskC1002aAA04 = null;
        char c2 = str == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c7w.setVisibility(8);
                    return;
                case 3:
                    c7w = c7w;
                    interfaceC0675Nn = interfaceC0675Nn;
                    c7w.setVisibility(0);
                    asyncTaskC1002aAA04 = new AsyncTaskC1002aA(c7w.A00, c7w.A01).A04();
                    if (interfaceC0675Nn == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    interfaceC0675Nn = interfaceC0675Nn;
                    asyncTaskC1002aAA04 = asyncTaskC1002aAA04;
                    asyncTaskC1002aAA04.A06(interfaceC0675Nn);
                    c2 = 5;
                    break;
                case 5:
                    asyncTaskC1002aAA04.A07(str);
                    return;
            }
        }
    }
}

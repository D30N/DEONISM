package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.support.annotation.Nullable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.8o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03148o extends AbstractC0941Xx {

    @Nullable
    public O8 A00;
    public final InterfaceC02284v A01;
    public final AtomicBoolean A02;
    public final AtomicBoolean A03;
    public final AtomicBoolean A04;

    public C03148o(XI xi, InterfaceC0657Mv interfaceC0657Mv, JW jw, AnonymousClass17 anonymousClass17, C7C c7c, MQ mq) {
        super(xi, interfaceC0657Mv, jw, anonymousClass17, c7c, mq);
        this.A01 = new XY(this);
        this.A03 = new AtomicBoolean(false);
        this.A02 = new AtomicBoolean(false);
        this.A04 = new AtomicBoolean(false);
    }

    private O8 A01(int i) {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAdjustViewBounds(true);
        new AsyncTaskC1002aA(imageView, super.A03).A05(super.A01.A0L().A0D().A00(), super.A01.A0L().A0D().A01()).A06(new XW(this)).A07(super.A01.A0L().A0D().A07());
        return O9.A00(new OB(super.A03, super.A04, this.A08, super.A01, imageView, this.A0A, this.A06).A0D(this.A07.getToolbarHeight()).A0F(this.A07).A0C(i).A0H(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        C03148o c03148o = this;
        char c2 = c03148o.A03.get() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c03148o = c03148o;
                    if (!c03148o.A02.get()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c03148o = c03148o;
                    c03148o.A0P();
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A06(int i) {
        C03148o c03148o = this;
        boolean z = false;
        O8 o8 = null;
        C0635Ly.A0M(c03148o.A00);
        c03148o.A00 = c03148o.A01(i);
        C1I colors = c03148o.A00.getColors();
        O8 o82 = c03148o.A00;
        boolean z2 = true;
        char c2 = o82 != null ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    o82 = o82;
                    if (!o82.A0c()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c03148o = c03148o;
                    if (!(c03148o.A00 instanceof ZM)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    c03148o = c03148o;
                    colors = colors;
                    C0635Ly.A0P(c03148o, colors.A07(z));
                    c03148o.A07.A04(colors, c03148o.A00.A0c());
                    c03148o.addView(c03148o.A00, 0, AbstractC0941Xx.A0D);
                    o8 = c03148o.A00;
                    if (o8 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    o8 = o8;
                    if (!o8.A0c()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c03148o.setUpFullscreenMode(z2);
                    return;
                case '\b':
                    z2 = false;
                    c2 = 7;
                    break;
                case '\t':
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0941Xx
    public final void A0Q() {
        C03148o c03148o = this;
        O8 o8 = null;
        C0635Ly.A0O(c03148o.A00);
        C0635Ly.A0O(c03148o.A07);
        c03148o.A02.set(true);
        c03148o.A05();
        int iA03 = ((AbstractC0941Xx) c03148o).A01.A0L().A0D().A03();
        char c2 = iA03 > 0 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c03148o = c03148o;
                    o8 = c03148o.A00;
                    if (o8 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    o8 = o8;
                    o8.A0Z();
                    c2 = 4;
                    break;
                case 4:
                    c03148o = c03148o;
                    c03148o.A0R(iA03, new XX(c03148o));
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c03148o = c03148o;
                    c03148o.A04.set(true);
                    c03148o.A07.setToolbarActionMode(c03148o.getCloseButtonStyle());
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0941Xx
    public final void A0S(C02304x c02304x) {
        c02304x.A0K(this.A01);
        A06(c02304x.A0H().getResources().getConfiguration().orientation);
        addView(this.A07, new FrameLayout.LayoutParams(-1, this.A07.getToolbarHeight()));
        C0635Ly.A0K(this.A00);
        C0635Ly.A0K(this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0941Xx
    public final boolean A0T() {
        O8 o8 = this.A00;
        boolean z = false;
        char c2 = o8 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    o8 = o8;
                    z = false;
                    if (!o8.A0d(false)) {
                        c2 = 4;
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
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void AAT(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void AAq(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        int closeButtonStyle = 0;
        O8 o8 = this.A00;
        char c2 = o8 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    o8 = o8;
                    closeButtonStyle = o8.getCloseButtonStyle();
                    c2 = 3;
                    break;
                case 3:
                    return closeButtonStyle;
                case 4:
                    closeButtonStyle = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0941Xx, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A06(configuration.orientation);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0941Xx, com.facebook.ads.redexgen.X.MR
    public final void onDestroy() {
        O8 o8 = this.A00;
        if (o8 != null) {
            o8.A0V();
        }
        super.onDestroy();
    }
}

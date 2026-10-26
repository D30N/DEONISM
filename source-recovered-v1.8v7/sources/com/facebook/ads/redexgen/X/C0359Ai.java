package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ai, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0359Ai extends AbstractC1055b1 {

    @Nullable
    public C02304x A00;

    @Nullable
    public O8 A01;
    public final InterfaceC02284v A02;
    public final C0628Lr A03;

    @DoNotStrip
    public final Q0 A04;
    public final Q1 A05;
    public final AtomicBoolean A06;
    public final AtomicBoolean A07;

    public C0359Ai(XI xi, C0786Rv c0786Rv, JW jw, MQ mq) {
        super(xi, jw, mq, c0786Rv);
        this.A02 = new C1107br(this);
        this.A03 = new C0628Lr();
        this.A06 = new AtomicBoolean(false);
        this.A07 = new AtomicBoolean(false);
        this.A04 = new C1103bn(this);
        this.A05 = new Q1(this, 100, new WeakReference(this.A04), xi);
        this.A05.A0X(c0786Rv.A0F());
    }

    private void A05(int i, Bundle bundle) {
        C1A c1aA0L = this.A09.A0L();
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAdjustViewBounds(true);
        AsyncTaskC1002aA asyncTaskC1002aAA05 = new AsyncTaskC1002aA(imageView, this.A0A).A05(c1aA0L.A0D().A00(), c1aA0L.A0D().A01());
        asyncTaskC1002aAA05.A06(new C1100bk(this));
        asyncTaskC1002aAA05.A07(c1aA0L.A0D().A07());
        OC ocA0H = new OB(this.A0A, this.A0B, getAudienceNetworkListener(), this.A09, imageView, this.A05, this.A03).A0D(this.A0D.getToolbarHeight()).A0C(i).A0F(this.A0D).A0H();
        boolean zA0b = false;
        O8 o8 = this.A01;
        if (o8 != null) {
            zA0b = o8.A0b();
            O8 o82 = this.A01;
            if (!(o82 instanceof YY)) {
                o82.A0V();
            }
        }
        this.A01 = O9.A01(ocA0H, bundle, true, zA0b);
        O8 o83 = this.A01;
        A0Z(o83, o83.A0c(), i);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1055b1
    public final void A0X() {
        this.A06.set(true);
        if (this.A07.get()) {
            this.A05.A0V();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1055b1
    public final boolean A0h() {
        O8 o8 = this.A01;
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
    public final void A7s(Intent intent, Bundle bundle, C02304x c02304x) {
        super.A0b(c02304x);
        this.A00 = c02304x;
        this.A00.A0K(this.A02);
        A05(c02304x.A0H().getResources().getConfiguration().orientation, bundle);
        int iA03 = this.A09.A0L().A0D().A03();
        if (iA03 > 0) {
            A0Y(iA03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void ACm(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1055b1
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        O8 o8 = this.A01;
        if (o8 == null) {
            return 0;
        }
        return o8.getCloseButtonStyle();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        removeAllViews();
        A05(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1055b1, com.facebook.ads.redexgen.X.MR
    public final void onDestroy() {
        C0359Ai c0359Ai = this;
        O8 o8 = null;
        char c2 = c0359Ai.A09 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0359Ai = c0359Ai;
                    if (!TextUtils.isEmpty(c0359Ai.A09.A0P())) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c0359Ai = c0359Ai;
                    c0359Ai.A0B.A81(c0359Ai.A09.A0P(), new C0676No().A03(c0359Ai.A05).A02(c0359Ai.A03).A05());
                    c2 = 4;
                    break;
                case 4:
                    c0359Ai = c0359Ai;
                    c0359Ai.A05.A0W();
                    o8 = c0359Ai.A01;
                    if (o8 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    o8 = o8;
                    o8.A0V();
                    c2 = 6;
                    break;
                case 6:
                    C0359Ai c0359Ai2 = c0359Ai;
                    c0359Ai2.A00 = null;
                    super.onDestroy();
                    return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A03.A06(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}

package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.AdError;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Nr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0679Nr extends LinearLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final XI A02;
    public final ViewOnClickListenerC0998a5 A03;
    public final C0687Nz A04;
    public static final LinearLayout.LayoutParams A06 = new LinearLayout.LayoutParams(-2, -2);
    public static final int A05 = (int) (C0635Ly.A01 * 8.0f);

    public abstract void A0C(int i);

    public abstract void A0D(boolean z);

    public AbstractC0679Nr(XI xi, int i, C1I c1i, String str, JW jw, MQ mq, Q1 q1, C0628Lr c0628Lr) {
        super(xi);
        C0635Ly.A0N(this);
        this.A02 = xi;
        this.A00 = i;
        this.A04 = new C0687Nz(xi);
        C0635Ly.A0P(this.A04, 0);
        C0635Ly.A0N(this.A04);
        this.A03 = new ViewOnClickListenerC0998a5(xi, str, c1i, jw, mq, q1, c0628Lr);
        C0635Ly.A0J(AdError.NO_FILL_ERROR_CODE, this.A03);
        this.A01 = new RelativeLayout(xi);
        this.A01.setLayoutParams(A06);
        C0635Ly.A0N(this.A01);
    }

    public int A08(int i) {
        return 0;
    }

    public RelativeLayout.LayoutParams A0A(View view) {
        return new RelativeLayout.LayoutParams(-1, -2);
    }

    public RelativeLayout.LayoutParams A0B(View view) {
        return new RelativeLayout.LayoutParams(-1, -2);
    }

    public final ViewOnClickListenerC0998a5 getCTAButton() {
        return this.A03;
    }

    public View getExpandableLayout() {
        return null;
    }

    @VisibleForTesting
    public final ImageView getIconView() {
        return this.A04;
    }

    public void setInfo(C1H c1h, C1J c1j, String str, String str2, @Nullable InterfaceC0682Nu interfaceC0682Nu) {
        this.A03.setCta(c1j, str, new HashMap(), interfaceC0682Nu);
        AsyncTaskC1002aA asyncTaskC1002aA = new AsyncTaskC1002aA(this.A04, this.A02);
        int i = this.A00;
        asyncTaskC1002aA.A05(i, i).A07(str2);
    }
}

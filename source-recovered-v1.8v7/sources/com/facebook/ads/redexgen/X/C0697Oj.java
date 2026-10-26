package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Oj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0697Oj extends LinearLayout {
    public static final int A04 = (int) (C0635Ly.A01 * 32.0f);
    public static final int A05 = (int) (C0635Ly.A01 * 8.0f);
    public TextView A00;
    public TextView A01;
    public C0687Nz A02;
    public final XI A03;

    public C0697Oj(XI xi) {
        super(xi);
        this.A03 = xi;
        A00(xi);
    }

    private final void A00(XI xi) {
        setGravity(16);
        this.A02 = new C0687Nz(xi);
        this.A02.setFullCircleCorners(true);
        int i = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.setMargins(0, 0, A05, 0);
        addView(this.A02, layoutParams);
        LinearLayout linearLayout = new LinearLayout(xi);
        linearLayout.setOrientation(1);
        this.A00 = new TextView(xi);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        C0635Ly.A0b(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(xi);
        C0635Ly.A0b(this.A01, false, 14);
        linearLayout.addView(this.A00);
        linearLayout.addView(this.A01);
        addView(linearLayout, layoutParams2);
    }

    public final void A01(int i, int i2) {
        this.A00.setTextColor(i);
        this.A01.setTextColor(i2);
    }

    public void setPageDetails(C1R c1r) {
        AsyncTaskC1002aA asyncTaskC1002aA = new AsyncTaskC1002aA(this.A02, this.A03);
        int i = A04;
        asyncTaskC1002aA.A05(i, i);
        asyncTaskC1002aA.A07(c1r.A01());
        this.A00.setText(c1r.A02());
        this.A01.setText(c1r.A03());
    }
}

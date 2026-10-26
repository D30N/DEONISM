package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.widget.Button;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Nx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0685Nx extends Button {
    public static final int A0B = (int) (C0635Ly.A01 * 16.0f);
    public static final int A0C = (int) (C0635Ly.A01 * 4.0f);
    public int A00;
    public int A01;
    public C1I A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final float A06;
    public final int A07;
    public final Runnable A08;
    public final Runnable A09;
    public final Runnable A0A;

    public C0685Nx(XI xi, C1I c1i) {
        super(xi);
        this.A03 = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = true;
        this.A05 = false;
        this.A08 = new C0995a2(this);
        this.A0A = new C0994a1(this);
        this.A09 = new C0993a0(this);
        this.A02 = c1i;
        this.A07 = JQ.A03(xi);
        this.A06 = JQ.A00(xi);
        C0635Ly.A0b(this, false, 16);
        setGravity(17);
        A04();
    }

    private void A04() {
        C0685Nx c0685Nx = this;
        int i = 0;
        int i2 = 0;
        C1I c1i = c0685Nx.A02;
        char c2 = c1i != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0685Nx = c0685Nx;
                    c1i = c1i;
                    c0685Nx.A00 = c1i.A08(c0685Nx.A05);
                    c0685Nx.A01 = c0685Nx.A02.A09(c0685Nx.A05);
                    c2 = 3;
                    break;
                case 3:
                    c0685Nx = c0685Nx;
                    i2 = c0685Nx.A00;
                    if (!c0685Nx.A04) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i = A0C;
                    c2 = 5;
                    break;
                case 5:
                    C0685Nx c0685Nx2 = c0685Nx;
                    C0635Ly.A0S(c0685Nx2, i2, i);
                    c0685Nx2.setTextColor(c0685Nx2.A01);
                    return;
                case 6:
                    i = 0;
                    c2 = 5;
                    break;
            }
        }
    }

    private void A05() {
        C0685Nx c0685Nx = this;
        char c2 = c0685Nx.A07 >= 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0685Nx = c0685Nx;
                    if (!JQ.A1J(c0685Nx.getContext())) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0685Nx = c0685Nx;
                    if (!c0685Nx.A03) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    c0685Nx = c0685Nx;
                    c0685Nx.A03 = true;
                    if (!JQ.A1S(c0685Nx.getContext())) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (Build.VERSION.SDK_INT < 16) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0685Nx = c0685Nx;
                    c0685Nx.postDelayed(c0685Nx.A08, c0685Nx.A07);
                    c2 = '\b';
                    break;
                case '\b':
                    return;
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A05();
    }

    public void setRoundedCornersEnabled(boolean z) {
        this.A04 = z;
        A04();
    }

    public void setText(String str) {
        super.setText((CharSequence) str.toUpperCase(Locale.US));
    }

    public void setUpButtonColors(C1I c1i) {
        this.A02 = c1i;
        A04();
    }

    public void setViewShowsOverMedia(boolean z) {
        this.A05 = z;
        A04();
    }
}

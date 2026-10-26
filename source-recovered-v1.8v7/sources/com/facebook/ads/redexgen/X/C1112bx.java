package com.facebook.ads.redexgen.X;

import android.R;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.api.BuildConfigApi;
import d.b.a.b.k;
import java.util.Arrays;

@TargetApi(19)
/* renamed from: com.facebook.ads.redexgen.X.bx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1112bx implements MR {
    public static byte[] A0C;
    public static final String A0D;
    public long A00;
    public String A02;
    public String A03;
    public final C02304x A07;
    public final JW A08;
    public final NT A09;
    public final NU A0A;
    public final C1011aJ A0B;
    public final InterfaceC02284v A06 = new C1173cy(this);
    public boolean A05 = true;
    public long A01 = -1;
    public boolean A04 = true;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 48);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A0C = new byte[]{-94, -72, -72, -59, -72, -22, -3, 11, 8, 7, 6, 11, -3, -72, -35, 6, -4, -72, -20, 1, 5, -3, -46, -72, -9, -16, -3, -13, -5, -12, 1, -29, -8, -4, -12, -75, -53, -53, -40, -53, -2, 14, 29, 26, 23, 23, -53, -3, 16, 12, 15, 36, -53, -1, 20, 24, 16, -27, -53, 115, -119, -119, -106, -119, -75, -40, -54, -51, -119, -81, -46, -41, -46, -36, -47, -119, -67, -46, -42, -50, -93, -119, 109, -125, -125, -112, -125, -89, -46, -48, -125, -90, -46, -47, -41, -56, -47, -41, -125, -81, -46, -60, -57, -56, -57, -125, -73, -52, -48, -56, -99, -125, -106, -90, -93, -85, -89, -103, -90, -119, -122, Byte.MIN_VALUE, -29, 117, -91, -94, -86, -90, -104, -91, 83, -90, -104, -90, -90, -100, -94, -95, 83, -105, -108, -89, -108, 83, -97, -94, -102, -102, -104, -105, 83, 115, 83, -103, -94, -97, -101, -92, -86, -118, -91, -95, -101, -92, 123, -111, -111, -98, -111, -67, -32, -46, -43, -111, -60, -27, -46, -29, -27, -111, -59, -38, -34, -42, -85, -111, -13, -12, 1, 7, 6, -52, -12, -2, -13, 0, -3, -88, -66, -66, -53, -66, -15, 3, 17, 17, 7, 13, 12, -66, -28, 7, 12, 7, 17, 6, -66, -14, 7, 11, 3, -40, -66, -115, -93, -93, -80, -93, -53, -28, -15, -25, -17, -24, -11, -93, -41, -20, -16, -24, -67, -93};
    }

    static {
        A04();
        A0D = C1112bx.class.getSimpleName();
    }

    public C1112bx(C02304x c02304x, XI xi, JW jw, MQ mq) {
        this.A07 = c02304x;
        this.A08 = jw;
        int i = (int) (C0635Ly.A01 * 2.0f);
        this.A09 = new NT(xi);
        this.A09.setId(View.generateViewId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        this.A09.setListener(new C1163co(this, c02304x));
        mq.A3K(this.A09, layoutParams);
        this.A0B = new C1011aJ(xi, new C1124cA(this));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.A09.getId());
        layoutParams2.addRule(12);
        mq.A3K(this.A0B, layoutParams2);
        this.A0A = new NU(xi, null, R.attr.progressBarStyleHorizontal);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, i);
        layoutParams3.addRule(3, this.A09.getId());
        this.A0A.setProgress(0);
        mq.A3K(this.A0A, layoutParams3);
        c02304x.A0K(this.A06);
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A7s(Intent intent, Bundle bundle, C02304x c02304x) {
        C1112bx c1112bx = this;
        String strA03 = null;
        String strA032 = null;
        String strA033 = null;
        long j = 0;
        String strA034 = null;
        char c2 = c1112bx.A01 < 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1112bx = c1112bx;
                    c1112bx.A01 = System.currentTimeMillis();
                    c2 = 3;
                    break;
                case 3:
                    bundle = bundle;
                    j = -1;
                    strA033 = A03(24, 11, 95);
                    strA034 = A03(153, 11, 6);
                    strA032 = A03(112, 10, 4);
                    if (bundle != null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1112bx = c1112bx;
                    intent = intent;
                    strA033 = strA033;
                    strA034 = strA034;
                    strA032 = strA032;
                    c1112bx.A02 = intent.getStringExtra(strA032);
                    c1112bx.A03 = intent.getStringExtra(strA034);
                    c1112bx.A00 = intent.getLongExtra(strA033, j);
                    c2 = 5;
                    break;
                case 5:
                    c1112bx = c1112bx;
                    strA03 = c1112bx.A02;
                    if (strA03 == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    C1112bx c1112bx2 = c1112bx;
                    String str = strA03;
                    c1112bx2.A09.setUrl(str);
                    c1112bx2.A0B.loadUrl(str);
                    return;
                case 7:
                    strA03 = A03(186, 11, 98);
                    c2 = 6;
                    break;
                case '\b':
                    c1112bx = c1112bx;
                    bundle = bundle;
                    strA033 = strA033;
                    strA034 = strA034;
                    strA032 = strA032;
                    c1112bx.A02 = bundle.getString(strA032);
                    c1112bx.A03 = bundle.getString(strA034);
                    c1112bx.A00 = bundle.getLong(strA033, j);
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void AAT(boolean z) {
        C1112bx c1112bx = this;
        NX nxA07 = null;
        c1112bx.A0B.onPause();
        char c2 = c1112bx.A04 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1112bx = c1112bx;
                    c1112bx.A04 = false;
                    nxA07 = new NW(c1112bx.A0B.getFirstUrl()).A01(c1112bx.A00).A03(c1112bx.A01).A04(c1112bx.A0B.getResponseEndMs()).A00(c1112bx.A0B.getDomContentLoadedMs()).A05(c1112bx.A0B.getScrollReadyMs()).A02(c1112bx.A0B.getLoadFinishMs()).A06(System.currentTimeMillis()).A07();
                    c1112bx.A08.A7z(c1112bx.A03, nxA07.A02());
                    if (!BuildConfigApi.isDebug()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    nxA07 = nxA07;
                    String str = A03(k.AppCompatTheme_windowMinWidthMinor, 30, 3) + System.currentTimeMillis() + A03(k.AppCompatTheme_windowMinWidthMajor, 1, k.AppCompatTheme_windowFixedWidthMinor) + A03(223, 19, 83) + nxA07.A01 + A03(164, 22, 65) + nxA07.A03 + A03(0, 24, 104) + nxA07.A04 + A03(82, 30, 51) + nxA07.A00 + A03(35, 24, k.AppCompatTheme_windowMinWidthMinor) + nxA07.A05 + A03(59, 23, 57) + nxA07.A02 + A03(197, 26, 110) + nxA07.A06;
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void AAq(boolean z) {
        this.A0B.onResume();
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void ACm(Bundle bundle) {
        bundle.putString(A03(112, 10, 4), this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void onDestroy() {
        this.A07.A0L(this.A06);
        C0672Nk.A03(this.A0B);
        this.A0B.destroy();
    }
}

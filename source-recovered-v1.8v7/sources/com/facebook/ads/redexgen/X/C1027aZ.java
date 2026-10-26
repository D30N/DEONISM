package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1027aZ implements MR {
    public static byte[] A0B;
    public int A00;
    public C02997y A01;
    public final XI A02;
    public final JW A03;
    public final MQ A04;
    public final InterfaceC0652Mq A05;
    public final C0755Qq A06;
    public final AbstractC0604Ks A0A = new AbstractC0604Ks() { // from class: com.facebook.ads.redexgen.X.9i
        public static byte[] A01;

        static {
            A01();
        }

        public static String A00(int i, int i2, int i3) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                        bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 100);
                        i4++;
                        c2 = 2;
                        break;
                    case 4:
                        return new String(bArrCopyOfRange);
                }
            }
        }

        public static void A01() {
            A01 = new byte[]{75, 84, 89, 88, 82, 116, 83, 73, 88, 79, 78, 73, 84, 73, 92, 81, 120, 75, 88, 83, 73};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9C
        /* renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(L4 l4) {
            this.A00.A04.A3s(A00(0, 21, 89), l4);
        }
    };
    public final LM A09 = new LM() { // from class: com.facebook.ads.redexgen.X.9h
        public static byte[] A01;

        static {
            A01();
        }

        public static String A00(int i, int i2, int i3) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                        bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 18);
                        i4++;
                        c2 = 2;
                        break;
                    case 4:
                        return new String(bArrCopyOfRange);
                }
            }
        }

        public static void A01() {
            A01 = new byte[]{-73, -86, -91, -90, -80, -118, -81, -75, -90, -77, -76, -75, -86, -75, -94, -83, -122, -73, -90, -81, -75};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9C
        /* renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(C02977v c02977v) {
            this.A00.A04.A3s(A00(0, 21, 47), c02977v);
        }
    };
    public final AbstractC0644Mh A07 = new AbstractC0644Mh() { // from class: com.facebook.ads.redexgen.X.9g
        public static byte[] A01;

        static {
            A01();
        }

        public static String A00(int i, int i2, int i3) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                        bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 61);
                        i4++;
                        c2 = 2;
                        break;
                    case 4:
                        return new String(bArrCopyOfRange);
                }
            }
        }

        public static void A01() {
            A01 = new byte[]{40, 27, 22, 23, 33, -5, 32, 38, 23, 36, 37, 38, 27, 38, 19, 30, -9, 40, 23, 32, 38};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9C
        /* renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(C02987x c02987x) {
            this.A00.A04.A3s(A00(0, 21, k.AppCompatTheme_windowActionModeOverlay), c02987x);
        }
    };
    public final AbstractC0633Lw A08 = new AbstractC0633Lw() { // from class: com.facebook.ads.redexgen.X.9f
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9C
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C0643Mg c0643Mg) {
            this.A00.A05.A9d();
        }
    };

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 105);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A0B = new byte[]{-31, -44, -49, -48, -38, -73, -38, -46, -46, -48, -35, 24, 11, 6, 7, 17, -21, 16, 22, 7, 20, 21, 22, 11, 22, 3, 14, -25, 24, 7, 16, 22, 4, -9, -14, -13, -3, -37, -34, -46, 10, -3, -8, -7, 3, -23, -26, -32, 24, 44, 43, 38, 39, 35, 24, 48, 62, 60, 46, 23, 42, 61, 50, 63, 46, 12, 61, 42, 11, 62, 61, 61, 56, 55, -38, -29, -32, -36, -27, -21, -53, -26, -30, -36, -27, 49, 36, 31, 32, 42, 14, 32, 32, 38, 15, 36, 40, 32};
    }

    public C1027aZ(XI xi, InterfaceC0652Mq interfaceC0652Mq, JW jw, MQ mq) {
        this.A02 = xi;
        this.A03 = jw;
        this.A05 = interfaceC0652Mq;
        this.A06 = new C0755Qq(xi);
        this.A06.A0Z(new C02887h(xi));
        this.A06.getEventBus().A03(this.A0A, this.A09, this.A07, this.A08);
        this.A04 = mq;
        this.A06.setIsFullScreen(true);
        this.A06.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        mq.A3K(this.A06, layoutParams);
        MT mt = new MT(xi);
        mt.setOnClickListener(new ViewOnClickListenerC0650Mo(this));
        mq.A3K(mt, mt.getDefaultLayoutParams());
    }

    public final void A04(int i) {
        this.A06.setVideoProgressReportIntervalMs(i);
    }

    public final void A05(View view) {
        this.A06.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A7s(Intent intent, Bundle bundle, C02304x c02304x) {
        String stringExtra = intent.getStringExtra(A02(56, 18, 96));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            C0696Oi c0696Oi = new C0696Oi(this.A02, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i = (int) (16.0f * C0635Ly.A01);
            layoutParams.setMargins(i, i, i, i);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            c0696Oi.setOnClickListener(new ViewOnClickListenerC0651Mp(this));
            this.A04.A3K(c0696Oi, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(85, 13, 82), 0);
        this.A01 = new C02997y(this.A02, this.A03, this.A06, intent.getStringExtra(A02(74, 11, 14)), intent.getBundleExtra(A02(0, 11, 2)));
        this.A06.setVideoMPD(intent.getStringExtra(A02(32, 8, 37)));
        this.A06.setVideoURI(intent.getStringExtra(A02(40, 8, 43)));
        int i2 = this.A00;
        if (i2 > 0) {
            this.A06.A0U(i2);
        }
        if (intent.getBooleanExtra(A02(48, 8, 78), false)) {
            this.A06.A0Y(PC.A05, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void AAT(boolean z) {
        this.A04.A3s(A02(11, 21, 57), new C0632Lv());
        this.A06.A0S();
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void AAq(boolean z) {
        this.A04.A3s(A02(11, 21, 57), new C0629Ls());
        this.A06.A0Y(PC.A05, 18);
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void ACm(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void onDestroy() {
        this.A04.A3s(A02(11, 21, 57), new C0595Ki(this.A00, this.A06.getCurrentPositionInMillis()));
        this.A01.A0c(this.A06.getCurrentPositionInMillis());
        this.A06.A0V(1);
        this.A06.A0R();
    }
}

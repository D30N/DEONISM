package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.In, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0549In extends ImageView implements PD {
    public static byte[] A05;
    public static final int A06;

    @Nullable
    public C0755Qq A00;
    public final Paint A01;
    public final XI A02;
    public final C0565Jd A03;
    public final KP A04;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 14);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A05 = new byte[]{73, 113, 112, 97, 36, 69, 96};
    }

    static {
        A06();
        A06 = (int) (C0635Ly.A01 * 4.0f);
    }

    public C0549In(XI xi, C0565Jd c0565Jd) {
        super(xi);
        this.A04 = new KP() { // from class: com.facebook.ads.redexgen.X.7X
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(KQ kq) {
                this.A00.A09();
            }
        };
        this.A03 = c0565Jd;
        this.A02 = xi;
        this.A01 = new Paint();
        this.A01.setColor(-1728053248);
        setColorFilter(-1);
        int i = A06;
        setPadding(i, i, i, i);
        setContentDescription(A03(0, 7, 10));
        A05();
        setOnClickListener(new PQ(this));
    }

    private void A04() {
        setImageBitmap(M7.A00(M6.SOUND_OFF));
    }

    private void A05() {
        setImageBitmap(M7.A00(M6.SOUND_ON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A07() {
        boolean z = false;
        C0755Qq c0755Qq = this.A00;
        char c2 = c0755Qq != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0755Qq = c0755Qq;
                    if (c0755Qq.getVolume() != 0.0f) {
                        c2 = 5;
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
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public final void A09() {
        C0549In c0549In = this;
        char c2 = c0549In.A00 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0549In = c0549In;
                    if (!c0549In.A07()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0549In = c0549In;
                    c0549In.A04();
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c0549In = c0549In;
                    c0549In.A05();
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.PD
    public final void A7t(C0755Qq c0755Qq) {
        this.A00 = c0755Qq;
        C0755Qq c0755Qq2 = this.A00;
        if (c0755Qq2 != null) {
            c0755Qq2.getEventBus().A05(this.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PD
    public final void ADf(C0755Qq c0755Qq) {
        C0755Qq c0755Qq2 = this.A00;
        if (c0755Qq2 != null) {
            c0755Qq2.getEventBus().A06(this.A04);
        }
        this.A00 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, Math.min(r1, r0), this.A01);
        super.onDraw(canvas);
    }
}

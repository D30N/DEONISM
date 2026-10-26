package com.facebook.ads.redexgen.X;

import android.widget.TextView;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.ads.redexgen.X.7g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02877g extends AbstractC0653Mr {
    public static byte[] A03;
    public final TextView A00;
    public final C9C<C02967u> A01;
    public final String A02;

    static {
        A07();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 63);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A03 = new byte[]{116, 116, 126, 116, 116, 112, 101, 103, 49, 111, 112, 101, 103, 49, 72, 72, 97, 118, 126, 114, 122, 125, 122, 125, 116, 108, 103, 122, 126, 118, 78, 78};
    }

    public C02877g(XI xi, String str) {
        super(xi);
        this.A01 = new C0563Jb(this);
        this.A00 = new TextView(xi);
        this.A02 = str;
        addView(this.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String A05(long j) {
        C02877g c02877g = this;
        int i = 0;
        char c2 = 0;
        String strA04 = null;
        long minutes = 0;
        long seconds = 0;
        char c3 = j <= 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c3) {
                case 2:
                    return A04(0, 5, k.AppCompatTheme_windowMinWidthMinor);
                case 3:
                    c02877g = c02877g;
                    minutes = TimeUnit.MILLISECONDS.toMinutes(j);
                    seconds = TimeUnit.MILLISECONDS.toSeconds(j % 60000);
                    boolean zIsEmpty = c02877g.A02.isEmpty();
                    c2 = 1;
                    i = 2;
                    strA04 = A04(5, 9, 106);
                    if (!zIsEmpty) {
                        c3 = 5;
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[i];
                    objArr[0] = Long.valueOf(minutes);
                    objArr[c2] = Long.valueOf(seconds);
                    return String.format(locale, strA04, objArr);
                case 5:
                    String str = c02877g.A02;
                    Locale locale2 = Locale.US;
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = Long.valueOf(minutes);
                    objArr2[c2] = Long.valueOf(seconds);
                    return str.replace(A04(14, 18, 12), String.format(locale2, strA04, objArr2));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0653Mr
    public final void A09() {
        super.A09();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A05(this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0653Mr
    public final void A0A() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A06(this.A01);
        }
        super.A0A();
    }

    public void setCountdownTextColor(int i) {
        this.A00.setTextColor(i);
    }
}

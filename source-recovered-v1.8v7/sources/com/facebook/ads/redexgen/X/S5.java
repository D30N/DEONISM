package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.AdError;
import d.b.a.b.k;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class S5 implements InterfaceC01260v {
    public static byte[] A02;
    public final /* synthetic */ FZ A00;
    public final /* synthetic */ Runnable A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 31);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{38, 5, 10, 10, 1, 22, 68, 13, 9, 20, 22, 1, 23, 23, 13, 11, 10, 68, 2, 13, 22, 1, 0, 73, 29, 74, 28, 72, 64, 77, 27, 32, 33, 13, 46, 33, 33, 42, 61, 3, 32, 40, 40, 38, 33, 40, 6, 34, 63, 61, 42, 60, 60, 38, 32, 33};
    }

    public S5(FZ fz, Runnable runnable) {
        this.A00 = fz;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01260v
    public final void A92(RW rw) {
        this.A00.A00.A0A().A3j();
        this.A00.A07.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01260v
    public final void A93(RW rw, View view) {
        S5 s5 = this;
        InterfaceC01180n interfaceC01180n = null;
        boolean z = false;
        RI riA0A = s5.A00.A00.A0A();
        char c2 = rw == s5.A00.A01 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    s5 = s5;
                    rw = rw;
                    riA0A = riA0A;
                    riA0A.A3i(z);
                    if (rw == s5.A00.A01) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    z = false;
                    c2 = 3;
                    break;
                case 6:
                    s5 = s5;
                    rw = rw;
                    view = view;
                    s5.A00.A0E().removeCallbacks(s5.A01);
                    interfaceC01180n = s5.A00.A02;
                    FZ fz = s5.A00;
                    fz.A02 = rw;
                    ((S9) fz).A00 = view;
                    if (!fz.A0D) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 7:
                    s5 = s5;
                    rw = rw;
                    s5.A00.A07.A0F(rw);
                    c2 = '\b';
                    break;
                case '\b':
                    return;
                case '\t':
                    s5 = s5;
                    view = view;
                    interfaceC01180n = interfaceC01180n;
                    s5.A00.A07.A0E(view);
                    s5.A00.A0N(interfaceC01180n);
                    c2 = '\b';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01260v
    public final void A94(RW rw, AdError adError) {
        S5 s5 = this;
        boolean z = false;
        RI riA0A = s5.A00.A00.A0A();
        char c2 = rw == s5.A00.A01 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    s5 = s5;
                    rw = rw;
                    adError = adError;
                    riA0A = riA0A;
                    riA0A.A3k(z, adError.getErrorCode());
                    if (rw == s5.A00.A01) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    z = false;
                    c2 = 3;
                    break;
                case 6:
                    S5 s52 = s5;
                    s52.A00.A0E().removeCallbacks(s52.A01);
                    s52.A00.A0N(rw);
                    s52.A00.A0M();
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01260v
    public final void A95(RW rw) {
        KJ.A05(A00(31, 25, 80), A00(0, 23, k.AppCompatTheme_windowMinWidthMinor), A00(23, 8, 103));
        this.A00.A00.A0A().A3l();
        this.A00.A07.A0D();
        this.A00.A0K();
    }
}

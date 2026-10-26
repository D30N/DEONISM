package com.facebook.ads.redexgen.X;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.util.Log;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Nv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0683Nv {
    public static byte[] A09;

    @Nullable
    public InterfaceC0682Nu A00;
    public boolean A01 = true;
    public boolean A02;
    public final XI A03;
    public final JW A04;
    public final C0628Lr A05;
    public final MQ A06;
    public final Q1 A07;
    public final String A08;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_viewInflaterClass);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A09 = new byte[]{125, 106, Byte.MAX_VALUE, 124, 75, 74, 74, 81, 80, 125, 82, 87, 93, 85, 114, 87, 77, 74, 91, 80, 91, 76, 85, 98, 98, Byte.MAX_VALUE, 98, 48, 117, 104, 117, 115, 101, 100, 121, 126, 119, 48, 113, 115, 100, 121, Byte.MAX_VALUE, 126, 87, 96, 96, 125, 96, 50, 101, 122, 123, 126, 119, 50, 125, 98, 119, 124, 123, 124, 117, 50};
    }

    public C0683Nv(XI xi, String str, Q1 q1, C0628Lr c0628Lr, JW jw, MQ mq) {
        this.A03 = xi;
        this.A08 = str;
        this.A07 = q1;
        this.A05 = c0628Lr;
        this.A04 = jw;
        this.A06 = mq;
    }

    public static void A03(XI xi, @Nullable Q1 q1, C0628Lr c0628Lr, JW jw, C1J c1j, String str) {
        AbstractC01100f abstractC01100fA01 = C01110g.A01(xi, jw, str, Uri.parse(c1j.A04()), new C0676No().A03(q1).A02(c0628Lr).A05(), false, false);
        if (abstractC01100fA01 != null) {
            abstractC01100fA01.A09();
        }
    }

    private void A05(String str, String str2, Map<String, String> map) {
        this.A04.A8N(str, map);
        LT.A00(new DialogInterfaceOnClickListenerC0680Ns(this, map, str, str2), new DialogInterfaceOnClickListenerC0681Nt(this, str, map), LC.A00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(String str, String str2, Map<String, String> map) {
        String strA01 = A01(0, 22, 76);
        try {
            AbstractC01100f abstractC01100fA01 = C01110g.A01(this.A03, this.A04, str, Uri.parse(str2), new C0676No(map).A03(this.A07).A02(this.A05).A05(), this.A01, this.A02);
            if (abstractC01100fA01 != null) {
                abstractC01100fA01.A0B();
            }
            if (this.A00 != null) {
                this.A00.A9I();
            }
            this.A06.A3r(this.A08);
        } catch (ActivityNotFoundException e) {
            Log.e(strA01, A01(44, 20, 96) + str2, e);
        } catch (Exception e2) {
            Log.e(strA01, A01(22, 22, 98), e2);
        }
    }

    public final void A07(InterfaceC0682Nu interfaceC0682Nu) {
        this.A00 = interfaceC0682Nu;
    }

    public final void A08(String str, String str2, Map<String, String> map) {
        C0683Nv c0683Nv = this;
        new C0565Jd(str, c0683Nv.A04).A02(EnumC0564Jc.A0I, null);
        char c2 = c0683Nv.A05.A09(c0683Nv.A03) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0683Nv = c0683Nv;
                    str = str;
                    map = map;
                    c0683Nv.A04.A80(str, map);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c0683Nv = c0683Nv;
                    if (!JQ.A0v(c0683Nv.A03)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0683Nv = c0683Nv;
                    str = str;
                    str2 = str2;
                    map = map;
                    c0683Nv.A05(str, str2, map);
                    c2 = 3;
                    break;
                case 6:
                    c0683Nv = c0683Nv;
                    str = str;
                    str2 = str2;
                    map = map;
                    c0683Nv.A06(str, str2, map);
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A09(boolean z) {
        this.A02 = z;
    }

    public final void A0A(boolean z) {
        this.A01 = z;
    }
}

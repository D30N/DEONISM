package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01351e {
    public static byte[] A0C;
    public InterfaceC01270w A00;
    public AnonymousClass17 A01;
    public C7C A02;
    public String A03;
    public String A04;
    public List<C01311a> A05;
    public List<C01321b> A06;
    public List<C01331c> A07;
    public List<C01311a> A08;
    public List<C01321b> A09;
    public List<C01331c> A0A;
    public boolean A0B;

    static {
        A05();
    }

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 30);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A0C = new byte[]{-52, -54, -52, -47, -50, -56, -42, -54, -41, -51, -54, -35, -40, -37, -30, -56, -46, -42, -54, -48, -50, -36, -108, -110, -108, -103, -106, -112, -98, -110, -97, -107, -110, -91, -96, -93, -86, -112, -89, -102, -107, -106, -96, -92, -89, -52, -44, -65, -54, -57, -62, 126, -95, -65, -63, -58, -61, -90, -61, -54, -50, -61, -48, 126, -57, -47, 126, -46, -48, -41, -57, -52, -59, 126, -46, -51, 126, -63, -65, -63, -58, -61, 126, -65, -47, -47, -61, -46, -47, -34, -36, -34, -29, -32, -38, -24, -36, -23, -33, -36, -17, -22, -19, -12, -38, -31, -28, -25, -32, -18};
    }

    public C01351e(InterfaceC01270w interfaceC01270w, AnonymousClass17 anonymousClass17, String str, C7C c7c) {
        this.A01 = anonymousClass17;
        if (!A08()) {
            this.A0B = false;
            return;
        }
        this.A0B = true;
        JSONObject jSONObjectA0W = this.A01.A0W();
        this.A00 = interfaceC01270w;
        try {
            this.A06 = C01341d.A05(jSONObjectA0W);
            this.A07 = C01341d.A06(jSONObjectA0W);
            this.A05 = C01341d.A04(jSONObjectA0W);
            this.A09 = C01341d.A08(jSONObjectA0W);
            this.A0A = C01341d.A09(jSONObjectA0W);
            this.A08 = C01341d.A07(jSONObjectA0W);
        } catch (IllegalStateException unused) {
            this.A00.A98();
        }
        this.A04 = anonymousClass17.A0T();
        this.A03 = str;
        this.A02 = c7c;
    }

    private void A02() {
        for (C01321b c01321b : this.A06) {
            this.A02.A0Q(new AnonymousClass79(c01321b.A02(), c01321b.A00(), c01321b.A01(), this.A04, this.A03));
        }
        for (C01331c c01331c : this.A07) {
            this.A02.A0V(new C7B(c01331c.A01(), this.A04, this.A03, c01331c.A00()));
        }
        for (C01311a c01311a : this.A05) {
            C7B c7b = new C7B(c01311a.A01(), this.A04, this.A03);
            c7b.A04 = !c01311a.A00().equals(A01(22, 0, 56));
            c7b.A03 = c01311a.A00();
            this.A02.A0S(c7b);
        }
    }

    private void A03() {
        for (C01321b c01321b : this.A09) {
            this.A02.A0R(new AnonymousClass79(c01321b.A02(), c01321b.A00(), c01321b.A01(), this.A04, this.A03));
        }
        for (C01331c videoCacheData : this.A0A) {
            this.A02.A0U(new C7B(videoCacheData.A01(), this.A04, this.A03));
        }
        for (C01311a c01311a : this.A08) {
            C7B c7b = new C7B(c01311a.A01(), this.A04, this.A03);
            c7b.A04 = !c01311a.A00().equals(A01(22, 0, 56));
            c7b.A03 = c01311a.A00();
            this.A02.A0T(c7b);
        }
    }

    private void A04() {
        this.A02.A0P(new S0(this), new AnonymousClass75(this.A04, this.A03));
    }

    private boolean A06(String str) {
        AnonymousClass17 anonymousClass17 = this.A01;
        if (anonymousClass17 != null) {
            return anonymousClass17.A0W().has(str);
        }
        return false;
    }

    public final void A07() {
        if (A08()) {
            A02();
            A03();
            A04();
            return;
        }
        throw new IllegalStateException(A01(44, 45, 64));
    }

    public final boolean A08() {
        C01351e c01351e = this;
        boolean z = false;
        JSONObject jSONObjectA0W = null;
        AnonymousClass17 anonymousClass17 = c01351e.A01;
        char c2 = anonymousClass17 != null ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    c01351e = c01351e;
                    anonymousClass17 = anonymousClass17;
                    jSONObjectA0W = anonymousClass17.A0W();
                    if (!c01351e.A0B) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 3:
                    jSONObjectA0W = jSONObjectA0W;
                    if (jSONObjectA0W == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c01351e = c01351e;
                    if (!c01351e.A06(A01(0, 22, 75))) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c01351e = c01351e;
                    if (!c01351e.A06(A01(22, 22, 19))) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c01351e = c01351e;
                    if (!c01351e.A06(A01(89, 21, 93))) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    z = true;
                    c2 = '\b';
                    break;
                case '\b':
                    return z;
                case '\t':
                    z = false;
                    c2 = '\b';
                    break;
                case '\n':
                    return c01351e.A0B;
            }
        }
    }
}

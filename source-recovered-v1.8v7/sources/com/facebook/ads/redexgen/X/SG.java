package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.support.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SG implements KX {
    public static byte[] A0E;
    public InterfaceC01441n A00;
    public C03188s A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;

    @Nullable
    public final AdSize A06;
    public final C01230s A07;
    public final XI A08;
    public final JW A09;
    public final KB A0A;
    public final KY A0B;
    public final Runnable A0C;
    public final String A0D;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 86);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A0E = new byte[]{-59, -58, 119, -57, -61, -72, -70, -68, -60, -68, -59, -53, 119, -64, -59, 119, -55, -68, -54, -57, -58, -59, -54, -68, -24, -23, -22, -19, -14, -19, -8, -19, -13, -14, -5, -8, 11, -8};
    }

    static {
        A05();
        M0.A02();
    }

    public SG(XI xi, String str, KB kb, @Nullable AdSize adSize, int i) {
        this.A08 = xi;
        this.A0D = str;
        this.A0A = kb;
        this.A06 = adSize;
        this.A04 = i;
        this.A0B = new KY(this.A08);
        this.A0B.A0Q(this);
        this.A07 = new C01230s();
        this.A03 = true;
        this.A05 = new Handler();
        this.A0C = new FI(this);
        this.A09 = xi.A06();
        DynamicLoaderFactory.makeLoader(this.A08).getInitApi().onAdLoadInvoked(this.A08);
    }

    private List<C0770Rf> A04() {
        SG sg = this;
        InterfaceC01180n interfaceC01180nA00 = null;
        C03188s c03188s = sg.A01;
        C03168q c03168qA04 = c03188s.A04();
        ArrayList arrayList = new ArrayList(c03188s.A02());
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c03168qA04 = c03168qA04;
                    if (c03168qA04 == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    sg = sg;
                    interfaceC01180nA00 = sg.A07.A00(AdPlacementType.NATIVE);
                    if (interfaceC01180nA00 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    interfaceC01180nA00 = interfaceC01180nA00;
                    if (interfaceC01180nA00.A6j() != AdPlacementType.NATIVE) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    sg = sg;
                    c03188s = c03188s;
                    c03168qA04 = c03168qA04;
                    arrayList = arrayList;
                    interfaceC01180nA00 = interfaceC01180nA00;
                    HashMap map = new HashMap();
                    map.put(A03(34, 4, 65), c03168qA04.A05());
                    map.put(A03(24, 10, 46), c03188s.A05());
                    C0770Rf c0770Rf = (C0770Rf) interfaceC01180nA00;
                    c0770Rf.A0X(sg.A08, new SF(sg, arrayList, c0770Rf), sg.A09, map, C1141cR.A0I());
                    c2 = 6;
                    break;
                case 6:
                    c03188s = c03188s;
                    c03168qA04 = c03188s.A04();
                    c2 = 2;
                    break;
                case 7:
                    return arrayList;
            }
        }
    }

    public final void A06() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A07() {
        try {
            KG kg = new KG(this.A08, null, null, null);
            XI xi = this.A08;
            String str = this.A0D;
            AdSize adSize = this.A06;
            this.A0B.A0P(new KV(xi, str, adSize != null ? new C0613Lb(adSize.getHeight(), this.A06.getWidth()) : null, this.A0A, null, this.A04, AdSettings.isTestMode(this.A08), AdSettings.isChildDirected() || AdSettings.isMixedAudience(), kg, C0618Lh.A01(JQ.A0G(this.A08)), this.A02, null));
        } catch (K6 e) {
            A9Y(K5.A03(e));
        }
    }

    public final void A08(InterfaceC01441n interfaceC01441n) {
        this.A00 = interfaceC01441n;
    }

    public final void A09(String str) {
        this.A02 = str;
    }

    public final boolean A0A() {
        boolean z = false;
        C03188s c03188s = this.A01;
        char c2 = c03188s != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c03188s = c03188s;
                    if (!c03188s.A0A()) {
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

    @Override // com.facebook.ads.redexgen.X.KX
    public final void A9Y(K5 k5) {
        SG sg = this;
        InterfaceC01441n interfaceC01441n = null;
        char c2 = sg.A03 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    sg = sg;
                    sg.A05.postDelayed(sg.A0C, 1800000L);
                    c2 = 3;
                    break;
                case 3:
                    sg = sg;
                    interfaceC01441n = sg.A00;
                    if (interfaceC01441n == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    k5 = k5;
                    interfaceC01441n = interfaceC01441n;
                    interfaceC01441n.A9Y(k5);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.KX
    public final void AB8(C1152cd c1152cd) {
        SG sg = this;
        List<C0770Rf> listA04 = null;
        long jA0A = 0;
        C03188s c03188sA00 = c1152cd.A00();
        char c2 = c03188sA00 != null ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    sg = sg;
                    if (!sg.A03) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c03188sA00 = c03188sA00;
                    jA0A = c03188sA00.A05().A0A();
                    if (jA0A != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    jA0A = 1800000;
                    c2 = 5;
                    break;
                case 5:
                    sg = sg;
                    sg.A05.postDelayed(sg.A0C, jA0A);
                    c2 = 6;
                    break;
                case 6:
                    sg = sg;
                    c03188sA00 = c03188sA00;
                    sg.A01 = c03188sA00;
                    listA04 = sg.A04();
                    if (sg.A00 == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    listA04 = listA04;
                    if (!listA04.isEmpty()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    sg.A00.A9Y(K5.A02(AdErrorType.NO_FILL, A03(34, 0, 106)));
                    return;
                case '\t':
                    sg = sg;
                    listA04 = listA04;
                    sg.A00.AAN(listA04);
                    c2 = '\n';
                    break;
                case '\n':
                    return;
                case 11:
                    throw new IllegalStateException(A03(0, 24, 1));
            }
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.support.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ba, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0377Ba extends AbstractC1001a9<C1048au, GN> {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 12);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A00 = new byte[]{-56, -31, -43, -30, -24, -31, -41, -40, -41, -109, -26, -40, -38, -32, -40, -31, -25, -109, -36, -31, -41, -40, -21, 97, 125, -121, -121, 125, -126, 123, 52, -121, 121, 123, -127, 121, -126, -120, 52, 125, -126, 120, 121, -116};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 24
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A06(InterfaceC0516He interfaceC0516He, GF gf, long j, long j2, boolean z, ArrayList<Eh> arrayList) throws InterruptedException, IOException {
        G9 g9A00;
        for (int i = 0; i < gf.A03.size(); i++) {
            GM gm = gf.A03.get(i);
            try {
                g9A00 = A00(interfaceC0516He, gf.A01, gm);
            } catch (IOException e) {
                e = e;
            }
            if (g9A00 != null) {
                int iA6u = g9A00.A6u(j2);
                if (iA6u == -1) {
                    throw new EJ(A02(0, 23, 103));
                }
                String str = gm.A03;
                GK gkA05 = gm.A05();
                if (gkA05 != null) {
                    A05(j, str, gkA05, arrayList);
                }
                GK gkA06 = gm.A06();
                if (gkA06 != null) {
                    A05(j, str, gkA06, arrayList);
                }
                long jA6J = g9A00.A6J();
                long j3 = (iA6u + jA6J) - 1;
                while (jA6J <= j3) {
                    A05(j + g9A00.A79(jA6J), str, g9A00.A6v(jA6J), arrayList);
                    jA6J++;
                }
            } else {
                try {
                    throw new EJ(A02(23, 21, 8));
                } catch (IOException e2) {
                    e = e2;
                    if (!z) {
                        throw e;
                    }
                }
            }
        }
    }

    public C0377Ba(Uri uri, List<GN> list, C0443Ef c0443Ef) {
        super(uri, list, c0443Ef);
    }

    @Nullable
    public static G9 A00(InterfaceC0516He interfaceC0516He, int i, GM gm) throws InterruptedException, IOException {
        C0953Yj c0953YjA00 = null;
        C1044aq c1044aq = null;
        G9 g9A04 = gm.A04();
        char c2 = g9A04 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return g9A04;
                case 3:
                    interfaceC0516He = interfaceC0516He;
                    gm = gm;
                    c0953YjA00 = GA.A00(interfaceC0516He, i, gm);
                    if (c0953YjA00 != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1044aq = null;
                    c2 = 5;
                    break;
                case 5:
                    return c1044aq;
                case 6:
                    gm = gm;
                    c0953YjA00 = c0953YjA00;
                    c1044aq = new C1044aq(c0953YjA00, gm.A00);
                    c2 = 5;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1001a9
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C1048au A09(InterfaceC0516He interfaceC0516He, Uri uri) throws IOException {
        return GA.A03(interfaceC0516He, uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1001a9
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final List<Eh> A0A(InterfaceC0516He interfaceC0516He, C1048au c1048au, boolean z) throws InterruptedException, IOException {
        InterfaceC0516He interfaceC0516He2 = interfaceC0516He;
        long jA04 = 0;
        long jA00 = 0;
        List<GF> list = null;
        int i = 0;
        C1048au c1048au2 = c1048au;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int j = 2;
        while (true) {
            switch (j) {
                case 2:
                    c1048au = c1048au;
                    int i3 = c1048au.A03();
                    if (i2 >= i3) {
                        j = 7;
                        break;
                    } else {
                        j = 3;
                        break;
                    }
                case 3:
                    c1048au2 = c1048au2;
                    GJ period = c1048au2.A05(i2);
                    jA00 = C03419q.A00(period.A00);
                    jA04 = c1048au2.A04(i2);
                    list = period.A02;
                    i = 0;
                    j = 4;
                    break;
                case 4:
                    list = list;
                    int j2 = list.size();
                    if (i >= j2) {
                        j = 6;
                        break;
                    } else {
                        j = 5;
                        break;
                    }
                case 5:
                    interfaceC0516He2 = interfaceC0516He2;
                    arrayList = arrayList;
                    list = list;
                    A06(interfaceC0516He2, list.get(i), jA00, jA04, z, arrayList);
                    i++;
                    j = 4;
                    break;
                case 6:
                    i2++;
                    j = 2;
                    break;
                case 7:
                    ArrayList adaptationSets = arrayList;
                    return adaptationSets;
            }
        }
    }

    public static void A05(long j, String str, GK gk, ArrayList<Eh> arrayList) {
        arrayList.add(new Eh(j, new C0520Hi(gk.A03(str), gk.A02, gk.A01, null)));
    }
}

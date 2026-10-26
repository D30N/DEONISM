package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1082bS implements InterfaceC0516He {
    public static byte[] A0A;
    public InterfaceC0516He A00;
    public InterfaceC0516He A01;
    public InterfaceC0516He A02;
    public InterfaceC0516He A03;
    public InterfaceC0516He A04;
    public InterfaceC0516He A05;
    public InterfaceC0516He A06;
    public final Context A07;
    public final InterfaceC0516He A08;
    public final InterfaceC0535Hz<? super InterfaceC0516He> A09;

    static {
        A07();
    }

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 34);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A0A = new byte[]{-23, -21, -28, -25, -102, -90, -92, 101, -99, -104, -102, -100, -103, -90, -90, -94, 101, -104, -101, -86, 101, -96, -91, -85, -100, -87, -91, -104, -93, 101, -100, -81, -90, -89, -93, -104, -80, -100, -87, 105, 101, -100, -81, -85, 101, -87, -85, -92, -89, 101, -119, -85, -92, -89, 123, -104, -85, -104, -118, -90, -84, -87, -102, -100, 122, -83, -83, -98, -90, -87, -83, -94, -89, -96, 89, -83, -88, 89, -87, -91, -102, -78, 89, -117, -115, -122, -119, 89, -84, -83, -85, -98, -102, -90, 89, -80, -94, -83, -95, -88, -82, -83, 89, -99, -98, -87, -98, -89, -99, -94, -89, -96, 89, -88, -89, 89, -83, -95, -98, 89, -117, -115, -122, -119, 89, -98, -79, -83, -98, -89, -84, -94, -88, -89, -99, -54, -54, -57, -54, 120, -63, -58, -53, -52, -71, -58, -52, -63, -71, -52, -63, -58, -65, 120, -86, -84, -91, -88, 120, -67, -48, -52, -67, -58, -53, -63, -57, -58, 2, 20, 20, 6, 21, -74, -41, -40, -45, -25, -34, -26, -74, -45, -26, -45, -59, -31, -25, -28, -43, -41, -103, -120, -98, -103, -116, -102, -106, -100, -103, -118, -116, -72, -75, -56, -75, -27, -15, -16, -10, -25, -16, -10, 120, -86, -73, -83, -69, -72, -78, -83, -88, -86, -68, -68, -82, -67, 120};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hz != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C1082bS(Context context, InterfaceC0535Hz<? super InterfaceC0516He> interfaceC0535Hz, InterfaceC0516He interfaceC0516He) {
        this.A07 = context.getApplicationContext();
        this.A09 = interfaceC0535Hz;
        this.A08 = (InterfaceC0516He) IJ.A01(interfaceC0516He);
    }

    private InterfaceC0516He A00() {
        if (this.A00 == null) {
            this.A00 = new C1075bL(this.A07, this.A09);
        }
        return this.A00;
    }

    private InterfaceC0516He A01() {
        if (this.A01 == null) {
            this.A01 = new C1078bO(this.A07, this.A09);
        }
        return this.A01;
    }

    private InterfaceC0516He A02() {
        if (this.A02 == null) {
            this.A02 = new C1079bP();
        }
        return this.A02;
    }

    private InterfaceC0516He A03() {
        if (this.A04 == null) {
            this.A04 = new C1086bW(this.A09);
        }
        return this.A04;
    }

    private InterfaceC0516He A04() {
        if (this.A05 == null) {
            this.A05 = new C1098bi(this.A07, this.A09);
        }
        return this.A05;
    }

    private InterfaceC0516He A05() {
        C1082bS c1082bS = this;
        char c2 = c1082bS.A06 == null ? (char) 2 : (char) 14;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c1082bS.A06 = (InterfaceC0516He) Class.forName(A06(4, 60, 21)).getConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (ClassNotFoundException unused) {
                        Log.w(A06(173, 17, 80), A06(64, 70, 23));
                    } catch (Exception e) {
                        throw new RuntimeException(A06(134, 34, 54), e);
                    }
                    if (c1082bS.A06 != null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c1082bS = c1082bS;
                    c1082bS.A06 = c1082bS.A08;
                    c2 = 14;
                    break;
                case 14:
                    return c1082bS.A06;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final Uri A7F() {
        Uri uriA7F = null;
        InterfaceC0516He interfaceC0516He = this.A03;
        char c2 = interfaceC0516He == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    uriA7F = null;
                    c2 = 3;
                    break;
                case 3:
                    return uriA7F;
                case 4:
                    interfaceC0516He = interfaceC0516He;
                    uriA7F = interfaceC0516He.A7F();
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final long ABU(C0520Hi c0520Hi) throws IOException {
        C1082bS c1082bS = this;
        String scheme = null;
        boolean z = false;
        char c2 = c1082bS.A03 == null ? (char) 2 : (char) 19;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    c0520Hi = c0520Hi;
                    IJ.A04(z);
                    scheme = c0520Hi.A04.getScheme();
                    if (!C0560Iy.A0h(c0520Hi.A04)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0520Hi = c0520Hi;
                    if (!c0520Hi.A04.getPath().startsWith(A06(212, 15, 39))) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1082bS = c1082bS;
                    c1082bS.A03 = c1082bS.A00();
                    c2 = 6;
                    break;
                case 6:
                    return c1082bS.A03.ABU(c0520Hi);
                case 7:
                    c1082bS = c1082bS;
                    c1082bS.A03 = c1082bS.A03();
                    c2 = 6;
                    break;
                case '\b':
                    scheme = scheme;
                    if (!A06(168, 5, 127).equals(scheme)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c1082bS = c1082bS;
                    c1082bS.A03 = c1082bS.A00();
                    c2 = 6;
                    break;
                case '\n':
                    scheme = scheme;
                    if (!A06(205, 7, 96).equals(scheme)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c1082bS = c1082bS;
                    c1082bS.A03 = c1082bS.A01();
                    c2 = 6;
                    break;
                case '\f':
                    scheme = scheme;
                    if (!A06(0, 4, 85).equals(scheme)) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c1082bS = c1082bS;
                    c1082bS.A03 = c1082bS.A05();
                    c2 = 6;
                    break;
                case 14:
                    scheme = scheme;
                    if (!A06(201, 4, 50).equals(scheme)) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c1082bS = c1082bS;
                    c1082bS.A03 = c1082bS.A02();
                    c2 = 6;
                    break;
                case 16:
                    scheme = scheme;
                    if (!A06(190, 11, 5).equals(scheme)) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c1082bS = c1082bS;
                    c1082bS.A03 = c1082bS.A04();
                    c2 = 6;
                    break;
                case 18:
                    c1082bS = c1082bS;
                    c1082bS.A03 = c1082bS.A08;
                    c2 = 6;
                    break;
                case 19:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final void close() throws IOException {
        InterfaceC0516He interfaceC0516He = null;
        InterfaceC0516He interfaceC0516He2 = this.A03;
        char c2 = interfaceC0516He2 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    interfaceC0516He = null;
                    c2 = 3;
                    break;
                case 3:
                    try {
                        interfaceC0516He2 = interfaceC0516He2;
                        interfaceC0516He2.close();
                        this.A03 = interfaceC0516He;
                        c2 = 6;
                        break;
                    } catch (Throwable th) {
                        this.A03 = interfaceC0516He;
                        throw th;
                    }
                case 6:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return this.A03.read(bArr, i, i2);
    }
}

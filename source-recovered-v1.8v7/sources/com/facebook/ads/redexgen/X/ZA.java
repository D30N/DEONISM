package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.extractor.mp4.Track;
import d.b.a.b.k;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class ZA implements CC {
    public static byte[] A0X;
    public static final CF A0Y;
    public static final int A0Z;
    public static final Format A0a;
    public static final byte[] A0b;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public CE A0C;
    public Cp A0D;
    public C0544Ii A0E;
    public boolean A0F;
    public boolean A0G;
    public CO[] A0H;
    public CO[] A0I;
    public final int A0J;
    public final SparseArray<Cp> A0K;

    @Nullable
    public final DrmInitData A0L;

    @Nullable
    public final CO A0M;

    @Nullable
    public final C0416Cy A0N;
    public final C0544Ii A0O;
    public final C0544Ii A0P;
    public final C0544Ii A0Q;
    public final C0544Ii A0R;

    @Nullable
    public final C0556Iu A0S;
    public final ArrayDeque<Z4> A0T;
    public final ArrayDeque<C0412Co> A0U;
    public final List<Format> A0V;
    public final byte[] A0W;

    public static String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0X, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 26);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0D() {
        A0X = new byte[]{-73, -85, -123, -93, -86, -85, -82, -91, -86, -93, 92, -86, -95, -93, -99, -80, -91, -78, -95, 92, -85, -94, -94, -81, -95, -80, 92, -80, -85, 92, -81, -99, -87, -84, -88, -95, 92, -96, -99, -80, -99, 106, -36, -11, -2, -9, 4, -8, -80, -3, -7, 3, -3, -15, 4, -13, -8, -54, -80, -51, -40, -23, -32, -40, -39, -29, -36, -105, -29, -36, -27, -34, -21, -33, -105, -37, -36, -22, -38, -23, -32, -25, -21, -32, -26, -27, -105, -32, -27, -105, -22, -34, -25, -37, -105, -35, -26, -20, -27, -37, -105, -97, -20, -27, -22, -20, -25, -25, -26, -23, -21, -36, -37, -96, 111, -106, -123, -110, -110, -119, -124, -119, -114, -121, 64, 116, -110, -127, -125, -117, 101, -114, -125, -110, -103, -112, -108, -119, -113, -114, 98, -113, -104, 64, -112, -127, -110, -127, -115, -123, -108, -123, -110, -109, 64, -119, -109, 64, -107, -114, -109, -107, -112, -112, -113, -110, -108, -123, -124, 78, -119, -94, -103, -84, -92, -103, -105, -88, -103, -104, 84, -95, -93, -93, -86, 84, -106, -93, -84, 98, -66, -79, -84, -83, -73, 119, -75, -72, 124, -115, -71, -88, -82, -76, -84, -75, -69, -84, -85, -108, -73, 123, -116, -65, -69, -71, -88, -86, -69, -74, -71, -109, -86, -86, -73, -87, -72, 100, -72, -77, 100, -87, -78, -88, 100, -77, -86, 100, -79, -88, -91, -72, 100, -69, -91, -73, 100, -78, -87, -85, -91, -72, -83, -70, -87, 114, -39, 12, 7, 5, -72, 11, 1, 18, -3, -72, 4, -3, 11, 11, -72, 12, 0, -7, 6, -72, 0, -3, -7, -4, -3, 10, -72, 4, -3, 6, -1, 12, 0, -72, -64, 13, 6, 11, 13, 8, 8, 7, 10, 12, -3, -4, -63, -58, -113, -88, -92, -87, 99, -92, -73, -78, -80, 99, -89, -88, -87, -84, -79, -88, -74, 99, -88, -69, -73, -88, -79, -89, -88, -89, 99, -92, -73, -78, -80, 99, -74, -84, -67, -88, 99, 107, -72, -79, -74, -72, -77, -77, -78, -75, -73, -88, -89, 108, 113, -120, -79, -73, -75, -68, 99, -90, -78, -72, -79, -73, 99, -84, -79, 99, -74, -86, -77, -89, 99, 100, Byte.MIN_VALUE, 99, 116, 99, 107, -72, -79, -74, -72, -77, -77, -78, -75, -73, -88, -89, 108, 113, 120, -112, -114, -107, -107, -114, -109, -116, 69, -122, -103, -108, -110, 69, -100, -114, -103, -115, 69, -111, -118, -109, -116, -103, -115, 69, 99, 69, 87, 86, 89, 92, 89, 93, 88, 91, 89, 92, 69, 77, -102, -109, -104, -102, -107, -107, -108, -105, -103, -118, -119, 78, 83, -85, -62, -62, -49, -63, -48, 124, -48, -53, 124, -63, -54, -65, -50, -43, -52, -48, -59, -53, -54, 124, -64, -67, -48, -67, 124, -45, -67, -49, 124, -54, -63, -61, -67, -48, -59, -46, -63, -118, -74, -50, -52, -45, -45, -56, -57, -125, -45, -42, -42, -53, -125, -60, -41, -46, -48, -125, -117, -55, -60, -52, -49, -56, -57, -125, -41, -46, -125, -56, -37, -41, -43, -60, -58, -41, -125, -40, -40, -52, -57, -116, -48, -23, -27, -22, -92, -27, -8, -13, -15, -92, -5, -19, -8, -20, -92, -16, -23, -14, -21, -8, -20, -92, -62, -92, -74, -75, -72, -69, -72, -68, -73, -70, -72, -69, -92, -84, -7, -14, -9, -7, -12, -12, -13, -10, -8, -23, -24, -83, -78, -72, -47, -56, -37, -45, -56, -58, -41, -56, -57, -125, -42, -60, -52, -46, -125, -56, -47, -41, -43, -36, -125, -58, -46, -40, -47, -41, -99, -125, -90, -65, -71, -78, -65, -75, -67, -74, -75, 113, -70, -65, -75, -70, -61, -74, -76, -59, 113, -61, -74, -73, -74, -61, -74, -65, -76, -74, -33, -46, -51, -50, -40, -104, -47, -50, -33, -52, -51, -10, -4, -6, 1, -88, -21, -9, -3, -10, -4, -88, -15, -10, -88, -5, -22, -17, -8, -88, -87, -59, -88, -71, -88, -80, -3, -10, -5, -3, -8, -8, -9, -6, -4, -19, -20, -79, -74, -102, -116, -112, -114, -113, -98, -98, -102, -105, -111, -113, -94, -105, -99, -100, 93, -90, 91, -109, -101, -95, -107};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A0V(C0544Ii c0544Ii, C0544Ii c0544Ii2, String str, D0 d0) throws AF {
        c0544Ii.A0Y(8);
        int iA08 = c0544Ii.A08();
        if (c0544Ii.A08() != A0Z) {
            return;
        }
        if (AbstractC0402Cd.A01(iA08) == 1) {
            c0544Ii.A0Z(4);
        }
        if (c0544Ii.A08() != 1) {
            throw new AF(A0A(644, 39, 110));
        }
        c0544Ii2.A0Y(8);
        int iA082 = c0544Ii2.A08();
        if (c0544Ii2.A08() != A0Z) {
            return;
        }
        int iA01 = AbstractC0402Cd.A01(iA082);
        if (iA01 == 1) {
            if (c0544Ii2.A0M() == 0) {
                throw new AF(A0A(59, 55, 93));
            }
        } else if (iA01 >= 2) {
            c0544Ii2.A0Z(4);
        }
        if (c0544Ii2.A0M() != 1) {
            throw new AF(A0A(355, 39, 41));
        }
        c0544Ii2.A0Z(1);
        int iA0E = c0544Ii2.A0E();
        int i = (iA0E & 240) >> 4;
        int i2 = iA0E & 15;
        boolean z = c0544Ii2.A0E() == 1;
        if (z) {
            int iA0E2 = c0544Ii2.A0E();
            byte[] bArr = new byte[16];
            c0544Ii2.A0c(bArr, 0, bArr.length);
            byte[] bArr2 = null;
            if (z && iA0E2 == 0) {
                int iA0E3 = c0544Ii2.A0E();
                bArr2 = new byte[iA0E3];
                c0544Ii2.A0c(bArr2, 0, iA0E3);
            }
            d0.A0A = true;
            d0.A08 = new C0417Cz(z, str, iA0E2, bArr, i, i2, bArr2);
        }
    }

    static {
        A0D();
        A0Y = new Z9();
        A0Z = C0560Iy.A08(A0A(683, 4, 13));
        A0b = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0a = Format.A02(null, A0A(687, 18, 20), Long.MAX_VALUE);
    }

    public ZA() {
        this(0);
    }

    public ZA(int i) {
        this(i, null);
    }

    public ZA(int i, @Nullable C0556Iu c0556Iu) {
        this(i, c0556Iu, null, null);
    }

    public ZA(int i, @Nullable C0556Iu c0556Iu, @Nullable C0416Cy c0416Cy, @Nullable DrmInitData drmInitData) {
        this(i, c0556Iu, c0416Cy, drmInitData, Collections.emptyList());
    }

    public ZA(int i, @Nullable C0556Iu c0556Iu, @Nullable C0416Cy c0416Cy, @Nullable DrmInitData drmInitData, List<Format> closedCaptionFormats) {
        this(i, c0556Iu, c0416Cy, drmInitData, closedCaptionFormats, null);
    }

    public ZA(int i, @Nullable C0556Iu c0556Iu, @Nullable C0416Cy c0416Cy, @Nullable DrmInitData drmInitData, List<Format> list, @Nullable CO co) {
        this.A0J = (c0416Cy != null ? 8 : 0) | i;
        this.A0S = c0556Iu;
        this.A0N = c0416Cy;
        this.A0L = drmInitData;
        List<Format> closedCaptionFormats = Collections.unmodifiableList(list);
        this.A0V = closedCaptionFormats;
        this.A0M = co;
        this.A0O = new C0544Ii(16);
        this.A0R = new C0544Ii(C0540Ie.A02);
        this.A0Q = new C0544Ii(5);
        this.A0P = new C0544Ii();
        this.A0W = new byte[16];
        this.A0T = new ArrayDeque<>();
        this.A0U = new ArrayDeque<>();
        this.A0K = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        A0B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1 */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r39v3 */
    /* JADX WARN: Type inference failed for: r39v4 */
    /* JADX WARN: Type inference failed for: r39v5 */
    public static int A00(Cp cp, int i, long j, int i2, C0544Ii c0544Ii, int i3) {
        C0544Ii c0544Ii2 = c0544Ii;
        boolean z = false;
        long[] jArr = null;
        int[] iArr = null;
        long j2 = 0;
        long jA0G = 0;
        boolean z2 = false;
        boolean[] zArr = null;
        int iA0H = 0;
        C0408Cj c0408Cj = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        ?? r39 = 0;
        boolean z3 = false;
        char c2 = 0;
        int iA0H2 = 0;
        int i7 = 0;
        int i8 = 0;
        int iA0H3 = 0;
        int i9 = 0;
        ?? r29 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z4 = false;
        int iA08 = 0;
        int[] iArr2 = null;
        long j3 = 0;
        int[] iArr3 = null;
        long[] jArr2 = null;
        long j4 = 0;
        int i13 = 0;
        boolean[] zArr2 = null;
        c0544Ii2.A0Y(8);
        int iA00 = AbstractC0402Cd.A00(c0544Ii2.A08());
        C0416Cy c0416Cy = cp.A05;
        D0 d0 = cp.A07;
        C0408Cj c0408Cj2 = d0.A07;
        d0.A0E[i] = c0544Ii2.A0H();
        d0.A0G[i] = d0.A05;
        char c3 = (iA00 & 1) != 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c3) {
                case 2:
                    c0544Ii2 = c0544Ii2;
                    d0 = d0;
                    long[] jArr3 = d0.A0G;
                    jArr3[i] = jArr3[i] + c0544Ii2.A08();
                    c3 = 3;
                    break;
                case 3:
                    i7 = 1;
                    if ((iA00 & 4) == 0) {
                        c3 = '6';
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    r29 = 1;
                    c3 = 5;
                    break;
                case 5:
                    c0408Cj2 = c0408Cj2;
                    iA0H = c0408Cj2.A01;
                    if (r29 == 0) {
                        c3 = 7;
                        break;
                    } else {
                        c3 = 6;
                        break;
                    }
                case 6:
                    c0544Ii2 = c0544Ii2;
                    iA0H = c0544Ii2.A0H();
                    c3 = 7;
                    break;
                case 7:
                    if ((iA00 & 256) == 0) {
                        c3 = '5';
                        break;
                    } else {
                        c3 = '\b';
                        break;
                    }
                case '\b':
                    i11 = 1;
                    c3 = '\t';
                    break;
                case '\t':
                    if ((iA00 & 512) == 0) {
                        c3 = '4';
                        break;
                    } else {
                        c3 = '\n';
                        break;
                    }
                case '\n':
                    i6 = 1;
                    c3 = 11;
                    break;
                case 11:
                    if ((iA00 & 1024) == 0) {
                        c3 = '3';
                        break;
                    } else {
                        c3 = '\f';
                        break;
                    }
                case '\f':
                    r39 = 1;
                    c3 = '\r';
                    break;
                case '\r':
                    if ((iA00 & 2048) == 0) {
                        c3 = '2';
                        break;
                    } else {
                        c3 = 14;
                        break;
                    }
                case 14:
                    z4 = true;
                    c3 = 15;
                    break;
                case 15:
                    c0416Cy = c0416Cy;
                    jA0G = 0;
                    if (c0416Cy.A08 == null) {
                        c3 = '1';
                        break;
                    } else {
                        c3 = 16;
                        break;
                    }
                case 16:
                    c0416Cy = c0416Cy;
                    if (c0416Cy.A08.length != i7) {
                        c3 = '1';
                        break;
                    } else {
                        c3 = 17;
                        break;
                    }
                case 17:
                    c0416Cy = c0416Cy;
                    c2 = 0;
                    if (c0416Cy.A08[0] != 0) {
                        c3 = '1';
                        break;
                    } else {
                        c3 = 18;
                        break;
                    }
                case 18:
                    c0416Cy = c0416Cy;
                    i12 = iA0H;
                    jA0G = C0560Iy.A0G(c0416Cy.A09[c2], 1000L, c0416Cy.A06);
                    c3 = 19;
                    break;
                case 19:
                    c0416Cy = c0416Cy;
                    d0 = d0;
                    iArr3 = d0.A0D;
                    iArr2 = d0.A0C;
                    jArr2 = d0.A0F;
                    zArr = d0.A0I;
                    if (c0416Cy.A03 != 2) {
                        c3 = '0';
                        break;
                    } else {
                        c3 = 20;
                        break;
                    }
                case 20:
                    if ((i2 & 1) == 0) {
                        c3 = '0';
                        break;
                    } else {
                        c3 = 21;
                        break;
                    }
                case 21:
                    z2 = true;
                    c3 = 22;
                    break;
                case 22:
                    c0416Cy = c0416Cy;
                    d0 = d0;
                    zArr = zArr;
                    i5 = i3 + d0.A0E[i];
                    zArr2 = zArr;
                    z3 = z2;
                    j3 = c0416Cy.A06;
                    if (i <= 0) {
                        c3 = '/';
                        break;
                    } else {
                        c3 = 23;
                        break;
                    }
                case 23:
                    d0 = d0;
                    j2 = d0.A06;
                    c3 = 24;
                    break;
                case 24:
                    j4 = j2;
                    i10 = i3;
                    c3 = 25;
                    break;
                case 25:
                    if (i10 >= i5) {
                        c3 = '7';
                        break;
                    } else {
                        c3 = 26;
                        break;
                    }
                case 26:
                    if (i11 == 0) {
                        c3 = '.';
                        break;
                    } else {
                        c3 = 27;
                        break;
                    }
                case 27:
                    c0544Ii2 = c0544Ii2;
                    iA0H2 = c0544Ii2.A0H();
                    c3 = 28;
                    break;
                case 28:
                    if (i6 == 0) {
                        c3 = '-';
                        break;
                    } else {
                        c3 = 29;
                        break;
                    }
                case 29:
                    c0544Ii2 = c0544Ii2;
                    iA0H3 = c0544Ii2.A0H();
                    i4 = i11;
                    c3 = 30;
                    break;
                case 30:
                    i8 = iA0H3;
                    if (i10 != 0) {
                        c3 = '*';
                        break;
                    } else {
                        c3 = 31;
                        break;
                    }
                case 31:
                    if (r29 == 0) {
                        c3 = '*';
                        break;
                    } else {
                        c3 = ' ';
                        break;
                    }
                case ' ':
                    iArr = r29 == true ? 1 : 0;
                    iA08 = i12;
                    c3 = '!';
                    break;
                case '!':
                    i13 = iA08;
                    if (!z4) {
                        c3 = ')';
                        break;
                    } else {
                        c3 = '\"';
                        break;
                    }
                case '\"':
                    c0544Ii2 = c0544Ii2;
                    c0408Cj2 = c0408Cj2;
                    iArr2 = iArr2;
                    c0408Cj = c0408Cj2;
                    int iA082 = c0544Ii2.A08();
                    i9 = i6;
                    jArr = r39 == true ? 1 : 0;
                    iArr2[i10] = (int) ((iA082 * 1000) / j3);
                    c3 = '#';
                    break;
                case '#':
                    iArr3 = iArr3;
                    jArr2 = jArr2;
                    jArr2[i10] = C0560Iy.A0G(j4, 1000L, j3) - jA0G;
                    iArr3[i10] = i8;
                    if (((i13 >> 16) & 1) != 0) {
                        c3 = '(';
                        break;
                    } else {
                        c3 = '$';
                        break;
                    }
                case '$':
                    if (!z3) {
                        c3 = '&';
                        break;
                    } else {
                        c3 = '%';
                        break;
                    }
                case '%':
                    if (i10 != 0) {
                        c3 = '(';
                        break;
                    } else {
                        c3 = '&';
                        break;
                    }
                case '&':
                    z = true;
                    c3 = '\'';
                    break;
                case '\'':
                    zArr2 = zArr2;
                    c0408Cj = c0408Cj;
                    zArr2[i10] = z;
                    j4 += iA0H2;
                    i10++;
                    i11 = i4;
                    r29 = iArr;
                    c0408Cj2 = c0408Cj;
                    i6 = i9;
                    r39 = jArr;
                    c3 = 25;
                    break;
                case '(':
                    z = false;
                    c3 = '\'';
                    break;
                case ')':
                    c0408Cj2 = c0408Cj2;
                    iArr2 = iArr2;
                    c0408Cj = c0408Cj2;
                    i9 = i6;
                    jArr = r39 == true ? 1 : 0;
                    iArr2[i10] = 0;
                    c3 = '#';
                    break;
                case '*':
                    if (r39 == 0) {
                        c3 = ',';
                        break;
                    } else {
                        c3 = '+';
                        break;
                    }
                case '+':
                    c0544Ii2 = c0544Ii2;
                    iA08 = c0544Ii2.A08();
                    iArr = r29 == true ? 1 : 0;
                    c3 = '!';
                    break;
                case ',':
                    c0408Cj2 = c0408Cj2;
                    iArr = r29 == true ? 1 : 0;
                    iA08 = c0408Cj2.A01;
                    c3 = '!';
                    break;
                case '-':
                    c0408Cj2 = c0408Cj2;
                    i4 = i11;
                    iA0H3 = c0408Cj2.A03;
                    c3 = 30;
                    break;
                case '.':
                    c0408Cj2 = c0408Cj2;
                    iA0H2 = c0408Cj2.A00;
                    c3 = 28;
                    break;
                case '/':
                    j2 = j;
                    c3 = 24;
                    break;
                case '0':
                    z2 = false;
                    c3 = 22;
                    break;
                case '1':
                    i12 = iA0H;
                    c3 = 19;
                    break;
                case '2':
                    z4 = false;
                    c3 = 15;
                    break;
                case '3':
                    r39 = 0;
                    c3 = '\r';
                    break;
                case '4':
                    i6 = 0;
                    c3 = 11;
                    break;
                case '5':
                    i11 = 0;
                    c3 = '\t';
                    break;
                case '6':
                    r29 = 0;
                    c3 = 5;
                    break;
                case '7':
                    d0.A06 = j4;
                    return i5;
            }
        }
    }

    public static long A01(C0544Ii c0544Ii) {
        long jA0N = 0;
        c0544Ii.A0Y(8);
        char c2 = AbstractC0402Cd.A01(c0544Ii.A08()) == 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    jA0N = c0544Ii.A0M();
                    c2 = 3;
                    break;
                case 3:
                    return jA0N;
                case 4:
                    c0544Ii = c0544Ii;
                    jA0N = c0544Ii.A0N();
                    c2 = 3;
                    break;
            }
        }
    }

    public static long A02(C0544Ii c0544Ii) {
        long jA0M = 0;
        c0544Ii.A0Y(8);
        char c2 = AbstractC0402Cd.A01(c0544Ii.A08()) == 1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    jA0M = c0544Ii.A0N();
                    c2 = 3;
                    break;
                case 3:
                    return jA0M;
                case 4:
                    c0544Ii = c0544Ii;
                    jA0M = c0544Ii.A0M();
                    c2 = 3;
                    break;
            }
        }
    }

    public static Pair<Integer, C0408Cj> A03(C0544Ii c0544Ii) {
        c0544Ii.A0Y(12);
        int defaultSampleDuration = c0544Ii.A08();
        int defaultSampleFlags = c0544Ii.A0H() - 1;
        return Pair.create(Integer.valueOf(defaultSampleDuration), new C0408Cj(defaultSampleFlags, c0544Ii.A0H(), c0544Ii.A0H(), c0544Ii.A08()));
    }

    public static Pair<Long, C0953Yj> A04(C0544Ii c0544Ii, long j) throws AF {
        C0544Ii c0544Ii2 = c0544Ii;
        long jA0G = 0;
        long jA0M = 0;
        long timescale = 0;
        long[] jArr = null;
        long[] jArr2 = null;
        int firstInt = 0;
        int iA08 = 0;
        int i = 0;
        int[] iArr = null;
        long[] jArr3 = null;
        long jA0G2 = 0;
        long j2 = 0;
        long j3 = 0;
        C0544Ii c0544Ii3 = c0544Ii2;
        c0544Ii3.A0Y(8);
        int iA01 = AbstractC0402Cd.A01(c0544Ii2.A08());
        c0544Ii3.A0Z(4);
        long referenceDuration = c0544Ii2.A0M();
        char c2 = iA01 == 0 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii2 = c0544Ii2;
                    jA0M = c0544Ii2.A0M();
                    timescale = j + c0544Ii2.A0M();
                    c2 = 3;
                    break;
                case 3:
                    c0544Ii2 = c0544Ii2;
                    c0544Ii3 = c0544Ii3;
                    jA0G = C0560Iy.A0G(jA0M, 1000000L, referenceDuration);
                    c0544Ii3.A0Z(2);
                    firstInt = c0544Ii2.A0I();
                    iArr = new int[firstInt];
                    jArr3 = new long[firstInt];
                    jArr2 = new long[firstInt];
                    jArr = new long[firstInt];
                    i = 0;
                    jA0G2 = jA0G;
                    j2 = jA0M;
                    j3 = timescale;
                    c2 = 4;
                    break;
                case 4:
                    if (i >= firstInt) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0544Ii2 = c0544Ii2;
                    iA08 = c0544Ii2.A08();
                    if ((iA08 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0544Ii2 = c0544Ii2;
                    c0544Ii3 = c0544Ii3;
                    iArr = iArr;
                    jArr3 = jArr3;
                    jArr2 = jArr2;
                    jArr = jArr;
                    long jA0M2 = c0544Ii2.A0M();
                    iArr[i] = Integer.MAX_VALUE & iA08;
                    jArr3[i] = j3;
                    jArr[i] = jA0G2;
                    j2 += jA0M2;
                    jA0G2 = C0560Iy.A0G(j2, 1000000L, referenceDuration);
                    jArr2[i] = jA0G2 - jArr[i];
                    c0544Ii3.A0Z(4);
                    j3 += iArr[i];
                    i++;
                    c2 = 4;
                    break;
                case 7:
                    c0544Ii2 = c0544Ii2;
                    jA0M = c0544Ii2.A0N();
                    timescale = j + c0544Ii2.A0N();
                    c2 = 3;
                    break;
                case '\b':
                    throw new AF(A0A(606, 28, 55));
                case '\t':
                    return Pair.create(Long.valueOf(jA0G), new C0953Yj(iArr, jArr3, jArr2, jArr));
            }
        }
    }

    public static DrmInitData A05(List<Z5> list) {
        DrmInitData drmInitData = null;
        UUID uuidA03 = null;
        byte[] bArr = null;
        Z5 z5 = null;
        ArrayList arrayList = null;
        int size = list.size();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= size) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    list = list;
                    z5 = list.get(i);
                    if (((AbstractC0402Cd) z5).A00 != AbstractC0402Cd.A0r) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (arrayList != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    arrayList = new ArrayList();
                    c2 = 6;
                    break;
                case 6:
                    z5 = z5;
                    bArr = z5.A00.A00;
                    uuidA03 = Cv.A03(bArr);
                    if (uuidA03 != null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    Log.w(A0A(199, 22, 45), A0A(486, 42, 73));
                    c2 = '\b';
                    break;
                case '\b':
                    i++;
                    c2 = 2;
                    break;
                case '\t':
                    bArr = bArr;
                    uuidA03 = uuidA03;
                    arrayList.add(new DrmInitData.SchemeData(uuidA03, A0A(190, 9, 46), bArr));
                    c2 = '\b';
                    break;
                case '\n':
                    if (arrayList != null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    drmInitData = null;
                    c2 = '\f';
                    break;
                case '\f':
                    return drmInitData;
                case '\r':
                    drmInitData = new DrmInitData(arrayList);
                    c2 = '\f';
                    break;
            }
        }
    }

    private C0408Cj A06(SparseArray<C0408Cj> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (C0408Cj) IJ.A01(sparseArray.get(i));
    }

    public static Cp A07(SparseArray<Cp> sparseArray) {
        Cp trackBundle = null;
        long trunOffset = 0;
        Cp cp = null;
        long j = Long.MAX_VALUE;
        int size = sparseArray.size();
        int i = 0;
        int trackBundlesSize = 2;
        while (true) {
            switch (trackBundlesSize) {
                case 2:
                    if (i >= size) {
                        trackBundlesSize = 7;
                        break;
                    } else {
                        trackBundlesSize = 3;
                        break;
                    }
                case 3:
                    sparseArray = sparseArray;
                    trackBundle = sparseArray.valueAt(i);
                    int i2 = trackBundle.A02;
                    int trackBundlesSize2 = trackBundle.A07.A02;
                    if (i2 != trackBundlesSize2) {
                        trackBundlesSize = 5;
                        break;
                    } else {
                        trackBundlesSize = 4;
                        break;
                    }
                case 4:
                    i++;
                    trackBundlesSize = 2;
                    break;
                case 5:
                    trackBundle = trackBundle;
                    long[] jArr = trackBundle.A07.A0G;
                    int trackBundlesSize3 = trackBundle.A02;
                    trunOffset = jArr[trackBundlesSize3];
                    if (trunOffset >= j) {
                        trackBundlesSize = 4;
                        break;
                    } else {
                        trackBundlesSize = 6;
                        break;
                    }
                case 6:
                    trackBundle = trackBundle;
                    cp = trackBundle;
                    j = trunOffset;
                    trackBundlesSize = 4;
                    break;
                case 7:
                    return cp;
            }
        }
    }

    @Nullable
    public static Cp A08(SparseArray<Cp> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i);
    }

    public static Cp A09(C0544Ii c0544Ii, SparseArray<Cp> sparseArray) {
        C0408Cj c0408Cj = null;
        int iA0H = 0;
        int defaultSampleDuration = 0;
        int iA0H2 = 0;
        int i = 0;
        c0544Ii.A0Y(8);
        int iA00 = AbstractC0402Cd.A00(c0544Ii.A08());
        Cp cpA08 = A08(sparseArray, c0544Ii.A08());
        int defaultSampleDescriptionIndex = cpA08 == null ? 2 : 3;
        while (true) {
            switch (defaultSampleDescriptionIndex) {
                case 2:
                    return (Cp) null;
                case 3:
                    int defaultSampleSize = iA00 & 1;
                    if (defaultSampleSize == 0) {
                        defaultSampleDescriptionIndex = 5;
                        break;
                    } else {
                        defaultSampleDescriptionIndex = 4;
                        break;
                    }
                case 4:
                    c0544Ii = c0544Ii;
                    cpA08 = cpA08;
                    long jA0N = c0544Ii.A0N();
                    cpA08.A07.A05 = jA0N;
                    cpA08.A07.A04 = jA0N;
                    defaultSampleDescriptionIndex = 5;
                    break;
                case 5:
                    cpA08 = cpA08;
                    c0408Cj = cpA08.A04;
                    int defaultSampleSize2 = iA00 & 2;
                    if (defaultSampleSize2 == 0) {
                        defaultSampleDescriptionIndex = 17;
                        break;
                    } else {
                        defaultSampleDescriptionIndex = 6;
                        break;
                    }
                case 6:
                    c0544Ii = c0544Ii;
                    int defaultSampleDescriptionIndex2 = c0544Ii.A0H();
                    i = defaultSampleDescriptionIndex2 - 1;
                    defaultSampleDescriptionIndex = 7;
                    break;
                case 7:
                    int defaultSampleDescriptionIndex3 = iA00 & 8;
                    if (defaultSampleDescriptionIndex3 == 0) {
                        defaultSampleDescriptionIndex = 16;
                        break;
                    } else {
                        defaultSampleDescriptionIndex = 8;
                        break;
                    }
                case 8:
                    c0544Ii = c0544Ii;
                    defaultSampleDuration = c0544Ii.A0H();
                    defaultSampleDescriptionIndex = 9;
                    break;
                case 9:
                    int defaultSampleDescriptionIndex4 = iA00 & 16;
                    if (defaultSampleDescriptionIndex4 == 0) {
                        defaultSampleDescriptionIndex = 15;
                        break;
                    } else {
                        defaultSampleDescriptionIndex = 10;
                        break;
                    }
                case 10:
                    c0544Ii = c0544Ii;
                    iA0H2 = c0544Ii.A0H();
                    defaultSampleDescriptionIndex = 11;
                    break;
                case 11:
                    int defaultSampleSize3 = iA00 & 32;
                    if (defaultSampleSize3 == 0) {
                        defaultSampleDescriptionIndex = 14;
                        break;
                    } else {
                        defaultSampleDescriptionIndex = 12;
                        break;
                    }
                case 12:
                    c0544Ii = c0544Ii;
                    iA0H = c0544Ii.A0H();
                    defaultSampleDescriptionIndex = 13;
                    break;
                case 13:
                    Cp cp = cpA08;
                    cp.A07.A07 = new C0408Cj(i, defaultSampleDuration, iA0H2, iA0H);
                    return cp;
                case 14:
                    c0408Cj = c0408Cj;
                    iA0H = c0408Cj.A01;
                    defaultSampleDescriptionIndex = 13;
                    break;
                case 15:
                    c0408Cj = c0408Cj;
                    iA0H2 = c0408Cj.A03;
                    defaultSampleDescriptionIndex = 11;
                    break;
                case 16:
                    c0408Cj = c0408Cj;
                    defaultSampleDuration = c0408Cj.A00;
                    defaultSampleDescriptionIndex = 9;
                    break;
                case 17:
                    c0408Cj = c0408Cj;
                    i = c0408Cj.A02;
                    defaultSampleDescriptionIndex = 7;
                    break;
            }
        }
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    private void A0C() {
        ZA za = this;
        int i = 0;
        CO[] coArr = null;
        int i2 = 0;
        int length = 0;
        int i3 = 0;
        CO co = null;
        int i4 = 0;
        char c2 = za.A0I == null ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    za = za;
                    za.A0I = new CO[2];
                    i2 = 0;
                    co = za.A0M;
                    if (co == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    za = za;
                    co = co;
                    i2 = 0 + 1;
                    za.A0I[0] = co;
                    c2 = 4;
                    break;
                case 4:
                    za = za;
                    i3 = 4;
                    if ((za.A0J & 4) == 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    za = za;
                    za.A0I[i2] = za.A0C.ADd(za.A0K.size(), i3);
                    i2++;
                    c2 = 6;
                    break;
                case 6:
                    za = za;
                    za.A0I = (CO[]) Arrays.copyOf(za.A0I, i2);
                    coArr = za.A0I;
                    length = coArr.length;
                    i4 = 0;
                    c2 = 7;
                    break;
                case 7:
                    if (i4 >= length) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    coArr = coArr;
                    coArr[i4].A5A(A0a);
                    i4++;
                    c2 = 7;
                    break;
                case '\t':
                    za = za;
                    if (za.A0H != null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    za = za;
                    za.A0H = new CO[za.A0V.size()];
                    i = 0;
                    c2 = 11;
                    break;
                case 11:
                    za = za;
                    if (i >= za.A0H.length) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    za = za;
                    CO coADd = za.A0C.ADd(za.A0K.size() + 1 + i, 3);
                    coADd.A5A(za.A0V.get(i));
                    za.A0H[i] = coADd;
                    i++;
                    c2 = 11;
                    break;
                case '\r':
                    return;
            }
        }
    }

    private void A0E(long j) {
        CO[] coArr = null;
        C0412Co c0412CoRemoveFirst = null;
        long jA06 = 0;
        C0556Iu c0556Iu = null;
        int length = 0;
        int i = 0;
        ZA za = this;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    za = za;
                    if (!za.A0U.isEmpty()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 3:
                    za = za;
                    c0412CoRemoveFirst = za.A0U.removeFirst();
                    za.A03 -= c0412CoRemoveFirst.A00;
                    jA06 = j + c0412CoRemoveFirst.A01;
                    c0556Iu = za.A0S;
                    if (c0556Iu == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0556Iu = c0556Iu;
                    jA06 = c0556Iu.A06(jA06);
                    c2 = 5;
                    break;
                case 5:
                    za = za;
                    coArr = za.A0I;
                    length = coArr.length;
                    i = 0;
                    c2 = 6;
                    break;
                case 6:
                    if (i >= length) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    za = za;
                    c0412CoRemoveFirst = c0412CoRemoveFirst;
                    coArr = coArr;
                    coArr[i].ACl(jA06, 1, c0412CoRemoveFirst.A00, za.A03, null);
                    i++;
                    c2 = 6;
                    break;
                case '\b':
                    return;
            }
        }
    }

    private void A0F(long j) throws AF {
        ZA za = this;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    za = za;
                    if (!za.A0T.isEmpty()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 3:
                    za = za;
                    if (za.A0T.peek().A00 != j) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    za = za;
                    za.A0I(za.A0T.pop());
                    c2 = 2;
                    break;
                case 5:
                    za.A0B();
                    return;
            }
        }
    }

    private void A0G(CD cd) throws InterruptedException, IOException {
        ZA za = this;
        int i = ((int) za.A07) - za.A00;
        C0544Ii c0544Ii = za.A0E;
        char c2 = c0544Ii != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    za = za;
                    cd = cd;
                    c0544Ii = c0544Ii;
                    cd.readFully(c0544Ii.A00, 8, i);
                    za.A0O(new Z5(za.A01, za.A0E), cd.A6n());
                    c2 = 3;
                    break;
                case 3:
                    za.A0F(cd.A6n());
                    return;
                case 4:
                    cd = cd;
                    cd.ADL(i);
                    c2 = 3;
                    break;
            }
        }
    }

    private void A0H(CD cd) throws InterruptedException, IOException {
        ZA za = this;
        int iA6n = 0;
        D0 d0 = null;
        Cp cpValueAt = null;
        long j = Long.MAX_VALUE;
        int size = za.A0K.size();
        int i = 0;
        int trackBundlesSize = 2;
        while (true) {
            switch (trackBundlesSize) {
                case 2:
                    if (i >= size) {
                        trackBundlesSize = 7;
                        break;
                    } else {
                        trackBundlesSize = 3;
                        break;
                    }
                case 3:
                    za = za;
                    d0 = za.A0K.valueAt(i).A07;
                    if (!d0.A0B) {
                        trackBundlesSize = 6;
                        break;
                    } else {
                        trackBundlesSize = 4;
                        break;
                    }
                case 4:
                    d0 = d0;
                    if (d0.A04 >= j) {
                        trackBundlesSize = 6;
                        break;
                    } else {
                        trackBundlesSize = 5;
                        break;
                    }
                case 5:
                    za = za;
                    d0 = d0;
                    j = d0.A04;
                    cpValueAt = za.A0K.valueAt(i);
                    trackBundlesSize = 6;
                    break;
                case 6:
                    i++;
                    trackBundlesSize = 2;
                    break;
                case 7:
                    if (cpValueAt != null) {
                        trackBundlesSize = 9;
                        break;
                    } else {
                        trackBundlesSize = 8;
                        break;
                    }
                case 8:
                    za.A02 = 3;
                    return;
                case 9:
                    cd = cd;
                    iA6n = (int) (j - cd.A6n());
                    if (iA6n < 0) {
                        trackBundlesSize = 11;
                        break;
                    } else {
                        trackBundlesSize = 10;
                        break;
                    }
                case 10:
                    CD cd2 = cd;
                    cd2.ADL(iA6n);
                    cpValueAt.A07.A04(cd2);
                    return;
                case 11:
                    throw new AF(A0A(447, 39, 66));
            }
        }
    }

    private void A0I(Z4 z4) throws AF {
        ZA za = this;
        char c2 = ((AbstractC0402Cd) z4).A00 == AbstractC0402Cd.A0j ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    za = za;
                    z4 = z4;
                    za.A0K(z4);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    z4 = z4;
                    if (((AbstractC0402Cd) z4).A00 != AbstractC0402Cd.A0i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    za = za;
                    z4 = z4;
                    za.A0J(z4);
                    c2 = 3;
                    break;
                case 6:
                    za = za;
                    if (!za.A0T.isEmpty()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 7:
                    za = za;
                    z4 = z4;
                    za.A0T.peek().A08(z4);
                    c2 = 3;
                    break;
            }
        }
    }

    private void A0J(Z4 z4) throws AF {
        ZA za = this;
        long j = 0;
        int i = 0;
        DrmInitData drmInitDataA05 = null;
        int size = 0;
        int size2 = 0;
        int i2 = 0;
        A0L(z4, za.A0K, za.A0J, za.A0W);
        char c2 = za.A0L != null ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    drmInitDataA05 = null;
                    c2 = 3;
                    break;
                case 3:
                    if (drmInitDataA05 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    za = za;
                    size2 = za.A0K.size();
                    i2 = 0;
                    c2 = 5;
                    break;
                case 5:
                    if (i2 >= size2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    za = za;
                    za.A0K.valueAt(i2).A06(drmInitDataA05);
                    i2++;
                    c2 = 5;
                    break;
                case 7:
                    z4 = z4;
                    drmInitDataA05 = A05(z4.A02);
                    c2 = 3;
                    break;
                case '\b':
                    za = za;
                    j = -9223372036854775807L;
                    if (za.A0A == -9223372036854775807L) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    za = za;
                    size = za.A0K.size();
                    i = 0;
                    c2 = '\n';
                    break;
                case '\n':
                    if (i >= size) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    za = za;
                    za.A0K.valueAt(i).A05(za.A0A);
                    i++;
                    c2 = '\n';
                    break;
                case '\f':
                    za = za;
                    za.A0A = j;
                    c2 = '\r';
                    break;
                case '\r':
                    return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A0K(Z4 z4) throws AF {
        Z4 z42 = z4;
        ZA za = this;
        int i = 0;
        boolean z = false;
        SparseArray<Track> sparseArray = null;
        int i2 = 0;
        int size = 0;
        int i3 = 0;
        C0416Cy c0416CyA0C = null;
        SparseArray<Track> tracks = null;
        boolean z2 = false;
        int i4 = 0;
        DrmInitData drmInitData = null;
        int i5 = 0;
        int size2 = 0;
        Z4 z4A06 = null;
        Z5 z5 = null;
        boolean z3 = false;
        int size3 = 0;
        int i6 = 0;
        long jA01 = 0;
        SparseArray<Track> sparseArray2 = null;
        DrmInitData drmInitDataA05 = null;
        Z4 atom = null;
        SparseArray sparseArray3 = null;
        Z5 z5A07 = null;
        ZA za2 = za;
        char c2 = za2.A0N == null ? (char) 2 : '\r';
        while (true) {
            switch (c2) {
                case 2:
                    z3 = true;
                    c2 = 3;
                    break;
                case 3:
                    za2 = za2;
                    IJ.A06(z3, A0A(170, 20, 26));
                    drmInitData = za2.A0L;
                    if (drmInitData == null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    drmInitData = drmInitData;
                    drmInitDataA05 = drmInitData;
                    c2 = 5;
                    break;
                case 5:
                    z42 = z42;
                    z4A06 = z42.A06(AbstractC0402Cd.A0m);
                    sparseArray3 = new SparseArray();
                    jA01 = -9223372036854775807L;
                    size2 = z4A06.A02.size();
                    i4 = 0;
                    c2 = 6;
                    break;
                case 6:
                    if (i4 >= size2) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    z4A06 = z4A06;
                    z5 = z4A06.A02.get(i4);
                    if (((AbstractC0402Cd) z5).A00 != AbstractC0402Cd.A1M) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    sparseArray3 = sparseArray3;
                    z5 = z5;
                    Pair<Integer, C0408Cj> pairA03 = A03(z5.A00);
                    sparseArray3.put(((Integer) pairA03.first).intValue(), pairA03.second);
                    c2 = '\t';
                    break;
                case '\t':
                    i4++;
                    c2 = 6;
                    break;
                case '\n':
                    z5 = z5;
                    if (((AbstractC0402Cd) z5).A00 != AbstractC0402Cd.A0f) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    z5 = z5;
                    jA01 = A01(z5.A00);
                    c2 = '\t';
                    break;
                case '\f':
                    z42 = z42;
                    drmInitDataA05 = A05(z42.A02);
                    c2 = 5;
                    break;
                case '\r':
                    z3 = false;
                    c2 = 3;
                    break;
                case 14:
                    z42 = z42;
                    sparseArray2 = new SparseArray<>();
                    size3 = z42.A01.size();
                    i5 = 0;
                    c2 = 15;
                    break;
                case 15:
                    if (i5 >= size3) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    z42 = z42;
                    atom = z42.A01.get(i5);
                    if (((AbstractC0402Cd) atom).A00 != AbstractC0402Cd.A1L) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    za2 = za2;
                    z42 = z42;
                    z5A07 = z42.A07(AbstractC0402Cd.A0n);
                    if ((za2.A0J & 16) == 0) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    z2 = true;
                    c2 = 19;
                    break;
                case 19:
                    drmInitDataA05 = drmInitDataA05;
                    sparseArray2 = sparseArray2;
                    atom = atom;
                    z5A07 = z5A07;
                    i6 = i5;
                    i3 = size3;
                    tracks = sparseArray2;
                    c0416CyA0C = C0407Ci.A0C(atom, z5A07, jA01, drmInitDataA05, z2, false);
                    if (c0416CyA0C == null) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    tracks = tracks;
                    c0416CyA0C = c0416CyA0C;
                    tracks.put(c0416CyA0C.A00, c0416CyA0C);
                    c2 = 21;
                    break;
                case 21:
                    tracks = tracks;
                    i5 = i6 + 1;
                    sparseArray2 = tracks;
                    size3 = i3;
                    c2 = 15;
                    break;
                case 22:
                    z2 = false;
                    c2 = 19;
                    break;
                case 23:
                    sparseArray2 = sparseArray2;
                    i6 = i5;
                    i3 = size3;
                    tracks = sparseArray2;
                    c2 = 21;
                    break;
                case 24:
                    za2 = za2;
                    sparseArray2 = sparseArray2;
                    sparseArray = sparseArray2;
                    size = sparseArray.size();
                    if (za2.A0K.size() != 0) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    i2 = 0;
                    c2 = 26;
                    break;
                case 26:
                    if (i2 >= size) {
                        c2 = '\"';
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    za2 = za2;
                    sparseArray3 = sparseArray3;
                    sparseArray = sparseArray;
                    C0416Cy c0416Cy = (C0416Cy) sparseArray.valueAt(i2);
                    Cp cp = new Cp(za2.A0C.ADd(i2, c0416Cy.A03));
                    cp.A07(c0416Cy, za2.A06(sparseArray3, c0416Cy.A00));
                    za2.A0K.put(c0416Cy.A00, cp);
                    za2.A08 = Math.max(za2.A08, c0416Cy.A04);
                    i2++;
                    c2 = 26;
                    break;
                case 28:
                    za2 = za2;
                    if (za2.A0K.size() != size) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 29;
                        break;
                    }
                case 29:
                    z = true;
                    c2 = 30;
                    break;
                case 30:
                    IJ.A04(z);
                    i = 0;
                    c2 = 31;
                    break;
                case 31:
                    if (i >= size) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = ' ';
                        break;
                    }
                case ' ':
                    za2 = za2;
                    sparseArray3 = sparseArray3;
                    sparseArray = sparseArray;
                    C0416Cy c0416Cy2 = (C0416Cy) sparseArray.valueAt(i);
                    za2.A0K.get(c0416Cy2.A00).A07(c0416Cy2, za2.A06(sparseArray3, c0416Cy2.A00));
                    i++;
                    c2 = 31;
                    break;
                case '!':
                    z = false;
                    c2 = 30;
                    break;
                case '\"':
                    za = za;
                    za2 = za2;
                    za.A0C();
                    za2.A0C.A4w();
                    c2 = '#';
                    break;
                case '#':
                    return;
            }
        }
    }

    public static void A0L(Z4 z4, SparseArray<Cp> sparseArray, int i, byte[] bArr) throws AF {
        Z4 z42 = null;
        int size = z4.A01.size();
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= size) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z4 = z4;
                    z42 = z4.A01.get(i2);
                    if (((AbstractC0402Cd) z42).A00 != AbstractC0402Cd.A1K) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    sparseArray = sparseArray;
                    bArr = bArr;
                    z42 = z42;
                    A0M(z42, sparseArray, i, bArr);
                    c2 = 5;
                    break;
                case 5:
                    i2++;
                    c2 = 2;
                    break;
                case 6:
                    return;
            }
        }
    }

    public static void A0M(Z4 z4, SparseArray<Cp> sparseArray, int i, byte[] bArr) throws AF {
        byte[] bArr2 = bArr;
        Z4 z42 = z4;
        Z5 z5 = null;
        C0417Cz c0417CzA00 = null;
        long jA02 = 0;
        String str = null;
        D0 d0 = null;
        Z5 sgpd = null;
        C0544Ii c0544Ii = null;
        int i2 = 0;
        Z5 z5A07 = null;
        int i3 = 0;
        Z5 z5A072 = null;
        Z5 z5A073 = null;
        Z5 z5A074 = null;
        C0544Ii c0544Ii2 = null;
        int size = 0;
        Z4 z43 = z42;
        Cp cpA09 = A09(z43.A07(AbstractC0402Cd.A1I).A00, sparseArray);
        char c2 = cpA09 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    z43 = z43;
                    cpA09 = cpA09;
                    d0 = cpA09.A07;
                    jA02 = d0.A06;
                    cpA09.A04();
                    if (z43.A07(AbstractC0402Cd.A1H) == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if ((i & 2) != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z43 = z43;
                    jA02 = A02(z43.A07(AbstractC0402Cd.A1H).A00);
                    c2 = 6;
                    break;
                case 6:
                    z43 = z43;
                    cpA09 = cpA09;
                    d0 = d0;
                    A0N(z43, cpA09, jA02, i);
                    c0417CzA00 = cpA09.A05.A00(d0.A07.A02);
                    z5A07 = z43.A07(AbstractC0402Cd.A0u);
                    if (z5A07 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    d0 = d0;
                    c0417CzA00 = c0417CzA00;
                    z5A07 = z5A07;
                    A0P(c0417CzA00, z5A07.A00, d0);
                    c2 = '\b';
                    break;
                case '\b':
                    z43 = z43;
                    sgpd = z43.A07(AbstractC0402Cd.A0t);
                    if (sgpd == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    d0 = d0;
                    sgpd = sgpd;
                    A0S(sgpd.A00, d0);
                    c2 = '\n';
                    break;
                case '\n':
                    z43 = z43;
                    z5A072 = z43.A07(AbstractC0402Cd.A10);
                    if (z5A072 == null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    d0 = d0;
                    z5A072 = z5A072;
                    A0T(z5A072.A00, d0);
                    c2 = '\f';
                    break;
                case '\f':
                    z43 = z43;
                    z5A074 = z43.A07(AbstractC0402Cd.A0x);
                    z5A073 = z43.A07(AbstractC0402Cd.A11);
                    if (z5A074 == null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    z5A073 = z5A073;
                    if (z5A073 == null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c0417CzA00 = c0417CzA00;
                    z5A074 = z5A074;
                    z5A073 = z5A073;
                    c0544Ii2 = z5A074.A00;
                    c0544Ii = z5A073.A00;
                    if (c0417CzA00 == null) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c0417CzA00 = c0417CzA00;
                    str = c0417CzA00.A02;
                    c2 = 16;
                    break;
                case 16:
                    d0 = d0;
                    c0544Ii2 = c0544Ii2;
                    c0544Ii = c0544Ii;
                    A0V(c0544Ii2, c0544Ii, str, d0);
                    c2 = 17;
                    break;
                case 17:
                    z43 = z43;
                    size = z43.A02.size();
                    i3 = 0;
                    c2 = 18;
                    break;
                case 18:
                    if (i3 >= size) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    z43 = z43;
                    z5 = z43.A02.get(i3);
                    i2 = size;
                    if (((AbstractC0402Cd) z5).A00 != AbstractC0402Cd.A1Q) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    bArr2 = bArr2;
                    d0 = d0;
                    z5 = z5;
                    A0U(z5.A00, d0, bArr2);
                    c2 = 21;
                    break;
                case 21:
                    z42 = z42;
                    i3++;
                    z43 = z42;
                    size = i2;
                    c2 = 18;
                    break;
                case 22:
                    str = null;
                    c2 = 16;
                    break;
                case 23:
                    return;
            }
        }
    }

    public static void A0N(Z4 z4, Cp cp, long j, int i) {
        Cp cp2 = cp;
        Z5 z5 = null;
        int iA0H = 0;
        int leafChildrenSize = 0;
        int totalSampleCount = 0;
        int iA00 = 0;
        Z5 z52 = null;
        Cp cp3 = cp2;
        int i2 = 0;
        int i3 = 0;
        List<Z5> list = z4.A02;
        int size = list.size();
        int i4 = 0;
        int trunCount = 2;
        while (true) {
            switch (trunCount) {
                case 2:
                    if (i4 >= size) {
                        trunCount = 7;
                        break;
                    } else {
                        trunCount = 3;
                        break;
                    }
                case 3:
                    list = list;
                    z52 = list.get(i4);
                    if (((AbstractC0402Cd) z52).A00 != AbstractC0402Cd.A1N) {
                        trunCount = 6;
                        break;
                    } else {
                        trunCount = 4;
                        break;
                    }
                case 4:
                    z52 = z52;
                    C0544Ii c0544Ii = z52.A00;
                    c0544Ii.A0Y(12);
                    iA0H = c0544Ii.A0H();
                    if (iA0H <= 0) {
                        trunCount = 6;
                        break;
                    } else {
                        trunCount = 5;
                        break;
                    }
                case 5:
                    i3 += iA0H;
                    i2++;
                    trunCount = 6;
                    break;
                case 6:
                    i4++;
                    trunCount = 2;
                    break;
                case 7:
                    cp3 = cp3;
                    cp3.A02 = 0;
                    cp3.A00 = 0;
                    cp3.A01 = 0;
                    cp3.A07.A03(i2, i3);
                    leafChildrenSize = 0;
                    iA00 = 0;
                    totalSampleCount = 0;
                    trunCount = 8;
                    break;
                case 8:
                    if (totalSampleCount >= size) {
                        trunCount = 12;
                        break;
                    } else {
                        trunCount = 9;
                        break;
                    }
                case 9:
                    list = list;
                    z5 = list.get(totalSampleCount);
                    if (((AbstractC0402Cd) z5).A00 != AbstractC0402Cd.A1N) {
                        trunCount = 11;
                        break;
                    } else {
                        trunCount = 10;
                        break;
                    }
                case 10:
                    cp2 = cp2;
                    z5 = z5;
                    iA00 = A00(cp2, leafChildrenSize, j, i, z5.A00, iA00);
                    leafChildrenSize++;
                    trunCount = 11;
                    break;
                case 11:
                    totalSampleCount++;
                    trunCount = 8;
                    break;
                case 12:
                    return;
            }
        }
    }

    private void A0O(Z5 z5, long j) throws AF {
        ZA za = this;
        char c2 = !za.A0T.isEmpty() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    za = za;
                    z5 = z5;
                    za.A0T.peek().A09(z5);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    z5 = z5;
                    if (((AbstractC0402Cd) z5).A00 != AbstractC0402Cd.A12) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    za = za;
                    z5 = z5;
                    Pair<Long, C0953Yj> pairA04 = A04(z5.A00, j);
                    za.A0B = ((Long) pairA04.first).longValue();
                    za.A0C.ACq((CL) pairA04.second);
                    za.A0F = true;
                    c2 = 3;
                    break;
                case 6:
                    z5 = z5;
                    if (((AbstractC0402Cd) z5).A00 != AbstractC0402Cd.A0P) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    za = za;
                    z5 = z5;
                    za.A0Q(z5.A00);
                    c2 = 3;
                    break;
            }
        }
    }

    public static void A0P(C0417Cz c0417Cz, C0544Ii c0544Ii, D0 d0) throws AF {
        boolean subsampleEncryption = false;
        boolean[] zArr = null;
        int i = 0;
        int i2 = 0;
        int iA0E = 0;
        int iA0H = 0;
        int i3 = c0417Cz.A00;
        c0544Ii.A0Y(8);
        int flags = AbstractC0402Cd.A00(c0544Ii.A08());
        boolean z = true;
        int flags2 = (flags & 1) == 1 ? 2 : 3;
        while (true) {
            switch (flags2) {
                case 2:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Z(8);
                    flags2 = 3;
                    break;
                case 3:
                    c0544Ii = c0544Ii;
                    d0 = d0;
                    iA0E = c0544Ii.A0E();
                    iA0H = c0544Ii.A0H();
                    if (iA0H != d0.A00) {
                        flags2 = 15;
                        break;
                    } else {
                        flags2 = 4;
                        break;
                    }
                case 4:
                    i = 0;
                    if (iA0E != 0) {
                        flags2 = 11;
                        break;
                    } else {
                        flags2 = 5;
                        break;
                    }
                case 5:
                    d0 = d0;
                    zArr = d0.A0H;
                    i2 = 0;
                    flags2 = 6;
                    break;
                case 6:
                    if (i2 >= iA0H) {
                        flags2 = 13;
                        break;
                    } else {
                        flags2 = 7;
                        break;
                    }
                case 7:
                    c0544Ii = c0544Ii;
                    int sampleCount = c0544Ii.A0E();
                    i += sampleCount;
                    if (sampleCount <= i3) {
                        flags2 = 10;
                        break;
                    } else {
                        flags2 = 8;
                        break;
                    }
                case 8:
                    subsampleEncryption = true;
                    flags2 = 9;
                    break;
                case 9:
                    zArr = zArr;
                    zArr[i2] = subsampleEncryption;
                    i2++;
                    flags2 = 6;
                    break;
                case 10:
                    subsampleEncryption = false;
                    flags2 = 9;
                    break;
                case 11:
                    if (iA0E <= i3) {
                        flags2 = 14;
                        break;
                    } else {
                        flags2 = 12;
                        break;
                    }
                case 12:
                    d0 = d0;
                    int sampleInfoSize = iA0E * iA0H;
                    i = 0 + sampleInfoSize;
                    Arrays.fill(d0.A0H, 0, iA0H, z);
                    flags2 = 13;
                    break;
                case 13:
                    d0.A02(i);
                    return;
                case 14:
                    z = false;
                    flags2 = 12;
                    break;
                case 15:
                    throw new AF(A0A(42, 17, k.AppCompatTheme_windowFixedHeightMajor) + iA0H + A0A(0, 2, 113) + d0.A00);
            }
        }
    }

    private void A0Q(C0544Ii c0544Ii) {
        C0544Ii c0544Ii2 = c0544Ii;
        CO[] coArr = null;
        int i = 0;
        int length = 0;
        int sampleSize = 0;
        CO[] coArr2 = null;
        int length2 = 0;
        int i2 = 0;
        int iA04 = 0;
        long timescale = 0;
        long j = 0;
        long j2 = 0;
        C0556Iu c0556Iu = null;
        long jA06 = 0;
        ZA za = this;
        C0544Ii c0544Ii3 = c0544Ii2;
        CO[] coArr3 = za.A0I;
        char c2 = coArr3 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    coArr3 = coArr3;
                    if (coArr3.length != 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    c0544Ii2 = c0544Ii2;
                    za = za;
                    c0544Ii3 = c0544Ii3;
                    i2 = 12;
                    c0544Ii3.A0Y(12);
                    iA04 = c0544Ii2.A04();
                    c0544Ii2.A0Q();
                    c0544Ii2.A0Q();
                    timescale = C0560Iy.A0G(c0544Ii2.A0M(), 1000000L, c0544Ii2.A0M());
                    coArr2 = za.A0I;
                    length = coArr2.length;
                    i = 0;
                    c2 = 5;
                    break;
                case 5:
                    if (i >= length) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0544Ii3 = c0544Ii3;
                    coArr2 = coArr2;
                    CO co = coArr2[i];
                    c0544Ii3.A0Y(i2);
                    co.ACk(c0544Ii3, iA04);
                    i++;
                    c2 = 5;
                    break;
                case 7:
                    za = za;
                    j = za.A0B;
                    if (j == -9223372036854775807L) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    za = za;
                    j2 = j + timescale;
                    c0556Iu = za.A0S;
                    if (c0556Iu == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0556Iu = c0556Iu;
                    jA06 = c0556Iu.A06(j2);
                    c2 = '\n';
                    break;
                case '\n':
                    za = za;
                    coArr = za.A0I;
                    length2 = coArr.length;
                    sampleSize = 0;
                    c2 = 11;
                    break;
                case 11:
                    if (sampleSize >= length2) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    coArr = coArr;
                    coArr[sampleSize].ACl(jA06, 1, iA04, 0, null);
                    sampleSize++;
                    c2 = 11;
                    break;
                case '\r':
                    jA06 = j2;
                    c2 = '\n';
                    break;
                case 14:
                    za = za;
                    za.A0U.addLast(new C0412Co(timescale, iA04));
                    za.A03 += iA04;
                    c2 = 15;
                    break;
                case 15:
                    return;
            }
        }
    }

    public static void A0R(C0544Ii c0544Ii, int i, D0 d0) throws AF {
        int iA0H = 0;
        boolean z = false;
        c0544Ii.A0Y(i + 8);
        int iA00 = AbstractC0402Cd.A00(c0544Ii.A08());
        int sampleCount = (iA00 & 1) == 0 ? 2 : 8;
        while (true) {
            switch (sampleCount) {
                case 2:
                    if ((iA00 & 2) == 0) {
                        sampleCount = 6;
                        break;
                    } else {
                        sampleCount = 3;
                        break;
                    }
                case 3:
                    z = true;
                    sampleCount = 4;
                    break;
                case 4:
                    c0544Ii = c0544Ii;
                    d0 = d0;
                    iA0H = c0544Ii.A0H();
                    int sampleCount2 = d0.A00;
                    if (iA0H != sampleCount2) {
                        sampleCount = 7;
                        break;
                    } else {
                        sampleCount = 5;
                        break;
                    }
                case 5:
                    C0544Ii c0544Ii2 = c0544Ii;
                    D0 d02 = d0;
                    Arrays.fill(d02.A0H, 0, iA0H, z);
                    int sampleCount3 = c0544Ii2.A04();
                    d02.A02(sampleCount3);
                    d02.A05(c0544Ii2);
                    return;
                case 6:
                    z = false;
                    sampleCount = 4;
                    break;
                case 7:
                    StringBuilder sb = new StringBuilder();
                    sb.append(A0A(42, 17, k.AppCompatTheme_windowFixedHeightMajor));
                    sb.append(iA0H);
                    sb.append(A0A(0, 2, 113));
                    int sampleCount4 = d0.A00;
                    sb.append(sampleCount4);
                    throw new AF(sb.toString());
                case 8:
                    throw new AF(A0A(k.AppCompatTheme_viewInflaterClass, 56, 6));
            }
        }
    }

    public static void A0S(C0544Ii c0544Ii, D0 d0) throws AF {
        int flags = 0;
        long jA0N = 0;
        long j = 0;
        c0544Ii.A0Y(8);
        int iA08 = c0544Ii.A08();
        char c2 = (AbstractC0402Cd.A00(iA08) & 1) == 1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Z(8);
                    c2 = 3;
                    break;
                case 3:
                    c0544Ii = c0544Ii;
                    flags = c0544Ii.A0H();
                    if (flags != 1) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    d0 = d0;
                    int iA01 = AbstractC0402Cd.A01(iA08);
                    j = d0.A04;
                    if (iA01 != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0544Ii = c0544Ii;
                    jA0N = c0544Ii.A0M();
                    c2 = 6;
                    break;
                case 6:
                    d0.A04 = j + jA0N;
                    return;
                case 7:
                    c0544Ii = c0544Ii;
                    jA0N = c0544Ii.A0N();
                    c2 = 6;
                    break;
                case '\b':
                    throw new AF(A0A(577, 29, 73) + flags);
            }
        }
    }

    public static void A0T(C0544Ii c0544Ii, D0 d0) throws AF {
        A0R(c0544Ii, 0, d0);
    }

    public static void A0U(C0544Ii c0544Ii, D0 d0, byte[] bArr) throws AF {
        c0544Ii.A0Y(8);
        c0544Ii.A0c(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0b)) {
            return;
        }
        A0R(c0544Ii, 16, d0);
    }

    public static boolean A0W(int i) {
        boolean z = false;
        char c2 = i != AbstractC0402Cd.A0j ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    if (i == AbstractC0402Cd.A1L) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == AbstractC0402Cd.A0d) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == AbstractC0402Cd.A0h) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == AbstractC0402Cd.A16) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i == AbstractC0402Cd.A0i) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i == AbstractC0402Cd.A1K) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (i == AbstractC0402Cd.A0m) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (i != AbstractC0402Cd.A0N) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    z = true;
                    c2 = 11;
                    break;
                case 11:
                    return z;
                case '\f':
                    z = false;
                    c2 = 11;
                    break;
            }
        }
    }

    public static boolean A0X(int i) {
        boolean z = false;
        char c2 = i != AbstractC0402Cd.A0V ? (char) 2 : (char) 21;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == AbstractC0402Cd.A0c) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == AbstractC0402Cd.A0n) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == AbstractC0402Cd.A12) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == AbstractC0402Cd.A1A) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i == AbstractC0402Cd.A1H) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i == AbstractC0402Cd.A1I) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (i == AbstractC0402Cd.A1J) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (i == AbstractC0402Cd.A1M) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (i == AbstractC0402Cd.A1N) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    if (i == AbstractC0402Cd.A0r) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    if (i == AbstractC0402Cd.A0u) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    if (i == AbstractC0402Cd.A0t) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    if (i == AbstractC0402Cd.A10) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    if (i == AbstractC0402Cd.A1Q) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    if (i == AbstractC0402Cd.A0x) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    if (i == AbstractC0402Cd.A11) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    if (i == AbstractC0402Cd.A0O) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    if (i == AbstractC0402Cd.A0f) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    if (i != AbstractC0402Cd.A0P) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    z = true;
                    c2 = 22;
                    break;
                case 22:
                    return z;
                case 23:
                    z = false;
                    c2 = 22;
                    break;
            }
        }
    }

    private boolean A0Y(CD cd) throws InterruptedException, IOException {
        CD cd2 = cd;
        ZA za = this;
        long j = 0;
        long jA6U = 0;
        long j2 = 0;
        long jA6n = 0;
        int i = 0;
        long j3 = 0;
        long jA6n2 = 0;
        long j4 = 0;
        int size = 0;
        boolean z = false;
        char c2 = za.A00 == 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    za = za;
                    cd2 = cd2;
                    z = false;
                    z = false;
                    if (!cd2.AC8(za.A0O.A00, 0, 8, true)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return z;
                case 4:
                    za = za;
                    za.A00 = 8;
                    za.A0O.A0Y(z ? 1 : 0);
                    za.A07 = za.A0O.A0M();
                    za.A01 = za.A0O.A08();
                    c2 = 5;
                    break;
                case 5:
                    za = za;
                    j2 = za.A07;
                    if (j2 != 1) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    za = za;
                    cd2 = cd2;
                    cd2.readFully(za.A0O.A00, 8, 8);
                    za.A00 += 8;
                    za.A07 = za.A0O.A0N();
                    c2 = 7;
                    break;
                case 7:
                    za = za;
                    if (za.A07 < za.A00) {
                        c2 = '$';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    za = za;
                    cd2 = cd2;
                    jA6n2 = cd2.A6n() - za.A00;
                    if (za.A01 != AbstractC0402Cd.A0i) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    za = za;
                    size = za.A0K.size();
                    i = 0;
                    c2 = '\n';
                    break;
                case '\n':
                    if (i >= size) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    za = za;
                    D0 d0 = za.A0K.valueAt(i).A07;
                    d0.A03 = jA6n2;
                    d0.A04 = jA6n2;
                    d0.A05 = jA6n2;
                    i++;
                    c2 = '\n';
                    break;
                case '\f':
                    if (j2 != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    cd2 = cd2;
                    jA6U = cd2.A6U();
                    j3 = -1;
                    if (jA6U != -1) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    za = za;
                    if (!za.A0T.isEmpty()) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 15:
                    za = za;
                    jA6U = za.A0T.peek().A00;
                    c2 = 16;
                    break;
                case 16:
                    if (jA6U == j3) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    za = za;
                    cd2 = cd2;
                    za.A07 = (jA6U - cd2.A6n()) + za.A00;
                    c2 = 7;
                    break;
                case 18:
                    za = za;
                    if (za.A01 != AbstractC0402Cd.A0b) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    za = za;
                    za.A0D = null;
                    za.A09 = za.A07 + jA6n2;
                    if (!za.A0F) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 20:
                    za = za;
                    za.A0C.ACq(new C0958Yo(za.A08, jA6n2));
                    za.A0F = true;
                    c2 = 21;
                    break;
                case 21:
                    za.A02 = 2;
                    return true;
                case 22:
                    za = za;
                    if (!A0W(za.A01)) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    za = za;
                    cd2 = cd2;
                    jA6n = (cd2.A6n() + za.A07) - 8;
                    za.A0T.push(new Z4(za.A01, jA6n));
                    if (za.A07 != za.A00) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    za = za;
                    za.A0F(jA6n);
                    c2 = 25;
                    break;
                case 25:
                    return true;
                case 26:
                    za = za;
                    za.A0B();
                    c2 = 25;
                    break;
                case 27:
                    za = za;
                    j = 2147483647L;
                    if (!A0X(za.A01)) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    za = za;
                    if (za.A00 != 8) {
                        c2 = '\"';
                        break;
                    } else {
                        c2 = 29;
                        break;
                    }
                case 29:
                    za = za;
                    j4 = za.A07;
                    if (j4 > j) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    za = za;
                    za.A0E = new C0544Ii((int) j4);
                    System.arraycopy(za.A0O.A00, z ? 1 : 0, za.A0E.A00, z ? 1 : 0, 8);
                    za.A02 = 1;
                    c2 = 25;
                    break;
                case 31:
                    za = za;
                    if (za.A07 > j) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = ' ';
                        break;
                    }
                case ' ':
                    za = za;
                    za.A0E = null;
                    za.A02 = 1;
                    c2 = 25;
                    break;
                case '!':
                    throw new AF(A0A(528, 49, 106));
                case '\"':
                    throw new AF(A0A(304, 51, 41));
                case '#':
                    throw new AF(A0A(394, 53, 11));
                case '$':
                    throw new AF(A0A(256, 48, 126));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean A0Z(CD cd) throws InterruptedException, IOException {
        CD cd2 = cd;
        C0417Cz c0417CzA00 = null;
        D0 d0 = null;
        int i = 0;
        int i2 = 0;
        long jA06 = 0;
        int i3 = 0;
        int i4 = 0;
        byte[] bArr = null;
        int iA6n = 0;
        boolean z = false;
        int i5 = 0;
        C0416Cy c0416Cy = null;
        int iA6n2 = 0;
        int i6 = 0;
        int iACj = 0;
        Cp cpA07 = null;
        boolean z2 = 0;
        CO co = null;
        CN cn = null;
        long jA00 = 0;
        C0556Iu c0556Iu = null;
        ZA za = this;
        CD cd3 = cd2;
        int i7 = 4;
        boolean z3 = true;
        byte b2 = 0;
        int i8 = za.A02 == 3 ? 2 : 17;
        while (true) {
            switch (i8) {
                case 2:
                    za = za;
                    if (za.A0D != null) {
                        i8 = 10;
                        break;
                    } else {
                        i8 = 3;
                        break;
                    }
                case 3:
                    za = za;
                    cpA07 = A07(za.A0K);
                    if (cpA07 != null) {
                        i8 = 7;
                        break;
                    } else {
                        i8 = 4;
                        break;
                    }
                case 4:
                    cd2 = cd2;
                    za = za;
                    iA6n = (int) (za.A09 - cd2.A6n());
                    if (iA6n < 0) {
                        i8 = 6;
                        break;
                    } else {
                        i8 = 5;
                        break;
                    }
                case 5:
                    cd3.ADL(iA6n);
                    A0B();
                    return false;
                case 6:
                    throw new AF(A0A(221, 35, 42));
                case 7:
                    cd2 = cd2;
                    cpA07 = cpA07;
                    iA6n2 = (int) (cpA07.A07.A0G[cpA07.A02] - cd2.A6n());
                    if (iA6n2 >= 0) {
                        i8 = 9;
                        break;
                    } else {
                        i8 = 8;
                        break;
                    }
                case 8:
                    Log.w(A0A(199, 22, 45), A0A(2, 40, 34));
                    iA6n2 = 0;
                    i8 = 9;
                    break;
                case 9:
                    za = za;
                    cd3 = cd3;
                    cpA07 = cpA07;
                    cd3.ADL(iA6n2);
                    za.A0D = cpA07;
                    i8 = 10;
                    break;
                case 10:
                    za = za;
                    za.A06 = za.A0D.A07.A0D[za.A0D.A01];
                    if (za.A0D.A01 >= za.A0D.A03) {
                        i8 = 14;
                        break;
                    } else {
                        i8 = 11;
                        break;
                    }
                case 11:
                    za = za;
                    cd3 = cd3;
                    cd3.ADL(za.A06);
                    za.A0D.A01();
                    if (!za.A0D.A08()) {
                        i8 = 12;
                        break;
                    } else {
                        i8 = 13;
                        break;
                    }
                case 12:
                    za = za;
                    za.A0D = null;
                    i8 = 13;
                    break;
                case 13:
                    za.A02 = 3;
                    return z3;
                case 14:
                    za = za;
                    if (za.A0D.A05.A02 != z3) {
                        i8 = 16;
                        break;
                    } else {
                        i8 = 15;
                        break;
                    }
                case 15:
                    za = za;
                    cd3 = cd3;
                    za.A06 -= 8;
                    cd3.ADL(8);
                    i8 = 16;
                    break;
                case 16:
                    za = za;
                    b2 = 0;
                    za.A04 = za.A0D.A03();
                    za.A06 += za.A04;
                    za.A02 = i7;
                    za.A05 = 0;
                    i8 = 17;
                    break;
                case 17:
                    za = za;
                    d0 = za.A0D.A07;
                    c0416Cy = za.A0D.A05;
                    co = za.A0D.A06;
                    i6 = za.A0D.A01;
                    jA00 = d0.A00(i6) * 1000;
                    c0556Iu = za.A0S;
                    if (c0556Iu == null) {
                        i8 = 32;
                        break;
                    } else {
                        i8 = 18;
                        break;
                    }
                case 18:
                    c0556Iu = c0556Iu;
                    jA06 = c0556Iu.A06(jA00);
                    i8 = 19;
                    break;
                case 19:
                    c0416Cy = c0416Cy;
                    if (c0416Cy.A01 == 0) {
                        i8 = 33;
                        break;
                    } else {
                        i8 = 20;
                        break;
                    }
                case 20:
                    za = za;
                    c0416Cy = c0416Cy;
                    bArr = za.A0Q.A00;
                    bArr[b2] = b2;
                    bArr[z3 ? 1 : 0] = b2;
                    bArr[2] = b2;
                    i4 = c0416Cy.A01 + (z3 ? 1 : 0);
                    i3 = 4 - c0416Cy.A01;
                    i8 = 21;
                    break;
                case 21:
                    za = za;
                    if (za.A04 >= za.A06) {
                        i8 = 35;
                        break;
                    } else {
                        i8 = 22;
                        break;
                    }
                case 22:
                    za = za;
                    i2 = za.A05;
                    if (i2 != 0) {
                        i8 = 28;
                        break;
                    } else {
                        i8 = 23;
                        break;
                    }
                case 23:
                    za = za;
                    cd3 = cd3;
                    co = co;
                    bArr = bArr;
                    cd3.readFully(bArr, i3, i4);
                    za.A0Q.A0Y(b2);
                    za.A05 = za.A0Q.A0H() - (z3 ? 1 : 0);
                    za.A0R.A0Y(b2);
                    co.ACk(za.A0R, i7);
                    co.ACk(za.A0Q, z3 ? 1 : 0);
                    if (za.A0H.length <= 0) {
                        i8 = 27;
                        break;
                    } else {
                        i8 = 24;
                        break;
                    }
                case 24:
                    c0416Cy = c0416Cy;
                    bArr = bArr;
                    if (!C0540Ie.A0C(c0416Cy.A07.A0O, bArr[i7])) {
                        i8 = 27;
                        break;
                    } else {
                        i8 = 25;
                        break;
                    }
                case 25:
                    z = true;
                    i8 = 26;
                    break;
                case 26:
                    za = za;
                    za.A0G = z;
                    za.A04 += 5;
                    za.A06 += i3;
                    i8 = 21;
                    break;
                case 27:
                    z = false;
                    i8 = 26;
                    break;
                case 28:
                    za = za;
                    if (!za.A0G) {
                        i8 = 31;
                        break;
                    } else {
                        i8 = 29;
                        break;
                    }
                case 29:
                    za = za;
                    cd3 = cd3;
                    c0416Cy = c0416Cy;
                    co = co;
                    za.A0P.A0W(i2);
                    cd3.readFully(za.A0P.A00, b2, za.A05);
                    co.ACk(za.A0P, za.A05);
                    iACj = za.A05;
                    int iA02 = C0540Ie.A02(za.A0P.A00, za.A0P.A07());
                    za.A0P.A0Y(A0A(634, 10, 79).equals(c0416Cy.A07.A0O) ? 1 : 0);
                    za.A0P.A0X(iA02);
                    C0494Gi.A03(jA06, za.A0P, za.A0H);
                    i8 = 30;
                    break;
                case 30:
                    za = za;
                    za.A04 += iACj;
                    za.A05 -= iACj;
                    i7 = 4;
                    z3 = true;
                    b2 = 0;
                    i8 = 21;
                    break;
                case 31:
                    cd3 = cd3;
                    co = co;
                    iACj = co.ACj(cd3, i2, false);
                    i8 = 30;
                    break;
                case 32:
                    jA06 = jA00;
                    i8 = 19;
                    break;
                case 33:
                    za = za;
                    i5 = za.A04;
                    i = za.A06;
                    if (i5 >= i) {
                        i8 = 35;
                        break;
                    } else {
                        i8 = 34;
                        break;
                    }
                case 34:
                    za = za;
                    cd3 = cd3;
                    co = co;
                    za.A04 += co.ACj(cd3, i - i5, false);
                    i8 = 33;
                    break;
                case 35:
                    d0 = d0;
                    z2 = d0.A0I[i6];
                    cn = null;
                    if (!d0.A0A) {
                        i8 = 39;
                        break;
                    } else {
                        i8 = 36;
                        break;
                    }
                case 36:
                    d0 = d0;
                    z2 = (z2 ? 1 : 0) | 0;
                    if (d0.A08 == null) {
                        i8 = 42;
                        break;
                    } else {
                        i8 = 37;
                        break;
                    }
                case 37:
                    d0 = d0;
                    c0417CzA00 = d0.A08;
                    i8 = 38;
                    break;
                case 38:
                    c0417CzA00 = c0417CzA00;
                    cn = c0417CzA00.A01;
                    i8 = 39;
                    break;
                case 39:
                    za = za;
                    co = co;
                    co.ACl(jA06, z2 ? 1 : 0, za.A06, 0, cn);
                    za.A0E(jA06);
                    if (!za.A0D.A08()) {
                        i8 = 40;
                        break;
                    } else {
                        i8 = 41;
                        break;
                    }
                case 40:
                    za = za;
                    za.A0D = null;
                    i8 = 41;
                    break;
                case 41:
                    za.A02 = 3;
                    return true;
                case 42:
                    d0 = d0;
                    c0416Cy = c0416Cy;
                    c0417CzA00 = c0416Cy.A00(d0.A07.A02);
                    i8 = 38;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void A7T(CE ce) {
        this.A0C = ce;
        C0416Cy c0416Cy = this.A0N;
        if (c0416Cy != null) {
            Cp cp = new Cp(ce.ADd(0, c0416Cy.A03));
            cp.A07(this.A0N, new C0408Cj(0, 0, 0, 0));
            this.A0K.put(0, cp);
            A0C();
            this.A0C.A4w();
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final int AC3(CD cd, CJ cj) throws InterruptedException, IOException {
        ZA za = this;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    za = za;
                    i = za.A02;
                    if (i == 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 1) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    za = za;
                    cd = cd;
                    if (!za.A0Z(cd)) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return 0;
                case 7:
                    za = za;
                    cd = cd;
                    za.A0H(cd);
                    c2 = 2;
                    break;
                case '\b':
                    za = za;
                    cd = cd;
                    za.A0G(cd);
                    c2 = 2;
                    break;
                case '\t':
                    za = za;
                    cd = cd;
                    if (!za.A0Y(cd)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 2;
                        break;
                    }
                case '\n':
                    return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void ACp(long j, long j2) {
        ZA za = this;
        int size = za.A0K.size();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= size) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    za = za;
                    za.A0K.valueAt(i).A04();
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    ZA za2 = za;
                    za2.A0U.clear();
                    za2.A03 = 0;
                    za2.A0A = j2;
                    za2.A0T.clear();
                    za2.A0B();
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final boolean ADM(CD cd) throws InterruptedException, IOException {
        return C0415Cw.A03(cd);
    }
}

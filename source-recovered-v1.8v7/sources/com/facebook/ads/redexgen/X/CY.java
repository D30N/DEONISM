package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.video.ColorInfo;
import d.b.a.b.k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class CY {
    public static byte[] A0h;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public long A0S;
    public long A0T;
    public DrmInitData A0U;
    public CN A0V;
    public CO A0W;

    @Nullable
    public CZ A0X;
    public String A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public byte[] A0d;
    public byte[] A0e;
    public byte[] A0f;
    public String A0g;

    static {
        A04();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0h, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 15);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A0h = new byte[]{68, Byte.MAX_VALUE, 116, 105, 97, 116, 114, 101, 116, 117, 49, 92, 88, 92, 84, 49, 101, 104, 97, 116, 63, 59, 48, 57, 3, 18, 15, 3, 88, 15, 90, 4, 4, 22, 118, 98, 115, 126, 120, 56, 97, 121, 115, 57, 115, 99, 100, 57, Byte.MAX_VALUE, 115, 121, 103, 121, 123, 11, 69, 105, 124, 122, 103, 123, 99, 105, 77, 112, 124, 122, 105, 107, 124, 103, 122, 0, 30, 5, 21, 18, 18, 27, 9, 20, 1, 3, 112, 107, 13, 23, 11, 107, 5, 23, 20, 36, 19, 19, 14, 19, 65, 17, 0, 19, 18, 8, 15, 6, 65, 44, 50, 78, 32, 34, 44, 65, 2, 14, 5, 4, 2, 65, 17, 19, 8, 23, 0, 21, 4, 59, 12, 12, 17, 12, 94, 14, 31, 12, 13, 23, 16, 25, 94, 56, 17, 11, 12, 61, 61, 94, 14, 12, 23, 8, 31, 10, 27, 94, 26, 31, 10, 31, 40, 54, 45, 61, 58, 70, 44, 49, 57, 59, 44, 58, 58, 6, 18, 3, 14, 8, 72, 19, 21, 18, 2, 74, 15, 3, 104, 124, 109, 96, 102, 38, 104, 106, 58, 57, 53, 46, 60, 40, 57, 63, 40, 101, 116, 116, 104, 109, 103, 101, 112, 109, 107, 106, 43, 124, 41, 119, 113, 102, 118, 109, 116, 75, 66, 80, 77, 88, 90, 41, 50, 84, 78, 82, 50, 92, 75, 94, 90, 75, 75, 87, 82, 88, 90, 79, 82, 84, 85, 20, 75, 92, 72, 66, 75, 89, 68, 81, 83, 92, 59, 93, 71, 91, 59, 92, 81, 66, 87, 71, 89, 75, 86, 67, 65, 41, 74, 53, 105, 119, 120, 107, 101, 7, 97, 102, 124, 7, 100, 97, 124, 45, 51, 45, 45, 47, 35, 55, 38, 43, 45, 109, 58, 111, 55, 44, 41, 44, 45, 53, 44, 83, 77, 93, 66, 71, 65, 32, 44, 37, 60, 49, 32, 38, 49, 103, 105, 26, 44, 61, 61, 32, 39, 46, 105, 36, 32, 36, 44, 29, 48, 57, 44, 105, 61, 38, 105, 45, 33, 54, 58, 51, 40, 81, 46, 57, 45, 49, 46, 35, 34, 40, 104, 63, 106, 49, 41, 35, 105, 40, 41, 117, 105, 49, 55, 126, 61, 49, 58, 43, 54, 58, 65, 59, 58, 40, 86, 31, 1, 27, 31, 29, 109, 70, 125, 97, 118, 112, 124, 116, 125, 122, 105, 118, 119, 51, 112, 124, 119, 118, 112, 51, 122, 119, 118, 125, 103, 122, 117, 122, 118, 97, 61, 64, 76, 71, 86, 75, 71, 60, 82, 64, 64, 91, 79, 94, 83, 85, 21, 76, 85, 72, 88, 83, 73, 113, 111, 125, 96, 117, 119, 31, 124, 2, 76, 109, 108, 47, 82, 65, 79, 34, 79, 81, 45, 67, 65, 79, 34, 107, 113, 34, 119, 108, 113, 119, 114, 114, 109, 112, 118, 103, 102, 44, 34, 81, 103, 118, 118, 107, 108, 101, 34, 111, 107, 111, 103, 86, 123, 114, 103, 34, 118, 109, 34, 17, 15, 6, 31, 2, 18, 25, 3, 86, 66, 83, 94, 88, 24, 81, 91, 86, 84, 15, 16, 29, 28, 22, 86, 24, 15, 26, 10, 30, 15, 2, 4, 68, 6, 27, 14, 12, 70, 39, 89, 69, 114, 114, 111, 114, 32, 112, 97, 114, 115, 105, 110, 103, 32, 118, 111, 114, 98, 105, 115, 32, 99, 111, 100, 101, 99, 32, 112, 114, 105, 118, 97, 116, 101, 13, 28, 28, 0, 5, 15, 13, 24, 5, 3, 2, 67, 8, 26, 14, 31, 25, 14, 31, 16, 15, 2, 3, 9, 73, 11, 22, 82, 16, 75, 3, 21, 92, 103, 122, 124, 121, 121, 102, 123, 125, 108, 109, 41, 89, 74, 68, 41, 107, 96, 125, 41, 109, 108, 121, 125, 97, 51, 41, 35, 42, 35, 37, 77, 49, 56, 42, 55, 34, 32, 83, 72, 46, 52, 40, 72, 38, 55, 79, 70, 77, 81, 92, 86, 75, 88, 30, 23, 30, 24, 113, 97, 117, 100, 105, 111, 47, 101, 97, 99, 51, 112, 111, 98, 99, 105, 41, 53, 97, 118, 118, 60, 35, 46, 47, 37, 101, 61, 60, 41, 123, 76, 88, 73, 68, 66, 2, 64, 93, 72, 74, 107, 116, 121, 120, 114, 50, 101, 48, 107, 115, 121, 51, 114, 115, 47, 51, 107, 109, 37, 4, 26, 8, 22, 106, 4, 6, 8, 39, 28, 25, 28, 29, 5, 28, 82, 52, 29, 7, 0, 49, 49, 92, 82, 33, 23, 6, 6, 27, 28, 21, 82, 31, 27, 31, 23, 38, 11, 2, 23, 82, 6, 29, 82, 4, 27, 22, 23, 29, 93, 10, 95, 7, 28, 25, 28, 29, 5, 28, 8, 1, 19, 14, 27, 25, 106, 113, 23, 13, 17, 113, 13, 14, 68, 90, 81, 87, 80, 64, 77, 65, 27, 15, 30, 19, 21, 85, 23, 10, 78, 27, 87, 22, 27, 14, 23, 107, 116, 121, 120, 114, 50, 117, 120, 107, 126, 15, 27, 10, 7, 1, 65, 24, 0, 10, 64, 10, 26, 29, 33, 63, 36, 52, 51, 79, 44, 47, 51, 51, 44, 37, 51, 51, 47, 59, 42, 39, 33, 97, 60, 47, 57, 125, 90, 82, 87, 94, 95, 27, 79, 84, 27, 93, 82, 85, 95, 27, 125, 84, 78, 73, 120, 120, 27, 109, 120, 10, 27, 82, 85, 82, 79, 82, 90, 87, 82, 65, 90, 79, 82, 84, 85, 27, 95, 90, 79, 90, 35, 42, 56, 37, 48, 50, 71, 104, 119, 122, 123, 113, 49, 102, 51, 107, 112, 117, 112, 113, 105, 112, 45, 51, 42, 32, 45, 47, 31, 0, 13, 12, 6, 70, 4, 25, 12, 14, 91, 20, 0, 17, 28, 26, 90, 26, 5, 0, 6, 74, 67, 81, 79, 51, 74, 90, 75, 51, 90, 83, 73, 78, 95, 95, 40, 57, 57, 37, 32, 42, 40, 61, 32, 38, 39, 102, 63, 38, 43, 58, 60, 43};
    }

    public CY() {
        this.A0R = -1;
        this.A0J = -1;
        this.A0I = -1;
        this.A0G = -1;
        this.A0H = 0;
        this.A0e = null;
        this.A0P = -1;
        this.A0b = false;
        this.A0D = -1;
        this.A0E = -1;
        this.A0C = -1;
        this.A0K = AdError.NETWORK_ERROR_CODE;
        this.A0L = 200;
        this.A06 = -1.0f;
        this.A07 = -1.0f;
        this.A04 = -1.0f;
        this.A05 = -1.0f;
        this.A02 = -1.0f;
        this.A03 = -1.0f;
        this.A08 = -1.0f;
        this.A09 = -1.0f;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0B = 1;
        this.A0A = -1;
        this.A0O = 8000;
        this.A0S = 0L;
        this.A0T = 0L;
        this.A0Z = true;
        this.A0g = A01(21, 3, 81);
    }

    public /* synthetic */ CY(C0968Yy c0968Yy) {
        this();
    }

    public static Pair<String, List<byte[]>> A00(C0544Ii c0544Ii) throws AF {
        try {
            c0544Ii.A0Z(16);
            long jA0K = c0544Ii.A0K();
            if (jA0K == 1482049860) {
                return new Pair<>(A01(679, 10, 9), null);
            }
            if (jA0K == 826496599) {
                byte[] bArr = c0544Ii.A00;
                for (int iA06 = c0544Ii.A06() + 20; iA06 < bArr.length - 4; iA06++) {
                    if (bArr[iA06] == 0 && bArr[iA06 + 1] == 0) {
                        int offset = bArr[iA06 + 2];
                        if (offset == 1) {
                            int offset2 = bArr[iA06 + 3];
                            if (offset2 == 15) {
                                return new Pair<>(A01(689, 10, 69), Collections.singletonList(Arrays.copyOfRange(bArr, iA06, bArr.length)));
                            }
                        } else {
                            continue;
                        }
                    }
                }
                throw new AF(A01(870, 45, 52));
            }
            Log.w(A01(55, 17, 7), A01(736, 51, 125));
            return new Pair<>(A01(922, 15, 17), null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new AF(A01(126, 33, 113));
        }
    }

    public static List<byte[]> A03(byte[] bArr) throws AF {
        String strA01 = A01(544, 34, 15);
        try {
            if (bArr[0] == 2) {
                int i = 1;
                int i2 = 0;
                while (bArr[i] == -1) {
                    i2 += 255;
                    i++;
                }
                int vorbisSkipLength = i + 1;
                int i3 = i2 + bArr[i];
                int i4 = 0;
                while (bArr[vorbisSkipLength] == -1) {
                    i4 += 255;
                    vorbisSkipLength++;
                }
                int i5 = vorbisSkipLength + 1;
                int offset = bArr[vorbisSkipLength];
                int i6 = i4 + offset;
                int vorbisSkipLength2 = bArr[i5];
                if (vorbisSkipLength2 == 1) {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, i5, bArr2, 0, i3);
                    int i7 = i5 + i3;
                    int vorbisSkipLength3 = bArr[i7];
                    if (vorbisSkipLength3 == 3) {
                        int i8 = i7 + i6;
                        int vorbisSkipLength4 = bArr[i8];
                        if (vorbisSkipLength4 == 5) {
                            int offset2 = bArr.length;
                            byte[] bArr3 = new byte[offset2 - i8];
                            int offset3 = bArr.length;
                            System.arraycopy(bArr, i8, bArr3, 0, offset3 - i8);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new AF(strA01);
                    }
                    throw new AF(strA01);
                }
                throw new AF(strA01);
            }
            throw new AF(strA01);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new AF(strA01);
        }
    }

    public static boolean A05(C0544Ii c0544Ii) throws AF {
        int iA0C = 0;
        boolean z = false;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    iA0C = c0544Ii.A0C();
                    z = true;
                    if (iA0C != 1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return z;
                case 5:
                    if (iA0C != 65534) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Y(24);
                    if (c0544Ii.A0L() != Z0.A0r.getMostSignificantBits()) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    try {
                        c0544Ii = c0544Ii;
                        if (c0544Ii.A0L() != Z0.A0r.getLeastSignificantBits()) {
                            c2 = 15;
                            break;
                        } else {
                            c2 = 16;
                            break;
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new AF(A01(92, 34, 110));
                    }
                case 15:
                    z = false;
                    c2 = 16;
                    break;
                case 16:
                    return z;
                case 17:
                    return false;
            }
        }
    }

    private byte[] A06() {
        CY cy = this;
        char c2 = cy.A06 != -1.0f ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    cy = cy;
                    if (cy.A07 == -1.0f) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    cy = cy;
                    if (cy.A04 == -1.0f) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    cy = cy;
                    if (cy.A05 == -1.0f) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    cy = cy;
                    if (cy.A02 == -1.0f) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    cy = cy;
                    if (cy.A03 == -1.0f) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    cy = cy;
                    if (cy.A08 == -1.0f) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    cy = cy;
                    if (cy.A09 == -1.0f) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    cy = cy;
                    if (cy.A00 == -1.0f) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    cy = cy;
                    if (cy.A01 != -1.0f) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return (byte[]) null;
                case '\f':
                    CY cy2 = cy;
                    byte[] bArr = new byte[25];
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    byteBufferWrap.put((byte) 0);
                    byteBufferWrap.putShort((short) ((cy2.A06 * 50000.0f) + 0.5f));
                    byteBufferWrap.putShort((short) ((cy2.A07 * 50000.0f) + 0.5f));
                    byteBufferWrap.putShort((short) ((cy2.A04 * 50000.0f) + 0.5f));
                    byteBufferWrap.putShort((short) ((cy2.A05 * 50000.0f) + 0.5f));
                    byteBufferWrap.putShort((short) ((cy2.A02 * 50000.0f) + 0.5f));
                    byteBufferWrap.putShort((short) ((cy2.A03 * 50000.0f) + 0.5f));
                    byteBufferWrap.putShort((short) ((cy2.A08 * 50000.0f) + 0.5f));
                    byteBufferWrap.putShort((short) ((cy2.A09 * 50000.0f) + 0.5f));
                    byteBufferWrap.putShort((short) (cy2.A00 + 0.5f));
                    byteBufferWrap.putShort((short) (cy2.A01 + 0.5f));
                    byteBufferWrap.putShort((short) cy2.A0K);
                    byteBufferWrap.putShort((short) cy2.A0L);
                    return bArr;
            }
        }
    }

    public final void A07() {
        CZ cz = this.A0X;
        if (cz != null) {
            cz.A02(this);
        }
    }

    public final void A08() {
        CZ cz = this.A0X;
        if (cz != null) {
            cz.A00();
        }
    }

    public final void A09(CE ce, int i) throws AF {
        char c2;
        CY cy = this;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        Format formatA0A = null;
        int i6 = 0;
        int i7 = 0;
        String strA01 = null;
        byte[] bArr = null;
        String strA012 = null;
        char c3 = 0;
        List listSingletonList = null;
        float f = 0.0f;
        String strA013 = null;
        ColorInfo colorInfo = null;
        String strA014 = null;
        int i8 = 0;
        CY cy2 = cy;
        int i9 = -1;
        int iA02 = -1;
        List listSingletonList2 = null;
        String str = cy2.A0Y;
        int i10 = 0;
        switch (str.hashCode()) {
            case -2095576542:
                c2 = 5;
                break;
            case -2095575984:
                c2 = 7;
                break;
            case -1985379776:
                c2 = '\t';
                break;
            case -1784763192:
                c2 = 11;
                break;
            case -1730367663:
                c2 = '\r';
                break;
            case -1482641358:
                c2 = 15;
                break;
            case -1482641357:
                c2 = 17;
                break;
            case -1373388978:
                c2 = 19;
                break;
            case -933872740:
                c2 = 21;
                break;
            case -538363189:
                c2 = 23;
                break;
            case -538363109:
                c2 = 25;
                break;
            case -425012669:
                c2 = 27;
                break;
            case -356037306:
                c2 = 29;
                break;
            case 62923557:
                c2 = 31;
                break;
            case 62923603:
                c2 = '!';
                break;
            case 62927045:
                c2 = '#';
                break;
            case 82338133:
                c2 = '%';
                break;
            case 82338134:
                c2 = '\'';
                break;
            case 99146302:
                c2 = ')';
                break;
            case 444813526:
                c2 = '+';
                break;
            case 542569478:
                c2 = '-';
                break;
            case 725957860:
                c2 = '/';
                break;
            case 738597099:
                c2 = '1';
                break;
            case 855502857:
                c2 = '3';
                break;
            case 1422270023:
                c2 = '5';
                break;
            case 1809237540:
                c2 = '7';
                break;
            case 1950749482:
                c2 = '9';
                break;
            case 1950789798:
                c2 = ';';
                break;
            case 1951062397:
                c2 = '=';
                break;
            default:
                c2 = 2;
                break;
        }
        while (true) {
            switch (c2) {
                case 2:
                    c3 = 65535;
                    c2 = 3;
                    break;
                case 3:
                    strA012 = A01(324, 22, 70);
                    strA013 = A01(610, 27, 6);
                    strA01 = A01(55, 17, 7);
                    switch (c3) {
                        case 0:
                            c2 = '?';
                            break;
                        case 1:
                            c2 = '@';
                            break;
                        case 2:
                            c2 = 'A';
                            break;
                        case 3:
                            c2 = 'B';
                            break;
                        case 4:
                            c2 = 'B';
                            break;
                        case 5:
                            c2 = 'B';
                            break;
                        case 6:
                            c2 = 'F';
                            break;
                        case 7:
                            c2 = 'G';
                            break;
                        case '\b':
                            c2 = 'H';
                            break;
                        case '\t':
                            c2 = 'I';
                            break;
                        case '\n':
                            c2 = 'J';
                            break;
                        case 11:
                            c2 = 'K';
                            break;
                        case '\f':
                            c2 = 'L';
                            break;
                        case '\r':
                            c2 = 'M';
                            break;
                        case 14:
                            c2 = 'N';
                            break;
                        case 15:
                            c2 = 'O';
                            break;
                        case 16:
                            c2 = 'P';
                            break;
                        case 17:
                            c2 = 'Q';
                            break;
                        case 18:
                            c2 = 'R';
                            break;
                        case 19:
                            c2 = 'R';
                            break;
                        case 20:
                            c2 = 'S';
                            break;
                        case 21:
                            c2 = 'T';
                            break;
                        case 22:
                            c2 = 'U';
                            break;
                        case 23:
                            c2 = 'Y';
                            break;
                        case 24:
                            c2 = '[';
                            break;
                        case 25:
                            c2 = '\\';
                            break;
                        case 26:
                            c2 = ']';
                            break;
                        case 27:
                            c2 = '^';
                            break;
                        case 28:
                            c2 = '_';
                            break;
                        default:
                            c2 = 4;
                            break;
                    }
                case 4:
                    throw new AF(A01(392, 30, 28));
                case 5:
                    str = str;
                    if (!str.equals(A01(642, 14, 104))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c3 = 5;
                    c2 = 3;
                    break;
                case 7:
                    str = str;
                    if (!str.equals(A01(787, 14, 81))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c3 = 3;
                    c2 = 3;
                    break;
                case '\t':
                    str = str;
                    if (!str.equals(A01(728, 8, 74))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c3 = 22;
                    c2 = 3;
                    break;
                case 11:
                    str = str;
                    if (!str.equals(A01(801, 8, 10))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c3 = 17;
                    c2 = 3;
                    break;
                case '\r':
                    str = str;
                    if (!str.equals(A01(504, 8, 95))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c3 = '\n';
                    c2 = 3;
                    break;
                case 15:
                    str = str;
                    if (!str.equals(A01(444, 9, 63))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c3 = '\r';
                    c2 = 3;
                    break;
                case 17:
                    str = str;
                    if (!str.equals(A01(268, 9, 9))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c3 = 14;
                    c2 = 3;
                    break;
                case 19:
                    str = str;
                    if (!str.equals(A01(964, 15, 19))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c3 = '\b';
                    c2 = 3;
                    break;
                case 21:
                    str = str;
                    if (!str.equals(A01(194, 8, 101))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    c3 = 28;
                    c2 = 3;
                    break;
                case 23:
                    str = str;
                    if (!str.equals(A01(77, 15, 75))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    c3 = 4;
                    c2 = 3;
                    break;
                case 25:
                    str = str;
                    if (!str.equals(A01(222, 15, 18))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    c3 = 6;
                    c2 = 3;
                    break;
                case 27:
                    str = str;
                    if (!str.equals(A01(316, 8, k.AppCompatTheme_windowNoTitle))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    c3 = 26;
                    c2 = 3;
                    break;
                case 29:
                    str = str;
                    if (!str.equals(A01(847, 14, 111))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    c3 = 20;
                    c2 = 3;
                    break;
                case 31:
                    str = str;
                    if (!str.equals(A01(290, 5, 99))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = ' ';
                        break;
                    }
                case ' ':
                    c3 = '\f';
                    c2 = 3;
                    break;
                case '!':
                    str = str;
                    if (!str.equals(A01(50, 5, 55))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '\"';
                        break;
                    }
                case '\"':
                    c3 = 15;
                    c2 = 3;
                    break;
                case '#':
                    str = str;
                    if (!str.equals(A01(72, 5, 78))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case '$':
                    c3 = 18;
                    c2 = 3;
                    break;
                case '%':
                    str = str;
                    if (!str.equals(A01(637, 5, k.AppCompatTheme_windowMinWidthMajor))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '&';
                        break;
                    }
                case '&':
                    c3 = 0;
                    c2 = 3;
                    break;
                case '\'':
                    str = str;
                    if (!str.equals(A01(664, 5, 71))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '(';
                        break;
                    }
                case '(':
                    c3 = 1;
                    c2 = 3;
                    break;
                case ')':
                    str = str;
                    if (!str.equals(A01(346, 10, 113))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '*';
                        break;
                    }
                case '*':
                    c3 = 27;
                    c2 = 3;
                    break;
                case '+':
                    str = str;
                    if (!str.equals(A01(656, 8, 22))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = ',';
                        break;
                    }
                case ',':
                    c3 = '\t';
                    c2 = 3;
                    break;
                case '-':
                    str = str;
                    if (!str.equals(A01(159, 13, 102))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '.';
                        break;
                    }
                case '.':
                    c3 = 19;
                    c2 = 3;
                    break;
                case '/':
                    str = str;
                    if (!str.equals(A01(277, 13, 39))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '0';
                        break;
                    }
                case '0':
                    c3 = 23;
                    c2 = 3;
                    break;
                case '1':
                    str = str;
                    if (!str.equals(A01(422, 10, 28))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '2';
                        break;
                    }
                case '2':
                    c3 = 25;
                    c2 = 3;
                    break;
                case '3':
                    str = str;
                    if (!str.equals(A01(252, 16, 27))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '4';
                        break;
                    }
                case '4':
                    c3 = 7;
                    c2 = 3;
                    break;
                case '5':
                    str = str;
                    if (!str.equals(A01(375, 11, 97))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '6';
                        break;
                    }
                case '6':
                    c3 = 24;
                    c2 = 3;
                    break;
                case '7':
                    str = str;
                    if (!str.equals(A01(915, 7, k.AppCompatTheme_windowMinWidthMajor))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '8';
                        break;
                    }
                case '8':
                    c3 = 2;
                    c2 = 3;
                    break;
                case '9':
                    str = str;
                    if (!str.equals(A01(386, 6, 81))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = ':';
                        break;
                    }
                case ':':
                    c3 = 16;
                    c2 = 3;
                    break;
                case ';':
                    str = str;
                    if (!str.equals(A01(937, 6, 99))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '<';
                        break;
                    }
                case '<':
                    c3 = 21;
                    c2 = 3;
                    break;
                case '=':
                    str = str;
                    if (!str.equals(A01(310, 6, 29))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '>';
                        break;
                    }
                case '>':
                    c3 = 11;
                    c2 = 3;
                    break;
                case '?':
                    strA014 = A01(709, 19, 18);
                    c2 = '`';
                    break;
                case '@':
                    strA014 = A01(356, 19, 72);
                    c2 = '`';
                    break;
                case 'A':
                    strA014 = A01(943, 11, 102);
                    c2 = '`';
                    break;
                case 'B':
                    cy2 = cy2;
                    strA014 = A01(597, 13, 105);
                    bArr = cy2.A0d;
                    if (bArr != null) {
                        c2 = 'E';
                        break;
                    } else {
                        c2 = 'C';
                        break;
                    }
                case 'C':
                    listSingletonList = null;
                    c2 = 'D';
                    break;
                case 'D':
                    listSingletonList2 = listSingletonList;
                    c2 = '`';
                    break;
                case 'E':
                    bArr = bArr;
                    listSingletonList = Collections.singletonList(bArr);
                    c2 = 'D';
                    break;
                case 'F':
                    cy2 = cy2;
                    strA014 = A01(522, 9, k.AppCompatTheme_windowFixedHeightMajor);
                    J0 j0A00 = J0.A00(new C0544Ii(cy2.A0d));
                    listSingletonList2 = j0A00.A04;
                    cy2.A0M = j0A00.A02;
                    c2 = '`';
                    break;
                case 'G':
                    cy2 = cy2;
                    strA014 = A01(824, 10, 18);
                    J6 j6A00 = J6.A00(new C0544Ii(cy2.A0d));
                    listSingletonList2 = j6A00.A01;
                    cy2.A0M = j6A00.A00;
                    c2 = '`';
                    break;
                case 'H':
                    cy2 = cy2;
                    Pair<String, List<byte[]>> pairA00 = A00(new C0544Ii(cy2.A0d));
                    strA014 = (String) pairA00.first;
                    listSingletonList2 = (List) pairA00.second;
                    c2 = '`';
                    break;
                case 'I':
                    strA014 = A01(922, 15, 17);
                    c2 = '`';
                    break;
                case 'J':
                    cy2 = cy2;
                    strA014 = A01(432, 12, 53);
                    i9 = 8192;
                    listSingletonList2 = A03(cy2.A0d);
                    c2 = '`';
                    break;
                case 'K':
                    cy2 = cy2;
                    strA014 = A01(954, 10, k.AppCompatTheme_windowMinWidthMajor);
                    i9 = 5760;
                    listSingletonList2 = new ArrayList(3);
                    listSingletonList2.add(cy2.A0d);
                    listSingletonList2.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(cy2.A0S).array());
                    listSingletonList2.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(cy2.A0T).array());
                    c2 = '`';
                    break;
                case 'L':
                    cy2 = cy2;
                    strA014 = A01(809, 15, k.AppCompatTheme_windowActionModeOverlay);
                    listSingletonList2 = Collections.singletonList(cy2.A0d);
                    c2 = '`';
                    break;
                case 'M':
                    strA014 = A01(531, 13, 100);
                    i9 = 4096;
                    c2 = '`';
                    break;
                case 'N':
                    strA014 = A01(699, 10, 34);
                    i9 = 4096;
                    c2 = '`';
                    break;
                case 'O':
                    strA014 = A01(185, 9, 6);
                    c2 = '`';
                    break;
                case 'P':
                    strA014 = A01(669, 10, 15);
                    c2 = '`';
                    break;
                case 'Q':
                    cy2 = cy2;
                    strA014 = A01(172, 13, 104);
                    cy2.A0X = new CZ();
                    c2 = '`';
                    break;
                case 'R':
                    strA014 = A01(834, 13, 97);
                    c2 = '`';
                    break;
                case 'S':
                    strA014 = A01(34, 16, 24);
                    c2 = '`';
                    break;
                case k.AppCompatTheme_panelBackground /* 84 */:
                    cy2 = cy2;
                    strA014 = A01(512, 10, 56);
                    listSingletonList2 = Collections.singletonList(cy2.A0d);
                    c2 = '`';
                    break;
                case 'U':
                    cy2 = cy2;
                    strA014 = A01(861, 9, 65);
                    if (!A05(new C0544Ii(cy2.A0d))) {
                        c2 = 'X';
                        break;
                    } else {
                        c2 = 'V';
                        break;
                    }
                case 'V':
                    cy2 = cy2;
                    iA02 = C0560Iy.A02(cy2.A0A);
                    if (iA02 != 0) {
                        c2 = '`';
                        break;
                    } else {
                        c2 = 'W';
                        break;
                    }
                case 'W':
                    cy2 = cy2;
                    strA012 = strA012;
                    strA013 = strA013;
                    strA01 = strA01;
                    iA02 = -1;
                    strA014 = A01(295, 15, 77);
                    StringBuilder sb = new StringBuilder();
                    sb.append(strA013);
                    sb.append(cy2.A0A);
                    sb.append(strA012);
                    sb.append(strA014);
                    Log.w(strA01, sb.toString());
                    c2 = '`';
                    break;
                case 'X':
                    strA01 = strA01;
                    strA014 = A01(295, 15, 77);
                    Log.w(strA01, A01(453, 51, 13) + strA014);
                    c2 = '`';
                    break;
                case 'Y':
                    cy2 = cy2;
                    strA014 = A01(861, 9, 65);
                    iA02 = C0560Iy.A02(cy2.A0A);
                    if (iA02 != 0) {
                        c2 = '`';
                        break;
                    } else {
                        c2 = 'Z';
                        break;
                    }
                case 'Z':
                    cy2 = cy2;
                    strA012 = strA012;
                    strA013 = strA013;
                    strA01 = strA01;
                    iA02 = -1;
                    strA014 = A01(295, 15, 77);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strA013);
                    sb2.append(cy2.A0A);
                    sb2.append(strA012);
                    sb2.append(strA014);
                    Log.w(strA01, sb2.toString());
                    c2 = '`';
                    break;
                case '[':
                    strA014 = A01(202, 20, 11);
                    c2 = '`';
                    break;
                case '\\':
                    strA014 = A01(24, 10, k.AppCompatTheme_windowFixedWidthMajor);
                    c2 = '`';
                    break;
                case ']':
                    cy2 = cy2;
                    strA014 = A01(979, 18, 70);
                    listSingletonList2 = Collections.singletonList(cy2.A0d);
                    c2 = '`';
                    break;
                case '^':
                    strA014 = A01(237, 15, 52);
                    c2 = '`';
                    break;
                case '_':
                    cy2 = cy2;
                    i10 = 0;
                    strA014 = A01(578, 19, 99);
                    byte[] bArr2 = cy2.A0d;
                    listSingletonList2 = Collections.singletonList(new byte[]{bArr2[0], bArr2[1], bArr2[2], bArr2[3]});
                    c2 = '`';
                    break;
                case '`':
                    cy2 = cy2;
                    i8 = 0 | (cy2.A0Z ? 1 : 0);
                    if (!cy2.A0a) {
                        c2 = 'b';
                        break;
                    } else {
                        c2 = 'a';
                        break;
                    }
                case 'a':
                    i10 = 2;
                    c2 = 'b';
                    break;
                case 'b':
                    strA014 = strA014;
                    i7 = i8 | i10;
                    if (!C0537Ib.A0B(strA014)) {
                        c2 = 'e';
                        break;
                    } else {
                        c2 = 'c';
                        break;
                    }
                case 'c':
                    cy2 = cy2;
                    strA014 = strA014;
                    i6 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA014, null, -1, i9, cy2.A0B, cy2.A0O, iA02, listSingletonList2, cy2.A0U, i7, cy2.A0g);
                    c2 = 'd';
                    break;
                case 'd':
                    CY cy3 = cy2;
                    cy3.A0W = ce.ADd(cy3.A0N, i6);
                    cy3.A0W.A5A(formatA0A);
                    return;
                case 'e':
                    strA014 = strA014;
                    if (!C0537Ib.A0D(strA014)) {
                        c2 = 'r';
                        break;
                    } else {
                        c2 = 'f';
                        break;
                    }
                case 'f':
                    cy2 = cy2;
                    i6 = 2;
                    if (cy2.A0H != 0) {
                        c2 = 'l';
                        break;
                    } else {
                        c2 = 'g';
                        break;
                    }
                case 'g':
                    cy2 = cy2;
                    i5 = cy2.A0I;
                    if (i5 != -1) {
                        c2 = 'i';
                        break;
                    } else {
                        c2 = 'h';
                        break;
                    }
                case 'h':
                    cy2 = cy2;
                    i5 = cy2.A0R;
                    c2 = 'i';
                    break;
                case 'i':
                    cy2 = cy2;
                    cy2.A0I = i5;
                    i4 = cy2.A0G;
                    if (i4 != -1) {
                        c2 = 'k';
                        break;
                    } else {
                        c2 = 'j';
                        break;
                    }
                case 'j':
                    cy2 = cy2;
                    i4 = cy2.A0J;
                    c2 = 'k';
                    break;
                case 'k':
                    cy2 = cy2;
                    cy2.A0G = i4;
                    c2 = 'l';
                    break;
                case 'l':
                    cy2 = cy2;
                    f = -1.0f;
                    i3 = cy2.A0I;
                    if (i3 == -1) {
                        c2 = 'o';
                        break;
                    } else {
                        c2 = 'm';
                        break;
                    }
                case 'm':
                    cy2 = cy2;
                    i2 = cy2.A0G;
                    if (i2 == -1) {
                        c2 = 'o';
                        break;
                    } else {
                        c2 = 'n';
                        break;
                    }
                case 'n':
                    cy2 = cy2;
                    f = (cy2.A0J * i3) / (cy2.A0R * i2);
                    c2 = 'o';
                    break;
                case 'o':
                    cy2 = cy2;
                    colorInfo = null;
                    if (!cy2.A0b) {
                        c2 = 'q';
                        break;
                    } else {
                        c2 = 'p';
                        break;
                    }
                case 'p':
                    cy = cy;
                    cy2 = cy2;
                    colorInfo = new ColorInfo(cy2.A0D, cy2.A0C, cy2.A0E, cy.A06());
                    c2 = 'q';
                    break;
                case 'q':
                    cy2 = cy2;
                    strA014 = strA014;
                    formatA0A = Format.A04(Integer.toString(i), strA014, null, -1, i9, cy2.A0R, cy2.A0J, -1.0f, listSingletonList2, -1, f, cy2.A0e, cy2.A0P, colorInfo, cy2.A0U);
                    c2 = 'd';
                    break;
                case k.AppCompatTheme_viewInflaterClass /* 114 */:
                    strA014 = strA014;
                    if (!A01(202, 20, 11).equals(strA014)) {
                        c2 = 't';
                        break;
                    } else {
                        c2 = 's';
                        break;
                    }
                case k.AppCompatTheme_windowActionBar /* 115 */:
                    cy2 = cy2;
                    strA014 = strA014;
                    i6 = 3;
                    formatA0A = Format.A01(Integer.toString(i), strA014, i7, cy2.A0g, cy2.A0U);
                    c2 = 'd';
                    break;
                case k.AppCompatTheme_windowActionBarOverlay /* 116 */:
                    strA014 = strA014;
                    if (!A01(24, 10, k.AppCompatTheme_windowFixedWidthMajor).equals(strA014)) {
                        c2 = 'v';
                        break;
                    } else {
                        c2 = 'u';
                        break;
                    }
                case k.AppCompatTheme_windowActionModeOverlay /* 117 */:
                    cy2 = cy2;
                    strA014 = strA014;
                    i6 = 3;
                    ArrayList arrayList = new ArrayList(2);
                    arrayList.add(Z0.A0s);
                    arrayList.add(cy2.A0d);
                    formatA0A = Format.A09(Integer.toString(i), strA014, null, -1, i7, cy2.A0g, -1, cy2.A0U, Long.MAX_VALUE, arrayList);
                    c2 = 'd';
                    break;
                case k.AppCompatTheme_windowFixedHeightMajor /* 118 */:
                    strA014 = strA014;
                    if (!A01(979, 18, 70).equals(strA014)) {
                        c2 = 'w';
                        break;
                    } else {
                        c2 = 'y';
                        break;
                    }
                case k.AppCompatTheme_windowFixedHeightMinor /* 119 */:
                    strA014 = strA014;
                    if (!A01(237, 15, 52).equals(strA014)) {
                        c2 = 'x';
                        break;
                    } else {
                        c2 = 'y';
                        break;
                    }
                case k.AppCompatTheme_windowFixedWidthMajor /* 120 */:
                    strA014 = strA014;
                    if (!A01(578, 19, 99).equals(strA014)) {
                        c2 = 'z';
                        break;
                    } else {
                        c2 = 'y';
                        break;
                    }
                case k.AppCompatTheme_windowFixedWidthMinor /* 121 */:
                    cy2 = cy2;
                    strA014 = strA014;
                    i6 = 3;
                    formatA0A = Format.A0A(Integer.toString(i), strA014, null, -1, i7, listSingletonList2, cy2.A0g, cy2.A0U);
                    c2 = 'd';
                    break;
                case k.AppCompatTheme_windowMinWidthMajor /* 122 */:
                    throw new AF(A01(0, 21, 30));
            }
        }
    }
}

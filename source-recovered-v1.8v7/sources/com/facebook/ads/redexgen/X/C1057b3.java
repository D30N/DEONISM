package com.facebook.ads.redexgen.X;

import android.text.Html;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.internal.exoplayer2.Format;
import d.b.a.b.k;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.facebook.ads.redexgen.X.b3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1057b3 implements InterfaceC0486Ga {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 39);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{-35, -20, -20, -24, -27, -33, -35, -16, -27, -21, -22, -85, -12, -87, -23, -20, -80, -87, -14, -16, -16, -39, -24, -24, -28, -31, -37, -39, -20, -31, -25, -26, -89, -16, -91, -27, -24, -84, -91, -37, -35, -39, -91, -82, -88, -80, -83, -98, -79, -83, 104, -79, 102, -84, -84, -102, -112, -97, -97, -101, -104, -110, -112, -93, -104, -98, -99, 94, -89, 92, -94, -92, -111, -95, -104, -97, -30, -15, -15, -19, -22, -28, -30, -11, -22, -16, -17, -80, -15, -24, -12, -98, -47, -47, -62, -54, -51, -47, -62, -63, 125, -47, -52, 125, -64, -49, -62, -66, -47, -62, 125, -63, -62, -64, -52, -63, -62, -49, 125, -61, -52, -49, 125, -46, -53, -48, -46, -51, -51, -52, -49, -47, -62, -63, 125, -61, -52, -49, -54, -66, -47, -4, -19, 0, -4, -73, -2, -4, -4, -18, -3, -3, -7, -10, -16, -18, 1, -10, -4, -5, -68, -15, 3, -17, 0, 2, -17, 0, -55, -40, -40, -44, -47, -53, -55, -36, -47, -41, -42, -105, -53, -51, -55, -107, -97, -104, -96, -97, -82, -82, -86, -89, -95, -97, -78, -89, -83, -84, 109, -78, -78, -85, -86, 105, -74, -85, -86, -108, -93, -93, -97, -100, -106, -108, -89, -100, -94, -95, 98, -85, 96, -92, -88, -100, -106, -98, -89, -100, -96, -104, 96, -89, -85, 102, -102, -41, -26, -26, -30, -33, -39, -41, -22, -33, -27, -28, -91, -39, -37, -41, -93, -84, -90, -82};
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0486Ga
    public final InterfaceC1056b2 A4F(Format format) {
        char c2;
        char c3 = 0;
        String str = format.A0O;
        switch (str.hashCode()) {
            case -1351681404:
                c2 = 5;
                break;
            case -1248334819:
                c2 = 7;
                break;
            case -1026075066:
                c2 = '\t';
                break;
            case -1004728940:
                c2 = 11;
                break;
            case 691401887:
                c2 = '\r';
                break;
            case 822864842:
                c2 = 15;
                break;
            case 930165504:
                c2 = 17;
                break;
            case 1566015601:
                c2 = 19;
                break;
            case 1566016562:
                c2 = 21;
                break;
            case 1668750253:
                c2 = 23;
                break;
            case 1693976202:
                c2 = 25;
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
                    switch (c3) {
                        case 0:
                            c2 = 27;
                            break;
                        case 1:
                            c2 = 28;
                            break;
                        case 2:
                            c2 = 29;
                            break;
                        case 3:
                            c2 = 30;
                            break;
                        case 4:
                            c2 = 31;
                            break;
                        case 5:
                            c2 = ' ';
                            break;
                        case 6:
                            c2 = '!';
                            break;
                        case 7:
                            c2 = '!';
                            break;
                        case '\b':
                            c2 = '\"';
                            break;
                        case '\t':
                            c2 = '#';
                            break;
                        case '\n':
                            c2 = '$';
                            break;
                        default:
                            c2 = 4;
                            break;
                    }
                case 4:
                    throw new IllegalArgumentException(A00(91, 50, 54));
                case 5:
                    str = str;
                    if (!str.equals(A00(149, 19, 102))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c3 = '\t';
                    c2 = 3;
                    break;
                case 7:
                    str = str;
                    if (!str.equals(A00(76, 15, 90))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c3 = '\n';
                    c2 = 3;
                    break;
                case '\t':
                    str = str;
                    if (!str.equals(A00(0, 21, 85))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c3 = 2;
                    c2 = 3;
                    break;
                case 11:
                    str = str;
                    if (!str.equals(A00(141, 8, 97))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c3 = 0;
                    c2 = 3;
                    break;
                case '\r':
                    str = str;
                    if (!str.equals(A00(207, 28, 12))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c3 = 5;
                    c2 = 3;
                    break;
                case 15:
                    str = str;
                    if (!str.equals(A00(46, 10, 18))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c3 = 1;
                    c2 = 3;
                    break;
                case 17:
                    str = str;
                    if (!str.equals(A00(21, 25, 81))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c3 = 7;
                    c2 = 3;
                    break;
                case 19:
                    str = str;
                    if (!str.equals(A00(235, 19, 79))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c3 = 6;
                    c2 = 3;
                    break;
                case 21:
                    str = str;
                    if (!str.equals(A00(168, 19, 65))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    c3 = '\b';
                    c2 = 3;
                    break;
                case 23:
                    str = str;
                    if (!str.equals(A00(56, 20, 8))) {
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
                    if (!str.equals(A00(187, 20, 23))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    c3 = 3;
                    c2 = 3;
                    break;
                case 27:
                    return new BZ() { // from class: com.facebook.ads.redexgen.X.2h
                        public static byte[] A05;
                        public final H2 A00;
                        public final H8 A01;
                        public final HB A02;
                        public final C0544Ii A03;
                        public final List<H6> A04;

                        static {
                            A03();
                        }

                        public static String A02(int i, int i2, int i3) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
                            int i4 = 0;
                            char c4 = 2;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        bArrCopyOfRange = bArrCopyOfRange;
                                        if (i4 >= bArrCopyOfRange.length) {
                                            c4 = 4;
                                            break;
                                        } else {
                                            c4 = 3;
                                            break;
                                        }
                                    case 3:
                                        bArrCopyOfRange = bArrCopyOfRange;
                                        bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 74);
                                        i4++;
                                        c4 = 2;
                                        break;
                                    case 4:
                                        return new String(bArrCopyOfRange);
                                }
                            }
                        }

                        public static void A03() {
                            A05 = new byte[]{118, 113, 124, 105, 96, 72, 122, 125, 105, 107, 107, 91, 122, 124, 112, 123, 122, 109, 5, 100, 55, 48, 61, 40, 33, 100, 38, 40, 43, 39, 47, 100, 51, 37, 55, 100, 34, 43, 49, 42, 32, 100, 37, 34, 48, 33, 54, 100, 48, 44, 33, 100, 34, 45, 54, 55, 48, 100, 39, 49, 33, 106, 4, 5, 30, 15};
                        }

                        {
                            A02(5, 13, 85);
                            this.A02 = new HB();
                            this.A03 = new C0544Ii();
                            this.A01 = new H8();
                            this.A00 = new H2();
                            this.A04 = new ArrayList();
                        }

                        public static int A00(C0544Ii c0544Ii) {
                            String line = null;
                            int i = -1;
                            int iA06 = 0;
                            int currentInputPosition = 2;
                            while (true) {
                                switch (currentInputPosition) {
                                    case 2:
                                        if (i != -1) {
                                            currentInputPosition = 10;
                                            break;
                                        } else {
                                            currentInputPosition = 3;
                                            break;
                                        }
                                    case 3:
                                        c0544Ii = c0544Ii;
                                        iA06 = c0544Ii.A06();
                                        line = c0544Ii.A0P();
                                        if (line != null) {
                                            currentInputPosition = 5;
                                            break;
                                        } else {
                                            currentInputPosition = 4;
                                            break;
                                        }
                                    case 4:
                                        i = 0;
                                        currentInputPosition = 2;
                                        break;
                                    case 5:
                                        line = line;
                                        if (!A02(0, 5, 111).equals(line)) {
                                            currentInputPosition = 7;
                                            break;
                                        } else {
                                            currentInputPosition = 6;
                                            break;
                                        }
                                    case 6:
                                        i = 2;
                                        currentInputPosition = 2;
                                        break;
                                    case 7:
                                        line = line;
                                        if (!A02(62, 4, 0).startsWith(line)) {
                                            currentInputPosition = 9;
                                            break;
                                        } else {
                                            currentInputPosition = 8;
                                            break;
                                        }
                                    case 8:
                                        i = 1;
                                        currentInputPosition = 2;
                                        break;
                                    case 9:
                                        i = 3;
                                        currentInputPosition = 2;
                                        break;
                                    case 10:
                                        c0544Ii.A0Y(iA06);
                                        return i;
                                }
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // com.facebook.ads.redexgen.X.BZ
                        /* renamed from: A01, reason: merged with bridge method [inline-methods] */
                        public final C1069bF A0b(byte[] bArr, int i, boolean z) throws GZ {
                            C01642h c01642h = this;
                            H6 h6A0E = null;
                            ArrayList arrayList = null;
                            int iA00 = 0;
                            c01642h.A03.A0b(bArr, i);
                            c01642h.A01.A0E();
                            c01642h.A04.clear();
                            HC.A04(c01642h.A03);
                            char c4 = 2;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        c01642h = c01642h;
                                        if (!TextUtils.isEmpty(c01642h.A03.A0P())) {
                                            c4 = 2;
                                            break;
                                        } else {
                                            c4 = 3;
                                            break;
                                        }
                                    case 3:
                                        arrayList = new ArrayList();
                                        c4 = 4;
                                        break;
                                    case 4:
                                        c01642h = c01642h;
                                        iA00 = A00(c01642h.A03);
                                        if (iA00 == 0) {
                                            c4 = 15;
                                            break;
                                        } else {
                                            c4 = 5;
                                            break;
                                        }
                                    case 5:
                                        if (iA00 != 1) {
                                            c4 = 7;
                                            break;
                                        } else {
                                            c4 = 6;
                                            break;
                                        }
                                    case 6:
                                        c01642h = c01642h;
                                        A04(c01642h.A03);
                                        c4 = 4;
                                        break;
                                    case 7:
                                        if (iA00 != 2) {
                                            c4 = 11;
                                            break;
                                        } else {
                                            c4 = '\b';
                                            break;
                                        }
                                    case '\b':
                                        arrayList = arrayList;
                                        if (!arrayList.isEmpty()) {
                                            c4 = 14;
                                            break;
                                        } else {
                                            c4 = '\t';
                                            break;
                                        }
                                    case '\t':
                                        c01642h = c01642h;
                                        c01642h.A03.A0P();
                                        h6A0E = c01642h.A00.A0E(c01642h.A03);
                                        if (h6A0E == null) {
                                            c4 = 4;
                                            break;
                                        } else {
                                            c4 = '\n';
                                            break;
                                        }
                                    case '\n':
                                        c01642h = c01642h;
                                        h6A0E = h6A0E;
                                        c01642h.A04.add(h6A0E);
                                        c4 = 4;
                                        break;
                                    case 11:
                                        if (iA00 != 3) {
                                            c4 = 4;
                                            break;
                                        } else {
                                            c4 = '\f';
                                            break;
                                        }
                                    case '\f':
                                        c01642h = c01642h;
                                        if (!c01642h.A02.A0G(c01642h.A03, c01642h.A01, c01642h.A04)) {
                                            c4 = 4;
                                            break;
                                        } else {
                                            c4 = '\r';
                                            break;
                                        }
                                    case '\r':
                                        c01642h = c01642h;
                                        arrayList = arrayList;
                                        arrayList.add(c01642h.A01.A0D());
                                        c01642h.A01.A0E();
                                        c4 = 4;
                                        break;
                                    case 14:
                                        throw new GZ(A02(18, 44, 14));
                                    case 15:
                                        return new C1069bF(arrayList);
                                }
                            }
                        }

                        public static void A04(C0544Ii c0544Ii) {
                            while (!TextUtils.isEmpty(c0544Ii.A0P())) {
                            }
                        }
                    };
                case 28:
                    return new C01692m(format.A0P);
                case 29:
                    return new BZ() { // from class: com.facebook.ads.redexgen.X.2i
                        public static byte[] A02;
                        public static final int A03;
                        public static final int A04;
                        public static final int A05;
                        public final H8 A00;
                        public final C0544Ii A01;

                        public static String A02(int i, int i2, int i3) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                            int i4 = 0;
                            char c4 = 2;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        bArrCopyOfRange = bArrCopyOfRange;
                                        if (i4 >= bArrCopyOfRange.length) {
                                            c4 = 4;
                                            break;
                                        } else {
                                            c4 = 3;
                                            break;
                                        }
                                    case 3:
                                        bArrCopyOfRange = bArrCopyOfRange;
                                        bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 66);
                                        i4++;
                                        c4 = 2;
                                        break;
                                    case 4:
                                        return new String(bArrCopyOfRange);
                                }
                            }
                        }

                        public static void A03() {
                            A02 = new byte[]{11, 54, 114, 17, 35, 36, 48, 50, 50, 2, 35, 37, 41, 34, 35, 52, 52, 37, 61, 40, 118, 116, 116, 99, 34, 5, 8, 4, 6, 27, 7, 14, 31, 14, 75, 29, 31, 31, 75, 8, 30, 14, 75, 9, 4, 19, 75, 3, 14, 10, 15, 14, 25, 75, 13, 4, 30, 5, 15, 69, 15, 40, 37, 41, 43, 54, 42, 35, 50, 35, 102, 11, 54, 114, 17, 35, 36, 48, 50, 50, 102, 18, 41, 54, 102, 10, 35, 48, 35, 42, 102, 36, 41, 62, 102, 46, 35, 39, 34, 35, 52, 102, 32, 41, 51, 40, 34, 104, 46, 41, 41, 58};
                        }

                        static {
                            A03();
                            A03 = C0560Iy.A08(A02(16, 4, 6));
                            A04 = C0560Iy.A08(A02(108, 4, 31));
                            A05 = C0560Iy.A08(A02(20, 4, 66));
                        }

                        {
                            A02(0, 16, 4);
                            this.A01 = new C0544Ii();
                            this.A00 = new H8();
                        }

                        public static GX A00(C0544Ii c0544Ii, H8 h8, int payloadLength) throws GZ {
                            int iA08 = 0;
                            String strA0U = null;
                            h8.A0E();
                            char c4 = 2;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        if (payloadLength <= 0) {
                                            c4 = '\t';
                                            break;
                                        } else {
                                            c4 = 3;
                                            break;
                                        }
                                    case 3:
                                        if (payloadLength < 8) {
                                            c4 = '\b';
                                            break;
                                        } else {
                                            c4 = 4;
                                            break;
                                        }
                                    case 4:
                                        c0544Ii = c0544Ii;
                                        int iA082 = c0544Ii.A08();
                                        iA08 = c0544Ii.A08();
                                        int i = iA082 - 8;
                                        strA0U = C0560Iy.A0U(c0544Ii.A00, c0544Ii.A06(), i);
                                        c0544Ii.A0Z(i);
                                        payloadLength = (payloadLength - 8) - i;
                                        if (iA08 != A04) {
                                            c4 = 6;
                                            break;
                                        } else {
                                            c4 = 5;
                                            break;
                                        }
                                    case 5:
                                        h8 = h8;
                                        strA0U = strA0U;
                                        HB.A08(strA0U, h8);
                                        c4 = 2;
                                        break;
                                    case 6:
                                        if (iA08 != A03) {
                                            c4 = 2;
                                            break;
                                        } else {
                                            c4 = 7;
                                            break;
                                        }
                                    case 7:
                                        h8 = h8;
                                        strA0U = strA0U;
                                        HB.A0C(null, strA0U.trim(), h8, Collections.emptyList());
                                        c4 = 2;
                                        break;
                                    case '\b':
                                        throw new GZ(A02(24, 36, 41));
                                    case '\t':
                                        return h8.A0D();
                                }
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // com.facebook.ads.redexgen.X.BZ
                        /* renamed from: A01, reason: merged with bridge method [inline-methods] */
                        public final C1067bD A0b(byte[] bArr, int i, boolean z) throws GZ {
                            C01652i c01652i = this;
                            int iA08 = 0;
                            c01652i.A01.A0b(bArr, i);
                            ArrayList arrayList = new ArrayList();
                            char c4 = 2;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        c01652i = c01652i;
                                        if (c01652i.A01.A04() <= 0) {
                                            c4 = '\b';
                                            break;
                                        } else {
                                            c4 = 3;
                                            break;
                                        }
                                    case 3:
                                        c01652i = c01652i;
                                        if (c01652i.A01.A04() < 8) {
                                            c4 = 7;
                                            break;
                                        } else {
                                            c4 = 4;
                                            break;
                                        }
                                    case 4:
                                        c01652i = c01652i;
                                        iA08 = c01652i.A01.A08();
                                        if (c01652i.A01.A08() != A05) {
                                            c4 = 6;
                                            break;
                                        } else {
                                            c4 = 5;
                                            break;
                                        }
                                    case 5:
                                        c01652i = c01652i;
                                        arrayList = arrayList;
                                        arrayList.add(A00(c01652i.A01, c01652i.A00, iA08 - 8));
                                        c4 = 2;
                                        break;
                                    case 6:
                                        c01652i = c01652i;
                                        c01652i.A01.A0Z(iA08 - 8);
                                        c4 = 2;
                                        break;
                                    case 7:
                                        throw new GZ(A02(60, 48, 4));
                                    case '\b':
                                        return new C1067bD(arrayList);
                                }
                            }
                        }
                    };
                case 30:
                    return new BZ() { // from class: com.facebook.ads.redexgen.X.2k
                        public static byte[] A01;
                        public static final C0505Gt A02;
                        public static final C0506Gu A03;
                        public static final Pattern A04;
                        public static final Pattern A05;
                        public static final Pattern A06;
                        public static final Pattern A07;
                        public static final Pattern A08;
                        public final XmlPullParserFactory A00;

                        public static String A08(int i, int i2, int i3) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                            int i4 = 0;
                            char c4 = 2;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        bArrCopyOfRange = bArrCopyOfRange;
                                        if (i4 >= bArrCopyOfRange.length) {
                                            c4 = 4;
                                            break;
                                        } else {
                                            c4 = 3;
                                            break;
                                        }
                                    case 3:
                                        bArrCopyOfRange = bArrCopyOfRange;
                                        bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 73);
                                        i4++;
                                        c4 = 2;
                                        break;
                                    case 4:
                                        return new String(bArrCopyOfRange);
                                }
                            }
                        }

                        public static void A0A() {
                            A01 = new byte[]{23, 32, 31, 37, 8, 22, 26, 24, 25, 37, -33, -39, -36, -32, -47, -90, -43, -38, -46, -37, -34, -39, -51, -32, -43, -37, -38, -15, 5, 16, 10, 19, 22, 17, 9, 8, -60, 24, 13, 17, 9, -60, 9, 28, 20, 22, 9, 23, 23, 13, 19, 18, -34, -60, -31, -14, -17, 19, 28, 27, 33, -13, 14, 26, 22, 25, 38, -6, 19, 10, 29, 21, 10, 8, 25, 10, 9, -59, 10, 23, 23, 20, 23, -59, 28, 13, 10, 19, -59, 23, 10, 6, 9, 14, 19, 12, -59, 14, 19, 21, 26, 25, -45, -37, 0, 8, -13, -2, -5, -10, -78, 0, 7, -1, -12, -9, 4, -78, 1, -8, -78, -9, 0, 6, 4, -5, -9, 5, -78, -8, 1, 4, -78, -8, 1, 0, 6, -27, -5, 12, -9, -52, -78, 7, -49, -67, -82, -63, -67, -118, -75, -78, -80, -73, 6, -2, 13, -6, -3, -6, 13, -6, -41, -42, -40, -32, -36, -25, -28, -22, -29, -39, -72, -28, -31, -28, -25, -6, -13, -23, -22, -9, -15, -18, -13, -22, -8, -43, -13, -6, -5, -2, -11, -6, -13, -84, -7, -19, -8, -14, -5, -2, -7, -15, -16, -84, -17, -15, -8, -8, -84, -2, -15, -1, -5, -8, 1, 0, -11, -5, -6, -58, -84, -44, -32, -35, -32, -29, -4, 23, 31, 34, 27, 26, -42, 38, 23, 40, 41, 31, 36, 29, -42, 24, 23, 25, 33, 29, 40, 37, 43, 36, 26, -42, 44, 23, 34, 43, 27, -16, -42, -93, -63, -56, -55, -52, -61, -56, -63, 122, -52, -65, -63, -61, -55, -56, 122, -47, -61, -50, -62, -55, -49, -50, 122, -69, -56, 122, -55, -52, -61, -63, -61, -56, -38, -92, -40, -32, -89, -91, -100, -92, -40, -32, -89, -91, -96, -26, -37, -13, -23, -17, -18, 40, -106, -79, -71, -68, -75, -76, 112, -64, -79, -62, -61, -71, -66, -73, 112, -77, -65, -68, -65, -62, 112, -58, -79, -68, -59, -75, -118, 112, 15, 24, 14, -30, -45, -26, -30, -78, -45, -47, -35, -32, -49, -30, -41, -35, -36, 13, 50, 58, 37, 48, 45, 40, -28, 57, 50, 45, 56, -28, 42, 51, 54, -28, 42, 51, 50, 56, 23, 45, 62, 41, -2, -28, -21, 17, 47, 54, 55, 58, 49, 54, 47, -24, 58, 45, 47, 49, 55, 54, -24, 63, 49, 60, 48, -24, 53, 41, 52, 46, 55, 58, 53, 45, 44, -24, 45, 64, 60, 45, 54, 60, 2, -24, 27, 27, -45, -99, -47, -39, -96, -47, -93, -76, -47, -39, -97, -76, -98, -102, -107, -99, -47, -39, -96, -47, -93, -76, -47, -39, -97, -76, -98, -102, -103, -9, 21, 28, 29, 32, 23, 28, 21, -50, 32, 19, 21, 23, 29, 28, -50, 37, 23, 34, 22, -50, 35, 28, 33, 35, 30, 30, 29, 32, 34, 19, 18, -50, 29, 32, 23, 21, 23, 28, -24, -50, -88, -61, -53, -50, -57, -58, -126, -46, -61, -44, -43, -53, -48, -55, -126, -56, -47, -48, -42, -75, -53, -36, -57, -126, -40, -61, -50, -41, -57, -100, -126, -23, 9, 2, 1, -39, -6, -8, 4, -7, -6, 7, -14, -9, 1, -2, -6, -17, 7, -49, -6, -9, -11, -4, -68, -34, -39, -39, -37, -50, -36, -36, -46, -41, -48, -119, -39, -54, -37, -36, -50, -37, -119, -50, -37, -37, -40, -37, -56, -47, -48, -42, -75, -42, -37, -50, -57, 5, 6, 11, -2, -5, 0, -7, -8, -7, -1, -8, -18, -17, -4, -10, -13, -8, -17, -21, 23, 29, 20, 12, 22, -49, 28, -56, 11, 26, 13, 9, 28, 13, -56, 0, 21, 20, -8, 29, 20, 20, -8, 9, 26, 27, 13, 26, -18, 9, 11, 28, 23, 26, 33, -56, 17, 22, 27, 28, 9, 22, 11, 13, -69, -11, -8, 22, 29, 30, 33, 24, 29, 22, -49, 33, 20, 22, 24, 30, 29, -49, 38, 24, 35, 23, -49, 36, 29, 34, 36, 31, 31, 30, 33, 35, 20, 19, -49, 20, 39, 35, 20, 29, 35, -23, -49, -39, -9, -2, -1, 2, -7, -2, -9, -80, 2, -11, -9, -7, -1, -2, -80, 7, -7, 4, -8, -80, -3, -15, -4, -10, -1, 2, -3, -11, -12, -80, -1, 2, -7, -9, -7, -2, -54, -80, -67, -54, -65, -44, -97, -67, -60, -59, -56, -65, -60, -67, 118, -56, -69, -67, -65, -59, -60, 118, -51, -65, -54, -66, -59, -53, -54, 118, -73, -60, 118, -69, -50, -54, -69, -60, -54, -8, -15, -14, 0, -58, -112, -61, -104, -107, -95, -59, -109, -112, -89, -94, -60, -106, -61, -104, -107, -95, -59, -109, -111, -89, -111, -112, -48, -28, -43, -28, -37, -28, -43, -37, -28, -50, -28, -36, -111, -116, -37, 0, 8, -13, -2, -5, -10, -78, -11, -9, -2, -2, -78, 4, -9, 5, 1, -2, 7, 6, -5, 1, 0, -78, -43, -40, -38, -36, -31, 5, 17, 0, 12, 4, -15, 0, 19, 4, -71, 40, 41, 22, 39, 41, 23, -31, -31, 20, -23, -26, -14, 22, -29, -25, -30, -8, 20, -23, -26, -14, 22, -28, -30, -31, 41, 49, 53, 30, 38, 53, -34, -30, -35, -29, -21, -66, -64, -55, -49, -64, -51, 26, 17, 15, 16, 28, 3, 15, -2, 10, 2, -17, -2, 17, 2, -22, 18, 9, 17, 6, 13, 9, 6, 2, 15, -67, 1, 12, 2, 16, 11, -60, 17, -67, 5, -2, 19, 2, -67, -49, -67, 13, -2, 15, 17, 16, -40, -17, -89, -70, -63, -2, -1, -4, -7, -2, -11, 4, -8, 2, -1, 5, -9, -8, -4, -15, -21, -13, -38, -23, -4, -19, 4, 10, 35, 40, 53, -32, -2, 5, 6, 9, 0, 5, -2, -73, 12, 5, 10, 12, 7, 7, 6, 9, 11, -4, -5, -73, 11, -8, -2, -47, -73, -66, -41, -54, -53, -43, -50, -119, -35, -40, 
                            -119, -51, -50, -52, -40, -51, -50, -119, -36, -40, -34, -37, -52, -50, -76, -64, -81, -69, -77, -96, -81, -62, -77, -101, -61, -70, -62, -73, -66, -70, -73, -77, -64, 11, 5, 8, 12, -3, -46, -4, -7, 12, -7, -42, -29, -32, -40, -79, -60, -64, -79, -70, -64, -47, -46, -41, -54, -61, 11, -56, -19, -11, -32, -21, -24, -29, -97, -28, -9, -17, -15, -28, -14, -14, -24, -18, -19, -97, -27, -18, -15, -97, -27, -18, -19, -13, -46, -24, -7, -28, -71, -97, -90, -3, -6, -1, -10, 5, -7, 3, 0, 6, -8, -7, 15, 26, 7, 18, 15, 9, -25, -22, -31, -33, -31, -26, -36, -28, -41, -95, -44, -87, -90, -78, -42, -44, -87, -90, -78, -42, -92, -94, -77, -95, -44, -87, -90, -78, -42, -44, -87, -90, -78, -42, -94, -77, -95, -44, -87, -90, -78, -42, -44, -87, -90, -78, -42, -94, -95, -72, -77, -95, -43, -89, -44, -87, -90, -78, -42, -92, -94, -11, -77, -95, -44, -87, -90, -78, -42, -44, -87, -90, -78, -42, -94, -95, -72, -77, -43, -89, -95, -44, -87, -90, -78, -42, -92, -94, -94, -72, -94, -72, -99, -73, -71, -64, -64, -90, -71, -57, -61, -64, -55, -56, -67, -61, -62, -7, -26, -14, -14, -18, -72, -83, -83, -11, -11, -11, -84, -11, -79, -84, -19, -16, -27, -83, -20, -15, -83, -14, -14, -21, -22, -95, -18, -33, -16, -33, -21, -29, -14, -29, -16, -72, -67, -53, -68, -55, -28, -41, -39, -37, -31, -32, 19, 21, 2, -26, 18, 1, 13, 5, -14, 1, 20, 5, -9, 0, -1, 5, -28, -6, 11, -10, 43, 37, 40, 44, 29, -14, 33, 37, 25, 31, 29, -10, -15, 39, 55, -61, -64, -79, -66, -46, -6, -15, -7, -18, -11, -15, -22, -91, -5, -26, -15, -6, -22, -8, -91, -18, -13, -91, -21, -12, -13, -7, -40, -18, -1, -22, -91, -26, -7, -7, -9, -18, -25, -6, -7, -22, -77, -91, -43, -18, -24, -16, -18, -13, -20, -91, -7, -19, -22, -91, -8, -22, -24, -12, -13, -23, -91, -5, -26, -15, -6, -22, -91, -21, -12, -9, -91, -5, -22, -9, -7, -18, -24, -26, -15, -91, -21, -12, -13, -7, -91, -8, -18, -1, -22, -91, -26, -13, -23, -91, -18, -20, -13, -12, -9, -18, -13, -20, -91, -7, -19, -22, -91, -21, -18, -9, -8, -7, -77, -65, -68, -72, -69};
                        }

                        static {
                            A0A();
                            A05 = Pattern.compile(A08(1118, 85, 48));
                            A07 = Pattern.compile(A08(771, 37, 31));
                            A06 = Pattern.compile(A08(852, 29, 112));
                            A08 = Pattern.compile(A08(428, 29, 44));
                            A04 = Pattern.compile(A08(294, 13, 51));
                            A03 = new C0506Gu(30.0f, 1, 1);
                            A02 = new C0505Gt(32, 15);
                        }

                        {
                            A08(529, 11, 76);
                            try {
                                this.A00 = XmlPullParserFactory.newInstance();
                                this.A00.setNamespaceAware(true);
                            } catch (XmlPullParserException e) {
                                throw new RuntimeException(A08(603, 45, 95), e);
                            }
                        }

                        public static long A00(String str2, C0506Gu c0506Gu) throws GZ, NumberFormatException {
                            C0506Gu c0506Gu2 = c0506Gu;
                            String str3 = str2;
                            int iHashCode = 0;
                            String seconds = null;
                            char c4 = 0;
                            String unit = null;
                            double d2 = 0.0d;
                            Matcher matcher = null;
                            double d3 = 0.0d;
                            double d4 = 0.0d;
                            double d5 = 0.0d;
                            double d6 = 0.0d;
                            String strGroup = null;
                            double d7 = 0.0d;
                            String subframes = null;
                            double d8 = 0.0d;
                            Matcher matcher2 = A05.matcher(str3);
                            char c5 = matcher2.matches() ? (char) 2 : (char) 11;
                            while (true) {
                                switch (c5) {
                                    case 2:
                                        matcher2 = matcher2;
                                        String unit2 = matcher2.group(1);
                                        double d9 = Long.parseLong(unit2) * 3600;
                                        String hours = matcher2.group(2);
                                        double d10 = d9 + (Long.parseLong(hours) * 60);
                                        String hours2 = matcher2.group(3);
                                        d5 = d10 + Long.parseLong(hours2);
                                        seconds = matcher2.group(4);
                                        d8 = 0.0d;
                                        if (seconds == null) {
                                            c5 = '\n';
                                            break;
                                        } else {
                                            c5 = 3;
                                            break;
                                        }
                                    case 3:
                                        seconds = seconds;
                                        d3 = Double.parseDouble(seconds);
                                        c5 = 4;
                                        break;
                                    case 4:
                                        matcher2 = matcher2;
                                        d4 = d5 + d3;
                                        strGroup = matcher2.group(5);
                                        if (strGroup == null) {
                                            c5 = '\t';
                                            break;
                                        } else {
                                            c5 = 5;
                                            break;
                                        }
                                    case 5:
                                        c0506Gu2 = c0506Gu2;
                                        String subframes2 = strGroup;
                                        strGroup = subframes2;
                                        d7 = Long.parseLong(strGroup) / c0506Gu2.A00;
                                        c5 = 6;
                                        break;
                                    case 6:
                                        matcher2 = matcher2;
                                        d6 = d4 + d7;
                                        subframes = matcher2.group(6);
                                        if (subframes == null) {
                                            c5 = '\b';
                                            break;
                                        } else {
                                            c5 = 7;
                                            break;
                                        }
                                    case 7:
                                        c0506Gu2 = c0506Gu2;
                                        subframes = subframes;
                                        d8 = (Long.parseLong(subframes) / c0506Gu2.A01) / c0506Gu2.A00;
                                        c5 = '\b';
                                        break;
                                    case '\b':
                                        return (long) (1000000.0d * (d6 + d8));
                                    case '\t':
                                        d7 = d8;
                                        c5 = 6;
                                        break;
                                    case '\n':
                                        d3 = d8;
                                        c5 = 4;
                                        break;
                                    case 11:
                                        str3 = str3;
                                        matcher = A07.matcher(str3);
                                        if (!matcher.matches()) {
                                            c5 = '*';
                                            break;
                                        } else {
                                            c5 = '\f';
                                            break;
                                        }
                                    case '\f':
                                        matcher = matcher;
                                        String timeValue = matcher.group(1);
                                        d2 = Double.parseDouble(timeValue);
                                        unit = matcher.group(2);
                                        c4 = 65535;
                                        iHashCode = unit.hashCode();
                                        if (iHashCode == 102) {
                                            c5 = '(';
                                            break;
                                        } else {
                                            c5 = '\r';
                                            break;
                                        }
                                    case '\r':
                                        if (iHashCode == 104) {
                                            c5 = '&';
                                            break;
                                        } else {
                                            c5 = 14;
                                            break;
                                        }
                                    case 14:
                                        if (iHashCode == 109) {
                                            c5 = '$';
                                            break;
                                        } else {
                                            c5 = 15;
                                            break;
                                        }
                                    case 15:
                                        if (iHashCode == 3494) {
                                            c5 = '\"';
                                            break;
                                        } else {
                                            c5 = 16;
                                            break;
                                        }
                                    case 16:
                                        if (iHashCode == 115) {
                                            c5 = ' ';
                                            break;
                                        } else {
                                            c5 = 17;
                                            break;
                                        }
                                    case 17:
                                        if (iHashCode == 116) {
                                            c5 = 30;
                                            break;
                                        } else {
                                            c5 = 18;
                                            break;
                                        }
                                    case 18:
                                        if (c4 == 0) {
                                            c5 = 29;
                                            break;
                                        } else {
                                            c5 = 19;
                                            break;
                                        }
                                    case 19:
                                        if (c4 == 1) {
                                            c5 = 28;
                                            break;
                                        } else {
                                            c5 = 20;
                                            break;
                                        }
                                    case 20:
                                        if (c4 == 2) {
                                            c5 = 24;
                                            break;
                                        } else {
                                            c5 = 21;
                                            break;
                                        }
                                    case 21:
                                        if (c4 == 3) {
                                            c5 = 27;
                                            break;
                                        } else {
                                            c5 = 22;
                                            break;
                                        }
                                    case 22:
                                        if (c4 == 4) {
                                            c5 = 26;
                                            break;
                                        } else {
                                            c5 = 23;
                                            break;
                                        }
                                    case 23:
                                        if (c4 == 5) {
                                            c5 = 25;
                                            break;
                                        } else {
                                            c5 = 24;
                                            break;
                                        }
                                    case 24:
                                        return (long) (1000000.0d * d2);
                                    case 25:
                                        c0506Gu2 = c0506Gu2;
                                        d2 /= c0506Gu2.A02;
                                        c5 = 24;
                                        break;
                                    case 26:
                                        c0506Gu2 = c0506Gu2;
                                        d2 /= c0506Gu2.A00;
                                        c5 = 24;
                                        break;
                                    case 27:
                                        d2 /= 1000.0d;
                                        c5 = 24;
                                        break;
                                    case 28:
                                        d2 *= 60.0d;
                                        c5 = 24;
                                        break;
                                    case 29:
                                        d2 *= 3600.0d;
                                        c5 = 24;
                                        break;
                                    case 30:
                                        unit = unit;
                                        String unit3 = A08(1058, 1, 78);
                                        if (!unit.equals(unit3)) {
                                            c5 = 18;
                                            break;
                                        } else {
                                            c5 = 31;
                                            break;
                                        }
                                    case 31:
                                        c4 = 5;
                                        c5 = 18;
                                        break;
                                    case ' ':
                                        unit = unit;
                                        if (!unit.equals(A08(313, 1, 108))) {
                                            c5 = 18;
                                            break;
                                        } else {
                                            c5 = '!';
                                            break;
                                        }
                                    case '!':
                                        c4 = 2;
                                        c5 = 18;
                                        break;
                                    case '\"':
                                        unit = unit;
                                        String unit4 = A08(960, 2, 78);
                                        if (!unit.equals(unit4)) {
                                            c5 = 18;
                                            break;
                                        } else {
                                            c5 = '#';
                                            break;
                                        }
                                    case '#':
                                        c4 = 3;
                                        c5 = 18;
                                        break;
                                    case '$':
                                        unit = unit;
                                        if (!unit.equals(A08(143, 1, 81))) {
                                            c5 = 18;
                                            break;
                                        } else {
                                            c5 = '%';
                                            break;
                                        }
                                    case '%':
                                        c4 = 1;
                                        c5 = 18;
                                        break;
                                    case '&':
                                        unit = unit;
                                        if (!unit.equals(A08(846, 1, 8))) {
                                            c5 = 18;
                                            break;
                                        } else {
                                            c5 = '\'';
                                            break;
                                        }
                                    case '\'':
                                        c4 = 0;
                                        c5 = 18;
                                        break;
                                    case '(':
                                        unit = unit;
                                        if (!unit.equals(A08(1217, 1, 74))) {
                                            c5 = 18;
                                            break;
                                        } else {
                                            c5 = ')';
                                            break;
                                        }
                                    case ')':
                                        c4 = 4;
                                        c5 = 18;
                                        break;
                                    case '*':
                                        throw new GZ(A08(27, 27, 91) + str3);
                                }
                            }
                        }

                        private C0505Gt A01(XmlPullParser xmlPullParser, C0505Gt c0505Gt) throws GZ, NumberFormatException {
                            String attributeValue = xmlPullParser.getAttributeValue(A08(1218, 35, 53), A08(1203, 14, 11));
                            if (attributeValue == null) {
                                return c0505Gt;
                            }
                            Matcher matcher = A04.matcher(attributeValue);
                            boolean zMatches = matcher.matches();
                            String strA08 = A08(187, 36, 67);
                            String strA082 = A08(529, 11, 76);
                            if (!zMatches) {
                                Log.w(strA082, strA08 + attributeValue);
                                return c0505Gt;
                            }
                            try {
                                int i = Integer.parseInt(matcher.group(1));
                                int i2 = Integer.parseInt(matcher.group(2));
                                if (i != 0 && i2 != 0) {
                                    return new C0505Gt(i, i2);
                                }
                                throw new GZ(A08(808, 24, 73) + i + A08(144, 1, 102) + i2);
                            } catch (NumberFormatException unused) {
                                Log.w(strA082, strA08 + attributeValue);
                                return c0505Gt;
                            }
                        }

                        private C0506Gu A02(XmlPullParser xmlPullParser) throws GZ, NumberFormatException {
                            int i = 0;
                            float f = 0.0f;
                            String attributeValue = null;
                            String[] strArrA0o = null;
                            String attributeValue2 = null;
                            int i2 = 0;
                            String attributeValue3 = null;
                            int i3 = 30;
                            String strA08 = A08(1218, 35, 53);
                            String attributeValue4 = xmlPullParser.getAttributeValue(strA08, A08(837, 9, 86));
                            float denominator = attributeValue4 != null ? 2.8E-45f : 4.2E-45f;
                            while (true) {
                                switch (denominator) {
                                    case 2.8E-45f:
                                        attributeValue4 = attributeValue4;
                                        i3 = Integer.parseInt(attributeValue4);
                                        denominator = 4.2E-45f;
                                        break;
                                    case 4.2E-45f:
                                        xmlPullParser = xmlPullParser;
                                        strA08 = strA08;
                                        f = 1.0f;
                                        attributeValue3 = xmlPullParser.getAttributeValue(strA08, A08(1014, 19, 5));
                                        if (attributeValue3 == null) {
                                            denominator = 8.4E-45f;
                                            break;
                                        } else {
                                            denominator = 5.6E-45f;
                                            break;
                                        }
                                    case 5.6E-45f:
                                        attributeValue3 = attributeValue3;
                                        strArrA0o = C0560Iy.A0o(attributeValue3, A08(144, 1, 102));
                                        if (strArrA0o.length != 2) {
                                            denominator = 1.5E-44f;
                                            break;
                                        } else {
                                            denominator = 7.0E-45f;
                                            break;
                                        }
                                    case 7.0E-45f:
                                        strArrA0o = strArrA0o;
                                        float f2 = Integer.parseInt(strArrA0o[0]);
                                        float denominator2 = Integer.parseInt(strArrA0o[1]);
                                        f = f2 / denominator2;
                                        denominator = 8.4E-45f;
                                        break;
                                    case 8.4E-45f:
                                        xmlPullParser = xmlPullParser;
                                        strA08 = strA08;
                                        i2 = A03.A01;
                                        attributeValue2 = xmlPullParser.getAttributeValue(strA08, A08(1264, 12, 87));
                                        if (attributeValue2 == null) {
                                            denominator = 1.1E-44f;
                                            break;
                                        } else {
                                            denominator = 9.8E-45f;
                                            break;
                                        }
                                    case 9.8E-45f:
                                        attributeValue2 = attributeValue2;
                                        i2 = Integer.parseInt(attributeValue2);
                                        denominator = 1.1E-44f;
                                        break;
                                    case 1.1E-44f:
                                        xmlPullParser = xmlPullParser;
                                        strA08 = strA08;
                                        i = A03.A02;
                                        attributeValue = xmlPullParser.getAttributeValue(strA08, A08(952, 8, 63));
                                        if (attributeValue == null) {
                                            denominator = 1.4E-44f;
                                            break;
                                        } else {
                                            denominator = 1.3E-44f;
                                            break;
                                        }
                                    case 1.3E-44f:
                                        attributeValue = attributeValue;
                                        i = Integer.parseInt(attributeValue);
                                        denominator = 1.4E-44f;
                                        break;
                                    case 1.4E-44f:
                                        return new C0506Gu(i3 * f, i2, i);
                                    case 1.5E-44f:
                                        throw new GZ(A08(894, 40, 84));
                                }
                            }
                        }

                        private C0507Gv A03(XmlPullParser xmlPullParser, C0507Gv c0507Gv, Map<String, C0508Gw> map, C0506Gu c0506Gu) throws GZ, NumberFormatException {
                            XmlPullParser xmlPullParser2 = xmlPullParser;
                            C0506Gu c0506Gu2 = c0506Gu;
                            C0507Gv c0507Gv2 = c0507Gv;
                            Map<String, C0508Gw> map2 = map;
                            C01672k c01672k = this;
                            long j = 0;
                            String[] strArrA0D = null;
                            char c4 = 0;
                            int i = 0;
                            String attributeName = null;
                            String attributeValue = null;
                            long j2 = 0;
                            C01672k c01672k2 = c01672k;
                            XmlPullParser xmlPullParser3 = xmlPullParser2;
                            long jA00 = -9223372036854775807L;
                            long jA002 = -9223372036854775807L;
                            long jA003 = -9223372036854775807L;
                            String strA08 = A08(342, 0, 58);
                            String[] strArr = null;
                            int attributeCount = xmlPullParser2.getAttributeCount();
                            H1 h1A06 = c01672k2.A06(xmlPullParser3, null);
                            int i2 = 0;
                            int attributeCount2 = 2;
                            while (true) {
                                switch (attributeCount2) {
                                    case 2:
                                        if (i2 >= attributeCount) {
                                            attributeCount2 = 28;
                                            break;
                                        } else {
                                            attributeCount2 = 3;
                                            break;
                                        }
                                    case 3:
                                        xmlPullParser3 = xmlPullParser3;
                                        attributeName = xmlPullParser3.getAttributeName(i2);
                                        i = attributeCount;
                                        attributeValue = xmlPullParser3.getAttributeValue(i2);
                                        int attributeCount3 = attributeName.hashCode();
                                        switch (attributeCount3) {
                                            case -934795532:
                                                attributeCount2 = 18;
                                                break;
                                            case 99841:
                                                attributeCount2 = 20;
                                                break;
                                            case 100571:
                                                attributeCount2 = 22;
                                                break;
                                            case 93616297:
                                                attributeCount2 = 24;
                                                break;
                                            case 109780401:
                                                attributeCount2 = 26;
                                                break;
                                            default:
                                                attributeCount2 = 4;
                                                break;
                                        }
                                    case 4:
                                        c4 = 65535;
                                        attributeCount2 = 5;
                                        break;
                                    case 5:
                                        if (c4 == 0) {
                                            attributeCount2 = 17;
                                            break;
                                        } else {
                                            attributeCount2 = 6;
                                            break;
                                        }
                                    case 6:
                                        if (c4 == 1) {
                                            attributeCount2 = 16;
                                            break;
                                        } else {
                                            attributeCount2 = 7;
                                            break;
                                        }
                                    case 7:
                                        if (c4 == 2) {
                                            attributeCount2 = 15;
                                            break;
                                        } else {
                                            attributeCount2 = 8;
                                            break;
                                        }
                                    case 8:
                                        if (c4 == 3) {
                                            attributeCount2 = 13;
                                            break;
                                        } else {
                                            attributeCount2 = 9;
                                            break;
                                        }
                                    case 9:
                                        if (c4 == 4) {
                                            attributeCount2 = 11;
                                            break;
                                        } else {
                                            attributeCount2 = 10;
                                            break;
                                        }
                                    case 10:
                                        c01672k = c01672k;
                                        xmlPullParser2 = xmlPullParser2;
                                        i2++;
                                        c01672k2 = c01672k;
                                        xmlPullParser3 = xmlPullParser2;
                                        attributeCount = i;
                                        attributeCount2 = 2;
                                        break;
                                    case 11:
                                        map2 = map2;
                                        attributeValue = attributeValue;
                                        if (!map2.containsKey(attributeValue)) {
                                            attributeCount2 = 10;
                                            break;
                                        } else {
                                            attributeCount2 = 12;
                                            break;
                                        }
                                    case 12:
                                        attributeValue = attributeValue;
                                        strA08 = attributeValue;
                                        attributeCount2 = 10;
                                        break;
                                    case 13:
                                        c01672k2 = c01672k2;
                                        attributeValue = attributeValue;
                                        strArrA0D = c01672k2.A0D(attributeValue);
                                        if (strArrA0D.length <= 0) {
                                            attributeCount2 = 10;
                                            break;
                                        } else {
                                            attributeCount2 = 14;
                                            break;
                                        }
                                    case 14:
                                        strArrA0D = strArrA0D;
                                        strArr = strArrA0D;
                                        attributeCount2 = 10;
                                        break;
                                    case 15:
                                        c0506Gu2 = c0506Gu2;
                                        attributeValue = attributeValue;
                                        jA00 = A00(attributeValue, c0506Gu2);
                                        attributeCount2 = 10;
                                        break;
                                    case 16:
                                        c0506Gu2 = c0506Gu2;
                                        attributeValue = attributeValue;
                                        jA003 = A00(attributeValue, c0506Gu2);
                                        attributeCount2 = 10;
                                        break;
                                    case 17:
                                        c0506Gu2 = c0506Gu2;
                                        attributeValue = attributeValue;
                                        jA002 = A00(attributeValue, c0506Gu2);
                                        attributeCount2 = 10;
                                        break;
                                    case 18:
                                        attributeName = attributeName;
                                        if (!attributeName.equals(A08(1258, 6, 41))) {
                                            attributeCount2 = 4;
                                            break;
                                        } else {
                                            attributeCount2 = 19;
                                            break;
                                        }
                                    case 19:
                                        c4 = 4;
                                        attributeCount2 = 5;
                                        break;
                                    case 20:
                                        attributeName = attributeName;
                                        if (!attributeName.equals(A08(54, 3, 52))) {
                                            attributeCount2 = 4;
                                            break;
                                        } else {
                                            attributeCount2 = 21;
                                            break;
                                        }
                                    case 21:
                                        c4 = 2;
                                        attributeCount2 = 5;
                                        break;
                                    case 22:
                                        attributeName = attributeName;
                                        if (!attributeName.equals(A08(342, 3, 97))) {
                                            attributeCount2 = 4;
                                            break;
                                        } else {
                                            attributeCount2 = 23;
                                            break;
                                        }
                                    case 23:
                                        c4 = 1;
                                        attributeCount2 = 5;
                                        break;
                                    case 24:
                                        attributeName = attributeName;
                                        if (!attributeName.equals(A08(832, 5, 42))) {
                                            attributeCount2 = 4;
                                            break;
                                        } else {
                                            attributeCount2 = 25;
                                            break;
                                        }
                                    case 25:
                                        c4 = 0;
                                        attributeCount2 = 5;
                                        break;
                                    case 26:
                                        attributeName = attributeName;
                                        if (!attributeName.equals(A08(1053, 5, 21))) {
                                            attributeCount2 = 4;
                                            break;
                                        } else {
                                            attributeCount2 = 27;
                                            break;
                                        }
                                    case 27:
                                        c4 = 3;
                                        attributeCount2 = 5;
                                        break;
                                    case 28:
                                        c0507Gv2 = c0507Gv2;
                                        j2 = -9223372036854775807L;
                                        if (c0507Gv2 == null) {
                                            attributeCount2 = 34;
                                            break;
                                        } else {
                                            attributeCount2 = 29;
                                            break;
                                        }
                                    case 29:
                                        c0507Gv2 = c0507Gv2;
                                        if (c0507Gv2.A02 == j2) {
                                            attributeCount2 = 34;
                                            break;
                                        } else {
                                            attributeCount2 = 30;
                                            break;
                                        }
                                    case 30:
                                        if (jA002 == j2) {
                                            attributeCount2 = 32;
                                            break;
                                        } else {
                                            attributeCount2 = 31;
                                            break;
                                        }
                                    case 31:
                                        c0507Gv2 = c0507Gv2;
                                        jA002 += c0507Gv2.A02;
                                        attributeCount2 = 32;
                                        break;
                                    case 32:
                                        if (jA003 == j2) {
                                            attributeCount2 = 34;
                                            break;
                                        } else {
                                            attributeCount2 = 33;
                                            break;
                                        }
                                    case 33:
                                        c0507Gv2 = c0507Gv2;
                                        jA003 += c0507Gv2.A02;
                                        attributeCount2 = 34;
                                        break;
                                    case 34:
                                        if (jA003 != j2) {
                                            attributeCount2 = 41;
                                            break;
                                        } else {
                                            attributeCount2 = 35;
                                            break;
                                        }
                                    case 35:
                                        if (jA00 == j2) {
                                            attributeCount2 = 38;
                                            break;
                                        } else {
                                            attributeCount2 = 36;
                                            break;
                                        }
                                    case 36:
                                        j = jA002 + jA00;
                                        attributeCount2 = 37;
                                        break;
                                    case 37:
                                        H1 h1 = h1A06;
                                        return C0507Gv.A05(xmlPullParser2.getName(), jA002, j, h1, strArr, strA08);
                                    case 38:
                                        c0507Gv2 = c0507Gv2;
                                        if (c0507Gv2 == null) {
                                            attributeCount2 = 41;
                                            break;
                                        } else {
                                            attributeCount2 = 39;
                                            break;
                                        }
                                    case 39:
                                        c0507Gv2 = c0507Gv2;
                                        if (c0507Gv2.A01 == j2) {
                                            attributeCount2 = 41;
                                            break;
                                        } else {
                                            attributeCount2 = 40;
                                            break;
                                        }
                                    case 40:
                                        c0507Gv2 = c0507Gv2;
                                        j = c0507Gv2.A01;
                                        attributeCount2 = 37;
                                        break;
                                    case 41:
                                        j = jA003;
                                        attributeCount2 = 37;
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
                        /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
                        /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        private com.facebook.ads.redexgen.X.C0508Gw A04(org.xmlpull.v1.XmlPullParser r19, com.facebook.ads.redexgen.X.C0505Gt r20) {
                            /*
                                Method dump skipped, instructions count: 367
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C01672k.A04(org.xmlpull.v1.XmlPullParser, com.facebook.ads.redexgen.X.Gt):com.facebook.ads.redexgen.X.Gw");
                        }

                        private H1 A05(H1 h1) {
                            H1 h12 = null;
                            char c4 = h1 == null ? (char) 2 : (char) 4;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        h12 = new H1();
                                        c4 = 3;
                                        break;
                                    case 3:
                                        return h12;
                                    case 4:
                                        h1 = h1;
                                        h12 = h1;
                                        c4 = 3;
                                        break;
                                }
                            }
                        }

                        private H1 A06(XmlPullParser xmlPullParser, H1 h1) {
                            XmlPullParser xmlPullParser2 = xmlPullParser;
                            H1 h1A0G = h1;
                            C01672k c01672k = this;
                            String attributeName = null;
                            String strA0P = null;
                            char c4 = 0;
                            String strA08 = null;
                            String attributeValue = null;
                            char c5 = 0;
                            boolean z = false;
                            char c6 = 0;
                            char c7 = 0;
                            char c8 = 0;
                            String strA0P2 = null;
                            boolean z2 = false;
                            int attributeCount = xmlPullParser2.getAttributeCount();
                            int i = 0;
                            char c9 = 2;
                            while (true) {
                                switch (c9) {
                                    case 2:
                                        if (i < attributeCount) {
                                            c9 = 3;
                                        } else {
                                            c9 = 'O';
                                            continue;
                                        }
                                    case 3:
                                        xmlPullParser2 = xmlPullParser2;
                                        attributeValue = xmlPullParser2.getAttributeValue(i);
                                        attributeName = xmlPullParser2.getAttributeName(i);
                                        c8 = 4;
                                        c5 = 65535;
                                        c6 = 2;
                                        z2 = false;
                                        c7 = 3;
                                        z = true;
                                        switch (attributeName.hashCode()) {
                                            case -1550943582:
                                                c9 = '=';
                                                break;
                                            case -1224696685:
                                                c9 = '?';
                                                break;
                                            case -1065511464:
                                                c9 = 'A';
                                                break;
                                            case -879295043:
                                                c9 = 'C';
                                                break;
                                            case -734428249:
                                                c9 = 'E';
                                                break;
                                            case 3355:
                                                c9 = 'G';
                                                break;
                                            case 94842723:
                                                c9 = 'I';
                                                break;
                                            case 365601008:
                                                c9 = 'K';
                                                break;
                                            case 1287124693:
                                                c9 = 'M';
                                                continue;
                                            default:
                                                c9 = 4;
                                                break;
                                        }
                                    case 4:
                                        c4 = 65535;
                                        c9 = 5;
                                        continue;
                                    case 5:
                                        strA08 = A08(529, 11, 76);
                                        switch (c4) {
                                            case 0:
                                                if (A08(1053, 5, 21).equals(xmlPullParser2.getName())) {
                                                    h1A0G = c01672k.A05(h1A0G).A0G(attributeValue);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                h1A0G = c01672k.A05(h1A0G);
                                                c9 = '\r';
                                                continue;
                                            case 2:
                                                h1A0G = c01672k.A05(h1A0G);
                                                c9 = 17;
                                                continue;
                                            case 3:
                                                h1A0G = c01672k.A05(h1A0G).A0F(attributeValue);
                                                break;
                                            case 4:
                                                try {
                                                    h1A0G = c01672k.A05(h1A0G);
                                                    A0B(attributeValue, h1A0G);
                                                    break;
                                                } catch (GZ unused) {
                                                    Log.w(strA08, A08(498, 31, 25) + attributeValue);
                                                    break;
                                                }
                                            case 5:
                                                h1A0G = c01672k.A05(h1A0G).A0H(A08(1043, 4, 43).equalsIgnoreCase(attributeValue));
                                                break;
                                            case 6:
                                                h1A0G = c01672k.A05(h1A0G).A0I(A08(1104, 6, 93).equalsIgnoreCase(attributeValue));
                                                break;
                                            case 7:
                                                strA0P2 = C0560Iy.A0P(attributeValue);
                                                switch (strA0P2.hashCode()) {
                                                    case -1364013995:
                                                        c9 = 29;
                                                        break;
                                                    case 100571:
                                                        c9 = 31;
                                                        break;
                                                    case 3317767:
                                                        c9 = '!';
                                                        break;
                                                    case 108511772:
                                                        c9 = '#';
                                                        break;
                                                    case 109757538:
                                                        c9 = '%';
                                                        continue;
                                                    default:
                                                        c9 = 24;
                                                        break;
                                                }
                                            case '\b':
                                                strA0P = C0560Iy.A0P(attributeValue);
                                                switch (strA0P.hashCode()) {
                                                    case -1461280213:
                                                        c9 = '1';
                                                        break;
                                                    case -1026963764:
                                                        c9 = '3';
                                                        break;
                                                    case 913457136:
                                                        c9 = '5';
                                                        break;
                                                    case 1679736913:
                                                        c9 = '7';
                                                        continue;
                                                    default:
                                                        c9 = '-';
                                                        break;
                                                }
                                        }
                                        break;
                                    case '\r':
                                        try {
                                            attributeValue = attributeValue;
                                            h1A0G.A0A(IO.A03(attributeValue));
                                            break;
                                        } catch (IllegalArgumentException unused2) {
                                            Log.w(strA08, A08(228, 33, 109) + attributeValue);
                                            break;
                                        }
                                    case 17:
                                        try {
                                            attributeValue = attributeValue;
                                            h1A0G.A0B(IO.A03(attributeValue));
                                            break;
                                        } catch (IllegalArgumentException unused3) {
                                            Log.w(strA08, A08(314, 28, 7) + attributeValue);
                                            break;
                                        }
                                    case 24:
                                        if (c5 != 0) {
                                            c9 = 25;
                                        } else {
                                            c9 = '+';
                                            continue;
                                        }
                                    case 25:
                                        if (c5 != z) {
                                            c9 = 26;
                                        } else {
                                            c9 = '*';
                                            continue;
                                        }
                                    case 26:
                                        if (c5 != c6) {
                                            c9 = 27;
                                        } else {
                                            c9 = ')';
                                            continue;
                                        }
                                    case 27:
                                        if (c5 != c7) {
                                            c9 = 28;
                                        } else {
                                            c9 = '(';
                                            continue;
                                        }
                                    case 28:
                                        if (c5 == c8) {
                                            h1A0G = c01672k.A05(h1A0G).A0D(Layout.Alignment.ALIGN_CENTER);
                                            break;
                                        }
                                        break;
                                    case 29:
                                        strA0P2 = strA0P2;
                                        if (strA0P2.equals(A08(883, 6, 18))) {
                                            c9 = 30;
                                        } else {
                                            c9 = 24;
                                            continue;
                                        }
                                    case 30:
                                        c5 = 4;
                                        c9 = 24;
                                        continue;
                                    case 31:
                                        strA0P2 = strA0P2;
                                        if (strA0P2.equals(A08(342, 3, 97))) {
                                            c9 = ' ';
                                        } else {
                                            c9 = 24;
                                            continue;
                                        }
                                    case ' ':
                                        c5 = 3;
                                        c9 = 24;
                                        continue;
                                    case '!':
                                        strA0P2 = strA0P2;
                                        if (strA0P2.equals(A08(767, 4, 67))) {
                                            c9 = '\"';
                                        } else {
                                            c9 = 24;
                                            continue;
                                        }
                                    case '\"':
                                        c5 = 0;
                                        c9 = 24;
                                        continue;
                                    case '#':
                                        strA0P2 = strA0P2;
                                        if (strA0P2.equals(A08(889, 5, 95))) {
                                            c9 = '$';
                                        } else {
                                            c9 = 24;
                                            continue;
                                        }
                                    case '$':
                                        c5 = 2;
                                        c9 = 24;
                                        continue;
                                    case '%':
                                        strA0P2 = strA0P2;
                                        if (strA0P2.equals(A08(847, 5, 108))) {
                                            c9 = '&';
                                        } else {
                                            c9 = 24;
                                            continue;
                                        }
                                    case '&':
                                        c5 = 1;
                                        c9 = 24;
                                        continue;
                                    case '(':
                                        c01672k = c01672k;
                                        h1A0G = c01672k.A05(h1A0G).A0D(Layout.Alignment.ALIGN_OPPOSITE);
                                        break;
                                    case ')':
                                        c01672k = c01672k;
                                        h1A0G = c01672k.A05(h1A0G).A0D(Layout.Alignment.ALIGN_OPPOSITE);
                                        break;
                                    case '*':
                                        c01672k = c01672k;
                                        h1A0G = c01672k.A05(h1A0G).A0D(Layout.Alignment.ALIGN_NORMAL);
                                        break;
                                    case '+':
                                        c01672k = c01672k;
                                        h1A0G = c01672k.A05(h1A0G).A0D(Layout.Alignment.ALIGN_NORMAL);
                                        break;
                                    case '-':
                                        if (c5 != 0) {
                                            c9 = '.';
                                        } else {
                                            c9 = '<';
                                            continue;
                                        }
                                    case '.':
                                        if (c5 != z) {
                                            c9 = '/';
                                        } else {
                                            c9 = ';';
                                            continue;
                                        }
                                    case '/':
                                        if (c5 != c6) {
                                            c9 = '0';
                                        } else {
                                            c9 = ':';
                                            continue;
                                        }
                                    case '0':
                                        if (c5 == c7) {
                                            h1A0G = c01672k.A05(h1A0G).A0K(z2);
                                            break;
                                        }
                                        break;
                                    case '1':
                                        strA0P = strA0P;
                                        if (strA0P.equals(A08(592, 11, 65))) {
                                            c9 = '2';
                                        } else {
                                            c9 = '-';
                                            continue;
                                        }
                                    case '2':
                                        c5 = 3;
                                        c9 = '-';
                                        continue;
                                    case '3':
                                        strA0P = strA0P;
                                        if (strA0P.equals(A08(177, 9, 60))) {
                                            c9 = '4';
                                        } else {
                                            c9 = '-';
                                            continue;
                                        }
                                    case '4':
                                        c5 = 2;
                                        c9 = '-';
                                        continue;
                                    case '5':
                                        strA0P = strA0P;
                                        if (strA0P.equals(A08(939, 13, 71))) {
                                            c9 = '6';
                                        } else {
                                            c9 = '-';
                                            continue;
                                        }
                                    case '6':
                                        c5 = 1;
                                        c9 = '-';
                                        continue;
                                    case '7':
                                        strA0P = strA0P;
                                        if (strA0P.equals(A08(1093, 11, 72))) {
                                            c9 = '8';
                                        } else {
                                            c9 = '-';
                                            continue;
                                        }
                                    case '8':
                                        c5 = 0;
                                        c9 = '-';
                                        continue;
                                    case ':':
                                        c01672k = c01672k;
                                        h1A0G = c01672k.A05(h1A0G).A0K(z);
                                        break;
                                    case ';':
                                        c01672k = c01672k;
                                        z2 = false;
                                        h1A0G = c01672k.A05(h1A0G).A0J(false);
                                        break;
                                    case '<':
                                        c01672k = c01672k;
                                        h1A0G = c01672k.A05(h1A0G).A0J(z);
                                        break;
                                    case '=':
                                        attributeName = attributeName;
                                        if (attributeName.equals(A08(576, 9, 25))) {
                                            c9 = '>';
                                        } else {
                                            c9 = 4;
                                            continue;
                                        }
                                    case '>':
                                        c4 = 6;
                                        c9 = 5;
                                        continue;
                                    case '?':
                                        attributeName = attributeName;
                                        if (attributeName.equals(A08(57, 10, 100))) {
                                            c9 = '@';
                                        } else {
                                            c9 = 4;
                                            continue;
                                        }
                                    case '@':
                                        c4 = 3;
                                        c9 = 5;
                                        continue;
                                    case 'A':
                                        attributeName = attributeName;
                                        if (attributeName.equals(A08(145, 9, 0))) {
                                            c9 = 'B';
                                        } else {
                                            c9 = 4;
                                            continue;
                                        }
                                    case 'B':
                                        c4 = 7;
                                        c9 = 5;
                                        continue;
                                    case 'C':
                                        attributeName = attributeName;
                                        if (attributeName.equals(A08(345, 14, 37))) {
                                            c9 = 'D';
                                        } else {
                                            c9 = 4;
                                            continue;
                                        }
                                    case 'D':
                                        c4 = '\b';
                                        c9 = 5;
                                        continue;
                                    case 'E':
                                        attributeName = attributeName;
                                        if (attributeName.equals(A08(0, 10, 104))) {
                                            c9 = 'F';
                                        } else {
                                            c9 = 4;
                                            continue;
                                        }
                                    case 'F':
                                        c4 = 5;
                                        c9 = 5;
                                        continue;
                                    case 'G':
                                        attributeName = attributeName;
                                        if (attributeName.equals(A08(1295, 2, 68))) {
                                            c9 = 'H';
                                        } else {
                                            c9 = 4;
                                            continue;
                                        }
                                    case 'H':
                                        c4 = 0;
                                        c9 = 5;
                                        continue;
                                    case 'I':
                                        attributeName = attributeName;
                                        if (attributeName.equals(A08(223, 5, 40))) {
                                            c9 = 'J';
                                        } else {
                                            c9 = 4;
                                            continue;
                                        }
                                    case 'J':
                                        c4 = 2;
                                        c9 = 5;
                                        continue;
                                    case 'K':
                                        attributeName = attributeName;
                                        if (attributeName.equals(A08(1276, 8, 72))) {
                                            c9 = 'L';
                                        } else {
                                            c9 = 4;
                                            continue;
                                        }
                                    case 'L':
                                        c4 = 4;
                                        c9 = 5;
                                        continue;
                                    case 'M':
                                        attributeName = attributeName;
                                        if (attributeName.equals(A08(162, 15, 44))) {
                                            c9 = 'N';
                                        } else {
                                            c9 = 4;
                                            continue;
                                        }
                                    case 'N':
                                        c4 = 1;
                                        c9 = 5;
                                        continue;
                                    case 'O':
                                        return h1A0G;
                                }
                                i++;
                                c9 = 2;
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // com.facebook.ads.redexgen.X.BZ
                        /* renamed from: A07, reason: merged with bridge method [inline-methods] */
                        public final C1065bB A0b(byte[] bArr, int i, boolean z) throws XmlPullParserException, GZ, NumberFormatException, IOException {
                            XmlPullParser xmlPullParserNewPullParser;
                            HashMap map;
                            HashMap map2;
                            try {
                                xmlPullParserNewPullParser = this.A00.newPullParser();
                                map = new HashMap();
                                map2 = new HashMap();
                                map2.put(A08(342, 0, 58), new C0508Gw(null));
                            } catch (IOException e) {
                                e = e;
                            } catch (XmlPullParserException e2) {
                                e = e2;
                            }
                            try {
                                xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
                                C1065bB c1065bB = null;
                                ArrayDeque arrayDeque = new ArrayDeque();
                                int i2 = 0;
                                C0506Gu c0506GuA02 = A03;
                                C0505Gt cellResolution = A02;
                                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                                    C0507Gv c0507Gv = (C0507Gv) arrayDeque.peek();
                                    if (i2 == 0) {
                                        String name = xmlPullParserNewPullParser.getName();
                                        String strA08 = A08(426, 2, 94);
                                        if (eventType == 2) {
                                            if (strA08.equals(name)) {
                                                c0506GuA02 = A02(xmlPullParserNewPullParser);
                                                cellResolution = A01(xmlPullParserNewPullParser, A02);
                                            }
                                            boolean zA0C = A0C(name);
                                            String strA082 = A08(529, 11, 76);
                                            if (!zA0C) {
                                                Log.i(strA082, A08(965, 26, 78) + xmlPullParserNewPullParser.getName());
                                                i2++;
                                            } else if (A08(1413, 4, 14).equals(name)) {
                                                A09(xmlPullParserNewPullParser, map, map2, cellResolution);
                                            } else {
                                                try {
                                                    C0507Gv c0507GvA03 = A03(xmlPullParserNewPullParser, c0507Gv, map2, c0506GuA02);
                                                    arrayDeque.push(c0507GvA03);
                                                    if (c0507Gv != null) {
                                                        c0507Gv.A0E(c0507GvA03);
                                                    }
                                                } catch (GZ e3) {
                                                    Log.w(strA082, A08(552, 24, 32), e3);
                                                    i2++;
                                                }
                                            }
                                        } else if (eventType != 4) {
                                            if (eventType == 3) {
                                                if (xmlPullParserNewPullParser.getName().equals(strA08)) {
                                                    c1065bB = new C1065bB((C0507Gv) arrayDeque.peek(), map, map2);
                                                }
                                                arrayDeque.pop();
                                            }
                                        } else {
                                            c0507Gv.A0E(C0507Gv.A04(xmlPullParserNewPullParser.getText()));
                                        }
                                    } else if (eventType == 2) {
                                        i2++;
                                    } else if (eventType == 3) {
                                        i2--;
                                    }
                                    xmlPullParserNewPullParser.next();
                                }
                                return c1065bB;
                            } catch (IOException e4) {
                                e = e4;
                                throw new IllegalStateException(A08(67, 36, 92), e);
                            } catch (XmlPullParserException e5) {
                                e = e5;
                                throw new GZ(A08(991, 23, 32), e);
                            }
                        }

                        private Map<String, H1> A09(XmlPullParser xmlPullParser, Map<String, H1> map, Map<String, C0508Gw> map2, C0505Gt c0505Gt) throws XmlPullParserException, IOException {
                            C01672k c01672k = this;
                            C0508Gw c0508GwA04 = null;
                            String[] strArrA0D = null;
                            H1 h1A06 = null;
                            int length = 0;
                            String strA08 = null;
                            int i = 0;
                            String strA01 = null;
                            char c4 = 2;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        xmlPullParser = xmlPullParser;
                                        xmlPullParser.next();
                                        strA08 = A08(1053, 5, 21);
                                        if (!C0561Iz.A06(xmlPullParser, strA08)) {
                                            c4 = 7;
                                            break;
                                        } else {
                                            c4 = 3;
                                            break;
                                        }
                                    case 3:
                                        c01672k = c01672k;
                                        xmlPullParser = xmlPullParser;
                                        strA08 = strA08;
                                        strA01 = C0561Iz.A01(xmlPullParser, strA08);
                                        h1A06 = c01672k.A06(xmlPullParser, new H1());
                                        if (strA01 == null) {
                                            c4 = '\n';
                                            break;
                                        } else {
                                            c4 = 4;
                                            break;
                                        }
                                    case 4:
                                        c01672k = c01672k;
                                        strA01 = strA01;
                                        strArrA0D = c01672k.A0D(strA01);
                                        length = strArrA0D.length;
                                        i = 0;
                                        c4 = 5;
                                        break;
                                    case 5:
                                        if (i >= length) {
                                            c4 = '\n';
                                            break;
                                        } else {
                                            c4 = 6;
                                            break;
                                        }
                                    case 6:
                                        map = map;
                                        h1A06 = h1A06;
                                        strArrA0D = strArrA0D;
                                        h1A06.A0E(map.get(strArrA0D[i]));
                                        i++;
                                        c4 = 5;
                                        break;
                                    case 7:
                                        xmlPullParser = xmlPullParser;
                                        if (!C0561Iz.A06(xmlPullParser, A08(1258, 6, 41))) {
                                            c4 = '\f';
                                            break;
                                        } else {
                                            c4 = '\b';
                                            break;
                                        }
                                    case '\b':
                                        c01672k = c01672k;
                                        xmlPullParser = xmlPullParser;
                                        c0505Gt = c0505Gt;
                                        c0508GwA04 = c01672k.A04(xmlPullParser, c0505Gt);
                                        if (c0508GwA04 == null) {
                                            c4 = '\f';
                                            break;
                                        } else {
                                            c4 = '\t';
                                            break;
                                        }
                                    case '\t':
                                        map2 = map2;
                                        c0508GwA04 = c0508GwA04;
                                        map2.put(c0508GwA04.A07, c0508GwA04);
                                        c4 = '\f';
                                        break;
                                    case '\n':
                                        h1A06 = h1A06;
                                        if (h1A06.A0M() == null) {
                                            c4 = '\f';
                                            break;
                                        } else {
                                            c4 = 11;
                                            break;
                                        }
                                    case 11:
                                        map = map;
                                        h1A06 = h1A06;
                                        map.put(h1A06.A0M(), h1A06);
                                        c4 = '\f';
                                        break;
                                    case '\f':
                                        xmlPullParser = xmlPullParser;
                                        if (!C0561Iz.A05(xmlPullParser, A08(1413, 4, 14))) {
                                            c4 = 2;
                                            break;
                                        } else {
                                            c4 = '\r';
                                            break;
                                        }
                                    case '\r':
                                        return map;
                                }
                            }
                        }

                        public static void A0B(String str2, H1 h1) throws GZ {
                            String strA08 = null;
                            String unit = null;
                            Matcher matcher = null;
                            int i = 0;
                            int iHashCode = 0;
                            char c4 = 0;
                            String[] strArrA0o = C0560Iy.A0o(str2, A08(934, 3, 51));
                            char c5 = strArrA0o.length == 1 ? (char) 2 : (char) 20;
                            while (true) {
                                switch (c5) {
                                    case 2:
                                        str2 = str2;
                                        matcher = A06.matcher(str2);
                                        c5 = 3;
                                        break;
                                    case 3:
                                        matcher = matcher;
                                        boolean zMatches = matcher.matches();
                                        strA08 = A08(937, 2, 74);
                                        if (!zMatches) {
                                            c5 = 23;
                                            break;
                                        } else {
                                            c5 = 4;
                                            break;
                                        }
                                    case 4:
                                        matcher = matcher;
                                        i = 3;
                                        unit = matcher.group(3);
                                        c4 = 65535;
                                        iHashCode = unit.hashCode();
                                        if (iHashCode == 37) {
                                            c5 = 18;
                                            break;
                                        } else {
                                            c5 = 5;
                                            break;
                                        }
                                    case 5:
                                        if (iHashCode == 3240) {
                                            c5 = 16;
                                            break;
                                        } else {
                                            c5 = 6;
                                            break;
                                        }
                                    case 6:
                                        if (iHashCode == 3592) {
                                            c5 = 14;
                                            break;
                                        } else {
                                            c5 = 7;
                                            break;
                                        }
                                    case 7:
                                        if (c4 == 0) {
                                            c5 = '\r';
                                            break;
                                        } else {
                                            c5 = '\b';
                                            break;
                                        }
                                    case '\b':
                                        if (c4 == 1) {
                                            c5 = '\f';
                                            break;
                                        } else {
                                            c5 = '\t';
                                            break;
                                        }
                                    case '\t':
                                        if (c4 != 2) {
                                            c5 = 22;
                                            break;
                                        } else {
                                            c5 = '\n';
                                            break;
                                        }
                                    case '\n':
                                        h1 = h1;
                                        h1.A0C(i);
                                        c5 = 11;
                                        break;
                                    case 11:
                                        h1.A09(Float.valueOf(matcher.group(1)).floatValue());
                                        return;
                                    case '\f':
                                        h1 = h1;
                                        h1.A0C(2);
                                        c5 = 11;
                                        break;
                                    case '\r':
                                        h1 = h1;
                                        h1.A0C(1);
                                        c5 = 11;
                                        break;
                                    case 14:
                                        unit = unit;
                                        if (!unit.equals(A08(881, 2, 42))) {
                                            c5 = 7;
                                            break;
                                        } else {
                                            c5 = 15;
                                            break;
                                        }
                                    case 15:
                                        c4 = 0;
                                        c5 = 7;
                                        break;
                                    case 16:
                                        unit = unit;
                                        if (!unit.equals(A08(1116, 2, 46))) {
                                            c5 = 7;
                                            break;
                                        } else {
                                            c5 = 17;
                                            break;
                                        }
                                    case 17:
                                        c4 = 1;
                                        c5 = 7;
                                        break;
                                    case 18:
                                        unit = unit;
                                        if (!unit.equals(A08(648, 1, 77))) {
                                            c5 = 7;
                                            break;
                                        } else {
                                            c5 = 19;
                                            break;
                                        }
                                    case 19:
                                        c4 = 2;
                                        c5 = 7;
                                        break;
                                    case 20:
                                        strArrA0o = strArrA0o;
                                        if (strArrA0o.length != 2) {
                                            c5 = 24;
                                            break;
                                        } else {
                                            c5 = 21;
                                            break;
                                        }
                                    case 21:
                                        strArrA0o = strArrA0o;
                                        matcher = A06.matcher(strArrA0o[1]);
                                        Log.w(A08(529, 11, 76), A08(1303, 110, 60));
                                        c5 = 3;
                                        break;
                                    case 22:
                                        throw new GZ(A08(359, 28, k.AppCompatTheme_windowMinWidthMinor) + unit + strA08);
                                    case 23:
                                        throw new GZ(A08(1059, 34, 54) + str2 + strA08);
                                    case 24:
                                        throw new GZ(A08(103, 40, 73) + strArrA0o.length + A08(649, 1, 126));
                                }
                            }
                        }

                        public static boolean A0C(String str2) {
                            boolean z = false;
                            char c4 = !str2.equals(A08(426, 2, 94)) ? (char) 2 : (char) 16;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        str2 = str2;
                                        if (!str2.equals(A08(1413, 4, 14))) {
                                            c4 = 3;
                                            break;
                                        } else {
                                            c4 = 16;
                                            break;
                                        }
                                    case 3:
                                        str2 = str2;
                                        if (!str2.equals(A08(730, 4, 18))) {
                                            c4 = 4;
                                            break;
                                        } else {
                                            c4 = 16;
                                            break;
                                        }
                                    case 4:
                                        str2 = str2;
                                        if (!str2.equals(A08(962, 3, k.AppCompatTheme_windowFixedHeightMajor))) {
                                            c4 = 5;
                                            break;
                                        } else {
                                            c4 = 16;
                                            break;
                                        }
                                    case 5:
                                        str2 = str2;
                                        if (!str2.equals(A08(186, 1, 63))) {
                                            c4 = 6;
                                            break;
                                        } else {
                                            c4 = 16;
                                            break;
                                        }
                                    case 6:
                                        str2 = str2;
                                        if (!str2.equals(A08(1299, 4, 7))) {
                                            c4 = 7;
                                            break;
                                        } else {
                                            c4 = 16;
                                            break;
                                        }
                                    case 7:
                                        str2 = str2;
                                        if (!str2.equals(A08(1297, 2, k.AppCompatTheme_windowNoTitle))) {
                                            c4 = '\b';
                                            break;
                                        } else {
                                            c4 = 16;
                                            break;
                                        }
                                    case '\b':
                                        str2 = str2;
                                        if (!str2.equals(A08(1053, 5, 21))) {
                                            c4 = '\t';
                                            break;
                                        } else {
                                            c4 = 16;
                                            break;
                                        }
                                    case '\t':
                                        str2 = str2;
                                        if (!str2.equals(A08(585, 7, 73))) {
                                            c4 = '\n';
                                            break;
                                        } else {
                                            c4 = 16;
                                            break;
                                        }
                                    case '\n':
                                        str2 = str2;
                                        if (!str2.equals(A08(307, 6, 49))) {
                                            c4 = 11;
                                            break;
                                        } else {
                                            c4 = 16;
                                            break;
                                        }
                                    case 11:
                                        str2 = str2;
                                        if (!str2.equals(A08(1258, 6, 41))) {
                                            c4 = '\f';
                                            break;
                                        } else {
                                            c4 = 16;
                                            break;
                                        }
                                    case '\f':
                                        str2 = str2;
                                        if (!str2.equals(A08(154, 8, 80))) {
                                            c4 = '\r';
                                            break;
                                        } else {
                                            c4 = 16;
                                            break;
                                        }
                                    case '\r':
                                        str2 = str2;
                                        if (!str2.equals(A08(1284, 11, 111))) {
                                            c4 = 14;
                                            break;
                                        } else {
                                            c4 = 16;
                                            break;
                                        }
                                    case 14:
                                        str2 = str2;
                                        if (!str2.equals(A08(1033, 10, 79))) {
                                            c4 = 15;
                                            break;
                                        } else {
                                            c4 = 16;
                                            break;
                                        }
                                    case 15:
                                        str2 = str2;
                                        if (!str2.equals(A08(10, 17, 35))) {
                                            c4 = 18;
                                            break;
                                        } else {
                                            c4 = 16;
                                            break;
                                        }
                                    case 16:
                                        z = true;
                                        c4 = 17;
                                        break;
                                    case 17:
                                        return z;
                                    case 18:
                                        z = false;
                                        c4 = 17;
                                        break;
                                }
                            }
                        }

                        private String[] A0D(String str2) {
                            String[] strArrA0o = null;
                            String strTrim = str2.trim();
                            char c4 = strTrim.isEmpty() ? (char) 2 : (char) 4;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        strArrA0o = new String[0];
                                        c4 = 3;
                                        break;
                                    case 3:
                                        return strArrA0o;
                                    case 4:
                                        strTrim = strTrim;
                                        strArrA0o = C0560Iy.A0o(strTrim, A08(934, 3, 51));
                                        c4 = 3;
                                        break;
                                }
                            }
                        }
                    };
                case 31:
                    return new BZ() { // from class: com.facebook.ads.redexgen.X.2l
                        public static byte[] A01;
                        public static final Pattern A02;
                        public final StringBuilder A00;

                        public static String A02(int i, int i2, int i3) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                            int i4 = 0;
                            char c4 = 2;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        bArrCopyOfRange = bArrCopyOfRange;
                                        if (i4 >= bArrCopyOfRange.length) {
                                            c4 = 4;
                                            break;
                                        } else {
                                            c4 = 3;
                                            break;
                                        }
                                    case 3:
                                        bArrCopyOfRange = bArrCopyOfRange;
                                        bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 104);
                                        i4++;
                                        c4 = 2;
                                        break;
                                    case 4:
                                        return new String(bArrCopyOfRange);
                                }
                            }
                        }

                        public static void A03() {
                            A01 = new byte[]{-26, -2, -4, 3, 3, -4, 1, -6, -77, -4, 1, 9, -12, -1, -4, -9, -77, -4, 1, -9, -8, 11, -51, -77, 13, 36, -37, -39, -39, -16, -21, -39, 13, 21, -36, -38, -21, -38, -16, -39, 13, 21, -36, -38, -21, -39, 13, 21, -36, -38, -35, -39, 13, 21, -36, -38, -38, 13, 36, -37, -34, -34, -17, 13, 36, -37, -39, -39, -16, -21, -39, 13, 21, -36, -38, -21, -38, -16, -39, 13, 21, -36, -38, -21, -39, 13, 21, -36, -38, -35, -39, 13, 21, -36, -38, -38, -16, 13, 36, -37, -13, 11, 9, 16, 16, 9, 14, 7, -64, 9, 14, 22, 1, 12, 9, 4, -64, 20, 9, 13, 9, 14, 7, -38, -64, 5, 39, 20, 36, 27, 34, -10, 23, 21, 33, 22, 23, 36, -37, 1, 17, -35, -20, 5, -4, 15, 7, -4, -6, 11, -4, -5, -73, -4, 5, -5};
                        }

                        static {
                            A03();
                            A02 = Pattern.compile(A02(24, 76, 73));
                        }

                        {
                            A02(125, 13, 74);
                            this.A00 = new StringBuilder();
                        }

                        public static long A00(Matcher matcher, int i) {
                            return 1000 * ((Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000) + (Long.parseLong(matcher.group(i + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i + 3)) * 1000) + Long.parseLong(matcher.group(i + 4)));
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // com.facebook.ads.redexgen.X.BZ
                        /* renamed from: A01, reason: merged with bridge method [inline-methods] */
                        public final C1064bA A0b(byte[] bArr, int i, boolean z) throws NumberFormatException {
                            C01682l c01682l = this;
                            boolean z2 = false;
                            int i2 = 0;
                            Matcher matcher = null;
                            String strA0P = null;
                            String strA0P2 = null;
                            String strA0P3 = null;
                            String strA02 = A02(125, 13, 74);
                            ArrayList arrayList = new ArrayList();
                            IY iy = new IY();
                            C0544Ii c0544Ii = new C0544Ii(bArr, i);
                            char c4 = 2;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        c0544Ii = c0544Ii;
                                        strA0P = c0544Ii.A0P();
                                        if (strA0P == null) {
                                            c4 = '\b';
                                            break;
                                        } else {
                                            c4 = 3;
                                            break;
                                        }
                                    case 3:
                                        strA0P = strA0P;
                                        if (strA0P.length() != 0) {
                                            c4 = 4;
                                            break;
                                        } else {
                                            c4 = 2;
                                            break;
                                        }
                                    case 4:
                                        try {
                                            strA0P = strA0P;
                                            Integer.parseInt(strA0P);
                                            z2 = false;
                                            strA0P3 = c0544Ii.A0P();
                                            if (strA0P3 != null) {
                                                c4 = '\t';
                                                break;
                                            } else {
                                                c4 = 7;
                                                break;
                                            }
                                        } catch (NumberFormatException unused) {
                                            Log.w(strA02, A02(0, 24, 43) + strA0P);
                                            c4 = 2;
                                            break;
                                        }
                                    case 7:
                                        strA02 = strA02;
                                        Log.w(strA02, A02(142, 14, 47));
                                        c4 = '\b';
                                        break;
                                    case '\b':
                                        ArrayList arrayList2 = arrayList;
                                        GX[] gxArr = new GX[arrayList2.size()];
                                        arrayList2.toArray(gxArr);
                                        return new C1064bA(gxArr, iy.A05());
                                    case '\t':
                                        strA0P3 = strA0P3;
                                        matcher = A02.matcher(strA0P3);
                                        if (!matcher.matches()) {
                                            c4 = 19;
                                            break;
                                        } else {
                                            c4 = '\n';
                                            break;
                                        }
                                    case '\n':
                                        iy = iy;
                                        matcher = matcher;
                                        iy.A04(A00(matcher, 1));
                                        i2 = 6;
                                        if (!TextUtils.isEmpty(matcher.group(6))) {
                                            c4 = 11;
                                            break;
                                        } else {
                                            c4 = '\f';
                                            break;
                                        }
                                    case 11:
                                        iy = iy;
                                        matcher = matcher;
                                        z2 = true;
                                        iy.A04(A00(matcher, i2));
                                        c4 = '\f';
                                        break;
                                    case '\f':
                                        c01682l = c01682l;
                                        c01682l.A00.setLength(0);
                                        c4 = '\r';
                                        break;
                                    case '\r':
                                        c0544Ii = c0544Ii;
                                        strA0P2 = c0544Ii.A0P();
                                        if (!TextUtils.isEmpty(strA0P2)) {
                                            c4 = 14;
                                            break;
                                        } else {
                                            c4 = 17;
                                            break;
                                        }
                                    case 14:
                                        c01682l = c01682l;
                                        if (c01682l.A00.length() <= 0) {
                                            c4 = 16;
                                            break;
                                        } else {
                                            c4 = 15;
                                            break;
                                        }
                                    case 15:
                                        c01682l = c01682l;
                                        c01682l.A00.append(A02(138, 4, 55));
                                        c4 = 16;
                                        break;
                                    case 16:
                                        c01682l = c01682l;
                                        strA0P2 = strA0P2;
                                        c01682l.A00.append(strA0P2.trim());
                                        c4 = '\r';
                                        break;
                                    case 17:
                                        c01682l = c01682l;
                                        arrayList = arrayList;
                                        arrayList.add(new GX(Html.fromHtml(c01682l.A00.toString())));
                                        if (!z2) {
                                            c4 = 2;
                                            break;
                                        } else {
                                            c4 = 18;
                                            break;
                                        }
                                    case 18:
                                        arrayList = arrayList;
                                        arrayList.add(null);
                                        c4 = 2;
                                        break;
                                    case 19:
                                        strA02 = strA02;
                                        strA0P3 = strA0P3;
                                        Log.w(strA02, A02(100, 25, 56) + strA0P3);
                                        c4 = 2;
                                        break;
                                }
                            }
                        }
                    };
                case ' ':
                    final List<byte[]> list = format.A0P;
                    return new BZ(list) { // from class: com.facebook.ads.redexgen.X.2j
                        public static byte[] A07;
                        public static final int A08;
                        public static final int A09;
                        public float A00;
                        public int A01;
                        public int A02;
                        public int A03;
                        public String A04;
                        public boolean A05;
                        public final C0544Ii A06;

                        public static String A00(int i, int i2, int i3) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
                            int i4 = 0;
                            char c4 = 2;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        bArrCopyOfRange = bArrCopyOfRange;
                                        if (i4 >= bArrCopyOfRange.length) {
                                            c4 = 4;
                                            break;
                                        } else {
                                            c4 = 3;
                                            break;
                                        }
                                    case 3:
                                        bArrCopyOfRange = bArrCopyOfRange;
                                        bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 121);
                                        i4++;
                                        c4 = 2;
                                        break;
                                    case 4:
                                        return new String(bArrCopyOfRange);
                                }
                            }
                        }

                        public static void A02() {
                            A07 = new byte[]{64, 65, 70, 57, 74, 73, 59, 34, 38, 43, 39, 21, 34, 43, -31, 5, -64, -12, -47, -14, -16, -4, -15, -14, -1, -33, -8, -17, 2, -6, -17, -19, -2, -17, -18, -86, -3, -1, -20, -2, -13, -2, -10, -17, -86, -16, -7, -4, -9, -21, -2, -72, -14, -15, -29, -54, -43, 104, 86, 99, 104, 34, 104, 90, 103, 94, 91, 24, 42, 55, 46, 43, 89, 75, 88, 79, 76};
                        }

                        static {
                            A02();
                            A08 = C0560Iy.A08(A00(0, 4, 84));
                            A09 = C0560Iy.A08(A00(10, 4, 58));
                        }

                        {
                            super(A00(14, 11, 20));
                            this.A06 = new C0544Ii();
                            A07(list);
                        }

                        public static String A01(C0544Ii c0544Ii) throws GZ {
                            int iA0I = 0;
                            char cA02 = 0;
                            boolean z = false;
                            char c4 = c0544Ii.A04() >= 2 ? (char) 2 : (char) 5;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        z = true;
                                        c4 = 3;
                                        break;
                                    case 3:
                                        c0544Ii = c0544Ii;
                                        A08(z);
                                        iA0I = c0544Ii.A0I();
                                        if (iA0I != 0) {
                                            c4 = 6;
                                            break;
                                        } else {
                                            c4 = 4;
                                            break;
                                        }
                                    case 4:
                                        return A00(0, 0, 85);
                                    case 5:
                                        z = false;
                                        c4 = 3;
                                        break;
                                    case 6:
                                        c0544Ii = c0544Ii;
                                        if (c0544Ii.A04() < 2) {
                                            c4 = '\n';
                                            break;
                                        } else {
                                            c4 = 7;
                                            break;
                                        }
                                    case 7:
                                        c0544Ii = c0544Ii;
                                        cA02 = c0544Ii.A02();
                                        if (cA02 == 65279) {
                                            c4 = '\t';
                                            break;
                                        } else {
                                            c4 = '\b';
                                            break;
                                        }
                                    case '\b':
                                        if (cA02 != 65534) {
                                            c4 = '\n';
                                            break;
                                        } else {
                                            c4 = '\t';
                                            break;
                                        }
                                    case '\t':
                                        return c0544Ii.A0T(iA0I, Charset.forName(A00(4, 6, k.AppCompatTheme_windowNoTitle)));
                                    case '\n':
                                        return c0544Ii.A0T(iA0I, Charset.forName(A00(52, 5, 36)));
                                }
                            }
                        }

                        public static void A03(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
                            if (i != i2) {
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(((i & 255) << 24) | (i >>> 8)), i3, i4, i5 | 33);
                            }
                        }

                        public static void A04(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
                            int i6 = 0;
                            int i7 = 0;
                            boolean z = false;
                            boolean z2 = false;
                            char c4 = i != i2 ? (char) 2 : (char) 16;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        i7 = i5 | 33;
                                        i6 = 1;
                                        if ((i & 1) == 0) {
                                            c4 = 22;
                                            break;
                                        } else {
                                            c4 = 3;
                                            break;
                                        }
                                    case 3:
                                        z2 = true;
                                        c4 = 4;
                                        break;
                                    case 4:
                                        if ((i & 2) == 0) {
                                            c4 = 21;
                                            break;
                                        } else {
                                            c4 = 5;
                                            break;
                                        }
                                    case 5:
                                        z = true;
                                        c4 = 6;
                                        break;
                                    case 6:
                                        if (!z2) {
                                            c4 = 19;
                                            break;
                                        } else {
                                            c4 = 7;
                                            break;
                                        }
                                    case 7:
                                        if (!z) {
                                            c4 = 18;
                                            break;
                                        } else {
                                            c4 = '\b';
                                            break;
                                        }
                                    case '\b':
                                        spannableStringBuilder = spannableStringBuilder;
                                        spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i7);
                                        c4 = '\t';
                                        break;
                                    case '\t':
                                        if ((i & 4) == 0) {
                                            c4 = 17;
                                            break;
                                        } else {
                                            c4 = '\n';
                                            break;
                                        }
                                    case '\n':
                                        if (i6 == 0) {
                                            c4 = '\f';
                                            break;
                                        } else {
                                            c4 = 11;
                                            break;
                                        }
                                    case 11:
                                        spannableStringBuilder = spannableStringBuilder;
                                        spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i7);
                                        c4 = '\f';
                                        break;
                                    case '\f':
                                        if (i6 != 0) {
                                            c4 = 16;
                                            break;
                                        } else {
                                            c4 = '\r';
                                            break;
                                        }
                                    case '\r':
                                        if (!z2) {
                                            c4 = 14;
                                            break;
                                        } else {
                                            c4 = 16;
                                            break;
                                        }
                                    case 14:
                                        if (!z) {
                                            c4 = 15;
                                            break;
                                        } else {
                                            c4 = 16;
                                            break;
                                        }
                                    case 15:
                                        spannableStringBuilder = spannableStringBuilder;
                                        spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i7);
                                        c4 = 16;
                                        break;
                                    case 16:
                                        return;
                                    case 17:
                                        i6 = 0;
                                        c4 = '\n';
                                        break;
                                    case 18:
                                        spannableStringBuilder = spannableStringBuilder;
                                        spannableStringBuilder.setSpan(new StyleSpan(i6), i3, i4, i7);
                                        c4 = '\t';
                                        break;
                                    case 19:
                                        if (!z) {
                                            c4 = '\t';
                                            break;
                                        } else {
                                            c4 = 20;
                                            break;
                                        }
                                    case 20:
                                        spannableStringBuilder = spannableStringBuilder;
                                        spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i7);
                                        c4 = '\t';
                                        break;
                                    case 21:
                                        z = false;
                                        c4 = 6;
                                        break;
                                    case 22:
                                        z2 = false;
                                        c4 = 4;
                                        break;
                                }
                            }
                        }

                        public static void A05(SpannableStringBuilder spannableStringBuilder, String str2, String str3, int i, int i2, int i3) {
                            if (str2 != str3) {
                                spannableStringBuilder.setSpan(new TypefaceSpan(str2), i, i2, i3 | 33);
                            }
                        }

                        private void A06(C0544Ii c0544Ii, SpannableStringBuilder spannableStringBuilder) throws GZ {
                            boolean z = false;
                            char c4 = c0544Ii.A04() >= 12 ? (char) 2 : (char) 4;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        z = true;
                                        c4 = 3;
                                        break;
                                    case 3:
                                        C01662j c01662j = this;
                                        C0544Ii c0544Ii2 = c0544Ii;
                                        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                                        A08(z);
                                        int iA0I = c0544Ii2.A0I();
                                        int iA0I2 = c0544Ii2.A0I();
                                        c0544Ii2.A0Z(2);
                                        int iA0E = c0544Ii2.A0E();
                                        c0544Ii2.A0Z(1);
                                        int iA08 = c0544Ii2.A08();
                                        A04(spannableStringBuilder2, iA0E, c01662j.A03, iA0I, iA0I2, 0);
                                        A03(spannableStringBuilder2, iA08, c01662j.A02, iA0I, iA0I2, 0);
                                        return;
                                    case 4:
                                        z = false;
                                        c4 = 3;
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        private void A07(List<byte[]> list2) {
                            C01662j c01662j = this;
                            byte[] bArr = null;
                            String strA00 = A00(57, 10, k.AppCompatTheme_windowNoTitle);
                            boolean z = false;
                            char c4 = list2 != null ? (char) 2 : '\r';
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        list2 = list2;
                                        if (list2.size() != 1) {
                                            c4 = '\r';
                                            break;
                                        } else {
                                            c4 = 3;
                                            break;
                                        }
                                    case 3:
                                        list2 = list2;
                                        z = false;
                                        z = false;
                                        if (list2.get(0).length == 48) {
                                            c4 = 5;
                                            break;
                                        } else {
                                            c4 = 4;
                                            break;
                                        }
                                    case 4:
                                        list2 = list2;
                                        if (list2.get(z ? 1 : 0).length != 53) {
                                            c4 = '\r';
                                            break;
                                        } else {
                                            c4 = 5;
                                            break;
                                        }
                                    case 5:
                                        c01662j = c01662j;
                                        list2 = list2;
                                        bArr = list2.get(z ? 1 : 0);
                                        c01662j.A03 = bArr[24];
                                        c01662j.A02 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
                                        if (!A00(67, 5, 76).equals(C0560Iy.A0U(bArr, 43, bArr.length - 43))) {
                                            c4 = 7;
                                            break;
                                        } else {
                                            c4 = 6;
                                            break;
                                        }
                                    case 6:
                                        strA00 = A00(72, 5, 109);
                                        c4 = 7;
                                        break;
                                    case 7:
                                        c01662j = c01662j;
                                        strA00 = strA00;
                                        bArr = bArr;
                                        c01662j.A04 = strA00;
                                        c01662j.A01 = bArr[25] * 20;
                                        if ((bArr[z ? 1 : 0] & 32) == 0) {
                                            c4 = '\t';
                                            break;
                                        } else {
                                            c4 = '\b';
                                            break;
                                        }
                                    case '\b':
                                        z = true;
                                        c4 = '\t';
                                        break;
                                    case '\t':
                                        c01662j = c01662j;
                                        c01662j.A05 = z;
                                        if (!c01662j.A05) {
                                            c4 = '\f';
                                            break;
                                        } else {
                                            c4 = '\n';
                                            break;
                                        }
                                    case '\n':
                                        c01662j = c01662j;
                                        bArr = bArr;
                                        c01662j.A00 = (((bArr[10] & 255) << 8) | (bArr[11] & 255)) / c01662j.A01;
                                        c01662j.A00 = C0560Iy.A00(c01662j.A00, 0.0f, 0.95f);
                                        c4 = 11;
                                        break;
                                    case 11:
                                        return;
                                    case '\f':
                                        c01662j = c01662j;
                                        c01662j.A00 = 0.85f;
                                        c4 = 11;
                                        break;
                                    case '\r':
                                        c01662j = c01662j;
                                        strA00 = strA00;
                                        c01662j.A03 = z ? 1 : 0;
                                        c01662j.A02 = -1;
                                        c01662j.A04 = strA00;
                                        c01662j.A05 = z;
                                        c01662j.A00 = 0.85f;
                                        c4 = 11;
                                        break;
                                }
                            }
                        }

                        public static void A08(boolean z) throws GZ {
                            if (z) {
                            } else {
                                throw new GZ(A00(25, 27, 17));
                            }
                        }

                        @Override // com.facebook.ads.redexgen.X.BZ
                        public final GY A0b(byte[] bArr, int i, boolean z) throws GZ {
                            this.A06.A0b(bArr, i);
                            String strA01 = A01(this.A06);
                            if (strA01.isEmpty()) {
                                return C1066bC.A01;
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA01);
                            A04(spannableStringBuilder, this.A03, 0, 0, spannableStringBuilder.length(), 16711680);
                            A03(spannableStringBuilder, this.A02, -1, 0, spannableStringBuilder.length(), 16711680);
                            A05(spannableStringBuilder, this.A04, A00(57, 10, k.AppCompatTheme_windowNoTitle), 0, spannableStringBuilder.length(), 16711680);
                            float verticalPlacement = this.A00;
                            while (this.A06.A04() >= 8) {
                                int iA06 = this.A06.A06();
                                int iA08 = this.A06.A08();
                                int iA082 = this.A06.A08();
                                int position = A08;
                                if (iA082 == position) {
                                    int position2 = this.A06.A04();
                                    A08(position2 >= 2);
                                    int atomSize = this.A06.A0I();
                                    for (int atomType = 0; atomType < atomSize; atomType++) {
                                        A06(this.A06, spannableStringBuilder);
                                    }
                                } else {
                                    int styleRecordCount = A09;
                                    if (iA082 == styleRecordCount && this.A05) {
                                        int styleRecordCount2 = this.A06.A04();
                                        A08(styleRecordCount2 >= 2);
                                        int styleRecordCount3 = this.A06.A0I();
                                        float f = styleRecordCount3;
                                        int requestedVerticalPlacement = this.A01;
                                        verticalPlacement = C0560Iy.A00(f / requestedVerticalPlacement, 0.0f, 0.95f);
                                    }
                                }
                                this.A06.A0Y(iA06 + iA08);
                            }
                            return new C1066bC(new GX(spannableStringBuilder, null, verticalPlacement, 0, 0, Float.MIN_VALUE, RecyclerView.UNDEFINED_DURATION, Float.MIN_VALUE));
                        }
                    };
                case '!':
                    Format format2 = format;
                    return new C01752s(format2.A0O, format2.A03);
                case '\"':
                    final int i = format.A03;
                    return new BO(i) { // from class: com.facebook.ads.redexgen.X.2r
                        public static byte[] A09;
                        public int A00;
                        public C0491Gf A01;
                        public C0492Gg A02;
                        public List<GX> A03;
                        public List<GX> A04;
                        public final int A05;
                        public final C0491Gf[] A08;
                        public final C0544Ii A07 = new C0544Ii();
                        public final C0543Ih A06 = new C0543Ih();

                        static {
                            A09();
                        }

                        public static String A00(int i2, int i3, int i4) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
                            int i5 = 0;
                            char c4 = 2;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        bArrCopyOfRange = bArrCopyOfRange;
                                        if (i5 >= bArrCopyOfRange.length) {
                                            c4 = 4;
                                            break;
                                        } else {
                                            c4 = 3;
                                            break;
                                        }
                                    case 3:
                                        bArrCopyOfRange = bArrCopyOfRange;
                                        bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 113);
                                        i5++;
                                        c4 = 2;
                                        break;
                                    case 4:
                                        return new String(bArrCopyOfRange);
                                }
                            }
                        }

                        public static void A09() {
                            A09 = new byte[]{31, 68, 76, 55, 66, 63, 58, -10, 29, 8, -10, 57, 62, 55, 72, 55, 57, 74, 59, 72, 16, -10, -28, 20, 22, -29, 3, -16, 1, 3, 11, 5, 20, -64, 5, 14, 4, 5, 4, -64, 16, 18, 5, 13, 1, 20, 21, 18, 5, 12, 25, -37, -64, 19, 9, 26, 5, -64, 9, 19, -64, -101, -83, -110, -37, -39, -32, -31, -28, -37, -32, -39, -110, -30, -45, -43, -35, -41, -26, -9, 28, 36, 15, 26, 23, 18, -50, -11, -31, -50, 17, 22, 15, 32, 15, 17, 34, 19, 32, -24, -50, 11, 48, 56, 35, 46, 43, 38, -30, 5, -14, -30, 37, 49, 47, 47, 35, 48, 38, -4, -30, 12, 49, 57, 36, 47, 44, 39, -29, 40, 59, 55, 40, 49, 39, 40, 39, -29, 38, 50, 48, 48, 36, 49, 39, -3, -29, 54, 40, 53, 57, 44, 38, 40, 17, 56, 48, 37, 40, 53, -29, 44, 54, -29, 49, 50, 49, -16, 61, 40, 53, 50, -29, -21, 3, -9, 57, 76, 75, -9, 58, 76, 73, 73, 60, 69, 75, -9, 64, 69, 59, 60, 79, -9, 64, 74, -9, -54, -63, 24, 9, 6, 15, -63, 3, 13, 16, 4, 12, -12, 10, 27, 6, -63, 10, 20, -63, -47, -25, 12, 20, -1, 10, 7, 2, -66, -31, -49, -66, 1, 13, 11, 11, -1, 12, 2, -40, -66, -27, 7, 3, -39, -46, -38, -26, 7, 5, 17, 6, 7, 20, -34, 16, 13, 13, 0, 9, 15, 7, 20, -69, 16, 9, 14, 16, 11, 11, 10, 13, 15, 0, -1, -69, -34, -22, -24, -24, -36, -23, -33, -6, -21, -52, -47, -69, -34, 10, 8, 8, -4, 9, -1, -43, -69, 14, 55, 44, 56, 62, 55, 61, 46, 59, 46, 45, -23, 13, 29, 31, 12, 12, 40, 25, 10, 12, 20, 14, 29, 40, 13, 10, 29, 10, -23, 43, 46, 47, 56, 59, 46, -23, 13, 29, 31, 12, 12, 40, 25, 10, 12, 20, 14, 29, 40, 28, 29, 10, 27, 29, -93, -85, -10, -24, -12, -8, -24, -15, -26, -24, -93, -15, -8, -16, -27, -24, -11, -93, -39, 11, 8, 8, -5, 4, 10, 2, 15, -74, 11, 4, 9, 11, 6, 6, 5, 8, 10, -5, -6, -74, -39, -27, -29, -29, -41, -28, -38, -11, -37, -18, -22, -57, -74, -39, 5, 3, 3, -9, 4, -6, -48, -74, 15, 52, 60, 39, 50, 47, 42, -26, 40, 39, 57, 43, -26, 41, 53, 51, 51, 39, 52, 42, 0, -26};
                        }

                        {
                            this.A05 = i == -1 ? 1 : i;
                            this.A08 = new C0491Gf[8];
                            for (int i2 = 0; i2 < 8; i2++) {
                                this.A08[i2] = new C0491Gf();
                            }
                            this.A01 = this.A08[0];
                            A08();
                        }

                        private List<GX> A01() {
                            C01742r c01742r = this;
                            ArrayList arrayList = new ArrayList();
                            int i2 = 0;
                            int i3 = 2;
                            while (true) {
                                switch (i3) {
                                    case 2:
                                        if (i2 >= 8) {
                                            i3 = 7;
                                            break;
                                        } else {
                                            i3 = 3;
                                            break;
                                        }
                                    case 3:
                                        c01742r = c01742r;
                                        if (!c01742r.A08[i2].A0H()) {
                                            i3 = 4;
                                            break;
                                        } else {
                                            i3 = 6;
                                            break;
                                        }
                                    case 4:
                                        c01742r = c01742r;
                                        if (!c01742r.A08[i2].A0I()) {
                                            i3 = 6;
                                            break;
                                        } else {
                                            i3 = 5;
                                            break;
                                        }
                                    case 5:
                                        c01742r = c01742r;
                                        arrayList = arrayList;
                                        arrayList.add(c01742r.A08[i2].A05());
                                        i3 = 6;
                                        break;
                                    case 6:
                                        i2++;
                                        i3 = 2;
                                        break;
                                    case 7:
                                        ArrayList arrayList2 = arrayList;
                                        Collections.sort(arrayList2);
                                        return Collections.unmodifiableList(arrayList2);
                                }
                            }
                        }

                        private void A02() {
                            if (this.A02 == null) {
                                return;
                            }
                            A07();
                            this.A02 = null;
                        }

                        private void A03() {
                            int iA04 = this.A06.A04(4);
                            int iA042 = this.A06.A04(2);
                            int iA043 = this.A06.A04(2);
                            boolean zA0F = this.A06.A0F();
                            boolean underlineToggle = this.A06.A0F();
                            this.A01.A0C(iA04, iA042, iA043, zA0F, underlineToggle, this.A06.A04(3), this.A06.A04(3));
                        }

                        private void A04() {
                            int foregroundG = this.A06.A04(2);
                            int iA04 = this.A06.A04(2);
                            int iA042 = this.A06.A04(2);
                            int foregroundB = this.A06.A04(2);
                            int backgroundColor = C0491Gf.A01(iA04, iA042, foregroundB, foregroundG);
                            int foregroundG2 = this.A06.A04(2);
                            int foregroundColor = this.A06.A04(2);
                            int backgroundR = this.A06.A04(2);
                            int backgroundG = this.A06.A04(2);
                            int foregroundG3 = C0491Gf.A01(foregroundColor, backgroundR, backgroundG, foregroundG2);
                            this.A06.A08(2);
                            int foregroundColor2 = this.A06.A04(2);
                            int backgroundR2 = this.A06.A04(2);
                            int edgeR = this.A06.A04(2);
                            this.A01.A0B(backgroundColor, foregroundG3, C0491Gf.A00(foregroundColor2, backgroundR2, edgeR));
                        }

                        private void A05() {
                            this.A06.A08(4);
                            int iA04 = this.A06.A04(4);
                            this.A06.A08(2);
                            this.A01.A0A(iA04, this.A06.A04(6));
                        }

                        private void A06() {
                            int justification = 0;
                            int iA04 = this.A06.A04(2);
                            int iA042 = this.A06.A04(2);
                            int iA043 = this.A06.A04(2);
                            int fillG = this.A06.A04(2);
                            int iA01 = C0491Gf.A01(iA042, iA043, fillG, iA04);
                            int iA044 = this.A06.A04(2);
                            int borderG = this.A06.A04(2);
                            int borderR = this.A06.A04(2);
                            int borderType = this.A06.A04(2);
                            int iA00 = C0491Gf.A00(borderG, borderR, borderType);
                            int borderColor = this.A06.A0F() ? 2 : 4;
                            while (true) {
                                switch (borderColor) {
                                    case 2:
                                        justification = iA044 | 4;
                                        borderColor = 3;
                                        break;
                                    case 3:
                                        C01742r c01742r = this;
                                        boolean zA0F = c01742r.A06.A0F();
                                        int iA045 = c01742r.A06.A04(2);
                                        int iA046 = c01742r.A06.A04(2);
                                        int iA047 = c01742r.A06.A04(2);
                                        c01742r.A06.A08(8);
                                        c01742r.A01.A0D(iA01, iA00, zA0F, justification, iA045, iA046, iA047);
                                        return;
                                    case 4:
                                        justification = iA044;
                                        borderColor = 3;
                                        break;
                                }
                            }
                        }

                        private void A07() {
                            C01742r c01742r = this;
                            int blockSize = 0;
                            int i2 = 0;
                            int i3 = 0;
                            int command = 0;
                            int i4 = 0;
                            int iA04 = 0;
                            int i5 = 0;
                            int iA042 = 0;
                            boolean z = false;
                            int iA043 = 0;
                            int i6 = c01742r.A02.A00;
                            int i7 = (c01742r.A02.A01 * 2) - 1;
                            String strA00 = A00(238, 13, 49);
                            char c4 = i6 != i7 ? (char) 2 : (char) 3;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        C01742r c01742r2 = c01742r;
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(A00(22, 39, 47));
                                        sb.append((c01742r2.A02.A01 * 2) - 1);
                                        sb.append(A00(174, 23, 102));
                                        sb.append(c01742r2.A02.A00);
                                        sb.append(A00(349, 18, 18));
                                        sb.append(c01742r2.A02.A02);
                                        sb.append(A00(61, 18, 1));
                                        Log.w(strA00, sb.toString());
                                        return;
                                    case 3:
                                        c01742r = c01742r;
                                        c01742r.A06.A0C(c01742r.A02.A03, c01742r.A02.A00);
                                        iA042 = c01742r.A06.A04(3);
                                        iA043 = c01742r.A06.A04(5);
                                        if (iA042 != 7) {
                                            c4 = 5;
                                            break;
                                        } else {
                                            c4 = 4;
                                            break;
                                        }
                                    case 4:
                                        c01742r = c01742r;
                                        c01742r.A06.A08(2);
                                        iA042 += c01742r.A06.A04(6);
                                        c4 = 5;
                                        break;
                                    case 5:
                                        if (iA043 != 0) {
                                            c4 = '\t';
                                            break;
                                        } else {
                                            c4 = 6;
                                            break;
                                        }
                                    case 6:
                                        if (iA042 == 0) {
                                            c4 = '\b';
                                            break;
                                        } else {
                                            c4 = 7;
                                            break;
                                        }
                                    case 7:
                                        strA00 = strA00;
                                        Log.w(strA00, A00(147, 27, 82) + iA042 + A00(197, 21, 48));
                                        c4 = '\b';
                                        break;
                                    case '\b':
                                        return;
                                    case '\t':
                                        c01742r = c01742r;
                                        if (iA042 == c01742r.A05) {
                                            c4 = 11;
                                            break;
                                        } else {
                                            c4 = '\n';
                                            break;
                                        }
                                    case '\n':
                                        return;
                                    case 11:
                                        z = false;
                                        c4 = '\f';
                                        break;
                                    case '\f':
                                        c01742r = c01742r;
                                        if (c01742r.A06.A01() <= 0) {
                                            c4 = ' ';
                                            break;
                                        } else {
                                            c4 = '\r';
                                            break;
                                        }
                                    case '\r':
                                        c01742r = c01742r;
                                        i2 = 8;
                                        iA04 = c01742r.A06.A04(8);
                                        i3 = 255;
                                        i5 = 159;
                                        command = 127;
                                        i4 = 31;
                                        if (iA04 == 16) {
                                            c4 = 23;
                                            break;
                                        } else {
                                            c4 = 14;
                                            break;
                                        }
                                    case 14:
                                        if (iA04 > i4) {
                                            c4 = 16;
                                            break;
                                        } else {
                                            c4 = 15;
                                            break;
                                        }
                                    case 15:
                                        c01742r = c01742r;
                                        c01742r.A0A(iA04);
                                        c4 = '\f';
                                        break;
                                    case 16:
                                        if (iA04 > command) {
                                            c4 = 18;
                                            break;
                                        } else {
                                            c4 = 17;
                                            break;
                                        }
                                    case 17:
                                        c01742r = c01742r;
                                        c01742r.A0F(iA04);
                                        z = true;
                                        c4 = '\f';
                                        break;
                                    case 18:
                                        if (iA04 > i5) {
                                            c4 = 20;
                                            break;
                                        } else {
                                            c4 = 19;
                                            break;
                                        }
                                    case 19:
                                        c01742r = c01742r;
                                        c01742r.A0B(iA04);
                                        z = true;
                                        c4 = '\f';
                                        break;
                                    case 20:
                                        if (iA04 > i3) {
                                            c4 = 22;
                                            break;
                                        } else {
                                            c4 = 21;
                                            break;
                                        }
                                    case 21:
                                        c01742r = c01742r;
                                        c01742r.A0G(iA04);
                                        z = true;
                                        c4 = '\f';
                                        break;
                                    case 22:
                                        strA00 = strA00;
                                        Log.w(strA00, A00(411, 22, 85) + iA04);
                                        c4 = '\f';
                                        break;
                                    case 23:
                                        c01742r = c01742r;
                                        blockSize = c01742r.A06.A04(i2);
                                        if (blockSize > i4) {
                                            c4 = 25;
                                            break;
                                        } else {
                                            c4 = 24;
                                            break;
                                        }
                                    case 24:
                                        c01742r = c01742r;
                                        c01742r.A0C(blockSize);
                                        c4 = '\f';
                                        break;
                                    case 25:
                                        if (blockSize > command) {
                                            c4 = 27;
                                            break;
                                        } else {
                                            c4 = 26;
                                            break;
                                        }
                                    case 26:
                                        c01742r = c01742r;
                                        c01742r.A0H(blockSize);
                                        z = true;
                                        c4 = '\f';
                                        break;
                                    case 27:
                                        if (blockSize > i5) {
                                            c4 = 29;
                                            break;
                                        } else {
                                            c4 = 28;
                                            break;
                                        }
                                    case 28:
                                        c01742r = c01742r;
                                        c01742r.A0D(blockSize);
                                        c4 = '\f';
                                        break;
                                    case 29:
                                        if (blockSize > i3) {
                                            c4 = 31;
                                            break;
                                        } else {
                                            c4 = 30;
                                            break;
                                        }
                                    case 30:
                                        c01742r = c01742r;
                                        c01742r.A0I(blockSize);
                                        z = true;
                                        c4 = '\f';
                                        break;
                                    case 31:
                                        strA00 = strA00;
                                        Log.w(strA00, A00(k.AppCompatTheme_windowFixedWidthMinor, 26, 82) + blockSize);
                                        c4 = '\f';
                                        break;
                                    case ' ':
                                        if (!z) {
                                            c4 = '\"';
                                            break;
                                        } else {
                                            c4 = '!';
                                            break;
                                        }
                                    case '!':
                                        c01742r = c01742r;
                                        c01742r.A03 = c01742r.A01();
                                        c4 = '\"';
                                        break;
                                    case '\"':
                                        return;
                                }
                            }
                        }

                        private void A08() {
                            C01742r c01742r = this;
                            int i2 = 0;
                            char c4 = 2;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        if (i2 >= 8) {
                                            c4 = 4;
                                            break;
                                        } else {
                                            c4 = 3;
                                            break;
                                        }
                                    case 3:
                                        c01742r = c01742r;
                                        c01742r.A08[i2].A08();
                                        i2++;
                                        c4 = 2;
                                        break;
                                    case 4:
                                        return;
                                }
                            }
                        }

                        private void A0A(int i2) {
                            C01742r c01742r = this;
                            int i3 = 0;
                            String strA00 = null;
                            char c4 = i2 != 0 ? (char) 2 : '\b';
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        if (i2 == 3) {
                                            c4 = 16;
                                            break;
                                        } else {
                                            c4 = 3;
                                            break;
                                        }
                                    case 3:
                                        i3 = 8;
                                        if (i2 == 8) {
                                            c4 = 15;
                                            break;
                                        } else {
                                            c4 = 4;
                                            break;
                                        }
                                    case 4:
                                        switch (i2) {
                                            case 12:
                                                c4 = '\r';
                                                break;
                                            case 13:
                                                c4 = 14;
                                                break;
                                            case 14:
                                                c4 = '\b';
                                                break;
                                            default:
                                                c4 = 5;
                                                break;
                                        }
                                    case 5:
                                        strA00 = A00(238, 13, 49);
                                        if (i2 < 17) {
                                            c4 = '\t';
                                            break;
                                        } else {
                                            c4 = 6;
                                            break;
                                        }
                                    case 6:
                                        if (i2 > 23) {
                                            c4 = '\t';
                                            break;
                                        } else {
                                            c4 = 7;
                                            break;
                                        }
                                    case 7:
                                        c01742r = c01742r;
                                        strA00 = strA00;
                                        Log.w(strA00, A00(367, 44, 37) + i2);
                                        c01742r.A06.A08(i3);
                                        c4 = '\b';
                                        break;
                                    case '\b':
                                        return;
                                    case '\t':
                                        if (i2 < 24) {
                                            c4 = '\f';
                                            break;
                                        } else {
                                            c4 = '\n';
                                            break;
                                        }
                                    case '\n':
                                        if (i2 > 31) {
                                            c4 = '\f';
                                            break;
                                        } else {
                                            c4 = 11;
                                            break;
                                        }
                                    case 11:
                                        c01742r = c01742r;
                                        strA00 = strA00;
                                        Log.w(strA00, A00(251, 43, 42) + i2);
                                        c01742r.A06.A08(16);
                                        c4 = '\b';
                                        break;
                                    case '\f':
                                        strA00 = strA00;
                                        Log.w(strA00, A00(101, 20, 81) + i2);
                                        c4 = '\b';
                                        break;
                                    case '\r':
                                        c01742r = c01742r;
                                        c01742r.A08();
                                        c4 = '\b';
                                        break;
                                    case 14:
                                        c01742r = c01742r;
                                        c01742r.A01.A09('\n');
                                        c4 = '\b';
                                        break;
                                    case 15:
                                        c01742r = c01742r;
                                        c01742r.A01.A06();
                                        c4 = '\b';
                                        break;
                                    case 16:
                                        c01742r = c01742r;
                                        c01742r.A03 = c01742r.A01();
                                        c4 = '\b';
                                        break;
                                }
                            }
                        }

                        private void A0B(int i2) {
                            char c4;
                            C01742r c01742r = this;
                            int i3 = 0;
                            int i4 = 0;
                            int i5 = 0;
                            int i6 = 0;
                            int i7 = 0;
                            int i8 = 0;
                            int i9 = 0;
                            switch (i2) {
                                case 128:
                                    c4 = 4;
                                    break;
                                case 129:
                                    c4 = 4;
                                    break;
                                case 130:
                                    c4 = 4;
                                    break;
                                case 131:
                                    c4 = 4;
                                    break;
                                case 132:
                                    c4 = 4;
                                    break;
                                case 133:
                                    c4 = 4;
                                    break;
                                case 134:
                                    c4 = 4;
                                    break;
                                case 135:
                                    c4 = 4;
                                    break;
                                case 136:
                                    c4 = 6;
                                    break;
                                case 137:
                                    c4 = 11;
                                    break;
                                case 138:
                                    c4 = 16;
                                    break;
                                case 139:
                                    c4 = 21;
                                    break;
                                case 140:
                                    c4 = 26;
                                    break;
                                case 141:
                                    c4 = 31;
                                    break;
                                case 142:
                                    c4 = 3;
                                    break;
                                case 143:
                                    c4 = ' ';
                                    break;
                                case 144:
                                    c4 = '!';
                                    break;
                                case 145:
                                    c4 = '$';
                                    break;
                                case 146:
                                    c4 = '\'';
                                    break;
                                case 147:
                                    c4 = 2;
                                    break;
                                case 148:
                                    c4 = 2;
                                    break;
                                case 149:
                                    c4 = 2;
                                    break;
                                case 150:
                                    c4 = 2;
                                    break;
                                case 151:
                                    c4 = '*';
                                    break;
                                case 152:
                                    c4 = '-';
                                    break;
                                case 153:
                                    c4 = '-';
                                    break;
                                case 154:
                                    c4 = '-';
                                    break;
                                case 155:
                                    c4 = '-';
                                    break;
                                case 156:
                                    c4 = '-';
                                    break;
                                case 157:
                                    c4 = '-';
                                    break;
                                case 158:
                                    c4 = '-';
                                    break;
                                case 159:
                                    c4 = '-';
                                    break;
                                default:
                                    c4 = 2;
                                    break;
                            }
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        Log.w(A00(238, 13, 49), A00(218, 20, 45) + i2);
                                        c4 = 3;
                                        break;
                                    case 3:
                                        return;
                                    case 4:
                                        c01742r = c01742r;
                                        i7 = i2 - 128;
                                        if (c01742r.A00 == i7) {
                                            c4 = 3;
                                            break;
                                        } else {
                                            c4 = 5;
                                            break;
                                        }
                                    case 5:
                                        c01742r = c01742r;
                                        c01742r.A00 = i7;
                                        C0491Gf cueBuilder = c01742r.A08[i7];
                                        c01742r.A01 = cueBuilder;
                                        c4 = 3;
                                        break;
                                    case 6:
                                        i8 = 1;
                                        c4 = 7;
                                        break;
                                    case 7:
                                        if (i8 > 8) {
                                            c4 = 3;
                                            break;
                                        } else {
                                            c4 = '\b';
                                            break;
                                        }
                                    case '\b':
                                        c01742r = c01742r;
                                        if (!c01742r.A06.A0F()) {
                                            c4 = '\n';
                                            break;
                                        } else {
                                            c4 = '\t';
                                            break;
                                        }
                                    case '\t':
                                        c01742r = c01742r;
                                        c01742r.A08[8 - i8].A07();
                                        c4 = '\n';
                                        break;
                                    case '\n':
                                        i8++;
                                        c4 = 7;
                                        break;
                                    case 11:
                                        i9 = 1;
                                        c4 = '\f';
                                        break;
                                    case '\f':
                                        if (i9 > 8) {
                                            c4 = 3;
                                            break;
                                        } else {
                                            c4 = '\r';
                                            break;
                                        }
                                    case '\r':
                                        c01742r = c01742r;
                                        if (!c01742r.A06.A0F()) {
                                            c4 = 15;
                                            break;
                                        } else {
                                            c4 = 14;
                                            break;
                                        }
                                    case 14:
                                        c01742r = c01742r;
                                        c01742r.A08[8 - i9].A0E(true);
                                        c4 = 15;
                                        break;
                                    case 15:
                                        i9++;
                                        c4 = '\f';
                                        break;
                                    case 16:
                                        i5 = 1;
                                        c4 = 17;
                                        break;
                                    case 17:
                                        if (i5 > 8) {
                                            c4 = 3;
                                            break;
                                        } else {
                                            c4 = 18;
                                            break;
                                        }
                                    case 18:
                                        c01742r = c01742r;
                                        if (!c01742r.A06.A0F()) {
                                            c4 = 20;
                                            break;
                                        } else {
                                            c4 = 19;
                                            break;
                                        }
                                    case 19:
                                        c01742r = c01742r;
                                        c01742r.A08[8 - i5].A0E(false);
                                        c4 = 20;
                                        break;
                                    case 20:
                                        i5++;
                                        c4 = 17;
                                        break;
                                    case 21:
                                        i4 = 1;
                                        c4 = 22;
                                        break;
                                    case 22:
                                        if (i4 > 8) {
                                            c4 = 3;
                                            break;
                                        } else {
                                            c4 = 23;
                                            break;
                                        }
                                    case 23:
                                        c01742r = c01742r;
                                        if (!c01742r.A06.A0F()) {
                                            c4 = 25;
                                            break;
                                        } else {
                                            c4 = 24;
                                            break;
                                        }
                                    case 24:
                                        c01742r = c01742r;
                                        c01742r.A08[8 - i4].A0E(!r13.A0I());
                                        c4 = 25;
                                        break;
                                    case 25:
                                        i4++;
                                        c4 = 22;
                                        break;
                                    case 26:
                                        i6 = 1;
                                        c4 = 27;
                                        break;
                                    case 27:
                                        if (i6 > 8) {
                                            c4 = 3;
                                            break;
                                        } else {
                                            c4 = 28;
                                            break;
                                        }
                                    case 28:
                                        c01742r = c01742r;
                                        if (!c01742r.A06.A0F()) {
                                            c4 = 30;
                                            break;
                                        } else {
                                            c4 = 29;
                                            break;
                                        }
                                    case 29:
                                        c01742r = c01742r;
                                        C0491Gf cueBuilder2 = c01742r.A08[8 - i6];
                                        cueBuilder2.A08();
                                        c4 = 30;
                                        break;
                                    case 30:
                                        i6++;
                                        c4 = 27;
                                        break;
                                    case 31:
                                        c01742r = c01742r;
                                        c01742r.A06.A08(8);
                                        c4 = 3;
                                        break;
                                    case ' ':
                                        c01742r = c01742r;
                                        c01742r.A08();
                                        c4 = 3;
                                        break;
                                    case '!':
                                        c01742r = c01742r;
                                        if (!c01742r.A01.A0G()) {
                                            c4 = '\"';
                                            break;
                                        } else {
                                            c4 = '#';
                                            break;
                                        }
                                    case '\"':
                                        c01742r = c01742r;
                                        c01742r.A06.A08(16);
                                        c4 = 3;
                                        break;
                                    case '#':
                                        c01742r = c01742r;
                                        c01742r.A03();
                                        c4 = 3;
                                        break;
                                    case '$':
                                        c01742r = c01742r;
                                        C0491Gf cueBuilder3 = c01742r.A01;
                                        if (!cueBuilder3.A0G()) {
                                            c4 = '%';
                                            break;
                                        } else {
                                            c4 = '&';
                                            break;
                                        }
                                    case '%':
                                        c01742r = c01742r;
                                        c01742r.A06.A08(24);
                                        c4 = 3;
                                        break;
                                    case '&':
                                        c01742r = c01742r;
                                        c01742r.A04();
                                        c4 = 3;
                                        break;
                                    case '\'':
                                        c01742r = c01742r;
                                        if (!c01742r.A01.A0G()) {
                                            c4 = '(';
                                            break;
                                        } else {
                                            c4 = ')';
                                            break;
                                        }
                                    case '(':
                                        c01742r = c01742r;
                                        c01742r.A06.A08(16);
                                        c4 = 3;
                                        break;
                                    case ')':
                                        c01742r = c01742r;
                                        c01742r.A05();
                                        c4 = 3;
                                        break;
                                    case '*':
                                        c01742r = c01742r;
                                        if (!c01742r.A01.A0G()) {
                                            c4 = '+';
                                            break;
                                        } else {
                                            c4 = ',';
                                            break;
                                        }
                                    case '+':
                                        c01742r = c01742r;
                                        c01742r.A06.A08(32);
                                        c4 = 3;
                                        break;
                                    case ',':
                                        c01742r = c01742r;
                                        c01742r.A06();
                                        c4 = 3;
                                        break;
                                    case '-':
                                        c01742r = c01742r;
                                        i3 = i2 - 152;
                                        c01742r.A0E(i3);
                                        if (c01742r.A00 == i3) {
                                            c4 = 3;
                                            break;
                                        } else {
                                            c4 = '.';
                                            break;
                                        }
                                    case '.':
                                        c01742r = c01742r;
                                        c01742r.A00 = i3;
                                        c01742r.A01 = c01742r.A08[i3];
                                        c4 = 3;
                                        break;
                                }
                            }
                        }

                        private void A0C(int i2) {
                            C01742r c01742r = this;
                            char c4 = i2 <= 7 ? (char) 2 : (char) 3;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        return;
                                    case 3:
                                        if (i2 > 15) {
                                            c4 = 5;
                                            break;
                                        } else {
                                            c4 = 4;
                                            break;
                                        }
                                    case 4:
                                        c01742r = c01742r;
                                        c01742r.A06.A08(8);
                                        c4 = 2;
                                        break;
                                    case 5:
                                        if (i2 > 23) {
                                            c4 = 7;
                                            break;
                                        } else {
                                            c4 = 6;
                                            break;
                                        }
                                    case 6:
                                        c01742r = c01742r;
                                        c01742r.A06.A08(16);
                                        c4 = 2;
                                        break;
                                    case 7:
                                        if (i2 > 31) {
                                            c4 = 2;
                                            break;
                                        } else {
                                            c4 = '\b';
                                            break;
                                        }
                                    case '\b':
                                        c01742r = c01742r;
                                        c01742r.A06.A08(24);
                                        c4 = 2;
                                        break;
                                }
                            }
                        }

                        private void A0D(int i2) {
                            C01742r c01742r = this;
                            char c4 = i2 <= 135 ? (char) 2 : (char) 4;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        c01742r = c01742r;
                                        c01742r.A06.A08(32);
                                        c4 = 3;
                                        break;
                                    case 3:
                                        return;
                                    case 4:
                                        if (i2 > 143) {
                                            c4 = 6;
                                            break;
                                        } else {
                                            c4 = 5;
                                            break;
                                        }
                                    case 5:
                                        c01742r = c01742r;
                                        c01742r.A06.A08(40);
                                        c4 = 3;
                                        break;
                                    case 6:
                                        if (i2 > 159) {
                                            c4 = 3;
                                            break;
                                        } else {
                                            c4 = 7;
                                            break;
                                        }
                                    case 7:
                                        c01742r = c01742r;
                                        c01742r.A06.A08(2);
                                        c01742r.A06.A08(c01742r.A06.A04(6) * 8);
                                        c4 = 3;
                                        break;
                                }
                            }
                        }

                        private void A0E(int i2) {
                            C0491Gf c0491Gf = this.A08[i2];
                            this.A06.A08(2);
                            boolean zA0F = this.A06.A0F();
                            boolean zA0F2 = this.A06.A0F();
                            boolean zA0F3 = this.A06.A0F();
                            int iA04 = this.A06.A04(3);
                            boolean columnLock = this.A06.A0F();
                            int verticalAnchor = this.A06.A04(7);
                            int rowCount = this.A06.A04(8);
                            int penStyle = this.A06.A04(4);
                            int iA042 = this.A06.A04(4);
                            this.A06.A08(2);
                            int iA043 = this.A06.A04(6);
                            this.A06.A08(2);
                            c0491Gf.A0F(zA0F, zA0F2, zA0F3, iA04, columnLock, verticalAnchor, rowCount, iA042, iA043, penStyle, this.A06.A04(3), this.A06.A04(3));
                        }

                        private void A0F(int i2) {
                            C01742r c01742r = this;
                            char c4 = i2 == 127 ? (char) 2 : (char) 4;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 9835);
                                        c4 = 3;
                                        break;
                                    case 3:
                                        return;
                                    case 4:
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) (i2 & 255));
                                        c4 = 3;
                                        break;
                                }
                            }
                        }

                        private void A0G(int i2) {
                            this.A01.A09((char) (i2 & 255));
                        }

                        private void A0H(int i2) {
                            C01742r c01742r = this;
                            char c4 = i2 != 32 ? (char) 2 : '(';
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        if (i2 == 33) {
                                            c4 = '\'';
                                            break;
                                        } else {
                                            c4 = 3;
                                            break;
                                        }
                                    case 3:
                                        if (i2 == 37) {
                                            c4 = '&';
                                            break;
                                        } else {
                                            c4 = 4;
                                            break;
                                        }
                                    case 4:
                                        if (i2 == 42) {
                                            c4 = '%';
                                            break;
                                        } else {
                                            c4 = 5;
                                            break;
                                        }
                                    case 5:
                                        if (i2 == 44) {
                                            c4 = '$';
                                            break;
                                        } else {
                                            c4 = 6;
                                            break;
                                        }
                                    case 6:
                                        if (i2 == 63) {
                                            c4 = '#';
                                            break;
                                        } else {
                                            c4 = 7;
                                            break;
                                        }
                                    case 7:
                                        if (i2 == 57) {
                                            c4 = '\"';
                                            break;
                                        } else {
                                            c4 = '\b';
                                            break;
                                        }
                                    case '\b':
                                        if (i2 == 58) {
                                            c4 = '!';
                                            break;
                                        } else {
                                            c4 = '\t';
                                            break;
                                        }
                                    case '\t':
                                        if (i2 == 60) {
                                            c4 = ' ';
                                            break;
                                        } else {
                                            c4 = '\n';
                                            break;
                                        }
                                    case '\n':
                                        if (i2 == 61) {
                                            c4 = 31;
                                            break;
                                        } else {
                                            c4 = 11;
                                            break;
                                        }
                                    case 11:
                                        switch (i2) {
                                            case 48:
                                                c4 = 25;
                                                break;
                                            case 49:
                                                c4 = 26;
                                                break;
                                            case 50:
                                                c4 = 27;
                                                break;
                                            case 51:
                                                c4 = 28;
                                                break;
                                            case 52:
                                                c4 = 29;
                                                break;
                                            case 53:
                                                c4 = 30;
                                                break;
                                            default:
                                                c4 = '\f';
                                                break;
                                        }
                                    case '\f':
                                        switch (i2) {
                                            case k.AppCompatTheme_windowFixedHeightMajor /* 118 */:
                                                c4 = 15;
                                                break;
                                            case k.AppCompatTheme_windowFixedHeightMinor /* 119 */:
                                                c4 = 16;
                                                break;
                                            case k.AppCompatTheme_windowFixedWidthMajor /* 120 */:
                                                c4 = 17;
                                                break;
                                            case k.AppCompatTheme_windowFixedWidthMinor /* 121 */:
                                                c4 = 18;
                                                break;
                                            case k.AppCompatTheme_windowMinWidthMajor /* 122 */:
                                                c4 = 19;
                                                break;
                                            case k.AppCompatTheme_windowMinWidthMinor /* 123 */:
                                                c4 = 20;
                                                break;
                                            case k.AppCompatTheme_windowNoTitle /* 124 */:
                                                c4 = 21;
                                                break;
                                            case 125:
                                                c4 = 22;
                                                break;
                                            case 126:
                                                c4 = 23;
                                                break;
                                            case 127:
                                                c4 = 24;
                                                break;
                                            default:
                                                c4 = '\r';
                                                break;
                                        }
                                    case '\r':
                                        Log.w(A00(238, 13, 49), A00(0, 22, 101) + i2);
                                        c4 = 14;
                                        break;
                                    case 14:
                                        return;
                                    case 15:
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 8539);
                                        c4 = 14;
                                        break;
                                    case 16:
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 8540);
                                        c4 = 14;
                                        break;
                                    case 17:
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 8541);
                                        c4 = 14;
                                        break;
                                    case 18:
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 8542);
                                        c4 = 14;
                                        break;
                                    case 19:
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 9474);
                                        c4 = 14;
                                        break;
                                    case 20:
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 9488);
                                        c4 = 14;
                                        break;
                                    case 21:
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 9492);
                                        c4 = 14;
                                        break;
                                    case 22:
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 9472);
                                        c4 = 14;
                                        break;
                                    case 23:
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 9496);
                                        c4 = 14;
                                        break;
                                    case 24:
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 9484);
                                        c4 = 14;
                                        break;
                                    case 25:
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 9608);
                                        c4 = 14;
                                        break;
                                    case 26:
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 8216);
                                        c4 = 14;
                                        break;
                                    case 27:
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 8217);
                                        c4 = 14;
                                        break;
                                    case 28:
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 8220);
                                        c4 = 14;
                                        break;
                                    case 29:
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 8221);
                                        c4 = 14;
                                        break;
                                    case 30:
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 8226);
                                        c4 = 14;
                                        break;
                                    case 31:
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 8480);
                                        c4 = 14;
                                        break;
                                    case ' ':
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 339);
                                        c4 = 14;
                                        break;
                                    case '!':
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 353);
                                        c4 = 14;
                                        break;
                                    case '\"':
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 8482);
                                        c4 = 14;
                                        break;
                                    case '#':
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 376);
                                        c4 = 14;
                                        break;
                                    case '$':
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 338);
                                        c4 = 14;
                                        break;
                                    case '%':
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 352);
                                        c4 = 14;
                                        break;
                                    case '&':
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 8230);
                                        c4 = 14;
                                        break;
                                    case '\'':
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 160);
                                        c4 = 14;
                                        break;
                                    case '(':
                                        c01742r = c01742r;
                                        c01742r.A01.A09(' ');
                                        c4 = 14;
                                        break;
                                }
                            }
                        }

                        private void A0I(int i2) {
                            C01742r c01742r = this;
                            char c4 = i2 == 160 ? (char) 2 : (char) 4;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        c01742r = c01742r;
                                        c01742r.A01.A09((char) 13252);
                                        c4 = 3;
                                        break;
                                    case 3:
                                        return;
                                    case 4:
                                        c01742r = c01742r;
                                        Log.w(A00(238, 13, 49), A00(79, 22, 61) + i2);
                                        c01742r.A01.A09('_');
                                        c4 = 3;
                                        break;
                                }
                            }
                        }

                        @Override // com.facebook.ads.redexgen.X.BO
                        public final GY A0L() {
                            List<GX> list2 = this.A03;
                            this.A04 = list2;
                            return new C1060b6(list2);
                        }

                        @Override // com.facebook.ads.redexgen.X.BO
                        /* renamed from: A0M */
                        public final /* bridge */ /* synthetic */ BX A4h() throws GZ {
                            return super.A4h();
                        }

                        @Override // com.facebook.ads.redexgen.X.BO
                        /* renamed from: A0N */
                        public final /* bridge */ /* synthetic */ BP A4i() throws GZ {
                            return super.A4i();
                        }

                        @Override // com.facebook.ads.redexgen.X.BO
                        /* renamed from: A0O */
                        public final /* bridge */ /* synthetic */ void AC2(BX bx) throws GZ {
                            super.AC2(bx);
                        }

                        @Override // com.facebook.ads.redexgen.X.BO
                        public final void A0P(BX bx) {
                            C01742r c01742r = this;
                            boolean z = false;
                            int i2 = 0;
                            int i3 = 0;
                            int i4 = 0;
                            int i5 = 0;
                            int i6 = 0;
                            byte bA0E = 0;
                            int i7 = 0;
                            boolean z2 = false;
                            C0492Gg c0492Gg = null;
                            byte bA0E2 = 0;
                            c01742r.A07.A0b(bx.A01.array(), bx.A01.limit());
                            char c4 = 2;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        c01742r = c01742r;
                                        i7 = 3;
                                        if (c01742r.A07.A04() < 3) {
                                            c4 = 20;
                                            break;
                                        } else {
                                            c4 = 3;
                                            break;
                                        }
                                    case 3:
                                        c01742r = c01742r;
                                        int iA0E = c01742r.A07.A0E() & 7;
                                        i5 = iA0E & 3;
                                        z = false;
                                        i6 = 1;
                                        if ((iA0E & 4) != 4) {
                                            c4 = 19;
                                            break;
                                        } else {
                                            c4 = 4;
                                            break;
                                        }
                                    case 4:
                                        z2 = true;
                                        c4 = 5;
                                        break;
                                    case 5:
                                        c01742r = c01742r;
                                        bA0E = (byte) c01742r.A07.A0E();
                                        bA0E2 = (byte) c01742r.A07.A0E();
                                        i2 = 2;
                                        if (i5 == 2) {
                                            c4 = 7;
                                            break;
                                        } else {
                                            c4 = 6;
                                            break;
                                        }
                                    case 6:
                                        if (i5 == i7) {
                                            c4 = 7;
                                            break;
                                        } else {
                                            c4 = 2;
                                            break;
                                        }
                                    case 7:
                                        if (!z2) {
                                            c4 = 2;
                                            break;
                                        } else {
                                            c4 = '\b';
                                            break;
                                        }
                                    case '\b':
                                        if (i5 != i7) {
                                            c4 = 14;
                                            break;
                                        } else {
                                            c4 = '\t';
                                            break;
                                        }
                                    case '\t':
                                        c01742r = c01742r;
                                        c01742r.A02();
                                        i4 = (bA0E & 192) >> 6;
                                        i3 = bA0E & 63;
                                        if (i3 != 0) {
                                            c4 = 11;
                                            break;
                                        } else {
                                            c4 = '\n';
                                            break;
                                        }
                                    case '\n':
                                        i3 = 64;
                                        c4 = 11;
                                        break;
                                    case 11:
                                        c01742r = c01742r;
                                        c01742r.A02 = new C0492Gg(i4, i3);
                                        byte[] bArr = c01742r.A02.A03;
                                        C0492Gg c0492Gg2 = c01742r.A02;
                                        int i8 = c0492Gg2.A00;
                                        c0492Gg2.A00 = i8 + 1;
                                        bArr[i8] = bA0E2;
                                        c4 = '\f';
                                        break;
                                    case '\f':
                                        c01742r = c01742r;
                                        if (c01742r.A02.A00 != (c01742r.A02.A01 * 2) - i6) {
                                            c4 = 2;
                                            break;
                                        } else {
                                            c4 = '\r';
                                            break;
                                        }
                                    case '\r':
                                        c01742r = c01742r;
                                        c01742r.A02();
                                        c4 = 2;
                                        break;
                                    case 14:
                                        if (i5 != i2) {
                                            c4 = 16;
                                            break;
                                        } else {
                                            c4 = 15;
                                            break;
                                        }
                                    case 15:
                                        z = true;
                                        c4 = 16;
                                        break;
                                    case 16:
                                        c01742r = c01742r;
                                        IJ.A03(z);
                                        c0492Gg = c01742r.A02;
                                        if (c0492Gg != null) {
                                            c4 = 18;
                                            break;
                                        } else {
                                            c4 = 17;
                                            break;
                                        }
                                    case 17:
                                        Log.e(A00(238, 13, 49), A00(294, 55, 88));
                                        c4 = 2;
                                        break;
                                    case 18:
                                        c01742r = c01742r;
                                        c0492Gg = c0492Gg;
                                        byte[] bArr2 = c0492Gg.A03;
                                        C0492Gg c0492Gg3 = c01742r.A02;
                                        int i9 = c0492Gg3.A00;
                                        c0492Gg3.A00 = i9 + 1;
                                        bArr2[i9] = bA0E;
                                        byte[] bArr3 = c01742r.A02.A03;
                                        C0492Gg c0492Gg4 = c01742r.A02;
                                        int i10 = c0492Gg4.A00;
                                        c0492Gg4.A00 = i10 + 1;
                                        bArr3[i10] = bA0E2;
                                        c4 = '\f';
                                        break;
                                    case 19:
                                        z2 = false;
                                        c4 = 5;
                                        break;
                                    case 20:
                                        return;
                                }
                            }
                        }

                        @Override // com.facebook.ads.redexgen.X.BO
                        public final boolean A0R() {
                            boolean z = false;
                            char c4 = this.A03 != this.A04 ? (char) 2 : (char) 4;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        z = true;
                                        c4 = 3;
                                        break;
                                    case 3:
                                        return z;
                                    case 4:
                                        z = false;
                                        c4 = 3;
                                        break;
                                }
                            }
                        }

                        @Override // com.facebook.ads.redexgen.X.BO, com.facebook.ads.redexgen.X.BV
                        public final /* bridge */ /* synthetic */ void ACJ() {
                            super.ACJ();
                        }

                        @Override // com.facebook.ads.redexgen.X.BO, com.facebook.ads.redexgen.X.InterfaceC1056b2
                        public final /* bridge */ /* synthetic */ void ADA(long j) {
                            super.ADA(j);
                        }

                        @Override // com.facebook.ads.redexgen.X.BO, com.facebook.ads.redexgen.X.BV
                        public final void flush() {
                            super.flush();
                            this.A03 = null;
                            this.A04 = null;
                            this.A00 = 0;
                            this.A01 = this.A08[this.A00];
                            A08();
                            this.A02 = null;
                        }
                    };
                case '#':
                    final List<byte[]> list2 = format.A0P;
                    return new BZ(list2) { // from class: com.facebook.ads.redexgen.X.2o
                        public static byte[] A01;
                        public final C0503Gr A00;

                        static {
                            A02();
                        }

                        public static String A01(int i2, int i3, int i4) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                            int i5 = 0;
                            char c4 = 2;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        bArrCopyOfRange = bArrCopyOfRange;
                                        if (i5 >= bArrCopyOfRange.length) {
                                            c4 = 4;
                                            break;
                                        } else {
                                            c4 = 3;
                                            break;
                                        }
                                    case 3:
                                        bArrCopyOfRange = bArrCopyOfRange;
                                        bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 62);
                                        i5++;
                                        c4 = 2;
                                        break;
                                    case 4:
                                        return new String(bArrCopyOfRange);
                                }
                            }
                        }

                        public static void A02() {
                            A01 = new byte[]{-70, -20, -40, -70, -37, -39, -27, -38, -37, -24};
                        }

                        {
                            super(A01(0, 10, 56));
                            C0544Ii c0544Ii = new C0544Ii(list2.get(0));
                            int subtitleAncillaryPage = c0544Ii.A0I();
                            this.A00 = new C0503Gr(subtitleAncillaryPage, c0544Ii.A0I());
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // com.facebook.ads.redexgen.X.BZ
                        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                        public final C1061b7 A0b(byte[] bArr, int i2, boolean z) {
                            if (z) {
                                this.A00.A0J();
                            }
                            return new C1061b7(this.A00.A0I(bArr, i2));
                        }
                    };
                case '$':
                    return new BZ() { // from class: com.facebook.ads.redexgen.X.2n
                        public static byte[] A05;
                        public int A00;
                        public Inflater A01;
                        public byte[] A02;
                        public final C0504Gs A03;
                        public final C0544Ii A04;

                        static {
                            A02();
                        }

                        public static String A01(int i2, int i3, int i4) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
                            int i5 = 0;
                            char c4 = 2;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        bArrCopyOfRange = bArrCopyOfRange;
                                        if (i5 >= bArrCopyOfRange.length) {
                                            c4 = 4;
                                            break;
                                        } else {
                                            c4 = 3;
                                            break;
                                        }
                                    case 3:
                                        bArrCopyOfRange = bArrCopyOfRange;
                                        bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 82);
                                        i5++;
                                        c4 = 2;
                                        break;
                                    case 4:
                                        return new String(bArrCopyOfRange);
                                }
                            }
                        }

                        public static void A02() {
                            A05 = new byte[]{38, 17, 5, 50, 19, 21, 25, 18, 19, 4};
                        }

                        {
                            A01(0, 10, 36);
                            this.A04 = new C0544Ii();
                            this.A03 = new C0504Gs();
                        }

                        public static GX A00(C0544Ii c0544Ii, C0504Gs c0504Gs) {
                            GX gxA06 = null;
                            int iA07 = c0544Ii.A07();
                            int iA0E = c0544Ii.A0E();
                            int iA0I = c0544Ii.A0I();
                            int iA06 = c0544Ii.A06() + iA0I;
                            int nextSectionPosition = iA06 > iA07 ? 2 : 3;
                            while (true) {
                                switch (nextSectionPosition) {
                                    case 2:
                                        c0544Ii.A0Y(iA07);
                                        GX cue = (GX) null;
                                        return cue;
                                    case 3:
                                        gxA06 = null;
                                        if (iA0E == 128) {
                                            nextSectionPosition = 9;
                                            break;
                                        } else {
                                            nextSectionPosition = 4;
                                            break;
                                        }
                                    case 4:
                                        switch (iA0E) {
                                            case 20:
                                                nextSectionPosition = 6;
                                                break;
                                            case 21:
                                                nextSectionPosition = 7;
                                                break;
                                            case 22:
                                                nextSectionPosition = 8;
                                                break;
                                            default:
                                                nextSectionPosition = 5;
                                                break;
                                        }
                                    case 5:
                                        c0544Ii.A0Y(iA06);
                                        return gxA06;
                                    case 6:
                                        c0544Ii = c0544Ii;
                                        c0504Gs = c0504Gs;
                                        c0504Gs.A05(c0544Ii, iA0I);
                                        nextSectionPosition = 5;
                                        break;
                                    case 7:
                                        c0544Ii = c0544Ii;
                                        c0504Gs = c0504Gs;
                                        c0504Gs.A03(c0544Ii, iA0I);
                                        nextSectionPosition = 5;
                                        break;
                                    case 8:
                                        c0544Ii = c0544Ii;
                                        c0504Gs = c0504Gs;
                                        c0504Gs.A04(c0544Ii, iA0I);
                                        nextSectionPosition = 5;
                                        break;
                                    case 9:
                                        c0504Gs = c0504Gs;
                                        gxA06 = c0504Gs.A06();
                                        c0504Gs.A07();
                                        nextSectionPosition = 5;
                                        break;
                                }
                            }
                        }

                        private boolean A03(byte[] bArr, int i2) {
                            C01702n c01702n = this;
                            boolean zFinished = false;
                            boolean z = false;
                            char c4 = i2 != 0 ? (char) 2 : (char) 3;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        bArr = bArr;
                                        z = false;
                                        z = false;
                                        c4 = bArr[0] != 120 ? (char) 3 : (char) 4;
                                    case 3:
                                        return z;
                                    case 4:
                                        c01702n = c01702n;
                                        c4 = c01702n.A01 == null ? (char) 5 : (char) 6;
                                    case 5:
                                        c01702n = c01702n;
                                        c01702n.A01 = new Inflater();
                                        c01702n.A02 = new byte[i2];
                                        c4 = 6;
                                    case 6:
                                        c01702n = c01702n;
                                        bArr = bArr;
                                        c01702n.A00 = z ? 1 : 0;
                                        c01702n.A01.setInput(bArr, z ? 1 : 0, i2);
                                        break;
                                    case '\n':
                                        c01702n = c01702n;
                                        c4 = !c01702n.A01.needsDictionary() ? '\r' : '\"';
                                    case '\r':
                                        c01702n = c01702n;
                                        c4 = !c01702n.A01.needsInput() ? (char) 16 : '\"';
                                    case 16:
                                        c01702n = c01702n;
                                        if (c01702n.A00 == c01702n.A02.length) {
                                            c01702n.A02 = Arrays.copyOf(c01702n.A02, c01702n.A02.length * 2);
                                        }
                                        c01702n.A00 += c01702n.A01.inflate(c01702n.A02, c01702n.A00, c01702n.A02.length - c01702n.A00);
                                        break;
                                    case '\"':
                                        try {
                                            c01702n = c01702n;
                                            zFinished = c01702n.A01.finished();
                                            c4 = '%';
                                        } catch (DataFormatException unused) {
                                            c01702n.A01.reset();
                                            return z;
                                        } catch (Throwable th) {
                                            c01702n.A01.reset();
                                            throw th;
                                        }
                                    case '%':
                                        c01702n.A01.reset();
                                        return zFinished;
                                }
                                c4 = !c01702n.A01.finished() ? '\n' : '\"';
                            }
                        }

                        @Override // com.facebook.ads.redexgen.X.BZ
                        public final GY A0b(byte[] bArr, int i2, boolean z) throws GZ {
                            C01702n c01702n = this;
                            GX gxA00 = null;
                            ArrayList arrayList = null;
                            char c4 = c01702n.A03(bArr, i2) ? (char) 2 : (char) 7;
                            while (true) {
                                switch (c4) {
                                    case 2:
                                        c01702n = c01702n;
                                        c01702n.A04.A0b(c01702n.A02, c01702n.A00);
                                        c4 = 3;
                                        break;
                                    case 3:
                                        c01702n = c01702n;
                                        c01702n.A03.A07();
                                        arrayList = new ArrayList();
                                        c4 = 4;
                                        break;
                                    case 4:
                                        c01702n = c01702n;
                                        if (c01702n.A04.A04() < 3) {
                                            c4 = '\b';
                                            break;
                                        } else {
                                            c4 = 5;
                                            break;
                                        }
                                    case 5:
                                        c01702n = c01702n;
                                        gxA00 = A00(c01702n.A04, c01702n.A03);
                                        if (gxA00 == null) {
                                            c4 = 4;
                                            break;
                                        } else {
                                            c4 = 6;
                                            break;
                                        }
                                    case 6:
                                        arrayList = arrayList;
                                        gxA00 = gxA00;
                                        arrayList.add(gxA00);
                                        c4 = 4;
                                        break;
                                    case 7:
                                        c01702n = c01702n;
                                        bArr = bArr;
                                        c01702n.A04.A0b(bArr, i2);
                                        c4 = 3;
                                        break;
                                    case '\b':
                                        return new C1062b8(Collections.unmodifiableList(arrayList));
                                }
                            }
                        }
                    };
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0486Ga
    public final boolean ADY(Format format) {
        boolean z = false;
        String str = format.A0O;
        char c2 = !A00(141, 8, 97).equals(str) ? (char) 2 : '\f';
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!A00(46, 10, 18).equals(str)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case 3:
                    str = str;
                    if (!A00(187, 20, 23).equals(str)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case 4:
                    str = str;
                    if (!A00(0, 21, 85).equals(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case 5:
                    str = str;
                    if (!A00(56, 20, 8).equals(str)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case 6:
                    str = str;
                    if (!A00(207, 28, 12).equals(str)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case 7:
                    str = str;
                    if (!A00(235, 19, 79).equals(str)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\b':
                    str = str;
                    if (!A00(21, 25, 81).equals(str)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\t':
                    str = str;
                    if (!A00(168, 19, 65).equals(str)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\n':
                    str = str;
                    if (!A00(149, 19, 102).equals(str)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case 11:
                    str = str;
                    if (!A00(76, 15, 90).equals(str)) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    z = true;
                    c2 = '\r';
                    break;
                case '\r':
                    return z;
                case 14:
                    z = false;
                    c2 = '\r';
                    break;
            }
        }
    }
}

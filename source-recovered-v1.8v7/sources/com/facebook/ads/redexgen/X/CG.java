package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.InternalFrame;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public final class CG {
    public static byte[] A02;
    public static final E2 A03;
    public static final Pattern A04;
    public int A00 = -1;
    public int A01 = -1;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 103);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{124, 112, 114, 49, 126, 111, 111, 115, 122, 49, 118, 75, 106, 113, 122, 108, 77, 51, 72, 35, 62, 42, 114, 62, 117, 82, 62, 85, 78, 104, 43, 110, 51, 59, 72, 35, 62, 42, 114, 62, 117, 82, 62, 85, 78, 104, 43, 110, 58, 51, 59, 72, 35, 62, 42, 114, 62, 117, 82, 62, 85, 78, 104, 43, 110, 58, 44, 17, 48, 43, 22, 8, 21, 7};
    }

    static {
        A01();
        A03 = new C0957Yn();
        A04 = Pattern.compile(A00(16, 50, k.AppCompatTheme_windowActionBarOverlay));
    }

    private boolean A02(String str) throws NumberFormatException {
        Matcher matcher = A04.matcher(str);
        if (matcher.find()) {
            try {
                int i = Integer.parseInt(matcher.group(1), 16);
                int encoderDelay = Integer.parseInt(matcher.group(2), 16);
                if (i > 0 || encoderDelay > 0) {
                    this.A00 = i;
                    this.A01 = encoderDelay;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean A03() {
        CG cg = this;
        boolean z = false;
        char c2 = cg.A00 != -1 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    cg = cg;
                    if (cg.A01 == -1) {
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

    public final boolean A04(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        char c2 = i2 <= 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 <= 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    CG cg = this;
                    cg.A00 = i2;
                    cg.A01 = i3;
                    return true;
                case 4:
                    return false;
            }
        }
    }

    public final boolean A05(Metadata metadata) {
        CG cg = this;
        boolean z = false;
        InternalFrame internalFrame = null;
        String strA00 = null;
        Metadata.Entry entryA01 = null;
        CommentFrame commentFrame = null;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    metadata = metadata;
                    if (i >= metadata.A00()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    metadata = metadata;
                    entryA01 = metadata.A01(i);
                    boolean z2 = entryA01 instanceof CommentFrame;
                    strA00 = A00(66, 8, 34);
                    z = true;
                    if (!z2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    entryA01 = entryA01;
                    strA00 = strA00;
                    commentFrame = (CommentFrame) entryA01;
                    if (!strA00.equals(commentFrame.A00)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    cg = cg;
                    commentFrame = commentFrame;
                    if (!cg.A02(commentFrame.A02)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return z;
                case 7:
                    entryA01 = entryA01;
                    if (!(entryA01 instanceof InternalFrame)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    entryA01 = entryA01;
                    internalFrame = (InternalFrame) entryA01;
                    if (!A00(0, 16, k.AppCompatTheme_windowFixedWidthMajor).equals(internalFrame.A01)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    strA00 = strA00;
                    internalFrame = internalFrame;
                    if (!strA00.equals(internalFrame.A00)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    cg = cg;
                    internalFrame = internalFrame;
                    if (!cg.A02(internalFrame.A02)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return z;
                case '\f':
                    i++;
                    c2 = 2;
                    break;
                case '\r':
                    return false;
            }
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.9T, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C9T {
    public static byte[] A04;
    public int A00;
    public long A01;
    public final RandomAccessFile A02;
    public final long[] A03;

    static {
        A06();
    }

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 19);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A04 = new byte[]{-113, -94, -96, -84, -81, -95, 93, 98, -95, 93, -84, -93, -93, -80, -94, -79, 93, -90, -80, 93, 98, -95, 105, 93, -97, -78, -79, 93, -81, -94, -96, -84, -81, -95, 93, 98, -95, 93, -84, -93, -93, -80, -94, -79, 93, -90, -80, 93, 98, -95, -46, -27, -29, -17, -14, -28, -96, -91, -28, -96, -13, -12, -31, -14, -12, -13, -96, -31, -12, -96, -17, -26, -26, -13, -27, -12, -96, -91, -28, -84, -96, -30, -11, -12, -96, -26, -23, -20, -27, -96, -13, -23, -6, -27, -96, -23, -13, -96, -91, -28, -117, -112, -116, 89, 124, Byte.MAX_VALUE, 120, 51, 119, 120, 118, Byte.MAX_VALUE, 116, -123, 120, -122, 51, 116, 51, -121, -126, -121, 116, Byte.MAX_VALUE, 51, -126, 121, 51, 56, 119, 51, -123, 120, 118, -126, -123, 119, 51, -122, Byte.MAX_VALUE, -126, -121, -122, 63, 51, 117, -120, -121, 51, -126, -127, Byte.MAX_VALUE, -116, 51, 123, 116, -122, 51, 56, 119, 51, 117, -116, -121, 120, -122, -104, -85, -87, -75, -72, -86, 102, 118, 102, -75, -84, -84, -71, -85, -70, 102, -85, -66, -74, -85, -87, -70, -85, -86, 102, -89, -70, 102, 107, -86, 102, -88, -69, -70, 102, -81, -71, 102, -89, -70, 102, 107, -86, -96, -61, -58, -65, 122, -57, -69, -63, -61, -67, 122, Byte.MAX_VALUE, -66, 122, -61, -56, -51, -50, -65, -69, -66, 122, -55, -64, 122, Byte.MAX_VALUE, -66, -90, -55, -52, -59, Byte.MIN_VALUE, -123, -60, Byte.MIN_VALUE, -62, -39, -44, -59, -45, -116, Byte.MIN_VALUE, -52, -59, -45, -45, Byte.MIN_VALUE, -44, -56, -63, -50, Byte.MIN_VALUE, -123, -60, -62, -27, -24, -31, -100, -32, -31, -33, -24, -35, -18, -31, -17, -100, -35, -100, -16, -21, -16, -35, -24, -100, -21, -30, -100, -95, -32, -100, -18, -31, -33, -21, -18, -32, -100, -17, -24, -21, -16, -17, -101, -82, -84, -72, -69, -83, 105, 110, -83, 105, -72, -81, -81, -68, -82, -67, 105, -68, -79, -72, -66, -75, -83, 105, -85, -82, 105, 121, 105, -85, -82, -84, -86, -66, -68, -82, 105, -69, -82, -84, -72, -69, -83, 105, -84, -72, -66, -73, -67, 105, -78, -68, 105, 110, -83, 117, 105, -85, -66, -67, 105, -78, -68, 105, 110, -83, -121, -94, -86, -83, -90, -91, 97, -75, -80, 97, -92, -77, -90, -94, -75, -90, 97, -89, -86, -83, -90, 97, 104, 102, -76, 104, -113, -86, -78, -75, -82, -83, 105, -67, -72, 105, -72, -71, -82, -73, 105, -81, -78, -75, -82, 105, 112, 110, -68, 112};
    }

    public C9T(RandomAccessFile randomAccessFile, long[] jArr, long j) throws IOException {
        this.A02 = randomAccessFile;
        this.A03 = jArr;
        this.A01 = j;
        for (int i = 0; i < jArr.length && jArr[i] != 0; i++) {
            this.A00++;
        }
        if (this.A00 > 0) {
            long jA01 = A01();
            if (jArr[0] != jA01) {
                throw new IOException(String.format(Locale.US, A05(166, 43, 51), Long.valueOf(jA01), Long.valueOf(jArr[0])));
            }
        }
        for (int i2 = this.A00; i2 < jArr.length; i2++) {
            if (jArr[i2] != 0) {
                throw new IOException(String.format(Locale.US, A05(303, 66, 54), Integer.valueOf(i2), Integer.valueOf(this.A00), Long.valueOf(jArr[i2])));
            }
        }
        int i3 = 1;
        while (true) {
            int i4 = this.A00;
            if (i3 >= i4) {
                if (i4 <= 0 || jArr[i4 - 1] <= j) {
                    return;
                } else {
                    throw new IOException(String.format(Locale.US, A05(50, 50, 109), Integer.valueOf(this.A00 - 1), Long.valueOf(jArr[this.A00 - 1]), Long.valueOf(j)));
                }
            } else if (jArr[i3 - 1] <= jArr[i3]) {
                i3++;
            } else {
                throw new IOException(String.format(Locale.US, A05(0, 50, 42), Integer.valueOf(i3 - 1), Long.valueOf(jArr[i3 - 1]), Integer.valueOf(i3), Long.valueOf(jArr[i3])));
            }
        }
    }

    public static long A00() {
        return 16L;
    }

    private final long A01() {
        return A00() + (this.A03.length * 8);
    }

    public static long A02(int i) {
        return A00() + (i * 8);
    }

    public static C9T A03(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, A05(100, 3, 6));
        try {
            randomAccessFile.writeLong(-360011992771067903L);
            randomAccessFile.writeLong(C9U.A03);
            randomAccessFile.write(new byte[C9U.A03 * 8]);
            randomAccessFile.getFD().sync();
            return new C9T(randomAccessFile, new long[C9U.A03], randomAccessFile.length());
        } catch (IOException unused) {
            A07(randomAccessFile);
            throw new IOException(String.format(Locale.US, A05(369, 26, 46), file.getCanonicalPath()));
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:15:0x004e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.C9T A04(java.io.File r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C9T.A04(java.io.File):com.facebook.ads.redexgen.X.9T");
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A07(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }
}

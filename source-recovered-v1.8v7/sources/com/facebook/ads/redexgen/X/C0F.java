package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.0F, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0F {
    public static byte[] A00;

    static {
        A02();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 7);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{-58, -13, -13, -16, -13, -95, -13, -26, -28, -13, -26, -30, -11, -26, -95, -5, -26, -13, -16, -82, -12, -22, -5, -26, -95, -25, -22, -19, -26, -95, -86, -49, -40, -53, -55, -38, -43, -40, -33, -122, -117, -39, -122, -55, -57, -44, -115, -38, -122, -56, -53, -122, -55, -40, -53, -57, -38, -53, -54, 109, -74, -64, 109, -69, -68, -63, 109, -79, -74, -65, -78, -80, -63, -68, -65, -58, 110, -65, -30, -27, -34, -103, -101, -56, -56, -59, -56, 118, -55, -69, -54, 118, -62, -73, -55, -54, 118, -61, -59, -70, -65, -68, -65, -69, -70, 118, -70, -73, -54, -69, 118, -54, -59, 118, -28, -23, -42};
    }

    public static List<File> A01(File file) {
        LinkedList linkedList = new LinkedList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            List<File> listAsList = Arrays.asList(fileArrListFiles);
            Collections.sort(listAsList, new C0E());
            return listAsList;
        }
        return linkedList;
    }

    public static void A03(File file) throws IOException {
        long jCurrentTimeMillis = 0;
        char c2 = file.exists() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    file = file;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (!file.setLastModified(jCurrentTimeMillis)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    file = file;
                    A04(file);
                    if (file.lastModified() < jCurrentTimeMillis) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    throw new IOException(A00(82, 32, 79) + file);
            }
        }
    }

    public static void A04(File file) throws IOException {
        long length = file.length();
        if (length == 0) {
            A05(file);
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, A00(k.AppCompatTheme_viewInflaterClass, 3, 107));
        randomAccessFile.seek(length - 1);
        byte lastByte = randomAccessFile.readByte();
        randomAccessFile.seek(length - 1);
        randomAccessFile.write(lastByte);
        randomAccessFile.close();
    }

    public static void A05(File file) throws IOException {
        char c2 = file.delete() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    file = file;
                    if (!file.createNewFile()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    throw new IOException(A00(0, 30, k.AppCompatTheme_windowMinWidthMajor) + file);
            }
        }
    }

    public static synchronized void A06(File file) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException(A00(77, 5, k.AppCompatTheme_viewInflaterClass) + file + A00(59, 18, 70));
            }
        } else if (!file.mkdirs()) {
            throw new IOException(String.format(Locale.US, A00(30, 29, 95), file.getAbsolutePath()));
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.bu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1110bu extends I7 {
    public static byte[] A00;
    public static final Pattern A01;
    public static final Pattern A02;
    public static final Pattern A03;

    public static String A06(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 69);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A00 = new byte[]{22, 96, 20, 44, 99, 97, 20, 102, 96, 20, 44, 99, 97, 20, 102, 96, 20, 44, 99, 97, 20, 102, 62, 123, 20, 102, 45, 48, 39, 108, 32, 86, 80, 85, 87, 34, 80, 86, 34, 26, 85, 87, 34, 80, 86, 34, 26, 85, 87, 34, 80, 8, 79, 34, 80, 27, 6, 17, 90, 91, 3, 70, 91, 16, 13, 26, 67, 11, 125, 123, 126, 124, 9, 123, 125, 9, 49, 126, 124, 9, 123, 125, 9, 49, 126, 124, 9, 123, 35, 103, 9, 123, 48, 45, 58, 113};
    }

    static {
        A07();
        A01 = Pattern.compile(A06(30, 29, 59), 32);
        A02 = Pattern.compile(A06(67, 29, 16), 32);
        A03 = Pattern.compile(A06(0, 30, 13), 32);
    }

    public C1110bu(String str, long j, long j2, long j3, @Nullable File file) {
        super(str, j, j2, j3, file);
    }

    @Nullable
    public static C1110bu A00(File file, IB ib) throws NumberFormatException {
        String name = file.getName();
        if (!name.endsWith(A06(59, 7, 48))) {
            file = A05(file, ib);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        Matcher matcher = A03.matcher(name);
        if (!matcher.matches()) {
            return null;
        }
        long length = file.length();
        int id = Integer.parseInt(matcher.group(1));
        String strA0C = ib.A0C(id);
        if (strA0C == null) {
            return null;
        }
        String key = matcher.group(2);
        long j = Long.parseLong(key);
        String key2 = matcher.group(3);
        return new C1110bu(strA0C, j, length, Long.parseLong(key2), file);
    }

    public static C1110bu A01(String str, long j) {
        return new C1110bu(str, j, -1L, -9223372036854775807L, null);
    }

    public static C1110bu A02(String str, long j) {
        return new C1110bu(str, j, -1L, -9223372036854775807L, null);
    }

    public static C1110bu A03(String str, long j, long j2) {
        return new C1110bu(str, j, j2, -9223372036854775807L, null);
    }

    public static File A04(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        String strA06 = A06(66, 1, 40);
        sb.append(strA06);
        sb.append(j);
        sb.append(strA06);
        sb.append(j2);
        sb.append(A06(59, 7, 48));
        return new File(file, sb.toString());
    }

    @Nullable
    public static File A05(File file, IB ib) {
        File newCacheFile = null;
        String strA0R = null;
        String name = file.getName();
        Matcher matcher = A02.matcher(name);
        char c2 = matcher.matches() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    matcher = matcher;
                    strA0R = C0560Iy.A0R(matcher.group(1));
                    if (strA0R != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return (File) null;
                case 4:
                    name = name;
                    matcher = A01.matcher(name);
                    if (!matcher.matches()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    return (File) null;
                case 6:
                    matcher = matcher;
                    strA0R = matcher.group(1);
                    c2 = 7;
                    break;
                case 7:
                    file = file;
                    ib = ib;
                    matcher = matcher;
                    strA0R = strA0R;
                    newCacheFile = A04(file.getParentFile(), ib.A08(strA0R), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)));
                    if (!file.renameTo(newCacheFile)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    return (File) null;
                case '\t':
                    return newCacheFile;
            }
        }
    }

    public final C1110bu A08(int i) {
        IJ.A04(this.A05);
        long now = System.currentTimeMillis();
        return new C1110bu(this.A04, this.A02, this.A01, now, A04(this.A03.getParentFile(), i, this.A02, now));
    }
}

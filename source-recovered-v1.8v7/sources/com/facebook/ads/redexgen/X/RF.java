package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public final class RF implements C0H {
    public static byte[] A03;
    public File A00;
    public RandomAccessFile A01;
    public final C0C A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 76);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A03 = new byte[]{-38, 7, 7, 4, 7, -75, 7, -6, -10, -7, -2, 3, -4, -75, 1, -6, 3, -4, 9, -3, -75, 4, -5, -75, -5, -2, 1, -6, -75, -109, -64, -64, -67, -64, 110, -64, -77, -68, -81, -69, -73, -68, -75, 110, -76, -73, -70, -77, 110, -91, -21, -12, -9, -91, -24, -12, -14, -11, -15, -22, -7, -18, -12, -13, -90, 60, 65, -12, 33, 33, 30, 33, -49, 36, 34, 24, 29, 22, -49, 21, 24, 27, 20, -49, -7, 47, 58, 66, 57, 55, 58, 44, 47, -62, -17, -17, -20, -17, -99, -34, -19, -19, -30, -21, -31, -99, -32, -34, -32, -27, -30, -73, -99, -32, -34, -32, -27, -30, -99, -29, -26, -23, -30, -99, -24, 41, 59, -24, 44, 49, 59, 43, -24, 43, 41, 43, 48, 45, -84, -54, -41, -112, -35, -119, -52, -43, -50, -54, -41, -119, -49, -46, -43, -50, 32, -83, -38, -38, -41, -38, -120, -33, -38, -47, -36, -47, -42, -49, -120, -115, -52, -120, -54, -31, -36, -51, -37, -120, -36, -41, -120, -115, -37, -120, -50, -38, -41, -43, -120, -54, -35, -50, -50, -51, -38, -120, -33, -47, -36, -48, -120, -37, -47, -30, -51, -120, -115, -52, 11, 56, 56, 53, 56, -26, 41, 50, 53, 57, 47, 52, 45, -26, 44, 47, 50, 43, -26, -85, -1, -6, -85, -28, 45, 55, -28, 39, 51, 49, 52, 48, 41, 56, 41, 40, -27, -92, -47, -47, -50, -47, Byte.MAX_VALUE, -50, -49, -60, -51, -56, -51, -58, Byte.MAX_VALUE};
    }

    public RF(File file, C0C c0c) throws RH {
        File file2;
        try {
            if (c0c != null) {
                this.A02 = c0c;
                C0F.A06(file.getParentFile());
                boolean zExists = file.exists();
                if (zExists) {
                    file2 = file;
                } else {
                    file2 = new File(file.getParentFile(), file.getName() + A00(84, 9, 127));
                }
                this.A00 = file2;
                this.A01 = new RandomAccessFile(this.A00, zExists ? A00(154, 1, 98) : A00(65, 2, 126));
                return;
            }
            throw new NullPointerException();
        } catch (IOException e) {
            throw new RH(A00(67, 17, 99) + file + A00(k.AppCompatTheme_windowNoTitle, 14, k.AppCompatTheme_windowNoTitle), e);
        }
    }

    private boolean A02(File file) {
        return file.getName().endsWith(A00(84, 9, 127));
    }

    public final synchronized int A03() throws RH {
        try {
        } catch (IOException e) {
            throw new RH(A00(0, 29, 73) + this.A00, e);
        }
        return (int) this.A01.length();
    }

    public final File A04() {
        return this.A00;
    }

    public final synchronized void A05() throws RH {
        try {
            this.A01.setLength(0L);
        } catch (IOException e) {
            throw new RH(A00(138, 16, 29), e);
        }
    }

    public final synchronized void A06() throws RH {
        try {
            this.A01.close();
            this.A02.ADc(this.A00);
        } catch (IOException e) {
            throw new RH(A00(208, 19, k.AppCompatTheme_windowMinWidthMajor) + this.A00, e);
        }
    }

    public final synchronized void A07() throws RH {
        if (A09()) {
            return;
        }
        A06();
        File file = new File(this.A00.getParentFile(), this.A00.getName().substring(0, this.A00.getName().length() - A00(84, 9, 127).length()));
        File completedFile = this.A00;
        boolean renamed = completedFile.renameTo(file);
        if (renamed) {
            this.A00 = file;
            try {
                this.A01 = new RandomAccessFile(this.A00, A00(154, 1, 98));
                return;
            } catch (IOException e) {
                throw new RH(A00(245, 14, 19) + this.A00 + A00(k.AppCompatTheme_windowNoTitle, 14, k.AppCompatTheme_windowNoTitle), e);
            }
        }
        throw new RH(A00(29, 20, 2) + this.A00 + A00(227, 4, 63) + file + A00(49, 16, 57));
    }

    public final synchronized void A08(byte[] bArr, int i) throws RH {
        try {
            if (!A09()) {
                this.A01.seek(A03());
                this.A01.write(bArr, 0, i);
            } else {
                throw new RH(A00(93, 31, 49) + this.A00 + A00(231, 14, k.AppCompatTheme_windowFixedWidthMajor));
            }
        } catch (IOException e) {
            throw new RH(String.format(Locale.US, A00(155, 53, 28), Integer.valueOf(i), this.A01, Integer.valueOf(bArr.length)), e);
        }
    }

    public final synchronized boolean A09() {
        return !A02(this.A00);
    }
}

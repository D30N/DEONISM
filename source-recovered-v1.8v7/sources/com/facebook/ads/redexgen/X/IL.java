package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class IL {
    public static byte[] A02;
    public final File A00;
    public final File A01;

    static {
        A02();
    }

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 82);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{-118, -66, -67, -57, -93, -49, -43, -52, -60, -50, -121, -44, Byte.MIN_VALUE, -61, -46, -59, -63, -44, -59, Byte.MIN_VALUE, -65, -21, -15, -24, -32, -22, -93, -16, -100, -33, -18, -31, -35, -16, -31, -100, -32, -27, -18, -31, -33, -16, -21, -18, -11, -100, -54, -3, -8, -10, -14, -20, -49, -14, -11, -18, -109, -25, -30, -109, -43, -44, -42, -34, -24, -29, -109, -39, -36, -33, -40, -109, -62, -18, -12, -21, -29, -19, -90, -13, -97, -15, -28, -19, -32, -20, -28, -97, -27, -24, -21, -28, -97};
    }

    public IL(File file) {
        this.A01 = file;
        this.A00 = new File(file.getPath() + A00(0, 4, 10));
    }

    private void A01() {
        if (this.A00.exists()) {
            this.A01.delete();
            this.A00.renameTo(this.A01);
        }
    }

    public final InputStream A03() throws FileNotFoundException {
        A01();
        return new FileInputStream(this.A01);
    }

    public final OutputStream A04() throws IOException {
        if (this.A01.exists()) {
            if (!this.A00.exists()) {
                if (!this.A01.renameTo(this.A00)) {
                    Log.w(A00(46, 10, 55), A00(72, 21, 45) + this.A01 + A00(56, 16, 33) + this.A00);
                }
            } else {
                this.A01.delete();
            }
        }
        try {
            return new IK(this.A01);
        } catch (FileNotFoundException e) {
            File parent = this.A01.getParentFile();
            if (parent.mkdirs()) {
                try {
                    File parent2 = this.A01;
                    return new IK(parent2);
                } catch (FileNotFoundException e2) {
                    throw new IOException(A00(4, 16, 14) + this.A01, e2);
                }
            }
            throw new IOException(A00(20, 26, 42) + this.A01, e);
        }
    }

    public final void A05() {
        this.A01.delete();
        this.A00.delete();
    }

    public final void A06(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.A00.delete();
    }
}

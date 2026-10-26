package com.facebook.ads.redexgen.X;

import android.support.annotation.NonNull;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class IK extends OutputStream {
    public static byte[] A02;
    public boolean A00 = false;
    public final FileOutputStream A01;

    static {
        A01();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 73);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{-26, 1, 9, 12, 5, 4, -64, 20, 15, -64, 19, 25, 14, 3, -64, 6, 9, 12, 5, -64, 4, 5, 19, 3, 18, 9, 16, 20, 15, 18, -38, -65, -14, -19, -21, -25, -31, -60, -25, -22, -29};
    }

    public IK(File file) throws FileNotFoundException {
        this.A01 = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        IK ik = this;
        char c2 = ik.A00 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    ik = ik;
                    ik.A00 = true;
                    ik.flush();
                    c2 = 4;
                    break;
                case 4:
                    try {
                        ik = ik;
                        ik.A01.getFD().sync();
                    } catch (IOException e) {
                        Log.w(A00(31, 10, 53), A00(0, 31, 87), e);
                    }
                    ik.A01.close();
                    return;
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.A01.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.A01.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr) throws IOException {
        this.A01.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
        this.A01.write(bArr, i, i2);
    }
}

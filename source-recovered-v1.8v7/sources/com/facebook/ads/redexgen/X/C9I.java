package com.facebook.ads.redexgen.X;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.9I, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9I implements Closeable {
    public static byte[] A03;
    public C9J A00;
    public boolean A01;
    public final RandomAccessFile A02;

    static {
        A02();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 108);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A03 = new byte[]{36, 3, 27, 12, 1, 4, 9, 77, 29, 2, 30, 4, 25, 4, 2, 3, 87, 77, 69, 72, 9, 65, 72, 9, 68, 22, 19, 23, 40, 30, 25, 24, 4, 25, 45, 2, 7, 14, 75, 2, 24, 75, 10, 7, 25, 14, 10, 15, 18, 75, 8, 7, 4, 24, 14, 15};
    }

    public C9I(File file) throws IOException {
        this.A02 = new RandomAccessFile(file, A00(25, 3, 8));
        if (this.A02.length() != 8) {
            this.A02.setLength(8L);
            this.A00 = new C9J(0, 0);
            A01();
            return;
        }
        int i = this.A02.readInt();
        int i2 = this.A02.readInt();
        if (i < 0 || i2 < 0) {
            i = 0;
            i2 = 0;
        }
        this.A00 = new C9J(i, i2);
    }

    private void A01() throws IOException {
        this.A02.seek(0L);
        this.A02.writeInt(this.A00.A02());
        this.A02.writeInt(this.A00.A03());
        this.A02.getFD().sync();
    }

    public final C9J A03() throws IOException {
        if (!this.A01) {
            return this.A00;
        }
        throw new IOException(A00(28, 28, 7));
    }

    public final void A04(C9J c9j) throws IOException {
        char c2 = !this.A01 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c9j = c9j;
                    if (c9j.A02() < 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c9j = c9j;
                    if (c9j.A03() < 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    C9I c9i = this;
                    c9i.A00 = c9j;
                    c9i.A01();
                    return;
                case 5:
                    C9J c9j2 = c9j;
                    throw new IOException(String.format(Locale.US, A00(0, 25, 1), Integer.valueOf(c9j2.A02()), Integer.valueOf(c9j2.A03())));
                case 6:
                    throw new IOException(A00(28, 28, 7));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        this.A02.close();
    }
}

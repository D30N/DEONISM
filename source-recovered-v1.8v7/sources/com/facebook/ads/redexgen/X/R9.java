package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class R9 implements AnonymousClass03<Bitmap> {
    public static byte[] A06;
    public final int A00;
    public final int A01;
    public final String A02 = R9.class.getSimpleName();
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
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
        A06 = new byte[]{54, 29, 0, 25, 21, 4, 84, 29, 7, 84, 26, 1, 24, 24, 45, 16, 11, 13, 24, 28, 1, 7, 6, 72, 12, 29, 26, 1, 6, 15, 72, 14, 1, 4, 13, 72, 11, 7, 5, 24, 26, 13, 27, 27, 1, 7, 6, 12, 86, 79, 82};
    }

    public R9(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A01 = i;
        this.A00 = i2;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = z3;
    }

    public static AnonymousClass02<Bitmap> A00(Throwable th) {
        return new AnonymousClass02<>(false, null, th);
    }

    private void A03(File file, @Nullable Bitmap bitmap) throws IOException {
        if (bitmap == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            if (byteArrayOutputStream.size() >= 3145728) {
                return;
            }
            String str = file.getCanonicalPath() + A01(47, 4, 78);
            File file2 = new File(str);
            file2.createNewFile();
            fileOutputStream = new FileOutputStream(str);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.flush();
            fileInputStream = new FileInputStream(str);
            fileOutputStream2 = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i > 0) {
                    fileOutputStream2.write(bArr, 0, i);
                } else {
                    file2.delete();
                    return;
                }
            }
        } finally {
            C0N.A07(byteArrayOutputStream);
            C0N.A07(fileOutputStream);
            C0N.A07(fileInputStream);
            C0N.A07(fileOutputStream2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass03
    @SuppressLint({"CatchGeneralException"})
    public final AnonymousClass02<Bitmap> A3D(File file, C0M c0m) {
        if (!this.A04) {
            return new AnonymousClass02<>(true, null);
        }
        try {
            Bitmap bitmapA03 = C0N.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
            if (bitmapA03 != null) {
                return new AnonymousClass02<>(true, bitmapA03);
            }
            c0m.A7x(new RE(A01(0, 14, 24)));
            return A00(null);
        } catch (Throwable th) {
            file.delete();
            c0m.A7x(th);
            return A00(th);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass03
    @SuppressLint({"CatchGeneralException"})
    public final void A4A(File file, C0M c0m) throws RE {
        if (this.A03) {
            try {
                Bitmap bitmapA03 = C0N.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
                if (bitmapA03 != null) {
                    A03(file, bitmapA03);
                } else {
                    file.delete();
                    throw new RE(A01(0, 14, 24));
                }
            } catch (RE e) {
                c0m.A86(e);
                throw e;
            } catch (Throwable th) {
                c0m.A86(th);
                throw new RE(A01(14, 33, 4), th);
            }
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.Nullable;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0N {
    public static byte[] A00;

    static {
        A06();
    }

    public static String A04(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 61);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A00 = new byte[]{111, 96, 101, 108, 51, 38, 38};
    }

    public static int A00(BitmapFactory.Options options, int width, int inSampleSize) {
        int halfHeight = 0;
        int i = 0;
        int i2 = options.outHeight;
        int i3 = options.outWidth;
        int i4 = 1;
        int halfWidth = i2 <= inSampleSize ? 2 : 3;
        while (true) {
            switch (halfWidth) {
                case 2:
                    if (i3 <= width) {
                        halfWidth = 7;
                        break;
                    } else {
                        halfWidth = 3;
                        break;
                    }
                case 3:
                    i = i2 / 2;
                    halfHeight = i3 / 2;
                    halfWidth = 4;
                    break;
                case 4:
                    int halfWidth2 = i / i4;
                    if (halfWidth2 < inSampleSize) {
                        halfWidth = 7;
                        break;
                    } else {
                        halfWidth = 5;
                        break;
                    }
                case 5:
                    if (halfHeight / i4 < width) {
                        halfWidth = 7;
                        break;
                    } else {
                        halfWidth = 6;
                        break;
                    }
                case 6:
                    i4 *= 2;
                    halfWidth = 4;
                    break;
                case 7:
                    return i4;
            }
        }
    }

    public static Bitmap A01(InputStream inputStream, int i, int i2) throws IOException {
        Rect rect = null;
        C0O c0o = null;
        BitmapFactory.Options options = null;
        char c2 = Build.VERSION.SDK_INT < 19 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return BitmapFactory.decodeStream(inputStream);
                case 3:
                    inputStream = inputStream;
                    c0o = new C0O(inputStream);
                    c0o.mark(8192);
                    options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    rect = null;
                    BitmapFactory.decodeStream(c0o, null, options);
                    c0o.reset();
                    if (!c0o.A00()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    BitmapFactory.Options options2 = options;
                    options2.inSampleSize = A00(options2, i, i2);
                    options2.inJustDecodeBounds = false;
                    return BitmapFactory.decodeStream(c0o, rect, options2);
                case 5:
                    return BitmapFactory.decodeStream(c0o);
            }
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static Bitmap A02(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = A00(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    @SuppressLint({"CatchGeneralException"})
    @Nullable
    public static Bitmap A03(String str, int i, int i2, boolean z) throws IOException {
        Bitmap bitmapDecodeStream;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            if (i > 0 && i2 > 0) {
                if (z) {
                    bitmapDecodeStream = A01(fileInputStream, i, i2);
                } else {
                    bitmapDecodeStream = A02(str, i, i2);
                }
            } else {
                bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
            }
            A07(fileInputStream);
            return bitmapDecodeStream;
        } catch (Throwable th) {
            A07(null);
            throw th;
        }
    }

    @Nullable
    public static String A05(@Nullable File file) {
        if (file != null) {
            return A04(0, 7, 52) + file.getPath();
        }
        return null;
    }

    public static void A07(@Nullable Closeable closeable) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}

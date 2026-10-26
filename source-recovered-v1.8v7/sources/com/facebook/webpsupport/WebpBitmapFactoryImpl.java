package com.facebook.webpsupport;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import com.facebook.imagepipeline.nativecode.e;
import d.a.b.d.d;
import d.a.b.l.a;
import d.a.b.l.b;
import d.a.b.l.c;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

@d
/* loaded from: classes.dex */
public class WebpBitmapFactoryImpl implements b {
    public static final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private static b.a f1470b;

    /* renamed from: c, reason: collision with root package name */
    private static a f1471c;

    static {
        a = Build.VERSION.SDK_INT >= 11;
    }

    @d
    private static Bitmap createBitmap(int i, int i2, BitmapFactory.Options options) {
        Bitmap bitmap;
        return (!a || options == null || (bitmap = options.inBitmap) == null || !bitmap.isMutable()) ? f1471c.a(i, i2, Bitmap.Config.ARGB_8888) : options.inBitmap;
    }

    @Nullable
    private static byte[] d(InputStream inputStream, BitmapFactory.Options options) throws IOException {
        byte[] bArr;
        inputStream.mark(20);
        if (options == null || (bArr = options.inTempStorage) == null || bArr.length < 20) {
            bArr = new byte[20];
        }
        try {
            inputStream.read(bArr, 0, 20);
            inputStream.reset();
            return bArr;
        } catch (IOException unused) {
            return null;
        }
    }

    private static void e(String str) {
        b.a aVar = f1470b;
        if (aVar != null) {
            aVar.a(str, "decoding_failure");
        }
    }

    private static void f(Bitmap bitmap, BitmapFactory.Options options) {
        if (bitmap == null || options == null) {
            return;
        }
        int i = options.inDensity;
        if (i == 0) {
            if (!a || options.inBitmap == null) {
                return;
            }
            bitmap.setDensity(160);
            return;
        }
        bitmap.setDensity(i);
        int i2 = options.inTargetDensity;
        if (i2 == 0 || i == i2 || i == options.inScreenDensity || !options.inScaled) {
            return;
        }
        bitmap.setDensity(i2);
    }

    private static void g(Bitmap bitmap, BitmapFactory.Options options) {
        f(bitmap, options);
        if (options != null) {
            options.outMimeType = "image/webp";
        }
    }

    @d
    private static byte[] getInTempStorageFromOptions(@Nullable BitmapFactory.Options options) {
        byte[] bArr;
        return (options == null || (bArr = options.inTempStorage) == null) ? new byte[8192] : bArr;
    }

    @d
    private static float getScaleFromOptions(BitmapFactory.Options options) {
        if (options == null) {
            return 1.0f;
        }
        int i = options.inSampleSize;
        float f = i > 1 ? 1.0f / i : 1.0f;
        if (!options.inScaled) {
            return f;
        }
        int i2 = options.inDensity;
        int i3 = options.inTargetDensity;
        return (i2 == 0 || i3 == 0 || i2 == options.inScreenDensity) ? f : i3 / i2;
    }

    private static InputStream h(InputStream inputStream) {
        return !inputStream.markSupported() ? new BufferedInputStream(inputStream, 20) : inputStream;
    }

    @d
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {
        return hookDecodeByteArray(bArr, i, i2, null);
    }

    @d
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        Bitmap bitmapOriginalDecodeByteArray;
        e.a();
        if (c.a && c.h(bArr, i, i2)) {
            bitmapOriginalDecodeByteArray = nativeDecodeByteArray(bArr, i, i2, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
            if (bitmapOriginalDecodeByteArray == null) {
                e("webp_direct_decode_array");
            }
            g(bitmapOriginalDecodeByteArray, options);
        } else {
            bitmapOriginalDecodeByteArray = originalDecodeByteArray(bArr, i, i2, options);
            if (bitmapOriginalDecodeByteArray == null) {
                e("webp_direct_decode_array_failed_on_no_webp");
            }
        }
        return bitmapOriginalDecodeByteArray;
    }

    @d
    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, null);
    }

    @Nullable
    @d
    public static Bitmap hookDecodeFile(String str, BitmapFactory.Options options) throws IOException {
        Bitmap bitmapHookDecodeStream = null;
        try {
            try {
                bitmapHookDecodeStream = hookDecodeStream(new FileInputStream(str), null, options);
            } finally {
            }
        } catch (Exception unused) {
        }
        return bitmapHookDecodeStream;
    }

    @d
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, null, null);
    }

    @d
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) throws IOException {
        Bitmap bitmapOriginalDecodeFileDescriptor;
        e.a();
        long jNativeSeek = nativeSeek(fileDescriptor, 0L, false);
        if (jNativeSeek == -1) {
            Bitmap bitmapHookDecodeStream = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
            setPaddingDefaultValues(rect);
            return bitmapHookDecodeStream;
        }
        InputStream inputStreamH = h(new FileInputStream(fileDescriptor));
        try {
            byte[] bArrD = d(inputStreamH, options);
            if (c.a && c.h(bArrD, 0, 20)) {
                bitmapOriginalDecodeFileDescriptor = nativeDecodeStream(inputStreamH, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
                if (bitmapOriginalDecodeFileDescriptor == null) {
                    e("webp_direct_decode_fd");
                }
                setPaddingDefaultValues(rect);
                g(bitmapOriginalDecodeFileDescriptor, options);
            } else {
                nativeSeek(fileDescriptor, jNativeSeek, true);
                bitmapOriginalDecodeFileDescriptor = originalDecodeFileDescriptor(fileDescriptor, rect, options);
                if (bitmapOriginalDecodeFileDescriptor == null) {
                    e("webp_direct_decode_fd_failed_on_no_webp");
                }
            }
            try {
                return bitmapOriginalDecodeFileDescriptor;
            } catch (Throwable unused) {
                return bitmapOriginalDecodeFileDescriptor;
            }
        } finally {
            try {
                inputStreamH.close();
            } catch (Throwable unused2) {
            }
        }
    }

    @d
    public static Bitmap hookDecodeResource(Resources resources, int i) {
        return hookDecodeResource(resources, i, null);
    }

    @Nullable
    @d
    public static Bitmap hookDecodeResource(Resources resources, int i, BitmapFactory.Options options) throws Resources.NotFoundException, IOException {
        TypedValue typedValue = new TypedValue();
        Bitmap bitmapHookDecodeResourceStream = null;
        try {
            InputStream inputStreamOpenRawResource = resources.openRawResource(i, typedValue);
            try {
                bitmapHookDecodeResourceStream = hookDecodeResourceStream(resources, typedValue, inputStreamOpenRawResource, null, options);
                if (inputStreamOpenRawResource != null) {
                    inputStreamOpenRawResource.close();
                }
            } finally {
            }
        } catch (Exception unused) {
        }
        if (!a || bitmapHookDecodeResourceStream != null || options == null || options.inBitmap == null) {
            return bitmapHookDecodeResourceStream;
        }
        throw new IllegalArgumentException("Problem decoding into existing bitmap");
    }

    @d
    public static Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i = typedValue.density;
            if (i == 0) {
                i = 160;
            } else if (i != 65535) {
            }
            options.inDensity = i;
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return hookDecodeStream(inputStream, rect, options);
    }

    @d
    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, null, null);
    }

    @d
    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) throws IOException {
        Bitmap bitmapOriginalDecodeStream;
        e.a();
        InputStream inputStreamH = h(inputStream);
        byte[] bArrD = d(inputStreamH, options);
        if (c.a && c.h(bArrD, 0, 20)) {
            bitmapOriginalDecodeStream = nativeDecodeStream(inputStreamH, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
            if (bitmapOriginalDecodeStream == null) {
                e("webp_direct_decode_stream");
            }
            g(bitmapOriginalDecodeStream, options);
            setPaddingDefaultValues(rect);
        } else {
            bitmapOriginalDecodeStream = originalDecodeStream(inputStreamH, rect, options);
            if (bitmapOriginalDecodeStream == null) {
                e("webp_direct_decode_stream_failed_on_no_webp");
            }
        }
        return bitmapOriginalDecodeStream;
    }

    @d
    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options, float f, byte[] bArr2);

    @d
    private static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f, byte[] bArr);

    @d
    private static native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z);

    @d
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {
        return BitmapFactory.decodeByteArray(bArr, i, i2);
    }

    @d
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return BitmapFactory.decodeByteArray(bArr, i, i2, options);
    }

    @d
    private static Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    @d
    private static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    @d
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    @d
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    @d
    private static Bitmap originalDecodeResource(Resources resources, int i) {
        return BitmapFactory.decodeResource(resources, i);
    }

    @d
    private static Bitmap originalDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(resources, i, options);
    }

    @d
    private static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    @d
    private static Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    @d
    private static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    @d
    private static void setBitmapSize(@Nullable BitmapFactory.Options options, int i, int i2) {
        if (options != null) {
            options.outWidth = i;
            options.outHeight = i2;
        }
    }

    @d
    private static boolean setOutDimensions(BitmapFactory.Options options, int i, int i2) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i;
        options.outHeight = i2;
        return true;
    }

    @d
    private static void setPaddingDefaultValues(@Nullable Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    @SuppressLint({"NewApi"})
    @d
    private static boolean shouldPremultiply(BitmapFactory.Options options) {
        if (Build.VERSION.SDK_INT < 19 || options == null) {
            return true;
        }
        return options.inPremultiplied;
    }

    @Override // d.a.b.l.b
    public void a(a aVar) {
        f1471c = aVar;
    }

    @Override // d.a.b.l.b
    public void b(b.a aVar) {
        f1470b = aVar;
    }

    @Override // d.a.b.l.b
    public Bitmap c(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return hookDecodeFileDescriptor(fileDescriptor, rect, options);
    }
}

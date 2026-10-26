package d.a.b.l;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class c {
    public static final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f2407b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public static b f2408c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f2409d;
    private static final byte[] e;
    private static final byte[] f;
    private static final byte[] g;
    private static final byte[] h;
    private static final byte[] i;

    static {
        a = Build.VERSION.SDK_INT <= 17;
        int i2 = Build.VERSION.SDK_INT;
        f2407b = e();
        f2408c = null;
        f2409d = false;
        e = a("RIFF");
        f = a("WEBP");
        g = a("VP8 ");
        h = a("VP8L");
        i = a("VP8X");
    }

    private static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }

    public static boolean b(byte[] bArr, int i2) {
        return j(bArr, i2 + 12, i) && ((bArr[i2 + 20] & 2) == 2);
    }

    public static boolean c(byte[] bArr, int i2, int i3) {
        return i3 >= 21 && j(bArr, i2 + 12, i);
    }

    public static boolean d(byte[] bArr, int i2) {
        return j(bArr, i2 + 12, i) && ((bArr[i2 + 20] & 16) == 16);
    }

    private static boolean e() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 17) {
            return false;
        }
        if (i2 == 17) {
            byte[] bArrDecode = Base64.decode("UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==", 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
            if (options.outHeight != 1 || options.outWidth != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(byte[] bArr, int i2) {
        return j(bArr, i2 + 12, h);
    }

    public static boolean g(byte[] bArr, int i2) {
        return j(bArr, i2 + 12, g);
    }

    public static boolean h(byte[] bArr, int i2, int i3) {
        return i3 >= 20 && j(bArr, i2, e) && j(bArr, i2 + 8, f);
    }

    @Nullable
    public static b i() {
        if (f2409d) {
            return f2408c;
        }
        b bVar = null;
        try {
            bVar = (b) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        } catch (Throwable unused) {
        }
        f2409d = true;
        return bVar;
    }

    private static boolean j(byte[] bArr, int i2, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i2 > bArr.length) {
            return false;
        }
        for (int i3 = 0; i3 < bArr2.length; i3++) {
            if (bArr[i3 + i2] != bArr2[i3]) {
                return false;
            }
        }
        return true;
    }
}

package d.b.a.a.e.e;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class u4 {
    static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f2851b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f2851b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = f2851b;
        w3.b(bArr2, 0, bArr2.length, false);
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int c(boolean z) {
        return z ? 1231 : 1237;
    }

    static <T> T d(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    static Object e(Object obj, Object obj2) {
        c6 c6VarD = ((z5) obj).d();
        c6VarD.p((z5) obj2);
        return c6VarD.h();
    }

    static <T> T f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static boolean g(z5 z5Var) {
        if (!(z5Var instanceof d3)) {
            return false;
        }
        return false;
    }

    public static boolean h(byte[] bArr) {
        return t7.f(bArr);
    }

    public static String i(byte[] bArr) {
        return new String(bArr, a);
    }

    public static int j(byte[] bArr) {
        int length = bArr.length;
        int iA = a(length, bArr, 0, length);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}

package d.b.a.a.e.e;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class l3 implements Serializable, Iterable<Byte> {

    /* renamed from: c, reason: collision with root package name */
    public static final l3 f2755c = new u3(u4.f2851b);

    /* renamed from: d, reason: collision with root package name */
    private static final q3 f2756d;

    /* renamed from: b, reason: collision with root package name */
    private int f2757b = 0;

    static {
        k3 k3Var = null;
        f2756d = e3.b() ? new t3(k3Var) : new o3(k3Var);
    }

    l3() {
    }

    public static l3 k(String str) {
        return new u3(str.getBytes(u4.a));
    }

    public static l3 l(byte[] bArr, int i, int i2) {
        p(i, i + i2, bArr.length);
        return new u3(f2756d.a(bArr, i, i2));
    }

    static int p(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    static s3 s(int i) {
        return new s3(i, null);
    }

    public abstract byte c(int i);

    public abstract boolean equals(Object obj);

    public abstract int h();

    public final int hashCode() {
        int i = this.f2757b;
        if (i == 0) {
            int iH = h();
            i = i(iH, 0, iH);
            if (i == 0) {
                i = 1;
            }
            this.f2757b = i;
        }
        return i;
    }

    protected abstract int i(int i, int i2, int i3);

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new k3(this);
    }

    public abstract l3 j(int i, int i2);

    protected abstract String m(Charset charset);

    abstract void n(i3 i3Var);

    abstract byte o(int i);

    public final String r() {
        return h() == 0 ? "" : m(u4.a);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(h());
        objArr[2] = h() <= 50 ? h7.a(this) : String.valueOf(h7.a(j(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract boolean u();

    protected final int v() {
        return this.f2757b;
    }
}

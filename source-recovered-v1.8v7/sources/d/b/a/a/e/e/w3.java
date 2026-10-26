package d.b.a.a.e.e;

/* loaded from: classes.dex */
public abstract class w3 {
    private w3() {
    }

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    static w3 b(byte[] bArr, int i, int i2, boolean z) {
        x3 x3Var = new x3(bArr, 0, i2, false);
        try {
            x3Var.d(i2);
            return x3Var;
        } catch (y4 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int c(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }
}

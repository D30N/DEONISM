package d.b.a.a.e.e;

/* loaded from: classes.dex */
final class x3 extends w3 {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f2878b;

    /* renamed from: c, reason: collision with root package name */
    private int f2879c;

    /* renamed from: d, reason: collision with root package name */
    private int f2880d;
    private int e;

    private x3(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.e = Integer.MAX_VALUE;
        this.a = i2 + i;
        this.f2879c = i;
        this.f2880d = i;
    }

    private final void f() {
        int i = this.a + this.f2878b;
        this.a = i;
        int i2 = i - this.f2880d;
        int i3 = this.e;
        if (i2 <= i3) {
            this.f2878b = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f2878b = i4;
        this.a = i - i4;
    }

    public final int d(int i) {
        if (i < 0) {
            throw y4.b();
        }
        int iE = i + e();
        int i2 = this.e;
        if (iE > i2) {
            throw y4.a();
        }
        this.e = iE;
        f();
        return i2;
    }

    public final int e() {
        return this.f2879c - this.f2880d;
    }
}

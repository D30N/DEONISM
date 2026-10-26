package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;

/* loaded from: classes.dex */
final class q6 implements x5 {
    private final z5 a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2810b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f2811c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2812d;

    q6(z5 z5Var, String str, Object[] objArr) {
        this.a = z5Var;
        this.f2810b = str;
        this.f2811c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f2812d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f2812d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // d.b.a.a.e.e.x5
    public final int a() {
        return (this.f2812d & 1) == 1 ? r4.f.i : r4.f.j;
    }

    @Override // d.b.a.a.e.e.x5
    public final boolean b() {
        return (this.f2812d & 2) == 2;
    }

    @Override // d.b.a.a.e.e.x5
    public final z5 c() {
        return this.a;
    }

    final String d() {
        return this.f2810b;
    }

    final Object[] e() {
        return this.f2811c;
    }
}

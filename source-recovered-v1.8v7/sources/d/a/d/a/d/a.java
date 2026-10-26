package d.a.d.a.d;

import d.a.d.a.a.d;

/* loaded from: classes.dex */
public class a implements b {
    private final d a;

    /* renamed from: b, reason: collision with root package name */
    private long f2436b = -1;

    public a(d dVar) {
        this.a = dVar;
    }

    @Override // d.a.d.a.d.b
    public long a(long j) {
        long jD = d();
        long jF = 0;
        if (jD == 0) {
            return -1L;
        }
        if (!e() && j / d() >= this.a.b()) {
            return -1L;
        }
        long j2 = j % jD;
        int iA = this.a.a();
        for (int i = 0; i < iA && jF <= j2; i++) {
            jF += this.a.f(i);
        }
        return j + (jF - j2);
    }

    @Override // d.a.d.a.d.b
    public int b(long j, long j2) {
        long jD = d();
        if (jD == 0) {
            return c(0L);
        }
        if (e() || j / jD < this.a.b()) {
            return c(j % jD);
        }
        return -1;
    }

    int c(long j) {
        int i = 0;
        long jF = 0;
        do {
            jF += this.a.f(i);
            i++;
        } while (j >= jF);
        return i - 1;
    }

    public long d() {
        long j = this.f2436b;
        if (j != -1) {
            return j;
        }
        this.f2436b = 0L;
        int iA = this.a.a();
        for (int i = 0; i < iA; i++) {
            this.f2436b += this.a.f(i);
        }
        return this.f2436b;
    }

    public boolean e() {
        return this.a.b() == 0;
    }
}

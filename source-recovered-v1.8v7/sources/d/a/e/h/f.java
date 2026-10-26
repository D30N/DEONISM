package d.a.e.h;

import d.a.b.d.i;
import d.a.b.d.m;
import java.io.IOException;

/* loaded from: classes.dex */
public class f {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f2555b;

    /* renamed from: c, reason: collision with root package name */
    private int f2556c;

    /* renamed from: d, reason: collision with root package name */
    private int f2557d;
    private int e;
    private int f;
    private boolean g;
    private final d.a.b.g.a h;

    public f(d.a.b.g.a aVar) {
        i.g(aVar);
        this.h = aVar;
        this.f2556c = 0;
        this.f2555b = 0;
        this.f2557d = 0;
        this.f = 0;
        this.e = 0;
        this.a = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0081, code lost:
    
        if (r10.a == 6) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0085, code lost:
    
        if (r10.e == r0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0087, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.io.InputStream r11) throws X {
        /*
            r10 = this;
            int r0 = r10.e
        L2:
            int r1 = r10.a     // Catch: java.io.IOException -> L89
            r2 = 0
            r3 = 1
            r4 = 6
            if (r1 == r4) goto L7f
            int r1 = r11.read()     // Catch: java.io.IOException -> L89
            r5 = -1
            if (r1 == r5) goto L7f
            int r5 = r10.f2556c     // Catch: java.io.IOException -> L89
            int r5 = r5 + r3
            r10.f2556c = r5     // Catch: java.io.IOException -> L89
            boolean r6 = r10.g     // Catch: java.io.IOException -> L89
            if (r6 == 0) goto L1e
            r10.a = r4     // Catch: java.io.IOException -> L89
            r10.g = r2     // Catch: java.io.IOException -> L89
            return r2
        L1e:
            int r6 = r10.a     // Catch: java.io.IOException -> L89
            r7 = 255(0xff, float:3.57E-43)
            if (r6 == 0) goto L79
            r8 = 2
            if (r6 == r3) goto L74
            r4 = 3
            if (r6 == r8) goto L71
            r9 = 4
            if (r6 == r4) goto L4b
            r3 = 5
            if (r6 == r9) goto L48
            if (r6 == r3) goto L36
            d.a.b.d.i.i(r2)     // Catch: java.io.IOException -> L89
            goto L7c
        L36:
            int r2 = r10.f2555b     // Catch: java.io.IOException -> L89
            int r2 = r2 << 8
            int r2 = r2 + r1
            int r2 = r2 - r8
            long r3 = (long) r2     // Catch: java.io.IOException -> L89
            d.a.b.k.d.a(r11, r3)     // Catch: java.io.IOException -> L89
            int r3 = r10.f2556c     // Catch: java.io.IOException -> L89
            int r3 = r3 + r2
            r10.f2556c = r3     // Catch: java.io.IOException -> L89
        L45:
            r10.a = r8     // Catch: java.io.IOException -> L89
            goto L7c
        L48:
            r10.a = r3     // Catch: java.io.IOException -> L89
            goto L7c
        L4b:
            if (r1 != r7) goto L50
        L4d:
            r10.a = r4     // Catch: java.io.IOException -> L89
            goto L7c
        L50:
            if (r1 != 0) goto L53
            goto L45
        L53:
            r2 = 217(0xd9, float:3.04E-43)
            if (r1 != r2) goto L5f
            r10.g = r3     // Catch: java.io.IOException -> L89
            int r5 = r5 + (-2)
            r10.f(r5)     // Catch: java.io.IOException -> L89
            goto L45
        L5f:
            r2 = 218(0xda, float:3.05E-43)
            if (r1 != r2) goto L68
            int r5 = r5 + (-2)
            r10.f(r5)     // Catch: java.io.IOException -> L89
        L68:
            boolean r2 = b(r1)     // Catch: java.io.IOException -> L89
            if (r2 == 0) goto L45
            r10.a = r9     // Catch: java.io.IOException -> L89
            goto L7c
        L71:
            if (r1 != r7) goto L7c
            goto L4d
        L74:
            r2 = 216(0xd8, float:3.03E-43)
            if (r1 != r2) goto L4d
            goto L45
        L79:
            if (r1 != r7) goto L4d
            goto L48
        L7c:
            r10.f2555b = r1     // Catch: java.io.IOException -> L89
            goto L2
        L7f:
            int r11 = r10.a
            if (r11 == r4) goto L88
            int r11 = r10.e
            if (r11 == r0) goto L88
            r2 = 1
        L88:
            return r2
        L89:
            r11 = move-exception
            d.a.b.d.m.a(r11)
            r11 = 0
            goto L90
        L8f:
            throw r11
        L90:
            goto L8f
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.e.h.f.a(java.io.InputStream):boolean");
    }

    private static boolean b(int i) {
        if (i == 1) {
            return false;
        }
        return ((i >= 208 && i <= 215) || i == 217 || i == 216) ? false : true;
    }

    private void f(int i) {
        if (this.f2557d > 0) {
            this.f = i;
        }
        int i2 = this.f2557d;
        this.f2557d = i2 + 1;
        this.e = i2;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.e;
    }

    public boolean e() {
        return this.g;
    }

    public boolean g(d.a.e.j.e eVar) {
        if (this.a == 6 || eVar.s() <= this.f2556c) {
            return false;
        }
        d.a.b.g.f fVar = new d.a.b.g.f(eVar.p(), this.h.get(16384), this.h);
        try {
            try {
                d.a.b.k.d.a(fVar, this.f2556c);
                return a(fVar);
            } catch (IOException e) {
                m.a(e);
                throw null;
            }
        } finally {
            d.a.b.d.b.b(fVar);
        }
    }
}

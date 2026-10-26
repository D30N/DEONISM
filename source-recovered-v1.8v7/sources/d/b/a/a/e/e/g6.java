package d.b.a.a.e.e;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class g6<T> implements s6<T> {
    private final z5 a;

    /* renamed from: b, reason: collision with root package name */
    private final l7<?, ?> f2697b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2698c;

    /* renamed from: d, reason: collision with root package name */
    private final g4<?> f2699d;

    private g6(l7<?, ?> l7Var, g4<?> g4Var, z5 z5Var) {
        this.f2697b = l7Var;
        this.f2698c = g4Var.e(z5Var);
        this.f2699d = g4Var;
        this.a = z5Var;
    }

    static <T> g6<T> j(l7<?, ?> l7Var, g4<?> g4Var, z5 z5Var) {
        return new g6<>(l7Var, g4Var, z5Var);
    }

    @Override // d.b.a.a.e.e.s6
    public final T a() {
        return (T) this.a.g().h();
    }

    @Override // d.b.a.a.e.e.s6
    public final int b(T t) {
        int iHashCode = this.f2697b.f(t).hashCode();
        return this.f2698c ? (iHashCode * 53) + this.f2699d.b(t).hashCode() : iHashCode;
    }

    @Override // d.b.a.a.e.e.s6
    public final boolean c(T t, T t2) {
        if (!this.f2697b.f(t).equals(this.f2697b.f(t2))) {
            return false;
        }
        if (this.f2698c) {
            return this.f2699d.b(t).equals(this.f2699d.b(t2));
        }
        return true;
    }

    @Override // d.b.a.a.e.e.s6
    public final void d(T t) {
        this.f2697b.j(t);
        this.f2699d.g(t);
    }

    @Override // d.b.a.a.e.e.s6
    public final int e(T t) {
        l7<?, ?> l7Var = this.f2697b;
        int iK = l7Var.k(l7Var.f(t)) + 0;
        return this.f2698c ? iK + this.f2699d.b(t).s() : iK;
    }

    @Override // d.b.a.a.e.e.s6
    public final boolean f(T t) {
        return this.f2699d.b(t).r();
    }

    @Override // d.b.a.a.e.e.s6
    public final void g(T t, T t2) {
        u6.o(this.f2697b, t, t2);
        if (this.f2698c) {
            u6.m(this.f2699d, t, t2);
        }
    }

    @Override // d.b.a.a.e.e.s6
    public final void h(T t, f8 f8Var) {
        Iterator itP = this.f2699d.b(t).p();
        while (itP.hasNext()) {
            Map.Entry entry = (Map.Entry) itP.next();
            j4 j4Var = (j4) entry.getKey();
            if (j4Var.c() != g8.MESSAGE || j4Var.d() || j4Var.e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            f8Var.b(j4Var.a(), entry instanceof g5 ? ((g5) entry).a().d() : entry.getValue());
        }
        l7<?, ?> l7Var = this.f2697b;
        l7Var.g(l7Var.f(t), f8Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099 A[EDGE_INSN: B:57:0x0099->B:34:0x0099 BREAK  A[LOOP:1: B:18:0x0053->B:62:0x0053], SYNTHETIC] */
    @Override // d.b.a.a.e.e.s6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(T r10, byte[] r11, int r12, int r13, d.b.a.a.e.e.g3 r14) throws d.b.a.a.e.e.y4 {
        /*
            r9 = this;
            r0 = r10
            d.b.a.a.e.e.r4 r0 = (d.b.a.a.e.e.r4) r0
            d.b.a.a.e.e.k7 r1 = r0.zzb
            d.b.a.a.e.e.k7 r2 = d.b.a.a.e.e.k7.a()
            if (r1 != r2) goto L11
            d.b.a.a.e.e.k7 r1 = d.b.a.a.e.e.k7.g()
            r0.zzb = r1
        L11:
            d.b.a.a.e.e.r4$b r10 = (d.b.a.a.e.e.r4.b) r10
            r10.E()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = d.b.a.a.e.e.h3.i(r11, r12, r14)
            int r2 = r14.a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            d.b.a.a.e.e.g4<?> r12 = r9.f2699d
            d.b.a.a.e.e.e4 r0 = r14.f2695d
            d.b.a.a.e.e.z5 r3 = r9.a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.c(r0, r3, r5)
            r0 = r12
            d.b.a.a.e.e.r4$d r0 = (d.b.a.a.e.e.r4.d) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = d.b.a.a.e.e.h3.c(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            d.b.a.a.e.e.p6.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = d.b.a.a.e.e.h3.a(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = d.b.a.a.e.e.h3.i(r11, r4, r14)
            int r5 = r14.a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = d.b.a.a.e.e.h3.q(r11, r4, r14)
            java.lang.Object r2 = r14.f2694c
            d.b.a.a.e.e.l3 r2 = (d.b.a.a.e.e.l3) r2
            goto L53
        L72:
            d.b.a.a.e.e.p6.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = d.b.a.a.e.e.h3.i(r11, r4, r14)
            int r12 = r14.a
            d.b.a.a.e.e.g4<?> r0 = r9.f2699d
            d.b.a.a.e.e.e4 r5 = r14.f2695d
            d.b.a.a.e.e.z5 r6 = r9.a
            java.lang.Object r0 = r0.c(r5, r6, r12)
            d.b.a.a.e.e.r4$d r0 = (d.b.a.a.e.e.r4.d) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = d.b.a.a.e.e.h3.a(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.c(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            d.b.a.a.e.e.y4 r10 = d.b.a.a.e.e.y4.e()
            goto Lad
        Lac:
            throw r10
        Lad:
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.a.a.e.e.g6.i(java.lang.Object, byte[], int, int, d.b.a.a.e.e.g3):void");
    }
}

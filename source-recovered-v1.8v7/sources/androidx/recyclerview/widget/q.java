package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class q {
    final b.d.g<RecyclerView.d0, a> a = new b.d.g<>();

    /* renamed from: b, reason: collision with root package name */
    final b.d.d<RecyclerView.d0> f671b = new b.d.d<>();

    static class a {

        /* renamed from: d, reason: collision with root package name */
        static b.g.k.e<a> f672d = new b.g.k.f(20);
        int a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView.l.c f673b;

        /* renamed from: c, reason: collision with root package name */
        RecyclerView.l.c f674c;

        private a() {
        }

        static void a() {
            while (f672d.b() != null) {
            }
        }

        static a b() {
            a aVarB = f672d.b();
            return aVarB == null ? new a() : aVarB;
        }

        static void c(a aVar) {
            aVar.a = 0;
            aVar.f673b = null;
            aVar.f674c = null;
            f672d.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.d0 d0Var);

        void b(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    q() {
    }

    private RecyclerView.l.c l(RecyclerView.d0 d0Var, int i) {
        a aVarM;
        RecyclerView.l.c cVar;
        int iF = this.a.f(d0Var);
        if (iF >= 0 && (aVarM = this.a.m(iF)) != null) {
            int i2 = aVarM.a;
            if ((i2 & i) != 0) {
                aVarM.a = (i ^ (-1)) & i2;
                if (i == 4) {
                    cVar = aVarM.f673b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarM.f674c;
                }
                if ((aVarM.a & 12) == 0) {
                    this.a.k(iF);
                    a.c(aVarM);
                }
                return cVar;
            }
        }
        return null;
    }

    void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVarB = this.a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.a.put(d0Var, aVarB);
        }
        aVarB.a |= 2;
        aVarB.f673b = cVar;
    }

    void b(RecyclerView.d0 d0Var) {
        a aVarB = this.a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.a.put(d0Var, aVarB);
        }
        aVarB.a |= 1;
    }

    void c(long j, RecyclerView.d0 d0Var) {
        this.f671b.o(j, d0Var);
    }

    void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVarB = this.a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.a.put(d0Var, aVarB);
        }
        aVarB.f674c = cVar;
        aVarB.a |= 8;
    }

    void e(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVarB = this.a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.a.put(d0Var, aVarB);
        }
        aVarB.f673b = cVar;
        aVarB.a |= 4;
    }

    void f() {
        this.a.clear();
        this.f671b.c();
    }

    RecyclerView.d0 g(long j) {
        return this.f671b.g(j);
    }

    boolean h(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        return (aVar == null || (aVar.a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        return (aVar == null || (aVar.a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.d0 d0Var) {
        p(d0Var);
    }

    RecyclerView.l.c m(RecyclerView.d0 d0Var) {
        return l(d0Var, 8);
    }

    RecyclerView.l.c n(RecyclerView.d0 d0Var) {
        return l(d0Var, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void o(androidx.recyclerview.widget.q.b r7) {
        /*
            r6 = this;
            b.d.g<androidx.recyclerview.widget.RecyclerView$d0, androidx.recyclerview.widget.q$a> r0 = r6.a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L63
            b.d.g<androidx.recyclerview.widget.RecyclerView$d0, androidx.recyclerview.widget.q$a> r1 = r6.a
            java.lang.Object r1 = r1.i(r0)
            androidx.recyclerview.widget.RecyclerView$d0 r1 = (androidx.recyclerview.widget.RecyclerView.d0) r1
            b.d.g<androidx.recyclerview.widget.RecyclerView$d0, androidx.recyclerview.widget.q$a> r2 = r6.a
            java.lang.Object r2 = r2.k(r0)
            androidx.recyclerview.widget.q$a r2 = (androidx.recyclerview.widget.q.a) r2
            int r3 = r2.a
            r4 = r3 & 3
            r5 = 3
            if (r4 != r5) goto L25
        L21:
            r7.a(r1)
            goto L5d
        L25:
            r4 = r3 & 1
            if (r4 == 0) goto L34
            androidx.recyclerview.widget.RecyclerView$l$c r3 = r2.f673b
            if (r3 != 0) goto L2e
            goto L21
        L2e:
            androidx.recyclerview.widget.RecyclerView$l$c r4 = r2.f674c
        L30:
            r7.c(r1, r3, r4)
            goto L5d
        L34:
            r4 = r3 & 14
            r5 = 14
            if (r4 != r5) goto L42
        L3a:
            androidx.recyclerview.widget.RecyclerView$l$c r3 = r2.f673b
            androidx.recyclerview.widget.RecyclerView$l$c r4 = r2.f674c
            r7.b(r1, r3, r4)
            goto L5d
        L42:
            r4 = r3 & 12
            r5 = 12
            if (r4 != r5) goto L50
            androidx.recyclerview.widget.RecyclerView$l$c r3 = r2.f673b
            androidx.recyclerview.widget.RecyclerView$l$c r4 = r2.f674c
            r7.d(r1, r3, r4)
            goto L5d
        L50:
            r4 = r3 & 4
            if (r4 == 0) goto L58
            androidx.recyclerview.widget.RecyclerView$l$c r3 = r2.f673b
            r4 = 0
            goto L30
        L58:
            r3 = r3 & 8
            if (r3 == 0) goto L5d
            goto L3a
        L5d:
            androidx.recyclerview.widget.q.a.c(r2)
            int r0 = r0 + (-1)
            goto L8
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.q.o(androidx.recyclerview.widget.q$b):void");
    }

    void p(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            return;
        }
        aVar.a &= -2;
    }

    void q(RecyclerView.d0 d0Var) {
        int iS = this.f671b.s() - 1;
        while (true) {
            if (iS < 0) {
                break;
            }
            if (d0Var == this.f671b.t(iS)) {
                this.f671b.r(iS);
                break;
            }
            iS--;
        }
        a aVarRemove = this.a.remove(d0Var);
        if (aVarRemove != null) {
            a.c(aVarRemove);
        }
    }
}

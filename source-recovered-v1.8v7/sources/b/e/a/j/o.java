package b.e.a.j;

import b.e.a.j.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class o {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f827b;

    /* renamed from: c, reason: collision with root package name */
    private int f828c;

    /* renamed from: d, reason: collision with root package name */
    private int f829d;
    private ArrayList<a> e = new ArrayList<>();

    static class a {
        private e a;

        /* renamed from: b, reason: collision with root package name */
        private e f830b;

        /* renamed from: c, reason: collision with root package name */
        private int f831c;

        /* renamed from: d, reason: collision with root package name */
        private e.c f832d;
        private int e;

        public a(e eVar) {
            this.a = eVar;
            this.f830b = eVar.i();
            this.f831c = eVar.d();
            this.f832d = eVar.h();
            this.e = eVar.c();
        }

        public void a(f fVar) {
            fVar.h(this.a.j()).b(this.f830b, this.f831c, this.f832d, this.e);
        }

        public void b(f fVar) {
            int iC;
            e eVarH = fVar.h(this.a.j());
            this.a = eVarH;
            if (eVarH != null) {
                this.f830b = eVarH.i();
                this.f831c = this.a.d();
                this.f832d = this.a.h();
                iC = this.a.c();
            } else {
                this.f830b = null;
                iC = 0;
                this.f831c = 0;
                this.f832d = e.c.STRONG;
            }
            this.e = iC;
        }
    }

    public o(f fVar) {
        this.a = fVar.G();
        this.f827b = fVar.H();
        this.f828c = fVar.D();
        this.f829d = fVar.r();
        ArrayList<e> arrayListI = fVar.i();
        int size = arrayListI.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new a(arrayListI.get(i)));
        }
    }

    public void a(f fVar) {
        fVar.C0(this.a);
        fVar.D0(this.f827b);
        fVar.y0(this.f828c);
        fVar.b0(this.f829d);
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            this.e.get(i).a(fVar);
        }
    }

    public void b(f fVar) {
        this.a = fVar.G();
        this.f827b = fVar.H();
        this.f828c = fVar.D();
        this.f829d = fVar.r();
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            this.e.get(i).b(fVar);
        }
    }
}

package d.a.e.f;

import com.facebook.imagepipeline.producers.k;
import com.facebook.imagepipeline.producers.l0;
import com.facebook.imagepipeline.producers.s0;
import d.a.b.d.i;
import d.a.e.k.d;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
@ThreadSafe
/* loaded from: classes.dex */
public abstract class a<T> extends com.facebook.datasource.a<T> {
    private final s0 g;
    private final d h;

    /* renamed from: d.a.e.f.a$a, reason: collision with other inner class name */
    class C0092a extends com.facebook.imagepipeline.producers.b<T> {
        C0092a() {
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void g() {
            a.this.y();
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void h(Throwable th) {
            a.this.z(th);
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void i(@Nullable T t, int i) {
            a.this.A(t, i);
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void j(float f) {
            a.this.p(f);
        }
    }

    protected a(l0<T> l0Var, s0 s0Var, d dVar) {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("AbstractProducerToDataSourceAdapter()");
        }
        this.g = s0Var;
        this.h = dVar;
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
        }
        this.h.g(this.g);
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("AbstractProducerToDataSourceAdapter()->produceResult");
        }
        l0Var.a(x(), s0Var);
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
    }

    private k<T> x() {
        return new C0092a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void y() {
        i.i(j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(Throwable th) {
        if (super.n(th)) {
            this.h.j(this.g, th);
        }
    }

    protected void A(@Nullable T t, int i) {
        boolean zE = com.facebook.imagepipeline.producers.b.e(i);
        if (super.r(t, zE) && zE) {
            this.h.f(this.g);
        }
    }

    @Override // com.facebook.datasource.a, com.facebook.datasource.c
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (super.d()) {
            return true;
        }
        this.h.a(this.g);
        this.g.q();
        return true;
    }
}

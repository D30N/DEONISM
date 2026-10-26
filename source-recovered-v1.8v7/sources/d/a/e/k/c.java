package d.a.e.k;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class c implements e {
    private final List<e> a;

    public c(Set<e> set) {
        this.a = new ArrayList(set.size());
        for (e eVar : set) {
            if (eVar != null) {
                this.a.add(eVar);
            }
        }
    }

    public c(e... eVarArr) {
        this.a = new ArrayList(eVarArr.length);
        for (e eVar : eVarArr) {
            if (eVar != null) {
                this.a.add(eVar);
            }
        }
    }

    private void m(String str, Throwable th) {
        d.a.b.e.a.i("ForwardingRequestListener", str, th);
    }

    @Override // d.a.e.k.e
    public void a(d.a.e.l.a aVar, String str, Throwable th, boolean z) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).a(aVar, str, th, z);
            } catch (Exception e) {
                m("InternalListener exception in onRequestFailure", e);
            }
        }
    }

    @Override // d.a.e.k.e
    public void b(d.a.e.l.a aVar, Object obj, String str, boolean z) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).b(aVar, obj, str, z);
            } catch (Exception e) {
                m("InternalListener exception in onRequestStart", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void c(String str, String str2, String str3) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).c(str, str2, str3);
            } catch (Exception e) {
                m("InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void d(String str, String str2, @Nullable Map<String, String> map) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).d(str, str2, map);
            } catch (Exception e) {
                m("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void e(String str, String str2) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).e(str, str2);
            } catch (Exception e) {
                m("InternalListener exception in onProducerStart", e);
            }
        }
    }

    @Override // d.a.e.k.e
    public void f(d.a.e.l.a aVar, String str, boolean z) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).f(aVar, str, z);
            } catch (Exception e) {
                m("InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void g(String str, String str2, Throwable th, @Nullable Map<String, String> map) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).g(str, str2, th, map);
            } catch (Exception e) {
                m("InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void h(String str, String str2, @Nullable Map<String, String> map) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).h(str, str2, map);
            } catch (Exception e) {
                m("InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    @Override // d.a.e.k.e
    public void i(String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).i(str);
            } catch (Exception e) {
                m("InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public boolean j(String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (this.a.get(i).j(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void k(String str, String str2, boolean z) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).k(str, str2, z);
            } catch (Exception e) {
                m("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    public void l(e eVar) {
        this.a.add(eVar);
    }
}

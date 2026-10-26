package d.a.e.h;

import d.a.b.d.i;
import d.a.e.j.h;
import d.a.e.j.j;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class g implements e {
    private final c a;

    private static class b implements c {
        private b() {
        }

        @Override // d.a.e.h.g.c
        public int a() {
            return 0;
        }

        @Override // d.a.e.h.g.c
        public List<Integer> b() {
            return Collections.EMPTY_LIST;
        }
    }

    public interface c {
        int a();

        List<Integer> b();
    }

    public g() {
        this(new b());
    }

    public g(c cVar) {
        i.g(cVar);
        this.a = cVar;
    }

    @Override // d.a.e.h.e
    public j a(int i) {
        return h.d(i, i >= this.a.a(), false);
    }

    @Override // d.a.e.h.e
    public int b(int i) {
        List<Integer> listB = this.a.b();
        if (listB == null || listB.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < listB.size(); i2++) {
            if (listB.get(i2).intValue() > i) {
                return listB.get(i2).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }
}

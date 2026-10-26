package d.b.a.a.e.e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class l5 extends j5 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f2759c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private l5() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> e(Object obj, long j, int i) {
        List<L> listF;
        h5 h5Var;
        List<L> listF2 = f(obj, j);
        if (!listF2.isEmpty()) {
            if (f2759c.isAssignableFrom(listF2.getClass())) {
                ArrayList arrayList = new ArrayList(listF2.size() + i);
                arrayList.addAll(listF2);
                h5Var = arrayList;
            } else if (listF2 instanceof m7) {
                h5 h5Var2 = new h5(listF2.size() + i);
                h5Var2.addAll((m7) listF2);
                h5Var = h5Var2;
            } else {
                if (!(listF2 instanceof m6) || !(listF2 instanceof z4)) {
                    return listF2;
                }
                z4 z4Var = (z4) listF2;
                if (z4Var.a()) {
                    return listF2;
                }
                listF = z4Var.f(listF2.size() + i);
            }
            r7.j(obj, j, h5Var);
            return h5Var;
        }
        listF = listF2 instanceof k5 ? new h5(i) : ((listF2 instanceof m6) && (listF2 instanceof z4)) ? ((z4) listF2).f(i) : new ArrayList<>(i);
        r7.j(obj, j, listF);
        return listF;
    }

    private static <E> List<E> f(Object obj, long j) {
        return (List) r7.F(obj, j);
    }

    @Override // d.b.a.a.e.e.j5
    final <E> void b(Object obj, Object obj2, long j) {
        List listF = f(obj2, j);
        List listE = e(obj, j, listF.size());
        int size = listE.size();
        int size2 = listF.size();
        if (size > 0 && size2 > 0) {
            listE.addAll(listF);
        }
        if (size > 0) {
            listF = listE;
        }
        r7.j(obj, j, listF);
    }

    @Override // d.b.a.a.e.e.j5
    final void d(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) r7.F(obj, j);
        if (list instanceof k5) {
            objUnmodifiableList = ((k5) list).e();
        } else {
            if (f2759c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof m6) && (list instanceof z4)) {
                z4 z4Var = (z4) list;
                if (z4Var.a()) {
                    z4Var.b();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        r7.j(obj, j, objUnmodifiableList);
    }
}

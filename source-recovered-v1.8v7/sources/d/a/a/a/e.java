package d.a.a.a;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e {
    public static String a(d dVar) {
        try {
            return dVar instanceof f ? c(((f) dVar).b().get(0)) : c(dVar);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> b(d dVar) {
        try {
            if (!(dVar instanceof f)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(c(dVar));
                return arrayList;
            }
            List<d> listB = ((f) dVar).b();
            ArrayList arrayList2 = new ArrayList(listB.size());
            for (int i = 0; i < listB.size(); i++) {
                arrayList2.add(c(listB.get(i)));
            }
            return arrayList2;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private static String c(d dVar) {
        return d.a.b.k.c.a(dVar.a().getBytes("UTF-8"));
    }
}

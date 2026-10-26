package d.a.b.d;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class e<E> extends ArrayList<E> {
    private e(int i) {
        super(i);
    }

    public static <E> e<E> c(E... eArr) {
        e<E> eVar = new e<>(eArr.length);
        Collections.addAll(eVar, eArr);
        return eVar;
    }
}

package d.b.a.a.e.e;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class r2 {
    public static <T> o2<T> a(o2<T> o2Var) {
        return ((o2Var instanceof t2) || (o2Var instanceof q2)) ? o2Var : o2Var instanceof Serializable ? new q2(o2Var) : new t2(o2Var);
    }

    public static <T> o2<T> b(@NullableDecl T t) {
        return new s2(t);
    }
}

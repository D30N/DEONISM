package d.b.a.a.e.e;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class w2 extends WeakReference<Throwable> {
    private final int a;

    public w2(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == w2.class) {
            if (this == obj) {
                return true;
            }
            w2 w2Var = (w2) obj;
            if (this.a == w2Var.a && get() == w2Var.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}

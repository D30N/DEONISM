package d.b.a.a.e.e;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class x2 {
    private final ConcurrentHashMap<w2, List<Throwable>> a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b, reason: collision with root package name */
    private final ReferenceQueue<Throwable> f2877b = new ReferenceQueue<>();

    x2() {
    }

    public final List<Throwable> a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> referencePoll = this.f2877b.poll();
            if (referencePoll == null) {
                break;
            }
            this.a.remove(referencePoll);
        }
        List<Throwable> list = this.a.get(new w2(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> listPutIfAbsent = this.a.putIfAbsent(new w2(th, this.f2877b), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }
}

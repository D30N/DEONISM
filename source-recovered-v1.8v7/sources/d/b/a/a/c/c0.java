package d.b.a.a.c;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class c0 extends a0 {
    private final Callable<String> e;

    private c0(Callable<String> callable) {
        super(false, null, null);
        this.e = callable;
    }

    @Override // d.b.a.a.c.a0
    final String a() {
        try {
            return this.e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

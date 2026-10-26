package d.a.e.c;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class k implements d.a.b.d.k<q> {
    private static final long a = TimeUnit.MINUTES.toMillis(5);

    private int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin < 16777216) {
            return 1048576;
        }
        return iMin < 33554432 ? 2097152 : 4194304;
    }

    @Override // d.a.b.d.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public q get() {
        int iB = b();
        return new q(iB, Integer.MAX_VALUE, iB, Integer.MAX_VALUE, iB / 8, a);
    }
}

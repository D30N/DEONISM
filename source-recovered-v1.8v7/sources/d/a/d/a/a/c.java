package d.a.d.a.a;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import d.a.d.a.a.a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class c<T extends d.a.d.a.a.a> extends d.a.d.a.a.b<T> {

    /* renamed from: b, reason: collision with root package name */
    private final com.facebook.common.time.b f2410b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f2411c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2412d;
    private long e;
    private long f;
    private long g;

    @Nullable
    private b h;
    private final Runnable i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                c.this.f2412d = false;
                if (!c.this.p()) {
                    c.this.q();
                } else if (c.this.h != null) {
                    c.this.h.h();
                }
            }
        }
    }

    public interface b {
        void h();
    }

    private c(@Nullable T t, @Nullable b bVar, com.facebook.common.time.b bVar2, ScheduledExecutorService scheduledExecutorService) {
        super(t);
        this.f2412d = false;
        this.f = 2000L;
        this.g = 1000L;
        this.i = new a();
        this.h = bVar;
        this.f2410b = bVar2;
        this.f2411c = scheduledExecutorService;
    }

    public static <T extends d.a.d.a.a.a & b> d.a.d.a.a.b<T> n(T t, com.facebook.common.time.b bVar, ScheduledExecutorService scheduledExecutorService) {
        return o(t, (b) t, bVar, scheduledExecutorService);
    }

    public static <T extends d.a.d.a.a.a> d.a.d.a.a.b<T> o(T t, b bVar, com.facebook.common.time.b bVar2, ScheduledExecutorService scheduledExecutorService) {
        return new c(t, bVar, bVar2, scheduledExecutorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        return this.f2410b.now() - this.e > this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void q() {
        if (!this.f2412d) {
            this.f2412d = true;
            this.f2411c.schedule(this.i, this.g, TimeUnit.MILLISECONDS);
        }
    }

    @Override // d.a.d.a.a.b, d.a.d.a.a.a
    public boolean i(Drawable drawable, Canvas canvas, int i) {
        this.e = this.f2410b.now();
        boolean zI = super.i(drawable, canvas, i);
        q();
        return zI;
    }
}

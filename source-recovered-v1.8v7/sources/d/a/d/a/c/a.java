package d.a.d.a.c;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.drawee.f.d;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class a extends Drawable implements Animatable, d.a.c.a.a {
    private static final Class<?> p = a.class;
    private static final d.a.d.a.c.b q = new c();

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private d.a.d.a.a.a f2432b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private d.a.d.a.d.b f2433c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f2434d;
    private long e;
    private long f;
    private long g;
    private int h;
    private long i;
    private long j;
    private int k;
    private volatile d.a.d.a.c.b l;

    @Nullable
    private volatile b m;

    @Nullable
    private d n;
    private final Runnable o;

    /* renamed from: d.a.d.a.c.a$a, reason: collision with other inner class name */
    class RunnableC0088a implements Runnable {
        RunnableC0088a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.unscheduleSelf(aVar.o);
            a.this.invalidateSelf();
        }
    }

    public interface b {
        void a(a aVar, d.a.d.a.d.b bVar, int i, boolean z, boolean z2, long j, long j2, long j3, long j4, long j5, long j6, long j7);
    }

    public a() {
        this(null);
    }

    public a(@Nullable d.a.d.a.a.a aVar) {
        this.i = 8L;
        this.j = 0L;
        this.l = q;
        this.m = null;
        this.o = new RunnableC0088a();
        this.f2432b = aVar;
        this.f2433c = c(aVar);
    }

    @Nullable
    private static d.a.d.a.d.b c(@Nullable d.a.d.a.a.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new d.a.d.a.d.a(aVar);
    }

    private long d() {
        return SystemClock.uptimeMillis();
    }

    private void e() {
        this.k++;
        if (d.a.b.e.a.m(2)) {
            d.a.b.e.a.o(p, "Dropped a frame. Count: %s", Integer.valueOf(this.k));
        }
    }

    private void f(long j) {
        long j2 = this.e + j;
        this.g = j2;
        scheduleSelf(this.o, j2);
    }

    @Override // d.a.c.a.a
    public void a() {
        d.a.d.a.a.a aVar = this.f2432b;
        if (aVar != null) {
            aVar.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        long j;
        long j2;
        a aVar;
        long j3;
        if (this.f2432b == null || this.f2433c == null) {
            return;
        }
        long jD = d();
        long jMax = this.f2434d ? (jD - this.e) + this.j : Math.max(this.f, 0L);
        int iB = this.f2433c.b(jMax, this.f);
        if (iB == -1) {
            iB = this.f2432b.a() - 1;
            this.l.d(this);
            this.f2434d = false;
        } else if (iB == 0 && this.h != -1 && jD >= this.g) {
            this.l.a(this);
        }
        int i = iB;
        boolean zI = this.f2432b.i(this, canvas, i);
        if (zI) {
            this.l.c(this, i);
            this.h = i;
        }
        if (!zI) {
            e();
        }
        long jD2 = d();
        if (this.f2434d) {
            long jA = this.f2433c.a(jD2 - this.e);
            if (jA != -1) {
                long j4 = this.i + jA;
                f(j4);
                j2 = j4;
            } else {
                this.l.d(this);
                this.f2434d = false;
                j2 = -1;
            }
            j = jA;
        } else {
            j = -1;
            j2 = -1;
        }
        b bVar = this.m;
        if (bVar != null) {
            bVar.a(this, this.f2433c, i, zI, this.f2434d, this.e, jMax, this.f, jD, jD2, j, j2);
            aVar = this;
            j3 = jMax;
        } else {
            aVar = this;
            j3 = jMax;
        }
        aVar.f = j3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        d.a.d.a.a.a aVar = this.f2432b;
        return aVar == null ? super.getIntrinsicHeight() : aVar.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        d.a.d.a.a.a aVar = this.f2432b;
        return aVar == null ? super.getIntrinsicWidth() : aVar.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f2434d;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        d.a.d.a.a.a aVar = this.f2432b;
        if (aVar != null) {
            aVar.e(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        if (this.f2434d) {
            return false;
        }
        long j = i;
        if (this.f == j) {
            return false;
        }
        this.f = j;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.n == null) {
            this.n = new d();
        }
        this.n.b(i);
        d.a.d.a.a.a aVar = this.f2432b;
        if (aVar != null) {
            aVar.g(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.n == null) {
            this.n = new d();
        }
        this.n.c(colorFilter);
        d.a.d.a.a.a aVar = this.f2432b;
        if (aVar != null) {
            aVar.j(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        d.a.d.a.a.a aVar;
        if (this.f2434d || (aVar = this.f2432b) == null || aVar.a() <= 1) {
            return;
        }
        this.f2434d = true;
        long jD = d();
        this.e = jD;
        this.g = jD;
        this.f = -1L;
        this.h = -1;
        invalidateSelf();
        this.l.b(this);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f2434d) {
            this.f2434d = false;
            this.e = 0L;
            this.g = 0L;
            this.f = -1L;
            this.h = -1;
            unscheduleSelf(this.o);
            this.l.d(this);
        }
    }
}

package d.a.e.a.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import d.a.e.a.a.e;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class a implements d.a.e.a.a.a {
    private final d.a.e.a.d.a a;

    /* renamed from: b, reason: collision with root package name */
    private final e f2455b;

    /* renamed from: c, reason: collision with root package name */
    private final d.a.e.a.a.c f2456c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f2457d;
    private final int[] e;
    private final d.a.e.a.a.b[] f;
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final boolean i;

    @GuardedBy("this")
    @Nullable
    private Bitmap j;

    public a(d.a.e.a.d.a aVar, e eVar, Rect rect, boolean z) {
        this.a = aVar;
        this.f2455b = eVar;
        d.a.e.a.a.c cVarC = eVar.c();
        this.f2456c = cVarC;
        int[] iArrD = cVarC.d();
        this.e = iArrD;
        this.a.a(iArrD);
        this.a.c(this.e);
        this.a.b(this.e);
        this.f2457d = j(this.f2456c, rect);
        this.i = z;
        this.f = new d.a.e.a.a.b[this.f2456c.a()];
        for (int i = 0; i < this.f2456c.a(); i++) {
            this.f[i] = this.f2456c.c(i);
        }
    }

    private synchronized void i() {
        if (this.j != null) {
            this.j.recycle();
            this.j = null;
        }
    }

    private static Rect j(d.a.e.a.a.c cVar, Rect rect) {
        return rect == null ? new Rect(0, 0, cVar.getWidth(), cVar.getHeight()) : new Rect(0, 0, Math.min(rect.width(), cVar.getWidth()), Math.min(rect.height(), cVar.getHeight()));
    }

    private synchronized void k(int i, int i2) {
        if (this.j != null && (this.j.getWidth() < i || this.j.getHeight() < i2)) {
            i();
        }
        if (this.j == null) {
            this.j = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }
        this.j.eraseColor(0);
    }

    private void l(Canvas canvas, d.a.e.a.a.d dVar) {
        int width;
        int height;
        int iC;
        int iD;
        if (this.i) {
            float fMax = Math.max(dVar.getWidth() / Math.min(dVar.getWidth(), canvas.getWidth()), dVar.getHeight() / Math.min(dVar.getHeight(), canvas.getHeight()));
            width = (int) (dVar.getWidth() / fMax);
            height = (int) (dVar.getHeight() / fMax);
            iC = (int) (dVar.c() / fMax);
            iD = (int) (dVar.d() / fMax);
        } else {
            width = dVar.getWidth();
            height = dVar.getHeight();
            iC = dVar.c();
            iD = dVar.d();
        }
        synchronized (this) {
            k(width, height);
            dVar.b(width, height, this.j);
            canvas.save();
            canvas.translate(iC, iD);
            canvas.drawBitmap(this.j, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        }
    }

    private void m(Canvas canvas, d.a.e.a.a.d dVar) {
        double dWidth = this.f2457d.width();
        double width = this.f2456c.getWidth();
        Double.isNaN(dWidth);
        Double.isNaN(width);
        double d2 = dWidth / width;
        double dHeight = this.f2457d.height();
        double height = this.f2456c.getHeight();
        Double.isNaN(dHeight);
        Double.isNaN(height);
        double d3 = dHeight / height;
        double width2 = dVar.getWidth();
        Double.isNaN(width2);
        int iRound = (int) Math.round(width2 * d2);
        double height2 = dVar.getHeight();
        Double.isNaN(height2);
        int iRound2 = (int) Math.round(height2 * d3);
        double dC = dVar.c();
        Double.isNaN(dC);
        int i = (int) (dC * d2);
        double d4 = dVar.d();
        Double.isNaN(d4);
        int i2 = (int) (d4 * d3);
        synchronized (this) {
            int iWidth = this.f2457d.width();
            int iHeight = this.f2457d.height();
            k(iWidth, iHeight);
            dVar.b(iRound, iRound2, this.j);
            this.g.set(0, 0, iWidth, iHeight);
            this.h.set(i, i2, iWidth + i, iHeight + i2);
            canvas.drawBitmap(this.j, this.g, this.h, (Paint) null);
        }
    }

    @Override // d.a.e.a.a.a
    public int a() {
        return this.f2456c.a();
    }

    @Override // d.a.e.a.a.a
    public int b() {
        return this.f2456c.b();
    }

    @Override // d.a.e.a.a.a
    public d.a.e.a.a.b c(int i) {
        return this.f[i];
    }

    @Override // d.a.e.a.a.a
    public int d() {
        return this.f2457d.width();
    }

    @Override // d.a.e.a.a.a
    public int e(int i) {
        return this.e[i];
    }

    @Override // d.a.e.a.a.a
    public void f(int i, Canvas canvas) {
        d.a.e.a.a.d dVarF = this.f2456c.f(i);
        try {
            if (this.f2456c.i()) {
                m(canvas, dVarF);
            } else {
                l(canvas, dVarF);
            }
        } finally {
            dVarF.a();
        }
    }

    @Override // d.a.e.a.a.a
    public d.a.e.a.a.a g(Rect rect) {
        return j(this.f2456c, rect).equals(this.f2457d) ? this : new a(this.a, this.f2455b, rect, this.i);
    }

    @Override // d.a.e.a.a.a
    public int getHeight() {
        return this.f2456c.getHeight();
    }

    @Override // d.a.e.a.a.a
    public int getWidth() {
        return this.f2456c.getWidth();
    }

    @Override // d.a.e.a.a.a
    public int h() {
        return this.f2457d.height();
    }
}

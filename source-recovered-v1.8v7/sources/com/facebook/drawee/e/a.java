package com.facebook.drawee.e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.e.b.b;
import com.facebook.drawee.f.p;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class a extends Drawable implements b {

    /* renamed from: b, reason: collision with root package name */
    private String f1182b;

    /* renamed from: c, reason: collision with root package name */
    private String f1183c;

    /* renamed from: d, reason: collision with root package name */
    private int f1184d;
    private int e;
    private int f;
    private String g;
    private p.b h;
    private int j;
    private int k;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private long v;
    private String w;
    private HashMap<String, String> i = new HashMap<>();
    private int l = 80;
    private final Paint m = new Paint(1);
    private final Matrix n = new Matrix();
    private final Rect o = new Rect();
    private final RectF p = new RectF();

    public a() {
        e();
    }

    private void b(Canvas canvas, String str, @Nullable Object... objArr) {
        if (objArr != null) {
            str = String.format(str, objArr);
        }
        canvas.drawText(str, this.t, this.u, this.m);
        this.u += this.s;
    }

    private void d(Rect rect, int i, int i2) {
        int iMin = Math.min(40, Math.max(10, Math.min(rect.width() / i2, rect.height() / i)));
        this.m.setTextSize(iMin);
        int i3 = iMin + 8;
        this.s = i3;
        if (this.l == 80) {
            this.s = i3 * (-1);
        }
        this.q = rect.left + 10;
        this.r = this.l == 80 ? rect.bottom - 10 : rect.top + 10 + 10;
    }

    @Override // com.facebook.drawee.e.b.b
    public void a(long j) {
        this.v = j;
        invalidateSelf();
    }

    int c(int i, int i2, @Nullable p.b bVar) {
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > 0 && iHeight > 0 && i > 0 && i2 > 0) {
            if (bVar != null) {
                Rect rect = this.o;
                rect.top = 0;
                rect.left = 0;
                rect.right = iWidth;
                rect.bottom = iHeight;
                this.n.reset();
                bVar.a(this.n, this.o, i, i2, 0.0f, 0.0f);
                RectF rectF = this.p;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i;
                rectF.bottom = i2;
                this.n.mapRect(rectF);
                int iWidth2 = (int) this.p.width();
                int iHeight2 = (int) this.p.height();
                iWidth = Math.min(iWidth, iWidth2);
                iHeight = Math.min(iHeight, iHeight2);
            }
            float f = iWidth;
            float f2 = f * 0.1f;
            float f3 = f * 0.5f;
            float f4 = iHeight;
            float f5 = 0.1f * f4;
            float f6 = f4 * 0.5f;
            int iAbs = Math.abs(i - iWidth);
            int iAbs2 = Math.abs(i2 - iHeight);
            float f7 = iAbs;
            if (f7 < f2 && iAbs2 < f5) {
                return 1716301648;
            }
            if (f7 < f3 && iAbs2 < f6) {
                return 1728026624;
            }
        }
        return 1727284022;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.m.setStyle(Paint.Style.STROKE);
        this.m.setStrokeWidth(2.0f);
        this.m.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.m);
        this.m.setStyle(Paint.Style.FILL);
        this.m.setColor(c(this.f1184d, this.e, this.h));
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.m);
        this.m.setStyle(Paint.Style.FILL);
        this.m.setStrokeWidth(0.0f);
        this.m.setColor(-1);
        this.t = this.q;
        this.u = this.r;
        String str = this.f1183c;
        if (str != null) {
            b(canvas, "IDs: %s, %s", this.f1182b, str);
        } else {
            b(canvas, "ID: %s", this.f1182b);
        }
        b(canvas, "D: %dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()));
        b(canvas, "I: %dx%d", Integer.valueOf(this.f1184d), Integer.valueOf(this.e));
        b(canvas, "I: %d KiB", Integer.valueOf(this.f / 1024));
        String str2 = this.g;
        if (str2 != null) {
            b(canvas, "i format: %s", str2);
        }
        int i = this.j;
        if (i > 0) {
            b(canvas, "anim: f %d, l %d", Integer.valueOf(i), Integer.valueOf(this.k));
        }
        p.b bVar = this.h;
        if (bVar != null) {
            b(canvas, "scale: %s", bVar);
        }
        long j = this.v;
        if (j >= 0) {
            b(canvas, "t: %d ms", Long.valueOf(j));
        }
        String str3 = this.w;
        if (str3 != null) {
            b(canvas, "origin: %s", str3);
        }
        for (Map.Entry<String, String> entry : this.i.entrySet()) {
            b(canvas, "%s: %s", entry.getKey(), entry.getValue());
        }
    }

    public void e() {
        this.f1184d = -1;
        this.e = -1;
        this.f = -1;
        this.i = new HashMap<>();
        this.j = -1;
        this.k = -1;
        this.g = null;
        f(null);
        this.v = -1L;
        this.w = null;
        invalidateSelf();
    }

    public void f(@Nullable String str) {
        if (str == null) {
            str = "none";
        }
        this.f1182b = str;
        invalidateSelf();
    }

    public void g(int i, int i2) {
        this.f1184d = i;
        this.e = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h(int i) {
        this.f = i;
    }

    public void i(String str) {
        this.w = str;
        invalidateSelf();
    }

    public void j(p.b bVar) {
        this.h = bVar;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        d(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}

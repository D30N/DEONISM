package d.a.e.a.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import d.a.e.a.a.b;

/* loaded from: classes.dex */
public class d {
    private final d.a.e.a.a.a a;

    /* renamed from: b, reason: collision with root package name */
    private final b f2462b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f2463c;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface b {
        d.a.b.h.a<Bitmap> a(int i);

        void b(int i, Bitmap bitmap);
    }

    private enum c {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    public d(d.a.e.a.a.a aVar, b bVar) {
        this.a = aVar;
        this.f2462b = bVar;
        Paint paint = new Paint();
        this.f2463c = paint;
        paint.setColor(0);
        this.f2463c.setStyle(Paint.Style.FILL);
        this.f2463c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    private void a(Canvas canvas, d.a.e.a.a.b bVar) {
        canvas.drawRect(bVar.a, bVar.f2437b, r0 + bVar.f2438c, r1 + bVar.f2439d, this.f2463c);
    }

    private c b(int i) {
        d.a.e.a.a.b bVarC = this.a.c(i);
        b.EnumC0089b enumC0089b = bVarC.f;
        return enumC0089b == b.EnumC0089b.DISPOSE_DO_NOT ? c.REQUIRED : enumC0089b == b.EnumC0089b.DISPOSE_TO_BACKGROUND ? c(bVarC) ? c.NOT_REQUIRED : c.REQUIRED : enumC0089b == b.EnumC0089b.DISPOSE_TO_PREVIOUS ? c.SKIP : c.ABORT;
    }

    private boolean c(d.a.e.a.a.b bVar) {
        return bVar.a == 0 && bVar.f2437b == 0 && bVar.f2438c == this.a.d() && bVar.f2439d == this.a.h();
    }

    private boolean d(int i) {
        if (i == 0) {
            return true;
        }
        d.a.e.a.a.b bVarC = this.a.c(i);
        d.a.e.a.a.b bVarC2 = this.a.c(i - 1);
        if (bVarC.e == b.a.NO_BLEND && c(bVarC)) {
            return true;
        }
        return bVarC2.f == b.EnumC0089b.DISPOSE_TO_BACKGROUND && c(bVarC2);
    }

    private int e(int i, Canvas canvas) {
        while (i >= 0) {
            int i2 = a.a[b(i).ordinal()];
            if (i2 == 1) {
                d.a.e.a.a.b bVarC = this.a.c(i);
                d.a.b.h.a<Bitmap> aVarA = this.f2462b.a(i);
                if (aVarA != null) {
                    try {
                        canvas.drawBitmap(aVarA.r(), 0.0f, 0.0f, (Paint) null);
                        if (bVarC.f == b.EnumC0089b.DISPOSE_TO_BACKGROUND) {
                            a(canvas, bVarC);
                        }
                        return i + 1;
                    } finally {
                        aVarA.close();
                    }
                }
                if (d(i)) {
                    return i;
                }
            } else {
                if (i2 == 2) {
                    return i + 1;
                }
                if (i2 == 3) {
                    return i;
                }
            }
            i--;
        }
        return 0;
    }

    public void f(int i, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        for (int iE = !d(i) ? e(i - 1, canvas) : i; iE < i; iE++) {
            d.a.e.a.a.b bVarC = this.a.c(iE);
            b.EnumC0089b enumC0089b = bVarC.f;
            if (enumC0089b != b.EnumC0089b.DISPOSE_TO_PREVIOUS) {
                if (bVarC.e == b.a.NO_BLEND) {
                    a(canvas, bVarC);
                }
                this.a.f(iE, canvas);
                this.f2462b.b(iE, bitmap);
                if (enumC0089b == b.EnumC0089b.DISPOSE_TO_BACKGROUND) {
                    a(canvas, bVarC);
                }
            }
        }
        d.a.e.a.a.b bVarC2 = this.a.c(i);
        if (bVarC2.e == b.a.NO_BLEND) {
            a(canvas, bVarC2);
        }
        this.a.f(i, canvas);
    }
}

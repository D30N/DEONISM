package b.c.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import b.c.a.h;

/* loaded from: classes.dex */
class b extends d {

    class a implements h.a {
        a(b bVar) {
        }

        @Override // b.c.a.h.a
        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    b() {
    }

    @Override // b.c.a.d, b.c.a.f
    public void m() {
        h.r = new a(this);
    }
}

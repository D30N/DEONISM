package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class f extends View {

    /* renamed from: b, reason: collision with root package name */
    private int f353b;

    /* renamed from: c, reason: collision with root package name */
    private View f354c;

    /* renamed from: d, reason: collision with root package name */
    private int f355d;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f354c == null) {
            return;
        }
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        ConstraintLayout.a aVar2 = (ConstraintLayout.a) this.f354c.getLayoutParams();
        aVar2.k0.x0(0);
        aVar.k0.y0(aVar2.k0.D());
        aVar.k0.b0(aVar2.k0.r());
        aVar2.k0.x0(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f353b == -1 && !isInEditMode()) {
            setVisibility(this.f355d);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f353b);
        this.f354c = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.a) viewFindViewById.getLayoutParams()).Z = true;
            this.f354c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f354c;
    }

    public int getEmptyVisibility() {
        return this.f355d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View viewFindViewById;
        if (this.f353b == i) {
            return;
        }
        View view = this.f354c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.a) this.f354c.getLayoutParams()).Z = false;
            this.f354c = null;
        }
        this.f353b = i;
        if (i == -1 || (viewFindViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f355d = i;
    }
}

package d.a.e.b;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class h implements d.a.b.h.h<Bitmap> {
    private static h a;

    private h() {
    }

    public static h b() {
        if (a == null) {
            a = new h();
        }
        return a;
    }

    @Override // d.a.b.h.h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }
}

package d.a.e.b;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import d.a.b.d.i;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@TargetApi(21)
/* loaded from: classes.dex */
public class a extends f {
    private final com.facebook.imagepipeline.memory.e a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a.e.e.a f2467b;

    public a(com.facebook.imagepipeline.memory.e eVar, d.a.e.e.a aVar) {
        this.a = eVar;
        this.f2467b = aVar;
    }

    @Override // d.a.e.b.f
    public d.a.b.h.a<Bitmap> c(int i, int i2, Bitmap.Config config) {
        Bitmap bitmap = this.a.get(com.facebook.imageutils.a.d(i, i2, config));
        i.b(bitmap.getAllocationByteCount() >= (i * i2) * com.facebook.imageutils.a.c(config));
        bitmap.reconfigure(i, i2, config);
        return this.f2467b.c(bitmap, this.a);
    }
}

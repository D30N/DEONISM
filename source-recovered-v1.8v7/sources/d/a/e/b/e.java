package d.a.e.b;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import java.io.IOException;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@TargetApi(11)
/* loaded from: classes.dex */
public class e extends f {
    private static final String e = "e";
    private final b a;

    /* renamed from: b, reason: collision with root package name */
    private final com.facebook.imagepipeline.platform.d f2471b;

    /* renamed from: c, reason: collision with root package name */
    private final d.a.e.e.a f2472c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2473d;

    public e(b bVar, com.facebook.imagepipeline.platform.d dVar, d.a.e.e.a aVar) {
        this.a = bVar;
        this.f2471b = dVar;
        this.f2472c = aVar;
    }

    private d.a.b.h.a<Bitmap> d(int i, int i2, Bitmap.Config config) {
        return this.f2472c.c(Bitmap.createBitmap(i, i2, config), h.b());
    }

    @Override // d.a.e.b.f
    @TargetApi(12)
    public d.a.b.h.a<Bitmap> c(int i, int i2, Bitmap.Config config) throws X, IOException {
        if (this.f2473d) {
            return d(i, i2, config);
        }
        d.a.b.h.a<d.a.b.g.g> aVarA = this.a.a((short) i, (short) i2);
        try {
            d.a.e.j.e eVar = new d.a.e.j.e(aVarA);
            eVar.F(com.facebook.imageformat.b.a);
            try {
                d.a.b.h.a<Bitmap> aVarA2 = this.f2471b.a(eVar, config, null, aVarA.r().size());
                if (aVarA2.r().isMutable()) {
                    aVarA2.r().setHasAlpha(true);
                    aVarA2.r().eraseColor(0);
                    return aVarA2;
                }
                d.a.b.h.a.o(aVarA2);
                this.f2473d = true;
                d.a.b.e.a.A(e, "Immutable bitmap returned by decoder");
                return d(i, i2, config);
            } finally {
                d.a.e.j.e.g(eVar);
            }
        } finally {
            aVarA.close();
        }
    }
}

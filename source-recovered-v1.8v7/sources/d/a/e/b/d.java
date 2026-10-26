package d.a.e.b;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.facebook.imagepipeline.memory.e0;
import com.facebook.imagepipeline.memory.q;

/* loaded from: classes.dex */
public class d implements d.a.b.l.a {
    private final b a;

    /* renamed from: b, reason: collision with root package name */
    private final q f2470b;

    public d(e0 e0Var) {
        this.f2470b = e0Var.d();
        this.a = new b(e0Var.h());
    }

    private static BitmapFactory.Options b(int i, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        if (Build.VERSION.SDK_INT >= 11) {
            options.inMutable = true;
        }
        return options;
    }

    @Override // d.a.b.l.a
    @TargetApi(12)
    public Bitmap a(int i, int i2, Bitmap.Config config) throws Throwable {
        d.a.e.j.e eVar;
        d.a.b.h.a<d.a.b.g.g> aVarA = this.a.a((short) i, (short) i2);
        d.a.b.h.a<byte[]> aVarA2 = null;
        try {
            eVar = new d.a.e.j.e(aVarA);
            try {
                eVar.F(com.facebook.imageformat.b.a);
                BitmapFactory.Options optionsB = b(eVar.r(), config);
                int size = aVarA.r().size();
                d.a.b.g.g gVarR = aVarA.r();
                aVarA2 = this.f2470b.a(size + 2);
                byte[] bArrR = aVarA2.r();
                gVarR.b(0, bArrR, 0, size);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrR, 0, size, optionsB);
                bitmapDecodeByteArray.setHasAlpha(true);
                bitmapDecodeByteArray.eraseColor(0);
                d.a.b.h.a.o(aVarA2);
                d.a.e.j.e.g(eVar);
                d.a.b.h.a.o(aVarA);
                return bitmapDecodeByteArray;
            } catch (Throwable th) {
                th = th;
                d.a.b.h.a.o(aVarA2);
                d.a.e.j.e.g(eVar);
                d.a.b.h.a.o(aVarA);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            eVar = null;
        }
    }
}

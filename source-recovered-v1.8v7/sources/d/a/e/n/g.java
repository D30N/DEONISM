package d.a.e.n;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Build;
import java.io.OutputStream;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class g implements c {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2586b;

    public g(boolean z, int i) {
        this.a = z;
        this.f2586b = i;
    }

    private static Bitmap.CompressFormat e(@Nullable com.facebook.imageformat.c cVar) {
        if (cVar != null && cVar != com.facebook.imageformat.b.a) {
            return cVar == com.facebook.imageformat.b.f1242b ? Bitmap.CompressFormat.PNG : (Build.VERSION.SDK_INT < 14 || !com.facebook.imageformat.b.a(cVar)) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    private int f(d.a.e.j.e eVar, d.a.e.d.f fVar, @Nullable d.a.e.d.e eVar2) {
        if (this.a) {
            return a.b(fVar, eVar2, eVar, this.f2586b);
        }
        return 1;
    }

    @Override // d.a.e.n.c
    public boolean a(com.facebook.imageformat.c cVar) {
        return cVar == com.facebook.imageformat.b.k || cVar == com.facebook.imageformat.b.a;
    }

    @Override // d.a.e.n.c
    public b b(d.a.e.j.e eVar, OutputStream outputStream, @Nullable d.a.e.d.f fVar, @Nullable d.a.e.d.e eVar2, @Nullable com.facebook.imageformat.c cVar, @Nullable Integer num) throws Throwable {
        g gVar;
        d.a.e.d.f fVarA;
        Bitmap bitmapCreateBitmap;
        Throwable th;
        OutOfMemoryError e;
        Integer num2 = num == null ? 85 : num;
        if (fVar == null) {
            fVarA = d.a.e.d.f.a();
            gVar = this;
        } else {
            gVar = this;
            fVarA = fVar;
        }
        int iF = gVar.f(eVar, fVarA, eVar2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iF;
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(eVar.p(), null, options);
            if (bitmapDecodeStream == null) {
                d.a.b.e.a.h("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new b(2);
            }
            Matrix matrixG = e.g(eVar, fVarA);
            if (matrixG != null) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrixG, false);
                } catch (OutOfMemoryError e2) {
                    e = e2;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    d.a.b.e.a.i("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    b bVar = new b(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return bVar;
                } catch (Throwable th2) {
                    th = th2;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    throw th;
                }
            } else {
                bitmapCreateBitmap = bitmapDecodeStream;
            }
            try {
                try {
                    bitmapCreateBitmap.compress(e(cVar), num2.intValue(), outputStream);
                    b bVar2 = new b(iF > 1 ? 0 : 1);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return bVar2;
                } catch (OutOfMemoryError e3) {
                    e = e3;
                    d.a.b.e.a.i("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    b bVar3 = new b(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return bVar3;
                }
            } catch (Throwable th3) {
                th = th3;
                bitmapCreateBitmap.recycle();
                bitmapDecodeStream.recycle();
                throw th;
            }
        } catch (OutOfMemoryError e4) {
            d.a.b.e.a.i("SimpleImageTranscoder", "Out-Of-Memory during transcode", e4);
            return new b(2);
        }
    }

    @Override // d.a.e.n.c
    public String c() {
        return "SimpleImageTranscoder";
    }

    @Override // d.a.e.n.c
    public boolean d(d.a.e.j.e eVar, @Nullable d.a.e.d.f fVar, @Nullable d.a.e.d.e eVar2) {
        if (fVar == null) {
            fVar = d.a.e.d.f.a();
        }
        return this.a && a.b(fVar, eVar2, eVar, this.f2586b) > 1;
    }
}

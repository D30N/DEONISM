package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import d.a.b.d.i;
import d.a.b.d.m;
import java.util.Locale;
import javax.annotation.Nullable;

@d.a.b.d.d
/* loaded from: classes.dex */
public abstract class DalvikPurgeableDecoder implements com.facebook.imagepipeline.platform.d {

    /* renamed from: b, reason: collision with root package name */
    protected static final byte[] f1298b;
    private final com.facebook.imagepipeline.memory.c a = com.facebook.imagepipeline.memory.d.a();

    @com.facebook.soloader.d
    private static class OreoUtils {
        private OreoUtils() {
        }

        @TargetApi(26)
        static void a(BitmapFactory.Options options, @Nullable ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        a.a();
        f1298b = new byte[]{-1, -39};
    }

    protected DalvikPurgeableDecoder() {
    }

    public static boolean f(d.a.b.h.a<d.a.b.g.g> aVar, int i) {
        d.a.b.g.g gVarR = aVar.r();
        return i >= 2 && gVarR.c(i + (-2)) == -1 && gVarR.c(i - 1) == -39;
    }

    public static BitmapFactory.Options g(int i, Bitmap.Config config) {
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

    @d.a.b.d.d
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // com.facebook.imagepipeline.platform.d
    public d.a.b.h.a<Bitmap> a(d.a.e.j.e eVar, Bitmap.Config config, @Nullable Rect rect, int i) {
        return c(eVar, config, rect, i, null);
    }

    @Override // com.facebook.imagepipeline.platform.d
    public d.a.b.h.a<Bitmap> b(d.a.e.j.e eVar, Bitmap.Config config, @Nullable Rect rect, @Nullable ColorSpace colorSpace) {
        BitmapFactory.Options optionsG = g(eVar.r(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(optionsG, colorSpace);
        }
        d.a.b.h.a<d.a.b.g.g> aVarI = eVar.i();
        i.g(aVarI);
        try {
            return h(d(aVarI, optionsG));
        } finally {
            d.a.b.h.a.o(aVarI);
        }
    }

    @Override // com.facebook.imagepipeline.platform.d
    public d.a.b.h.a<Bitmap> c(d.a.e.j.e eVar, Bitmap.Config config, @Nullable Rect rect, int i, @Nullable ColorSpace colorSpace) {
        BitmapFactory.Options optionsG = g(eVar.r(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(optionsG, colorSpace);
        }
        d.a.b.h.a<d.a.b.g.g> aVarI = eVar.i();
        i.g(aVarI);
        try {
            return h(e(aVarI, i, optionsG));
        } finally {
            d.a.b.h.a.o(aVarI);
        }
    }

    protected abstract Bitmap d(d.a.b.h.a<d.a.b.g.g> aVar, BitmapFactory.Options options);

    protected abstract Bitmap e(d.a.b.h.a<d.a.b.g.g> aVar, int i, BitmapFactory.Options options);

    public d.a.b.h.a<Bitmap> h(Bitmap bitmap) throws X {
        i.g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.a.g(bitmap)) {
                return d.a.b.h.a.x(bitmap, this.a.e());
            }
            int iE = com.facebook.imageutils.a.e(bitmap);
            bitmap.recycle();
            throw new d.a.e.d.g(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(iE), Integer.valueOf(this.a.b()), Long.valueOf(this.a.f()), Integer.valueOf(this.a.c()), Integer.valueOf(this.a.d())));
        } catch (Exception e) {
            bitmap.recycle();
            m.a(e);
            throw null;
        }
    }
}

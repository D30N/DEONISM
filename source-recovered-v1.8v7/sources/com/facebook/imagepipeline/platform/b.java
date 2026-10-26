package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import b.g.k.g;
import d.a.b.d.i;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@TargetApi(11)
/* loaded from: classes.dex */
public abstract class b implements d {

    /* renamed from: d, reason: collision with root package name */
    private static final Class<?> f1305d = b.class;
    private static final byte[] e = {-1, -39};
    private final com.facebook.imagepipeline.memory.e a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final PreverificationHelper f1306b;

    /* renamed from: c, reason: collision with root package name */
    final g<ByteBuffer> f1307c;

    public b(com.facebook.imagepipeline.memory.e eVar, int i, g gVar) {
        this.f1306b = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.a = eVar;
        this.f1307c = gVar;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1307c.a(ByteBuffer.allocate(16384));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00af A[Catch: all -> 0x00d2, RuntimeException -> 0x00d4, IllegalArgumentException -> 0x00dd, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x00d4, blocks: (B:30:0x006d, B:38:0x008c, B:53:0x00af, B:45:0x00a0, B:49:0x00a8, B:50:0x00ab), top: B:83:0x006d, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private d.a.b.h.a<android.graphics.Bitmap> d(java.io.InputStream r9, android.graphics.BitmapFactory.Options r10, @javax.annotation.Nullable android.graphics.Rect r11, @javax.annotation.Nullable android.graphics.ColorSpace r12) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.b.d(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect, android.graphics.ColorSpace):d.a.b.h.a");
    }

    private static BitmapFactory.Options f(d.a.e.j.e eVar, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = eVar.r();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(eVar.p(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }

    @Override // com.facebook.imagepipeline.platform.d
    public d.a.b.h.a<Bitmap> a(d.a.e.j.e eVar, Bitmap.Config config, @Nullable Rect rect, int i) {
        return c(eVar, config, rect, i, null);
    }

    @Override // com.facebook.imagepipeline.platform.d
    public d.a.b.h.a<Bitmap> b(d.a.e.j.e eVar, Bitmap.Config config, @Nullable Rect rect, @Nullable ColorSpace colorSpace) {
        BitmapFactory.Options optionsF = f(eVar, config);
        boolean z = optionsF.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return d(eVar.p(), optionsF, rect, colorSpace);
        } catch (RuntimeException e2) {
            if (z) {
                return b(eVar, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e2;
        }
    }

    @Override // com.facebook.imagepipeline.platform.d
    public d.a.b.h.a<Bitmap> c(d.a.e.j.e eVar, Bitmap.Config config, @Nullable Rect rect, int i, @Nullable ColorSpace colorSpace) {
        boolean zU = eVar.u(i);
        BitmapFactory.Options optionsF = f(eVar, config);
        InputStream inputStreamP = eVar.p();
        i.g(inputStreamP);
        if (eVar.s() > i) {
            inputStreamP = new d.a.b.j.a(inputStreamP, i);
        }
        if (!zU) {
            inputStreamP = new d.a.b.j.b(inputStreamP, e);
        }
        boolean z = optionsF.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return d(inputStreamP, optionsF, rect, colorSpace);
        } catch (RuntimeException e2) {
            if (z) {
                return c(eVar, Bitmap.Config.ARGB_8888, rect, i, colorSpace);
            }
            throw e2;
        }
    }

    public abstract int e(int i, int i2, BitmapFactory.Options options);
}

package com.facebook.imagepipeline.nativecode;

import android.os.Build;
import d.a.b.d.i;
import java.io.InputStream;
import java.io.OutputStream;

@d.a.b.d.d
/* loaded from: classes.dex */
public class WebpTranscoderImpl implements f {
    @d.a.b.d.d
    private static native void nativeTranscodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i);

    @d.a.b.d.d
    private static native void nativeTranscodeWebpToPng(InputStream inputStream, OutputStream outputStream);

    @Override // com.facebook.imagepipeline.nativecode.f
    public void a(InputStream inputStream, OutputStream outputStream) {
        e.a();
        i.g(inputStream);
        i.g(outputStream);
        nativeTranscodeWebpToPng(inputStream, outputStream);
    }

    @Override // com.facebook.imagepipeline.nativecode.f
    public boolean b(com.facebook.imageformat.c cVar) {
        if (cVar == com.facebook.imageformat.b.f) {
            return Build.VERSION.SDK_INT >= 14;
        }
        if (cVar == com.facebook.imageformat.b.g || cVar == com.facebook.imageformat.b.h || cVar == com.facebook.imageformat.b.i) {
            return d.a.b.l.c.f2407b;
        }
        if (cVar == com.facebook.imageformat.b.j) {
            return false;
        }
        throw new IllegalArgumentException("Image format is not a WebP.");
    }

    @Override // com.facebook.imagepipeline.nativecode.f
    public void c(InputStream inputStream, OutputStream outputStream, int i) {
        e.a();
        i.g(inputStream);
        i.g(outputStream);
        nativeTranscodeWebpToJpeg(inputStream, outputStream, i);
    }
}

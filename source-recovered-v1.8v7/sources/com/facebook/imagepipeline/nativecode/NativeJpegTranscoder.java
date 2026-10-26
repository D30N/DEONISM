package com.facebook.imagepipeline.nativecode;

import d.a.b.d.i;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

@d.a.b.d.d
/* loaded from: classes.dex */
public class NativeJpegTranscoder implements d.a.e.n.c {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private int f1299b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1300c;

    static {
        d.a();
    }

    public NativeJpegTranscoder(boolean z, int i, boolean z2) {
        this.a = z;
        this.f1299b = i;
        this.f1300c = z2;
    }

    public static void e(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        d.a();
        i.b(i2 >= 1);
        i.b(i2 <= 16);
        i.b(i3 >= 0);
        i.b(i3 <= 100);
        i.b(d.a.e.n.e.j(i));
        i.c((i2 == 8 && i == 0) ? false : true, "no transformation requested");
        i.g(inputStream);
        i.g(outputStream);
        nativeTranscodeJpeg(inputStream, outputStream, i, i2, i3);
    }

    public static void f(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        d.a();
        i.b(i2 >= 1);
        i.b(i2 <= 16);
        i.b(i3 >= 0);
        i.b(i3 <= 100);
        i.b(d.a.e.n.e.i(i));
        i.c((i2 == 8 && i == 1) ? false : true, "no transformation requested");
        i.g(inputStream);
        i.g(outputStream);
        nativeTranscodeJpegWithExifOrientation(inputStream, outputStream, i, i2, i3);
    }

    @d.a.b.d.d
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    @d.a.b.d.d
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    @Override // d.a.e.n.c
    public boolean a(com.facebook.imageformat.c cVar) {
        return cVar == com.facebook.imageformat.b.a;
    }

    @Override // d.a.e.n.c
    public d.a.e.n.b b(d.a.e.j.e eVar, OutputStream outputStream, @Nullable d.a.e.d.f fVar, @Nullable d.a.e.d.e eVar2, @Nullable com.facebook.imageformat.c cVar, @Nullable Integer num) {
        if (num == null) {
            num = 85;
        }
        if (fVar == null) {
            fVar = d.a.e.d.f.a();
        }
        int iB = d.a.e.n.a.b(fVar, eVar2, eVar, this.f1299b);
        try {
            int iF = d.a.e.n.e.f(fVar, eVar2, eVar, this.a);
            int iA = d.a.e.n.e.a(iB);
            if (this.f1300c) {
                iF = iA;
            }
            InputStream inputStreamP = eVar.p();
            if (d.a.e.n.e.a.contains(Integer.valueOf(eVar.l()))) {
                f(inputStreamP, outputStream, d.a.e.n.e.d(fVar, eVar), iF, num.intValue());
            } else {
                e(inputStreamP, outputStream, d.a.e.n.e.e(fVar, eVar), iF, num.intValue());
            }
            d.a.b.d.b.b(inputStreamP);
            return new d.a.e.n.b(iB != 1 ? 0 : 1);
        } catch (Throwable th) {
            d.a.b.d.b.b(null);
            throw th;
        }
    }

    @Override // d.a.e.n.c
    public String c() {
        return "NativeJpegTranscoder";
    }

    @Override // d.a.e.n.c
    public boolean d(d.a.e.j.e eVar, @Nullable d.a.e.d.f fVar, @Nullable d.a.e.d.e eVar2) {
        if (fVar == null) {
            fVar = d.a.e.d.f.a();
        }
        return d.a.e.n.e.f(fVar, eVar2, eVar, this.a) < 8;
    }
}

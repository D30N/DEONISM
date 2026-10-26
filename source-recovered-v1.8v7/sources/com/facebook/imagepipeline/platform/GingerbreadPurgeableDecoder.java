package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import d.a.b.d.m;
import d.a.b.g.g;
import d.a.b.g.i;
import java.io.FileDescriptor;
import java.io.OutputStream;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

@d.a.b.d.d
/* loaded from: classes.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: d, reason: collision with root package name */
    private static Method f1302d;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final d.a.b.l.b f1303c = d.a.b.l.c.i();

    @d.a.b.d.d
    public GingerbreadPurgeableDecoder() {
    }

    private static MemoryFile i(d.a.b.h.a<g> aVar, int i, @Nullable byte[] bArr) throws Throwable {
        OutputStream outputStream;
        d.a.b.j.a aVar2;
        i iVar = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            i iVar2 = new i(aVar.r());
            try {
                aVar2 = new d.a.b.j.a(iVar2, i);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    d.a.b.d.a.a(aVar2, outputStream2);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    d.a.b.h.a.o(aVar);
                    d.a.b.d.b.b(iVar2);
                    d.a.b.d.b.b(aVar2);
                    d.a.b.d.b.a(outputStream2, true);
                    return memoryFile;
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    iVar = iVar2;
                    d.a.b.h.a.o(aVar);
                    d.a.b.d.b.b(iVar);
                    d.a.b.d.b.b(aVar2);
                    d.a.b.d.b.a(outputStream, true);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                aVar2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            aVar2 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap j(d.a.b.h.a<d.a.b.g.g> r2, int r3, byte[] r4, android.graphics.BitmapFactory.Options r5) throws java.lang.Throwable {
        /*
            r1 = this;
            r0 = 0
            android.os.MemoryFile r2 = i(r2, r3, r4)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            java.io.FileDescriptor r3 = r1.l(r2)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            d.a.b.l.b r4 = r1.f1303c     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            if (r4 == 0) goto L20
            d.a.b.l.b r4 = r1.f1303c     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            android.graphics.Bitmap r3 = r4.c(r3, r0, r5)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            java.lang.String r4 = "BitmapFactory returned null"
            d.a.b.d.i.h(r3, r4)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            if (r2 == 0) goto L1f
            r2.close()
        L1f:
            return r3
        L20:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            java.lang.String r4 = "WebpBitmapFactory is null"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            throw r3     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
        L28:
            r3 = move-exception
            r0 = r2
            goto L35
        L2b:
            r3 = move-exception
            goto L31
        L2d:
            r3 = move-exception
            goto L35
        L2f:
            r3 = move-exception
            r2 = r0
        L31:
            d.a.b.d.m.a(r3)     // Catch: java.lang.Throwable -> L28
            throw r0
        L35:
            if (r0 == 0) goto L3a
            r0.close()
        L3a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder.j(d.a.b.h.a, int, byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    private synchronized Method k() {
        if (f1302d == null) {
            try {
                f1302d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e) {
                m.a(e);
                throw null;
            }
        }
        return f1302d;
    }

    private FileDescriptor l(MemoryFile memoryFile) throws X {
        try {
            return (FileDescriptor) k().invoke(memoryFile, new Object[0]);
        } catch (Exception e) {
            m.a(e);
            throw null;
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(d.a.b.h.a<g> aVar, BitmapFactory.Options options) {
        return j(aVar, aVar.r().size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap e(d.a.b.h.a<g> aVar, int i, BitmapFactory.Options options) {
        return j(aVar, i, DalvikPurgeableDecoder.f(aVar, i) ? null : DalvikPurgeableDecoder.f1298b, options);
    }
}

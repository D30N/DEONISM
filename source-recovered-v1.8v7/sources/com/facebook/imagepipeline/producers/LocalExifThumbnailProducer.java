package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class LocalExifThumbnailProducer implements z0<d.a.e.j.e> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a.b.g.h f1308b;

    /* renamed from: c, reason: collision with root package name */
    private final ContentResolver f1309c;

    @com.facebook.soloader.d
    private class Api24Utils {
        private Api24Utils(LocalExifThumbnailProducer localExifThumbnailProducer) {
        }

        /* synthetic */ Api24Utils(LocalExifThumbnailProducer localExifThumbnailProducer, a aVar) {
            this(localExifThumbnailProducer);
        }

        ExifInterface a(FileDescriptor fileDescriptor) {
            if (Build.VERSION.SDK_INT >= 24) {
                return new ExifInterface(fileDescriptor);
            }
            return null;
        }
    }

    class a extends t0<d.a.e.j.e> {
        final /* synthetic */ d.a.e.l.a g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, o0 o0Var, m0 m0Var, String str, d.a.e.l.a aVar) {
            super(kVar, o0Var, m0Var, str);
            this.g = aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // d.a.b.b.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(d.a.e.j.e eVar) {
            d.a.e.j.e.g(eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.t0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<String, String> i(d.a.e.j.e eVar) {
            return d.a.b.d.f.c("createdThumbnail", Boolean.toString(eVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // d.a.b.b.f
        @Nullable
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public d.a.e.j.e c() throws Throwable {
            ExifInterface exifInterfaceG = LocalExifThumbnailProducer.this.g(this.g.p());
            if (exifInterfaceG == null || !exifInterfaceG.hasThumbnail()) {
                return null;
            }
            return LocalExifThumbnailProducer.this.e(LocalExifThumbnailProducer.this.f1308b.c(exifInterfaceG.getThumbnail()), exifInterfaceG);
        }
    }

    class b extends e {
        final /* synthetic */ t0 a;

        b(LocalExifThumbnailProducer localExifThumbnailProducer, t0 t0Var) {
            this.a = t0Var;
        }

        @Override // com.facebook.imagepipeline.producers.n0
        public void b() {
            this.a.a();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, d.a.b.g.h hVar, ContentResolver contentResolver) {
        this.a = executor;
        this.f1308b = hVar;
        this.f1309c = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d.a.e.j.e e(d.a.b.g.g gVar, ExifInterface exifInterface) {
        Pair<Integer, Integer> pairA = com.facebook.imageutils.a.a(new d.a.b.g.i(gVar));
        int iH = h(exifInterface);
        int iIntValue = pairA != null ? ((Integer) pairA.first).intValue() : -1;
        int iIntValue2 = pairA != null ? ((Integer) pairA.second).intValue() : -1;
        d.a.b.h.a aVarV = d.a.b.h.a.v(gVar);
        try {
            d.a.e.j.e eVar = new d.a.e.j.e((d.a.b.h.a<d.a.b.g.g>) aVarV);
            d.a.b.h.a.o(aVarV);
            eVar.F(com.facebook.imageformat.b.a);
            eVar.G(iH);
            eVar.I(iIntValue);
            eVar.E(iIntValue2);
            return eVar;
        } catch (Throwable th) {
            d.a.b.h.a.o(aVarV);
            throw th;
        }
    }

    private int h(ExifInterface exifInterface) {
        return com.facebook.imageutils.c.a(Integer.parseInt(exifInterface.getAttribute("Orientation")));
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<d.a.e.j.e> kVar, m0 m0Var) {
        a aVar = new a(kVar, m0Var.l(), m0Var, "LocalExifThumbnailProducer", m0Var.c());
        m0Var.f(new b(this, aVar));
        this.a.execute(aVar);
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public boolean b(d.a.e.d.e eVar) {
        return a1.b(512, 512, eVar);
    }

    boolean f(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.canRead();
    }

    @Nullable
    ExifInterface g(Uri uri) throws Throwable {
        String strB = d.a.b.k.f.b(this.f1309c, uri);
        a aVar = null;
        try {
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            d.a.b.e.a.d(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
        }
        if (f(strB)) {
            return new ExifInterface(strB);
        }
        AssetFileDescriptor assetFileDescriptorA = d.a.b.k.f.a(this.f1309c, uri);
        if (assetFileDescriptorA != null && Build.VERSION.SDK_INT >= 24) {
            return new Api24Utils(this, aVar).a(assetFileDescriptorA.getFileDescriptor());
        }
        return null;
    }
}

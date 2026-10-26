package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class d0 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    private final Resources f1320c;

    public d0(Executor executor, d.a.b.g.h hVar, Resources resources) {
        super(executor, hVar);
        this.f1320c = resources;
    }

    private int g(d.a.e.l.a aVar) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = null;
        try {
            assetFileDescriptorOpenRawResourceFd = this.f1320c.openRawResourceFd(h(aVar));
            int length = (int) assetFileDescriptorOpenRawResourceFd.getLength();
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused) {
                }
            }
            return length;
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    private static int h(d.a.e.l.a aVar) {
        return Integer.parseInt(aVar.p().getPath().substring(1));
    }

    @Override // com.facebook.imagepipeline.producers.b0
    protected d.a.e.j.e d(d.a.e.l.a aVar) {
        return e(this.f1320c.openRawResource(h(aVar)), g(aVar));
    }

    @Override // com.facebook.imagepipeline.producers.b0
    protected String f() {
        return "LocalResourceFetchProducer";
    }
}

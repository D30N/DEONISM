package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class y extends b0 {

    /* renamed from: c, reason: collision with root package name */
    private final AssetManager f1428c;

    public y(Executor executor, d.a.b.g.h hVar, AssetManager assetManager) {
        super(executor, hVar);
        this.f1428c = assetManager;
    }

    private static String g(d.a.e.l.a aVar) {
        return aVar.p().getPath().substring(1);
    }

    private int h(d.a.e.l.a aVar) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenFd = null;
        try {
            assetFileDescriptorOpenFd = this.f1428c.openFd(g(aVar));
            int length = (int) assetFileDescriptorOpenFd.getLength();
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused) {
                }
            }
            return length;
        } catch (IOException unused2) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.producers.b0
    protected d.a.e.j.e d(d.a.e.l.a aVar) {
        return e(this.f1428c.open(g(aVar), 2), h(aVar));
    }

    @Override // com.facebook.imagepipeline.producers.b0
    protected String f() {
        return "LocalAssetFetchProducer";
    }
}

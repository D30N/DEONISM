package com.facebook.imagepipeline.producers;

import java.io.FileInputStream;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c0 extends b0 {
    public c0(Executor executor, d.a.b.g.h hVar) {
        super(executor, hVar);
    }

    @Override // com.facebook.imagepipeline.producers.b0
    protected d.a.e.j.e d(d.a.e.l.a aVar) {
        return e(new FileInputStream(aVar.o().toString()), (int) aVar.o().length());
    }

    @Override // com.facebook.imagepipeline.producers.b0
    protected String f() {
        return "LocalFileFetchProducer";
    }
}

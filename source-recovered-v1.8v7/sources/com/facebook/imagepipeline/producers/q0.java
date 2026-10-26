package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class q0 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    private final ContentResolver f1385c;

    public q0(Executor executor, d.a.b.g.h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f1385c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.b0
    protected d.a.e.j.e d(d.a.e.l.a aVar) {
        return e(this.f1385c.openInputStream(aVar.p()), -1);
    }

    @Override // com.facebook.imagepipeline.producers.b0
    protected String f() {
        return "QualifiedResourceFetchProducer";
    }
}

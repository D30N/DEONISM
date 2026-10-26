package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@TargetApi(27)
@d.a.b.d.d
/* loaded from: classes.dex */
public class AshmemMemoryChunkPool extends v {
    @d.a.b.d.d
    public AshmemMemoryChunkPool(d.a.b.g.c cVar, f0 f0Var, g0 g0Var) {
        super(cVar, f0Var, g0Var);
    }

    @Override // com.facebook.imagepipeline.memory.v
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public a b(int i) {
        return new a(i);
    }
}

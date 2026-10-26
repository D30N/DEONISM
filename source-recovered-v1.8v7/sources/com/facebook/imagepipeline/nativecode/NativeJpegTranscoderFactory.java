package com.facebook.imagepipeline.nativecode;

import javax.annotation.Nullable;

@d.a.b.d.d
/* loaded from: classes.dex */
public class NativeJpegTranscoderFactory implements d.a.e.n.d {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1301b;

    @d.a.b.d.d
    public NativeJpegTranscoderFactory(int i, boolean z) {
        this.a = i;
        this.f1301b = z;
    }

    @Override // d.a.e.n.d
    @Nullable
    @d.a.b.d.d
    public d.a.e.n.c createImageTranscoder(com.facebook.imageformat.c cVar, boolean z) {
        if (cVar != com.facebook.imageformat.b.a) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.a, this.f1301b);
    }
}

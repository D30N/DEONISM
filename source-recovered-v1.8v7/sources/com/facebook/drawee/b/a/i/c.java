package com.facebook.drawee.b.a.i;

import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class c extends d.a.e.k.a {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final b f1141b;

    public c(String str, @Nullable b bVar) {
        this.f1141b = bVar;
        l(str);
    }

    @Override // d.a.e.k.a, com.facebook.imagepipeline.producers.p0
    public void k(String str, String str2, boolean z) {
        b bVar = this.f1141b;
        if (bVar != null) {
            bVar.a(this.a, d.a(str2), z, str2);
        }
    }

    public void l(String str) {
        this.a = str;
    }
}

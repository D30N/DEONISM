package com.facebook.drawee.b.a.i.i;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.b.a.i.h;
import d.a.e.j.g;
import javax.annotation.Nullable;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<d.a.e.j.g>] */
/* loaded from: classes.dex */
public class a extends com.facebook.drawee.d.c<g> {

    /* renamed from: b, reason: collision with root package name */
    private final com.facebook.common.time.b f1149b;

    /* renamed from: c, reason: collision with root package name */
    private final h f1150c;

    /* renamed from: d, reason: collision with root package name */
    private final com.facebook.drawee.b.a.i.g f1151d;

    public a(com.facebook.common.time.b bVar, h hVar, com.facebook.drawee.b.a.i.g gVar) {
        this.f1149b = bVar;
        this.f1150c = hVar;
        this.f1151d = gVar;
    }

    private void j(long j) {
        this.f1150c.z(false);
        this.f1150c.s(j);
        this.f1151d.d(this.f1150c, 2);
    }

    @Override // com.facebook.drawee.d.c, com.facebook.drawee.d.d
    public void a(String str) {
        super.a(str);
        long jNow = this.f1149b.now();
        int iA = this.f1150c.a();
        if (iA != 3 && iA != 5 && iA != 6) {
            this.f1150c.e(jNow);
            this.f1150c.h(str);
            this.f1151d.e(this.f1150c, 4);
        }
        j(jNow);
    }

    @Override // com.facebook.drawee.d.c, com.facebook.drawee.d.d
    public void b(String str, Object obj) {
        long jNow = this.f1149b.now();
        this.f1150c.c();
        this.f1150c.k(jNow);
        this.f1150c.h(str);
        this.f1150c.d(obj);
        this.f1151d.e(this.f1150c, 0);
        k(jNow);
    }

    @Override // com.facebook.drawee.d.c, com.facebook.drawee.d.d
    public void f(String str, Throwable th) {
        long jNow = this.f1149b.now();
        this.f1150c.f(jNow);
        this.f1150c.h(str);
        this.f1150c.l(th);
        this.f1151d.e(this.f1150c, 5);
        j(jNow);
    }

    @Override // com.facebook.drawee.d.c, com.facebook.drawee.d.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(String str, @Nullable g gVar, @Nullable Animatable animatable) {
        long jNow = this.f1149b.now();
        this.f1150c.g(jNow);
        this.f1150c.q(jNow);
        this.f1150c.h(str);
        this.f1150c.m(gVar);
        this.f1151d.e(this.f1150c, 3);
    }

    @Override // com.facebook.drawee.d.c, com.facebook.drawee.d.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void d(String str, @Nullable g gVar) {
        this.f1150c.j(this.f1149b.now());
        this.f1150c.h(str);
        this.f1150c.m(gVar);
        this.f1151d.e(this.f1150c, 2);
    }

    public void k(long j) {
        this.f1150c.z(true);
        this.f1150c.y(j);
        this.f1151d.d(this.f1150c, 1);
    }
}

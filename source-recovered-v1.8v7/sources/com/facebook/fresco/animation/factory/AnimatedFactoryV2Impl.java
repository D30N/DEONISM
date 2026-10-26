package com.facebook.fresco.animation.factory;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.common.time.RealtimeSinceBootClock;
import d.a.b.b.g;
import d.a.b.d.k;
import d.a.e.c.h;
import d.a.e.j.j;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
@d.a.b.d.d
/* loaded from: classes.dex */
public class AnimatedFactoryV2Impl implements d.a.e.a.b.a {
    private final d.a.e.b.f a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a.e.e.f f1231b;

    /* renamed from: c, reason: collision with root package name */
    private final h<d.a.a.a.d, d.a.e.j.c> f1232c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1233d;

    @Nullable
    private d.a.e.a.b.d e;

    @Nullable
    private d.a.e.a.c.b f;

    @Nullable
    private d.a.e.a.d.a g;

    @Nullable
    private d.a.e.i.a h;

    class a implements d.a.e.h.c {
        final /* synthetic */ Bitmap.Config a;

        a(Bitmap.Config config) {
            this.a = config;
        }

        @Override // d.a.e.h.c
        public d.a.e.j.c a(d.a.e.j.e eVar, int i, j jVar, d.a.e.d.b bVar) {
            return AnimatedFactoryV2Impl.this.k().a(eVar, bVar, this.a);
        }
    }

    class b implements d.a.e.h.c {
        final /* synthetic */ Bitmap.Config a;

        b(Bitmap.Config config) {
            this.a = config;
        }

        @Override // d.a.e.h.c
        public d.a.e.j.c a(d.a.e.j.e eVar, int i, j jVar, d.a.e.d.b bVar) {
            return AnimatedFactoryV2Impl.this.k().b(eVar, bVar, this.a);
        }
    }

    class c implements k<Integer> {
        c(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        }

        @Override // d.a.b.d.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get() {
            return 2;
        }
    }

    class d implements k<Integer> {
        d(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        }

        @Override // d.a.b.d.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get() {
            return 3;
        }
    }

    class e implements d.a.e.a.c.b {
        e() {
        }

        @Override // d.a.e.a.c.b
        public d.a.e.a.a.a a(d.a.e.a.a.e eVar, Rect rect) {
            return new d.a.e.a.c.a(AnimatedFactoryV2Impl.this.j(), eVar, rect, AnimatedFactoryV2Impl.this.f1233d);
        }
    }

    class f implements d.a.e.a.c.b {
        f() {
        }

        @Override // d.a.e.a.c.b
        public d.a.e.a.a.a a(d.a.e.a.a.e eVar, Rect rect) {
            return new d.a.e.a.c.a(AnimatedFactoryV2Impl.this.j(), eVar, rect, AnimatedFactoryV2Impl.this.f1233d);
        }
    }

    @d.a.b.d.d
    public AnimatedFactoryV2Impl(d.a.e.b.f fVar, d.a.e.e.f fVar2, h<d.a.a.a.d, d.a.e.j.c> hVar, boolean z) {
        this.a = fVar;
        this.f1231b = fVar2;
        this.f1232c = hVar;
        this.f1233d = z;
    }

    private d.a.e.a.b.d g() {
        return new d.a.e.a.b.e(new f(), this.a);
    }

    private com.facebook.fresco.animation.factory.a h() {
        c cVar = new c(this);
        return new com.facebook.fresco.animation.factory.a(i(), g.g(), new d.a.b.b.c(this.f1231b.b()), RealtimeSinceBootClock.get(), this.a, this.f1232c, cVar, new d(this));
    }

    private d.a.e.a.c.b i() {
        if (this.f == null) {
            this.f = new e();
        }
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d.a.e.a.d.a j() {
        if (this.g == null) {
            this.g = new d.a.e.a.d.a();
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d.a.e.a.b.d k() {
        if (this.e == null) {
            this.e = g();
        }
        return this.e;
    }

    @Override // d.a.e.a.b.a
    @Nullable
    public d.a.e.i.a a(Context context) {
        if (this.h == null) {
            this.h = h();
        }
        return this.h;
    }

    @Override // d.a.e.a.b.a
    public d.a.e.h.c b(Bitmap.Config config) {
        return new a(config);
    }

    @Override // d.a.e.a.b.a
    public d.a.e.h.c c(Bitmap.Config config) {
        return new b(config);
    }
}

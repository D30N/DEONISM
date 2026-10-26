package com.facebook.imagepipeline.memory;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes.dex */
public class e0 {
    private final d0 a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private v f1270b;

    /* renamed from: c, reason: collision with root package name */
    private e f1271c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private v f1272d;
    private q e;

    @Nullable
    private v f;
    private d.a.b.g.h g;
    private d.a.b.g.k h;
    private d.a.b.g.a i;

    public e0(d0 d0Var) {
        d.a.b.d.i.g(d0Var);
        this.a = d0Var;
    }

    @Nullable
    private v a() {
        if (this.f1270b == null) {
            try {
                this.f1270b = (v) Class.forName("com.facebook.imagepipeline.memory.AshmemMemoryChunkPool").getConstructor(d.a.b.g.c.class, f0.class, g0.class).newInstance(this.a.i(), this.a.g(), this.a.h());
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                this.f1270b = null;
            }
        }
        return this.f1270b;
    }

    @Nullable
    private v f(int i) {
        if (i == 0) {
            return g();
        }
        if (i == 1) {
            return c();
        }
        if (i == 2) {
            return a();
        }
        throw new IllegalArgumentException("Invalid MemoryChunkType");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public e b() {
        e oVar;
        if (this.f1271c == null) {
            String strE = this.a.e();
            char c2 = 65535;
            switch (strE.hashCode()) {
                case -1868884870:
                    if (strE.equals("legacy_default_params")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1106578487:
                    if (strE.equals("legacy")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -404562712:
                    if (strE.equals("experimental")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -402149703:
                    if (strE.equals("dummy_with_tracking")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 95945896:
                    if (strE.equals("dummy")) {
                        c2 = 0;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                oVar = new o();
            } else if (c2 == 1) {
                oVar = new p();
            } else if (c2 != 2) {
                oVar = c2 != 3 ? Build.VERSION.SDK_INT >= 21 ? new i(this.a.i(), this.a.c(), this.a.d()) : new o() : new i(this.a.i(), k.a(), this.a.d());
            } else {
                oVar = new s(this.a.b(), this.a.a(), a0.h(), this.a.l() ? this.a.i() : null);
            }
            this.f1271c = oVar;
        }
        return this.f1271c;
    }

    @Nullable
    public v c() {
        if (this.f1272d == null) {
            try {
                this.f1272d = (v) Class.forName("com.facebook.imagepipeline.memory.BufferMemoryChunkPool").getConstructor(d.a.b.g.c.class, f0.class, g0.class).newInstance(this.a.i(), this.a.g(), this.a.h());
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                this.f1272d = null;
            }
        }
        return this.f1272d;
    }

    public q d() {
        if (this.e == null) {
            this.e = new q(this.a.i(), this.a.f());
        }
        return this.e;
    }

    public int e() {
        return this.a.f().e;
    }

    @Nullable
    public v g() {
        if (this.f == null) {
            try {
                this.f = (v) Class.forName("com.facebook.imagepipeline.memory.NativeMemoryChunkPool").getConstructor(d.a.b.g.c.class, f0.class, g0.class).newInstance(this.a.i(), this.a.g(), this.a.h());
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                d.a.b.e.a.i("PoolFactory", "", e);
                this.f = null;
            }
        }
        return this.f;
    }

    public d.a.b.g.h h() {
        return i(0);
    }

    public d.a.b.g.h i(int i) {
        if (this.g == null) {
            d.a.b.d.i.h(f(i), "failed to get pool for chunk type: " + i);
            this.g = new y(f(i), j());
        }
        return this.g;
    }

    public d.a.b.g.k j() {
        if (this.h == null) {
            this.h = new d.a.b.g.k(k());
        }
        return this.h;
    }

    public d.a.b.g.a k() {
        if (this.i == null) {
            this.i = new r(this.a.i(), this.a.j(), this.a.k());
        }
        return this.i;
    }
}

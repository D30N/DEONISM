package d.a.e.c;

import com.facebook.common.time.RealtimeSinceBootClock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes.dex */
public class c implements d.a.a.a.d {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final d.a.e.d.e f2474b;

    /* renamed from: c, reason: collision with root package name */
    private final d.a.e.d.f f2475c;

    /* renamed from: d, reason: collision with root package name */
    private final d.a.e.d.b f2476d;

    @Nullable
    private final d.a.a.a.d e;

    @Nullable
    private final String f;
    private final int g;
    private final Object h;

    public c(String str, @Nullable d.a.e.d.e eVar, d.a.e.d.f fVar, d.a.e.d.b bVar, @Nullable d.a.a.a.d dVar, @Nullable String str2, Object obj) {
        d.a.b.d.i.g(str);
        this.a = str;
        this.f2474b = eVar;
        this.f2475c = fVar;
        this.f2476d = bVar;
        this.e = dVar;
        this.f = str2;
        Integer numValueOf = Integer.valueOf(str.hashCode());
        if (eVar != null) {
            eVar.hashCode();
            throw null;
        }
        this.g = d.a.b.k.b.d(numValueOf, 0, Integer.valueOf(fVar.hashCode()), this.f2476d, this.e, str2);
        this.h = obj;
        RealtimeSinceBootClock.get().now();
    }

    @Override // d.a.a.a.d
    public String a() {
        return this.a;
    }

    @Override // d.a.a.a.d
    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.g == cVar.g && this.a.equals(cVar.a) && d.a.b.d.h.a(this.f2474b, cVar.f2474b) && d.a.b.d.h.a(this.f2475c, cVar.f2475c) && d.a.b.d.h.a(this.f2476d, cVar.f2476d) && d.a.b.d.h.a(this.e, cVar.e) && d.a.b.d.h.a(this.f, cVar.f);
    }

    @Override // d.a.a.a.d
    public int hashCode() {
        return this.g;
    }

    public String toString() {
        return String.format(null, "%s_%s_%s_%s_%s_%s_%d", this.a, this.f2474b, this.f2475c, this.f2476d, this.e, this.f, Integer.valueOf(this.g));
    }
}

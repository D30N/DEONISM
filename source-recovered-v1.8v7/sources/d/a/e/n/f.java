package d.a.e.n;

import d.a.e.e.l;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class f implements d {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2583b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final d f2584c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final Integer f2585d;

    public f(int i, boolean z, @Nullable d dVar, @Nullable Integer num) {
        this.a = i;
        this.f2583b = z;
        this.f2584c = dVar;
        this.f2585d = num;
    }

    @Nullable
    private c a(com.facebook.imageformat.c cVar, boolean z) {
        d dVar = this.f2584c;
        if (dVar == null) {
            return null;
        }
        return dVar.createImageTranscoder(cVar, z);
    }

    @Nullable
    private c b(com.facebook.imageformat.c cVar, boolean z) {
        Integer num = this.f2585d;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return c(cVar, z);
        }
        if (iIntValue == 1) {
            return d(cVar, z);
        }
        throw new IllegalArgumentException("Invalid ImageTranscoderType");
    }

    @Nullable
    private c c(com.facebook.imageformat.c cVar, boolean z) {
        return com.facebook.imagepipeline.nativecode.c.a(this.a, this.f2583b).createImageTranscoder(cVar, z);
    }

    private c d(com.facebook.imageformat.c cVar, boolean z) {
        return new h(this.a).createImageTranscoder(cVar, z);
    }

    @Override // d.a.e.n.d
    public c createImageTranscoder(com.facebook.imageformat.c cVar, boolean z) {
        c cVarA = a(cVar, z);
        if (cVarA == null) {
            cVarA = b(cVar, z);
        }
        if (cVarA == null && l.a()) {
            cVarA = c(cVar, z);
        }
        return cVarA == null ? d(cVar, z) : cVarA;
    }
}

package d.a.e.d;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import d.a.b.d.h;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes.dex */
public class b {
    private static final b k = b().a();
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2503b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2504c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2505d;
    public final boolean e;
    public final Bitmap.Config f;

    @Nullable
    public final d.a.e.h.c g;

    @Nullable
    public final d.a.e.o.a h;

    @Nullable
    public final ColorSpace i;
    public final boolean j;

    public b(c cVar) {
        this.a = cVar.i();
        this.f2503b = cVar.g();
        this.f2504c = cVar.j();
        this.f2505d = cVar.f();
        this.e = cVar.h();
        this.f = cVar.b();
        this.g = cVar.e();
        this.h = cVar.c();
        this.i = cVar.d();
        this.j = cVar.k();
    }

    public static b a() {
        return k;
    }

    public static c b() {
        return new c();
    }

    protected h.b c() {
        h.b bVarD = h.d(this);
        bVarD.a("minDecodeIntervalMs", this.a);
        bVarD.c("decodePreviewFrame", this.f2503b);
        bVarD.c("useLastFrameForPreview", this.f2504c);
        bVarD.c("decodeAllFrames", this.f2505d);
        bVarD.c("forceStaticImage", this.e);
        bVarD.b("bitmapConfigName", this.f.name());
        bVarD.b("customImageDecoder", this.g);
        bVarD.b("bitmapTransformation", this.h);
        bVarD.b("colorSpace", this.i);
        bVarD.c("useMediaStoreVideoThumbnail", this.j);
        return bVarD;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2503b == bVar.f2503b && this.f2504c == bVar.f2504c && this.f2505d == bVar.f2505d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i && this.j == bVar.j;
    }

    public int hashCode() {
        int iOrdinal = ((((((((((this.a * 31) + (this.f2503b ? 1 : 0)) * 31) + (this.f2504c ? 1 : 0)) * 31) + (this.f2505d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f.ordinal()) * 31;
        d.a.e.h.c cVar = this.g;
        int iHashCode = (iOrdinal + (cVar != null ? cVar.hashCode() : 0)) * 31;
        d.a.e.o.a aVar = this.h;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        ColorSpace colorSpace = this.i;
        return ((iHashCode2 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + (this.j ? 1 : 0);
    }

    public String toString() {
        return "ImageDecodeOptions{" + c().toString() + "}";
    }
}

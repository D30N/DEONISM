package d.a.b.h;

import java.lang.ref.SoftReference;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class f<T> {
    SoftReference<T> a = null;

    /* renamed from: b, reason: collision with root package name */
    SoftReference<T> f2388b = null;

    /* renamed from: c, reason: collision with root package name */
    SoftReference<T> f2389c = null;

    public void a() {
        SoftReference<T> softReference = this.a;
        if (softReference != null) {
            softReference.clear();
            this.a = null;
        }
        SoftReference<T> softReference2 = this.f2388b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f2388b = null;
        }
        SoftReference<T> softReference3 = this.f2389c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f2389c = null;
        }
    }

    @Nullable
    public T b() {
        SoftReference<T> softReference = this.a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public void c(@Nonnull T t) {
        this.a = new SoftReference<>(t);
        this.f2388b = new SoftReference<>(t);
        this.f2389c = new SoftReference<>(t);
    }
}

package d.b.a.b.w;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class a extends f {
    private final Typeface a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0102a f2977b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2978c;

    /* renamed from: d.b.a.b.w.a$a, reason: collision with other inner class name */
    public interface InterfaceC0102a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0102a interfaceC0102a, Typeface typeface) {
        this.a = typeface;
        this.f2977b = interfaceC0102a;
    }

    private void d(Typeface typeface) {
        if (this.f2978c) {
            return;
        }
        this.f2977b.a(typeface);
    }

    @Override // d.b.a.b.w.f
    public void a(int i) {
        d(this.a);
    }

    @Override // d.b.a.b.w.f
    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.f2978c = true;
    }
}

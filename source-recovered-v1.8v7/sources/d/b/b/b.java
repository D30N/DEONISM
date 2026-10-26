package d.b.b;

import android.content.Context;

/* loaded from: classes.dex */
final /* synthetic */ class b implements d.b.b.h.a {
    private final c a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3025b;

    private b(c cVar, Context context) {
        this.a = cVar;
        this.f3025b = context;
    }

    public static d.b.b.h.a a(c cVar, Context context) {
        return new b(cVar, context);
    }

    @Override // d.b.b.h.a
    public Object get() {
        return c.r(this.a, this.f3025b);
    }
}

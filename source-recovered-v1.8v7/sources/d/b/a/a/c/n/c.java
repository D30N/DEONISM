package d.b.a.a.c.n;

import android.content.Context;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static c f2616b = new c();
    private b a = null;

    public static b a(Context context) {
        return f2616b.b(context);
    }

    private final synchronized b b(Context context) {
        if (this.a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.a = new b(context);
        }
        return this.a;
    }
}

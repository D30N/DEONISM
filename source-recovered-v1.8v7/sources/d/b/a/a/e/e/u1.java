package d.b.a.a.e.e;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
final class u1 implements p1 {

    /* renamed from: c, reason: collision with root package name */
    private static u1 f2849c;

    @Nullable
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final ContentObserver f2850b;

    private u1() {
        this.a = null;
        this.f2850b = null;
    }

    private u1(Context context) {
        this.a = context;
        this.f2850b = new w1(this, null);
        context.getContentResolver().registerContentObserver(k1.a, true, this.f2850b);
    }

    static u1 a(Context context) {
        u1 u1Var;
        synchronized (u1.class) {
            if (f2849c == null) {
                f2849c = b.g.d.b.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new u1(context) : new u1();
            }
            u1Var = f2849c;
        }
        return u1Var;
    }

    static synchronized void b() {
        if (f2849c != null && f2849c.a != null && f2849c.f2850b != null) {
            f2849c.a.getContentResolver().unregisterContentObserver(f2849c.f2850b);
        }
        f2849c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // d.b.a.a.e.e.p1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String g(final String str) {
        if (this.a == null) {
            return null;
        }
        try {
            return (String) s1.a(new r1(this, str) { // from class: d.b.a.a.e.e.t1
                private final u1 a;

                /* renamed from: b, reason: collision with root package name */
                private final String f2836b;

                {
                    this.a = this;
                    this.f2836b = str;
                }

                @Override // d.b.a.a.e.e.r1
                public final Object a() {
                    return this.a.c(this.f2836b);
                }
            });
        } catch (IllegalStateException | SecurityException e) {
            String strValueOf = String.valueOf(str);
            Log.e("GservicesLoader", strValueOf.length() != 0 ? "Unable to read GServices for: ".concat(strValueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }

    final /* synthetic */ String c(String str) {
        return k1.a(this.a.getContentResolver(), str, null);
    }
}

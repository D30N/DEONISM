package d.a.e.e;

import d.a.b.h.a;
import java.io.Closeable;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class a {
    private final a.c a;

    /* renamed from: d.a.e.e.a$a, reason: collision with other inner class name */
    class C0091a implements a.c {
        final /* synthetic */ d.a.e.g.a a;

        C0091a(a aVar, d.a.e.g.a aVar2) {
            this.a = aVar2;
        }

        @Override // d.a.b.h.a.c
        public boolean a() {
            return this.a.a();
        }

        @Override // d.a.b.h.a.c
        public void b(d.a.b.h.i<Object> iVar, @Nullable Throwable th) {
            this.a.b(iVar, th);
            d.a.b.e.a.y("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(iVar)), iVar.f().getClass().getName(), a.d(th));
        }
    }

    public a(d.a.e.g.a aVar) {
        this.a = new C0091a(this, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(@Nullable Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public <U extends Closeable> d.a.b.h.a<U> b(U u) {
        return d.a.b.h.a.w(u, this.a);
    }

    public <T> d.a.b.h.a<T> c(T t, d.a.b.h.h<T> hVar) {
        return d.a.b.h.a.y(t, hVar, this.a);
    }
}

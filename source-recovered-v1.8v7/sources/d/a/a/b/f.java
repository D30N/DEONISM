package d.a.a.b;

import d.a.a.a.a;
import d.a.a.b.d;
import d.a.b.c.c;
import d.a.b.d.k;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class f implements d {
    private static final Class<?> f = f.class;
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final k<File> f2355b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2356c;

    /* renamed from: d, reason: collision with root package name */
    private final d.a.a.a.a f2357d;
    volatile a e = new a(null, null);

    static class a {

        @Nullable
        public final d a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public final File f2358b;

        a(@Nullable File file, @Nullable d dVar) {
            this.a = dVar;
            this.f2358b = file;
        }
    }

    public f(int i, k<File> kVar, String str, d.a.a.a.a aVar) {
        this.a = i;
        this.f2357d = aVar;
        this.f2355b = kVar;
        this.f2356c = str;
    }

    private void i() throws c.a {
        File file = new File(this.f2355b.get(), this.f2356c);
        h(file);
        this.e = new a(file, new d.a.a.b.a(file, this.a, this.f2357d));
    }

    private boolean l() {
        File file;
        a aVar = this.e;
        return aVar.a == null || (file = aVar.f2358b) == null || !file.exists();
    }

    @Override // d.a.a.b.d
    public Collection<d.a> a() {
        return k().a();
    }

    @Override // d.a.a.b.d
    public d.b b(String str, Object obj) {
        return k().b(str, obj);
    }

    @Override // d.a.a.b.d
    public boolean c() {
        try {
            return k().c();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // d.a.a.b.d
    public long d(String str) {
        return k().d(str);
    }

    @Override // d.a.a.b.d
    public void e() {
        try {
            k().e();
        } catch (IOException e) {
            d.a.b.e.a.e(f, "purgeUnexpectedResources", e);
        }
    }

    @Override // d.a.a.b.d
    public long f(d.a aVar) {
        return k().f(aVar);
    }

    @Override // d.a.a.b.d
    public com.facebook.binaryresource.a g(String str, Object obj) {
        return k().g(str, obj);
    }

    void h(File file) throws c.a {
        try {
            d.a.b.c.c.a(file);
            d.a.b.e.a.a(f, "Created cache directory %s", file.getAbsolutePath());
        } catch (c.a e) {
            this.f2357d.a(a.EnumC0081a.WRITE_CREATE_DIR, f, "createRootDirectoryIfNecessary", e);
            throw e;
        }
    }

    void j() {
        if (this.e.a == null || this.e.f2358b == null) {
            return;
        }
        d.a.b.c.a.b(this.e.f2358b);
    }

    synchronized d k() {
        d dVar;
        if (l()) {
            j();
            i();
        }
        dVar = this.e.a;
        d.a.b.d.i.g(dVar);
        return dVar;
    }
}

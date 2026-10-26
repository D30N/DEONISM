package d.a.a.b;

import android.content.Context;
import d.a.b.d.k;
import java.io.File;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class c {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2341b;

    /* renamed from: c, reason: collision with root package name */
    private final k<File> f2342c;

    /* renamed from: d, reason: collision with root package name */
    private final long f2343d;
    private final long e;
    private final long f;
    private final h g;
    private final d.a.a.a.a h;
    private final d.a.a.a.c i;
    private final d.a.b.a.b j;
    private final Context k;
    private final boolean l;

    public static class b {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private String f2344b;

        /* renamed from: c, reason: collision with root package name */
        private k<File> f2345c;

        /* renamed from: d, reason: collision with root package name */
        private long f2346d;
        private long e;
        private long f;
        private h g;
        private d.a.a.a.a h;
        private d.a.a.a.c i;
        private d.a.b.a.b j;
        private boolean k;

        @Nullable
        private final Context l;

        class a implements k<File> {
            a() {
            }

            @Override // d.a.b.d.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public File get() {
                return b.this.l.getApplicationContext().getCacheDir();
            }
        }

        private b(@Nullable Context context) {
            this.a = 1;
            this.f2344b = "image_cache";
            this.f2346d = 41943040L;
            this.e = 10485760L;
            this.f = 2097152L;
            this.g = new d.a.a.b.b();
            this.l = context;
        }

        public c m() {
            d.a.b.d.i.j((this.f2345c == null && this.l == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
            if (this.f2345c == null && this.l != null) {
                this.f2345c = new a();
            }
            return new c(this);
        }
    }

    private c(b bVar) {
        this.a = bVar.a;
        String str = bVar.f2344b;
        d.a.b.d.i.g(str);
        this.f2341b = str;
        k<File> kVar = bVar.f2345c;
        d.a.b.d.i.g(kVar);
        this.f2342c = kVar;
        this.f2343d = bVar.f2346d;
        this.e = bVar.e;
        this.f = bVar.f;
        h hVar = bVar.g;
        d.a.b.d.i.g(hVar);
        this.g = hVar;
        this.h = bVar.h == null ? d.a.a.a.g.b() : bVar.h;
        this.i = bVar.i == null ? d.a.a.a.h.h() : bVar.i;
        this.j = bVar.j == null ? d.a.b.a.c.b() : bVar.j;
        this.k = bVar.l;
        this.l = bVar.k;
    }

    public static b m(@Nullable Context context) {
        return new b(context);
    }

    public String a() {
        return this.f2341b;
    }

    public k<File> b() {
        return this.f2342c;
    }

    public d.a.a.a.a c() {
        return this.h;
    }

    public d.a.a.a.c d() {
        return this.i;
    }

    public Context e() {
        return this.k;
    }

    public long f() {
        return this.f2343d;
    }

    public d.a.b.a.b g() {
        return this.j;
    }

    public h h() {
        return this.g;
    }

    public boolean i() {
        return this.l;
    }

    public long j() {
        return this.e;
    }

    public long k() {
        return this.f;
    }

    public int l() {
        return this.a;
    }
}

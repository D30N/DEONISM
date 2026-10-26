package d.a.a.b;

import android.os.Environment;
import d.a.a.a.a;
import d.a.a.b.d;
import d.a.b.c.c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class a implements d.a.a.b.d {
    private static final Class<?> f = a.class;
    static final long g = TimeUnit.MINUTES.toMillis(30);
    private final File a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2330b;

    /* renamed from: c, reason: collision with root package name */
    private final File f2331c;

    /* renamed from: d, reason: collision with root package name */
    private final d.a.a.a.a f2332d;
    private final com.facebook.common.time.a e;

    private class b implements d.a.b.c.b {
        private final List<d.a> a;

        private b() {
            this.a = new ArrayList();
        }

        @Override // d.a.b.c.b
        public void a(File file) {
        }

        @Override // d.a.b.c.b
        public void b(File file) {
        }

        @Override // d.a.b.c.b
        public void c(File file) {
            d dVarT = a.this.t(file);
            if (dVarT == null || dVarT.a != ".cnt") {
                return;
            }
            this.a.add(new c(dVarT.f2337b, file));
        }

        public List<d.a> d() {
            return Collections.unmodifiableList(this.a);
        }
    }

    static class c implements d.a {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final com.facebook.binaryresource.b f2334b;

        /* renamed from: c, reason: collision with root package name */
        private long f2335c;

        /* renamed from: d, reason: collision with root package name */
        private long f2336d;

        private c(String str, File file) {
            d.a.b.d.i.g(file);
            d.a.b.d.i.g(str);
            this.a = str;
            this.f2334b = com.facebook.binaryresource.b.b(file);
            this.f2335c = -1L;
            this.f2336d = -1L;
        }

        @Override // d.a.a.b.d.a
        public long a() {
            if (this.f2335c < 0) {
                this.f2335c = this.f2334b.size();
            }
            return this.f2335c;
        }

        @Override // d.a.a.b.d.a
        public long b() {
            if (this.f2336d < 0) {
                this.f2336d = this.f2334b.c().lastModified();
            }
            return this.f2336d;
        }

        public com.facebook.binaryresource.b c() {
            return this.f2334b;
        }

        @Override // d.a.a.b.d.a
        public String getId() {
            return this.a;
        }
    }

    private static class d {
        public final String a;

        /* renamed from: b, reason: collision with root package name */
        public final String f2337b;

        private d(String str, String str2) {
            this.a = str;
            this.f2337b = str2;
        }

        @Nullable
        public static d b(File file) {
            String strR;
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            if (iLastIndexOf <= 0 || (strR = a.r(name.substring(iLastIndexOf))) == null) {
                return null;
            }
            String strSubstring = name.substring(0, iLastIndexOf);
            if (strR.equals(".tmp")) {
                int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                if (iLastIndexOf2 <= 0) {
                    return null;
                }
                strSubstring = strSubstring.substring(0, iLastIndexOf2);
            }
            return new d(strR, strSubstring);
        }

        public File a(File file) {
            return File.createTempFile(this.f2337b + ".", ".tmp", file);
        }

        public String c(String str) {
            return str + File.separator + this.f2337b + this.a;
        }

        public String toString() {
            return this.a + "(" + this.f2337b + ")";
        }
    }

    private static class e extends IOException {
        public e(long j, long j2) {
            super("File was not written completely. Expected: " + j + ", found: " + j2);
        }
    }

    class f implements d.b {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        final File f2338b;

        public f(String str, File file) {
            this.a = str;
            this.f2338b = file;
        }

        @Override // d.a.a.b.d.b
        public boolean a() {
            return !this.f2338b.exists() || this.f2338b.delete();
        }

        @Override // d.a.a.b.d.b
        public void b(d.a.a.a.j jVar, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f2338b);
                try {
                    d.a.b.d.c cVar = new d.a.b.d.c(fileOutputStream);
                    jVar.a(cVar);
                    cVar.flush();
                    long jA = cVar.a();
                    fileOutputStream.close();
                    if (this.f2338b.length() != jA) {
                        throw new e(jA, this.f2338b.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e) {
                a.this.f2332d.a(a.EnumC0081a.WRITE_UPDATE_FILE_NOT_FOUND, a.f, "updateResource", e);
                throw e;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
        @Override // d.a.a.b.d.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.facebook.binaryresource.a c(java.lang.Object r5) throws d.a.b.c.c.d {
            /*
                r4 = this;
                d.a.a.b.a r5 = d.a.a.b.a.this
                java.lang.String r0 = r4.a
                java.io.File r5 = r5.p(r0)
                java.io.File r0 = r4.f2338b     // Catch: d.a.b.c.c.d -> L25
                d.a.b.c.c.b(r0, r5)     // Catch: d.a.b.c.c.d -> L25
                boolean r0 = r5.exists()
                if (r0 == 0) goto L20
                d.a.a.b.a r0 = d.a.a.b.a.this
                com.facebook.common.time.a r0 = d.a.a.b.a.l(r0)
                long r0 = r0.now()
                r5.setLastModified(r0)
            L20:
                com.facebook.binaryresource.b r5 = com.facebook.binaryresource.b.b(r5)
                return r5
            L25:
                r5 = move-exception
                java.lang.Throwable r0 = r5.getCause()
                if (r0 == 0) goto L3a
                boolean r1 = r0 instanceof d.a.b.c.c.C0084c
                if (r1 != 0) goto L37
                boolean r0 = r0 instanceof java.io.FileNotFoundException
                if (r0 == 0) goto L3a
                d.a.a.a.a$a r0 = d.a.a.a.a.EnumC0081a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND
                goto L3c
            L37:
                d.a.a.a.a$a r0 = d.a.a.a.a.EnumC0081a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND
                goto L3c
            L3a:
                d.a.a.a.a$a r0 = d.a.a.a.a.EnumC0081a.WRITE_RENAME_FILE_OTHER
            L3c:
                d.a.a.b.a r1 = d.a.a.b.a.this
                d.a.a.a.a r1 = d.a.a.b.a.i(r1)
                java.lang.Class r2 = d.a.a.b.a.n()
                java.lang.String r3 = "commit"
                r1.a(r0, r2, r3, r5)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: d.a.a.b.a.f.c(java.lang.Object):com.facebook.binaryresource.a");
        }
    }

    private class g implements d.a.b.c.b {
        private boolean a;

        private g() {
        }

        private boolean d(File file) {
            d dVarT = a.this.t(file);
            if (dVarT == null) {
                return false;
            }
            String str = dVarT.a;
            if (str == ".tmp") {
                return e(file);
            }
            d.a.b.d.i.i(str == ".cnt");
            return true;
        }

        private boolean e(File file) {
            return file.lastModified() > a.this.e.now() - a.g;
        }

        @Override // d.a.b.c.b
        public void a(File file) {
            if (this.a || !file.equals(a.this.f2331c)) {
                return;
            }
            this.a = true;
        }

        @Override // d.a.b.c.b
        public void b(File file) {
            if (!a.this.a.equals(file) && !this.a) {
                file.delete();
            }
            if (this.a && file.equals(a.this.f2331c)) {
                this.a = false;
            }
        }

        @Override // d.a.b.c.b
        public void c(File file) {
            if (this.a && d(file)) {
                return;
            }
            file.delete();
        }
    }

    public a(File file, int i, d.a.a.a.a aVar) {
        d.a.b.d.i.g(file);
        this.a = file;
        this.f2330b = x(file, aVar);
        this.f2331c = new File(this.a, w(i));
        this.f2332d = aVar;
        z();
        this.e = com.facebook.common.time.c.a();
    }

    private long o(File file) {
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static String r(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    private String s(String str) {
        d dVar = new d(".cnt", str);
        return dVar.c(v(dVar.f2337b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public d t(File file) {
        d dVarB = d.b(file);
        if (dVarB != null && u(dVarB.f2337b).equals(file.getParentFile())) {
            return dVarB;
        }
        return null;
    }

    private File u(String str) {
        return new File(v(str));
    }

    private String v(String str) {
        return this.f2331c + File.separator + String.valueOf(Math.abs(str.hashCode() % 100));
    }

    static String w(int i) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i));
    }

    private static boolean x(File file, d.a.a.a.a aVar) throws IOException {
        String canonicalPath;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            String string = externalStorageDirectory.toString();
            try {
                canonicalPath = file.getCanonicalPath();
            } catch (IOException e2) {
                e = e2;
                canonicalPath = null;
            }
            try {
                return canonicalPath.contains(string);
            } catch (IOException e3) {
                e = e3;
                aVar.a(a.EnumC0081a.OTHER, f, "failed to read folder to check if external: " + canonicalPath, e);
                return false;
            }
        } catch (Exception e4) {
            aVar.a(a.EnumC0081a.OTHER, f, "failed to get the external storage directory!", e4);
            return false;
        }
    }

    private void y(File file, String str) throws c.a {
        try {
            d.a.b.c.c.a(file);
        } catch (c.a e2) {
            this.f2332d.a(a.EnumC0081a.WRITE_CREATE_DIR, f, str, e2);
            throw e2;
        }
    }

    private void z() {
        boolean z = true;
        if (this.a.exists()) {
            if (this.f2331c.exists()) {
                z = false;
            } else {
                d.a.b.c.a.b(this.a);
            }
        }
        if (z) {
            try {
                d.a.b.c.c.a(this.f2331c);
            } catch (c.a unused) {
                this.f2332d.a(a.EnumC0081a.WRITE_CREATE_DIR, f, "version directory could not be created: " + this.f2331c, null);
            }
        }
    }

    @Override // d.a.a.b.d
    public d.b b(String str, Object obj) throws IOException {
        d dVar = new d(".tmp", str);
        File fileU = u(dVar.f2337b);
        if (!fileU.exists()) {
            y(fileU, "insert");
        }
        try {
            return new f(str, dVar.a(fileU));
        } catch (IOException e2) {
            this.f2332d.a(a.EnumC0081a.WRITE_CREATE_TEMPFILE, f, "insert", e2);
            throw e2;
        }
    }

    @Override // d.a.a.b.d
    public boolean c() {
        return this.f2330b;
    }

    @Override // d.a.a.b.d
    public long d(String str) {
        return o(p(str));
    }

    @Override // d.a.a.b.d
    public void e() {
        d.a.b.c.a.c(this.a, new g());
    }

    @Override // d.a.a.b.d
    public long f(d.a aVar) {
        return o(((c) aVar).c().c());
    }

    @Override // d.a.a.b.d
    @Nullable
    public com.facebook.binaryresource.a g(String str, Object obj) {
        File fileP = p(str);
        if (!fileP.exists()) {
            return null;
        }
        fileP.setLastModified(this.e.now());
        return com.facebook.binaryresource.b.b(fileP);
    }

    File p(String str) {
        return new File(s(str));
    }

    @Override // d.a.a.b.d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public List<d.a> a() {
        b bVar = new b();
        d.a.b.c.a.c(this.f2331c, bVar);
        return bVar.d();
    }
}

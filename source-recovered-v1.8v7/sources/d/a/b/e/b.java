package d.a.b.e;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final b f2375c = new b();
    private String a = "unknown";

    /* renamed from: b, reason: collision with root package name */
    private int f2376b = 5;

    private b() {
    }

    public static b k() {
        return f2375c;
    }

    private static String l(String str, Throwable th) {
        return str + '\n' + m(th);
    }

    private static String m(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private String n(String str) {
        if (this.a == null) {
            return str;
        }
        return this.a + ":" + str;
    }

    private void o(int i, String str, String str2) {
        Log.println(i, n(str), str2);
    }

    private void p(int i, String str, String str2, Throwable th) {
        Log.println(i, n(str), l(str2, th));
    }

    @Override // d.a.b.e.c
    public void a(String str, String str2, Throwable th) {
        p(5, str, str2, th);
    }

    @Override // d.a.b.e.c
    public boolean b(int i) {
        return this.f2376b <= i;
    }

    @Override // d.a.b.e.c
    public void c(String str, String str2, Throwable th) {
        p(3, str, str2, th);
    }

    @Override // d.a.b.e.c
    public void d(String str, String str2) {
        o(6, str, str2);
    }

    @Override // d.a.b.e.c
    public void e(String str, String str2) {
        o(2, str, str2);
    }

    @Override // d.a.b.e.c
    public void f(String str, String str2) {
        o(6, str, str2);
    }

    @Override // d.a.b.e.c
    public void g(String str, String str2, Throwable th) {
        p(6, str, str2, th);
    }

    @Override // d.a.b.e.c
    public void h(String str, String str2, Throwable th) {
        p(6, str, str2, th);
    }

    @Override // d.a.b.e.c
    public void i(String str, String str2) {
        o(5, str, str2);
    }

    @Override // d.a.b.e.c
    public void j(String str, String str2) {
        o(3, str, str2);
    }
}

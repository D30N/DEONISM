package b.e.a.j;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class n {
    HashSet<n> a = new HashSet<>(2);

    /* renamed from: b, reason: collision with root package name */
    int f826b = 0;

    public void a(n nVar) {
        this.a.add(nVar);
    }

    public void b() {
        this.f826b = 1;
        Iterator<n> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public void c() {
        this.f826b = 0;
        Iterator<n> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public boolean d() {
        return this.f826b == 1;
    }

    public void e() {
        this.f826b = 0;
        this.a.clear();
    }

    public void f() {
    }
}

package d.a.e.j;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: b, reason: collision with root package name */
    private d.a.e.a.a.e f2558b;

    public a(d.a.e.a.a.e eVar) {
        this.f2558b = eVar;
    }

    @Override // d.a.e.j.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.f2558b == null) {
                return;
            }
            d.a.e.a.a.e eVar = this.f2558b;
            this.f2558b = null;
            eVar.a();
        }
    }

    @Override // d.a.e.j.c
    public synchronized int f() {
        return isClosed() ? 0 : this.f2558b.c().h();
    }

    @Override // d.a.e.j.c
    public boolean g() {
        return true;
    }

    @Override // d.a.e.j.g
    public synchronized int getHeight() {
        return isClosed() ? 0 : this.f2558b.c().getHeight();
    }

    @Override // d.a.e.j.g
    public synchronized int getWidth() {
        return isClosed() ? 0 : this.f2558b.c().getWidth();
    }

    public synchronized d.a.e.a.a.e i() {
        return this.f2558b;
    }

    @Override // d.a.e.j.c
    public synchronized boolean isClosed() {
        return this.f2558b == null;
    }
}

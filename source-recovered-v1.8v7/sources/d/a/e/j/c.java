package d.a.e.j;

import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class c implements Closeable, g {
    public j a() {
        return h.f2568d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract int f();

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        d.a.b.e.a.y("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public boolean g() {
        return false;
    }

    public void h(i iVar) {
    }

    public abstract boolean isClosed();
}

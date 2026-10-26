package d.a.b.g;

import d.a.b.d.m;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class j extends OutputStream {
    public abstract g a();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws X, IOException {
        try {
            super.close();
        } catch (IOException e) {
            m.a(e);
            throw null;
        }
    }

    public abstract int size();
}

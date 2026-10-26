package d.a.b.g;

import java.io.IOException;
import java.io.InputStream;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes.dex */
public class f extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    private final InputStream f2378b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f2379c;

    /* renamed from: d, reason: collision with root package name */
    private final d.a.b.h.h<byte[]> f2380d;
    private int e;
    private int f;
    private boolean g;

    public f(InputStream inputStream, byte[] bArr, d.a.b.h.h<byte[]> hVar) {
        d.a.b.d.i.g(inputStream);
        this.f2378b = inputStream;
        d.a.b.d.i.g(bArr);
        this.f2379c = bArr;
        d.a.b.d.i.g(hVar);
        this.f2380d = hVar;
        this.e = 0;
        this.f = 0;
        this.g = false;
    }

    private boolean a() throws IOException {
        if (this.f < this.e) {
            return true;
        }
        int i = this.f2378b.read(this.f2379c);
        if (i <= 0) {
            return false;
        }
        this.e = i;
        this.f = 0;
        return true;
    }

    private void f() throws IOException {
        if (this.g) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        d.a.b.d.i.i(this.f <= this.e);
        f();
        return (this.e - this.f) + this.f2378b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.g) {
            return;
        }
        this.g = true;
        this.f2380d.a(this.f2379c);
        super.close();
    }

    protected void finalize() throws Throwable {
        if (!this.g) {
            d.a.b.e.a.h("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        d.a.b.d.i.i(this.f <= this.e);
        f();
        if (!a()) {
            return -1;
        }
        byte[] bArr = this.f2379c;
        int i = this.f;
        this.f = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        d.a.b.d.i.i(this.f <= this.e);
        f();
        if (!a()) {
            return -1;
        }
        int iMin = Math.min(this.e - this.f, i2);
        System.arraycopy(this.f2379c, this.f, bArr, i, iMin);
        this.f += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        d.a.b.d.i.i(this.f <= this.e);
        f();
        int i = this.e;
        int i2 = this.f;
        long j2 = i - i2;
        if (j2 >= j) {
            this.f = (int) (i2 + j);
            return j;
        }
        this.f = i;
        return j2 + this.f2378b.skip(j - j2);
    }
}

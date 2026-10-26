package d.a.b.g;

import java.io.InputStream;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes.dex */
public class i extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    final g f2381b;

    /* renamed from: c, reason: collision with root package name */
    int f2382c;

    /* renamed from: d, reason: collision with root package name */
    int f2383d;

    public i(g gVar) {
        d.a.b.d.i.b(!gVar.isClosed());
        d.a.b.d.i.g(gVar);
        this.f2381b = gVar;
        this.f2382c = 0;
        this.f2383d = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f2381b.size() - this.f2382c;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f2383d = this.f2382c;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        g gVar = this.f2381b;
        int i = this.f2382c;
        this.f2382c = i + 1;
        return gVar.c(i) & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        int iAvailable = available();
        if (iAvailable <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int iMin = Math.min(iAvailable, i2);
        this.f2381b.b(this.f2382c, bArr, i, iMin);
        this.f2382c += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f2382c = this.f2383d;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        d.a.b.d.i.b(j >= 0);
        int iMin = Math.min((int) j, available());
        this.f2382c += iMin;
        return iMin;
    }
}

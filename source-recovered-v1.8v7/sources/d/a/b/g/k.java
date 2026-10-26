package d.a.b.g;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class k {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final a f2384b;

    public k(a aVar) {
        this(aVar, 16384);
    }

    public k(a aVar, int i) {
        d.a.b.d.i.b(i > 0);
        this.a = i;
        this.f2384b = aVar;
    }

    public long a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = this.f2384b.get(this.a);
        long j = 0;
        while (true) {
            try {
                int i = inputStream.read(bArr, 0, this.a);
                if (i == -1) {
                    return j;
                }
                outputStream.write(bArr, 0, i);
                j += i;
            } finally {
                this.f2384b.a(bArr);
            }
        }
    }
}

package d.b.a.a.c;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class u extends s {

    /* renamed from: c, reason: collision with root package name */
    private static final WeakReference<byte[]> f2622c = new WeakReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<byte[]> f2623b;

    u(byte[] bArr) {
        super(bArr);
        this.f2623b = f2622c;
    }

    protected abstract byte[] V();

    @Override // d.b.a.a.c.s
    final byte[] h() {
        byte[] bArrV;
        synchronized (this) {
            bArrV = this.f2623b.get();
            if (bArrV == null) {
                bArrV = V();
                this.f2623b = new WeakReference<>(bArrV);
            }
        }
        return bArrV;
    }
}

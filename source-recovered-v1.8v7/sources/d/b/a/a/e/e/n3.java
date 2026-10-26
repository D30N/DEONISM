package d.b.a.a.e.e;

/* loaded from: classes.dex */
final class n3 extends u3 {
    private final int f;
    private final int g;

    n3(byte[] bArr, int i, int i2) {
        super(bArr);
        l3.p(i, i + i2, bArr.length);
        this.f = i;
        this.g = i2;
    }

    @Override // d.b.a.a.e.e.u3, d.b.a.a.e.e.l3
    public final byte c(int i) {
        int iH = h();
        if (((iH - (i + 1)) | i) >= 0) {
            return this.e[this.f + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(iH);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // d.b.a.a.e.e.u3, d.b.a.a.e.e.l3
    public final int h() {
        return this.g;
    }

    @Override // d.b.a.a.e.e.u3, d.b.a.a.e.e.l3
    final byte o(int i) {
        return this.e[this.f + i];
    }

    @Override // d.b.a.a.e.e.u3
    protected final int x() {
        return this.f;
    }
}

package d.b.a.a.e.e;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
class u3 extends r3 {
    protected final byte[] e;

    u3(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
        this.e = bArr;
    }

    @Override // d.b.a.a.e.e.l3
    public byte c(int i) {
        return this.e[i];
    }

    @Override // d.b.a.a.e.e.l3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l3) || h() != ((l3) obj).h()) {
            return false;
        }
        if (h() == 0) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return obj.equals(this);
        }
        u3 u3Var = (u3) obj;
        int iV = v();
        int iV2 = u3Var.v();
        if (iV == 0 || iV2 == 0 || iV == iV2) {
            return w(u3Var, 0, h());
        }
        return false;
    }

    @Override // d.b.a.a.e.e.l3
    public int h() {
        return this.e.length;
    }

    @Override // d.b.a.a.e.e.l3
    protected final int i(int i, int i2, int i3) {
        return u4.a(i, this.e, x(), i3);
    }

    @Override // d.b.a.a.e.e.l3
    public final l3 j(int i, int i2) {
        int iP = l3.p(0, i2, h());
        return iP == 0 ? l3.f2755c : new n3(this.e, x(), iP);
    }

    @Override // d.b.a.a.e.e.l3
    protected final String m(Charset charset) {
        return new String(this.e, x(), h(), charset);
    }

    @Override // d.b.a.a.e.e.l3
    final void n(i3 i3Var) {
        i3Var.a(this.e, x(), h());
    }

    @Override // d.b.a.a.e.e.l3
    byte o(int i) {
        return this.e[i];
    }

    @Override // d.b.a.a.e.e.l3
    public final boolean u() {
        int iX = x();
        return t7.g(this.e, iX, h() + iX);
    }

    final boolean w(l3 l3Var, int i, int i2) {
        if (i2 > l3Var.h()) {
            int iH = h();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(iH);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 > l3Var.h()) {
            int iH2 = l3Var.h();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(iH2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(l3Var instanceof u3)) {
            return l3Var.j(0, i2).equals(j(0, i2));
        }
        u3 u3Var = (u3) l3Var;
        byte[] bArr = this.e;
        byte[] bArr2 = u3Var.e;
        int iX = x() + i2;
        int iX2 = x();
        int iX3 = u3Var.x();
        while (iX2 < iX) {
            if (bArr[iX2] != bArr2[iX3]) {
                return false;
            }
            iX2++;
            iX3++;
        }
        return true;
    }

    protected int x() {
        return 0;
    }
}

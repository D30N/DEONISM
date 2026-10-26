package b.e.a;

import b.e.a.e;
import b.e.a.i;

/* loaded from: classes.dex */
public class b implements e.a {

    /* renamed from: c, reason: collision with root package name */
    boolean f781c;

    /* renamed from: d, reason: collision with root package name */
    public final a f782d;
    i a = null;

    /* renamed from: b, reason: collision with root package name */
    float f780b = 0.0f;
    boolean e = false;

    public b(c cVar) {
        this.f782d = new a(this, cVar);
    }

    @Override // b.e.a.e.a
    public void a(e.a aVar) {
        if (!(aVar instanceof b)) {
            return;
        }
        b bVar = (b) aVar;
        this.a = null;
        this.f782d.c();
        int i = 0;
        while (true) {
            a aVar2 = bVar.f782d;
            if (i >= aVar2.a) {
                return;
            }
            this.f782d.a(aVar2.h(i), bVar.f782d.i(i), true);
            i++;
        }
    }

    @Override // b.e.a.e.a
    public void b(i iVar) {
        int i = iVar.f794d;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f782d.l(iVar, f);
    }

    @Override // b.e.a.e.a
    public i c(e eVar, boolean[] zArr) {
        return this.f782d.g(zArr, null);
    }

    @Override // b.e.a.e.a
    public void clear() {
        this.f782d.c();
        this.a = null;
        this.f780b = 0.0f;
    }

    public b d(e eVar, int i) {
        this.f782d.l(eVar.p(i, "ep"), 1.0f);
        this.f782d.l(eVar.p(i, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i) {
        this.f782d.l(iVar, i);
        return this;
    }

    boolean f(e eVar) {
        boolean z;
        i iVarB = this.f782d.b(eVar);
        if (iVarB == null) {
            z = true;
        } else {
            v(iVarB);
            z = false;
        }
        if (this.f782d.a == 0) {
            this.e = true;
        }
        return z;
    }

    b g(i iVar, i iVar2, int i, float f, i iVar3, i iVar4, int i2) {
        float f2;
        if (iVar2 == iVar3) {
            this.f782d.l(iVar, 1.0f);
            this.f782d.l(iVar4, 1.0f);
            this.f782d.l(iVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f782d.l(iVar, 1.0f);
            this.f782d.l(iVar2, -1.0f);
            this.f782d.l(iVar3, -1.0f);
            this.f782d.l(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                f2 = (-i) + i2;
                this.f780b = f2;
            }
        } else {
            if (f <= 0.0f) {
                this.f782d.l(iVar, -1.0f);
                this.f782d.l(iVar2, 1.0f);
                f2 = i;
            } else if (f >= 1.0f) {
                this.f782d.l(iVar3, -1.0f);
                this.f782d.l(iVar4, 1.0f);
                f2 = i2;
            } else {
                float f3 = 1.0f - f;
                this.f782d.l(iVar, f3 * 1.0f);
                this.f782d.l(iVar2, f3 * (-1.0f));
                this.f782d.l(iVar3, (-1.0f) * f);
                this.f782d.l(iVar4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    f2 = ((-i) * f3) + (i2 * f);
                }
            }
            this.f780b = f2;
        }
        return this;
    }

    @Override // b.e.a.e.a
    public i getKey() {
        return this.a;
    }

    b h(i iVar, int i) {
        this.a = iVar;
        float f = i;
        iVar.e = f;
        this.f780b = f;
        this.e = true;
        return this;
    }

    b i(i iVar, i iVar2, i iVar3, float f) {
        this.f782d.l(iVar, -1.0f);
        this.f782d.l(iVar2, 1.0f - f);
        this.f782d.l(iVar3, f);
        return this;
    }

    public b j(i iVar, i iVar2, i iVar3, i iVar4, float f) {
        this.f782d.l(iVar, -1.0f);
        this.f782d.l(iVar2, 1.0f);
        this.f782d.l(iVar3, f);
        this.f782d.l(iVar4, -f);
        return this;
    }

    public b k(float f, float f2, float f3, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f780b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f782d.l(iVar, 1.0f);
            this.f782d.l(iVar2, -1.0f);
            this.f782d.l(iVar4, 1.0f);
            this.f782d.l(iVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f782d.l(iVar, 1.0f);
            this.f782d.l(iVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f782d.l(iVar3, 1.0f);
            this.f782d.l(iVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f782d.l(iVar, 1.0f);
            this.f782d.l(iVar2, -1.0f);
            this.f782d.l(iVar4, f4);
            this.f782d.l(iVar3, -f4);
        }
        return this;
    }

    public b l(i iVar, int i) {
        a aVar;
        float f;
        if (i < 0) {
            this.f780b = i * (-1);
            aVar = this.f782d;
            f = 1.0f;
        } else {
            this.f780b = i;
            aVar = this.f782d;
            f = -1.0f;
        }
        aVar.l(iVar, f);
        return this;
    }

    public b m(i iVar, i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f780b = i;
        }
        if (z) {
            this.f782d.l(iVar, 1.0f);
            this.f782d.l(iVar2, -1.0f);
        } else {
            this.f782d.l(iVar, -1.0f);
            this.f782d.l(iVar2, 1.0f);
        }
        return this;
    }

    public b n(i iVar, i iVar2, i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f780b = i;
        }
        if (z) {
            this.f782d.l(iVar, 1.0f);
            this.f782d.l(iVar2, -1.0f);
            this.f782d.l(iVar3, -1.0f);
        } else {
            this.f782d.l(iVar, -1.0f);
            this.f782d.l(iVar2, 1.0f);
            this.f782d.l(iVar3, 1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f780b = i;
        }
        if (z) {
            this.f782d.l(iVar, 1.0f);
            this.f782d.l(iVar2, -1.0f);
            this.f782d.l(iVar3, 1.0f);
        } else {
            this.f782d.l(iVar, -1.0f);
            this.f782d.l(iVar2, 1.0f);
            this.f782d.l(iVar3, -1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, i iVar4, float f) {
        this.f782d.l(iVar3, 0.5f);
        this.f782d.l(iVar4, 0.5f);
        this.f782d.l(iVar, -0.5f);
        this.f782d.l(iVar2, -0.5f);
        this.f780b = -f;
        return this;
    }

    void q() {
        float f = this.f780b;
        if (f < 0.0f) {
            this.f780b = f * (-1.0f);
            this.f782d.j();
        }
    }

    boolean r() {
        i iVar = this.a;
        return iVar != null && (iVar.g == i.a.UNRESTRICTED || this.f780b >= 0.0f);
    }

    boolean s(i iVar) {
        return this.f782d.d(iVar);
    }

    public boolean t() {
        return this.a == null && this.f780b == 0.0f && this.f782d.a == 0;
    }

    public String toString() {
        return x();
    }

    i u(i iVar) {
        return this.f782d.g(null, iVar);
    }

    void v(i iVar) {
        i iVar2 = this.a;
        if (iVar2 != null) {
            this.f782d.l(iVar2, -1.0f);
            this.a = null;
        }
        float fM = this.f782d.m(iVar, true) * (-1.0f);
        this.a = iVar;
        if (fM == 1.0f) {
            return;
        }
        this.f780b /= fM;
        this.f782d.e(fM);
    }

    public void w() {
        this.a = null;
        this.f782d.c();
        this.f780b = 0.0f;
        this.e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String x() {
        /*
            r9 = this;
            b.e.a.i r0 = r9.a
            java.lang.String r1 = ""
            if (r0 != 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L21
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            b.e.a.i r1 = r9.a
            r0.append(r1)
        L21:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.f780b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f780b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L53
        L52:
            r1 = 0
        L53:
            b.e.a.a r5 = r9.f782d
            int r5 = r5.a
        L57:
            if (r2 >= r5) goto Ld4
            b.e.a.a r6 = r9.f782d
            b.e.a.i r6 = r6.h(r2)
            if (r6 != 0) goto L62
            goto Ld1
        L62:
            b.e.a.a r7 = r9.f782d
            float r7 = r7.i(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L6d
            goto Ld1
        L6d:
            java.lang.String r6 = r6.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L84
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto Lad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto La4
        L84:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 <= 0) goto L9a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto Lad
        L9a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        La4:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r8
        Lad:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto Lc6
        Lb9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        Lc6:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = 1
        Ld1:
            int r2 = r2 + 1
            goto L57
        Ld4:
            if (r1 != 0) goto Le7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Le7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.a.b.x():java.lang.String");
    }
}

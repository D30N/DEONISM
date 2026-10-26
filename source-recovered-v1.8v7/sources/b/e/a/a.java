package b.e.a;

import b.e.a.i;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private final b f777b;

    /* renamed from: c, reason: collision with root package name */
    private final c f778c;
    int a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f779d = 8;
    private i e = null;
    private int[] f = new int[8];
    private int[] g = new int[8];
    private float[] h = new float[8];
    private int i = -1;
    private int j = -1;
    private boolean k = false;

    a(b bVar, c cVar) {
        this.f777b = bVar;
        this.f778c = cVar;
    }

    private boolean k(i iVar, e eVar) {
        return iVar.j <= 1;
    }

    final void a(i iVar, float f, boolean z) {
        if (f == 0.0f) {
            return;
        }
        int i = this.i;
        if (i == -1) {
            this.i = 0;
            this.h[0] = f;
            this.f[0] = iVar.f792b;
            this.g[0] = -1;
            iVar.j++;
            iVar.a(this.f777b);
            this.a++;
            if (this.k) {
                return;
            }
            int i2 = this.j + 1;
            this.j = i2;
            int[] iArr = this.f;
            if (i2 >= iArr.length) {
                this.k = true;
                this.j = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
            int[] iArr2 = this.f;
            int i5 = iArr2[i];
            int i6 = iVar.f792b;
            if (i5 == i6) {
                float[] fArr = this.h;
                fArr[i] = fArr[i] + f;
                if (fArr[i] == 0.0f) {
                    if (i == this.i) {
                        this.i = this.g[i];
                    } else {
                        int[] iArr3 = this.g;
                        iArr3[i3] = iArr3[i];
                    }
                    if (z) {
                        iVar.c(this.f777b);
                    }
                    if (this.k) {
                        this.j = i;
                    }
                    iVar.j--;
                    this.a--;
                    return;
                }
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.g[i];
        }
        int length = this.j;
        int i7 = length + 1;
        if (this.k) {
            int[] iArr4 = this.f;
            if (iArr4[length] != -1) {
                length = iArr4.length;
            }
        } else {
            length = i7;
        }
        int[] iArr5 = this.f;
        if (length >= iArr5.length && this.a < iArr5.length) {
            int i8 = 0;
            while (true) {
                int[] iArr6 = this.f;
                if (i8 >= iArr6.length) {
                    break;
                }
                if (iArr6[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr7 = this.f;
        if (length >= iArr7.length) {
            length = iArr7.length;
            int i9 = this.f779d * 2;
            this.f779d = i9;
            this.k = false;
            this.j = length - 1;
            this.h = Arrays.copyOf(this.h, i9);
            this.f = Arrays.copyOf(this.f, this.f779d);
            this.g = Arrays.copyOf(this.g, this.f779d);
        }
        this.f[length] = iVar.f792b;
        this.h[length] = f;
        int[] iArr8 = this.g;
        if (i3 != -1) {
            iArr8[length] = iArr8[i3];
            iArr8[i3] = length;
        } else {
            iArr8[length] = this.i;
            this.i = length;
        }
        iVar.j++;
        iVar.a(this.f777b);
        this.a++;
        if (!this.k) {
            this.j++;
        }
        int i10 = this.j;
        int[] iArr9 = this.f;
        if (i10 >= iArr9.length) {
            this.k = true;
            this.j = iArr9.length - 1;
        }
    }

    i b(e eVar) {
        int i = this.i;
        i iVar = null;
        i iVar2 = null;
        boolean zK = false;
        boolean zK2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.h;
            float f3 = fArr[i];
            i iVar3 = this.f778c.f784c[this.f[i]];
            if (f3 < 0.0f) {
                if (f3 > -0.001f) {
                    fArr[i] = 0.0f;
                    iVar3.c(this.f777b);
                    f3 = 0.0f;
                }
            } else if (f3 < 0.001f) {
                fArr[i] = 0.0f;
                iVar3.c(this.f777b);
                f3 = 0.0f;
            }
            if (f3 != 0.0f) {
                if (iVar3.g == i.a.UNRESTRICTED) {
                    if (iVar2 == null || f > f3) {
                        zK = k(iVar3, eVar);
                        f = f3;
                        iVar2 = iVar3;
                    } else if (!zK && k(iVar3, eVar)) {
                        f = f3;
                        iVar2 = iVar3;
                        zK = true;
                    }
                } else if (iVar2 == null && f3 < 0.0f) {
                    if (iVar == null || f2 > f3) {
                        zK2 = k(iVar3, eVar);
                        f2 = f3;
                        iVar = iVar3;
                    } else if (!zK2 && k(iVar3, eVar)) {
                        f2 = f3;
                        iVar = iVar3;
                        zK2 = true;
                    }
                }
            }
            i = this.g[i];
        }
        return iVar2 != null ? iVar2 : iVar;
    }

    public final void c() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            i iVar = this.f778c.f784c[this.f[i]];
            if (iVar != null) {
                iVar.c(this.f777b);
            }
            i = this.g[i];
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.a = 0;
    }

    final boolean d(i iVar) {
        int i = this.i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.f[i] == iVar.f792b) {
                return true;
            }
            i = this.g[i];
        }
        return false;
    }

    void e(float f) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] / f;
            i = this.g[i];
        }
    }

    public final float f(i iVar) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.f[i] == iVar.f792b) {
                return this.h[i];
            }
            i = this.g[i];
        }
        return 0.0f;
    }

    i g(boolean[] zArr, i iVar) {
        i.a aVar;
        int i = this.i;
        i iVar2 = null;
        float f = 0.0f;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.h[i] < 0.0f) {
                i iVar3 = this.f778c.f784c[this.f[i]];
                if ((zArr == null || !zArr[iVar3.f792b]) && iVar3 != iVar && ((aVar = iVar3.g) == i.a.SLACK || aVar == i.a.ERROR)) {
                    float f2 = this.h[i];
                    if (f2 < f) {
                        iVar2 = iVar3;
                        f = f2;
                    }
                }
            }
            i = this.g[i];
        }
        return iVar2;
    }

    final i h(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.f778c.f784c[this.f[i2]];
            }
            i2 = this.g[i2];
        }
        return null;
    }

    final float i(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.h[i2];
            }
            i2 = this.g[i2];
        }
        return 0.0f;
    }

    void j() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.g[i];
        }
    }

    public final void l(i iVar, float f) {
        if (f == 0.0f) {
            m(iVar, true);
            return;
        }
        int i = this.i;
        if (i == -1) {
            this.i = 0;
            this.h[0] = f;
            this.f[0] = iVar.f792b;
            this.g[0] = -1;
            iVar.j++;
            iVar.a(this.f777b);
            this.a++;
            if (this.k) {
                return;
            }
            int i2 = this.j + 1;
            this.j = i2;
            int[] iArr = this.f;
            if (i2 >= iArr.length) {
                this.k = true;
                this.j = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
            int[] iArr2 = this.f;
            int i5 = iArr2[i];
            int i6 = iVar.f792b;
            if (i5 == i6) {
                this.h[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.g[i];
        }
        int length = this.j;
        int i7 = length + 1;
        if (this.k) {
            int[] iArr3 = this.f;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
        } else {
            length = i7;
        }
        int[] iArr4 = this.f;
        if (length >= iArr4.length && this.a < iArr4.length) {
            int i8 = 0;
            while (true) {
                int[] iArr5 = this.f;
                if (i8 >= iArr5.length) {
                    break;
                }
                if (iArr5[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr6 = this.f;
        if (length >= iArr6.length) {
            length = iArr6.length;
            int i9 = this.f779d * 2;
            this.f779d = i9;
            this.k = false;
            this.j = length - 1;
            this.h = Arrays.copyOf(this.h, i9);
            this.f = Arrays.copyOf(this.f, this.f779d);
            this.g = Arrays.copyOf(this.g, this.f779d);
        }
        this.f[length] = iVar.f792b;
        this.h[length] = f;
        int[] iArr7 = this.g;
        if (i3 != -1) {
            iArr7[length] = iArr7[i3];
            iArr7[i3] = length;
        } else {
            iArr7[length] = this.i;
            this.i = length;
        }
        iVar.j++;
        iVar.a(this.f777b);
        this.a++;
        if (!this.k) {
            this.j++;
        }
        if (this.a >= this.f.length) {
            this.k = true;
        }
        int i10 = this.j;
        int[] iArr8 = this.f;
        if (i10 >= iArr8.length) {
            this.k = true;
            this.j = iArr8.length - 1;
        }
    }

    public final float m(i iVar, boolean z) {
        if (this.e == iVar) {
            this.e = null;
        }
        int i = this.i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            if (this.f[i] == iVar.f792b) {
                if (i == this.i) {
                    this.i = this.g[i];
                } else {
                    int[] iArr = this.g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.c(this.f777b);
                }
                iVar.j--;
                this.a--;
                this.f[i] = -1;
                if (this.k) {
                    this.j = i;
                }
                return this.h[i];
            }
            i2++;
            i3 = i;
            i = this.g[i];
        }
        return 0.0f;
    }

    final void n(b bVar, b bVar2, boolean z) {
        int i = this.i;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
                int i3 = this.f[i];
                i iVar = bVar2.a;
                if (i3 == iVar.f792b) {
                    float f = this.h[i];
                    m(iVar, z);
                    a aVar = bVar2.f782d;
                    int i4 = aVar.i;
                    for (int i5 = 0; i4 != -1 && i5 < aVar.a; i5++) {
                        a(this.f778c.f784c[aVar.f[i4]], aVar.h[i4] * f, z);
                        i4 = aVar.g[i4];
                    }
                    bVar.f780b += bVar2.f780b * f;
                    if (z) {
                        bVar2.a.c(bVar);
                    }
                    i = this.i;
                } else {
                    i = this.g[i];
                }
            }
            return;
        }
    }

    void o(b bVar, b[] bVarArr) {
        int i = this.i;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
                i iVar = this.f778c.f784c[this.f[i]];
                if (iVar.f793c != -1) {
                    float f = this.h[i];
                    m(iVar, true);
                    b bVar2 = bVarArr[iVar.f793c];
                    if (!bVar2.e) {
                        a aVar = bVar2.f782d;
                        int i3 = aVar.i;
                        for (int i4 = 0; i3 != -1 && i4 < aVar.a; i4++) {
                            a(this.f778c.f784c[aVar.f[i3]], aVar.h[i3] * f, true);
                            i3 = aVar.g[i3];
                        }
                    }
                    bVar.f780b += bVar2.f780b * f;
                    bVar2.a.c(bVar);
                    i = this.i;
                } else {
                    i = this.g[i];
                }
            }
            return;
        }
    }

    public String toString() {
        int i = this.i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            str = ((str + " -> ") + this.h[i] + " : ") + this.f778c.f784c[this.f[i]];
            i = this.g[i];
        }
        return str;
    }
}

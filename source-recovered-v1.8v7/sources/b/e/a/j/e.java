package b.e.a.j;

import b.e.a.i;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    final f f801b;

    /* renamed from: c, reason: collision with root package name */
    final d f802c;

    /* renamed from: d, reason: collision with root package name */
    e f803d;
    private int h;
    b.e.a.i i;
    private l a = new l(this);
    public int e = 0;
    int f = -1;
    private c g = c.NONE;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[d.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        RELAXED,
        STRICT
    }

    public enum c {
        NONE,
        STRONG,
        WEAK
    }

    public enum d {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public e(f fVar, d dVar) {
        b bVar = b.RELAXED;
        this.h = 0;
        this.f801b = fVar;
        this.f802c = dVar;
    }

    public boolean a(e eVar, int i, int i2, c cVar, int i3, boolean z) {
        if (eVar == null) {
            this.f803d = null;
            this.e = 0;
            this.f = -1;
            this.g = c.NONE;
            this.h = 2;
            return true;
        }
        if (!z && !l(eVar)) {
            return false;
        }
        this.f803d = eVar;
        if (i > 0) {
            this.e = i;
        } else {
            this.e = 0;
        }
        this.f = i2;
        this.g = cVar;
        this.h = i3;
        return true;
    }

    public boolean b(e eVar, int i, c cVar, int i2) {
        return a(eVar, i, -1, cVar, i2, false);
    }

    public int c() {
        return this.h;
    }

    public int d() {
        e eVar;
        if (this.f801b.C() == 8) {
            return 0;
        }
        return (this.f <= -1 || (eVar = this.f803d) == null || eVar.f801b.C() != 8) ? this.e : this.f;
    }

    public f e() {
        return this.f801b;
    }

    public l f() {
        return this.a;
    }

    public b.e.a.i g() {
        return this.i;
    }

    public c h() {
        return this.g;
    }

    public e i() {
        return this.f803d;
    }

    public d j() {
        return this.f802c;
    }

    public boolean k() {
        return this.f803d != null;
    }

    public boolean l(e eVar) {
        if (eVar == null) {
            return false;
        }
        d dVarJ = eVar.j();
        d dVar = this.f802c;
        if (dVarJ == dVar) {
            return dVar != d.BASELINE || (eVar.e().I() && e().I());
        }
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return (dVarJ == d.BASELINE || dVarJ == d.CENTER_X || dVarJ == d.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = dVarJ == d.LEFT || dVarJ == d.RIGHT;
                if (eVar.e() instanceof i) {
                    return z || dVarJ == d.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = dVarJ == d.TOP || dVarJ == d.BOTTOM;
                if (eVar.e() instanceof i) {
                    return z2 || dVarJ == d.CENTER_Y;
                }
                return z2;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f802c.name());
        }
    }

    public void m() {
        this.f803d = null;
        this.e = 0;
        this.f = -1;
        this.g = c.STRONG;
        this.h = 0;
        b bVar = b.RELAXED;
        this.a.e();
    }

    public void n(b.e.a.c cVar) {
        b.e.a.i iVar = this.i;
        if (iVar == null) {
            this.i = new b.e.a.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public String toString() {
        return this.f801b.n() + ":" + this.f802c.toString();
    }
}

package b.e.a.j;

import b.e.a.j.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f {
    public static float j0 = 0.5f;
    protected e[] A;
    protected ArrayList<e> B;
    protected b[] C;
    f D;
    int E;
    int F;
    protected float G;
    protected int H;
    protected int I;
    protected int J;
    int K;
    int L;
    private int M;
    private int N;
    protected int O;
    protected int P;
    int Q;
    protected int R;
    protected int S;
    private int T;
    private int U;
    float V;
    float W;
    private Object X;
    private int Y;
    private String Z;
    private String a0;
    boolean b0;

    /* renamed from: c, reason: collision with root package name */
    m f814c;
    boolean c0;

    /* renamed from: d, reason: collision with root package name */
    m f815d;
    boolean d0;
    int e0;
    int f0;
    float[] g0;
    protected f[] h0;
    protected f[] i0;
    e z;
    public int a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f813b = -1;
    int e = 0;
    int f = 0;
    int[] g = new int[2];
    int h = 0;
    int i = 0;
    float j = 1.0f;
    int k = 0;
    int l = 0;
    float m = 1.0f;
    int n = -1;
    float o = 1.0f;
    h p = null;
    private int[] q = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    private float r = 0.0f;
    e s = new e(this, e.d.LEFT);
    e t = new e(this, e.d.TOP);
    e u = new e(this, e.d.RIGHT);
    e v = new e(this, e.d.BOTTOM);
    e w = new e(this, e.d.BASELINE);
    e x = new e(this, e.d.CENTER_X);
    e y = new e(this, e.d.CENTER_Y);

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f816b;

        static {
            int[] iArr = new int[b.values().length];
            f816b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f816b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f816b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f816b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.d.values().length];
            a = iArr2;
            try {
                iArr2[e.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[e.d.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[e.d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[e.d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[e.d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[e.d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[e.d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[e.d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[e.d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public f() {
        e eVar = new e(this, e.d.CENTER);
        this.z = eVar;
        this.A = new e[]{this.s, this.u, this.t, this.v, this.w, eVar};
        this.B = new ArrayList<>();
        b bVar = b.FIXED;
        this.C = new b[]{bVar, bVar};
        this.D = null;
        this.E = 0;
        this.F = 0;
        this.G = 0.0f;
        this.H = -1;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        float f = j0;
        this.V = f;
        this.W = f;
        this.Y = 0;
        this.Z = null;
        this.a0 = null;
        this.b0 = false;
        this.c0 = false;
        this.d0 = false;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = new float[]{-1.0f, -1.0f};
        this.h0 = new f[]{null, null};
        this.i0 = new f[]{null, null};
        a();
    }

    private boolean K(int i) {
        int i2 = i * 2;
        e[] eVarArr = this.A;
        if (eVarArr[i2].f803d != null && eVarArr[i2].f803d.f803d != eVarArr[i2]) {
            int i3 = i2 + 1;
            if (eVarArr[i3].f803d != null && eVarArr[i3].f803d.f803d == eVarArr[i3]) {
                return true;
            }
        }
        return false;
    }

    private void a() {
        this.B.add(this.s);
        this.B.add(this.t);
        this.B.add(this.u);
        this.B.add(this.v);
        this.B.add(this.x);
        this.B.add(this.y);
        this.B.add(this.z);
        this.B.add(this.w);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e(b.e.a.e r24, boolean r25, b.e.a.i r26, b.e.a.i r27, b.e.a.j.f.b r28, boolean r29, b.e.a.j.e r30, b.e.a.j.e r31, int r32, int r33, int r34, int r35, float r36, boolean r37, boolean r38, int r39, int r40, int r41, float r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.a.j.f.e(b.e.a.e, boolean, b.e.a.i, b.e.a.i, b.e.a.j.f$b, boolean, b.e.a.j.e, b.e.a.j.e, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    protected int A() {
        return this.J + this.P;
    }

    public void A0(int i) {
        this.U = i;
    }

    public b B() {
        return this.C[1];
    }

    public void B0(int i) {
        this.T = i;
    }

    public int C() {
        return this.Y;
    }

    public void C0(int i) {
        this.I = i;
    }

    public int D() {
        if (this.Y == 8) {
            return 0;
        }
        return this.E;
    }

    public void D0(int i) {
        this.J = i;
    }

    public int E() {
        return this.U;
    }

    public void E0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.n == -1) {
            if (z3 && !z4) {
                this.n = 0;
            } else if (!z3 && z4) {
                this.n = 1;
                if (this.H == -1) {
                    this.o = 1.0f / this.o;
                }
            }
        }
        if (this.n == 0 && (!this.t.k() || !this.v.k())) {
            this.n = 1;
        } else if (this.n == 1 && (!this.s.k() || !this.u.k())) {
            this.n = 0;
        }
        if (this.n == -1 && (!this.t.k() || !this.v.k() || !this.s.k() || !this.u.k())) {
            if (this.t.k() && this.v.k()) {
                this.n = 0;
            } else if (this.s.k() && this.u.k()) {
                this.o = 1.0f / this.o;
                this.n = 1;
            }
        }
        if (this.n == -1) {
            if (z && !z2) {
                this.n = 0;
            } else if (!z && z2) {
                this.o = 1.0f / this.o;
                this.n = 1;
            }
        }
        if (this.n == -1) {
            if (this.h > 0 && this.k == 0) {
                this.n = 0;
            } else if (this.h == 0 && this.k > 0) {
                this.o = 1.0f / this.o;
                this.n = 1;
            }
        }
        if (this.n == -1 && z && z2) {
            this.o = 1.0f / this.o;
            this.n = 1;
        }
    }

    public int F() {
        return this.T;
    }

    public void F0() {
        int i = this.I;
        int i2 = this.J;
        this.M = i;
        this.N = i2;
    }

    public int G() {
        return this.I;
    }

    public void G0(b.e.a.e eVar) {
        int iY = eVar.y(this.s);
        int iY2 = eVar.y(this.t);
        int iY3 = eVar.y(this.u);
        int iY4 = eVar.y(this.v);
        int i = iY4 - iY2;
        if (iY3 - iY < 0 || i < 0 || iY == Integer.MIN_VALUE || iY == Integer.MAX_VALUE || iY2 == Integer.MIN_VALUE || iY2 == Integer.MAX_VALUE || iY3 == Integer.MIN_VALUE || iY3 == Integer.MAX_VALUE || iY4 == Integer.MIN_VALUE || iY4 == Integer.MAX_VALUE) {
            iY4 = 0;
            iY = 0;
            iY2 = 0;
            iY3 = 0;
        }
        a0(iY, iY2, iY3, iY4);
    }

    public int H() {
        return this.J;
    }

    public void H0() {
        for (int i = 0; i < 6; i++) {
            this.A[i].f().q();
        }
    }

    public boolean I() {
        return this.Q > 0;
    }

    public void J(e.d dVar, f fVar, e.d dVar2, int i, int i2) {
        h(dVar).a(fVar.h(dVar2), i, i2, e.c.STRONG, 0, true);
    }

    public boolean L() {
        return this.s.f().f826b == 1 && this.u.f().f826b == 1 && this.t.f().f826b == 1 && this.v.f().f826b == 1;
    }

    public boolean M() {
        e eVar = this.s;
        e eVar2 = eVar.f803d;
        if (eVar2 != null && eVar2.f803d == eVar) {
            return true;
        }
        e eVar3 = this.u;
        e eVar4 = eVar3.f803d;
        return eVar4 != null && eVar4.f803d == eVar3;
    }

    public boolean N() {
        e eVar = this.t;
        e eVar2 = eVar.f803d;
        if (eVar2 != null && eVar2.f803d == eVar) {
            return true;
        }
        e eVar3 = this.v;
        e eVar4 = eVar3.f803d;
        return eVar4 != null && eVar4.f803d == eVar3;
    }

    public boolean O() {
        return this.f == 0 && this.G == 0.0f && this.k == 0 && this.l == 0 && this.C[1] == b.MATCH_CONSTRAINT;
    }

    public boolean P() {
        return this.e == 0 && this.G == 0.0f && this.h == 0 && this.i == 0 && this.C[0] == b.MATCH_CONSTRAINT;
    }

    public void Q() {
        this.s.m();
        this.t.m();
        this.u.m();
        this.v.m();
        this.w.m();
        this.x.m();
        this.y.m();
        this.z.m();
        this.D = null;
        this.r = 0.0f;
        this.E = 0;
        this.F = 0;
        this.G = 0.0f;
        this.H = -1;
        this.I = 0;
        this.J = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        float f = j0;
        this.V = f;
        this.W = f;
        b[] bVarArr = this.C;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.X = null;
        this.Y = 0;
        this.a0 = null;
        this.e0 = 0;
        this.f0 = 0;
        float[] fArr = this.g0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.a = -1;
        this.f813b = -1;
        int[] iArr = this.q;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.e = 0;
        this.f = 0;
        this.j = 1.0f;
        this.m = 1.0f;
        this.i = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.h = 0;
        this.k = 0;
        this.n = -1;
        this.o = 1.0f;
        m mVar = this.f814c;
        if (mVar != null) {
            mVar.e();
        }
        m mVar2 = this.f815d;
        if (mVar2 != null) {
            mVar2.e();
        }
        this.p = null;
        this.b0 = false;
        this.c0 = false;
        this.d0 = false;
    }

    public void R() {
        f fVarU = u();
        if (fVarU != null && (fVarU instanceof g) && ((g) u()).S0()) {
            return;
        }
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            this.B.get(i).m();
        }
    }

    public void S() {
        for (int i = 0; i < 6; i++) {
            this.A[i].f().e();
        }
    }

    public void T(b.e.a.c cVar) {
        this.s.n(cVar);
        this.t.n(cVar);
        this.u.n(cVar);
        this.v.n(cVar);
        this.w.n(cVar);
        this.z.n(cVar);
        this.x.n(cVar);
        this.y.n(cVar);
    }

    public void U() {
    }

    public void V(int i) {
        this.Q = i;
    }

    public void W(Object obj) {
        this.X = obj;
    }

    public void X(String str) {
        this.Z = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0084 A[PHI: r0
      0x0084: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:45:0x0084, B:35:0x007d, B:23:0x004f, B:25:0x0055, B:27:0x0061, B:29:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Y(java.lang.String r9) throws java.lang.NumberFormatException {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L8e
            int r1 = r9.length()
            if (r1 != 0) goto Lb
            goto L8e
        Lb:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L37
            int r6 = r2 + (-1)
            if (r3 >= r6) goto L37
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2c
            r1 = 0
            goto L35
        L2c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L35
            r1 = 1
        L35:
            int r4 = r3 + 1
        L37:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L75
            int r2 = r2 - r5
            if (r3 >= r2) goto L75
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L84
            int r3 = r9.length()
            if (r3 <= 0) goto L84
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.NumberFormatException -> L84
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L84
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L84
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L84
            if (r1 != r5) goto L6f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L6f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L75:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L84
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L84:
            r9 = 0
        L85:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8d
            r8.G = r9
            r8.H = r1
        L8d:
            return
        L8e:
            r8.G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.a.j.f.Y(java.lang.String):void");
    }

    public void Z(int i, int i2, int i3) {
        if (i3 == 0) {
            f0(i, i2);
        } else if (i3 == 1) {
            t0(i, i2);
        }
        this.c0 = true;
    }

    public void a0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.I = i;
        this.J = i2;
        if (this.Y == 8) {
            this.E = 0;
            this.F = 0;
            return;
        }
        if (this.C[0] == b.FIXED && i7 < (i6 = this.E)) {
            i7 = i6;
        }
        if (this.C[1] == b.FIXED && i8 < (i5 = this.F)) {
            i8 = i5;
        }
        this.E = i7;
        this.F = i8;
        int i9 = this.S;
        if (i8 < i9) {
            this.F = i9;
        }
        int i10 = this.E;
        int i11 = this.R;
        if (i10 < i11) {
            this.E = i11;
        }
        this.c0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(b.e.a.e r39) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.a.j.f.b(b.e.a.e):void");
    }

    public void b0(int i) {
        this.F = i;
        int i2 = this.S;
        if (i < i2) {
            this.F = i2;
        }
    }

    public boolean c() {
        return this.Y != 8;
    }

    public void c0(boolean z) {
    }

    public void d(int i) {
        k.a(i, this);
    }

    public void d0(float f) {
        this.V = f;
    }

    public void e0(int i) {
        this.e0 = i;
    }

    public void f(f fVar, float f, int i) {
        e.d dVar = e.d.CENTER;
        J(dVar, fVar, dVar, i, 0);
        this.r = f;
    }

    public void f0(int i, int i2) {
        this.I = i;
        int i3 = i2 - i;
        this.E = i3;
        int i4 = this.R;
        if (i3 < i4) {
            this.E = i4;
        }
    }

    public void g(b.e.a.e eVar) {
        eVar.r(this.s);
        eVar.r(this.t);
        eVar.r(this.u);
        eVar.r(this.v);
        if (this.Q > 0) {
            eVar.r(this.w);
        }
    }

    public void g0(b bVar) {
        this.C[0] = bVar;
        if (bVar == b.WRAP_CONTENT) {
            y0(this.T);
        }
    }

    public e h(e.d dVar) {
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return this.s;
            case 2:
                return this.t;
            case 3:
                return this.u;
            case 4:
                return this.v;
            case 5:
                return this.w;
            case 6:
                return this.z;
            case 7:
                return this.x;
            case 8:
                return this.y;
            case 9:
                return null;
            default:
                throw new AssertionError(dVar.name());
        }
    }

    public void h0(int i, int i2, int i3, float f) {
        this.e = i;
        this.h = i2;
        this.i = i3;
        this.j = f;
        if (f >= 1.0f || i != 0) {
            return;
        }
        this.e = 2;
    }

    public ArrayList<e> i() {
        return this.B;
    }

    public void i0(float f) {
        this.g0[0] = f;
    }

    public int j() {
        return this.Q;
    }

    public void j0(int i) {
        this.q[1] = i;
    }

    public float k(int i) {
        if (i == 0) {
            return this.V;
        }
        if (i == 1) {
            return this.W;
        }
        return -1.0f;
    }

    public void k0(int i) {
        this.q[0] = i;
    }

    public int l() {
        return H() + this.F;
    }

    public void l0(int i) {
        if (i < 0) {
            i = 0;
        }
        this.S = i;
    }

    public Object m() {
        return this.X;
    }

    public void m0(int i) {
        if (i < 0) {
            i = 0;
        }
        this.R = i;
    }

    public String n() {
        return this.Z;
    }

    public void n0(int i, int i2) {
        this.O = i;
        this.P = i2;
    }

    public b o(int i) {
        if (i == 0) {
            return s();
        }
        if (i == 1) {
            return B();
        }
        return null;
    }

    public void o0(int i, int i2) {
        this.I = i;
        this.J = i2;
    }

    public int p() {
        return this.M + this.O;
    }

    public void p0(f fVar) {
        this.D = fVar;
    }

    public int q() {
        return this.N + this.P;
    }

    void q0(int i, int i2) {
        if (i2 == 0) {
            this.K = i;
        } else if (i2 == 1) {
            this.L = i;
        }
    }

    public int r() {
        if (this.Y == 8) {
            return 0;
        }
        return this.F;
    }

    public void r0(float f) {
        this.W = f;
    }

    public b s() {
        return this.C[0];
    }

    public void s0(int i) {
        this.f0 = i;
    }

    public int t(int i) {
        if (i == 0) {
            return D();
        }
        if (i == 1) {
            return r();
        }
        return 0;
    }

    public void t0(int i, int i2) {
        this.J = i;
        int i3 = i2 - i;
        this.F = i3;
        int i4 = this.S;
        if (i3 < i4) {
            this.F = i4;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.a0 != null) {
            str = "type: " + this.a0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.Z != null) {
            str2 = "id: " + this.Z + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.I);
        sb.append(", ");
        sb.append(this.J);
        sb.append(") - (");
        sb.append(this.E);
        sb.append(" x ");
        sb.append(this.F);
        sb.append(") wrap: (");
        sb.append(this.T);
        sb.append(" x ");
        sb.append(this.U);
        sb.append(")");
        return sb.toString();
    }

    public f u() {
        return this.D;
    }

    public void u0(b bVar) {
        this.C[1] = bVar;
        if (bVar == b.WRAP_CONTENT) {
            b0(this.U);
        }
    }

    int v(int i) {
        if (i == 0) {
            return this.K;
        }
        if (i == 1) {
            return this.L;
        }
        return 0;
    }

    public void v0(int i, int i2, int i3, float f) {
        this.f = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        if (f >= 1.0f || i != 0) {
            return;
        }
        this.f = 2;
    }

    public m w() {
        if (this.f815d == null) {
            this.f815d = new m();
        }
        return this.f815d;
    }

    public void w0(float f) {
        this.g0[1] = f;
    }

    public m x() {
        if (this.f814c == null) {
            this.f814c = new m();
        }
        return this.f814c;
    }

    public void x0(int i) {
        this.Y = i;
    }

    public int y() {
        return G() + this.E;
    }

    public void y0(int i) {
        this.E = i;
        int i2 = this.R;
        if (i < i2) {
            this.E = i2;
        }
    }

    protected int z() {
        return this.I + this.O;
    }

    public void z0(boolean z) {
    }
}

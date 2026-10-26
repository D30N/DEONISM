package d.b.a.a.e.e;

import d.b.a.a.e.e.j4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class h4<T extends j4<T>> {

    /* renamed from: d, reason: collision with root package name */
    private static final h4 f2706d = new h4(true);
    final t6<T, Object> a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2707b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2708c;

    private h4() {
        this.a = t6.b(16);
    }

    private h4(t6<T, Object> t6Var) {
        this.a = t6Var;
        k();
    }

    private h4(boolean z) {
        this(t6.b(0));
        k();
    }

    public static int a(j4<?> j4Var, Object obj) {
        y7 y7VarB = j4Var.b();
        int iA = j4Var.a();
        if (!j4Var.d()) {
            return b(y7VarB, iA, obj);
        }
        int iB = 0;
        List list = (List) obj;
        if (j4Var.e()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iB += j(y7VarB, it.next());
            }
            return y3.h0(iA) + iB + y3.E0(iB);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iB += b(y7VarB, iA, it2.next());
        }
        return iB;
    }

    static int b(y7 y7Var, int i, Object obj) {
        int iH0 = y3.h0(i);
        if (y7Var == y7.m) {
            u4.g((z5) obj);
            iH0 <<= 1;
        }
        return iH0 + j(y7Var, obj);
    }

    public static <T extends j4<T>> h4<T> c() {
        return f2706d;
    }

    private final Object d(T t) {
        Object obj = this.a.get(t);
        if (!(obj instanceof e5)) {
            return obj;
        }
        e5.e();
        throw null;
    }

    private static Object e(Object obj) {
        if (obj instanceof j6) {
            return ((j6) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static void f(y3 y3Var, y7 y7Var, int i, Object obj) {
        if (y7Var == y7.m) {
            z5 z5Var = (z5) obj;
            u4.g(z5Var);
            y3Var.m(i, 3);
            z5Var.j(y3Var);
            y3Var.m(i, 4);
        }
        y3Var.m(i, y7Var.g());
        switch (k4.f2741b[y7Var.ordinal()]) {
            case 1:
                y3Var.h(((Double) obj).doubleValue());
                break;
            case 2:
                y3Var.i(((Float) obj).floatValue());
                break;
            case 3:
                y3Var.t(((Long) obj).longValue());
                break;
            case 4:
                y3Var.t(((Long) obj).longValue());
                break;
            case 5:
                y3Var.j(((Integer) obj).intValue());
                break;
            case 6:
                y3Var.a0(((Long) obj).longValue());
                break;
            case 7:
                y3Var.f0(((Integer) obj).intValue());
                break;
            case 8:
                y3Var.y(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((z5) obj).j(y3Var);
                break;
            case 10:
                y3Var.v((z5) obj);
                break;
            case 11:
                if (!(obj instanceof l3)) {
                    y3Var.w((String) obj);
                    break;
                } else {
                    y3Var.u((l3) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof l3)) {
                    byte[] bArr = (byte[]) obj;
                    y3Var.T(bArr, 0, bArr.length);
                    break;
                } else {
                    y3Var.u((l3) obj);
                    break;
                }
            case 13:
                y3Var.O(((Integer) obj).intValue());
                break;
            case 14:
                y3Var.f0(((Integer) obj).intValue());
                break;
            case 15:
                y3Var.a0(((Long) obj).longValue());
                break;
            case 16:
                y3Var.X(((Integer) obj).intValue());
                break;
            case 17:
                y3Var.S(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof t4)) {
                    y3Var.j(((Integer) obj).intValue());
                    break;
                } else {
                    y3Var.j(((t4) obj).a());
                    break;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(d.b.a.a.e.e.y7 r2, java.lang.Object r3) {
        /*
            d.b.a.a.e.e.u4.d(r3)
            int[] r0 = d.b.a.a.e.e.k4.a
            d.b.a.a.e.e.g8 r2 = r2.f()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L31;
                case 7: goto L28;
                case 8: goto L1f;
                case 9: goto L16;
                default: goto L14;
            }
        L14:
            r0 = 0
            goto L42
        L16:
            boolean r2 = r3 instanceof d.b.a.a.e.e.z5
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof d.b.a.a.e.e.e5
            if (r2 == 0) goto L14
            goto L42
        L1f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof d.b.a.a.e.e.t4
            if (r2 == 0) goto L14
            goto L42
        L28:
            boolean r2 = r3 instanceof d.b.a.a.e.e.l3
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L14
            goto L42
        L31:
            boolean r0 = r3 instanceof java.lang.String
            goto L42
        L34:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L42
        L37:
            boolean r0 = r3 instanceof java.lang.Double
            goto L42
        L3a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L42
        L3d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L42
        L40:
            boolean r0 = r3 instanceof java.lang.Integer
        L42:
            if (r0 == 0) goto L45
            return
        L45:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L4e
        L4d:
            throw r2
        L4e:
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.a.a.e.e.h4.h(d.b.a.a.e.e.y7, java.lang.Object):void");
    }

    private static <T extends j4<T>> boolean i(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.c() == g8.MESSAGE) {
            boolean zD = key.d();
            Object value = entry.getValue();
            if (zD) {
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    if (!((z5) it.next()).b()) {
                        return false;
                    }
                }
            } else {
                if (!(value instanceof z5)) {
                    if (value instanceof e5) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((z5) value).b()) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int j(y7 y7Var, Object obj) {
        switch (k4.f2741b[y7Var.ordinal()]) {
            case 1:
                return y3.z(((Double) obj).doubleValue());
            case 2:
                return y3.A(((Float) obj).floatValue());
            case 3:
                return y3.e0(((Long) obj).longValue());
            case 4:
                return y3.j0(((Long) obj).longValue());
            case 5:
                return y3.l0(((Integer) obj).intValue());
            case 6:
                return y3.s0(((Long) obj).longValue());
            case 7:
                return y3.x0(((Integer) obj).intValue());
            case 8:
                return y3.L(((Boolean) obj).booleanValue());
            case 9:
                return y3.W((z5) obj);
            case 10:
                return obj instanceof e5 ? y3.d((e5) obj) : y3.J((z5) obj);
            case 11:
                return obj instanceof l3 ? y3.I((l3) obj) : y3.K((String) obj);
            case 12:
                return obj instanceof l3 ? y3.I((l3) obj) : y3.M((byte[]) obj);
            case 13:
                return y3.p0(((Integer) obj).intValue());
            case 14:
                return y3.A0(((Integer) obj).intValue());
            case 15:
                return y3.w0(((Long) obj).longValue());
            case 16:
                return y3.t0(((Integer) obj).intValue());
            case 17:
                return y3.o0(((Long) obj).longValue());
            case 18:
                return obj instanceof t4 ? y3.C0(((t4) obj).a()) : y3.C0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private final void l(T t, Object obj) {
        if (!t.d()) {
            h(t.b(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                h(t.b(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof e5) {
            this.f2708c = true;
        }
        this.a.put(t, obj);
    }

    private final void m(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof e5) {
            e5.e();
            throw null;
        }
        if (key.d()) {
            Object objD = d(key);
            if (objD == null) {
                objD = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objD).add(e(it.next()));
            }
            this.a.put(key, objD);
            return;
        }
        if (key.c() != g8.MESSAGE) {
            this.a.put(key, e(value));
            return;
        }
        Object objD2 = d(key);
        if (objD2 == null) {
            this.a.put(key, e(value));
        } else {
            this.a.put(key, objD2 instanceof j6 ? key.k((j6) objD2, (j6) value) : key.r(((z5) objD2).d(), (z5) value).i());
        }
    }

    private static int n(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.c() != g8.MESSAGE || key.d() || key.e()) {
            return a(key, value);
        }
        boolean z = value instanceof e5;
        int iA = entry.getKey().a();
        return z ? y3.D(iA, (e5) value) : y3.E(iA, (z5) value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() {
        h4 h4Var = new h4();
        for (int i = 0; i < this.a.j(); i++) {
            Map.Entry<K, Object> entryH = this.a.h(i);
            h4Var.l((j4) entryH.getKey(), entryH.getValue());
        }
        Iterator it = this.a.m().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            h4Var.l((j4) entry.getKey(), entry.getValue());
        }
        h4Var.f2708c = this.f2708c;
        return h4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h4) {
            return this.a.equals(((h4) obj).a);
        }
        return false;
    }

    public final void g(h4<T> h4Var) {
        for (int i = 0; i < h4Var.a.j(); i++) {
            m(h4Var.a.h(i));
        }
        Iterator it = h4Var.a.m().iterator();
        while (it.hasNext()) {
            m((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void k() {
        if (this.f2707b) {
            return;
        }
        this.a.e();
        this.f2707b = true;
    }

    public final boolean o() {
        return this.f2707b;
    }

    public final Iterator<Map.Entry<T, Object>> p() {
        return this.f2708c ? new f5(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    final Iterator<Map.Entry<T, Object>> q() {
        return this.f2708c ? new f5(this.a.o().iterator()) : this.a.o().iterator();
    }

    public final boolean r() {
        for (int i = 0; i < this.a.j(); i++) {
            if (!i(this.a.h(i))) {
                return false;
            }
        }
        Iterator it = this.a.m().iterator();
        while (it.hasNext()) {
            if (!i((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int s() {
        int iN = 0;
        for (int i = 0; i < this.a.j(); i++) {
            iN += n(this.a.h(i));
        }
        Iterator it = this.a.m().iterator();
        while (it.hasNext()) {
            iN += n((Map.Entry) it.next());
        }
        return iN;
    }
}

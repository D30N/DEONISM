package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class a implements j.a {
    private b.g.k.e<b> a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<b> f603b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<b> f604c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC0013a f605d;
    Runnable e;
    final boolean f;
    final j g;
    private int h;

    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0013a {
        void a(int i, int i2);

        void b(b bVar);

        RecyclerView.d0 c(int i);

        void d(int i, int i2);

        void e(int i, int i2);

        void f(b bVar);

        void g(int i, int i2);

        void h(int i, int i2, Object obj);
    }

    static class b {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f606b;

        /* renamed from: c, reason: collision with root package name */
        Object f607c;

        /* renamed from: d, reason: collision with root package name */
        int f608d;

        b(int i, int i2, int i3, Object obj) {
            this.a = i;
            this.f606b = i2;
            this.f608d = i3;
            this.f607c = obj;
        }

        String a() {
            int i = this.a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.a;
            if (i != bVar.a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f608d - this.f606b) == 1 && this.f608d == bVar.f606b && this.f606b == bVar.f608d) {
                return true;
            }
            if (this.f608d != bVar.f608d || this.f606b != bVar.f606b) {
                return false;
            }
            Object obj2 = this.f607c;
            Object obj3 = bVar.f607c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.a * 31) + this.f606b) * 31) + this.f608d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f606b + "c:" + this.f608d + ",p:" + this.f607c + "]";
        }
    }

    a(InterfaceC0013a interfaceC0013a) {
        this(interfaceC0013a, false);
    }

    a(InterfaceC0013a interfaceC0013a, boolean z) {
        this.a = new b.g.k.f(30);
        this.f603b = new ArrayList<>();
        this.f604c = new ArrayList<>();
        this.h = 0;
        this.f605d = interfaceC0013a;
        this.f = z;
        this.g = new j(this);
    }

    private void c(b bVar) {
        r(bVar);
    }

    private void d(b bVar) {
        r(bVar);
    }

    private void f(b bVar) {
        boolean z;
        char c2;
        int i = bVar.f606b;
        int i2 = bVar.f608d + i;
        char c3 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f605d.c(i3) != null || h(i3)) {
                if (c3 == 0) {
                    k(b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 1;
            } else {
                if (c3 == 1) {
                    r(b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c3 = c2;
        }
        if (i4 != bVar.f608d) {
            a(bVar);
            bVar = b(2, i, i4, null);
        }
        if (c3 == 0) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    private void g(b bVar) {
        int i = bVar.f606b;
        int i2 = bVar.f608d + i;
        int i3 = i;
        char c2 = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f605d.c(i) != null || h(i)) {
                if (c2 == 0) {
                    k(b(4, i3, i4, bVar.f607c));
                    i3 = i;
                    i4 = 0;
                }
                c2 = 1;
            } else {
                if (c2 == 1) {
                    r(b(4, i3, i4, bVar.f607c));
                    i3 = i;
                    i4 = 0;
                }
                c2 = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f608d) {
            Object obj = bVar.f607c;
            a(bVar);
            bVar = b(4, i3, i4, obj);
        }
        if (c2 == 0) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    private boolean h(int i) {
        int size = this.f604c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f604c.get(i2);
            int i3 = bVar.a;
            if (i3 == 8) {
                if (n(bVar.f608d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f606b;
                int i5 = bVar.f608d + i4;
                while (i4 < i5) {
                    if (n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i;
        int i2 = bVar.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iV = v(bVar.f606b, i2);
        int i3 = bVar.f606b;
        int i4 = bVar.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f608d; i6++) {
            int iV2 = v(bVar.f606b + (i * i6), bVar.a);
            int i7 = bVar.a;
            if (i7 == 2 ? iV2 == iV : i7 == 4 && iV2 == iV + 1) {
                i5++;
            } else {
                b bVarB = b(bVar.a, iV, i5, bVar.f607c);
                l(bVarB, i3);
                a(bVarB);
                if (bVar.a == 4) {
                    i3 += i5;
                }
                iV = iV2;
                i5 = 1;
            }
        }
        Object obj = bVar.f607c;
        a(bVar);
        if (i5 > 0) {
            b bVarB2 = b(bVar.a, iV, i5, obj);
            l(bVarB2, i3);
            a(bVarB2);
        }
    }

    private void r(b bVar) {
        this.f604c.add(bVar);
        int i = bVar.a;
        if (i == 1) {
            this.f605d.g(bVar.f606b, bVar.f608d);
            return;
        }
        if (i == 2) {
            this.f605d.e(bVar.f606b, bVar.f608d);
            return;
        }
        if (i == 4) {
            this.f605d.h(bVar.f606b, bVar.f608d, bVar.f607c);
        } else {
            if (i == 8) {
                this.f605d.a(bVar.f606b, bVar.f608d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int v(int r8, int r9) {
        /*
            r7 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r7.f604c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            r2 = 8
            if (r0 < 0) goto L84
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r7.f604c
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.a.b) r3
            int r4 = r3.a
            r5 = 2
            if (r4 != r2) goto L65
            int r2 = r3.f606b
            int r4 = r3.f608d
            if (r2 >= r4) goto L20
            goto L23
        L20:
            r6 = r4
            r4 = r2
            r2 = r6
        L23:
            if (r8 < r2) goto L4b
            if (r8 > r4) goto L4b
            int r4 = r3.f606b
            if (r2 != r4) goto L3c
            if (r9 != r1) goto L33
            int r2 = r3.f608d
            int r2 = r2 + r1
        L30:
            r3.f608d = r2
            goto L39
        L33:
            if (r9 != r5) goto L39
            int r2 = r3.f608d
            int r2 = r2 - r1
            goto L30
        L39:
            int r8 = r8 + 1
            goto L81
        L3c:
            if (r9 != r1) goto L43
            int r4 = r4 + 1
        L40:
            r3.f606b = r4
            goto L48
        L43:
            if (r9 != r5) goto L48
            int r4 = r4 + (-1)
            goto L40
        L48:
            int r8 = r8 + (-1)
            goto L81
        L4b:
            int r2 = r3.f606b
            if (r8 >= r2) goto L81
            if (r9 != r1) goto L5b
            int r2 = r2 + 1
            r3.f606b = r2
            int r2 = r3.f608d
            int r2 = r2 + r1
        L58:
            r3.f608d = r2
            goto L81
        L5b:
            if (r9 != r5) goto L81
            int r2 = r2 + (-1)
            r3.f606b = r2
            int r2 = r3.f608d
            int r2 = r2 - r1
            goto L58
        L65:
            int r2 = r3.f606b
            if (r2 > r8) goto L75
            if (r4 != r1) goto L6f
            int r2 = r3.f608d
            int r8 = r8 - r2
            goto L81
        L6f:
            if (r4 != r5) goto L81
            int r2 = r3.f608d
            int r8 = r8 + r2
            goto L81
        L75:
            if (r9 != r1) goto L7c
            int r2 = r2 + 1
        L79:
            r3.f606b = r2
            goto L81
        L7c:
            if (r9 != r5) goto L81
            int r2 = r2 + (-1)
            goto L79
        L81:
            int r0 = r0 + (-1)
            goto L8
        L84:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r9 = r7.f604c
            int r9 = r9.size()
            int r9 = r9 - r1
        L8b:
            if (r9 < 0) goto Lb1
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r7.f604c
            java.lang.Object r0 = r0.get(r9)
            androidx.recyclerview.widget.a$b r0 = (androidx.recyclerview.widget.a.b) r0
            int r1 = r0.a
            if (r1 != r2) goto La2
            int r1 = r0.f608d
            int r3 = r0.f606b
            if (r1 == r3) goto La6
            if (r1 >= 0) goto Lae
            goto La6
        La2:
            int r1 = r0.f608d
            if (r1 > 0) goto Lae
        La6:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r7.f604c
            r1.remove(r9)
            r7.a(r0)
        Lae:
            int r9 = r9 + (-1)
            goto L8b
        Lb1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.v(int, int):int");
    }

    @Override // androidx.recyclerview.widget.j.a
    public void a(b bVar) {
        if (this.f) {
            return;
        }
        bVar.f607c = null;
        this.a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.j.a
    public b b(int i, int i2, int i3, Object obj) {
        b bVarB = this.a.b();
        if (bVarB == null) {
            return new b(i, i2, i3, obj);
        }
        bVarB.a = i;
        bVarB.f606b = i2;
        bVarB.f608d = i3;
        bVarB.f607c = obj;
        return bVarB;
    }

    public int e(int i) {
        int size = this.f603b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f603b.get(i2);
            int i3 = bVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f606b;
                    if (i4 <= i) {
                        int i5 = bVar.f608d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f606b;
                    if (i6 == i) {
                        i = bVar.f608d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f608d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f606b <= i) {
                i += bVar.f608d;
            }
        }
        return i;
    }

    void i() {
        int size = this.f604c.size();
        for (int i = 0; i < size; i++) {
            this.f605d.b(this.f604c.get(i));
        }
        t(this.f604c);
        this.h = 0;
    }

    void j() {
        i();
        int size = this.f603b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f603b.get(i);
            int i2 = bVar.a;
            if (i2 == 1) {
                this.f605d.b(bVar);
                this.f605d.g(bVar.f606b, bVar.f608d);
            } else if (i2 == 2) {
                this.f605d.b(bVar);
                this.f605d.d(bVar.f606b, bVar.f608d);
            } else if (i2 == 4) {
                this.f605d.b(bVar);
                this.f605d.h(bVar.f606b, bVar.f608d, bVar.f607c);
            } else if (i2 == 8) {
                this.f605d.b(bVar);
                this.f605d.a(bVar.f606b, bVar.f608d);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
        t(this.f603b);
        this.h = 0;
    }

    void l(b bVar, int i) {
        this.f605d.f(bVar);
        int i2 = bVar.a;
        if (i2 == 2) {
            this.f605d.d(i, bVar.f608d);
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f605d.h(i, bVar.f608d, bVar.f607c);
        }
    }

    int m(int i) {
        return n(i, 0);
    }

    int n(int i, int i2) {
        int size = this.f604c.size();
        while (i2 < size) {
            b bVar = this.f604c.get(i2);
            int i3 = bVar.a;
            if (i3 == 8) {
                int i4 = bVar.f606b;
                if (i4 == i) {
                    i = bVar.f608d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f608d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f606b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f608d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f608d;
                }
            }
            i2++;
        }
        return i;
    }

    boolean o(int i) {
        return (i & this.h) != 0;
    }

    boolean p() {
        return this.f603b.size() > 0;
    }

    boolean q() {
        return (this.f604c.isEmpty() || this.f603b.isEmpty()) ? false : true;
    }

    void s() {
        this.g.b(this.f603b);
        int size = this.f603b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f603b.get(i);
            int i2 = bVar.a;
            if (i2 == 1) {
                c(bVar);
            } else if (i2 == 2) {
                f(bVar);
            } else if (i2 == 4) {
                g(bVar);
            } else if (i2 == 8) {
                d(bVar);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f603b.clear();
    }

    void t(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(list.get(i));
        }
        list.clear();
    }

    void u() {
        t(this.f603b);
        t(this.f604c);
        this.h = 0;
    }
}

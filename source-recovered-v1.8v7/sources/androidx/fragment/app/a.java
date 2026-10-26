package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j;
import androidx.fragment.app.n;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class a extends n implements j.k {
    final j r;
    boolean s;
    int t = -1;

    public a(j jVar) {
        this.r = jVar;
    }

    private static boolean r(n.a aVar) {
        Fragment fragment = aVar.f482b;
        return (fragment == null || !fragment.l || fragment.H == null || fragment.A || fragment.z || !fragment.Q()) ? false : true;
    }

    @Override // androidx.fragment.app.j.k
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (j.I) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.h) {
            return true;
        }
        this.r.i(this);
        return true;
    }

    @Override // androidx.fragment.app.n
    public int d() {
        return i(false);
    }

    @Override // androidx.fragment.app.n
    public int e() {
        return i(true);
    }

    @Override // androidx.fragment.app.n
    void f(int i, Fragment fragment, String str, int i2) {
        super.f(i, fragment, str, i2);
        fragment.s = this.r;
    }

    @Override // androidx.fragment.app.n
    public n g(Fragment fragment) {
        j jVar = fragment.s;
        if (jVar == null || jVar == this.r) {
            super.g(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void h(int i) {
        if (this.h) {
            if (j.I) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                n.a aVar = this.a.get(i2);
                Fragment fragment = aVar.f482b;
                if (fragment != null) {
                    fragment.r += i;
                    if (j.I) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f482b + " to " + aVar.f482b.r);
                    }
                }
            }
        }
    }

    int i(boolean z) {
        if (this.s) {
            throw new IllegalStateException("commit already called");
        }
        if (j.I) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new b.g.k.b("FragmentManager"));
            j("  ", printWriter);
            printWriter.close();
        }
        this.s = true;
        this.t = this.h ? this.r.l(this) : -1;
        this.r.g0(this, z);
        return this.t;
    }

    public void j(String str, PrintWriter printWriter) {
        k(str, printWriter, true);
    }

    public void k(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.s);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.f479b != 0 || this.f480c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f479b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f480c));
            }
            if (this.f481d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f481d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        if (this.a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            n.a aVar = this.a.get(i);
            switch (aVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f482b);
            if (z) {
                if (aVar.f483c != 0 || aVar.f484d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f483c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f484d));
                }
                if (aVar.e != 0 || aVar.f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f));
                }
            }
        }
    }

    void l() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            n.a aVar = this.a.get(i);
            Fragment fragment = aVar.f482b;
            if (fragment != null) {
                fragment.i1(this.f, this.g);
            }
            switch (aVar.a) {
                case 1:
                    fragment.h1(aVar.f483c);
                    this.r.j(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.h1(aVar.f484d);
                    this.r.X0(fragment);
                    break;
                case 4:
                    fragment.h1(aVar.f484d);
                    this.r.B0(fragment);
                    break;
                case 5:
                    fragment.h1(aVar.f483c);
                    this.r.k1(fragment);
                    break;
                case 6:
                    fragment.h1(aVar.f484d);
                    this.r.v(fragment);
                    break;
                case 7:
                    fragment.h1(aVar.f483c);
                    this.r.o(fragment);
                    break;
                case 8:
                    this.r.j1(fragment);
                    break;
                case 9:
                    this.r.j1(null);
                    break;
                case 10:
                    this.r.i1(fragment, aVar.h);
                    break;
            }
            if (!this.p && aVar.a != 1 && fragment != null) {
                this.r.N0(fragment);
            }
        }
        if (this.p) {
            return;
        }
        j jVar = this.r;
        jVar.O0(jVar.q, true);
    }

    void m(boolean z) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            n.a aVar = this.a.get(size);
            Fragment fragment = aVar.f482b;
            if (fragment != null) {
                fragment.i1(j.c1(this.f), this.g);
            }
            switch (aVar.a) {
                case 1:
                    fragment.h1(aVar.f);
                    this.r.X0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.h1(aVar.e);
                    this.r.j(fragment, false);
                    break;
                case 4:
                    fragment.h1(aVar.e);
                    this.r.k1(fragment);
                    break;
                case 5:
                    fragment.h1(aVar.f);
                    this.r.B0(fragment);
                    break;
                case 6:
                    fragment.h1(aVar.e);
                    this.r.o(fragment);
                    break;
                case 7:
                    fragment.h1(aVar.f);
                    this.r.v(fragment);
                    break;
                case 8:
                    this.r.j1(null);
                    break;
                case 9:
                    this.r.j1(fragment);
                    break;
                case 10:
                    this.r.i1(fragment, aVar.g);
                    break;
            }
            if (!this.p && aVar.a != 3 && fragment != null) {
                this.r.N0(fragment);
            }
        }
        if (this.p || !z) {
            return;
        }
        j jVar = this.r;
        jVar.O0(jVar.q, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.fragment.app.Fragment n(java.util.ArrayList<androidx.fragment.app.Fragment> r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList<androidx.fragment.app.n$a> r5 = r0.a
            int r5 = r5.size()
            if (r4 >= r5) goto Lba
            java.util.ArrayList<androidx.fragment.app.n$a> r5 = r0.a
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.n$a r5 = (androidx.fragment.app.n.a) r5
            int r6 = r5.a
            r7 = 0
            r8 = 1
            if (r6 == r8) goto Lb2
            r9 = 2
            r10 = 3
            r11 = 9
            if (r6 == r9) goto L58
            if (r6 == r10) goto L41
            r9 = 6
            if (r6 == r9) goto L41
            r7 = 7
            if (r6 == r7) goto Lb2
            r7 = 8
            if (r6 == r7) goto L31
            goto Lb7
        L31:
            java.util.ArrayList<androidx.fragment.app.n$a> r6 = r0.a
            androidx.fragment.app.n$a r7 = new androidx.fragment.app.n$a
            r7.<init>(r11, r3)
            r6.add(r4, r7)
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.f482b
            goto Lb7
        L41:
            androidx.fragment.app.Fragment r6 = r5.f482b
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.f482b
            if (r5 != r3) goto Lb7
            java.util.ArrayList<androidx.fragment.app.n$a> r3 = r0.a
            androidx.fragment.app.n$a r6 = new androidx.fragment.app.n$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r7
            goto Lb7
        L58:
            androidx.fragment.app.Fragment r6 = r5.f482b
            int r9 = r6.x
            int r12 = r17.size()
            int r12 = r12 - r8
            r13 = 0
        L62:
            if (r12 < 0) goto La2
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.x
            if (r15 != r9) goto L9f
            if (r14 != r6) goto L72
            r13 = 1
            goto L9f
        L72:
            if (r14 != r3) goto L81
            java.util.ArrayList<androidx.fragment.app.n$a> r3 = r0.a
            androidx.fragment.app.n$a r15 = new androidx.fragment.app.n$a
            r15.<init>(r11, r14)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r7
        L81:
            androidx.fragment.app.n$a r15 = new androidx.fragment.app.n$a
            r15.<init>(r10, r14)
            int r2 = r5.f483c
            r15.f483c = r2
            int r2 = r5.e
            r15.e = r2
            int r2 = r5.f484d
            r15.f484d = r2
            int r2 = r5.f
            r15.f = r2
            java.util.ArrayList<androidx.fragment.app.n$a> r2 = r0.a
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r8
        L9f:
            int r12 = r12 + (-1)
            goto L62
        La2:
            if (r13 == 0) goto Lac
            java.util.ArrayList<androidx.fragment.app.n$a> r2 = r0.a
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lb7
        Lac:
            r5.a = r8
            r1.add(r6)
            goto Lb7
        Lb2:
            androidx.fragment.app.Fragment r2 = r5.f482b
            r1.add(r2)
        Lb7:
            int r4 = r4 + r8
            goto L7
        Lba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.n(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    public String o() {
        return this.i;
    }

    boolean p(int i) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.a.get(i2).f482b;
            int i3 = fragment != null ? fragment.x : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    boolean q(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.a.get(i4).f482b;
            int i5 = fragment != null ? fragment.x : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.a.get(i7).f482b;
                        if ((fragment2 != null ? fragment2.x : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    boolean s() {
        for (int i = 0; i < this.a.size(); i++) {
            if (r(this.a.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void t() {
        if (this.q != null) {
            for (int i = 0; i < this.q.size(); i++) {
                this.q.get(i).run();
            }
            this.q = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sb.append(" #");
            sb.append(this.t);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }

    void u(Fragment.e eVar) {
        for (int i = 0; i < this.a.size(); i++) {
            n.a aVar = this.a.get(i);
            if (r(aVar)) {
                aVar.f482b.j1(eVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.fragment.app.Fragment v(java.util.ArrayList<androidx.fragment.app.Fragment> r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.n$a> r0 = r5.a
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList<androidx.fragment.app.n$a> r2 = r5.a
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.n$a r2 = (androidx.fragment.app.n.a) r2
            int r3 = r2.a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.d$b r3 = r2.g
            r2.h = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.f482b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.f482b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.f482b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.v(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }
}

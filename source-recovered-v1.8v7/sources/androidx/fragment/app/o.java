package androidx.fragment.app;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
class o {
    private static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    private static final q f485b;

    /* renamed from: c, reason: collision with root package name */
    private static final q f486c;

    static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f487b;

        a(ArrayList arrayList) {
            this.f487b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            o.B(this.f487b, 4);
        }
    }

    static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f488b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f489c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f490d;
        final /* synthetic */ Fragment e;
        final /* synthetic */ ArrayList f;
        final /* synthetic */ ArrayList g;
        final /* synthetic */ ArrayList h;
        final /* synthetic */ Object i;

        b(Object obj, q qVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f488b = obj;
            this.f489c = qVar;
            this.f490d = view;
            this.e = fragment;
            this.f = arrayList;
            this.g = arrayList2;
            this.h = arrayList3;
            this.i = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f488b;
            if (obj != null) {
                this.f489c.p(obj, this.f490d);
                this.g.addAll(o.k(this.f489c, this.f488b, this.e, this.f, this.f490d));
            }
            if (this.h != null) {
                if (this.i != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f490d);
                    this.f489c.q(this.i, this.h, arrayList);
                }
                this.h.clear();
                this.h.add(this.f490d);
            }
        }
    }

    static class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f491b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f492c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f493d;
        final /* synthetic */ b.d.a e;
        final /* synthetic */ View f;
        final /* synthetic */ q g;
        final /* synthetic */ Rect h;

        c(Fragment fragment, Fragment fragment2, boolean z, b.d.a aVar, View view, q qVar, Rect rect) {
            this.f491b = fragment;
            this.f492c = fragment2;
            this.f493d = z;
            this.e = aVar;
            this.f = view;
            this.g = qVar;
            this.h = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            o.f(this.f491b, this.f492c, this.f493d, this.e, false);
            View view = this.f;
            if (view != null) {
                this.g.k(view, this.h);
            }
        }
    }

    static class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f494b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b.d.a f495c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f496d;
        final /* synthetic */ e e;
        final /* synthetic */ ArrayList f;
        final /* synthetic */ View g;
        final /* synthetic */ Fragment h;
        final /* synthetic */ Fragment i;
        final /* synthetic */ boolean j;
        final /* synthetic */ ArrayList k;
        final /* synthetic */ Object l;
        final /* synthetic */ Rect m;

        d(q qVar, b.d.a aVar, Object obj, e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f494b = qVar;
            this.f495c = aVar;
            this.f496d = obj;
            this.e = eVar;
            this.f = arrayList;
            this.g = view;
            this.h = fragment;
            this.i = fragment2;
            this.j = z;
            this.k = arrayList2;
            this.l = obj2;
            this.m = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.d.a<String, View> aVarH = o.h(this.f494b, this.f495c, this.f496d, this.e);
            if (aVarH != null) {
                this.f.addAll(aVarH.values());
                this.f.add(this.g);
            }
            o.f(this.h, this.i, this.j, aVarH, false);
            Object obj = this.f496d;
            if (obj != null) {
                this.f494b.z(obj, this.k, this.f);
                View viewT = o.t(aVarH, this.e, this.l, this.j);
                if (viewT != null) {
                    this.f494b.k(viewT, this.m);
                }
            }
        }
    }

    static class e {
        public Fragment a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f497b;

        /* renamed from: c, reason: collision with root package name */
        public androidx.fragment.app.a f498c;

        /* renamed from: d, reason: collision with root package name */
        public Fragment f499d;
        public boolean e;
        public androidx.fragment.app.a f;

        e() {
        }
    }

    static {
        f485b = Build.VERSION.SDK_INT >= 21 ? new p() : null;
        f486c = x();
    }

    private static void A(q qVar, Object obj, Object obj2, b.d.a<String, View> aVar, boolean z, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z ? aVar2.o : aVar2.n).get(0));
        qVar.v(obj, view);
        if (obj2 != null) {
            qVar.v(obj2, view);
        }
    }

    static void B(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    static void C(j jVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (jVar.q < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            androidx.fragment.app.a aVar = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                e(aVar, sparseArray, z);
            } else {
                c(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(jVar.r.i());
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int iKeyAt = sparseArray.keyAt(i4);
                b.d.a<String, String> aVarD = d(iKeyAt, arrayList, arrayList2, i, i2);
                e eVar = (e) sparseArray.valueAt(i4);
                if (z) {
                    o(jVar, iKeyAt, eVar, view, aVarD);
                } else {
                    n(jVar, iKeyAt, eVar, view, aVarD);
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, b.d.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewM = aVar.m(size);
            if (collection.contains(b.g.l.r.B(viewM))) {
                arrayList.add(viewM);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(androidx.fragment.app.a r16, androidx.fragment.app.n.a r17, android.util.SparseArray<androidx.fragment.app.o.e> r18, boolean r19, boolean r20) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o.b(androidx.fragment.app.a, androidx.fragment.app.n$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z) throws Resources.NotFoundException {
        int size = aVar.a.size();
        for (int i = 0; i < size; i++) {
            b(aVar, aVar.a.get(i), sparseArray, false, z);
        }
    }

    private static b.d.a<String, String> d(int i, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        b.d.a<String, String> aVar = new b.d.a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i4);
            if (aVar2.p(i)) {
                boolean zBooleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar2.n;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (zBooleanValue) {
                        arrayList3 = aVar2.n;
                        arrayList4 = aVar2.o;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.n;
                        arrayList3 = aVar2.o;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String strRemove = aVar.remove(str2);
                        if (strRemove != null) {
                            aVar.put(str, strRemove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z) throws Resources.NotFoundException {
        if (aVar.r.s.f()) {
            for (int size = aVar.a.size() - 1; size >= 0; size--) {
                b(aVar, aVar.a.get(size), sparseArray, true, z);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z, b.d.a<String, View> aVar, boolean z2) {
        androidx.core.app.k kVarR = z ? fragment2.r() : fragment.r();
        if (kVarR != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(aVar.i(i));
                arrayList.add(aVar.m(i));
            }
            if (z2) {
                kVarR.c(arrayList2, arrayList, null);
            } else {
                kVarR.b(arrayList2, arrayList, null);
            }
        }
    }

    private static boolean g(q qVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!qVar.e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    static b.d.a<String, View> h(q qVar, b.d.a<String, String> aVar, Object obj, e eVar) {
        androidx.core.app.k kVarR;
        ArrayList<String> arrayList;
        String strQ;
        Fragment fragment = eVar.a;
        View viewK = fragment.K();
        if (aVar.isEmpty() || obj == null || viewK == null) {
            aVar.clear();
            return null;
        }
        b.d.a<String, View> aVar2 = new b.d.a<>();
        qVar.j(aVar2, viewK);
        androidx.fragment.app.a aVar3 = eVar.f498c;
        if (eVar.f497b) {
            kVarR = fragment.t();
            arrayList = aVar3.n;
        } else {
            kVarR = fragment.r();
            arrayList = aVar3.o;
        }
        if (arrayList != null) {
            aVar2.o(arrayList);
            aVar2.o(aVar.values());
        }
        if (kVarR != null) {
            kVarR.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    String strQ2 = q(aVar, str);
                    if (strQ2 != null) {
                        aVar.remove(strQ2);
                    }
                } else if (!str.equals(b.g.l.r.B(view)) && (strQ = q(aVar, str)) != null) {
                    aVar.put(strQ, b.g.l.r.B(view));
                }
            }
        } else {
            y(aVar, aVar2);
        }
        return aVar2;
    }

    private static b.d.a<String, View> i(q qVar, b.d.a<String, String> aVar, Object obj, e eVar) {
        androidx.core.app.k kVarT;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = eVar.f499d;
        b.d.a<String, View> aVar2 = new b.d.a<>();
        qVar.j(aVar2, fragment.a1());
        androidx.fragment.app.a aVar3 = eVar.f;
        if (eVar.e) {
            kVarT = fragment.r();
            arrayList = aVar3.o;
        } else {
            kVarT = fragment.t();
            arrayList = aVar3.n;
        }
        aVar2.o(arrayList);
        if (kVarT != null) {
            kVarT.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(b.g.l.r.B(view))) {
                    aVar.put(b.g.l.r.B(view), aVar.remove(str));
                }
            }
        } else {
            aVar.o(aVar2.keySet());
        }
        return aVar2;
    }

    private static q j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object objS = fragment.s();
            if (objS != null) {
                arrayList.add(objS);
            }
            Object objE = fragment.E();
            if (objE != null) {
                arrayList.add(objE);
            }
            Object objG = fragment.G();
            if (objG != null) {
                arrayList.add(objG);
            }
        }
        if (fragment2 != null) {
            Object objQ = fragment2.q();
            if (objQ != null) {
                arrayList.add(objQ);
            }
            Object objB = fragment2.B();
            if (objB != null) {
                arrayList.add(objB);
            }
            Object objF = fragment2.F();
            if (objF != null) {
                arrayList.add(objF);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        q qVar = f485b;
        if (qVar != null && g(qVar, arrayList)) {
            return f485b;
        }
        q qVar2 = f486c;
        if (qVar2 != null && g(qVar2, arrayList)) {
            return f486c;
        }
        if (f485b == null && f486c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View viewK = fragment.K();
        if (viewK != null) {
            qVar.f(arrayList2, viewK);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        qVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(q qVar, ViewGroup viewGroup, View view, b.d.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object objU;
        b.d.a<String, String> aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = eVar.a;
        Fragment fragment2 = eVar.f499d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar.f497b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            objU = null;
        } else {
            objU = u(qVar, fragment, fragment2, z);
            aVar2 = aVar;
        }
        b.d.a<String, View> aVarI = i(qVar, aVar2, objU, eVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(aVarI.values());
            obj3 = objU;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, aVarI, true);
        if (obj3 != null) {
            rect = new Rect();
            qVar.y(obj3, view, arrayList);
            A(qVar, obj3, obj2, aVarI, eVar.e, eVar.f);
            if (obj != null) {
                qVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        b.g.l.p.a(viewGroup, new d(qVar, aVar, obj3, eVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(q qVar, ViewGroup viewGroup, View view, b.d.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = eVar.a;
        Fragment fragment2 = eVar.f499d;
        if (fragment != null) {
            fragment.a1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar.f497b;
        Object objU = aVar.isEmpty() ? null : u(qVar, fragment, fragment2, z);
        b.d.a<String, View> aVarI = i(qVar, aVar, objU, eVar);
        b.d.a<String, View> aVarH = h(qVar, aVar, objU, eVar);
        if (aVar.isEmpty()) {
            if (aVarI != null) {
                aVarI.clear();
            }
            if (aVarH != null) {
                aVarH.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, aVarI, aVar.keySet());
            a(arrayList2, aVarH, aVar.values());
            obj3 = objU;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, aVarI, true);
        if (obj3 != null) {
            arrayList2.add(view);
            qVar.y(obj3, view, arrayList);
            A(qVar, obj3, obj2, aVarI, eVar.e, eVar.f);
            Rect rect2 = new Rect();
            View viewT = t(aVarH, eVar, obj, z);
            if (viewT != null) {
                qVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = viewT;
        } else {
            view2 = null;
            rect = null;
        }
        b.g.l.p.a(viewGroup, new c(fragment, fragment2, z, aVarH, view2, qVar, rect));
        return obj3;
    }

    private static void n(j jVar, int i, e eVar, View view, b.d.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        q qVarJ;
        Object obj;
        ViewGroup viewGroup = jVar.s.f() ? (ViewGroup) jVar.s.e(i) : null;
        if (viewGroup == null || (qVarJ = j((fragment2 = eVar.f499d), (fragment = eVar.a))) == null) {
            return;
        }
        boolean z = eVar.f497b;
        boolean z2 = eVar.e;
        Object objR = r(qVarJ, fragment, z);
        Object objS = s(qVarJ, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objL = l(qVarJ, viewGroup, view, aVar, eVar, arrayList, arrayList2, objR, objS);
        if (objR == null && objL == null) {
            obj = objS;
            if (obj == null) {
                return;
            }
        } else {
            obj = objS;
        }
        ArrayList<View> arrayListK = k(qVarJ, obj, fragment2, arrayList, view);
        Object obj2 = (arrayListK == null || arrayListK.isEmpty()) ? null : obj;
        qVarJ.a(objR, view);
        Object objV = v(qVarJ, objR, obj2, objL, fragment, eVar.f497b);
        if (objV != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            qVarJ.t(objV, objR, arrayList3, obj2, arrayListK, objL, arrayList2);
            z(qVarJ, viewGroup, fragment, view, arrayList2, objR, arrayList3, obj2, arrayListK);
            qVarJ.w(viewGroup, arrayList2, aVar);
            qVarJ.c(viewGroup, objV);
            qVarJ.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(j jVar, int i, e eVar, View view, b.d.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        q qVarJ;
        Object obj;
        ViewGroup viewGroup = jVar.s.f() ? (ViewGroup) jVar.s.e(i) : null;
        if (viewGroup == null || (qVarJ = j((fragment2 = eVar.f499d), (fragment = eVar.a))) == null) {
            return;
        }
        boolean z = eVar.f497b;
        boolean z2 = eVar.e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objR = r(qVarJ, fragment, z);
        Object objS = s(qVarJ, fragment2, z2);
        Object objM = m(qVarJ, viewGroup, view, aVar, eVar, arrayList2, arrayList, objR, objS);
        if (objR == null && objM == null) {
            obj = objS;
            if (obj == null) {
                return;
            }
        } else {
            obj = objS;
        }
        ArrayList<View> arrayListK = k(qVarJ, obj, fragment2, arrayList2, view);
        ArrayList<View> arrayListK2 = k(qVarJ, objR, fragment, arrayList, view);
        B(arrayListK2, 4);
        Object objV = v(qVarJ, objR, obj, objM, fragment, z);
        if (objV != null) {
            w(qVarJ, obj, fragment2, arrayListK);
            ArrayList<String> arrayListO = qVarJ.o(arrayList);
            qVarJ.t(objV, objR, arrayListK2, obj, arrayListK, objM, arrayList);
            qVarJ.c(viewGroup, objV);
            qVarJ.x(viewGroup, arrayList2, arrayList, arrayListO, aVar);
            B(arrayListK2, 0);
            qVarJ.z(objM, arrayList2, arrayList);
        }
    }

    private static e p(e eVar, SparseArray<e> sparseArray, int i) {
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        sparseArray.put(i, eVar2);
        return eVar2;
    }

    private static String q(b.d.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.m(i))) {
                return aVar.i(i);
            }
        }
        return null;
    }

    private static Object r(q qVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return qVar.g(z ? fragment.B() : fragment.q());
    }

    private static Object s(q qVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return qVar.g(z ? fragment.E() : fragment.s());
    }

    static View t(b.d.a<String, View> aVar, e eVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = eVar.f498c;
        if (obj == null || aVar == null || (arrayList = aVar2.n) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.n : aVar2.o).get(0));
    }

    private static Object u(q qVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return qVar.A(qVar.g(z ? fragment2.G() : fragment.F()));
    }

    private static Object v(q qVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.k() : fragment.j() ? qVar.n(obj2, obj, obj3) : qVar.m(obj2, obj, obj3);
    }

    private static void w(q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.l && fragment.z && fragment.N) {
            fragment.g1(true);
            qVar.r(obj, fragment.K(), arrayList);
            b.g.l.p.a(fragment.G, new a(arrayList));
        }
    }

    private static q x() {
        try {
            return (q) Class.forName("b.n.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void y(b.d.a<String, String> aVar, b.d.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.m(size))) {
                aVar.k(size);
            }
        }
    }

    private static void z(q qVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        b.g.l.p.a(viewGroup, new b(obj, qVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}

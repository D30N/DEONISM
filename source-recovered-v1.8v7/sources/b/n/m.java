package b.n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m implements Cloneable {
    private static final int[] H = {2, 1, 3, 4};
    private static final g I = new a();
    private static ThreadLocal<b.d.a<Animator, d>> J = new ThreadLocal<>();
    p D;
    private e E;
    private b.d.a<String, String> F;
    private ArrayList<s> u;
    private ArrayList<s> v;

    /* renamed from: b, reason: collision with root package name */
    private String f1004b = getClass().getName();

    /* renamed from: c, reason: collision with root package name */
    private long f1005c = -1;

    /* renamed from: d, reason: collision with root package name */
    long f1006d = -1;
    private TimeInterpolator e = null;
    ArrayList<Integer> f = new ArrayList<>();
    ArrayList<View> g = new ArrayList<>();
    private ArrayList<String> h = null;
    private ArrayList<Class<?>> i = null;
    private ArrayList<Integer> j = null;
    private ArrayList<View> k = null;
    private ArrayList<Class<?>> l = null;
    private ArrayList<String> m = null;
    private ArrayList<Integer> n = null;
    private ArrayList<View> o = null;
    private ArrayList<Class<?>> p = null;
    private t q = new t();
    private t r = new t();
    q s = null;
    private int[] t = H;
    boolean w = false;
    ArrayList<Animator> x = new ArrayList<>();
    private int y = 0;
    private boolean z = false;
    private boolean A = false;
    private ArrayList<f> B = null;
    private ArrayList<Animator> C = new ArrayList<>();
    private g G = I;

    static class a extends g {
        a() {
        }

        @Override // b.n.g
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    class b extends AnimatorListenerAdapter {
        final /* synthetic */ b.d.a a;

        b(b.d.a aVar) {
            this.a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.remove(animator);
            m.this.x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m.this.x.add(animator);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m.this.v();
            animator.removeListener(this);
        }
    }

    private static class d {
        View a;

        /* renamed from: b, reason: collision with root package name */
        String f1008b;

        /* renamed from: c, reason: collision with root package name */
        s f1009c;

        /* renamed from: d, reason: collision with root package name */
        m0 f1010d;
        m e;

        d(View view, String str, m mVar, m0 m0Var, s sVar) {
            this.a = view;
            this.f1008b = str;
            this.f1009c = sVar;
            this.f1010d = m0Var;
            this.e = mVar;
        }
    }

    public static abstract class e {
    }

    public interface f {
        void a(m mVar);

        void b(m mVar);

        void c(m mVar);

        void d(m mVar);

        void e(m mVar);
    }

    private static b.d.a<Animator, d> D() {
        b.d.a<Animator, d> aVar = J.get();
        if (aVar != null) {
            return aVar;
        }
        b.d.a<Animator, d> aVar2 = new b.d.a<>();
        J.set(aVar2);
        return aVar2;
    }

    private static boolean N(s sVar, s sVar2, String str) {
        Object obj = sVar.a.get(str);
        Object obj2 = sVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void O(b.d.a<View, s> aVar, b.d.a<View, s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View viewValueAt = sparseArray.valueAt(i);
            if (viewValueAt != null && M(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && M(view)) {
                s sVar = aVar.get(viewValueAt);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.u.add(sVar);
                    this.v.add(sVar2);
                    aVar.remove(viewValueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void P(b.d.a<View, s> aVar, b.d.a<View, s> aVar2) {
        s sVarRemove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewI = aVar.i(size);
            if (viewI != null && M(viewI) && (sVarRemove = aVar2.remove(viewI)) != null && M(sVarRemove.f1019b)) {
                this.u.add(aVar.k(size));
                this.v.add(sVarRemove);
            }
        }
    }

    private void Q(b.d.a<View, s> aVar, b.d.a<View, s> aVar2, b.d.d<View> dVar, b.d.d<View> dVar2) {
        View viewG;
        int iS = dVar.s();
        for (int i = 0; i < iS; i++) {
            View viewT = dVar.t(i);
            if (viewT != null && M(viewT) && (viewG = dVar2.g(dVar.n(i))) != null && M(viewG)) {
                s sVar = aVar.get(viewT);
                s sVar2 = aVar2.get(viewG);
                if (sVar != null && sVar2 != null) {
                    this.u.add(sVar);
                    this.v.add(sVar2);
                    aVar.remove(viewT);
                    aVar2.remove(viewG);
                }
            }
        }
    }

    private void R(b.d.a<View, s> aVar, b.d.a<View, s> aVar2, b.d.a<String, View> aVar3, b.d.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View viewM = aVar3.m(i);
            if (viewM != null && M(viewM) && (view = aVar4.get(aVar3.i(i))) != null && M(view)) {
                s sVar = aVar.get(viewM);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.u.add(sVar);
                    this.v.add(sVar2);
                    aVar.remove(viewM);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void S(t tVar, t tVar2) {
        b.d.a<View, s> aVar = new b.d.a<>(tVar.a);
        b.d.a<View, s> aVar2 = new b.d.a<>(tVar2.a);
        int i = 0;
        while (true) {
            int[] iArr = this.t;
            if (i >= iArr.length) {
                d(aVar, aVar2);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                P(aVar, aVar2);
            } else if (i2 == 2) {
                R(aVar, aVar2, tVar.f1023d, tVar2.f1023d);
            } else if (i2 == 3) {
                O(aVar, aVar2, tVar.f1021b, tVar2.f1021b);
            } else if (i2 == 4) {
                Q(aVar, aVar2, tVar.f1022c, tVar2.f1022c);
            }
            i++;
        }
    }

    private void Y(Animator animator, b.d.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            f(animator);
        }
    }

    private void d(b.d.a<View, s> aVar, b.d.a<View, s> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            s sVarM = aVar.m(i);
            if (M(sVarM.f1019b)) {
                this.u.add(sVarM);
                this.v.add(null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            s sVarM2 = aVar2.m(i2);
            if (M(sVarM2.f1019b)) {
                this.v.add(sVarM2);
                this.u.add(null);
            }
        }
    }

    private static void e(t tVar, View view, s sVar) {
        tVar.a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f1021b.indexOfKey(id) >= 0) {
                tVar.f1021b.put(id, null);
            } else {
                tVar.f1021b.put(id, view);
            }
        }
        String strB = b.g.l.r.B(view);
        if (strB != null) {
            if (tVar.f1023d.containsKey(strB)) {
                tVar.f1023d.put(strB, null);
            } else {
                tVar.f1023d.put(strB, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f1022c.k(itemIdAtPosition) < 0) {
                    b.g.l.r.k0(view, true);
                    tVar.f1022c.o(itemIdAtPosition, view);
                    return;
                }
                View viewG = tVar.f1022c.g(itemIdAtPosition);
                if (viewG != null) {
                    b.g.l.r.k0(viewG, false);
                    tVar.f1022c.o(itemIdAtPosition, null);
                }
            }
        }
    }

    private void k(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.j;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.k;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.l;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.l.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    s sVar = new s(view);
                    if (z) {
                        o(sVar);
                    } else {
                        j(sVar);
                    }
                    sVar.f1020c.add(this);
                    n(sVar);
                    e(z ? this.q : this.r, view, sVar);
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.n;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.o;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.p;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.p.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                k(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    public String A() {
        return this.f1004b;
    }

    public g B() {
        return this.G;
    }

    public p C() {
        return this.D;
    }

    public long E() {
        return this.f1005c;
    }

    public List<Integer> F() {
        return this.f;
    }

    public List<String> G() {
        return this.h;
    }

    public List<Class<?>> H() {
        return this.i;
    }

    public List<View> I() {
        return this.g;
    }

    public String[] J() {
        return null;
    }

    public s K(View view, boolean z) {
        q qVar = this.s;
        if (qVar != null) {
            return qVar.K(view, z);
        }
        return (z ? this.q : this.r).a.get(view);
    }

    public boolean L(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] strArrJ = J();
        if (strArrJ == null) {
            Iterator<String> it = sVar.a.keySet().iterator();
            while (it.hasNext()) {
                if (N(sVar, sVar2, it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrJ) {
            if (!N(sVar, sVar2, str)) {
            }
        }
        return false;
        return true;
    }

    boolean M(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.j;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.k;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.l;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.l.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.m != null && b.g.l.r.B(view) != null && this.m.contains(b.g.l.r.B(view))) {
            return false;
        }
        if ((this.f.size() == 0 && this.g.size() == 0 && (((arrayList = this.i) == null || arrayList.isEmpty()) && ((arrayList2 = this.h) == null || arrayList2.isEmpty()))) || this.f.contains(Integer.valueOf(id)) || this.g.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.h;
        if (arrayList6 != null && arrayList6.contains(b.g.l.r.B(view))) {
            return true;
        }
        if (this.i != null) {
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                if (this.i.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void T(View view) {
        if (this.A) {
            return;
        }
        b.d.a<Animator, d> aVarD = D();
        int size = aVarD.size();
        m0 m0VarD = c0.d(view);
        for (int i = size - 1; i >= 0; i--) {
            d dVarM = aVarD.m(i);
            if (dVarM.a != null && m0VarD.equals(dVarM.f1010d)) {
                b.n.a.b(aVarD.i(i));
            }
        }
        ArrayList<f> arrayList = this.B;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.B.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((f) arrayList2.get(i2)).a(this);
            }
        }
        this.z = true;
    }

    void U(ViewGroup viewGroup) {
        d dVar;
        this.u = new ArrayList<>();
        this.v = new ArrayList<>();
        S(this.q, this.r);
        b.d.a<Animator, d> aVarD = D();
        int size = aVarD.size();
        m0 m0VarD = c0.d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animatorI = aVarD.i(i);
            if (animatorI != null && (dVar = aVarD.get(animatorI)) != null && dVar.a != null && m0VarD.equals(dVar.f1010d)) {
                s sVar = dVar.f1009c;
                View view = dVar.a;
                s sVarK = K(view, true);
                s sVarZ = z(view, true);
                if (sVarK == null && sVarZ == null) {
                    sVarZ = this.r.a.get(view);
                }
                if (!(sVarK == null && sVarZ == null) && dVar.e.L(sVar, sVarZ)) {
                    if (animatorI.isRunning() || animatorI.isStarted()) {
                        animatorI.cancel();
                    } else {
                        aVarD.remove(animatorI);
                    }
                }
            }
        }
        u(viewGroup, this.q, this.r, this.u, this.v);
        Z();
    }

    public m V(f fVar) {
        ArrayList<f> arrayList = this.B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.B.size() == 0) {
            this.B = null;
        }
        return this;
    }

    public m W(View view) {
        this.g.remove(view);
        return this;
    }

    public void X(View view) {
        if (this.z) {
            if (!this.A) {
                b.d.a<Animator, d> aVarD = D();
                int size = aVarD.size();
                m0 m0VarD = c0.d(view);
                for (int i = size - 1; i >= 0; i--) {
                    d dVarM = aVarD.m(i);
                    if (dVarM.a != null && m0VarD.equals(dVarM.f1010d)) {
                        b.n.a.c(aVarD.i(i));
                    }
                }
                ArrayList<f> arrayList = this.B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.B.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((f) arrayList2.get(i2)).b(this);
                    }
                }
            }
            this.z = false;
        }
    }

    protected void Z() {
        g0();
        b.d.a<Animator, d> aVarD = D();
        Iterator<Animator> it = this.C.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (aVarD.containsKey(next)) {
                g0();
                Y(next, aVarD);
            }
        }
        this.C.clear();
        v();
    }

    public m a0(long j) {
        this.f1006d = j;
        return this;
    }

    public m b(f fVar) {
        if (this.B == null) {
            this.B = new ArrayList<>();
        }
        this.B.add(fVar);
        return this;
    }

    public void b0(e eVar) {
        this.E = eVar;
    }

    public m c(View view) {
        this.g.add(view);
        return this;
    }

    public m c0(TimeInterpolator timeInterpolator) {
        this.e = timeInterpolator;
        return this;
    }

    public void d0(g gVar) {
        if (gVar == null) {
            gVar = I;
        }
        this.G = gVar;
    }

    public void e0(p pVar) {
        this.D = pVar;
    }

    protected void f(Animator animator) {
        if (animator == null) {
            v();
            return;
        }
        if (w() >= 0) {
            animator.setDuration(w());
        }
        if (E() >= 0) {
            animator.setStartDelay(E() + animator.getStartDelay());
        }
        if (y() != null) {
            animator.setInterpolator(y());
        }
        animator.addListener(new c());
        animator.start();
    }

    public m f0(long j) {
        this.f1005c = j;
        return this;
    }

    protected void g() {
        for (int size = this.x.size() - 1; size >= 0; size--) {
            this.x.get(size).cancel();
        }
        ArrayList<f> arrayList = this.B;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.B.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((f) arrayList2.get(i)).d(this);
        }
    }

    protected void g0() {
        if (this.y == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((f) arrayList2.get(i)).c(this);
                }
            }
            this.A = false;
        }
        this.y++;
    }

    String h0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f1006d != -1) {
            str2 = str2 + "dur(" + this.f1006d + ") ";
        }
        if (this.f1005c != -1) {
            str2 = str2 + "dly(" + this.f1005c + ") ";
        }
        if (this.e != null) {
            str2 = str2 + "interp(" + this.e + ") ";
        }
        if (this.f.size() <= 0 && this.g.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f.size() > 0) {
            for (int i = 0; i < this.f.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f.get(i);
            }
        }
        if (this.g.size() > 0) {
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.g.get(i2);
            }
        }
        return str3 + ")";
    }

    public abstract void j(s sVar);

    void n(s sVar) {
        String[] strArrB;
        if (this.D == null || sVar.a.isEmpty() || (strArrB = this.D.b()) == null) {
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= strArrB.length) {
                z = true;
                break;
            } else if (!sVar.a.containsKey(strArrB[i])) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return;
        }
        this.D.a(sVar);
    }

    public abstract void o(s sVar);

    void q(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        b.d.a<String, String> aVar;
        r(z);
        if ((this.f.size() > 0 || this.g.size() > 0) && (((arrayList = this.h) == null || arrayList.isEmpty()) && ((arrayList2 = this.i) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(this.f.get(i).intValue());
                if (viewFindViewById != null) {
                    s sVar = new s(viewFindViewById);
                    if (z) {
                        o(sVar);
                    } else {
                        j(sVar);
                    }
                    sVar.f1020c.add(this);
                    n(sVar);
                    e(z ? this.q : this.r, viewFindViewById, sVar);
                }
            }
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                View view = this.g.get(i2);
                s sVar2 = new s(view);
                if (z) {
                    o(sVar2);
                } else {
                    j(sVar2);
                }
                sVar2.f1020c.add(this);
                n(sVar2);
                e(z ? this.q : this.r, view, sVar2);
            }
        } else {
            k(viewGroup, z);
        }
        if (z || (aVar = this.F) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.q.f1023d.remove(this.F.i(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.q.f1023d.put(this.F.m(i4), view2);
            }
        }
    }

    void r(boolean z) {
        t tVar;
        if (z) {
            this.q.a.clear();
            this.q.f1021b.clear();
            tVar = this.q;
        } else {
            this.r.a.clear();
            this.r.f1021b.clear();
            tVar = this.r;
        }
        tVar.f1022c.c();
    }

    @Override // 
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.C = new ArrayList<>();
            mVar.q = new t();
            mVar.r = new t();
            mVar.u = null;
            mVar.v = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator t(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    public String toString() {
        return h0("");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void u(android.view.ViewGroup r21, b.n.t r22, b.n.t r23, java.util.ArrayList<b.n.s> r24, java.util.ArrayList<b.n.s> r25) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.n.m.u(android.view.ViewGroup, b.n.t, b.n.t, java.util.ArrayList, java.util.ArrayList):void");
    }

    protected void v() {
        int i = this.y - 1;
        this.y = i;
        if (i == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).e(this);
                }
            }
            for (int i3 = 0; i3 < this.q.f1022c.s(); i3++) {
                View viewT = this.q.f1022c.t(i3);
                if (viewT != null) {
                    b.g.l.r.k0(viewT, false);
                }
            }
            for (int i4 = 0; i4 < this.r.f1022c.s(); i4++) {
                View viewT2 = this.r.f1022c.t(i4);
                if (viewT2 != null) {
                    b.g.l.r.k0(viewT2, false);
                }
            }
            this.A = true;
        }
    }

    public long w() {
        return this.f1006d;
    }

    public e x() {
        return this.E;
    }

    public TimeInterpolator y() {
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r3 < 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r8 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        r7 = r6.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r7 = r6.u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        return r7.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    b.n.s z(android.view.View r7, boolean r8) {
        /*
            r6 = this;
            b.n.q r0 = r6.s
            if (r0 == 0) goto L9
            b.n.s r7 = r0.z(r7, r8)
            return r7
        L9:
            if (r8 == 0) goto Le
            java.util.ArrayList<b.n.s> r0 = r6.u
            goto L10
        Le:
            java.util.ArrayList<b.n.s> r0 = r6.v
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = -1
            r4 = 0
        L1a:
            if (r4 >= r2) goto L2e
            java.lang.Object r5 = r0.get(r4)
            b.n.s r5 = (b.n.s) r5
            if (r5 != 0) goto L25
            return r1
        L25:
            android.view.View r5 = r5.f1019b
            if (r5 != r7) goto L2b
            r3 = r4
            goto L2e
        L2b:
            int r4 = r4 + 1
            goto L1a
        L2e:
            if (r3 < 0) goto L3e
            if (r8 == 0) goto L35
            java.util.ArrayList<b.n.s> r7 = r6.v
            goto L37
        L35:
            java.util.ArrayList<b.n.s> r7 = r6.u
        L37:
            java.lang.Object r7 = r7.get(r3)
            r1 = r7
            b.n.s r1 = (b.n.s) r1
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.n.m.z(android.view.View, boolean):b.n.s");
    }
}

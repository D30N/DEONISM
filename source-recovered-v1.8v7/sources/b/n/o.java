package b.n;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o {
    private static m a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal<WeakReference<b.d.a<ViewGroup, ArrayList<m>>>> f1011b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    static ArrayList<ViewGroup> f1012c = new ArrayList<>();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        m f1013b;

        /* renamed from: c, reason: collision with root package name */
        ViewGroup f1014c;

        /* renamed from: b.n.o$a$a, reason: collision with other inner class name */
        class C0042a extends n {
            final /* synthetic */ b.d.a a;

            C0042a(b.d.a aVar) {
                this.a = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // b.n.m.f
            public void e(m mVar) {
                ((ArrayList) this.a.get(a.this.f1014c)).remove(mVar);
                mVar.V(this);
            }
        }

        a(m mVar, ViewGroup viewGroup) {
            this.f1013b = mVar;
            this.f1014c = viewGroup;
        }

        private void a() {
            this.f1014c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f1014c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!o.f1012c.remove(this.f1014c)) {
                return true;
            }
            b.d.a<ViewGroup, ArrayList<m>> aVarB = o.b();
            ArrayList<m> arrayList = aVarB.get(this.f1014c);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                aVarB.put(this.f1014c, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f1013b);
            this.f1013b.b(new C0042a(aVarB));
            this.f1013b.q(this.f1014c, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).X(this.f1014c);
                }
            }
            this.f1013b.U(this.f1014c);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            o.f1012c.remove(this.f1014c);
            ArrayList<m> arrayList = o.b().get(this.f1014c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().X(this.f1014c);
                }
            }
            this.f1013b.r(true);
        }
    }

    public static void a(ViewGroup viewGroup, m mVar) {
        if (f1012c.contains(viewGroup) || !b.g.l.r.J(viewGroup)) {
            return;
        }
        f1012c.add(viewGroup);
        if (mVar == null) {
            mVar = a;
        }
        m mVarClone = mVar.clone();
        d(viewGroup, mVarClone);
        l.c(viewGroup, null);
        c(viewGroup, mVarClone);
    }

    static b.d.a<ViewGroup, ArrayList<m>> b() {
        b.d.a<ViewGroup, ArrayList<m>> aVar;
        WeakReference<b.d.a<ViewGroup, ArrayList<m>>> weakReference = f1011b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        b.d.a<ViewGroup, ArrayList<m>> aVar2 = new b.d.a<>();
        f1011b.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    private static void c(ViewGroup viewGroup, m mVar) {
        if (mVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(mVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(ViewGroup viewGroup, m mVar) {
        ArrayList<m> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().T(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.q(viewGroup, true);
        }
        l lVarB = l.b(viewGroup);
        if (lVarB != null) {
            lVarB.a();
        }
    }
}

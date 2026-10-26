package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import b.g.l.r;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class l extends b.g.l.a {

    /* renamed from: d, reason: collision with root package name */
    final RecyclerView f662d;
    private final a e;

    public static class a extends b.g.l.a {

        /* renamed from: d, reason: collision with root package name */
        final l f663d;
        private Map<View, b.g.l.a> e = new WeakHashMap();

        public a(l lVar) {
            this.f663d = lVar;
        }

        @Override // b.g.l.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            b.g.l.a aVar = this.e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // b.g.l.a
        public b.g.l.a0.d b(View view) {
            b.g.l.a aVar = this.e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // b.g.l.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            b.g.l.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // b.g.l.a
        public void g(View view, b.g.l.a0.c cVar) {
            if (!this.f663d.o() && this.f663d.f662d.getLayoutManager() != null) {
                this.f663d.f662d.getLayoutManager().O0(view, cVar);
                b.g.l.a aVar = this.e.get(view);
                if (aVar != null) {
                    aVar.g(view, cVar);
                    return;
                }
            }
            super.g(view, cVar);
        }

        @Override // b.g.l.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            b.g.l.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // b.g.l.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            b.g.l.a aVar = this.e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // b.g.l.a
        public boolean j(View view, int i, Bundle bundle) {
            if (this.f663d.o() || this.f663d.f662d.getLayoutManager() == null) {
                return super.j(view, i, bundle);
            }
            b.g.l.a aVar = this.e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i, bundle)) {
                    return true;
                }
            } else if (super.j(view, i, bundle)) {
                return true;
            }
            return this.f663d.f662d.getLayoutManager().i1(view, i, bundle);
        }

        @Override // b.g.l.a
        public void l(View view, int i) {
            b.g.l.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.l(view, i);
            } else {
                super.l(view, i);
            }
        }

        @Override // b.g.l.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            b.g.l.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        b.g.l.a n(View view) {
            return this.e.remove(view);
        }

        void o(View view) {
            b.g.l.a aVarH = r.h(view);
            if (aVarH == null || aVarH == this) {
                return;
            }
            this.e.put(view, aVarH);
        }
    }

    public l(RecyclerView recyclerView) {
        this.f662d = recyclerView;
        b.g.l.a aVarN = n();
        this.e = (aVarN == null || !(aVarN instanceof a)) ? new a(this) : (a) aVarN;
    }

    @Override // b.g.l.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().K0(accessibilityEvent);
        }
    }

    @Override // b.g.l.a
    public void g(View view, b.g.l.a0.c cVar) {
        super.g(view, cVar);
        if (o() || this.f662d.getLayoutManager() == null) {
            return;
        }
        this.f662d.getLayoutManager().M0(cVar);
    }

    @Override // b.g.l.a
    public boolean j(View view, int i, Bundle bundle) {
        if (super.j(view, i, bundle)) {
            return true;
        }
        if (o() || this.f662d.getLayoutManager() == null) {
            return false;
        }
        return this.f662d.getLayoutManager().g1(i, bundle);
    }

    public b.g.l.a n() {
        return this.e;
    }

    boolean o() {
        return this.f662d.hasPendingAdapterUpdates();
    }
}

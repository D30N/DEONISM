package androidx.activity;

import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    private final Runnable a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayDeque<b> f7b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements e, androidx.activity.a {
        private final d a;

        /* renamed from: b, reason: collision with root package name */
        private final b f8b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.activity.a f9c;

        LifecycleOnBackPressedCancellable(d dVar, b bVar) {
            this.a = dVar;
            this.f8b = bVar;
            dVar.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.a.c(this);
            this.f8b.e(this);
            androidx.activity.a aVar = this.f9c;
            if (aVar != null) {
                aVar.cancel();
                this.f9c = null;
            }
        }

        @Override // androidx.lifecycle.e
        public void d(g gVar, d.a aVar) {
            if (aVar == d.a.ON_START) {
                this.f9c = OnBackPressedDispatcher.this.b(this.f8b);
                return;
            }
            if (aVar != d.a.ON_STOP) {
                if (aVar == d.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar2 = this.f9c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            }
        }
    }

    private class a implements androidx.activity.a {
        private final b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f7b.remove(this.a);
            this.a.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
    }

    public void a(g gVar, b bVar) {
        d dVarA = gVar.a();
        if (dVarA.b() == d.b.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(dVarA, bVar));
    }

    androidx.activity.a b(b bVar) {
        this.f7b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> itDescendingIterator = this.f7b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            b next = itDescendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}

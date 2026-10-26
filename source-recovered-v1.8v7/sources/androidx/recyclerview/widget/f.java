package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class f implements Runnable {
    static final ThreadLocal<f> f = new ThreadLocal<>();
    static Comparator<c> g = new a();

    /* renamed from: c, reason: collision with root package name */
    long f648c;

    /* renamed from: d, reason: collision with root package name */
    long f649d;

    /* renamed from: b, reason: collision with root package name */
    ArrayList<RecyclerView> f647b = new ArrayList<>();
    private ArrayList<c> e = new ArrayList<>();

    static class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            if ((cVar.f655d == null) != (cVar2.f655d == null)) {
                return cVar.f655d == null ? 1 : -1;
            }
            boolean z = cVar.a;
            if (z != cVar2.a) {
                return z ? -1 : 1;
            }
            int i = cVar2.f653b - cVar.f653b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.f654c - cVar2.f654c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    static class b implements RecyclerView.o.c {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f650b;

        /* renamed from: c, reason: collision with root package name */
        int[] f651c;

        /* renamed from: d, reason: collision with root package name */
        int f652d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f652d * 2;
            int[] iArr = this.f651c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f651c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[i3 * 2];
                this.f651c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f651c;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.f652d++;
        }

        void b() {
            int[] iArr = this.f651c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f652d = 0;
        }

        void c(RecyclerView recyclerView, boolean z) {
            this.f652d = 0;
            int[] iArr = this.f651c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || oVar == null || !oVar.u0()) {
                return;
            }
            if (z) {
                if (!recyclerView.mAdapterHelper.p()) {
                    oVar.p(recyclerView.mAdapter.c(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                oVar.o(this.a, this.f650b, recyclerView.mState, this);
            }
            int i = this.f652d;
            if (i > oVar.m) {
                oVar.m = i;
                oVar.n = z;
                recyclerView.mRecycler.K();
            }
        }

        boolean d(int i) {
            if (this.f651c != null) {
                int i2 = this.f652d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f651c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i, int i2) {
            this.a = i;
            this.f650b = i2;
        }
    }

    static class c {
        public boolean a;

        /* renamed from: b, reason: collision with root package name */
        public int f653b;

        /* renamed from: c, reason: collision with root package name */
        public int f654c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f655d;
        public int e;

        c() {
        }

        public void a() {
            this.a = false;
            this.f653b = 0;
            this.f654c = 0;
            this.f655d = null;
            this.e = 0;
        }
    }

    f() {
    }

    private void b() {
        c cVar;
        int size = this.f647b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f647b.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.c(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.f652d;
            }
        }
        this.e.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f647b.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int iAbs = Math.abs(bVar.a) + Math.abs(bVar.f650b);
                for (int i5 = 0; i5 < bVar.f652d * 2; i5 += 2) {
                    if (i3 >= this.e.size()) {
                        cVar = new c();
                        this.e.add(cVar);
                    } else {
                        cVar = this.e.get(i3);
                    }
                    int i6 = bVar.f651c[i5 + 1];
                    cVar.a = i6 <= iAbs;
                    cVar.f653b = iAbs;
                    cVar.f654c = i6;
                    cVar.f655d = recyclerView2;
                    cVar.e = bVar.f651c[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.e, g);
    }

    private void c(c cVar, long j) {
        RecyclerView.d0 d0VarI = i(cVar.f655d, cVar.e, cVar.a ? Long.MAX_VALUE : j);
        if (d0VarI == null || d0VarI.f558b == null || !d0VarI.s() || d0VarI.t()) {
            return;
        }
        h(d0VarI.f558b.get(), j);
    }

    private void d(long j) {
        for (int i = 0; i < this.e.size(); i++) {
            c cVar = this.e.get(i);
            if (cVar.f655d == null) {
                return;
            }
            c(cVar, j);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i) {
        int iJ = recyclerView.mChildHelper.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            RecyclerView.d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.i(i2));
            if (childViewHolderInt.f559c == i && !childViewHolderInt.t()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.c(recyclerView, true);
        if (bVar.f652d != 0) {
            try {
                b.g.h.a.a("RV Nested Prefetch");
                recyclerView.mState.f(recyclerView.mAdapter);
                for (int i = 0; i < bVar.f652d * 2; i += 2) {
                    i(recyclerView, bVar.f651c[i], j);
                }
            } finally {
                b.g.h.a.b();
            }
        }
    }

    private RecyclerView.d0 i(RecyclerView recyclerView, int i, long j) {
        if (e(recyclerView, i)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.d0 d0VarI = vVar.I(i, false, j);
            if (d0VarI != null) {
                if (!d0VarI.s() || d0VarI.t()) {
                    vVar.a(d0VarI, false);
                } else {
                    vVar.B(d0VarI.a);
                }
            }
            return d0VarI;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f647b.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f648c == 0) {
            this.f648c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.e(i, i2);
    }

    void g(long j) {
        b();
        d(j);
    }

    public void j(RecyclerView recyclerView) {
        this.f647b.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            b.g.h.a.a("RV Prefetch");
            if (!this.f647b.isEmpty()) {
                int size = this.f647b.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f647b.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f649d);
                }
            }
        } finally {
            this.f648c = 0L;
            b.g.h.a.b();
        }
    }
}

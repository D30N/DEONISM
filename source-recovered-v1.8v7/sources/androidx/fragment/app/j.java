package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
final class j extends androidx.fragment.app.i implements LayoutInflater.Factory2 {
    static boolean I = false;
    static final Interpolator J = new DecelerateInterpolator(2.5f);
    static final Interpolator K = new DecelerateInterpolator(1.5f);
    ArrayList<androidx.fragment.app.a> A;
    ArrayList<Boolean> B;
    ArrayList<Fragment> C;
    ArrayList<m> F;
    private androidx.fragment.app.l G;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<k> f448d;
    boolean e;
    ArrayList<androidx.fragment.app.a> i;
    ArrayList<Fragment> j;
    private OnBackPressedDispatcher k;
    ArrayList<androidx.fragment.app.a> m;
    ArrayList<Integer> n;
    ArrayList<i.b> o;
    androidx.fragment.app.h r;
    androidx.fragment.app.e s;
    Fragment t;
    Fragment u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;
    int f = 0;
    final ArrayList<Fragment> g = new ArrayList<>();
    final HashMap<String, Fragment> h = new HashMap<>();
    private final androidx.activity.b l = new a(false);
    private final CopyOnWriteArrayList<i> p = new CopyOnWriteArrayList<>();
    int q = 0;
    Bundle D = null;
    SparseArray<Parcelable> E = null;
    Runnable H = new b();

    class a extends androidx.activity.b {
        a(boolean z) {
            super(z);
        }

        @Override // androidx.activity.b
        public void b() {
            j.this.A0();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.j0();
        }
    }

    class c implements Animation.AnimationListener {
        final /* synthetic */ ViewGroup a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f451b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() throws Resources.NotFoundException {
                if (c.this.f451b.l() != null) {
                    c.this.f451b.d1(null);
                    c cVar = c.this;
                    j jVar = j.this;
                    Fragment fragment = cVar.f451b;
                    jVar.Q0(fragment, fragment.H(), 0, 0, false);
                }
            }
        }

        c(ViewGroup viewGroup, Fragment fragment) {
            this.a = viewGroup;
            this.f451b = fragment;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class d extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f454b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f455c;

        d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.a = viewGroup;
            this.f454b = view;
            this.f455c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
            this.a.endViewTransition(this.f454b);
            Animator animatorM = this.f455c.m();
            this.f455c.e1(null);
            if (animatorM == null || this.a.indexOfChild(this.f454b) >= 0) {
                return;
            }
            j jVar = j.this;
            Fragment fragment = this.f455c;
            jVar.Q0(fragment, fragment.H(), 0, 0, false);
        }
    }

    class e extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f457b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f458c;

        e(j jVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.a = viewGroup;
            this.f457b = view;
            this.f458c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.f457b);
            animator.removeListener(this);
            Fragment fragment = this.f458c;
            View view = fragment.H;
            if (view == null || !fragment.z) {
                return;
            }
            view.setVisibility(8);
        }
    }

    class f extends androidx.fragment.app.g {
        f() {
        }

        @Override // androidx.fragment.app.g
        public Fragment a(ClassLoader classLoader, String str) {
            androidx.fragment.app.h hVar = j.this.r;
            return hVar.d(hVar.i(), str, null);
        }
    }

    private static class g {
        public final Animation a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f460b;

        g(Animator animator) {
            this.a = null;
            this.f460b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        g(Animation animation) {
            this.a = animation;
            this.f460b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    private static class h extends AnimationSet implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final ViewGroup f461b;

        /* renamed from: c, reason: collision with root package name */
        private final View f462c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f463d;
        private boolean e;
        private boolean f;

        h(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f = true;
            this.f461b = viewGroup;
            this.f462c = view;
            addAnimation(animation);
            this.f461b.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f = true;
            if (this.f463d) {
                return !this.e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f463d = true;
                b.g.l.p.a(this.f461b, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f = true;
            if (this.f463d) {
                return !this.e;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f463d = true;
                b.g.l.p.a(this.f461b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f463d || !this.f) {
                this.f461b.endViewTransition(this.f462c);
                this.e = true;
            } else {
                this.f = false;
                this.f461b.post(this);
            }
        }
    }

    private static final class i {
        final i.a a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f464b;
    }

    /* renamed from: androidx.fragment.app.j$j, reason: collision with other inner class name */
    static class C0010j {
        public static final int[] a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    interface k {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class l implements k {
        final String a;

        /* renamed from: b, reason: collision with root package name */
        final int f465b;

        /* renamed from: c, reason: collision with root package name */
        final int f466c;

        l(String str, int i, int i2) {
            this.a = str;
            this.f465b = i;
            this.f466c = i2;
        }

        @Override // androidx.fragment.app.j.k
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = j.this.u;
            if (fragment == null || this.f465b >= 0 || this.a != null || !fragment.o().f()) {
                return j.this.U0(arrayList, arrayList2, this.a, this.f465b, this.f466c);
            }
            return false;
        }
    }

    static class m implements Fragment.e {
        final boolean a;

        /* renamed from: b, reason: collision with root package name */
        final androidx.fragment.app.a f468b;

        /* renamed from: c, reason: collision with root package name */
        private int f469c;

        m(androidx.fragment.app.a aVar, boolean z) {
            this.a = z;
            this.f468b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.e
        public void a() {
            int i = this.f469c - 1;
            this.f469c = i;
            if (i != 0) {
                return;
            }
            this.f468b.r.g1();
        }

        @Override // androidx.fragment.app.Fragment.e
        public void b() {
            this.f469c++;
        }

        public void c() throws Resources.NotFoundException {
            androidx.fragment.app.a aVar = this.f468b;
            aVar.r.t(aVar, this.a, false, false);
        }

        public void d() throws Resources.NotFoundException {
            boolean z = this.f469c > 0;
            j jVar = this.f468b.r;
            int size = jVar.g.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = jVar.g.get(i);
                fragment.j1(null);
                if (z && fragment.Q()) {
                    fragment.n1();
                }
            }
            androidx.fragment.app.a aVar = this.f468b;
            aVar.r.t(aVar, this.a, !z, true);
        }

        public boolean e() {
            return this.f469c == 0;
        }
    }

    j() {
    }

    private boolean D0(Fragment fragment) {
        return (fragment.D && fragment.E) || fragment.u.q();
    }

    static g J0(float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(K);
        alphaAnimation.setDuration(220L);
        return new g(alphaAnimation);
    }

    static g L0(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(J);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(K);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new g(animationSet);
    }

    private void M0(b.d.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragmentN = bVar.n(i2);
            if (!fragmentN.l) {
                View viewA1 = fragmentN.a1();
                fragmentN.O = viewA1.getAlpha();
                viewA1.setAlpha(0.0f);
            }
        }
    }

    private boolean T0(String str, int i2, int i3) throws Resources.NotFoundException {
        j0();
        h0(true);
        Fragment fragment = this.u;
        if (fragment != null && i2 < 0 && str == null && fragment.o().f()) {
            return true;
        }
        boolean zU0 = U0(this.A, this.B, str, i2, i3);
        if (zU0) {
            this.e = true;
            try {
                Y0(this.A, this.B);
            } finally {
                s();
            }
        }
        o1();
        e0();
        p();
        return zU0;
    }

    private void V(Fragment fragment) {
        if (fragment == null || this.h.get(fragment.f) != fragment) {
            return;
        }
        fragment.S0();
    }

    private int V0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, b.d.b<Fragment> bVar) throws Resources.NotFoundException {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            androidx.fragment.app.a aVar = arrayList.get(i5);
            boolean zBooleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.s() && !aVar.q(arrayList, i5 + 1, i3)) {
                if (this.F == null) {
                    this.F = new ArrayList<>();
                }
                m mVar = new m(aVar, zBooleanValue);
                this.F.add(mVar);
                aVar.u(mVar);
                if (zBooleanValue) {
                    aVar.l();
                } else {
                    aVar.m(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                h(bVar);
            }
        }
        return i4;
    }

    private void Y0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) throws Resources.NotFoundException {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m0(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).p) {
                if (i3 != i2) {
                    l0(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).p) {
                        i3++;
                    }
                }
                l0(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            l0(arrayList, arrayList2, i3, size);
        }
    }

    private void c0(int i2) {
        try {
            this.e = true;
            O0(i2, false);
            this.e = false;
            j0();
        } catch (Throwable th) {
            this.e = false;
            throw th;
        }
    }

    public static int c1(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void f0() throws Resources.NotFoundException {
        for (Fragment fragment : this.h.values()) {
            if (fragment != null) {
                if (fragment.l() != null) {
                    int iH = fragment.H();
                    View viewL = fragment.l();
                    Animation animation = viewL.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        viewL.clearAnimation();
                    }
                    fragment.d1(null);
                    Q0(fragment, iH, 0, 0, false);
                } else if (fragment.m() != null) {
                    fragment.m().end();
                }
            }
        }
    }

    private void h(b.d.b<Fragment> bVar) throws Resources.NotFoundException {
        int i2 = this.q;
        if (i2 < 1) {
            return;
        }
        int iMin = Math.min(i2, 3);
        int size = this.g.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.g.get(i3);
            if (fragment.f432b < iMin) {
                Q0(fragment, iMin, fragment.x(), fragment.y(), false);
                if (fragment.H != null && !fragment.z && fragment.M) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private void h0(boolean z) {
        if (this.e) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.r == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.r.j().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            r();
        }
        if (this.A == null) {
            this.A = new ArrayList<>();
            this.B = new ArrayList<>();
        }
        this.e = true;
        try {
            m0(null, null);
        } finally {
            this.e = false;
        }
    }

    private static void k0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            androidx.fragment.app.a aVar = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                aVar.h(-1);
                aVar.m(i2 == i3 + (-1));
            } else {
                aVar.h(1);
                aVar.l();
            }
            i2++;
        }
    }

    private void l0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) throws Resources.NotFoundException {
        int i4;
        int i5;
        int i6 = i2;
        boolean z = arrayList.get(i6).p;
        ArrayList<Fragment> arrayList3 = this.C;
        if (arrayList3 == null) {
            this.C = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.C.addAll(this.g);
        Fragment fragmentY0 = y0();
        boolean z2 = false;
        for (int i7 = i6; i7 < i3; i7++) {
            androidx.fragment.app.a aVar = arrayList.get(i7);
            fragmentY0 = !arrayList2.get(i7).booleanValue() ? aVar.n(this.C, fragmentY0) : aVar.v(this.C, fragmentY0);
            z2 = z2 || aVar.h;
        }
        this.C.clear();
        if (!z) {
            o.C(this, arrayList, arrayList2, i2, i3, false);
        }
        k0(arrayList, arrayList2, i2, i3);
        if (z) {
            b.d.b<Fragment> bVar = new b.d.b<>();
            h(bVar);
            int iV0 = V0(arrayList, arrayList2, i2, i3, bVar);
            M0(bVar);
            i4 = iV0;
        } else {
            i4 = i3;
        }
        if (i4 != i6 && z) {
            o.C(this, arrayList, arrayList2, i2, i4, true);
            O0(this.q, true);
        }
        while (i6 < i3) {
            androidx.fragment.app.a aVar2 = arrayList.get(i6);
            if (arrayList2.get(i6).booleanValue() && (i5 = aVar2.t) >= 0) {
                s0(i5);
                aVar2.t = -1;
            }
            aVar2.t();
            i6++;
        }
        if (z2) {
            a1();
        }
    }

    private void m(Fragment fragment, g gVar, int i2) {
        View view = fragment.H;
        ViewGroup viewGroup = fragment.G;
        viewGroup.startViewTransition(view);
        fragment.k1(i2);
        if (gVar.a != null) {
            h hVar = new h(gVar.a, viewGroup, view);
            fragment.d1(fragment.H);
            hVar.setAnimationListener(new c(viewGroup, fragment));
            fragment.H.startAnimation(hVar);
            return;
        }
        Animator animator = gVar.f460b;
        fragment.e1(animator);
        animator.addListener(new d(viewGroup, view, fragment));
        animator.setTarget(fragment.H);
        animator.start();
    }

    private void m0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) throws Resources.NotFoundException {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<m> arrayList3 = this.F;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            m mVar = this.F.get(i2);
            if (arrayList == null || mVar.a || (iIndexOf2 = arrayList.indexOf(mVar.f468b)) == -1 || !arrayList2.get(iIndexOf2).booleanValue()) {
                if (mVar.e() || (arrayList != null && mVar.f468b.q(arrayList, 0, arrayList.size()))) {
                    this.F.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || mVar.a || (iIndexOf = arrayList.indexOf(mVar.f468b)) == -1 || !arrayList2.get(iIndexOf).booleanValue()) {
                        mVar.d();
                    }
                }
                i2++;
            } else {
                this.F.remove(i2);
                i2--;
                size--;
            }
            mVar.c();
            i2++;
        }
    }

    private void m1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new b.g.k.b("FragmentManager"));
        androidx.fragment.app.h hVar = this.r;
        try {
            if (hVar != null) {
                hVar.l("  ", null, printWriter, new String[0]);
            } else {
                b("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public static int n1(int i2, boolean z) {
        if (i2 == 4097) {
            return z ? 1 : 2;
        }
        if (i2 == 4099) {
            return z ? 5 : 6;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    private void o1() {
        ArrayList<k> arrayList = this.f448d;
        if (arrayList == null || arrayList.isEmpty()) {
            this.l.f(u0() > 0 && E0(this.t));
        } else {
            this.l.f(true);
        }
    }

    private void p() {
        this.h.values().removeAll(Collections.singleton(null));
    }

    private Fragment q0(Fragment fragment) {
        ViewGroup viewGroup = fragment.G;
        View view = fragment.H;
        if (viewGroup != null && view != null) {
            for (int iIndexOf = this.g.indexOf(fragment) - 1; iIndexOf >= 0; iIndexOf--) {
                Fragment fragment2 = this.g.get(iIndexOf);
                if (fragment2.G == viewGroup && fragment2.H != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private void r() {
        if (G0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void r0() throws Resources.NotFoundException {
        if (this.F != null) {
            while (!this.F.isEmpty()) {
                this.F.remove(0).d();
            }
        }
    }

    private void s() {
        this.e = false;
        this.B.clear();
        this.A.clear();
    }

    private boolean t0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (this.f448d != null && this.f448d.size() != 0) {
                int size = this.f448d.size();
                boolean zA = false;
                for (int i2 = 0; i2 < size; i2++) {
                    zA |= this.f448d.get(i2).a(arrayList, arrayList2);
                }
                this.f448d.clear();
                this.r.j().removeCallbacks(this.H);
                return zA;
            }
            return false;
        }
    }

    public boolean A(Menu menu, MenuInflater menuInflater) {
        if (this.q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null && fragment.F0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.j != null) {
            for (int i3 = 0; i3 < this.j.size(); i3++) {
                Fragment fragment2 = this.j.get(i3);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.f0();
                }
            }
        }
        this.j = arrayList;
        return z;
    }

    void A0() {
        j0();
        if (this.l.c()) {
            f();
        } else {
            this.k.c();
        }
    }

    public void B() {
        this.y = true;
        j0();
        c0(0);
        this.r = null;
        this.s = null;
        this.t = null;
        if (this.k != null) {
            this.l.d();
            this.k = null;
        }
    }

    public void B0(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.z) {
            return;
        }
        fragment.z = true;
        fragment.N = true ^ fragment.N;
    }

    public void C() {
        c0(1);
    }

    public boolean C0() {
        return this.y;
    }

    public void D() {
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null) {
                fragment.L0();
            }
        }
    }

    public void E(boolean z) {
        int size = this.g.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Fragment fragment = this.g.get(size);
            if (fragment != null) {
                fragment.M0(z);
            }
        }
    }

    boolean E0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        j jVar = fragment.s;
        return fragment == jVar.y0() && E0(jVar.t);
    }

    void F(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarU = fragment2.u();
            if (iVarU instanceof j) {
                ((j) iVarU).F(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f464b) {
                next.a.a(this, fragment, bundle);
            }
        }
    }

    boolean F0(int i2) {
        return this.q >= i2;
    }

    void G(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarU = fragment2.u();
            if (iVarU instanceof j) {
                ((j) iVarU).G(fragment, context, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f464b) {
                next.a.b(this, fragment, context);
            }
        }
    }

    public boolean G0() {
        return this.w || this.x;
    }

    void H(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarU = fragment2.u();
            if (iVarU instanceof j) {
                ((j) iVarU).H(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f464b) {
                next.a.c(this, fragment, bundle);
            }
        }
    }

    g H0(Fragment fragment, int i2, boolean z, int i3) throws Resources.NotFoundException {
        int iN1;
        int iX = fragment.x();
        boolean z2 = false;
        fragment.h1(0);
        ViewGroup viewGroup = fragment.G;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation animationA0 = fragment.a0(i2, z, iX);
        if (animationA0 != null) {
            return new g(animationA0);
        }
        Animator animatorB0 = fragment.b0(i2, z, iX);
        if (animatorB0 != null) {
            return new g(animatorB0);
        }
        if (iX != 0) {
            boolean zEquals = "anim".equals(this.r.i().getResources().getResourceTypeName(iX));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.r.i(), iX);
                    if (animationLoadAnimation != null) {
                        return new g(animationLoadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this.r.i(), iX);
                    if (animatorLoadAnimator != null) {
                        return new g(animatorLoadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (zEquals) {
                        throw e3;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(this.r.i(), iX);
                    if (animationLoadAnimation2 != null) {
                        return new g(animationLoadAnimation2);
                    }
                }
            }
        }
        if (i2 == 0 || (iN1 = n1(i2, z)) < 0) {
            return null;
        }
        switch (iN1) {
            case 1:
                return L0(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return L0(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return L0(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return L0(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return J0(0.0f, 1.0f);
            case 6:
                return J0(1.0f, 0.0f);
            default:
                if (i3 == 0 && this.r.p()) {
                    this.r.o();
                }
                return null;
        }
    }

    void I(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarU = fragment2.u();
            if (iVarU instanceof j) {
                ((j) iVarU).I(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f464b) {
                next.a.d(this, fragment);
            }
        }
    }

    void I0(Fragment fragment) {
        if (this.h.get(fragment.f) != null) {
            return;
        }
        this.h.put(fragment.f, fragment);
        if (fragment.C) {
            if (fragment.B) {
                k(fragment);
            } else {
                Z0(fragment);
            }
            fragment.C = false;
        }
        if (I) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    void J(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarU = fragment2.u();
            if (iVarU instanceof j) {
                ((j) iVarU).J(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f464b) {
                next.a.e(this, fragment);
            }
        }
    }

    void K(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarU = fragment2.u();
            if (iVarU instanceof j) {
                ((j) iVarU).K(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f464b) {
                next.a.f(this, fragment);
            }
        }
    }

    void K0(Fragment fragment) {
        if (this.h.get(fragment.f) == null) {
            return;
        }
        if (I) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
        for (Fragment fragment2 : this.h.values()) {
            if (fragment2 != null && fragment.f.equals(fragment2.i)) {
                fragment2.h = fragment;
                fragment2.i = null;
            }
        }
        this.h.put(fragment.f, null);
        Z0(fragment);
        String str = fragment.i;
        if (str != null) {
            fragment.h = this.h.get(str);
        }
        fragment.M();
    }

    void L(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarU = fragment2.u();
            if (iVarU instanceof j) {
                ((j) iVarU).L(fragment, context, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f464b) {
                next.a.g(this, fragment, context);
            }
        }
    }

    void M(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarU = fragment2.u();
            if (iVarU instanceof j) {
                ((j) iVarU).M(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f464b) {
                next.a.h(this, fragment, bundle);
            }
        }
    }

    void N(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarU = fragment2.u();
            if (iVarU instanceof j) {
                ((j) iVarU).N(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f464b) {
                next.a.i(this, fragment);
            }
        }
    }

    void N0(Fragment fragment) throws Resources.NotFoundException {
        if (fragment == null) {
            return;
        }
        if (!this.h.containsKey(fragment.f)) {
            if (I) {
                Log.v("FragmentManager", "Ignoring moving " + fragment + " to state " + this.q + "since it is not added to " + this);
                return;
            }
            return;
        }
        int iMin = this.q;
        if (fragment.m) {
            iMin = fragment.P() ? Math.min(iMin, 1) : Math.min(iMin, 0);
        }
        Q0(fragment, iMin, fragment.y(), fragment.z(), false);
        if (fragment.H != null) {
            Fragment fragmentQ0 = q0(fragment);
            if (fragmentQ0 != null) {
                View view = fragmentQ0.H;
                ViewGroup viewGroup = fragment.G;
                int iIndexOfChild = viewGroup.indexOfChild(view);
                int iIndexOfChild2 = viewGroup.indexOfChild(fragment.H);
                if (iIndexOfChild2 < iIndexOfChild) {
                    viewGroup.removeViewAt(iIndexOfChild2);
                    viewGroup.addView(fragment.H, iIndexOfChild);
                }
            }
            if (fragment.M && fragment.G != null) {
                float f2 = fragment.O;
                if (f2 > 0.0f) {
                    fragment.H.setAlpha(f2);
                }
                fragment.O = 0.0f;
                fragment.M = false;
                g gVarH0 = H0(fragment, fragment.y(), true, fragment.z());
                if (gVarH0 != null) {
                    Animation animation = gVarH0.a;
                    if (animation != null) {
                        fragment.H.startAnimation(animation);
                    } else {
                        gVarH0.f460b.setTarget(fragment.H);
                        gVarH0.f460b.start();
                    }
                }
            }
        }
        if (fragment.N) {
            u(fragment);
        }
    }

    void O(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarU = fragment2.u();
            if (iVarU instanceof j) {
                ((j) iVarU).O(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f464b) {
                next.a.j(this, fragment, bundle);
            }
        }
    }

    void O0(int i2, boolean z) throws Resources.NotFoundException {
        androidx.fragment.app.h hVar;
        if (this.r == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.q) {
            this.q = i2;
            int size = this.g.size();
            for (int i3 = 0; i3 < size; i3++) {
                N0(this.g.get(i3));
            }
            for (Fragment fragment : this.h.values()) {
                if (fragment != null && (fragment.m || fragment.A)) {
                    if (!fragment.M) {
                        N0(fragment);
                    }
                }
            }
            l1();
            if (this.v && (hVar = this.r) != null && this.q == 4) {
                hVar.s();
                this.v = false;
            }
        }
    }

    void P(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarU = fragment2.u();
            if (iVarU instanceof j) {
                ((j) iVarU).P(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f464b) {
                next.a.k(this, fragment);
            }
        }
    }

    void P0(Fragment fragment) throws Resources.NotFoundException {
        Q0(fragment, this.q, 0, 0, false);
    }

    void Q(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarU = fragment2.u();
            if (iVarU instanceof j) {
                ((j) iVarU).Q(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f464b) {
                next.a.l(this, fragment);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void Q0(androidx.fragment.app.Fragment r19, int r20, int r21, int r22, boolean r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.Q0(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    void R(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarU = fragment2.u();
            if (iVarU instanceof j) {
                ((j) iVarU).R(fragment, view, bundle, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f464b) {
                next.a.m(this, fragment, view, bundle);
            }
        }
    }

    public void R0() {
        this.w = false;
        this.x = false;
        int size = this.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null) {
                fragment.S();
            }
        }
    }

    void S(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarU = fragment2.u();
            if (iVarU instanceof j) {
                ((j) iVarU).S(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f464b) {
                next.a.n(this, fragment);
            }
        }
    }

    public void S0(Fragment fragment) throws Resources.NotFoundException {
        if (fragment.J) {
            if (this.e) {
                this.z = true;
            } else {
                fragment.J = false;
                Q0(fragment, this.q, 0, 0, false);
            }
        }
    }

    public boolean T(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null && fragment.N0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void U(Menu menu) {
        if (this.q < 1) {
            return;
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null) {
                fragment.O0(menu);
            }
        }
    }

    boolean U0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.i;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.i.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = this.i.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.i.get(size2);
                    if ((str != null && str.equals(aVar.o())) || (i2 >= 0 && i2 == aVar.t)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.i.get(size2);
                        if (str == null || !str.equals(aVar2.o())) {
                            if (i2 < 0 || i2 != aVar2.t) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.i.size() - 1) {
                return false;
            }
            for (int size3 = this.i.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.i.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void W() {
        c0(3);
    }

    public void W0(Bundle bundle, String str, Fragment fragment) {
        if (fragment.s == this) {
            bundle.putString(str, fragment.f);
            return;
        }
        m1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    public void X(boolean z) {
        int size = this.g.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Fragment fragment = this.g.get(size);
            if (fragment != null) {
                fragment.Q0(z);
            }
        }
    }

    public void X0(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.r);
        }
        boolean z = !fragment.P();
        if (!fragment.A || z) {
            synchronized (this.g) {
                this.g.remove(fragment);
            }
            if (D0(fragment)) {
                this.v = true;
            }
            fragment.l = false;
            fragment.m = true;
        }
    }

    public boolean Y(Menu menu) {
        if (this.q < 1) {
            return false;
        }
        boolean z = false;
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null && fragment.R0(menu)) {
                z = true;
            }
        }
        return z;
    }

    void Z() {
        o1();
        V(this.u);
    }

    void Z0(Fragment fragment) {
        if (G0()) {
            if (I) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.G.k(fragment) && I) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    @Override // androidx.fragment.app.i
    public n a() {
        return new androidx.fragment.app.a(this);
    }

    public void a0() {
        this.w = false;
        this.x = false;
        c0(4);
    }

    void a1() {
        if (this.o != null) {
            for (int i2 = 0; i2 < this.o.size(); i2++) {
                this.o.get(i2).a();
            }
        }
    }

    @Override // androidx.fragment.app.i
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2 = str + "    ";
        if (!this.h.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.h.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.e(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.g.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size5; i2++) {
                Fragment fragment2 = this.g.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.j;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                Fragment fragment3 = this.j.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.i;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                androidx.fragment.app.a aVar = this.i.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.j(str2, printWriter);
            }
        }
        synchronized (this) {
            if (this.m != null && (size2 = this.m.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    Object obj = (androidx.fragment.app.a) this.m.get(i5);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            if (this.n != null && this.n.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.n.toArray()));
            }
        }
        ArrayList<k> arrayList3 = this.f448d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                Object obj2 = (k) this.f448d.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.s);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.w);
        printWriter.print(" mStopped=");
        printWriter.print(this.x);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.y);
        if (this.v) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.v);
        }
    }

    public void b0() {
        this.w = false;
        this.x = false;
        c0(3);
    }

    void b1(Parcelable parcelable) {
        androidx.fragment.app.m next;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.k kVar = (androidx.fragment.app.k) parcelable;
        if (kVar.f470b == null) {
            return;
        }
        for (Fragment fragment : this.G.h()) {
            if (I) {
                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
            }
            Iterator<androidx.fragment.app.m> it = kVar.f470b.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (next.f477c.equals(fragment.f)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next == null) {
                if (I) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + kVar.f470b);
                }
                Q0(fragment, 1, 0, 0, false);
                fragment.m = true;
                Q0(fragment, 0, 0, 0, false);
            } else {
                next.o = fragment;
                fragment.f434d = null;
                fragment.r = 0;
                fragment.o = false;
                fragment.l = false;
                Fragment fragment2 = fragment.h;
                fragment.i = fragment2 != null ? fragment2.f : null;
                fragment.h = null;
                Bundle bundle = next.n;
                if (bundle != null) {
                    bundle.setClassLoader(this.r.i().getClassLoader());
                    fragment.f434d = next.n.getSparseParcelableArray("android:view_state");
                    fragment.f433c = next.n;
                }
            }
        }
        this.h.clear();
        Iterator<androidx.fragment.app.m> it2 = kVar.f470b.iterator();
        while (it2.hasNext()) {
            androidx.fragment.app.m next2 = it2.next();
            if (next2 != null) {
                Fragment fragmentA = next2.a(this.r.i().getClassLoader(), c());
                fragmentA.s = this;
                if (I) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentA.f + "): " + fragmentA);
                }
                this.h.put(fragmentA.f, fragmentA);
                next2.o = null;
            }
        }
        this.g.clear();
        ArrayList<String> arrayList = kVar.f471c;
        if (arrayList != null) {
            Iterator<String> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String next3 = it3.next();
                Fragment fragment3 = this.h.get(next3);
                if (fragment3 == null) {
                    m1(new IllegalStateException("No instantiated fragment for (" + next3 + ")"));
                    throw null;
                }
                fragment3.l = true;
                if (I) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + next3 + "): " + fragment3);
                }
                if (this.g.contains(fragment3)) {
                    throw new IllegalStateException("Already added " + fragment3);
                }
                synchronized (this.g) {
                    this.g.add(fragment3);
                }
            }
        }
        if (kVar.f472d != null) {
            this.i = new ArrayList<>(kVar.f472d.length);
            int i2 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = kVar.f472d;
                if (i2 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarA = bVarArr[i2].a(this);
                if (I) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + aVarA.t + "): " + aVarA);
                    PrintWriter printWriter = new PrintWriter(new b.g.k.b("FragmentManager"));
                    aVarA.k("  ", printWriter, false);
                    printWriter.close();
                }
                this.i.add(aVarA);
                int i3 = aVarA.t;
                if (i3 >= 0) {
                    h1(i3, aVarA);
                }
                i2++;
            }
        } else {
            this.i = null;
        }
        String str = kVar.e;
        if (str != null) {
            Fragment fragment4 = this.h.get(str);
            this.u = fragment4;
            V(fragment4);
        }
        this.f = kVar.f;
    }

    @Override // androidx.fragment.app.i
    public androidx.fragment.app.g c() {
        if (super.c() == androidx.fragment.app.i.f446c) {
            Fragment fragment = this.t;
            if (fragment != null) {
                return fragment.s.c();
            }
            g(new f());
        }
        return super.c();
    }

    @Override // androidx.fragment.app.i
    public List<Fragment> d() {
        List<Fragment> list;
        if (this.g.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.g) {
            list = (List) this.g.clone();
        }
        return list;
    }

    public void d0() {
        this.x = true;
        c0(2);
    }

    Parcelable d1() {
        ArrayList<String> arrayList;
        int size;
        r0();
        f0();
        j0();
        this.w = true;
        androidx.fragment.app.b[] bVarArr = null;
        if (this.h.isEmpty()) {
            return null;
        }
        ArrayList<androidx.fragment.app.m> arrayList2 = new ArrayList<>(this.h.size());
        boolean z = false;
        for (Fragment fragment : this.h.values()) {
            if (fragment != null) {
                if (fragment.s != this) {
                    m1(new IllegalStateException("Failure saving state: active " + fragment + " was removed from the FragmentManager"));
                    throw null;
                }
                androidx.fragment.app.m mVar = new androidx.fragment.app.m(fragment);
                arrayList2.add(mVar);
                if (fragment.f432b <= 0 || mVar.n != null) {
                    mVar.n = fragment.f433c;
                } else {
                    mVar.n = e1(fragment);
                    String str = fragment.i;
                    if (str != null) {
                        Fragment fragment2 = this.h.get(str);
                        if (fragment2 == null) {
                            m1(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.i));
                            throw null;
                        }
                        if (mVar.n == null) {
                            mVar.n = new Bundle();
                        }
                        W0(mVar.n, "android:target_state", fragment2);
                        int i2 = fragment.j;
                        if (i2 != 0) {
                            mVar.n.putInt("android:target_req_state", i2);
                        }
                    }
                }
                if (I) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + mVar.n);
                }
                z = true;
            }
        }
        if (!z) {
            if (I) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.g.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it = this.g.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f);
                if (next.s != this) {
                    m1(new IllegalStateException("Failure saving state: active " + next + " was removed from the FragmentManager"));
                    throw null;
                }
                if (I) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f + "): " + next);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.i;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i3 = 0; i3 < size; i3++) {
                bVarArr[i3] = new androidx.fragment.app.b(this.i.get(i3));
                if (I) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.i.get(i3));
                }
            }
        }
        androidx.fragment.app.k kVar = new androidx.fragment.app.k();
        kVar.f470b = arrayList2;
        kVar.f471c = arrayList;
        kVar.f472d = bVarArr;
        Fragment fragment3 = this.u;
        if (fragment3 != null) {
            kVar.e = fragment3.f;
        }
        kVar.f = this.f;
        return kVar;
    }

    @Override // androidx.fragment.app.i
    public void e(int i2, int i3) {
        if (i2 >= 0) {
            g0(new l(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    void e0() throws Resources.NotFoundException {
        if (this.z) {
            this.z = false;
            l1();
        }
    }

    Bundle e1(Fragment fragment) {
        if (this.D == null) {
            this.D = new Bundle();
        }
        fragment.U0(this.D);
        O(fragment, this.D, false);
        Bundle bundle = null;
        if (!this.D.isEmpty()) {
            Bundle bundle2 = this.D;
            this.D = null;
            bundle = bundle2;
        }
        if (fragment.H != null) {
            f1(fragment);
        }
        if (fragment.f434d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f434d);
        }
        if (!fragment.K) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.K);
        }
        return bundle;
    }

    @Override // androidx.fragment.app.i
    public boolean f() {
        r();
        return T0(null, -1, 0);
    }

    void f1(Fragment fragment) {
        if (fragment.I == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.E;
        if (sparseArray == null) {
            this.E = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        fragment.I.saveHierarchyState(this.E);
        if (this.E.size() > 0) {
            fragment.f434d = this.E;
            this.E = null;
        }
    }

    public void g0(k kVar, boolean z) {
        if (!z) {
            r();
        }
        synchronized (this) {
            if (!this.y && this.r != null) {
                if (this.f448d == null) {
                    this.f448d = new ArrayList<>();
                }
                this.f448d.add(kVar);
                g1();
                return;
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    void g1() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = (this.F == null || this.F.isEmpty()) ? false : true;
            if (this.f448d != null && this.f448d.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.r.j().removeCallbacks(this.H);
                this.r.j().post(this.H);
                o1();
            }
        }
    }

    public void h1(int i2, androidx.fragment.app.a aVar) {
        synchronized (this) {
            if (this.m == null) {
                this.m = new ArrayList<>();
            }
            int size = this.m.size();
            if (i2 < size) {
                if (I) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + aVar);
                }
                this.m.set(i2, aVar);
            } else {
                while (size < i2) {
                    this.m.add(null);
                    if (this.n == null) {
                        this.n = new ArrayList<>();
                    }
                    if (I) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.n.add(Integer.valueOf(size));
                    size++;
                }
                if (I) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + aVar);
                }
                this.m.add(aVar);
            }
        }
    }

    void i(androidx.fragment.app.a aVar) {
        if (this.i == null) {
            this.i = new ArrayList<>();
        }
        this.i.add(aVar);
    }

    void i0(Fragment fragment) {
        if (!fragment.n || fragment.q) {
            return;
        }
        fragment.G0(fragment.K0(fragment.f433c), null, fragment.f433c);
        View view = fragment.H;
        if (view == null) {
            fragment.I = null;
            return;
        }
        fragment.I = view;
        view.setSaveFromParentEnabled(false);
        if (fragment.z) {
            fragment.H.setVisibility(8);
        }
        fragment.y0(fragment.H, fragment.f433c);
        R(fragment, fragment.H, fragment.f433c, false);
    }

    public void i1(Fragment fragment, d.b bVar) {
        if (this.h.get(fragment.f) == fragment && (fragment.t == null || fragment.u() == this)) {
            fragment.R = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void j(Fragment fragment, boolean z) throws Resources.NotFoundException {
        if (I) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        I0(fragment);
        if (fragment.A) {
            return;
        }
        if (this.g.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.g) {
            this.g.add(fragment);
        }
        fragment.l = true;
        fragment.m = false;
        if (fragment.H == null) {
            fragment.N = false;
        }
        if (D0(fragment)) {
            this.v = true;
        }
        if (z) {
            P0(fragment);
        }
    }

    public boolean j0() {
        h0(true);
        boolean z = false;
        while (t0(this.A, this.B)) {
            this.e = true;
            try {
                Y0(this.A, this.B);
                s();
                z = true;
            } catch (Throwable th) {
                s();
                throw th;
            }
        }
        o1();
        e0();
        p();
        return z;
    }

    public void j1(Fragment fragment) {
        if (fragment == null || (this.h.get(fragment.f) == fragment && (fragment.t == null || fragment.u() == this))) {
            Fragment fragment2 = this.u;
            this.u = fragment;
            V(fragment2);
            V(this.u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void k(Fragment fragment) {
        if (G0()) {
            if (I) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.G.d(fragment) && I) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public void k1(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.z) {
            fragment.z = false;
            fragment.N = !fragment.N;
        }
    }

    public int l(androidx.fragment.app.a aVar) {
        synchronized (this) {
            if (this.n != null && this.n.size() > 0) {
                int iIntValue = this.n.remove(this.n.size() - 1).intValue();
                if (I) {
                    Log.v("FragmentManager", "Adding back stack index " + iIntValue + " with " + aVar);
                }
                this.m.set(iIntValue, aVar);
                return iIntValue;
            }
            if (this.m == null) {
                this.m = new ArrayList<>();
            }
            int size = this.m.size();
            if (I) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + aVar);
            }
            this.m.add(aVar);
            return size;
        }
    }

    void l1() throws Resources.NotFoundException {
        for (Fragment fragment : this.h.values()) {
            if (fragment != null) {
                S0(fragment);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void n(androidx.fragment.app.h hVar, androidx.fragment.app.e eVar, Fragment fragment) {
        if (this.r != null) {
            throw new IllegalStateException("Already attached");
        }
        this.r = hVar;
        this.s = eVar;
        this.t = fragment;
        if (fragment != null) {
            o1();
        }
        if (hVar instanceof androidx.activity.c) {
            androidx.activity.c cVar = (androidx.activity.c) hVar;
            this.k = cVar.b();
            Fragment fragment2 = cVar;
            if (fragment != null) {
                fragment2 = fragment;
            }
            this.k.a(fragment2, this.l);
        }
        this.G = fragment != null ? fragment.s.v0(fragment) : hVar instanceof androidx.lifecycle.s ? androidx.fragment.app.l.g(((androidx.lifecycle.s) hVar).g()) : new androidx.fragment.app.l(false);
    }

    public Fragment n0(int i2) {
        for (int size = this.g.size() - 1; size >= 0; size--) {
            Fragment fragment = this.g.get(size);
            if (fragment != null && fragment.w == i2) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.h.values()) {
            if (fragment2 != null && fragment2.w == i2) {
                return fragment2;
            }
        }
        return null;
    }

    public void o(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.A) {
            fragment.A = false;
            if (fragment.l) {
                return;
            }
            if (this.g.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            if (I) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            synchronized (this.g) {
                this.g.add(fragment);
            }
            fragment.l = true;
            if (D0(fragment)) {
                this.v = true;
            }
        }
    }

    public Fragment o0(String str) {
        if (str != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                Fragment fragment = this.g.get(size);
                if (fragment != null && str.equals(fragment.y)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (Fragment fragment2 : this.h.values()) {
            if (fragment2 != null && str.equals(fragment2.y)) {
                return fragment2;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0010j.a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (str2 == null || !androidx.fragment.app.g.b(context.getClassLoader(), str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        Fragment fragmentN0 = resourceId != -1 ? n0(resourceId) : null;
        if (fragmentN0 == null && string != null) {
            fragmentN0 = o0(string);
        }
        if (fragmentN0 == null && id != -1) {
            fragmentN0 = n0(id);
        }
        if (I) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + fragmentN0);
        }
        if (fragmentN0 == null) {
            fragmentN0 = c().a(context.getClassLoader(), str2);
            fragmentN0.n = true;
            fragmentN0.w = resourceId != 0 ? resourceId : id;
            fragmentN0.x = id;
            fragmentN0.y = string;
            fragmentN0.o = true;
            fragmentN0.s = this;
            androidx.fragment.app.h hVar = this.r;
            fragmentN0.t = hVar;
            fragmentN0.l0(hVar.i(), attributeSet, fragmentN0.f433c);
            j(fragmentN0, true);
        } else {
            if (fragmentN0.o) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
            }
            fragmentN0.o = true;
            androidx.fragment.app.h hVar2 = this.r;
            fragmentN0.t = hVar2;
            fragmentN0.l0(hVar2.i(), attributeSet, fragmentN0.f433c);
        }
        Fragment fragment = fragmentN0;
        if (this.q >= 1 || !fragment.n) {
            P0(fragment);
        } else {
            Q0(fragment, 1, 0, 0, false);
        }
        View view2 = fragment.H;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.H.getTag() == null) {
                fragment.H.setTag(string);
            }
            return fragment.H;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public Fragment p0(String str) {
        Fragment fragmentH;
        for (Fragment fragment : this.h.values()) {
            if (fragment != null && (fragmentH = fragment.h(str)) != null) {
                return fragmentH;
            }
        }
        return null;
    }

    boolean q() {
        boolean zD0 = false;
        for (Fragment fragment : this.h.values()) {
            if (fragment != null) {
                zD0 = D0(fragment);
            }
            if (zD0) {
                return true;
            }
        }
        return false;
    }

    public void s0(int i2) {
        synchronized (this) {
            this.m.set(i2, null);
            if (this.n == null) {
                this.n = new ArrayList<>();
            }
            if (I) {
                Log.v("FragmentManager", "Freeing back stack index " + i2);
            }
            this.n.add(Integer.valueOf(i2));
        }
    }

    void t(androidx.fragment.app.a aVar, boolean z, boolean z2, boolean z3) throws Resources.NotFoundException {
        if (z) {
            aVar.m(z3);
        } else {
            aVar.l();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            o.C(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            O0(this.q, true);
        }
        for (Fragment fragment : this.h.values()) {
            if (fragment != null && fragment.H != null && fragment.M && aVar.p(fragment.x)) {
                float f2 = fragment.O;
                if (f2 > 0.0f) {
                    fragment.H.setAlpha(f2);
                }
                if (z3) {
                    fragment.O = 0.0f;
                } else {
                    fragment.O = -1.0f;
                    fragment.M = false;
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.t;
        if (obj == null) {
            obj = this.r;
        }
        b.g.k.a.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    void u(Fragment fragment) throws Resources.NotFoundException {
        Animator animator;
        if (fragment.H != null) {
            g gVarH0 = H0(fragment, fragment.y(), !fragment.z, fragment.z());
            if (gVarH0 == null || (animator = gVarH0.f460b) == null) {
                if (gVarH0 != null) {
                    fragment.H.startAnimation(gVarH0.a);
                    gVarH0.a.start();
                }
                fragment.H.setVisibility((!fragment.z || fragment.O()) ? 0 : 8);
                if (fragment.O()) {
                    fragment.g1(false);
                }
            } else {
                animator.setTarget(fragment.H);
                if (!fragment.z) {
                    fragment.H.setVisibility(0);
                } else if (fragment.O()) {
                    fragment.g1(false);
                } else {
                    ViewGroup viewGroup = fragment.G;
                    View view = fragment.H;
                    viewGroup.startViewTransition(view);
                    gVarH0.f460b.addListener(new e(this, viewGroup, view, fragment));
                }
                gVarH0.f460b.start();
            }
        }
        if (fragment.l && D0(fragment)) {
            this.v = true;
        }
        fragment.N = false;
        fragment.j0(fragment.z);
    }

    public int u0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.i;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void v(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.A) {
            return;
        }
        fragment.A = true;
        if (fragment.l) {
            if (I) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            synchronized (this.g) {
                this.g.remove(fragment);
            }
            if (D0(fragment)) {
                this.v = true;
            }
            fragment.l = false;
        }
    }

    androidx.fragment.app.l v0(Fragment fragment) {
        return this.G.f(fragment);
    }

    public void w() {
        this.w = false;
        this.x = false;
        c0(2);
    }

    public Fragment w0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = this.h.get(string);
        if (fragment != null) {
            return fragment;
        }
        m1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        throw null;
    }

    public void x(Configuration configuration) {
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null) {
                fragment.C0(configuration);
            }
        }
    }

    LayoutInflater.Factory2 x0() {
        return this;
    }

    public boolean y(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null && fragment.D0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public Fragment y0() {
        return this.u;
    }

    public void z() {
        this.w = false;
        this.x = false;
        c0(1);
    }

    androidx.lifecycle.r z0(Fragment fragment) {
        return this.G.i(fragment);
    }
}

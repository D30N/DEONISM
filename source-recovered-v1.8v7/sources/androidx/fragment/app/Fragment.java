package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.d;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.g, androidx.lifecycle.s, androidx.savedstate.b {
    static final Object X = new Object();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    private boolean F;
    ViewGroup G;
    View H;
    View I;
    boolean J;
    c L;
    boolean M;
    boolean N;
    float O;
    LayoutInflater P;
    boolean Q;
    androidx.lifecycle.h S;
    r T;
    androidx.savedstate.a V;
    private int W;

    /* renamed from: c, reason: collision with root package name */
    Bundle f433c;

    /* renamed from: d, reason: collision with root package name */
    SparseArray<Parcelable> f434d;
    Boolean e;
    Bundle g;
    Fragment h;
    int j;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    int r;
    j s;
    h t;
    Fragment v;
    int w;
    int x;
    String y;
    boolean z;

    /* renamed from: b, reason: collision with root package name */
    int f432b = 0;
    String f = UUID.randomUUID().toString();
    String i = null;
    private Boolean k = null;
    j u = new j();
    boolean E = true;
    boolean K = true;
    d.b R = d.b.RESUMED;
    androidx.lifecycle.l<androidx.lifecycle.g> U = new androidx.lifecycle.l<>();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.d();
        }
    }

    class b extends androidx.fragment.app.e {
        b() {
        }

        @Override // androidx.fragment.app.e
        public View e(int i) {
            View view = Fragment.this.H;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        @Override // androidx.fragment.app.e
        public boolean f() {
            return Fragment.this.H != null;
        }
    }

    static class c {
        View a;

        /* renamed from: b, reason: collision with root package name */
        Animator f436b;

        /* renamed from: c, reason: collision with root package name */
        int f437c;

        /* renamed from: d, reason: collision with root package name */
        int f438d;
        int e;
        int f;
        Object g = null;
        Object h;
        Object i;
        Object j;
        Object k;
        Object l;
        Boolean m;
        Boolean n;
        androidx.core.app.k o;
        androidx.core.app.k p;
        boolean q;
        e r;
        boolean s;

        c() {
            Object obj = Fragment.X;
            this.h = obj;
            this.i = null;
            this.j = obj;
            this.k = null;
            this.l = obj;
            this.o = null;
            this.p = null;
        }
    }

    public static class d extends RuntimeException {
        public d(String str, Exception exc) {
            super(str, exc);
        }
    }

    interface e {
        void a();

        void b();
    }

    public Fragment() {
        L();
    }

    private void L() {
        this.S = new androidx.lifecycle.h(this);
        this.V = androidx.savedstate.a.a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.S.a(new androidx.lifecycle.e() { // from class: androidx.fragment.app.Fragment.2
                @Override // androidx.lifecycle.e
                public void d(androidx.lifecycle.g gVar, d.a aVar) {
                    View view;
                    if (aVar != d.a.ON_STOP || (view = Fragment.this.H) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
        }
    }

    @Deprecated
    public static Fragment N(Context context, String str, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Fragment fragmentNewInstance = g.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.f1(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e2) {
            throw new d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new d("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new d("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    private c f() {
        if (this.L == null) {
            this.L = new c();
        }
        return this.L;
    }

    public final Fragment A() {
        return this.v;
    }

    void A0(Bundle bundle) {
        this.u.R0();
        this.f432b = 2;
        this.F = false;
        T(bundle);
        if (this.F) {
            this.u.w();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public Object B() {
        c cVar = this.L;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.j;
        return obj == X ? s() : obj;
    }

    void B0() {
        this.u.n(this.t, new b(), this);
        this.F = false;
        W(this.t.i());
        if (this.F) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onAttach()");
    }

    public final Resources C() {
        return Y0().getResources();
    }

    void C0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.u.x(configuration);
    }

    public final boolean D() {
        return this.B;
    }

    boolean D0(MenuItem menuItem) {
        if (this.z) {
            return false;
        }
        return Y(menuItem) || this.u.y(menuItem);
    }

    public Object E() {
        c cVar = this.L;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.h;
        return obj == X ? q() : obj;
    }

    void E0(Bundle bundle) {
        this.u.R0();
        this.f432b = 1;
        this.F = false;
        this.V.c(bundle);
        Z(bundle);
        this.Q = true;
        if (this.F) {
            this.S.i(d.a.ON_CREATE);
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onCreate()");
    }

    public Object F() {
        c cVar = this.L;
        if (cVar == null) {
            return null;
        }
        return cVar.k;
    }

    boolean F0(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.z) {
            return false;
        }
        if (this.D && this.E) {
            z = true;
            c0(menu, menuInflater);
        }
        return z | this.u.A(menu, menuInflater);
    }

    public Object G() {
        c cVar = this.L;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.l;
        return obj == X ? F() : obj;
    }

    void G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.u.R0();
        this.q = true;
        this.T = new r();
        View viewD0 = d0(layoutInflater, viewGroup, bundle);
        this.H = viewD0;
        if (viewD0 != null) {
            this.T.e();
            this.U.h(this.T);
        } else {
            if (this.T.f()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.T = null;
        }
    }

    int H() {
        c cVar = this.L;
        if (cVar == null) {
            return 0;
        }
        return cVar.f437c;
    }

    void H0() {
        this.u.B();
        this.S.i(d.a.ON_DESTROY);
        this.f432b = 0;
        this.F = false;
        this.Q = false;
        e0();
        if (this.F) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public final String I(int i) {
        return C().getString(i);
    }

    void I0() {
        this.u.C();
        if (this.H != null) {
            this.T.d(d.a.ON_DESTROY);
        }
        this.f432b = 1;
        this.F = false;
        g0();
        if (this.F) {
            b.l.a.a.b(this).c();
            this.q = false;
        } else {
            throw new s("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public final Fragment J() {
        String str;
        Fragment fragment = this.h;
        if (fragment != null) {
            return fragment;
        }
        j jVar = this.s;
        if (jVar == null || (str = this.i) == null) {
            return null;
        }
        return jVar.h.get(str);
    }

    void J0() {
        this.F = false;
        h0();
        this.P = null;
        if (this.F) {
            if (this.u.C0()) {
                return;
            }
            this.u.B();
            this.u = new j();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDetach()");
    }

    public View K() {
        return this.H;
    }

    LayoutInflater K0(Bundle bundle) {
        LayoutInflater layoutInflaterI0 = i0(bundle);
        this.P = layoutInflaterI0;
        return layoutInflaterI0;
    }

    void L0() {
        onLowMemory();
        this.u.D();
    }

    void M() {
        L();
        this.f = UUID.randomUUID().toString();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.r = 0;
        this.s = null;
        this.u = new j();
        this.t = null;
        this.w = 0;
        this.x = 0;
        this.y = null;
        this.z = false;
        this.A = false;
    }

    void M0(boolean z) {
        m0(z);
        this.u.E(z);
    }

    boolean N0(MenuItem menuItem) {
        if (this.z) {
            return false;
        }
        return (this.D && this.E && n0(menuItem)) || this.u.T(menuItem);
    }

    boolean O() {
        c cVar = this.L;
        if (cVar == null) {
            return false;
        }
        return cVar.s;
    }

    void O0(Menu menu) {
        if (this.z) {
            return;
        }
        if (this.D && this.E) {
            o0(menu);
        }
        this.u.U(menu);
    }

    final boolean P() {
        return this.r > 0;
    }

    void P0() {
        this.u.W();
        if (this.H != null) {
            this.T.d(d.a.ON_PAUSE);
        }
        this.S.i(d.a.ON_PAUSE);
        this.f432b = 3;
        this.F = false;
        p0();
        if (this.F) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onPause()");
    }

    boolean Q() {
        c cVar = this.L;
        if (cVar == null) {
            return false;
        }
        return cVar.q;
    }

    void Q0(boolean z) {
        q0(z);
        this.u.X(z);
    }

    public final boolean R() {
        j jVar = this.s;
        if (jVar == null) {
            return false;
        }
        return jVar.G0();
    }

    boolean R0(Menu menu) {
        boolean z = false;
        if (this.z) {
            return false;
        }
        if (this.D && this.E) {
            z = true;
            r0(menu);
        }
        return z | this.u.Y(menu);
    }

    void S() {
        this.u.R0();
    }

    void S0() {
        boolean zE0 = this.s.E0(this);
        Boolean bool = this.k;
        if (bool == null || bool.booleanValue() != zE0) {
            this.k = Boolean.valueOf(zE0);
            s0(zE0);
            this.u.Z();
        }
    }

    public void T(Bundle bundle) {
        this.F = true;
    }

    void T0() {
        this.u.R0();
        this.u.j0();
        this.f432b = 4;
        this.F = false;
        u0();
        if (!this.F) {
            throw new s("Fragment " + this + " did not call through to super.onResume()");
        }
        this.S.i(d.a.ON_RESUME);
        if (this.H != null) {
            this.T.d(d.a.ON_RESUME);
        }
        this.u.a0();
        this.u.j0();
    }

    public void U(int i, int i2, Intent intent) {
    }

    void U0(Bundle bundle) {
        v0(bundle);
        this.V.d(bundle);
        Parcelable parcelableD1 = this.u.d1();
        if (parcelableD1 != null) {
            bundle.putParcelable("android:support:fragments", parcelableD1);
        }
    }

    @Deprecated
    public void V(Activity activity) {
        this.F = true;
    }

    void V0() {
        this.u.R0();
        this.u.j0();
        this.f432b = 3;
        this.F = false;
        w0();
        if (this.F) {
            this.S.i(d.a.ON_START);
            if (this.H != null) {
                this.T.d(d.a.ON_START);
            }
            this.u.b0();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onStart()");
    }

    public void W(Context context) {
        this.F = true;
        h hVar = this.t;
        Activity activityH = hVar == null ? null : hVar.h();
        if (activityH != null) {
            this.F = false;
            V(activityH);
        }
    }

    void W0() {
        this.u.d0();
        if (this.H != null) {
            this.T.d(d.a.ON_STOP);
        }
        this.S.i(d.a.ON_STOP);
        this.f432b = 2;
        this.F = false;
        x0();
        if (this.F) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onStop()");
    }

    public void X(Fragment fragment) {
    }

    public final androidx.fragment.app.d X0() {
        androidx.fragment.app.d dVarI = i();
        if (dVarI != null) {
            return dVarI;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public boolean Y(MenuItem menuItem) {
        return false;
    }

    public final Context Y0() {
        Context contextP = p();
        if (contextP != null) {
            return contextP;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void Z(Bundle bundle) {
        this.F = true;
        b1(bundle);
        if (this.u.F0(1)) {
            return;
        }
        this.u.z();
    }

    public final i Z0() {
        i iVarU = u();
        if (iVarU != null) {
            return iVarU;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // androidx.lifecycle.g
    public androidx.lifecycle.d a() {
        return this.S;
    }

    public Animation a0(int i, boolean z, int i2) {
        return null;
    }

    public final View a1() {
        View viewK = K();
        if (viewK != null) {
            return viewK;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public Animator b0(int i, boolean z, int i2) {
        return null;
    }

    void b1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.u.b1(parcelable);
        this.u.z();
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry c() {
        return this.V.b();
    }

    public void c0(Menu menu, MenuInflater menuInflater) {
    }

    final void c1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f434d;
        if (sparseArray != null) {
            this.I.restoreHierarchyState(sparseArray);
            this.f434d = null;
        }
        this.F = false;
        z0(bundle);
        if (this.F) {
            if (this.H != null) {
                this.T.d(d.a.ON_CREATE);
            }
        } else {
            throw new s("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    void d() {
        c cVar = this.L;
        e eVar = null;
        if (cVar != null) {
            cVar.q = false;
            e eVar2 = cVar.r;
            cVar.r = null;
            eVar = eVar2;
        }
        if (eVar != null) {
            eVar.a();
        }
    }

    public View d0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.W;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    void d1(View view) {
        f().a = view;
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.x));
        printWriter.print(" mTag=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f432b);
        printWriter.print(" mWho=");
        printWriter.print(this.f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.z);
        printWriter.print(" mDetached=");
        printWriter.print(this.A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.E);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.B);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.K);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.s);
        }
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.t);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.v);
        }
        if (this.g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.g);
        }
        if (this.f433c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f433c);
        }
        if (this.f434d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f434d);
        }
        Fragment fragmentJ = J();
        if (fragmentJ != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentJ);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.j);
        }
        if (x() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(x());
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.H);
        }
        if (l() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(l());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(H());
        }
        if (p() != null) {
            b.l.a.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.u + ":");
        this.u.b(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public void e0() {
        this.F = true;
    }

    void e1(Animator animator) {
        f().f436b = animator;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f0() {
    }

    public void f1(Bundle bundle) {
        if (this.s != null && R()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.g = bundle;
    }

    @Override // androidx.lifecycle.s
    public androidx.lifecycle.r g() {
        j jVar = this.s;
        if (jVar != null) {
            return jVar.z0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void g0() {
        this.F = true;
    }

    void g1(boolean z) {
        f().s = z;
    }

    Fragment h(String str) {
        return str.equals(this.f) ? this : this.u.p0(str);
    }

    public void h0() {
        this.F = true;
    }

    void h1(int i) {
        if (this.L == null && i == 0) {
            return;
        }
        f().f438d = i;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final androidx.fragment.app.d i() {
        h hVar = this.t;
        if (hVar == null) {
            return null;
        }
        return (androidx.fragment.app.d) hVar.h();
    }

    public LayoutInflater i0(Bundle bundle) {
        return w(bundle);
    }

    void i1(int i, int i2) {
        if (this.L == null && i == 0 && i2 == 0) {
            return;
        }
        f();
        c cVar = this.L;
        cVar.e = i;
        cVar.f = i2;
    }

    public boolean j() {
        Boolean bool;
        c cVar = this.L;
        if (cVar == null || (bool = cVar.n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void j0(boolean z) {
    }

    void j1(e eVar) {
        f();
        e eVar2 = this.L.r;
        if (eVar == eVar2) {
            return;
        }
        if (eVar != null && eVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        c cVar = this.L;
        if (cVar.q) {
            cVar.r = eVar;
        }
        if (eVar != null) {
            eVar.b();
        }
    }

    public boolean k() {
        Boolean bool;
        c cVar = this.L;
        if (cVar == null || (bool = cVar.m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Deprecated
    public void k0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
    }

    void k1(int i) {
        f().f437c = i;
    }

    View l() {
        c cVar = this.L;
        if (cVar == null) {
            return null;
        }
        return cVar.a;
    }

    public void l0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
        h hVar = this.t;
        Activity activityH = hVar == null ? null : hVar.h();
        if (activityH != null) {
            this.F = false;
            k0(activityH, attributeSet, bundle);
        }
    }

    public void l1(@SuppressLint({"UnknownNullness"}) Intent intent) {
        m1(intent, null);
    }

    Animator m() {
        c cVar = this.L;
        if (cVar == null) {
            return null;
        }
        return cVar.f436b;
    }

    public void m0(boolean z) {
    }

    public void m1(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        h hVar = this.t;
        if (hVar != null) {
            hVar.r(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final Bundle n() {
        return this.g;
    }

    public boolean n0(MenuItem menuItem) {
        return false;
    }

    public void n1() {
        j jVar = this.s;
        if (jVar == null || jVar.r == null) {
            f().q = false;
        } else if (Looper.myLooper() != this.s.r.j().getLooper()) {
            this.s.r.j().postAtFrontOfQueue(new a());
        } else {
            d();
        }
    }

    public final i o() {
        if (this.t != null) {
            return this.u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void o0(Menu menu) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.F = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        X0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.F = true;
    }

    public Context p() {
        h hVar = this.t;
        if (hVar == null) {
            return null;
        }
        return hVar.i();
    }

    public void p0() {
        this.F = true;
    }

    public Object q() {
        c cVar = this.L;
        if (cVar == null) {
            return null;
        }
        return cVar.g;
    }

    public void q0(boolean z) {
    }

    androidx.core.app.k r() {
        c cVar = this.L;
        if (cVar == null) {
            return null;
        }
        return cVar.o;
    }

    public void r0(Menu menu) {
    }

    public Object s() {
        c cVar = this.L;
        if (cVar == null) {
            return null;
        }
        return cVar.i;
    }

    public void s0(boolean z) {
    }

    androidx.core.app.k t() {
        c cVar = this.L;
        if (cVar == null) {
            return null;
        }
        return cVar.p;
    }

    public void t0(int i, String[] strArr, int[] iArr) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        b.g.k.a.a(this, sb);
        sb.append(" (");
        sb.append(this.f);
        sb.append(")");
        if (this.w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.w));
        }
        if (this.y != null) {
            sb.append(" ");
            sb.append(this.y);
        }
        sb.append('}');
        return sb.toString();
    }

    public final i u() {
        return this.s;
    }

    public void u0() {
        this.F = true;
    }

    public final Object v() {
        h hVar = this.t;
        if (hVar == null) {
            return null;
        }
        return hVar.m();
    }

    public void v0(Bundle bundle) {
    }

    @Deprecated
    public LayoutInflater w(Bundle bundle) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        h hVar = this.t;
        if (hVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterN = hVar.n();
        j jVar = this.u;
        jVar.x0();
        b.g.l.e.b(layoutInflaterN, jVar);
        return layoutInflaterN;
    }

    public void w0() {
        this.F = true;
    }

    int x() {
        c cVar = this.L;
        if (cVar == null) {
            return 0;
        }
        return cVar.f438d;
    }

    public void x0() {
        this.F = true;
    }

    int y() {
        c cVar = this.L;
        if (cVar == null) {
            return 0;
        }
        return cVar.e;
    }

    public void y0(View view, Bundle bundle) {
    }

    int z() {
        c cVar = this.L;
        if (cVar == null) {
            return 0;
        }
        return cVar.f;
    }

    public void z0(Bundle bundle) {
        this.F = true;
    }
}

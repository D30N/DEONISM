package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public class f {
    private final h<?> a;

    private f(h<?> hVar) {
        this.a = hVar;
    }

    public static f b(h<?> hVar) {
        b.g.k.h.d(hVar, "callbacks == null");
        return new f(hVar);
    }

    public void a(Fragment fragment) {
        h<?> hVar = this.a;
        hVar.f.n(hVar, hVar, fragment);
    }

    public void c() {
        this.a.f.w();
    }

    public void d(Configuration configuration) {
        this.a.f.x(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.a.f.y(menuItem);
    }

    public void f() {
        this.a.f.z();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.a.f.A(menu, menuInflater);
    }

    public void h() {
        this.a.f.B();
    }

    public void i() {
        this.a.f.D();
    }

    public void j(boolean z) {
        this.a.f.E(z);
    }

    public boolean k(MenuItem menuItem) {
        return this.a.f.T(menuItem);
    }

    public void l(Menu menu) {
        this.a.f.U(menu);
    }

    public void m() {
        this.a.f.W();
    }

    public void n(boolean z) {
        this.a.f.X(z);
    }

    public boolean o(Menu menu) {
        return this.a.f.Y(menu);
    }

    public void p() {
        this.a.f.a0();
    }

    public void q() {
        this.a.f.b0();
    }

    public void r() {
        this.a.f.d0();
    }

    public boolean s() {
        return this.a.f.j0();
    }

    public Fragment t(String str) {
        return this.a.f.p0(str);
    }

    public i u() {
        return this.a.f;
    }

    public void v() {
        this.a.f.R0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.f.onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable) {
        h<?> hVar = this.a;
        if (!(hVar instanceof androidx.lifecycle.s)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        hVar.f.b1(parcelable);
    }

    public Parcelable y() {
        return this.a.f.d1();
    }
}

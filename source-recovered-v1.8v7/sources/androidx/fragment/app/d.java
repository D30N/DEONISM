package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.a;
import androidx.lifecycle.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class d extends ComponentActivity {
    boolean j;
    boolean k;
    boolean m;
    boolean n;
    int o;
    b.d.h<String> p;
    final f h = f.b(new a());
    final androidx.lifecycle.h i = new androidx.lifecycle.h(this);
    boolean l = true;

    class a extends h<d> implements androidx.lifecycle.s, androidx.activity.c {
        public a() {
            super(d.this);
        }

        @Override // androidx.lifecycle.g
        public androidx.lifecycle.d a() {
            return d.this.i;
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher b() {
            return d.this.b();
        }

        @Override // androidx.fragment.app.h, androidx.fragment.app.e
        public View e(int i) {
            return d.this.findViewById(i);
        }

        @Override // androidx.fragment.app.h, androidx.fragment.app.e
        public boolean f() {
            Window window = d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.s
        public androidx.lifecycle.r g() {
            return d.this.g();
        }

        @Override // androidx.fragment.app.h
        public void k(Fragment fragment) {
            d.this.r(fragment);
        }

        @Override // androidx.fragment.app.h
        public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.h
        public LayoutInflater n() {
            return d.this.getLayoutInflater().cloneInContext(d.this);
        }

        @Override // androidx.fragment.app.h
        public int o() {
            Window window = d.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.h
        public boolean p() {
            return d.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.h
        public boolean q(Fragment fragment) {
            return !d.this.isFinishing();
        }

        @Override // androidx.fragment.app.h
        public void r(Fragment fragment, Intent intent, int i, Bundle bundle) {
            d.this.u(fragment, intent, i, bundle);
        }

        @Override // androidx.fragment.app.h
        public void s() {
            d.this.v();
        }

        @Override // androidx.fragment.app.h
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public d m() {
            return d.this;
        }
    }

    private int l(Fragment fragment) {
        if (this.p.r() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.p.j(this.o) >= 0) {
            this.o = (this.o + 1) % 65534;
        }
        int i = this.o;
        this.p.o(i, fragment.f);
        this.o = (this.o + 1) % 65534;
        return i;
    }

    static void m(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void p() {
        while (q(o(), d.b.CREATED)) {
        }
    }

    private static boolean q(i iVar, d.b bVar) {
        boolean zQ = false;
        for (Fragment fragment : iVar.d()) {
            if (fragment != null) {
                if (fragment.a().b().f(d.b.STARTED)) {
                    fragment.S.p(bVar);
                    zQ = true;
                }
                if (fragment.v() != null) {
                    zQ |= q(fragment.o(), bVar);
                }
            }
        }
        return zQ;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.j);
        printWriter.print(" mResumed=");
        printWriter.print(this.k);
        printWriter.print(" mStopped=");
        printWriter.print(this.l);
        if (getApplication() != null) {
            b.l.a.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.h.u().b(str, fileDescriptor, printWriter, strArr);
    }

    final View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.h.w(view, str, context, attributeSet);
    }

    public i o() {
        return this.h.u();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.h.v();
        int i3 = i >> 16;
        if (i3 == 0) {
            a.InterfaceC0007a interfaceC0007aK = androidx.core.app.a.k();
            if (interfaceC0007aK == null || !interfaceC0007aK.a(this, i, i2, intent)) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            return;
        }
        int i4 = i3 - 1;
        String strF = this.p.f(i4);
        this.p.q(i4);
        if (strF == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        Fragment fragmentT = this.h.t(strF);
        if (fragmentT != null) {
            fragmentT.U(i & 65535, i2, intent);
            return;
        }
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strF);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h.v();
        this.h.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.h.a(null);
        if (bundle != null) {
            this.h.x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.o = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.p = new b.d.h<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.p.o(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.p == null) {
            this.p = new b.d.h<>();
            this.o = 0;
        }
        super.onCreate(bundle);
        this.i.i(d.a.ON_CREATE);
        this.h.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.h.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewN = n(view, str, context, attributeSet);
        return viewN == null ? super.onCreateView(view, str, context, attributeSet) : viewN;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewN = n(null, str, context, attributeSet);
        return viewN == null ? super.onCreateView(str, context, attributeSet) : viewN;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.h.h();
        this.i.i(d.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.h.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.h.k(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.h.e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.h.j(z);
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.h.v();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.h.l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.k = false;
        this.h.m();
        this.i.i(d.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.h.n(z);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        t();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? s(view, menu) | this.h.o(menu) : super.onPreparePanel(i, view, menu);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.h.v();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String strF = this.p.f(i3);
            this.p.q(i3);
            if (strF == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment fragmentT = this.h.t(strF);
            if (fragmentT != null) {
                fragmentT.t0(i & 65535, strArr, iArr);
                return;
            }
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strF);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.k = true;
        this.h.v();
        this.h.s();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        p();
        this.i.i(d.a.ON_STOP);
        Parcelable parcelableY = this.h.y();
        if (parcelableY != null) {
            bundle.putParcelable("android:support:fragments", parcelableY);
        }
        if (this.p.r() > 0) {
            bundle.putInt("android:support:next_request_index", this.o);
            int[] iArr = new int[this.p.r()];
            String[] strArr = new String[this.p.r()];
            for (int i = 0; i < this.p.r(); i++) {
                iArr[i] = this.p.n(i);
                strArr[i] = this.p.s(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.l = false;
        if (!this.j) {
            this.j = true;
            this.h.c();
        }
        this.h.v();
        this.h.s();
        this.i.i(d.a.ON_START);
        this.h.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.h.v();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.l = true;
        p();
        this.h.r();
        this.i.i(d.a.ON_STOP);
    }

    public void r(Fragment fragment) {
    }

    @Deprecated
    protected boolean s(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.n && i != -1) {
            m(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.n && i != -1) {
            m(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        if (!this.m && i != -1) {
            m(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (!this.m && i != -1) {
            m(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    protected void t() {
        this.i.i(d.a.ON_RESUME);
        this.h.p();
    }

    public void u(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        this.n = true;
        try {
            if (i == -1) {
                androidx.core.app.a.m(this, intent, -1, bundle);
            } else {
                m(i);
                androidx.core.app.a.m(this, intent, ((l(fragment) + 1) << 16) + (i & 65535), bundle);
            }
        } finally {
            this.n = false;
        }
    }

    @Deprecated
    public void v() {
        invalidateOptionsMenu();
    }
}

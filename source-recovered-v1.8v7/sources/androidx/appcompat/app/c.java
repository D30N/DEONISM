package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.b1;
import androidx.core.app.l;
import b.a.n.b;

/* loaded from: classes.dex */
public class c extends androidx.fragment.app.d implements d, l.a {
    private e q;
    private Resources r;

    private boolean D(int i, KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    public void A(l lVar) {
    }

    @Deprecated
    public void B() {
    }

    public boolean C() {
        Intent intentE = e();
        if (intentE == null) {
            return false;
        }
        if (!F(intentE)) {
            E(intentE);
            return true;
        }
        l lVarJ = l.j(this);
        y(lVarJ);
        A(lVarJ);
        lVarJ.k();
        try {
            androidx.core.app.a.j(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public void E(Intent intent) {
        androidx.core.app.e.e(this, intent);
    }

    public boolean F(Intent intent) {
        return androidx.core.app.e.f(this, intent);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        w().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        w().d(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a aVarX = x();
        if (getWindow().hasFeature(0)) {
            if (aVarX == null || !aVarX.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.d, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a aVarX = x();
        if (keyCode == 82 && aVarX != null && aVarX.q(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.core.app.l.a
    public Intent e() {
        return androidx.core.app.e.a(this);
    }

    @Override // androidx.appcompat.app.d
    public void f(b.a.n.b bVar) {
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) w().g(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return w().j();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.r == null && b1.b()) {
            this.r = new b1(this, super.getResources());
        }
        Resources resources = this.r;
        return resources == null ? super.getResources() : resources;
    }

    @Override // androidx.appcompat.app.d
    public void h(b.a.n.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public b.a.n.b i(b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        w().m();
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.r != null) {
            this.r.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        w().p(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        B();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        e eVarW = w();
        eVarW.l();
        eVarW.q(bundle);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        w().r();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (D(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        a aVarX = x();
        if (menuItem.getItemId() != 16908332 || aVarX == null || (aVarX.j() & 4) == 0) {
            return false;
        }
        return C();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        w().s(bundle);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        w().t();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        w().u(bundle);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onStart() {
        super.onStart();
        w().v();
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onStop() {
        super.onStop();
        w().w();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        w().D(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a aVarX = x();
        if (getWindow().hasFeature(0)) {
            if (aVarX == null || !aVarX.r()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        w().z(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        w().A(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        w().B(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        w().C(i);
    }

    @Override // androidx.fragment.app.d
    public void v() {
        w().m();
    }

    public e w() {
        if (this.q == null) {
            this.q = e.e(this, this);
        }
        return this.q;
    }

    public a x() {
        return w().k();
    }

    public void y(l lVar) {
        lVar.h(this);
    }

    protected void z(int i) {
    }
}

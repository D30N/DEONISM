package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.d;
import androidx.lifecycle.o;
import b.g.l.d;

/* loaded from: classes.dex */
public class d extends Activity implements androidx.lifecycle.g, d.a {

    /* renamed from: b, reason: collision with root package name */
    private androidx.lifecycle.h f385b;

    public d() {
        new b.d.g();
        this.f385b = new androidx.lifecycle.h(this);
    }

    @Override // b.g.l.d.a
    public boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !b.g.l.d.d(decorView, keyEvent)) {
            return b.g.l.d.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !b.g.l.d.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o.e(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.f385b.k(d.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}

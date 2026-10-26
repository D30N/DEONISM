package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import b.a.n.b;
import b.g.l.d;

/* loaded from: classes.dex */
public class g extends Dialog implements d {

    /* renamed from: b, reason: collision with root package name */
    private e f62b;

    /* renamed from: c, reason: collision with root package name */
    private final d.a f63c;

    class a implements d.a {
        a() {
        }

        @Override // b.g.l.d.a
        public boolean d(KeyEvent keyEvent) {
            return g.this.c(keyEvent);
        }
    }

    public g(Context context, int i) {
        super(context, b(context, i));
        this.f63c = new a();
        e eVarA = a();
        eVarA.C(b(context, i));
        eVarA.q(null);
    }

    private static int b(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(b.a.a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public e a() {
        if (this.f62b == null) {
            this.f62b = e.f(this, this);
        }
        return this.f62b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean d(int i) {
        return a().y(i);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return b.g.l.d.e(this.f63c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // androidx.appcompat.app.d
    public void f(b.a.n.b bVar) {
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) a().g(i);
    }

    @Override // androidx.appcompat.app.d
    public void h(b.a.n.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public b.a.n.b i(b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().m();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        a().l();
        super.onCreate(bundle);
        a().q(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().w();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a().z(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().A(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().B(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        a().D(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().D(charSequence);
    }
}

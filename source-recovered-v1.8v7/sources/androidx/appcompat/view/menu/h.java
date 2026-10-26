package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.m;

/* loaded from: classes.dex */
class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: b, reason: collision with root package name */
    private g f116b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.appcompat.app.b f117c;

    /* renamed from: d, reason: collision with root package name */
    e f118d;
    private m.a e;

    public h(g gVar) {
        this.f116b = gVar;
    }

    @Override // androidx.appcompat.view.menu.m.a
    public void a(g gVar, boolean z) {
        if (z || gVar == this.f116b) {
            c();
        }
        m.a aVar = this.e;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public boolean b(g gVar) {
        m.a aVar = this.e;
        if (aVar != null) {
            return aVar.b(gVar);
        }
        return false;
    }

    public void c() {
        androidx.appcompat.app.b bVar = this.f117c;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        g gVar = this.f116b;
        b.a aVar = new b.a(gVar.u());
        e eVar = new e(aVar.b(), b.a.g.abc_list_menu_item_layout);
        this.f118d = eVar;
        eVar.g(this);
        this.f116b.b(this.f118d);
        aVar.c(this.f118d.b(), this);
        View viewY = gVar.y();
        if (viewY != null) {
            aVar.e(viewY);
        } else {
            aVar.f(gVar.w());
            aVar.l(gVar.x());
        }
        aVar.i(this);
        androidx.appcompat.app.b bVarA = aVar.a();
        this.f117c = bVarA;
        bVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f117c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f117c.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f116b.L((i) this.f118d.b().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f118d.a(this.f116b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f117c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f117c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f116b.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f116b.performShortcut(i, keyEvent, 0);
    }
}

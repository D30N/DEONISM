package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.d;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.savedstate.SavedStateRegistry;

/* loaded from: classes.dex */
public class ComponentActivity extends d implements g, s, androidx.savedstate.b, c {
    private r e;
    private int g;

    /* renamed from: c, reason: collision with root package name */
    private final h f0c = new h(this);

    /* renamed from: d, reason: collision with root package name */
    private final androidx.savedstate.a f1d = androidx.savedstate.a.a(this);
    private final OnBackPressedDispatcher f = new OnBackPressedDispatcher(new a());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    static final class b {
        Object a;

        /* renamed from: b, reason: collision with root package name */
        r f3b;

        b() {
        }
    }

    public ComponentActivity() {
        if (a() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        if (Build.VERSION.SDK_INT >= 19) {
            a().a(new e() { // from class: androidx.activity.ComponentActivity.2
                @Override // androidx.lifecycle.e
                public void d(g gVar, d.a aVar) {
                    if (aVar == d.a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                        if (viewPeekDecorView != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        a().a(new e() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.e
            public void d(g gVar, d.a aVar) {
                if (aVar != d.a.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                    return;
                }
                ComponentActivity.this.g().a();
            }
        });
        int i = Build.VERSION.SDK_INT;
        if (19 > i || i > 23) {
            return;
        }
        a().a(new ImmLeaksCleaner(this));
    }

    @Override // androidx.lifecycle.g
    public androidx.lifecycle.d a() {
        return this.f0c;
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher b() {
        return this.f;
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry c() {
        return this.f1d.b();
    }

    @Override // androidx.lifecycle.s
    public r g() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.e == null) {
            b bVar = (b) getLastNonConfigurationInstance();
            if (bVar != null) {
                this.e = bVar.f3b;
            }
            if (this.e == null) {
                this.e = new r();
            }
        }
        return this.e;
    }

    @Deprecated
    public Object k() {
        return null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f.c();
    }

    @Override // androidx.core.app.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1d.c(bundle);
        o.e(this);
        int i = this.g;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        Object objK = k();
        r rVar = this.e;
        if (rVar == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            rVar = bVar.f3b;
        }
        if (rVar == null && objK == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.a = objK;
        bVar2.f3b = rVar;
        return bVar2;
    }

    @Override // androidx.core.app.d, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.d dVarA = a();
        if (dVarA instanceof h) {
            ((h) dVarA).p(d.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f1d.d(bundle);
    }
}

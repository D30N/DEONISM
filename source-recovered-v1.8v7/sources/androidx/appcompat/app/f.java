package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.w0;
import androidx.lifecycle.d;
import b.a.n.b;
import b.a.n.f;
import b.g.l.d;
import b.g.l.r;
import b.g.l.v;
import b.g.l.x;
import b.g.l.z;
import com.facebook.ads.AdError;
import java.lang.Thread;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
class f extends androidx.appcompat.app.e implements g.a, LayoutInflater.Factory2 {
    private static final Map<Class<?>, Integer> b0 = new b.d.a();
    private static final boolean c0;
    private static final int[] d0;
    private static boolean e0;
    private static final boolean f0;
    private boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    private boolean G;
    private o[] H;
    private o I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    boolean N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private l S;
    private l T;
    boolean U;
    int V;
    private final Runnable W;
    private boolean X;
    private Rect Y;
    private Rect Z;
    private AppCompatViewInflater a0;
    final Object e;
    final Context f;
    Window g;
    private j h;
    final androidx.appcompat.app.d i;
    androidx.appcompat.app.a j;
    MenuInflater k;
    private CharSequence l;
    private c0 m;
    private h n;
    private p o;
    b.a.n.b p;
    ActionBarContextView q;
    PopupWindow r;
    Runnable s;
    v t;
    private boolean u;
    private boolean v;
    private ViewGroup w;
    private TextView x;
    private View y;
    private boolean z;

    static class a implements Thread.UncaughtExceptionHandler {
        final /* synthetic */ Thread.UncaughtExceptionHandler a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!a(th)) {
                this.a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.a.uncaughtException(thread, notFoundException);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            if ((fVar.V & 1) != 0) {
                fVar.S(0);
            }
            f fVar2 = f.this;
            if ((fVar2.V & 4096) != 0) {
                fVar2.S(108);
            }
            f fVar3 = f.this;
            fVar3.U = false;
            fVar3.V = 0;
        }
    }

    class c implements b.g.l.o {
        c() {
        }

        @Override // b.g.l.o
        public z a(View view, z zVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            int iD = zVar.d();
            int iI0 = f.this.I0(iD);
            if (iD != iI0) {
                zVar = zVar.f(zVar.b(), iI0, zVar.c(), zVar.a());
            }
            return r.Q(view, zVar);
        }
    }

    class d implements g0.a {
        d() {
        }

        @Override // androidx.appcompat.widget.g0.a
        public void a(Rect rect) {
            rect.top = f.this.I0(rect.top);
        }
    }

    class e implements ContentFrameLayout.a {
        e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            f.this.Q();
        }
    }

    /* renamed from: androidx.appcompat.app.f$f, reason: collision with other inner class name */
    class RunnableC0001f implements Runnable {

        /* renamed from: androidx.appcompat.app.f$f$a */
        class a extends x {
            a() {
            }

            @Override // b.g.l.w
            public void a(View view) {
                f.this.q.setAlpha(1.0f);
                f.this.t.f(null);
                f.this.t = null;
            }

            @Override // b.g.l.x, b.g.l.w
            public void b(View view) {
                f.this.q.setVisibility(0);
            }
        }

        RunnableC0001f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.r.showAtLocation(fVar.q, 55, 0, 0);
            f.this.T();
            if (!f.this.A0()) {
                f.this.q.setAlpha(1.0f);
                f.this.q.setVisibility(0);
                return;
            }
            f.this.q.setAlpha(0.0f);
            f fVar2 = f.this;
            v vVarC = r.c(fVar2.q);
            vVarC.a(1.0f);
            fVar2.t = vVarC;
            f.this.t.f(new a());
        }
    }

    class g extends x {
        g() {
        }

        @Override // b.g.l.w
        public void a(View view) {
            f.this.q.setAlpha(1.0f);
            f.this.t.f(null);
            f.this.t = null;
        }

        @Override // b.g.l.x, b.g.l.w
        public void b(View view) {
            f.this.q.setVisibility(0);
            f.this.q.sendAccessibilityEvent(32);
            if (f.this.q.getParent() instanceof View) {
                r.a0((View) f.this.q.getParent());
            }
        }
    }

    private final class h implements m.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            f.this.K(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback callbackC0 = f.this.c0();
            if (callbackC0 == null) {
                return true;
            }
            callbackC0.onMenuOpened(108, gVar);
            return true;
        }
    }

    class i implements b.a {
        private b.a a;

        class a extends x {
            a() {
            }

            @Override // b.g.l.w
            public void a(View view) {
                f.this.q.setVisibility(8);
                f fVar = f.this;
                PopupWindow popupWindow = fVar.r;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.q.getParent() instanceof View) {
                    r.a0((View) f.this.q.getParent());
                }
                f.this.q.removeAllViews();
                f.this.t.f(null);
                f.this.t = null;
            }
        }

        public i(b.a aVar) {
            this.a = aVar;
        }

        @Override // b.a.n.b.a
        public boolean a(b.a.n.b bVar, Menu menu) {
            return this.a.a(bVar, menu);
        }

        @Override // b.a.n.b.a
        public boolean b(b.a.n.b bVar, MenuItem menuItem) {
            return this.a.b(bVar, menuItem);
        }

        @Override // b.a.n.b.a
        public boolean c(b.a.n.b bVar, Menu menu) {
            return this.a.c(bVar, menu);
        }

        @Override // b.a.n.b.a
        public void d(b.a.n.b bVar) {
            this.a.d(bVar);
            f fVar = f.this;
            if (fVar.r != null) {
                fVar.g.getDecorView().removeCallbacks(f.this.s);
            }
            f fVar2 = f.this;
            if (fVar2.q != null) {
                fVar2.T();
                f fVar3 = f.this;
                v vVarC = r.c(fVar3.q);
                vVarC.a(0.0f);
                fVar3.t = vVarC;
                f.this.t.f(new a());
            }
            f fVar4 = f.this;
            androidx.appcompat.app.d dVar = fVar4.i;
            if (dVar != null) {
                dVar.h(fVar4.p);
            }
            f.this.p = null;
        }
    }

    class j extends b.a.n.i {
        j(Window.Callback callback) {
            super(callback);
        }

        final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(f.this.f, callback);
            b.a.n.b bVarC0 = f.this.C0(aVar);
            if (bVarC0 != null) {
                return aVar.e(bVarC0);
            }
            return null;
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.R(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || f.this.o0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            f.this.r0(i);
            return true;
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            f.this.s0(i);
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.a0(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.a0(false);
            }
            return zOnPreparePanel;
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.g gVar;
            o oVarA0 = f.this.a0(0, true);
            if (oVarA0 == null || (gVar = oVarA0.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return f.this.j0() ? b(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (f.this.j0() && i == 0) ? b(callback) : super.onWindowStartingActionMode(callback, i);
        }
    }

    private class k extends l {

        /* renamed from: c, reason: collision with root package name */
        private final PowerManager f53c;

        k(Context context) {
            super();
            this.f53c = (PowerManager) context.getSystemService("power");
        }

        @Override // androidx.appcompat.app.f.l
        IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.f.l
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f53c.isPowerSaveMode()) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.f.l
        public void d() {
            f.this.E();
        }
    }

    abstract class l {
        private BroadcastReceiver a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                l.this.d();
            }
        }

        l() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    f.this.f.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.a == null) {
                this.a = new a();
            }
            f.this.f.registerReceiver(this.a, intentFilterB);
        }
    }

    private class m extends l {

        /* renamed from: c, reason: collision with root package name */
        private final androidx.appcompat.app.j f56c;

        m(androidx.appcompat.app.j jVar) {
            super();
            this.f56c = jVar;
        }

        @Override // androidx.appcompat.app.f.l
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.f.l
        public int c() {
            return this.f56c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.f.l
        public void d() {
            f.this.E();
        }
    }

    private class n extends ContentFrameLayout {
        public n(Context context) {
            super(context);
        }

        private boolean c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.R(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            f.this.M(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(b.a.k.a.a.d(getContext(), i));
        }
    }

    protected static final class o {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f58b;

        /* renamed from: c, reason: collision with root package name */
        int f59c;

        /* renamed from: d, reason: collision with root package name */
        int f60d;
        int e;
        int f;
        ViewGroup g;
        View h;
        View i;
        androidx.appcompat.view.menu.g j;
        androidx.appcompat.view.menu.e k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        o(int i) {
            this.a = i;
        }

        androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.l, b.a.g.abc_list_menu_item_layout);
                this.k = eVar;
                eVar.g(aVar);
                this.j.b(this.k);
            }
            return this.k.j(this.g);
        }

        public boolean b() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.k.b().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.O(this.k);
            }
            this.j = gVar;
            if (gVar == null || (eVar = this.k) == null) {
                return;
            }
            gVar.b(eVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(b.a.a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                themeNewTheme.applyStyle(i, true);
            }
            themeNewTheme.resolveAttribute(b.a.a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = b.a.i.Theme_AppCompat_CompactMenu;
            }
            themeNewTheme.applyStyle(i2, true);
            b.a.n.d dVar = new b.a.n.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(b.a.j.AppCompatTheme);
            this.f58b = typedArrayObtainStyledAttributes.getResourceId(b.a.j.AppCompatTheme_panelBackground, 0);
            this.f = typedArrayObtainStyledAttributes.getResourceId(b.a.j.AppCompatTheme_android_windowAnimationStyle, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final class p implements m.a {
        p() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            androidx.appcompat.view.menu.g gVarD = gVar.D();
            boolean z2 = gVarD != gVar;
            f fVar = f.this;
            if (z2) {
                gVar = gVarD;
            }
            o oVarW = fVar.W(gVar);
            if (oVarW != null) {
                if (!z2) {
                    f.this.N(oVarW, z);
                } else {
                    f.this.J(oVarW.a, oVarW, gVarD);
                    f.this.N(oVarW, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback callbackC0;
            if (gVar != null) {
                return true;
            }
            f fVar = f.this;
            if (!fVar.B || (callbackC0 = fVar.c0()) == null || f.this.N) {
                return true;
            }
            callbackC0.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        boolean z = false;
        c0 = Build.VERSION.SDK_INT < 21;
        d0 = new int[]{R.attr.windowBackground};
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21 && i2 <= 25) {
            z = true;
        }
        f0 = z;
        if (!c0 || e0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        e0 = true;
    }

    f(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    f(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    private f(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        Integer num;
        androidx.appcompat.app.c cVarF0;
        this.t = null;
        this.u = true;
        this.O = -100;
        this.W = new b();
        this.f = context;
        this.i = dVar;
        this.e = obj;
        if (this.O == -100 && (obj instanceof Dialog) && (cVarF0 = F0()) != null) {
            this.O = cVarF0.w().i();
        }
        if (this.O == -100 && (num = b0.get(this.e.getClass())) != null) {
            this.O = num.intValue();
            b0.remove(this.e.getClass());
        }
        if (window != null) {
            H(window);
        }
        androidx.appcompat.widget.j.h();
    }

    private boolean B0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.g.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || r.I((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private void E0() {
        if (this.v) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private boolean F(boolean z) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        if (this.N) {
            return false;
        }
        int I = I();
        boolean zG0 = G0(k0(I), z);
        if (I == 0) {
            Z().e();
        } else {
            l lVar = this.S;
            if (lVar != null) {
                lVar.a();
            }
        }
        if (I == 3) {
            Y().e();
        } else {
            l lVar2 = this.T;
            if (lVar2 != null) {
                lVar2.a();
            }
        }
        return zG0;
    }

    private androidx.appcompat.app.c F0() {
        for (Context baseContext = this.f; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.c) {
                return (androidx.appcompat.app.c) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void G() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.w.findViewById(R.id.content);
        View decorView = this.g.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f.obtainStyledAttributes(b.a.j.AppCompatTheme);
        typedArrayObtainStyledAttributes.getValue(b.a.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(b.a.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(b.a.j.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes.getValue(b.a.j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(b.a.j.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes.getValue(b.a.j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(b.a.j.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes.getValue(b.a.j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(b.a.j.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes.getValue(b.a.j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private boolean G0(int i2, boolean z) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        int i3 = this.f.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z2 = true;
        int i4 = i2 != 1 ? i2 != 2 ? i3 : 32 : 16;
        boolean zI0 = i0();
        boolean z3 = false;
        if ((f0 || i4 != i3) && !zI0 && Build.VERSION.SDK_INT >= 17 && !this.K && (this.e instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & (-49)) | i4;
            try {
                ((ContextThemeWrapper) this.e).applyOverrideConfiguration(configuration);
                z3 = true;
            } catch (IllegalStateException e2) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e2);
            }
        }
        int i5 = this.f.getResources().getConfiguration().uiMode & 48;
        if (!z3 && i5 != i4 && z && !zI0 && this.K && (Build.VERSION.SDK_INT >= 17 || this.L)) {
            Object obj = this.e;
            if (obj instanceof Activity) {
                androidx.core.app.a.l((Activity) obj);
                z3 = true;
            }
        }
        if (z3 || i5 == i4) {
            z2 = z3;
        } else {
            H0(i4, zI0);
        }
        if (z2) {
            Object obj2 = this.e;
            if (obj2 instanceof androidx.appcompat.app.c) {
                ((androidx.appcompat.app.c) obj2).z(i2);
            }
        }
        return z2;
    }

    private void H(Window window) {
        if (this.g != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof j) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        j jVar = new j(callback);
        this.h = jVar;
        window.setCallback(jVar);
        w0 w0VarT = w0.t(this.f, null, d0);
        Drawable drawableH = w0VarT.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        w0VarT.v();
        this.g = window;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void H0(int i2, boolean z) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Resources resources = this.f.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration, null);
        if (Build.VERSION.SDK_INT < 26) {
            androidx.appcompat.app.h.a(resources);
        }
        int i3 = this.P;
        if (i3 != 0) {
            this.f.setTheme(i3);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f.getTheme().applyStyle(this.P, true);
            }
        }
        if (z) {
            Object obj = this.e;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.g) {
                    if (!((androidx.lifecycle.g) activity).a().b().f(d.b.STARTED)) {
                        return;
                    }
                } else if (!this.M) {
                    return;
                }
                activity.onConfigurationChanged(configuration);
            }
        }
    }

    private int I() {
        int i2 = this.O;
        return i2 != -100 ? i2 : androidx.appcompat.app.e.h();
    }

    private void L() {
        l lVar = this.S;
        if (lVar != null) {
            lVar.a();
        }
        l lVar2 = this.T;
        if (lVar2 != null) {
            lVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ViewGroup O() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f.obtainStyledAttributes(b.a.j.AppCompatTheme);
        if (!typedArrayObtainStyledAttributes.hasValue(b.a.j.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(b.a.j.AppCompatTheme_windowNoTitle, false)) {
            y(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(b.a.j.AppCompatTheme_windowActionBar, false)) {
            y(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(b.a.j.AppCompatTheme_windowActionBarOverlay, false)) {
            y(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(b.a.j.AppCompatTheme_windowActionModeOverlay, false)) {
            y(10);
        }
        this.E = typedArrayObtainStyledAttributes.getBoolean(b.a.j.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        V();
        this.g.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f);
        if (this.F) {
            ViewGroup viewGroup2 = (ViewGroup) layoutInflaterFrom.inflate(this.D ? b.a.g.abc_screen_simple_overlay_action_mode : b.a.g.abc_screen_simple, (ViewGroup) null);
            if (Build.VERSION.SDK_INT >= 21) {
                r.n0(viewGroup2, new c());
                viewGroup = viewGroup2;
            } else {
                ((g0) viewGroup2).setOnFitSystemWindowsListener(new d());
                viewGroup = viewGroup2;
            }
        } else if (this.E) {
            ViewGroup viewGroup3 = (ViewGroup) layoutInflaterFrom.inflate(b.a.g.abc_dialog_title_material, (ViewGroup) null);
            this.C = false;
            this.B = false;
            viewGroup = viewGroup3;
        } else if (this.B) {
            TypedValue typedValue = new TypedValue();
            this.f.getTheme().resolveAttribute(b.a.a.actionBarTheme, typedValue, true);
            ViewGroup viewGroup4 = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new b.a.n.d(this.f, typedValue.resourceId) : this.f).inflate(b.a.g.abc_screen_toolbar, (ViewGroup) null);
            c0 c0Var = (c0) viewGroup4.findViewById(b.a.f.decor_content_parent);
            this.m = c0Var;
            c0Var.setWindowCallback(c0());
            if (this.C) {
                this.m.k(109);
            }
            if (this.z) {
                this.m.k(2);
            }
            viewGroup = viewGroup4;
            if (this.A) {
                this.m.k(5);
                viewGroup = viewGroup4;
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.B + ", windowActionBarOverlay: " + this.C + ", android:windowIsFloating: " + this.E + ", windowActionModeOverlay: " + this.D + ", windowNoTitle: " + this.F + " }");
        }
        if (this.m == null) {
            this.x = (TextView) viewGroup.findViewById(b.a.f.title);
        }
        c1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(b.a.f.action_bar_activity_content);
        ViewGroup viewGroup5 = (ViewGroup) this.g.findViewById(R.id.content);
        if (viewGroup5 != null) {
            while (viewGroup5.getChildCount() > 0) {
                View childAt = viewGroup5.getChildAt(0);
                viewGroup5.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup5.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup5 instanceof FrameLayout) {
                ((FrameLayout) viewGroup5).setForeground(null);
            }
        }
        this.g.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new e());
        return viewGroup;
    }

    private void U() {
        if (this.v) {
            return;
        }
        this.w = O();
        CharSequence charSequenceB0 = b0();
        if (!TextUtils.isEmpty(charSequenceB0)) {
            c0 c0Var = this.m;
            if (c0Var != null) {
                c0Var.setWindowTitle(charSequenceB0);
            } else if (v0() != null) {
                v0().w(charSequenceB0);
            } else {
                TextView textView = this.x;
                if (textView != null) {
                    textView.setText(charSequenceB0);
                }
            }
        }
        G();
        t0(this.w);
        this.v = true;
        o oVarA0 = a0(0, false);
        if (this.N) {
            return;
        }
        if (oVarA0 == null || oVarA0.j == null) {
            h0(108);
        }
    }

    private void V() {
        if (this.g == null) {
            Object obj = this.e;
            if (obj instanceof Activity) {
                H(((Activity) obj).getWindow());
            }
        }
        if (this.g == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private l Y() {
        if (this.T == null) {
            this.T = new k(this.f);
        }
        return this.T;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d0() {
        /*
            r3 = this;
            r3.U()
            boolean r0 = r3.B
            if (r0 == 0) goto L37
            androidx.appcompat.app.a r0 = r3.j
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            androidx.appcompat.app.k r0 = new androidx.appcompat.app.k
            java.lang.Object r1 = r3.e
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.C
            r0.<init>(r1, r2)
        L1d:
            r3.j = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            androidx.appcompat.app.k r0 = new androidx.appcompat.app.k
            java.lang.Object r1 = r3.e
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            androidx.appcompat.app.a r0 = r3.j
            if (r0 == 0) goto L37
            boolean r1 = r3.X
            r0.s(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.d0():void");
    }

    private boolean e0(o oVar) {
        View view = oVar.i;
        if (view != null) {
            oVar.h = view;
            return true;
        }
        if (oVar.j == null) {
            return false;
        }
        if (this.o == null) {
            this.o = new p();
        }
        View view2 = (View) oVar.a(this.o);
        oVar.h = view2;
        return view2 != null;
    }

    private boolean f0(o oVar) {
        oVar.d(X());
        oVar.g = new n(oVar.l);
        oVar.f59c = 81;
        return true;
    }

    private boolean g0(o oVar) {
        Context context = this.f;
        int i2 = oVar.a;
        if ((i2 == 0 || i2 == 108) && this.m != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(b.a.a.actionBarTheme, typedValue, true);
            Resources.Theme themeNewTheme = null;
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(b.a.a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(b.a.a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                b.a.n.d dVar = new b.a.n.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.R(this);
        oVar.c(gVar);
        return true;
    }

    private void h0(int i2) {
        this.V = (1 << i2) | this.V;
        if (this.U) {
            return;
        }
        r.V(this.g.getDecorView(), this.W);
        this.U = true;
    }

    private boolean i0() throws PackageManager.NameNotFoundException {
        if (!this.R && (this.e instanceof Activity)) {
            PackageManager packageManager = this.f.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f, this.e.getClass()), 0);
                this.Q = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.Q = false;
            }
        }
        this.R = true;
        return this.Q;
    }

    private boolean n0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        o oVarA0 = a0(i2, true);
        if (oVarA0.o) {
            return false;
        }
        return x0(oVarA0, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean q0(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            b.a.n.b r0 = r3.p
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.f$o r2 = r3.a0(r4, r0)
            if (r4 != 0) goto L43
            androidx.appcompat.widget.c0 r4 = r3.m
            if (r4 == 0) goto L43
            boolean r4 = r4.g()
            if (r4 == 0) goto L43
            android.content.Context r4 = r3.f
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L43
            androidx.appcompat.widget.c0 r4 = r3.m
            boolean r4 = r4.c()
            if (r4 != 0) goto L3c
            boolean r4 = r3.N
            if (r4 != 0) goto L62
            boolean r4 = r3.x0(r2, r5)
            if (r4 == 0) goto L62
            androidx.appcompat.widget.c0 r4 = r3.m
            boolean r0 = r4.e()
            goto L6a
        L3c:
            androidx.appcompat.widget.c0 r4 = r3.m
            boolean r0 = r4.d()
            goto L6a
        L43:
            boolean r4 = r2.o
            if (r4 != 0) goto L64
            boolean r4 = r2.n
            if (r4 == 0) goto L4c
            goto L64
        L4c:
            boolean r4 = r2.m
            if (r4 == 0) goto L62
            boolean r4 = r2.r
            if (r4 == 0) goto L5b
            r2.m = r1
            boolean r4 = r3.x0(r2, r5)
            goto L5c
        L5b:
            r4 = 1
        L5c:
            if (r4 == 0) goto L62
            r3.u0(r2, r5)
            goto L6a
        L62:
            r0 = 0
            goto L6a
        L64:
            boolean r4 = r2.o
            r3.N(r2, r0)
            r0 = r4
        L6a:
            if (r0 == 0) goto L83
            android.content.Context r4 = r3.f
            java.lang.String r5 = "audio"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            if (r4 == 0) goto L7c
            r4.playSoundEffect(r1)
            goto L83
        L7c:
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r5 = "Couldn't get audio manager"
            android.util.Log.w(r4, r5)
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.q0(int, android.view.KeyEvent):boolean");
    }

    private void u0(o oVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (oVar.o || this.N) {
            return;
        }
        if (oVar.a == 0) {
            if ((this.f.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackC0 = c0();
        if (callbackC0 != null && !callbackC0.onMenuOpened(oVar.a, oVar.j)) {
            N(oVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f.getSystemService("window");
        if (windowManager != null && x0(oVar, keyEvent)) {
            if (oVar.g != null && !oVar.q) {
                View view = oVar.i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                }
                oVar.n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, oVar.f60d, oVar.e, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 8519680, -3);
                layoutParams2.gravity = oVar.f59c;
                layoutParams2.windowAnimations = oVar.f;
                windowManager.addView(oVar.g, layoutParams2);
                oVar.o = true;
            }
            ViewGroup viewGroup = oVar.g;
            if (viewGroup == null) {
                if (!f0(oVar) || oVar.g == null) {
                    return;
                }
            } else if (oVar.q && viewGroup.getChildCount() > 0) {
                oVar.g.removeAllViews();
            }
            if (!e0(oVar) || !oVar.b()) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = oVar.h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            oVar.g.setBackgroundResource(oVar.f58b);
            ViewParent parent = oVar.h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(oVar.h);
            }
            oVar.g.addView(oVar.h, layoutParams3);
            if (!oVar.h.hasFocus()) {
                oVar.h.requestFocus();
            }
            i2 = -2;
            oVar.n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i2, -2, oVar.f60d, oVar.e, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 8519680, -3);
            layoutParams22.gravity = oVar.f59c;
            layoutParams22.windowAnimations = oVar.f;
            windowManager.addView(oVar.g, layoutParams22);
            oVar.o = true;
        }
    }

    private boolean w0(o oVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.g gVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((oVar.m || x0(oVar, keyEvent)) && (gVar = oVar.j) != null) {
            zPerformShortcut = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (zPerformShortcut && (i3 & 1) == 0 && this.m == null) {
            N(oVar, true);
        }
        return zPerformShortcut;
    }

    private boolean x0(o oVar, KeyEvent keyEvent) {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        if (this.N) {
            return false;
        }
        if (oVar.m) {
            return true;
        }
        o oVar2 = this.I;
        if (oVar2 != null && oVar2 != oVar) {
            N(oVar2, false);
        }
        Window.Callback callbackC0 = c0();
        if (callbackC0 != null) {
            oVar.i = callbackC0.onCreatePanelView(oVar.a);
        }
        int i2 = oVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (c0Var3 = this.m) != null) {
            c0Var3.f();
        }
        if (oVar.i == null) {
            if (z) {
                v0();
            }
            if (oVar.j == null || oVar.r) {
                if (oVar.j == null && (!g0(oVar) || oVar.j == null)) {
                    return false;
                }
                if (z && this.m != null) {
                    if (this.n == null) {
                        this.n = new h();
                    }
                    this.m.a(oVar.j, this.n);
                }
                oVar.j.d0();
                if (!callbackC0.onCreatePanelMenu(oVar.a, oVar.j)) {
                    oVar.c(null);
                    if (z && (c0Var = this.m) != null) {
                        c0Var.a(null, this.n);
                    }
                    return false;
                }
                oVar.r = false;
            }
            oVar.j.d0();
            Bundle bundle = oVar.s;
            if (bundle != null) {
                oVar.j.P(bundle);
                oVar.s = null;
            }
            if (!callbackC0.onPreparePanel(0, oVar.i, oVar.j)) {
                if (z && (c0Var2 = this.m) != null) {
                    c0Var2.a(null, this.n);
                }
                oVar.j.c0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            oVar.p = z2;
            oVar.j.setQwertyMode(z2);
            oVar.j.c0();
        }
        oVar.m = true;
        oVar.n = false;
        this.I = oVar;
        return true;
    }

    private void y0(androidx.appcompat.view.menu.g gVar, boolean z) {
        c0 c0Var = this.m;
        if (c0Var == null || !c0Var.g() || (ViewConfiguration.get(this.f).hasPermanentMenuKey() && !this.m.b())) {
            o oVarA0 = a0(0, true);
            oVarA0.q = true;
            N(oVarA0, false);
            u0(oVarA0, null);
            return;
        }
        Window.Callback callbackC0 = c0();
        if (this.m.c() && z) {
            this.m.d();
            if (this.N) {
                return;
            }
            callbackC0.onPanelClosed(108, a0(0, true).j);
            return;
        }
        if (callbackC0 == null || this.N) {
            return;
        }
        if (this.U && (this.V & 1) != 0) {
            this.g.getDecorView().removeCallbacks(this.W);
            this.W.run();
        }
        o oVarA02 = a0(0, true);
        androidx.appcompat.view.menu.g gVar2 = oVarA02.j;
        if (gVar2 == null || oVarA02.r || !callbackC0.onPreparePanel(0, oVarA02.i, gVar2)) {
            return;
        }
        callbackC0.onMenuOpened(108, oVarA02.j);
        this.m.e();
    }

    private int z0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i2 != 9) {
            return i2;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    @Override // androidx.appcompat.app.e
    public void A(View view) {
        U();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.h.a().onContentChanged();
    }

    final boolean A0() {
        ViewGroup viewGroup;
        return this.v && (viewGroup = this.w) != null && r.J(viewGroup);
    }

    @Override // androidx.appcompat.app.e
    public void B(View view, ViewGroup.LayoutParams layoutParams) {
        U();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.h.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void C(int i2) {
        this.P = i2;
    }

    public b.a.n.b C0(b.a aVar) {
        androidx.appcompat.app.d dVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        b.a.n.b bVar = this.p;
        if (bVar != null) {
            bVar.c();
        }
        i iVar = new i(aVar);
        androidx.appcompat.app.a aVarK = k();
        if (aVarK != null) {
            b.a.n.b bVarX = aVarK.x(iVar);
            this.p = bVarX;
            if (bVarX != null && (dVar = this.i) != null) {
                dVar.f(bVarX);
            }
        }
        if (this.p == null) {
            this.p = D0(iVar);
        }
        return this.p;
    }

    @Override // androidx.appcompat.app.e
    public final void D(CharSequence charSequence) {
        this.l = charSequence;
        c0 c0Var = this.m;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
            return;
        }
        if (v0() != null) {
            v0().w(charSequence);
            return;
        }
        TextView textView = this.x;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    b.a.n.b D0(b.a aVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b.a.n.b bVarI;
        Context dVar;
        androidx.appcompat.app.d dVar2;
        T();
        b.a.n.b bVar = this.p;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof i)) {
            aVar = new i(aVar);
        }
        androidx.appcompat.app.d dVar3 = this.i;
        if (dVar3 == null || this.N) {
            bVarI = null;
        } else {
            try {
                bVarI = dVar3.i(aVar);
            } catch (AbstractMethodError unused) {
            }
        }
        if (bVarI != null) {
            this.p = bVarI;
        } else {
            if (this.q == null) {
                if (this.E) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f.getTheme();
                    theme.resolveAttribute(b.a.a.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new b.a.n.d(this.f, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f;
                    }
                    this.q = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, b.a.a.actionModePopupWindowStyle);
                    this.r = popupWindow;
                    androidx.core.widget.h.b(popupWindow, 2);
                    this.r.setContentView(this.q);
                    this.r.setWidth(-1);
                    dVar.getTheme().resolveAttribute(b.a.a.actionBarSize, typedValue, true);
                    this.q.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.r.setHeight(-2);
                    this.s = new RunnableC0001f();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.w.findViewById(b.a.f.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(X()));
                        this.q = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.q != null) {
                T();
                this.q.k();
                b.a.n.e eVar = new b.a.n.e(this.q.getContext(), this.q, aVar, this.r == null);
                if (aVar.c(eVar, eVar.e())) {
                    eVar.k();
                    this.q.h(eVar);
                    this.p = eVar;
                    if (A0()) {
                        this.q.setAlpha(0.0f);
                        v vVarC = r.c(this.q);
                        vVarC.a(1.0f);
                        this.t = vVarC;
                        vVarC.f(new g());
                    } else {
                        this.q.setAlpha(1.0f);
                        this.q.setVisibility(0);
                        this.q.sendAccessibilityEvent(32);
                        if (this.q.getParent() instanceof View) {
                            r.a0((View) this.q.getParent());
                        }
                    }
                    if (this.r != null) {
                        this.g.getDecorView().post(this.s);
                    }
                } else {
                    this.p = null;
                }
            }
        }
        b.a.n.b bVar2 = this.p;
        if (bVar2 != null && (dVar2 = this.i) != null) {
            dVar2.f(bVar2);
        }
        return this.p;
    }

    public boolean E() {
        return F(true);
    }

    int I0(int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.q;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.q.getLayoutParams();
            if (this.q.isShown()) {
                if (this.Y == null) {
                    this.Y = new Rect();
                    this.Z = new Rect();
                }
                Rect rect = this.Y;
                Rect rect2 = this.Z;
                rect.set(0, i2, 0, 0);
                c1.a(this.w, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i2 : 0)) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.y;
                    if (view == null) {
                        View view2 = new View(this.f);
                        this.y = view2;
                        view2.setBackgroundColor(this.f.getResources().getColor(b.a.c.abc_input_method_navigation_guard));
                        this.w.addView(this.y, -1, new ViewGroup.LayoutParams(-1, i2));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.y.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = this.y != null;
                if (!this.D && z) {
                    i2 = 0;
                }
                boolean z3 = z;
                z = z2;
                z = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z = false;
            }
            if (z) {
                this.q.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.y;
        if (view3 != null) {
            view3.setVisibility(z ? 0 : 8);
        }
        return i2;
    }

    void J(int i2, o oVar, Menu menu) {
        if (menu == null) {
            if (oVar == null && i2 >= 0) {
                o[] oVarArr = this.H;
                if (i2 < oVarArr.length) {
                    oVar = oVarArr[i2];
                }
            }
            if (oVar != null) {
                menu = oVar.j;
            }
        }
        if ((oVar == null || oVar.o) && !this.N) {
            this.h.a().onPanelClosed(i2, menu);
        }
    }

    void K(androidx.appcompat.view.menu.g gVar) {
        if (this.G) {
            return;
        }
        this.G = true;
        this.m.l();
        Window.Callback callbackC0 = c0();
        if (callbackC0 != null && !this.N) {
            callbackC0.onPanelClosed(108, gVar);
        }
        this.G = false;
    }

    void M(int i2) {
        N(a0(i2, true), true);
    }

    void N(o oVar, boolean z) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (z && oVar.a == 0 && (c0Var = this.m) != null && c0Var.c()) {
            K(oVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f.getSystemService("window");
        if (windowManager != null && oVar.o && (viewGroup = oVar.g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                J(oVar.a, oVar, null);
            }
        }
        oVar.m = false;
        oVar.n = false;
        oVar.o = false;
        oVar.h = null;
        oVar.q = true;
        if (this.I == oVar) {
            this.I = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View P(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        AppCompatViewInflater appCompatViewInflater;
        boolean zB0 = false;
        if (this.a0 == null) {
            String string = this.f.obtainStyledAttributes(b.a.j.AppCompatTheme).getString(b.a.j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.a0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    appCompatViewInflater = new AppCompatViewInflater();
                }
            }
            this.a0 = appCompatViewInflater;
        }
        if (c0) {
            if (!(attributeSet instanceof XmlPullParser)) {
                zB0 = B0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                zB0 = true;
            }
            z = zB0;
        } else {
            z = false;
        }
        return this.a0.createView(view, str, context, attributeSet, z, c0, true, b1.b());
    }

    void Q() {
        androidx.appcompat.view.menu.g gVar;
        c0 c0Var = this.m;
        if (c0Var != null) {
            c0Var.l();
        }
        if (this.r != null) {
            this.g.getDecorView().removeCallbacks(this.s);
            if (this.r.isShowing()) {
                try {
                    this.r.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.r = null;
        }
        T();
        o oVarA0 = a0(0, false);
        if (oVarA0 == null || (gVar = oVarA0.j) == null) {
            return;
        }
        gVar.close();
    }

    boolean R(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.e;
        if (((obj instanceof d.a) || (obj instanceof androidx.appcompat.app.g)) && (decorView = this.g.getDecorView()) != null && b.g.l.d.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.h.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m0(keyCode, keyEvent) : p0(keyCode, keyEvent);
    }

    void S(int i2) {
        o oVarA0;
        o oVarA02 = a0(i2, true);
        if (oVarA02.j != null) {
            Bundle bundle = new Bundle();
            oVarA02.j.Q(bundle);
            if (bundle.size() > 0) {
                oVarA02.s = bundle;
            }
            oVarA02.j.d0();
            oVarA02.j.clear();
        }
        oVarA02.r = true;
        oVarA02.q = true;
        if ((i2 != 108 && i2 != 0) || this.m == null || (oVarA0 = a0(0, false)) == null) {
            return;
        }
        oVarA0.m = false;
        x0(oVarA0, null);
    }

    void T() {
        v vVar = this.t;
        if (vVar != null) {
            vVar.b();
        }
    }

    o W(Menu menu) {
        o[] oVarArr = this.H;
        int length = oVarArr != null ? oVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            o oVar = oVarArr[i2];
            if (oVar != null && oVar.j == menu) {
                return oVar;
            }
        }
        return null;
    }

    final Context X() {
        androidx.appcompat.app.a aVarK = k();
        Context contextK = aVarK != null ? aVarK.k() : null;
        return contextK == null ? this.f : contextK;
    }

    final l Z() {
        if (this.S == null) {
            this.S = new m(androidx.appcompat.app.j.a(this.f));
        }
        return this.S;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        o oVarW;
        Window.Callback callbackC0 = c0();
        if (callbackC0 == null || this.N || (oVarW = W(gVar.D())) == null) {
            return false;
        }
        return callbackC0.onMenuItemSelected(oVarW.a, menuItem);
    }

    protected o a0(int i2, boolean z) {
        o[] oVarArr = this.H;
        if (oVarArr == null || oVarArr.length <= i2) {
            o[] oVarArr2 = new o[i2 + 1];
            if (oVarArr != null) {
                System.arraycopy(oVarArr, 0, oVarArr2, 0, oVarArr.length);
            }
            this.H = oVarArr2;
            oVarArr = oVarArr2;
        }
        o oVar = oVarArr[i2];
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(i2);
        oVarArr[i2] = oVar2;
        return oVar2;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        y0(gVar, true);
    }

    final CharSequence b0() {
        Object obj = this.e;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.l;
    }

    @Override // androidx.appcompat.app.e
    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        U();
        ((ViewGroup) this.w.findViewById(R.id.content)).addView(view, layoutParams);
        this.h.a().onContentChanged();
    }

    final Window.Callback c0() {
        return this.g.getCallback();
    }

    @Override // androidx.appcompat.app.e
    public void d(Context context) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        F(false);
        this.K = true;
    }

    @Override // androidx.appcompat.app.e
    public <T extends View> T g(int i2) {
        U();
        return (T) this.g.findViewById(i2);
    }

    @Override // androidx.appcompat.app.e
    public int i() {
        return this.O;
    }

    @Override // androidx.appcompat.app.e
    public MenuInflater j() {
        if (this.k == null) {
            d0();
            androidx.appcompat.app.a aVar = this.j;
            this.k = new b.a.n.g(aVar != null ? aVar.k() : this.f);
        }
        return this.k;
    }

    public boolean j0() {
        return this.u;
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.app.a k() {
        d0();
        return this.j;
    }

    int k0(int i2) {
        l lVarZ;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    lVarZ = Y();
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                    return -1;
                }
                lVarZ = Z();
            }
            return lVarZ.c();
        }
        return i2;
    }

    @Override // androidx.appcompat.app.e
    public void l() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f);
        if (layoutInflaterFrom.getFactory() == null) {
            b.g.l.e.b(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof f) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    boolean l0() {
        b.a.n.b bVar = this.p;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a aVarK = k();
        return aVarK != null && aVarK.h();
    }

    @Override // androidx.appcompat.app.e
    public void m() {
        androidx.appcompat.app.a aVarK = k();
        if (aVarK == null || !aVarK.m()) {
            h0(0);
        }
    }

    boolean m0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.J = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            n0(0, keyEvent);
            return true;
        }
        return false;
    }

    boolean o0(int i2, KeyEvent keyEvent) {
        androidx.appcompat.app.a aVarK = k();
        if (aVarK != null && aVarK.p(i2, keyEvent)) {
            return true;
        }
        o oVar = this.I;
        if (oVar != null && w0(oVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            o oVar2 = this.I;
            if (oVar2 != null) {
                oVar2.n = true;
            }
            return true;
        }
        if (this.I == null) {
            o oVarA0 = a0(0, true);
            x0(oVarA0, keyEvent);
            boolean zW0 = w0(oVarA0, keyEvent.getKeyCode(), keyEvent, 1);
            oVarA0.m = false;
            if (zW0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return P(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.e
    public void p(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        androidx.appcompat.app.a aVarK;
        if (this.B && this.v && (aVarK = k()) != null) {
            aVarK.n(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.f);
        F(false);
    }

    boolean p0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z = this.J;
            this.J = false;
            o oVarA0 = a0(0, false);
            if (oVarA0 != null && oVarA0.o) {
                if (!z) {
                    N(oVarA0, true);
                }
                return true;
            }
            if (l0()) {
                return true;
            }
        } else if (i2 == 82) {
            q0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public void q(Bundle bundle) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        this.K = true;
        F(false);
        V();
        Object obj = this.e;
        if (obj instanceof Activity) {
            String strC = null;
            try {
                strC = androidx.core.app.e.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (strC != null) {
                androidx.appcompat.app.a aVarV0 = v0();
                if (aVarV0 == null) {
                    this.X = true;
                } else {
                    aVarV0.s(true);
                }
            }
        }
        this.L = true;
    }

    @Override // androidx.appcompat.app.e
    public void r() {
        androidx.appcompat.app.e.o(this);
        if (this.U) {
            this.g.getDecorView().removeCallbacks(this.W);
        }
        this.M = false;
        this.N = true;
        androidx.appcompat.app.a aVar = this.j;
        if (aVar != null) {
            aVar.o();
        }
        L();
    }

    void r0(int i2) {
        androidx.appcompat.app.a aVarK;
        if (i2 != 108 || (aVarK = k()) == null) {
            return;
        }
        aVarK.i(true);
    }

    @Override // androidx.appcompat.app.e
    public void s(Bundle bundle) {
        U();
    }

    void s0(int i2) {
        if (i2 == 108) {
            androidx.appcompat.app.a aVarK = k();
            if (aVarK != null) {
                aVarK.i(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            o oVarA0 = a0(i2, true);
            if (oVarA0.o) {
                N(oVarA0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.e
    public void t() {
        androidx.appcompat.app.a aVarK = k();
        if (aVarK != null) {
            aVarK.u(true);
        }
    }

    void t0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.e
    public void u(Bundle bundle) {
        if (this.O != -100) {
            b0.put(this.e.getClass(), Integer.valueOf(this.O));
        }
    }

    @Override // androidx.appcompat.app.e
    public void v() {
        this.M = true;
        E();
        androidx.appcompat.app.e.n(this);
    }

    final androidx.appcompat.app.a v0() {
        return this.j;
    }

    @Override // androidx.appcompat.app.e
    public void w() {
        this.M = false;
        androidx.appcompat.app.e.o(this);
        androidx.appcompat.app.a aVarK = k();
        if (aVarK != null) {
            aVarK.u(false);
        }
        if (this.e instanceof Dialog) {
            L();
        }
    }

    @Override // androidx.appcompat.app.e
    public boolean y(int i2) {
        int iZ0 = z0(i2);
        if (this.F && iZ0 == 108) {
            return false;
        }
        if (this.B && iZ0 == 1) {
            this.B = false;
        }
        if (iZ0 == 1) {
            E0();
            this.F = true;
            return true;
        }
        if (iZ0 == 2) {
            E0();
            this.z = true;
            return true;
        }
        if (iZ0 == 5) {
            E0();
            this.A = true;
            return true;
        }
        if (iZ0 == 10) {
            E0();
            this.D = true;
            return true;
        }
        if (iZ0 == 108) {
            E0();
            this.B = true;
            return true;
        }
        if (iZ0 != 109) {
            return this.g.requestFeature(iZ0);
        }
        E0();
        this.C = true;
        return true;
    }

    @Override // androidx.appcompat.app.e
    public void z(int i2) {
        U();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f).inflate(i2, viewGroup);
        this.h.a().onContentChanged();
    }
}

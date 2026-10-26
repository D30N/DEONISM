package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.facebook.ads.AdError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class j0 implements androidx.appcompat.view.menu.p {
    private static Method G;
    private static Method H;
    private static Method I;
    private final b A;
    final Handler B;
    private final Rect C;
    private Rect D;
    private boolean E;
    PopupWindow F;

    /* renamed from: b, reason: collision with root package name */
    private Context f241b;

    /* renamed from: c, reason: collision with root package name */
    private ListAdapter f242c;

    /* renamed from: d, reason: collision with root package name */
    f0 f243d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private boolean n;
    private boolean o;
    int p;
    private View q;
    private int r;
    private DataSetObserver s;
    private View t;
    private Drawable u;
    private AdapterView.OnItemClickListener v;
    private AdapterView.OnItemSelectedListener w;
    final f x;
    private final e y;
    private final d z;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            f0 f0Var;
            if (i == -1 || (f0Var = j0.this.f243d) == null) {
                return;
            }
            f0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j0.this.q();
        }
    }

    private class c extends DataSetObserver {
        c() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (j0.this.b()) {
                j0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            j0.this.dismiss();
        }
    }

    private class d implements AbsListView.OnScrollListener {
        d() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || j0.this.v() || j0.this.F.getContentView() == null) {
                return;
            }
            j0 j0Var = j0.this;
            j0Var.B.removeCallbacks(j0Var.x);
            j0.this.x.run();
        }
    }

    private class e implements View.OnTouchListener {
        e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = j0.this.F) != null && popupWindow.isShowing() && x >= 0 && x < j0.this.F.getWidth() && y >= 0 && y < j0.this.F.getHeight()) {
                j0 j0Var = j0.this;
                j0Var.B.postDelayed(j0Var.x, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            j0 j0Var2 = j0.this;
            j0Var2.B.removeCallbacks(j0Var2.x);
            return false;
        }
    }

    private class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = j0.this.f243d;
            if (f0Var == null || !b.g.l.r.I(f0Var) || j0.this.f243d.getCount() <= j0.this.f243d.getChildCount()) {
                return;
            }
            int childCount = j0.this.f243d.getChildCount();
            j0 j0Var = j0.this;
            if (childCount <= j0Var.p) {
                j0Var.F.setInputMethodMode(2);
                j0.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public j0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public j0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.e = -2;
        this.f = -2;
        this.i = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        this.m = 0;
        this.n = false;
        this.o = false;
        this.p = Integer.MAX_VALUE;
        this.r = 0;
        this.x = new f();
        this.y = new e();
        this.z = new d();
        this.A = new b();
        this.C = new Rect();
        this.f241b = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a.j.ListPopupWindow, i, i2);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(b.a.j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(b.a.j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.j = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        q qVar = new q(context, attributeSet, i, i2);
        this.F = qVar;
        qVar.setInputMethodMode(1);
    }

    private void I(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT > 28) {
            this.F.setIsClippedToScreen(z);
            return;
        }
        Method method = G;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0124 A[PHI: r1
      0x0124: PHI (r1v1 int) = (r1v0 int), (r1v6 int) binds: [B:45:0x0119, B:47:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int p() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j0.p():int");
    }

    private int t(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.F.getMaxAvailableHeight(view, i, z);
        }
        Method method = H;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.F, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.F.getMaxAvailableHeight(view, i);
    }

    private void x() {
        View view = this.q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.q);
            }
        }
    }

    public void A(int i) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            L(i);
            return;
        }
        background.getPadding(this.C);
        Rect rect = this.C;
        this.f = rect.left + rect.right + i;
    }

    public void B(int i) {
        this.m = i;
    }

    public void C(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void D(int i) {
        this.F.setInputMethodMode(i);
    }

    public void E(boolean z) {
        this.E = z;
        this.F.setFocusable(z);
    }

    public void F(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void G(AdapterView.OnItemClickListener onItemClickListener) {
        this.v = onItemClickListener;
    }

    public void H(boolean z) {
        this.l = true;
        this.k = z;
    }

    public void J(int i) {
        this.r = i;
    }

    public void K(int i) {
        f0 f0Var = this.f243d;
        if (!b() || f0Var == null) {
            return;
        }
        f0Var.setListSelectionHidden(false);
        f0Var.setSelection(i);
        if (f0Var.getChoiceMode() != 0) {
            f0Var.setItemChecked(i, true);
        }
    }

    public void L(int i) {
        this.f = i;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return this.F.isShowing();
    }

    public void c(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public void d(int i) {
        this.g = i;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        this.F.dismiss();
        x();
        this.F.setContentView(null);
        this.f243d = null;
        this.B.removeCallbacks(this.x);
    }

    public int e() {
        return this.g;
    }

    public int g() {
        if (this.j) {
            return this.h;
        }
        return 0;
    }

    public Drawable i() {
        return this.F.getBackground();
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView k() {
        return this.f243d;
    }

    public void m(int i) {
        this.h = i;
        this.j = true;
    }

    public void n(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.s;
        if (dataSetObserver == null) {
            this.s = new c();
        } else {
            ListAdapter listAdapter2 = this.f242c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f242c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        f0 f0Var = this.f243d;
        if (f0Var != null) {
            f0Var.setAdapter(this.f242c);
        }
    }

    public void q() {
        f0 f0Var = this.f243d;
        if (f0Var != null) {
            f0Var.setListSelectionHidden(true);
            f0Var.requestLayout();
        }
    }

    f0 r(Context context, boolean z) {
        return new f0(context, z);
    }

    public View s() {
        return this.t;
    }

    @Override // androidx.appcompat.view.menu.p
    public void show() {
        int iP = p();
        boolean zV = v();
        androidx.core.widget.h.b(this.F, this.i);
        if (this.F.isShowing()) {
            if (b.g.l.r.I(s())) {
                int width = this.f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = s().getWidth();
                }
                int i = this.e;
                if (i == -1) {
                    if (!zV) {
                        iP = -1;
                    }
                    if (zV) {
                        this.F.setWidth(this.f == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.f == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i != -2) {
                    iP = i;
                }
                this.F.setOutsideTouchable((this.o || this.n) ? false : true);
                this.F.update(s(), this.g, this.h, width < 0 ? -1 : width, iP < 0 ? -1 : iP);
                return;
            }
            return;
        }
        int width2 = this.f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = s().getWidth();
        }
        int i2 = this.e;
        if (i2 == -1) {
            iP = -1;
        } else if (i2 != -2) {
            iP = i2;
        }
        this.F.setWidth(width2);
        this.F.setHeight(iP);
        I(true);
        this.F.setOutsideTouchable((this.o || this.n) ? false : true);
        this.F.setTouchInterceptor(this.y);
        if (this.l) {
            androidx.core.widget.h.a(this.F, this.k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = I;
            if (method != null) {
                try {
                    method.invoke(this.F, this.D);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.F.setEpicenterBounds(this.D);
        }
        androidx.core.widget.h.c(this.F, s(), this.g, this.h, this.m);
        this.f243d.setSelection(-1);
        if (!this.E || this.f243d.isInTouchMode()) {
            q();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.A);
    }

    public int u() {
        return this.f;
    }

    public boolean v() {
        return this.F.getInputMethodMode() == 2;
    }

    public boolean w() {
        return this.E;
    }

    public void y(View view) {
        this.t = view;
    }

    public void z(int i) {
        this.F.setAnimationStyle(i);
    }
}

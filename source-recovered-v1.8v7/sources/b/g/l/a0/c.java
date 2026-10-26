package b.g.l.a0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import b.g.l.a0.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private static int f914d;
    private final AccessibilityNodeInfo a;

    /* renamed from: b, reason: collision with root package name */
    public int f915b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f916c = -1;

    public static class a {
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        final Object a;

        /* renamed from: b, reason: collision with root package name */
        private final int f917b;

        /* renamed from: c, reason: collision with root package name */
        private final Class<? extends f.a> f918c;

        /* renamed from: d, reason: collision with root package name */
        protected final f f919d;

        static {
            new a(1, null);
            new a(2, null);
            new a(4, null);
            new a(8, null);
            e = new a(16, null);
            new a(32, null);
            new a(64, null);
            new a(128, null);
            new a(256, null, f.b.class);
            new a(512, null, f.b.class);
            new a(1024, null, f.c.class);
            new a(2048, null, f.c.class);
            new a(4096, null);
            new a(8192, null);
            new a(16384, null);
            new a(32768, null);
            new a(65536, null);
            new a(131072, null, f.g.class);
            f = new a(262144, null);
            g = new a(524288, null);
            h = new a(1048576, null);
            new a(2097152, null, f.h.class);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, f.e.class);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
            new a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, f.C0032f.class);
            new a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, f.d.class);
            new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        }

        public a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        private a(int i, CharSequence charSequence, Class<? extends f.a> cls) {
            this(null, i, charSequence, null, cls);
        }

        a(Object obj, int i, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.f917b = i;
            this.f919d = fVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.a = obj;
            this.f918c = cls;
        }

        public a a(CharSequence charSequence, f fVar) {
            return new a(null, this.f917b, charSequence, fVar, this.f918c);
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
            }
            return 0;
        }

        public boolean c(View view, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            f.a aVarNewInstance;
            if (this.f919d == null) {
                return false;
            }
            f.a aVar = null;
            Class<? extends f.a> cls = this.f918c;
            if (cls != null) {
                try {
                    aVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    aVarNewInstance.a(bundle);
                    aVar = aVarNewInstance;
                } catch (Exception e3) {
                    e = e3;
                    aVar = aVarNewInstance;
                    Class<? extends f.a> cls2 = this.f918c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    return this.f919d.a(view, aVar);
                }
            }
            return this.f919d.a(view, aVar);
        }
    }

    public static class b {
        final Object a;

        b(Object obj) {
            this.a = obj;
        }

        public static b a(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            return i4 >= 21 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : i4 >= 19 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new b(null);
        }
    }

    /* renamed from: b.g.l.a0.c$c, reason: collision with other inner class name */
    public static class C0031c {
        final Object a;

        C0031c(Object obj) {
            this.a = obj;
        }

        public static C0031c a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new C0031c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : i5 >= 19 ? new C0031c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C0031c(null);
        }
    }

    private c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    public static c J() {
        return s0(AccessibilityNodeInfo.obtain());
    }

    public static c K(View view) {
        return s0(AccessibilityNodeInfo.obtain(view));
    }

    public static c L(c cVar) {
        return s0(AccessibilityNodeInfo.obtain(cVar.a));
    }

    private void O(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayT = t(view);
        if (sparseArrayT != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < sparseArrayT.size(); i++) {
                if (sparseArrayT.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                sparseArrayT.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    private void Q(int i, boolean z) {
        Bundle bundleQ = q();
        if (bundleQ != null) {
            int i2 = bundleQ.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ (-1));
            if (!z) {
                i = 0;
            }
            bundleQ.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    private void d(ClickableSpan clickableSpan, Spanned spanned, int i) {
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    private void f() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private List<Integer> g(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private static String h(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    private boolean j(int i) {
        Bundle bundleQ = q();
        return bundleQ != null && (bundleQ.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public static ClickableSpan[] o(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> r(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayT = t(view);
        if (sparseArrayT != null) {
            return sparseArrayT;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(b.g.b.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    public static c s0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    private SparseArray<WeakReference<ClickableSpan>> t(View view) {
        return (SparseArray) view.getTag(b.g.b.tag_accessibility_clickable_spans);
    }

    private boolean w() {
        return !g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int x(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f914d;
        f914d = i2 + 1;
        return i2;
    }

    public boolean A() {
        return this.a.isClickable();
    }

    public boolean B() {
        return this.a.isEnabled();
    }

    public boolean C() {
        return this.a.isFocusable();
    }

    public boolean D() {
        return this.a.isFocused();
    }

    public boolean E() {
        return this.a.isLongClickable();
    }

    public boolean F() {
        return this.a.isPassword();
    }

    public boolean G() {
        return this.a.isScrollable();
    }

    public boolean H() {
        return this.a.isSelected();
    }

    public boolean I() {
        return Build.VERSION.SDK_INT >= 26 ? this.a.isShowingHintText() : j(4);
    }

    public boolean M(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.a.performAction(i, bundle);
        }
        return false;
    }

    public void N() {
        this.a.recycle();
    }

    public void P(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setAccessibilityFocused(z);
        }
    }

    public void R(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public void S(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public void T(boolean z) {
        this.a.setCheckable(z);
    }

    public void U(boolean z) {
        this.a.setChecked(z);
    }

    public void V(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public void W(boolean z) {
        this.a.setClickable(z);
    }

    public void X(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).a);
        }
    }

    public void Y(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0031c) obj).a);
        }
    }

    public void Z(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public void a(int i) {
        this.a.addAction(i);
    }

    public void a0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setContentInvalid(z);
        }
    }

    public void b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
        }
    }

    public void b0(boolean z) {
        this.a.setEnabled(z);
    }

    public void c(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.addChild(view, i);
        }
    }

    public void c0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.setError(charSequence);
        }
    }

    public void d0(boolean z) {
        this.a.setFocusable(z);
    }

    public void e(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i < 19 || i >= 26) {
            return;
        }
        f();
        O(view);
        ClickableSpan[] clickableSpanArrO = o(charSequence);
        if (clickableSpanArrO == null || clickableSpanArrO.length <= 0) {
            return;
        }
        q().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", b.g.b.accessibility_action_clickable_span);
        SparseArray<WeakReference<ClickableSpan>> sparseArrayR = r(view);
        for (int i2 = 0; clickableSpanArrO != null && i2 < clickableSpanArrO.length; i2++) {
            int iX = x(clickableSpanArrO[i2], sparseArrayR);
            sparseArrayR.put(iX, new WeakReference<>(clickableSpanArrO[i2]));
            d(clickableSpanArrO[i2], (Spanned) charSequence, iX);
        }
    }

    public void e0(boolean z) {
        this.a.setFocused(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (cVar.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.a)) {
            return false;
        }
        return this.f916c == cVar.f916c && this.f915b == cVar.f915b;
    }

    public void f0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setHeading(z);
        } else {
            Q(2, z);
        }
    }

    public void g0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.a.setHintText(charSequence);
        } else if (i >= 19) {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void h0(CharSequence charSequence) {
        this.a.setPackageName(charSequence);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public int i() {
        return this.a.getActions();
    }

    public void i0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void j0(View view) {
        this.f915b = -1;
        this.a.setParent(view);
    }

    public void k(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public void k0(View view, int i) {
        this.f915b = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setParent(view, i);
        }
    }

    public void l(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public void l0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setScreenReaderFocusable(z);
        } else {
            Q(1, z);
        }
    }

    public int m() {
        return this.a.getChildCount();
    }

    public void m0(boolean z) {
        this.a.setScrollable(z);
    }

    public CharSequence n() {
        return this.a.getClassName();
    }

    public void n0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setShowingHintText(z);
        } else {
            Q(4, z);
        }
    }

    public void o0(View view, int i) {
        this.f916c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setSource(view, i);
        }
    }

    public CharSequence p() {
        return this.a.getContentDescription();
    }

    public void p0(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public Bundle q() {
        return Build.VERSION.SDK_INT >= 19 ? this.a.getExtras() : new Bundle();
    }

    public void q0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setVisibleToUser(z);
        }
    }

    public AccessibilityNodeInfo r0() {
        return this.a;
    }

    public CharSequence s() {
        return this.a.getPackageName();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        k(rect);
        sb.append("; boundsInParent: " + rect);
        l(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(s());
        sb.append("; className: ");
        sb.append(n());
        sb.append("; text: ");
        sb.append(u());
        sb.append("; contentDescription: ");
        sb.append(p());
        sb.append("; viewId: ");
        sb.append(v());
        sb.append("; checkable: ");
        sb.append(y());
        sb.append("; checked: ");
        sb.append(z());
        sb.append("; focusable: ");
        sb.append(C());
        sb.append("; focused: ");
        sb.append(D());
        sb.append("; selected: ");
        sb.append(H());
        sb.append("; clickable: ");
        sb.append(A());
        sb.append("; longClickable: ");
        sb.append(E());
        sb.append("; enabled: ");
        sb.append(B());
        sb.append("; password: ");
        sb.append(F());
        sb.append("; scrollable: " + G());
        sb.append("; [");
        int i = i();
        while (i != 0) {
            int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i);
            i &= iNumberOfTrailingZeros ^ (-1);
            sb.append(h(iNumberOfTrailingZeros));
            if (i != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public CharSequence u() {
        if (!w()) {
            return this.a.getText();
        }
        List<Integer> listG = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listG2 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listG3 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listG4 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
        for (int i = 0; i < listG.size(); i++) {
            spannableString.setSpan(new b.g.l.a0.a(listG4.get(i).intValue(), this, q().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listG.get(i).intValue(), listG2.get(i).intValue(), listG3.get(i).intValue());
        }
        return spannableString;
    }

    public String v() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.a.getViewIdResourceName();
        }
        return null;
    }

    public boolean y() {
        return this.a.isCheckable();
    }

    public boolean z() {
        return this.a.isChecked();
    }
}

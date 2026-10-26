package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.i0;

/* loaded from: classes.dex */
public class p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: b, reason: collision with root package name */
    Runnable f267b;

    /* renamed from: c, reason: collision with root package name */
    private c f268c;

    /* renamed from: d, reason: collision with root package name */
    i0 f269d;
    private Spinner e;
    private boolean f;
    int g;
    int h;
    private int i;
    private int j;

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f270b;

        a(View view) {
            this.f270b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            p0.this.smoothScrollTo(this.f270b.getLeft() - ((p0.this.getWidth() - this.f270b.getWidth()) / 2), 0);
            p0.this.f267b = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return p0.this.f269d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((d) p0.this.f269d.getChildAt(i)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return p0.this.c((a.c) getItem(i), true);
            }
            ((d) view).a((a.c) getItem(i));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = p0.this.f269d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = p0.this.f269d.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class d extends LinearLayout {

        /* renamed from: b, reason: collision with root package name */
        private final int[] f274b;

        /* renamed from: c, reason: collision with root package name */
        private a.c f275c;

        /* renamed from: d, reason: collision with root package name */
        private TextView f276d;
        private ImageView e;
        private View f;

        public d(Context context, a.c cVar, boolean z) {
            super(context, null, b.a.a.actionBarTabStyle);
            int[] iArr = {R.attr.background};
            this.f274b = iArr;
            this.f275c = cVar;
            w0 w0VarU = w0.u(context, null, iArr, b.a.a.actionBarTabStyle, 0);
            if (w0VarU.r(0)) {
                setBackgroundDrawable(w0VarU.g(0));
            }
            w0VarU.v();
            if (z) {
                setGravity(8388627);
            }
            c();
        }

        public void a(a.c cVar) {
            this.f275c = cVar;
            c();
        }

        public a.c b() {
            return this.f275c;
        }

        public void c() {
            a.c cVar = this.f275c;
            View viewB = cVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f = viewB;
                TextView textView = this.f276d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f;
            if (view != null) {
                removeView(view);
                this.f = null;
            }
            Drawable drawableC = cVar.c();
            CharSequence charSequenceD = cVar.d();
            if (drawableC != null) {
                if (this.e == null) {
                    o oVar = new o(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    oVar.setLayoutParams(layoutParams);
                    addView(oVar, 0);
                    this.e = oVar;
                }
                this.e.setImageDrawable(drawableC);
                this.e.setVisibility(0);
            } else {
                ImageView imageView2 = this.e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.e.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequenceD);
            if (z) {
                if (this.f276d == null) {
                    z zVar = new z(getContext(), null, b.a.a.actionBarTabTextStyle);
                    zVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    zVar.setLayoutParams(layoutParams2);
                    addView(zVar);
                    this.f276d = zVar;
                }
                this.f276d.setText(charSequenceD);
                this.f276d.setVisibility(0);
            } else {
                TextView textView2 = this.f276d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f276d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            y0.a(this, z ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (p0.this.g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = p0.this.g;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    private Spinner b() {
        w wVar = new w(getContext(), null, b.a.a.actionDropDownStyle);
        wVar.setLayoutParams(new i0.a(-2, -1));
        wVar.setOnItemSelectedListener(this);
        return wVar;
    }

    private boolean d() {
        Spinner spinner = this.e;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.e == null) {
            this.e = b();
        }
        removeView(this.f269d);
        addView(this.e, new ViewGroup.LayoutParams(-2, -1));
        if (this.e.getAdapter() == null) {
            this.e.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f267b;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f267b = null;
        }
        this.e.setSelection(this.j);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.e);
        addView(this.f269d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.e.getSelectedItemPosition());
        return false;
    }

    public void a(int i) {
        View childAt = this.f269d.getChildAt(i);
        Runnable runnable = this.f267b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f267b = aVar;
        post(aVar);
    }

    d c(a.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.i));
        } else {
            dVar.setFocusable(true);
            if (this.f268c == null) {
                this.f268c = new c();
            }
            dVar.setOnClickListener(this.f268c);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f267b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b.a.n.a aVarB = b.a.n.a.b(getContext());
        setContentHeight(aVarB.f());
        this.h = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f267b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((d) view).b().e();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r8 = android.view.View.MeasureSpec.getMode(r7)
            r0 = 1
            r1 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r8 != r2) goto Lc
            r3 = 1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            r6.setFillViewport(r3)
            androidx.appcompat.widget.i0 r4 = r6.f269d
            int r4 = r4.getChildCount()
            if (r4 <= r0) goto L3f
            if (r8 == r2) goto L1e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != r5) goto L3f
        L1e:
            r8 = 2
            if (r4 <= r8) goto L2f
            int r8 = android.view.View.MeasureSpec.getSize(r7)
            float r8 = (float) r8
            r4 = 1053609165(0x3ecccccd, float:0.4)
            float r8 = r8 * r4
            int r8 = (int) r8
            r6.g = r8
            goto L36
        L2f:
            int r4 = android.view.View.MeasureSpec.getSize(r7)
            int r4 = r4 / r8
            r6.g = r4
        L36:
            int r8 = r6.g
            int r4 = r6.h
            int r8 = java.lang.Math.min(r8, r4)
            goto L40
        L3f:
            r8 = -1
        L40:
            r6.g = r8
            int r8 = r6.i
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2)
            if (r3 != 0) goto L4f
            boolean r2 = r6.f
            if (r2 == 0) goto L4f
            goto L50
        L4f:
            r0 = 0
        L50:
            if (r0 == 0) goto L67
            androidx.appcompat.widget.i0 r0 = r6.f269d
            r0.measure(r1, r8)
            androidx.appcompat.widget.i0 r0 = r6.f269d
            int r0 = r0.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            if (r0 <= r1) goto L67
            r6.e()
            goto L6a
        L67:
            r6.f()
        L6a:
            int r0 = r6.getMeasuredWidth()
            super.onMeasure(r7, r8)
            int r7 = r6.getMeasuredWidth()
            if (r3 == 0) goto L7e
            if (r0 == r7) goto L7e
            int r7 = r6.j
            r6.setTabSelected(r7)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.p0.onMeasure(int, int):void");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f = z;
    }

    public void setContentHeight(int i) {
        this.i = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.j = i;
        int childCount = this.f269d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f269d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                a(i);
            }
            i2++;
        }
        Spinner spinner = this.e;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}

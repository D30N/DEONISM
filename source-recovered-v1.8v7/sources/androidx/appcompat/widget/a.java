package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    protected final C0003a f188b;

    /* renamed from: c, reason: collision with root package name */
    protected final Context f189c;

    /* renamed from: d, reason: collision with root package name */
    protected ActionMenuView f190d;
    protected c e;
    protected int f;
    protected b.g.l.v g;
    private boolean h;
    private boolean i;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0003a implements b.g.l.w {
        private boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        int f191b;

        protected C0003a() {
        }

        @Override // b.g.l.w
        public void a(View view) {
            if (this.a) {
                return;
            }
            a aVar = a.this;
            aVar.g = null;
            a.super.setVisibility(this.f191b);
        }

        @Override // b.g.l.w
        public void b(View view) {
            a.super.setVisibility(0);
            this.a = false;
        }

        @Override // b.g.l.w
        public void c(View view) {
            this.a = true;
        }

        public C0003a d(b.g.l.v vVar, int i) {
            a.this.g = vVar;
            this.f191b = i;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f188b = new C0003a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(b.a.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f189c = context;
        } else {
            this.f189c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    protected int c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, RecyclerView.UNDEFINED_DURATION), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    protected int e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public b.g.l.v f(int i, long j) {
        b.g.l.v vVar = this.g;
        if (vVar != null) {
            vVar.b();
        }
        if (i != 0) {
            b.g.l.v vVarC = b.g.l.r.c(this);
            vVarC.a(0.0f);
            vVarC.d(j);
            C0003a c0003a = this.f188b;
            c0003a.d(vVarC, i);
            vVarC.f(c0003a);
            return vVarC;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        b.g.l.v vVarC2 = b.g.l.r.c(this);
        vVarC2.a(1.0f);
        vVarC2.d(j);
        C0003a c0003a2 = this.f188b;
        c0003a2.d(vVarC2, i);
        vVarC2.f(c0003a2);
        return vVarC2;
    }

    public int getAnimatedVisibility() {
        return this.g != null ? this.f188b.f191b : getVisibility();
    }

    public int getContentHeight() {
        return this.f;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, b.a.j.ActionBar, b.a.a.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(b.a.j.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        c cVar = this.e;
        if (cVar != null) {
            cVar.E(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.i = false;
        }
        if (!this.i) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = false;
        }
        if (!this.h) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            b.g.l.v vVar = this.g;
            if (vVar != null) {
                vVar.b();
            }
            super.setVisibility(i);
        }
    }
}

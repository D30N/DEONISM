package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.b;

/* loaded from: classes.dex */
public class w extends Spinner implements b.g.l.q {
    private static final int[] j = {R.attr.spinnerMode};

    /* renamed from: b, reason: collision with root package name */
    private final androidx.appcompat.widget.e f299b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f300c;

    /* renamed from: d, reason: collision with root package name */
    private h0 f301d;
    private SpinnerAdapter e;
    private final boolean f;
    private g g;
    int h;
    final Rect i;

    class a extends h0 {
        final /* synthetic */ e k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.k = eVar;
        }

        @Override // androidx.appcompat.widget.h0
        public androidx.appcompat.view.menu.p b() {
            return this.k;
        }

        @Override // androidx.appcompat.widget.h0
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (w.this.getInternalPopup().b()) {
                return true;
            }
            w.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!w.this.getInternalPopup().b()) {
                w.this.b();
            }
            ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
    }

    class c implements g, DialogInterface.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        androidx.appcompat.app.b f303b;

        /* renamed from: c, reason: collision with root package name */
        private ListAdapter f304c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f305d;

        c() {
        }

        @Override // androidx.appcompat.widget.w.g
        public boolean b() {
            androidx.appcompat.app.b bVar = this.f303b;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.w.g
        public void c(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.g
        public void d(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.g
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f303b;
            if (bVar != null) {
                bVar.dismiss();
                this.f303b = null;
            }
        }

        @Override // androidx.appcompat.widget.w.g
        public int e() {
            return 0;
        }

        @Override // androidx.appcompat.widget.w.g
        public void f(int i, int i2) {
            if (this.f304c == null) {
                return;
            }
            b.a aVar = new b.a(w.this.getPopupContext());
            CharSequence charSequence = this.f305d;
            if (charSequence != null) {
                aVar.l(charSequence);
            }
            aVar.k(this.f304c, w.this.getSelectedItemPosition(), this);
            androidx.appcompat.app.b bVarA = aVar.a();
            this.f303b = bVarA;
            ListView listViewE = bVarA.e();
            if (Build.VERSION.SDK_INT >= 17) {
                listViewE.setTextDirection(i);
                listViewE.setTextAlignment(i2);
            }
            this.f303b.show();
        }

        @Override // androidx.appcompat.widget.w.g
        public int g() {
            return 0;
        }

        @Override // androidx.appcompat.widget.w.g
        public Drawable i() {
            return null;
        }

        @Override // androidx.appcompat.widget.w.g
        public CharSequence j() {
            return this.f305d;
        }

        @Override // androidx.appcompat.widget.w.g
        public void l(CharSequence charSequence) {
            this.f305d = charSequence;
        }

        @Override // androidx.appcompat.widget.w.g
        public void m(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.g
        public void n(ListAdapter listAdapter) {
            this.f304c = listAdapter;
        }

        @Override // androidx.appcompat.widget.w.g
        public void o(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            w.this.setSelection(i);
            if (w.this.getOnItemClickListener() != null) {
                w.this.performItemClick(null, i, this.f304c.getItemId(i));
            }
            dismiss();
        }
    }

    private static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: b, reason: collision with root package name */
        private SpinnerAdapter f306b;

        /* renamed from: c, reason: collision with root package name */
        private ListAdapter f307c;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f306b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f307c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof s0) {
                    s0 s0Var = (s0) spinnerAdapter;
                    if (s0Var.getDropDownViewTheme() == null) {
                        s0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f307c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f306b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f306b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f306b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f306b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f306b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f307c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f306b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f306b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class e extends j0 implements g {
        private CharSequence J;
        ListAdapter K;
        private final Rect L;
        private int M;

        class a implements AdapterView.OnItemClickListener {
            a(w wVar) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                w.this.setSelection(i);
                if (w.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    w.this.performItemClick(view, i, eVar.K.getItemId(i));
                }
                e.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.P(w.this)) {
                    e.this.dismiss();
                } else {
                    e.this.N();
                    e.super.show();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f310b;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f310b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f310b);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.L = new Rect();
            y(w.this);
            E(true);
            J(0);
            G(new a(w.this));
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void N() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.i()
                r1 = 0
                if (r0 == 0) goto L26
                androidx.appcompat.widget.w r1 = androidx.appcompat.widget.w.this
                android.graphics.Rect r1 = r1.i
                r0.getPadding(r1)
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.w.this
                boolean r0 = androidx.appcompat.widget.c1.b(r0)
                if (r0 == 0) goto L1d
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.w.this
                android.graphics.Rect r0 = r0.i
                int r0 = r0.right
                goto L24
            L1d:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.w.this
                android.graphics.Rect r0 = r0.i
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.w.this
                android.graphics.Rect r0 = r0.i
                r0.right = r1
                r0.left = r1
            L2e:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.w.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.w r2 = androidx.appcompat.widget.w.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.w r3 = androidx.appcompat.widget.w.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.w r4 = androidx.appcompat.widget.w.this
                int r5 = r4.h
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.K
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.i()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.w r5 = androidx.appcompat.widget.w.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.w r6 = androidx.appcompat.widget.w.this
                android.graphics.Rect r6 = r6.i
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.A(r4)
                goto L85
            L82:
                r8.A(r5)
            L85:
                androidx.appcompat.widget.w r4 = androidx.appcompat.widget.w.this
                boolean r4 = androidx.appcompat.widget.c1.b(r4)
                if (r4 == 0) goto L9a
                int r3 = r3 - r2
                int r0 = r8.u()
                int r3 = r3 - r0
                int r0 = r8.O()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto La0
            L9a:
                int r2 = r8.O()
                int r0 = r0 + r2
                int r1 = r1 + r0
            La0:
                r8.d(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w.e.N():void");
        }

        public int O() {
            return this.M;
        }

        boolean P(View view) {
            return b.g.l.r.I(view) && view.getGlobalVisibleRect(this.L);
        }

        @Override // androidx.appcompat.widget.w.g
        public void f(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean zB = b();
            N();
            D(2);
            super.show();
            ListView listViewK = k();
            listViewK.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                listViewK.setTextDirection(i);
                listViewK.setTextAlignment(i2);
            }
            K(w.this.getSelectedItemPosition());
            if (zB || (viewTreeObserver = w.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            F(new c(bVar));
        }

        @Override // androidx.appcompat.widget.w.g
        public CharSequence j() {
            return this.J;
        }

        @Override // androidx.appcompat.widget.w.g
        public void l(CharSequence charSequence) {
            this.J = charSequence;
        }

        @Override // androidx.appcompat.widget.j0, androidx.appcompat.widget.w.g
        public void n(ListAdapter listAdapter) {
            super.n(listAdapter);
            this.K = listAdapter;
        }

        @Override // androidx.appcompat.widget.w.g
        public void o(int i) {
            this.M = i;
        }
    }

    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        boolean f312b;

        static class a implements Parcelable.Creator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        f(Parcel parcel) {
            super(parcel);
            this.f312b = parcel.readByte() != 0;
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f312b ? (byte) 1 : (byte) 0);
        }
    }

    interface g {
        boolean b();

        void c(Drawable drawable);

        void d(int i);

        void dismiss();

        int e();

        void f(int i, int i2);

        int g();

        Drawable i();

        CharSequence j();

        void l(CharSequence charSequence);

        void m(int i);

        void n(ListAdapter listAdapter);

        void o(int i);
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a.spinnerStyle);
    }

    public w(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public w(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[PHI: r10 r11
      0x0048: PHI (r10v2 int) = (r10v0 int), (r10v4 int) binds: [B:25:0x0059, B:16:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r11v7 android.content.res.TypedArray) = (r11v6 android.content.res.TypedArray), (r11v9 android.content.res.TypedArray) binds: [B:25:0x0059, B:16:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) throws java.lang.Throwable {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.i = r0
            int[] r0 = b.a.j.Spinner
            r1 = 0
            androidx.appcompat.widget.w0 r0 = androidx.appcompat.widget.w0.u(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f299b = r2
            if (r11 == 0) goto L22
            b.a.n.d r2 = new b.a.n.d
            r2.<init>(r7, r11)
        L1f:
            r6.f300c = r2
            goto L32
        L22:
            int r11 = b.a.j.Spinner_popupTheme
            int r11 = r0.n(r11, r1)
            if (r11 == 0) goto L30
            b.a.n.d r2 = new b.a.n.d
            r2.<init>(r7, r11)
            goto L1f
        L30:
            r6.f300c = r7
        L32:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L64
            int[] r11 = androidx.appcompat.widget.w.j     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            boolean r3 = r11.hasValue(r1)     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L5c
            if (r3 == 0) goto L46
            int r10 = r11.getInt(r1, r1)     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L5c
        L46:
            if (r11 == 0) goto L64
        L48:
            r11.recycle()
            goto L64
        L4c:
            r3 = move-exception
            goto L52
        L4e:
            r7 = move-exception
            goto L5e
        L50:
            r3 = move-exception
            r11 = r2
        L52:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L5c
            if (r11 == 0) goto L64
            goto L48
        L5c:
            r7 = move-exception
            r2 = r11
        L5e:
            if (r2 == 0) goto L63
            r2.recycle()
        L63:
            throw r7
        L64:
            r11 = 1
            if (r10 == 0) goto La1
            if (r10 == r11) goto L6a
            goto Lb1
        L6a:
            androidx.appcompat.widget.w$e r10 = new androidx.appcompat.widget.w$e
            android.content.Context r3 = r6.f300c
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f300c
            int[] r4 = b.a.j.Spinner
            androidx.appcompat.widget.w0 r1 = androidx.appcompat.widget.w0.u(r3, r8, r4, r9, r1)
            int r3 = b.a.j.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.m(r3, r4)
            r6.h = r3
            int r3 = b.a.j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.g(r3)
            r10.c(r3)
            int r3 = b.a.j.Spinner_android_prompt
            java.lang.String r3 = r0.o(r3)
            r10.l(r3)
            r1.v()
            r6.g = r10
            androidx.appcompat.widget.w$a r1 = new androidx.appcompat.widget.w$a
            r1.<init>(r6, r10)
            r6.f301d = r1
            goto Lb1
        La1:
            androidx.appcompat.widget.w$c r10 = new androidx.appcompat.widget.w$c
            r10.<init>()
            r6.g = r10
            int r1 = b.a.j.Spinner_android_prompt
            java.lang.String r1 = r0.o(r1)
            r10.l(r1)
        Lb1:
            int r10 = b.a.j.Spinner_android_entries
            java.lang.CharSequence[] r10 = r0.q(r10)
            if (r10 == 0) goto Lc9
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = b.a.g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter(r1)
        Lc9:
            r0.v()
            r6.f = r11
            android.widget.SpinnerAdapter r7 = r6.e
            if (r7 == 0) goto Ld7
            r6.setAdapter(r7)
            r6.e = r2
        Ld7:
            androidx.appcompat.widget.e r7 = r6.f299b
            r7.e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.i);
        Rect rect = this.i;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.g.f(getTextDirection(), getTextAlignment());
        } else {
            this.g.f(-1, -1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f299b;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.g;
        if (gVar != null) {
            return gVar.e();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.g;
        if (gVar != null) {
            return gVar.g();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.g != null) {
            return this.h;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    final g getInternalPopup() {
        return this.g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.g;
        if (gVar != null) {
            return gVar.i();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f300c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.g;
        return gVar != null ? gVar.j() : super.getPrompt();
    }

    @Override // b.g.l.q
    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f299b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // b.g.l.q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f299b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.g;
        if (gVar == null || !gVar.b()) {
            return;
        }
        this.g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.g == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.f312b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.g;
        fVar.f312b = gVar != null && gVar.b();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var = this.f301d;
        if (h0Var == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.g;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.b()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f) {
            this.e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.g != null) {
            Context context = this.f300c;
            if (context == null) {
                context = getContext();
            }
            this.g.n(new d(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f299b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        androidx.appcompat.widget.e eVar = this.f299b;
        if (eVar != null) {
            eVar.g(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        g gVar = this.g;
        if (gVar != null) {
            gVar.o(i);
            this.g.d(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        g gVar = this.g;
        if (gVar != null) {
            gVar.m(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.g != null) {
            this.h = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.g;
        if (gVar != null) {
            gVar.c(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(b.a.k.a.a.d(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.g;
        if (gVar != null) {
            gVar.l(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // b.g.l.q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f299b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // b.g.l.q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f299b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }
}

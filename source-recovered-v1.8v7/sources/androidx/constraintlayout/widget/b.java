package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import b.e.a.j.j;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: b, reason: collision with root package name */
    protected int[] f344b;

    /* renamed from: c, reason: collision with root package name */
    protected int f345c;

    /* renamed from: d, reason: collision with root package name */
    protected Context f346d;
    protected j e;
    protected boolean f;
    private String g;

    public b(Context context) throws IllegalAccessException, IllegalArgumentException {
        super(context);
        this.f344b = new int[32];
        this.f = false;
        this.f346d = context;
        b(null);
    }

    private void a(String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object objC;
        if (str == null || this.f346d == null) {
            return;
        }
        String strTrim = str.trim();
        try {
            iIntValue = g.class.getField(strTrim).getInt(null);
        } catch (Exception unused) {
            iIntValue = 0;
        }
        if (iIntValue == 0) {
            iIntValue = this.f346d.getResources().getIdentifier(strTrim, "id", this.f346d.getPackageName());
        }
        if (iIntValue == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (objC = ((ConstraintLayout) getParent()).c(0, strTrim)) != null && (objC instanceof Integer)) {
            iIntValue = ((Integer) objC).intValue();
        }
        if (iIntValue != 0) {
            setTag(iIntValue, null);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void setIds(String str) throws IllegalAccessException, IllegalArgumentException {
        if (str == null) {
            return;
        }
        int i = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    protected void b(AttributeSet attributeSet) throws IllegalAccessException, IllegalArgumentException {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == h.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.g = string;
                    setIds(string);
                }
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
    }

    public void d(ConstraintLayout constraintLayout) {
    }

    public void e(ConstraintLayout constraintLayout) throws IllegalAccessException, IllegalArgumentException {
        if (isInEditMode()) {
            setIds(this.g);
        }
        j jVar = this.e;
        if (jVar == null) {
            return;
        }
        jVar.J0();
        for (int i = 0; i < this.f345c; i++) {
            View viewE = constraintLayout.e(this.f344b[i]);
            if (viewE != null) {
                this.e.I0(constraintLayout.f(viewE));
            }
        }
    }

    public void f() {
        if (this.e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).k0 = this.e;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f344b, this.f345c);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f345c = 0;
        for (int i : iArr) {
            setTag(i, null);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        int i2 = this.f345c + 1;
        int[] iArr = this.f344b;
        if (i2 > iArr.length) {
            this.f344b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f344b;
        int i3 = this.f345c;
        iArr2[i3] = i;
        this.f345c = i3 + 1;
    }
}

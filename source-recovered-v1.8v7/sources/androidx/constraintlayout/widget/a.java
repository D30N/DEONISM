package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class a extends b {
    private int h;
    private int i;
    private b.e.a.j.b j;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.b
    protected void b(AttributeSet attributeSet) throws IllegalAccessException, IllegalArgumentException {
        super.b(attributeSet);
        this.j = new b.e.a.j.b();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == h.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == h.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.j.K0(typedArrayObtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.e = this.j;
        f();
    }

    public int getType() {
        return this.h;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.j.K0(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setType(int r7) {
        /*
            r6 = this;
            r6.h = r7
            r6.i = r7
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 6
            r2 = 5
            r3 = 0
            r4 = 1
            r5 = 17
            if (r0 >= r5) goto L18
            if (r7 != r2) goto L13
        L10:
            r6.i = r3
            goto L3b
        L13:
            if (r7 != r1) goto L3b
        L15:
            r6.i = r4
            goto L3b
        L18:
            android.content.res.Resources r7 = r6.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.getLayoutDirection()
            if (r4 != r7) goto L28
            r7 = 1
            goto L29
        L28:
            r7 = 0
        L29:
            if (r7 == 0) goto L33
            int r7 = r6.h
            if (r7 != r2) goto L30
            goto L15
        L30:
            if (r7 != r1) goto L3b
            goto L10
        L33:
            int r7 = r6.h
            if (r7 != r2) goto L38
            goto L10
        L38:
            if (r7 != r1) goto L3b
            goto L15
        L3b:
            b.e.a.j.b r7 = r6.j
            int r0 = r6.i
            r7.L0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.setType(int):void");
    }
}

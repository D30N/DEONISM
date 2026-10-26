package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: assets/audience_network.dex */
public final class NO extends ViewGroup {
    public static final int A01 = (int) (C0635Ly.A01 * 8.0f);
    public int A00;

    public NO(XI xi) {
        super(xi);
        setMotionEventSplittingEnabled(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        NO no = this;
        int childHeight = 0;
        int measuredWidth = 0;
        View childAt = null;
        int i5 = i3 - i;
        int paddingLeft = no.getPaddingLeft();
        int paddingTop = no.getPaddingTop();
        int i6 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    no = no;
                    if (i6 >= no.getChildCount()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    no = no;
                    childAt = no.getChildAt(i6);
                    measuredWidth = childAt.getMeasuredWidth();
                    childHeight = childAt.getMeasuredHeight();
                    if (paddingLeft + measuredWidth <= i5) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    no = no;
                    paddingLeft = no.getPaddingLeft();
                    paddingTop += no.A00;
                    c2 = 5;
                    break;
                case 5:
                    childAt = childAt;
                    childAt.layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, paddingTop + childHeight);
                    paddingLeft += A01 + measuredWidth;
                    i6++;
                    c2 = 2;
                    break;
                case 6:
                    return;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        NO no = this;
        int lineHeight = 0;
        int i3 = 0;
        int lines = 0;
        int size = (View.MeasureSpec.getSize(i) - no.getPaddingLeft()) - no.getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - no.getPaddingTop()) - no.getPaddingBottom();
        int paddingLeft = no.getPaddingLeft();
        int iMax = 0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, RecyclerView.UNDEFINED_DURATION);
        int childHeightMeasureSpec = no.getChildCount();
        int childHeightMeasureSpec2 = childHeightMeasureSpec > 0 ? 2 : 8;
        while (true) {
            switch (childHeightMeasureSpec2) {
                case 2:
                    i3 = 1;
                    childHeightMeasureSpec2 = 3;
                    break;
                case 3:
                    lines = 0;
                    childHeightMeasureSpec2 = 4;
                    break;
                case 4:
                    no = no;
                    int i4 = no.getChildCount();
                    if (lines >= i4) {
                        childHeightMeasureSpec2 = 9;
                        break;
                    } else {
                        childHeightMeasureSpec2 = 5;
                        break;
                    }
                case 5:
                    no = no;
                    View childAt = no.getChildAt(lines);
                    int childHeightMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, RecyclerView.UNDEFINED_DURATION);
                    childAt.measure(childHeightMeasureSpec3, iMakeMeasureSpec);
                    lineHeight = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    int childWidth = A01;
                    iMax = Math.max(iMax, measuredHeight + childWidth);
                    int childWidth2 = paddingLeft + lineHeight;
                    if (childWidth2 <= size) {
                        childHeightMeasureSpec2 = 7;
                        break;
                    } else {
                        childHeightMeasureSpec2 = 6;
                        break;
                    }
                case 6:
                    no = no;
                    i3++;
                    paddingLeft = no.getPaddingLeft();
                    childHeightMeasureSpec2 = 7;
                    break;
                case 7:
                    int i5 = A01;
                    paddingLeft += i5 + lineHeight;
                    lines++;
                    childHeightMeasureSpec2 = 4;
                    break;
                case 8:
                    i3 = 0;
                    childHeightMeasureSpec2 = 3;
                    break;
                case 9:
                    NO no2 = no;
                    no2.A00 = iMax;
                    no2.setMeasuredDimension(size, (no2.A00 * i3) + A01);
                    return;
            }
        }
    }
}

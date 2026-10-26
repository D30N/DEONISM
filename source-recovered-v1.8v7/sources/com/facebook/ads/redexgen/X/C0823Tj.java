package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Tj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0823Tj extends AnonymousClass39 {
    public int A00;

    public C0823Tj(Context context) {
        super(context);
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(int i) {
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass39, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        C0823Tj c0823Tj = this;
        int h = 0;
        int i3 = c0823Tj.A00;
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0823Tj = c0823Tj;
                    if (i4 >= c0823Tj.getChildCount()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0823Tj = c0823Tj;
                    View childAt = c0823Tj.getChildAt(i4);
                    childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                    h = childAt.getMeasuredHeight();
                    if (h <= i3) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i3 = h;
                    c2 = 5;
                    break;
                case 5:
                    i4++;
                    c2 = 2;
                    break;
                case 6:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
                    return;
            }
        }
    }
}

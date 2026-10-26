package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.widget.LinearLayout;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;

/* loaded from: assets/audience_network.dex */
public abstract class ML extends LinearLayout {
    public static int A00 = (int) (C0635Ly.A01 * 56.0f);

    public abstract void A04(C1I c1i, boolean z);

    public abstract boolean A06();

    public abstract int getToolbarHeight();

    public abstract void setAdReportingVisible(boolean z);

    public abstract void setPageDetails(C1R c1r, String str, int i, C1Y c1y);

    public abstract void setPageDetailsVisible(boolean z);

    public abstract void setProgress(float f);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(@ToolbarActionView$ToolbarActionMode int i);

    public abstract void setToolbarListener(MK mk);

    public ML(Context context) {
        super(context);
    }

    public void A05(InterfaceC0647Mk interfaceC0647Mk) {
    }
}

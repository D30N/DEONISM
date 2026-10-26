package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;

/* loaded from: assets/audience_network.dex */
public class MA implements DialogInterface.OnClickListener {
    public final /* synthetic */ C1168ct A00;

    public MA(C1168ct c1168ct) {
        this.A00 = c1168ct;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}

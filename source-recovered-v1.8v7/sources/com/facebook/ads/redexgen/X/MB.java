package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import android.widget.EditText;

/* loaded from: assets/audience_network.dex */
public class MB implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C1168ct A01;

    public MB(C1168ct c1168ct, EditText editText) {
        this.A01 = c1168ct;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A01.A02.execute(new C1167cs(this, dialogInterface));
    }
}

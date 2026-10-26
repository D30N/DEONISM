package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;

/* renamed from: com.facebook.ads.redexgen.X.Jq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC0578Jq implements DialogInterface.OnClickListener {
    public final /* synthetic */ ViewOnClickListenerC1139cP A00;

    public DialogInterfaceOnClickListenerC0578Jq(ViewOnClickListenerC1139cP viewOnClickListenerC1139cP) {
        this.A00 = viewOnClickListenerC1139cP;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00.A01.A0W == null) {
            return;
        }
        this.A00.A01.A0W.A0b(this.A00.A01());
    }
}

package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Nt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC0681Nt implements DialogInterface.OnClickListener {
    public final /* synthetic */ C0683Nv A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    public DialogInterfaceOnClickListenerC0681Nt(C0683Nv c0683Nv, String str, Map map) {
        this.A00 = c0683Nv;
        this.A01 = str;
        this.A02 = map;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.A04.A8M(this.A01, this.A02);
    }
}

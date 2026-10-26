package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Uq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0856Uq implements InterfaceC02616d {
    public final /* synthetic */ V3 A00;
    public final /* synthetic */ HashMap A01;

    public C0856Uq(V3 v3, HashMap map) {
        this.A00 = v3;
        this.A01 = map;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        return this.A00.A05(RecyclerView.UNDEFINED_DURATION, this.A01);
    }
}

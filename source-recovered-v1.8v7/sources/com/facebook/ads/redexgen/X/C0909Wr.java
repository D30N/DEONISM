package com.facebook.ads.redexgen.X;

import android.icu.util.TimeZone;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Wr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0909Wr implements InterfaceC02616d {
    public final /* synthetic */ C0911Wt A00;

    public C0909Wr(C0911Wt c0911Wt) {
        this.A00 = c0911Wt;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        if (Build.VERSION.SDK_INT < 24) {
            return this.A00.A07(EnumC02726o.A04);
        }
        return this.A00.A03(TimeZone.getDefault().getRawOffset() / 1000.0f);
    }
}

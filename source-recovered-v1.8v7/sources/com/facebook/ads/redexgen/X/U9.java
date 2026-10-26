package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class U9 extends C6Q implements C6L {
    public C6A A00;
    public final C02525u A01;
    public final Map<Integer, C02586a> A02;

    @SuppressLint({"UseSparseArrays"})
    public U9(Context context, C02525u c02525u) {
        super(context, c02525u);
        this.A02 = new HashMap();
        this.A01 = c02525u;
    }

    public final void A02(C02586a c02586a) {
        this.A02.put(Integer.valueOf(c02586a.A00()), c02586a);
    }

    public final void A03(EnumC02626e enumC02626e, Context context) {
        this.A00 = C6A.A00(context, this.A01);
        this.A00.A04(this.A02, enumC02626e);
    }

    @Override // com.facebook.ads.redexgen.X.C6L
    public final void ABe() {
        C6A c6a = this.A00;
        if (c6a != null) {
            c6a.A03();
        }
    }
}

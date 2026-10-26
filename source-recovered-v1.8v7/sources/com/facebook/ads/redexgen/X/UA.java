package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class UA extends C6Q {
    public final List<C02586a> A00;

    public UA(Context context, C02525u c02525u) {
        super(context, c02525u);
        this.A00 = new ArrayList();
    }

    public final List<C02586a> A02() {
        return Collections.unmodifiableList(this.A00);
    }

    public final void A03(C02586a c02586a) {
        if (c02586a.A03().contains(EnumC02656h.A0A)) {
            this.A00.add(c02586a);
        }
    }

    public final void A04(EnumC02626e enumC02626e) {
        A01(enumC02626e, this.A00);
    }
}

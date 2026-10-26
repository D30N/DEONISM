package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public final class W1 extends C6U {
    public W1(Context context, C02525u c02525u) {
        super(context, c02525u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public AbstractC02766s A02(HashMap<String, W0> map) {
        return new X9(SystemClock.elapsedRealtime(), A02(), map, EnumC02756r.A0C);
    }

    public final InterfaceC02616d A0G() {
        return new C0891Vz(this);
    }
}

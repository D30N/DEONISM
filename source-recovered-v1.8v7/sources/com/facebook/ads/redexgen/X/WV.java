package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WV extends C6U {
    public final Context A00;

    public WV(Context context, C02525u c02525u) {
        super(context, c02525u);
        this.A00 = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public AbstractC02766s A03(HashMap<String, WU> map) {
        return new X9(SystemClock.elapsedRealtime(), A02(), map, EnumC02756r.A0C);
    }

    public final InterfaceC02616d A0G(List<C02606c> list, C6Z c6z) {
        return new WT(this, list, c6z);
    }
}

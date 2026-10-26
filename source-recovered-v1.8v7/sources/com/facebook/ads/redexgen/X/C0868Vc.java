package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Vc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0868Vc extends C6U {
    public static PackageManager A00;

    public C0868Vc(Context context, C02525u c02525u) {
        super(context, c02525u);
        A00 = context.getPackageManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public AbstractC02766s A03(HashMap<String, C0867Vb> map) {
        return new X9(SystemClock.elapsedRealtime(), A02(), map, EnumC02756r.A0C);
    }

    public final InterfaceC02616d A0G(List<C02606c> list) {
        return new C0866Va(this, list);
    }
}

package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3M, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3M {
    public static final C3L A01;
    public final Object A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A01 = new C0456Eu();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A01 = new C0457Ev();
        } else {
            A01 = new C0810Sv();
        }
    }

    public C3M() {
        this.A00 = A01.A8b(this);
    }

    public C3M(Object obj) {
        this.A00 = obj;
    }

    @Nullable
    public final C3K A00(int i) {
        return null;
    }

    @Nullable
    public final C3K A01(int i) {
        return null;
    }

    public final Object A02() {
        return this.A00;
    }

    @Nullable
    public final List<C3K> A03(String str, int i) {
        return null;
    }

    public final boolean A04(int i, int i2, Bundle bundle) {
        return false;
    }
}

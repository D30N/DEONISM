package com.facebook.ads.redexgen.X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.2S, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2S extends C0452Eq {
    public C2S(XI xi) {
        super(xi);
        setCarouselLayoutManager(xi);
    }

    @Override // com.facebook.ads.redexgen.X.C0452Eq
    public T2 getLayoutManager() {
        return (T2) super.getLayoutManager();
    }

    private void setCarouselLayoutManager(XI xi) {
        T2 t2 = new T2(xi, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            t2.A1V(true);
        }
        super.setLayoutManager(t2);
    }

    @Override // com.facebook.ads.redexgen.X.C0452Eq
    public void setLayoutManager(C4G c4g) {
    }
}

package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.support.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.aO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1016aO implements InterfaceC0482Fw {

    @Nullable
    public CF A02;

    @Nullable
    public Object A03;

    @Nullable
    public String A04;
    public boolean A05;
    public final InterfaceC0515Hd A06;
    public int A01 = -1;
    public int A00 = 1048576;

    public C1016aO(InterfaceC0515Hd interfaceC0515Hd) {
        this.A06 = interfaceC0515Hd;
    }

    public final C4 A00(Uri uri) {
        this.A05 = true;
        if (this.A02 == null) {
            this.A02 = new C0955Yl();
        }
        return new C4(uri, this.A06, this.A02, this.A01, this.A04, this.A00, this.A03);
    }
}

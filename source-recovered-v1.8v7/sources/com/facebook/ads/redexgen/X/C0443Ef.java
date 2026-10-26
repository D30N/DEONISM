package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Ef, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0443Ef {
    public final InterfaceC0513Hb A00;
    public final InterfaceC0515Hd A01;
    public final InterfaceC0515Hd A02;
    public final I3 A03;
    public final C0548Im A04;

    public C0443Ef(I3 i3, InterfaceC0515Hd interfaceC0515Hd) {
        this(i3, interfaceC0515Hd, null, null, null);
    }

    public C0443Ef(I3 i3, InterfaceC0515Hd interfaceC0515Hd, @Nullable InterfaceC0515Hd interfaceC0515Hd2, @Nullable InterfaceC0513Hb interfaceC0513Hb, @Nullable C0548Im c0548Im) {
        IJ.A01(interfaceC0515Hd);
        this.A03 = i3;
        this.A02 = interfaceC0515Hd;
        this.A01 = interfaceC0515Hd2;
        this.A00 = interfaceC0513Hb;
        this.A04 = c0548Im;
    }

    public final I3 A00() {
        return this.A03;
    }

    public final C1104bo A01(boolean z) {
        InterfaceC0516He cacheReadDataSource;
        InterfaceC0514Hc c1102bm;
        InterfaceC0515Hd interfaceC0515Hd = this.A01;
        if (interfaceC0515Hd != null) {
            cacheReadDataSource = interfaceC0515Hd.A4D();
        } else {
            cacheReadDataSource = new C1086bW();
        }
        if (z) {
            return new C1104bo(this.A03, C1085bV.A02, cacheReadDataSource, null, 1, null);
        }
        InterfaceC0513Hb interfaceC0513Hb = this.A00;
        if (interfaceC0513Hb != null) {
            c1102bm = interfaceC0513Hb.createDataSink();
        } else {
            c1102bm = new C1102bm(this.A03, 2097152L);
        }
        InterfaceC0516He interfaceC0516HeA4D = this.A02.A4D();
        C0548Im c0548Im = this.A04;
        if (c0548Im != null) {
            interfaceC0516HeA4D = new C1096bg(interfaceC0516HeA4D, c0548Im, -1000);
        }
        return new C1104bo(this.A03, interfaceC0516HeA4D, cacheReadDataSource, c1102bm, 1, null);
    }

    public final C0548Im A02() {
        C0548Im c0548Im = this.A04;
        return c0548Im != null ? c0548Im : new C0548Im();
    }
}

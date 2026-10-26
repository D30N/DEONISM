package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.support.annotation.Nullable;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.bg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1096bg implements InterfaceC0516He {
    public final int A00;
    public final InterfaceC0516He A01;
    public final C0548Im A02;

    public C1096bg(InterfaceC0516He interfaceC0516He, C0548Im c0548Im, int i) {
        this.A01 = (InterfaceC0516He) IJ.A01(interfaceC0516He);
        this.A02 = (C0548Im) IJ.A01(c0548Im);
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    @Nullable
    public final Uri A7F() {
        return this.A01.A7F();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final long ABU(C0520Hi c0520Hi) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.ABU(c0520Hi);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i, i2);
    }
}

package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class YJ implements BH {
    public final YP A00 = new YP();
    public final YR A01 = new YR();
    public final InterfaceC0372Av[] A02;

    public YJ(InterfaceC0372Av... interfaceC0372AvArr) {
        this.A02 = (InterfaceC0372Av[]) Arrays.copyOf(interfaceC0372AvArr, interfaceC0372AvArr.length + 2);
        InterfaceC0372Av[] interfaceC0372AvArr2 = this.A02;
        interfaceC0372AvArr2[interfaceC0372AvArr.length] = this.A00;
        interfaceC0372AvArr2[interfaceC0372AvArr.length + 1] = this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.BH
    public final AH A3Q(AH ah) {
        this.A00.A0B(ah.A02);
        return new AH(this.A01.A01(ah.A01), this.A01.A00(ah.A00), ah.A02);
    }

    @Override // com.facebook.ads.redexgen.X.BH
    public final InterfaceC0372Av[] A5Q() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.BH
    public final long A6Y(long j) {
        return this.A01.A02(j);
    }

    @Override // com.facebook.ads.redexgen.X.BH
    public final long A72() {
        return this.A00.A0A();
    }
}

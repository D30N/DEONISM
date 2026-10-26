package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class V4 implements InterfaceC02616d {
    public final /* synthetic */ V8 A00;

    public V4(V8 v8) {
        this.A00 = v8;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        V4 v4 = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = v4.A00.A00 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    v4 = v4;
                    V8 v8 = v4.A00;
                    abstractC02766sA07 = v8.A08(v8.A00.getAddress());
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    v4 = v4;
                    abstractC02766sA07 = v4.A00.A07(EnumC02726o.A05);
                    c2 = 3;
                    break;
            }
        }
    }
}

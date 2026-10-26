package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class T0 implements ON {
    public final /* synthetic */ C0804Sp A00;

    public T0(C0804Sp c0804Sp) {
        this.A00 = c0804Sp;
    }

    @Override // com.facebook.ads.redexgen.X.ON
    public final void ABJ(int i) {
        T0 t0 = this;
        t0.A00.A0G(i, true);
        char c2 = t0.A00.A0N() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    t0 = t0;
                    t0.A00.A07();
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    t0 = t0;
                    t0.A00.A0B(i);
                    c2 = 3;
                    break;
            }
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public class T6 implements InterfaceC02124f {
    public final /* synthetic */ C0452Eq A00;

    public T6(C0452Eq c0452Eq) {
        this.A00 = c0452Eq;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02124f
    public final void ABt(C4Y c4y, C4B c4b, C4B c4b2) {
        this.A00.A1l(c4y, c4b, c4b2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02124f
    public final void ABv(C4Y c4y, @NonNull C4B c4b, @Nullable C4B c4b2) {
        this.A00.A0r.A0c(c4y);
        this.A00.A1m(c4y, c4b, c4b2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02124f
    public final void ABx(C4Y c4y, @NonNull C4B c4b, @NonNull C4B c4b2) {
        T6 t6 = this;
        c4y.A0Z(false);
        char c2 = t6.A00.A0C ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    t6 = t6;
                    c4y = c4y;
                    c4b = c4b;
                    c4b2 = c4b2;
                    if (!t6.A00.A05.A0F(c4y, c4y, c4b, c4b2)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    t6 = t6;
                    t6.A00.A1L();
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    t6 = t6;
                    c4y = c4y;
                    c4b = c4b;
                    c4b2 = c4b2;
                    if (!t6.A00.A05.A0E(c4y, c4b, c4b2)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    t6 = t6;
                    t6.A00.A1L();
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02124f
    public final void ADi(C4Y c4y) {
        this.A00.A06.A1D(c4y.A0H, this.A00.A0r);
    }
}

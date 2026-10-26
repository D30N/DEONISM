package com.facebook.ads.redexgen.X;

import java.util.EnumSet;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.6a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02586a {
    public final int A00;
    public final InterfaceC02616d A01;
    public final EnumSet<EnumC02656h> A02;

    public C02586a(int i, EnumSet<EnumC02656h> enumSet, InterfaceC02616d interfaceC02616d) {
        this.A00 = i;
        this.A02 = enumSet;
        this.A01 = interfaceC02616d;
    }

    public final int A00() {
        return this.A00;
    }

    @Nullable
    public final InterfaceC02616d A01() {
        C02586a c02586a = this;
        InterfaceC02616d interfaceC02616d = null;
        char c2 = c02586a.A02.contains(EnumC02656h.A06) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c02586a = c02586a;
                    interfaceC02616d = c02586a.A01;
                    c2 = 3;
                    break;
                case 3:
                    return interfaceC02616d;
                case 4:
                    interfaceC02616d = null;
                    c2 = 3;
                    break;
            }
        }
    }

    @Nullable
    public final InterfaceC02616d A02(EnumC02626e enumC02626e) {
        if (A04(enumC02626e)) {
            return this.A01;
        }
        return null;
    }

    public final EnumSet<EnumC02656h> A03() {
        return this.A02;
    }

    public final boolean A04(EnumC02626e enumC02626e) {
        C02586a c02586a = this;
        boolean z = false;
        char c2 = AnonymousClass71.A0E(enumC02626e) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c02586a = c02586a;
                    enumC02626e = enumC02626e;
                    if (!c02586a.A02.contains(EnumC02656h.A00(enumC02626e.A03()))) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }
}

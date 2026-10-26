package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.0s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01230s {
    public static InterfaceC01180n A00;

    public final InterfaceC01180n A00(AdPlacementType adPlacementType) {
        InterfaceC01180n interfaceC01180n = A00;
        char c2 = interfaceC01180n != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return interfaceC01180n;
                case 3:
                    adPlacementType = adPlacementType;
                    switch (C01220r.A00[adPlacementType.ordinal()]) {
                        case 1:
                            c2 = '\n';
                            break;
                        case 2:
                            c2 = '\t';
                            break;
                        case 3:
                            c2 = '\b';
                            break;
                        case 4:
                            c2 = 7;
                            break;
                        case 5:
                            c2 = 6;
                            break;
                        case 6:
                            c2 = 5;
                            break;
                        default:
                            c2 = 4;
                            break;
                    }
                case 4:
                    return (InterfaceC01180n) null;
                case 5:
                    return new C0464Fc();
                case 6:
                    return new C0471Fl();
                case 7:
                    return new C0470Fk();
                case '\b':
                    return new C0770Rf();
                case '\t':
                    return new C0768Rd();
                case '\n':
                    return new RW();
            }
        }
    }
}

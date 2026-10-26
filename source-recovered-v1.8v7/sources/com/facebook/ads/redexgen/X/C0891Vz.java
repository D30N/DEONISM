package com.facebook.ads.redexgen.X;

import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Vz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0891Vz implements InterfaceC02616d {
    public final /* synthetic */ W1 A00;

    public C0891Vz(W1 w1) {
        this.A00 = w1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() throws Exception {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        HashMap map = new HashMap();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    networkInterfaces = networkInterfaces;
                    if (!networkInterfaces.hasMoreElements()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    networkInterfaces = networkInterfaces;
                    map = map;
                    NetworkInterface networkInterface = networkInterfaces.nextElement();
                    map.put(networkInterface.getDisplayName(), new W0(networkInterface.getInetAddresses(), null));
                    c2 = 2;
                    break;
                case 4:
                    return this.A00.A02(map);
            }
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.os.Build;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class VF implements InterfaceC02616d {
    public final /* synthetic */ VZ A00;

    public VF(VZ vz) {
        this.A00 = vz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        VF vf = this;
        AbstractC02766s abstractC02766sA0E = null;
        String[] strArr = null;
        char c2 = Build.VERSION.SDK_INT < 21 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return vf.A00.A07(EnumC02726o.A04);
                case 3:
                    strArr = Build.SUPPORTED_ABIS;
                    if (strArr == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    vf = vf;
                    strArr = strArr;
                    abstractC02766sA0E = vf.A00.A0E(Arrays.asList(strArr));
                    c2 = 5;
                    break;
                case 5:
                    return abstractC02766sA0E;
                case 6:
                    vf = vf;
                    abstractC02766sA0E = vf.A00.A07(EnumC02726o.A06);
                    c2 = 5;
                    break;
            }
        }
    }
}

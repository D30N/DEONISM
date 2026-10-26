package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class UE implements InterfaceC02616d {
    public final /* synthetic */ UN A00;

    public UE(UN un) {
        this.A00 = un;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        UE ue = this;
        char c2 = Build.VERSION.SDK_INT < 16 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return ue.A00.A07(EnumC02726o.A04);
                case 3:
                    ue = ue;
                    if (ue.A00.A02 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    UE ue2 = ue;
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ue2.A00.A02.getMemoryInfo(memoryInfo);
                    return ue2.A00.A06(memoryInfo.totalMem / 1048576);
                case 5:
                    return ue.A00.A07(EnumC02726o.A06);
            }
        }
    }
}

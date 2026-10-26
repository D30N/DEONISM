package com.facebook.ads.redexgen.X;

import android.os.Build;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Un, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0853Un implements InterfaceC02616d {
    public final /* synthetic */ C0855Up A00;
    public final /* synthetic */ List A01;

    public C0853Un(C0855Up c0855Up, List list) {
        this.A00 = c0855Up;
        this.A01 = list;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        C0853Un c0853Un = this;
        int streamKey = 0;
        C02606c c02606c = null;
        int maxVolume = 0;
        HashMap map = new HashMap();
        int i = 0;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    c0853Un = c0853Un;
                    int i3 = c0853Un.A01.size();
                    if (i >= i3) {
                        i2 = 9;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    c0853Un = c0853Un;
                    c02606c = (C02606c) c0853Un.A01.get(i);
                    if (!c02606c.A02()) {
                        i2 = 7;
                        break;
                    } else {
                        i2 = 4;
                        break;
                    }
                case 4:
                    c02606c = c02606c;
                    streamKey = ((Integer) c02606c.A01()).intValue();
                    if (Build.VERSION.SDK_INT < 28) {
                        i2 = 8;
                        break;
                    } else {
                        i2 = 5;
                        break;
                    }
                case 5:
                    c0853Un = c0853Un;
                    maxVolume = c0853Un.A00.A00.getStreamMinVolume(streamKey);
                    i2 = 6;
                    break;
                case 6:
                    c0853Un = c0853Un;
                    map = map;
                    map.put(Integer.valueOf(streamKey), new C0854Uo(maxVolume, c0853Un.A00.A00.getStreamVolume(streamKey), c0853Un.A00.A00.getStreamMaxVolume(streamKey)));
                    i2 = 7;
                    break;
                case 7:
                    i++;
                    i2 = 2;
                    break;
                case 8:
                    maxVolume = -1;
                    i2 = 6;
                    break;
                case 9:
                    return c0853Un.A00.A03((HashMap<Integer, C0854Uo>) map);
            }
        }
    }
}

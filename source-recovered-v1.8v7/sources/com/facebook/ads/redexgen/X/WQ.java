package com.facebook.ads.redexgen.X;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import com.facebook.ads.internal.botdetection.signals.model.signal_value.ICustomObjectSignalValueDef;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class WQ implements InterfaceC02616d {
    public static byte[] A01;
    public final /* synthetic */ WS A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 45);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{28, 10, 1, 28, 0, 29};
    }

    public WQ(WS ws) {
        this.A00 = ws;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() throws Exception {
        WQ wq = this;
        List<ICustomObjectSignalValueDef> list = null;
        Iterator<Sensor> it = null;
        WS ws = wq.A00;
        ws.A00 = (SensorManager) ws.A01.getSystemService(A00(0, 6, 66));
        char c2 = Build.VERSION.SDK_INT < 20 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return wq.A00.A07(EnumC02726o.A04);
                case 3:
                    wq = wq;
                    if (wq.A00.A00 != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return wq.A00.A07(EnumC02726o.A06);
                case 5:
                    wq = wq;
                    List<Sensor> sensorList = wq.A00.A00.getSensorList(-1);
                    list = new ArrayList<>();
                    it = sensorList.iterator();
                    c2 = 6;
                    break;
                case 6:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    list = (ArrayList) list;
                    it = it;
                    list.add(new WR(it.next()));
                    c2 = 6;
                    break;
                case '\b':
                    return wq.A00.A0D((ArrayList) list);
            }
        }
    }
}

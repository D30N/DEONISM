package com.facebook.ads.redexgen.X;

import android.bluetooth.BluetoothDevice;
import com.facebook.ads.internal.botdetection.signals.model.signal_value.ICustomObjectSignalValueDef;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class V6 implements InterfaceC02616d {
    public final /* synthetic */ V8 A00;

    public V6(V8 v8) {
        this.A00 = v8;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() throws Exception {
        V6 v6 = this;
        List<ICustomObjectSignalValueDef> list = null;
        Iterator<BluetoothDevice> it = null;
        char c2 = v6.A00.A00 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return v6.A00.A07(EnumC02726o.A05);
                case 3:
                    v6 = v6;
                    it = v6.A00.A00.getBondedDevices().iterator();
                    list = new ArrayList<>();
                    c2 = 4;
                    break;
                case 4:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    it = it;
                    list = (ArrayList) list;
                    list.add(new V7(it.next()));
                    c2 = 4;
                    break;
                case 6:
                    return v6.A00.A0D((ArrayList) list);
            }
        }
    }
}

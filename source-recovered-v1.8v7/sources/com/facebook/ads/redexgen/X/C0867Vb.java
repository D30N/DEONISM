package com.facebook.ads.redexgen.X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Vb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0867Vb implements InterfaceC02686k<String> {
    public final String A00;
    public final boolean A01;

    public C0867Vb(String str) {
        this.A00 = str;
        this.A01 = C0868Vc.A00.hasSystemFeature(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final JSONObject ADb(String str, JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.A00, this.A01);
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    public final boolean A7d(Object obj) {
        C0867Vb newDeviceFeature = this;
        boolean z = false;
        C0867Vb c0867Vb = (C0867Vb) obj;
        char c2 = newDeviceFeature.A00.equals(c0867Vb.A00) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    newDeviceFeature = newDeviceFeature;
                    c0867Vb = c0867Vb;
                    if (newDeviceFeature.A01 != c0867Vb.A01) {
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

    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    public final int ADH() {
        return this.A00.getBytes().length + 8;
    }
}

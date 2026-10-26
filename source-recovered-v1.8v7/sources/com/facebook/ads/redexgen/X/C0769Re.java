package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Re, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0769Re extends AbstractRunnableC0608Kw {
    public final /* synthetic */ C0770Rf A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C0769Re(C0770Rf c0770Rf, Map map, Map map2) {
        this.A00 = c0770Rf;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        C0769Re c0769Re = this;
        HashMap map = null;
        char c2 = !TextUtils.isEmpty(c0769Re.A00.A0L) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0769Re = c0769Re;
                    map = new HashMap();
                    map.putAll(c0769Re.A02);
                    map.putAll(c0769Re.A01);
                    if (c0769Re.A00.A0D == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0769Re = c0769Re;
                    map = map;
                    c0769Re.A00.A0D.A8K(c0769Re.A00.A0L, map);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }
}

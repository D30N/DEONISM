package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class R4 extends Q0 {
    public final /* synthetic */ JW A00;
    public final /* synthetic */ C0628Lr A01;
    public final /* synthetic */ C0698Ok A02;
    public final /* synthetic */ R2 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public R4(R2 r2, String str, C0698Ok c0698Ok, JW jw, Map map, C0628Lr c0628Lr) {
        this.A03 = r2;
        this.A04 = str;
        this.A02 = c0698Ok;
        this.A00 = jw;
        this.A05 = map;
        this.A01 = c0628Lr;
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void A03() {
        R4 r4 = this;
        char c2 = !r4.A03.A01.A0a() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    r4 = r4;
                    if (!TextUtils.isEmpty(r4.A04)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 3:
                    r4 = r4;
                    if (!r4.A03.A07.get(r4.A02.A02())) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    r4 = r4;
                    r4.A00.A87(r4.A04, new C0676No(r4.A05).A03(r4.A03.A02).A02(r4.A01).A05());
                    r4.A03.A07.put(r4.A02.A02(), true);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }
}

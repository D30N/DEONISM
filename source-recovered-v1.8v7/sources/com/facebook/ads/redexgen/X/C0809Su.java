package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Su, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0809Su implements C3R {
    public final /* synthetic */ C0456Eu A00;
    public final /* synthetic */ C3M A01;

    public C0809Su(C0456Eu c0456Eu, C3M c3m) {
        this.A00 = c0456Eu;
        this.A01 = c3m;
    }

    @Override // com.facebook.ads.redexgen.X.C3R
    public final Object A4C(int i) {
        C3K c3kA00 = this.A01.A00(i);
        if (c3kA00 == null) {
            return null;
        }
        return c3kA00.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.C3R
    public final List<Object> A55(String str, int i) {
        ArrayList arrayList = null;
        int i2 = 0;
        int size = 0;
        List<C3K> listA03 = this.A01.A03(str, i);
        char c2 = listA03 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (List) null;
                case 3:
                    listA03 = listA03;
                    arrayList = new ArrayList();
                    size = listA03.size();
                    i2 = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i2 >= size) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    listA03 = listA03;
                    arrayList = arrayList;
                    arrayList.add(listA03.get(i2).A0M());
                    i2++;
                    c2 = 4;
                    break;
                case 6:
                    return arrayList;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3R
    public final Object A56(int i) {
        C3K c3kA01 = this.A01.A01(i);
        if (c3kA01 == null) {
            return null;
        }
        return c3kA01.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.C3R
    public final boolean ABh(int i, int i2, Bundle bundle) {
        return this.A01.A04(i, i2, bundle);
    }
}

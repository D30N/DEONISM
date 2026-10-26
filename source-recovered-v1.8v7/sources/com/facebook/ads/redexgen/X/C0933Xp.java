package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Xp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0933Xp implements AnonymousClass91 {
    public final /* synthetic */ String[] A00;

    public C0933Xp(String[] strArr) {
        this.A00 = strArr;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass91
    public final boolean A2N(String str) {
        String[] strArr = this.A00;
        int length = strArr.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str = str;
                    strArr = strArr;
                    String name = strArr[i];
                    if (!name.equals(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return true;
            }
        }
    }
}

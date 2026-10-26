package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Rw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0787Rw extends AnonymousClass17 implements Serializable {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 2751287062553772011L;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 10);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{-38, -51, -33, -55, -38, -52, -51, -52, -57, -34, -47, -52, -51, -41};
    }

    public C0787Rw(List<C1A> list) {
        super(list);
    }

    public static C0787Rw A01(JSONObject jSONObject) {
        C1A c1aA00 = C1A.A00(jSONObject);
        c1aA00.A0J(true);
        c1aA00.A0I(jSONObject);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1aA00);
        C0787Rw c0787Rw = new C0787Rw(arrayList);
        c0787Rw.A0d(jSONObject);
        c0787Rw.A0b(A02(0, 14, 94));
        return c0787Rw;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass17
    public final int A0H() {
        int i = 0;
        char c2 = A0L().A0D().A06() != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = 1;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    i = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass17
    public final int A0I() {
        return A0L().A0D().A04();
    }
}

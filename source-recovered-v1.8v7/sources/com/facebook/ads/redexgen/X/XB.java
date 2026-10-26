package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class XB extends AbstractC02766s<String> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowFixedWidthMajor);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{85};
    }

    public XB(long j, @Nullable C02746q c02746q, String str) {
        super(j, c02746q, str, EnumC02756r.A0C);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02766s
    public final int A06() {
        return A07().getBytes().length;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02766s
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        jSONObject.put(A00(0, 1, 91), A07());
        return jSONObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.AbstractC02766s
    public final boolean A0A(AbstractC02766s<String> abstractC02766s) {
        return A07().equals(abstractC02766s.A07());
    }
}

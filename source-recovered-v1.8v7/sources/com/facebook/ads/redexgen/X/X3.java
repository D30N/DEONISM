package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class X3 extends AbstractC02766s<C02736p> {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 23);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{76};
    }

    public X3(long j, @Nullable C02746q c02746q, C02736p c02736p) {
        super(j, c02746q, c02736p, EnumC02756r.A04);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02766s
    public final int A06() {
        return A07().A03();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02766s
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        jSONObject.put(A00(0, 1, 45), A07().A08());
        return jSONObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalErrorValueTypeDef> */
    @Override // com.facebook.ads.redexgen.X.AbstractC02766s
    public final boolean A0A(AbstractC02766s<C02736p> abstractC02766s) {
        boolean z = false;
        C02736p c02736pA07 = A07();
        C02736p c02736pA072 = abstractC02766s.A07();
        boolean z2 = true;
        char c2 = c02736pA07.A04().equals(abstractC02766s.A07().A04()) ? (char) 2 : (char) 15;
        while (true) {
            switch (c2) {
                case 2:
                    c02736pA07 = c02736pA07;
                    c02736pA072 = c02736pA072;
                    if (c02736pA07.A02() != c02736pA072.A02()) {
                        c2 = 15;
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
                    if (!z) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c02736pA07 = c02736pA07;
                    if (!c02736pA07.A04().equals(EnumC02726o.A07)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c02736pA07 = c02736pA07;
                    if (c02736pA07.A06() == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c02736pA07 = c02736pA07;
                    c02736pA072 = c02736pA072;
                    boolean errorCodeComparison = c02736pA07.A06().equals(c02736pA072.A06());
                    if (!errorCodeComparison) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c02736pA07 = c02736pA07;
                    if (c02736pA07.A05() == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c02736pA07 = c02736pA07;
                    c02736pA072 = c02736pA072;
                    boolean errorCodeComparison2 = c02736pA07.A05().equals(c02736pA072.A05());
                    if (!errorCodeComparison2) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c02736pA07 = c02736pA07;
                    if (c02736pA07.A07() == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c02736pA07 = c02736pA07;
                    c02736pA072 = c02736pA072;
                    boolean errorCodeComparison3 = c02736pA07.A07().equals(c02736pA072.A07());
                    if (!errorCodeComparison3) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    z &= z2;
                    c2 = '\r';
                    break;
                case '\r':
                    return z;
                case 14:
                    z2 = false;
                    c2 = '\f';
                    break;
                case 15:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }
}

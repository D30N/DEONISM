package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ax, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1051ax extends GM {
    public static byte[] A05;
    public final long A00;
    public final Uri A01;
    public final GK A02;
    public final C1054b0 A03;
    public final String A04;

    static {
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 42);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A05 = new byte[]{85};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1051ax(String str, long j, Format format, String str2, C1053az c1053az, List<GH> list, String str3, long j2) {
        super(str, j, format, str2, c1053az, list);
        String string = str3;
        this.A01 = Uri.parse(str2);
        this.A02 = c1053az.A02();
        if (string == null) {
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                String strA01 = A01(0, 1, 81);
                sb.append(strA01);
                sb.append(format.A0M);
                sb.append(strA01);
                sb.append(j);
                string = sb.toString();
            } else {
                string = null;
            }
        }
        this.A04 = string;
        this.A00 = j2;
        this.A03 = this.A02 == null ? new C1054b0(new GK(null, 0L, j2)) : null;
    }

    @Override // com.facebook.ads.redexgen.X.GM
    public final G9 A04() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.GM
    public final GK A06() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.GM
    public final String A07() {
        return this.A04;
    }
}

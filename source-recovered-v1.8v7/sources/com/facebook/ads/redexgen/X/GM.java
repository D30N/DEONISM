package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public abstract class GM {
    public static byte[] A07;
    public final long A00;
    public final long A01;
    public final Format A02;
    public final String A03;
    public final String A04;
    public final List<GH> A05;
    public final GK A06;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_viewInflaterClass);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A07 = new byte[]{100, 114, 112, 122, 114, 121, 99, 85, 118, 100, 114, 55, 122, 98, 100, 99, 55, 117, 114, 55, 120, 113, 55, 99, 110, 103, 114, 55, 68, 126, 121, 112, 123, 114, 68, 114, 112, 122, 114, 121, 99, 85, 118, 100, 114, 55, 120, 101, 55, 90, 98, 123, 99, 126, 68, 114, 112, 122, 114, 121, 99, 85, 118, 100, 114};
    }

    public abstract G9 A04();

    public abstract GK A06();

    public abstract String A07();

    public GM(String str, long j, Format format, String str2, GP gp, List<GH> list) {
        this.A04 = str;
        this.A01 = j;
        this.A02 = format;
        this.A03 = str2;
        this.A05 = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.A06 = gp.A01(this);
        this.A00 = gp.A00();
    }

    public static GM A00(String str, long j, Format format, String str2, GP gp, List<GH> list) {
        return A01(str, j, format, str2, gp, list, null);
    }

    public static GM A01(String str, long j, Format format, String str2, GP gp, List<GH> list, String str3) {
        if (gp instanceof C1053az) {
            return new C1051ax(str, j, format, str2, (C1053az) gp, list, str3, -1L);
        }
        if (gp instanceof AbstractC1052ay) {
            return new C1050aw(str, j, format, str2, (AbstractC1052ay) gp, list);
        }
        throw new IllegalArgumentException(A02(0, 65, 101));
    }

    public final GK A05() {
        return this.A06;
    }
}

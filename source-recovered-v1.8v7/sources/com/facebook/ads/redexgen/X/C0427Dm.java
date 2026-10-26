package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.support.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.video.ColorInfo;
import d.b.a.b.k;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.Dm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0427Dm {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 116);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{52, 64, 61, 64, 67, -2, 69, 67, 50, 63, 68, 55, 54, 67, 29, 25, 39, -30, 40, 41, 22, 41, 30, 24, -30, 30, 35, 27, 36, 85, 97, 94, 97, 100, 31, 101, 102, 83, 96, 86, 83, 100, 86, 73, 89, 74, 19, 49, 61, 58, 61, 64, -5, 64, 47, 60, 53, 51};
    }

    public static void A02(MediaFormat mediaFormat, @Nullable ColorInfo colorInfo) {
        if (colorInfo != null) {
            A04(mediaFormat, A00(0, 14, 93), colorInfo.A03);
            A04(mediaFormat, A00(29, 14, 126), colorInfo.A02);
            A04(mediaFormat, A00(47, 11, 90), colorInfo.A01);
            A05(mediaFormat, A00(14, 15, 65), colorInfo.A04);
        }
    }

    public static void A03(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    public static void A04(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void A05(MediaFormat mediaFormat, String str, @Nullable byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void A06(MediaFormat mediaFormat, List<byte[]> list) {
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    list = list;
                    if (i >= list.size()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    mediaFormat = mediaFormat;
                    list = list;
                    mediaFormat.setByteBuffer(A00(43, 4, k.AppCompatTheme_viewInflaterClass) + i, ByteBuffer.wrap(list.get(i)));
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.ads.AdSettings;
import com.facebook.ads.RewardData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Oy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0711Oy {
    public static byte[] A05;
    public Executor A00 = M3.A05;
    public final XI A01;
    public final MQ A02;
    public final InterfaceC0657Mv A03;

    @Nullable
    public final String A04;

    static {
        A04();
    }

    public static String A02(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 35);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A05 = new byte[]{3, 18, 18, 11, 6, 97, 125, 125, 121, 122, 51, 38, 38, 126, 126, 126, 39, 111, 104, 106, 108, 107, 102, 102, 98, 39, 106, 102, 100, 38, 104, 124, 109, 96, 108, 103, 106, 108, 86, 103, 108, 125, 126, 102, 123, 98, 38, 122, 108, 123, Byte.MAX_VALUE, 108, 123, 86, 122, 96, 109, 108, 86, 123, 108, 126, 104, 123, 109, 18, 14, 14, 10, 9, 64, 85, 85, 13, 13, 13, 84, 95, 9, 84, 28, 27, 25, 31, 24, 21, 21, 17, 84, 25, 21, 23, 85, 27, 15, 30, 19, 31, 20, 25, 31, 37, 20, 31, 14, 13, 21, 8, 17, 85, 9, 31, 8, 12, 31, 8, 37, 9, 19, 30, 31, 37, 8, 31, 13, 27, 8, 30, 88, 75, 114, 118, 107, 102, 123, 126, 98, 111};
    }

    public C0711Oy(XI xi, InterfaceC0657Mv interfaceC0657Mv, @Nullable String str, MQ mq) {
        this.A01 = xi;
        this.A03 = interfaceC0657Mv;
        this.A04 = str;
        this.A02 = mq;
    }

    @Nullable
    public static String A03(@Nullable RewardData rewardData, String serverSideProxyURL, String str) {
        String strA02 = null;
        String urlPrefix = null;
        char c2 = rewardData != null ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    urlPrefix = AdSettings.getUrlPrefix();
                    if (urlPrefix == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    urlPrefix = urlPrefix;
                    if (!urlPrefix.isEmpty()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    strA02 = A02(5, 60, 42);
                    c2 = 5;
                    break;
                case 5:
                    RewardData rewardData2 = rewardData;
                    Uri uri = Uri.parse(strA02);
                    Uri.Builder builder = new Uri.Builder();
                    builder.scheme(uri.getScheme());
                    builder.authority(uri.getAuthority());
                    builder.path(uri.getPath());
                    builder.query(uri.getQuery());
                    builder.fragment(uri.getFragment());
                    builder.appendQueryParameter(A02(134, 4, 40), rewardData2.getUserID());
                    builder.appendQueryParameter(A02(128, 2, 11), rewardData2.getCurrency());
                    builder.appendQueryParameter(A02(130, 4, 33), serverSideProxyURL);
                    builder.appendQueryParameter(A02(0, 5, 65), str);
                    return builder.build().toString();
                case 6:
                    urlPrefix = urlPrefix;
                    strA02 = String.format(Locale.US, A02(65, 63, 89), urlPrefix);
                    c2 = 5;
                    break;
                case 7:
                    return (String) null;
            }
        }
    }

    public final void A05() {
        if (!TextUtils.isEmpty(this.A04)) {
            QQ qq = new QQ(this.A01, new HashMap());
            qq.A07(new C0762Qx(this));
            qq.executeOnExecutor(this.A00, this.A04);
        }
    }
}

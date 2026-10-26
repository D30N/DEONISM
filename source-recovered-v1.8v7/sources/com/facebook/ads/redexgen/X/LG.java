package com.facebook.ads.redexgen.X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class LG {
    public static byte[] A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 25);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{114, 123, 116, 126, 118, Byte.MAX_VALUE, 104, 78, 115, 119, Byte.MAX_VALUE, 114, 80, 95, 22, 69, 17, 66, 69, 80, 67, 69, 17, 112, 68, 85, 88, 84, 95, 82, 84, Byte.MAX_VALUE, 84, 69, 70, 94, 67, 90, 112, 82, 69, 88, 71, 88, 69, 72, 31, 17, 124, 80, 90, 84, 17, 66, 68, 67, 84, 17, 69, 89, 80, 69, 17, 88, 69, 22, 66, 17, 88, 95, 17, 72, 94, 68, 67, 17, 112, 95, 85, 67, 94, 88, 85, 124, 80, 95, 88, 87, 84, 66, 69, 31, 73, 92, 93, 17, 87, 88, 93, 84, 31, 52, 48, 51, 7, 22, 27, 23, 28, 17, 23, 60, 23, 6, 5, 29, 0, 25, 40, 39, 22, 40, 42, 61, 32, 63, 32, 61, 48, 40, 55, 59, 41, 10, 39, 46, 59, 60, 32, 32, 36, 39, 26, 6, 11, 19, 68, 13, 5, 5, 13, 6, 15, 68, 9, 5, 7, 58, 38, 38, 34, 125, 114, 120, 110, 115, 117, 120, 50, 117, 114, 104, 121, 114, 104, 50, Byte.MAX_VALUE, 125, 104, 121, 123, 115, 110, 101, 50, 94, 78, 83, 75, 79, 93, 94, 80, 89, 102, 106, 121, 96, 110, Byte.MAX_VALUE, 22, 7, 16, 20, 1, 16, 42, 27, 16, 2, 42, 1, 20, 23, 113, 109, 109, 105, 35, 54, 54, 105, 117, 120, 96, 55, 126, 118, 118, 126, 117, 124, 55, 122, 118, 116, 54, 106, 109, 118, 107, 124, 54, 120, 105, 105, 106, 54, 83, 67, 94, 70, 66, 84, 67, 100, 99, 125, 35, 44, 38, 48, 45, 43, 38, 108, 43, 44, 54, 39, 44, 54, 108, 35, 33, 54, 43, 45, 44, 108, 20, 11, 7, 21, 70, 73, 76, 64, 75, 81, 113, 74, 78, 64, 75, 42, 38, 36, 103, 40, 39, 45, 59, 38, 32, 45, 103, 43, 59, 38, 62, 58, 44, 59, 103, 40, 57, 57, 37, 32, 42, 40, 61, 32, 38, 39, 22, 32, 45, 68, 72, 74, 9, 70, 73, 67, 85, 72, 78, 67, 9, 81, 66, 73, 67, 78, 73, 64};
    }

    private Intent A00(Uri uri) {
        Intent intent = new Intent(A02(258, 26, 91), uri);
        intent.setComponent(null);
        if (Build.VERSION.SDK_INT >= 15) {
            intent.setSelector(null);
        }
        return intent;
    }

    private Intent A01(XI xi, Uri uri) {
        Intent intentA00 = A00(uri);
        intentA00.addCategory(A02(161, 33, 5));
        intentA00.addFlags(268435456);
        intentA00.putExtra(A02(295, 34, 80), xi.getPackageName());
        intentA00.putExtra(A02(200, 14, 108), false);
        return intentA00;
    }

    private void A04(XI xi, Uri uri) {
        LA.A0B(xi, A01(xi, uri));
    }

    private final void A05(XI xi, Uri uri) throws LF {
        if (A0A(xi)) {
            Intent intentA01 = A01(xi, uri);
            intentA01.setPackage(A02(329, 19, 62));
            LA.A0B(xi, intentA01);
            return;
        }
        throw new LF();
    }

    private void A06(XI xi, Uri uri, String str) {
        AdActivityIntent adActivityIntentA04 = LA.A04(xi);
        adActivityIntentA04.addFlags(268435456);
        adActivityIntentA04.putExtra(A02(129, 8, 71), EnumC0592Ke.A02);
        adActivityIntentA04.putExtra(A02(248, 10, 40), uri.toString());
        adActivityIntentA04.putExtra(A02(284, 11, 60), str);
        adActivityIntentA04.putExtra(A02(0, 11, 3), System.currentTimeMillis());
        try {
            LA.A09(xi, adActivityIntentA04);
        } catch (ActivityNotFoundException e) {
            xi.A04().A83(A02(k.AppCompatTheme_windowFixedHeightMajor, 11, 80), C03008a.A05, new C03018b(e));
            Log.e(A02(101, 17, 107), A02(11, 90, 40), e);
        }
    }

    private final void A07(XI xi, Uri uri, String str) {
        LG lg = this;
        char c2 = A09(uri) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    xi = xi;
                    if (!JQ.A0o(xi)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    lg = lg;
                    xi = xi;
                    uri = uri;
                    str = str;
                    lg.A06(xi, uri, str);
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    lg = lg;
                    xi = xi;
                    uri = uri;
                    lg.A04(xi, uri);
                    c2 = 4;
                    break;
            }
        }
    }

    public static void A08(LG lg, XI xi, Uri uri, String str) {
        boolean z = false;
        char c2 = A09(uri) ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    uri = uri;
                    if (!A02(142, 15, k.AppCompatTheme_windowActionBar).equals(uri.getHost())) {
                        c2 = 6;
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
                    uri = uri;
                    if (!A02(194, 6, 18).equals(uri.getScheme())) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 5:
                    if (!z) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    z = false;
                    c2 = 4;
                    break;
                case 7:
                    try {
                        lg = lg;
                        xi = xi;
                        uri = uri;
                        lg.A05(xi, uri);
                        return;
                    } catch (LF unused) {
                        lg.A07(xi, uri, str);
                        return;
                    }
                case '\t':
                    lg.A07(xi, uri, str);
                    return;
            }
        }
    }

    public static boolean A09(Uri uri) {
        String scheme = null;
        boolean z = false;
        boolean z2 = false;
        char c2 = Build.VERSION.SDK_INT >= 24 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    uri = uri;
                    NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
                    String scheme2 = uri.getHost();
                    if (!networkSecurityPolicy.isCleartextTrafficPermitted(scheme2)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    uri = uri;
                    scheme = uri.getScheme();
                    if (!z) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    scheme = scheme;
                    String scheme3 = A02(157, 4, 75);
                    if (!scheme3.equalsIgnoreCase(scheme)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    scheme = scheme;
                    String scheme4 = A02(137, 5, 77);
                    if (!scheme4.equalsIgnoreCase(scheme)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    z2 = true;
                    c2 = '\t';
                    break;
                case '\t':
                    return z2;
                case '\n':
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    private boolean A0A(XI xi) {
        List<ResolveInfo> apps = xi.getPackageManager().queryIntentActivities(new Intent(A02(258, 26, 91), Uri.parse(A02(214, 34, 0))), 0);
        Iterator<ResolveInfo> it = apps.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    it = it;
                    if (!it.next().activityInfo.applicationInfo.packageName.equals(A02(329, 19, 62))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return true;
                case 5:
                    return false;
            }
        }
    }
}

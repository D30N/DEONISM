package com.facebook.ads.redexgen.X;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0475Fp extends RO {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 42);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A02 = new byte[]{-41, -40, -51, -42, -51, -52, -57, -52, -51, -51, -40, -44, -47, -42, -45, -62, -60, -44, -56, -39, -46, -52, -37, -95, -106, -106, -53, -52, -37, -56, -48, -45, -38, -90, -48, -53, -92, -116, -38, -12, 1, -9, 5, 2, -4, -9, -17, -4, -14, 0, -3, -9, -14, -68, -9, -4, 2, -13, -4, 2, -68, -17, -15, 2, -9, -3, -4, -68, -47, -49, -38, -38, 24, 25, 20, 23, 10, 4, 26, 23, 17, 29, 14, 21, -29, -40, -39, -44, -41, -54, -60, -38, -41, -47, -60, -36, -54, -57, -60, -53, -58, -47, -47, -57, -58, -56, -48, -27, -42, -35, -31, -29, -32, -34, -31, -27, -85, -96, -95, -106, -97, -106, -107, -112, -92, -91, -96, -93, -106, -112, -105, -110, -99, -99, -109, -110, -108, -100, -112, -90, -93, -99, -33, -6, 2, 5, -2, -3, -71, 13, 8, -71, 8, 9, -2, 7, -71, 6, -6, 11, 4, -2, 13, -71, 14, 11, 5, -45, -71, -117, -102, -102, -99, -109, -98, -113, -119, -114, -117, -98, -117, -118, -73, -73, -76, -73, 101, -75, -90, -73, -72, -82, -77, -84, 101, -90, -75, -75, -72, -82, -71, -86, -92, -87, -90, -71, -90, -45, -32, -42, -28, -31, -37, -42, -96, -37, -32, -26, -41, -32, -26, -96, -45, -43, -26, -37, -31, -32, -96, -56, -69, -73, -55, -32, -31, -36, -33, -46, -52, -42, -47, -14, -13, -24, -15, -24, -25, -30, -10, -9, -14, -11, -24, -30, -8, -11, -17};
    }

    static {
        A06();
        A03 = C0475Fp.class.getSimpleName();
    }

    public C0475Fp(XI xi, JW jw, String str, Uri uri, Map<String, String> map, C01170m c01170m, boolean z) {
        super(xi, jw, str, c01170m, z);
        this.A00 = uri;
        this.A01 = map;
    }

    private Intent A00(C01150k c01150k) {
        C0475Fp c0475Fp = this;
        ResolveInfo next = null;
        Intent intentA01 = null;
        Iterator<ResolveInfo> it = null;
        List<ResolveInfo> listQueryIntentActivities = null;
        String strA03 = null;
        PackageManager packageManager = null;
        char c2 = TextUtils.isEmpty(c01150k.A05()) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (Intent) null;
                case 3:
                    c0475Fp = c0475Fp;
                    c01150k = c01150k;
                    if (!C01140j.A04(((AbstractC01100f) c0475Fp).A00, c01150k.A05())) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    return (Intent) null;
                case 5:
                    c01150k = c01150k;
                    strA03 = c01150k.A03();
                    if (!TextUtils.isEmpty(strA03)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 6:
                    strA03 = strA03;
                    if (!strA03.startsWith(A03(81, 4, 127))) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    strA03 = strA03;
                    if (!strA03.startsWith(A03(107, 10, 71))) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return new Intent(A03(46, 26, 100), Uri.parse(strA03));
                case '\t':
                    c0475Fp = c0475Fp;
                    c01150k = c01150k;
                    packageManager = ((AbstractC01100f) c0475Fp).A00.getPackageManager();
                    if (!TextUtils.isEmpty(c01150k.A04())) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    strA03 = strA03;
                    if (!TextUtils.isEmpty(strA03)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return packageManager.getLaunchIntentForPackage(c01150k.A05());
                case '\f':
                    c0475Fp = c0475Fp;
                    c01150k = c01150k;
                    packageManager = packageManager;
                    intentA01 = c0475Fp.A01(c01150k);
                    listQueryIntentActivities = packageManager.queryIntentActivities(intentA01, 65536);
                    if (intentA01.getComponent() != null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    listQueryIntentActivities = listQueryIntentActivities;
                    it = listQueryIntentActivities.iterator();
                    c2 = 14;
                    break;
                case 14:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c01150k = c01150k;
                    it = it;
                    next = it.next();
                    if (!next.activityInfo.packageName.equals(c01150k.A05())) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    intentA01 = intentA01;
                    next = next;
                    intentA01.setComponent(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
                    c2 = 17;
                    break;
                case 17:
                    listQueryIntentActivities = listQueryIntentActivities;
                    if (!listQueryIntentActivities.isEmpty()) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 18:
                    intentA01 = intentA01;
                    if (intentA01.getComponent() != null) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    return (Intent) null;
                case 20:
                    return intentA01;
            }
        }
    }

    private Intent A01(C01150k c01150k) {
        Intent intent = new Intent(A03(207, 26, 72));
        intent.addFlags(268435456);
        char c2 = !TextUtils.isEmpty(c01150k.A05()) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c01150k = c01150k;
                    if (!TextUtils.isEmpty(c01150k.A04())) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c01150k = c01150k;
                    intent = intent;
                    intent.setComponent(new ComponentName(c01150k.A05(), c01150k.A04()));
                    c2 = 4;
                    break;
                case 4:
                    c01150k = c01150k;
                    if (!TextUtils.isEmpty(c01150k.A03())) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    c01150k = c01150k;
                    intent = intent;
                    intent.setData(Uri.parse(c01150k.A03()));
                    c2 = 6;
                    break;
                case 6:
                    return intent;
            }
        }
    }

    private final Uri A02() {
        String queryParameter = this.A00.getQueryParameter(A03(72, 9, k.AppCompatTheme_windowMinWidthMinor));
        if (!TextUtils.isEmpty(queryParameter)) {
            return Uri.parse(queryParameter);
        }
        return Uri.parse(String.format(Locale.US, A03(17, 22, 61), this.A00.getQueryParameter(A03(233, 8, 67))));
    }

    /* JADX WARN: Incorrect condition in loop: B:13:0x0044 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.facebook.ads.redexgen.X.C01150k> A04() {
        /*
            r6 = this;
            android.net.Uri r3 = r6.A00
            r2 = 169(0xa9, float:2.37E-43)
            r1 = 12
            r0 = 0
            java.lang.String r0 = A03(r2, r1, r0)
            java.lang.String r4 = r3.getQueryParameter(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L24
            r2 = 15
            r1 = 2
            r0 = 61
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L26
        L24:
            r0 = 0
            return r0
        L26:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L56
            r3.<init>(r4)     // Catch: org.json.JSONException -> L56
            r2 = 39
            r1 = 7
            r0 = 105(0x69, float:1.47E-43)
            java.lang.String r0 = A03(r2, r1, r0)     // Catch: org.json.JSONException -> L56
            org.json.JSONArray r2 = r3.optJSONArray(r0)     // Catch: org.json.JSONException -> L56
            if (r2 == 0) goto L66
            r1 = 0
        L40:
            int r0 = r2.length()     // Catch: org.json.JSONException -> L56
            if (r1 >= r0) goto L66
            org.json.JSONObject r0 = r2.optJSONObject(r1)     // Catch: org.json.JSONException -> L56
            com.facebook.ads.redexgen.X.0k r0 = com.facebook.ads.redexgen.X.C01150k.A00(r0)     // Catch: org.json.JSONException -> L56
            if (r0 == 0) goto L53
            r5.add(r0)     // Catch: org.json.JSONException -> L56
        L53:
            int r1 = r1 + 1
            goto L40
        L56:
            r4 = move-exception
            java.lang.String r3 = com.facebook.ads.redexgen.X.C0475Fp.A03
            r2 = 181(0xb5, float:2.54E-43)
            r1 = 26
            r0 = 27
            java.lang.String r0 = A03(r2, r1, r0)
            android.util.Log.w(r3, r0, r4)
        L66:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0475Fp.A04():java.util.List");
    }

    private final List<Intent> A05() {
        C0475Fp c0475Fp = this;
        Intent intent = null;
        Iterator<C01150k> it = null;
        List<C01150k> listA04 = c0475Fp.A04();
        ArrayList arrayList = new ArrayList();
        char c2 = listA04 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    listA04 = listA04;
                    it = listA04.iterator();
                    c2 = 3;
                    break;
                case 3:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0475Fp = c0475Fp;
                    it = it;
                    intent = c0475Fp.A00(it.next());
                    if (intent == null) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    arrayList = arrayList;
                    intent = intent;
                    arrayList.add(intent);
                    c2 = 3;
                    break;
                case 6:
                    return arrayList;
            }
        }
    }

    private boolean A07() {
        C0475Fp c0475Fp = this;
        Intent next = null;
        Iterator<Intent> it = null;
        List<Intent> listA05 = c0475Fp.A05();
        char c2 = listA05 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    listA05 = listA05;
                    it = listA05.iterator();
                    break;
                case 5:
                    it = it;
                    next = it.next();
                    c2 = 6;
                case 6:
                    try {
                        c0475Fp = c0475Fp;
                        if (LA.A0B(((AbstractC01100f) c0475Fp).A00, next)) {
                            return true;
                        }
                    } catch (Exception unused) {
                        break;
                    }
                    break;
                case '\n':
                    return false;
            }
            c2 = it.hasNext() ? (char) 5 : '\n';
        }
    }

    private boolean A08() {
        C0475Fp c0475Fp = this;
        String fallbackUrl = null;
        LG lg = new LG();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0475Fp = c0475Fp;
                        LG.A08(lg, ((AbstractC01100f) c0475Fp).A00, c0475Fp.A02(), c0475Fp.A02);
                        return true;
                    } catch (Exception unused) {
                        String str = A03(142, 27, 111) + c0475Fp.A00.toString();
                        fallbackUrl = c0475Fp.A00.getQueryParameter(A03(85, 22, 59));
                        if (fallbackUrl == null) {
                            c2 = '\n';
                            break;
                        } else {
                            c2 = '\b';
                            break;
                        }
                    }
                case '\b':
                    fallbackUrl = fallbackUrl;
                    if (fallbackUrl.length() <= 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0475Fp = c0475Fp;
                    lg = lg;
                    fallbackUrl = fallbackUrl;
                    LG.A08(lg, ((AbstractC01100f) c0475Fp).A00, Uri.parse(fallbackUrl), c0475Fp.A02);
                    c2 = '\n';
                    break;
                case '\n':
                    return false;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01100f
    @Nullable
    public final EnumC01090e A09() {
        C0475Fp c0475Fp = this;
        String strA03 = null;
        EnumC01090e enumC01090e = null;
        String strA032 = A03(0, 15, 62);
        boolean redirectedToApp = c0475Fp.A07();
        char c2 = !redirectedToApp ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    c0475Fp = c0475Fp;
                    boolean redirectedToApp2 = c0475Fp.A08();
                    if (!redirectedToApp2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    strA03 = A03(241, 16, 89);
                    c2 = '\t';
                    break;
                case 6:
                    try {
                        strA03 = A03(k.AppCompatTheme_windowActionModeOverlay, 25, 7);
                        c2 = '\t';
                        break;
                    } catch (Exception unused) {
                        enumC01090e = EnumC01090e.A02;
                        c2 = '\n';
                        break;
                    }
                case '\t':
                    strA03 = strA03;
                    strA032 = strA03;
                    c2 = '\n';
                    break;
                case '\n':
                    c0475Fp.A01.put(strA032, String.valueOf(true));
                    return enumC01090e;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.RO
    public final void A0C() {
        C0475Fp c0475Fp = this;
        EnumC01090e enumC01090eA09 = null;
        char c2 = ((RO) c0475Fp).A01 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0475Fp = c0475Fp;
                    enumC01090eA09 = c0475Fp.A09();
                    c2 = 3;
                    break;
                case 3:
                    C0475Fp c0475Fp2 = c0475Fp;
                    c0475Fp2.A0D(c0475Fp2.A01, enumC01090eA09);
                    return;
                case 4:
                    c0475Fp = c0475Fp;
                    c0475Fp.A01.put(A03(241, 16, 89), String.valueOf(true));
                    c2 = 3;
                    break;
            }
        }
    }
}

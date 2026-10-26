package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* renamed from: com.facebook.ads.redexgen.X.0j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01140j {
    public static byte[] A00;

    static {
        A02();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 63);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{61, 24, 92, 21, 15, 92, 21, 18, 10, 29, 16, 21, 24, 29, 8, 25, 24, 92, 11, 21, 8, 20, 19, 9, 8, 92, 8, 19, 23, 25, 18, 82, 101, 116, 109};
    }

    public static Collection<String> A01(JSONArray jSONArray) {
        HashSet hashSet = null;
        int i = 0;
        char c2 = jSONArray != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    jSONArray = jSONArray;
                    if (jSONArray.length() != 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return (Collection) null;
                case 4:
                    hashSet = new HashSet();
                    i = 0;
                    c2 = 5;
                    break;
                case 5:
                    jSONArray = jSONArray;
                    if (i >= jSONArray.length()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    jSONArray = jSONArray;
                    hashSet = hashSet;
                    hashSet.add(jSONArray.optString(i));
                    i++;
                    c2 = 5;
                    break;
                case 7:
                    return hashSet;
            }
        }
    }

    public static boolean A03(XI xi, InterfaceC01130i interfaceC01130i, JW jw) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Collection<String> collectionA61 = null;
        String strA5k = null;
        Iterator<String> it = null;
        EnumC01120h enumC01120hA6R = interfaceC01130i.A6R();
        char c2 = enumC01120hA6R != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    enumC01120hA6R = enumC01120hA6R;
                    if (enumC01120hA6R != EnumC01120h.A03) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    interfaceC01130i = interfaceC01130i;
                    z3 = false;
                    collectionA61 = interfaceC01130i.A61();
                    if (collectionA61 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    collectionA61 = collectionA61;
                    if (!collectionA61.isEmpty()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return false;
                case 7:
                    collectionA61 = collectionA61;
                    it = collectionA61.iterator();
                    c2 = '\b';
                    break;
                case '\b':
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    xi = xi;
                    it = it;
                    if (!A04(xi, it.next())) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    z3 = true;
                    c2 = 11;
                    break;
                case 11:
                    enumC01120hA6R = enumC01120hA6R;
                    z = true;
                    if (enumC01120hA6R != EnumC01120h.A02) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    z2 = true;
                    c2 = '\r';
                    break;
                case '\r':
                    if (z3 != z2) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    interfaceC01130i = interfaceC01130i;
                    strA5k = interfaceC01130i.A5k();
                    if (!TextUtils.isEmpty(strA5k)) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 15:
                    jw.A88(strA5k, null);
                    return z;
                case 16:
                    z2 = false;
                    c2 = '\r';
                    break;
                case 17:
                    xi.A04().A83(A00(32, 3, 59), C03008a.A0O, new C03018b(A00(0, 32, 67)));
                    return z;
                case 18:
                    return false;
            }
        }
    }

    public static boolean A04(XI xi, String str) throws PackageManager.NameNotFoundException {
        boolean z = false;
        PackageManager packageManager = null;
        char c2 = TextUtils.isEmpty(str) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    xi = xi;
                    packageManager = xi.getPackageManager();
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        packageManager.getPackageInfo(str, z ? 1 : 0);
                        return z;
                    } catch (PackageManager.NameNotFoundException unused) {
                        return false;
                    } catch (RuntimeException unused2) {
                        return false;
                    }
            }
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.6U, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C6U {
    public static byte[] A03;
    public final Context A00;
    public final Intent A01;
    public final C02525u A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 83);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A03 = new byte[]{-71, -58, -68, -54, -57, -63, -68, -122, -63, -58, -52, -67, -58, -52, -122, -71, -69, -52, -63, -57, -58, -122, -102, -103, -84, -84, -99, -86, -79, -73, -101, -96, -103, -90, -97, -99, -100};
    }

    public C6U(Context context, C02525u c02525u) {
        this.A00 = context;
        this.A02 = c02525u;
        this.A01 = this.A00.registerReceiver(null, new IntentFilter(A00(0, 37, 5)));
    }

    @Nullable
    public final C02746q A02() {
        C6U c6u = this;
        Context context = null;
        String packageName = null;
        char c2 = c6u.A02.A0a() == EnumC02656h.A0F ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (C02746q) null;
                case 3:
                    c6u = c6u;
                    context = c6u.A00;
                    if (context != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    packageName = A00(37, 0, 46);
                    c2 = 5;
                    break;
                case 5:
                    return new C02746q(packageName);
                case 6:
                    context = context;
                    packageName = context.getPackageName();
                    c2 = 5;
                    break;
            }
        }
    }

    public final AbstractC02766s A03(float f) {
        return new X4(SystemClock.elapsedRealtime(), A02(), f);
    }

    public final AbstractC02766s A04(int i) {
        return new X6(SystemClock.elapsedRealtime(), A02(), i);
    }

    public final AbstractC02766s A05(int i, HashMap<String, String> map) {
        C6U c6u = this;
        HashMap<String, Integer> map2 = null;
        Iterator<String> it = null;
        char c2 = c6u.A01 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    map = map;
                    map2 = new HashMap<>();
                    it = map.keySet().iterator();
                    c2 = 3;
                    break;
                case 3:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c6u = c6u;
                    map = map;
                    map2 = map2;
                    it = it;
                    String next = it.next();
                    map2.put(next, Integer.valueOf(c6u.A01.getIntExtra(map.get(next), i)));
                    c2 = 3;
                    break;
                case 5:
                    return c6u.A0C(map2);
                case 6:
                    return c6u.A07(EnumC02726o.A06);
            }
        }
    }

    public final AbstractC02766s A06(long j) {
        return new X8(SystemClock.elapsedRealtime(), A02(), j);
    }

    public final AbstractC02766s A07(EnumC02726o enumC02726o) {
        return new X3(SystemClock.elapsedRealtime(), A02(), new C02736p(enumC02726o));
    }

    public final AbstractC02766s A08(String str) {
        return new XB(SystemClock.elapsedRealtime(), A02(), str);
    }

    public final AbstractC02766s A09(String str) {
        C6U c6u = this;
        AbstractC02766s abstractC02766sA07 = null;
        Intent intent = c6u.A01;
        char c2 = intent != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c6u = c6u;
                    str = str;
                    intent = intent;
                    abstractC02766sA07 = c6u.A08(intent.getStringExtra(str));
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    c6u = c6u;
                    abstractC02766sA07 = c6u.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }

    public final AbstractC02766s A0A(String str, int i) {
        C6U c6u = this;
        AbstractC02766s abstractC02766sA07 = null;
        Intent intent = c6u.A01;
        char c2 = intent != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c6u = c6u;
                    str = str;
                    intent = intent;
                    abstractC02766sA07 = c6u.A04(intent.getIntExtra(str, i));
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    c6u = c6u;
                    abstractC02766sA07 = c6u.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }

    public final AbstractC02766s A0B(String str, boolean z) {
        C6U c6u = this;
        AbstractC02766s abstractC02766sA07 = null;
        Intent intent = c6u.A01;
        char c2 = intent != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c6u = c6u;
                    str = str;
                    intent = intent;
                    abstractC02766sA07 = c6u.A0F(intent.getBooleanExtra(str, z));
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    c6u = c6u;
                    abstractC02766sA07 = c6u.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }

    public final AbstractC02766s A0C(HashMap<String, Integer> map) {
        return new X5(SystemClock.elapsedRealtime(), A02(), map);
    }

    public final AbstractC02766s A0D(List<InterfaceC02676j> list) {
        return new X7(SystemClock.elapsedRealtime(), A02(), list, EnumC02756r.A03);
    }

    public final AbstractC02766s A0E(List<String> resultList) {
        return new X7(SystemClock.elapsedRealtime(), A02(), resultList, EnumC02756r.A0C);
    }

    public final AbstractC02766s A0F(boolean z) {
        return new X1(SystemClock.elapsedRealtime(), A02(), z);
    }
}

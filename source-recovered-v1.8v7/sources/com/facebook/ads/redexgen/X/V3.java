package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Singleton;

@Singleton
/* loaded from: assets/audience_network.dex */
public final class V3 extends C6U {
    public static byte[] A01;
    public final BatteryManager A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 99);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{79, 70, 85, 70, 79, 2, 51, 72, 32, 37, 53, 55, 58, 51, 56, 59, 46, 46, 63, 40, 35, 55, 59, 52, 59, 61, 63, 40};
    }

    public V3(Context context, C02525u c02525u) {
        super(context, c02525u);
        this.A00 = (BatteryManager) context.getSystemService(A01(14, 14, 57));
    }

    public final InterfaceC02616d A0G() {
        return new C0861Uv(this);
    }

    public final InterfaceC02616d A0H() {
        return new V1(this);
    }

    public final InterfaceC02616d A0I() {
        HashMap map = new HashMap();
        map.put(A01(8, 1, 45), 2);
        map.put(A01(5, 1, 0), 3);
        return new V0(this, map);
    }

    public final InterfaceC02616d A0J() {
        HashMap map = new HashMap();
        map.put(A01(7, 1, 71), A01(0, 5, 64));
        map.put(A01(6, 1, 35), A01(9, 5, 53));
        return new C0856Uq(this, map);
    }

    public final InterfaceC02616d A0K() {
        return new C0864Uy(this);
    }

    public final InterfaceC02616d A0L() {
        return new C0859Ut(this);
    }

    public final InterfaceC02616d A0M() {
        return new C0862Uw(this);
    }

    public final InterfaceC02616d A0N() {
        return new V2(this);
    }

    public final InterfaceC02616d A0O() {
        return new C0860Uu(this);
    }

    public final InterfaceC02616d A0P() {
        return new C0857Ur(this);
    }

    public final InterfaceC02616d A0Q() {
        return new C0863Ux(this);
    }

    public final InterfaceC02616d A0R() {
        return new C0858Us(this);
    }

    public final InterfaceC02616d A0S() {
        return new C0865Uz(this);
    }

    public final AbstractC02766s A0T(int i) {
        V3 v3 = this;
        BatteryManager batteryManager = null;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = Build.VERSION.SDK_INT < 21 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return v3.A07(EnumC02726o.A04);
                case 3:
                    v3 = v3;
                    batteryManager = v3.A00;
                    if (batteryManager == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    v3 = v3;
                    batteryManager = batteryManager;
                    abstractC02766sA07 = v3.A04(batteryManager.getIntProperty(i));
                    c2 = 5;
                    break;
                case 5:
                    return abstractC02766sA07;
                case 6:
                    v3 = v3;
                    abstractC02766sA07 = v3.A07(EnumC02726o.A06);
                    c2 = 5;
                    break;
            }
        }
    }

    @SuppressLint({"Nullable Dereference"})
    public final AbstractC02766s A0U(HashMap<String, Integer> resultMap) {
        V3 v3 = this;
        Iterator<String> it = null;
        HashMap<String, Integer> map = null;
        char c2 = Build.VERSION.SDK_INT < 21 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return v3.A07(EnumC02726o.A04);
                case 3:
                    v3 = v3;
                    if (v3.A00 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    resultMap = resultMap;
                    Set<String> setKeySet = resultMap.keySet();
                    map = new HashMap<>();
                    it = setKeySet.iterator();
                    c2 = 5;
                    break;
                case 5:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    v3 = v3;
                    resultMap = resultMap;
                    map = map;
                    it = it;
                    String next = it.next();
                    map.put(next, Integer.valueOf(v3.A00.getIntProperty(resultMap.get(next).intValue())));
                    c2 = 5;
                    break;
                case 7:
                    return v3.A0C(map);
                case '\b':
                    return v3.A07(EnumC02726o.A06);
            }
        }
    }
}

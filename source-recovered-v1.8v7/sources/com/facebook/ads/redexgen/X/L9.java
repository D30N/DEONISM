package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.support.annotation.Nullable;
import d.b.a.b.k;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class L9 {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 31);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{-98, -85, -95, -81, -84, -90, -95, 107, -98, -83, -83, 107, 126, -96, -79, -90, -77, -90, -79, -74, -111, -91, -81, -94, -98, -95, 14, -1, 19, 17, 3, 2, -86, -68, -71, -71, -84, -75, -69, -120, -86, -69, -80, -67, -80, -69, -64, -101, -81, -71, -84, -88, -85, -85, Byte.MAX_VALUE, -95, -78, -89, -76, -89, -78, -89, -93, -79, -13, -11, 6, -5, 8, -5, 6, 11};
    }

    @Nullable
    public static Activity A00() {
        try {
            return A01();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Activity A01() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Object activityThread = null;
        Iterator it = null;
        Class<?> cls = null;
        Class<?> cls2 = Class.forName(A02(0, 26, 30));
        Object objInvoke = cls2.getMethod(A02(32, 21, 40), new Class[0]).invoke(null, new Object[0]);
        Field declaredField = cls2.getDeclaredField(A02(53, 11, 31));
        declaredField.setAccessible(true);
        Map map = (Map) declaredField.get(objInvoke);
        char c2 = map == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (Activity) null;
                case 3:
                    map = map;
                    it = map.values().iterator();
                    c2 = 4;
                    break;
                case 4:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    it = it;
                    activityThread = it.next();
                    cls = activityThread.getClass();
                    Field pausedField = cls.getDeclaredField(A02(26, 6, 127));
                    pausedField.setAccessible(true);
                    if (!pausedField.getBoolean(activityThread)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 6:
                    Field pausedField2 = cls.getDeclaredField(A02(64, 8, k.AppCompatTheme_windowActionBar));
                    pausedField2.setAccessible(true);
                    return (Activity) pausedField2.get(activityThread);
                case 7:
                    return (Activity) null;
            }
        }
    }
}

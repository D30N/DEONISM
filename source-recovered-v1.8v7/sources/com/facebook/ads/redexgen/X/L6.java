package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import d.b.a.b.k;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class L6 {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 8);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A00 = new byte[]{18, 29, 23, 1, 28, 26, 23, 93, 18, 3, 3, 93, 50, 16, 7, 26, 5, 26, 7, 10, 39, 27, 1, 22, 18, 23, 12, 26, 29, 29, 10, 1, 27, 46, 12, 27, 6, 25, 6, 27, 22, 59, 7, 29, 10, 14, 11, 86, 89, 83, 69, 88, 94, 83, 25, 94, 89, 67, 82, 89, 67, 25, 84, 86, 67, 82, 80, 88, 69, 78, 25, 123, 118, 98, 121, 116, Byte.MAX_VALUE, 114, 101, 107, 71, 101, 114, 111, 112, 111, 114, 111, 99, 117, 51, 49, 38, 59, 36, 59, 38, 43};
    }

    public static L5 A00() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Activity activity = null;
        Iterator it = null;
        Class<?> cls = Class.forName(A03(0, 26, k.AppCompatTheme_windowMinWidthMinor));
        Object objInvoke = cls.getMethod(A03(26, 21, 103), new Class[0]).invoke(null, new Object[0]);
        Field activitiesField = cls.getDeclaredField(A03(79, 11, 14));
        activitiesField.setAccessible(true);
        Map map = (Map) activitiesField.get(objInvoke);
        char c2 = map == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return L5.A0B;
                case 3:
                    map = map;
                    it = map.values().iterator();
                    c2 = 4;
                    break;
                case 4:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    it = it;
                    Object activityThread = it.next();
                    Field declaredField = activityThread.getClass().getDeclaredField(A03(90, 8, 90));
                    declaredField.setAccessible(true);
                    activity = (Activity) declaredField.get(activityThread);
                    if (!activity.isTaskRoot()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    activity = activity;
                    if (!activity.getIntent().getCategories().contains(A03(47, 32, 63))) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return L5.A06;
                case '\b':
                    return L5.A09;
            }
        }
    }

    public static L5 A01(Context context) {
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        if (Build.VERSION.SDK_INT < 21) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 4;
                            break;
                        }
                    } catch (Exception unused) {
                        return L5.A04;
                    }
                case 4:
                    return A02(context);
                case 6:
                    return A00();
            }
        }
    }

    @RequiresApi(api = 21)
    public static L5 A02(Context context) {
        Iterator<ActivityManager.AppTask> it = null;
        ActivityManager.RecentTaskInfo taskInfo = null;
        List<ActivityManager.AppTask> appTasks = null;
        ActivityManager activityManager = null;
        char c2 = context == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return L5.A0C;
                case 3:
                    context = context;
                    activityManager = (ActivityManager) context.getSystemService(A03(90, 8, 90));
                    if (activityManager != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return L5.A07;
                case 5:
                    activityManager = activityManager;
                    appTasks = activityManager.getAppTasks();
                    if (!appTasks.isEmpty()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return L5.A0A;
                case 7:
                    appTasks = appTasks;
                    it = appTasks.iterator();
                    c2 = '\b';
                    break;
                case '\b':
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    it = it;
                    taskInfo = it.next().getTaskInfo();
                    if (taskInfo != null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\n':
                    taskInfo = taskInfo;
                    if (taskInfo.baseIntent == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    taskInfo = taskInfo;
                    if (taskInfo.baseIntent.getCategories() == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    taskInfo = taskInfo;
                    if (!taskInfo.baseIntent.getCategories().contains(A03(47, 32, 63))) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    return L5.A05;
                case 14:
                    return L5.A08;
            }
        }
    }
}

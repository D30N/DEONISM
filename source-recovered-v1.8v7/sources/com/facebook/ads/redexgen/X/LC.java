package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: assets/audience_network.dex */
public final class LC implements Application.ActivityLifecycleCallbacks {
    public static Context A00;
    public static XJ A01;
    public static byte[] A02;
    public static final List<LB> A03;
    public static final Map<Activity, Integer> A04;

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 103);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{113, 64, 84, 82, 68, 69, 1, 64, 66, 85, 72, 87, 72, 85, 88, 1, 72, 82, 1, 79, 78, 85, 1, 83, 68, 82, 84, 76, 68, 69, 15, 95, 124, 116, 48, 113, 115, 100, 121, 102, 121, 100, 105, 48, 99, 100, 113, 100, 117, 42, 48, 58, 13, 27, 82, 72, 88, 90, 77, 102, 76, 77, 80, 85, 60, 30, 9, 20, 11, 20, 9, 4, 93, 25, 20, 14, 30, 15, 24, 13, 28, 19, 30, 20, 24, 14, 83, 7, 43, 42, 39, 49, 54, 54, 33, 42, 48, 100, 41, 43, 32, 45, 34, 45, 39, 37, 48, 45, 43, 42, 100, 33, 60, 39, 33, 52, 48, 45, 43, 42, 100, 48, 44, 54, 43, 51, 42, 32, 49, 54, 45, 42, 35, 100, 54, 33, 35, 45, 55, 48, 33, 54, 5, 39, 48, 45, 50, 45, 48, 61, 7, 37, 40, 40, 38, 37, 39, 47, 55, 8, 45, 55, 48, 33, 42, 33, 54, 52, 56, 89, 123, 108, 113, 110, 113, 108, 97, 34, 56, 116, 101, 124, 121, 72, 72, 123, 87, 86, 76, 93, 64, 76, 24, 81, 75, 24, 86, 87, 76, 24, 121, 72, 72, 84, 81, 91, 89, 76, 81, 87, 86, 22, 109, 97, 51, 36, 39, 123, 97};
    }

    static {
        A02();
        A04 = Collections.synchronizedMap(new WeakHashMap());
        A03 = Collections.synchronizedList(new ArrayList());
    }

    @Nullable
    public static synchronized Activity A00() {
        Activity lastResumedActivity = null;
        Iterator<Map.Entry<Activity, Integer>> it = A04.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Activity, Integer> next = it.next();
            if (next.getValue().intValue() == 3) {
                Activity lastResumedActivity2 = next.getKey();
                lastResumedActivity = lastResumedActivity2;
                break;
            }
        }
        Activity activityA00 = null;
        boolean z = lastResumedActivity == null || Build.VERSION.SDK_INT < 28;
        if (z) {
            activityA00 = L9.A00();
        }
        if (A01 != null && z && lastResumedActivity != activityA00) {
            C03018b c03018b = new C03018b(A01(64, 23, 26), A01(51, 5, 15) + lastResumedActivity + A01(212, 7, 38) + activityA00);
            c03018b.A03(1);
            A01.A04().A83(A01(56, 8, 94), C03008a.A01, c03018b);
        }
        return lastResumedActivity != null ? lastResumedActivity : activityA00;
    }

    public static synchronized void A03(XJ xj) {
        A01 = xj;
        A00 = xj.getApplicationContext();
        if (A00 instanceof Application) {
            ANActivityLifecycleCallbacksListener aNActivityLifecycleCallbacksListener = ANActivityLifecycleCallbacksListener.getANActivityLifecycleCallbacksListener();
            if (aNActivityLifecycleCallbacksListener != null) {
                Map<Activity, Integer> activityStateMap = aNActivityLifecycleCallbacksListener.getActivityStateMap();
                synchronized (activityStateMap) {
                    try {
                        Map<Activity, Integer> activityStateMap2 = A04;
                        activityStateMap2.putAll(activityStateMap);
                    } catch (ConcurrentModificationException unused) {
                        xj.A04().A83(A01(56, 8, 94), C03008a.A00, new C03018b(A01(87, 80, 35)));
                    }
                }
                ANActivityLifecycleCallbacksListener.unregisterActivityCallbacks(xj);
            }
            ((Application) A00).registerActivityLifecycleCallbacks(new LC());
        } else {
            xj.A04().A83(A01(179, 3, k.AppCompatTheme_viewInflaterClass), C03008a.A0S, new C03018b(A01(182, 30, 95)));
        }
    }

    public static void A04(LB lb) {
        A03.add(lb);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        A04.put(activity, 1);
        Iterator<LB> it = A03.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    activity = activity;
                    bundle = bundle;
                    it = it;
                    it.next().onActivityCreated(activity, bundle);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        A04.put(activity, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Integer num = A04.get(activity);
        char c2 = num != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    num = num;
                    if (num.intValue() == 3) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    activity = activity;
                    num = num;
                    C03018b c03018b = new C03018b(A01(0, 31, 70), A01(31, 20, k.AppCompatTheme_windowFixedHeightMinor) + num + A01(167, 12, 127) + activity);
                    c03018b.A03(0);
                    A01.A04().A83(A01(56, 8, 94), C03008a.A01, c03018b);
                    c2 = 4;
                    break;
                case 4:
                    A04.put(activity, 4);
                    return;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        A04.put(activity, 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        A04.put(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        A04.put(activity, 5);
    }
}

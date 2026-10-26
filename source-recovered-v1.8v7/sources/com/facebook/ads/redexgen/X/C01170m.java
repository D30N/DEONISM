package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import d.b.a.b.k;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.0m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01170m {
    public static byte[] A06;

    @Nullable
    public Application A01;

    @Nullable
    public C01160l A03;
    public final JW A05;
    public long A00 = 0;

    @Nullable
    public String A04 = null;

    @Nullable
    public EnumC01090e A02 = null;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 80);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A06 = new byte[]{70, 69, 71, 79, 123, 80, 77, 73, 65, 28, 21, 17, 6, 21, 47, 4, 25, 29, 21, 81, 75, 74, 93, 81, 83, 91};
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.ads.redexgen.X.0l] */
    public C01170m(JW jw, final Activity activity, int i) {
        this.A05 = jw;
        this.A01 = activity.getApplication();
        this.A03 = new Application.ActivityLifecycleCallbacks(activity, this) { // from class: com.facebook.ads.redexgen.X.0l

            @Nullable
            public C01170m A00;
            public final WeakReference<Activity> A01;

            {
                this.A01 = new WeakReference<>(activity);
                this.A00 = this;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity2, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity2) {
                C01160l c01160l = this;
                Activity activity3 = null;
                char c2 = c01160l.A00 == null ? (char) 2 : (char) 3;
                while (true) {
                    switch (c2) {
                        case 2:
                            return;
                        case 3:
                            c01160l = c01160l;
                            activity3 = c01160l.A01.get();
                            if (activity3 == null) {
                                c2 = 5;
                                break;
                            } else {
                                c2 = 4;
                                break;
                            }
                        case 4:
                            activity2 = activity2;
                            activity3 = activity3;
                            if (!activity2.equals(activity3)) {
                                c2 = 6;
                                break;
                            } else {
                                c2 = 5;
                                break;
                            }
                        case 5:
                            c01160l = c01160l;
                            c01160l.A00.A05();
                            c01160l.A00 = null;
                            c2 = 6;
                            break;
                        case 6:
                            return;
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity2) {
            }
        };
    }

    public static C01170m A00(JW jw, Activity activity) {
        return A01(jw, activity, Build.VERSION.SDK_INT);
    }

    @VisibleForTesting
    @Nullable
    public static C01170m A01(JW jw, Activity activity, int i) {
        char c2 = activity != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (i < 14) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return new C01170m(jw, activity, i);
                case 4:
                    return (C01170m) null;
            }
        }
    }

    private void A04(String str, long j, long j2, @Nullable EnumC01090e enumC01090e) {
        HashMap map = new HashMap();
        map.put(A02(9, 10, 32), Long.toString(j));
        map.put(A02(0, 9, k.AppCompatTheme_windowActionBarOverlay), Long.toString(j2));
        if (enumC01090e != null) {
            map.put(A02(19, 7, 110), enumC01090e.name());
        }
        this.A05.A8O(str, map);
    }

    @TargetApi(14)
    public final void A05() {
        C01170m c01170m = this;
        C01160l c01160l = null;
        c01170m.A04(c01170m.A04, c01170m.A00, System.currentTimeMillis(), c01170m.A02);
        Application application = c01170m.A01;
        char c2 = application != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c01170m = c01170m;
                    c01160l = c01170m.A03;
                    if (c01160l == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c01170m = c01170m;
                    application = application;
                    c01160l = c01160l;
                    application.unregisterActivityLifecycleCallbacks(c01160l);
                    c01170m.A03 = null;
                    c01170m.A01 = null;
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A06(@Nullable EnumC01090e enumC01090e) {
        this.A02 = enumC01090e;
    }

    @TargetApi(14)
    public final void A07(String str) {
        String str2 = str;
        C01170m c01170m = this;
        c01170m.A04 = str2;
        char c2 = c01170m.A03 != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c01170m = c01170m;
                    if (c01170m.A01 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c01170m = c01170m;
                    c01170m.A00 = System.currentTimeMillis();
                    c01170m.A01.registerActivityLifecycleCallbacks(c01170m.A03);
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    c01170m = c01170m;
                    str2 = str2;
                    c01170m.A04(str2, -1L, -1L, EnumC01090e.A03);
                    c2 = 4;
                    break;
            }
        }
    }
}

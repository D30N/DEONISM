package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.support.annotation.Nullable;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01772u {
    public static Field A00;
    public static boolean A01;
    public static Field A02;
    public static Field A03;
    public static boolean A04;
    public static boolean A05;
    public static byte[] A06;

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 127);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A06 = new byte[]{93, 125, 89, 94, 103, 89, 84, 68, 88, 121, 85, 119, 119, 113, 103, 103, 125, 118, 125, 120, 125, 96, 109, 80, 113, 120, 113, 115, 117, 96, 113, 93, 67, 68, 78, 69, 93, 32, 0, 36, 35, 5, 40, 36, 42, 37, 57};
    }

    static {
        A02();
        A01 = false;
    }

    private final long A00() {
        return ValueAnimator.getFrameDelay();
    }

    public int A03(View view) {
        return 0;
    }

    public int A04(View view) {
        return 0;
    }

    public int A05(View view) {
        boolean z = false;
        char c2 = !A04 ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    try {
                        A02 = View.class.getDeclaredField(A01(37, 10, 50));
                        A02.setAccessible(z);
                    } catch (NoSuchFieldException unused) {
                    }
                    A04 = z;
                    c2 = '\n';
                    break;
                case '\n':
                    Field field = A02;
                    if (field != null) {
                        try {
                            return ((Integer) field.get(view)).intValue();
                        } catch (Exception unused2) {
                            return 0;
                        }
                    }
                    return 0;
            }
        }
    }

    public int A06(View view) {
        boolean z = false;
        char c2 = !A05 ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    try {
                        A03 = View.class.getDeclaredField(A01(0, 9, 79));
                        A03.setAccessible(z);
                    } catch (NoSuchFieldException unused) {
                    }
                    A05 = z;
                    c2 = '\n';
                    break;
                case '\n':
                    Field field = A03;
                    if (field != null) {
                        try {
                            return ((Integer) field.get(view)).intValue();
                        } catch (Exception unused2) {
                            return 0;
                        }
                    }
                    return 0;
            }
        }
    }

    public Display A07(View view) {
        if (A0I(view)) {
            return ((WindowManager) view.getContext().getSystemService(A01(31, 6, 85))).getDefaultDisplay();
        }
        return null;
    }

    public C3C A08(View view, C3C c3c) {
        return c3c;
    }

    public C3C A09(View view, C3C c3c) {
        return c3c;
    }

    public void A0A(View view) {
        view.postInvalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0B(View view) {
        if (view instanceof InterfaceC01592c) {
            ((InterfaceC01592c) view).stopNestedScroll();
        }
    }

    public void A0C(View view, int i) {
    }

    public final void A0D(View view, @Nullable C2Z c2z) {
        View.AccessibilityDelegate accessibilityDelegateA00 = null;
        char c2 = c2z == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    accessibilityDelegateA00 = null;
                    c2 = 3;
                    break;
                case 3:
                    view.setAccessibilityDelegate(accessibilityDelegateA00);
                    return;
                case 4:
                    c2z = c2z;
                    accessibilityDelegateA00 = c2z.A00();
                    c2 = 3;
                    break;
            }
        }
    }

    public void A0E(View view, InterfaceC01622f interfaceC01622f) {
    }

    public void A0F(View view, Runnable runnable) {
        view.postDelayed(runnable, A00());
    }

    public void A0G(View view, Runnable runnable, long j) {
        view.postDelayed(runnable, A00() + j);
    }

    public boolean A0H(View view) {
        return false;
    }

    public boolean A0I(View view) {
        boolean z = false;
        char c2 = view.getWindowToken() != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final boolean A0J(View view) {
        boolean z = false;
        char c2 = A01 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    if (A00 == null) {
                        try {
                            A00 = View.class.getDeclaredField(A01(9, 22, 107));
                            A00.setAccessible(true);
                        } catch (Throwable unused) {
                            A01 = true;
                            return z;
                        }
                    }
                    try {
                        if (A00.get(view) == null) {
                            c2 = 15;
                            break;
                        } else {
                            c2 = 14;
                            break;
                        }
                    } catch (Throwable unused2) {
                        A01 = true;
                        return z;
                    }
                case 14:
                    z = true;
                    c2 = 15;
                    break;
                case 15:
                    return z;
            }
        }
    }
}

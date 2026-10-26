package com.facebook.ads.redexgen.X;

import android.R;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import d.b.a.b.k;
import java.lang.reflect.Method;
import java.util.Arrays;

@Deprecated
/* renamed from: com.facebook.ads.redexgen.X.2w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01782w {
    public static Method A00;
    public static byte[] A01;

    public static String A03(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 16);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A01 = new byte[]{81, 125, 103, 126, 118, 50, 124, 125, 102, 50, 116, 123, 124, 118, 50, Byte.MAX_VALUE, 119, 102, 122, 125, 118, 50, 117, 119, 102, 65, 113, 115, 126, 119, 118, 65, 113, 96, 125, 126, 126, 84, 115, 113, 102, 125, 96, 58, 59, 50, 125, 124, 50, 68, 123, 119, 101, 81, 125, 124, 116, 123, 117, 103, 96, 115, 102, 123, 125, 124, 2, 0, 17, 54, 6, 4, 9, 0, 1, 54, 6, 23, 10, 9, 9, 35, 4, 6, 17, 10, 23, 94, 97, 109, Byte.MAX_VALUE, 75, 103, 102, 110, 97, 111, 75, 103, 101, 120, 105, 124};
    }

    static {
        A04();
        if (Build.VERSION.SDK_INT == 25) {
            try {
                A00 = ViewConfiguration.class.getDeclaredMethod(A03(66, 21, k.AppCompatTheme_windowActionModeOverlay), new Class[0]);
            } catch (Exception unused) {
                Log.i(A03(87, 16, 24), A03(0, 66, 2));
            }
        }
    }

    public static float A00(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }
        return A02(viewConfiguration, context);
    }

    public static float A01(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
        return A02(viewConfiguration, context);
    }

    public static float A02(ViewConfiguration viewConfiguration, Context context) {
        Method method = null;
        TypedValue typedValue = null;
        char c2 = Build.VERSION.SDK_INT >= 25 ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    method = A00;
                    if (method == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c2 = 4;
                    break;
                case 4:
                    try {
                        return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
                    } catch (Exception unused) {
                        Log.i(A03(87, 16, 24), A03(0, 66, 2));
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    context = context;
                    typedValue = new TypedValue();
                    if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return typedValue.getDimension(context.getResources().getDisplayMetrics());
                case '\f':
                    return 0.0f;
            }
        }
    }
}

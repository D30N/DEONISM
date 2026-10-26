package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Wb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0893Wb extends C6U {

    @Nullable
    public static Class A01;

    @Nullable
    public static Method A02;
    public static byte[] A03;
    public static final String A04;
    public final Context A00;

    public static String A05(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 109);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A08() {
        A03 = new byte[]{109, 98, 104, 126, 99, 101, 104, 34, 99, Byte.MAX_VALUE, 34, 95, 117, Byte.MAX_VALUE, 120, 105, 97, 92, 126, 99, 124, 105, 126, 120, 101, 105, Byte.MAX_VALUE, 103, 80, 80, 77, 80, 2, 68, 71, 86, 65, 74, 75, 76, 69, 2, 113, 91, 81, 86, 71, 79, 2, 97, 78, 67, 81, 81, 12, 59, 59, 38, 59, 105, 47, 44, 61, 42, 33, 32, 39, 46, 105, 26, 48, 58, 61, 44, 36, 105, 4, 44, 61, 33, 38, 45, 33, 35, 50};
    }

    static {
        A08();
        A04 = C0893Wb.class.getSimpleName();
    }

    public C0893Wb(Context context, C02525u c02525u) {
        super(context, c02525u);
        this.A00 = context;
        A01 = A04(this.A00);
        A02 = A06();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public AbstractC02766s A02(HashMap<String, C0892Wa> map) {
        return new X9(SystemClock.elapsedRealtime(), A02(), map, EnumC02756r.A0C);
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    public static Class A04(Context context) {
        try {
            return context.getClassLoader().loadClass(A05(0, 27, 97));
        } catch (ClassNotFoundException e) {
            Log.e(A04, A05(27, 27, 79), e);
            return null;
        }
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    public static Method A06() {
        Class<?>[] clsArr = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        clsArr = new Class[]{String.class};
                        if (A01 == null) {
                            c2 = 7;
                        } else {
                            c2 = '\b';
                            continue;
                        }
                    } catch (NoSuchMethodException e) {
                        Log.e(A04, A05(54, 28, 36), e);
                        return (Method) null;
                    }
                case 7:
                    return (Method) null;
                case '\b':
                    return A01.getMethod(A05(82, 3, 43), clsArr);
            }
            Log.e(A04, A05(54, 28, 36), e);
            return (Method) null;
        }
    }

    public final InterfaceC02616d A0G(List<C02606c> list) {
        return new WZ(this, list);
    }
}

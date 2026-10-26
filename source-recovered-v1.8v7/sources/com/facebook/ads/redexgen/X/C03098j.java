package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.annotation.Nullable;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.8j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03098j {
    public static Sensor A00;
    public static Sensor A01;
    public static SensorEventListener A02;
    public static SensorEventListener A03;
    public static SensorManager A04;
    public static Map<String, String> A05;
    public static byte[] A06;
    public static String[] A07;
    public static final AtomicReference<String> A08;
    public static volatile float[] A09;
    public static volatile float[] A0A;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 106);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A06 = new byte[]{34, 27, 44, 27, 34, -19, -7, -20, -20, -26, -6, -9, -24, -22, -20, 68, 54, 63, 68, 64, 67, -32, -19, -29, -15, -18, -24, -29, -83, -24, -19, -13, -28, -19, -13, -83, -32, -30, -13, -24, -18, -19, -83, -63, -64, -45, -45, -60, -47, -40, -34, -62, -57, -64, -51, -58, -60, -61, -63, -20, -9, 9, 30, 9, 17, 20, 9, 10, 20, 13, 7, 21, 13, 21, 23, 26, 33, 74, -15, 27, 24, 29, 10, 29, 18, 24, 23, 8, -16, -21, -16, -35, -24, -37, -23, -31, -23, -21, -18, -11, 20, 18, 27, 18, 31, 22, 16, 63, 65, 65, 67, 74, 67, 80, 77, 75, 67, 82, 67, 80, 61, 20, 4, 2, 13, 6, -22, -17, -24, -7, -18, -16, -11, -18, 7, 9, 26, 15, 28, 15, 26, 31, -21, -22, -3, -3, -18, -5, 2, 68, 69, 50, 69, 70, 68};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A08(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        String strValueOf = String.valueOf(statFs.getAvailableBlocks() * statFs.getBlockSize());
        A08.set(strValueOf);
        A05.put(A01(5, 10, 29), strValueOf);
    }

    static {
        A03();
        A04 = null;
        A00 = null;
        A01 = null;
        A05 = new ConcurrentHashMap();
        A07 = new String[]{A01(77, 1, 104), A01(60, 1, 20), A01(59, 1, 8)};
        A08 = new AtomicReference<>();
    }

    @Nullable
    public static String A00() {
        return A08.get();
    }

    public static Map<String, String> A02() {
        Map<String, String> currentAnalogInfo = new HashMap<>();
        currentAnalogInfo.putAll(A05);
        A0C(currentAnalogInfo);
        return currentAnalogInfo;
    }

    public static synchronized void A06() {
        if (A04 != null) {
            A04.unregisterListener(A02);
        }
        A02 = null;
    }

    public static synchronized void A07() {
        if (A04 != null) {
            A04.unregisterListener(A03);
        }
        A03 = null;
    }

    public static void A09(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(A01(134, 8, 60))).getMemoryInfo(memoryInfo);
        A05.put(A01(61, 16, 62), String.valueOf(memoryInfo.availMem));
        if (Build.VERSION.SDK_INT >= 16) {
            A05.put(A01(88, 12, 18), String.valueOf(memoryInfo.totalMem));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.facebook.ads.redexgen.X.8C] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.facebook.ads.redexgen.X.8C] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.content.Intent] */
    public static void A0A(C8C c8c) {
        try {
            c8c = c8c.registerReceiver(null, new IntentFilter(A01(21, 37, 21)));
            if (c8c == 0) {
                return;
            }
            int status = c8c.getIntExtra(A01(0, 5, 76), -1);
            int level = c8c.getIntExtra(A01(k.AppCompatTheme_windowFixedWidthMinor, 5, 55), -1);
            int intExtra = c8c.getIntExtra(A01(149, 6, 103), -1);
            boolean z = intExtra == 2 || intExtra == 5;
            float f = 0.0f;
            if (level > 0) {
                float batteryLevel = level;
                f = (status / batteryLevel) * 100.0f;
            }
            A05.put(A01(142, 7, 31), String.valueOf(f));
            A05.put(A01(126, 8, 29), z ? A01(58, 1, 38) : A01(78, 1, 87));
        } catch (IllegalArgumentException e) {
            c8c.A04().A83(A01(100, 7, 67), C03008a.A1A, new C03018b(e));
        }
    }

    public static synchronized void A0B(C8C c8c) {
        A09(c8c);
        A0A(c8c);
        if (A04 == null) {
            A04 = (SensorManager) c8c.getSystemService(A01(15, 6, 103));
            if (A04 == null) {
                return;
            }
        }
        if (A00 == null) {
            A00 = A04.getDefaultSensor(1);
        }
        if (A01 == null) {
            A01 = A04.getDefaultSensor(4);
        }
        C03068g c03068g = null;
        if (A02 == null) {
            A02 = new C03078h();
            if (A00 != null) {
                A04.registerListener(A02, A00, 3);
            }
        }
        if (A03 == null) {
            A03 = new C03088i();
            if (A01 != null) {
                A04.registerListener(A03, A01, 3);
            }
        }
    }

    public static void A0C(Map<String, String> map) {
        int i = 0;
        int iMin = 0;
        int i2 = 0;
        int iMin2 = 0;
        float[] fArr = A09;
        float[] fArr2 = A0A;
        int i3 = fArr != null ? 2 : 5;
        while (true) {
            switch (i3) {
                case 2:
                    fArr = fArr;
                    int length = A07.length;
                    int i4 = fArr.length;
                    iMin = Math.min(length, i4);
                    i2 = 0;
                    i3 = 3;
                    break;
                case 3:
                    if (i2 >= iMin) {
                        i3 = 5;
                        break;
                    } else {
                        i3 = 4;
                        break;
                    }
                case 4:
                    map = map;
                    fArr = fArr;
                    map.put(A01(107, 14, k.AppCompatTheme_windowActionBarOverlay) + A07[i2], String.valueOf(fArr[i2]));
                    i2++;
                    i3 = 3;
                    break;
                case 5:
                    fArr2 = fArr2;
                    if (fArr2 == null) {
                        i3 = 9;
                        break;
                    } else {
                        i3 = 6;
                        break;
                    }
                case 6:
                    fArr2 = fArr2;
                    iMin2 = Math.min(A07.length, fArr2.length);
                    i = 0;
                    i3 = 7;
                    break;
                case 7:
                    if (i >= iMin2) {
                        i3 = 9;
                        break;
                    } else {
                        i3 = 8;
                        break;
                    }
                case 8:
                    map = map;
                    fArr2 = fArr2;
                    map.put(A01(79, 9, 63) + A07[i], String.valueOf(fArr2[i]));
                    i++;
                    i3 = 7;
                    break;
                case 9:
                    return;
            }
        }
    }
}

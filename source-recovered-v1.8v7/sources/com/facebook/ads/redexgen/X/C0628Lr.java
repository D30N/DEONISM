package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.internal.api.BuildConfigApi;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Lr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0628Lr {
    public static byte[] A0I;
    public static final String A0J;

    @Nullable
    public View A0F;

    @Nullable
    public View A0G;
    public boolean A0H;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = -1;
    public int A03 = -1;
    public long A0C = -1;
    public int A09 = -1;
    public long A0E = -1;
    public long A0D = -1;
    public int A0A = -1;
    public int A0B = -1;
    public int A07 = -1;
    public int A08 = -1;
    public float A00 = -1.0f;
    public float A02 = -1.0f;
    public float A01 = -1.0f;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 52);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A0I = new byte[]{14, 2, 47, 42, 30, 33, 61, 39, 58, 39, 33, 32, 22, 70, 88, 85, 69, 89, 30, 13, 8, 5, 25, 31, 53, 39, 40, 45, 39, 47, 29, 23, 30, 3, 18, 20, 30, 17, 20, 30, 22, 57, 24, 17, 28, 4, 41, 20, 16, 24, 70, 92, 108, 67, 70, 76, 68, 104, 90, 78, 93, 75, 106, 65, 78, 77, 67, 74, 75, 21, 15, 60, 59, 46, 61, 59, 22, 40, 59, 62, 51, 47, 41, 2, 30, 19, 31, 17, 30, 2, 29, 24, 44, 19, 15, 21, 8, 21, 19, 18, 37, 100, 115, 117, 121, 100, 114, Byte.MAX_VALUE, 120, 113, 54, Byte.MAX_VALUE, 123, 102, 100, 115, 101, 101, Byte.MAX_VALUE, 121, 120, 44, 54, 69, 78, 68, 116, 73, 77, 69, 90, 93, 72, 91, 93, 125, 64, 68, 76, 109, 98, 103, 109, 101, 107, 106, 88, 103, 107, 121, 90, 111, 105, 67, 76, 73, 67, 75, 120, 69, 78, 68, 121, 76, 64, 3, 12, 9, 3, 11, 7, 21, 1, 18, 4, 52, 9, 13, 5, 90, 64, 39, 44, 38, 26, 8, 15, 26, 9, 15, 35};
    }

    static {
        A02();
        A0J = C0628Lr.class.getSimpleName();
    }

    private LW A00() {
        C0628Lr c0628Lr = this;
        Object tag = null;
        View view = null;
        View view2 = c0628Lr.A0G;
        char c2 = view2 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0628Lr = c0628Lr;
                    view = c0628Lr.A0F;
                    if (view != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return LW.A0I;
                case 4:
                    view2 = view2;
                    view = view;
                    if (view2 == view) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return LW.A0G;
                case 6:
                    if (Build.VERSION.SDK_INT >= 4) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return LW.A0F;
                case '\b':
                    c0628Lr = c0628Lr;
                    tag = c0628Lr.A0G.getTag(LW.A02);
                    if (tag != null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return LW.A0H;
                case '\n':
                    tag = tag;
                    if (!(tag instanceof LW)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case 11:
                    return LW.A0J;
                case '\f':
                    return (LW) tag;
            }
        }
    }

    public final long A03() {
        if (A07()) {
            return System.currentTimeMillis() - this.A0C;
        }
        return -1L;
    }

    public final Map<String, String> A04() {
        C0628Lr c0628Lr = this;
        long clickDelayMs = 0;
        String strValueOf = null;
        long j = 0;
        long j2 = 0;
        char c2 = !c0628Lr.A0H ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (Map) null;
                case 3:
                    c0628Lr = c0628Lr;
                    strValueOf = String.valueOf((c0628Lr.A02 * c0628Lr.A01) / 2.0f);
                    j2 = c0628Lr.A0C;
                    if (j2 <= 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0628Lr = c0628Lr;
                    j = c0628Lr.A0D;
                    if (j <= j2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    clickDelayMs = j - j2;
                    c2 = 6;
                    break;
                case 6:
                    C0628Lr c0628Lr2 = c0628Lr;
                    String str = strValueOf;
                    HashMap map = new HashMap();
                    map.put(A01(2, 11, k.AppCompatTheme_windowMinWidthMajor), String.valueOf(c0628Lr2.A04));
                    map.put(A01(90, 11, 72), String.valueOf(c0628Lr2.A05));
                    map.put(A01(13, 5, 5), String.valueOf(c0628Lr2.A06));
                    map.put(A01(84, 6, 66), String.valueOf(c0628Lr2.A03));
                    map.put(A01(36, 14, 73), String.valueOf(clickDelayMs));
                    map.put(A01(130, 9, 29), String.valueOf(c0628Lr2.A0E));
                    map.put(A01(k.AppCompatTheme_windowMinWidthMinor, 7, 20), String.valueOf(c0628Lr2.A0D));
                    map.put(A01(185, 6, 79), String.valueOf(c0628Lr2.A0A));
                    map.put(A01(71, 6, k.AppCompatTheme_windowMinWidthMinor), String.valueOf(c0628Lr2.A0B));
                    map.put(A01(153, 6, 20), String.valueOf(c0628Lr2.A07));
                    map.put(A01(25, 6, 112), String.valueOf(c0628Lr2.A08));
                    map.put(A01(181, 4, k.AppCompatTheme_windowFixedHeightMajor), String.valueOf(c0628Lr2.A07));
                    map.put(A01(159, 4, 20), String.valueOf(c0628Lr2.A08));
                    map.put(A01(31, 5, 69), String.valueOf(c0628Lr2.A00));
                    map.put(A01(77, 7, 110), str);
                    map.put(A01(18, 7, 88), str);
                    map.put(A01(139, 14, 58), String.valueOf(c0628Lr2.A00().A05()));
                    return map;
                case 7:
                    clickDelayMs = -1;
                    c2 = 6;
                    break;
            }
        }
    }

    public final void A05() {
        if (BuildConfigApi.isDebug()) {
            String str = A01(101, 22, 34) + this.A0C;
        }
        this.A0C = System.currentTimeMillis();
    }

    public final void A06(MotionEvent motionEvent, View view, View view2) {
        View view3 = view;
        MotionEvent motionEvent2 = motionEvent;
        View view4 = view2;
        C0628Lr c0628Lr = this;
        int[] clickViewLocation = null;
        int i = 0;
        InputDevice.MotionRange motionRange = null;
        float f = 0.0f;
        InputDevice device = null;
        int action = 0;
        int[] iArr = null;
        InputDevice.MotionRange motionRange2 = null;
        char c2 = 0;
        char c3 = !c0628Lr.A0H ? (char) 2 : '\b';
        while (true) {
            switch (c3) {
                case 2:
                    c0628Lr = c0628Lr;
                    motionEvent2 = motionEvent2;
                    c0628Lr.A0H = true;
                    device = motionEvent2.getDevice();
                    if (device == null) {
                        c3 = 6;
                        break;
                    } else {
                        c3 = 3;
                        break;
                    }
                case 3:
                    device = device;
                    c2 = 0;
                    motionRange = device.getMotionRange(0);
                    motionRange2 = device.getMotionRange(1);
                    if (motionRange == null) {
                        c3 = 6;
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    motionRange2 = motionRange2;
                    if (motionRange2 == null) {
                        c3 = 6;
                        break;
                    } else {
                        c3 = 5;
                        break;
                    }
                case 5:
                    c0628Lr = c0628Lr;
                    motionRange = motionRange;
                    motionRange2 = motionRange2;
                    c0628Lr.A01 = Math.min(motionRange.getRange(), motionRange2.getRange());
                    c3 = 6;
                    break;
                case 6:
                    c0628Lr = c0628Lr;
                    if (c0628Lr.A01 > 0.0f) {
                        c3 = '\b';
                        break;
                    } else {
                        c3 = 7;
                        break;
                    }
                case 7:
                    c0628Lr = c0628Lr;
                    view3 = view3;
                    c0628Lr.A01 = Math.min(view3.getMeasuredWidth(), view3.getMeasuredHeight());
                    c3 = '\b';
                    break;
                case '\b':
                    motionEvent2 = motionEvent2;
                    view3 = view3;
                    view4 = view4;
                    i = 2;
                    clickViewLocation = new int[2];
                    view3.getLocationInWindow(clickViewLocation);
                    iArr = new int[2];
                    view4.getLocationInWindow(iArr);
                    action = motionEvent2.getAction();
                    f = 0.5f;
                    if (action == 0) {
                        c3 = 15;
                        break;
                    } else {
                        c3 = '\t';
                        break;
                    }
                case '\t':
                    if (action == 1) {
                        c3 = 14;
                        break;
                    } else {
                        c3 = '\n';
                        break;
                    }
                case '\n':
                    if (action == i) {
                        c3 = '\r';
                        break;
                    } else {
                        c3 = 11;
                        break;
                    }
                case 11:
                    if (action == 3) {
                        c3 = 14;
                        break;
                    } else {
                        c3 = '\f';
                        break;
                    }
                case '\f':
                    return;
                case '\r':
                    c0628Lr = c0628Lr;
                    motionEvent2 = motionEvent2;
                    float f2 = c0628Lr.A00;
                    c0628Lr.A00 = f2 - (f2 / c0628Lr.A09);
                    float f3 = c0628Lr.A00;
                    float pressure = motionEvent2.getPressure();
                    int i2 = c0628Lr.A09;
                    c0628Lr.A00 = f3 + (pressure / i2);
                    float f4 = c0628Lr.A02;
                    c0628Lr.A02 = f4 - (f4 / i2);
                    float f5 = c0628Lr.A02;
                    float size = motionEvent2.getSize();
                    int i3 = c0628Lr.A09;
                    c0628Lr.A02 = f5 + (size / i3);
                    c0628Lr.A09 = i3 + 1;
                    c3 = '\f';
                    break;
                case 14:
                    c0628Lr = c0628Lr;
                    motionEvent2 = motionEvent2;
                    view4 = view4;
                    clickViewLocation = clickViewLocation;
                    iArr = iArr;
                    c0628Lr.A0D = System.currentTimeMillis();
                    c0628Lr.A07 = (int) (((((int) (motionEvent2.getX() + f)) + iArr[c2]) - clickViewLocation[c2]) / C0635Ly.A01);
                    c0628Lr.A08 = (int) (((((int) (motionEvent2.getY() + f)) + iArr[1]) - clickViewLocation[1]) / C0635Ly.A01);
                    c0628Lr.A0F = view4;
                    c3 = '\f';
                    break;
                case 15:
                    c0628Lr = c0628Lr;
                    motionEvent2 = motionEvent2;
                    view3 = view3;
                    view4 = view4;
                    clickViewLocation = clickViewLocation;
                    iArr = iArr;
                    c0628Lr.A04 = (int) (clickViewLocation[c2] / C0635Ly.A01);
                    c0628Lr.A05 = (int) (clickViewLocation[1] / C0635Ly.A01);
                    c0628Lr.A06 = (int) (view3.getWidth() / C0635Ly.A01);
                    c0628Lr.A03 = (int) (view3.getHeight() / C0635Ly.A01);
                    c0628Lr.A09 = 1;
                    c0628Lr.A0E = System.currentTimeMillis();
                    c0628Lr.A0A = (int) (((((int) (motionEvent2.getX() + f)) + iArr[c2]) - clickViewLocation[c2]) / C0635Ly.A01);
                    c0628Lr.A0B = (int) (((((int) (motionEvent2.getY() + f)) + iArr[1]) - clickViewLocation[1]) / C0635Ly.A01);
                    c0628Lr.A00 = motionEvent2.getPressure();
                    c0628Lr.A02 = motionEvent2.getSize();
                    c0628Lr.A0G = view4;
                    c3 = '\f';
                    break;
            }
        }
    }

    public final boolean A07() {
        boolean z = false;
        char c2 = this.A0C != -1 ? (char) 2 : (char) 4;
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

    public final boolean A08() {
        return this.A0H;
    }

    public final boolean A09(Context context) {
        boolean z = false;
        int iA05 = JQ.A05(context);
        long jA03 = A03();
        char c2 = iA05 >= 0 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    if (jA03 >= iA05) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    boolean isClickGuardEnabled = BuildConfigApi.isDebug();
                    if (!isClickGuardEnabled) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    String str = A01(50, 21, 27) + z + A01(163, 18, 84) + iA05 + A01(0, 2, 22) + jA03;
                    c2 = 6;
                    break;
                case 6:
                    return z;
                case 7:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }
}

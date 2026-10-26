package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.view.accessibility.AccessibilityNodeInfo;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3K, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3K {
    public static byte[] A02;
    public static final C3G A03;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int A00 = -1;
    public final AccessibilityNodeInfo A01;

    public static String A08(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 18);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A09() {
        A02 = new byte[]{121, 117, 82, 73, 15, 6, 10, 28, 26, 8, 11, 5, 12, 83, 73, 76, 78, 89, 68, 66, 67, 82, 78, 65, 72, 76, 95, 82, 76, 78, 78, 72, 94, 94, 68, 79, 68, 65, 68, 89, 84, 82, 75, 66, 78, 88, 94, 80, 82, 69, 88, 94, 95, 78, 82, 68, 69, 80, 82, 69, 88, 94, 95, 78, 87, 94, 82, 68, 66, 88, 67, 0, 12, 13, 23, 6, 13, 23, 39, 6, 16, 0, 17, 10, 19, 23, 10, 12, 13, 89, 67, 34, 32, 55, 42, 44, 45, 60, 51, 49, 38, 53, 42, 44, 54, 48, 60, 34, 55, 60, 46, 44, 53, 38, 46, 38, 45, 55, 60, 36, 49, 34, 45, 54, 47, 34, 49, 42, 55, 58, 93, 70, 22, 7, 5, 13, 7, 1, 3, 40, 7, 11, 3, 92, 70, 111, 116, 49, 58, 53, 54, 56, 49, 48, 110, 116, 63, 36, 114, 109, 97, 115, 77, 96, 62, 36, 109, 111, 120, 101, 99, 98, 115, 124, 109, Byte.MAX_VALUE, 120, 105, 59, 57, 46, 51, 53, 52, 37, 42, 40, 63, 44, 51, 53, 47, 41, 37, 50, 46, 55, 54, 37, 63, 54, 63, 55, 63, 52, 46, 94, 69, 3, 10, 6, 16, 22, 0, 1, 95, 69, 25, 27, 12, 17, 23, 22, 7, 11, 29, 20, 29, 27, 12, 9, 21, 14, 77, 70, 75, 77, 69, 79, 76, 66, 75, 20, 14, 73, 82, 41, 3, 24, 75, 93, 84, 93, 91, 76, 93, 92, 2, 24, 69, 71, 80, 77, 75, 74, 91, 87, 71, 86, 75, 72, 72, 91, 70, 69, 71, 79, 83, 69, 86, 64, 18, 16, 7, 26, 28, 29, 12, 29, 22, 11, 7, 12, 27, 7, 30, 31, 12, 22, 31, 22, 30, 22, 29, 7, 99, 97, 118, 107, 109, 108, 125, 108, 103, 122, 118, 125, 99, 118, 125, 111, 109, 116, 103, 111, 103, 108, 118, 125, 101, 112, 99, 108, 119, 110, 99, 112, 107, 118, 123, 57, 59, 44, 49, 55, 54, 39, 59, 52, 49, 59, 51, 82, 73, 29, 12, 17, 29, 83, 73, 41, 50, 113, 122, 119, 113, 121, 119, 118, 40, 50, 117, 119, 96, 125, 123, 122, 107, 103, 113, 96, 107, 103, 113, 120, 113, 119, 96, 125, 123, 122, 105, 107, 124, 97, 103, 102, 119, 125, 102, 99, 102, 103, Byte.MAX_VALUE, 102, 88, 67, 1, 12, 22, 13, 7, 16, 42, 13, 48, 0, 17, 6, 6, 13, 89, 67, 56, 58, 45, 48, 54, 55, 38, 58, 53, 60, 56, 43, 38, 42, 60, 53, 60, 58, 45, 48, 54, 55, 9, 18, 66, 83, 65, 65, 69, 93, 64, 86, 8, 18, 14, 12, 27, 6, 0, 1, 16, 3, 0, 1, 8, 16, 12, 3, 6, 12, 4, 66, 89, 26, 21, 16, 26, 18, 24, 27, 21, 28, 67, 89, 31, 4, 72, 75, 74, 67, 103, 72, 77, 71, 79, 69, 70, 72, 65, 30, 4, 9, 11, 28, 1, 7, 6, 23, 9, 11, 11, 13, 27, 27, 1, 10, 1, 4, 1, 28, 17, 23, 14, 7, 11, 29, 27, 26, 1, 82, 66, 83, 78, 77, 77, 64, 67, 77, 68, 27, 1, 16, 18, 5, 24, 30, 31, 14, 18, 29, 20, 16, 3, 14, 23, 30, 18, 4, 2, 106, 113, 50, 61, 48, 34, 34, 31, 48, 60, 52, 107, 113, 88, 90, 77, 80, 86, 87, 70, 74, 90, 75, 86, 85, 85, 70, 95, 86, 75, 78, 88, 75, 93, 26, 1, 67, 78, 84, 79, 69, 82, 104, 79, 113, 64, 83, 68, 79, 85, 27, 1, 55, 53, 34, 63, 57, 56, 41, 53, 57, 38, 47};
    }

    static {
        A09();
        if (Build.VERSION.SDK_INT >= 24) {
            A03 = new C0Q() { // from class: com.facebook.ads.redexgen.X.05
            };
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            A03 = new C0Q();
            return;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            A03 = new C01050a();
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            A03 = new C01070c();
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            A03 = new AnonymousClass29();
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            A03 = new C3W();
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            A03 = new C0458Ew();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A03 = new C0807Ss();
        } else {
            A03 = new C3G();
        }
    }

    public C3K(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.A01 = accessibilityNodeInfo;
    }

    private final int A00() {
        return this.A01.getActions();
    }

    public static C3K A01(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C3K(accessibilityNodeInfo);
    }

    private final CharSequence A02() {
        return this.A01.getClassName();
    }

    private final CharSequence A03() {
        return this.A01.getContentDescription();
    }

    private final CharSequence A04() {
        return this.A01.getPackageName();
    }

    private final CharSequence A05() {
        return this.A01.getText();
    }

    private final String A06() {
        return A03.A02(this.A01);
    }

    public static String A07(int i) {
        char c2 = i != 1 ? (char) 2 : (char) 22;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 2) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    switch (i) {
                        case 4:
                            c2 = 5;
                            break;
                        case 8:
                            c2 = 6;
                            break;
                        case 16:
                            c2 = 7;
                            break;
                        case 32:
                            c2 = '\b';
                            break;
                        case 64:
                            c2 = '\t';
                            break;
                        case 128:
                            c2 = '\n';
                            break;
                        case 256:
                            c2 = 11;
                            break;
                        case 512:
                            c2 = '\f';
                            break;
                        case 1024:
                            c2 = '\r';
                            break;
                        case 2048:
                            c2 = 14;
                            break;
                        case 4096:
                            c2 = 15;
                            break;
                        case 8192:
                            c2 = 16;
                            break;
                        case 16384:
                            c2 = 17;
                            break;
                        case 32768:
                            c2 = 18;
                            break;
                        case 65536:
                            c2 = 19;
                            break;
                        case 131072:
                            c2 = 20;
                            break;
                        default:
                            c2 = 4;
                            break;
                    }
                case 4:
                    return A08(391, 14, 58);
                case 5:
                    return A08(217, 13, 74);
                case 6:
                    return A08(423, 22, 107);
                case 7:
                    return A08(340, 12, 106);
                case '\b':
                    return A08(457, 17, 93);
                case '\t':
                    return A08(504, 26, 90);
                case '\n':
                    return A08(15, 32, 31);
                case 11:
                    return A08(305, 35, 48);
                case '\f':
                    return A08(91, 39, 113);
                case '\r':
                    return A08(281, 24, 65);
                case 14:
                    return A08(178, 28, 104);
                case 15:
                    return A08(575, 21, 11);
                case 16:
                    return A08(259, 22, 22);
                case 17:
                    return A08(614, 11, 100);
                case 18:
                    return A08(166, 12, 62);
                case 19:
                    return A08(47, 10, 3);
                case 20:
                    return A08(371, 20, 38);
                case 21:
                    return A08(544, 18, 67);
                case 22:
                    return A08(57, 12, 3);
            }
        }
    }

    private final void A0A(Rect rect) {
        this.A01.getBoundsInParent(rect);
    }

    private final void A0B(Rect rect) {
        this.A01.getBoundsInScreen(rect);
    }

    private final boolean A0C() {
        return this.A01.isCheckable();
    }

    private final boolean A0D() {
        return this.A01.isChecked();
    }

    private final boolean A0E() {
        return this.A01.isClickable();
    }

    private final boolean A0F() {
        return this.A01.isEnabled();
    }

    private final boolean A0G() {
        return this.A01.isFocusable();
    }

    private final boolean A0H() {
        return this.A01.isFocused();
    }

    private final boolean A0I() {
        return this.A01.isLongClickable();
    }

    private final boolean A0J() {
        return this.A01.isPassword();
    }

    private final boolean A0K() {
        return this.A01.isScrollable();
    }

    private final boolean A0L() {
        return this.A01.isSelected();
    }

    public final AccessibilityNodeInfo A0M() {
        return this.A01;
    }

    public final void A0N(int i) {
        this.A01.addAction(i);
    }

    public final void A0O(CharSequence charSequence) {
        this.A01.setClassName(charSequence);
    }

    public final void A0P(Object obj) {
        A03.A03(this.A01, ((C3H) obj).A00);
    }

    public final void A0Q(Object obj) {
        A03.A04(this.A01, ((C3I) obj).A00);
    }

    public final void A0R(boolean z) {
        this.A01.setScrollable(z);
    }

    public final boolean equals(Object obj) {
        C3K c3k = this;
        C3K other = null;
        AccessibilityNodeInfo accessibilityNodeInfo = null;
        char c2 = c3k == obj ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return true;
                case 3:
                    obj = obj;
                    if (obj != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    c3k = c3k;
                    obj = obj;
                    if (c3k.getClass() == obj.getClass()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return false;
                case 7:
                    c3k = c3k;
                    obj = obj;
                    other = (C3K) obj;
                    accessibilityNodeInfo = c3k.A01;
                    if (accessibilityNodeInfo != null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    other = other;
                    if (other.A01 == null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return false;
                case '\n':
                    other = other;
                    accessibilityNodeInfo = accessibilityNodeInfo;
                    if (!accessibilityNodeInfo.equals(other.A01)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case 11:
                    return false;
                case '\f':
                    return true;
            }
        }
    }

    public final int hashCode() {
        int iHashCode = 0;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A01;
        char c2 = accessibilityNodeInfo == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    iHashCode = 0;
                    c2 = 3;
                    break;
                case 3:
                    return iHashCode;
                case 4:
                    accessibilityNodeInfo = accessibilityNodeInfo;
                    iHashCode = accessibilityNodeInfo.hashCode();
                    c2 = 3;
                    break;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        A0A(rect);
        sb.append(A08(596, 18, 51) + rect);
        A0B(rect);
        sb.append(A08(405, 18, 113) + rect);
        sb.append(A08(130, 15, k.AppCompatTheme_windowActionBarOverlay));
        sb.append(A04());
        sb.append(A08(562, 13, 67));
        sb.append(A02());
        sb.append(A08(352, 8, k.AppCompatTheme_windowMinWidthMinor));
        sb.append(A05());
        sb.append(A08(69, 22, 113));
        sb.append(A03());
        sb.append(A08(156, 10, 22));
        sb.append(A06());
        sb.append(A08(231, 13, 60));
        sb.append(A0C());
        sb.append(A08(360, 11, 0));
        sb.append(A0D());
        sb.append(A08(2, 13, k.AppCompatTheme_windowMinWidthMinor));
        sb.append(A0G());
        sb.append(A08(206, 11, k.AppCompatTheme_windowFixedHeightMinor));
        sb.append(A0H());
        sb.append(A08(247, 12, 42));
        sb.append(A0L());
        sb.append(A08(474, 13, 107));
        sb.append(A0E());
        sb.append(A08(487, 17, 54));
        sb.append(A0I());
        sb.append(A08(145, 11, 70));
        sb.append(A0F());
        sb.append(A08(445, 12, 32));
        sb.append(A0J());
        sb.append(A08(530, 14, 51) + A0K());
        sb.append(A08(244, 3, 96));
        int iA00 = A00();
        int actionBits = 2;
        while (true) {
            switch (actionBits) {
                case 2:
                    if (iA00 == 0) {
                        actionBits = 5;
                        break;
                    } else {
                        actionBits = 3;
                        break;
                    }
                case 3:
                    sb = sb;
                    int actionBits2 = Integer.numberOfTrailingZeros(iA00);
                    int i = 1 << actionBits2;
                    int action = i ^ (-1);
                    iA00 &= action;
                    sb.append(A07(i));
                    if (iA00 == 0) {
                        actionBits = 2;
                        break;
                    } else {
                        actionBits = 4;
                        break;
                    }
                case 4:
                    sb = sb;
                    sb.append(A08(0, 2, 71));
                    actionBits = 2;
                    break;
                case 5:
                    StringBuilder sb2 = sb;
                    sb2.append(A08(230, 1, 70));
                    return sb2.toString();
            }
        }
    }
}

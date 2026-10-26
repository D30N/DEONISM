package com.facebook.ads.redexgen.X;

import android.support.annotation.VisibleForTesting;
import android.util.Log;
import android.view.View;
import d.b.a.b.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4Y, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C4Y {
    public static byte[] A0I;
    public static final List<Object> A0J;
    public C0452Eq A08;
    public WeakReference<C0452Eq> A09;
    public int A0C;
    public final View A0H;
    public int A03 = -1;
    public int A01 = -1;
    public long A05 = -1;
    public int A00 = -1;
    public int A04 = -1;
    public C4Y A06 = null;
    public C4Y A07 = null;
    public List<Object> A0A = null;
    public List<Object> A0B = null;
    public int A0D = 0;
    public C4O A0F = null;
    public boolean A0G = false;
    public int A0E = 0;

    @VisibleForTesting
    public int A02 = -1;

    public static String A02(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 101);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A0I = new byte[]{121, 42, 58, 43, 56, 41, 121, 49, 100, Byte.MAX_VALUE, 117, 116, 119, 120, Byte.MAX_VALUE, 116, 117, 49, 112, 117, 112, 97, 101, 116, 99, 49, 97, 126, 98, 120, 101, 120, 126, Byte.MAX_VALUE, 51, 99, 124, 96, 122, 103, 122, 124, 125, 46, 106, 101, 49, 40, 53, 1, 32, 49, 36, 38, 45, 32, 33, 37, 107, 106, 37, 117, 100, 119, 96, 107, 113, 105, 81, 90, 83, 92, 85, 87, 97, 81, 64, 83, 66, 111, 119, 117, 121, 54, 53, 61, 9, 54, 42, 100, 95, 10, 17, 29, 16, 10, 17, 27, 9, 5, 85, 105, 85, 74, 86, 31, 55, 98, 103, 115, 118, 99, 114, 89, 102, 106, 120, 63, 118, 120, 113, 112, 109, 122, 123, 57, 119, 118, 109, 57, 107, 124, 122, 96, 122, 117, 120, 123, 117, 124, 49, 121, 100, 117, 125, 70, 121, 117, 103, 48, 125, 113, 105, 48, 126, Byte.MAX_VALUE, 100, 48, 114, 117, 48, 126, 101, 124, 124, 31, 5, 36, 19, 21, 15, 21, 26, 23, 20, 26, 19, 86, 18, 19, 21, 4, 19, 27, 19, 24, 2, 19, 18, 86, 20, 19, 26, 25, 1, 86, 70, 76, 86, 3, 24, 27, 23, 2, 21, 30, 19, 18, 86, 6, 23, 31, 4, 86, 25, 16, 86, 5, 19, 2, 63, 5, 36, 19, 21, 15, 23, 20, 26, 19, 94, 95, 86, 21, 23, 26, 26, 5, 86, 16, 25, 4, 86, 100, 45, 42, 50, 37, 40, 45, 32, 119, 37, 50, 58, 56, 33, 50, 51, 81, 110, 98, 112, 79, 104, 107, 99, 98, 117, 124, 92, 102, 115, 115, 102, 100, 111, 98, 99, 84, 100, 117, 102, 119, 90, 38, 111, 98, 59};
    }

    static {
        A04();
        A0J = Collections.EMPTY_LIST;
    }

    public C4Y(View view) {
        if (view != null) {
            this.A0H = view;
            return;
        }
        throw new IllegalArgumentException(A02(141, 24, k.AppCompatTheme_windowActionModeOverlay));
    }

    private void A03() {
        if (this.A0A == null) {
            this.A0A = new ArrayList();
            this.A0B = Collections.unmodifiableList(this.A0A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(C0452Eq c0452Eq) {
        this.A0E = C2v.A00(this.A0H);
        c0452Eq.A1z(this, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(C0452Eq c0452Eq) {
        c0452Eq.A1z(this, this.A0E);
        this.A0E = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A09() {
        C4Y c4y = this;
        boolean z = false;
        char c2 = (c4y.A0C & 16) == 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c4y = c4y;
                    if (!C2v.A0F(c4y.A0H)) {
                        c2 = 5;
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
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0A() {
        boolean z = false;
        char c2 = (this.A0C & 16) != 0 ? (char) 2 : (char) 4;
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

    private final boolean A0B() {
        C4Y c4y = this;
        boolean z = false;
        char c2 = (c4y.A0C & 512) == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4y = c4y;
                    if (!c4y.A0b()) {
                        c2 = 5;
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
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public final int A0G() {
        C0452Eq c0452Eq = this.A08;
        if (c0452Eq == null) {
            return -1;
        }
        return c0452Eq.A1B(this);
    }

    public final int A0H() {
        return this.A00;
    }

    public final int A0I() {
        int i = this.A04;
        return i == -1 ? this.A03 : i;
    }

    public final int A0J() {
        return this.A01;
    }

    public final long A0K() {
        return this.A05;
    }

    public final List<Object> A0L() {
        C4Y c4y = this;
        List<Object> list = null;
        char c2 = (c4y.A0C & 1024) == 0 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c4y = c4y;
                    list = c4y.A0A;
                    if (list == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    list = list;
                    if (list.size() != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return A0J;
                case 5:
                    return c4y.A0B;
                case 6:
                    return A0J;
            }
        }
    }

    public final void A0M() {
        this.A01 = -1;
        this.A04 = -1;
    }

    public final void A0N() {
        List<Object> list = this.A0A;
        if (list != null) {
            list.clear();
        }
        this.A0C &= -1025;
    }

    public final void A0O() {
        this.A0C &= -33;
    }

    public final void A0P() {
        this.A0C &= -257;
    }

    public final void A0Q() {
        this.A0C = 0;
        this.A03 = -1;
        this.A01 = -1;
        this.A05 = -1L;
        this.A04 = -1;
        this.A0D = 0;
        this.A06 = null;
        this.A07 = null;
        A0N();
        this.A0E = 0;
        this.A02 = -1;
        C0452Eq.A0r(this);
    }

    public final void A0R() {
        if (this.A01 == -1) {
            this.A01 = this.A03;
        }
    }

    public final void A0S() {
        this.A0F.A0c(this);
    }

    public final void A0T(int i) {
        this.A0C |= i;
    }

    public final void A0U(int i, int i2) {
        this.A0C = (this.A0C & (i2 ^ (-1))) | (i & i2);
    }

    public final void A0V(int i, int i2, boolean z) {
        A0T(8);
        A0W(i2, z);
        this.A03 = i;
    }

    public final void A0W(int i, boolean z) {
        C4Y c4y = this;
        char c2 = c4y.A01 == -1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4y = c4y;
                    c4y.A01 = c4y.A03;
                    c2 = 3;
                    break;
                case 3:
                    c4y = c4y;
                    if (c4y.A04 != -1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4y = c4y;
                    c4y.A04 = c4y.A03;
                    c2 = 5;
                    break;
                case 5:
                    if (!z) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c4y = c4y;
                    c4y.A04 += i;
                    c2 = 7;
                    break;
                case 7:
                    c4y = c4y;
                    c4y.A03 += i;
                    if (c4y.A0H.getLayoutParams() == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c4y = c4y;
                    ((C4H) c4y.A0H.getLayoutParams()).A01 = true;
                    c2 = '\t';
                    break;
                case '\t':
                    return;
            }
        }
    }

    public final void A0X(C4O c4o, boolean z) {
        this.A0F = c4o;
        this.A0G = z;
    }

    public final void A0Y(Object obj) {
        C4Y c4y = this;
        char c2 = obj == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c4y = c4y;
                    c4y.A0T(1024);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c4y = c4y;
                    if ((c4y.A0C & 1024) != 0) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c4y = c4y;
                    obj = obj;
                    c4y.A03();
                    c4y.A0A.add(obj);
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A0Z(boolean z) {
        C4Y c4y = this;
        int i = 0;
        int i2 = 0;
        int i3 = c4y.A0D;
        char c2 = z ? (char) 2 : '\f';
        while (true) {
            switch (c2) {
                case 2:
                    i2 = i3 - 1;
                    c2 = 3;
                    break;
                case 3:
                    c4y = c4y;
                    c4y.A0D = i2;
                    i = c4y.A0D;
                    if (i >= 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4y = c4y;
                    c4y.A0D = 0;
                    Log.e(A02(113, 4, 106), A02(165, 78, 19) + c4y);
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    if (!z) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 7:
                    if (i != 1) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c4y = c4y;
                    c4y.A0C |= 16;
                    c2 = 5;
                    break;
                case '\t':
                    if (!z) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c4y = c4y;
                    if (c4y.A0D != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c4y = c4y;
                    c4y.A0C &= -17;
                    c2 = 5;
                    break;
                case '\f':
                    i2 = i3 + 1;
                    c2 = 3;
                    break;
            }
        }
    }

    public final boolean A0a() {
        return (this.A0C & 1) != 0;
    }

    public final boolean A0b() {
        boolean z = false;
        char c2 = (this.A0C & 4) != 0 ? (char) 2 : (char) 4;
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

    public final boolean A0c() {
        boolean z = false;
        char c2 = (this.A0C & 8) != 0 ? (char) 2 : (char) 4;
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

    public final boolean A0d() {
        boolean z = false;
        char c2 = this.A0F != null ? (char) 2 : (char) 4;
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

    public final boolean A0e() {
        boolean z = false;
        char c2 = (this.A0C & 256) != 0 ? (char) 2 : (char) 4;
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

    public final boolean A0f() {
        boolean z = false;
        char c2 = (this.A0C & 2) != 0 ? (char) 2 : (char) 4;
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

    public final boolean A0g() {
        boolean z = false;
        char c2 = (this.A0C & 2) != 0 ? (char) 2 : (char) 4;
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

    public final boolean A0h() {
        boolean z = false;
        char c2 = (this.A0C & 128) != 0 ? (char) 2 : (char) 4;
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

    public final boolean A0i() {
        boolean z = false;
        char c2 = (this.A0C & 32) != 0 ? (char) 2 : (char) 4;
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

    public final boolean A0j() {
        C4Y c4y = this;
        boolean z = false;
        char c2 = (c4y.A0C & 16) == 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c4y = c4y;
                    if (!C2v.A0F(c4y.A0H)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public final boolean A0k(int i) {
        boolean z = false;
        char c2 = (this.A0C & i) != 0 ? (char) 2 : (char) 4;
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

    public final String toString() {
        C4Y c4y = this;
        String strA02 = null;
        StringBuilder sb = new StringBuilder(A02(259, 11, 98) + Integer.toHexString(c4y.hashCode()) + A02(34, 10, k.AppCompatTheme_windowFixedHeightMajor) + c4y.A03 + A02(285, 4, 99) + c4y.A05 + A02(81, 9, 60) + c4y.A01 + A02(98, 8, 64) + c4y.A04);
        char c2 = c4y.A0d() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c4y = c4y;
                    sb = sb;
                    sb.append(A02(0, 7, 60));
                    if (!c4y.A0G) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    strA02 = A02(67, 13, 87);
                    c2 = 4;
                    break;
                case 4:
                    sb = sb;
                    strA02 = strA02;
                    sb.append(strA02);
                    c2 = 5;
                    break;
                case 5:
                    c4y = c4y;
                    if (!c4y.A0b()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    sb = sb;
                    sb.append(A02(243, 8, 33));
                    c2 = 7;
                    break;
                case 7:
                    c4y = c4y;
                    if (!c4y.A0a()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    sb = sb;
                    sb.append(A02(90, 8, 26));
                    c2 = '\t';
                    break;
                case '\t':
                    c4y = c4y;
                    if (!c4y.A0g()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    sb = sb;
                    sb.append(A02(106, 7, k.AppCompatTheme_viewInflaterClass));
                    c2 = 11;
                    break;
                case 11:
                    c4y = c4y;
                    if (!c4y.A0c()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    sb = sb;
                    sb.append(A02(251, 8, 50));
                    c2 = '\r';
                    break;
                case '\r':
                    c4y = c4y;
                    if (!c4y.A0h()) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    sb = sb;
                    sb.append(A02(k.AppCompatTheme_windowActionModeOverlay, 8, k.AppCompatTheme_windowMinWidthMajor));
                    c2 = 15;
                    break;
                case 15:
                    c4y = c4y;
                    if (!c4y.A0e()) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    sb = sb;
                    sb.append(A02(45, 12, 32));
                    c2 = 17;
                    break;
                case 17:
                    c4y = c4y;
                    if (!c4y.A0j()) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 18:
                    c4y = c4y;
                    sb = sb;
                    sb.append(A02(125, 16, k.AppCompatTheme_windowNoTitle) + c4y.A0D + A02(80, 1, 59));
                    c2 = 19;
                    break;
                case 19:
                    c4y = c4y;
                    if (!c4y.A0B()) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    sb = sb;
                    sb.append(A02(7, 27, k.AppCompatTheme_windowActionBarOverlay));
                    c2 = 21;
                    break;
                case 21:
                    c4y = c4y;
                    if (c4y.A0H.getParent() != null) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    sb = sb;
                    sb.append(A02(57, 10, 96));
                    c2 = 23;
                    break;
                case 23:
                    StringBuilder sb2 = sb;
                    sb2.append(A02(44, 1, k.AppCompatTheme_viewInflaterClass));
                    return sb2.toString();
                case 24:
                    strA02 = A02(270, 15, 98);
                    c2 = 4;
                    break;
            }
        }
    }
}

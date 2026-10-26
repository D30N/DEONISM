package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.3C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3C {
    public final Object A00;

    public C3C(Object obj) {
        this.A00 = obj;
    }

    public static C3C A00(Object obj) {
        C3C c3c = null;
        char c2 = obj == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c3c = null;
                    c2 = 3;
                    break;
                case 3:
                    return c3c;
                case 4:
                    obj = obj;
                    c3c = new C3C(obj);
                    c2 = 3;
                    break;
            }
        }
    }

    public static Object A01(C3C c3c) {
        Object obj = null;
        char c2 = c3c == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    obj = null;
                    c2 = 3;
                    break;
                case 3:
                    return obj;
                case 4:
                    c3c = c3c;
                    obj = c3c.A00;
                    c2 = 3;
                    break;
            }
        }
    }

    public final int A02() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public final int A03() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public final int A04() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetRight();
        }
        return 0;
    }

    public final int A05() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetTop();
        }
        return 0;
    }

    public final C3C A06(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C3C(((WindowInsets) this.A00).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public final boolean A07() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.A00).isConsumed();
        }
        return false;
    }

    public final boolean equals(Object obj) {
        C3C c3c = this;
        C3C c3c2 = null;
        Object obj2 = null;
        boolean zEquals = true;
        char c2 = c3c == obj ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return zEquals;
                case 3:
                    obj = obj;
                    if (obj == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c3c = c3c;
                    obj = obj;
                    if (c3c.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    c3c = c3c;
                    obj = obj;
                    c3c2 = (C3C) obj;
                    obj2 = c3c.A00;
                    if (obj2 != null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c3c2 = c3c2;
                    if (c3c2.A00 != null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return zEquals;
                case '\t':
                    zEquals = false;
                    c2 = '\b';
                    break;
                case '\n':
                    c3c2 = c3c2;
                    obj2 = obj2;
                    zEquals = obj2.equals(c3c2.A00);
                    c2 = '\b';
                    break;
            }
        }
    }

    public final int hashCode() {
        int iHashCode = 0;
        Object obj = this.A00;
        char c2 = obj == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    iHashCode = 0;
                    c2 = 3;
                    break;
                case 3:
                    return iHashCode;
                case 4:
                    obj = obj;
                    iHashCode = obj.hashCode();
                    c2 = 3;
                    break;
            }
        }
    }
}

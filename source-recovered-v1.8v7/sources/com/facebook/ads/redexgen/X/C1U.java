package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.1U, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1U {
    public static byte[] A01;
    public static final /* synthetic */ C1U[] A02;
    public static final C1U A03;
    public static final C1U A04;
    public static final C1U A05;
    public final String A00;

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 63);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{-99, -117, -120, -100, -113, -117, -99, -91, -106, -104, -117, -119, -121, -119, -114, -117, -47, -45, -48, -39, -38, -32, -47, -45, -58, -60, -62, -60, -55, -58, -5, -2, 1, -6, 20, 5, 7, -6, -8, -10, -8, -3, -6};
    }

    static {
        A02();
        String strA01 = A01(0, 16, 7);
        A05 = new C1U(strA01, 0, strA01);
        String strA012 = A01(16, 14, 66);
        A04 = new C1U(strA012, 1, strA012);
        String strA013 = A01(30, 13, k.AppCompatTheme_windowFixedHeightMajor);
        A03 = new C1U(strA013, 2, strA013);
        A02 = new C1U[]{A05, A04, A03};
    }

    public C1U(String str, int i, String str2) {
        this.A00 = str2;
    }

    public static C1U A00(String str) {
        C1U c1u = null;
        C1U[] c1uArrValues = values();
        int length = c1uArrValues.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str = str;
                    c1uArrValues = c1uArrValues;
                    c1u = c1uArrValues[i];
                    if (!c1u.A00.equalsIgnoreCase(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return c1u;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return A03;
            }
        }
    }

    public static C1U valueOf(String str) {
        return (C1U) Enum.valueOf(C1U.class, str);
    }

    public static C1U[] values() {
        return (C1U[]) A02.clone();
    }
}

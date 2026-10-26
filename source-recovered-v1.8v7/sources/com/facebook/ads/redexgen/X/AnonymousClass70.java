package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A03' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.70, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass70 {
    public static byte[] A01;
    public static final /* synthetic */ AnonymousClass70[] A02;
    public static final AnonymousClass70 A03;
    public static final AnonymousClass70 A04;
    public static final AnonymousClass70 A05;
    public String A00;

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 75);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-38, -49, -56, -72, 16, 7, -8, 0, -11, -18, -33, -30, -29, 0, -11, -18, -38, -33, -30, -29, -65, -76, -83, -103, -99};
    }

    static {
        A01();
        A05 = new AnonymousClass70(A00(7, 6, 98), 0, A00(13, 7, 98));
        A04 = new AnonymousClass70(A00(0, 4, 60), 1, A00(20, 5, 33));
        String strA00 = A00(4, 3, k.AppCompatTheme_windowFixedWidthMajor);
        A03 = new AnonymousClass70(strA00, 2, strA00);
        A02 = new AnonymousClass70[]{A05, A04, A03};
    }

    public AnonymousClass70(String str, int i, String str2) {
        this.A00 = str2;
    }

    public final String A02() {
        return this.A00;
    }

    public static AnonymousClass70 valueOf(String str) {
        return (AnonymousClass70) Enum.valueOf(AnonymousClass70.class, str);
    }

    public static AnonymousClass70[] values() {
        return (AnonymousClass70[]) A02.clone();
    }
}

package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A02' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: assets/audience_network.dex */
public abstract class QT {
    public static byte[] A00;
    public static final /* synthetic */ QT[] A01;
    public static final QT A02;
    public static final QT A03;
    public static final QT A04;
    public static final QT A05;
    public static final QT A06;
    public static final QT A07;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 33);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{97, 70, 64, 91, 92, 85, 60, 27, 1, 109, 64, 64, 67, 74, 78, 65, 96, 83, 83, 64, 88, 74, 97, 123, 108, 98, 107, 119, 90, 82, 93, 91, 76, 88, 99, 102, 99, 98, 122, 99, 45, 121, 116, 125, 104, 45, 98, 107, 45, 103, 126, 98, 99, 45, 98, 111, 103, 104, 110, 121, 45, 102, 104, 116};
    }

    public abstract boolean A04(JSONArray jSONArray, int i);

    public abstract boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i);

    public abstract boolean A06(JSONObject jSONObject, String str);

    public abstract boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str);

    static {
        A03();
        final int i = 0;
        final String strA02 = A02(16, 5, 0);
        A02 = new QT(strA02, i) { // from class: com.facebook.ads.redexgen.X.GV
            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A04(JSONArray jSONArray, int i2) {
                boolean z = false;
                char c2 = jSONArray.optJSONArray(i2) != null ? (char) 2 : (char) 4;
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

            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i2) {
                return QU.A00(jSONArray.optJSONArray(i2), jSONArray2.optJSONArray(i2));
            }

            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A06(JSONObject jSONObject, String str) {
                boolean z = false;
                char c2 = jSONObject.optJSONArray(str) != null ? (char) 2 : (char) 4;
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

            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return QU.A00(jSONObject.optJSONArray(str), jSONObject2.optJSONArray(str));
            }
        };
        final int i2 = 1;
        final String strA022 = A02(9, 7, 14);
        A03 = new QT(strA022, i2) { // from class: com.facebook.ads.redexgen.X.GU
            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A04(JSONArray jSONArray, int i3) {
                return jSONArray.optBoolean(i3, true) == jSONArray.optBoolean(i3, false);
            }

            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i3) {
                boolean z = false;
                char c2 = jSONArray.optBoolean(i3) == jSONArray2.optBoolean(i3) ? (char) 2 : (char) 4;
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

            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optBoolean(str, true) == jSONObject.optBoolean(str, false);
            }

            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                boolean z = false;
                char c2 = jSONObject.optBoolean(str) == jSONObject2.optBoolean(str) ? (char) 2 : (char) 4;
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
        };
        final int i3 = 2;
        final String strA023 = A02(21, 6, 47);
        A04 = new QT(strA023, i3) { // from class: com.facebook.ads.redexgen.X.GT
            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A04(JSONArray jSONArray, int i4) {
                double d2 = 0.0d;
                boolean z = false;
                char c2 = jSONArray.optInt(i4, 0) == jSONArray.optInt(i4, 1) ? (char) 2 : (char) 5;
                while (true) {
                    switch (c2) {
                        case 2:
                            jSONArray = jSONArray;
                            d2 = 0.0d;
                            if (jSONArray.optDouble(i4, 0.0d) != jSONArray.optDouble(i4, 1.0d)) {
                                c2 = 5;
                                break;
                            } else {
                                c2 = 3;
                                break;
                            }
                        case 3:
                            jSONArray = jSONArray;
                            if (jSONArray.optInt(i4, z ? 1 : 0) == jSONArray.optDouble(i4, d2)) {
                                c2 = 5;
                                break;
                            } else {
                                c2 = 4;
                                break;
                            }
                        case 4:
                            z = true;
                            c2 = 5;
                            break;
                        case 5:
                            return z;
                    }
                }
            }

            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i4) {
                boolean z = false;
                char c2 = jSONArray.optDouble(i4) == jSONArray2.optDouble(i4) ? (char) 2 : (char) 4;
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

            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A06(JSONObject jSONObject, String str) {
                double d2 = 0.0d;
                boolean z = false;
                char c2 = jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) ? (char) 2 : (char) 5;
                while (true) {
                    switch (c2) {
                        case 2:
                            jSONObject = jSONObject;
                            str = str;
                            d2 = 0.0d;
                            if (jSONObject.optDouble(str, 0.0d) != jSONObject.optDouble(str, 1.0d)) {
                                c2 = 5;
                                break;
                            } else {
                                c2 = 3;
                                break;
                            }
                        case 3:
                            jSONObject = jSONObject;
                            str = str;
                            if (jSONObject.optInt(str, z ? 1 : 0) == jSONObject.optDouble(str, d2)) {
                                c2 = 5;
                                break;
                            } else {
                                c2 = 4;
                                break;
                            }
                        case 4:
                            z = true;
                            c2 = 5;
                            break;
                        case 5:
                            return z;
                    }
                }
            }

            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                boolean z = false;
                char c2 = jSONObject.optDouble(str) == jSONObject2.optDouble(str) ? (char) 2 : (char) 4;
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
        };
        final int i4 = 3;
        final String strA024 = A02(6, 3, 84);
        A05 = new QT(strA024, i4) { // from class: com.facebook.ads.redexgen.X.GS
            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A04(JSONArray jSONArray, int i5) {
                double d2 = 0.0d;
                boolean z = false;
                char c2 = jSONArray.optInt(i5, 0) == jSONArray.optInt(i5, 1) ? (char) 2 : (char) 5;
                while (true) {
                    switch (c2) {
                        case 2:
                            jSONArray = jSONArray;
                            d2 = 0.0d;
                            if (jSONArray.optDouble(i5, 0.0d) != jSONArray.optDouble(i5, 1.0d)) {
                                c2 = 5;
                                break;
                            } else {
                                c2 = 3;
                                break;
                            }
                        case 3:
                            jSONArray = jSONArray;
                            if (jSONArray.optInt(i5, z ? 1 : 0) != jSONArray.optDouble(i5, d2)) {
                                c2 = 5;
                                break;
                            } else {
                                c2 = 4;
                                break;
                            }
                        case 4:
                            z = true;
                            c2 = 5;
                            break;
                        case 5:
                            return z;
                    }
                }
            }

            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i5) {
                boolean z = false;
                char c2 = jSONArray.optInt(i5) == jSONArray2.optInt(i5) ? (char) 2 : (char) 4;
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

            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A06(JSONObject jSONObject, String str) {
                double d2 = 0.0d;
                boolean z = false;
                char c2 = jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) ? (char) 2 : (char) 5;
                while (true) {
                    switch (c2) {
                        case 2:
                            jSONObject = jSONObject;
                            str = str;
                            d2 = 0.0d;
                            if (jSONObject.optDouble(str, 0.0d) != jSONObject.optDouble(str, 1.0d)) {
                                c2 = 5;
                                break;
                            } else {
                                c2 = 3;
                                break;
                            }
                        case 3:
                            jSONObject = jSONObject;
                            str = str;
                            if (jSONObject.optInt(str, z ? 1 : 0) != jSONObject.optDouble(str, d2)) {
                                c2 = 5;
                                break;
                            } else {
                                c2 = 4;
                                break;
                            }
                        case 4:
                            z = true;
                            c2 = 5;
                            break;
                        case 5:
                            return z;
                    }
                }
            }

            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                boolean z = false;
                char c2 = jSONObject.optInt(str) == jSONObject2.optInt(str) ? (char) 2 : (char) 4;
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
        };
        final int i5 = 4;
        final String strA025 = A02(27, 6, 25);
        A06 = new QT(strA025, i5) { // from class: com.facebook.ads.redexgen.X.GE
            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A04(JSONArray jSONArray, int i6) {
                boolean z = false;
                char c2 = jSONArray.optJSONObject(i6) != null ? (char) 2 : (char) 4;
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

            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i6) {
                return QU.A02(jSONArray.optJSONObject(i6), jSONArray2.optJSONObject(i6));
            }

            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A06(JSONObject jSONObject, String str) {
                boolean z = false;
                char c2 = jSONObject.optJSONObject(str) != null ? (char) 2 : (char) 4;
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

            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return QU.A02(jSONObject.optJSONObject(str), jSONObject2.optJSONObject(str));
            }
        };
        final int i6 = 5;
        final String strA026 = A02(0, 6, 19);
        A07 = new QT(strA026, i6) { // from class: com.facebook.ads.redexgen.X.GD
            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A04(JSONArray jSONArray, int i7) {
                boolean z = false;
                char c2 = jSONArray.optString(i7) != null ? (char) 2 : (char) 4;
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

            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i7) {
                return jSONArray.optString(i7).equals(jSONArray2.optString(i7));
            }

            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A06(JSONObject jSONObject, String str) {
                boolean z = false;
                char c2 = jSONObject.optString(str) != null ? (char) 2 : (char) 4;
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

            @Override // com.facebook.ads.redexgen.X.QT
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optString(str).equals(jSONObject2.optString(str));
            }
        };
        A01 = new QT[]{A02, A03, A04, A05, A06, A07};
    }

    public QT(String str, int i) {
    }

    public static QT A00(JSONArray jSONArray, int i) {
        QT type = null;
        QT[] qtArrValues = values();
        int length = qtArrValues.length;
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    jSONArray = jSONArray;
                    qtArrValues = qtArrValues;
                    type = qtArrValues[i2];
                    if (!type.A04(jSONArray, i)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return type;
                case 5:
                    i2++;
                    c2 = 2;
                    break;
                case 6:
                    throw new AssertionError(A02(33, 31, 44));
            }
        }
    }

    public static QT A01(JSONObject jSONObject, String str) {
        QT type = null;
        QT[] qtArrValues = values();
        int length = qtArrValues.length;
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
                    jSONObject = jSONObject;
                    str = str;
                    qtArrValues = qtArrValues;
                    type = qtArrValues[i];
                    if (!type.A06(jSONObject, str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return type;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    throw new AssertionError(A02(33, 31, 44));
            }
        }
    }

    public static QT valueOf(String str) {
        return (QT) Enum.valueOf(QT.class, str);
    }

    public static QT[] values() {
        return (QT[]) A01.clone();
    }
}

package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.util.Log;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Wa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0892Wa implements InterfaceC02686k<String> {
    public static byte[] A02;
    public static final String A03;
    public final String A00;
    public final String A01;

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 27);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A02 = new byte[]{60, 11, 11, 22, 11, 89, 31, 28, 13, 26, 17, 16, 23, 30, 89, 42, 0, 10, 13, 28, 20, 89, 41, 11, 22, 9, 28, 11, 13, 0, 20, 21, 14, 5, 28, 21, 15, 20, 30};
    }

    static {
        A03();
        A03 = C0892Wa.class.getSimpleName();
    }

    public C0892Wa(String str) {
        this.A00 = str;
        this.A01 = A01(str);
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
    public static String A01(String ret) {
        Object[] objArr = null;
        String strA00 = A00(30, 9, 65);
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    objArr = new Object[]{ret};
                    if (C0893Wb.A01 == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (C0893Wb.A02 == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    try {
                        strA00 = (String) C0893Wb.A02.invoke(C0893Wb.A01, objArr);
                        c2 = 14;
                        break;
                    } catch (Exception e) {
                        Log.e(A03, A00(0, 30, 98), e);
                        c2 = 14;
                        break;
                    }
                case 14:
                    return strA00;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final JSONObject ADb(String str, JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.A00, this.A01);
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    public final boolean A7d(Object obj) {
        C0892Wa newSystemProperty = this;
        boolean z = false;
        C0892Wa c0892Wa = (C0892Wa) obj;
        char c2 = newSystemProperty.A00.equals(c0892Wa.A00) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    newSystemProperty = newSystemProperty;
                    c0892Wa = c0892Wa;
                    if (!newSystemProperty.A01.equals(c0892Wa.A01)) {
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

    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    public final int ADH() {
        return this.A00.getBytes().length + this.A01.getBytes().length;
    }
}

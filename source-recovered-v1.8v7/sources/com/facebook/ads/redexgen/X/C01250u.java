package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import d.b.a.b.k;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.0u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01250u {
    public static C01240t A00;
    public static C8C A01;

    @Nullable
    public static String A02;
    public static CountDownLatch A03;
    public static CountDownLatch A04;
    public static boolean A05;
    public static byte[] A06;
    public static final String A07;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 12);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A06 = new byte[]{46, 40, 58, 46, 57, 45, 41, 57, 50, 63, 37, 3, 63, 61, 44, 44, 53, 50, 59, 87, 85, 68, 68, 81, 80, 117, 80, 71, 26, 64, 76, 64, 4, 1, 22, 38, 4, 21, 21, 12, 11, 2, 44, 11, 3, 10, 75, 17, 29, 17, 1, 0, 18, 121, 108};
    }

    static {
        A04();
        A07 = C01250u.class.getSimpleName();
        A03 = new CountDownLatch(1);
        A04 = new CountDownLatch(1);
    }

    public static String A00() {
        String strA01 = null;
        C01240t c01240t = A00;
        char c2 = c01240t != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c01240t = c01240t;
                    strA01 = c01240t.A02();
                    c2 = 3;
                    break;
                case 3:
                    return strA01;
                case 4:
                    strA01 = A01(0, 2, k.AppCompatTheme_windowFixedWidthMinor);
                    c2 = 3;
                    break;
            }
        }
    }

    public static String A02(String str) throws IOException {
        String strA01 = A01(2, 17, 80);
        File file = new File(A01.getFilesDir(), str);
        String strA012 = A01(0, 0, 59);
        if (file.exists() && file.length() > 0) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[(int) file.length()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                strA012 = new String(bArr, A01(50, 5, 88));
                return strA012;
            } catch (FileNotFoundException e) {
                A01.A04().A83(strA01, C03008a.A0t, new C03018b(e));
                return strA012;
            } catch (IOException e2) {
                A01.A04().A83(strA01, C03008a.A0u, new C03018b(e2));
                return strA012;
            }
        }
        return strA012;
    }

    public static void A03() {
        char c2 = A0H() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (A02 != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    M3.A05.execute(new RU(A02));
                    return;
            }
        }
    }

    public static synchronized void A07() {
        A0E(A01(32, 18, 105));
        A0E(A01(19, 13, 56));
    }

    public static synchronized void A08() {
        try {
            A00.A07(A02(A01(19, 13, 56)));
            A00.A05(A02(A01(32, 18, 105)));
        } catch (JSONException e) {
            A07();
            A01.A04().A83(A01(2, 17, 80), C03008a.A0v, new C03018b(e));
        }
    }

    public static synchronized void A09() {
        A0F(A01(19, 13, 56), A00().getBytes());
        A0F(A01(32, 18, 105), A00.A03().toString().getBytes());
    }

    public static synchronized void A0B(C1L c1l, String str, boolean z) {
        c1l.A06(z);
        if (c1l.A07() || c1l.A08()) {
            A00.A06(str);
        } else {
            A00.A08(str);
        }
    }

    public static synchronized void A0C(C8C c8c) {
        A01 = c8c;
        A02 = null;
        M3.A05.execute(new RR());
    }

    public static void A0D(String str) {
        if (!A0H()) {
            return;
        }
        A02 = str;
        M3.A05.execute(new RT(str));
    }

    public static void A0E(String str) {
        File file = new File(A01.getFilesDir(), str);
        if (file.exists()) {
            file.delete();
        }
    }

    public static synchronized void A0F(String str, byte[] bArr) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(A01.getFilesDir(), str));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            A01.A04().A83(A01(2, 17, 80), C03008a.A0t, new C03018b(e));
        } catch (IOException e2) {
            A01.A04().A83(A01(2, 17, 80), C03008a.A0u, new C03018b(e2));
        }
    }

    public static void A0G(JSONObject jSONObject) {
        A05 = JQ.A0n(A01);
        if (!A05) {
            return;
        }
        M3.A05.execute(new RS(jSONObject));
    }

    public static boolean A0H() {
        return A05;
    }

    public static boolean A0I(String str) {
        boolean z = false;
        try {
            z = A00.A03().get(str) instanceof C1L;
            return z;
        } catch (JSONException e) {
            A01.A04().A83(A01(2, 17, 80), C03008a.A0v, new C03018b(e));
            return z;
        }
    }
}

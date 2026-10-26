package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Environment;
import android.os.SystemClock;
import android.util.Log;
import d.b.a.b.k;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Vl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0877Vl extends C6U {
    public static byte[] A00;
    public static final String A01;

    public static String A05(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 26);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A09() {
        A00 = new byte[]{-63, -18, -18, -21, -18, -100, -34, -15, -27, -24, -32, -27, -22, -29, -100, -30, -27, -24, -31, -100, -53, -34, -26, -31, -33, -16, -70, -61, -42, -46, -35, -47, -62, -68, 107, 93, 89, 110, -117, 109, 107, 124, -115, -114, Byte.MIN_VALUE, 59, 96, -119, -111, 59, 113, 124, -115, -124, 124, 125, -121, Byte.MIN_VALUE};
    }

    static {
        A09();
        A01 = C0877Vl.class.getSimpleName();
    }

    public C0877Vl(Context context, C02525u c02525u) {
        super(context, c02525u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public AbstractC02766s A02(HashMap<String, C0876Vk> map) {
        return new X9(SystemClock.elapsedRealtime(), A02(), map, EnumC02756r.A0C);
    }

    @Nullable
    @SuppressLint({"CatchGeneralException", "BadMethodUse-android.util.Log.e"})
    public static File A03(String str) {
        File file = null;
        try {
            String strSubstring = str.substring(0, str.lastIndexOf(File.separator));
            String fileName = str.substring(str.lastIndexOf(File.separator) + 1);
            file = new File(strSubstring, fileName);
            return file;
        } catch (Exception e) {
            Log.e(A01, A05(0, 26, 98), e);
            return file;
        }
    }

    public static String A06(String str) {
        char c2 = 0;
        char c3 = str.hashCode() != 902502675 ? (char) 2 : (char) 5;
        while (true) {
            switch (c3) {
                case 2:
                    c2 = 65535;
                    c3 = 3;
                    break;
                case 3:
                    if (c2 == 0) {
                        c3 = 7;
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    return A05(0, 0, k.AppCompatTheme_windowNoTitle);
                case 5:
                    str = str;
                    if (!str.equals(A05(26, 8, 100))) {
                        c3 = 2;
                        break;
                    } else {
                        c3 = 6;
                        break;
                    }
                case 6:
                    c2 = 0;
                    c3 = 3;
                    break;
                case 7:
                    return Environment.getExternalStorageDirectory().toString();
            }
        }
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    public static String A07(String regex) throws IOException {
        String strA05 = A05(34, 6, 21);
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = Pattern.compile(strA05).matcher(regex);
        while (matcher.find()) {
            String matchedPattern = matcher.group();
            matcher.appendReplacement(stringBuffer, A06(matchedPattern));
        }
        matcher.appendTail(stringBuffer);
        String regex2 = stringBuffer.toString();
        try {
            regex2 = new File(regex2).getCanonicalPath();
            return regex2;
        } catch (IOException e) {
            Log.e(A01, A05(40, 18, 1), e);
            return regex2;
        }
    }

    public final InterfaceC02616d A0G(List<C02606c> list) {
        return new C0875Vj(this, list);
    }
}

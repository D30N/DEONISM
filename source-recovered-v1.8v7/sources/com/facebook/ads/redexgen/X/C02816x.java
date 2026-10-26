package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashMap;
import javax.annotation.Nullable;

@SuppressLint({"StringFormatUse", "SharedPreferencesUse"})
/* renamed from: com.facebook.ads.redexgen.X.6x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02816x {
    public static C02816x A01;
    public static byte[] A02;
    public final HashMap<Integer, String> A00 = new HashMap<>();

    static {
        A03();
    }

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 95);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A02 = new byte[]{-15, -4, -2, 68};
    }

    @SuppressLint({"CatchGeneralException"})
    public C02816x(Context context, EnumC02656h enumC02656h, @Nullable String str) {
        try {
            A04(context);
            if (enumC02656h.A04() == EnumC02656h.A0F.A04()) {
                A05(context, str);
            }
        } catch (Throwable th) {
            AnonymousClass66.A03(th);
        }
    }

    public static C02816x A00(Context context, EnumC02656h enumC02656h, @Nullable String str) {
        if (A01 == null) {
            A01 = new C02816x(context, enumC02656h, str);
        }
        return A01;
    }

    public static String A02(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArr = bArr;
                    sb = sb;
                    sb.append(String.format(A01(0, 4, 109), Byte.valueOf(bArr[i])));
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return sb.toString();
            }
        }
    }

    private void A04(Context context) throws Exception {
        int i;
        BufferedInputStream bufferedInputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.publicSourceDir)), 1024);
            MessageDigest messageDigest = MessageDigest.getInstance(AnonymousClass70.A03.A02());
            MessageDigest messageDigest2 = MessageDigest.getInstance(AnonymousClass70.A04.A02());
            MessageDigest messageDigest3 = MessageDigest.getInstance(AnonymousClass70.A05.A02());
            byte[] bArr = new byte[1024];
            do {
                i = bufferedInputStream.read(bArr);
                if (i > 0) {
                    messageDigest.update(bArr, 0, i);
                    messageDigest2.update(bArr, 0, i);
                    messageDigest3.update(bArr, 0, i);
                }
            } while (i != -1);
            HashMap<Integer, String> map = this.A00;
            byte[] buffer = messageDigest.digest();
            map.put(10003, A02(buffer));
            HashMap<Integer, String> map2 = this.A00;
            byte[] buffer2 = messageDigest2.digest();
            map2.put(10004, A02(buffer2));
            HashMap<Integer, String> map3 = this.A00;
            byte[] buffer3 = messageDigest3.digest();
            map3.put(10005, A02(buffer3));
            bufferedInputStream.close();
        } catch (Throwable th) {
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            throw th;
        }
    }

    private void A05(Context context, @Nullable String str) throws Throwable {
        C02816x c02816x = this;
        Throwable th = null;
        int i = 0;
        Throwable th2 = null;
        BufferedInputStream bufferedInputStream = null;
        byte[] bArr = null;
        MessageDigest messageDigest = null;
        char c2 = str != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    c2 = str.isEmpty() ? (char) 3 : (char) 4;
                case 3:
                    return;
                case 4:
                    context = context;
                    str = str;
                    i = 1024;
                    bufferedInputStream = new BufferedInputStream(context.getAssets().open(str), 1024);
                    c2 = 5;
                case 5:
                    messageDigest = MessageDigest.getInstance(AnonymousClass70.A03.A02());
                    bArr = new byte[i];
                    c2 = '\n';
                case '\n':
                    try {
                        bufferedInputStream = bufferedInputStream;
                        bArr = bArr;
                        int i2 = bufferedInputStream.read(bArr);
                        if (i2 > 0) {
                            messageDigest.update(bArr, 0, i2);
                        }
                        c2 = i2 == -1 ? (char) 14 : '\n';
                    } catch (Throwable th3) {
                        th = th3;
                        c2 = 21;
                    }
                case 14:
                    c02816x = c02816x;
                    c02816x.A00.put(10010, A02(messageDigest.digest()));
                    bufferedInputStream.close();
                    return;
                case 21:
                    try {
                        th = th;
                        throw th;
                        break;
                    } catch (Throwable th4) {
                        th2 = th4;
                        c2 = 23;
                        break;
                    }
                case 23:
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
            }
            th = th3;
            c2 = 21;
        }
    }

    @Nullable
    public final String A06(int i) {
        String str = this.A00.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        return null;
    }
}

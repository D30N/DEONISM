package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Build;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* loaded from: assets/audience_network.dex */
public final class M0 {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 53);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{13, 2, 8, 30, 3, 5, 8, 66, 3, 31, 66, 45, 31, 21, 2, 15, 56, 13, 31, 7};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.AsyncTask<P, PR, R>] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.os.AsyncTask] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.os.AsyncTask] */
    /* JADX WARN: Type inference failed for: r4v0, types: [P[]] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object[]] */
    public static <P, PR, R> AsyncTask<P, PR, R> A00(Executor executor, AsyncTask<P, PR, R> asyncTask, P... pArr) {
        char c2 = Build.VERSION.SDK_INT >= 11 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    executor = executor;
                    asyncTask = (AsyncTask<P, PR, R>) ((AsyncTask) asyncTask);
                    pArr = (P[]) ((Object[]) pArr);
                    asyncTask.executeOnExecutor(executor, pArr);
                    c2 = 3;
                    break;
                case 3:
                    return (AsyncTask) asyncTask;
                case 4:
                    asyncTask = (AsyncTask) asyncTask;
                    pArr = (Object[]) pArr;
                    asyncTask.execute(pArr);
                    c2 = 3;
                    break;
            }
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A02() {
        try {
            Class.forName(A01(0, 20, 89));
        } catch (Throwable unused) {
        }
    }
}

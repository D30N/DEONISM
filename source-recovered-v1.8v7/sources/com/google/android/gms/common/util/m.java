package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class m {
    private static String a;

    /* renamed from: b, reason: collision with root package name */
    private static int f1589b;

    @Nullable
    public static String a() {
        if (a == null) {
            if (f1589b == 0) {
                f1589b = Process.myPid();
            }
            a = b(f1589b);
        }
        return a;
    }

    @Nullable
    private static String b(int i) throws Throwable {
        Throwable th;
        BufferedReader bufferedReaderC;
        String strTrim = null;
        if (i <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            bufferedReaderC = c(sb.toString());
        } catch (IOException unused) {
            bufferedReaderC = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReaderC = null;
        }
        try {
            strTrim = bufferedReaderC.readLine().trim();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            th = th3;
            k.a(bufferedReaderC);
            throw th;
        }
        k.a(bufferedReaderC);
        return strTrim;
    }

    private static BufferedReader c(String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}

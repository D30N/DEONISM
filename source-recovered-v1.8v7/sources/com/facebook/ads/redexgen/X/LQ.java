package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class LQ {
    public static byte[] A00;
    public static final String A01;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 62);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A00 = new byte[]{-98, -30, -24, -30, -29, -44, -36, -98, -48, -33, -33, -98, -62, -28, -33, -44, -31, -28, -30, -44, -31, -99, -48, -33, -38, -30, -41, -48, -64, -31, -77, -119, -112, -117, -108, -61, -59, -6, -21, -7, -6, -77, -15, -21, -1, -7, -127, -3, 26, 26, 31, 16, 15, -53, 14, 19, 16, 14, 22, -53, 17, 12, 20, 23, 16, 15, -18, -33, -14, -26};
    }

    static {
        A05();
        A01 = LQ.class.getSimpleName();
    }

    public static LP A00() {
        char c2;
        boolean z;
        try {
            t = null;
            z = false;
            c2 = !A07() ? (char) 3 : '\b';
        } catch (Throwable th) {
            t = th;
            c2 = BuildConfigApi.isDebug() ? (char) 16 : (char) 17;
        }
        while (true) {
            switch (c2) {
                case 3:
                    if (!A06()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 5:
                    if (!A08(A01(35, 2, 18))) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    z = true;
                    c2 = '\n';
                    break;
                case '\t':
                    z = false;
                    c2 = '\n';
                    break;
                case '\n':
                    if (!z) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return LP.A03;
                case '\r':
                    return LP.A05;
                case 16:
                    t = t;
                    Log.e(A01, A01(47, 19, 109), t);
                    c2 = 17;
                    break;
                case 17:
                    return LP.A04;
            }
        }
    }

    @Nullable
    public static String A02(Context context) {
        try {
            return A03(context);
        } catch (Exception unused) {
            return null;
        }
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public static String A03(Context context) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException, CertificateException {
        StringBuilder sb = new StringBuilder();
        Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
        int length = signatureArr.length;
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
                    sb = sb;
                    signatureArr = signatureArr;
                    byte[] publicKey = MessageDigest.getInstance(A01(25, 4, 81)).digest(A04(signatureArr[i]).getEncoded());
                    sb.append(LV.A03(publicKey));
                    sb.append(A01(29, 1, 104));
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return sb.toString();
            }
        }
    }

    public static PublicKey A04(Signature signature) throws CertificateException {
        return CertificateFactory.getInstance(A01(30, 5, 29)).generateCertificate(new ByteArrayInputStream(signature.toByteArray())).getPublicKey();
    }

    public static boolean A06() {
        boolean z = false;
        String str = Build.TAGS;
        char c2 = str != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!str.contains(A01(37, 9, 72))) {
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

    public static boolean A07() {
        File superUserApk = new File(A01(0, 25, 49));
        return superUserApk.exists();
    }

    public static boolean A08(String str) {
        int i = 0;
        File[] pathDirFiles = null;
        File fileInPath = null;
        int length = 0;
        String[] strArrSplit = System.getenv(A01(66, 4, 96)).split(A01(46, 1, 9));
        int length2 = strArrSplit.length;
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= length2) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    strArrSplit = strArrSplit;
                    String path = strArrSplit[i2];
                    fileInPath = new File(path);
                    if (!fileInPath.exists()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    fileInPath = fileInPath;
                    if (!fileInPath.isDirectory()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    i2++;
                    c2 = 2;
                    break;
                case 6:
                    fileInPath = fileInPath;
                    pathDirFiles = fileInPath.listFiles();
                    if (pathDirFiles != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 7:
                    pathDirFiles = pathDirFiles;
                    length = pathDirFiles.length;
                    i = 0;
                    c2 = '\b';
                    break;
                case '\b':
                    if (i >= length) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    str = str;
                    pathDirFiles = pathDirFiles;
                    if (!pathDirFiles[i].getName().equals(str)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    return true;
                case 11:
                    i++;
                    c2 = '\b';
                    break;
                case '\f':
                    return false;
            }
        }
    }
}

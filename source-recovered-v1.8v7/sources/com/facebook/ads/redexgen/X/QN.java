package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: assets/audience_network.dex */
public final class QN {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 13);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{87, 81, 83, 81, 86, -87, -62, -75, -74, -64, -71, 116, -56, -61, 116, -70, -67, -62, -72, 116, -54, -75, -64, -67, -72, 116, -73, -71, -58, -56, -67, -70, -67, -73, -75, -56, -71, 116, -61, -58, 116, -60, -55, -74, -64, -67, -73, 116, -65, -71, -51, -126, -96, -107, -114, 122, 126};
    }

    public static String A01(byte[] bArr, String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.reset();
        return Base64.encodeToString(messageDigest.digest(bArr), 0);
    }

    public static void A03(HttpsURLConnection httpsURLConnection, Set<String> set, Set<String> set2) throws Exception {
        String certSha1 = A00(52, 5, 64);
        if (Build.VERSION.SDK_INT == 15) {
            if (A00(0, 5, 22).equals(Build.VERSION.RELEASE)) {
                return;
            }
        }
        try {
            for (Certificate cert : httpsURLConnection.getServerCertificates()) {
                X509Certificate x509Certificate = (X509Certificate) cert;
                String strA01 = A01(x509Certificate.getEncoded(), certSha1);
                if (set == null || !set.contains(strA01)) {
                    String strA012 = A01(x509Certificate.getPublicKey().getEncoded(), certSha1);
                    if (set2 != null && set2.contains(strA012)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            throw new CertificateException(A00(5, 47, 71));
        } catch (Exception e) {
            throw e;
        }
    }
}

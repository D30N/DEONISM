package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import android.support.annotation.Nullable;
import android.util.Log;
import d.b.a.b.k;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.facebook.ads.redexgen.X.Gc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0488Gc implements Q6 {
    public static byte[] A07;
    public static final String A08;
    public C8Z A00;
    public Executor A01;
    public boolean A02;
    public QB A03;
    public final QL A06;
    public final QG A05 = new H5();
    public QM A04 = new GW();

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 106);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A09() {
        A07 = new byte[]{42, 49, 38, 53, 56, 42, 41, 5, 57, 46, 50, 42, 5, 34, 5, -98, -85, -58, -98, -96, -69, -67, -98, -26, 4, 19, 19, 8, 13, 6, -65, 19, 7, 4, -65, 7, 19, 19, 15, -65, 17, 4, 18, 15, 14, 13, 18, 4, -65, 19, 8, 12, 4, 3, -65, 14, 20, 19, 34, 49, 49, 45, 42, 36, 34, 53, 42, 48, 47, -16, 57, -18, 56, 56, 56, -18, 39, 48, 51, 46, -18, 54, 51, 45, 38, 47, 36, 48, 37, 38, 37, -4, 36, 41, 34, 51, 52, 38, 53, -2, 22, 21, 7, -18, -7, -77, -89, -39, -37, -89, -60, -89, 27, 52, 39, 40, 50, 43, -26, 58, 53, -26, 60, 39, 50, 47, 42, 39, 58, 43, -26, 25, 25, 18, -26, 41, 43, 56, 58, 47, 44, 47, 41, 39, 58, 43, 57, -12, -22, 51, 61, -22, 56, 57, 62, -22, 43, -22, 64, 43, 54, 51, 46, -22, 31, 28, 22, -52, -20, -21, -35, -60, -49, 7, 86, 77, 7, -23, -35, 49, 47, 54, 38, 43, 36, -35, -98, -110, -75, -58, -110, -81, -110, 5, 18, 73, 5, 7, -18, -118, -51, -33, -36, -42, -118, 22, 40, 37, 31, -45, -32, 30, -45, -32, 28};
    }

    static {
        A09();
        A08 = Q6.class.getSimpleName();
    }

    public C0488Gc(QB qb, C8Z c8z, Executor executor) {
        A0A();
        this.A03 = qb;
        this.A06 = new H4() { // from class: com.facebook.ads.redexgen.X.4F
        };
        this.A01 = executor;
        this.A00 = c8z;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStreamABZ = null;
        try {
            outputStreamABZ = this.A06.ABZ(httpURLConnection);
            if (outputStreamABZ != null) {
                this.A06.AE2(outputStreamABZ, bArr);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStreamABZ != null) {
                try {
                    outputStreamABZ.close();
                } catch (Exception unused) {
                }
            }
            return responseCode;
        } catch (Throwable th) {
            if (outputStreamABZ != null) {
                try {
                    outputStreamABZ.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final Q5 A01(QI qi) throws QJ {
        QJ qj;
        Q5 c0510Gy;
        HttpURLConnection httpURLConnection = null;
        Q5 q5A05 = null;
        boolean z = false;
        try {
            try {
                this.A02 = false;
                HttpURLConnection httpURLConnectionA08 = A08(qi.A05());
                A0G(httpURLConnectionA08, qi);
                A0F(httpURLConnectionA08, qi);
                if (this.A04.A7i()) {
                    this.A04.A8F(httpURLConnectionA08, qi.A06());
                }
                httpURLConnectionA08.connect();
                this.A02 = true;
                Set<String> setA01 = this.A03.A01();
                Set<String> setA02 = this.A03.A02();
                boolean z2 = (setA01 == null || setA01.isEmpty()) ? false : true;
                if (setA02 != null && !setA02.isEmpty()) {
                    z = true;
                }
                if ((httpURLConnectionA08 instanceof HttpsURLConnection) && (z2 || z)) {
                    try {
                        QN.A03((HttpsURLConnection) httpURLConnectionA08, setA01, setA02);
                    } catch (Exception e) {
                        Log.e(A08, A07(112, 36, 92), e);
                    }
                }
                if (httpURLConnectionA08.getDoOutput() && qi.A06() != null) {
                    A00(httpURLConnectionA08, qi.A06());
                }
                if (httpURLConnectionA08.getDoInput()) {
                    c0510Gy = A06(httpURLConnectionA08);
                } else {
                    c0510Gy = new C0510Gy(httpURLConnectionA08, null);
                }
                if (this.A04.A7i()) {
                    this.A04.A8G(c0510Gy);
                }
                httpURLConnectionA08.disconnect();
                return c0510Gy;
            } catch (Exception e2) {
                try {
                    try {
                        q5A05 = A05(null);
                    } catch (Throwable unused) {
                        if (q5A05 != null && q5A05.A77() > 0) {
                            if (this.A04.A7i()) {
                                this.A04.A8G(q5A05);
                            }
                            if (0 != 0) {
                                httpURLConnection.disconnect();
                            }
                            return q5A05;
                        }
                        throw new QJ(e2, q5A05);
                    }
                } catch (Exception unused2) {
                    e2.printStackTrace();
                    if (q5A05 != null && q5A05.A77() > 0) {
                        if (this.A04.A7i()) {
                            this.A04.A8G(q5A05);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return q5A05;
                    }
                    qj = new QJ(e2, q5A05);
                }
                if (q5A05 != null && q5A05.A77() > 0) {
                    if (this.A04.A7i()) {
                        this.A04.A8G(q5A05);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return q5A05;
                }
                qj = new QJ(e2, q5A05);
                throw qj;
            }
        } catch (Throwable th) {
            if (this.A04.A7i()) {
                this.A04.A8G(q5A05);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    @Nullable
    private final Q5 A02(QI qi) {
        C0488Gc c0488Gc = this;
        Q5 q5A01 = null;
        char c2 = c0488Gc.A03.A04() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0488Gc = c0488Gc;
                    qi = qi;
                    c0488Gc.A0B(qi);
                    c2 = 3;
                    break;
                case 3:
                    q5A01 = null;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        c0488Gc = c0488Gc;
                        qi = qi;
                        q5A01 = c0488Gc.A01(qi);
                        c2 = '\b';
                        break;
                    } catch (QJ e) {
                        c0488Gc.A06.A9a(e);
                        c2 = '\b';
                        break;
                    } catch (Exception e2) {
                        c0488Gc.A06.A9a(new QJ(e2, q5A01));
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return q5A01;
            }
        }
    }

    @Nullable
    private final Q5 A03(String str, QK qk, QE qe) {
        return A02(new H0(str, qk, qe));
    }

    @Nullable
    private final Q5 A04(String str, String str2, byte[] bArr, QE qe) {
        return A02(new C0511Gz(str, null, str2, bArr, qe));
    }

    private final Q5 A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream errorStream = null;
        byte[] bArrACA = null;
        try {
            errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                bArrACA = this.A06.ACA(errorStream);
            }
            C0510Gy c0510Gy = new C0510Gy(httpURLConnection, bArrACA);
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (Exception unused) {
                }
            }
            return c0510Gy;
        } catch (Throwable th) {
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final Q5 A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStreamABY = null;
        byte[] bArrACA = null;
        try {
            inputStreamABY = this.A06.ABY(httpURLConnection);
            if (inputStreamABY != null) {
                bArrACA = this.A06.ACA(inputStreamABY);
            }
            C0510Gy c0510Gy = new C0510Gy(httpURLConnection, bArrACA);
            if (inputStreamABY != null) {
                try {
                    inputStreamABY.close();
                } catch (Exception unused) {
                }
            }
            return c0510Gy;
        } catch (Throwable th) {
            if (inputStreamABY != null) {
                try {
                    inputStreamABY.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HttpURLConnection A08(String str) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A06.ABX(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(str + A07(148, 19, 96), e);
        }
    }

    public static synchronized void A0A() {
        if (CookieHandler.getDefault() == null) {
            CookieHandler.setDefault(new CookieManager());
        }
    }

    private void A0B(QI qi) {
        Iterator<Map.Entry<String, String>> it = null;
        StringBuilder sb = new StringBuilder(A07(205, 10, 73));
        boolean zEquals = qi.A03().equals(QH.A05);
        String strA07 = A07(22, 1, 18);
        char c2 = zEquals ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    qi = qi;
                    if (qi.A06() == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    qi = qi;
                    sb = sb;
                    strA07 = strA07;
                    sb.append(A07(193, 5, k.AppCompatTheme_windowMinWidthMinor));
                    sb.append(new String(qi.A06(), Charset.forName(A07(168, 5, 45))));
                    sb.append(strA07);
                    c2 = 4;
                    break;
                case 4:
                    qi = qi;
                    it = qi.A02().A06().entrySet().iterator();
                    c2 = 5;
                    break;
                case 5:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    sb = sb;
                    strA07 = strA07;
                    it = it;
                    Map.Entry<String, String> next = it.next();
                    sb.append(A07(15, 5, 20));
                    sb.append(next.getKey());
                    sb.append(A07(167, 1, 40));
                    sb.append(next.getValue());
                    sb.append(strA07);
                    c2 = 5;
                    break;
                case 7:
                    StringBuilder sb2 = sb;
                    sb2.append(A07(20, 2, 49));
                    sb2.append(qi.A05());
                    sb2.append(strA07);
                    String string = sb2.toString();
                    A0D(string, 1, (string.length() / 4000) + 1);
                    return;
            }
        }
    }

    private void A0C(QI qi, Q7 q7) {
        this.A05.A5P(this, q7, this.A01).A4z(qi);
        if (this.A03.A04()) {
            A0B(qi);
        }
    }

    private void A0D(String str, int i, int i2) {
        String str2 = A08 + A07(199, 6, 0) + i + A07(198, 1, 85) + i2;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0D(str.substring(4000), i + 1, i2);
        }
    }

    private void A0E(String str, String str2, byte[] bArr, Q7 q7, QE qe) {
        A0C(new C0511Gz(str, null, str2, bArr, qe), q7);
    }

    private void A0F(HttpURLConnection httpURLConnection, QI qi) {
        C0488Gc c0488Gc = this;
        Map<String, String> mapA5C = null;
        Iterator<String> it = null;
        Map<String, String> mapA06 = qi.A02().A06();
        Q4 q4A05 = qi.A02().A05();
        Iterator<String> it2 = mapA06.keySet().iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it2 = it2;
                    if (!it2.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    httpURLConnection = httpURLConnection;
                    mapA06 = mapA06;
                    it2 = it2;
                    String next = it2.next();
                    httpURLConnection.setRequestProperty(next, mapA06.get(next));
                    c2 = 2;
                    break;
                case 4:
                    q4A05 = q4A05;
                    if (q4A05 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0488Gc = c0488Gc;
                    q4A05 = q4A05;
                    mapA5C = q4A05.A5C(c0488Gc.A03.A03());
                    it = mapA5C.keySet().iterator();
                    c2 = 6;
                    break;
                case 6:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    httpURLConnection = httpURLConnection;
                    mapA5C = mapA5C;
                    it = it;
                    String next2 = it.next();
                    String value = mapA5C.get(next2);
                    httpURLConnection.setRequestProperty(next2, value);
                    c2 = 6;
                    break;
                case '\b':
                    return;
            }
        }
    }

    private final void A0G(HttpURLConnection httpURLConnection, QI qi) throws IOException {
        QE qeA02 = qi.A02();
        httpURLConnection.setConnectTimeout(qeA02.A00());
        httpURLConnection.setReadTimeout(qeA02.A02());
        this.A06.ABq(httpURLConnection, qi.A03(), qi.A04());
    }

    private final boolean A0H(Throwable th, long j, QI qi) {
        C0488Gc c0488Gc = this;
        boolean z = false;
        QE qeA02 = qi.A02();
        long jCurrentTimeMillis = (System.currentTimeMillis() - j) + 10;
        char c2 = c0488Gc.A04.A7i() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0488Gc = c0488Gc;
                    qeA02 = qeA02;
                    c0488Gc.A04.A7v(A07(0, 15, k.AppCompatTheme_windowMinWidthMinor) + jCurrentTimeMillis + A07(186, 7, 8) + qeA02.A00() + A07(105, 7, 29) + qeA02.A02());
                    c2 = 3;
                    break;
                case 3:
                    c0488Gc = c0488Gc;
                    z = true;
                    if (!c0488Gc.A02) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    qeA02 = qeA02;
                    if (jCurrentTimeMillis < qeA02.A02()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
                case 7:
                    qeA02 = qeA02;
                    if (jCurrentTimeMillis < qeA02.A00()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return z;
                case '\t':
                    z = false;
                    c2 = '\b';
                    break;
            }
        }
    }

    public final Q5 A0I(QI qi) throws InterruptedException, QJ {
        long j;
        long endTimeMillis;
        Q5 q5A01;
        long startTime = System.currentTimeMillis();
        int iA01 = qi.A02().A01();
        long jA03 = qi.A02().A03();
        long jCurrentTimeMillis = System.currentTimeMillis() + qi.A02().A04();
        for (int i = 0; i < iA01 && jCurrentTimeMillis > System.currentTimeMillis(); i++) {
            try {
                if (this.A04.A7i()) {
                    this.A04.A7v((i + 1) + A07(173, 4, 125) + iA01 + A07(177, 9, 83) + qi.A05());
                }
                startTime = System.currentTimeMillis();
                try {
                    q5A01 = A01(qi);
                } catch (QJ e) {
                    e = e;
                    if (!A0H(e, startTime, qi) || i >= iA01 - 1) {
                        boolean isRecoverable = this.A06.A9a(e);
                        if (isRecoverable && i < iA01 - 1) {
                            long j2 = 0;
                            if (jA03 > 0) {
                                try {
                                    Thread.sleep(jA03);
                                } catch (InterruptedException e2) {
                                    C8Z c8z = this.A00;
                                    long jCurrentTimeMillis2 = System.currentTimeMillis() - startTime;
                                    if (qi.A04 != null) {
                                        int numTries = qi.A04.length;
                                        j2 = numTries;
                                    }
                                    c8z.A8A(startTime, jCurrentTimeMillis2, 0L, j2, 0, e2);
                                    throw e;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            Q5 q5A00 = e.A00();
                            C8Z c8z2 = this.A00;
                            long jCurrentTimeMillis3 = System.currentTimeMillis() - startTime;
                            long length = (q5A00 == null || q5A00.A5T() == null) ? 0L : q5A00.A5T().length;
                            if (qi.A04 == null) {
                                endTimeMillis = 0;
                            } else {
                                int numTries2 = qi.A04.length;
                                endTimeMillis = numTries2;
                            }
                            long startTime2 = length;
                            c8z2.A8A(startTime, jCurrentTimeMillis3, startTime2, endTimeMillis, q5A00 == null ? 0 : q5A00.A77(), e);
                            throw e;
                        }
                    } else {
                        continue;
                    }
                }
            } catch (QJ e3) {
                e = e3;
            }
            if (q5A01 != null) {
                this.A00.A8A(startTime, System.currentTimeMillis() - startTime, q5A01.A5T().length, qi.A04 == null ? 0L : qi.A04.length, q5A01.A77(), null);
                return q5A01;
            }
            continue;
        }
        C8Z c8z3 = this.A00;
        long jCurrentTimeMillis4 = System.currentTimeMillis() - startTime;
        if (qi.A04 == null) {
            j = 0;
        } else {
            int numTries3 = qi.A04.length;
            j = numTries3;
        }
        c8z3.A8A(startTime, jCurrentTimeMillis4, 0L, j, 0, new TimeoutException(A07(23, 35, 53)));
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.Q6
    @Nullable
    @Deprecated
    public final Q5 ABi(String str, Map<String, String> map) {
        return A03(str, new QK(map), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.Q6
    @Nullable
    @Deprecated
    public final Q5 ABj(String str, byte[] bArr) {
        return A04(str, A07(58, 47, 87), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.Q6
    public final void ABk(String str, byte[] bArr, Q7 q7) {
        A0E(str, A07(58, 47, 87), bArr, q7, this.A03.A00());
    }
}

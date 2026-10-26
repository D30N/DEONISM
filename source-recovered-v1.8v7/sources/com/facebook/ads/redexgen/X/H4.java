package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class H4 implements QL {
    public static byte[] A01;
    public final QM A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 57);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{12, 32, 33, 59, 42, 33, 59, 98, 27, 54, 63, 42, 98, 64, 64, 70, 83, 87, 14, 96, 75, 66, 81, 80, 70, 87, 105, 74, 88, 66, 72, 121, 78, 90, 94, 78, 88, 95, 99, 74, 69, 79, 71, 78, 89, 5, 68, 69, 110, 89, 89, 68, 89, 11, 76, 68, 95, 112, 113, 99, 8, 29};
    }

    public H4() {
        this(new GW());
    }

    public H4(QM qm) {
        this.A00 = qm;
    }

    @Override // com.facebook.ads.redexgen.X.QL
    public final boolean A9a(QJ qj) {
        H4 h4 = this;
        Q5 q5A00 = qj.A00();
        char c2 = h4.A00.A7i() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    h4 = h4;
                    qj = qj;
                    h4.A00.A7v(A00(26, 31, 18));
                    qj.printStackTrace();
                    c2 = 3;
                    break;
                case 3:
                    q5A00 = q5A00;
                    if (q5A00 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    q5A00 = q5A00;
                    if (q5A00.A77() <= 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return true;
                case 6:
                    return false;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.QL
    public final HttpURLConnection ABX(String str) throws IOException {
        return (HttpURLConnection) new URL(str).openConnection();
    }

    @Override // com.facebook.ads.redexgen.X.QL
    public final InputStream ABY(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getInputStream();
    }

    @Override // com.facebook.ads.redexgen.X.QL
    public final OutputStream ABZ(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    @Override // com.facebook.ads.redexgen.X.QL
    public final void ABq(HttpURLConnection httpURLConnection, QH qh, String str) throws IOException {
        httpURLConnection.setRequestMethod(qh.A02());
        httpURLConnection.setDoOutput(qh.A04());
        httpURLConnection.setDoInput(qh.A03());
        if (str != null) {
            httpURLConnection.setRequestProperty(A00(0, 12, k.AppCompatTheme_windowFixedHeightMajor), str);
        }
        httpURLConnection.setRequestProperty(A00(12, 14, 26), A00(57, 5, 28));
    }

    @Override // com.facebook.ads.redexgen.X.QL
    public final byte[] ACA(InputStream inputStream) throws IOException {
        int i = 0;
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int nRead = 2;
        while (true) {
            switch (nRead) {
                case 2:
                    inputStream = inputStream;
                    bArr = bArr;
                    i = inputStream.read(bArr);
                    if (i == -1) {
                        nRead = 4;
                        break;
                    } else {
                        nRead = 3;
                        break;
                    }
                case 3:
                    bArr = bArr;
                    byteArrayOutputStream = byteArrayOutputStream;
                    byteArrayOutputStream.write(bArr, 0, i);
                    nRead = 2;
                    break;
                case 4:
                    ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                    byteArrayOutputStream2.flush();
                    return byteArrayOutputStream2.toByteArray();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.QL
    public final void AE2(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(bArr);
    }
}

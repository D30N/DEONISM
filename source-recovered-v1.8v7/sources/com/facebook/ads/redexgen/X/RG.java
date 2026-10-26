package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import d.b.a.b.k;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class RG implements C0L {
    public static String A07;
    public static byte[] A08;
    public int A00;
    public InputStream A01;
    public HttpURLConnection A02;
    public final String A03;
    public volatile int A04;
    public volatile int A05;

    @Nullable
    public volatile String A06;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 1);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A08 = new byte[]{56, 7, 18, 25, 87, 20, 24, 25, 25, 18, 20, 3, 30, 24, 25, 87, 98, 65, 77, 79, 90, 71, 65, 64, 60, 15, 0, 9, 11, 38, 84, 14, 20, 89, 93, 89, 81, 14, 20, 15, 35, 34, 56, 41, 34, 56, 108, 37, 34, 42, 35, 108, 42, 35, 62, 108, 44, 79, 120, 120, 101, 120, 42, 108, 111, 126, 105, 98, 99, 100, 109, 42, 99, 100, 108, 101, 42, 108, 120, 101, 103, 42, 9, 53, 53, 49, 20, 51, 45, 18, 46, 52, 51, 34, 36, 58, 52, 51, 45, 124, 102, 119, 62, 36, 119, 62, 57, 35, 50, 37, 37, 34, 39, 35, 50, 51, 69, 114, 114, 111, 114, 32, 111, 112, 101, 110, 105, 110, 103, 32, 99, 111, 110, 110, 101, 99, 116, 105, 111, 110, 32, 102, 111, 114, 32, 113, 111, 99, 32, 44, 45, 55, 38, 45, 55, 110, 47, 38, 45, 36, 55, 43, 121, 99, 31, 5, 70, 74, 75, 75, 64, 70, 81, 76, 74, 75, 5, 76, 86, 5, 68, 71, 86, 64, 75, 81, 4, 36, 115, 109, 112, 108, 36, 107, 98, 98, 119, 97, 112, 36, 34, 21, 17, 20, 25, 30, 23, 80, 3, 31, 5, 2, 19, 21, 80, 103, 80, 80, 77, 80, 2, 70, 75, 81, 65, 77, 76, 76, 71, 65, 86, 75, 76, 69, 2, 106, 86, 86, 82, 119, 80, 78, 97, 77, 76, 76, 71, 65, 86, 75, 77, 76, 66, 117, 117, 104, 117, 39, 117, 98, 102, 99, 110, 105, 96, 39, 99, 102, 115, 102, 39, 97, 117, 104, 106, 39, 125, 102, 107, 122, 108, 34, 52, 96, 123, 52, 90, 97, 97, 46, 99, 111, 96, 119, 46, 124, 107, 106, 103, 124, 107, 109, 122, 125, 52, 46, 1, 54, 50, 55, 115, 48, 60, 61, 39, 54, 61, 39, 115, 58, 61, 53, 60, 115, 53, 33, 60, 62, 115};
    }

    static {
        A04();
        A07 = RG.class.getSimpleName();
    }

    public RG(String str) {
        this(str, C0J.A01(str));
    }

    public RG(String str, int i) {
        this(str);
        this.A00 = i;
    }

    public RG(String str, @Nullable String str2) {
        this.A05 = RecyclerView.UNDEFINED_DURATION;
        this.A00 = -1;
        this.A03 = (String) C0K.A00(str);
        this.A06 = str2;
    }

    private int A00(HttpURLConnection httpURLConnection, int i, int i2) throws IOException {
        RG rg = this;
        int i3 = 0;
        int contentLength = httpURLConnection.getContentLength();
        char c2 = i2 == 200 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i3 = contentLength;
                    c2 = 3;
                    break;
                case 3:
                    return i3;
                case 4:
                    if (i2 != 206) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i3 = contentLength + i;
                    c2 = 3;
                    break;
                case 6:
                    rg = rg;
                    i3 = rg.A05;
                    c2 = 3;
                    break;
            }
        }
    }

    private HttpURLConnection A02(int i, int i2) throws RE, IOException {
        RG rg = this;
        int code = 0;
        int responseCode = 0;
        String strA01 = null;
        HttpURLConnection httpURLConnection = null;
        StringBuilder sb = null;
        int i3 = 0;
        String headerField = rg.A03;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    sb = new StringBuilder();
                    sb.append(A01(0, 16, k.AppCompatTheme_windowFixedHeightMajor));
                    if (i <= 0) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    strA01 = A01(187, 13, 5) + i;
                    c2 = 4;
                    break;
                case 4:
                    headerField = headerField;
                    sb = sb;
                    strA01 = strA01;
                    sb.append(strA01);
                    sb.append(A01(282, 4, 21));
                    sb.append(headerField);
                    sb.toString();
                    httpURLConnection = (HttpURLConnection) new URL(headerField).openConnection();
                    if (i <= 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    httpURLConnection = httpURLConnection;
                    httpURLConnection.setRequestProperty(A01(24, 5, 111), A01(276, 6, 30) + i + A01(145, 1, 93));
                    c2 = 6;
                    break;
                case 6:
                    if (i2 <= 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    httpURLConnection = httpURLConnection;
                    httpURLConnection.setConnectTimeout(i2);
                    httpURLConnection.setReadTimeout(i2);
                    c2 = '\b';
                    break;
                case '\b':
                    rg = rg;
                    httpURLConnection = httpURLConnection;
                    responseCode = httpURLConnection.getResponseCode();
                    rg.A04 = responseCode;
                    if (responseCode == 301) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (responseCode == 302) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (responseCode != 303) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    code = 1;
                    c2 = '\f';
                    break;
                case '\f':
                    if (code == 0) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    httpURLConnection = httpURLConnection;
                    headerField = httpURLConnection.getHeaderField(A01(16, 8, 47));
                    i3++;
                    httpURLConnection.disconnect();
                    c2 = 14;
                    break;
                case 14:
                    if (i3 > 5) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    if (code != 0) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    return httpURLConnection;
                case 17:
                    code = 0;
                    c2 = '\f';
                    break;
                case 18:
                    strA01 = A01(29, 0, 91);
                    c2 = 4;
                    break;
                case 19:
                    throw new RE(A01(286, 20, 15) + i3);
            }
        }
    }

    private void A03() throws RE, IOException {
        String str = A01(306, 23, 82) + this.A03;
        HttpURLConnection httpURLConnectionA02 = null;
        InputStream inputStream = null;
        try {
            try {
                httpURLConnectionA02 = A02(0, 10000);
                this.A05 = httpURLConnectionA02.getContentLength();
                this.A06 = httpURLConnectionA02.getContentType();
                inputStream = httpURLConnectionA02.getInputStream();
                Log.i(A07, A01(39, 18, 77) + this.A03 + A01(30, 9, 53) + this.A06 + A01(146, 18, 66) + this.A05);
                C0J.A05(inputStream);
            } catch (IOException e) {
                Log.e(A07, A01(57, 25, 11) + this.A03, e);
                C0J.A05(inputStream);
                if (httpURLConnectionA02 == null) {
                    return;
                }
            }
            httpURLConnectionA02.disconnect();
        } catch (Throwable th) {
            C0J.A05(inputStream);
            if (httpURLConnectionA02 != null) {
                httpURLConnectionA02.disconnect();
            }
            throw th;
        }
    }

    private final void A05(int i, int i2) throws RE {
        try {
            this.A02 = A02(i, i2);
            this.A06 = this.A02.getContentType();
            this.A01 = new BufferedInputStream(this.A02.getInputStream(), 8192);
            this.A05 = A00(this.A02, i, this.A02.getResponseCode());
        } catch (IOException e) {
            throw new RE(A01(k.AppCompatTheme_windowActionBarOverlay, 29, 1) + this.A03 + A01(187, 13, 5) + i, e);
        }
    }

    public final int A06() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void ABV(int i) throws RE {
        A05(i, this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void close() throws RE {
        HttpURLConnection httpURLConnection = this.A02;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (NullPointerException e) {
                throw new RE(A01(215, 37, 35), e);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final synchronized int length() throws RE {
        if (this.A05 == Integer.MIN_VALUE) {
            A03();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final int read(byte[] bArr) throws RE {
        int i = 0;
        InputStream inputStream = this.A01;
        String strA01 = A01(252, 24, 6);
        char c2 = inputStream != null ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    i = 0;
                    c2 = 3;
                    break;
                case 3:
                    try {
                        byte[] bArr2 = bArr;
                        return inputStream.read(bArr2, i, bArr2.length);
                    } catch (InterruptedIOException e) {
                        throw new G2(A01(200, 15, 113) + this.A03 + A01(101, 15, 86), e);
                    } catch (IOException e2) {
                        throw new RE(strA01 + this.A03, e2);
                    }
                case '\b':
                    throw new RE(strA01 + this.A03 + A01(164, 23, 36));
            }
        }
    }

    public final String toString() {
        return A01(82, 19, 64) + this.A03 + A01(29, 1, 90);
    }
}

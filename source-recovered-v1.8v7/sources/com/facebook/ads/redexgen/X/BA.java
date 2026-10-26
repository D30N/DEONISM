package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import d.b.a.b.k;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public final class BA implements InterfaceC1092bc {
    public static byte[] A0G;
    public static final AtomicReference<byte[]> A0H;
    public static final Pattern A0I;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public C0520Hi A04;
    public InputStream A05;
    public HttpURLConnection A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final C0524Ho A0A;
    public final C0524Ho A0B = new C0524Ho();
    public final InterfaceC0535Hz<? super BA> A0C;
    public final InterfaceC0546Ik<String> A0D;
    public final String A0E;
    public final boolean A0F;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 105);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A09() {
        A0G = new byte[]{50, -11, 48, -53, -18, -30, -32, -13, -24, -18, -19, 58, 73, 86, 79, 77, 19, 44, 35, 54, 46, 35, 33, 50, 35, 34, -34, 1, 45, 44, 50, 35, 44, 50, -21, 10, 35, 44, 37, 50, 38, -34, 25, -22, 8, -6, 7, -62, -42, -4, -6, 3, 9, 32, 57, 62, 64, 59, 59, 58, 61, 63, 48, 47, -21, 59, 61, 58, 63, 58, 46, 58, 55, -21, 61, 48, 47, 52, 61, 48, 46, 63, 5, -21, -54, -21, -20, -25, -5, -14, -6, -50, -6, -6, -10, -54, -25, -6, -25, -39, -11, -5, -8, -23, -21, 24, 36, 36, 32, 35, 23, 35, 35, 31, -46, -12, -12, -10, 1, 5, -66, -42, -1, -12, 0, -11, -6, -1, -8, -47, -13, 31, 30, 36, 21, 30, 36, -35, 2, 17, 30, 23, 21, -27, -15, -17, -80, -29, -16, -26, -12, -15, -21, -26, -80, -15, -19, -22, -10, -10, -14, -80, -21, -16, -10, -25, -12, -16, -29, -18, -80, -22, -10, -10, -14, -80, -54, -10, -10, -14, -42, -12, -29, -16, -11, -14, -15, -12, -10, -90, -56, -21, -6, -25, -26, -50, -25, -16, -23, -10, -22, -53, -16, -14, -9, -10, -43, -10, -12, -25, -29, -17, 5, 0, 1, 10, 16, 5, 16, 21, 53, 78, 69, 88, 80, 69, 67, 84, 69, 68, 0, 69, 82, 82, 79, 82, 0, 87, 72, 73, 76, 69, 0, 68, 73, 83, 67, 79, 78, 78, 69, 67, 84, 73, 78, 71, -61, -24, -35, -23, -24, -19, -29, -19, -18, -33, -24, -18, -102, -30, -33, -37, -34, -33, -20, -19, -102, -43, -43, -22, -29, -38, -19, -27, -38, -40, -23, -38, -39, -70, -29, -39, -60, -37, -66, -29, -27, -22, -23, -11, -7, 16, 11, -4, 10, -73, -65, -13, -5, -62, -64, -60, -65, -13, -5, -62, -64, -58, -65, -13, -5, -62, -64, -69, 7, 32, 19, 20, 30, 23, -46, 38, 33, -46, 21, 33, 32, 32, 23, 21, 38, -46, 38, 33, -46, 25, 24, 28, 29, -26, 13, 4, 4, -72, 4, 7, -5, -7, 12, 1, 7, 6, -72, 10, -3, -4, 1, 10, -3, -5, 12, 34, 57, 52, 37, 51, -3, -53, -26, -26, -105, -28, -40, -27, -16, -105, -23, -36, -37, -32, -23, -36, -38, -21, -22, -79, -105, -10, 15, 6, 25, 17, 6, 4, 21, 6, 5, -63, -28, 16, 15, 21, 6, 15, 21, -50, -13, 2, 15, 8, 6, -63, -4, 66, 78, 76, 13, 64, 77, 67, 81, 78, 72, 67, 13, 78, 74, 71, 83, 83, 79, 13, 72, 77, 83, 68, 81, 77, 64, 75, 13, 71, 83, 83, 79, 13, 39, 83, 83, 79, 51, 81, 64, 77, 82, 79, 78, 81, 83, 3, 34, 71, 84, 77, 74, 68, 67, 40, 77, 79, 84, 83, 50, 83, 81, 68, 64, 76, -14, 30, 29, 35, 20, 29, 35, -36, -5, 20, 29, 22, 35, 23};
    }

    static {
        A09();
        A0I = Pattern.compile(A03(299, 25, 46));
        A0H = new AtomicReference<>();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hz != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DefaultHttpDataSource> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ik != com.facebook.ads.internal.exoplayer2.util.Predicate<java.lang.String> */
    public BA(String str, InterfaceC0546Ik<String> interfaceC0546Ik, InterfaceC0535Hz<? super BA> interfaceC0535Hz, int i, int i2, boolean z, C0524Ho c0524Ho) {
        this.A0E = IJ.A02(str);
        this.A0D = interfaceC0546Ik;
        this.A0C = interfaceC0535Hz;
        this.A08 = i;
        this.A09 = i2;
        this.A0F = z;
        this.A0A = c0524Ho;
    }

    private int A00(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = bArr;
        int iMin = i2;
        BA ba = this;
        int i3 = 0;
        long j = 0;
        long j2 = 0;
        InterfaceC0535Hz<? super BA> interfaceC0535Hz = null;
        int i4 = 0;
        long j3 = 0;
        char c2 = iMin == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 0;
                case 3:
                    ba = ba;
                    j2 = ba.A02;
                    j = -1;
                    i4 = -1;
                    if (j2 == -1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    ba = ba;
                    j3 = j2 - ba.A00;
                    if (j3 != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return i4;
                case 6:
                    iMin = (int) Math.min(iMin, j3);
                    c2 = 7;
                    break;
                case 7:
                    ba = ba;
                    bArr2 = bArr2;
                    i3 = ba.A05.read(bArr2, i, iMin);
                    if (i3 != i4) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    ba = ba;
                    if (ba.A02 != j) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return i4;
                case '\n':
                    throw new EOFException();
                case 11:
                    ba = ba;
                    ba.A00 += i3;
                    interfaceC0535Hz = ba.A0C;
                    if (interfaceC0535Hz == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    ba = ba;
                    interfaceC0535Hz = interfaceC0535Hz;
                    interfaceC0535Hz.A96(ba, i3);
                    c2 = '\r';
                    break;
                case '\r':
                    return i3;
            }
        }
    }

    private final long A01() {
        long j = this.A02;
        return j == -1 ? j : j - this.A00;
    }

    public static long A02(HttpURLConnection httpURLConnection) throws NumberFormatException {
        long jMax = -1;
        String headerField = httpURLConnection.getHeaderField(A03(488, 14, 70));
        boolean zIsEmpty = TextUtils.isEmpty(headerField);
        String strA03 = A03(129, 1, 11);
        String strA032 = A03(84, 21, 29);
        if (!zIsEmpty) {
            try {
                jMax = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                Log.e(strA032, A03(16, 27, 85) + headerField + strA03);
            }
        }
        String headerField2 = httpURLConnection.getHeaderField(A03(130, 13, 71));
        if (!TextUtils.isEmpty(headerField2)) {
            Matcher matcher = A0I.matcher(headerField2);
            if (matcher.find()) {
                try {
                    long j = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                    if (jMax < 0) {
                        return j;
                    }
                    if (jMax != j) {
                        Log.w(strA032, A03(256, 22, 17) + headerField + A03(0, 3, 108) + headerField2 + strA03);
                        jMax = Math.max(jMax, j);
                        return jMax;
                    }
                    return jMax;
                } catch (NumberFormatException unused2) {
                    Log.e(strA032, A03(397, 26, 56) + headerField2 + strA03);
                    return jMax;
                }
            }
            return jMax;
        }
        return jMax;
    }

    private HttpURLConnection A04(C0520Hi c0520Hi) throws IOException {
        BA ba = this;
        HttpURLConnection httpURLConnectionA05 = null;
        long length = 0;
        int i = 0;
        int responseCode = 0;
        int i2 = 0;
        long j = 0;
        URL url = new URL(c0520Hi.A04.toString());
        byte[] bArr = c0520Hi.A06;
        long j2 = c0520Hi.A03;
        long position = c0520Hi.A02;
        boolean zA04 = c0520Hi.A04(1);
        char c2 = !ba.A0F ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return ba.A05(url, bArr, j2, position, zA04, true);
                case 3:
                    i2 = 0;
                    c2 = 4;
                    break;
                case 4:
                    i = i2 + 1;
                    if (i2 > 20) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    ba = ba;
                    url = url;
                    j = position;
                    length = j2;
                    httpURLConnectionA05 = ba.A05(url, bArr, j2, j, zA04, false);
                    responseCode = httpURLConnectionA05.getResponseCode();
                    if (responseCode == 300) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (responseCode == 301) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (responseCode == 302) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (responseCode == 303) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (bArr != null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (responseCode == 307) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    if (responseCode != 308) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    httpURLConnectionA05 = httpURLConnectionA05;
                    bArr = null;
                    String location = httpURLConnectionA05.getHeaderField(A03(3, 8, 22));
                    httpURLConnectionA05.disconnect();
                    url = A06(url, location);
                    i2 = i;
                    position = j;
                    j2 = length;
                    c2 = 4;
                    break;
                case '\r':
                    return httpURLConnectionA05;
                case 14:
                    StringBuilder sb = new StringBuilder();
                    String location2 = A03(377, 20, 14);
                    sb.append(location2);
                    sb.append(i);
                    String location3 = sb.toString();
                    throw new NoRouteToHostException(location3);
            }
        }
    }

    private HttpURLConnection A05(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        byte[] bArr2 = bArr;
        BA ba = this;
        boolean z3 = false;
        String str = null;
        Iterator<Map.Entry<String, String>> it = null;
        Iterator<Map.Entry<String, String>> it2 = null;
        long j3 = 0;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(ba.A08);
        httpURLConnection.setReadTimeout(ba.A09);
        C0524Ho c0524Ho = ba.A0A;
        char c2 = c0524Ho != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0524Ho = c0524Ho;
                    it = c0524Ho.A00().entrySet().iterator();
                    c2 = 3;
                    break;
                case 3:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    httpURLConnection = httpURLConnection;
                    it = it;
                    Map.Entry<String, String> next = it.next();
                    httpURLConnection.setRequestProperty(next.getKey(), next.getValue());
                    c2 = 3;
                    break;
                case 5:
                    ba = ba;
                    it2 = ba.A0B.A00().entrySet().iterator();
                    c2 = 6;
                    break;
                case 6:
                    it2 = it2;
                    if (!it2.hasNext()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    httpURLConnection = httpURLConnection;
                    it2 = it2;
                    Map.Entry<String, String> next2 = it2.next();
                    httpURLConnection.setRequestProperty(next2.getKey(), next2.getValue());
                    c2 = 6;
                    break;
                case '\b':
                    j3 = -1;
                    if (j != 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (j2 == j3) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    str = A03(371, 6, 87) + j + A03(278, 1, 63);
                    if (j2 == j3) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    str = str + ((j + j2) - 1);
                    c2 = '\f';
                    break;
                case '\f':
                    httpURLConnection = httpURLConnection;
                    str = str;
                    httpURLConnection.setRequestProperty(A03(11, 5, 127), str);
                    c2 = '\r';
                    break;
                case '\r':
                    ba = ba;
                    httpURLConnection = httpURLConnection;
                    httpURLConnection.setRequestProperty(A03(43, 10, 44), ba.A0E);
                    if (!z) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 14:
                    httpURLConnection = httpURLConnection;
                    httpURLConnection.setRequestProperty(A03(k.AppCompatTheme_viewInflaterClass, 15, 40), A03(212, 8, 51));
                    c2 = 15;
                    break;
                case 15:
                    bArr2 = bArr2;
                    httpURLConnection = httpURLConnection;
                    httpURLConnection.setInstanceFollowRedirects(z2);
                    if (bArr2 == null) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    z3 = true;
                    c2 = 17;
                    break;
                case 17:
                    bArr2 = bArr2;
                    httpURLConnection = httpURLConnection;
                    httpURLConnection.setDoOutput(z3);
                    if (bArr2 == null) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    bArr2 = bArr2;
                    httpURLConnection = httpURLConnection;
                    httpURLConnection.setRequestMethod(A03(345, 4, 96));
                    if (bArr2.length != 0) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    httpURLConnection = httpURLConnection;
                    httpURLConnection.connect();
                    c2 = 20;
                    break;
                case 20:
                    return httpURLConnection;
                case 21:
                    bArr2 = bArr2;
                    httpURLConnection = httpURLConnection;
                    httpURLConnection.setFixedLengthStreamingMode(bArr2.length);
                    httpURLConnection.connect();
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(bArr2);
                    outputStream.close();
                    c2 = 20;
                    break;
                case 22:
                    httpURLConnection = httpURLConnection;
                    httpURLConnection.connect();
                    c2 = 20;
                    break;
                case 23:
                    z3 = false;
                    c2 = 17;
                    break;
            }
        }
    }

    public static URL A06(URL url, String str) throws IOException {
        URL url2 = null;
        String protocol = null;
        char c2 = str != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    url = url;
                    str = str;
                    url2 = new URL(url, str);
                    protocol = url2.getProtocol();
                    if (!A03(105, 5, 71).equals(protocol)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    protocol = protocol;
                    if (!A03(110, 4, 70).equals(protocol)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return url2;
                case 5:
                    throw new ProtocolException(A03(53, 31, 98) + protocol);
                case 6:
                    throw new ProtocolException(A03(349, 22, 47));
            }
        }
    }

    private void A07() {
        HttpURLConnection httpURLConnection = this.A06;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e(A03(84, 21, 29), A03(220, 36, k.AppCompatTheme_windowFixedHeightMinor), e);
            }
            this.A06 = null;
        }
    }

    private void A08() throws IOException {
        BA ba = this;
        InterfaceC0535Hz<? super BA> interfaceC0535Hz = null;
        int i = 0;
        long j = 0;
        long j2 = 0;
        byte[] andSet = null;
        char c2 = ba.A01 == ba.A03 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    andSet = A0H.getAndSet(null);
                    if (andSet != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    andSet = new byte[4096];
                    c2 = 5;
                    break;
                case 5:
                    ba = ba;
                    j2 = ba.A01;
                    j = ba.A03;
                    if (j2 == j) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    ba = ba;
                    andSet = andSet;
                    i = ba.A05.read(andSet, 0, (int) Math.min(j - j2, andSet.length));
                    if (!Thread.currentThread().isInterrupted()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 7:
                    if (i == -1) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    ba = ba;
                    ba.A01 += i;
                    interfaceC0535Hz = ba.A0C;
                    if (interfaceC0535Hz == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    ba = ba;
                    interfaceC0535Hz = interfaceC0535Hz;
                    interfaceC0535Hz.A96(ba, i);
                    c2 = 5;
                    break;
                case '\n':
                    throw new EOFException();
                case 11:
                    throw new InterruptedIOException();
                case '\f':
                    A0H.set(andSet);
                    return;
            }
        }
    }

    public static void A0A(HttpURLConnection httpURLConnection, long j) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        InputStream inputStream = null;
        char c2 = C0560Iy.A01 != 19 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (C0560Iy.A01 != 20) {
                        c2 = 3;
                    } else {
                        c2 = 4;
                        continue;
                    }
                case 3:
                    return;
                case 4:
                    try {
                        httpURLConnection = httpURLConnection;
                        inputStream = httpURLConnection.getInputStream();
                        if (j == -1) {
                            c2 = 6;
                        } else {
                            c2 = '\t';
                            continue;
                        }
                    } catch (Exception unused) {
                        return;
                    }
                case 6:
                    inputStream = inputStream;
                    if (inputStream.read() == -1) {
                        c2 = '\b';
                    } else {
                        c2 = 11;
                        continue;
                    }
                case '\b':
                    return;
                case '\t':
                    if (j <= 2048) {
                        c2 = '\n';
                    } else {
                        c2 = 11;
                        continue;
                    }
                case '\n':
                    return;
                case 11:
                    InputStream inputStream2 = inputStream;
                    String name = inputStream2.getClass().getName();
                    if (A03(423, 65, k.AppCompatTheme_windowFixedHeightMajor).equals(name) || A03(143, 69, 25).equals(name)) {
                        Method declaredMethod = inputStream2.getClass().getSuperclass().getDeclaredMethod(A03(279, 20, 12), new Class[0]);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(inputStream2, new Object[0]);
                        return;
                    }
                    return;
            }
            return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final Uri A7F() {
        Uri uri = null;
        HttpURLConnection httpURLConnection = this.A06;
        char c2 = httpURLConnection == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    uri = null;
                    c2 = 3;
                    break;
                case 3:
                    return uri;
                case 4:
                    httpURLConnection = httpURLConnection;
                    uri = Uri.parse(httpURLConnection.getURL().toString());
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final long ABU(C0520Hi c0520Hi) throws IOException, NumberFormatException {
        C0520Hi c0520Hi2 = c0520Hi;
        BA ba = this;
        long jA02 = 0;
        long j = 0;
        int i = 0;
        InterfaceC0546Ik<String> interfaceC0546Ik = null;
        String contentType = null;
        InterfaceC0535Hz<? super BA> interfaceC0535Hz = null;
        int responseCode = 0;
        C1091bb c1091bb = null;
        String strA03 = A03(324, 21, 73);
        ba.A04 = c0520Hi2;
        long j2 = 0;
        ba.A00 = 0L;
        ba.A01 = 0L;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        ba = ba;
                        c0520Hi2 = c0520Hi2;
                        ba.A06 = ba.A04(c0520Hi2);
                        try {
                            responseCode = ba.A06.getResponseCode();
                            i = 200;
                            if (responseCode < 200) {
                                c2 = '\b';
                                break;
                            } else {
                                c2 = 7;
                                break;
                            }
                        } catch (IOException e) {
                            ba.A07();
                            throw new C0523Hn(strA03 + c0520Hi2.A04.toString(), e, c0520Hi2, 1);
                        }
                    } catch (IOException e2) {
                        throw new C0523Hn(strA03 + c0520Hi2.A04.toString(), e2, c0520Hi2, 1);
                    }
                case 7:
                    if (responseCode <= 299) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    ba = ba;
                    c0520Hi2 = c0520Hi2;
                    Map<String, List<String>> headerFields = ba.A06.getHeaderFields();
                    ba.A07();
                    c1091bb = new C1091bb(responseCode, headerFields, c0520Hi2);
                    if (responseCode != 416) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c1091bb = c1091bb;
                    c1091bb.initCause(new C0517Hf(0));
                    c2 = '\n';
                    break;
                case '\n':
                    throw c1091bb;
                case 11:
                    ba = ba;
                    contentType = ba.A06.getContentType();
                    interfaceC0546Ik = ba.A0D;
                    if (interfaceC0546Ik == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    contentType = contentType;
                    interfaceC0546Ik = interfaceC0546Ik;
                    if (!interfaceC0546Ik.A4y(contentType)) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    if (responseCode != i) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c0520Hi2 = c0520Hi2;
                    if (c0520Hi2.A03 == j2) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c0520Hi2 = c0520Hi2;
                    j2 = c0520Hi2.A03;
                    c2 = 16;
                    break;
                case 16:
                    ba = ba;
                    c0520Hi2 = c0520Hi2;
                    ba.A03 = j2;
                    if (!c0520Hi2.A04(1)) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 17:
                    c0520Hi2 = c0520Hi2;
                    j = -1;
                    if (c0520Hi2.A02 == -1) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    ba = ba;
                    c0520Hi2 = c0520Hi2;
                    ba.A02 = c0520Hi2.A02;
                    c2 = 23;
                    break;
                case 19:
                    ba = ba;
                    jA02 = A02(ba.A06);
                    if (jA02 == j) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    ba = ba;
                    j = jA02 - ba.A03;
                    c2 = 21;
                    break;
                case 21:
                    ba = ba;
                    ba.A02 = j;
                    c2 = 23;
                    break;
                case 22:
                    ba = ba;
                    c0520Hi2 = c0520Hi2;
                    ba.A02 = c0520Hi2.A02;
                    c2 = 23;
                    break;
                case 23:
                    try {
                        ba = ba;
                        ba.A05 = ba.A06.getInputStream();
                        ba.A07 = true;
                        interfaceC0535Hz = ba.A0C;
                        if (interfaceC0535Hz == null) {
                            c2 = 28;
                            break;
                        } else {
                            c2 = 27;
                            break;
                        }
                    } catch (IOException e3) {
                        ba.A07();
                        throw new C0523Hn(e3, c0520Hi2, 1);
                    }
                case 27:
                    ba = ba;
                    c0520Hi2 = c0520Hi2;
                    interfaceC0535Hz = interfaceC0535Hz;
                    interfaceC0535Hz.ABF(ba, c0520Hi2);
                    c2 = 28;
                    break;
                case 28:
                    return ba.A02;
                case 30:
                    String str = contentType;
                    ba.A07();
                    throw new C1090ba(str, c0520Hi2);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final void close() throws C0523Hn {
        try {
            if (this.A05 != null) {
                A0A(this.A06, A01());
                try {
                    this.A05.close();
                } catch (IOException e) {
                    throw new C0523Hn(e, this.A04, 3);
                }
            }
        } finally {
            this.A05 = null;
            A07();
            if (this.A07) {
                this.A07 = false;
                InterfaceC0535Hz<? super BA> interfaceC0535Hz = this.A0C;
                if (interfaceC0535Hz != null) {
                    interfaceC0535Hz.ABE(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final int read(byte[] bArr, int i, int i2) throws C0523Hn {
        try {
            A08();
            return A00(bArr, i, i2);
        } catch (IOException e) {
            throw new C0523Hn(e, this.A04, 2);
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.Nullable;
import android.util.Log;
import d.b.a.b.k;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.7D, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7D {
    public static byte[] A02;
    public static final String A03;
    public static volatile C7D A04;
    public final XJ A00;
    public final Map<String, AnonymousClass79> A01 = Collections.synchronizedMap(new HashMap());

    public static String A07(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 122);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A08() {
        A02 = new byte[]{52, 56, 44, 50, 48, -75, -70, 73, 66, 63, 66, 67, 75, 66, -8, 58, 56, 49, 62, 87, 74, 75, 85, 78, 9, 93, 88, 9, 96, 91, 82, 93, 78, 9, 75, 82, 93, 86, 74, 89, 9, 93, 88, 9, 79, 82, 85, 78, 9, 17, 94, 91, 85, 38, 42, 73, 76, 8, 87, 93, 92, 88, 93, 92, 8, 76, 77, 91, 92, 81, 86, 73, 92, 81, 87, 86, 8, 16, 78, 81, 84, 77, 37, -16, 9, -4, -3, 7, 0, -69, 15, 10, -69, 18, 13, 4, 15, 0, -69, -3, 4, 15, 8, -4, 11, -69, 15, 10, -69, 10, 16, 15, 11, 16, 15, -69, 14, 15, 13, 0, -4, 8, 14, 41, 49, 52, 45, 44, -24, 60, 55, -24, 43, 55, 56, 65, -24, 52, 55, 43, 41, 52, -24, 49, 53, 41, 47, 45, -24, 49, 54, 60, 55, -24, 43, 41, 43, 48, 45, -24, -16, 61, 58, 52, 5, -34, -16, -16, -30, -15, -73, -84, -84, -84, 41, 44, 30, 33, 55, 85, 87, 92, 89, 20, 89, 102, 102, 99, 102, 34, 20, 54, 93, 104, 97, 85, 100, 20, 93, 103, 20, 98, 105, 96, 96, 34, 14, 17, 20, 13, -30, -41, -41};
    }

    static {
        A08();
        A03 = C7D.class.getSimpleName();
    }

    public C7D(XJ xj) {
        this.A00 = xj;
    }

    private int A00(String str, @Nullable Bitmap bitmap) throws IOException {
        String strA07 = A07(5, 2, 18);
        if (bitmap == null) {
            A0A(null);
            return 0;
        }
        File file = new File(this.A00.getCacheDir(), str.hashCode() + A07(14, 4, 80));
        ByteArrayOutputStream byteArrayOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            int size = byteArrayOutputStream.size();
            int size2 = JQ.A0C(this.A00);
            if (size >= size2) {
                return 0;
            }
            fileOutputStream = new FileOutputStream(file);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.flush();
            return size;
        } catch (IOException e) {
            A0A(e);
            Log.e(A03, A07(18, 36, 111) + str + strA07, e);
            return 0;
        } catch (FileNotFoundException e2) {
            Log.e(A03, A07(54, 29, 110) + file.getPath() + strA07, e2);
            A0A(e2);
            return 0;
        } catch (OutOfMemoryError e3) {
            A0A(e3);
            Log.e(A03, A07(83, 39, 33), e3);
            return 0;
        } finally {
            A09(byteArrayOutputStream);
            A09(fileOutputStream);
        }
    }

    @Nullable
    private final Bitmap A01(C8C c8c, AnonymousClass79 anonymousClass79, int i, int i2, String str) {
        if (C7F.A06(c8c) && A07(174, 4, 67).equals(str)) {
            this.A01.put(anonymousClass79.A07, anonymousClass79);
        }
        String str2 = anonymousClass79.A07;
        C7E c7e = new C7E(anonymousClass79.A05, anonymousClass79.A06, A07(0, 5, 81), str, str2);
        File file = new File(this.A00.getCacheDir(), str2.hashCode() + A07(14, 4, 80));
        if (!file.exists()) {
            C7F.A04(c8c, c7e, false);
            return str2.startsWith(A07(206, 7, 46)) ? A04(str2, i2, i) : A02(c8c, anonymousClass79, str);
        }
        C7F.A04(c8c, c7e, true);
        try {
            if (A0B(i2, i)) {
                return C7G.A02(file.getCanonicalPath(), i2, i, this.A00);
            }
            return BitmapFactory.decodeFile(file.getCanonicalPath());
        } catch (IOException e) {
            A0A(e);
            return null;
        }
    }

    @Nullable
    private Bitmap A02(C8C c8c, AnonymousClass79 anonymousClass79, String str) throws Throwable {
        String str2 = str;
        C8C c8c2 = c8c;
        AnonymousClass79 anonymousClass792 = anonymousClass79;
        Bitmap bitmap = null;
        long jCurrentTimeMillis = 0;
        int iA00 = 0;
        String string = null;
        Bitmap bitmapA01 = null;
        InputStream inputStreamOpen = null;
        OutOfMemoryError e = null;
        IOException e2 = null;
        Throwable th = null;
        Bitmap bitmapA03 = null;
        IOException iOException = null;
        Bitmap bitmapA032 = null;
        C7D c7d = this;
        String str3 = anonymousClass792.A07;
        int i = anonymousClass792.A03;
        int i2 = anonymousClass792.A04;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        IOException e3 = null;
        char c2 = str3.startsWith(A07(165, 9, 3)) ? (char) 2 : (char) 26;
        while (true) {
            switch (c2) {
                case 2:
                    inputStreamOpen = null;
                    c2 = 3;
                    break;
                case 3:
                    try {
                        c7d = c7d;
                        inputStreamOpen = c7d.A00.getAssets().open(str3.substring(9));
                        if (!c7d.A0B(i, i2)) {
                            c2 = 11;
                            break;
                        } else {
                            c2 = '\t';
                            break;
                        }
                    } catch (IOException e4) {
                        e2 = e4;
                        c2 = 19;
                        break;
                    } catch (OutOfMemoryError e5) {
                        e = e5;
                        c2 = 14;
                        break;
                    }
                case '\t':
                    inputStreamOpen = inputStreamOpen;
                    bitmapA01 = C7G.A01(inputStreamOpen, i, i2);
                    c2 = ' ';
                    break;
                case 11:
                    inputStreamOpen = inputStreamOpen;
                    bitmapA01 = BitmapFactory.decodeStream(inputStreamOpen);
                    c2 = ' ';
                    break;
                case 14:
                    try {
                        c7d = c7d;
                        e = e;
                        c7d.A0A(e);
                        if (inputStreamOpen == null) {
                            c2 = 17;
                            break;
                        } else {
                            c2 = 16;
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStreamOpen == null) {
                            c2 = 25;
                            break;
                        } else {
                            c2 = 24;
                            break;
                        }
                    }
                case 16:
                    A09(inputStreamOpen);
                    c2 = 17;
                    break;
                case 17:
                    return (Bitmap) null;
                case 19:
                    c7d = c7d;
                    e2 = e2;
                    c7d.A0A(e2);
                    if (inputStreamOpen == null) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    A09(inputStreamOpen);
                    c2 = 22;
                    break;
                case 22:
                    return (Bitmap) null;
                case 24:
                    A09(inputStreamOpen);
                    c2 = 25;
                    break;
                case 25:
                    throw th;
                case 26:
                    c7d = c7d;
                    if (!c7d.A0B(i, i2)) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    try {
                        c7d = c7d;
                        str3 = str3;
                        bitmapA03 = c7d.A05(str3, i, i2);
                        c2 = 30;
                        break;
                    } catch (IOException e6) {
                        e3 = e6;
                        c7d.A0A(e3);
                        bitmapA03 = c7d.A03(str3);
                        c2 = 30;
                        break;
                    }
                case 30:
                    bitmapA03 = bitmapA03;
                    bitmapA032 = bitmapA03;
                    iOException = e3;
                    c2 = '#';
                    break;
                case 31:
                    c7d = c7d;
                    str3 = str3;
                    e3 = null;
                    bitmapA032 = c7d.A03(str3);
                    iOException = null;
                    c2 = '#';
                    break;
                case ' ':
                    inputStreamOpen = inputStreamOpen;
                    if (inputStreamOpen == null) {
                        c2 = '\"';
                        break;
                    } else {
                        c2 = '!';
                        break;
                    }
                case '!':
                    inputStreamOpen = inputStreamOpen;
                    A09(inputStreamOpen);
                    c2 = '\"';
                    break;
                case '\"':
                    bitmapA01 = bitmapA01;
                    e3 = null;
                    bitmapA032 = bitmapA01;
                    iOException = null;
                    c2 = '#';
                    break;
                case '#':
                    if (iOException == null) {
                        c2 = '+';
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case '$':
                    string = iOException.toString();
                    c2 = '%';
                    break;
                case '%':
                    bitmapA032 = bitmapA032;
                    if (bitmapA032 == null) {
                        c2 = '*';
                        break;
                    } else {
                        c2 = '&';
                        break;
                    }
                case '&':
                    c7d = c7d;
                    str3 = str3;
                    bitmapA032 = bitmapA032;
                    iA00 = c7d.A00(str3, bitmapA032);
                    jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                    if (iA00 <= 0) {
                        c2 = ')';
                        break;
                    } else {
                        c2 = '\'';
                        break;
                    }
                case '\'':
                    c8c2 = c8c2;
                    anonymousClass792 = anonymousClass792;
                    str2 = str2;
                    bitmapA032 = bitmapA032;
                    C7F.A03(c8c2, anonymousClass792, str2, C7F.A02, string, Integer.valueOf(iA00), Long.valueOf(jCurrentTimeMillis));
                    bitmap = bitmapA032;
                    c2 = '(';
                    break;
                case '(':
                    return bitmap;
                case ')':
                    c8c2 = c8c2;
                    anonymousClass792 = anonymousClass792;
                    str2 = str2;
                    bitmapA032 = bitmapA032;
                    bitmap = bitmapA032;
                    C7F.A03(c8c2, anonymousClass792, str2, C7F.A01, string, null, null);
                    c2 = '(';
                    break;
                case '*':
                    c8c2 = c8c2;
                    anonymousClass792 = anonymousClass792;
                    str2 = str2;
                    bitmapA032 = bitmapA032;
                    bitmap = bitmapA032;
                    C7F.A03(c8c2, anonymousClass792, str2, C7F.A03, string, null, null);
                    c2 = '(';
                    break;
                case '+':
                    string = null;
                    c2 = '%';
                    break;
            }
        }
    }

    @Nullable
    private Bitmap A03(String str) {
        byte[] bytes = null;
        Q5 q5ABi = QO.A00(this.A00).ABi(str, new QK());
        char c2 = q5ABi != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    q5ABi = q5ABi;
                    bytes = q5ABi.A5T();
                    if (bytes == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    byte[] bArr = bytes;
                    return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                case 4:
                    return (Bitmap) null;
            }
        }
    }

    @Nullable
    private Bitmap A04(String str, int i, int i2) {
        Bitmap bitmapDecodeStream;
        try {
            boolean zA0B = A0B(i, i2);
            String strA07 = A07(206, 7, 46);
            if (zA0B) {
                bitmapDecodeStream = C7G.A02(str.substring(strA07.length()), i, i2, this.A00);
            } else {
                bitmapDecodeStream = BitmapFactory.decodeStream(new FileInputStream(str.substring(strA07.length())), null, null);
            }
            A00(str, bitmapDecodeStream);
            return bitmapDecodeStream;
        } catch (IOException e) {
            Log.e(A03, A07(k.AppCompatTheme_windowMinWidthMajor, 43, 78) + str + A07(5, 2, 18), e);
            return null;
        }
    }

    @Nullable
    private Bitmap A05(String str, int i, int i2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setDoInput(true);
        httpURLConnection.connect();
        InputStream inputStream = httpURLConnection.getInputStream();
        Bitmap bitmapA01 = C7G.A01(inputStream, i, i2);
        A09(inputStream);
        return bitmapA01;
    }

    public static C7D A06(XJ xj) {
        if (A04 == null) {
            synchronized (C7D.class) {
                if (A04 == null) {
                    A04 = new C7D(xj);
                }
            }
        }
        return A04;
    }

    public static void A09(@Nullable Closeable closeable) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private void A0A(@Nullable Throwable th) {
        C7D c7d = this;
        String strA07 = A07(0, 5, 81);
        char c2 = th != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c7d = c7d;
                    th = th;
                    strA07 = strA07;
                    c7d.A00.A04().A83(strA07, C03008a.A1K, new C03018b(th));
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c7d = c7d;
                    strA07 = strA07;
                    c7d.A00.A04().A83(strA07, C03008a.A1K, new C03018b(A07(178, 28, k.AppCompatTheme_windowMinWidthMajor)));
                    c2 = 3;
                    break;
            }
        }
    }

    private boolean A0B(int i, int i2) {
        C7D c7d = this;
        boolean z = false;
        char c2 = i > 0 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 <= 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c7d = c7d;
                    if (!JQ.A0p(c7d.A00)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    @Nullable
    public final Bitmap A0C(AnonymousClass79 anonymousClass79) {
        return A01(this.A00, anonymousClass79, anonymousClass79.A04, anonymousClass79.A03, anonymousClass79.A01);
    }

    @Nullable
    public final Bitmap A0D(C8C c8c, String str, int i, int i2, String str2) {
        AnonymousClass79 anonymousClass79 = this.A01.get(str);
        return (!C7F.A06(c8c) || anonymousClass79 == null) ? A01(c8c, new AnonymousClass79(str, i, i2, A07(7, 7, 90), A07(7, 7, 90)), i2, i, str2) : A01(c8c, anonymousClass79, i2, i, str2);
    }

    public final String A0E(String str) {
        String path = null;
        File file = new File(this.A00.getCacheDir(), str.hashCode() + A07(14, 4, 80));
        char c2 = file.exists() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    file = file;
                    path = file.getPath();
                    c2 = 3;
                    break;
                case 3:
                    return path;
                case 4:
                    str = str;
                    path = str;
                    c2 = 3;
                    break;
            }
        }
    }
}

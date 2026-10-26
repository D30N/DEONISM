package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.0J, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0J {
    public static byte[] A00;
    public static final String A01;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 42);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A00 = new byte[]{71, 78, 63, 81, 102, 102, 123, 102, 52, 119, 120, 123, 103, 125, 122, 115, 52, 102, 113, 103, 123, 97, 102, 119, 113, 52, 33, 35, 105};
    }

    static {
        A04();
        A01 = C0J.class.getSimpleName();
    }

    @Nullable
    public static String A01(String str) {
        String mimeTypeFromExtension = null;
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        char c2 = TextUtils.isEmpty(fileExtensionFromUrl) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    mimeTypeFromExtension = null;
                    c2 = 3;
                    break;
                case 3:
                    return mimeTypeFromExtension;
                case 4:
                    singleton = singleton;
                    fileExtensionFromUrl = fileExtensionFromUrl;
                    mimeTypeFromExtension = singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
                    c2 = 3;
                    break;
            }
        }
    }

    public static String A02(String str) {
        try {
            return A03(MessageDigest.getInstance(A00(0, 3, 32)).digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public static String A03(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
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
                    stringBuffer = stringBuffer;
                    stringBuffer.append(String.format(Locale.US, A00(25, 4, 59), Byte.valueOf(bArr[i])));
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return stringBuffer.toString();
            }
        }
    }

    public static void A05(@Nullable Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.e(A01, A00(3, 22, 62), e);
            }
        }
    }
}

package com.facebook.imageformat;

import d.a.b.d.i;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class e {
    public static byte[] a(String str) {
        i.g(str);
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    public static boolean b(byte[] bArr, byte[] bArr2, int i) {
        i.g(bArr);
        i.g(bArr2);
        if (bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        return b(bArr, bArr2, 0);
    }
}

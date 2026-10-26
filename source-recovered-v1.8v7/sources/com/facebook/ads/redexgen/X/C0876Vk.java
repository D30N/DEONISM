package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import d.b.a.b.k;
import java.io.File;
import java.util.Arrays;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Vk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0876Vk implements InterfaceC02686k<String> {
    public static byte[] A04;
    public final int A00;
    public final long A01;
    public final long A02;

    @Nullable
    public final File A03;

    static {
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 71);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A04 = new byte[]{102, 111, 100, 65, 64, 89, 92, 73, 73};
    }

    public C0876Vk(@Nullable File file) {
        this.A03 = file;
        this.A01 = file != null ? file.lastModified() : 0L;
        this.A02 = file != null ? file.length() : 0L;
        this.A00 = A00(file);
    }

    public static int A00(@Nullable File file) {
        int i = 0;
        char c2 = file != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    file = file;
                    if (!file.exists()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return 0;
                case 4:
                    file = file;
                    i = 0;
                    if (!file.isFile()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i = 0 | 1;
                    c2 = 6;
                    break;
                case 6:
                    file = file;
                    if (!file.isDirectory()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    i |= 2;
                    c2 = '\b';
                    break;
                case '\b':
                    file = file;
                    if (!file.isAbsolute()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    i |= 4;
                    c2 = '\n';
                    break;
                case '\n':
                    file = file;
                    if (!file.isHidden()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    i |= 8;
                    c2 = '\f';
                    break;
                case '\f':
                    return i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final JSONObject ADb(String str, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A01(6, 3, k.AppCompatTheme_windowMinWidthMajor), this.A00);
        jSONObject2.put(A01(0, 3, 77), this.A02);
        jSONObject2.put(A01(3, 3, 106), this.A01);
        jSONObject.put(str, jSONObject2);
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    @SuppressLint({"BadMethodUse-java.io.File.getAbsolutePath"})
    public final boolean A7d(Object obj) {
        C0876Vk newFileInfo = this;
        C0876Vk c0876Vk = (C0876Vk) obj;
        File file = newFileInfo.A03;
        boolean z = false;
        char c2 = file != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0876Vk = c0876Vk;
                    if (c0876Vk.A03 != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    c0876Vk = c0876Vk;
                    file = file;
                    if (!file.getAbsolutePath().equals(c0876Vk.A03.getAbsolutePath())) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    newFileInfo = newFileInfo;
                    c0876Vk = c0876Vk;
                    if (newFileInfo.A00 != c0876Vk.A00) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    newFileInfo = newFileInfo;
                    c0876Vk = c0876Vk;
                    if (newFileInfo.A02 != c0876Vk.A02) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    newFileInfo = newFileInfo;
                    c0876Vk = c0876Vk;
                    if (newFileInfo.A01 != c0876Vk.A01) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    z = true;
                    c2 = '\t';
                    break;
                case '\t':
                    return z;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    public final int ADH() {
        return A01(6, 3, k.AppCompatTheme_windowMinWidthMajor).getBytes().length + A01(0, 3, 77).getBytes().length + A01(3, 3, 106).getBytes().length + 4 + 16;
    }
}

package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.pm.Signature;
import d.b.a.b.k;
import java.io.ByteArrayInputStream;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Uh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0847Uh implements InterfaceC02686k<Integer> {
    public static byte[] A02;
    public final String A00;
    public final String A01;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 98);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A02 = new byte[]{71, 5, 22, -20, -13, -18, -9, -1, -66};
    }

    public C0847Uh(Signature signature) throws NoSuchAlgorithmException, CertificateException {
        this.A00 = A01(signature, AnonymousClass70.A04);
        this.A01 = A01(signature, AnonymousClass70.A05);
    }

    public static String A01(Signature signature, AnonymousClass70 anonymousClass70) throws NoSuchAlgorithmException, CertificateException {
        return AnonymousClass71.A08(((X509Certificate) CertificateFactory.getInstance(A00(2, 5, 92)).generateCertificate(new ByteArrayInputStream(signature.toByteArray()))).getEncoded(), anonymousClass70);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final JSONObject ADb(Integer num, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A00(0, 2, k.AppCompatTheme_viewInflaterClass), this.A00);
        jSONObject2.put(A00(7, 2, 42), this.A01);
        jSONObject.put(Integer.toString(num.intValue()), jSONObject2);
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    public final boolean A7d(Object obj) {
        C0847Uh newAppCertificateHash = this;
        String str = null;
        boolean z = false;
        C0847Uh c0847Uh = (C0847Uh) obj;
        String str2 = newAppCertificateHash.A00;
        char c2 = str2 != null ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    c0847Uh = c0847Uh;
                    str2 = str2;
                    if (!str2.equals(c0847Uh.A00)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    newAppCertificateHash = newAppCertificateHash;
                    str = newAppCertificateHash.A01;
                    if (str == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0847Uh = c0847Uh;
                    str = str;
                    if (!str.equals(c0847Uh.A01)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z = true;
                    c2 = 6;
                    break;
                case 6:
                    return z;
                case 7:
                    z = false;
                    c2 = 6;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public final int ADH() {
        C0847Uh c0847Uh = this;
        int length = 0;
        String str = null;
        String str2 = c0847Uh.A01;
        int length2 = 0;
        char c2 = str2 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    str2 = str2;
                    length = str2.length();
                    c2 = 3;
                    break;
                case 3:
                    c0847Uh = c0847Uh;
                    str = c0847Uh.A00;
                    if (str == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    str = str;
                    length2 = str.length();
                    c2 = 5;
                    break;
                case 5:
                    return length + length2;
                case 6:
                    length = 0;
                    c2 = 3;
                    break;
            }
        }
    }
}

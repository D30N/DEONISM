package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class KV {
    public static byte[] A0F;
    public int A00;

    @Nullable
    public AdExperienceType A01;
    public C8C A02;
    public K8 A03;
    public KB A04;

    @Nullable
    public C0613Lb A05;

    @Nullable
    public String A06;
    public String A07;

    @Nullable
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final AdPlacementType A0C;
    public final KG A0D;

    @Nullable
    public final String A0E;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 105);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A0F = new byte[]{66, Byte.MAX_VALUE, 114, 126, 112, Byte.MAX_VALUE, 99, 70, 75, 73, 78, 18, 14, 3, 1, 7, 15, 7, 12, 22, 29, 22, 27, 18, 7, 71, 72, 77, 65, 74, 80, 91, 86, 65, 85, 81, 65, 87, 80, 91, 77, 64, 93, 76, 90, 93, 86, 68, 70, 77, 76, 1, 13, 18, 18, 3, 92, 77, 69, 88, 68, 73, 92, 77, 87, 65, 76, 35, 39, 57, 52, 36, 56, 33, 60, 48, 54, 37, 59, 44, 45, 42, 48, 55, 67, 84, 64, 68, 84, 66, 69, 78, 69, 88, 92, 84, 125, 124, 116, 118, 102, 120, 125, 102, 112, 125, 103, 107, 115, 126, 105, Byte.MAX_VALUE, 120, 126, 101, 111, 120, 105, 104, 1, 4, 31, 5, 24, 16, 5, 18, 9, 5, 14, 3, 5, 31, 20, 25, 16, 5, 15, 4, 9, 18, 25, 4, 0, 8, 18, 25, 2, 6, 8, 3, 28, 27, 14, 12, 4, 16, 27, 29, 14, 12, 10, 24, 2, 14, 28, 4, 29, 5, 24, 14, 16, 21, 14, 20, 9, 1, 20, 3, 24, 20, 31, 18, 20, 119, 114, 105, 100, 115, 102, 121, 100, 98, Byte.MAX_VALUE, 120, 113, 105, 117, 121, 120, 112, Byte.MAX_VALUE, 113, 105, 122, 119, 101, 98, 105, 99, 102, 114, 119, 98, 115, 105, 98, Byte.MAX_VALUE, 123, 115, 111, 98, 96, 103, 121, 96, 106, 103, 97, 84, 72, 69, 71, 65, 73, 65, 74, 80, 91, 77, 64, 28, 23, 26, 1, 23, 26, 25, 2, 26, 8, 22, 19, 4, 8, 5, 18, 6, 2, 18, 4, 3, 18, 19};
    }

    public KV(C8C c8c, String str, @Nullable C0613Lb c0613Lb, KB kb, @Nullable String str2, int i, boolean z, boolean z2, KG kg, @Nullable String str3, @Nullable String str4, @Nullable AdExperienceType adExperienceType) {
        this.A02 = c8c;
        this.A07 = str;
        this.A05 = c0613Lb;
        this.A04 = kb;
        this.A0E = str2;
        this.A00 = i;
        this.A0B = z;
        this.A09 = z2;
        this.A0D = kg;
        this.A03 = K8.A00(kb);
        this.A0C = this.A03.A03();
        this.A08 = str3;
        this.A06 = str4;
        this.A01 = adExperienceType;
    }

    private void A02(Map<String, String> params, String str, String str2) {
        params.put(str, str2);
    }

    public final int A03() {
        return this.A00;
    }

    public final K8 A04() {
        return this.A03;
    }

    public final KB A05() {
        return this.A04;
    }

    public final KG A06() {
        return this.A0D;
    }

    @Nullable
    public final C0613Lb A07() {
        return this.A05;
    }

    public final String A08() {
        return this.A07;
    }

    public final Map<String, String> A09(Map<String, String> map) {
        KV kv = this;
        String bidTimeToken = null;
        String strA05 = null;
        boolean z = false;
        AdExperienceType adExperienceType = null;
        int i = 0;
        String strA00 = null;
        C0613Lb c0613Lb = null;
        KB kb = null;
        String str = null;
        String str2 = null;
        HashMap map2 = new HashMap(map);
        kv.A02(map2, A00(7, 4, 102), C02335a.A00().A03());
        char c2 = C02335a.A00().A04() ? (char) 2 : (char) 29;
        while (true) {
            switch (c2) {
                case 2:
                    strA00 = A00(67, 1, k.AppCompatTheme_windowMinWidthMajor);
                    c2 = 3;
                    break;
                case 3:
                    kv = kv;
                    map2 = map2;
                    strA00 = strA00;
                    String idfaFlag = A00(220, 9, 79);
                    kv.A02(map2, idfaFlag, strA00);
                    String strValueOf = String.valueOf(kv.A09);
                    String idfaFlag2 = A00(51, 5, 43);
                    kv.A02(map2, idfaFlag2, strValueOf);
                    String str3 = kv.A07;
                    String idfaFlag3 = A00(229, 12, 109);
                    kv.A02(map2, idfaFlag3, str3);
                    if (kv.A0C == AdPlacementType.UNKNOWN) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    kv = kv;
                    map2 = map2;
                    String idfaFlag4 = kv.A0C.toString();
                    String lowerCase = idfaFlag4.toLowerCase();
                    String idfaFlag5 = A00(11, 14, 43);
                    kv.A02(map2, idfaFlag5, lowerCase);
                    c2 = 5;
                    break;
                case 5:
                    kv = kv;
                    c0613Lb = kv.A05;
                    if (c0613Lb == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    kv = kv;
                    map2 = map2;
                    c0613Lb = c0613Lb;
                    String strValueOf2 = String.valueOf(c0613Lb.A01());
                    String idfaFlag6 = A00(68, 5, 25);
                    kv.A02(map2, idfaFlag6, strValueOf2);
                    String strValueOf3 = String.valueOf(kv.A05.A00());
                    String idfaFlag7 = A00(1, 6, 94);
                    kv.A02(map2, idfaFlag7, strValueOf3);
                    c2 = 7;
                    break;
                case 7:
                    kv = kv;
                    kb = kv.A04;
                    if (kb == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    kv = kv;
                    map2 = map2;
                    kb = kb;
                    String strValueOf4 = String.valueOf(kb.A03());
                    String idfaFlag8 = A00(56, 11, 97);
                    kv.A02(map2, idfaFlag8, strValueOf4);
                    c2 = '\t';
                    break;
                case '\t':
                    kv = kv;
                    if (!kv.A0B) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    kv = kv;
                    map2 = map2;
                    String strA002 = A00(42, 9, 96);
                    String idfaFlag9 = A00(0, 1, 26);
                    kv.A02(map2, strA002, idfaFlag9);
                    c2 = 11;
                    break;
                case 11:
                    kv = kv;
                    str2 = kv.A0E;
                    if (str2 == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    kv = kv;
                    map2 = map2;
                    str2 = str2;
                    String idfaFlag10 = A00(96, 10, 80);
                    kv.A02(map2, idfaFlag10, str2);
                    c2 = '\r';
                    break;
                case '\r':
                    kv = kv;
                    i = kv.A00;
                    if (i == 0) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    kv = kv;
                    map2 = map2;
                    kv.A02(map2, A00(247, 17, 62), String.valueOf(i));
                    c2 = 15;
                    break;
                case 15:
                    kv = kv;
                    z = kv.A0A;
                    if (!z) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    kv = kv;
                    map2 = map2;
                    kv.A02(map2, A00(162, 22, 56), String.valueOf(z));
                    c2 = 17;
                    break;
                case 17:
                    kv = kv;
                    map2 = map2;
                    String strValueOf5 = String.valueOf(C0636Lz.A02(kv.A02));
                    String idfaFlag11 = A00(106, 13, 69);
                    kv.A02(map2, idfaFlag11, strValueOf5);
                    String strA052 = C0627Lq.A05(System.currentTimeMillis());
                    String idfaFlag12 = A00(84, 12, k.AppCompatTheme_windowFixedWidthMajor);
                    kv.A02(map2, idfaFlag12, strA052);
                    if (!kv.A0D.A08()) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    kv = kv;
                    String idfaFlag13 = kv.A0D.A04();
                    if (idfaFlag13 == null) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    kv = kv;
                    map2 = map2;
                    String strA04 = kv.A0D.A04();
                    String idfaFlag14 = A00(241, 6, 55);
                    kv.A02(map2, idfaFlag14, strA04);
                    c2 = 20;
                    break;
                case 20:
                    kv = kv;
                    strA05 = kv.A0D.A05();
                    if (!TextUtils.isEmpty(strA05)) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 21:
                    kv = kv;
                    map2 = map2;
                    strA05 = strA05;
                    String idfaFlag15 = A00(137, 14, 36);
                    kv.A02(map2, idfaFlag15, strA05);
                    c2 = 22;
                    break;
                case 22:
                    kv = kv;
                    bidTimeToken = kv.A08;
                    if (bidTimeToken == null) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    kv = kv;
                    map2 = map2;
                    bidTimeToken = bidTimeToken;
                    String idfaFlag16 = A00(151, 11, 38);
                    kv.A02(map2, idfaFlag16, bidTimeToken);
                    c2 = 24;
                    break;
                case 24:
                    kv = kv;
                    map2 = map2;
                    String string = UUID.randomUUID().toString();
                    String idfaFlag17 = A00(25, 17, 109);
                    kv.A02(map2, idfaFlag17, string);
                    String strA06 = C0627Lq.A06(AnonymousClass24.A00(kv.A02.A00()));
                    String idfaFlag18 = A00(184, 36, 95);
                    kv.A02(map2, idfaFlag18, strA06);
                    str = kv.A06;
                    if (str == null) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    kv = kv;
                    map2 = map2;
                    str = str;
                    String idfaFlag19 = A00(73, 11, 13);
                    kv.A02(map2, idfaFlag19, str);
                    c2 = 26;
                    break;
                case 26:
                    kv = kv;
                    adExperienceType = kv.A01;
                    if (adExperienceType == null) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    kv = kv;
                    map2 = map2;
                    adExperienceType = adExperienceType;
                    String adExperienceType2 = adExperienceType.getAdExperienceType();
                    String idfaFlag20 = A00(k.AppCompatTheme_windowFixedHeightMinor, 18, 41);
                    kv.A02(map2, idfaFlag20, adExperienceType2);
                    c2 = 28;
                    break;
                case 28:
                    return map2;
                case 29:
                    strA00 = A00(0, 1, 26);
                    c2 = 3;
                    break;
            }
        }
    }
}

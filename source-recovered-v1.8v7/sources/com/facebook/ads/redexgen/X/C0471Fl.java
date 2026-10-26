package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RelativeLayout;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.internal.api.BuildConfigApi;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Fl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0471Fl extends AbstractC0775Rk implements InterfaceC0619Li<Bundle> {
    public static byte[] A0F;

    @Nullable
    public InterfaceC01280x A00;
    public C7C A01;

    @Nullable
    public C0755Qq A02;

    @Nullable
    public C0654Ms A03;

    @Nullable
    public String A04;

    @Nullable
    public String A05;

    @Nullable
    public JSONObject A06;

    @Nullable
    public XI A09;

    @Nullable
    public JW A0A;
    public final C9C<C02987x> A0C = new RX(this);
    public final C9C<C0603Kr> A0E = new RY(this);
    public final C9C<C0643Mg> A0D = new RZ(this);
    public final C9C<C0645Mi> A0B = new C0765Ra(this);
    public boolean A07 = false;
    public boolean A08 = false;

    public static String A06(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 35);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0A() {
        A0F = new byte[]{83, 76, 65, 64, 74, 122, 81, 76, 72, 64, 122, 85, 74, 73, 73, 76, 75, 66, 122, 76, 75, 81, 64, 87, 83, 68, 73, 113, 110, 99, 98, 104, 79, 67, 82, 85, 75, 76, 91, 79, 75, 91, 77, 74, 119, 90, 120, Byte.MAX_VALUE, 97, 100, 97, 70, 109, 106, 108, 102, 96, 118, 6, 7, 4, 11, 12, 11, 22, 11, 13, 12, 85, 80, 107, 70, 81, 71, 68, 91, 90, 71, 81, 97, 102, 123, 124, 122, 109, 105, 101, 80, 83, 91, 91, 89, 78, 59, 35, 33, 56, 9, 44, 1, 38, 37, 41, 51, 40, 50, 34, 41, 49, 40, 4, 19, 6, 111, 112, 125, 124, 118, 65, 121, 123, 98, 50, 83, 118, 46, 54, 52, 45, 28, 57, 74, 72, 89, 72, 75, 64, 69, 64, 93, 64, 76, 90, 69, 93, 95, 70, 116, 67, 66, 66, 89, 88, 89, 72, 85, 89, 87, 64, 103, 110, 115, 108, 96, 117, 36, 59, 54, 55, 61, 7, 0, 30, 0, 5, 16, 5, 48, 40, 42, 51, 51, 34, 33, 47, 38, 16, 38, 32, 44, 45, 39, 48, 3, 59, 57, 32, 112, 17, 52, 112, 57, 62};
    }

    static {
        A0A();
    }

    private int A00() throws JSONException {
        C0471Fl c0471Fl = this;
        JSONObject jSONObject = null;
        JSONObject jSONObject2 = null;
        String strA06 = A06(177, 16, 96);
        String strA062 = A06(143, 10, 21);
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0471Fl = c0471Fl;
                        jSONObject = c0471Fl.A06.getJSONObject(A06(131, 12, 10));
                        if (jSONObject.has(strA062)) {
                            c2 = 7;
                        } else {
                            c2 = 15;
                            continue;
                        }
                    } catch (Exception e) {
                        Log.w(String.valueOf(C0471Fl.class), KI.A02(2L), e);
                        return -1;
                    }
                case 7:
                    strA062 = strA062;
                    jSONObject = jSONObject;
                    if (jSONObject.isNull(strA062)) {
                        c2 = 15;
                    } else {
                        c2 = '\t';
                        continue;
                    }
                case '\t':
                    strA062 = strA062;
                    jSONObject = jSONObject;
                    jSONObject2 = jSONObject.getJSONObject(strA062);
                    if (jSONObject2.has(strA06)) {
                        c2 = '\f';
                    } else {
                        c2 = 14;
                        continue;
                    }
                case '\f':
                    return jSONObject2.getInt(strA06);
                case 14:
                    return -1;
                case 15:
                    return -1;
            }
            Log.w(String.valueOf(C0471Fl.class), KI.A02(2L), e);
            return -1;
        }
    }

    @Nullable
    private String A03() throws JSONException {
        C0471Fl c0471Fl = this;
        JSONObject jSONObject = null;
        JSONObject jSONObject2 = null;
        String strA06 = A06(46, 3, 46);
        String strA062 = A06(49, 9, 38);
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0471Fl = c0471Fl;
                    jSONObject = c0471Fl.A06.getJSONObject(A06(131, 12, 10));
                    if (jSONObject.has(strA062)) {
                        c2 = 7;
                    } else {
                        c2 = 15;
                        continue;
                    }
                case 7:
                    try {
                        strA062 = strA062;
                        jSONObject = jSONObject;
                        if (jSONObject.isNull(strA062)) {
                            c2 = 15;
                        } else {
                            c2 = '\t';
                            continue;
                        }
                    } catch (Exception e) {
                        Log.w(String.valueOf(C0471Fl.class), KI.A02(0L), e);
                        return (String) null;
                    }
                case '\t':
                    strA062 = strA062;
                    jSONObject = jSONObject;
                    jSONObject2 = jSONObject.getJSONObject(strA062);
                    if (jSONObject2.has(strA06)) {
                        c2 = '\f';
                    } else {
                        c2 = 14;
                        continue;
                    }
                case '\f':
                    return jSONObject2.getString(strA06);
                case 14:
                    return (String) null;
                case 15:
                    return (String) null;
            }
            Log.w(String.valueOf(C0471Fl.class), KI.A02(0L), e);
            return (String) null;
        }
    }

    private String A04() throws JSONException {
        C0471Fl c0471Fl = this;
        JSONObject jSONObject = null;
        JSONObject jSONObject2 = null;
        String strA06 = A06(159, 6, 34);
        String strA062 = A06(101, 9, 101);
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0471Fl = c0471Fl;
                        jSONObject = c0471Fl.A06.getJSONObject(A06(131, 12, 10));
                        if (jSONObject.has(strA062)) {
                            c2 = 7;
                        } else {
                            c2 = 15;
                            continue;
                        }
                    } catch (Exception e) {
                        Log.w(String.valueOf(C0471Fl.class), KI.A02(1L), e);
                        return (String) null;
                    }
                case 7:
                    strA062 = strA062;
                    jSONObject = jSONObject;
                    if (jSONObject.isNull(strA062)) {
                        c2 = 15;
                    } else {
                        c2 = '\t';
                        continue;
                    }
                case '\t':
                    strA062 = strA062;
                    jSONObject = jSONObject;
                    jSONObject2 = jSONObject.getJSONObject(strA062);
                    if (jSONObject2.has(strA06)) {
                        c2 = '\f';
                    } else {
                        c2 = 14;
                        continue;
                    }
                case '\f':
                    return jSONObject2.optString(strA06);
                case 14:
                    return (String) null;
                case 15:
                    return (String) null;
            }
            Log.w(String.valueOf(C0471Fl.class), KI.A02(1L), e);
            return (String) null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String A05() {
        C0471Fl c0471Fl = this;
        String str = null;
        C7C c7c = c0471Fl.A01;
        char c2 = c7c != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0471Fl = c0471Fl;
                    str = c0471Fl.A05;
                    if (str == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return c7c.A0L(str);
                case 4:
                    return c0471Fl.A05;
            }
        }
    }

    private void A08() throws JSONException {
        C0565Jd c0565Jd;
        JSONObject jSONObject = this.A06;
        String strA06 = A06(153, 4, 14);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(strA06);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        this.A02.A0Z(new C7M(this.A09));
        XI xi = this.A09;
        if (this.A0A != null) {
            c0565Jd = new C0565Jd(A5k(), this.A0A);
        } else {
            c0565Jd = null;
        }
        AnonymousClass76 anonymousClass76 = new AnonymousClass76(xi, c0565Jd);
        this.A02.A0Z(anonymousClass76);
        this.A02.A0Z(new C0550Io(anonymousClass76, PO.A03));
        this.A02.A0Z(new C02887h(this.A09));
        String countdownFormat = A04();
        if (countdownFormat != null) {
            C02877g c02877g = new C02877g(this.A09, countdownFormat);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12);
            layoutParams.addRule(9);
            c02877g.setLayoutParams(layoutParams);
            c02877g.setCountdownTextColor(-1);
            this.A02.A0Z(c02877g);
        }
        JSONObject jSONObject2 = this.A06;
        String countdownFormat2 = A06(110, 3, 68);
        if (jSONObject2.has(countdownFormat2) && !this.A06.isNull(countdownFormat2)) {
            JSONObject jSONObject3 = this.A06.getJSONObject(countdownFormat2);
            C7Y c7y = new C7Y(this.A09, jSONObject3.getString(A06(46, 3, 46)), this.A0A, this.A04, jSONObject3.getString(strA06));
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(10);
            layoutParams2.addRule(11);
            c7y.setLayoutParams(layoutParams2);
            this.A02.A0Z(c7y);
        }
        final String strA03 = A03();
        if (!TextUtils.isEmpty(strA03)) {
            final XI xi2 = this.A09;
            final String countdownFormat3 = this.A04;
            final float[] fArr = {0.0f, 0.0f, 8.0f, 0.0f};
            this.A02.A0Z(new AbstractC0653Mr(xi2, strA03, countdownFormat3, fArr) { // from class: com.facebook.ads.redexgen.X.7r
                public static byte[] A01;
                public final PK A00;

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
                                bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 127);
                                i4++;
                                c2 = 2;
                                break;
                            case 4:
                                return new String(bArrCopyOfRange);
                        }
                    }
                }

                public static void A01() {
                    A01 = new byte[]{51, 86, 53, 90, 97, 91, 85, 87, 101};
                }

                {
                    super(xi2);
                    this.A00 = new PK(xi2, A00(0, 9, k.AppCompatTheme_windowActionBar), strA03, fArr, countdownFormat3);
                    addView(this.A00);
                }
            });
        }
        int iA00 = A00();
        if (iA00 > 0) {
            C7N c7n = new C7N(this.A09, iA00, jSONObjectOptJSONObject.optString(A06(93, 8, 107), A06(193, 10, k.AppCompatTheme_windowActionBar)), jSONObjectOptJSONObject.optString(A06(125, 6, 126), A06(k.AppCompatTheme_windowFixedHeightMajor, 7, 49)));
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(12);
            layoutParams3.addRule(11);
            c7n.setLayoutParams(layoutParams3);
            c7n.setPadding(0, 0, 0, 30);
            this.A02.A0Z(c7n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        C0471Fl c0471Fl = this;
        XI xi = null;
        InterfaceC01280x interfaceC01280x = null;
        JW jw = c0471Fl.A0A;
        char c2 = jw == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0471Fl = c0471Fl;
                    if (!c0471Fl.A08) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    c0471Fl = c0471Fl;
                    jw = jw;
                    c0471Fl.A08 = true;
                    jw.A87(c0471Fl.A04, new HashMap());
                    xi = c0471Fl.A09;
                    if (xi == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    xi = xi;
                    xi.A0A().A2Z();
                    c2 = 7;
                    break;
                case 7:
                    c0471Fl = c0471Fl;
                    interfaceC01280x = c0471Fl.A00;
                    if (interfaceC01280x == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0471Fl = c0471Fl;
                    interfaceC01280x = interfaceC01280x;
                    interfaceC01280x.A9n(c0471Fl);
                    c2 = '\t';
                    break;
                case '\t':
                    return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0C(com.facebook.ads.redexgen.X.XI r23, com.facebook.ads.redexgen.X.InterfaceC01280x r24, org.json.JSONObject r25, com.facebook.ads.redexgen.X.JW r26, @android.support.annotation.Nullable android.os.Bundle r27, java.util.EnumSet<com.facebook.ads.CacheFlag> r28, int r29) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0471Fl.A0C(com.facebook.ads.redexgen.X.XI, com.facebook.ads.redexgen.X.0x, org.json.JSONObject, com.facebook.ads.redexgen.X.JW, android.os.Bundle, java.util.EnumSet, int):void");
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0775Rk
    public final boolean A0E() {
        C0471Fl c0471Fl = this;
        char c2 = c0471Fl.A07 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0471Fl = c0471Fl;
                    if (c0471Fl.A02 != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    c0471Fl = c0471Fl;
                    if (c0471Fl.A03.A0U() <= 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0471Fl = c0471Fl;
                    c0471Fl.A02.A0U(c0471Fl.A03.A0U());
                    c2 = 6;
                    break;
                case 6:
                    c0471Fl.A02.A0Y(PC.A03, 25);
                    return true;
            }
        }
    }

    public final void A0F(XI xi, InterfaceC01280x interfaceC01280x, JW jw, Bundle bundle, EnumSet<CacheFlag> enumSet) {
        try {
            JSONObject jSONObject = new JSONObject(bundle.getString(A06(68, 11, 23)));
            A0C(xi, interfaceC01280x, jSONObject, jw, bundle, enumSet, jSONObject.optInt(A06(0, 27, 6), 200));
        } catch (JSONException e) {
            if (BuildConfigApi.isDebug()) {
                Log.e(C0471Fl.class.toString(), KI.A02(3L), e);
            }
            interfaceC01280x.A9q(this, AdError.INTERNAL_ERROR);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0G(com.facebook.ads.redexgen.X.XI r15, com.facebook.ads.redexgen.X.InterfaceC01280x r16, java.util.Map<java.lang.String, java.lang.Object> r17, com.facebook.ads.redexgen.X.JW r18, java.util.EnumSet<com.facebook.ads.CacheFlag> r19) {
        /*
            r14 = this;
            r12 = r19
            r10 = r18
            r7 = r15
            r8 = r16
            r6 = r14
            r4 = 0
            r9 = 0
            r3 = 0
            r13 = 0
            r0 = 2
        Ld:
            switch(r0) {
                case 2: goto L11;
                case 9: goto L3c;
                case 10: goto L41;
                case 12: goto L4a;
                case 14: goto L68;
                case 15: goto L7c;
                default: goto L10;
            }
        L10:
            goto Ld
        L11:
            r2 = 173(0xad, float:2.42E-43)
            r1 = 4
            r0 = 71
            java.lang.String r0 = A06(r2, r1, r0)     // Catch: org.json.JSONException -> L5b
            r5 = r17
            java.lang.Object r0 = r5.get(r0)     // Catch: org.json.JSONException -> L5b
            r9 = r0
            org.json.JSONObject r9 = (org.json.JSONObject) r9     // Catch: org.json.JSONException -> L5b
            r2 = 58
            r1 = 10
            r0 = 65
            java.lang.String r0 = A06(r2, r1, r0)     // Catch: org.json.JSONException -> L5b
            java.lang.Object r0 = r5.get(r0)     // Catch: org.json.JSONException -> L5b
            r3 = r0
            com.facebook.ads.redexgen.X.8t r3 = (com.facebook.ads.redexgen.X.C03198t) r3     // Catch: org.json.JSONException -> L5b
            if (r3 != 0) goto L39
            r0 = 9
            goto Ld
        L39:
            r0 = 10
            goto Ld
        L3c:
            r13 = 200(0xc8, float:2.8E-43)
            r0 = 12
            goto Ld
        L41:
            com.facebook.ads.redexgen.X.8t r3 = (com.facebook.ads.redexgen.X.C03198t) r3     // Catch: org.json.JSONException -> L5b
            int r13 = r3.A06()     // Catch: org.json.JSONException -> L5b
            r0 = 12
            goto Ld
        L4a:
            com.facebook.ads.redexgen.X.Fl r6 = (com.facebook.ads.redexgen.X.C0471Fl) r6     // Catch: org.json.JSONException -> L5b
            com.facebook.ads.redexgen.X.XI r7 = (com.facebook.ads.redexgen.X.XI) r7     // Catch: org.json.JSONException -> L5b
            com.facebook.ads.redexgen.X.0x r8 = (com.facebook.ads.redexgen.X.InterfaceC01280x) r8     // Catch: org.json.JSONException -> L5b
            com.facebook.ads.redexgen.X.JW r10 = (com.facebook.ads.redexgen.X.JW) r10     // Catch: org.json.JSONException -> L5b
            java.util.EnumSet r12 = (java.util.EnumSet) r12     // Catch: org.json.JSONException -> L5b
            org.json.JSONObject r9 = (org.json.JSONObject) r9     // Catch: org.json.JSONException -> L5b
            r11 = 0
            r6.A0C(r7, r8, r9, r10, r11, r12, r13)     // Catch: org.json.JSONException -> L5b
            goto L85
        L5b:
            r4 = move-exception
            boolean r0 = com.facebook.ads.internal.api.BuildConfigApi.isDebug()
            if (r0 == 0) goto L65
            r0 = 14
            goto Ld
        L65:
            r0 = 15
            goto Ld
        L68:
            org.json.JSONException r4 = (org.json.JSONException) r4
            java.lang.Class<com.facebook.ads.redexgen.X.Fl> r0 = com.facebook.ads.redexgen.X.C0471Fl.class
            java.lang.String r2 = r0.toString()
            r0 = 4
            java.lang.String r0 = com.facebook.ads.redexgen.X.KI.A02(r0)
            android.util.Log.e(r2, r0, r4)
            r0 = 15
            goto Ld
        L7c:
            com.facebook.ads.redexgen.X.Fl r6 = (com.facebook.ads.redexgen.X.C0471Fl) r6
            com.facebook.ads.redexgen.X.0x r8 = (com.facebook.ads.redexgen.X.InterfaceC01280x) r8
            com.facebook.ads.AdError r0 = com.facebook.ads.AdError.INTERNAL_ERROR
            r8.A9q(r6, r0)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0471Fl.A0G(com.facebook.ads.redexgen.X.XI, com.facebook.ads.redexgen.X.0x, java.util.Map, com.facebook.ads.redexgen.X.JW, java.util.EnumSet):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01180n
    public final String A5k() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0619Li
    public final Bundle getSaveInstanceState() {
        C0471Fl c0471Fl = this;
        C0755Qq c0755Qq = null;
        char c2 = c0471Fl.A03 != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0471Fl = c0471Fl;
                    if (c0471Fl.A06 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0471Fl = c0471Fl;
                    c0755Qq = c0471Fl.A02;
                    if (c0755Qq == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0755Qq = c0755Qq;
                    if (c0755Qq.getState() != EnumC0737Py.A04) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return (Bundle) null;
                case 6:
                    C0471Fl c0471Fl2 = c0471Fl;
                    Bundle bundle = new Bundle();
                    bundle.putBundle(A06(87, 6, 31), c0471Fl2.A03.getSaveInstanceState());
                    bundle.putString(A06(68, 11, 23), c0471Fl2.A06.toString());
                    return bundle;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01180n
    public final void onDestroy() {
        C0755Qq c0755Qq = this.A02;
        if (c0755Qq != null) {
            c0755Qq.A0V(9);
            this.A02.A0R();
        }
        this.A00 = null;
        this.A0A = null;
        this.A05 = null;
        this.A07 = false;
        this.A04 = null;
        this.A02 = null;
        this.A03 = null;
        this.A06 = null;
        this.A09 = null;
        this.A08 = false;
    }
}

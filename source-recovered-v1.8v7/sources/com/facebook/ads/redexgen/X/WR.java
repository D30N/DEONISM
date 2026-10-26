package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.hardware.Sensor;
import android.os.Build;
import d.b.a.b.k;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class WR implements InterfaceC02676j {
    public static byte[] A0K;
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final String A0I;
    public final String A0J;
    public final String A08 = A00(18, 2, k.AppCompatTheme_windowFixedHeightMinor);
    public final String A0A = A00(4, 2, 74);
    public final String A0B = A00(14, 3, 19);
    public final String A09 = A00(0, 3, 104);
    public final String A0C = A00(10, 1, 36);
    public final String A0D = A00(3, 1, 57);
    public final String A0E = A00(9, 1, 76);
    public final String A0F = A00(17, 1, 103);
    public final String A0G = A00(11, 3, 102);
    public final String A0H = A00(6, 3, 90);

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 91);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A0K = new byte[]{48, 36, 39, 4, 18, 23, 43, 26, 39, 25, -19, 55, 38, 47, -37, -41, -46, 54, 59, 54};
    }

    public WR(Sensor sensor) {
        this.A03 = Build.VERSION.SDK_INT < 24 ? 0 : sensor.getId();
        this.A04 = Build.VERSION.SDK_INT >= 21 ? sensor.getMaxDelay() : 0;
        this.A00 = sensor.getMaximumRange();
        this.A05 = sensor.getMinDelay();
        this.A0I = sensor.getName();
        this.A01 = sensor.getPower();
        this.A02 = sensor.getResolution();
        this.A06 = sensor.getType();
        this.A0J = sensor.getVendor();
        this.A07 = sensor.getVersion();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02676j
    public final boolean A7d(Object obj) {
        WR customObjectSignalValueDef = this;
        boolean z = false;
        WR wr = (WR) obj;
        char c2 = customObjectSignalValueDef.A03 == wr.A03 ? (char) 2 : '\r';
        while (true) {
            switch (c2) {
                case 2:
                    customObjectSignalValueDef = customObjectSignalValueDef;
                    wr = wr;
                    if (customObjectSignalValueDef.A04 != wr.A04) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    customObjectSignalValueDef = customObjectSignalValueDef;
                    wr = wr;
                    if (Math.abs(customObjectSignalValueDef.A00 - wr.A00) >= C02525u.A01()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    customObjectSignalValueDef = customObjectSignalValueDef;
                    wr = wr;
                    if (customObjectSignalValueDef.A05 != wr.A05) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    customObjectSignalValueDef = customObjectSignalValueDef;
                    wr = wr;
                    if (!AnonymousClass71.A0F(customObjectSignalValueDef.A0I, wr.A0I)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    customObjectSignalValueDef = customObjectSignalValueDef;
                    wr = wr;
                    if (Math.abs(customObjectSignalValueDef.A01 - wr.A01) >= C02525u.A01()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    customObjectSignalValueDef = customObjectSignalValueDef;
                    wr = wr;
                    if (Math.abs(customObjectSignalValueDef.A02 - wr.A02) >= C02525u.A01()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    customObjectSignalValueDef = customObjectSignalValueDef;
                    wr = wr;
                    if (customObjectSignalValueDef.A06 != wr.A06) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    customObjectSignalValueDef = customObjectSignalValueDef;
                    wr = wr;
                    if (!AnonymousClass71.A0F(customObjectSignalValueDef.A0J, wr.A0J)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    customObjectSignalValueDef = customObjectSignalValueDef;
                    wr = wr;
                    if (customObjectSignalValueDef.A07 != wr.A07) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    z = true;
                    c2 = '\f';
                    break;
                case '\f':
                    return z;
                case '\r':
                    z = false;
                    c2 = '\f';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02676j
    public final int ADH() {
        return A00(18, 2, k.AppCompatTheme_windowFixedHeightMinor).length() + 4 + A00(0, 3, 104).length() + 4 + A00(4, 2, 74).length() + 4 + A00(14, 3, 19).length() + 4 + A00(10, 1, 36).length() + this.A0I.length() + A00(3, 1, 57).length() + 4 + A00(9, 1, 76).length() + 4 + A00(17, 1, 103).length() + 4 + A00(11, 3, 102).length() + this.A0J.length() + A00(6, 3, 90).length() + 4;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02676j
    @SuppressLint({"CatchGeneralException"})
    public final JSONObject ADa() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(18, 2, k.AppCompatTheme_windowFixedHeightMinor), this.A03);
            jSONObject.put(A00(0, 3, 104), this.A04);
            jSONObject.put(A00(4, 2, 74), this.A00);
            jSONObject.put(A00(14, 3, 19), this.A05);
            jSONObject.put(A00(10, 1, 36), this.A0I);
            jSONObject.put(A00(3, 1, 57), this.A01);
            jSONObject.put(A00(9, 1, 76), this.A02);
            jSONObject.put(A00(17, 1, 103), this.A06);
            jSONObject.put(A00(11, 3, 102), this.A0J);
            jSONObject.put(A00(6, 3, 90), this.A07);
        } catch (Throwable th) {
            AnonymousClass66.A03(th);
        }
        return jSONObject;
    }
}

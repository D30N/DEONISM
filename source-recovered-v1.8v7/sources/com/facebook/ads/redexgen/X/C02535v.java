package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.ThreadSafe;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ThreadSafe
@SuppressLint({"StaticFieldLeak"})
/* renamed from: com.facebook.ads.redexgen.X.5v, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02535v {
    public static EnumC02626e A06;
    public static byte[] A07;
    public static final AtomicReference<C02535v> A08;
    public C02555x A00;
    public C6P A01;
    public final Context A02;
    public final C02525u A03;
    public final AtomicReference<C6A> A04 = new AtomicReference<>();
    public final AtomicReference<U8> A05 = new AtomicReference<>();

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 62);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A07 = new byte[]{28, 26, 63, 52, Byte.MAX_VALUE, 96, 124, 22, 16, 98, 111};
    }

    static {
        A01();
        A08 = new AtomicReference<>();
    }

    public C02535v(Context context, C02525u c02525u, EnumC02626e enumC02626e) {
        this.A02 = context;
        this.A03 = c02525u;
        this.A01 = new C6P(this.A02, this.A03);
        if (this.A04.get() == null && AnonymousClass71.A0E(enumC02626e)) {
            A02(enumC02626e);
        }
    }

    private synchronized void A02(EnumC02626e enumC02626e) {
        if (this.A04.get() == null) {
            AnonymousClass66.A02(this.A03.A0Z());
            U8 u8 = new U8(this.A03, this.A01);
            this.A05.set(u8);
            this.A00 = new C02555x();
            this.A00.A00(u8);
            if (this.A01.A06() && AnonymousClass71.A0E(enumC02626e)) {
                u8.A05(enumC02626e);
            }
            A06 = enumC02626e;
            this.A00.A01(enumC02626e);
            this.A04.set(C6A.A00(this.A02, this.A03));
        }
    }

    private boolean A03(EnumC02626e enumC02626e) {
        C02535v c02535v = this;
        C02555x c02555x = null;
        char c2 = AnonymousClass71.A0E(enumC02626e) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c02535v = c02535v;
                    enumC02626e = enumC02626e;
                    c02535v.A02(enumC02626e);
                    c2 = 3;
                    break;
                case 3:
                    enumC02626e = enumC02626e;
                    if (!enumC02626e.equals(A06)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    c02535v = c02535v;
                    enumC02626e = enumC02626e;
                    A06 = enumC02626e;
                    c02555x = c02535v.A00;
                    if (c02555x == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    enumC02626e = enumC02626e;
                    c02555x = c02555x;
                    c02555x.A01(enumC02626e);
                    c2 = 7;
                    break;
                case 7:
                    return true;
            }
        }
    }

    private boolean A04(String str, EnumC02666i enumC02666i) {
        C02535v c02535v = this;
        C6P c6p = null;
        char c2 = AnonymousClass71.A0E(A06) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c02535v = c02535v;
                    if (c02535v.A04.get() != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    c02535v = c02535v;
                    c6p = c02535v.A01;
                    if (c6p == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    str = str;
                    enumC02666i = enumC02666i;
                    c6p = c6p;
                    c6p.A05(EnumC02646g.A02, A06, str, enumC02666i);
                    c2 = 6;
                    break;
                case 6:
                    return true;
            }
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final void A05(MotionEvent motionEvent) {
        C02535v c02535v = this;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c02535v = c02535v;
                        if (c02535v.A04.get() == null) {
                            c2 = 5;
                        } else {
                            c2 = 6;
                            continue;
                        }
                    } catch (Throwable th) {
                        AnonymousClass66.A03(th);
                        return;
                    }
                case 5:
                    return;
                case 6:
                    c02535v.A04.get().A05(motionEvent);
                    return;
            }
            AnonymousClass66.A03(th);
            return;
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final synchronized boolean A06(String str) {
        JSONObject jSONObject;
        EnumC02666i enumC02666iA00;
        String string;
        if (str != null) {
            if (!str.isEmpty()) {
                try {
                    jSONObject = new JSONObject(str).getJSONObject(A00(7, 2, 74));
                } catch (JSONException unused) {
                } catch (Throwable th) {
                    AnonymousClass66.A03(th);
                }
                if (jSONObject != null) {
                    zA03 = jSONObject.has(A00(0, 2, 80)) ? false | A03(EnumC02626e.A00(jSONObject.getInt(A00(0, 2, 80)))) : false;
                    JSONArray jSONArray = jSONObject.getJSONArray(A00(2, 2, 98));
                    if (jSONObject.has(A00(4, 3, 50))) {
                        enumC02666iA00 = EnumC02666i.A00(jSONObject.getInt(A00(4, 3, 50)));
                    } else {
                        enumC02666iA00 = EnumC02666i.A04;
                    }
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2.has(A00(9, 2, 53)) && (string = jSONObject2.getString(A00(9, 2, 53))) != null && !string.isEmpty()) {
                            AnonymousClass71.A0B(this.A03, AnonymousClass61.A04.A02(), string);
                            zA03 |= A04(string, enumC02666iA00);
                        }
                    }
                    return zA03;
                }
                return false;
            }
        }
        return false;
    }
}

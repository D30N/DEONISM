package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Tw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0836Tw implements C5S {
    public static byte[] A03;
    public final QV A01;
    public Set<C5V> A00 = new HashSet();
    public final List<C5U> A02 = new ArrayList();

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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

    public static void A02() {
        A03 = new byte[]{38, 52, 52, 34, 51, 52, 70, 70, 67, 21, 92, 70, 67, 21};
    }

    public C0836Tw(InterfaceC0746Qh interfaceC0746Qh) {
        this.A01 = interfaceC0746Qh.A4N(QW.A0A);
        this.A01.A3H(new C0835Tv(this));
        A03();
    }

    @Nullable
    public static Set<C5V> A01(JSONObject jSONObject) {
        C0837Tx c0837TxA00 = null;
        JSONObject assetJson = null;
        int i = 0;
        HashSet hashSet = new HashSet();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A00(0, 6, 46));
        char c2 = jSONArrayOptJSONArray == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (Set) null;
                case 3:
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                    if (i >= jSONArrayOptJSONArray.length()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                    assetJson = jSONArrayOptJSONArray.optJSONObject(i);
                    if (assetJson != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return (Set) null;
                case 7:
                    assetJson = assetJson;
                    c0837TxA00 = C0837Tx.A00(assetJson);
                    if (c0837TxA00 != null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return (Set) null;
                case '\t':
                    hashSet = hashSet;
                    c0837TxA00 = c0837TxA00;
                    hashSet.add(c0837TxA00);
                    i++;
                    c2 = 4;
                    break;
                case '\n':
                    return hashSet;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A03() {
        if (this.A01.A7k()) {
            Set<C5V> setA01 = A01(this.A01.A5y());
            if (!this.A00.equals(setA01) && setA01 != null) {
                this.A00 = setA01;
                for (C5U listener : this.A02) {
                    listener.A3S();
                }
            }
            for (C5V c5v : this.A00) {
                String.format(Locale.US, A00(6, 8, 15), c5v.A7E(), c5v.getUrl());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C5S
    public final void A3F(C5U c5u) {
        this.A02.add(c5u);
    }

    @Override // com.facebook.ads.redexgen.X.C5S
    public final synchronized Set<C5V> A5O() {
        return new HashSet(this.A00);
    }
}

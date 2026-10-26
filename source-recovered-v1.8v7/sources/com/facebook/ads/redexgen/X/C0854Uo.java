package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Uo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0854Uo implements InterfaceC02686k<Integer> {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final int A02;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 73);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A03 = new byte[]{60, 42, 50, 54, 96, 108};
    }

    public C0854Uo(int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final JSONObject ADb(Integer num, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A00(2, 2, 22), this.A02);
        jSONObject2.put(A00(0, 2, 22), this.A00);
        jSONObject2.put(A00(4, 2, 68), this.A01);
        jSONObject.put(num.toString(), jSONObject2);
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    public final boolean A7d(Object obj) {
        C0854Uo newAudioStreamVolume = this;
        boolean z = false;
        C0854Uo c0854Uo = (C0854Uo) obj;
        char c2 = newAudioStreamVolume.A01 == c0854Uo.A01 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    newAudioStreamVolume = newAudioStreamVolume;
                    c0854Uo = c0854Uo;
                    if (newAudioStreamVolume.A00 != c0854Uo.A00) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    newAudioStreamVolume = newAudioStreamVolume;
                    c0854Uo = c0854Uo;
                    if (newAudioStreamVolume.A02 != c0854Uo.A02) {
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

    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    public final int ADH() {
        return A00(2, 2, 22).getBytes().length + A00(0, 2, 22).getBytes().length + A00(4, 2, 68).getBytes().length + 12;
    }
}

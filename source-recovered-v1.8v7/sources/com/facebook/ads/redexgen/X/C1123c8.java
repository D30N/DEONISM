package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.c8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1123c8 extends AbstractRunnableC0608Kw {
    public static byte[] A01;
    public final /* synthetic */ C8C A00;

    static {
        A02();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 92);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{109, 101, 97, 115, 117, 114, 101, 100, 95, 115, 101, 115, 115, 105, 111, 110, 95, 105, 100, 84, 88, 90, 25, 81, 86, 84, 82, 85, 88, 88, 92, 25, 86, 83, 68, 25, 123, 120, 116, 118, 123, 104, 116, 120, 98, 121, 99, 114, 101, 100, 10, 9, 5, 7, 10, 57, 5, 9, 19, 8, 18, 3, 20, 21};
    }

    public C1123c8(C8C c8c) {
        this.A00 = c8c;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        SharedPreferences sharedPreferences = null;
        try {
            sharedPreferences = this.A00.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(19, 31, 107), this.A00), 0);
            Map<String, ?> all = sharedPreferences.getAll();
            if (all.size() > 1) {
                C0568Jg.A04(this.A00, QO.A00(this.A00), all);
                sharedPreferences.edit().clear().apply();
            }
            sharedPreferences.edit().putString(A00(0, 19, 92), this.A00.A05().A02()).apply();
        } catch (JSONException e) {
            this.A00.A04().A83(A00(50, 14, 58), 3502, new C03018b(e));
            sharedPreferences.edit().clear().apply();
        }
    }
}

package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.mirror.NativeViewabilityLogger;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Jz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0587Jz implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ C8C A00;
    public final /* synthetic */ K2 A01;
    public final /* synthetic */ String A02;

    static {
        A01();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 116);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A03 = new byte[]{95, 82, 93, 92, 95, 97, 86, 91, 84, -41, -33, -47, 68, 55, 67, 71, 55, 69, 70, 49, 59, 54, 50, 51, 61, 62, 57, 60, 67};
    }

    public RunnableC0587Jz(K2 k2, String str, C8C c8c) {
        this.A01 = k2;
        this.A02 = str;
        this.A00 = c8c;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ArrayList<NativeViewabilityLogger.ViewabilityRecord> clone;
        if (C0601Ko.A02(this)) {
            return;
        }
        try {
            C03018b c03018b = new C03018b(A00(9, 3, 21));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(22, 7, 86), jSONArray);
            jSONObject.put(A00(12, 10, 94), this.A02);
            synchronized (this.A01.A0D) {
                clone = new ArrayList<>(this.A01.A0D);
                this.A01.A0D.clear();
            }
            Iterator<NativeViewabilityLogger.ViewabilityRecord> it = clone.iterator();
            while (it.hasNext()) {
                K1 k1 = (K1) it.next();
                jSONArray.put(A00(0, 0, 67) + k1.A00 + ';' + k1.A02 + ';' + k1.A01);
            }
            c03018b.A05(jSONObject);
            c03018b.A03(1);
            this.A00.A04().A84(A00(0, 9, k.AppCompatTheme_windowFixedWidthMinor), C03008a.A1u, c03018b);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            C0601Ko.A00(th, this);
        }
    }
}

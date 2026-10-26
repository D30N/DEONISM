package com.facebook.ads.redexgen.X;

import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.c3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1118c3 implements JV {
    public static byte[] A0D;
    public static final String A0E;
    public int A00;
    public long A01;
    public final long A02;
    public final long A03;
    public final ConnectivityManager A04;
    public final XJ A06;
    public final JU A07;
    public final Q6 A08;
    public volatile boolean A0C;
    public final Runnable A0A = new C1116c1(this);
    public final Runnable A09 = new C1117c2(this);
    public final ThreadPoolExecutor A0B = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    public final Handler A05 = new Handler(Looper.getMainLooper());

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 2);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A0D = new byte[]{-83, -32, -53, -51, -40, -36, -47, -41, -42, -120, -33, -48, -47, -44, -51, -120, -52, -47, -37, -40, -55, -36, -53, -48, -47, -42, -49, -120, -51, -34, -51, -42, -36, -37, -106, -75, -57, -44, -40, -57, -44, -126, -44, -57, -42, -41, -44, -48, -57, -58, -126, -61, -126, -48, -47, -48, -113, -43, -41, -59, -59, -57, -43, -43, -56, -41, -50, -126, -43, -42, -61, -42, -41, -43, -126, -59, -47, -58, -57, -126, -47, -56, -126, -48, -30, -17, -13, -30, -17, -99, -12, -34, -16, -99, -14, -21, -34, -33, -23, -30, -99, -15, -20, -99, -19, -17, -20, -32, -30, -16, -16, -99, -34, -23, -23, -99, -30, -13, -30, -21, -15, -16, -87, -99, -15, -17, -10, -26, -21, -28, -99, -34, -28, -34, -26, -21, -85, -96, -72, -74, -67, -67, -74, -69, -76, 109, -79, -74, -64, -67, -82, -63, -80, -75, 109, -79, -62, -78, 109, -63, -68, 109, -71, -82, -80, -72, 109, -68, -77, 109, -80, -68, -69, -69, -78, -80, -63, -74, -61, -74, -63, -58, 123, -113, -96, -113, -104, -98, -99, -45, -27, -14, -10, -27, -14, -96, -14, -27, -13, -16, -17, -18, -13, -27, -96, -23, -13, -96, -27, -19, -16, -12, -7, -82, 113, -126, 104, 101, -97, -78, -78, -93, -85, -82, -78, 102, -117, -107, -110, -125, -106, -123, -118, -117, -112, -119, 66, -121, -104, -121, -112, -106, 66, 74, -118, -106, -107, -107, -116, -118, -101, -112, -99, -112, -101, -96, -68, -50, -37, -33, -50, -37, -119, -39, -37, -40, -52, -50, -36, -36, -50, -51, -119, -39, -54, -37, -35, -46, -54, -43, -119, -53, -54, -35, -52, -47, -107, -119, -52, -40, -41, -35, -46, -41, -34, -46, -41, -48, -119, -35, -40, -119, -41, -50, -31, -35, -119, -40, -41, -50, -105, -43, -58, -34, -47, -44, -58, -55, 113, 110, -127, 110};
    }

    static {
        A07();
        A0E = JV.class.getSimpleName();
    }

    public C1118c3(XJ xj, JU ju) {
        this.A07 = ju;
        this.A06 = xj;
        this.A04 = (ConnectivityManager) xj.getSystemService(A03(244, 12, 37));
        this.A08 = QO.A01(xj);
        this.A03 = JR.A0J(xj);
        this.A02 = JR.A0I(xj);
    }

    public static /* synthetic */ int A00(C1118c3 c1118c3) {
        int i = c1118c3.A00 + 1;
        c1118c3.A00 = i;
        return i;
    }

    private void A05() {
        C1118c3 c1118c3 = this;
        char c2 = BuildConfigApi.isDebug() ? (char) 2 : (char) 2;
        while (true) {
            switch (c2) {
                case 2:
                    c1118c3 = c1118c3;
                    c1118c3.A00 = 0;
                    c1118c3.A01 = 0L;
                    if (c1118c3.A0B.getQueue().size() != 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1118c3 = c1118c3;
                    c1118c3.A07.A8r();
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A06() {
        C1118c3 c1118c3 = this;
        char c2 = c1118c3.A00 >= JR.A09(c1118c3.A06) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    C1118c3 c1118c32 = c1118c3;
                    c1118c32.A05();
                    c1118c32.A4n();
                    return;
                case 3:
                    c1118c3 = c1118c3;
                    if (c1118c3.A00 != 1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1118c3 = c1118c3;
                    c1118c3.A01 = JR.A0H(c1118c3.A06);
                    c2 = 5;
                    break;
                case 5:
                    c1118c3.A4o();
                    return;
                case 6:
                    c1118c3 = c1118c3;
                    c1118c3.A01 *= 2;
                    c2 = 5;
                    break;
            }
        }
    }

    private void A08(long j) {
        this.A05.postDelayed(this.A09, j);
    }

    private void A09(JSONObject jSONObject) throws JSONException {
        Iterator<Map.Entry<String, String>> it = this.A06.A02().A4S().entrySet().iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    jSONObject = jSONObject;
                    it = it;
                    Map.Entry<String, String> entry = it.next();
                    jSONObject.put(entry.getKey(), entry.getValue());
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:22:0x005b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1118c3.A0B():void");
    }

    @Override // com.facebook.ads.redexgen.X.JV
    public final void A4n() {
        if (this.A0C) {
            return;
        }
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.JV
    public final void A4o() {
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A03);
    }
}

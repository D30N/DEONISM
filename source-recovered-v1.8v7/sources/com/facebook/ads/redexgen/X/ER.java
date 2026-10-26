package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import d.b.a.b.k;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class ER implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C0438Ea A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 28);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-42, -8, 9, -2, 4, 3, -75, -5, -2, 1, -6, -75, 1, 4, -10, -7, -2, 3, -4, -75, -5, -10, -2, 1, -6, -7, -61, -112, -69, -61, -70, -72, -69, -83, -80, -103, -83, -70, -83, -77, -79, -66};
    }

    public ER(C0438Ea c0438Ea) {
        this.A00 = c0438Ea;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        DownloadAction[] downloadActionArrA03;
        if (C0601Ko.A02(this)) {
            return;
        }
        try {
            try {
                downloadActionArrA03 = this.A00.A09.A03(this.A00.A0E);
            } catch (Throwable th) {
                Log.e(A00(27, 15, 48), A00(0, 27, k.AppCompatTheme_windowFixedWidthMinor), th);
                downloadActionArrA03 = new DownloadAction[0];
            }
            this.A00.A07.post(new EQ(this, downloadActionArrA03));
        } catch (Throwable th2) {
            C0601Ko.A00(th2, this);
        }
    }
}

package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class ES implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ C0438Ea A00;
    public final /* synthetic */ DownloadAction[] A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 54);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{109, 70, 94, 71, 69, 70, 72, 77, 100, 72, 71, 72, 78, 76, 91, 36, 17, 6, 7, 29, 7, 0, 29, 26, 19, 84, 21, 23, 0, 29, 27, 26, 7, 84, 18, 21, 29, 24, 17, 16, 90};
    }

    public ES(C0438Ea c0438Ea, DownloadAction[] downloadActionArr) {
        this.A00 = c0438Ea;
        this.A01 = downloadActionArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            r6 = this;
            r2 = r6
            r0 = 0
            r5 = 0
            r0 = 0
            r4 = 0
            boolean r0 = com.facebook.ads.redexgen.X.C0601Ko.A02(r2)
            if (r0 == 0) goto L27
            r0 = 2
        Lc:
            switch(r0) {
                case 2: goto L40;
                case 3: goto L10;
                case 4: goto L15;
                case 5: goto Lf;
                case 6: goto Lf;
                case 7: goto Lf;
                case 8: goto Lf;
                case 9: goto L29;
                default: goto Lf;
            }
        Lf:
            goto Lc
        L10:
            com.facebook.ads.redexgen.X.ES r2 = (com.facebook.ads.redexgen.X.ES) r2
            r4 = r2
            r0 = 4
            goto Lc
        L15:
            com.facebook.ads.redexgen.X.ES r4 = (com.facebook.ads.redexgen.X.ES) r4     // Catch: java.io.IOException -> L23 java.lang.Throwable -> L42
            com.facebook.ads.redexgen.X.Ea r0 = r4.A00     // Catch: java.io.IOException -> L23 java.lang.Throwable -> L42
            com.facebook.ads.redexgen.X.EG r1 = com.facebook.ads.redexgen.X.C0438Ea.A01(r0)     // Catch: java.io.IOException -> L23 java.lang.Throwable -> L42
            com.facebook.ads.internal.exoplayer2.offline.DownloadAction[] r0 = r4.A01     // Catch: java.io.IOException -> L23 java.lang.Throwable -> L42
            r1.A02(r0)     // Catch: java.io.IOException -> L23 java.lang.Throwable -> L42
            goto L41
        L23:
            r5 = move-exception
            r0 = 9
            goto Lc
        L27:
            r0 = 3
            goto Lc
        L29:
            r2 = 0
            r1 = 15
            r0 = 31
            java.lang.String r3 = A00(r2, r1, r0)     // Catch: java.lang.Throwable -> L42
            r2 = 15
            r1 = 26
            r0 = 66
            java.lang.String r0 = A00(r2, r1, r0)     // Catch: java.lang.Throwable -> L42
            android.util.Log.e(r3, r0, r5)     // Catch: java.lang.Throwable -> L42
            goto L41
        L40:
            return
        L41:
            return
        L42:
            r0 = move-exception
            com.facebook.ads.redexgen.X.C0601Ko.A00(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ES.run():void");
    }
}

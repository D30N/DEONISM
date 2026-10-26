package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;

/* loaded from: assets/audience_network.dex */
public final class H3 extends AsyncTask<QI, Void, Q5> implements QF {
    public static byte[] A04;
    public Q7 A00;
    public C0488Gc A01;
    public Exception A02;
    public Executor A03;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 69);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A04 = new byte[]{-42, -30, -30, -34, -82, 0, -13, -1, 3, -13, 1, 2, -82, -12, -17, -9, -6, -13, -14, -56, -82, -77, 1, -29, 15, 15, 11, -69, 13, 0, 14, 11, 10, 9, 14, 0, -69, 4, 14, -69, 9, 16, 7, 7, -56, -37, -23, -26, -27, -28, -23, -37, -80, -106, -101, -38, -106, -98, -101, -23, -97, -80, Byte.MIN_VALUE, -101, -23, -71, -28, -67, -23, -23, -27, -57, -38, -26, -22, -38, -24, -23, -55, -42, -24, -32, -107, -23, -42, -32, -38, -24, -107, -38, -19, -42, -40, -23, -31, -18, -107, -28, -29, -38, -107, -42, -25, -36, -22, -30, -38, -29, -23, -107, -28, -37, -107, -23, -18, -27, -38, -107, -67, -23, -23, -27, -57, -38, -26, -22, -38, -24, -23};
    }

    public H3(C0488Gc c0488Gc, Q7 q7, Executor executor) {
        this.A01 = c0488Gc;
        this.A00 = q7;
        this.A03 = executor;
    }

    private final Q5 A00(QI... qiArr) throws Throwable {
        if (C0601Ko.A02(this)) {
            return null;
        }
        try {
            if (qiArr != null) {
                try {
                    if (qiArr.length > 0) {
                        Q5 q5A0I = this.A01.A0I(qiArr[0]);
                        if (q5A0I != null) {
                            String.format(Locale.US, A01(44, 21, 49), Integer.valueOf(q5A0I.A77()), q5A0I.getUrl(), q5A0I.A5U());
                        }
                        if (q5A0I != null) {
                            return q5A0I;
                        }
                        throw new IllegalStateException(A01(23, 21, 86));
                    }
                } catch (Exception e) {
                    this.A02 = e;
                    String.format(Locale.US, A01(0, 23, 73), e.getMessage());
                    cancel(true);
                    return null;
                }
            }
            throw new IllegalArgumentException(A01(65, 64, 48));
        } catch (Throwable th) {
            C0601Ko.A00(th, this);
            return null;
        }
    }

    private final void A03(Q5 q5) throws Throwable {
        H3 h3 = this;
        H3 h32 = null;
        char c2 = C0601Ko.A02(h3) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    h3 = h3;
                    h32 = h3;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        h32 = h32;
                        h32.A00.A9D(q5);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, h32);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.QF
    public final void A4z(QI qi) {
        super.executeOnExecutor(this.A03, qi);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.facebook.ads.redexgen.X.Q5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.ads.redexgen.X.Q5, java.lang.Object] */
    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Q5 doInBackground(QI[] qiArr) throws Throwable {
        H3 h3 = this;
        H3 h32 = null;
        char c2 = C0601Ko.A02(h3) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (Object) 0;
                case 3:
                    h3 = h3;
                    h32 = h3;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        return h32.A00(qiArr);
                    } catch (Throwable th) {
                        C0601Ko.A00(th, h32);
                        return (Object) 0;
                    }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.A00.A9Z(this.A02);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Q5 q5) throws Throwable {
        H3 h3 = this;
        H3 h32 = null;
        char c2 = C0601Ko.A02(h3) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    h3 = h3;
                    h32 = h3;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        h32.A03(q5);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, h32);
                        return;
                    }
            }
        }
    }
}

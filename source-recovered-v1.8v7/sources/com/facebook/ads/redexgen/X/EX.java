package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class EX implements Runnable {
    public static byte[] A08;
    public Thread A00;
    public Throwable A01;
    public final int A02;
    public final int A03;
    public final DownloadAction A04;
    public final C0438Ea A05;
    public volatile int A06;
    public volatile InterfaceC0442Ee A07;

    static {
        A0B();
    }

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 12);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0B() {
        A08 = new byte[]{-54, -41, -23, -31, -106, -33, -23, -106, -23, -22, -41, -24, -22, -37, -38, 100, 119, -123, 119, -122, 50, 119, -124, -124, -127, -124, 50, 117, -127, -121, Byte.MIN_VALUE, -122, 64, 50, 118, -127, -119, Byte.MIN_VALUE, 126, -127, 115, 118, 119, 118, 84, -117, -122, 119, -123, 50, 79, 50, -72, -29, -21, -30, -32, -29, -43, -40, -108, -39, -26, -26, -29, -26, -94, -108, -58, -39, -24, -26, -19, -108};
    }

    public EX(int i, C0438Ea c0438Ea, DownloadAction downloadAction, int i2) {
        this.A02 = i;
        this.A05 = c0438Ea;
        this.A04 = downloadAction;
        this.A06 = 0;
        this.A03 = i2;
    }

    public /* synthetic */ EX(int i, C0438Ea c0438Ea, DownloadAction downloadAction, int i2, EP ep) {
        this(i, c0438Ea, downloadAction, i2);
    }

    private final float A00() {
        EX ex = this;
        float fA62 = 0.0f;
        char c2 = ex.A07 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    ex = ex;
                    fA62 = ex.A07.A62();
                    c2 = 3;
                    break;
                case 3:
                    return fA62;
                case 4:
                    fA62 = -1.0f;
                    c2 = 3;
                    break;
            }
        }
    }

    private int A01() {
        int i = this.A06;
        char c2 = i != 5 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 6) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 7) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return this.A06;
                case 5:
                    return 1;
                case 6:
                    return 0;
            }
        }
    }

    private int A02(int i) {
        return Math.min((i - 1) * AdError.NETWORK_ERROR_CODE, 5000);
    }

    private final long A05() {
        EX ex = this;
        long jA63 = 0;
        char c2 = ex.A07 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    ex = ex;
                    jA63 = ex.A07.A63();
                    c2 = 3;
                    break;
                case 3:
                    return jA63;
                case 4:
                    jA63 = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        EX ex = this;
        char c2 = ex.A0F(0, 5) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    ex = ex;
                    ex.A05.A07.post(new EU(ex));
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    ex = ex;
                    if (!ex.A0F(1, 6)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    ex = ex;
                    ex.A09();
                    c2 = 3;
                    break;
            }
        }
    }

    private void A09() {
        if (this.A07 != null) {
            this.A07.cancel();
        }
        this.A00.interrupt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        if (A0F(0, 1)) {
            this.A00 = new Thread(this);
            this.A00.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0E() {
        boolean z = false;
        char c2 = this.A06 == 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0F(int i, int i2) {
        return A0G(i, i2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0G(int i, int i2, Throwable th) {
        EX ex = this;
        boolean z = false;
        boolean z2 = false;
        char c2 = ex.A06 != i ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    ex = ex;
                    th = th;
                    ex.A06 = i2;
                    ex.A01 = th;
                    z = true;
                    if (ex.A06 == ex.A01()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z2 = true;
                    c2 = 5;
                    break;
                case 5:
                    if (!z2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    ex = ex;
                    ex.A05.A0E(ex);
                    c2 = 7;
                    break;
                case 7:
                    return z;
            }
        }
    }

    public final EZ A0K() {
        return new EZ(this.A02, this.A04, A01(), A00(), A05(), this.A01, null);
    }

    public final boolean A0L() {
        EX ex = this;
        boolean z = true;
        char c2 = ex.A06 != 5 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    ex = ex;
                    if (ex.A06 == z) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ex = ex;
                    if (ex.A06 == 7) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    ex = ex;
                    if (ex.A06 != 6) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    public final boolean A0M() {
        EX ex = this;
        boolean z = false;
        char c2 = ex.A06 != 4 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    ex = ex;
                    if (ex.A06 == 2) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ex = ex;
                    if (ex.A06 != 3) {
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

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0601Ko.A02(this)) {
            return;
        }
        try {
            C0438Ea.A0J(A07(0, 15, 106), this);
            Throwable th = null;
            try {
                this.A07 = this.A04.A08(this.A05.A0A);
                if (this.A04.A03) {
                    this.A07.remove();
                } else {
                    int i = 0;
                    long j = -1;
                    while (!Thread.interrupted()) {
                        try {
                            this.A07.A4q();
                            break;
                        } catch (IOException e) {
                            long jA63 = this.A07.A63();
                            if (jA63 != j) {
                                C0438Ea.A0J(A07(15, 37, 6) + jA63, this);
                                j = jA63;
                                i = 0;
                            }
                            if (this.A06 == 1 && (i = i + 1) <= this.A03) {
                                C0438Ea.A0J(A07(52, 22, 104) + i, this);
                                long downloadedBytes = (long) A02(i);
                                Thread.sleep(downloadedBytes);
                            } else {
                                throw e;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            this.A05.A07.post(new EV(this, th));
        } catch (Throwable th3) {
            C0601Ko.A00(th3, this);
        }
    }

    public final String toString() {
        return super.toString();
    }
}

package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.redexgen.X.InterfaceC0527Hr;
import d.b.a.b.k;
import java.io.IOException;
import java.util.Arrays;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.facebook.ads.redexgen.X.Hq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class HandlerC0526Hq<T extends InterfaceC0527Hr> extends Handler implements Runnable {
    public static byte[] A0A;
    public int A00;

    @Nullable
    public InterfaceC0525Hp<T> A01;
    public IOException A02;
    public final int A03;
    public final long A04;
    public final T A05;
    public volatile Thread A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public final /* synthetic */ C1093bd A09;

    static {
        A04();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 99);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A0A = new byte[]{122, 65, 74, 87, 95, 74, 76, 91, 74, 75, 15, 74, 87, 76, 74, 95, 91, 70, 64, 65, 15, 67, 64, 78, 75, 70, 65, 72, 15, 92, 91, 93, 74, 78, 66, 58, 1, 10, 23, 31, 10, 12, 27, 10, 11, 79, 10, 29, 29, 0, 29, 79, 3, 0, 14, 11, 6, 1, 8, 79, 28, 27, 29, 10, 14, 2, 31, 28, 18, 23, 73, 4, 39, 41, 44, 28, 41, 59, 35, 98, 89, 82, 79, 71, 82, 84, 67, 82, 83, 23, 82, 79, 84, 82, 71, 67, 94, 88, 89, 23, 95, 86, 89, 83, 91, 94, 89, 80, 23, 91, 88, 86, 83, 23, 84, 88, 90, 71, 91, 82, 67, 82, 83, 27, 33, 32, 27, 50, 25, 49, 57, 59, 38, 45, 116, 49, 38, 38, 59, 38, 116, 56, 59, 53, 48, 61, 58, 51, 116, 39, 32, 38, 49, 53, 57};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hp != com.facebook.ads.internal.exoplayer2.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Hr> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hr> */
    public HandlerC0526Hq(C1093bd c1093bd, Looper looper, T loadable, InterfaceC0525Hp<T> interfaceC0525Hp, int i, long j) {
        super(looper);
        this.A09 = c1093bd;
        this.A05 = loadable;
        this.A01 = interfaceC0525Hp;
        this.A03 = i;
        this.A04 = j;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hr> */
    private long A00() {
        return Math.min((this.A00 - 1) * AdError.NETWORK_ERROR_CODE, 5000);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hr> */
    private void A02() {
        this.A02 = null;
        this.A09.A02.execute(this.A09.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hr> */
    private void A03() {
        this.A09.A00 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hr> */
    public final void A05(int i) throws IOException {
        HandlerC0526Hq<T> handlerC0526Hq = this;
        IOException iOException = handlerC0526Hq.A02;
        char c2 = iOException != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    handlerC0526Hq = handlerC0526Hq;
                    if (handlerC0526Hq.A00 > i) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    throw iOException;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hr> */
    public final void A06(long j) {
        HandlerC0526Hq<T> handlerC0526Hq = this;
        boolean z = false;
        char c2 = handlerC0526Hq.A09.A00 == null ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    handlerC0526Hq = handlerC0526Hq;
                    IJ.A04(z);
                    handlerC0526Hq.A09.A00 = handlerC0526Hq;
                    if (j <= 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    handlerC0526Hq = handlerC0526Hq;
                    handlerC0526Hq.sendEmptyMessageDelayed(0, j);
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    handlerC0526Hq = handlerC0526Hq;
                    handlerC0526Hq.A02();
                    c2 = 5;
                    break;
                case 7:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hr> */
    public final void A07(boolean z) {
        HandlerC0526Hq<T> handlerC0526Hq = this;
        handlerC0526Hq.A08 = z;
        handlerC0526Hq.A02 = null;
        char c2 = handlerC0526Hq.hasMessages(0) ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    handlerC0526Hq = handlerC0526Hq;
                    handlerC0526Hq.removeMessages(0);
                    if (!z) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    handlerC0526Hq = handlerC0526Hq;
                    handlerC0526Hq.sendEmptyMessage(1);
                    c2 = 4;
                    break;
                case 4:
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    handlerC0526Hq = handlerC0526Hq;
                    handlerC0526Hq.A03();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    handlerC0526Hq.A01.AA4(handlerC0526Hq.A05, jElapsedRealtime, jElapsedRealtime - handlerC0526Hq.A04, true);
                    handlerC0526Hq.A01 = null;
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    handlerC0526Hq = handlerC0526Hq;
                    handlerC0526Hq.A07 = true;
                    handlerC0526Hq.A05.A3x();
                    if (handlerC0526Hq.A06 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    handlerC0526Hq = handlerC0526Hq;
                    handlerC0526Hq.A06.interrupt();
                    c2 = 4;
                    break;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hr> */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (C0601Ko.A02(this)) {
            return;
        }
        try {
            if (this.A08) {
                return;
            }
            if (message.what == 0) {
                A02();
                return;
            }
            if (message.what != 4) {
                A03();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.A04;
                if (this.A07) {
                    this.A01.AA4(this.A05, jElapsedRealtime, j, false);
                    return;
                }
                int i = message.what;
                if (i == 1) {
                    this.A01.AA4(this.A05, jElapsedRealtime, j, false);
                    return;
                }
                if (i == 2) {
                    try {
                        this.A01.AA6(this.A05, jElapsedRealtime, j);
                        return;
                    } catch (RuntimeException e) {
                        Log.e(A01(71, 8, 43), A01(79, 44, 84), e);
                        this.A09.A01 = new C0531Hv(e);
                        return;
                    }
                }
                if (i != 3) {
                    return;
                }
                this.A02 = (IOException) message.obj;
                int iAA7 = this.A01.AA7(this.A05, jElapsedRealtime, j, this.A02);
                if (iAA7 != 3) {
                    if (iAA7 == 2) {
                        return;
                    }
                    this.A00 = iAA7 == 1 ? 1 : this.A00 + 1;
                    A06(A00());
                    return;
                }
                this.A09.A01 = this.A02;
                return;
            }
            throw ((Error) message.obj);
        } catch (Throwable th) {
            C0601Ko.A00(th, this);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hr> */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String strA01 = A01(71, 8, 43);
        if (C0601Ko.A02(this)) {
            return;
        }
        try {
            try {
                try {
                    try {
                        this.A06 = Thread.currentThread();
                        if (!this.A07) {
                            C0557Iv.A02(A01(66, 5, 16) + this.A05.getClass().getSimpleName());
                            try {
                                this.A05.A7r();
                            } finally {
                                C0557Iv.A00();
                            }
                        }
                        if (!this.A08) {
                            sendEmptyMessage(2);
                        }
                    } catch (Exception e) {
                        Log.e(strA01, A01(0, 35, 76), e);
                        if (!this.A08) {
                            obtainMessage(3, new C0531Hv(e)).sendToTarget();
                        }
                    }
                } catch (InterruptedException unused) {
                    IJ.A04(this.A07);
                    if (!this.A08) {
                        sendEmptyMessage(2);
                    }
                } catch (OutOfMemoryError e2) {
                    Log.e(strA01, A01(k.AppCompatTheme_windowMinWidthMinor, 32, 55), e2);
                    if (!this.A08) {
                        obtainMessage(3, new C0531Hv(e2)).sendToTarget();
                    }
                }
            } catch (IOException e3) {
                if (!this.A08) {
                    obtainMessage(3, e3).sendToTarget();
                }
            } catch (Error e4) {
                Log.e(strA01, A01(35, 31, 12), e4);
                if (!this.A08) {
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            }
        } catch (Throwable th) {
            C0601Ko.A00(th, this);
        }
    }
}

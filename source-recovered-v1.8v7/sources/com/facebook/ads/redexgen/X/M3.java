package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class M3 implements Executor {
    public static int A03;
    public static byte[] A04;
    public static final Executor A05;
    public static final Executor A06;
    public static final Executor A07;
    public static final Executor A08;
    public static final ExecutorService A09;
    public static final ExecutorService A0A;
    public static final ExecutorService A0B;
    public static final AtomicBoolean A0C;
    public static final AtomicBoolean A0D;

    @Nullable
    public Executor A00;
    public ThreadPoolExecutor A01;
    public final int A02;

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 110);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A04 = new byte[]{33, 51, 57, 46, 35, -9, -18, -3, 0, -8, -5, -12, -32, -34, -25, -34, -21, -30, -36, -78, -80, 33, 55, 72, 51, -18, 11, -18, -55, -42, -24, -32, -24, -107, -26, -22, -38, -22, -38, -107, -23, -28, -28, -107, -31, -28, -29, -36, -93};
    }

    static {
        A04();
        A07 = new M3(A00(5, 7, 59), 0);
        A05 = new M3(A00(0, 5, k.AppCompatTheme_viewInflaterClass), 0);
        A06 = new M3(A00(19, 2, 0), 0);
        A03 = 32;
        A0B = Executors.newSingleThreadExecutor();
        A0A = Executors.newFixedThreadPool(5);
        A0C = new AtomicBoolean();
        A0D = new AtomicBoolean();
        A09 = Executors.newCachedThreadPool(new M1());
        A08 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    @VisibleForTesting
    public M3(String str, int i) {
        this.A02 = i;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int KEEP_ALIVE_SECONDS = (iAvailableProcessors * 2) + 1;
        this.A01 = new ThreadPoolExecutor(Math.max(2, Math.min(iAvailableProcessors - 1, 4)), KEEP_ALIVE_SECONDS, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new M2(this, str));
        this.A01.allowCoreThreadTimeOut(true);
    }

    public static Executor A01() {
        if (A0D.get()) {
            return A09;
        }
        return A08;
    }

    public static ExecutorService A02() {
        if (A0C.get()) {
            return A09;
        }
        return A0A;
    }

    public static ExecutorService A03() {
        if (A0C.get()) {
            return A09;
        }
        return A0B;
    }

    public static void A05(Context context) {
        A0C.set(JQ.A1a(context));
        A0D.set(JQ.A1Z(context));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.A00 == null && Looper.myLooper() == Looper.getMainLooper()) {
            this.A00 = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        Executor executor = this.A00;
        if ((executor instanceof ThreadPoolExecutor) && ((ThreadPoolExecutor) executor).getQueue().size() < this.A02) {
            this.A00.execute(runnable);
            return;
        }
        int size = this.A01.getQueue().size();
        synchronized (M3.class) {
            int i = A03;
            int oldThreshold = A03;
            if (size == oldThreshold) {
                int oldThreshold2 = A03;
                A03 = oldThreshold2 * 2;
                XJ xjA00 = C8B.A00();
                if (xjA00 != null) {
                    xjA00.A04().A83(A00(12, 7, 11), C03008a.A1I, new C03018b(A00(28, 21, 7), A00(21, 7, 96) + i));
                }
            }
        }
        this.A01.execute(runnable);
    }
}

package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import com.facebook.ads.internal.checkerframework.checker.nullness.qual.MonotonicNonNull;
import com.facebook.ads.internal.exoplayer2.video.DummySurface;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class J4 extends HandlerThread implements Handler.Callback {
    public static byte[] A05;

    @MonotonicNonNull
    public Handler A00;

    @MonotonicNonNull
    public IT A01;

    @Nullable
    public DummySurface A02;

    @Nullable
    public Error A03;

    @Nullable
    public RuntimeException A04;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 77);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A05 = new byte[]{20, 51, 59, 62, 55, 54, 114, 38, 61, 114, 59, 60, 59, 38, 59, 51, 62, 59, 40, 55, 114, 54, 39, 63, 63, 43, 114, 33, 39, 32, 52, 51, 49, 55, 87, 112, 120, 125, 116, 117, 49, 101, 126, 49, 99, 116, 125, 116, 112, 98, 116, 49, 117, 100, 124, 124, 104, 49, 98, 100, 99, 119, 112, 114, 116, 101, 84, 76, 76, 88, 114, 84, 83, 71, 64, 66, 68, 110, Byte.MAX_VALUE, 103, 103, 115, 89, Byte.MAX_VALUE, 120, 108, 107, 105, 111};
    }

    public J4() {
        super(A00(77, 12, 71));
    }

    private void A01() throws Throwable {
        IJ.A01(this.A01);
        this.A01.A08();
    }

    private void A03(int i) {
        IJ.A01(this.A01);
        this.A01.A09(i);
        this.A02 = new DummySurface(this, this.A01.A07(), i != 0);
    }

    public final DummySurface A04(int i) {
        start();
        this.A00 = new Handler(getLooper(), this);
        this.A01 = new IT(this.A00);
        boolean z = false;
        synchronized (this) {
            this.A00.obtainMessage(1, i, 0).sendToTarget();
            while (this.A02 == null && this.A04 == null && this.A03 == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.A04;
        if (runtimeException == null) {
            Error error = this.A03;
            if (error == null) {
                return (DummySurface) IJ.A01(this.A02);
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void A05() {
        IJ.A01(this.A00);
        this.A00.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    A01();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                try {
                    A03(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    Log.e(A00(65, 12, 108), A00(0, 34, 31), e);
                    this.A03 = e;
                    synchronized (this) {
                        notify();
                    }
                }
            } catch (RuntimeException e2) {
                Log.e(A00(65, 12, 108), A00(0, 34, 31), e2);
                this.A04 = e2;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}

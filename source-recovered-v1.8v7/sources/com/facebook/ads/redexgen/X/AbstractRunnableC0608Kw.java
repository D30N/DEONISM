package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.support.annotation.Nullable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@SuppressLint({"CatchGeneralException"})
/* renamed from: com.facebook.ads.redexgen.X.Kw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractRunnableC0608Kw implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<InterfaceC0599Km> A04;

    @Nullable
    public final C0597Kk A00;

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 105);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{-44, -9, -16, -16, -29, -28, -18, -25, -94, -27, -12, -25, -29, -10, -25, -26, -80, -94, -42, -22, -12, -25, -29, -26, -68, -94};
    }

    public abstract void A06();

    static {
        A02();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public AbstractRunnableC0608Kw() {
        if (A03.get()) {
            this.A00 = L1.A01(new L0(A01(0, 26, 25) + Thread.currentThread().getName()));
            return;
        }
        this.A00 = null;
    }

    public static void A03(boolean z) {
        A03.set(z);
    }

    public static void A04(boolean z, InterfaceC0599Km interfaceC0599Km) {
        A02.set(z);
        A04.set(interfaceC0599Km);
    }

    @Nullable
    public final C0597Kk A05() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        AbstractRunnableC0608Kw abstractRunnableC0608Kw = this;
        Throwable th = null;
        AbstractRunnableC0608Kw abstractRunnableC0608Kw2 = null;
        char c2 = C0601Ko.A02(abstractRunnableC0608Kw) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    abstractRunnableC0608Kw = abstractRunnableC0608Kw;
                    abstractRunnableC0608Kw2 = abstractRunnableC0608Kw;
                    c2 = 4;
                    continue;
                case 4:
                    if (A03.get()) {
                        L1.A03(abstractRunnableC0608Kw2);
                    }
                    try {
                        abstractRunnableC0608Kw2.A06();
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    try {
                        if (A02.get()) {
                            c2 = '\r';
                        } else {
                            c2 = 25;
                            continue;
                        }
                    } catch (Throwable th3) {
                        C0601Ko.A00(th3, abstractRunnableC0608Kw2);
                        return;
                    }
                case '\r':
                    L3.A00().A7u(3301, th);
                    InterfaceC0599Km contextRepairHelper = A04.get();
                    if (contextRepairHelper != null) {
                        contextRepairHelper.ACX(th, abstractRunnableC0608Kw2);
                        break;
                    }
                    break;
                case 25:
                    throw th;
            }
        }
        if (A03.get()) {
            L1.A04(abstractRunnableC0608Kw2);
        }
    }
}

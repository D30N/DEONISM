package com.facebook.ads.redexgen.X;

import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.facebook.ads.redexgen.X.bd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1093bd implements InterfaceC0532Hw {
    public HandlerC0526Hq<? extends InterfaceC0527Hr> A00;
    public IOException A01;
    public final ExecutorService A02;

    public C1093bd(String str) {
        this.A02 = C0560Iy.A0W(str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hp != com.facebook.ads.internal.exoplayer2.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Hr> */
    public final <T extends InterfaceC0527Hr> long A04(T loadable, InterfaceC0525Hp<T> interfaceC0525Hp, int i) {
        Looper looperMyLooper = Looper.myLooper();
        IJ.A04(looperMyLooper != null);
        this.A01 = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC0526Hq(this, looperMyLooper, loadable, interfaceC0525Hp, i, jElapsedRealtime).A06(0L);
        return jElapsedRealtime;
    }

    public final void A05() {
        this.A00.A07(false);
    }

    public final void A06(int i) throws IOException {
        C1093bd c1093bd = this;
        int i2 = 0;
        HandlerC0526Hq<? extends InterfaceC0527Hr> handlerC0526Hq = null;
        IOException iOException = c1093bd.A01;
        char c2 = iOException == null ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    c1093bd = c1093bd;
                    handlerC0526Hq = c1093bd.A00;
                    if (handlerC0526Hq == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i != Integer.MIN_VALUE) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    handlerC0526Hq = handlerC0526Hq;
                    i2 = handlerC0526Hq.A03;
                    c2 = 5;
                    break;
                case 5:
                    handlerC0526Hq = handlerC0526Hq;
                    handlerC0526Hq.A05(i2);
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    i2 = i;
                    c2 = 5;
                    break;
                case '\b':
                    throw iOException;
            }
        }
    }

    public final void A07(@Nullable InterfaceC0528Hs interfaceC0528Hs) {
        C1093bd c1093bd = this;
        HandlerC0526Hq<? extends InterfaceC0527Hr> handlerC0526Hq = c1093bd.A00;
        char c2 = handlerC0526Hq != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    handlerC0526Hq = handlerC0526Hq;
                    handlerC0526Hq.A07(true);
                    c2 = 3;
                    break;
                case 3:
                    interfaceC0528Hs = interfaceC0528Hs;
                    if (interfaceC0528Hs == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1093bd = c1093bd;
                    interfaceC0528Hs = interfaceC0528Hs;
                    c1093bd.A02.execute(new RunnableC0529Ht(interfaceC0528Hs));
                    c2 = 5;
                    break;
                case 5:
                    c1093bd.A02.shutdown();
                    return;
            }
        }
    }

    public final boolean A08() {
        boolean z = false;
        char c2 = this.A00 != null ? (char) 2 : (char) 4;
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
}

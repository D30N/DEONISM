package com.facebook.ads.redexgen.X;

import android.support.annotation.VisibleForTesting;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Qa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0739Qa {

    @VisibleForTesting
    public static boolean A02 = false;
    public long A00 = 0;
    public final G4 A01;

    public C0739Qa(G4 g4) {
        this.A01 = g4;
        new Thread(new QZ(this)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        while (true) {
            synchronized (this) {
                if (this.A00 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    long jNanoTime = System.nanoTime();
                    if (jNanoTime < this.A00) {
                        int i = (int) ((this.A00 - jNanoTime) / 1000000);
                        if (i >= 1) {
                            try {
                                wait(i);
                            } catch (InterruptedException unused2) {
                            }
                        }
                    }
                    this.A00 = 0L;
                    this.A01.A08();
                    long jNanoTime2 = System.nanoTime();
                    synchronized (this) {
                        if (this.A00 < jNanoTime2) {
                            this.A00 = 0L;
                        }
                    }
                }
            }
        }
    }

    public final synchronized void A02() {
        this.A00 = System.nanoTime();
        notifyAll();
    }

    public final synchronized void A03(int i) {
        long jNanoTime = System.nanoTime() + (i * 1000000 * (A02 ? 1 : AdError.NETWORK_ERROR_CODE));
        long requestedNextSync = this.A00;
        if (requestedNextSync == 0 || this.A00 > jNanoTime) {
            this.A00 = jNanoTime;
            notifyAll();
        }
    }
}

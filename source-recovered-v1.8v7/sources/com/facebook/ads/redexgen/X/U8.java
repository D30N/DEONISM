package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: assets/audience_network.dex */
public final class U8 implements InterfaceC02545w {
    public EnumC02626e A00;
    public AnonymousClass72 A01;
    public AnonymousClass73 A02;
    public final C02525u A03;
    public final C6P A04;
    public final AtomicBoolean A05 = new AtomicBoolean();

    public U8(C02525u c02525u, C6P c6p) {
        this.A03 = c02525u;
        this.A04 = c6p;
    }

    private final synchronized void A04() {
        if (this.A02 != null && this.A05.get()) {
            this.A01.A01(this.A02);
            C02826y.A00().A04();
            this.A04.A02();
            this.A05.compareAndSet(true, false);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.ads.redexgen.X.73] */
    public final synchronized void A05(final EnumC02626e enumC02626e) {
        if (this.A05.get() || enumC02626e == null) {
            return;
        }
        if (this.A03.A0k() && AnonymousClass71.A0E(enumC02626e)) {
            this.A01 = new AnonymousClass72(C02826y.A00().A03().getLooper());
            this.A00 = enumC02626e;
            final Runnable runnable = new Runnable(enumC02626e) { // from class: com.facebook.ads.redexgen.X.5y
                public EnumC02626e A00;

                {
                    this.A00 = enumC02626e;
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    RunnableC02565y runnableC02565y = this;
                    RunnableC02565y runnableC02565y2 = null;
                    char c2 = C0601Ko.A02(runnableC02565y) ? (char) 2 : (char) 3;
                    while (true) {
                        switch (c2) {
                            case 2:
                                return;
                            case 3:
                                runnableC02565y = runnableC02565y;
                                runnableC02565y2 = runnableC02565y;
                                c2 = 4;
                                break;
                            case 4:
                                try {
                                    runnableC02565y2 = runnableC02565y2;
                                    runnableC02565y2.A01.A04.A04(EnumC02646g.A03, runnableC02565y2.A00, null);
                                    runnableC02565y2.A01.A01.A02(runnableC02565y2.A01.A02, TimeUnit.SECONDS.toMillis(runnableC02565y2.A01.A03.A0T()));
                                    return;
                                } catch (Throwable th) {
                                    C0601Ko.A00(th, runnableC02565y2);
                                    return;
                                }
                        }
                    }
                }
            };
            this.A02 = new Runnable(runnable) { // from class: com.facebook.ads.redexgen.X.73
                public final Runnable A00;

                {
                    this.A00 = runnable;
                }

                @Override // java.lang.Runnable
                @SuppressLint({"CatchGeneralException"})
                public final void run() throws Throwable {
                    AnonymousClass73 anonymousClass73 = this;
                    Throwable t = null;
                    AnonymousClass73 anonymousClass732 = null;
                    char c2 = C0601Ko.A02(anonymousClass73) ? (char) 2 : (char) 3;
                    while (true) {
                        switch (c2) {
                            case 2:
                                return;
                            case 3:
                                anonymousClass73 = anonymousClass73;
                                anonymousClass732 = anonymousClass73;
                                c2 = 4;
                                break;
                            case 4:
                                try {
                                    anonymousClass732 = anonymousClass732;
                                    anonymousClass732.A00.run();
                                    return;
                                } catch (Throwable th) {
                                    t = th;
                                    c2 = 7;
                                    break;
                                }
                            case 7:
                                try {
                                    AnonymousClass66.A03(t);
                                    return;
                                } catch (Throwable th2) {
                                    C0601Ko.A00(th2, anonymousClass732);
                                    return;
                                }
                        }
                    }
                }
            };
            this.A04.A03(enumC02626e);
            this.A01.A00(this.A02);
            this.A05.compareAndSet(false, true);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02545w
    public final synchronized void ADj(EnumC02626e enumC02626e) {
        if (this.A00 == enumC02626e) {
            return;
        }
        this.A00 = enumC02626e;
        if (enumC02626e == EnumC02626e.A04) {
            A04();
        } else {
            A05(enumC02626e);
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.6w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02806w {
    public int A00;
    public final Context A01;
    public final C02525u A02;
    public final InterfaceC02776t A03;
    public final InterfaceC02786u A04;
    public final Set<C02586a> A05 = new HashSet();

    public C02806w(Context context, C02525u c02525u) {
        this.A02 = c02525u;
        this.A01 = context;
        this.A04 = c02525u.A0c();
        this.A03 = c02525u.A0b();
    }

    @Nullable
    private C02746q A00() {
        C02806w c02806w = this;
        Context context = null;
        String packageName = null;
        char c2 = c02806w.A02.A0a() == EnumC02656h.A0F ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (C02746q) null;
                case 3:
                    c02806w = c02806w;
                    context = c02806w.A01;
                    if (context != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    packageName = "";
                    c2 = 5;
                    break;
                case 5:
                    return new C02746q(packageName);
                case 6:
                    context = context;
                    packageName = context.getPackageName();
                    c2 = 5;
                    break;
            }
        }
    }

    @SuppressLint({"CatchGeneralException"})
    private void A01(long j) {
        AbstractC02766s signalValueTypeDef;
        try {
            JSONObject jSONObject = new JSONObject();
            for (C02586a c02586a : this.A05) {
                InterfaceC02616d interfaceC02616dA01 = c02586a.A01();
                if (interfaceC02616dA01 == null) {
                    signalValueTypeDef = new X3(SystemClock.elapsedRealtime(), A00(), new C02736p(EnumC02726o.A03));
                } else {
                    try {
                        signalValueTypeDef = interfaceC02616dA01.A50();
                    } catch (Throwable th) {
                        signalValueTypeDef = AnonymousClass71.A04(this.A01.getPackageName(), th);
                    }
                }
                jSONObject.put(Integer.toString(c02586a.A00()), signalValueTypeDef.A09(false));
            }
            AnonymousClass71.A05();
        } catch (Throwable t) {
            AnonymousClass66.A03(t);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    private void A02(long j) {
        try {
            this.A02.A0j().schedule(new Runnable() { // from class: com.facebook.ads.redexgen.X.6v
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    RunnableC02796v runnableC02796v = this;
                    RunnableC02796v runnableC02796v2 = null;
                    char c2 = C0601Ko.A02(runnableC02796v) ? (char) 2 : (char) 3;
                    while (true) {
                        switch (c2) {
                            case 2:
                                return;
                            case 3:
                                runnableC02796v = runnableC02796v;
                                runnableC02796v2 = runnableC02796v;
                                c2 = 4;
                                break;
                            case 4:
                                try {
                                    runnableC02796v2 = runnableC02796v2;
                                    runnableC02796v2.A00.A03();
                                    return;
                                } catch (Throwable th) {
                                    C0601Ko.A00(th, runnableC02796v2);
                                    return;
                                }
                        }
                    }
                }
            }, j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            AnonymousClass66.A03(th);
        }
    }

    @SuppressLint({"BadMethodUse-java.lang.System.currentTimeMillis"})
    public final void A03() {
        C02806w c02806w = this;
        long jCurrentTimeMillis = 0;
        char c2 = c02806w.A02.A0W() <= 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c02806w = c02806w;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - c02806w.A04.getLastPeriodicCollectionTimeMs() < c02806w.A02.A0W()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c02806w = c02806w;
                    c02806w.A01(jCurrentTimeMillis);
                    c02806w.A02(c02806w.A02.A0W());
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c02806w = c02806w;
                    c02806w.A02(Math.abs(jCurrentTimeMillis - (c02806w.A04.getLastPeriodicCollectionTimeMs() + c02806w.A02.A0W())));
                    c2 = 5;
                    break;
            }
        }
    }

    public final void A04(int i) {
        this.A00 = i;
    }

    public final void A05(C02586a c02586a) {
        this.A05.add(c02586a);
    }
}

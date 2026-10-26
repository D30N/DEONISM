package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6Q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C6Q {
    public final Context A00;
    public final C02525u A01;

    public C6Q(Context context, C02525u c02525u) {
        this.A00 = context;
        this.A01 = c02525u;
    }

    private int A00(C02525u c02525u, C02586a c02586a) {
        char c2 = c02525u.A0e(c02586a.A00()) != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return c02525u.A0e(c02586a.A00()).intValue();
                case 3:
                    c02586a = c02586a;
                    if (!c02586a.A03().contains(EnumC02656h.A0A)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return c02525u.A0S();
                case 5:
                    c02586a = c02586a;
                    if (!c02586a.A03().contains(EnumC02656h.A07)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return c02525u.A0R();
                case 7:
                    return c02525u.A0V();
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5z != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    @SuppressLint({"CatchGeneralException"})
    public final synchronized void A01(EnumC02626e enumC02626e, List<C02586a> list) {
        AbstractC02766s abstractC02766sA04;
        Map<Integer, C02575z<AbstractC02766s>> mapA03 = C02636f.A01().A03();
        for (C02586a c02586a : list) {
            InterfaceC02616d signalExecutor = c02586a.A02(enumC02626e);
            if (signalExecutor != null) {
                try {
                    abstractC02766sA04 = signalExecutor.A50();
                } catch (Throwable th) {
                    abstractC02766sA04 = AnonymousClass71.A04(this.A00.getPackageName(), th);
                }
                if (abstractC02766sA04 != null && abstractC02766sA04.A07() != null) {
                    if (c02586a.A03().contains(EnumC02656h.A0A) && mapA03.containsKey(Integer.valueOf(c02586a.A00()))) {
                        C02575z<AbstractC02766s> c02575z = mapA03.get(Integer.valueOf(c02586a.A00()));
                        AbstractC02766s abstractC02766sA02 = c02575z != null ? c02575z.A02() : null;
                        if (c02575z == null) {
                            c02575z = new C02575z<>(A00(this.A01, c02586a));
                        }
                        if (abstractC02766sA02 == null || !abstractC02766sA04.A0B(abstractC02766sA02, c02586a.A03())) {
                            c02575z.A04(abstractC02766sA04);
                            C02636f.A01().A04(c02586a.A00(), c02575z, abstractC02766sA04.A05());
                        }
                    } else {
                        C02575z<AbstractC02766s> c02575z2 = new C02575z<>(A00(this.A01, c02586a));
                        c02575z2.A04(abstractC02766sA04);
                        C02636f.A01().A04(c02586a.A00(), c02575z2, abstractC02766sA04.A05());
                    }
                }
            }
        }
    }
}

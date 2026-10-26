package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Message;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.6A, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6A {

    @Nullable
    public static C6A A07;
    public static final AtomicBoolean A08 = new AtomicBoolean();
    public AnonymousClass69 A00 = new AnonymousClass69(this, C02826y.A00().A03().getLooper());
    public C6J A01;
    public C6K A02;
    public List<C6N> A03;
    public final Context A04;
    public final C02525u A05;
    public final EnumC02656h A06;

    public C6A(C02525u c02525u, Context context) {
        this.A05 = c02525u;
        this.A04 = context;
        this.A06 = c02525u.A0a();
    }

    public static synchronized C6A A00(Context context, C02525u c02525u) {
        if (A07 == null) {
            A07 = new C6A(c02525u, context);
        }
        return A07;
    }

    private synchronized void A02() {
        A08.set(false);
        this.A03 = new ArrayList();
    }

    public final synchronized void A03() {
        if (this.A01 != null) {
            this.A01.A03(this.A03);
        }
        A02();
    }

    public final synchronized void A04(Map<Integer, C02586a> map, EnumC02626e enumC02626e) {
        A02();
        C6E c6e = new C6E(this.A05, map);
        for (Map.Entry<Integer, C02586a> entry : map.entrySet()) {
            C02586a bdSignal = entry.getValue();
            if (bdSignal != null && bdSignal.A04(enumC02626e)) {
                int iIntValue = entry.getKey().intValue();
                if (iIntValue != 10800) {
                    switch (iIntValue) {
                        case 10810:
                            this.A03.add(C6N.A03);
                            break;
                        case 10811:
                            this.A03.add(C6N.A07);
                            break;
                        case 10812:
                            this.A03.add(C6N.A09);
                            break;
                        case 10813:
                            this.A03.add(C6N.A06);
                            break;
                        case 10814:
                            this.A03.add(C6N.A0A);
                            break;
                        case 10815:
                            this.A03.add(C6N.A0B);
                            break;
                        case 10816:
                            this.A03.add(C6N.A0D);
                            break;
                        case 10817:
                            this.A03.add(C6N.A08);
                            break;
                        case 10818:
                            this.A03.add(C6N.A05);
                            break;
                        case 10819:
                            this.A03.add(C6N.A04);
                            break;
                        case 10820:
                            this.A03.add(C6N.A0C);
                            break;
                    }
                } else {
                    this.A02 = new C6K(this.A04, c6e, this.A06);
                    A08.set(true);
                }
            }
        }
        this.A01 = new C6J(this.A04, c6e, this.A06);
        this.A01.A02(this.A03);
        if (!this.A00.getLooper().getThread().isAlive()) {
            this.A00 = new AnonymousClass69(this, C02826y.A00().A03().getLooper());
        }
    }

    public final synchronized boolean A05(MotionEvent motionEvent) {
        if (!A08.get()) {
            return false;
        }
        Message message = new Message();
        message.what = AnonymousClass68.A02.ordinal();
        message.obj = motionEvent;
        this.A00.sendMessage(message);
        return true;
    }
}

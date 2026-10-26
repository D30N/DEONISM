package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Ad, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0354Ad {
    public C0355Ae A01;
    public C0355Ae A02;
    public boolean A03;
    public final ArrayList<C0355Ae> A05 = new ArrayList<>();
    public final AZ A04 = new AZ();
    public AbstractC0352Ab A00 = AbstractC0352Ab.A00;

    private C0355Ae A00(C0355Ae c0355Ae, AbstractC0352Ab abstractC0352Ab) {
        C0354Ad c0354Ad = this;
        int iA04 = 0;
        char c2 = !abstractC0352Ab.A0E() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0354Ad = c0354Ad;
                    if (!c0354Ad.A00.A0E()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return c0355Ae;
                case 4:
                    c0354Ad = c0354Ad;
                    c0355Ae = c0355Ae;
                    abstractC0352Ab = abstractC0352Ab;
                    iA04 = abstractC0352Ab.A04(c0354Ad.A00.A0A(c0355Ae.A01.A02, c0354Ad.A04, true).A03);
                    if (iA04 != -1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return c0355Ae;
                case 6:
                    return new C0355Ae(abstractC0352Ab.A09(iA04, c0354Ad.A04).A00, c0355Ae.A01.A00(iA04));
            }
        }
    }

    private void A02() {
        if (!this.A05.isEmpty()) {
            this.A01 = this.A05.get(0);
        }
    }

    @Nullable
    public final C0355Ae A03() {
        return this.A01;
    }

    @Nullable
    public final C0355Ae A04() {
        C0354Ad c0354Ad = this;
        C0355Ae c0355Ae = null;
        char c2 = c0354Ad.A05.isEmpty() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0355Ae = null;
                    c2 = 3;
                    break;
                case 3:
                    return c0355Ae;
                case 4:
                    c0354Ad = c0354Ad;
                    c0355Ae = c0354Ad.A05.get(r1.size() - 1);
                    c2 = 3;
                    break;
            }
        }
    }

    @Nullable
    public final C0355Ae A05() {
        C0354Ad c0354Ad = this;
        C0355Ae c0355Ae = null;
        char c2 = !c0354Ad.A05.isEmpty() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0354Ad = c0354Ad;
                    if (!c0354Ad.A00.A0E()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c0354Ad = c0354Ad;
                    if (!c0354Ad.A03) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0355Ae = null;
                    c2 = 5;
                    break;
                case 5:
                    return c0355Ae;
                case 6:
                    c0354Ad = c0354Ad;
                    c0355Ae = c0354Ad.A05.get(0);
                    c2 = 5;
                    break;
            }
        }
    }

    @Nullable
    public final C0355Ae A06() {
        return this.A02;
    }

    @Nullable
    public final F8 A07(int i) {
        C0354Ad c0354Ad = this;
        C0355Ae mediaPeriod = null;
        int i2 = 0;
        int i3 = 0;
        int iA00 = 0;
        F8 f8 = null;
        AbstractC0352Ab abstractC0352Ab = c0354Ad.A00;
        int periodIndex = abstractC0352Ab != null ? 2 : 10;
        while (true) {
            switch (periodIndex) {
                case 2:
                    abstractC0352Ab = abstractC0352Ab;
                    iA00 = abstractC0352Ab.A00();
                    i2 = 0;
                    periodIndex = 3;
                    break;
                case 3:
                    c0354Ad = c0354Ad;
                    if (i2 >= c0354Ad.A05.size()) {
                        periodIndex = 10;
                        break;
                    } else {
                        periodIndex = 4;
                        break;
                    }
                case 4:
                    c0354Ad = c0354Ad;
                    mediaPeriod = c0354Ad.A05.get(i2);
                    i3 = mediaPeriod.A01.A02;
                    if (i3 >= iA00) {
                        periodIndex = 9;
                        break;
                    } else {
                        periodIndex = 5;
                        break;
                    }
                case 5:
                    c0354Ad = c0354Ad;
                    if (c0354Ad.A00.A09(i3, c0354Ad.A04).A00 != i) {
                        periodIndex = 9;
                        break;
                    } else {
                        periodIndex = 6;
                        break;
                    }
                case 6:
                    if (f8 == null) {
                        periodIndex = 8;
                        break;
                    } else {
                        periodIndex = 7;
                        break;
                    }
                case 7:
                    return (F8) null;
                case 8:
                    mediaPeriod = mediaPeriod;
                    f8 = mediaPeriod.A01;
                    periodIndex = 9;
                    break;
                case 9:
                    i2++;
                    periodIndex = 3;
                    break;
                case 10:
                    return f8;
            }
        }
    }

    public final void A08() {
        this.A03 = false;
        A02();
    }

    public final void A09() {
        this.A03 = true;
    }

    public final void A0A(int i) {
        A02();
    }

    public final void A0B(int i, F8 f8) {
        C0354Ad c0354Ad = this;
        c0354Ad.A05.add(new C0355Ae(i, f8));
        char c2 = c0354Ad.A05.size() == 1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0354Ad = c0354Ad;
                    if (!c0354Ad.A00.A0E()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c0354Ad = c0354Ad;
                    c0354Ad.A02();
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A0C(int i, F8 f8) {
        C0354Ad c0354Ad = this;
        C0355Ae c0355Ae = null;
        C0355Ae c0355Ae2 = new C0355Ae(i, f8);
        c0354Ad.A05.remove(c0355Ae2);
        char c2 = c0355Ae2.equals(c0354Ad.A02) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0354Ad = c0354Ad;
                    if (!c0354Ad.A05.isEmpty()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0355Ae = null;
                    c2 = 4;
                    break;
                case 4:
                    c0354Ad = c0354Ad;
                    c0354Ad.A02 = c0355Ae;
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c0354Ad = c0354Ad;
                    c0355Ae = c0354Ad.A05.get(0);
                    c2 = 4;
                    break;
            }
        }
    }

    public final void A0D(int i, F8 f8) {
        this.A02 = new C0355Ae(i, f8);
    }

    public final void A0E(AbstractC0352Ab abstractC0352Ab) {
        C0354Ad c0354Ad = this;
        C0355Ae c0355Ae = null;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0354Ad = c0354Ad;
                    if (i >= c0354Ad.A05.size()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0354Ad = c0354Ad;
                    abstractC0352Ab = abstractC0352Ab;
                    ArrayList<C0355Ae> arrayList = c0354Ad.A05;
                    arrayList.set(i, c0354Ad.A00(arrayList.get(i), abstractC0352Ab));
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    c0354Ad = c0354Ad;
                    c0355Ae = c0354Ad.A02;
                    if (c0355Ae == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0354Ad = c0354Ad;
                    abstractC0352Ab = abstractC0352Ab;
                    c0355Ae = c0355Ae;
                    c0354Ad.A02 = c0354Ad.A00(c0355Ae, abstractC0352Ab);
                    c2 = 6;
                    break;
                case 6:
                    C0354Ad c0354Ad2 = c0354Ad;
                    c0354Ad2.A00 = abstractC0352Ab;
                    c0354Ad2.A02();
                    return;
            }
        }
    }

    public final boolean A0F() {
        return this.A03;
    }
}

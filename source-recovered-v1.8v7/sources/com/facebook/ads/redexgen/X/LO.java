package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.support.annotation.VisibleForTesting;

/* loaded from: assets/audience_network.dex */
public final class LO {
    public float A00;
    public boolean A01;
    public boolean A02;
    public final Handler A03;
    public final LN A04;

    public LO(int i, LN ln) {
        this(i, ln, new Handler());
    }

    @VisibleForTesting
    public LO(int i, LN ln, Handler handler) {
        this.A02 = false;
        this.A00 = i;
        this.A04 = ln;
        this.A03 = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        LO lo = this;
        lo.A00 -= 0.25f;
        lo.A04.AAh(lo.A00);
        char c2 = lo.A00 <= 0.0f ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    lo = lo;
                    if (!lo.A01) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    lo = lo;
                    lo.A01 = true;
                    lo.A04.A9E();
                    lo.A02 = false;
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final float A03() {
        return this.A00;
    }

    public final boolean A04() {
        boolean z = false;
        char c2 = this.A00 <= 0.0f ? (char) 2 : (char) 4;
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

    public final boolean A05() {
        return this.A02;
    }

    public final boolean A06() {
        if (!A05()) {
            return false;
        }
        this.A02 = false;
        return true;
    }

    public final boolean A07() {
        LO lo = this;
        char c2 = lo.A04() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    lo = lo;
                    if (!lo.A01) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    lo = lo;
                    lo.A01 = true;
                    lo.A04.A9E();
                    c2 = 4;
                    break;
                case 4:
                    lo = lo;
                    if (!lo.A04()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    lo = lo;
                    if (!lo.A05()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return false;
                case 7:
                    LO lo2 = lo;
                    lo2.A02 = true;
                    lo2.A04.AAh(lo2.A00);
                    lo2.A03.postDelayed(new C1156ch(lo2), 250L);
                    return true;
            }
        }
    }
}

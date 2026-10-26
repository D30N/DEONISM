package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.support.annotation.Nullable;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class KC implements PD {

    @Nullable
    public C0755Qq A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final LM A07 = new LM() { // from class: com.facebook.ads.redexgen.X.7q
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9C
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C02977v c02977v) {
            this.A00.A05.removeCallbacksAndMessages(null);
            if (this.A00.A0D(PX.A04)) {
                this.A00.A03();
                this.A00.A06(true, false);
            }
            this.A00.A03 = true;
        }
    };
    public final AbstractC0644Mh A06 = new AbstractC0644Mh() { // from class: com.facebook.ads.redexgen.X.7o
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9C
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C02987x c02987x) {
            this.A00.A03();
            this.A00.A06(false, false);
            this.A00.A03 = true;
        }
    };
    public final AbstractC0604Ks A08 = new C02937n(this);
    public final AbstractC0598Kl A09 = new AbstractC0598Kl() { // from class: com.facebook.ads.redexgen.X.7m
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9C
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C02967u c02967u) {
            C02927m c02927m = this;
            char c2 = !c02927m.A00.A02 ? (char) 2 : (char) 4;
            while (true) {
                switch (c2) {
                    case 2:
                        c02927m = c02927m;
                        if (!c02927m.A00.A0D(PX.A04)) {
                            c2 = 4;
                            break;
                        } else {
                            c2 = 3;
                            break;
                        }
                    case 3:
                        c02927m = c02927m;
                        c02927m.A00.A03();
                        c02927m.A00.A06(true, false);
                        c2 = 4;
                        break;
                    case 4:
                        return;
                }
            }
        }
    };
    public final KR A0A = new C7l(this);
    public final Handler A05 = new Handler();
    public final List<PY> A0B = new ArrayList();
    public int A00 = AdError.SERVER_ERROR_CODE;

    public KC(boolean z) {
        this.A02 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        this.A05.removeCallbacksAndMessages(null);
        Iterator<PY> it = this.A0B.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    it = it;
                    PY animation = it.next();
                    animation.cancel();
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(boolean z, boolean z2) {
        Iterator<PY> it = this.A0B.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    it = it;
                    it.next().A3N(z, z2);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0D(PX px) {
        Iterator<PY> it = this.A0B.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    px = px;
                    it = it;
                    if (it.next().A74() == px) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    return true;
            }
        }
    }

    public final void A0E() {
        this.A0B.clear();
    }

    public final void A0F() {
        if (this.A02) {
            this.A05.removeCallbacksAndMessages(null);
            this.A02 = false;
        }
    }

    public final void A0G() {
        this.A04 = true;
        this.A03 = true;
        A06(false, false);
    }

    public final void A0H(int i) {
        this.A00 = i;
    }

    public final void A0I(PY py) {
        this.A0B.add(py);
    }

    public final boolean A0J() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.PD
    public final void A7t(C0755Qq c0755Qq) {
        this.A01 = c0755Qq;
        c0755Qq.getEventBus().A03(this.A07, this.A0A, this.A08, this.A09, this.A06);
    }

    @Override // com.facebook.ads.redexgen.X.PD
    public final void ADf(C0755Qq c0755Qq) {
        A03();
        c0755Qq.getEventBus().A04(this.A06, this.A0A, this.A08, this.A09, this.A07);
        this.A01 = null;
    }
}

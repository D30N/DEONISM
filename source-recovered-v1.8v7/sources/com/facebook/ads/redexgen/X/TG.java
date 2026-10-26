package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: assets/audience_network.dex */
public final class TG extends C2Z {
    public final C2Z A00 = new TF(this);
    public final C0452Eq A01;

    public TG(C0452Eq c0452Eq) {
        this.A01 = c0452Eq;
    }

    @Override // com.facebook.ads.redexgen.X.C2Z
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        TG tg = this;
        C0452Eq c0452Eq = null;
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C0452Eq.class.getName());
        char c2 = view instanceof C0452Eq ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    tg = tg;
                    if (!tg.A0B()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 3:
                    view = view;
                    c0452Eq = (C0452Eq) view;
                    if (c0452Eq.getLayoutManager() == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    accessibilityEvent = accessibilityEvent;
                    c0452Eq = c0452Eq;
                    c0452Eq.getLayoutManager().A1x(accessibilityEvent);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2Z
    public final void A08(View view, C3K c3k) {
        TG tg = this;
        super.A08(view, c3k);
        c3k.A0O(C0452Eq.class.getName());
        char c2 = !tg.A0B() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    tg = tg;
                    if (tg.A01.getLayoutManager() == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    tg = tg;
                    c3k = c3k;
                    tg.A01.getLayoutManager().A1F(c3k);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2Z
    public final boolean A09(View view, int i, Bundle bundle) {
        TG tg = this;
        char c2 = super.A09(view, i, bundle) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return true;
                case 3:
                    tg = tg;
                    if (!tg.A0B()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 4:
                    tg = tg;
                    if (tg.A01.getLayoutManager() == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return tg.A01.getLayoutManager().A1Z(i, bundle);
                case 6:
                    return false;
            }
        }
    }

    public final C2Z A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1r();
    }
}

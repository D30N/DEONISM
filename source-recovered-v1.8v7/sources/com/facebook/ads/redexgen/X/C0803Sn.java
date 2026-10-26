package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.Sn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0803Sn extends C2Z {
    public final /* synthetic */ AnonymousClass39 A00;

    public C0803Sn(AnonymousClass39 anonymousClass39) {
        this.A00 = anonymousClass39;
    }

    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    private boolean A00() {
        C0803Sn c0803Sn = this;
        ?? r1 = 1;
        char c2 = c0803Sn.A00.A01 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0803Sn = c0803Sn;
                    if (c0803Sn.A00.A01.A05() <= r1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return r1;
                case 4:
                    r1 = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2Z
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        C0803Sn c0803Sn = this;
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(AnonymousClass39.class.getName());
        accessibilityEvent.setScrollable(c0803Sn.A00());
        char c2 = accessibilityEvent.getEventType() == 4096 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0803Sn = c0803Sn;
                    if (c0803Sn.A00.A01 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0803Sn = c0803Sn;
                    accessibilityEvent = accessibilityEvent;
                    accessibilityEvent.setItemCount(c0803Sn.A00.A01.A05());
                    accessibilityEvent.setFromIndex(c0803Sn.A00.A00);
                    accessibilityEvent.setToIndex(c0803Sn.A00.A00);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2Z
    public final void A08(View view, C3K c3k) {
        C0803Sn c0803Sn = this;
        super.A08(view, c3k);
        c3k.A0O(AnonymousClass39.class.getName());
        c3k.A0R(c0803Sn.A00());
        char c2 = c0803Sn.A00.canScrollHorizontally(1) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c3k = c3k;
                    c3k.A0N(4096);
                    c2 = 3;
                    break;
                case 3:
                    c0803Sn = c0803Sn;
                    if (!c0803Sn.A00.canScrollHorizontally(-1)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c3k = c3k;
                    c3k.A0N(8192);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2Z
    public final boolean A09(View view, int i, Bundle bundle) {
        C0803Sn c0803Sn = this;
        char c2 = super.A09(view, i, bundle) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return true;
                case 3:
                    if (i == 4096) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 8192) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    c0803Sn = c0803Sn;
                    if (!c0803Sn.A00.canScrollHorizontally(-1)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    AnonymousClass39 anonymousClass39 = c0803Sn.A00;
                    anonymousClass39.setCurrentItem(anonymousClass39.A00 - 1);
                    return true;
                case '\b':
                    return false;
                case '\t':
                    c0803Sn = c0803Sn;
                    if (!c0803Sn.A00.canScrollHorizontally(1)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    AnonymousClass39 anonymousClass392 = c0803Sn.A00;
                    anonymousClass392.setCurrentItem(anonymousClass392.A00 + 1);
                    return true;
                case 11:
                    return false;
            }
        }
    }
}

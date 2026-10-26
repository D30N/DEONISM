package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.We, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0896We implements InterfaceC02616d {
    public final /* synthetic */ C0907Wp A00;

    public C0896We(C0907Wp c0907Wp) {
        this.A00 = c0907Wp;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    @SuppressLint({"MissingPermission"})
    public final AbstractC02766s A50() {
        C0896We c0896We = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = Build.VERSION.SDK_INT < 17 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return c0896We.A00.A07(EnumC02726o.A04);
                case 3:
                    if (!AnonymousClass71.A0D()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (!AnonymousClass71.A0C()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return c0896We.A00.A07(EnumC02726o.A06);
                case 6:
                    c0896We = c0896We;
                    if (c0896We.A00.A00 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0896We = c0896We;
                    C0907Wp c0907Wp = c0896We.A00;
                    abstractC02766sA07 = c0907Wp.A04(C0907Wp.A01(c0907Wp.A00.getAllCellInfo().get(0)));
                    c2 = '\b';
                    break;
                case '\b':
                    return abstractC02766sA07;
                case '\t':
                    c0896We = c0896We;
                    abstractC02766sA07 = c0896We.A00.A07(EnumC02726o.A06);
                    c2 = '\b';
                    break;
            }
        }
    }
}

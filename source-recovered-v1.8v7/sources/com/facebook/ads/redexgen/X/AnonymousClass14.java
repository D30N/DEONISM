package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.14, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass14 extends BroadcastReceiver {
    public AbstractC0782Rr A00;
    public AnonymousClass13 A01;
    public String A02;

    public AnonymousClass14(String str, AbstractC0782Rr abstractC0782Rr, AnonymousClass13 anonymousClass13) {
        this.A00 = abstractC0782Rr;
        this.A01 = anonymousClass13;
        this.A02 = str;
    }

    public final IntentFilter A00() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PE.A06.A03(this.A02));
        intentFilter.addAction(PE.A09.A03(this.A02));
        intentFilter.addAction(PE.A04.A03(this.A02));
        intentFilter.addAction(PE.A0A.A03(this.A02));
        intentFilter.addAction(PE.A05.A03(this.A02));
        intentFilter.addAction(PE.A0C.A03(this.A02));
        intentFilter.addAction(PE.A0B.A03(this.A02));
        intentFilter.addAction(PE.A03.A03(this.A02));
        return intentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AnonymousClass14 anonymousClass14 = this;
        String action = intent.getAction();
        char c2 = PE.A06.A03(anonymousClass14.A02).equals(action) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass14 = anonymousClass14;
                    anonymousClass14.A01.AAw(anonymousClass14.A00);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    anonymousClass14 = anonymousClass14;
                    action = action;
                    if (!PE.A09.A03(anonymousClass14.A02).equals(action)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    context = context;
                    if (!JQ.A12(context)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    anonymousClass14 = anonymousClass14;
                    anonymousClass14.A01.AAx(anonymousClass14.A00, AdError.AD_PRESENTATION_ERROR);
                    c2 = 3;
                    break;
                case 7:
                    anonymousClass14 = anonymousClass14;
                    anonymousClass14.A01.AAx(anonymousClass14.A00, AdError.INTERNAL_ERROR);
                    c2 = 3;
                    break;
                case '\b':
                    anonymousClass14 = anonymousClass14;
                    action = action;
                    if (!PE.A04.A03(anonymousClass14.A02).equals(action)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    anonymousClass14 = anonymousClass14;
                    anonymousClass14.A01.AAt(anonymousClass14.A00);
                    c2 = 3;
                    break;
                case '\n':
                    anonymousClass14 = anonymousClass14;
                    action = action;
                    if (!PE.A0A.A03(anonymousClass14.A02).equals(action)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    anonymousClass14 = anonymousClass14;
                    anonymousClass14.A01.AAv(anonymousClass14.A00);
                    c2 = 3;
                    break;
                case '\f':
                    anonymousClass14 = anonymousClass14;
                    action = action;
                    if (!PE.A05.A03(anonymousClass14.A02).equals(action)) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    anonymousClass14 = anonymousClass14;
                    anonymousClass14.A01.onRewardedVideoClosed();
                    c2 = 3;
                    break;
                case 14:
                    anonymousClass14 = anonymousClass14;
                    action = action;
                    if (!PE.A0B.A03(anonymousClass14.A02).equals(action)) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    anonymousClass14 = anonymousClass14;
                    anonymousClass14.A01.AAr(anonymousClass14.A00);
                    c2 = 3;
                    break;
                case 16:
                    anonymousClass14 = anonymousClass14;
                    action = action;
                    if (!PE.A0C.A03(anonymousClass14.A02).equals(action)) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    anonymousClass14 = anonymousClass14;
                    anonymousClass14.A01.AAs(anonymousClass14.A00);
                    c2 = 3;
                    break;
                case 18:
                    anonymousClass14 = anonymousClass14;
                    action = action;
                    if (!PE.A03.A03(anonymousClass14.A02).equals(action)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    anonymousClass14 = anonymousClass14;
                    anonymousClass14.A01.onRewardedVideoActivityDestroyed();
                    c2 = 3;
                    break;
            }
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.88, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass88 extends AbstractC0633Lw {
    public final /* synthetic */ AnonymousClass85 A00;

    public AnonymousClass88(AnonymousClass85 anonymousClass85) {
        this.A00 = anonymousClass85;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9C
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0643Mg c0643Mg) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0690Oc(this));
    }
}

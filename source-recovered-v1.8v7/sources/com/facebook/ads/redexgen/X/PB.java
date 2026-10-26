package com.facebook.ads.redexgen.X;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public final class PB extends ContentObserver {
    public final C0654Ms A00;

    public PB(Handler handler, C0654Ms c0654Ms) {
        super(handler);
        this.A00 = c0654Ms;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.A00.A0Y();
    }
}

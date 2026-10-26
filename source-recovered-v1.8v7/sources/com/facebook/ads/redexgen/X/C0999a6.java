package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.a6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0999a6 implements InterfaceC0442Ee {
    public final C0520Hi A00;
    public final I3 A01;
    public final C1104bo A02;
    public final C0548Im A04;
    public final I8 A03 = new I8();
    public final AtomicBoolean A05 = new AtomicBoolean();

    public C0999a6(Uri uri, String str, C0443Ef c0443Ef) {
        this.A00 = new C0520Hi(uri, 0L, -1L, str, 0);
        this.A01 = c0443Ef.A00();
        this.A02 = c0443Ef.A01(false);
        this.A04 = c0443Ef.A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0442Ee
    public final void A4q() throws InterruptedException, IOException {
        this.A04.A00(-1000);
        try {
            I9.A03(this.A00, this.A01, this.A02, new byte[131072], this.A04, -1000, this.A03, this.A05, true);
        } finally {
            this.A04.A03(-1000);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0442Ee
    public final float A62() {
        C0999a6 c0999a6 = this;
        float fA00 = 0.0f;
        long j = c0999a6.A03.A01;
        char c2 = j == -1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    fA00 = -1.0f;
                    c2 = 3;
                    break;
                case 3:
                    return fA00;
                case 4:
                    c0999a6 = c0999a6;
                    fA00 = (c0999a6.A03.A00() * 100.0f) / j;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0442Ee
    public final long A63() {
        return this.A03.A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0442Ee
    public final void cancel() {
        this.A05.set(true);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0442Ee
    public final void remove() {
        I9.A05(this.A01, I9.A02(this.A00));
    }
}

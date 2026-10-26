package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Hn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0523Hn extends IOException {
    public final int A00;
    public final C0520Hi A01;

    public C0523Hn(IOException iOException, C0520Hi c0520Hi, int i) {
        super(iOException);
        this.A01 = c0520Hi;
        this.A00 = i;
    }

    public C0523Hn(String str, C0520Hi c0520Hi, int i) {
        super(str);
        this.A01 = c0520Hi;
        this.A00 = i;
    }

    public C0523Hn(String str, IOException iOException, C0520Hi c0520Hi, int i) {
        super(str, iOException);
        this.A01 = c0520Hi;
        this.A00 = i;
    }
}

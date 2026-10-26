package com.facebook.ads.redexgen.X;

import java.io.ByteArrayInputStream;

/* loaded from: assets/audience_network.dex */
public final class RD implements C0L {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public RD(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void ABV(int i) throws RE {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i);
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void close() throws RE {
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final int length() throws RE {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final int read(byte[] bArr) throws RE {
        return this.A00.read(bArr, 0, bArr.length);
    }
}

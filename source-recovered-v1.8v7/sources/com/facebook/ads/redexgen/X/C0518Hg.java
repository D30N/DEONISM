package com.facebook.ads.redexgen.X;

import android.support.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.ads.redexgen.X.Hg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0518Hg extends InputStream {
    public long A00;
    public final InterfaceC0516He A03;
    public final C0520Hi A04;
    public boolean A02 = false;
    public boolean A01 = false;
    public final byte[] A05 = new byte[1];

    public C0518Hg(InterfaceC0516He interfaceC0516He, C0520Hi c0520Hi) {
        this.A03 = interfaceC0516He;
        this.A04 = c0520Hi;
    }

    private void A00() throws IOException {
        if (!this.A02) {
            this.A03.ABU(this.A04);
            this.A02 = true;
        }
    }

    public final long A01() {
        return this.A00;
    }

    public final void A02() throws IOException {
        A00();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.A01) {
            this.A03.close();
            this.A01 = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (read(this.A05) == -1) {
            return -1;
        }
        return this.A05[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(@NonNull byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        IJ.A04(!this.A01);
        A00();
        int i3 = this.A03.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.A00 += i3;
        return i3;
    }
}

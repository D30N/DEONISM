package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.bj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1099bj implements InterfaceC0516He {
    public long A00;
    public boolean A01;
    public final InterfaceC0514Hc A02;
    public final InterfaceC0516He A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final long ABU(C0520Hi c0520Hi) throws IOException {
        this.A00 = this.A03.ABU(c0520Hi);
        if (this.A00 == 0) {
            return 0L;
        }
        if (c0520Hi.A02 == -1 && this.A00 != -1) {
            c0520Hi = new C0520Hi(c0520Hi.A04, c0520Hi.A01, c0520Hi.A03, this.A00, c0520Hi.A05, c0520Hi.A00);
        }
        this.A01 = true;
        this.A02.ABW(c0520Hi);
        return this.A00;
    }

    public C1099bj(InterfaceC0516He interfaceC0516He, InterfaceC0514Hc interfaceC0514Hc) {
        this.A03 = (InterfaceC0516He) IJ.A01(interfaceC0516He);
        this.A02 = (InterfaceC0514Hc) IJ.A01(interfaceC0514Hc);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final Uri A7F() {
        return this.A03.A7F();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final void close() throws Throwable {
        C1099bj c1099bj = this;
        Throwable th = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c1099bj = c1099bj;
                        c1099bj.A03.close();
                        if (!c1099bj.A01) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 5;
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (!c1099bj.A01) {
                            c2 = '\t';
                            break;
                        } else {
                            c2 = '\b';
                            break;
                        }
                    }
                case 5:
                    c1099bj = c1099bj;
                    c1099bj.A01 = false;
                    c1099bj.A02.close();
                    c2 = 6;
                    break;
                case 6:
                    return;
                case '\b':
                    c1099bj = c1099bj;
                    c1099bj.A01 = false;
                    c1099bj.A02.close();
                    c2 = '\t';
                    break;
                case '\t':
                    throw th;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C1099bj c1099bj = this;
        long j = 0;
        int i3 = 0;
        char c2 = c1099bj.A00 == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return -1;
                case 3:
                    c1099bj = c1099bj;
                    bArr = bArr;
                    i3 = c1099bj.A03.read(bArr, i, i2);
                    if (i3 <= 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1099bj = c1099bj;
                    bArr = bArr;
                    c1099bj.A02.write(bArr, i, i3);
                    j = c1099bj.A00;
                    if (j == -1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1099bj = c1099bj;
                    c1099bj.A00 = j - i3;
                    c2 = 6;
                    break;
                case 6:
                    return i3;
            }
        }
    }
}

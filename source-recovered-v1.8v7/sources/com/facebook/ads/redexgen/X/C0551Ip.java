package com.facebook.ads.redexgen.X;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* renamed from: com.facebook.ads.redexgen.X.Ip, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0551Ip extends BufferedOutputStream {
    public boolean A00;

    public C0551Ip(OutputStream outputStream) {
        super(outputStream);
    }

    public C0551Ip(OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    public final void A00(OutputStream outputStream) {
        IJ.A04(this.A00);
        this.out = outputStream;
        this.count = 0;
        this.A00 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        C0551Ip c0551Ip = this;
        c0551Ip.A00 = true;
        Throwable th = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0551Ip = c0551Ip;
                        c0551Ip.flush();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        c0551Ip.out.close();
                    } catch (Throwable e) {
                        if (th == null) {
                            th = e;
                        }
                    }
                    if (th == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    C0560Iy.A0b(th);
                    c2 = '\n';
                    break;
                case '\n':
                    return;
            }
        }
    }
}

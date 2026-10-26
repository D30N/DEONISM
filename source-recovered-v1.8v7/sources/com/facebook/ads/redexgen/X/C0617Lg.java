package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.io.Writer;

/* renamed from: com.facebook.ads.redexgen.X.Lg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0617Lg extends Writer {
    public int A00;
    public char[] A01 = new char[1024];
    public final InterfaceC0616Lf A02;

    public C0617Lg(InterfaceC0616Lf interfaceC0616Lf) {
        this.A02 = interfaceC0616Lf;
    }

    private void A00() {
        this.A02.ABs(new String(this.A01, 0, this.A00));
        this.A00 = 0;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        flush();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        if (this.A00 > 0) {
            A00();
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        C0617Lg c0617Lg = this;
        char[] cArr2 = null;
        int i3 = 0;
        int i4 = i;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i4 >= i + i2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    cArr = cArr;
                    if (cArr[i4] == '\n') {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0617Lg = c0617Lg;
                    i3 = c0617Lg.A00;
                    cArr2 = c0617Lg.A01;
                    if (i3 != cArr2.length) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0617Lg = c0617Lg;
                    c0617Lg.A00();
                    c2 = 6;
                    break;
                case 6:
                    i4++;
                    c2 = 2;
                    break;
                case 7:
                    c0617Lg = c0617Lg;
                    cArr = cArr;
                    cArr2 = cArr2;
                    cArr2[i3] = cArr[i4];
                    c0617Lg.A00 = i3 + 1;
                    c2 = 6;
                    break;
                case '\b':
                    return;
            }
        }
    }
}

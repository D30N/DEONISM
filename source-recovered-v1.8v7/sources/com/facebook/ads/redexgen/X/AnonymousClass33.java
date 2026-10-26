package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.33, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass33 extends EN implements Handler.Callback {
    public int A00;
    public int A01;
    public Format A02;
    public InterfaceC1056b2 A03;
    public BX A04;
    public BP A05;
    public BP A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final A9 A0A;
    public final InterfaceC0486Ga A0B;
    public final InterfaceC0487Gb A0C;

    public AnonymousClass33(InterfaceC0487Gb interfaceC0487Gb, Looper looper) {
        this(interfaceC0487Gb, looper, InterfaceC0486Ga.A00);
    }

    public AnonymousClass33(InterfaceC0487Gb interfaceC0487Gb, Looper looper, InterfaceC0486Ga interfaceC0486Ga) {
        super(3);
        this.A0C = (InterfaceC0487Gb) IJ.A01(interfaceC0487Gb);
        this.A09 = looper == null ? null : new Handler(looper, this);
        this.A0B = interfaceC0486Ga;
        this.A0A = new A9();
    }

    private long A00() {
        AnonymousClass33 anonymousClass33 = this;
        long jA6E = 0;
        int i = anonymousClass33.A01;
        char c2 = i != -1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass33 = anonymousClass33;
                    if (i < anonymousClass33.A06.A6F()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    jA6E = Long.MAX_VALUE;
                    c2 = 4;
                    break;
                case 4:
                    return jA6E;
                case 5:
                    anonymousClass33 = anonymousClass33;
                    jA6E = anonymousClass33.A06.A6E(anonymousClass33.A01);
                    c2 = 4;
                    break;
            }
        }
    }

    private void A01() {
        A06(Collections.emptyList());
    }

    private void A02() {
        AnonymousClass33 anonymousClass33 = this;
        BP bp = null;
        anonymousClass33.A04 = null;
        anonymousClass33.A01 = -1;
        BP bp2 = anonymousClass33.A06;
        char c2 = bp2 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass33 = anonymousClass33;
                    bp2 = bp2;
                    bp2.A08();
                    anonymousClass33.A06 = null;
                    c2 = 3;
                    break;
                case 3:
                    anonymousClass33 = anonymousClass33;
                    bp = anonymousClass33.A05;
                    if (bp == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass33 = anonymousClass33;
                    bp = bp;
                    bp.A08();
                    anonymousClass33.A05 = null;
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    private void A03() {
        A02();
        this.A03.ACJ();
        this.A03 = null;
        this.A00 = 0;
    }

    private void A04() {
        A03();
        this.A03 = this.A0B.A4F(this.A02);
    }

    private void A05(List<GX> list) {
        this.A0C.A9J(list);
    }

    private void A06(List<GX> list) {
        AnonymousClass33 anonymousClass33 = this;
        Handler handler = anonymousClass33.A09;
        char c2 = handler != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    list = list;
                    handler = handler;
                    handler.obtainMessage(0, list).sendToTarget();
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    anonymousClass33 = anonymousClass33;
                    list = list;
                    anonymousClass33.A05(list);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.EN
    public final void A12() {
        this.A02 = null;
        A01();
        A03();
    }

    @Override // com.facebook.ads.redexgen.X.EN
    public final void A15(long j, boolean z) {
        AnonymousClass33 anonymousClass33 = this;
        anonymousClass33.A01();
        anonymousClass33.A07 = false;
        anonymousClass33.A08 = false;
        char c2 = anonymousClass33.A00 != 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass33 = anonymousClass33;
                    anonymousClass33.A04();
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    anonymousClass33 = anonymousClass33;
                    anonymousClass33.A02();
                    anonymousClass33.A03.flush();
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.EN
    public final void A17(Format[] formatArr, long j) throws C03479w {
        AnonymousClass33 anonymousClass33 = this;
        anonymousClass33.A02 = formatArr[0];
        char c2 = anonymousClass33.A03 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass33 = anonymousClass33;
                    anonymousClass33.A00 = 1;
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    anonymousClass33 = anonymousClass33;
                    anonymousClass33.A03 = anonymousClass33.A0B.A4F(anonymousClass33.A02);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public final boolean A7c() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public final boolean A7k() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b3 A[SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.YC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ACW(long r17, long r19) throws com.facebook.ads.redexgen.X.C03479w {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass33.ACW(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.X.AU
    public final int ADX(Format format) {
        int i = 0;
        char c2 = this.A0B.ADY(format) ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    format = format;
                    if (!EN.A0x(null, format.A0H)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i = 4;
                    c2 = 4;
                    break;
                case 4:
                    return i;
                case 5:
                    i = 2;
                    c2 = 4;
                    break;
                case 6:
                    format = format;
                    if (!C0537Ib.A0C(format.A0O)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return 1;
                case '\b':
                    return 0;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            A05((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
}

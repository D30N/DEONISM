package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3J, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3J extends EN implements Handler.Callback {
    public int A00;
    public int A01;
    public InterfaceC0429Dq A02;
    public boolean A03;
    public final Handler A04;
    public final A9 A05;
    public final Ds A06;
    public final C0420Dd A07;
    public final InterfaceC0431Dt A08;
    public final long[] A09;
    public final Metadata[] A0A;

    public C3J(InterfaceC0431Dt interfaceC0431Dt, Looper looper) {
        this(interfaceC0431Dt, looper, Ds.A00);
    }

    public C3J(InterfaceC0431Dt interfaceC0431Dt, Looper looper, Ds ds) {
        super(4);
        this.A08 = (InterfaceC0431Dt) IJ.A01(interfaceC0431Dt);
        this.A04 = looper == null ? null : new Handler(looper, this);
        this.A06 = (Ds) IJ.A01(ds);
        this.A05 = new A9();
        this.A07 = new C0420Dd();
        this.A0A = new Metadata[5];
        this.A09 = new long[5];
    }

    private void A00() {
        Arrays.fill(this.A0A, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
    }

    private void A01(Metadata metadata) {
        C3J c3j = this;
        Handler handler = c3j.A04;
        char c2 = handler != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    metadata = metadata;
                    handler = handler;
                    handler.obtainMessage(0, metadata).sendToTarget();
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c3j = c3j;
                    metadata = metadata;
                    c3j.A02(metadata);
                    c2 = 3;
                    break;
            }
        }
    }

    private void A02(Metadata metadata) {
        this.A08.AAJ(metadata);
    }

    @Override // com.facebook.ads.redexgen.X.EN
    public final void A12() {
        A00();
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.X.EN
    public final void A15(long j, boolean z) {
        A00();
        this.A03 = false;
    }

    @Override // com.facebook.ads.redexgen.X.EN
    public final void A17(Format[] formatArr, long j) throws C03479w {
        this.A02 = this.A06.A4E(formatArr[0]);
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public final boolean A7c() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public final boolean A7k() {
        return true;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Path cross not found for [B:25:0x00a5, B:6:0x0013], limit reached: 48 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x002d A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a9 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ab -> B:11:0x002d). Please report as a decompilation issue!!! */
    @Override // com.facebook.ads.redexgen.X.YC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ACW(long r9, long r11) throws com.facebook.ads.redexgen.X.C03479w {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3J.ACW(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.X.AU
    public final int ADX(Format format) {
        int i = 0;
        char c2 = this.A06.ADY(format) ? (char) 2 : (char) 6;
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
                    return 0;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            A02((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
}

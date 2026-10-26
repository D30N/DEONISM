package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.support.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;

/* renamed from: com.facebook.ads.redexgen.X.bo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1104bo implements InterfaceC0516He {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public Uri A06;
    public InterfaceC0516He A07;
    public I7 A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC0516He A0D;
    public final InterfaceC0516He A0E;
    public final InterfaceC0516He A0F;
    public final I3 A0G;

    @Nullable
    public final I5 A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public C1104bo(I3 i3, InterfaceC0516He interfaceC0516He, InterfaceC0516He interfaceC0516He2, InterfaceC0514Hc interfaceC0514Hc, int i, @Nullable I5 i5) {
        this.A0G = i3;
        this.A0D = interfaceC0516He2;
        this.A0I = (i & 1) != 0;
        this.A0K = (i & 2) != 0;
        this.A0J = (i & 4) != 0;
        this.A0F = interfaceC0516He;
        if (interfaceC0514Hc != null) {
            this.A0E = new C1099bj(interfaceC0516He, interfaceC0514Hc);
        } else {
            this.A0E = null;
        }
        this.A0H = i5;
    }

    private int A00(C0520Hi c0520Hi) {
        C1104bo c1104bo = this;
        char c2 = c1104bo.A0K ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1104bo = c1104bo;
                    if (!c1104bo.A0C) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return 0;
                case 4:
                    c1104bo = c1104bo;
                    if (!c1104bo.A0J) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0520Hi = c0520Hi;
                    if (c0520Hi.A02 != -1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return 1;
                case 7:
                    return -1;
            }
        }
    }

    public static Uri A01(I3 i3, String str, Uri uri) {
        Uri uri2 = null;
        Uri uriA01 = IE.A01(i3.A5o(str));
        char c2 = uriA01 == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    uri = uri;
                    uri2 = uri;
                    c2 = 3;
                    break;
                case 3:
                    return uri2;
                case 4:
                    uriA01 = uriA01;
                    uri2 = uriA01;
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.facebook.ads.redexgen.X.He, com.facebook.ads.redexgen.X.I7] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    private void A02() throws Throwable {
        C1104bo c1104bo = this;
        Throwable th = null;
        I7 i7 = null;
        boolean z = false;
        ?? r3 = 0;
        I7 i72 = null;
        InterfaceC0516He interfaceC0516He = c1104bo.A07;
        char c2 = interfaceC0516He == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    z = false;
                    r3 = 0;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        interfaceC0516He = interfaceC0516He;
                        interfaceC0516He.close();
                        c1104bo.A07 = r3;
                        c1104bo.A0A = z;
                        i72 = c1104bo.A08;
                        if (i72 == null) {
                            c2 = 7;
                            break;
                        } else {
                            c2 = 6;
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c1104bo.A07 = r3;
                        c1104bo.A0A = z;
                        i7 = c1104bo.A08;
                        if (i7 == null) {
                            c2 = '\n';
                            break;
                        } else {
                            c2 = '\t';
                            break;
                        }
                    }
                case 6:
                    c1104bo = c1104bo;
                    i72 = i72;
                    c1104bo.A0G.ACN(i72);
                    c1104bo.A08 = r3;
                    c2 = 7;
                    break;
                case 7:
                    return;
                case '\t':
                    c1104bo = c1104bo;
                    i7 = i7;
                    c1104bo.A0G.ACN(i7);
                    c1104bo.A08 = r3;
                    c2 = '\n';
                    break;
                case '\n':
                    throw th;
            }
        }
    }

    private void A03() {
        C1104bo c1104bo = this;
        long j = 0;
        char c2 = c1104bo.A0H != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1104bo = c1104bo;
                    j = 0;
                    if (c1104bo.A04 <= 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1104bo = c1104bo;
                    c1104bo.A0G.A5Z();
                    c1104bo.A04 = j;
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A04() throws IOException {
        this.A01 = 0L;
        if (A0A()) {
            this.A0G.AD0(this.A09, this.A03);
        }
    }

    private void A05(IOException iOException) {
        C1104bo c1104bo = this;
        char c2 = !c1104bo.A08() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    iOException = iOException;
                    if (!(iOException instanceof I1)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1104bo = c1104bo;
                    c1104bo.A0C = true;
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A06(boolean z) throws IOException {
        I7 i7ADQ;
        long jMin;
        C0520Hi c0520Hi;
        InterfaceC0516He nextDataSource;
        long j;
        if (this.A0B) {
            i7ADQ = null;
        } else if (this.A0I) {
            try {
                i7ADQ = this.A0G.ADQ(this.A09, this.A03);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            i7ADQ = this.A0G.ADR(this.A09, this.A03);
        }
        if (i7ADQ == null) {
            nextDataSource = this.A0F;
            c0520Hi = new C0520Hi(this.A06, this.A03, this.A01, this.A09, this.A00);
        } else if (i7ADQ.A05) {
            Uri uriFromFile = Uri.fromFile(i7ADQ.A03);
            long j2 = this.A03 - i7ADQ.A02;
            long filePosition = i7ADQ.A01 - j2;
            long j3 = this.A01;
            if (j3 != -1) {
                filePosition = Math.min(filePosition, j3);
            }
            c0520Hi = new C0520Hi(uriFromFile, this.A03, j2, filePosition, this.A09, this.A00);
            nextDataSource = this.A0D;
        } else {
            if (i7ADQ.A02()) {
                jMin = this.A01;
            } else {
                jMin = i7ADQ.A01;
                long j4 = this.A01;
                if (j4 != -1) {
                    jMin = Math.min(jMin, j4);
                }
            }
            c0520Hi = new C0520Hi(this.A06, this.A03, jMin, this.A09, this.A00);
            if (this.A0E != null) {
                nextDataSource = this.A0E;
            } else {
                nextDataSource = this.A0F;
                this.A0G.ACN(i7ADQ);
                i7ADQ = null;
            }
        }
        if (!this.A0B && nextDataSource == this.A0F) {
            j = this.A03 + 102400;
        } else {
            j = Long.MAX_VALUE;
        }
        this.A02 = j;
        if (z) {
            IJ.A04(A07());
            if (nextDataSource == this.A0F) {
                return;
            }
            try {
                A02();
            } catch (Throwable th) {
                if (i7ADQ.A01()) {
                    this.A0G.ACN(i7ADQ);
                }
                throw th;
            }
        }
        if (i7ADQ != null && i7ADQ.A01()) {
            this.A08 = i7ADQ;
        }
        this.A07 = nextDataSource;
        this.A0A = c0520Hi.A02 == -1;
        long jABU = nextDataSource.ABU(c0520Hi);
        IF r5 = new IF();
        if (this.A0A && jABU != -1) {
            this.A01 = jABU;
            long length = this.A03;
            IE.A05(r5, length + this.A01);
        }
        if (A09()) {
            this.A05 = this.A07.A7F();
            if (true ^ this.A06.equals(this.A05)) {
                IE.A06(r5, this.A05);
            } else {
                IE.A04(r5);
            }
        }
        if (A0A()) {
            this.A0G.A3P(this.A09, r5);
        }
    }

    private boolean A07() {
        boolean z = false;
        char c2 = this.A07 == this.A0F ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    private boolean A08() {
        boolean z = false;
        char c2 = this.A07 == this.A0D ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    private boolean A09() {
        return !A08();
    }

    private boolean A0A() {
        boolean z = false;
        char c2 = this.A07 == this.A0E ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public static boolean A0B(IOException iOException) {
        int reason = 2;
        while (true) {
            switch (reason) {
                case 2:
                    iOException = (Throwable) iOException;
                    if (iOException == 0) {
                        reason = 7;
                        break;
                    } else {
                        reason = 3;
                        break;
                    }
                case 3:
                    iOException = (Throwable) iOException;
                    if (!(iOException instanceof C0517Hf)) {
                        reason = 6;
                        break;
                    } else {
                        reason = 4;
                        break;
                    }
                case 4:
                    iOException = (Throwable) iOException;
                    int reason2 = ((C0517Hf) iOException).A00;
                    if (reason2 != 0) {
                        reason = 6;
                        break;
                    } else {
                        reason = 5;
                        break;
                    }
                case 5:
                    return true;
                case 6:
                    iOException = ((Throwable) iOException).getCause();
                    reason = 2;
                    break;
                case 7:
                    return false;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final Uri A7F() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final long ABU(C0520Hi c0520Hi) throws IOException {
        try {
            this.A09 = I9.A02(c0520Hi);
            this.A06 = c0520Hi.A04;
            this.A05 = A01(this.A0G, this.A09, this.A06);
            this.A00 = c0520Hi.A00;
            this.A03 = c0520Hi.A03;
            this.A0B = A00(c0520Hi) != -1;
            boolean z = this.A0B;
            if (c0520Hi.A02 != -1 || this.A0B) {
                this.A01 = c0520Hi.A02;
            } else {
                this.A01 = this.A0G.A5n(this.A09);
                if (this.A01 != -1) {
                    this.A01 -= c0520Hi.A03;
                    if (this.A01 <= 0) {
                        throw new C0517Hf(0);
                    }
                }
            }
            A06(false);
            return this.A01;
        } catch (IOException e) {
            A05(e);
            throw e;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final void close() throws Throwable {
        this.A06 = null;
        this.A05 = null;
        A03();
        try {
            A02();
        } catch (IOException e) {
            A05(e);
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c5, code lost:
    
        return r4;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r18, int r19, int r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1104bo.read(byte[], int, int):int");
    }
}

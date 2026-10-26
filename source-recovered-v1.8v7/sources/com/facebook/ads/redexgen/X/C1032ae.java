package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.Format;

/* renamed from: com.facebook.ads.redexgen.X.ae, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1032ae implements CE {
    public CL A00;
    public InterfaceC0483Fx A01;
    public boolean A02;
    public Format[] A03;
    public final CC A04;
    public final int A05;
    public final SparseArray<C1031ad> A06 = new SparseArray<>();
    public final Format A07;

    public C1032ae(CC cc, int i, Format format) {
        this.A04 = cc;
        this.A05 = i;
        this.A07 = format;
    }

    public final CL A00() {
        return this.A00;
    }

    public final void A01(InterfaceC0483Fx interfaceC0483Fx, long j) {
        C1032ae c1032ae = this;
        int i = 0;
        CC cc = null;
        long j2 = 0;
        c1032ae.A01 = interfaceC0483Fx;
        char c2 = !c1032ae.A02 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c1032ae = c1032ae;
                    c1032ae.A04.A7T(c1032ae);
                    if (j == -9223372036854775807L) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1032ae = c1032ae;
                    c1032ae.A04.ACp(0L, j);
                    c2 = 4;
                    break;
                case 4:
                    c1032ae = c1032ae;
                    c1032ae.A02 = true;
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c1032ae = c1032ae;
                    cc = c1032ae.A04;
                    if (j != -9223372036854775807L) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    j2 = 0;
                    c2 = '\b';
                    break;
                case '\b':
                    cc = cc;
                    cc.ACp(0L, j2);
                    i = 0;
                    c2 = '\t';
                    break;
                case '\t':
                    c1032ae = c1032ae;
                    if (i >= c1032ae.A06.size()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c1032ae = c1032ae;
                    interfaceC0483Fx = interfaceC0483Fx;
                    c1032ae.A06.valueAt(i).A00(interfaceC0483Fx);
                    i++;
                    c2 = '\t';
                    break;
                case 11:
                    j2 = j;
                    c2 = '\b';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CE
    public final void A4w() {
        C1032ae c1032ae = this;
        Format[] formatArr = new Format[c1032ae.A06.size()];
        int i = 0;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    c1032ae = c1032ae;
                    int i3 = c1032ae.A06.size();
                    if (i >= i3) {
                        i2 = 4;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    c1032ae = c1032ae;
                    formatArr = formatArr;
                    formatArr[i] = c1032ae.A06.valueAt(i).A00;
                    i++;
                    i2 = 2;
                    break;
                case 4:
                    c1032ae.A03 = formatArr;
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CE
    public final void ACq(CL cl) {
        this.A00 = cl;
    }

    @Override // com.facebook.ads.redexgen.X.CE
    public final CO ADd(int i, int i2) {
        C1031ad c1031ad = this.A06.get(i);
        if (c1031ad == null) {
            IJ.A04(this.A03 == null);
            c1031ad = new C1031ad(i, i2, i2 == this.A05 ? this.A07 : null);
            c1031ad.A00(this.A01);
            this.A06.put(i, c1031ad);
        }
        return c1031ad;
    }
}

package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.aD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1005aD implements FA {
    public YA A00;
    public AbstractC0352Ab A01;
    public Object A02;
    public final ArrayList<F9> A04 = new ArrayList<>(1);
    public final FL A03 = new FL();

    public abstract void A02();

    public abstract void A03(YA ya, boolean z);

    public final FL A00(@Nullable F8 f8) {
        return this.A03.A02(0, f8, 0L);
    }

    public final void A01(AbstractC0352Ab abstractC0352Ab, @Nullable Object obj) {
        AbstractC1005aD abstractC1005aD = this;
        abstractC1005aD.A01 = abstractC0352Ab;
        abstractC1005aD.A02 = obj;
        Iterator<F9> it = abstractC1005aD.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    abstractC1005aD = abstractC1005aD;
                    abstractC0352Ab = abstractC0352Ab;
                    obj = obj;
                    it = it;
                    it.next().AB2(abstractC1005aD, abstractC0352Ab, obj);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.FA
    public final void A3E(Handler handler, FO fo) {
        this.A03.A07(handler, fo);
    }

    @Override // com.facebook.ads.redexgen.X.FA
    public final void ABr(YA ya, boolean z, F9 f9) {
        AbstractC1005aD abstractC1005aD = this;
        AbstractC0352Ab abstractC0352Ab = null;
        boolean z2 = false;
        YA ya2 = abstractC1005aD.A00;
        char c2 = ya2 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    ya = ya;
                    ya2 = ya2;
                    if (ya2 != ya) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z2 = true;
                    c2 = 4;
                    break;
                case 4:
                    abstractC1005aD = abstractC1005aD;
                    f9 = f9;
                    IJ.A03(z2);
                    abstractC1005aD.A04.add(f9);
                    if (abstractC1005aD.A00 != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    abstractC1005aD = abstractC1005aD;
                    ya = ya;
                    abstractC1005aD.A00 = ya;
                    abstractC1005aD.A03(ya, z);
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    abstractC1005aD = abstractC1005aD;
                    abstractC0352Ab = abstractC1005aD.A01;
                    if (abstractC0352Ab == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    abstractC1005aD = abstractC1005aD;
                    f9 = f9;
                    abstractC0352Ab = abstractC0352Ab;
                    f9.AB2(abstractC1005aD, abstractC0352Ab, abstractC1005aD.A02);
                    c2 = 6;
                    break;
                case '\t':
                    z2 = false;
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.FA
    public final void ACQ(F9 f9) {
        this.A04.remove(f9);
        if (this.A04.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.FA
    public final void ACS(FO fo) {
        this.A03.A0D(fo);
    }
}

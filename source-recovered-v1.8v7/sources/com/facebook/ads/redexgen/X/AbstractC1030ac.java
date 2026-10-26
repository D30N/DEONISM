package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;

/* renamed from: com.facebook.ads.redexgen.X.ac, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1030ac implements InterfaceC0527Hr {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Format A04;
    public final C0520Hi A05;

    @Nullable
    public final Object A06;
    public final InterfaceC0516He A07;

    public AbstractC1030ac(InterfaceC0516He interfaceC0516He, C0520Hi c0520Hi, int i, Format format, int i2, @Nullable Object obj, long j, long j2) {
        this.A07 = (InterfaceC0516He) IJ.A01(interfaceC0516He);
        this.A05 = (C0520Hi) IJ.A01(c0520Hi);
        this.A01 = i;
        this.A04 = format;
        this.A00 = i2;
        this.A06 = obj;
        this.A03 = j;
        this.A02 = j2;
    }
}

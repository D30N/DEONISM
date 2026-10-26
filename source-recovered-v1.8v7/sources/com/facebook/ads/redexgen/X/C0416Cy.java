package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;

/* renamed from: com.facebook.ads.redexgen.X.Cy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0416Cy {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final Format A07;

    @Nullable
    public final long[] A08;

    @Nullable
    public final long[] A09;

    @Nullable
    public final C0417Cz[] A0A;

    public C0416Cy(int i, int i2, long j, long j2, long j3, Format format, int i3, @Nullable C0417Cz[] c0417CzArr, int i4, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.A00 = i;
        this.A03 = i2;
        this.A06 = j;
        this.A05 = j2;
        this.A04 = j3;
        this.A07 = format;
        this.A02 = i3;
        this.A0A = c0417CzArr;
        this.A01 = i4;
        this.A08 = jArr;
        this.A09 = jArr2;
    }

    public final C0417Cz A00(int i) {
        C0417Cz c0417Cz = null;
        C0417Cz[] c0417CzArr = this.A0A;
        char c2 = c0417CzArr == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0417Cz = null;
                    c2 = 3;
                    break;
                case 3:
                    return c0417Cz;
                case 4:
                    c0417CzArr = c0417CzArr;
                    c0417Cz = c0417CzArr[i];
                    c2 = 3;
                    break;
            }
        }
    }
}

package com.facebook.ads.redexgen.X;

import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.22, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass22 implements Serializable {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public double A04;
    public double A05;
    public double A06;
    public double A07;
    public double A08;
    public double A09;
    public int A0A;

    public AnonymousClass22(double d2) {
        this.A04 = d2;
    }

    public final double A00() {
        return this.A00;
    }

    public final double A01() {
        return this.A03;
    }

    public final double A02() {
        return this.A05;
    }

    public final double A03() {
        return this.A06;
    }

    public final double A04() {
        return this.A07;
    }

    public final double A05() {
        if (this.A0A == 0) {
            return 0.0d;
        }
        return this.A08;
    }

    public final void A06() {
        this.A00 = 0.0d;
        this.A02 = 0.0d;
        this.A03 = 0.0d;
        this.A05 = 0.0d;
        this.A0A = 0;
        this.A07 = 0.0d;
        this.A08 = 1.0d;
        this.A09 = 0.0d;
    }

    public final void A07() {
        this.A01 = 0.0d;
    }

    public final void A08(double d2, double d3) {
        AnonymousClass22 anonymousClass22 = this;
        anonymousClass22.A0A++;
        anonymousClass22.A07 += d2;
        anonymousClass22.A02 = d3;
        anonymousClass22.A09 += d3 * d2;
        anonymousClass22.A00 = anonymousClass22.A09 / anonymousClass22.A07;
        anonymousClass22.A08 = Math.min(anonymousClass22.A08, d3);
        anonymousClass22.A05 = Math.max(anonymousClass22.A05, d3);
        char c2 = d3 >= anonymousClass22.A04 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass22 = anonymousClass22;
                    anonymousClass22.A03 += d2;
                    anonymousClass22.A01 += d2;
                    anonymousClass22.A06 = Math.max(anonymousClass22.A06, anonymousClass22.A01);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    anonymousClass22 = anonymousClass22;
                    anonymousClass22.A01 = 0.0d;
                    c2 = 3;
                    break;
            }
        }
    }
}

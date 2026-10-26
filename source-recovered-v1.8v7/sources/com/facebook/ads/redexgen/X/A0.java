package com.facebook.ads.redexgen.X;

import java.util.Iterator;
import java.util.Set;

/* loaded from: assets/audience_network.dex */
public final class A0 {
    public final int A00;
    public final int A01;
    public final AG A02;
    public final HT A03;
    public final Set<AK> A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public A0(AG ag, AG ag2, Set<AK> set, HT ht, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4) {
        this.A02 = ag;
        this.A04 = set;
        this.A03 = ht;
        this.A08 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A09 = z2;
        this.A06 = z3;
        this.A07 = z4 || ag2.A00 != ag.A00;
        this.A0A = (ag2.A03 == ag.A03 && ag2.A07 == ag.A07) ? false : true;
        this.A05 = ag2.A08 != ag.A08;
        this.A0B = ag2.A06 != ag.A06;
    }

    public final void A00() {
        A0 a0 = this;
        Iterator<AK> it = null;
        Iterator<AK> it2 = null;
        Iterator<AK> it3 = null;
        Iterator<AK> it4 = null;
        Iterator<AK> it5 = null;
        Iterator<AK> it6 = null;
        char c2 = !a0.A0A ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    a0 = a0;
                    if (a0.A01 != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    a0 = a0;
                    it = a0.A04.iterator();
                    c2 = 4;
                    break;
                case 4:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    a0 = a0;
                    it = it;
                    it.next().ABB(a0.A02.A03, a0.A02.A07, a0.A01);
                    c2 = 4;
                    break;
                case 6:
                    a0 = a0;
                    if (!a0.A08) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    a0 = a0;
                    it2 = a0.A04.iterator();
                    c2 = '\b';
                    break;
                case '\b':
                    it2 = it2;
                    if (!it2.hasNext()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    a0 = a0;
                    it2 = it2;
                    it2.next().AAe(a0.A00);
                    c2 = '\b';
                    break;
                case '\n':
                    a0 = a0;
                    if (!a0.A0B) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    a0 = a0;
                    a0.A03.A0U(a0.A02.A06.A02);
                    it3 = a0.A04.iterator();
                    c2 = '\f';
                    break;
                case '\f':
                    it3 = it3;
                    if (!it3.hasNext()) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    a0 = a0;
                    it3 = it3;
                    it3.next().ABC(a0.A02.A05, a0.A02.A06.A01);
                    c2 = '\f';
                    break;
                case 14:
                    a0 = a0;
                    if (!a0.A05) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    a0 = a0;
                    it5 = a0.A04.iterator();
                    c2 = 16;
                    break;
                case 16:
                    it5 = it5;
                    if (!it5.hasNext()) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    a0 = a0;
                    it5 = it5;
                    it5.next().AAC(a0.A02.A08);
                    c2 = 16;
                    break;
                case 18:
                    a0 = a0;
                    if (!a0.A07) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    a0 = a0;
                    it6 = a0.A04.iterator();
                    c2 = 20;
                    break;
                case 20:
                    it6 = it6;
                    if (!it6.hasNext()) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    a0 = a0;
                    it6 = it6;
                    it6.next().AAc(a0.A06, a0.A02.A00);
                    c2 = 20;
                    break;
                case 22:
                    a0 = a0;
                    if (!a0.A09) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    a0 = a0;
                    it4 = a0.A04.iterator();
                    c2 = 24;
                    break;
                case 24:
                    it4 = it4;
                    if (!it4.hasNext()) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    it4 = it4;
                    it4.next().AAz();
                    c2 = 24;
                    break;
                case 26:
                    return;
            }
        }
    }
}

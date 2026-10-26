package com.facebook.ads.redexgen.X;

import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.As, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0369As implements InterfaceC1106bq, Comparator<I7> {
    public long A00;
    public final long A01;
    public final TreeSet<I7> A02 = new TreeSet<>(this);

    public C0369As(long j) {
        this.A01 = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(I7 i7, I7 i72) {
        int i = 0;
        char c2 = i7.A00 - i72.A00 == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return i7.compareTo(i72);
                case 3:
                    i7 = i7;
                    i72 = i72;
                    if (i7.A00 >= i72.A00) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i = -1;
                    c2 = 5;
                    break;
                case 5:
                    return i;
                case 6:
                    i = 1;
                    c2 = 5;
                    break;
            }
        }
    }

    private void A01(I3 i3, long j) {
        C0369As c0369As = this;
        while (true) {
            char c2 = c0369As.A00 + j > c0369As.A01 ? (char) 3 : '\b';
            while (true) {
                switch (c2) {
                    case 3:
                        c0369As = c0369As;
                        if (!c0369As.A02.isEmpty()) {
                            c2 = 4;
                            break;
                        } else {
                            c2 = '\b';
                            break;
                        }
                    case 4:
                        try {
                            c0369As = c0369As;
                            i3.ACU(c0369As.A02.first());
                        } catch (I1 unused) {
                        }
                    case '\b':
                        return;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.I2
    public final void AB3(I3 i3, I7 i7) {
        this.A02.add(i7);
        this.A00 += i7.A01;
        A01(i3, 0L);
    }

    @Override // com.facebook.ads.redexgen.X.I2
    public final void AB4(I3 i3, I7 i7) {
        this.A02.remove(i7);
        this.A00 -= i7.A01;
    }

    @Override // com.facebook.ads.redexgen.X.I2
    public final void AB5(I3 i3, I7 i7, I7 i72) {
        AB4(i3, i7);
        AB3(i3, i72);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1106bq
    public final void AB6(I3 i3, String str, long j, long j2) {
        A01(i3, j2);
    }
}

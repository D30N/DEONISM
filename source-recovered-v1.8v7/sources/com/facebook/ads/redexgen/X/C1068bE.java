package com.facebook.ads.redexgen.X;

import android.text.Layout;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.facebook.ads.redexgen.X.bE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1068bE extends GX {
    public final long A00;
    public final long A01;

    public C1068bE(long j, long j2, CharSequence charSequence) {
        this(j, j2, charSequence, null, Float.MIN_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, Float.MIN_VALUE, RecyclerView.UNDEFINED_DURATION, Float.MIN_VALUE);
    }

    public C1068bE(long j, long j2, CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3);
        this.A01 = j;
        this.A00 = j2;
    }

    public C1068bE(CharSequence charSequence) {
        this(0L, 0L, charSequence);
    }

    public final boolean A00() {
        C1068bE c1068bE = this;
        boolean z = false;
        char c2 = ((GX) c1068bE).A01 == Float.MIN_VALUE ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c1068bE = c1068bE;
                    if (c1068bE.A02 != Float.MIN_VALUE) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }
}

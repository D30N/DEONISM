package com.facebook.ads.redexgen.X;

import android.support.annotation.NonNull;
import android.text.Layout;

/* renamed from: com.facebook.ads.redexgen.X.b5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1059b5 extends GX implements Comparable<C1059b5> {
    public final int A00;

    public C1059b5(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.A00 = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull C1059b5 c1059b5) {
        int i = c1059b5.A00;
        int i2 = this.A00;
        char c2 = i < i2 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return -1;
                case 3:
                    if (i <= i2) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return 1;
                case 5:
                    return 0;
            }
        }
    }
}

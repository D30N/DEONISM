package com.facebook.ads.redexgen.X;

import android.support.annotation.NonNull;

/* renamed from: com.facebook.ads.redexgen.X.2q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01732q extends BX implements Comparable<C01732q> {
    public long A00;

    public C01732q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull C01732q c01732q) {
        C01732q c01732q2 = this;
        long j = 0;
        long j2 = 0;
        int i = 1;
        char c2 = c01732q2.A04() != c01732q.A04() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c01732q2 = c01732q2;
                    if (!c01732q2.A04()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return i;
                case 4:
                    i = -1;
                    c2 = 3;
                    break;
                case 5:
                    c01732q2 = c01732q2;
                    c01732q = c01732q;
                    j = ((YT) c01732q2).A00 - ((YT) c01732q).A00;
                    j2 = 0;
                    if (j != 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c01732q2 = c01732q2;
                    c01732q = c01732q;
                    j = c01732q2.A00 - c01732q.A00;
                    if (j != j2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return 0;
                case '\b':
                    if (j <= j2) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return i;
                case '\n':
                    i = -1;
                    c2 = '\t';
                    break;
            }
        }
    }
}

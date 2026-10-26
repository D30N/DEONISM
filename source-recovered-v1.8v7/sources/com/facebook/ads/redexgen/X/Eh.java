package com.facebook.ads.redexgen.X;

import android.support.annotation.NonNull;

/* loaded from: assets/audience_network.dex */
public class Eh implements Comparable<Eh> {
    public final long A00;
    public final C0520Hi A01;

    public Eh(long j, C0520Hi c0520Hi) {
        this.A00 = j;
        this.A01 = c0520Hi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull Eh eh) {
        int i = 0;
        long j = this.A00 - eh.A00;
        char c2 = j == 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = 0;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    if (j >= 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i = -1;
                    c2 = 3;
                    break;
                case 6:
                    i = 1;
                    c2 = 3;
                    break;
            }
        }
    }
}

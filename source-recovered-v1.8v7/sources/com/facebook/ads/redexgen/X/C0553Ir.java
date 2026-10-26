package com.facebook.ads.redexgen.X;

import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Ir, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0553Ir implements Comparator<C0554Is> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(C0554Is c0554Is, C0554Is c0554Is2) {
        int i = 0;
        char c2 = c0554Is.A00 < c0554Is2.A00 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = -1;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    c0554Is = c0554Is;
                    c0554Is2 = c0554Is2;
                    if (c0554Is2.A00 >= c0554Is.A00) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i = 1;
                    c2 = 3;
                    break;
                case 6:
                    i = 0;
                    c2 = 3;
                    break;
            }
        }
    }
}

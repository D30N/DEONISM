package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.util.Deque;
import java.util.LinkedList;

/* renamed from: com.facebook.ads.redexgen.X.Le, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0615Le {
    public final int A01;
    public final int A02;
    public final Deque<String> A04 = new LinkedList();
    public final Deque<String> A03 = new LinkedList();

    @Nullable
    public String A00 = null;

    public C0615Le(int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
    }

    public final Iterable<String> A00() {
        return this.A03;
    }

    public final Iterable<String> A01() {
        return this.A04;
    }

    @Nullable
    public final String A02() {
        return this.A00;
    }

    public final void A03() {
        C0615Le c0615Le = this;
        String str = c0615Le.A00;
        char c2 = str != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0615Le = c0615Le;
                    str = str;
                    c0615Le.A04.addLast(str);
                    if (c0615Le.A04.size() <= c0615Le.A02) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0615Le = c0615Le;
                    c0615Le.A04.removeFirst();
                    c2 = 4;
                    break;
                case 4:
                    c0615Le = c0615Le;
                    if (c0615Le.A03.size() <= 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0615Le = c0615Le;
                    c0615Le.A00 = c0615Le.A03.removeFirst();
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    c0615Le = c0615Le;
                    c0615Le.A00 = null;
                    c2 = 6;
                    break;
            }
        }
    }

    public final void A04(String str) {
        C0615Le c0615Le = this;
        String str2 = null;
        c0615Le.A03.addLast(str);
        char c2 = c0615Le.A03.size() <= c0615Le.A01 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0615Le = c0615Le;
                    str2 = c0615Le.A00;
                    if (str2 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0615Le = c0615Le;
                    str2 = str2;
                    c0615Le.A04.addLast(str2);
                    c2 = 5;
                    break;
                case 5:
                    c0615Le = c0615Le;
                    c0615Le.A00 = c0615Le.A03.removeFirst();
                    if (c0615Le.A04.size() <= c0615Le.A02) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0615Le = c0615Le;
                    c0615Le.A04.removeFirst();
                    c2 = 7;
                    break;
                case 7:
                    return;
            }
        }
    }
}

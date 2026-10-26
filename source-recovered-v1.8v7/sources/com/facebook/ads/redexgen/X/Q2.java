package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class Q2 {
    public float A00;
    public C0R A01;
    public Map<String, String> A02;

    public Q2(C0R c0r) {
        this(c0r, 0.0f);
    }

    public Q2(C0R c0r, float f) {
        this(c0r, f, null);
    }

    public Q2(C0R c0r, float f, Map<String, String> map) {
        this.A01 = c0r;
        this.A00 = f;
        if (map != null) {
            this.A02 = map;
        } else {
            Map<String, String> windowParams = new HashMap<>();
            this.A02 = windowParams;
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A02();
    }

    public final C0R A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        boolean z = false;
        char c2 = this.A01 == C0R.A0I ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }
}

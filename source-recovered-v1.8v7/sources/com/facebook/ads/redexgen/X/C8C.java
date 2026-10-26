package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.8C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C8C extends ContextWrapper {
    public final C8E A00;
    public final AtomicReference<String> A01;

    public C8C(Context context, C8E c8e) {
        super(context.getApplicationContext());
        this.A01 = new AtomicReference<>();
        this.A00 = c8e;
    }

    public final XJ A00() {
        XJ xjA00 = C8B.A00();
        if (xjA00 == null) {
            XJ xj = new XJ(this, this.A00);
            C8B.A01(xj);
            return xj;
        }
        return xjA00;
    }

    public final C8D A01() {
        return this.A00.A5V(this);
    }

    public final C8F A02() {
        return this.A00.A68(this);
    }

    public final C8G A03() {
        return this.A00.A6s(this);
    }

    public final C8Z A04() {
        return this.A00.A5z(this);
    }

    public final C03248z A05() {
        return this.A00.A70();
    }

    public final JW A06() {
        return this.A00.A5H(A00());
    }

    @Nullable
    public final String A07() {
        return this.A01.get();
    }

    public final void A08(@Nullable String str) {
        this.A01.set(str);
    }
}

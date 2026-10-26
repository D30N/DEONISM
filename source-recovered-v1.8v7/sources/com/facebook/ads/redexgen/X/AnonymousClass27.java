package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.27, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass27 implements Serializable {
    public static final long serialVersionUID = -3209129042070173126L;
    public AnonymousClass27 A00;
    public final int A01;
    public final String A02;

    @Nullable
    public final String A03;
    public final List<AnonymousClass27> A04;

    public AnonymousClass27(int i, @Nullable String str, String str2) {
        this.A04 = new ArrayList();
        this.A01 = i;
        this.A03 = str;
        this.A02 = str2;
    }

    public AnonymousClass27(String str) {
        this(0, null, str);
    }

    private void A00(AnonymousClass27 anonymousClass27) {
        this.A00 = anonymousClass27;
    }

    public final int A01() {
        return this.A01;
    }

    public final AnonymousClass27 A02() {
        return this.A00;
    }

    @Nullable
    public final String A03() {
        return this.A02;
    }

    public final String A04() {
        return this.A03;
    }

    public final List<AnonymousClass27> A05() {
        return this.A04;
    }

    public final void A06(AnonymousClass27 anonymousClass27) {
        anonymousClass27.A00(this);
        this.A04.add(anonymousClass27);
    }
}

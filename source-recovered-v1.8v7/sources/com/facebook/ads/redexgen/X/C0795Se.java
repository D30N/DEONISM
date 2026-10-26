package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.Se, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0795Se<K, V> extends C2Q<K, V> {
    public final /* synthetic */ C0796Sf A00;

    public C0795Se(C0796Sf c0796Sf) {
        this.A00 = c0796Sf;
    }

    @Override // com.facebook.ads.redexgen.X.C2Q
    public final int A04() {
        return ((C2T) this.A00).A00;
    }

    @Override // com.facebook.ads.redexgen.X.C2Q
    public final int A05(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.facebook.ads.redexgen.X.C2Q
    public final int A06(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.facebook.ads.redexgen.X.C2Q
    public final Object A07(int i, int i2) {
        return this.A00.A02[(i << 1) + i2];
    }

    @Override // com.facebook.ads.redexgen.X.C2Q
    public final V A08(int i, V v) {
        V value = this.A00.A0C(i, v);
        return value;
    }

    @Override // com.facebook.ads.redexgen.X.C2Q
    public final Map<K, V> A0A() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C2Q
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.facebook.ads.redexgen.X.C2Q
    public final void A0E(int i) {
        this.A00.A0A(i);
    }

    @Override // com.facebook.ads.redexgen.X.C2Q
    public final void A0F(K k, V v) {
        this.A00.put(k, v);
    }
}

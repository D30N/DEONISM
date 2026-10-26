package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.bf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1095bf<T> implements InterfaceC0527Hr {
    public final int A00;
    public final C0520Hi A01;
    public final InterfaceC0516He A02;
    public final InterfaceC0533Hx<? extends T> A03;
    public volatile long A04;
    public volatile T A05;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hx != com.facebook.ads.internal.exoplayer2.upstream.ParsingLoadable$Parser<? extends T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bf != com.facebook.ads.internal.exoplayer2.upstream.ParsingLoadable<T> */
    public C1095bf(InterfaceC0516He interfaceC0516He, Uri uri, int i, InterfaceC0533Hx<? extends T> interfaceC0533Hx) {
        this(interfaceC0516He, new C0520Hi(uri, 3), i, interfaceC0533Hx);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hx != com.facebook.ads.internal.exoplayer2.upstream.ParsingLoadable$Parser<? extends T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bf != com.facebook.ads.internal.exoplayer2.upstream.ParsingLoadable<T> */
    public C1095bf(InterfaceC0516He interfaceC0516He, C0520Hi c0520Hi, int i, InterfaceC0533Hx<? extends T> interfaceC0533Hx) {
        this.A02 = interfaceC0516He;
        this.A01 = c0520Hi;
        this.A00 = i;
        this.A03 = interfaceC0533Hx;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hx != com.facebook.ads.internal.exoplayer2.upstream.ParsingLoadable$Parser<? extends T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bf != com.facebook.ads.internal.exoplayer2.upstream.ParsingLoadable<T> */
    public static <T> T A00(InterfaceC0516He interfaceC0516He, InterfaceC0533Hx<? extends T> interfaceC0533Hx, Uri uri) throws IOException {
        C1095bf c1095bf = new C1095bf(interfaceC0516He, uri, 0, interfaceC0533Hx);
        c1095bf.A7r();
        return (T) c1095bf.A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bf != com.facebook.ads.internal.exoplayer2.upstream.ParsingLoadable<T> */
    public final T A01() {
        return this.A05;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bf != com.facebook.ads.internal.exoplayer2.upstream.ParsingLoadable<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0527Hr
    public final void A3x() {
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bf != com.facebook.ads.internal.exoplayer2.upstream.ParsingLoadable<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0527Hr
    public final void A7r() throws IOException {
        C0518Hg c0518Hg = new C0518Hg(this.A02, this.A01);
        try {
            c0518Hg.A02();
            this.A05 = this.A03.ABc(this.A02.A7F(), c0518Hg);
        } finally {
            this.A04 = c0518Hg.A01();
            C0560Iy.A0a(c0518Hg);
        }
    }
}

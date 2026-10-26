package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.ads.redexgen.X.InterfaceC0444Eg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.a9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1001a9<M extends InterfaceC0444Eg<M, K>, K> implements InterfaceC0442Ee {
    public final Uri A00;
    public final I3 A01;
    public final C1104bo A02;
    public final C1104bo A03;
    public final C0548Im A04;
    public final ArrayList<K> A05;
    public volatile int A07;
    public volatile long A09;
    public volatile int A08 = -1;
    public final AtomicBoolean A06 = new AtomicBoolean();

    public abstract M A09(InterfaceC0516He interfaceC0516He, Uri uri) throws IOException;

    public abstract List<Eh> A0A(InterfaceC0516He interfaceC0516He, M m, boolean z) throws InterruptedException, IOException;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a9 != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloader<M extends com.facebook.ads.redexgen.X.Eg<M, K>, K> */
    public AbstractC1001a9(Uri uri, List<K> list, C0443Ef c0443Ef) {
        this.A00 = uri;
        this.A05 = new ArrayList<>(list);
        this.A01 = c0443Ef.A00();
        this.A02 = c0443Ef.A01(false);
        this.A03 = c0443Ef.A01(true);
        this.A04 = c0443Ef.A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a9 != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloader<M extends com.facebook.ads.redexgen.X.Eg<M, K>, K> */
    private List<Eh> A07() throws InterruptedException, IOException {
        AbstractC1001a9<M, K> abstractC1001a9 = this;
        I8 i8 = null;
        List<Eh> listA0A = null;
        int size = 0;
        InterfaceC0444Eg interfaceC0444EgA09 = abstractC1001a9.A09(abstractC1001a9.A02, abstractC1001a9.A00);
        char c2 = !abstractC1001a9.A05.isEmpty() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    abstractC1001a9 = abstractC1001a9;
                    interfaceC0444EgA09 = (InterfaceC0444Eg) interfaceC0444EgA09.A4B(abstractC1001a9.A05);
                    c2 = 3;
                    break;
                case 3:
                    abstractC1001a9 = abstractC1001a9;
                    interfaceC0444EgA09 = interfaceC0444EgA09;
                    listA0A = abstractC1001a9.A0A(abstractC1001a9.A02, interfaceC0444EgA09, false);
                    i8 = new I8();
                    abstractC1001a9.A08 = listA0A.size();
                    abstractC1001a9.A07 = 0;
                    abstractC1001a9.A09 = 0L;
                    size = listA0A.size() - 1;
                    c2 = 4;
                    break;
                case 4:
                    if (size < 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    abstractC1001a9 = abstractC1001a9;
                    listA0A = listA0A;
                    i8 = i8;
                    I9.A04(listA0A.get(size).A01, abstractC1001a9.A01, i8);
                    abstractC1001a9.A09 += i8.A00;
                    if (i8.A00 != i8.A01) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    abstractC1001a9 = abstractC1001a9;
                    listA0A = listA0A;
                    abstractC1001a9.A07++;
                    listA0A.remove(size);
                    c2 = 7;
                    break;
                case 7:
                    size--;
                    c2 = 4;
                    break;
                case '\b':
                    return listA0A;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a9 != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloader<M extends com.facebook.ads.redexgen.X.Eg<M, K>, K> */
    private void A08(Uri uri) {
        I9.A05(this.A01, I9.A01(uri));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a9 != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloader<M extends com.facebook.ads.redexgen.X.Eg<M, K>, K> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0442Ee
    public final void A4q() throws InterruptedException, IOException {
        this.A04.A00(-1000);
        try {
            List<Eh> listA07 = A07();
            Collections.sort(listA07);
            byte[] bArr = new byte[131072];
            I8 i8 = new I8();
            for (int i = 0; i < listA07.size(); i++) {
                try {
                    I9.A03(listA07.get(i).A01, this.A01, this.A02, bArr, this.A04, -1000, i8, this.A06, true);
                    this.A07++;
                    this.A09 += i8.A02;
                } finally {
                }
            }
        } finally {
            this.A04.A03(-1000);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a9 != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloader<M extends com.facebook.ads.redexgen.X.Eg<M, K>, K> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0442Ee
    public final float A62() {
        float f = 0.0f;
        int i = this.A08;
        int i2 = this.A07;
        char c2 = i != -1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 != -1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return -1.0f;
                case 4:
                    f = 100.0f;
                    if (i != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return f;
                case 6:
                    f = (i2 * f) / i;
                    c2 = 5;
                    break;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a9 != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloader<M extends com.facebook.ads.redexgen.X.Eg<M, K>, K> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0442Ee
    public final long A63() {
        return this.A09;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a9 != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloader<M extends com.facebook.ads.redexgen.X.Eg<M, K>, K> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0442Ee
    public final void cancel() {
        this.A06.set(true);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a9 != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloader<M extends com.facebook.ads.redexgen.X.Eg<M, K>, K> */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0014 */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0442Ee
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void remove() throws java.lang.InterruptedException {
        /*
            r3 = this;
            com.facebook.ads.redexgen.X.bo r1 = r3.A03     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            android.net.Uri r0 = r3.A00     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            com.facebook.ads.redexgen.X.Eg r2 = r3.A09(r1, r0)     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            com.facebook.ads.redexgen.X.bo r1 = r3.A03     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            r0 = 1
            java.util.List r2 = r3.A0A(r1, r2, r0)     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            r1 = 0
        L10:
            int r0 = r2.size()     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            if (r1 >= r0) goto L26
            java.lang.Object r0 = r2.get(r1)     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            com.facebook.ads.redexgen.X.Eh r0 = (com.facebook.ads.redexgen.X.Eh) r0     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            com.facebook.ads.redexgen.X.Hi r0 = r0.A01     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            android.net.Uri r0 = r0.A04     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            r3.A08(r0)     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            int r1 = r1 + 1
            goto L10
        L26:
            android.net.Uri r0 = r3.A00
            r3.A08(r0)
            return
        L2c:
            r1 = move-exception
            android.net.Uri r0 = r3.A00
            r3.A08(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC1001a9.remove():void");
    }
}

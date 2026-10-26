package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

@TargetApi(16)
/* loaded from: assets/audience_network.dex */
public final class EK implements YA, AO, AM {
    public static byte[] A0O;
    public float A00;
    public int A01;
    public int A02;
    public Surface A03;
    public SurfaceHolder A04;
    public TextureView A05;
    public Format A06;
    public Format A07;
    public C0364An A08;
    public BW A09;
    public BW A0A;
    public FA A0B;
    public List<GX> A0C;
    public boolean A0D;
    public final Handler A0E;
    public final YA A0F;
    public final YD A0G;
    public final YG A0H;
    public final CopyOnWriteArraySet<B3> A0I;
    public final CopyOnWriteArraySet<InterfaceC0431Dt> A0J;
    public final CopyOnWriteArraySet<InterfaceC0487Gb> A0K;
    public final CopyOnWriteArraySet<JM> A0L;
    public final CopyOnWriteArraySet<JD> A0M;
    public final YC[] A0N;

    static {
        A0F();
    }

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0O, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 31);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0F() {
        A0O = new byte[]{-17, 17, 14, 2, -3, -1, 1, -16, 1, 20, 16, 17, 14, 1, -24, 5, 15, 16, 1, 10, 1, 14, -68, -3, 8, 14, 1, -3, 0, 21, -68, 17, 10, 15, 1, 16, -68, 11, 14, -68, 14, 1, 12, 8, -3, -1, 1, 0, -54, 118, -116, -112, -109, -113, -120, 104, -101, -110, 115, -113, -124, -100, -120, -107};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bw != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public EK(AW aw, HT ht, AB ab, @Nullable InterfaceC0397Bw<C0948Ye> interfaceC0397Bw) {
        this(aw, ht, ab, interfaceC0397Bw, new C0353Ac());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bw != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public EK(AW aw, HT ht, AB ab, @Nullable InterfaceC0397Bw<C0948Ye> interfaceC0397Bw, C0353Ac c0353Ac) {
        this(aw, ht, ab, interfaceC0397Bw, c0353Ac, IM.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bw != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public EK(AW aw, HT ht, AB ab, @Nullable InterfaceC0397Bw<C0948Ye> interfaceC0397Bw, C0353Ac c0353Ac, IM im) {
        this.A0G = new YD(this);
        this.A0M = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        this.A0L = new CopyOnWriteArraySet<>();
        this.A0I = new CopyOnWriteArraySet<>();
        this.A0E = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        Handler handler = this.A0E;
        YD yd = this.A0G;
        this.A0N = aw.A4Q(handler, yd, yd, yd, yd, interfaceC0397Bw);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A08 = C0364An.A04;
        this.A02 = 1;
        this.A0C = Collections.emptyList();
        this.A0F = A02(this.A0N, ht, ab, im);
        this.A0H = c0353Ac.A00(this.A0F, im);
        A3G(this.A0H);
        this.A0L.add(this.A0H);
        this.A0I.add(this.A0H);
        A0I(this.A0H);
        if (interfaceC0397Bw instanceof YZ) {
            ((YZ) interfaceC0397Bw).A04(this.A0E, this.A0H);
        }
    }

    private final YA A02(YC[] ycArr, HT ht, AB ab, IM im) {
        return new EM(ycArr, ht, ab, im);
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.SurfaceHolder, android.view.TextureView] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    private void A0E() {
        EK ek = this;
        SurfaceHolder surfaceHolder = null;
        TextureView textureView = ek.A05;
        ?? r4 = 0;
        char c2 = textureView != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    ek = ek;
                    textureView = textureView;
                    if (textureView.getSurfaceTextureListener() == ek.A0G) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    Log.w(A07(49, 15, 4), A07(0, 49, 125));
                    c2 = 4;
                    break;
                case 4:
                    ek = ek;
                    ek.A05 = r4;
                    c2 = 5;
                    break;
                case 5:
                    ek = ek;
                    surfaceHolder = ek.A04;
                    if (surfaceHolder == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    ek = ek;
                    surfaceHolder = surfaceHolder;
                    surfaceHolder.removeCallback(ek.A0G);
                    ek.A04 = r4;
                    c2 = 7;
                    break;
                case 7:
                    return;
                case '\b':
                    ek = ek;
                    r4 = 0;
                    ek.A05.setSurfaceTextureListener(null);
                    c2 = 4;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0040 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0G(android.view.Surface r11, boolean r12) {
        /*
            r10 = this;
            r9 = r10
            r8 = 0
            r7 = 0
            r0 = 0
            r0 = 0
            r0 = 0
            r6 = 0
            r0 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.facebook.ads.redexgen.X.YC[] r4 = r9.A0N
            int r3 = r4.length
            r2 = 0
            r0 = 2
        L12:
            switch(r0) {
                case 2: goto L22;
                case 3: goto L5c;
                case 4: goto L76;
                case 5: goto L97;
                case 6: goto L6b;
                case 7: goto L50;
                case 8: goto L34;
                case 9: goto L15;
                case 10: goto L15;
                case 11: goto L15;
                case 12: goto L28;
                case 13: goto L15;
                case 14: goto L15;
                case 15: goto L15;
                case 16: goto L16;
                case 17: goto L9c;
                case 18: goto La7;
                default: goto L15;
            }
        L15:
            goto L12
        L16:
            com.facebook.ads.redexgen.X.EK r9 = (com.facebook.ads.redexgen.X.EK) r9
            boolean r0 = r9.A0D
            if (r0 == 0) goto L1f
            r0 = 17
            goto L12
        L1f:
            r0 = 18
            goto L12
        L22:
            if (r2 >= r3) goto L26
            r0 = 3
            goto L12
        L26:
            r0 = 6
            goto L12
        L28:
            java.util.Iterator r6 = (java.util.Iterator) r6     // Catch: java.lang.InterruptedException -> L46
            java.lang.Object r0 = r6.next()     // Catch: java.lang.InterruptedException -> L46
            com.facebook.ads.redexgen.X.AS r0 = (com.facebook.ads.redexgen.X.AS) r0     // Catch: java.lang.InterruptedException -> L46
            r0.A0C()     // Catch: java.lang.InterruptedException -> L46
            goto L3a
        L34:
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.InterruptedException -> L46
            java.util.Iterator r6 = r5.iterator()     // Catch: java.lang.InterruptedException -> L46
        L3a:
            boolean r0 = r6.hasNext()     // Catch: java.lang.InterruptedException -> L46
            if (r0 == 0) goto L43
            r0 = 12
            goto L12
        L43:
            r0 = 16
            goto L12
        L46:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            r0 = 16
            goto L12
        L50:
            android.view.Surface r11 = (android.view.Surface) r11
            android.view.Surface r8 = (android.view.Surface) r8
            if (r8 == r11) goto L59
            r0 = 8
            goto L12
        L59:
            r0 = 18
            goto L12
        L5c:
            com.facebook.ads.redexgen.X.YC[] r4 = (com.facebook.ads.redexgen.X.YC[]) r4
            r7 = r4[r2]
            int r1 = r7.A7D()
            r0 = 2
            if (r1 != r0) goto L69
            r0 = 4
            goto L12
        L69:
            r0 = 5
            goto L12
        L6b:
            com.facebook.ads.redexgen.X.EK r9 = (com.facebook.ads.redexgen.X.EK) r9
            android.view.Surface r8 = r9.A03
            if (r8 == 0) goto L73
            r0 = 7
            goto L12
        L73:
            r0 = 18
            goto L12
        L76:
            com.facebook.ads.redexgen.X.EK r9 = (com.facebook.ads.redexgen.X.EK) r9
            android.view.Surface r11 = (android.view.Surface) r11
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            com.facebook.ads.redexgen.X.YC r7 = (com.facebook.ads.redexgen.X.YC) r7
            com.facebook.ads.redexgen.X.YA r0 = r9.A0F
            com.facebook.ads.redexgen.X.AS r1 = r0.A4K(r7)
            r0 = 1
            com.facebook.ads.redexgen.X.AS r0 = r1.A06(r0)
            com.facebook.ads.redexgen.X.AS r0 = r0.A07(r11)
            com.facebook.ads.redexgen.X.AS r0 = r0.A05()
            r5.add(r0)
            r0 = 5
            goto L12
        L97:
            int r2 = r2 + 1
            r0 = 2
            goto L12
        L9c:
            com.facebook.ads.redexgen.X.EK r9 = (com.facebook.ads.redexgen.X.EK) r9
            android.view.Surface r0 = r9.A03
            r0.release()
            r0 = 18
            goto L12
        La7:
            com.facebook.ads.redexgen.X.EK r9 = (com.facebook.ads.redexgen.X.EK) r9
            android.view.Surface r11 = (android.view.Surface) r11
            r9.A03 = r11
            r9.A0D = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.EK.A0G(android.view.Surface, boolean):void");
    }

    private final void A0I(InterfaceC0431Dt interfaceC0431Dt) {
        this.A0J.add(interfaceC0431Dt);
    }

    public final int A0J() {
        return this.A01;
    }

    public final Format A0K() {
        return this.A06;
    }

    @Nullable
    public final Format A0L() {
        return this.A07;
    }

    public final void A0M() {
        ADU(false);
    }

    public final void A0N(float f) {
        EK ek = this;
        YC renderer = null;
        ek.A00 = f;
        YC[] ycArr = ek.A0N;
        int length = ycArr.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ycArr = ycArr;
                    renderer = ycArr[i];
                    if (renderer.A7D() != 1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    ek = ek;
                    renderer = renderer;
                    ek.A0F.A4K(renderer).A06(2).A07(Float.valueOf(f)).A05();
                    c2 = 5;
                    break;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return;
            }
        }
    }

    public final void A0O(Surface surface) {
        A0E();
        A0G(surface, false);
    }

    public final void A0P(FA fa) {
        ABp(fa, true, true);
    }

    public final void A0Q(JD jd) {
        this.A0M.add(jd);
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void A3G(AK ak) {
        this.A0F.A3G(ak);
    }

    @Override // com.facebook.ads.redexgen.X.YA
    public final AS A4K(AR ar) {
        return this.A0F.A4K(ar);
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final int A5W() {
        return this.A0F.A5W();
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final long A5X() {
        return this.A0F.A5X();
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final long A5p() {
        return this.A0F.A5p();
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final int A5r() {
        return this.A0F.A5r();
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final int A5s() {
        return this.A0F.A5s();
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final long A5u() {
        return this.A0F.A5u();
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final AbstractC0352Ab A5w() {
        return this.A0F.A5w();
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final int A5x() {
        return this.A0F.A5x();
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final long A64() {
        return this.A0F.A64();
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final boolean A6l() {
        return this.A0F.A6l();
    }

    @Override // com.facebook.ads.redexgen.X.YA
    public final void ABp(FA fa, boolean z, boolean z2) {
        EK ek = this;
        FA fa2 = ek.A0B;
        char c2 = fa2 != fa ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    fa2 = fa2;
                    if (fa2 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ek = ek;
                    fa2 = fa2;
                    fa2.ACS(ek.A0H);
                    ek.A0H.A07();
                    c2 = 4;
                    break;
                case 4:
                    ek = ek;
                    fa = fa;
                    fa.A3E(ek.A0E, ek.A0H);
                    ek.A0B = fa;
                    c2 = 5;
                    break;
                case 5:
                    ek.A0F.ABp(fa, z, z2);
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void ACJ() {
        EK ek = this;
        FA fa = null;
        ek.A0F.ACJ();
        ek.A0E();
        Surface surface = ek.A03;
        char c2 = surface != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    ek = ek;
                    if (!ek.A0D) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    surface = surface;
                    surface.release();
                    c2 = 4;
                    break;
                case 4:
                    ek = ek;
                    ek.A03 = null;
                    c2 = 5;
                    break;
                case 5:
                    ek = ek;
                    fa = ek.A0B;
                    if (fa == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    ek = ek;
                    fa = fa;
                    fa.ACS(ek.A0H);
                    c2 = 7;
                    break;
                case 7:
                    ek.A0C = Collections.emptyList();
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void ACr(long j) {
        this.A0H.A06();
        this.A0F.ACr(j);
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void ACs() {
        this.A0H.A06();
        this.A0F.ACs();
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void AD8(boolean z) {
        this.A0F.AD8(z);
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void ADU(boolean z) {
        this.A0F.ADU(z);
        FA fa = this.A0B;
        if (fa != null) {
            fa.ACS(this.A0H);
            this.A0B = null;
            this.A0H.A07();
        }
        this.A0C = Collections.emptyList();
    }
}

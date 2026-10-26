package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.NotProvisionedException;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.redexgen.X.InterfaceC0398Bx;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@TargetApi(18)
/* loaded from: assets/audience_network.dex */
public final class YW<T extends InterfaceC0398Bx> implements InterfaceC0396Bv<T> {
    public static byte[] A0K;
    public int A00;
    public int A01;
    public HandlerThread A02;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/YW<TT;>.PostRequestHandler; */
    public HandlerC0378Bb A03;
    public C0394Bt A04;
    public T A05;
    public Object A06;
    public Object A07;
    public byte[] A08;
    public byte[] A09;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/YW<TT;>.PostResponseHandler; */
    public final HandlerC0379Bc A0A;
    public final C7 A0B;
    public final UUID A0C;
    public final int A0D;
    public final int A0E;
    public final InterfaceC0380Bd<T> A0F;
    public final C0386Bj A0G;
    public final DrmInitData.SchemeData A0H;
    public final C3<T> A0I;
    public final HashMap<String, String> A0J;

    static {
        A04();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private long A01() {
        if (!C03419q.A05.equals(this.A0C)) {
            return Long.MAX_VALUE;
        }
        Pair<Long, Long> pairA01 = CB.A01(this);
        return Math.min(((Long) pairA01.first).longValue(), ((Long) pairA01.second).longValue());
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 7);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A0K = new byte[]{68, 101, 102, 97, 117, 108, 116, 68, 114, 109, 83, 101, 115, 115, 105, 111, 110, 11, 61, 34, 29, 42, 62, 58, 42, 60, 59, 7, 46, 33, 43, 35, 42, 61, 49, 6, 6, 27, 6, 84, 0, 6, 13, 29, 26, 19, 84, 0, 27, 84, 6, 17, 7, 0, 27, 6, 17, 84, 35, 29, 16, 17, 2, 29, 26, 17, 84, 31, 17, 13, 7, 90, 86, Byte.MAX_VALUE, Byte.MAX_VALUE, 117, 112, 119, 124, 57, 117, 112, 122, 124, 119, 106, 124, 57, 113, 120, 106, 57, 124, 97, 105, 112, 107, 124, 125, 57, 118, 107, 57, 110, 112, 117, 117, 57, 124, 97, 105, 112, 107, 124, 57, 106, 118, 118, 119, 55, 57, 75, 124, 116, 120, 112, 119, 112, 119, 126, 57, 106, 124, 122, 118, 119, 125, 106, 35, 57};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bd != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession$ProvisioningManager<T extends com.facebook.ads.redexgen.X.Bx> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C3 != com.facebook.ads.internal.exoplayer2.drm.ExoMediaDrm<T extends com.facebook.ads.redexgen.X.Bx> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    public YW(UUID uuid, C3<T> c3, InterfaceC0380Bd<T> interfaceC0380Bd, @Nullable DrmInitData.SchemeData schemeData, int i, @Nullable byte[] bArr, HashMap<String, String> map, C7 c7, Looper looper, C0386Bj c0386Bj, int i2) {
        this.A0C = uuid;
        this.A0F = interfaceC0380Bd;
        this.A0I = c3;
        this.A0E = i;
        this.A08 = bArr;
        this.A0H = bArr != null ? null : schemeData;
        this.A0J = map;
        this.A0B = c7;
        this.A0D = i2;
        this.A0G = c0386Bj;
        this.A01 = 2;
        this.A0A = new HandlerC0379Bc(this, looper);
        this.A02 = new HandlerThread(A02(17, 17, 72));
        this.A02.start();
        this.A03 = new HandlerC0378Bb(this, this.A02.getLooper());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    private void A03() {
        if (this.A01 == 4) {
            this.A01 = 3;
            A08(new C6());
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    private void A05(int i, boolean z) {
        YW<T> yw = this;
        String licenseServerUrl = null;
        String licenseServerUrl2 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        DrmInitData.SchemeData schemeData = null;
        char c2 = i == 3 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    yw = yw;
                    bArr3 = yw.A08;
                    c2 = 3;
                    break;
                case 3:
                    yw = yw;
                    bArr3 = bArr3;
                    bArr2 = bArr3;
                    bArr = null;
                    schemeData = yw.A0H;
                    if (schemeData == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    yw = yw;
                    schemeData = schemeData;
                    bArr = schemeData.A04;
                    licenseServerUrl2 = yw.A0H.A02;
                    licenseServerUrl = yw.A0H.A01;
                    c2 = 7;
                    break;
                case 5:
                    yw = yw;
                    bArr3 = yw.A09;
                    c2 = 3;
                    break;
                case 6:
                    licenseServerUrl = null;
                    licenseServerUrl2 = null;
                    c2 = 7;
                    break;
                case 7:
                    try {
                        yw = yw;
                        yw.A06 = Pair.create(yw.A0I.getKeyRequest(bArr2, bArr, licenseServerUrl2, i, yw.A0J), licenseServerUrl);
                        yw.A03.A02(1, yw.A06, z);
                        return;
                    } catch (Exception e) {
                        yw.A09(e);
                        return;
                    }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    private void A08(Exception exc) {
        this.A04 = new C0394Bt(exc);
        this.A0G.A04(exc);
        if (this.A01 != 4) {
            this.A01 = 1;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    private void A09(Exception exc) {
        YW<T> yw = this;
        char c2 = exc instanceof NotProvisionedException ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    yw = yw;
                    yw.A0F.ABy(yw);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    yw = yw;
                    exc = exc;
                    yw.A08(exc);
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    public void A0A(Object obj, Object obj2) {
        YW<T> yw = this;
        byte[] bArr = null;
        char c2 = obj == yw.A06 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    yw = yw;
                    if (!yw.A0D()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    yw = yw;
                    obj2 = obj2;
                    yw.A06 = null;
                    if (!(obj2 instanceof Exception)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    yw.A09((Exception) obj2);
                    return;
                case 6:
                    try {
                        obj2 = obj2;
                        bArr = (byte[]) obj2;
                        if (yw.A0E != 3) {
                            c2 = 15;
                            break;
                        } else {
                            c2 = '\n';
                            break;
                        }
                    } catch (Exception e) {
                        yw.A09(e);
                        return;
                    }
                case '\n':
                    YW<T> yw2 = yw;
                    yw2.A0I.provideKeyResponse(yw2.A08, bArr);
                    yw2.A0G.A01();
                    return;
                case 15:
                    YW<T> yw3 = yw;
                    byte[] bArrProvideKeyResponse = yw3.A0I.provideKeyResponse(yw3.A09, bArr);
                    if ((yw3.A0E == 2 || (yw3.A0E == 0 && yw3.A08 != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                        yw3.A08 = bArrProvideKeyResponse;
                    }
                    yw3.A01 = 4;
                    yw3.A0G.A00();
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    public void A0B(Object obj, Object obj2) {
        YW<T> yw = this;
        char c2 = obj == yw.A07 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    yw = yw;
                    if (yw.A01 == 2) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    yw = yw;
                    if (!yw.A0D()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    yw = yw;
                    obj2 = obj2;
                    yw.A07 = null;
                    if (!(obj2 instanceof Exception)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    yw.A0F.AAk((Exception) obj2);
                    return;
                case 7:
                    try {
                        yw = yw;
                        yw.A0I.provideProvisionResponse((byte[]) obj2);
                        yw.A0F.AAj();
                        return;
                    } catch (Exception e) {
                        yw.A0F.AAk(e);
                        return;
                    }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    private void A0C(boolean z) {
        YW<T> yw = this;
        int i = 0;
        long licenseDurationRemainingSec = 0;
        int i2 = 0;
        int i3 = yw.A0E;
        char c2 = i3 != 0 ? (char) 2 : '\f';
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 == 1) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i3 == 2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i2 = 3;
                    if (i3 == 3) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return;
                case 6:
                    yw = yw;
                    if (!yw.A0E()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    yw = yw;
                    yw.A05(i2, z);
                    c2 = 5;
                    break;
                case '\b':
                    yw = yw;
                    if (yw.A08 != null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    yw = yw;
                    yw.A05(2, z);
                    c2 = 5;
                    break;
                case '\n':
                    yw = yw;
                    if (!yw.A0E()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    yw = yw;
                    yw.A05(2, z);
                    c2 = 5;
                    break;
                case '\f':
                    yw = yw;
                    if (yw.A08 != null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    yw = yw;
                    yw.A05(1, z);
                    c2 = 5;
                    break;
                case 14:
                    yw = yw;
                    i = 4;
                    if (yw.A01 == 4) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    yw = yw;
                    if (!yw.A0E()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    yw = yw;
                    licenseDurationRemainingSec = yw.A01();
                    if (yw.A0E != 0) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    if (licenseDurationRemainingSec > 60) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    yw = yw;
                    String str = A02(72, 68, 30) + licenseDurationRemainingSec;
                    yw.A05(2, z);
                    c2 = 5;
                    break;
                case 19:
                    if (licenseDurationRemainingSec > 0) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    yw = yw;
                    yw.A08(new C6());
                    c2 = 5;
                    break;
                case 21:
                    yw = yw;
                    yw.A01 = i;
                    yw.A0G.A02();
                    c2 = 5;
                    break;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    private boolean A0D() {
        boolean z = false;
        int i = this.A01;
        char c2 = i != 3 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (i != 4) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    private boolean A0E() {
        try {
            this.A0I.restoreKeys(this.A09, this.A08);
            return true;
        } catch (Exception e) {
            Log.e(A02(0, 17, 7), A02(34, 38, k.AppCompatTheme_windowActionBar), e);
            A08(e);
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    private boolean A0F(boolean z) {
        YW<T> yw = this;
        NotProvisionedException e = null;
        char c2 = yw.A0D() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return true;
                case 3:
                    try {
                        yw = yw;
                        yw.A09 = yw.A0I.openSession();
                        yw.A05 = (T) yw.A0I.createMediaCrypto(yw.A09);
                        yw.A01 = 3;
                        return true;
                    } catch (NotProvisionedException e2) {
                        e = e2;
                        if (!z) {
                            c2 = 14;
                            break;
                        } else {
                            c2 = '\r';
                            break;
                        }
                    } catch (Exception e3) {
                        yw.A08(e3);
                        c2 = 16;
                        break;
                    }
                case '\r':
                    yw = yw;
                    yw.A0F.ABy(yw);
                    c2 = 16;
                    break;
                case 14:
                    yw = yw;
                    e = e;
                    yw.A08(e);
                    c2 = 16;
                    break;
                case 16:
                    return false;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    public final void A0G() {
        YW<T> yw = this;
        int i = yw.A00 + 1;
        yw.A00 = i;
        char c2 = i == 1 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    yw = yw;
                    if (yw.A01 != 1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    yw = yw;
                    if (!yw.A0F(true)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    yw = yw;
                    yw.A0C(true);
                    c2 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    public final void A0H() {
        if (A0F(false)) {
            A0C(true);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    public final void A0I() {
        this.A07 = this.A0I.getProvisionRequest();
        this.A03.A02(0, this.A07, true);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    public final void A0J(int i) {
        YW<T> yw = this;
        int i2 = 0;
        char c2 = !yw.A0D() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    i2 = 3;
                    if (i == 1) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == i2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return;
                case 7:
                    yw = yw;
                    yw.A03();
                    c2 = 6;
                    break;
                case '\b':
                    yw = yw;
                    yw.A0C(false);
                    c2 = 6;
                    break;
                case '\t':
                    yw = yw;
                    yw.A01 = i2;
                    yw.A0F.ABy(yw);
                    c2 = 6;
                    break;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    public final void A0K(Exception exc) {
        A08(exc);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    public final boolean A0L() {
        YW<T> yw = this;
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i = yw.A00 - 1;
        yw.A00 = i;
        char c2 = i == 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    yw = yw;
                    yw.A01 = 0;
                    bArr2 = null;
                    yw.A0A.removeCallbacksAndMessages(null);
                    yw.A03.removeCallbacksAndMessages(null);
                    yw.A03 = null;
                    yw.A02.quit();
                    yw.A02 = null;
                    yw.A05 = null;
                    yw.A04 = null;
                    yw.A06 = null;
                    yw.A07 = null;
                    bArr = yw.A09;
                    if (bArr == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    yw = yw;
                    bArr = bArr;
                    yw.A0I.closeSession(bArr);
                    yw.A09 = bArr2;
                    c2 = 4;
                    break;
                case 4:
                    return true;
                case 5:
                    return false;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    public final boolean A0M(byte[] bArr) {
        byte[] bArr2 = null;
        DrmInitData.SchemeData schemeData = this.A0H;
        char c2 = schemeData != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    schemeData = schemeData;
                    bArr2 = schemeData.A04;
                    c2 = 3;
                    break;
                case 3:
                    return Arrays.equals(bArr2, bArr);
                case 4:
                    bArr2 = null;
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    public final boolean A0N(byte[] bArr) {
        return Arrays.equals(this.A09, bArr);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0396Bv
    public final C0394Bt A6B() {
        YW<T> yw = this;
        C0394Bt c0394Bt = null;
        char c2 = yw.A01 == 1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    yw = yw;
                    c0394Bt = yw.A04;
                    c2 = 3;
                    break;
                case 3:
                    return c0394Bt;
                case 4:
                    c0394Bt = null;
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0396Bv
    public final T A6X() {
        return this.A05;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0396Bv
    public final int A73() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0396Bv
    public final Map<String, String> ABz() {
        YW<T> yw = this;
        Map<String, String> mapQueryKeyStatus = null;
        byte[] bArr = yw.A09;
        char c2 = bArr == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    mapQueryKeyStatus = null;
                    c2 = 3;
                    break;
                case 3:
                    return mapQueryKeyStatus;
                case 4:
                    yw = yw;
                    bArr = bArr;
                    mapQueryKeyStatus = yw.A0I.queryKeyStatus(bArr);
                    c2 = 3;
                    break;
            }
        }
    }
}

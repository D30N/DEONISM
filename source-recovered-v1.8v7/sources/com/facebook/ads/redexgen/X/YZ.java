package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.util.Log;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.redexgen.X.InterfaceC0398Bx;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@TargetApi(18)
/* loaded from: assets/audience_network.dex */
public final class YZ<T extends InterfaceC0398Bx> implements InterfaceC0397Bw<T>, InterfaceC0380Bd<T> {
    public static byte[] A0D;
    public int A00;
    public Looper A01;
    public byte[] A02;
    public final int A03;
    public final C0386Bj A04;
    public final C3<T> A05;
    public final C7 A06;
    public final HashMap<String, String> A07;
    public final List<YW<T>> A08;
    public final List<YW<T>> A09;
    public final UUID A0A;
    public final boolean A0B;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/YZ<TT;>.MediaDrmHandler; */
    public volatile HandlerC0389Bm A0C;

    static {
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 84);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A0D = new byte[]{-18, 15, 16, 11, 31, 22, 30, -18, 28, 23, -3, 15, 29, 29, 19, 25, 24, -9, 17, 28, -53, -51, -42, -37, -1, -2, -1, 15, 18, 64, 59, 23, 60, 55, 66, 18, 47, 66, 47, -18, 61, 60, 58, 71, -18, 49, 61, 60, 66, 47, 55, 60, 65, -18, 49, 61, 59, 59, 61, 60, -18, 30, 33, 33, 22, -18, 33, 49, 54, 51, 59, 51, 18, 47, 66, 47, -4, -18, 15, 65, 65, 67, 59, 55, 60, 53, -18, 65, 67, 62, 62, 61, 64, 66, -18, 52, 61, 64, 8, -18, -67, -65, -56, -67, -28, -29, -28, -78};
    }

    public static DrmInitData.SchemeData A00(DrmInitData drmInitData, UUID uuid, boolean z) {
        int i = 0;
        int i2 = 0;
        DrmInitData.SchemeData schemeData = null;
        int i3 = 0;
        boolean z2 = false;
        int iA00 = 0;
        DrmInitData.SchemeData schemeDataA03 = null;
        ArrayList arrayList = new ArrayList(drmInitData.A01);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    drmInitData = drmInitData;
                    z2 = false;
                    i = 1;
                    if (i4 >= drmInitData.A01) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    drmInitData = drmInitData;
                    uuid = uuid;
                    schemeDataA03 = drmInitData.A03(i4);
                    if (!schemeDataA03.A03(uuid)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 4:
                    uuid = uuid;
                    if (!C03419q.A01.equals(uuid)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    schemeDataA03 = schemeDataA03;
                    if (!schemeDataA03.A03(C03419q.A02)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    z2 = true;
                    c2 = 7;
                    break;
                case 7:
                    if (!z2) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    schemeDataA03 = schemeDataA03;
                    if (schemeDataA03.A04 != null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (!z) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    arrayList = arrayList;
                    schemeDataA03 = schemeDataA03;
                    arrayList.add(schemeDataA03);
                    c2 = 11;
                    break;
                case 11:
                    i4++;
                    c2 = 2;
                    break;
                case '\f':
                    arrayList = arrayList;
                    if (!arrayList.isEmpty()) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    return (DrmInitData.SchemeData) null;
                case 14:
                    uuid = uuid;
                    if (!C03419q.A05.equals(uuid)) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    i3 = 0;
                    c2 = 16;
                    break;
                case 16:
                    arrayList = arrayList;
                    if (i3 >= arrayList.size()) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    arrayList = arrayList;
                    schemeData = (DrmInitData.SchemeData) arrayList.get(i3);
                    if (!schemeData.A01()) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    schemeData = schemeData;
                    iA00 = Cv.A00(schemeData.A04);
                    c2 = 19;
                    break;
                case 19:
                    i2 = 23;
                    if (C0560Iy.A01 >= 23) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    if (iA00 != 0) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    return schemeData;
                case 22:
                    if (C0560Iy.A01 < i2) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    if (iA00 != i) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    return schemeData;
                case 25:
                    i3++;
                    c2 = 16;
                    break;
                case 26:
                    iA00 = -1;
                    c2 = 19;
                    break;
                case 27:
                    return (DrmInitData.SchemeData) arrayList.get(0);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YZ != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.Bx> */
    public final void A04(Handler handler, InterfaceC0387Bk interfaceC0387Bk) {
        this.A04.A03(handler, interfaceC0387Bk);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YZ != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.Bx> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0397Bw
    public final InterfaceC0396Bv<T> A2P(Looper looper, DrmInitData drmInitData) {
        Looper looper2 = this.A01;
        IJ.A04(looper2 == null || looper2 == looper);
        if (this.A09.isEmpty()) {
            this.A01 = looper;
            if (this.A0C == null) {
                this.A0C = new HandlerC0389Bm(this, looper);
            }
        }
        DrmInitData.SchemeData schemeDataA00 = null;
        YW<T> yw = null;
        if (this.A02 == null && (schemeDataA00 = A00(drmInitData, this.A0A, false)) == null) {
            C0390Bn c0390Bn = new C0390Bn(this.A0A);
            this.A04.A04(c0390Bn);
            return new C0944Ya(new C0394Bt(c0390Bn));
        }
        if (!this.A0B) {
            if (!this.A09.isEmpty()) {
                yw = this.A09.get(0);
            }
        } else {
            byte[] bArr = schemeDataA00 != null ? schemeDataA00.A04 : null;
            Iterator<YW<T>> it = this.A09.iterator();
            while (true) {
                if (it.hasNext()) {
                    YW<T> next = it.next();
                    if (next.A0M(bArr)) {
                        yw = next;
                        break;
                    }
                } else {
                    yw = null;
                    break;
                }
            }
        }
        if (yw == null) {
            yw = new YW<>(this.A0A, this.A05, this, schemeDataA00, this.A00, this.A02, this.A07, this.A06, looper, this.A04, this.A03);
            this.A09.add(yw);
        }
        yw.A0G();
        return yw;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YZ != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.Bx> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0397Bw
    public final boolean A3w(@NonNull DrmInitData drmInitData) {
        YZ<T> yz = this;
        boolean z = false;
        String schemeType = null;
        boolean z2 = true;
        char c2 = yz.A02 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return z2;
                case 3:
                    yz = yz;
                    drmInitData = drmInitData;
                    z = false;
                    if (A00(drmInitData, yz.A0A, z2) != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    drmInitData = drmInitData;
                    if (drmInitData.A01 != z2) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    drmInitData = drmInitData;
                    z = false;
                    if (!drmInitData.A03(0).A03(C03419q.A02)) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    yz = yz;
                    Log.w(A01(0, 20, 86), A01(28, 72, k.AppCompatTheme_windowMinWidthMajor) + yz.A0A);
                    c2 = 7;
                    break;
                case 7:
                    drmInitData = drmInitData;
                    schemeType = drmInitData.A02;
                    if (schemeType == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    schemeType = schemeType;
                    if (!A01(100, 4, 6).equals(schemeType)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return z2;
                case '\n':
                    schemeType = schemeType;
                    if (!A01(104, 4, 45).equals(schemeType)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case 11:
                    schemeType = schemeType;
                    if (!A01(24, 4, 72).equals(schemeType)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\f':
                    schemeType = schemeType;
                    if (!A01(20, 4, 20).equals(schemeType)) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    if (C0560Iy.A01 < 25) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    return z2;
                case 15:
                    z2 = false;
                    c2 = 14;
                    break;
                case 16:
                    return z2;
                case 17:
                    return z;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YZ != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.Bx> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0380Bd
    public final void AAj() {
        Iterator<YW<T>> it = this.A08.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    it = it;
                    it.next().A0H();
                    c2 = 2;
                    break;
                case 4:
                    this.A08.clear();
                    return;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YZ != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.Bx> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0380Bd
    public final void AAk(Exception exc) {
        Iterator<YW<T>> it = this.A08.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    exc = exc;
                    it = it;
                    it.next().A0K(exc);
                    c2 = 2;
                    break;
                case 4:
                    this.A08.clear();
                    return;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YZ != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.Bx> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0380Bd
    public final void ABy(YW<T> yw) {
        this.A08.add(yw);
        if (this.A08.size() == 1) {
            yw.A0I();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bv != com.facebook.ads.internal.exoplayer2.drm.DrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.Bx> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YZ != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.Bx> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0397Bw
    public final void ACP(InterfaceC0396Bv<T> interfaceC0396Bv) {
        YZ<T> yz = this;
        int i = 0;
        YW<T> yw = null;
        char c2 = interfaceC0396Bv instanceof C0944Ya ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    interfaceC0396Bv = interfaceC0396Bv;
                    yw = (YW) interfaceC0396Bv;
                    if (!yw.A0L()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    yz = yz;
                    yw = yw;
                    yz.A09.remove(yw);
                    i = 1;
                    if (yz.A08.size() <= 1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    yz = yz;
                    yw = yw;
                    if (yz.A08.get(0) != yw) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    yz = yz;
                    yz.A08.get(i).A0I();
                    c2 = 7;
                    break;
                case 7:
                    yz = yz;
                    yw = yw;
                    yz.A08.remove(yw);
                    c2 = '\b';
                    break;
                case '\b':
                    return;
            }
        }
    }
}

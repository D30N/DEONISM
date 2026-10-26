package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import d.b.a.b.k;
import java.io.File;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Pp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0728Pp {
    public static C0728Pp A09;
    public static byte[] A0A;
    public static final DownloadAction.Deserializer[] A0B;
    public C0438Ea A00;

    @Nullable
    public I3 A01;
    public File A02;
    public boolean A03;
    public final Context A04;
    public final Handler A05 = new Handler(Looper.getMainLooper());
    public final SparseArray<C0726Pn> A06 = new SparseArray<>();
    public final Runnable A08 = new RunnableC0725Pm(this);
    public final ET A07 = new C0519Hh(this);

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 101);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0B() {
        A0A = new byte[]{62, 65, 75, 84, 10, 65, 76, 84, 75, 73, 76, 62, 65, 80, -49, -4, -4, -7, -4, -72, -86, -35, -2, -21, -2, -17, -60, -86, 14, 17, 32, -82, -39, -31, -40, -42, -39, -53, -50, -49, -50, -104, -118, -67, -34, -53, -34, -49, -92, -118, -27, 7, 62, 57, 42, 56, -1, -27, -66, 0, 23, 18, 3, 17, -66, 67, 70, 80, 89, 15, 67, 69, 86, 75, 81, 80, 85, -47, -34, -16, -24};
    }

    static {
        A0B();
        A0B = new DownloadAction.Deserializer[]{C0391Bo.A01, C0997a4.A02};
    }

    @VisibleForTesting
    public C0728Pp(Context context, @Nullable C0438Ea c0438Ea) {
        this.A04 = context;
        if (c0438Ea != null) {
            this.A00 = c0438Ea;
            c0438Ea.A0Q(this.A07);
        }
        A01().A0P();
    }

    private C0438Ea A01() {
        if (this.A00 == null) {
            C0443Ef downloaderConstructorHelper = new C0443Ef(A03(), A02());
            this.A00 = new C0438Ea(downloaderConstructorHelper, 10, 5, new File(A06(), A07(65, 12, 125)), A0B);
            this.A00.A0Q(this.A07);
        }
        return this.A00;
    }

    private InterfaceC1089bZ A02() {
        return new C01572a(A07(28, 3, 72), null);
    }

    private final synchronized I3 A03() {
        if (this.A01 == null) {
            this.A01 = new C1109bt(new File(A06(), A07(0, 14, k.AppCompatTheme_windowFixedWidthMajor)), new C0369As(134217728L));
        }
        return this.A01;
    }

    public static C1105bp A04(C1083bT c1083bT, I3 i3) {
        return new C1105bp(i3, c1083bT, new C1087bX(), null, 2, null);
    }

    public static C0728Pp A05(Context context) {
        if (A09 == null) {
            A09 = new C0728Pp(context.getApplicationContext(), null);
        }
        return A09;
    }

    private File A06() {
        if (this.A02 == null) {
            this.A02 = this.A04.getCacheDir();
        }
        return this.A02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        C0728Pp c0728Pp = this;
        int i = 0;
        int i2 = 0;
        C0726Pn c0726Pn = null;
        EZ ez = null;
        EZ[] ezArrA0S = c0728Pp.A01().A0S();
        int length = ezArrA0S.length;
        int i3 = 0;
        int state = 2;
        while (true) {
            switch (state) {
                case 2:
                    if (i3 >= length) {
                        state = 11;
                        break;
                    } else {
                        state = 3;
                        break;
                    }
                case 3:
                    c0728Pp = c0728Pp;
                    ezArrA0S = ezArrA0S;
                    ez = ezArrA0S[i3];
                    i2 = ez.A02;
                    c0726Pn = c0728Pp.A06.get(i2);
                    if (c0726Pn == null) {
                        state = 7;
                        break;
                    } else {
                        state = 4;
                        break;
                    }
                case 4:
                    ez = ez;
                    i = ez.A01;
                    if (i == 2) {
                        state = 6;
                        break;
                    } else {
                        state = 5;
                        break;
                    }
                case 5:
                    ez = ez;
                    c0726Pn = c0726Pn;
                    if (ez.A03 <= c0726Pn.A00) {
                        state = 8;
                        break;
                    } else {
                        state = 6;
                        break;
                    }
                case 6:
                    c0728Pp = c0728Pp;
                    ez = ez;
                    c0726Pn = c0726Pn;
                    String str = A07(31, 19, 5) + i + A07(50, 8, 96) + ez.A03;
                    c0726Pn.A01.A9O();
                    c0728Pp.A06.remove(i2);
                    state = 7;
                    break;
                case 7:
                    ez = ez;
                    String str2 = A07(77, 4, 24) + i2 + A07(58, 7, 57) + ez.A03;
                    i3++;
                    state = 2;
                    break;
                case 8:
                    if (i == 4) {
                        state = 10;
                        break;
                    } else {
                        state = 9;
                        break;
                    }
                case 9:
                    if (i != 3) {
                        state = 7;
                        break;
                    } else {
                        state = 10;
                        break;
                    }
                case 10:
                    c0728Pp = c0728Pp;
                    c0726Pn = c0726Pn;
                    String str3 = A07(14, 14, 37) + i;
                    c0726Pn.A01.A9X();
                    c0728Pp.A06.remove(i2);
                    state = 7;
                    break;
                case 11:
                    return;
            }
        }
    }

    private void A09() {
        if (!this.A03) {
            this.A03 = true;
            this.A05.post(this.A08);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        this.A05.removeCallbacks(this.A08);
        this.A03 = false;
    }

    public final InterfaceC0515Hd A0E(Context context) {
        return A04(new C1083bT(context, (InterfaceC0535Hz<? super InterfaceC0516He>) null, A02()), A03());
    }

    public final void A0F(Uri uri, InterfaceC0727Po interfaceC0727Po, long j) {
        this.A06.put(A01().A0O(new C0997a4(uri, false, null, null)), new C0726Pn(interfaceC0727Po, j, null));
        A09();
    }
}

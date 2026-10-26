package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class RW implements InterfaceC01180n {
    public static byte[] A0B;
    public static final String A0C;
    public InterfaceC01260v A00;
    public C0774Rj A01;
    public EY A02;

    @Nullable
    public JW A03;

    @DoNotStrip
    @Nullable
    public InterfaceC0669Nh A04;

    @Nullable
    public C1004aC A05;
    public String A06;
    public Map<String, Object> A07;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A = false;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 125);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A0B = new byte[]{100, 101, 102, 105, 110, 105, 116, 105, 111, 110, 26, 11, 22, 26, 65, 6, 26, 3, 2, 103, 102, 116, 63, 42, 88, 93, 72, 93};
    }

    static {
        A07();
        A0C = RW.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        RW rw = this;
        boolean z = false;
        RI riA0A = null;
        char c2 = rw.A00 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    rw = rw;
                    if (!rw.A08) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    rw = rw;
                    if (!rw.A09) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    rw = rw;
                    if (!rw.A0A) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    rw = rw;
                    rw.A00.A93(rw, rw.A05);
                    c2 = 6;
                    break;
                case 6:
                    rw = rw;
                    riA0A = rw.A02.A0A();
                    if (rw.A00 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    z = true;
                    c2 = '\b';
                    break;
                case '\b':
                    riA0A.A3X(z);
                    return;
                case '\t':
                    z = false;
                    c2 = '\b';
                    break;
            }
        }
    }

    private void A09(C03198t c03198t) {
        C0772Rh c0772RhA00 = C0772Rh.A00((JSONObject) this.A07.get(A05(24, 4, 65)));
        this.A06 = c0772RhA00.A5k();
        if (C01140j.A03(this.A02, c0772RhA00, this.A03)) {
            this.A02.A0A().A40();
            this.A00.A94(this, AdError.internalError(AdError.INTERNAL_ERROR_2006));
            return;
        }
        this.A04 = new C0472Fm(this, c0772RhA00);
        this.A05 = new C1004aC(this.A02, new WeakReference(this.A04), c03198t.A04());
        this.A05.A0B(c03198t.A07(), c03198t.A08());
        RV rv = new RV(this);
        EY ey = this.A02;
        JW jw = this.A03;
        C1004aC c1004aC = this.A05;
        this.A01 = new C0774Rj(ey, jw, c1004aC, c1004aC.getViewabilityChecker(), rv);
        this.A01.A08(c0772RhA00);
        this.A05.loadDataWithBaseURL(C0672Nk.A00(), c0772RhA00.A04(), A05(10, 9, 19), A05(19, 5, 111), null);
        this.A08 = true;
        A06();
    }

    public final void A0C(EY ey, JW jw, KA ka, InterfaceC01260v interfaceC01260v, Map<String, Object> map) {
        ey.A0A().A3W();
        this.A02 = ey;
        this.A03 = jw;
        this.A00 = interfaceC01260v;
        this.A07 = map;
        this.A0A = JQ.A0x(this.A02.getApplicationContext());
        A09((C03198t) this.A07.get(A05(0, 10, 125)));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01180n
    public final String A5k() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01180n
    public final AdPlacementType A6j() {
        return AdPlacementType.BANNER;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01180n
    public final void onDestroy() {
        RW rw = this;
        C1004aC c1004aC = null;
        boolean z = false;
        RI riA0A = rw.A02.A0A();
        char c2 = rw.A05 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    rw = rw;
                    riA0A = riA0A;
                    riA0A.A3U(z);
                    c1004aC = rw.A05;
                    if (c1004aC == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    rw = rw;
                    c1004aC = c1004aC;
                    c1004aC.destroy();
                    rw.A05 = null;
                    rw.A04 = null;
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }
}

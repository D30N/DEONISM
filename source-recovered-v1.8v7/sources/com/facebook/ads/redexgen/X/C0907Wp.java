package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0907Wp extends C6U {
    public static byte[] A01;
    public final TelephonyManager A00;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 4);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A01 = new byte[]{19, 11, 12, 13, 6};
    }

    public C0907Wp(Context context, C02525u c02525u) {
        super(context, c02525u);
        this.A00 = (TelephonyManager) context.getSystemService(A04(0, 5, 103));
    }

    public static int A01(CellInfo cellInfo) {
        char c2 = cellInfo != null ? (char) 2 : '\r';
        while (true) {
            switch (c2) {
                case 2:
                    if (Build.VERSION.SDK_INT < 18) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    cellInfo = cellInfo;
                    if (!(cellInfo instanceof CellInfoCdma)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return ((CellInfoCdma) cellInfo).getCellSignalStrength().getLevel();
                case 5:
                    cellInfo = cellInfo;
                    if (!(cellInfo instanceof CellInfoGsm)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return ((CellInfoGsm) cellInfo).getCellSignalStrength().getLevel();
                case 7:
                    cellInfo = cellInfo;
                    if (!(cellInfo instanceof CellInfoLte)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return ((CellInfoLte) cellInfo).getCellSignalStrength().getLevel();
                case '\t':
                    cellInfo = cellInfo;
                    if (!(cellInfo instanceof CellInfoWcdma)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    return ((CellInfoWcdma) cellInfo).getCellSignalStrength().getLevel();
                case 11:
                    throw new UnsupportedOperationException(cellInfo.getClass().getSimpleName());
                case '\f':
                    throw new UnsupportedOperationException();
                case '\r':
                    throw new NullPointerException();
            }
        }
    }

    public final InterfaceC02616d A0G() {
        return new C0897Wf(this);
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC02616d A0H() {
        return new C0898Wg(this);
    }

    public final InterfaceC02616d A0I() {
        return new C0902Wk(this);
    }

    public final InterfaceC02616d A0J() {
        return new C0903Wl(this);
    }

    public final InterfaceC02616d A0K() {
        return new C0901Wj(this);
    }

    public final InterfaceC02616d A0L() {
        return new C0900Wi(this);
    }

    public final InterfaceC02616d A0M() {
        return new C0906Wo(this);
    }

    public final InterfaceC02616d A0N() {
        return new C0894Wc(this);
    }

    public final InterfaceC02616d A0O() {
        return new C0904Wm(this);
    }

    public final InterfaceC02616d A0P() {
        return new C0905Wn(this);
    }

    public final InterfaceC02616d A0Q() {
        return new C0895Wd(this);
    }

    public final InterfaceC02616d A0R() {
        return new C0896We(this);
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC02616d A0S() {
        return new C0899Wh(this);
    }
}

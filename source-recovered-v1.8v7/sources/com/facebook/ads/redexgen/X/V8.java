package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Process;
import d.b.a.b.k;
import java.util.Arrays;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class V8 extends C6U {
    public static byte[] A01;

    @Nullable
    public final BluetoothAdapter A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowFixedHeightMinor);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A01 = new byte[]{53, 58, 48, 38, 59, 61, 48, 122, 36, 49, 38, 57, 61, 39, 39, 61, 59, 58, 122, 22, 24, 1, 17, 0, 27, 27, 0, 28};
    }

    public V8(Context context, C02525u c02525u) {
        super(context, c02525u);
        this.A00 = A04(context) ? BluetoothAdapter.getDefaultAdapter() : null;
    }

    public static boolean A04(Context context) {
        boolean z = false;
        char c2 = context.checkPermission(A02(0, 28, 35), Process.myPid(), Process.myUid()) == 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC02616d A0G() {
        return new V4(this);
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC02616d A0H() {
        return new V5(this);
    }

    @SuppressLint({"MissingPermission"})
    public final InterfaceC02616d A0I() {
        return new V6(this);
    }
}

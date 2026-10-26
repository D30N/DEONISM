package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import d.b.a.b.k;
import java.util.Arrays;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class UN extends C6U {
    public static byte[] A04;

    @Nullable
    public ConfigurationInfo A00;
    public final ActivityManager.RunningAppProcessInfo A01;
    public final ActivityManager A02;
    public final Context A03;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 102);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A04 = new byte[]{57, 59, 76, 65, 78, 65, 76, 81};
    }

    public UN(Context context, C02525u c02525u) {
        super(context, c02525u);
        this.A03 = context;
        this.A02 = (ActivityManager) this.A03.getSystemService(A04(0, 8, k.AppCompatTheme_viewInflaterClass));
        ActivityManager activityManager = this.A02;
        if (activityManager != null) {
            this.A00 = activityManager.getDeviceConfigurationInfo();
        }
        this.A01 = new ActivityManager.RunningAppProcessInfo();
    }

    public final InterfaceC02616d A0G() {
        return new UK(this);
    }

    public final InterfaceC02616d A0H() {
        return new UL(this);
    }

    public final InterfaceC02616d A0I() {
        return new UG(this);
    }

    public final InterfaceC02616d A0J() {
        return new UH(this);
    }

    public final InterfaceC02616d A0K() {
        return new UI(this);
    }

    public final InterfaceC02616d A0L() {
        return new UF(this);
    }

    public final InterfaceC02616d A0M() {
        return new UJ(this);
    }

    public final InterfaceC02616d A0N() {
        return new UE(this);
    }

    public final InterfaceC02616d A0O() {
        return new UM(this);
    }

    public final InterfaceC02616d A0P() {
        return new UC(this);
    }

    public final InterfaceC02616d A0Q() {
        return new UD(this);
    }
}

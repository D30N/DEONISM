package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.Arrays;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class WL extends C6U {
    public static byte[] A07;
    public static final String A08;
    public final Context A00;

    @Nullable
    public final PackageInfo A01;

    @Nullable
    public final PackageManager A02;
    public final C02525u A03;

    @Nullable
    public final ActivityInfo[] A04;

    @Nullable
    public final ServiceInfo[] A05;

    @Nullable
    public final String[] A06;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 107);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A07 = new byte[]{5, 33, 59, 59, 33, 38, 47, 104, 24, 41, 43, 35, 41, 47, 45, 104, 24, 45, 58, 37, 33, 59, 59, 33, 39, 38, 59};
    }

    static {
        A07();
        A08 = WL.class.getSimpleName();
    }

    public WL(Context context, C02525u c02525u) {
        super(context, c02525u);
        this.A00 = context;
        this.A03 = c02525u;
        this.A01 = A02(context);
        this.A02 = context.getPackageManager();
        this.A04 = A08(context);
        this.A05 = A0A(context);
        this.A06 = A0C(context);
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private PackageInfo A02(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(A08, A06(0, 27, 35), e);
            return null;
        }
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private ActivityInfo[] A08(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(A08, A06(0, 27, 35), e);
            return null;
        }
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private ServiceInfo[] A0A(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(A08, A06(0, 27, 35), e);
            return null;
        }
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private String[] A0C(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(A08, A06(0, 27, 35), e);
            return null;
        }
    }

    public final InterfaceC02616d A0G() {
        return new WJ(this);
    }

    public final InterfaceC02616d A0H() {
        return new WI(this);
    }

    public final InterfaceC02616d A0I() {
        return new WK(this);
    }

    public final InterfaceC02616d A0J() {
        return new WH(this);
    }

    public final InterfaceC02616d A0K() {
        return new WC(this);
    }

    public final InterfaceC02616d A0L() {
        return new W8(this);
    }

    public final InterfaceC02616d A0M() {
        return new WD(this);
    }

    public final InterfaceC02616d A0N() {
        return new WG(this);
    }

    public final InterfaceC02616d A0O() {
        return new WE(this);
    }

    public final InterfaceC02616d A0P() {
        return new WF(this);
    }

    public final InterfaceC02616d A0Q() {
        return new WB(this);
    }

    public final InterfaceC02616d A0R() {
        return new WA(this);
    }

    public final InterfaceC02616d A0S() {
        return new W9(this);
    }

    public final InterfaceC02616d A0T() {
        return new W6(this);
    }

    public final InterfaceC02616d A0U() {
        return new W5(this);
    }

    public final InterfaceC02616d A0V() {
        return new W7(this);
    }

    public final InterfaceC02616d A0W() {
        return new W3(this);
    }

    public final InterfaceC02616d A0X() {
        return new W2(this);
    }

    public final InterfaceC02616d A0Y() {
        return new W4(this);
    }
}

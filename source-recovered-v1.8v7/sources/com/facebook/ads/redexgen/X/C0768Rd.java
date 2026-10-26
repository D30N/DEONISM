package com.facebook.ads.redexgen.X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.WindowManager;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.Rd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0768Rd implements InterfaceC01180n, C1Z {
    public static byte[] A0B;
    public long A00;
    public RewardData A01;
    public InterfaceC01290y A02;
    public C01300z A03;
    public C0790Rz A04;
    public XI A05;
    public String A06;

    @Nullable
    public String A07;
    public String A08;
    public boolean A09;
    public final String A0A = UUID.randomUUID().toString();

    static {
        A05();
    }

    public static String A03(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 95);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A0B = new byte[]{-3, 27, 40, -31, 46, -38, 45, 46, 27, 44, 46, -38, -5, 47, 30, 35, 31, 40, 29, 31, 8, 31, 46, 49, 41, 44, 37, -5, 29, 46, 35, 48, 35, 46, 51, -24, -38, 7, 27, 37, 31, -38, 45, 47, 44, 31, -38, 46, 34, 27, 46, -38, 35, 46, -31, 45, -38, 35, 40, -38, 51, 41, 47, 44, -38, -5, 40, 30, 44, 41, 35, 30, 7, 27, 40, 35, 32, 31, 45, 46, -24, 50, 39, 38, -38, 32, 35, 38, 31, -24, -30, -50, -54, -55, -3, -20, -15, -19, -10, -21, -19, -42, -19, -4, -1, -9, -6, -13, 52, 65, 50, 52, 54, 71, 60, 73, 60, 71, 76, 81, 68, 64, 82, 47, 84, 75, 64, -7, -21, -16, -26, -15, -7, 60, 47, 59, 63, 47, 61, 62, 30, 51, 55, 47, -5, -3, -16, -17, -16, -15, -12, -7, -16, -17, -38, -3, -12, -16, -7, -1, -20, -1, -12, -6, -7, -42, -16, 4, -22, -29, -34, -26, -22, -38, -66, -39, 4, 13, 10, 6, 15, 21, -11, 16, 12, 6, 15, 61, 57, 46, 48, 50, 58, 50, 59, 65, 22, 49, 40, 32, 31, 36, 28, 47, 36, 42, 41, -1, 28, 47, 28};
    }

    private int A00() {
        int rotation = 0;
        int rotation2 = ((WindowManager) this.A05.getSystemService(A03(127, 6, 35))).getDefaultDisplay().getRotation();
        EnumC0677Np enumC0677NpA02 = A02();
        EnumC0677Np adOrientation = EnumC0677Np.A05;
        char c2 = enumC0677NpA02 == adOrientation ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return -1;
                case 3:
                    enumC0677NpA02 = enumC0677NpA02;
                    EnumC0677Np adOrientation2 = EnumC0677Np.A03;
                    rotation = 2;
                    if (enumC0677NpA02 != adOrientation2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (rotation2 == rotation) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (rotation2 == 3) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return 0;
                case 7:
                    return 8;
                case '\b':
                    if (rotation2 == rotation) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return 1;
                case '\n':
                    return 9;
            }
        }
    }

    private final EnumC0592Ke A01() {
        return this.A04.A09();
    }

    private EnumC0677Np A02() {
        return this.A04.A0A();
    }

    private void A04() {
        this.A09 = true;
    }

    private void A06(Intent intent) {
        C0790Rz c0790Rz = this.A04;
        RewardData rewardData = this.A01;
        c0790Rz.A0D(intent, rewardData, C0711Oy.A03(rewardData, this.A0A, this.A06));
    }

    private final void A07(XI xi, InterfaceC01290y interfaceC01290y, Map<String, Object> map, EnumSet<CacheFlag> enumSet, @Nullable String str) {
        this.A04 = new C0790Rz(xi, map, this, str);
        this.A04.A0E(xi, enumSet);
    }

    private void A08(EnumC0592Ke enumC0592Ke) {
        C0768Rd c0768Rd = this;
        char c2 = enumC0592Ke.equals(EnumC0592Ke.A06) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0768Rd = c0768Rd;
                    c0768Rd.A05.A0A().ADD(EnumC01080d.A03);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    enumC0592Ke = enumC0592Ke;
                    if (!enumC0592Ke.equals(EnumC0592Ke.A07)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0768Rd = c0768Rd;
                    c0768Rd.A05.A0A().ADD(EnumC01080d.A06);
                    c2 = 3;
                    break;
                case 6:
                    enumC0592Ke = enumC0592Ke;
                    if (!enumC0592Ke.equals(EnumC0592Ke.A09)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0768Rd = c0768Rd;
                    c0768Rd.A05.A0A().ADD(EnumC01080d.A08);
                    c2 = 3;
                    break;
                case '\b':
                    enumC0592Ke = enumC0592Ke;
                    if (!enumC0592Ke.equals(EnumC0592Ke.A08)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0768Rd = c0768Rd;
                    c0768Rd.A05.A0A().ADD(EnumC01080d.A07);
                    c2 = 3;
                    break;
                case '\n':
                    enumC0592Ke = enumC0592Ke;
                    if (!enumC0592Ke.equals(EnumC0592Ke.A03)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0768Rd = c0768Rd;
                    if (!c0768Rd.A04.A0F()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c0768Rd = c0768Rd;
                    c0768Rd.A05.A0A().ADD(EnumC01080d.A05);
                    c2 = 3;
                    break;
                case '\r':
                    c0768Rd = c0768Rd;
                    c0768Rd.A05.A0A().ADD(EnumC01080d.A04);
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A09(XI xi, InterfaceC01290y interfaceC01290y, Map<String, Object> map, EnumSet<CacheFlag> enumSet, @Nullable String str, @Nullable String str2, @Nullable RewardData rewardData) {
        String strA03 = null;
        this.A05 = xi;
        this.A02 = interfaceC01290y;
        this.A08 = (String) map.get(A03(187, 11, 110));
        String str3 = this.A08;
        char c2 = str3 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    str3 = str3;
                    strA03 = str3.split(A03(90, 1, 36))[0];
                    c2 = 3;
                    break;
                case 3:
                    C0768Rd c0768Rd = this;
                    Map<String, Object> map2 = map;
                    c0768Rd.A06 = strA03;
                    c0768Rd.A00 = ((Long) map2.get(A03(133, 11, 107))).longValue();
                    c0768Rd.A07 = str2;
                    c0768Rd.A01 = rewardData;
                    c0768Rd.A07(xi, interfaceC01290y, map2, enumSet, str);
                    return;
                case 4:
                    strA03 = A03(k.AppCompatTheme_windowFixedHeightMinor, 0, 53);
                    c2 = 3;
                    break;
            }
        }
    }

    public final boolean A0A() {
        C0768Rd c0768Rd = this;
        String str = null;
        AdActivityIntent adActivityIntentA04 = null;
        InterfaceC01290y interfaceC01290y = null;
        char c2 = !c0768Rd.A09 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0768Rd = c0768Rd;
                    interfaceC01290y = c0768Rd.A02;
                    if (interfaceC01290y == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0768Rd = c0768Rd;
                    interfaceC01290y = interfaceC01290y;
                    interfaceC01290y.A9v(c0768Rd, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
                    c2 = 4;
                    break;
                case 4:
                    return false;
                case 5:
                    c0768Rd = c0768Rd;
                    adActivityIntentA04 = LA.A04(c0768Rd.A05);
                    adActivityIntentA04.putExtra(A03(144, 24, 44), c0768Rd.A00());
                    adActivityIntentA04.putExtra(A03(168, 8, 22), c0768Rd.A0A);
                    adActivityIntentA04.putExtra(A03(187, 11, 110), c0768Rd.A08);
                    adActivityIntentA04.putExtra(A03(133, 11, 107), c0768Rd.A00);
                    EnumC0592Ke enumC0592KeA01 = c0768Rd.A01();
                    c0768Rd.A08(enumC0592KeA01);
                    adActivityIntentA04.putExtra(A03(k.AppCompatTheme_windowFixedHeightMinor, 8, k.AppCompatTheme_windowNoTitle), enumC0592KeA01);
                    str = c0768Rd.A07;
                    if (str == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    adActivityIntentA04 = adActivityIntentA04;
                    str = str;
                    adActivityIntentA04.putExtra(A03(198, 13, 92), str);
                    c2 = 7;
                    break;
                case 7:
                    c0768Rd = c0768Rd;
                    adActivityIntentA04 = adActivityIntentA04;
                    c0768Rd.A06(adActivityIntentA04);
                    adActivityIntentA04.addFlags(268435456);
                    adActivityIntentA04.putExtra(A03(176, 11, 66), c0768Rd.A04.A0B());
                    c2 = '\b';
                    break;
                case '\b':
                    try {
                        c0768Rd = c0768Rd;
                        LA.A09(c0768Rd.A05, adActivityIntentA04);
                        return true;
                    } catch (ActivityNotFoundException e) {
                        c0768Rd.A05.A04().A83(A03(108, 11, k.AppCompatTheme_windowActionBarOverlay), C03008a.A05, new C03018b(e));
                        Log.e(A03(91, 17, 41), A03(0, 90, 91), e);
                        return false;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01180n
    @Nullable
    public final String A5k() {
        return this.A04.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01180n
    public final AdPlacementType A6j() {
        return AdPlacementType.INTERSTITIAL;
    }

    @Override // com.facebook.ads.redexgen.X.C1Z
    public final void A8m(AdError adError) {
        InterfaceC01290y interfaceC01290y = this.A02;
        if (interfaceC01290y != null) {
            interfaceC01290y.A9v(this, adError);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1Z
    public final void A8n() {
        A04();
        this.A02.A9u(this);
    }

    @Override // com.facebook.ads.redexgen.X.C1Z
    public final void ACG() {
        this.A03 = new C01300z(this.A05, this.A0A, this, this.A02);
        this.A03.A02();
    }

    @Override // com.facebook.ads.redexgen.X.C1Z
    public final void ADg() {
        C01300z c01300z = this.A03;
        if (c01300z != null) {
            c01300z.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01180n
    public final void onDestroy() {
        C0790Rz c0790Rz = this.A04;
        if (c0790Rz != null) {
            c0790Rz.A0C();
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Rz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0790Rz implements InterfaceC01270w {
    public static byte[] A04;

    @Nullable
    public C7C A00;
    public EnumC0677Np A01 = EnumC0677Np.A05;
    public final C0786Rv A02;
    public final C1Z A03;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 48);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A04 = new byte[]{-97, -92, -86, -101, -88, -87, -86, -97, -86, -97, -105, -94, 10, 11, 12, 15, 20, 15, 26, 15, 21, 20, -28, 9, 15, 0, 13, 9, -4, 7, -69, -32, 13, 13, 10, 13, -69, -51, -53, -53, -47, -69, 18, 4, 15, 3, 10, 16, 15, -69, -4, -69, 17, -4, 7, 4, -1, -69, -36, -1, -28, 9, 1, 10, -55, -119, -61, -49, -56, -57, -41, -26, -33, -72, -75, -56, -75, -53, -50, -55, -50, -53, -34, -53, -55, -52, -33, -40, -50, -42, -49};
    }

    public C0790Rz(XI xi, Map<String, Object> map, C1Z c1z, @Nullable String str) {
        this.A02 = A01(xi, map, str, (JSONObject) map.get(A04(73, 4, 36)));
        this.A03 = c1z;
    }

    @Nullable
    private AdError A00(XI xi) {
        if (this.A02.A0V().isEmpty()) {
            xi.A04().A83(A04(70, 3, 70), C03008a.A0O, new C03018b(A04(22, 43, 107)));
            return AdError.internalError(AdError.INTERNAL_ERROR_2006);
        }
        return null;
    }

    public static C0786Rv A01(XI xi, Map<String, Object> map, @Nullable String str, JSONObject jSONObject) {
        C0786Rv adDataBundle = C0786Rv.A01(jSONObject, xi);
        adDataBundle.A0a(str);
        C03198t c03198t = (C03198t) map.get(A04(12, 10, k.AppCompatTheme_windowFixedHeightMajor));
        if (c03198t != null) {
            adDataBundle.A0Y(c03198t.A06());
        }
        return adDataBundle;
    }

    private C7C A03(XI xi) {
        C7C c7c = this.A00;
        return c7c != null ? c7c : new C7C(xi);
    }

    private void A06(XI xi, EnumSet<CacheFlag> enumSet) {
        C0790Rz c0790Rz = this;
        C0789Ry c0789Ry = null;
        EnumC0677Np enumC0677NpA0A = null;
        C7C c7c = null;
        C01351e c01351e = null;
        C1T c1tA06 = c0790Rz.A02.A0L().A0D().A06();
        char c2 = c1tA06 != null ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    c1tA06 = c1tA06;
                    enumC0677NpA0A = c1tA06.A0A();
                    c2 = 3;
                    break;
                case 3:
                    c0790Rz = c0790Rz;
                    xi = xi;
                    enumC0677NpA0A = enumC0677NpA0A;
                    c0790Rz.A08(enumC0677NpA0A);
                    c0789Ry = new C0789Ry(c0790Rz);
                    c7c = new C7C(xi);
                    c01351e = new C01351e(c0790Rz, c0790Rz.A02, A04(0, 12, 6), c7c);
                    if (!c01351e.A08()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0790Rz = c0790Rz;
                    xi = xi;
                    c7c = c7c;
                    c01351e = c01351e;
                    c7c.A0W(new C0565Jd(c0790Rz.A02.A0P(), xi.A06()));
                    c01351e.A07();
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c0790Rz = c0790Rz;
                    xi = xi;
                    c0789Ry = c0789Ry;
                    C01401j.A02(xi, c0790Rz.A02, true, c0789Ry);
                    c2 = 5;
                    break;
                case 7:
                    enumC0677NpA0A = EnumC0677Np.A05;
                    c2 = 3;
                    break;
            }
        }
    }

    private void A07(XI xi, EnumSet<CacheFlag> enumSet) {
        C7C c7cA03 = A03(xi);
        C0565Jd funnelLoggingHandler = new C0565Jd(this.A02.A0P(), xi.A06());
        c7cA03.A0W(funnelLoggingHandler);
        C0786Rv c0786Rv = this.A02;
        String strA04 = A04(0, 12, 6);
        C01351e c01351e = new C01351e(this, c0786Rv, strA04, c7cA03);
        if (c01351e.A08()) {
            c01351e.A07();
            return;
        }
        if (!TextUtils.isEmpty(this.A02.A0Q())) {
            C7B c7b = new C7B(this.A02.A0Q(), this.A02.A0T(), strA04);
            c7b.A04 = true;
            c7b.A03 = A04(65, 5, 43);
            c7cA03.A0S(c7b);
        }
        c7cA03.A0R(new AnonymousClass79(this.A02.A0N().A01(), C0697Oj.A04, C0697Oj.A04, this.A02.A0T(), A04(0, 12, 6)));
        boolean zContains = enumSet.contains(CacheFlag.VIDEO);
        int i = 0;
        for (C1A c1a : this.A02.A0V()) {
            AnonymousClass79 anonymousClass79 = new AnonymousClass79(c1a.A0D().A07(), C01361f.A00(c1a.A0D()), C01361f.A01(c1a.A0D()), this.A02.A0T(), A04(0, 12, 6));
            if (i == 0) {
                c7cA03.A0Q(anonymousClass79);
            } else {
                c7cA03.A0R(anonymousClass79);
            }
            Iterator<String> it = c1a.A0G().A00().iterator();
            while (it.hasNext()) {
                c7cA03.A0R(new AnonymousClass79(it.next(), -1, -1, this.A02.A0T(), A04(0, 12, 6)));
            }
            if (zContains && !TextUtils.isEmpty(c1a.A0D().A08())) {
                C7B c7b2 = new C7B(c1a.A0D().A08(), this.A02.A0T(), A04(0, 12, 6), c1a.A0D().A05());
                c7b2.A04 = false;
                if (i == 0) {
                    c7cA03.A0V(c7b2);
                } else {
                    c7cA03.A0U(c7b2);
                }
            }
            i++;
        }
        c7cA03.A0P(new C0788Rx(this), new AnonymousClass75(this.A02.A0T(), strA04));
    }

    private void A08(EnumC0677Np enumC0677Np) {
        this.A01 = enumC0677Np;
    }

    public final EnumC0592Ke A09() {
        C0790Rz c0790Rz = this;
        char c2 = !TextUtils.isEmpty(c0790Rz.A02.A0Q()) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (Build.VERSION.SDK_INT < 21) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return EnumC0592Ke.A03;
                case 4:
                    c0790Rz = c0790Rz;
                    if (c0790Rz.A02.A0V().size() <= 1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return EnumC0592Ke.A06;
                case 6:
                    c0790Rz = c0790Rz;
                    if (c0790Rz.A02.A0L().A0D().A06() == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return EnumC0592Ke.A08;
                case '\b':
                    c0790Rz = c0790Rz;
                    if (!c0790Rz.A0F()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return EnumC0592Ke.A09;
                case '\n':
                    return EnumC0592Ke.A07;
            }
        }
    }

    public final EnumC0677Np A0A() {
        return this.A01;
    }

    public final String A0B() {
        return this.A02.A0P();
    }

    public final void A0C() {
        this.A03.ADg();
    }

    public final void A0D(Intent intent, RewardData rewardData, String str) {
        this.A02.A0Z(rewardData);
        this.A02.A0c(str);
        intent.putExtra(A04(77, 14, 58), this.A02);
    }

    public final void A0E(XI xi, EnumSet<CacheFlag> enumSet) {
        C0790Rz c0790Rz = this;
        AdError adErrorA00 = c0790Rz.A00(xi);
        char c2 = adErrorA00 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0790Rz.A03.A8m(adErrorA00);
                    return;
                case 3:
                    c0790Rz = c0790Rz;
                    c0790Rz.A03.ACG();
                    if (c0790Rz.A09() != EnumC0592Ke.A08) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0790Rz = c0790Rz;
                    xi = xi;
                    enumSet = enumSet;
                    c0790Rz.A06(xi, enumSet);
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c0790Rz = c0790Rz;
                    xi = xi;
                    enumSet = enumSet;
                    c0790Rz.A07(xi, enumSet);
                    c2 = 5;
                    break;
            }
        }
    }

    public final boolean A0F() {
        return !TextUtils.isEmpty(this.A02.A0L().A0D().A08());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01270w
    public final void A97() {
        this.A03.A8n();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01270w
    public final void A98() {
        this.A03.A8m(AdError.CACHE_ERROR);
    }
}

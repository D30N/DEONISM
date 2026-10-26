package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Fc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0464Fc extends AbstractC0782Rr implements InterfaceC01270w {
    public static byte[] A0C;
    public long A00;
    public AnonymousClass13 A01;
    public AnonymousClass14 A02;
    public AnonymousClass17 A03;
    public XI A04;
    public C0565Jd A05;
    public EnumC0592Ke A06;
    public String A07;

    @Nullable
    public String A08;
    public String A09;
    public final String A0A = UUID.randomUUID().toString();
    public final AtomicBoolean A0B = new AtomicBoolean();

    static {
        A05();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 66);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A0C = new byte[]{118, 97, 115, 101, 118, 96, 97, 96, 82, 109, 96, 97, 107, 69, 96, 64, 101, 112, 101, 70, 113, 106, 96, 104, 97, 116, 72, 73, 74, 69, 66, 69, 88, 69, 67, 66, 91, 68, 72, 90, 121, 84, 93, 72, 30, 9, 27, 13, 30, 8, 9, 8, 51, 26, 5, 8, 9, 3, 54, 52, 52, 50, 59, 50, 37, 56, 58, 50, 35, 50, 37, 8, 37, 56, 35, 54, 35, 62, 56, 57, 88, 79, 91, 95, 79, 89, 94, 126, 67, 71, 79, 125, Byte.MAX_VALUE, 104, 105, 104, 107, 100, 99, 104, 105, 66, Byte.MAX_VALUE, 100, 104, 99, 121, 108, 121, 100, 98, 99, 70, 104, 116, 100, Byte.MAX_VALUE, 120, 96, 100, 116, 88, 117, 108, 123, 105, Byte.MAX_VALUE, 108, 122, 77, 123, 108, 104, 123, 108, 75, 76, 82, 31, 26, 15, 26, 56, 55, 50, 62, 53, 47, 15, 52, 48, 62, 53, 62, 34, 47, 45, 43, 35, 43, 32, 58, 7, 42, 116, 124, 125, 112, 120, 109, 112, 118, 119, 93, 120, 109, 120};
    }

    private void A03() {
        C2G c2gA00 = C2G.A00(this.A04);
        AnonymousClass14 anonymousClass14 = this.A02;
        c2gA00.A06(anonymousClass14, anonymousClass14.A00());
    }

    private void A04() {
        if (this.A02 != null) {
            try {
                C2G.A00(this.A04).A05(this.A02);
            } catch (Exception unused) {
            }
        }
    }

    private void A06(Intent intent) {
        C0464Fc c0464Fc = this;
        int i = ((AbstractC0782Rr) c0464Fc).A00;
        String strA01 = A01(91, 24, 79);
        char c2 = i != -1 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0464Fc = c0464Fc;
                    if (Settings.System.getInt(c0464Fc.A04.getContentResolver(), A01(58, 22, 21), 0) == 1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0464Fc = c0464Fc;
                    intent = intent;
                    strA01 = strA01;
                    intent.putExtra(strA01, ((AbstractC0782Rr) c0464Fc).A00);
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    c0464Fc = c0464Fc;
                    if (!JQ.A0Z(c0464Fc.A04)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 6:
                    intent = intent;
                    strA01 = strA01;
                    intent.putExtra(strA01, 6);
                    c2 = 4;
                    break;
            }
        }
    }

    private void A07(boolean z) {
        C0464Fc c0464Fc = this;
        char c2 = c0464Fc.A06 == EnumC0592Ke.A0B ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0464Fc = c0464Fc;
                    c0464Fc.A09(z);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c0464Fc = c0464Fc;
                    if (c0464Fc.A06 != EnumC0592Ke.A0A) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0464Fc = c0464Fc;
                    c0464Fc.A08(z);
                    c2 = 3;
                    break;
                case 6:
                    c0464Fc = c0464Fc;
                    c0464Fc.A09(z);
                    c2 = 3;
                    break;
            }
        }
    }

    private void A08(boolean z) {
        C0464Fc c0464Fc = this;
        C0771Rg c0771Rg = new C0771Rg(c0464Fc, c0464Fc);
        C7C c7c = new C7C(c0464Fc.A04);
        C01351e c01351e = new C01351e(c0464Fc, c0464Fc.A03, A01(44, 14, 46), c7c);
        char c2 = c01351e.A08() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0464Fc = c0464Fc;
                    c7c = c7c;
                    c01351e = c01351e;
                    c7c.A0W(new C0565Jd(c0464Fc.A03.A0P(), c0464Fc.A04.A06()));
                    c01351e.A07();
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c0464Fc = c0464Fc;
                    c0771Rg = c0771Rg;
                    C01401j.A02(c0464Fc.A04, c0464Fc.A03, z, c0771Rg);
                    c2 = 3;
                    break;
            }
        }
    }

    private void A09(boolean z) {
        C0464Fc c0464Fc = this;
        C0787Rw adDataBundle = null;
        AbstractC0782Rr adapter = null;
        C7C c7c = new C7C(c0464Fc.A04);
        c7c.A0W(c0464Fc.A05);
        AnonymousClass17 anonymousClass17 = c0464Fc.A03;
        String strA01 = A01(44, 14, 46);
        C01351e c01351e = new C01351e(c0464Fc, anonymousClass17, strA01, c7c);
        char c2 = c01351e.A08() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c01351e = c01351e;
                    c01351e.A07();
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c0464Fc = c0464Fc;
                    adDataBundle = (C0787Rw) c0464Fc.A03;
                    adapter = c0464Fc;
                    if (!TextUtils.isEmpty(adDataBundle.A0L().A0D().A08())) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0464Fc.A01.AAx((C0464Fc) adapter, AdError.INTERNAL_ERROR);
                    return;
                case 6:
                    c0464Fc = c0464Fc;
                    c7c = c7c;
                    strA01 = strA01;
                    adDataBundle = adDataBundle;
                    adapter = (C0464Fc) adapter;
                    C01411k.A02(c7c, adDataBundle);
                    c7c.A0P(new C0468Fi(c0464Fc, z, adapter), new AnonymousClass75(adDataBundle.A0T(), strA01));
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0782Rr
    public final int A0A() {
        AnonymousClass17 anonymousClass17 = this.A03;
        if (anonymousClass17 == null) {
            return -1;
        }
        return anonymousClass17.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0782Rr
    public final boolean A0B() {
        C0464Fc c0464Fc = this;
        String str = null;
        AdActivityIntent adActivityIntentA04 = null;
        String strA03 = null;
        char c2 = !c0464Fc.A0B.get() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    c0464Fc = c0464Fc;
                    strA03 = C0711Oy.A03(((AbstractC0782Rr) c0464Fc).A01, c0464Fc.A0A, c0464Fc.A07);
                    c0464Fc.A03.A0Z(((AbstractC0782Rr) c0464Fc).A01);
                    c0464Fc.A03.A0c(strA03);
                    adActivityIntentA04 = LA.A04(c0464Fc.A04);
                    adActivityIntentA04.putExtra(A01(36, 8, 111), c0464Fc.A06);
                    adActivityIntentA04.putExtra(A01(0, 25, 70), c0464Fc.A03);
                    adActivityIntentA04.putExtra(A01(k.AppCompatTheme_windowActionBar, 8, 83), c0464Fc.A0A);
                    if (strA03 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    strA03 = strA03;
                    adActivityIntentA04 = adActivityIntentA04;
                    adActivityIntentA04.putExtra(A01(k.AppCompatTheme_windowMinWidthMinor, 15, 92), strA03);
                    c2 = 5;
                    break;
                case 5:
                    c0464Fc = c0464Fc;
                    adActivityIntentA04 = adActivityIntentA04;
                    adActivityIntentA04.putExtra(A01(153, 11, 12), c0464Fc.A09);
                    adActivityIntentA04.putExtra(A01(80, 11, 104), c0464Fc.A00);
                    str = c0464Fc.A08;
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
                    adActivityIntentA04.putExtra(A01(164, 13, 91), str);
                    c2 = 7;
                    break;
                case 7:
                    C0464Fc c0464Fc2 = c0464Fc;
                    AdActivityIntent adActivityIntent = adActivityIntentA04;
                    c0464Fc2.A06(adActivityIntent);
                    adActivityIntent.setFlags(adActivityIntent.getFlags() | 268435456);
                    adActivityIntent.putExtra(A01(142, 11, 25), c0464Fc2.A03.A0P());
                    LA.A09(c0464Fc2.A04, adActivityIntent);
                    return true;
            }
        }
    }

    public final void A0C(XI xi, AnonymousClass13 anonymousClass13, Map<String, Object> map, boolean z, @Nullable String str, @Nullable String str2) {
        C0464Fc c0464Fc = this;
        int iA0H = 0;
        String strA01 = null;
        c0464Fc.A0B.set(false);
        c0464Fc.A04 = xi;
        c0464Fc.A01 = anonymousClass13;
        c0464Fc.A09 = (String) map.get(A01(153, 11, 12));
        c0464Fc.A00 = ((Long) map.get(A01(80, 11, 104))).longValue();
        c0464Fc.A08 = str2;
        String str3 = c0464Fc.A09;
        char c2 = str3 != null ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    str3 = str3;
                    strA01 = str3.split(A01(25, 1, 105))[0];
                    c2 = 3;
                    break;
                case 3:
                    c0464Fc = c0464Fc;
                    xi = xi;
                    map = map;
                    str = str;
                    strA01 = strA01;
                    c0464Fc.A07 = strA01;
                    c0464Fc.A03 = C0787Rw.A01((JSONObject) map.get(A01(138, 4, 57)));
                    c0464Fc.A03.A0a(str);
                    c0464Fc.A03.A0Y(((C03198t) map.get(A01(26, 10, 110))).A06());
                    c0464Fc.A05 = new C0565Jd(c0464Fc.A03.A0P(), xi.A06());
                    if (!TextUtils.isEmpty(c0464Fc.A03.A0Q())) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 4:
                    if (Build.VERSION.SDK_INT < 21) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0464Fc = c0464Fc;
                    c0464Fc.A06 = EnumC0592Ke.A04;
                    c0464Fc.A04.A0A().ADD(EnumC01080d.A05);
                    c2 = 6;
                    break;
                case 6:
                    C0464Fc c0464Fc2 = c0464Fc;
                    c0464Fc2.A02 = new AnonymousClass14(c0464Fc2.A0A, c0464Fc2, anonymousClass13);
                    c0464Fc2.A03();
                    c0464Fc2.A07(z);
                    return;
                case 7:
                    c0464Fc = c0464Fc;
                    iA0H = c0464Fc.A03.A0H();
                    if (iA0H == 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (iA0H == 1) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case '\t':
                    c0464Fc = c0464Fc;
                    c0464Fc.A06 = EnumC0592Ke.A0A;
                    c0464Fc.A04.A0A().ADD(EnumC01080d.A07);
                    c2 = 6;
                    break;
                case '\n':
                    c0464Fc = c0464Fc;
                    c0464Fc.A06 = EnumC0592Ke.A0B;
                    c0464Fc.A04.A0A().ADD(EnumC01080d.A08);
                    c2 = 6;
                    break;
                case 11:
                    strA01 = A01(44, 0, 74);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01180n
    public final String A5k() {
        return this.A03.A0P();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01270w
    public final void A97() {
        this.A0B.set(true);
        this.A01.AAu(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01270w
    public final void A98() {
        this.A01.AAx(this, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01180n
    public final void onDestroy() {
        A04();
    }
}

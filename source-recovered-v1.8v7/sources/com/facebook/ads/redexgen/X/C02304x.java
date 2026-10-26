package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.api.Repairable;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02304x implements AudienceNetworkActivityApi, Repairable {
    public static byte[] A0P;
    public int A00;
    public int A02;
    public long A03;
    public long A04;
    public Intent A05;
    public RelativeLayout A06;
    public C0565Jd A07;
    public EnumC0592Ke A08;

    @Nullable
    public MR A09;
    public N0 A0A;
    public C0674Nm A0B;

    @Nullable
    public C0703Op A0C;
    public String A0D;
    public String A0E;

    @Nullable
    public String A0F;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final AudienceNetworkActivity A0L;
    public final AudienceNetworkActivityApi A0M;
    public final XI A0N;
    public final List<InterfaceC02284v> A0O = new ArrayList();
    public int A01 = -1;
    public boolean A0G = false;

    static {
        A07();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0P, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 89);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A0P = new byte[]{83, 95, 93, 30, 86, 81, 83, 85, 82, 95, 95, 91, 30, 81, 84, 67, 30, 89, 94, 68, 85, 66, 67, 68, 89, 68, 89, 81, 92, 30, 81, 83, 68, 89, 70, 89, 68, 73, 111, 84, 85, 67, 68, 66, 95, 73, 85, 84, 12, 0, 2, 65, 9, 14, 12, 10, 13, 0, 0, 4, 65, 14, 11, 28, 65, 6, 1, 27, 10, 29, 28, 27, 6, 27, 6, 14, 3, 65, 11, 6, 28, 31, 3, 14, 22, 10, 11, 60, 48, 50, 113, 57, 62, 60, 58, 61, 48, 48, 52, 113, 62, 59, 44, 113, 54, 49, 43, 58, 45, 44, 43, 54, 43, 54, 62, 51, 113, 54, 50, 47, 45, 58, 44, 44, 54, 48, 49, 113, 51, 48, 56, 56, 58, 59, 89, 84, 91, 81, 70, 86, 84, 69, 80, 41, 38, 23, 41, 43, 60, 33, 62, 33, 60, 49, 89, 70, 74, 88, 123, 86, 95, 74, 87, 91, 89, 26, 82, 85, 87, 81, 86, 91, 91, 95, 26, 85, 80, 71, 26, 93, 90, 64, 81, 70, 71, 64, 93, 64, 93, 85, 88, 26, 81, 70, 70, 91, 70, 100, 95, 80, 83, 93, 84, 17, 69, 94, 17, 88, 95, 87, 84, 67, 17, 71, 88, 84, 70, 101, 72, 65, 84, 17, 87, 67, 94, 92, 17, 88, 95, 69, 84, 95, 69, 17, 94, 67, 17, 66, 80, 71, 84, 85, 120, 95, 66, 69, 80, 95, 82, 84, 98, 69, 80, 69, 84, 41, 62, 42, 46, 62, 40, 47, 15, 50, 54, 62, 85, 74, 87, 81, 87, 68, 76, 81, 14, 21, 37, 21, 8, 19, 31, 20, 14, 27, 14, 19, 21, 20, 119, 117, 98, 99, 98, 97, 110, 105, 98, 99, 72, 117, 110, 98, 105, 115, 102, 115, 110, 104, 105, 76, 98, 126, 32, 59, 60, 36, 32, 48, 28, 49, 9, 94, 81, 84, 88, 83, 73, 105, 82, 86, 88, 83, 59, 55, 53, 118, 62, 57, 59, 61, 58, 55, 55, 51, 118, 57, 60, 43, 118, 49, 54, 44, 61, 42, 43, 44, 49, 44, 49, 57, 52, 118, 62, 49, 54, 49, 43, 48, 7, 57, 59, 44, 49, 46, 49, 44, 33, 92, 80, 82, 17, 89, 94, 92, 90, 93, 80, 80, 84, 17, 94, 91, 76, 17, 86, 81, 75, 90, 77, 76, 75, 86, 75, 86, 94, 83, 17, 91, 86, 76, 82, 86, 76, 76, 90, 91, 80, 113, 118, 97, 115, 56, 52, 54, 117, 61, 58, 56, 62, 57, 52, 52, 48, 117, 58, 63, 40, 117, 58, 63, 41, 62, 43, 52, 41, 47, 50, 53, 60, 117, 29, 18, 21, 18, 8, 19, 4, 26, 31, 4, 9, 30, 11, 20, 9, 15, 18, 21, 28, 4, 29, 23, 20, 12, 108, 116, 118, 111, 94, 121, 107, 122, 109, 76, 122, 124, 112, 113, 123, 108, 121, 101, 104, 106, 108, 100, 108, 103, 125, 64, 109, 55, 63, 62, 51, 59, 46, 51, 53, 52, 30, 59, 46, 59, 27, 8, 27, 16, 10};
    }

    public C02304x(AudienceNetworkActivity audienceNetworkActivity, AudienceNetworkActivityApi audienceNetworkActivityApi) {
        this.A0L = audienceNetworkActivity;
        this.A0M = audienceNetworkActivityApi;
        this.A0N = AnonymousClass53.A01(audienceNetworkActivity);
        this.A0N.A0C(this);
    }

    @Nullable
    private MR A01(Intent intent) {
        C02274u c02274u = new C02274u(this, intent, this.A0N.A06(), this.A0N, null);
        if (this.A08 == null) {
            return null;
        }
        switch (this.A08) {
        }
        return null;
    }

    private void A05() {
        C02304x c02304x = this;
        String str = c02304x.A0F;
        char c2 = str != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c02304x = c02304x;
                    str = str;
                    c02304x.A0C = C0702Oo.A01(c02304x.A0N, str);
                    if (c02304x.A0C == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c02304x = c02304x;
                    c02304x.A06.addView(c02304x.A0C, new RelativeLayout.LayoutParams(-1, -1));
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A06() {
        C02304x c02304x = this;
        char c2 = !c02304x.A0J ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c02304x = c02304x;
                    if (!c02304x.A0G()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c02304x = c02304x;
                    c02304x.A0D(PE.A03.A02());
                    c2 = 4;
                    break;
                case 4:
                    c02304x = c02304x;
                    c02304x.A0J = true;
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c02304x = c02304x;
                    c02304x.A0D(A04(0, 48, 105));
                    c2 = 4;
                    break;
            }
        }
    }

    private void A08(Intent intent) {
        C02304x c02304x = this;
        long longExtra = 0;
        char c2 = JQ.A0m(c02304x.A0L) ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    c02304x = c02304x;
                    if (c02304x.A08 == EnumC0592Ke.A02) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (Build.VERSION.SDK_INT < 18) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c02304x = c02304x;
                    intent = intent;
                    c02304x.A0B = new C0674Nm();
                    c02304x.A0B.A0C(intent.getStringExtra(A04(490, 11, 80)));
                    c02304x.A0B.A0B(c02304x.A0L.getPackageName());
                    longExtra = intent.getLongExtra(A04(255, 11, 2), 0L);
                    if (longExtra == 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c02304x = c02304x;
                    c02304x.A0B.A09(longExtra);
                    c2 = 6;
                    break;
                case 6:
                    c02304x = c02304x;
                    TextView textView = new TextView(c02304x.A0L);
                    textView.setText(A04(416, 5, 77));
                    textView.setTextColor(-1);
                    C0635Ly.A0P(textView, Color.argb(160, 0, 0, 0));
                    textView.setPadding(5, 5, 5, 5);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(12, -1);
                    layoutParams.addRule(11, -1);
                    textView.setLayoutParams(layoutParams);
                    ViewOnLongClickListenerC02294w viewOnLongClickListenerC02294w = new ViewOnLongClickListenerC02294w(c02304x);
                    textView.setOnLongClickListener(viewOnLongClickListenerC02294w);
                    c02304x.A06.setOnLongClickListener(viewOnLongClickListenerC02294w);
                    c02304x.A06.getOverlay().add(c02304x.A0B);
                    c2 = 7;
                    break;
                case 7:
                    return;
            }
        }
    }

    private void A09(Intent intent, @Nullable Bundle bundle) {
        String strA04 = A04(154, 8, k.AppCompatTheme_windowFixedHeightMajor);
        String strA042 = A04(312, 8, 12);
        String strA043 = A04(288, 24, 94);
        if (bundle != null) {
            Bundle adnwSavedStateBundle = LA.A02(bundle, DynamicLoaderImpl.class.getClassLoader());
            this.A01 = adnwSavedStateBundle.getInt(strA043, -1);
            this.A0D = adnwSavedStateBundle.getString(strA042);
            this.A08 = (EnumC0592Ke) adnwSavedStateBundle.getSerializable(strA04);
            return;
        }
        this.A01 = intent.getIntExtra(strA043, -1);
        this.A0D = intent.getStringExtra(strA042);
        this.A08 = (EnumC0592Ke) intent.getSerializableExtra(strA04);
        this.A02 = intent.getIntExtra(A04(474, 16, 70), 0) * AdError.NETWORK_ERROR_CODE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(String str) {
        C02304x c02304x = this;
        char c2 = !A04(87, 47, 6).equals(str) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!PE.A0A.A02().equals(str)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c02304x = c02304x;
                    c02304x.A0I = true;
                    c2 = 4;
                    break;
                case 4:
                    str = str;
                    if (!A04(162, 35, 109).equals(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    str = str;
                    if (!PE.A09.A02().equals(str)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c02304x = c02304x;
                    c02304x.A0H = true;
                    c2 = 7;
                    break;
                case 7:
                    str = str;
                    if (!A04(421, 53, 2).equals(str)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c02304x.finish(9);
                    return;
                case '\t':
                    str = str;
                    if (!A04(332, 45, 1).equals(str)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c02304x.finish(10);
                    return;
                case 11:
                    c02304x.A0F(str, null);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(String str, C1R c1r) {
        C1R c1r2 = c1r;
        String str2 = str;
        C02304x c02304x = this;
        char c2 = c02304x.A09 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c02304x = c02304x;
                    if (c02304x.A0A != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c02304x = c02304x;
                    str2 = str2;
                    c1r2 = c1r2;
                    XI xi = c02304x.A0N;
                    c02304x.A0A = N1.A02(xi, xi.A06(), str2, c1r2, c02304x.A09, new TM(c02304x));
                    c02304x.A0A.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    c2 = 5;
                    break;
                case 5:
                    C02304x c02304x2 = c02304x;
                    C0635Ly.A0M(c02304x2.A0A);
                    C0635Ly.A0X(c02304x2.A06);
                    c02304x2.A06.addView(c02304x2.A0A);
                    c02304x2.A0A.A0J();
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(String str, @Nullable C9A c9a) {
        Intent intent = new Intent(str + A04(320, 1, 106) + this.A0D);
        if (c9a != null) {
            intent.putExtra(A04(514, 5, 39), c9a);
        }
        C2G.A00(this.A0L).A07(intent);
    }

    private boolean A0G() {
        C02304x c02304x = this;
        boolean z = false;
        char c2 = c02304x.A08 != EnumC0592Ke.A0B ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c02304x = c02304x;
                    if (c02304x.A08 != EnumC0592Ke.A0A) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public final AudienceNetworkActivity A0H() {
        return this.A0L;
    }

    public final XI A0I() {
        return this.A0N;
    }

    public final void A0J() {
        C02304x c02304x = this;
        char c2 = c02304x.A0G() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c02304x = c02304x;
                    c02304x.A0D(PE.A09.A02());
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c02304x = c02304x;
                    c02304x.A0D(A04(162, 35, 109));
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A0K(InterfaceC02284v interfaceC02284v) {
        this.A0O.add(interfaceC02284v);
    }

    public final void A0L(InterfaceC02284v interfaceC02284v) {
        this.A0O.remove(interfaceC02284v);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void finish(int i) {
        C02304x c02304x = this;
        c02304x.A0N.A0A().A2Q(String.valueOf(c02304x.A0H().hashCode()), i);
        char c2 = c02304x.A0L.isFinishing() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c02304x = c02304x;
                    if (!JQ.A11(c02304x.A0N)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c02304x = c02304x;
                    if (!c02304x.A0I) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 5:
                    c02304x = c02304x;
                    if (!c02304x.A0H) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    c02304x = c02304x;
                    c02304x.A0N.A0A().A8c();
                    c02304x.A0J();
                    c2 = 7;
                    break;
                case 7:
                    c02304x = c02304x;
                    if (!c02304x.A0G()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c02304x = c02304x;
                    if (!c02304x.A0G) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case '\t':
                    c02304x = c02304x;
                    c02304x.A0D(PE.A05.A02());
                    c2 = '\n';
                    break;
                case '\n':
                    C02304x c02304x2 = c02304x;
                    c02304x2.A06();
                    c02304x2.A0M.finish(i);
                    return;
                case 11:
                    c02304x = c02304x;
                    c02304x.A0D(A04(377, 39, 102));
                    c2 = '\n';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onBackPressed() {
        C02304x c02304x = this;
        boolean z = false;
        Iterator<InterfaceC02284v> it = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c02304x.A03 += jCurrentTimeMillis - c02304x.A04;
        c02304x.A04 = jCurrentTimeMillis;
        char c2 = c02304x.A03 > ((long) c02304x.A02) ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    c02304x = c02304x;
                    z = false;
                    it = c02304x.A0O.iterator();
                    c2 = 3;
                    break;
                case 3:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    it = it;
                    if (!it.next().A7X()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z = true;
                    c2 = 3;
                    break;
                case 6:
                    if (!z) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    c02304x = c02304x;
                    c02304x.A0M.onBackPressed();
                    c2 = '\b';
                    break;
                case '\b':
                    return;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onConfigurationChanged(Configuration configuration) {
        C02304x c02304x = this;
        String strA04 = null;
        HashMap map = null;
        MR mr = c02304x.A09;
        char c2 = mr instanceof C1029ab ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    configuration = configuration;
                    mr = mr;
                    ((C1029ab) mr).onConfigurationChanged(configuration);
                    c2 = 3;
                    break;
                case 3:
                    c02304x = c02304x;
                    configuration = configuration;
                    if (c02304x.A00 == configuration.orientation) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    configuration = configuration;
                    map = new HashMap();
                    int i = configuration.orientation;
                    strA04 = A04(274, 14, 35);
                    if (i != 1) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    map = map;
                    strA04 = strA04;
                    map.put(strA04, A04(266, 8, k.AppCompatTheme_windowNoTitle));
                    c2 = 6;
                    break;
                case 6:
                    c02304x = c02304x;
                    configuration = configuration;
                    map = map;
                    c02304x.A07.A02(EnumC0564Jc.A0J, map);
                    c02304x.A00 = configuration.orientation;
                    c2 = 7;
                    break;
                case 7:
                    return;
                case '\b':
                    map = map;
                    strA04 = strA04;
                    map.put(strA04, A04(134, 9, 108));
                    c2 = 6;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onCreate(@Nullable Bundle bundle) {
        C02304x c02304x = this;
        String strA04 = null;
        MR mr = null;
        M0.A02();
        c02304x.A05 = LA.A01(c02304x.A0L.getIntent(), DynamicLoaderImpl.class.getClassLoader());
        XI xiA03 = LA.A03(c02304x.A05);
        char c2 = xiA03 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c02304x = c02304x;
                    xiA03 = xiA03;
                    c02304x.A0N.A0B(xiA03.A0A());
                    c02304x.A0N.A08(xiA03.A07());
                    c2 = 3;
                    break;
                case 3:
                    c02304x = c02304x;
                    bundle = bundle;
                    c02304x.A0N.A0A().A2R(String.valueOf(c02304x.A0H().hashCode()));
                    c02304x.A0L.requestWindowFeature(1);
                    c02304x.A0L.getWindow().setFlags(1024, 1024);
                    c02304x.A06 = new RelativeLayout(c02304x.A0L);
                    C0635Ly.A0P(c02304x.A06, 0);
                    c02304x.A0L.setContentView(c02304x.A06, new RelativeLayout.LayoutParams(-1, -1));
                    c02304x.A09(c02304x.A05, bundle);
                    c02304x.A09 = c02304x.A01(c02304x.A05);
                    mr = c02304x.A09;
                    if (mr != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    C02304x c02304x2 = c02304x;
                    c02304x2.A0N.A04().A83(A04(143, 11, 17), C03008a.A02, new C03018b(A04(197, 58, 104)));
                    c02304x2.A0J();
                    c02304x2.finish(7);
                    return;
                case 5:
                    c02304x = c02304x;
                    bundle = bundle;
                    mr = mr;
                    mr.A7s(c02304x.A05, bundle, c02304x);
                    c02304x.A0D(A04(48, 39, 54));
                    c02304x.A04 = System.currentTimeMillis();
                    c02304x.A0F = c02304x.A05.getStringExtra(A04(501, 13, 3));
                    c02304x.A05();
                    c02304x.A08(c02304x.A05);
                    c02304x.A00 = c02304x.A0L.getResources().getConfiguration().orientation;
                    strA04 = A04(321, 11, 100);
                    if (bundle == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c02304x = c02304x;
                    bundle = bundle;
                    strA04 = strA04;
                    c02304x.A0E = bundle.getString(strA04);
                    c2 = 7;
                    break;
                case 7:
                    C02304x c02304x3 = c02304x;
                    c02304x3.A07 = new C0565Jd(c02304x3.A0E, c02304x3.A0N.A06());
                    return;
                case '\b':
                    c02304x = c02304x;
                    strA04 = strA04;
                    c02304x.A0E = c02304x.A05.getStringExtra(strA04);
                    c2 = 7;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onDestroy() {
        C02304x c02304x = this;
        N0 n0 = null;
        MR mr = null;
        c02304x.A0N.A0A().A2S(String.valueOf(c02304x.A0H().hashCode()));
        c02304x.A06();
        RelativeLayout relativeLayout = c02304x.A06;
        char c2 = relativeLayout != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    relativeLayout = relativeLayout;
                    relativeLayout.removeAllViews();
                    c2 = 3;
                    break;
                case 3:
                    c02304x = c02304x;
                    mr = c02304x.A09;
                    if (mr == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c02304x = c02304x;
                    mr = mr;
                    mr.onDestroy();
                    c02304x.A09 = null;
                    c2 = 5;
                    break;
                case 5:
                    c02304x = c02304x;
                    if (c02304x.A0B == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c02304x = c02304x;
                    if (!JQ.A0m(c02304x.A0L)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c02304x = c02304x;
                    c02304x.A0B.A07();
                    c2 = '\b';
                    break;
                case '\b':
                    c02304x = c02304x;
                    n0 = c02304x.A0A;
                    if (n0 == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    n0 = n0;
                    n0.A0I();
                    c2 = '\n';
                    break;
                case '\n':
                    return;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onPause() {
        C02304x c02304x = this;
        c02304x.A0N.A0A().A2T(String.valueOf(c02304x.A0H().hashCode()));
        c02304x.A03 += System.currentTimeMillis() - c02304x.A04;
        MR mr = c02304x.A09;
        char c2 = mr != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c02304x = c02304x;
                    mr = mr;
                    mr.AAT(false);
                    if (!c02304x.A0L.isFinishing()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c02304x = c02304x;
                    c02304x.A07.A02(EnumC0564Jc.A0D, null);
                    c02304x.A0K = true;
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onResume() {
        C02304x c02304x = this;
        c02304x.A0N.A0A().A2U(String.valueOf(c02304x.A0H().hashCode()));
        c02304x.A04 = System.currentTimeMillis();
        MR mr = c02304x.A09;
        char c2 = mr != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c02304x = c02304x;
                    mr = mr;
                    mr.AAq(false);
                    if (!c02304x.A0K) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c02304x = c02304x;
                    c02304x.A07.A02(EnumC0564Jc.A0E, null);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        MR mr = this.A09;
        if (mr != null) {
            mr.ACm(bundle2);
        }
        bundle2.putInt(A04(288, 24, 94), this.A01);
        bundle2.putString(A04(312, 8, 12), this.A0D);
        bundle2.putString(A04(321, 11, 100), this.A0E);
        bundle2.putSerializable(A04(154, 8, k.AppCompatTheme_windowFixedHeightMajor), this.A08);
        LA.A08(bundle, bundle2);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStart() {
        this.A0N.A0A().A2V(String.valueOf(A0H().hashCode()));
        int i = this.A01;
        if (i != -1) {
            MH.A02(this.A0L, i, this.A0N);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStop() {
        this.A0N.A0A().A2W(String.valueOf(A0H().hashCode()));
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C02485q.A02(null, motionEvent);
        return this.A0M.onTouchEvent(motionEvent);
    }

    @Override // com.facebook.ads.internal.api.Repairable
    public final void repair(Throwable th) {
        A0J();
        finish(5);
    }
}

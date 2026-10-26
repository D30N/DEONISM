package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ms, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0654Ms implements InterfaceC0619Li<Bundle> {
    public static byte[] A0C;
    public int A00;
    public int A01;

    @Nullable
    public String A02;

    @Nullable
    public String A03;
    public boolean A04;
    public final C0793Sc A05;
    public final XI A06;
    public final JW A07;
    public final P6 A08;
    public final PB A09;
    public final String A0A;

    @Nullable
    public final Map<String, String> A0B;

    static {
        A0O();
    }

    public static String A0G(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 11);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0O() {
        A0C = new byte[]{-60, -70, -69, -85, -84, -108, -103, -3, -9, -17, -46, -45, -55, -67, -44, -87, -86, -108, -113, -127, -122, 124, -121, -113, -117, -98, -107, -106, -110, -121, -97, -117, -104, -50, -56, -49, -39, -38, -48, -51, -49, -62, -51, -54, -62, -124, 121, -117, -116, 90, -121, -115, -122, 124, 121, -118, -111, 108, -127, -123, 125, 101, 107, -45, -43, -26, -37, -31, -32, -116, -126, -107, -109, 126, -116, -110, -93, -97, -56, -55, -79, -60, -59, -64, -122, -119, 118, -102, -122, -111, -114, -103, -98, 114, -122, -109, -122, -116, -118, -105, -27, -37, -48, -106, -102, -113, -109, -117, -102, -83, -94, -90, -98, -104, -90, -84, -101, -94, -11, -21, -23, -4, -25, -11, -5, -16, -18, -29, -25, -33, -39, -25, -19, -9, -19, -18, -30, -7, -16, -12, -110, -121, -103, -102, 118, -104, -107, -115, -104, -117, -103, -103, 122, -113, -109, -117, 115, 121, -32, -43, -39, -47};
    }

    public C0654Ms(XI xi, JW jw, P6 p6, List<AnonymousClass21> list, String str, boolean z) {
        this(xi, jw, p6, list, str, z, null);
    }

    public C0654Ms(XI xi, JW jw, P6 p6, List<AnonymousClass21> list, String str, boolean z, @Nullable Bundle bundle) {
        this(xi, jw, p6, list, str, z, bundle, null);
    }

    public C0654Ms(XI xi, JW jw, P6 p6, List<AnonymousClass21> list, String str, boolean z, @Nullable Bundle bundle, @Nullable Map<String, String> map) {
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
        this.A03 = null;
        this.A06 = xi;
        this.A07 = jw;
        this.A08 = p6;
        this.A0A = str;
        this.A0B = map;
        this.A04 = z;
        list.add(new C0662Na(this, 0.5d, -1.0d, 2.0d, true));
        list.add(new N3(this, 1.0E-7d, -1.0d, 0.001d, false));
        if (bundle != null) {
            this.A05 = new C0793Sc(p6.getView(), list, bundle.getBundle(A0G(84, 16, 26)), xi);
            this.A01 = bundle.getInt(A0G(140, 18, 27));
            this.A00 = bundle.getInt(A0G(45, 18, 13));
        } else {
            this.A05 = new C0793Sc(p6.getView(), list, xi);
        }
        this.A09 = new PB(new Handler(), this);
    }

    private final float A0E() {
        return C0631Lu.A00(this.A06) * this.A08.getVolume();
    }

    private Map<String, String> A0I(int i) {
        boolean z = false;
        HashMap<String, String> map = new HashMap<>();
        char c2 = this.A08.getVideoStartReason() == PC.A03 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    C0654Ms c0654Ms = this;
                    HashMap<String, String> map2 = map;
                    C0631Lu.A03(map2, z, !c0654Ms.A08.A7g());
                    c0654Ms.A0R(map2);
                    c0654Ms.A0Q(map2);
                    c0654Ms.A0T(map2, i);
                    c0654Ms.A0S(map2);
                    c0654Ms.A0P(map2);
                    return map2;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A0J(P7 p7) {
        return A0K(p7, this.A08.getCurrentPositionInMillis());
    }

    private Map<String, String> A0K(P7 p7, int i) {
        Map<String, String> mapA0I = A0I(i);
        mapA0I.put(A0G(63, 6, 103), String.valueOf(p7.A00));
        return mapA0I;
    }

    private void A0M() {
        this.A07.A8Q(this.A0A, A0J(P7.A04));
    }

    private void A0N() {
        this.A07.A8Q(this.A0A, A0J(P7.A0A));
    }

    private void A0P(HashMap<String, String> map) {
        Map<String, String> map2 = this.A0B;
        if (map2 != null) {
            map.putAll(map2);
        }
    }

    private void A0Q(Map<String, String> map) {
        C0654Ms c0654Ms = this;
        String str = null;
        AnonymousClass23 anonymousClass23A02 = c0654Ms.A05.A02();
        AnonymousClass22 anonymousClass22A00 = anonymousClass23A02.A00();
        map.put(A0G(15, 3, 40), String.valueOf(anonymousClass22A00.A00()));
        map.put(A0G(36, 3, 88), String.valueOf(anonymousClass22A00.A05()));
        map.put(A0G(10, 5, 81), String.valueOf(anonymousClass22A00.A02()));
        map.put(A0G(125, 8, 111), String.valueOf(anonymousClass22A00.A01() * 1000.0d));
        map.put(A0G(69, 7, 20), String.valueOf(anonymousClass22A00.A03() * 1000.0d));
        String str2 = c0654Ms.A02;
        char c2 = str2 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    map = map;
                    str2 = str2;
                    map.put(A0G(3, 4, 42), str2);
                    c2 = 3;
                    break;
                case 3:
                    c0654Ms = c0654Ms;
                    str = c0654Ms.A03;
                    if (str == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    map = map;
                    str = str;
                    map.put(A0G(78, 6, 71), str);
                    c2 = 5;
                    break;
                case 5:
                    Map<String, String> map2 = map;
                    AnonymousClass22 anonymousClass22A01 = anonymousClass23A02.A01();
                    map2.put(A0G(100, 3, 100), String.valueOf(anonymousClass22A01.A00()));
                    map2.put(A0G(0, 3, 67), String.valueOf(anonymousClass22A01.A05()));
                    map2.put(A0G(133, 5, k.AppCompatTheme_windowFixedHeightMajor), String.valueOf(anonymousClass22A01.A02()));
                    map2.put(A0G(108, 8, 46), String.valueOf(anonymousClass22A01.A01() * 1000.0d));
                    map2.put(A0G(k.AppCompatTheme_windowFixedHeightMajor, 7, 125), String.valueOf(anonymousClass22A01.A03() * 1000.0d));
                    return;
            }
        }
    }

    private void A0R(Map<String, String> map) {
        map.put(A0G(24, 9, 27), String.valueOf(this.A08.A7e()));
        map.put(A0G(39, 4, 82), Long.toString(this.A08.getInitialBufferTime()));
    }

    private void A0S(Map<String, String> map) {
        Rect rect = new Rect();
        this.A08.getGlobalVisibleRect(rect);
        map.put(A0G(138, 2, k.AppCompatTheme_windowActionModeOverlay), String.valueOf(rect.top));
        map.put(A0G(76, 2, 40), String.valueOf(rect.left));
        map.put(A0G(43, 2, 79), String.valueOf(this.A08.getMeasuredHeight()));
        map.put(A0G(k.AppCompatTheme_windowActionBarOverlay, 2, 32), String.valueOf(this.A08.getMeasuredWidth()));
        WindowManager windowManager = (WindowManager) this.A06.getSystemService(A0G(18, 6, 13));
        DisplayMetrics metrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(metrics);
        map.put(A0G(7, 3, k.AppCompatTheme_windowNoTitle), String.valueOf(metrics.heightPixels));
        map.put(A0G(33, 3, 77), String.valueOf(metrics.widthPixels));
    }

    private void A0T(Map<String, String> map, int i) {
        map.put(A0G(103, 5, 27), String.valueOf(this.A00 / 1000.0f));
        map.put(A0G(158, 4, 97), String.valueOf(i / 1000.0f));
    }

    public final int A0U() {
        return this.A01;
    }

    public final void A0V() {
        this.A05.A03();
        this.A07.A8Q(this.A0A, A0J(P7.A05));
    }

    public final void A0W() {
        this.A07.A8Q(this.A0A, A0J(P7.A07));
    }

    public final void A0X() {
        this.A07.A8Q(this.A0A, A0J(P7.A08));
    }

    public final void A0Y() {
        C0654Ms c0654Ms = this;
        char c2 = ((double) c0654Ms.A0E()) < 0.05d ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0654Ms = c0654Ms;
                    if (!c0654Ms.A04) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0654Ms = c0654Ms;
                    c0654Ms.A0M();
                    c0654Ms.A04 = false;
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    c0654Ms = c0654Ms;
                    if (!c0654Ms.A04) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 6:
                    c0654Ms = c0654Ms;
                    c0654Ms.A0N();
                    c0654Ms.A04 = true;
                    c2 = 4;
                    break;
            }
        }
    }

    public final void A0Z() {
        this.A06.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.A09);
    }

    public final void A0a() {
        this.A06.getContentResolver().unregisterContentObserver(this.A09);
    }

    public final void A0b(int i) {
        A0e(i, false, false);
    }

    public final void A0c(int i) {
        A0e(i, true, false);
        this.A00 = 0;
        this.A01 = 0;
        this.A05.A04();
        this.A05.A03();
    }

    public final void A0d(int i, int i2) {
        A0e(i, true, false);
        this.A00 = i2;
        this.A01 = i2;
        this.A05.A04();
        this.A05.A03();
    }

    public final void A0e(int i, boolean z, boolean z2) {
        C0654Ms c0654Ms = this;
        int i2 = 0;
        char c2 = ((double) i) > 0.0d ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0654Ms = c0654Ms;
                    i2 = c0654Ms.A01;
                    if (i >= i2) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    if (i <= i2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0654Ms = c0654Ms;
                    c0654Ms.A05.A05((i - i2) / 1000.0f, c0654Ms.A0E());
                    c0654Ms.A01 = i;
                    if (!z2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    c0654Ms = c0654Ms;
                    if (i - c0654Ms.A00 < 5000) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    C0654Ms c0654Ms2 = c0654Ms;
                    c0654Ms2.A07.A8Q(c0654Ms2.A0A, c0654Ms2.A0K(P7.A09, i));
                    c0654Ms2.A00 = c0654Ms2.A01;
                    c0654Ms2.A05.A04();
                    return;
                case '\b':
                    if (!z) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0654Ms = c0654Ms;
                    c0654Ms.A07.A8Q(c0654Ms.A0A, c0654Ms.A0K(P7.A09, i));
                    c2 = '\n';
                    break;
                case '\n':
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0619Li
    public final Bundle getSaveInstanceState() {
        A0d(A0U(), A0U());
        Bundle bundle = new Bundle();
        bundle.putInt(A0G(140, 18, 27), this.A01);
        bundle.putInt(A0G(45, 18, 13), this.A00);
        bundle.putBundle(A0G(84, 16, 26), this.A05.getSaveInstanceState());
        return bundle;
    }
}

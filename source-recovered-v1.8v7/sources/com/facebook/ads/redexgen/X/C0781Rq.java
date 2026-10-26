package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.ads.MediaView;
import d.b.a.b.k;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Rq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0781Rq extends AbstractC01200p {
    public static byte[] A0E;
    public View A00;

    @Nullable
    public View A01;
    public AnonymousClass10 A02;
    public AnonymousClass11 A03;
    public EnumC0583Jv A04;

    @Nullable
    public String A05;
    public List<View> A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final C0770Rf A0D;

    static {
        A05();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 22);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A0E = new byte[]{53, 58, 54, 51, 4, 0, 12, 10, 8, 0, 15, 3, 25, 5, 13, 12, 1, 9, 30, 1, 13, 31, 121, 118, 101, 118, 101, 41, 50, 55, 50, 51, 43, 50, 7, 0, 31, 44, 47, 52, 35, 50, 98, 125, 113, 99, 115, 102, 123, 97, 100, 39, 58, 53, 36, 39, 60, 59, 32, 87, 77, 94, 65, 82, 72, 85, 89, 84, 93, 72, 71, 72, 69, 87, 87, 119, 106, 102, 96, 115, 77, 122, 123, 124, 102, 97, 8, 11, 16, 11, 28, 29, 29, 6, 7, 111, 121, 108, 104, 108, 125, 96, 108, 74, 115, 111, 110, 32, 101, 120, 99, 101, 112, 116, 105, 111, 110, 76, 64, 85, 75, 84, 2, 0, 23, 17, 19, 17, 26, 23, 45, 31, 23, 22, 27, 19, 76, 83, 95, 77, 119, 100, 54, 41, 104, 32, 44, 123, 54, 41, 104, 113, 67, 70, 92, 91, 42, 55, 44, 34, 44, 43, 72, 75, 9, 22, 87, 31, 19, 74, 9, 22, 87, 78, Byte.MAX_VALUE, 114, 54, 48, 43, 96, 111, 106, 96, 104, 98, 97, 111, 102};
    }

    public C0781Rq(XI xi, AbstractC01210q abstractC01210q, Q1 q1, C0770Rf c0770Rf) {
        super(xi, abstractC01210q, q1);
        this.A02 = AnonymousClass10.A03;
        this.A03 = null;
        this.A0D = c0770Rf;
    }

    private String A02(View view) {
        try {
            return A04(view).toString();
        } catch (JSONException unused) {
            return A01(103, 14, 22);
        }
    }

    private String A03(View view) {
        int width = view.getWidth();
        String strA01 = A01(42, 0, 48);
        if (width <= 0 || view.getHeight() <= 0) {
            return strA01;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setDensity(view.getResources().getDisplayMetrics().densityDpi);
            view.draw(new Canvas(bitmapCreateBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, this.A0D.A0D(), byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            return Base64.encodeToString(byteArray, 0);
        } catch (Exception unused) {
            return strA01;
        }
    }

    private JSONObject A04(View view) throws JSONException {
        C0781Rq c0781Rq = this;
        int i = 0;
        JSONArray jSONArray = null;
        String strA01 = null;
        ViewGroup viewGroup = null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(A01(174, 2, 0), Integer.valueOf(view.getId()));
        jSONObject.putOpt(A01(70, 5, 50), view.getClass());
        boolean z = false;
        jSONObject.putOpt(A01(156, 6, 83), String.format(Locale.US, A01(162, 12, 37), Integer.valueOf(view.getTop()), Integer.valueOf(view.getLeft())));
        jSONObject.putOpt(A01(59, 4, 50), String.format(Locale.US, A01(140, 12, 26), Integer.valueOf(view.getHeight()), Integer.valueOf(view.getWidth())));
        List<View> list = c0781Rq.A06;
        char c2 = list != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    view = view;
                    list = list;
                    if (!list.contains(view)) {
                        c2 = 4;
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
                    view = view;
                    jSONObject = jSONObject;
                    jSONObject.putOpt(A01(179, 9, 21), Boolean.valueOf(z));
                    strA01 = A01(27, 7, 74);
                    if (!(view instanceof Button)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    strA01 = A01(89, 6, 127);
                    c2 = 6;
                    break;
                case 6:
                    view = view;
                    jSONObject = jSONObject;
                    strA01 = strA01;
                    jSONObject.putOpt(A01(66, 4, 59), strA01);
                    if (!(view instanceof ViewGroup)) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    view = view;
                    viewGroup = (ViewGroup) view;
                    jSONArray = new JSONArray();
                    i = 0;
                    c2 = '\b';
                    break;
                case '\b':
                    viewGroup = viewGroup;
                    if (i >= viewGroup.getChildCount()) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0781Rq = c0781Rq;
                    viewGroup = viewGroup;
                    jSONArray = jSONArray;
                    jSONArray.put(c0781Rq.A04(viewGroup.getChildAt(i)));
                    i++;
                    c2 = '\b';
                    break;
                case '\n':
                    view = view;
                    if (!(view instanceof TextView)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    strA01 = A01(99, 4, 14);
                    c2 = 6;
                    break;
                case '\f':
                    view = view;
                    if (!(view instanceof ImageView)) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    strA01 = A01(4, 5, k.AppCompatTheme_windowMinWidthMinor);
                    c2 = 6;
                    break;
                case 14:
                    view = view;
                    if (!(view instanceof MediaView)) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    strA01 = A01(13, 9, 126);
                    c2 = 6;
                    break;
                case 16:
                    view = view;
                    if (!(view instanceof ViewGroup)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    strA01 = A01(42, 9, 2);
                    c2 = 6;
                    break;
                case 18:
                    jSONObject = jSONObject;
                    jSONArray = jSONArray;
                    jSONObject.putOpt(A01(152, 4, 57), jSONArray);
                    c2 = 19;
                    break;
                case 19:
                    return jSONObject;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01200p
    public final void A06(Map<String, String> map) {
        C0781Rq c0781Rq = this;
        String str = null;
        AnonymousClass10 anonymousClass10 = null;
        AnonymousClass11 anonymousClass11 = null;
        EnumC0583Jv enumC0583Jv = null;
        View view = null;
        char c2 = c0781Rq.A0D == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0781Rq = c0781Rq;
                    enumC0583Jv = c0781Rq.A04;
                    if (enumC0583Jv == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    map = map;
                    enumC0583Jv = enumC0583Jv;
                    map.put(A01(63, 3, 42), String.valueOf(enumC0583Jv.A04()));
                    c2 = 5;
                    break;
                case 5:
                    c0781Rq = c0781Rq;
                    if (!c0781Rq.A07) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    map = map;
                    map.put(A01(176, 3, 78), Boolean.TRUE.toString());
                    c2 = 7;
                    break;
                case 7:
                    c0781Rq = c0781Rq;
                    if (!c0781Rq.A0B) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    map = map;
                    map.put(A01(86, 3, 112), Boolean.TRUE.toString());
                    c2 = '\t';
                    break;
                case '\t':
                    c0781Rq = c0781Rq;
                    if (!c0781Rq.A08) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    map = map;
                    map.put(A01(37, 5, 84), Boolean.TRUE.toString());
                    c2 = 11;
                    break;
                case 11:
                    c0781Rq = c0781Rq;
                    if (c0781Rq.A00 == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c0781Rq = c0781Rq;
                    if (!c0781Rq.A0D.A0h()) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c0781Rq = c0781Rq;
                    map = map;
                    map.put(A01(136, 4, 44), c0781Rq.A02(c0781Rq.A00));
                    c2 = 14;
                    break;
                case 14:
                    c0781Rq = c0781Rq;
                    if (c0781Rq.A00 == null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c0781Rq = c0781Rq;
                    if (!c0781Rq.A0D.A0i()) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c0781Rq = c0781Rq;
                    map = map;
                    map.put(A01(51, 8, 66), c0781Rq.A03(c0781Rq.A00));
                    c2 = 17;
                    break;
                case 17:
                    c0781Rq = c0781Rq;
                    if (!c0781Rq.A0A) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    map = map;
                    map.put(A01(34, 3, 127), Boolean.TRUE.toString());
                    c2 = 19;
                    break;
                case 19:
                    c0781Rq = c0781Rq;
                    anonymousClass10 = c0781Rq.A02;
                    if (anonymousClass10 == null) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    map = map;
                    anonymousClass10 = anonymousClass10;
                    map.put(A01(k.AppCompatTheme_windowMinWidthMajor, 14, 100), anonymousClass10.toString());
                    c2 = 21;
                    break;
                case 21:
                    c0781Rq = c0781Rq;
                    if (!c0781Rq.A09) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    map = map;
                    map.put(A01(95, 4, 12), Boolean.TRUE.toString());
                    c2 = 23;
                    break;
                case 23:
                    c0781Rq = c0781Rq;
                    view = c0781Rq.A01;
                    if (view == null) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    c0781Rq = c0781Rq;
                    map = map;
                    view = view;
                    map.put(A01(9, 4, k.AppCompatTheme_windowFixedWidthMajor), String.valueOf((int) (view.getWidth() / C0635Ly.A01)));
                    map.put(A01(0, 4, 77), String.valueOf((int) (c0781Rq.A01.getHeight() / C0635Ly.A01)));
                    c2 = 25;
                    break;
                case 25:
                    c0781Rq = c0781Rq;
                    anonymousClass11 = c0781Rq.A03;
                    if (anonymousClass11 == null) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    map = map;
                    anonymousClass11 = anonymousClass11;
                    map.put(A01(22, 5, 1), anonymousClass11.toString());
                    c2 = 27;
                    break;
                case 27:
                    c0781Rq = c0781Rq;
                    str = c0781Rq.A05;
                    if (str == null) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    map = map;
                    str = str;
                    map.put(A01(75, 11, 4), str);
                    c2 = 29;
                    break;
                case 29:
                    c0781Rq = c0781Rq;
                    if (!c0781Rq.A0C) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    map = map;
                    map.put(A01(k.AppCompatTheme_windowActionModeOverlay, 5, 52), Boolean.TRUE.toString());
                    c2 = 31;
                    break;
                case 31:
                    c0781Rq.A0D.A0a(map);
                    return;
            }
        }
    }

    public final void A07(@Nullable View view) {
        this.A01 = view;
    }

    public final void A08(View view) {
        this.A00 = view;
    }

    public final void A09(AnonymousClass10 anonymousClass10) {
        this.A02 = anonymousClass10;
    }

    public final void A0A(AnonymousClass11 anonymousClass11) {
        this.A03 = anonymousClass11;
    }

    public final void A0B(EnumC0583Jv enumC0583Jv) {
        this.A04 = enumC0583Jv;
    }

    public final void A0C(@Nullable String str) {
        this.A05 = str;
    }

    public final void A0D(List<View> clickableViews) {
        this.A06 = clickableViews;
    }

    public final void A0E(boolean z) {
        this.A07 = z;
    }

    public final void A0F(boolean z) {
        this.A08 = z;
    }

    public final void A0G(boolean z) {
        this.A09 = z;
    }

    public final void A0H(boolean z) {
        this.A0A = z;
    }

    public final void A0I(boolean z) {
        this.A0B = z;
    }

    public final void A0J(boolean z) {
        this.A0C = z;
    }
}

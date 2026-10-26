package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.VisibleForTesting;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.api.BuildConfigApi;
import d.b.a.b.k;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class Q1 {
    public static byte[] A0G;
    public static final String A0H;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public AbstractRunnableC0608Kw A04;
    public Q2 A05;
    public Map<String, Integer> A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final Handler A0B;
    public final View A0C;
    public final XI A0D;
    public final WeakReference<Q0> A0E;
    public final boolean A0F;

    public static String A0H(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 13);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0M() {
        A0G = new byte[]{98, 71, 3, 74, 80, 3, 76, 77, 3, 87, 76, 83, 3, 76, 69, 3, 87, 75, 70, 3, 111, 76, 64, 72, 80, 64, 81, 70, 70, 77, 13, 101, 73, 108, 94, 97, 109, Byte.MAX_VALUE, 40, 126, 97, 123, 97, 106, 100, 109, 40, 105, 122, 109, 105, 40, 97, 123, 40, 124, 103, 103, 40, 123, 101, 105, 100, 100, 40, 83, 45, 38, 58, 110, 45, 45, 40, 126, 97, 123, 97, 106, 100, 109, 36, 40, 107, 125, 122, 122, 109, 102, 124, 40, 124, 96, 122, 109, 123, 96, 103, 100, 108, 40, 45, 38, 58, 110, 45, 45, 85, 123, 100, 104, 122, 108, 111, 97, 104, 17, 45, 32, 101, 49, 44, 38, 46, 32, 55, 101, 38, 36, 43, 43, 42, 49, 101, 39, 32, 101, 43, 32, 34, 36, 49, 44, 51, 32, 1, 45, 8, 58, 5, 9, 27, 76, 27, 5, 2, 8, 3, 27, 76, 5, 31, 76, 2, 3, 24, 76, 31, 9, 24, 76, 24, 3, 76, 58, 37, 63, 37, 46, 32, 41, 66, 106, 116, 115, 121, 114, 106, 106, 35, 57, 106, 96, 66, 77, 77, 76, 87, 3, 68, 70, 87, 3, 79, 76, 64, 66, 87, 74, 76, 77, 3, 76, 77, 3, 80, 64, 81, 70, 70, 77, 13, 19, 56, 50, 36, 57, 112, 35, 119, 58, 54, 60, 50, 119, 36, 50, 57, 36, 50, 119, 35, 56, 119, 36, 50, 35, 119, 52, 63, 50, 52, 60, 119, 62, 57, 35, 50, 37, 33, 54, 59, 119, 49, 56, 37, 119, 57, 56, 57, 122, 37, 50, 39, 50, 54, 35, 119, 52, 63, 50, 52, 60, 50, 37, 121, 6, 81, 79, 82, 78, 6, 84, 67, 71, 85, 73, 72, 28, 6, 87, 123, 94, 108, 83, 95, 77, 26, 82, 91, 73, 26, 83, 84, 76, 83, 73, 83, 88, 86, 95, 26, 94, 83, 87, 95, 84, 73, 83, 85, 84, 73, 26, 18, 77, 7, 49, 51, 92, 108, 125, 106, 106, 97, 47, 102, 124, 47, 97, 96, 123, 47, 102, 97, 123, 106, 125, 110, 108, 123, 102, 121, 106, 33, 19, 18, 9, 93, 11, 20, 24, 10, 28, 31, 17, 24, 114, 94, 123, 73, 118, 122, 104, 63, 118, 108, 63, 113, 106, 115, 115, 49, 125, 117, 120, 115, 108, 59, 120, 120, 116, 31, 51, 22, 36, 27, 23, 5, 82, 27, 1, 82, 28, 29, 6, 82, 4, 27, 1, 27, 16, 30, 23, 82, 20, 0, 29, 31, 82, 6, 26, 23, 82, 16, 29, 6, 6, 29, 31, 92, 47, 49, 107, 84, 88, 74, 29, 24, 52, 17, 35, 28, 16, 2, 85, 28, 6, 85, 27, 26, 1, 85, 3, 28, 6, 28, 23, 25, 16, 85, 19, 7, 26, 24, 85, 1, 29, 16, 85, 1, 26, 5, 91, 99, 111, 109, 46, 102, 97, 99, 101, 98, 111, 111, 107, 46, 97, 100, 115, 46, 105, 110, 116, 101, 114, 110, 97, 108, 46, 118, 105, 101, 119, 46, 70, 117, 108, 108, 83, 99, 114, 101, 101, 110, 65, 100, 84, 111, 111, 108, 98, 97, 114, 105, 71, 91, 69, 87, 67, 80, 70, 2, 75, 81, 2, 77, 64, 81, 86, 80, 87, 65, 86, 75, 76, 69, 2, 84, 75, 71, 85, 12, 18, 22, 7, 84, 120, 93, 111, 80, 92, 78, 25, 80, 74, 25, 77, 86, 86, 25, 77, 75, 88, 87, 74, 73, 88, 75, 92, 87, 77, 23, 39, 11, 46, 28, 35, 47, 61, 106, 35, 57, 106, 36, 37, 62, 106, 44, 63, 38, 38, 51, 106, 37, 36, 106, 57, 41, 56, 47, 47, 36, 106, 34, 37, 56, 35, 48, 37, 36, 62, 43, 38, 38, 51, 100, 111, 105, 66, 110, 75, 121, 70, 74, 88, 15, 71, 78, 92, 15, 65, 64, 15, 95, 78, 93, 74, 65, 91, 1, 83, Byte.MAX_VALUE, 90, 104, 87, 91, 73, 30, 78, 95, 76, 91, 80, 74, 30, 87, 77, 30, 80, 81, 74, 30, 77, 91, 74, 30, 74, 81, 30, 104, 119, 109, 119, 124, 114, 123, 16, 18, 30, 86, 3, 37, 9, 44, 30, 33, 45, 63, 104, 33, 59, 104, 62, 33, 59, 33, 42, 36, 45, 102};
    }

    static {
        A0M();
        A0H = Q1.class.getSimpleName();
    }

    public Q1(View view, int i, int i2, boolean z, WeakReference<Q0> weakReference, XI xi) {
        this.A0B = new Handler();
        this.A01 = 0;
        this.A02 = AdError.NETWORK_ERROR_CODE;
        this.A08 = true;
        this.A05 = new Q2(C0R.A0L);
        this.A06 = new HashMap();
        this.A03 = 0L;
        this.A00 = 0;
        this.A07 = true;
        this.A0D = xi;
        this.A0C = view;
        if (this.A0C.getId() == -1) {
            C0635Ly.A0N(this.A0C);
        }
        this.A0A = i;
        this.A0E = weakReference;
        this.A0F = z;
        if (i2 < 0) {
            if (BuildConfigApi.isDebug()) {
                Log.w(A0H, A0H(k.AppCompatTheme_windowActionBar, 29, 72));
            }
            i2 = 0;
        }
        this.A09 = i2;
    }

    public Q1(View view, int i, WeakReference<Q0> weakReference, XI xi) {
        this(view, i, 0, false, weakReference, xi);
    }

    public Q1(View view, int i, boolean z, WeakReference<Q0> weakReference, XI xi) {
        this(view, i, 0, z, weakReference, xi);
    }

    @VisibleForTesting
    public static float A00(View view) {
        float alpha = 0.0f;
        float alpha2 = view.getAlpha();
        float alpha3 = 2.8E-45f;
        while (true) {
            switch (alpha3) {
                case 2.8E-45f:
                    view = view;
                    if (!(view.getParent() instanceof ViewGroup)) {
                        alpha3 = 1.1E-44f;
                        break;
                    } else {
                        alpha3 = 4.2E-45f;
                        break;
                    }
                case 4.2E-45f:
                    view = (View) view.getParent();
                    alpha = view.getAlpha();
                    if (alpha >= 0.0f) {
                        alpha3 = 7.0E-45f;
                        break;
                    } else {
                        alpha3 = 5.6E-45f;
                        break;
                    }
                case 5.6E-45f:
                    alpha = 0.0f;
                    alpha3 = 7.0E-45f;
                    break;
                case 7.0E-45f:
                    if (alpha <= 1.0f) {
                        alpha3 = 9.8E-45f;
                        break;
                    } else {
                        alpha3 = 8.4E-45f;
                        break;
                    }
                case 8.4E-45f:
                    alpha = 1.0f;
                    alpha3 = 9.8E-45f;
                    break;
                case 9.8E-45f:
                    alpha2 *= alpha;
                    alpha3 = 2.8E-45f;
                    break;
                case 1.1E-44f:
                    return alpha2;
            }
        }
    }

    @VisibleForTesting
    public static int A01(int viewArea, View view) {
        return (int) Math.max(viewArea, Math.ceil(view.getWidth() * view.getHeight() > 0 ? 100.0f / r2 : 100.0f));
    }

    public static /* synthetic */ int A05(Q1 q1) {
        int i = q1.A00;
        q1.A00 = i + 1;
        return i;
    }

    public static int A08(Vector<Rect> vector) {
        Vector<Rect> vector2 = vector;
        int size = 0;
        int xPos = 0;
        int leftEdgeIndex = 0;
        int i = 0;
        int iA09 = 0;
        int i2 = 0;
        int i3 = 0;
        int iA092 = 0;
        int i4 = 0;
        int i5 = 0;
        int size2 = vector2.size();
        int[] iArr = new int[size2 * 2];
        int[] iArr2 = new int[size2 * 2];
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) boolean.class, size2 * 2, size2 * 2);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int yPos = 2;
        while (true) {
            switch (yPos) {
                case 2:
                    if (i8 >= size2) {
                        yPos = 4;
                        break;
                    } else {
                        yPos = 3;
                        break;
                    }
                case 3:
                    vector2 = vector2;
                    iArr = iArr;
                    iArr2 = iArr2;
                    Rect rectElementAt = vector2.elementAt(i8);
                    int i9 = i6 + 1;
                    iArr[i6] = rectElementAt.left;
                    int i10 = i7 + 1;
                    iArr2[i7] = rectElementAt.bottom;
                    i6 = i9 + 1;
                    int xPos2 = rectElementAt.right;
                    iArr[i9] = xPos2;
                    i7 = i10 + 1;
                    int xPos3 = rectElementAt.top;
                    iArr2[i10] = xPos3;
                    i8++;
                    yPos = 2;
                    break;
                case 4:
                    iArr = iArr;
                    iArr2 = iArr2;
                    Arrays.sort(iArr);
                    Arrays.sort(iArr2);
                    i2 = 0;
                    yPos = 5;
                    break;
                case 5:
                    if (i2 >= size2) {
                        yPos = 13;
                        break;
                    } else {
                        yPos = 6;
                        break;
                    }
                case 6:
                    vector2 = vector2;
                    iArr = iArr;
                    iArr2 = iArr2;
                    Rect rectElementAt2 = vector2.elementAt(i2);
                    int area = rectElementAt2.left;
                    int iA093 = A09(iArr, area);
                    int area2 = rectElementAt2.right;
                    iA09 = A09(iArr, area2);
                    int area3 = rectElementAt2.top;
                    iA092 = A09(iArr2, area3);
                    int topEdgeIndex = rectElementAt2.bottom;
                    leftEdgeIndex = A09(iArr2, topEdgeIndex);
                    i3 = iA093 + 1;
                    yPos = 7;
                    break;
                case 7:
                    if (i3 > iA09) {
                        yPos = 12;
                        break;
                    } else {
                        yPos = 8;
                        break;
                    }
                case 8:
                    i = iA092 + 1;
                    yPos = 9;
                    break;
                case 9:
                    if (i > leftEdgeIndex) {
                        yPos = 11;
                        break;
                    } else {
                        yPos = 10;
                        break;
                    }
                case 10:
                    zArr = zArr;
                    zArr[i3][i] = true;
                    i++;
                    yPos = 9;
                    break;
                case 11:
                    i3++;
                    yPos = 7;
                    break;
                case 12:
                    i2++;
                    yPos = 5;
                    break;
                case 13:
                    xPos = 0;
                    i4 = 0;
                    yPos = 14;
                    break;
                case 14:
                    int i11 = size2 * 2;
                    if (i4 >= i11) {
                        yPos = 22;
                        break;
                    } else {
                        yPos = 15;
                        break;
                    }
                case 15:
                    i5 = 0;
                    yPos = 16;
                    break;
                case 16:
                    int yPos2 = size2 * 2;
                    if (i5 >= yPos2) {
                        yPos = 21;
                        break;
                    } else {
                        yPos = 17;
                        break;
                    }
                case 17:
                    zArr = zArr;
                    if (!zArr[i4][i5]) {
                        yPos = 20;
                        break;
                    } else {
                        yPos = 18;
                        break;
                    }
                case 18:
                    iArr = iArr;
                    iArr2 = iArr2;
                    int size3 = iArr[i4];
                    int bottomEdgeIndex = i4 - 1;
                    int size4 = size3 - iArr[bottomEdgeIndex];
                    int bottomEdgeIndex2 = i5 - 1;
                    size = size4 * (iArr2[i5] - iArr2[bottomEdgeIndex2]);
                    yPos = 19;
                    break;
                case 19:
                    xPos += size;
                    i5++;
                    yPos = 16;
                    break;
                case 20:
                    size = 0;
                    yPos = 19;
                    break;
                case 21:
                    i4++;
                    yPos = 14;
                    break;
                case 22:
                    return xPos;
            }
        }
    }

    public static int A09(int[] iArr, int i) {
        int mid = 0;
        int i2 = 0;
        int length = iArr.length;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= length) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    iArr = iArr;
                    mid = ((length - i2) / 2) + i2;
                    if (iArr[mid] != i) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return mid;
                case 5:
                    iArr = iArr;
                    if (iArr[mid] <= i) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    length = mid;
                    c2 = 2;
                    break;
                case 7:
                    i2 = mid + 1;
                    c2 = 2;
                    break;
                case '\b':
                    return -1;
            }
        }
    }

    public static Q2 A0E(View view, int i, XI xi) {
        XI xi2 = xi;
        View view2 = view;
        int widthPixels = 0;
        String strA0H = null;
        DisplayMetrics displayMetrics = null;
        String strA0H2 = null;
        int targetAreaSize = 0;
        Rect rect = null;
        char c2 = 0;
        int[] iArr = null;
        float fA08 = 0.0f;
        Map<String, String> mapA01 = null;
        float f = 0.0f;
        int width = 0;
        int iA01 = 0;
        View view3 = view2;
        char c3 = view3 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c3) {
                case 2:
                    A0N(null, false, A0H(375, 16, 18));
                    return new Q2(C0R.A07);
                case 3:
                    xi2 = xi2;
                    boolean zA1X = JQ.A1X(xi2);
                    strA0H2 = A0H(659, 37, 51);
                    strA0H = A0H(637, 22, 34);
                    if (!zA1X) {
                        c3 = '\b';
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    view2 = view2;
                    if (view2.getParent() != null) {
                        c3 = 6;
                        break;
                    } else {
                        c3 = 5;
                        break;
                    }
                case 5:
                    A0N(view3, false, strA0H);
                    return new Q2(C0R.A0J);
                case 6:
                    view2 = view2;
                    if (!view2.isShown()) {
                        c3 = 7;
                        break;
                    } else {
                        c3 = '\f';
                        break;
                    }
                case 7:
                    A0N(view3, false, strA0H2);
                    return new Q2(C0R.A0M);
                case '\b':
                    view2 = view2;
                    if (view2.getParent() != null) {
                        c3 = '\n';
                        break;
                    } else {
                        c3 = '\t';
                        break;
                    }
                case '\t':
                    A0N(view3, false, strA0H);
                    return new Q2(C0R.A0G);
                case '\n':
                    view2 = view2;
                    if (!view2.isShown()) {
                        c3 = 11;
                        break;
                    } else {
                        c3 = '\f';
                        break;
                    }
                case 11:
                    A0N(view3, false, strA0H2);
                    return new Q2(C0R.A0G);
                case '\f':
                    view2 = view2;
                    if (view2.getWindowVisibility() == 0) {
                        c3 = 14;
                        break;
                    } else {
                        c3 = '\r';
                        break;
                    }
                case '\r':
                    A0N(view3, false, A0H(144, 37, 97));
                    return new Q2(C0R.A0H);
                case 14:
                    view2 = view2;
                    if (view2.getMeasuredWidth() <= 0) {
                        c3 = 16;
                        break;
                    } else {
                        c3 = 15;
                        break;
                    }
                case 15:
                    view2 = view2;
                    if (view2.getMeasuredHeight() > 0) {
                        c3 = 17;
                        break;
                    } else {
                        c3 = 16;
                        break;
                    }
                case 16:
                    View view4 = view2;
                    A0N(view3, false, A0H(299, 36, 55) + view4.getMeasuredWidth() + A0H(696, 4, 51) + view4.getMeasuredHeight());
                    return new Q2(C0R.A0F);
                case 17:
                    view2 = view2;
                    if (A00(view2) >= 0.9f) {
                        c3 = 19;
                        break;
                    } else {
                        c3 = 18;
                        break;
                    }
                case 18:
                    A0N(view3, false, A0H(564, 27, 52));
                    return new Q2(C0R.A0A);
                case 19:
                    view2 = view2;
                    width = view2.getWidth();
                    targetAreaSize = view2.getHeight();
                    iArr = new int[2];
                    c3 = 20;
                    break;
                case 20:
                    try {
                        view3 = view3;
                        iArr = iArr;
                        view3.getLocationOnScreen(iArr);
                        rect = new Rect();
                        if (!view3.getGlobalVisibleRect(rect)) {
                            c3 = 22;
                            break;
                        } else {
                            c3 = 23;
                            break;
                        }
                    } catch (NullPointerException unused) {
                        A0N(view3, false, A0H(191, 30, 46));
                        return new Q2(C0R.A0F);
                    }
                case 22:
                    return new Q2(C0R.A06);
                case 23:
                    if (Build.VERSION.SDK_INT < 17) {
                        c3 = 28;
                        break;
                    } else {
                        c3 = 24;
                        break;
                    }
                case 24:
                    xi2 = xi2;
                    WindowManager wm = (WindowManager) xi2.getSystemService(A0H(181, 6, 16));
                    Display defaultDisplay = wm.getDefaultDisplay();
                    displayMetrics = new DisplayMetrics();
                    defaultDisplay.getRealMetrics(displayMetrics);
                    c3 = 25;
                    break;
                case 25:
                    view2 = view2;
                    xi2 = xi2;
                    view3 = view3;
                    rect = rect;
                    Vector<Rect> vectorA0K = A0K(view2);
                    int iA08 = A08(vectorA0K);
                    vectorA0K.add(rect);
                    fA08 = ((A08(vectorA0K) - iA08) * 1.0f) / (view2.getMeasuredHeight() * view2.getMeasuredWidth());
                    boolean zA1P = JQ.A1P(xi2);
                    iA01 = A01(i, view3);
                    f = iA01 / 100.0f;
                    if (!zA1P) {
                        c3 = 29;
                        break;
                    } else {
                        c3 = 26;
                        break;
                    }
                case 26:
                    if (fA08 >= f) {
                        c3 = '$';
                        break;
                    } else {
                        c3 = 27;
                        break;
                    }
                case 27:
                    A0N(view3, false, String.format(Locale.US, A0H(31, 76, 5), Float.valueOf(fA08), Float.valueOf(f)));
                    return new Q2(C0R.A03, fA08);
                case 28:
                    xi2 = xi2;
                    displayMetrics = xi2.getResources().getDisplayMetrics();
                    c3 = 25;
                    break;
                case 29:
                    iArr = iArr;
                    c2 = 0;
                    if (iArr[0] < 0) {
                        c3 = 31;
                        break;
                    } else {
                        c3 = 30;
                        break;
                    }
                case 30:
                    iArr = iArr;
                    displayMetrics = displayMetrics;
                    if (displayMetrics.widthPixels - iArr[c2] >= width) {
                        c3 = ' ';
                        break;
                    } else {
                        c3 = 31;
                        break;
                    }
                case 31:
                    A0N(view3, false, A0H(591, 44, 71));
                    return new Q2(C0R.A0C, fA08);
                case ' ':
                    iArr = iArr;
                    rect = rect;
                    widthPixels = (int) ((targetAreaSize * (100.0d - iA01)) / 100.0d);
                    if (rect.top - iArr[1] <= widthPixels) {
                        c3 = '\"';
                        break;
                    } else {
                        c3 = '!';
                        break;
                    }
                case '!':
                    A0N(view3, false, A0H(446, 36, k.AppCompatTheme_windowFixedWidthMajor));
                    return new Q2(C0R.A0D, fA08);
                case '\"':
                    iArr = iArr;
                    rect = rect;
                    if ((iArr[1] + targetAreaSize) - rect.bottom <= widthPixels) {
                        c3 = '$';
                        break;
                    } else {
                        c3 = '#';
                        break;
                    }
                case '#':
                    A0N(view3, false, A0H(400, 39, 127));
                    return new Q2(C0R.A0B, fA08);
                case '$':
                    xi2 = xi2;
                    if (!MF.A03(xi2)) {
                        c3 = '%';
                        break;
                    } else {
                        c3 = '&';
                        break;
                    }
                case '%':
                    A0N(view3, false, A0H(337, 26, 2));
                    return new Q2(C0R.A0K, fA08);
                case '&':
                    xi2 = xi2;
                    mapA01 = MG.A01(xi2);
                    if (!C0636Lz.A04(mapA01)) {
                        c3 = '(';
                        break;
                    } else {
                        c3 = '\'';
                        break;
                    }
                case '\'':
                    A0N(view3, false, A0H(532, 29, 47));
                    return new Q2(C0R.A09, fA08);
                case '(':
                    xi2 = xi2;
                    if (!JQ.A14(xi2)) {
                        c3 = '+';
                        break;
                    } else {
                        c3 = ')';
                        break;
                    }
                case ')':
                    mapA01 = mapA01;
                    if (!C0636Lz.A03(mapA01)) {
                        c3 = '+';
                        break;
                    } else {
                        c3 = '*';
                        break;
                    }
                case '*':
                    A0N(view3, false, A0H(0, 31, 46));
                    return new Q2(C0R.A04, fA08, mapA01);
                case '+':
                    A0N(view3, true, A0H(700, 19, 69));
                    return new Q2(C0R.A0I, fA08, mapA01);
            }
        }
    }

    public static Vector<Rect> A0K(View view) {
        View childAt = null;
        ViewGroup viewGroup = null;
        int iIndexOfChild = 0;
        Vector<Rect> vector = new Vector<>();
        char c2 = !(view.getParent() instanceof ViewGroup) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return vector;
                case 3:
                    view = view;
                    viewGroup = (ViewGroup) view.getParent();
                    iIndexOfChild = viewGroup.indexOfChild(view) + 1;
                    c2 = 4;
                    break;
                case 4:
                    viewGroup = viewGroup;
                    if (iIndexOfChild >= viewGroup.getChildCount()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    viewGroup = viewGroup;
                    childAt = viewGroup.getChildAt(iIndexOfChild);
                    if (!(childAt instanceof C0703Op)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    vector = vector;
                    childAt = childAt;
                    vector.addAll(A0L(childAt));
                    c2 = 7;
                    break;
                case 7:
                    iIndexOfChild++;
                    c2 = 4;
                    break;
                case '\b':
                    Vector<Rect> vector2 = vector;
                    vector2.addAll(A0K(viewGroup));
                    return vector2;
            }
        }
    }

    public static Vector<Rect> A0L(View view) {
        Rect viewRect = null;
        int i = 0;
        boolean z = false;
        ViewGroup viewGroup = null;
        Vector<Rect> vector = new Vector<>();
        char c2 = view.isShown() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (Build.VERSION.SDK_INT < 11) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    view = view;
                    if (view.getAlpha() > 0.0f) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return vector;
                case 5:
                    view = view;
                    if (!view.getClass().getName().equals(A0H(482, 50, 13))) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    view = view;
                    if (view.getBackground() == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    view = view;
                    if (!(view.getBackground() instanceof GradientDrawable)) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    z = true;
                    c2 = '\t';
                    break;
                case '\t':
                    view = view;
                    if (!(view instanceof ViewGroup)) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    view = view;
                    if (!A0O(view)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case 11:
                    if (!z) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    view = view;
                    viewGroup = (ViewGroup) view;
                    i = 0;
                    c2 = '\r';
                    break;
                case '\r':
                    viewGroup = viewGroup;
                    if (i >= viewGroup.getChildCount()) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    vector = vector;
                    viewGroup = viewGroup;
                    vector.addAll(A0L(viewGroup.getChildAt(i)));
                    i++;
                    c2 = '\r';
                    break;
                case 15:
                    z = false;
                    c2 = '\t';
                    break;
                case 16:
                    return vector;
                case 17:
                    view = view;
                    viewRect = new Rect();
                    if (!view.getGlobalVisibleRect(viewRect)) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    vector = vector;
                    viewRect = viewRect;
                    vector.add(viewRect);
                    c2 = 19;
                    break;
                case 19:
                    return vector;
            }
        }
    }

    public static void A0N(View view, boolean z, String str) {
        StringBuilder sb = null;
        String strA0H = null;
        char c2 = BuildConfigApi.isDebug() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    view = view;
                    sb = new StringBuilder();
                    sb.append(A0H(441, 5, 48));
                    sb.append(view);
                    sb.append(A0H(187, 4, 71));
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    strA0H = A0H(107, 8, 0);
                    c2 = 4;
                    break;
                case 4:
                    str = str;
                    sb = sb;
                    strA0H = strA0H;
                    sb.append(strA0H);
                    sb.append(A0H(285, 14, 43));
                    sb.append(str);
                    sb.toString();
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    strA0H = A0H(363, 12, 112);
                    c2 = 4;
                    break;
            }
        }
    }

    public static boolean A0O(View view) {
        boolean z = false;
        char c2 = view.getBackground() != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (Build.VERSION.SDK_INT < 19) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    view = view;
                    if (view.getBackground().getAlpha() > 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    public final synchronized String A0S() {
        return C0R.values()[this.A05.A01()].toString() + String.format(Locale.US, A0H(391, 9, 80), Float.valueOf(this.A05.A00() * 100.0f));
    }

    public final synchronized Map<String, String> A0T() {
        HashMap map;
        map = new HashMap();
        map.put(A0H(561, 3, 105), String.valueOf(this.A05.A01()));
        map.put(A0H(635, 2, 20), String.valueOf(this.A05.A00()));
        map.put(A0H(439, 2, 84), new JSONObject(this.A06).toString());
        map.put(A0H(335, 2, 74), C0627Lq.A05(this.A03));
        map.putAll(this.A05.A03());
        return map;
    }

    public final synchronized void A0U() {
        this.A05 = new Q2(C0R.A0L);
    }

    public final synchronized void A0V() {
        if (this.A04 != null) {
            A0W();
        }
        if (this.A07) {
            this.A0D.A0A().A38();
        }
        this.A04 = new C4I(this, this.A0D);
        this.A0B.postDelayed(this.A04, this.A01);
        this.A08 = false;
        this.A00 = 0;
        this.A05 = new Q2(C0R.A0L);
        this.A06 = new HashMap();
    }

    public final synchronized void A0W() {
        if (this.A07) {
            this.A0D.A0A().A39();
        }
        this.A0B.removeCallbacks(this.A04);
        this.A04 = null;
        this.A08 = true;
        this.A00 = 0;
    }

    public final void A0X(int i) {
        this.A01 = i;
    }

    public final void A0Y(int i) {
        Q1 q1 = this;
        char c2 = BuildConfigApi.isDebug() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    q1 = q1;
                    if (!q1.A0F) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    Log.w(A0H, A0H(221, 64, 90));
                    c2 = 4;
                    break;
                case 4:
                    q1.A02 = i;
                    return;
            }
        }
    }

    public final void A0Z(boolean z) {
        this.A07 = z;
    }

    public final synchronized boolean A0a() {
        return this.A08;
    }
}

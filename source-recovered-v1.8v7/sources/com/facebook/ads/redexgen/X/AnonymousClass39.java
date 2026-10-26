package com.facebook.ads.redexgen.X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.annotation.CallSuper;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$DecorView;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.39, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass39 extends ViewGroup {
    public static byte[] A0u;
    public static final int[] A0v;
    public static final Interpolator A0w;
    public static final AnonymousClass38 A0x;
    public static final Comparator<AnonymousClass31> A0y;
    public int A00;
    public AbstractC01632g A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public Drawable A0S;
    public Parcelable A0T;
    public VelocityTracker A0U;
    public EdgeEffect A0V;
    public EdgeEffect A0W;
    public Scroller A0X;
    public AnonymousClass34 A0Y;
    public AnonymousClass34 A0Z;
    public AnonymousClass35 A0a;
    public AnonymousClass36 A0b;
    public ClassLoader A0c;
    public ArrayList<View> A0d;
    public List<ViewPager.OnAdapterChangeListener> A0e;
    public List<AnonymousClass34> A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public final Rect A0q;
    public final AnonymousClass31 A0r;
    public final Runnable A0s;
    public final ArrayList<AnonymousClass31> A0t;

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0u, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 51);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0C() {
        A0u = new byte[]{-86, -38, -4, -7, -20, -10, -17, -9, -21, -2, -13, -19, -86, -21, -18, -21, -6, -2, -17, -4, -60, -86, -98, -68, -55, -55, -54, -49, 123, -68, -65, -65, 123, -53, -68, -62, -64, -51, 123, -65, -64, -66, -54, -51, 123, -47, -60, -64, -46, 123, -65, -48, -51, -60, -55, -62, 123, -57, -68, -44, -54, -48, -49, 116, 104, -82, -73, -67, -74, -84, -126, 104, -35, -16, -4, 0, -16, -2, -1, -16, -17, -85, -6, -15, -15, -2, -18, -3, -16, -16, -7, -85, -5, -20, -14, -16, -85, -9, -12, -8, -12, -1, -85, -56, 28, 23, 23, -56, 27, 21, 9, 20, 20, -29, -56, 12, 13, 14, 9, 29, 20, 28, 17, 22, 15, -56, 28, 23, -56, 104, -104, -87, -81, -83, -70, 104, -85, -76, -87, -69, -69, -126, 104, -121, -101, -104, 83, -108, -93, -93, -97, -100, -106, -108, -89, -100, -94, -95, 90, -90, 83, -125, -108, -102, -104, -91, 116, -105, -108, -93, -89, -104, -91, 83, -106, -101, -108, -95, -102, -104, -105, 83, -89, -101, -104, 83, -108, -105, -108, -93, -89, -104, -91, 90, -90, 83, -106, -94, -95, -89, -104, -95, -89, -90, 83, -86, -100, -89, -101, -94, -88, -89, 83, -106, -108, -97, -97, -100, -95, -102, 83, -125, -108, -102, -104, -91, 116, -105, -108, -93, -89, -104, -91, 86, -95, -94, -89, -100, -103, -84, 119, -108, -89, -108, -122, -104, -89, 118, -101, -108, -95, -102, -104, -105, 84, 83, 120, -85, -93, -104, -106, -89, -104, -105, 83, -108, -105, -108, -93, -89, -104, -91, 83, -100, -89, -104, -96, 83, -106, -94, -88, -95, -89, 109, 83, -86, -69, -69, -72, -64, -100, -84, -69, -72, -75, -75, 105, -67, -69, -78, -82, -83, 105, -67, -72, 105, -81, -78, -73, -83, 105, -81, -72, -84, -66, -68, 105, -85, -86, -68, -82, -83, 105, -72, -73, 105, -73, -72, -73, 118, -84, -79, -78, -75, -83, 105, -84, -66, -69, -69, -82, -73, -67, 105, -81, -72, -84, -66, -68, -82, -83, 105, -65, -78, -82, -64, 105, -97, -78, -82, -64, -103, -86, -80, -82, -69, -69, -70, -100, -83, -77, -79, -97, -81, -66, -69, -72, -72, -79, -80, 108, -80, -75, -80, 108, -70, -69, -64, 108, -81, -83, -72, -72, 108, -65, -63, -68, -79, -66, -81, -72, -83, -65, -65, 108, -75, -71, -68, -72, -79, -71, -79, -70, -64, -83, -64, -75, -69, -70, -88, -59, -58, -88, -87, -39, -22, -16, -18, -5, -87, -14, -19, -61, -87};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.facebook.ads.redexgen.X.38] */
    static {
        A0C();
        A0v = new int[]{R.attr.layout_gravity};
        A0y = new Comparator<AnonymousClass31>() { // from class: com.facebook.ads.redexgen.X.2x
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(AnonymousClass31 anonymousClass31, AnonymousClass31 anonymousClass312) {
                return anonymousClass31.A02 - anonymousClass312.A02;
            }
        };
        A0w = new Interpolator() { // from class: com.facebook.ads.redexgen.X.2y
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
        A0x = new Comparator<View>() { // from class: com.facebook.ads.redexgen.X.38
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(View view, View view2) {
                int i = 0;
                AnonymousClass32 anonymousClass32 = (AnonymousClass32) view.getLayoutParams();
                AnonymousClass32 anonymousClass322 = (AnonymousClass32) view2.getLayoutParams();
                char c2 = anonymousClass32.A05 != anonymousClass322.A05 ? (char) 2 : (char) 6;
                while (true) {
                    switch (c2) {
                        case 2:
                            anonymousClass32 = anonymousClass32;
                            if (!anonymousClass32.A05) {
                                c2 = 5;
                                break;
                            } else {
                                c2 = 3;
                                break;
                            }
                        case 3:
                            i = 1;
                            c2 = 4;
                            break;
                        case 4:
                            return i;
                        case 5:
                            i = -1;
                            c2 = 4;
                            break;
                        case 6:
                            return anonymousClass32.A02 - anonymousClass322.A02;
                    }
                }
            }
        };
    }

    public AnonymousClass39(Context context) {
        super(context);
        this.A0t = new ArrayList<>();
        this.A0r = new AnonymousClass31();
        this.A0q = new Rect();
        this.A0O = -1;
        this.A0T = null;
        this.A0c = null;
        this.A02 = -3.4028235E38f;
        this.A07 = Float.MAX_VALUE;
        this.A0L = 1;
        this.A08 = -1;
        this.A0i = true;
        this.A0n = false;
        this.A0s = new Runnable() { // from class: com.facebook.ads.redexgen.X.2z
            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                this.A00.setScrollState(0);
                this.A00.A0f();
            }
        };
        this.A0P = 0;
        A0D();
    }

    private final float A00(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private int A01(int i, float f, int i2, int i3) {
        AnonymousClass39 anonymousClass39 = this;
        float f2 = 0.0f;
        int iMax = 0;
        char c2 = Math.abs(i3) > anonymousClass39.A0H ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    if (Math.abs(i2) <= anonymousClass39.A0K) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i2 <= 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    iMax = i;
                    c2 = 5;
                    break;
                case 5:
                    anonymousClass39 = anonymousClass39;
                    if (anonymousClass39.A0t.size() <= 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    anonymousClass39 = anonymousClass39;
                    iMax = Math.max(anonymousClass39.A0t.get(0).A02, Math.min(iMax, anonymousClass39.A0t.get(r1.size() - 1).A02));
                    c2 = 7;
                    break;
                case 7:
                    return iMax;
                case '\b':
                    iMax = i + 1;
                    c2 = 5;
                    break;
                case '\t':
                    anonymousClass39 = anonymousClass39;
                    if (i < anonymousClass39.A00) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    f2 = 0.4f;
                    c2 = 11;
                    break;
                case 11:
                    iMax = i + ((int) (f + f2));
                    c2 = 5;
                    break;
                case '\f':
                    f2 = 0.6f;
                    c2 = 11;
                    break;
            }
        }
    }

    private Rect A02(Rect rect, View view) {
        ViewParent parent = this;
        ViewParent parent2 = null;
        char c2 = rect == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    rect = new Rect();
                    c2 = 3;
                    break;
                case 3:
                    view = view;
                    if (view != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    Rect rect2 = rect;
                    rect2.set(0, 0, 0, 0);
                    return rect2;
                case 5:
                    rect = rect;
                    view = view;
                    rect.left = view.getLeft();
                    rect.right = view.getRight();
                    rect.top = view.getTop();
                    rect.bottom = view.getBottom();
                    parent2 = view.getParent();
                    c2 = 6;
                    break;
                case 6:
                    parent2 = parent2;
                    if (!(parent2 instanceof ViewGroup)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    parent = (AnonymousClass39) parent;
                    parent2 = parent2;
                    if (parent2 == parent) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    rect = rect;
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    rect.left += viewGroup.getLeft();
                    rect.right += viewGroup.getRight();
                    rect.top += viewGroup.getTop();
                    rect.bottom += viewGroup.getBottom();
                    parent2 = viewGroup.getParent();
                    c2 = 6;
                    break;
                case '\t':
                    return rect;
            }
        }
    }

    private AnonymousClass31 A03() {
        AnonymousClass39 anonymousClass39 = this;
        AnonymousClass31 anonymousClass31 = null;
        float f = 0.0f;
        float lastOffset = 0.0f;
        float lastWidth = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        float f4 = 0.0f;
        boolean z = false;
        AnonymousClass31 anonymousClass312 = null;
        int i2 = 0;
        int clientWidth = anonymousClass39.getClientWidth();
        float f5 = 0.0f;
        int i3 = clientWidth > 0 ? 2 : 16;
        while (true) {
            switch (i3) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    float lastOffset2 = anonymousClass39.getScrollX();
                    lastOffset = lastOffset2 / clientWidth;
                    i3 = 3;
                    break;
                case 3:
                    if (clientWidth <= 0) {
                        i3 = 5;
                        break;
                    } else {
                        i3 = 4;
                        break;
                    }
                case 4:
                    anonymousClass39 = anonymousClass39;
                    int i4 = anonymousClass39.A0M;
                    f5 = i4 / clientWidth;
                    i3 = 5;
                    break;
                case 5:
                    i2 = -1;
                    f3 = 0.0f;
                    f2 = 0.0f;
                    z = true;
                    anonymousClass31 = null;
                    i = 0;
                    i3 = 6;
                    break;
                case 6:
                    anonymousClass39 = anonymousClass39;
                    int i5 = anonymousClass39.A0t.size();
                    if (i >= i5) {
                        i3 = 18;
                        break;
                    } else {
                        i3 = 7;
                        break;
                    }
                case 7:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass312 = anonymousClass39.A0t.get(i);
                    if (!z) {
                        i3 = 8;
                        break;
                    } else {
                        i3 = 10;
                        break;
                    }
                case 8:
                    anonymousClass312 = anonymousClass312;
                    int i6 = i2 + 1;
                    if (anonymousClass312.A02 == i6) {
                        i3 = 10;
                        break;
                    } else {
                        i3 = 9;
                        break;
                    }
                case 9:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass312 = anonymousClass39.A0r;
                    anonymousClass312.A00 = f3 + f2 + f5;
                    anonymousClass312.A02 = i2 + 1;
                    anonymousClass312.A01 = anonymousClass39.A01.A04(anonymousClass312.A02);
                    i--;
                    i3 = 10;
                    break;
                case 10:
                    anonymousClass312 = anonymousClass312;
                    lastWidth = anonymousClass312.A00;
                    f4 = lastWidth;
                    f = anonymousClass312.A01 + lastWidth + f5;
                    if (!z) {
                        i3 = 11;
                        break;
                    } else {
                        i3 = 12;
                        break;
                    }
                case 11:
                    if (lastOffset < f4) {
                        i3 = 17;
                        break;
                    } else {
                        i3 = 12;
                        break;
                    }
                case 12:
                    if (lastOffset < f) {
                        i3 = 14;
                        break;
                    } else {
                        i3 = 13;
                        break;
                    }
                case 13:
                    anonymousClass39 = anonymousClass39;
                    if (i != anonymousClass39.A0t.size() - 1) {
                        i3 = 15;
                        break;
                    } else {
                        i3 = 14;
                        break;
                    }
                case 14:
                    return anonymousClass312;
                case 15:
                    anonymousClass312 = anonymousClass312;
                    z = false;
                    i2 = anonymousClass312.A02;
                    f3 = lastWidth;
                    f2 = anonymousClass312.A01;
                    anonymousClass31 = anonymousClass312;
                    i++;
                    i3 = 6;
                    break;
                case 16:
                    lastOffset = 0.0f;
                    i3 = 3;
                    break;
                case 17:
                    return anonymousClass31;
                case 18:
                    return anonymousClass31;
            }
        }
    }

    private final AnonymousClass31 A04(int i) {
        AnonymousClass39 anonymousClass39 = this;
        AnonymousClass31 anonymousClass31 = null;
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    if (i2 >= anonymousClass39.A0t.size()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass31 = anonymousClass39.A0t.get(i2);
                    if (anonymousClass31.A02 != i) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return anonymousClass31;
                case 5:
                    i2++;
                    c2 = 2;
                    break;
                case 6:
                    return (AnonymousClass31) null;
            }
        }
    }

    private final AnonymousClass31 A05(int i, int i2) {
        AnonymousClass39 anonymousClass39 = this;
        AnonymousClass31 anonymousClass31 = new AnonymousClass31();
        anonymousClass31.A02 = i;
        anonymousClass31.A03 = anonymousClass39.A01.A08(anonymousClass39, i);
        anonymousClass31.A01 = anonymousClass39.A01.A04(i);
        char c2 = i2 >= 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    if (i2 < anonymousClass39.A0t.size()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass31 = anonymousClass31;
                    anonymousClass39.A0t.add(anonymousClass31);
                    c2 = 4;
                    break;
                case 4:
                    return anonymousClass31;
                case 5:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass31 = anonymousClass31;
                    anonymousClass39.A0t.add(i2, anonymousClass31);
                    c2 = 4;
                    break;
            }
        }
    }

    private final AnonymousClass31 A06(View view) {
        AnonymousClass39 anonymousClass39 = this;
        Object parent = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    view = view;
                    parent = view.getParent();
                    if (parent == anonymousClass39) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    parent = (ViewParent) parent;
                    if (parent == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    parent = (ViewParent) parent;
                    if (!(parent instanceof View)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    return (AnonymousClass31) null;
                case 6:
                    parent = (ViewParent) parent;
                    view = (View) parent;
                    c2 = 2;
                    break;
                case 7:
                    return anonymousClass39.A07(view);
            }
        }
    }

    private final AnonymousClass31 A07(View view) {
        AnonymousClass39 anonymousClass39 = this;
        AnonymousClass31 anonymousClass31 = null;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    if (i >= anonymousClass39.A0t.size()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    anonymousClass39 = anonymousClass39;
                    view = view;
                    anonymousClass31 = anonymousClass39.A0t.get(i);
                    if (!anonymousClass39.A01.A0C(view, anonymousClass31.A03)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return anonymousClass31;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return (AnonymousClass31) null;
            }
        }
    }

    private void A09() {
        this.A0k = false;
        this.A0m = false;
        VelocityTracker velocityTracker = this.A0U;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A0U = null;
        }
    }

    private void A0A() {
        AnonymousClass39 anonymousClass39 = this;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    if (i >= anonymousClass39.getChildCount()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    anonymousClass39 = anonymousClass39;
                    View child = anonymousClass39.getChildAt(i);
                    if (!((AnonymousClass32) child.getLayoutParams()).A05) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.removeViewAt(i);
                    i--;
                    c2 = 5;
                    break;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return;
            }
        }
    }

    private void A0B() {
        AnonymousClass39 anonymousClass39 = this;
        ArrayList<View> arrayList = null;
        int i = 0;
        int childCount = 0;
        char c2 = anonymousClass39.A0F != 0 ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    arrayList = anonymousClass39.A0d;
                    if (arrayList != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0d = new ArrayList<>();
                    c2 = 4;
                    break;
                case 4:
                    anonymousClass39 = anonymousClass39;
                    childCount = anonymousClass39.getChildCount();
                    i = 0;
                    c2 = 5;
                    break;
                case 5:
                    if (i >= childCount) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0d.add(anonymousClass39.getChildAt(i));
                    i++;
                    c2 = 5;
                    break;
                case 7:
                    arrayList = arrayList;
                    arrayList.clear();
                    c2 = 4;
                    break;
                case '\b':
                    anonymousClass39 = anonymousClass39;
                    Collections.sort(anonymousClass39.A0d, A0x);
                    c2 = '\t';
                    break;
                case '\t':
                    return;
            }
        }
    }

    private final void A0D() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.A0X = new Scroller(context, A0w);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.A0R = viewConfiguration.getScaledPagingTouchSlop();
        this.A0K = (int) (400.0f * f);
        this.A0J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0V = new EdgeEffect(context);
        this.A0W = new EdgeEffect(context);
        this.A0H = (int) (25.0f * f);
        this.A0C = (int) (2.0f * f);
        this.A0E = (int) (16.0f * f);
        C2v.A0A(this, new C0803Sn(this));
        if (C2v.A00(this) == 0) {
            C2v.A09(this, 1);
        }
        C2v.A0B(this, new C0802Sm(this));
    }

    private void A0E(int i) {
        AnonymousClass39 anonymousClass39 = this;
        int size = 0;
        int i2 = 0;
        List<AnonymousClass34> list = null;
        char c2 = anonymousClass39.A0Z != null ? (char) 2 : (char) 2;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    list = anonymousClass39.A0f;
                    if (list == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    list = list;
                    i2 = 0;
                    size = list.size();
                    c2 = 4;
                    break;
                case 4:
                    if (i2 >= size) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    anonymousClass39 = anonymousClass39;
                    if (anonymousClass39.A0f.get(i2) == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    i2++;
                    c2 = 4;
                    break;
                case 7:
                    anonymousClass39 = anonymousClass39;
                    if (anonymousClass39.A0Y == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return;
            }
        }
    }

    private void A0F(int i) {
        AnonymousClass39 anonymousClass39 = this;
        int size = 0;
        int i2 = 0;
        List<AnonymousClass34> list = null;
        char c2 = anonymousClass39.A0Z != null ? (char) 2 : (char) 2;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    list = anonymousClass39.A0f;
                    if (list == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    list = list;
                    i2 = 0;
                    size = list.size();
                    c2 = 4;
                    break;
                case 4:
                    if (i2 >= size) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    anonymousClass39 = anonymousClass39;
                    if (anonymousClass39.A0f.get(i2) == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    i2++;
                    c2 = 4;
                    break;
                case 7:
                    anonymousClass39 = anonymousClass39;
                    if (anonymousClass39.A0Y == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return;
            }
        }
    }

    private final void A0G(int i) throws Resources.NotFoundException {
        AnonymousClass39 anonymousClass39 = this;
        String hexString = null;
        int i2 = 0;
        AnonymousClass31 ii = null;
        int endPos = 0;
        float paddingLeft = 0.0f;
        float f = 0.0f;
        int i3 = 0;
        AnonymousClass31 anonymousClass31A04 = null;
        AnonymousClass31 anonymousClass31A05 = null;
        int startPos = 0;
        AnonymousClass31 ii2 = null;
        int clientWidth = 0;
        int i4 = 0;
        View childAt = null;
        int i5 = 0;
        AnonymousClass31 anonymousClass31 = null;
        int iA05 = 0;
        View childAt2 = null;
        AnonymousClass31 anonymousClass312 = null;
        float f2 = 0.0f;
        int i6 = 0;
        int iMax = 0;
        AnonymousClass31 anonymousClass313 = null;
        AnonymousClass31 anonymousClass31A07 = null;
        float paddingRight = 0.0f;
        int iMin = 0;
        int childCount = 0;
        AnonymousClass32 lp = null;
        AnonymousClass31 anonymousClass31A072 = null;
        AnonymousClass31 anonymousClass314 = null;
        AnonymousClass31 anonymousClass315 = null;
        AnonymousClass31 anonymousClass316 = null;
        AnonymousClass31 anonymousClass317 = null;
        float f3 = 0.0f;
        View viewFindFocus = null;
        AnonymousClass31 anonymousClass31A06 = null;
        AnonymousClass39 anonymousClass392 = anonymousClass39;
        int i7 = anonymousClass392.A00;
        int i8 = i7 != i ? 2 : 5;
        while (true) {
            switch (i8) {
                case 2:
                    anonymousClass392 = anonymousClass392;
                    anonymousClass31A04 = anonymousClass392.A04(i7);
                    anonymousClass392.A00 = i;
                    i8 = 3;
                    break;
                case 3:
                    anonymousClass392 = anonymousClass392;
                    if (anonymousClass392.A01 != null) {
                        i8 = 6;
                        break;
                    } else {
                        i8 = 4;
                        break;
                    }
                case 4:
                    anonymousClass39.A0B();
                    return;
                case 5:
                    anonymousClass31A04 = null;
                    i8 = 3;
                    break;
                case 6:
                    anonymousClass392 = anonymousClass392;
                    if (!anonymousClass392.A0o) {
                        i8 = 8;
                        break;
                    } else {
                        i8 = 7;
                        break;
                    }
                case 7:
                    anonymousClass39.A0B();
                    return;
                case 8:
                    anonymousClass39 = anonymousClass39;
                    if (anonymousClass39.getWindowToken() != null) {
                        i8 = 10;
                        break;
                    } else {
                        i8 = 9;
                        break;
                    }
                case 9:
                    return;
                case 10:
                    anonymousClass392 = anonymousClass392;
                    int i9 = anonymousClass392.A0L;
                    iMax = Math.max(0, anonymousClass392.A00 - i9);
                    iA05 = anonymousClass392.A01.A05();
                    iMin = Math.min(iA05 - 1, anonymousClass392.A00 + i9);
                    if (iA05 != anonymousClass392.A0G) {
                        i8 = 99;
                        break;
                    } else {
                        i8 = 11;
                        break;
                    }
                case 11:
                    anonymousClass31A05 = null;
                    i4 = 0;
                    i8 = 12;
                    break;
                case 12:
                    anonymousClass392 = anonymousClass392;
                    if (i4 >= anonymousClass392.A0t.size()) {
                        i8 = 16;
                        break;
                    } else {
                        i8 = 13;
                        break;
                    }
                case 13:
                    anonymousClass392 = anonymousClass392;
                    ii2 = anonymousClass392.A0t.get(i4);
                    if (ii2.A02 < anonymousClass392.A00) {
                        i8 = 85;
                        break;
                    } else {
                        i8 = 14;
                        break;
                    }
                case 14:
                    anonymousClass392 = anonymousClass392;
                    ii2 = ii2;
                    if (ii2.A02 != anonymousClass392.A00) {
                        i8 = 16;
                        break;
                    } else {
                        i8 = 15;
                        break;
                    }
                case 15:
                    ii2 = ii2;
                    anonymousClass31A05 = ii2;
                    i8 = 16;
                    break;
                case 16:
                    if (anonymousClass31A05 != null) {
                        i8 = 19;
                        break;
                    } else {
                        i8 = 17;
                        break;
                    }
                case 17:
                    if (iA05 <= 0) {
                        i8 = 19;
                        break;
                    } else {
                        i8 = 18;
                        break;
                    }
                case 18:
                    anonymousClass392 = anonymousClass392;
                    anonymousClass31A05 = anonymousClass392.A05(anonymousClass392.A00, i4);
                    i8 = 19;
                    break;
                case 19:
                    if (anonymousClass31A05 == null) {
                        i8 = 40;
                        break;
                    } else {
                        i8 = 20;
                        break;
                    }
                case 20:
                    f = 0.0f;
                    i5 = i4 - 1;
                    if (i5 < 0) {
                        i8 = 84;
                        break;
                    } else {
                        i8 = 21;
                        break;
                    }
                case 21:
                    anonymousClass392 = anonymousClass392;
                    AnonymousClass31 ii3 = anonymousClass392.A0t.get(i5);
                    anonymousClass31 = ii3;
                    i8 = 22;
                    break;
                case 22:
                    anonymousClass39 = anonymousClass39;
                    clientWidth = anonymousClass39.getClientWidth();
                    f2 = 2.0f;
                    if (clientWidth > 0) {
                        i8 = 83;
                        break;
                    } else {
                        i8 = 23;
                        break;
                    }
                case 23:
                    paddingLeft = 0.0f;
                    i8 = 24;
                    break;
                case 24:
                    anonymousClass392 = anonymousClass392;
                    i3 = anonymousClass392.A00 - 1;
                    i8 = 25;
                    break;
                case 25:
                    if (i3 < 0) {
                        i8 = 29;
                        break;
                    } else {
                        i8 = 26;
                        break;
                    }
                case 26:
                    if (f < paddingLeft) {
                        i8 = 67;
                        break;
                    } else {
                        i8 = 27;
                        break;
                    }
                case 27:
                    if (i3 >= iMax) {
                        i8 = 67;
                        break;
                    } else {
                        i8 = 28;
                        break;
                    }
                case 28:
                    if (anonymousClass31 != null) {
                        i8 = 76;
                        break;
                    } else {
                        i8 = 29;
                        break;
                    }
                case 29:
                    AnonymousClass31 ii4 = anonymousClass31A05;
                    f3 = ii4.A01;
                    endPos = i4 + 1;
                    if (f3 >= 2.0f) {
                        i8 = 39;
                        break;
                    } else {
                        i8 = 30;
                        break;
                    }
                case 30:
                    anonymousClass392 = anonymousClass392;
                    int pageLimit = anonymousClass392.A0t.size();
                    if (endPos >= pageLimit) {
                        i8 = 66;
                        break;
                    } else {
                        i8 = 31;
                        break;
                    }
                case 31:
                    anonymousClass392 = anonymousClass392;
                    anonymousClass312 = anonymousClass392.A0t.get(endPos);
                    i8 = 32;
                    break;
                case 32:
                    if (clientWidth > 0) {
                        i8 = 65;
                        break;
                    } else {
                        i8 = 33;
                        break;
                    }
                case 33:
                    paddingRight = 0.0f;
                    i8 = 34;
                    break;
                case 34:
                    anonymousClass392 = anonymousClass392;
                    i6 = anonymousClass392.A00 + 1;
                    i8 = 35;
                    break;
                case 35:
                    if (i6 >= iA05) {
                        i8 = 39;
                        break;
                    } else {
                        i8 = 36;
                        break;
                    }
                case 36:
                    if (f3 < paddingRight) {
                        i8 = 48;
                        break;
                    } else {
                        i8 = 37;
                        break;
                    }
                case 37:
                    if (i6 <= iMin) {
                        i8 = 48;
                        break;
                    } else {
                        i8 = 38;
                        break;
                    }
                case 38:
                    if (anonymousClass312 != null) {
                        i8 = 58;
                        break;
                    } else {
                        i8 = 39;
                        break;
                    }
                case 39:
                    anonymousClass392 = anonymousClass392;
                    anonymousClass392.A0Q(anonymousClass31A05, i4, anonymousClass31A04);
                    i8 = 40;
                    break;
                case 40:
                    if (anonymousClass31A05 == null) {
                        i8 = 41;
                        break;
                    } else {
                        i8 = 41;
                        break;
                    }
                case 41:
                    anonymousClass39 = anonymousClass39;
                    childCount = anonymousClass39.getChildCount();
                    startPos = 0;
                    i8 = 42;
                    break;
                case 42:
                    if (startPos >= childCount) {
                        i8 = 86;
                        break;
                    } else {
                        i8 = 43;
                        break;
                    }
                case 43:
                    anonymousClass392 = anonymousClass392;
                    childAt = anonymousClass392.getChildAt(startPos);
                    lp = (AnonymousClass32) childAt.getLayoutParams();
                    lp.A01 = startPos;
                    if (!lp.A05) {
                        i8 = 44;
                        break;
                    } else {
                        i8 = 47;
                        break;
                    }
                case 44:
                    lp = lp;
                    if (lp.A00 != 0.0f) {
                        i8 = 47;
                        break;
                    } else {
                        i8 = 45;
                        break;
                    }
                case 45:
                    anonymousClass392 = anonymousClass392;
                    childAt = childAt;
                    anonymousClass31A072 = anonymousClass392.A07(childAt);
                    if (anonymousClass31A072 == null) {
                        i8 = 47;
                        break;
                    } else {
                        i8 = 46;
                        break;
                    }
                case 46:
                    lp = lp;
                    anonymousClass31A072 = anonymousClass31A072;
                    lp.A00 = anonymousClass31A072.A01;
                    lp.A02 = anonymousClass31A072.A02;
                    i8 = 47;
                    break;
                case 47:
                    startPos++;
                    i8 = 42;
                    break;
                case 48:
                    if (anonymousClass312 == null) {
                        i8 = 54;
                        break;
                    } else {
                        i8 = 49;
                        break;
                    }
                case 49:
                    if (i6 != anonymousClass312.A02) {
                        i8 = 54;
                        break;
                    } else {
                        i8 = 50;
                        break;
                    }
                case 50:
                    anonymousClass392 = anonymousClass392;
                    f3 += anonymousClass312.A01;
                    endPos++;
                    int pageLimit2 = anonymousClass392.A0t.size();
                    if (endPos >= pageLimit2) {
                        i8 = 53;
                        break;
                    } else {
                        i8 = 51;
                        break;
                    }
                case 51:
                    anonymousClass392 = anonymousClass392;
                    AnonymousClass31 ii5 = anonymousClass392.A0t.get(endPos);
                    anonymousClass314 = ii5;
                    i8 = 52;
                    break;
                case 52:
                    anonymousClass312 = anonymousClass314;
                    i8 = 63;
                    break;
                case 53:
                    anonymousClass314 = null;
                    i8 = 52;
                    break;
                case 54:
                    anonymousClass392 = anonymousClass392;
                    AnonymousClass31 ii6 = anonymousClass392.A05(i6, endPos);
                    endPos++;
                    f3 += ii6.A01;
                    if (endPos >= anonymousClass392.A0t.size()) {
                        i8 = 57;
                        break;
                    } else {
                        i8 = 55;
                        break;
                    }
                case 55:
                    anonymousClass392 = anonymousClass392;
                    anonymousClass313 = anonymousClass392.A0t.get(endPos);
                    i8 = 56;
                    break;
                case 56:
                    anonymousClass312 = anonymousClass313;
                    i8 = 63;
                    break;
                case 57:
                    anonymousClass313 = null;
                    i8 = 56;
                    break;
                case 58:
                    int pageLimit3 = anonymousClass312.A02;
                    if (i6 != pageLimit3) {
                        i8 = 63;
                        break;
                    } else {
                        i8 = 59;
                        break;
                    }
                case 59:
                    AnonymousClass31 ii7 = anonymousClass312;
                    if (!ii7.A04) {
                        i8 = 60;
                        break;
                    } else {
                        i8 = 63;
                        break;
                    }
                case 60:
                    anonymousClass392 = anonymousClass392;
                    anonymousClass392.A0t.remove(endPos);
                    anonymousClass392.A01.A0B(anonymousClass392, i6, anonymousClass312.A03);
                    if (endPos >= anonymousClass392.A0t.size()) {
                        i8 = 64;
                        break;
                    } else {
                        i8 = 61;
                        break;
                    }
                case 61:
                    anonymousClass392 = anonymousClass392;
                    anonymousClass315 = anonymousClass392.A0t.get(endPos);
                    i8 = 62;
                    break;
                case 62:
                    anonymousClass312 = anonymousClass315;
                    i8 = 63;
                    break;
                case 63:
                    i6++;
                    i8 = 35;
                    break;
                case 64:
                    anonymousClass315 = null;
                    i8 = 62;
                    break;
                case 65:
                    anonymousClass39 = anonymousClass39;
                    paddingRight = (anonymousClass39.getPaddingRight() / clientWidth) + 2.0f;
                    i8 = 34;
                    break;
                case 66:
                    anonymousClass312 = null;
                    i8 = 32;
                    break;
                case 67:
                    if (anonymousClass31 == null) {
                        i8 = 73;
                        break;
                    } else {
                        i8 = 68;
                        break;
                    }
                case 68:
                    if (i3 != anonymousClass31.A02) {
                        i8 = 73;
                        break;
                    } else {
                        i8 = 69;
                        break;
                    }
                case 69:
                    f += anonymousClass31.A01;
                    i5--;
                    if (i5 < 0) {
                        i8 = 72;
                        break;
                    } else {
                        i8 = 70;
                        break;
                    }
                case 70:
                    anonymousClass392 = anonymousClass392;
                    anonymousClass316 = anonymousClass392.A0t.get(i5);
                    i8 = 71;
                    break;
                case 71:
                    anonymousClass31 = anonymousClass316;
                    i8 = 81;
                    break;
                case 72:
                    anonymousClass316 = null;
                    i8 = 71;
                    break;
                case 73:
                    anonymousClass392 = anonymousClass392;
                    AnonymousClass31 ii8 = anonymousClass392.A05(i3, i5 + 1);
                    f += ii8.A01;
                    i4++;
                    if (i5 < 0) {
                        i8 = 75;
                        break;
                    } else {
                        i8 = 74;
                        break;
                    }
                case 74:
                    anonymousClass392 = anonymousClass392;
                    anonymousClass31 = anonymousClass392.A0t.get(i5);
                    i8 = 81;
                    break;
                case 75:
                    anonymousClass31 = null;
                    i8 = 81;
                    break;
                case 76:
                    if (i3 != anonymousClass31.A02) {
                        i8 = 81;
                        break;
                    } else {
                        i8 = 77;
                        break;
                    }
                case 77:
                    if (!anonymousClass31.A04) {
                        i8 = 78;
                        break;
                    } else {
                        i8 = 81;
                        break;
                    }
                case 78:
                    anonymousClass392 = anonymousClass392;
                    anonymousClass392.A0t.remove(i5);
                    anonymousClass392.A01.A0B(anonymousClass392, i3, anonymousClass31.A03);
                    i5--;
                    i4--;
                    if (i5 < 0) {
                        i8 = 82;
                        break;
                    } else {
                        i8 = 79;
                        break;
                    }
                case 79:
                    anonymousClass392 = anonymousClass392;
                    anonymousClass317 = anonymousClass392.A0t.get(i5);
                    i8 = 80;
                    break;
                case 80:
                    anonymousClass31 = anonymousClass317;
                    i8 = 81;
                    break;
                case 81:
                    i3--;
                    i8 = 25;
                    break;
                case 82:
                    anonymousClass317 = null;
                    i8 = 80;
                    break;
                case 83:
                    anonymousClass39 = anonymousClass39;
                    paddingLeft = (anonymousClass39.getPaddingLeft() / clientWidth) + (f2 - anonymousClass31A05.A01);
                    i8 = 24;
                    break;
                case k.AppCompatTheme_panelBackground /* 84 */:
                    anonymousClass31 = null;
                    i8 = 22;
                    break;
                case 85:
                    i4++;
                    i8 = 12;
                    break;
                case 86:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0B();
                    if (!anonymousClass39.hasFocus()) {
                        i8 = 96;
                        break;
                    } else {
                        i8 = 87;
                        break;
                    }
                case 87:
                    anonymousClass39 = anonymousClass39;
                    viewFindFocus = anonymousClass39.findFocus();
                    if (viewFindFocus == null) {
                        i8 = 98;
                        break;
                    } else {
                        i8 = 88;
                        break;
                    }
                case 88:
                    anonymousClass392 = anonymousClass392;
                    viewFindFocus = viewFindFocus;
                    anonymousClass31A06 = anonymousClass392.A06(viewFindFocus);
                    i8 = 89;
                    break;
                case 89:
                    ii = anonymousClass31A06;
                    if (ii == null) {
                        i8 = 91;
                        break;
                    } else {
                        i8 = 90;
                        break;
                    }
                case 90:
                    anonymousClass392 = anonymousClass392;
                    if (ii.A02 == anonymousClass392.A00) {
                        i8 = 96;
                        break;
                    } else {
                        i8 = 91;
                        break;
                    }
                case 91:
                    i2 = 0;
                    i8 = 92;
                    break;
                case 92:
                    anonymousClass39 = anonymousClass39;
                    int i10 = anonymousClass39.getChildCount();
                    if (i2 >= i10) {
                        i8 = 96;
                        break;
                    } else {
                        i8 = 93;
                        break;
                    }
                case 93:
                    anonymousClass392 = anonymousClass392;
                    childAt2 = anonymousClass392.getChildAt(i2);
                    anonymousClass31A07 = anonymousClass392.A07(childAt2);
                    if (anonymousClass31A07 == null) {
                        i8 = 97;
                        break;
                    } else {
                        i8 = 94;
                        break;
                    }
                case 94:
                    anonymousClass392 = anonymousClass392;
                    anonymousClass31A07 = anonymousClass31A07;
                    int i11 = anonymousClass31A07.A02;
                    int i12 = anonymousClass392.A00;
                    if (i11 != i12) {
                        i8 = 97;
                        break;
                    } else {
                        i8 = 95;
                        break;
                    }
                case 95:
                    childAt2 = childAt2;
                    if (!childAt2.requestFocus(2)) {
                        i8 = 97;
                        break;
                    } else {
                        i8 = 96;
                        break;
                    }
                case 96:
                    return;
                case 97:
                    i2++;
                    i8 = 92;
                    break;
                case 98:
                    anonymousClass31A06 = null;
                    i8 = 89;
                    break;
                case 99:
                    try {
                        anonymousClass39 = anonymousClass39;
                        Resources resources = anonymousClass39.getResources();
                        int i13 = anonymousClass39.getId();
                        hexString = resources.getResourceName(i13);
                        i8 = 104;
                        break;
                    } catch (Resources.NotFoundException unused) {
                        int i14 = anonymousClass39.getId();
                        hexString = Integer.toHexString(i14);
                        i8 = 104;
                        break;
                    }
                case 104:
                    AnonymousClass39 anonymousClass393 = anonymousClass392;
                    throw new IllegalStateException(A08(143, 142, 0) + anonymousClass393.A0G + A08(63, 9, 21) + iA05 + A08(423, 11, 86) + hexString + A08(129, 14, 21) + anonymousClass39.getClass() + A08(0, 22, 87) + anonymousClass393.A01.getClass());
            }
        }
    }

    private void A0H(int i, float f, int i2) {
        AnonymousClass39 anonymousClass39 = this;
        int i3 = 0;
        int size = 0;
        List<AnonymousClass34> list = null;
        char c2 = anonymousClass39.A0Z != null ? (char) 2 : (char) 2;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    list = anonymousClass39.A0f;
                    if (list == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    list = list;
                    i3 = 0;
                    size = list.size();
                    c2 = 4;
                    break;
                case 4:
                    if (i3 >= size) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    anonymousClass39 = anonymousClass39;
                    if (anonymousClass39.A0f.get(i3) == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    i3++;
                    c2 = 4;
                    break;
                case 7:
                    anonymousClass39 = anonymousClass39;
                    if (anonymousClass39.A0Y == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return;
            }
        }
    }

    @CallSuper
    private final void A0I(int i, float f, int i2) {
        AnonymousClass39 anonymousClass39 = this;
        View child = null;
        int childCount = 0;
        int i3 = 0;
        AnonymousClass32 anonymousClass32 = null;
        int i4 = 0;
        int i5 = 0;
        int childCount2 = 0;
        int paddingLeft = 0;
        int scrollX = 0;
        int left = 0;
        View childAt = null;
        int measuredWidth = 0;
        int paddingRight = 0;
        int width = 0;
        AnonymousClass39 anonymousClass392 = anonymousClass39;
        int childOffset = anonymousClass392.A0D > 0 ? 2 : 15;
        while (true) {
            switch (childOffset) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    scrollX = anonymousClass39.getScrollX();
                    paddingLeft = anonymousClass39.getPaddingLeft();
                    paddingRight = anonymousClass39.getPaddingRight();
                    width = anonymousClass39.getWidth();
                    childCount2 = anonymousClass39.getChildCount();
                    i4 = 0;
                    childOffset = 3;
                    break;
                case 3:
                    if (i4 >= childCount2) {
                        childOffset = 15;
                        break;
                    } else {
                        childOffset = 4;
                        break;
                    }
                case 4:
                    anonymousClass39 = anonymousClass39;
                    childAt = anonymousClass39.getChildAt(i4);
                    anonymousClass32 = (AnonymousClass32) childAt.getLayoutParams();
                    if (!anonymousClass32.A05) {
                        childOffset = 5;
                        break;
                    } else {
                        childOffset = 6;
                        break;
                    }
                case 5:
                    i4++;
                    childOffset = 3;
                    break;
                case 6:
                    anonymousClass32 = anonymousClass32;
                    int childCount3 = anonymousClass32.A04;
                    i5 = childCount3 & 7;
                    if (i5 == 1) {
                        childOffset = 14;
                        break;
                    } else {
                        childOffset = 7;
                        break;
                    }
                case 7:
                    if (i5 == 3) {
                        childOffset = 13;
                        break;
                    } else {
                        childOffset = 8;
                        break;
                    }
                case 8:
                    if (i5 == 5) {
                        childOffset = 12;
                        break;
                    } else {
                        childOffset = 9;
                        break;
                    }
                case 9:
                    measuredWidth = paddingLeft;
                    childOffset = 10;
                    break;
                case 10:
                    childAt = childAt;
                    left = (measuredWidth + scrollX) - childAt.getLeft();
                    if (left == 0) {
                        childOffset = 5;
                        break;
                    } else {
                        childOffset = 11;
                        break;
                    }
                case 11:
                    childAt = childAt;
                    childAt.offsetLeftAndRight(left);
                    childOffset = 5;
                    break;
                case 12:
                    childAt = childAt;
                    measuredWidth = (width - paddingRight) - childAt.getMeasuredWidth();
                    paddingRight += childAt.getMeasuredWidth();
                    childOffset = 10;
                    break;
                case 13:
                    childAt = childAt;
                    measuredWidth = paddingLeft;
                    paddingLeft += childAt.getWidth();
                    childOffset = 10;
                    break;
                case 14:
                    childAt = childAt;
                    measuredWidth = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    childOffset = 10;
                    break;
                case 15:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass392 = anonymousClass392;
                    anonymousClass39.A0H(i, f, i2);
                    if (anonymousClass392.A0a == null) {
                        childOffset = 21;
                        break;
                    } else {
                        childOffset = 16;
                        break;
                    }
                case 16:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.getScrollX();
                    i3 = anonymousClass39.getChildCount();
                    childCount = 0;
                    childOffset = 17;
                    break;
                case 17:
                    if (childCount >= i3) {
                        childOffset = 21;
                        break;
                    } else {
                        childOffset = 18;
                        break;
                    }
                case 18:
                    anonymousClass39 = anonymousClass39;
                    child = anonymousClass39.getChildAt(childCount);
                    AnonymousClass32 lp = (AnonymousClass32) child.getLayoutParams();
                    if (!lp.A05) {
                        childOffset = 20;
                        break;
                    } else {
                        childOffset = 19;
                        break;
                    }
                case 19:
                    childCount++;
                    childOffset = 17;
                    break;
                case 20:
                    anonymousClass39 = anonymousClass39;
                    child = child;
                    child.getLeft();
                    anonymousClass39.getClientWidth();
                    childOffset = 19;
                    break;
                case 21:
                    anonymousClass392.A0g = true;
                    return;
            }
        }
    }

    private final void A0J(int i, int i2, int i3) throws Resources.NotFoundException {
        AnonymousClass39 anonymousClass39 = this;
        float f = 0.0f;
        int clientWidth = 0;
        boolean z = false;
        int i4 = 0;
        int iAbs = 0;
        Scroller scroller = null;
        int iRound = 0;
        int currX = 0;
        boolean z2 = false;
        int i5 = 0;
        float fA00 = 0.0f;
        int scrollY = 0;
        AnonymousClass39 anonymousClass392 = anonymousClass39;
        boolean z3 = false;
        char c2 = anonymousClass39.getChildCount() == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass392.setScrollingCacheEnabled(false);
                    return;
                case 3:
                    anonymousClass392 = anonymousClass392;
                    scroller = anonymousClass392.A0X;
                    z2 = true;
                    if (scroller == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    scroller = scroller;
                    if (!scroller.isFinished()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 5:
                    z = true;
                    c2 = 6;
                    break;
                case 6:
                    if (!z) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    anonymousClass392 = anonymousClass392;
                    if (!anonymousClass392.A0l) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    anonymousClass392 = anonymousClass392;
                    currX = anonymousClass392.A0X.getCurrX();
                    c2 = '\t';
                    break;
                case '\t':
                    anonymousClass392 = anonymousClass392;
                    z3 = false;
                    anonymousClass392.A0X.abortAnimation();
                    anonymousClass392.setScrollingCacheEnabled(false);
                    c2 = '\n';
                    break;
                case '\n':
                    anonymousClass39 = anonymousClass39;
                    scrollY = anonymousClass39.getScrollY();
                    i5 = i - currX;
                    i4 = i2 - scrollY;
                    if (i5 != 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    if (i4 != 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    AnonymousClass39 anonymousClass393 = anonymousClass392;
                    anonymousClass393.A0R(z3);
                    anonymousClass39.A0f();
                    anonymousClass393.setScrollState(z3 ? 1 : 0);
                    return;
                case '\r':
                    anonymousClass392 = anonymousClass392;
                    currX = anonymousClass392.A0X.getStartX();
                    c2 = '\t';
                    break;
                case 14:
                    anonymousClass39 = anonymousClass39;
                    currX = anonymousClass39.getScrollX();
                    c2 = '\n';
                    break;
                case 15:
                    z = false;
                    c2 = 6;
                    break;
                case 16:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass392 = anonymousClass392;
                    anonymousClass392.setScrollingCacheEnabled(z2);
                    anonymousClass392.setScrollState(2);
                    clientWidth = anonymousClass39.getClientWidth();
                    int i6 = clientWidth / 2;
                    f = 1.0f;
                    fA00 = i6 + (i6 * anonymousClass392.A00(Math.min(1.0f, (Math.abs(i5) * 1.0f) / clientWidth)));
                    iAbs = Math.abs(i3);
                    if (iAbs <= 0) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    iRound = Math.round(Math.abs(fA00 / iAbs) * 1000.0f) * 4;
                    c2 = 18;
                    break;
                case 18:
                    AnonymousClass39 anonymousClass394 = anonymousClass392;
                    int iMin = Math.min(iRound, 600);
                    anonymousClass394.A0l = z3;
                    anonymousClass394.A0X.startScroll(currX, scrollY, i5, i4, iMin);
                    C2v.A07(anonymousClass39);
                    return;
                case 19:
                    anonymousClass392 = anonymousClass392;
                    iRound = (int) ((f + (Math.abs(i5) / (anonymousClass392.A0M + (clientWidth * anonymousClass392.A01.A04(anonymousClass392.A00))))) * 100.0f);
                    c2 = 18;
                    break;
            }
        }
    }

    private void A0K(int i, int i2, int i3, int i4) {
        AnonymousClass39 anonymousClass39 = this;
        int paddingLeft = 0;
        float fMin = 0.0f;
        AnonymousClass31 anonymousClass31A04 = null;
        char c2 = i2 > 0 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    if (!anonymousClass39.A0t.isEmpty()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 3:
                    anonymousClass39 = anonymousClass39;
                    if (!anonymousClass39.A0X.isFinished()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 4:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0X.setFinalX(anonymousClass39.getCurrentItem() * anonymousClass39.getClientWidth());
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.scrollTo((int) ((((i - anonymousClass39.getPaddingLeft()) - anonymousClass39.getPaddingRight()) + i3) * (anonymousClass39.getScrollX() / (((i2 - anonymousClass39.getPaddingLeft()) - anonymousClass39.getPaddingRight()) + i4))), anonymousClass39.getScrollY());
                    c2 = 5;
                    break;
                case 7:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass31A04 = anonymousClass39.A04(anonymousClass39.A00);
                    if (anonymousClass31A04 == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    anonymousClass39 = anonymousClass39;
                    anonymousClass31A04 = anonymousClass31A04;
                    fMin = Math.min(anonymousClass31A04.A00, anonymousClass39.A07);
                    c2 = '\t';
                    break;
                case '\t':
                    anonymousClass39 = anonymousClass39;
                    paddingLeft = (int) (((i - anonymousClass39.getPaddingLeft()) - anonymousClass39.getPaddingRight()) * fMin);
                    if (paddingLeft == anonymousClass39.getScrollX()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0R(false);
                    anonymousClass39.scrollTo(paddingLeft, anonymousClass39.getScrollY());
                    c2 = 5;
                    break;
                case 11:
                    fMin = 0.0f;
                    c2 = '\t';
                    break;
            }
        }
    }

    private final void A0L(int i, boolean z) throws Resources.NotFoundException {
        this.A0o = false;
        A0N(i, z, false);
    }

    private void A0M(int destX, boolean z, int i, boolean z2) throws Resources.NotFoundException {
        AnonymousClass39 anonymousClass39 = this;
        AnonymousClass31 anonymousClass31A04 = anonymousClass39.A04(destX);
        int clientWidth = 0;
        char c2 = anonymousClass31A04 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass31A04 = anonymousClass31A04;
                    clientWidth = (int) (anonymousClass39.getClientWidth() * Math.max(anonymousClass39.A02, Math.min(anonymousClass31A04.A00, anonymousClass39.A07)));
                    c2 = 3;
                    break;
                case 3:
                    if (!z) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0J(clientWidth, 0, i);
                    if (!z2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0E(destX);
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    if (!z2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0E(destX);
                    c2 = '\t';
                    break;
                case '\t':
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0R(false);
                    anonymousClass39.scrollTo(clientWidth, 0);
                    anonymousClass39.A0Z(clientWidth);
                    c2 = 6;
                    break;
            }
        }
    }

    private final void A0N(int i, boolean z, boolean z2) throws Resources.NotFoundException {
        A0O(i, z, z2, 0);
    }

    private final void A0O(int i, boolean z, boolean z2, int i2) throws Resources.NotFoundException {
        AnonymousClass39 anonymousClass39 = this;
        boolean z3 = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        AbstractC01632g abstractC01632g = anonymousClass39.A01;
        char c2 = abstractC01632g != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    abstractC01632g = abstractC01632g;
                    if (abstractC01632g.A05() > 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    anonymousClass39.setScrollingCacheEnabled(false);
                    return;
                case 4:
                    if (!z2) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 5:
                    anonymousClass39 = anonymousClass39;
                    if (anonymousClass39.A00 != i) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    anonymousClass39 = anonymousClass39;
                    if (anonymousClass39.A0t.size() == 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    anonymousClass39.setScrollingCacheEnabled(false);
                    return;
                case '\b':
                    z3 = true;
                    if (i >= 0) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    i = 0;
                    c2 = '\n';
                    break;
                case '\n':
                    anonymousClass39 = anonymousClass39;
                    i5 = anonymousClass39.A0L;
                    i4 = anonymousClass39.A00;
                    if (i > i4 + i5) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    if (i >= i4 - i5) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    i3 = 0;
                    c2 = '\r';
                    break;
                case '\r':
                    anonymousClass39 = anonymousClass39;
                    if (i3 >= anonymousClass39.A0t.size()) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0t.get(i3).A04 = z3;
                    i3++;
                    c2 = '\r';
                    break;
                case 15:
                    anonymousClass39 = anonymousClass39;
                    if (i < anonymousClass39.A01.A05()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    anonymousClass39 = anonymousClass39;
                    i = anonymousClass39.A01.A05() - 1;
                    c2 = '\n';
                    break;
                case 17:
                    anonymousClass39 = anonymousClass39;
                    if (anonymousClass39.A00 == i) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    anonymousClass39 = anonymousClass39;
                    if (!anonymousClass39.A0i) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A00 = i;
                    if (!z3) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0E(i);
                    c2 = 21;
                    break;
                case 21:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.requestLayout();
                    c2 = 22;
                    break;
                case 22:
                    return;
                case 23:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0G(i);
                    anonymousClass39.A0M(i, z, i2, z3);
                    c2 = 22;
                    break;
                case 24:
                    z3 = false;
                    c2 = 18;
                    break;
            }
        }
    }

    private void A0P(MotionEvent motionEvent) {
        AnonymousClass39 anonymousClass39 = this;
        int newPointerIndex = 0;
        VelocityTracker velocityTracker = null;
        int actionIndex = motionEvent.getActionIndex();
        char c2 = motionEvent.getPointerId(actionIndex) == anonymousClass39.A08 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (actionIndex != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    newPointerIndex = 1;
                    c2 = 4;
                    break;
                case 4:
                    anonymousClass39 = anonymousClass39;
                    motionEvent = motionEvent;
                    anonymousClass39.A05 = motionEvent.getX(newPointerIndex);
                    anonymousClass39.A08 = motionEvent.getPointerId(newPointerIndex);
                    velocityTracker = anonymousClass39.A0U;
                    if (velocityTracker == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    velocityTracker = velocityTracker;
                    velocityTracker.clear();
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    newPointerIndex = 0;
                    c2 = 4;
                    break;
            }
        }
    }

    private void A0Q(AnonymousClass31 anonymousClass31, int i, AnonymousClass31 anonymousClass312) {
        AnonymousClass31 anonymousClass313 = anonymousClass312;
        AnonymousClass31 anonymousClass314 = anonymousClass31;
        AnonymousClass39 anonymousClass39 = this;
        float fA04 = 0.0f;
        AnonymousClass31 anonymousClass315 = null;
        int size = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        float f3 = 0.0f;
        int i6 = 0;
        AnonymousClass31 anonymousClass316 = null;
        int i7 = 0;
        int i8 = 0;
        float fA042 = 0.0f;
        int i9 = 0;
        float fA043 = 0.0f;
        AnonymousClass31 anonymousClass317 = null;
        AnonymousClass31 anonymousClass318 = null;
        float f4 = 0.0f;
        float fA044 = 0.0f;
        int size2 = 0;
        int iA05 = anonymousClass39.A01.A05();
        int clientWidth = anonymousClass39.getClientWidth();
        char c2 = clientWidth > 0 ? (char) 2 : (char) 15;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    f3 = anonymousClass39.A0M / clientWidth;
                    c2 = 3;
                    break;
                case 3:
                    anonymousClass313 = anonymousClass313;
                    if (anonymousClass313 == null) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass314 = anonymousClass314;
                    anonymousClass313 = anonymousClass313;
                    i3 = anonymousClass313.A02;
                    if (i3 >= anonymousClass314.A02) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    anonymousClass313 = anonymousClass313;
                    i9 = 0;
                    fA042 = anonymousClass313.A00 + anonymousClass313.A01 + f3;
                    i5 = i3 + 1;
                    c2 = 6;
                    break;
                case 6:
                    anonymousClass314 = anonymousClass314;
                    if (i5 > anonymousClass314.A02) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    anonymousClass39 = anonymousClass39;
                    if (i9 >= anonymousClass39.A0t.size()) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    anonymousClass39 = anonymousClass39;
                    anonymousClass317 = anonymousClass39.A0t.get(i9);
                    c2 = '\t';
                    break;
                case '\t':
                    anonymousClass317 = anonymousClass317;
                    if (i5 <= anonymousClass317.A02) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    anonymousClass39 = anonymousClass39;
                    if (i9 >= anonymousClass39.A0t.size() - 1) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    anonymousClass39 = anonymousClass39;
                    i9++;
                    anonymousClass317 = anonymousClass39.A0t.get(i9);
                    c2 = '\t';
                    break;
                case '\f':
                    anonymousClass317 = anonymousClass317;
                    if (i5 >= anonymousClass317.A02) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    anonymousClass39 = anonymousClass39;
                    fA042 += anonymousClass39.A01.A04(i5) + f3;
                    i5++;
                    c2 = '\f';
                    break;
                case 14:
                    anonymousClass317 = anonymousClass317;
                    anonymousClass317.A00 = fA042;
                    fA042 += anonymousClass317.A01 + f3;
                    i5++;
                    c2 = 6;
                    break;
                case 15:
                    f3 = 0.0f;
                    c2 = 3;
                    break;
                case 16:
                    anonymousClass314 = anonymousClass314;
                    if (i3 <= anonymousClass314.A02) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass313 = anonymousClass313;
                    size2 = anonymousClass39.A0t.size() - 1;
                    fA044 = anonymousClass313.A00;
                    i6 = i3 - 1;
                    c2 = 18;
                    break;
                case 18:
                    anonymousClass314 = anonymousClass314;
                    if (i6 < anonymousClass314.A02) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    if (size2 < 0) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass318 = anonymousClass39.A0t.get(size2);
                    c2 = 21;
                    break;
                case 21:
                    anonymousClass318 = anonymousClass318;
                    if (i6 >= anonymousClass318.A02) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    if (size2 <= 0) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    anonymousClass39 = anonymousClass39;
                    size2--;
                    anonymousClass318 = anonymousClass39.A0t.get(size2);
                    c2 = 21;
                    break;
                case 24:
                    anonymousClass318 = anonymousClass318;
                    if (i6 <= anonymousClass318.A02) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    anonymousClass39 = anonymousClass39;
                    fA044 -= anonymousClass39.A01.A04(i6) + f3;
                    i6--;
                    c2 = 24;
                    break;
                case 26:
                    anonymousClass318 = anonymousClass318;
                    fA044 -= anonymousClass318.A01 + f3;
                    anonymousClass318.A00 = fA044;
                    i6--;
                    c2 = 18;
                    break;
                case 27:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass314 = anonymousClass314;
                    size = anonymousClass39.A0t.size();
                    fA043 = anonymousClass314.A00;
                    i2 = anonymousClass314.A02 - 1;
                    if (anonymousClass314.A02 != 0) {
                        c2 = '(';
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    anonymousClass314 = anonymousClass314;
                    f4 = anonymousClass314.A00;
                    c2 = 29;
                    break;
                case 29:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass314 = anonymousClass314;
                    anonymousClass39.A02 = f4;
                    f2 = 1.0f;
                    if (anonymousClass314.A02 != iA05 - 1) {
                        c2 = '\'';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    anonymousClass314 = anonymousClass314;
                    f = (anonymousClass314.A00 + anonymousClass314.A01) - f2;
                    c2 = 31;
                    break;
                case 31:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A07 = f;
                    i7 = i - 1;
                    c2 = ' ';
                    break;
                case ' ':
                    if (i7 < 0) {
                        c2 = ')';
                        break;
                    } else {
                        c2 = '!';
                        break;
                    }
                case '!':
                    anonymousClass39 = anonymousClass39;
                    anonymousClass316 = anonymousClass39.A0t.get(i7);
                    c2 = '\"';
                    break;
                case '\"':
                    anonymousClass316 = anonymousClass316;
                    if (i2 <= anonymousClass316.A02) {
                        c2 = '$';
                        break;
                    } else {
                        c2 = '#';
                        break;
                    }
                case '#':
                    anonymousClass39 = anonymousClass39;
                    fA043 -= anonymousClass39.A01.A04(i2) + f3;
                    i2--;
                    c2 = '\"';
                    break;
                case '$':
                    anonymousClass316 = anonymousClass316;
                    fA043 -= anonymousClass316.A01 + f3;
                    anonymousClass316.A00 = fA043;
                    if (anonymousClass316.A02 != 0) {
                        c2 = '&';
                        break;
                    } else {
                        c2 = '%';
                        break;
                    }
                case '%':
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A02 = fA043;
                    c2 = '&';
                    break;
                case '&':
                    i7--;
                    i2--;
                    c2 = ' ';
                    break;
                case '\'':
                    f = Float.MAX_VALUE;
                    c2 = 31;
                    break;
                case '(':
                    f4 = -3.4028235E38f;
                    c2 = 29;
                    break;
                case ')':
                    anonymousClass314 = anonymousClass314;
                    fA04 = anonymousClass314.A00 + anonymousClass314.A01 + f3;
                    i8 = anonymousClass314.A02 + 1;
                    i4 = i + 1;
                    c2 = '*';
                    break;
                case '*':
                    if (i4 >= size) {
                        c2 = '1';
                        break;
                    } else {
                        c2 = '+';
                        break;
                    }
                case '+':
                    anonymousClass39 = anonymousClass39;
                    anonymousClass315 = anonymousClass39.A0t.get(i4);
                    c2 = ',';
                    break;
                case ',':
                    anonymousClass315 = anonymousClass315;
                    if (i8 >= anonymousClass315.A02) {
                        c2 = '.';
                        break;
                    } else {
                        c2 = '-';
                        break;
                    }
                case '-':
                    anonymousClass39 = anonymousClass39;
                    fA04 += anonymousClass39.A01.A04(i8) + f3;
                    i8++;
                    c2 = ',';
                    break;
                case '.':
                    anonymousClass315 = anonymousClass315;
                    if (anonymousClass315.A02 != iA05 - 1) {
                        c2 = '0';
                        break;
                    } else {
                        c2 = '/';
                        break;
                    }
                case '/':
                    anonymousClass39 = anonymousClass39;
                    anonymousClass315 = anonymousClass315;
                    anonymousClass39.A07 = (anonymousClass315.A01 + fA04) - f2;
                    c2 = '0';
                    break;
                case '0':
                    anonymousClass315 = anonymousClass315;
                    anonymousClass315.A00 = fA04;
                    fA04 += anonymousClass315.A01 + f3;
                    i4++;
                    i8++;
                    c2 = '*';
                    break;
                case '1':
                    anonymousClass39.A0n = false;
                    return;
            }
        }
    }

    private void A0R(boolean z) {
        AnonymousClass39 anonymousClass39 = this;
        AnonymousClass31 ii = null;
        int oldY = 0;
        int x = 0;
        int i = 0;
        boolean z2 = false;
        int scrollY = 0;
        int currY = 0;
        boolean z3 = false;
        char c2 = anonymousClass39.A0P == 2 ? (char) 2 : (char) 14;
        while (true) {
            switch (c2) {
                case 2:
                    z2 = true;
                    c2 = 3;
                    break;
                case 3:
                    if (!z2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass39 = anonymousClass39;
                    z3 = false;
                    anonymousClass39.setScrollingCacheEnabled(false);
                    if (!(!anonymousClass39.A0X.isFinished())) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0X.abortAnimation();
                    x = anonymousClass39.getScrollX();
                    scrollY = anonymousClass39.getScrollY();
                    oldY = anonymousClass39.A0X.getCurrX();
                    currY = anonymousClass39.A0X.getCurrY();
                    if (x != oldY) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (scrollY == currY) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.scrollTo(oldY, currY);
                    if (oldY == x) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0Z(oldY);
                    c2 = '\t';
                    break;
                case '\t':
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0o = z3;
                    i = 0;
                    c2 = '\n';
                    break;
                case '\n':
                    anonymousClass39 = anonymousClass39;
                    if (i >= anonymousClass39.A0t.size()) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    anonymousClass39 = anonymousClass39;
                    ii = anonymousClass39.A0t.get(i);
                    if (!ii.A04) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    ii = ii;
                    z2 = true;
                    ii.A04 = z3;
                    c2 = '\r';
                    break;
                case '\r':
                    i++;
                    c2 = '\n';
                    break;
                case 14:
                    z2 = false;
                    c2 = 3;
                    break;
                case 15:
                    if (!z2) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    if (!z) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    anonymousClass39 = anonymousClass39;
                    C2v.A0C(anonymousClass39, anonymousClass39.A0s);
                    c2 = 18;
                    break;
                case 18:
                    return;
                case 19:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0s.run();
                    c2 = 18;
                    break;
            }
        }
    }

    private void A0S(boolean z) {
        AnonymousClass39 anonymousClass39 = this;
        int layerType = 0;
        int childCount = anonymousClass39.getChildCount();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= childCount) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass39 = anonymousClass39;
                    layerType = anonymousClass39.A0N;
                    c2 = 5;
                    break;
                case 5:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.getChildAt(i).setLayerType(layerType, null);
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    layerType = 0;
                    c2 = 5;
                    break;
                case 7:
                    return;
            }
        }
    }

    private void A0T(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean A0U() {
        AnonymousClass39 anonymousClass39 = this;
        boolean z = false;
        anonymousClass39.A08 = -1;
        anonymousClass39.A09();
        anonymousClass39.A0V.onRelease();
        anonymousClass39.A0W.onRelease();
        char c2 = !anonymousClass39.A0V.isFinished() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    if (!anonymousClass39.A0W.isFinished()) {
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

    private final boolean A0V() throws Resources.NotFoundException {
        int i = this.A00;
        if (i > 0) {
            A0L(i - 1, true);
            return true;
        }
        return false;
    }

    private final boolean A0W() throws Resources.NotFoundException {
        AnonymousClass39 anonymousClass39 = this;
        boolean z = false;
        AbstractC01632g abstractC01632g = anonymousClass39.A01;
        char c2 = abstractC01632g != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    abstractC01632g = abstractC01632g;
                    z = true;
                    z = true;
                    if (anonymousClass39.A00 >= abstractC01632g.A05() - 1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    AnonymousClass39 anonymousClass392 = anonymousClass39;
                    anonymousClass392.A0L(anonymousClass392.A00 + (z ? 1 : 0), z);
                    return z;
                case 4:
                    return false;
            }
        }
    }

    private boolean A0X(float f) {
        AnonymousClass39 anonymousClass39 = this;
        boolean z = false;
        float f2 = anonymousClass39.A05 - f;
        anonymousClass39.A05 = f;
        float scrollX = getScrollX() + f2;
        int clientWidth = getClientWidth();
        float f3 = clientWidth * anonymousClass39.A02;
        float leftBound = anonymousClass39.A07;
        float f4 = clientWidth * leftBound;
        boolean z2 = true;
        boolean z3 = true;
        AnonymousClass31 anonymousClass31 = anonymousClass39.A0t.get(0);
        AnonymousClass31 anonymousClass312 = anonymousClass39.A0t.get(r1.size() - 1);
        float over = anonymousClass31.A02 != 0 ? 2.8E-45f : 4.2E-45f;
        while (true) {
            switch (over) {
                case 2.8E-45f:
                    anonymousClass31 = anonymousClass31;
                    z2 = false;
                    float over2 = clientWidth;
                    f3 = anonymousClass31.A00 * over2;
                    over = 4.2E-45f;
                    break;
                case 4.2E-45f:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass312 = anonymousClass312;
                    if (anonymousClass312.A02 == anonymousClass39.A01.A05() - 1) {
                        over = 7.0E-45f;
                        break;
                    } else {
                        over = 5.6E-45f;
                        break;
                    }
                case 5.6E-45f:
                    anonymousClass312 = anonymousClass312;
                    z3 = false;
                    f4 = anonymousClass312.A00 * clientWidth;
                    over = 7.0E-45f;
                    break;
                case 7.0E-45f:
                    if (scrollX >= f3) {
                        over = 1.4E-44f;
                        break;
                    } else {
                        over = 8.4E-45f;
                        break;
                    }
                case 8.4E-45f:
                    if (!z2) {
                        over = 1.1E-44f;
                        break;
                    } else {
                        over = 9.8E-45f;
                        break;
                    }
                case 9.8E-45f:
                    anonymousClass39 = anonymousClass39;
                    float over3 = f3 - scrollX;
                    EdgeEffect edgeEffect = anonymousClass39.A0V;
                    float fAbs = Math.abs(over3);
                    float over4 = clientWidth;
                    edgeEffect.onPull(fAbs / over4);
                    z = true;
                    over = 1.1E-44f;
                    break;
                case 1.1E-44f:
                    scrollX = f3;
                    over = 1.3E-44f;
                    break;
                case 1.3E-44f:
                    AnonymousClass39 anonymousClass392 = anonymousClass39;
                    anonymousClass392.A05 += scrollX - ((int) scrollX);
                    anonymousClass392.scrollTo((int) scrollX, getScrollY());
                    anonymousClass392.A0Z((int) scrollX);
                    return z;
                case 1.4E-44f:
                    if (scrollX <= f4) {
                        over = 1.3E-44f;
                        break;
                    } else {
                        over = 1.5E-44f;
                        break;
                    }
                case 1.5E-44f:
                    if (!z3) {
                        over = 1.8E-44f;
                        break;
                    } else {
                        over = 1.7E-44f;
                        break;
                    }
                case 1.7E-44f:
                    anonymousClass39 = anonymousClass39;
                    float over5 = scrollX - f4;
                    EdgeEffect edgeEffect2 = anonymousClass39.A0W;
                    float fAbs2 = Math.abs(over5);
                    float over6 = clientWidth;
                    edgeEffect2.onPull(fAbs2 / over6);
                    z = true;
                    over = 1.8E-44f;
                    break;
                case 1.8E-44f:
                    scrollX = f4;
                    over = 1.3E-44f;
                    break;
            }
        }
    }

    private final boolean A0Y(float f, float f2) {
        AnonymousClass39 anonymousClass39 = this;
        boolean z = false;
        float f3 = 0.0f;
        char c2 = f < ((float) anonymousClass39.A0I) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    f3 = 0.0f;
                    if (f2 > 0.0f) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    anonymousClass39 = anonymousClass39;
                    if (f <= anonymousClass39.getWidth() - anonymousClass39.A0I) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (f2 >= f3) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z = true;
                    c2 = 6;
                    break;
                case 6:
                    return z;
                case 7:
                    z = false;
                    c2 = 6;
                    break;
            }
        }
    }

    private boolean A0Z(int i) {
        AnonymousClass39 anonymousClass39 = this;
        int size = anonymousClass39.A0t.size();
        String strA08 = A08(366, 53, 25);
        boolean z = false;
        float marginOffset = size == 0 ? 2.8E-45f : 9.8E-45f;
        while (true) {
            switch (marginOffset) {
                case 2.8E-45f:
                    anonymousClass39 = anonymousClass39;
                    if (!anonymousClass39.A0i) {
                        marginOffset = 5.6E-45f;
                        break;
                    } else {
                        marginOffset = 4.2E-45f;
                        break;
                    }
                case 4.2E-45f:
                    return false;
                case 5.6E-45f:
                    anonymousClass39 = anonymousClass39;
                    z = false;
                    anonymousClass39.A0g = false;
                    anonymousClass39.A0I(0, 0.0f, 0);
                    if (!anonymousClass39.A0g) {
                        marginOffset = 8.4E-45f;
                        break;
                    } else {
                        marginOffset = 7.0E-45f;
                        break;
                    }
                case 7.0E-45f:
                    return z;
                case 8.4E-45f:
                    throw new IllegalStateException(strA08);
                case 9.8E-45f:
                    anonymousClass39 = anonymousClass39;
                    z = false;
                    AnonymousClass31 anonymousClass31A03 = anonymousClass39.A03();
                    int clientWidth = anonymousClass39.getClientWidth();
                    int width = anonymousClass39.A0M;
                    int i2 = clientWidth + width;
                    float f = width / clientWidth;
                    int i3 = anonymousClass31A03.A02;
                    float marginOffset2 = clientWidth;
                    float f2 = i / marginOffset2;
                    float marginOffset3 = anonymousClass31A03.A00;
                    float f3 = f2 - marginOffset3;
                    float marginOffset4 = anonymousClass31A03.A01;
                    float f4 = f3 / (marginOffset4 + f);
                    float marginOffset5 = i2;
                    anonymousClass39.A0g = false;
                    anonymousClass39.A0I(i3, f4, (int) (marginOffset5 * f4));
                    if (!anonymousClass39.A0g) {
                        marginOffset = 1.3E-44f;
                        break;
                    } else {
                        marginOffset = 1.1E-44f;
                        break;
                    }
                case 1.1E-44f:
                    return true;
                case 1.3E-44f:
                    throw new IllegalStateException(strA08);
            }
        }
    }

    private final boolean A0a(int i) throws Resources.NotFoundException {
        AnonymousClass39 anonymousClass39 = this;
        StringBuilder sb = null;
        ViewParent parent = null;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        boolean zA0V = false;
        int i4 = 0;
        int i5 = 0;
        ViewParent parent2 = null;
        int i6 = 0;
        View viewFindNextFocus = null;
        int i7 = 0;
        View viewFindFocus = anonymousClass39.findFocus();
        char c2 = viewFindFocus == anonymousClass39 ? (char) 2 : (char) 24;
        while (true) {
            switch (c2) {
                case 2:
                    viewFindFocus = null;
                    c2 = 3;
                    break;
                case 3:
                    anonymousClass39 = anonymousClass39;
                    zA0V = false;
                    viewFindNextFocus = FocusFinder.getInstance().findNextFocus(anonymousClass39, viewFindFocus, i);
                    i2 = 66;
                    i6 = 17;
                    if (viewFindNextFocus == null) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    viewFindNextFocus = viewFindNextFocus;
                    if (viewFindNextFocus == viewFindFocus) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i != i6) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    anonymousClass39 = anonymousClass39;
                    viewFindNextFocus = viewFindNextFocus;
                    i7 = anonymousClass39.A02(anonymousClass39.A0q, viewFindNextFocus).left;
                    i4 = anonymousClass39.A02(anonymousClass39.A0q, viewFindFocus).left;
                    if (viewFindFocus == null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i7 < i4) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    anonymousClass39 = anonymousClass39;
                    zA0V = anonymousClass39.A0V();
                    c2 = '\t';
                    break;
                case '\t':
                    if (!zA0V) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
                    c2 = 11;
                    break;
                case 11:
                    return zA0V;
                case '\f':
                    viewFindNextFocus = viewFindNextFocus;
                    zA0V = viewFindNextFocus.requestFocus();
                    c2 = '\t';
                    break;
                case '\r':
                    if (i != i2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    anonymousClass39 = anonymousClass39;
                    viewFindNextFocus = viewFindNextFocus;
                    i5 = anonymousClass39.A02(anonymousClass39.A0q, viewFindNextFocus).left;
                    i3 = anonymousClass39.A02(anonymousClass39.A0q, viewFindFocus).left;
                    if (viewFindFocus == null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    if (i5 > i3) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    anonymousClass39 = anonymousClass39;
                    zA0V = anonymousClass39.A0W();
                    c2 = '\t';
                    break;
                case 17:
                    viewFindNextFocus = viewFindNextFocus;
                    zA0V = viewFindNextFocus.requestFocus();
                    c2 = '\t';
                    break;
                case 18:
                    if (i == i6) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    if (i != 1) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    anonymousClass39 = anonymousClass39;
                    zA0V = anonymousClass39.A0V();
                    c2 = '\t';
                    break;
                case 21:
                    if (i == i2) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    if (i != 2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    anonymousClass39 = anonymousClass39;
                    zA0V = anonymousClass39.A0W();
                    c2 = '\t';
                    break;
                case 24:
                    viewFindFocus = viewFindFocus;
                    if (viewFindFocus == null) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    viewFindFocus = viewFindFocus;
                    z = false;
                    parent2 = viewFindFocus.getParent();
                    c2 = 26;
                    break;
                case 26:
                    parent2 = parent2;
                    if (!(parent2 instanceof ViewGroup)) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    anonymousClass39 = anonymousClass39;
                    parent2 = parent2;
                    if (parent2 != anonymousClass39) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    z = true;
                    c2 = 29;
                    break;
                case 29:
                    if (!z) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 30:
                    viewFindFocus = viewFindFocus;
                    sb = new StringBuilder();
                    sb.append(viewFindFocus.getClass().getSimpleName());
                    parent = viewFindFocus.getParent();
                    c2 = 31;
                    break;
                case 31:
                    parent = parent;
                    if (!(parent instanceof ViewGroup)) {
                        c2 = '\"';
                        break;
                    } else {
                        c2 = ' ';
                        break;
                    }
                case ' ':
                    sb = sb;
                    ViewParent viewParent = parent;
                    sb.append(A08(419, 4, 85));
                    sb.append(viewParent.getClass().getSimpleName());
                    parent = viewParent.getParent();
                    c2 = 31;
                    break;
                case '!':
                    parent2 = parent2.getParent();
                    c2 = 26;
                    break;
                case '\"':
                    sb = sb;
                    Log.e(A08(357, 9, 22), A08(285, 72, 22) + sb.toString());
                    viewFindFocus = null;
                    c2 = 3;
                    break;
            }
        }
    }

    private final boolean A0b(KeyEvent keyEvent) throws Resources.NotFoundException {
        AnonymousClass39 anonymousClass39 = this;
        int i = 0;
        int i2 = 0;
        int keyCode = 0;
        boolean zA0a = false;
        char c2 = keyEvent.getAction() == 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    keyEvent = keyEvent;
                    keyCode = keyEvent.getKeyCode();
                    i2 = 2;
                    if (keyCode == 21) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (keyCode == 22) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (keyCode == 61) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return zA0a;
                case 6:
                    keyEvent = keyEvent;
                    if (!keyEvent.hasNoModifiers()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    anonymousClass39 = anonymousClass39;
                    zA0a = anonymousClass39.A0a(i2);
                    c2 = 5;
                    break;
                case '\b':
                    keyEvent = keyEvent;
                    i = 1;
                    if (!keyEvent.hasModifiers(1)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    anonymousClass39 = anonymousClass39;
                    zA0a = anonymousClass39.A0a(i);
                    c2 = 5;
                    break;
                case '\n':
                    keyEvent = keyEvent;
                    if (!keyEvent.hasModifiers(i2)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    anonymousClass39 = anonymousClass39;
                    zA0a = anonymousClass39.A0W();
                    c2 = 5;
                    break;
                case '\f':
                    anonymousClass39 = anonymousClass39;
                    zA0a = anonymousClass39.A0a(66);
                    c2 = 5;
                    break;
                case '\r':
                    keyEvent = keyEvent;
                    if (!keyEvent.hasModifiers(i2)) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    anonymousClass39 = anonymousClass39;
                    zA0a = anonymousClass39.A0V();
                    c2 = 5;
                    break;
                case 15:
                    anonymousClass39 = anonymousClass39;
                    zA0a = anonymousClass39.A0a(17);
                    c2 = 5;
                    break;
            }
        }
    }

    public static boolean A0c(@NonNull View view) {
        boolean z = false;
        char c2 = view.getClass().getAnnotation(ViewPager$DecorView.class) != null ? (char) 2 : (char) 4;
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

    private final boolean A0d(View view, boolean z, int scrollX, int scrollY, int count) {
        AnonymousClass39 anonymousClass39 = this;
        int scrollY2 = 0;
        View childAt = null;
        int i = 0;
        int scrollX2 = 0;
        ViewGroup viewGroup = null;
        View view2 = view;
        boolean z2 = true;
        int i2 = view2 instanceof ViewGroup ? 2 : 11;
        while (true) {
            switch (i2) {
                case 2:
                    view = view;
                    view2 = view2;
                    viewGroup = (ViewGroup) view2;
                    scrollX2 = view.getScrollX();
                    scrollY2 = view.getScrollY();
                    int i3 = viewGroup.getChildCount();
                    i = i3 - 1;
                    i2 = 3;
                    break;
                case 3:
                    if (i < 0) {
                        i2 = 11;
                        break;
                    } else {
                        i2 = 4;
                        break;
                    }
                case 4:
                    viewGroup = viewGroup;
                    childAt = viewGroup.getChildAt(i);
                    if (scrollY + scrollX2 < childAt.getLeft()) {
                        i2 = 10;
                        break;
                    } else {
                        i2 = 5;
                        break;
                    }
                case 5:
                    childAt = childAt;
                    if (scrollY + scrollX2 >= childAt.getRight()) {
                        i2 = 10;
                        break;
                    } else {
                        i2 = 6;
                        break;
                    }
                case 6:
                    childAt = childAt;
                    if (count + scrollY2 < childAt.getTop()) {
                        i2 = 10;
                        break;
                    } else {
                        i2 = 7;
                        break;
                    }
                case 7:
                    childAt = childAt;
                    int i4 = count + scrollY2;
                    int i5 = childAt.getBottom();
                    if (i4 >= i5) {
                        i2 = 10;
                        break;
                    } else {
                        i2 = 8;
                        break;
                    }
                case 8:
                    anonymousClass39 = anonymousClass39;
                    childAt = childAt;
                    int i6 = childAt.getLeft();
                    int i7 = (scrollY + scrollX2) - i6;
                    int i8 = childAt.getTop();
                    if (!anonymousClass39.A0d(childAt, true, scrollX, i7, (count + scrollY2) - i8)) {
                        i2 = 10;
                        break;
                    } else {
                        i2 = 9;
                        break;
                    }
                case 9:
                    return z2;
                case 10:
                    i--;
                    i2 = 3;
                    break;
                case 11:
                    if (!z) {
                        i2 = 14;
                        break;
                    } else {
                        i2 = 12;
                        break;
                    }
                case 12:
                    view = view;
                    int i9 = -scrollX;
                    if (!view.canScrollHorizontally(i9)) {
                        i2 = 14;
                        break;
                    } else {
                        i2 = 13;
                        break;
                    }
                case 13:
                    return z2;
                case 14:
                    z2 = false;
                    i2 = 13;
                    break;
            }
        }
    }

    public final void A0e() throws Resources.NotFoundException {
        AnonymousClass39 anonymousClass39 = this;
        int iMax = 0;
        AnonymousClass32 anonymousClass32 = null;
        boolean z = false;
        AnonymousClass31 ii = null;
        int childCount = 0;
        int iA06 = 0;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        int iA05 = anonymousClass39.A01.A05();
        anonymousClass39.A0G = iA05;
        int newPos = anonymousClass39.A0t.size() < (anonymousClass39.A0L * 2) + 1 ? 2 : 17;
        while (true) {
            switch (newPos) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    if (anonymousClass39.A0t.size() >= iA05) {
                        newPos = 17;
                        break;
                    } else {
                        newPos = 3;
                        break;
                    }
                case 3:
                    z = true;
                    newPos = 4;
                    break;
                case 4:
                    anonymousClass39 = anonymousClass39;
                    iMax = anonymousClass39.A00;
                    z2 = false;
                    i2 = 0;
                    newPos = 5;
                    break;
                case 5:
                    anonymousClass39 = anonymousClass39;
                    if (i2 >= anonymousClass39.A0t.size()) {
                        newPos = 18;
                        break;
                    } else {
                        newPos = 6;
                        break;
                    }
                case 6:
                    anonymousClass39 = anonymousClass39;
                    ii = anonymousClass39.A0t.get(i2);
                    iA06 = anonymousClass39.A01.A06(ii.A03);
                    if (iA06 != -1) {
                        newPos = 8;
                        break;
                    } else {
                        newPos = 7;
                        break;
                    }
                case 7:
                    i2++;
                    newPos = 5;
                    break;
                case 8:
                    if (iA06 != -2) {
                        newPos = 13;
                        break;
                    } else {
                        newPos = 9;
                        break;
                    }
                case 9:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0t.remove(i2);
                    i2--;
                    if (!z2) {
                        newPos = 10;
                        break;
                    } else {
                        newPos = 11;
                        break;
                    }
                case 10:
                    z2 = true;
                    newPos = 11;
                    break;
                case 11:
                    anonymousClass39 = anonymousClass39;
                    ii = ii;
                    anonymousClass39.A01.A0B(anonymousClass39, ii.A02, ii.A03);
                    z = true;
                    if (anonymousClass39.A00 != ii.A02) {
                        newPos = 7;
                        break;
                    } else {
                        newPos = 12;
                        break;
                    }
                case 12:
                    anonymousClass39 = anonymousClass39;
                    iMax = Math.max(0, Math.min(anonymousClass39.A00, iA05 - 1));
                    z = true;
                    newPos = 7;
                    break;
                case 13:
                    ii = ii;
                    if (ii.A02 == iA06) {
                        newPos = 7;
                        break;
                    } else {
                        newPos = 14;
                        break;
                    }
                case 14:
                    anonymousClass39 = anonymousClass39;
                    ii = ii;
                    if (ii.A02 != anonymousClass39.A00) {
                        newPos = 16;
                        break;
                    } else {
                        newPos = 15;
                        break;
                    }
                case 15:
                    iMax = iA06;
                    newPos = 16;
                    break;
                case 16:
                    ii = ii;
                    ii.A02 = iA06;
                    z = true;
                    newPos = 7;
                    break;
                case 17:
                    z = false;
                    newPos = 4;
                    break;
                case 18:
                    if (!z2) {
                        newPos = 19;
                        break;
                    } else {
                        newPos = 19;
                        break;
                    }
                case 19:
                    anonymousClass39 = anonymousClass39;
                    Collections.sort(anonymousClass39.A0t, A0y);
                    if (!z) {
                        newPos = 26;
                        break;
                    } else {
                        newPos = 20;
                        break;
                    }
                case 20:
                    anonymousClass39 = anonymousClass39;
                    childCount = anonymousClass39.getChildCount();
                    i = 0;
                    newPos = 21;
                    break;
                case 21:
                    if (i >= childCount) {
                        newPos = 25;
                        break;
                    } else {
                        newPos = 22;
                        break;
                    }
                case 22:
                    anonymousClass39 = anonymousClass39;
                    View child = anonymousClass39.getChildAt(i);
                    anonymousClass32 = (AnonymousClass32) child.getLayoutParams();
                    if (!anonymousClass32.A05) {
                        newPos = 23;
                        break;
                    } else {
                        newPos = 24;
                        break;
                    }
                case 23:
                    anonymousClass32 = anonymousClass32;
                    anonymousClass32.A00 = 0.0f;
                    newPos = 24;
                    break;
                case 24:
                    i++;
                    newPos = 21;
                    break;
                case 25:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0N(iMax, false, true);
                    anonymousClass39.requestLayout();
                    newPos = 26;
                    break;
                case 26:
                    return;
            }
        }
    }

    public final void A0f() throws Resources.NotFoundException {
        A0G(this.A00);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        AnonymousClass39 anonymousClass39 = this;
        int i3 = 0;
        View childAt = null;
        AnonymousClass31 anonymousClass31A07 = null;
        int size = arrayList.size();
        int descendantFocusability = anonymousClass39.getDescendantFocusability();
        char c2 = descendantFocusability != 393216 ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    i3 = 0;
                    c2 = 3;
                    break;
                case 3:
                    anonymousClass39 = anonymousClass39;
                    if (i3 >= anonymousClass39.getChildCount()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass39 = anonymousClass39;
                    childAt = anonymousClass39.getChildAt(i3);
                    if (childAt.getVisibility() != 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    anonymousClass39 = anonymousClass39;
                    childAt = childAt;
                    anonymousClass31A07 = anonymousClass39.A07(childAt);
                    if (anonymousClass31A07 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass31A07 = anonymousClass31A07;
                    if (anonymousClass31A07.A02 != anonymousClass39.A00) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    arrayList = arrayList;
                    childAt = childAt;
                    childAt.addFocusables(arrayList, i, i2);
                    c2 = '\b';
                    break;
                case '\b':
                    i3++;
                    c2 = 3;
                    break;
                case '\t':
                    if (descendantFocusability != 262144) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    arrayList = arrayList;
                    if (size != arrayList.size()) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    anonymousClass39 = anonymousClass39;
                    if (!anonymousClass39.isFocusable()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\f':
                    return;
                case '\r':
                    if ((i2 & 1) != 1) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    anonymousClass39 = anonymousClass39;
                    if (!anonymousClass39.isInTouchMode()) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    anonymousClass39 = anonymousClass39;
                    if (!anonymousClass39.isFocusableInTouchMode()) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 16:
                    return;
                case 17:
                    anonymousClass39 = anonymousClass39;
                    arrayList = arrayList;
                    arrayList.add(anonymousClass39);
                    c2 = 18;
                    break;
                case 18:
                    return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        AnonymousClass39 anonymousClass39 = this;
        AnonymousClass31 ii = null;
        View childAt = null;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    if (i >= anonymousClass39.getChildCount()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    anonymousClass39 = anonymousClass39;
                    childAt = anonymousClass39.getChildAt(i);
                    if (childAt.getVisibility() != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass39 = anonymousClass39;
                    childAt = childAt;
                    ii = anonymousClass39.A07(childAt);
                    if (ii == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    anonymousClass39 = anonymousClass39;
                    ii = ii;
                    if (ii.A02 != anonymousClass39.A00) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    arrayList = arrayList;
                    childAt = childAt;
                    childAt.addTouchables(arrayList);
                    c2 = 7;
                    break;
                case 7:
                    i++;
                    c2 = 2;
                    break;
                case '\b':
                    return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AnonymousClass39 anonymousClass39 = this;
        AnonymousClass32 anonymousClass32 = null;
        char c2 = !anonymousClass39.checkLayoutParams(layoutParams) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    layoutParams = anonymousClass39.generateLayoutParams(layoutParams);
                    c2 = 3;
                    break;
                case 3:
                    anonymousClass39 = anonymousClass39;
                    view = view;
                    layoutParams = layoutParams;
                    anonymousClass32 = (AnonymousClass32) layoutParams;
                    anonymousClass32.A05 |= A0c(view);
                    if (!anonymousClass39.A0j) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass32 = anonymousClass32;
                    if (!anonymousClass32.A05) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 5:
                    anonymousClass39 = anonymousClass39;
                    view = view;
                    layoutParams = layoutParams;
                    anonymousClass32 = anonymousClass32;
                    anonymousClass32.A03 = true;
                    anonymousClass39.addViewInLayout(view, i, layoutParams);
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    anonymousClass39 = anonymousClass39;
                    view = view;
                    layoutParams = layoutParams;
                    super.addView(view, i, layoutParams);
                    c2 = 6;
                    break;
                case '\b':
                    throw new IllegalStateException(A08(22, 41, 40));
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        AnonymousClass39 anonymousClass39 = this;
        int scrollX = 0;
        int clientWidth = 0;
        boolean z = false;
        char c2 = anonymousClass39.A01 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    anonymousClass39 = anonymousClass39;
                    clientWidth = anonymousClass39.getClientWidth();
                    scrollX = anonymousClass39.getScrollX();
                    if (i >= 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass39 = anonymousClass39;
                    if (scrollX <= ((int) (clientWidth * anonymousClass39.A02))) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z = true;
                    c2 = 6;
                    break;
                case 6:
                    return z;
                case 7:
                    if (i <= 0) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    anonymousClass39 = anonymousClass39;
                    if (scrollX >= ((int) (clientWidth * anonymousClass39.A07))) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    z = true;
                    c2 = '\n';
                    break;
                case '\n':
                    return z;
                case 11:
                    return false;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AnonymousClass39 anonymousClass39 = this;
        boolean z = false;
        char c2 = layoutParams instanceof AnonymousClass32 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    layoutParams = layoutParams;
                    if (!super.checkLayoutParams(layoutParams)) {
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

    @Override // android.view.View
    public final void computeScroll() {
        AnonymousClass39 anonymousClass39 = this;
        int x = 0;
        int currY = 0;
        int scrollY = 0;
        anonymousClass39.A0l = true;
        int oldY = !anonymousClass39.A0X.isFinished() ? 2 : 8;
        while (true) {
            switch (oldY) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    if (!anonymousClass39.A0X.computeScrollOffset()) {
                        oldY = 8;
                        break;
                    } else {
                        oldY = 3;
                        break;
                    }
                case 3:
                    anonymousClass39 = anonymousClass39;
                    int scrollX = anonymousClass39.getScrollX();
                    scrollY = anonymousClass39.getScrollY();
                    x = anonymousClass39.A0X.getCurrX();
                    currY = anonymousClass39.A0X.getCurrY();
                    if (scrollX != x) {
                        oldY = 5;
                        break;
                    } else {
                        oldY = 4;
                        break;
                    }
                case 4:
                    if (scrollY == currY) {
                        oldY = 7;
                        break;
                    } else {
                        oldY = 5;
                        break;
                    }
                case 5:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.scrollTo(x, currY);
                    if (!anonymousClass39.A0Z(x)) {
                        oldY = 6;
                        break;
                    } else {
                        oldY = 7;
                        break;
                    }
                case 6:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0X.abortAnimation();
                    anonymousClass39.scrollTo(0, currY);
                    oldY = 7;
                    break;
                case 7:
                    C2v.A07(anonymousClass39);
                    return;
                case 8:
                    anonymousClass39.A0R(true);
                    return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AnonymousClass39 anonymousClass39 = this;
        boolean z = false;
        char c2 = !super.dispatchKeyEvent(keyEvent) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    keyEvent = keyEvent;
                    if (!anonymousClass39.A0b(keyEvent)) {
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

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        AnonymousClass39 anonymousClass39 = this;
        AnonymousClass31 ii = null;
        int i = 0;
        int childCount = 0;
        View childAt = null;
        char c2 = accessibilityEvent.getEventType() == 4096 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
                case 3:
                    anonymousClass39 = anonymousClass39;
                    childCount = anonymousClass39.getChildCount();
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i >= childCount) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    anonymousClass39 = anonymousClass39;
                    childAt = anonymousClass39.getChildAt(i);
                    if (childAt.getVisibility() != 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    anonymousClass39 = anonymousClass39;
                    childAt = childAt;
                    ii = anonymousClass39.A07(childAt);
                    if (ii == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    anonymousClass39 = anonymousClass39;
                    ii = ii;
                    if (ii.A02 != anonymousClass39.A00) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    accessibilityEvent = accessibilityEvent;
                    childAt = childAt;
                    if (!childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return true;
                case '\n':
                    i++;
                    c2 = 4;
                    break;
                case 11:
                    return false;
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        AnonymousClass39 anonymousClass39 = this;
        AbstractC01632g abstractC01632g = null;
        int i = 0;
        super.draw(canvas);
        boolean zDraw = false;
        int overScrollMode = anonymousClass39.getOverScrollMode();
        int restoreCount = overScrollMode != 0 ? 2 : 5;
        while (true) {
            switch (restoreCount) {
                case 2:
                    i = 1;
                    if (overScrollMode != 1) {
                        restoreCount = 12;
                        break;
                    } else {
                        restoreCount = 3;
                        break;
                    }
                case 3:
                    anonymousClass39 = anonymousClass39;
                    abstractC01632g = anonymousClass39.A01;
                    if (abstractC01632g == null) {
                        restoreCount = 12;
                        break;
                    } else {
                        restoreCount = 4;
                        break;
                    }
                case 4:
                    abstractC01632g = abstractC01632g;
                    if (abstractC01632g.A05() <= i) {
                        restoreCount = 12;
                        break;
                    } else {
                        restoreCount = 5;
                        break;
                    }
                case 5:
                    anonymousClass39 = anonymousClass39;
                    if (!anonymousClass39.A0V.isFinished()) {
                        restoreCount = 6;
                        break;
                    } else {
                        restoreCount = 7;
                        break;
                    }
                case 6:
                    anonymousClass39 = anonymousClass39;
                    canvas = canvas;
                    int iSave = canvas.save();
                    int height = anonymousClass39.getHeight();
                    int restoreCount2 = anonymousClass39.getPaddingTop();
                    int i2 = height - restoreCount2;
                    int restoreCount3 = anonymousClass39.getPaddingBottom();
                    int i3 = i2 - restoreCount3;
                    int width = anonymousClass39.getWidth();
                    canvas.rotate(270.0f);
                    int restoreCount4 = anonymousClass39.getPaddingTop();
                    canvas.translate((-i3) + restoreCount4, anonymousClass39.A02 * width);
                    anonymousClass39.A0V.setSize(i3, width);
                    zDraw = false | anonymousClass39.A0V.draw(canvas);
                    canvas.restoreToCount(iSave);
                    restoreCount = 7;
                    break;
                case 7:
                    anonymousClass39 = anonymousClass39;
                    if (!anonymousClass39.A0W.isFinished()) {
                        restoreCount = 8;
                        break;
                    } else {
                        restoreCount = 9;
                        break;
                    }
                case 8:
                    anonymousClass39 = anonymousClass39;
                    canvas = canvas;
                    int iSave2 = canvas.save();
                    int width2 = anonymousClass39.getWidth();
                    int height2 = anonymousClass39.getHeight();
                    int restoreCount5 = anonymousClass39.getPaddingTop();
                    int i4 = height2 - restoreCount5;
                    int restoreCount6 = anonymousClass39.getPaddingBottom();
                    int i5 = i4 - restoreCount6;
                    canvas.rotate(90.0f);
                    int restoreCount7 = anonymousClass39.getPaddingTop();
                    canvas.translate(-restoreCount7, (-(anonymousClass39.A07 + 1.0f)) * width2);
                    anonymousClass39.A0W.setSize(i5, width2);
                    zDraw |= anonymousClass39.A0W.draw(canvas);
                    canvas.restoreToCount(iSave2);
                    restoreCount = 9;
                    break;
                case 9:
                    if (!zDraw) {
                        restoreCount = 11;
                        break;
                    } else {
                        restoreCount = 10;
                        break;
                    }
                case 10:
                    anonymousClass39 = anonymousClass39;
                    C2v.A07(anonymousClass39);
                    restoreCount = 11;
                    break;
                case 11:
                    return;
                case 12:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0V.finish();
                    anonymousClass39.A0W.finish();
                    restoreCount = 9;
                    break;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        AnonymousClass39 anonymousClass39 = this;
        super.drawableStateChanged();
        Drawable drawable = anonymousClass39.A0S;
        char c2 = drawable != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    drawable = drawable;
                    if (!drawable.isStateful()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    anonymousClass39 = anonymousClass39;
                    drawable = drawable;
                    drawable.setState(anonymousClass39.getDrawableState());
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass32();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass32(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC01632g getAdapter() {
        return this.A01;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = 0;
        char c2 = this.A0F == 2 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i3 = (i - 1) - i2;
                    c2 = 3;
                    break;
                case 3:
                    return ((AnonymousClass32) this.A0d.get(i3).getLayoutParams()).A01;
                case 4:
                    i3 = i2;
                    c2 = 3;
                    break;
            }
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public int getCurrentItem() {
        return this.A00;
    }

    public int getOffscreenPageLimit() {
        return this.A0L;
    }

    public int getPageMargin() {
        return this.A0M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AnonymousClass39 anonymousClass39 = this;
        anonymousClass39.removeCallbacks(anonymousClass39.A0s);
        Scroller scroller = anonymousClass39.A0X;
        char c2 = scroller != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    scroller = scroller;
                    if (!scroller.isFinished()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0X.abortAnimation();
                    c2 = 4;
                    break;
                case 4:
                    super.onDetachedFromWindow();
                    return;
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        AnonymousClass39 anonymousClass39 = this;
        int scrollX = 0;
        float marginOffset = 0.0f;
        int itemIndex = 0;
        float f = 0.0f;
        float offset = 0.0f;
        int itemCount = 0;
        int firstPos = 0;
        int i = 0;
        float f2 = 0.0f;
        int i2 = 0;
        AnonymousClass31 anonymousClass31 = null;
        AnonymousClass39 anonymousClass392 = anonymousClass39;
        super.onDraw(canvas2);
        float offset2 = anonymousClass392.A0M > 0 ? 2.8E-45f : 2.1E-44f;
        while (true) {
            switch (offset2) {
                case 2.8E-45f:
                    anonymousClass392 = anonymousClass392;
                    if (anonymousClass392.A0S == null) {
                        offset2 = 2.1E-44f;
                        break;
                    } else {
                        offset2 = 4.2E-45f;
                        break;
                    }
                case 4.2E-45f:
                    anonymousClass392 = anonymousClass392;
                    if (anonymousClass392.A0t.size() <= 0) {
                        offset2 = 2.1E-44f;
                        break;
                    } else {
                        offset2 = 5.6E-45f;
                        break;
                    }
                case 5.6E-45f:
                    anonymousClass392 = anonymousClass392;
                    if (anonymousClass392.A01 == null) {
                        offset2 = 2.1E-44f;
                        break;
                    } else {
                        offset2 = 7.0E-45f;
                        break;
                    }
                case 7.0E-45f:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass392 = anonymousClass392;
                    scrollX = anonymousClass39.getScrollX();
                    itemIndex = anonymousClass39.getWidth();
                    float drawAt = itemIndex;
                    marginOffset = anonymousClass392.A0M / drawAt;
                    i = 0;
                    anonymousClass31 = anonymousClass392.A0t.get(0);
                    f2 = anonymousClass31.A00;
                    itemCount = anonymousClass392.A0t.size();
                    firstPos = anonymousClass31.A02;
                    i2 = anonymousClass392.A0t.get(itemCount - 1).A02;
                    offset2 = 8.4E-45f;
                    break;
                case 8.4E-45f:
                    if (firstPos >= i2) {
                        offset2 = 2.1E-44f;
                        break;
                    } else {
                        offset2 = 9.8E-45f;
                        break;
                    }
                case 9.8E-45f:
                    anonymousClass31 = anonymousClass31;
                    if (firstPos <= anonymousClass31.A02) {
                        offset2 = 1.4E-44f;
                        break;
                    } else {
                        offset2 = 1.1E-44f;
                        break;
                    }
                case 1.1E-44f:
                    if (i >= itemCount) {
                        offset2 = 1.4E-44f;
                        break;
                    } else {
                        offset2 = 1.3E-44f;
                        break;
                    }
                case 1.3E-44f:
                    anonymousClass392 = anonymousClass392;
                    i++;
                    anonymousClass31 = anonymousClass392.A0t.get(i);
                    offset2 = 9.8E-45f;
                    break;
                case 1.4E-44f:
                    anonymousClass31 = anonymousClass31;
                    if (firstPos != anonymousClass31.A02) {
                        offset2 = 2.4E-44f;
                        break;
                    } else {
                        offset2 = 1.5E-44f;
                        break;
                    }
                case 1.5E-44f:
                    anonymousClass31 = anonymousClass31;
                    offset = (anonymousClass31.A00 + anonymousClass31.A01) * itemIndex;
                    float f3 = anonymousClass31.A00;
                    float drawAt2 = anonymousClass31.A01;
                    f2 = f3 + drawAt2 + marginOffset;
                    offset2 = 1.7E-44f;
                    break;
                case 1.7E-44f:
                    anonymousClass392 = anonymousClass392;
                    float drawAt3 = scrollX;
                    if (anonymousClass392.A0M + offset <= drawAt3) {
                        offset2 = 2.24E-44f;
                        break;
                    } else {
                        offset2 = 1.8E-44f;
                        break;
                    }
                case 1.8E-44f:
                    canvas2 = canvas2;
                    anonymousClass392 = anonymousClass392;
                    f = marginOffset;
                    anonymousClass392.A0S.setBounds(Math.round(offset), anonymousClass392.A0Q, Math.round(anonymousClass392.A0M + offset), anonymousClass392.A09);
                    anonymousClass392.A0S.draw(canvas2);
                    offset2 = 2.0E-44f;
                    break;
                case 2.0E-44f:
                    float drawAt4 = scrollX + itemIndex;
                    if (offset <= drawAt4) {
                        offset2 = 2.5E-44f;
                        break;
                    } else {
                        offset2 = 2.1E-44f;
                        break;
                    }
                case 2.1E-44f:
                    return;
                case 2.24E-44f:
                    f = marginOffset;
                    offset2 = 2.0E-44f;
                    break;
                case 2.4E-44f:
                    anonymousClass392 = anonymousClass392;
                    float fA04 = anonymousClass392.A01.A04(firstPos);
                    float offset3 = f2 + fA04;
                    float widthFactor = itemIndex;
                    offset = offset3 * widthFactor;
                    f2 += fA04 + marginOffset;
                    offset2 = 1.7E-44f;
                    break;
                case 2.5E-44f:
                    firstPos++;
                    marginOffset = f;
                    offset2 = 8.4E-45f;
                    break;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        MotionEvent motionEvent2 = motionEvent;
        AnonymousClass39 anonymousClass39 = this;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        float y = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        float x = 0.0f;
        float fAbs = 0.0f;
        float fAbs2 = 0.0f;
        AnonymousClass39 anonymousClass392 = anonymousClass39;
        MotionEvent motionEvent3 = motionEvent2;
        int action = motionEvent2.getAction() & 255;
        int i3 = action != 3 ? 2 : 3;
        while (true) {
            switch (i3) {
                case 2:
                    z = true;
                    z = true;
                    if (action != 1) {
                        i3 = 4;
                        break;
                    } else {
                        i3 = 3;
                        break;
                    }
                case 3:
                    anonymousClass39.A0U();
                    return false;
                case 4:
                    if (action == 0) {
                        i3 = 9;
                        break;
                    } else {
                        i3 = 5;
                        break;
                    }
                case 5:
                    anonymousClass392 = anonymousClass392;
                    if (!anonymousClass392.A0k) {
                        i3 = 7;
                        break;
                    } else {
                        i3 = 6;
                        break;
                    }
                case 6:
                    return z;
                case 7:
                    anonymousClass392 = anonymousClass392;
                    if (!anonymousClass392.A0m) {
                        i3 = 9;
                        break;
                    } else {
                        i3 = 8;
                        break;
                    }
                case 8:
                    return false;
                case 9:
                    i = 2;
                    if (action == 0) {
                        i3 = 33;
                        break;
                    } else {
                        i3 = 10;
                        break;
                    }
                case 10:
                    if (action == i) {
                        i3 = 16;
                        break;
                    } else {
                        i3 = 11;
                        break;
                    }
                case 11:
                    if (action == 6) {
                        i3 = 15;
                        break;
                    } else {
                        i3 = 12;
                        break;
                    }
                case 12:
                    anonymousClass392 = anonymousClass392;
                    if (anonymousClass392.A0U != null) {
                        i3 = 14;
                        break;
                    } else {
                        i3 = 13;
                        break;
                    }
                case 13:
                    anonymousClass392 = anonymousClass392;
                    anonymousClass392.A0U = VelocityTracker.obtain();
                    i3 = 14;
                    break;
                case 14:
                    AnonymousClass39 anonymousClass393 = anonymousClass392;
                    anonymousClass393.A0U.addMovement(motionEvent3);
                    return anonymousClass393.A0k;
                case 15:
                    anonymousClass39 = anonymousClass39;
                    motionEvent2 = motionEvent2;
                    anonymousClass39.A0P(motionEvent2);
                    i3 = 12;
                    break;
                case 16:
                    anonymousClass392 = anonymousClass392;
                    i2 = anonymousClass392.A08;
                    if (i2 != -1) {
                        i3 = 17;
                        break;
                    } else {
                        i3 = 12;
                        break;
                    }
                case 17:
                    anonymousClass392 = anonymousClass392;
                    motionEvent3 = motionEvent3;
                    int iFindPointerIndex = motionEvent3.findPointerIndex(i2);
                    x = motionEvent3.getX(iFindPointerIndex);
                    f2 = x - anonymousClass392.A05;
                    fAbs = Math.abs(f2);
                    y = motionEvent3.getY(iFindPointerIndex);
                    fAbs2 = Math.abs(y - anonymousClass392.A04);
                    f3 = 0.0f;
                    if (f2 == 0.0f) {
                        i3 = 21;
                        break;
                    } else {
                        i3 = 18;
                        break;
                    }
                case 18:
                    anonymousClass392 = anonymousClass392;
                    if (!anonymousClass392.A0Y(anonymousClass392.A05, f2)) {
                        i3 = 19;
                        break;
                    } else {
                        i3 = 21;
                        break;
                    }
                case 19:
                    anonymousClass39 = anonymousClass39;
                    f4 = y;
                    if (!anonymousClass39.A0d(anonymousClass39, false, (int) f2, (int) x, (int) y)) {
                        i3 = 22;
                        break;
                    } else {
                        i3 = 20;
                        break;
                    }
                case 20:
                    AnonymousClass39 anonymousClass394 = anonymousClass392;
                    anonymousClass394.A05 = x;
                    anonymousClass394.A06 = f4;
                    anonymousClass394.A0m = z;
                    return false;
                case 21:
                    f4 = y;
                    i3 = 22;
                    break;
                case 22:
                    anonymousClass392 = anonymousClass392;
                    if (fAbs <= anonymousClass392.A0R) {
                        i3 = 31;
                        break;
                    } else {
                        i3 = 23;
                        break;
                    }
                case 23:
                    if (0.5f * fAbs <= fAbs2) {
                        i3 = 31;
                        break;
                    } else {
                        i3 = 24;
                        break;
                    }
                case 24:
                    anonymousClass392 = anonymousClass392;
                    anonymousClass392.A0k = z;
                    anonymousClass392.A0T(z);
                    anonymousClass392.setScrollState(z ? 1 : 0);
                    if (f2 <= f3) {
                        i3 = 30;
                        break;
                    } else {
                        i3 = 25;
                        break;
                    }
                case 25:
                    anonymousClass392 = anonymousClass392;
                    f = anonymousClass392.A03 + anonymousClass392.A0R;
                    i3 = 26;
                    break;
                case 26:
                    anonymousClass392 = anonymousClass392;
                    anonymousClass392.A05 = f;
                    anonymousClass392.A06 = f4;
                    anonymousClass392.setScrollingCacheEnabled(z);
                    i3 = 27;
                    break;
                case 27:
                    anonymousClass392 = anonymousClass392;
                    if (!anonymousClass392.A0k) {
                        i3 = 12;
                        break;
                    } else {
                        i3 = 28;
                        break;
                    }
                case 28:
                    anonymousClass392 = anonymousClass392;
                    if (!anonymousClass392.A0X(x)) {
                        i3 = 12;
                        break;
                    } else {
                        i3 = 29;
                        break;
                    }
                case 29:
                    anonymousClass39 = anonymousClass39;
                    C2v.A07(anonymousClass39);
                    i3 = 12;
                    break;
                case 30:
                    anonymousClass392 = anonymousClass392;
                    f = anonymousClass392.A03 - anonymousClass392.A0R;
                    i3 = 26;
                    break;
                case 31:
                    anonymousClass392 = anonymousClass392;
                    if (fAbs2 <= anonymousClass392.A0R) {
                        i3 = 27;
                        break;
                    } else {
                        i3 = 32;
                        break;
                    }
                case 32:
                    anonymousClass392 = anonymousClass392;
                    anonymousClass392.A0m = z;
                    i3 = 27;
                    break;
                case 33:
                    motionEvent2 = motionEvent2;
                    anonymousClass392 = anonymousClass392;
                    motionEvent3 = motionEvent3;
                    float x2 = motionEvent2.getX();
                    anonymousClass392.A03 = x2;
                    anonymousClass392.A05 = x2;
                    float y2 = motionEvent2.getY();
                    anonymousClass392.A04 = y2;
                    anonymousClass392.A06 = y2;
                    anonymousClass392.A08 = motionEvent3.getPointerId(0);
                    anonymousClass392.A0m = false;
                    anonymousClass392.A0l = z;
                    anonymousClass392.A0X.computeScrollOffset();
                    if (anonymousClass392.A0P != i) {
                        i3 = 36;
                        break;
                    } else {
                        i3 = 34;
                        break;
                    }
                case 34:
                    anonymousClass392 = anonymousClass392;
                    if (Math.abs(anonymousClass392.A0X.getFinalX() - anonymousClass392.A0X.getCurrX()) <= anonymousClass392.A0C) {
                        i3 = 36;
                        break;
                    } else {
                        i3 = 35;
                        break;
                    }
                case 35:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass392 = anonymousClass392;
                    anonymousClass392.A0X.abortAnimation();
                    anonymousClass392.A0o = false;
                    anonymousClass39.A0f();
                    anonymousClass392.A0k = z;
                    anonymousClass392.A0T(z);
                    anonymousClass392.setScrollState(z ? 1 : 0);
                    i3 = 12;
                    break;
                case 36:
                    anonymousClass392 = anonymousClass392;
                    anonymousClass392.A0R(false);
                    anonymousClass392.A0k = false;
                    i3 = 12;
                    break;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Resources.NotFoundException {
        int paddingRight = 0;
        AnonymousClass31 anonymousClass31A07 = null;
        AnonymousClass32 anonymousClass32 = null;
        boolean z2 = false;
        int i5 = 0;
        View child = null;
        View childAt = null;
        int loff = 0;
        int iMax = 0;
        int i6 = 0;
        int i7 = 0;
        AnonymousClass32 lp = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iMax2 = 0;
        AnonymousClass39 anonymousClass39 = this;
        int childCount = getChildCount();
        int childTop = i3 - i;
        int paddingTop = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop2 = getPaddingTop();
        int paddingRight2 = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i13 = 0;
        int i14 = 0;
        int count = 2;
        while (true) {
            switch (count) {
                case 2:
                    i6 = 8;
                    if (i14 >= childCount) {
                        count = 21;
                        break;
                    } else {
                        count = 3;
                        break;
                    }
                case 3:
                    anonymousClass39 = anonymousClass39;
                    childAt = anonymousClass39.getChildAt(i14);
                    if (childAt.getVisibility() == i6) {
                        count = 14;
                        break;
                    } else {
                        count = 4;
                        break;
                    }
                case 4:
                    childAt = childAt;
                    AnonymousClass32 lp2 = (AnonymousClass32) childAt.getLayoutParams();
                    lp = lp2;
                    if (!lp.A05) {
                        count = 14;
                        break;
                    } else {
                        count = 5;
                        break;
                    }
                case 5:
                    lp = lp;
                    i8 = lp.A04 & 7;
                    int childLeft = lp.A04;
                    i9 = childLeft & 112;
                    if (i8 == 1) {
                        count = 20;
                        break;
                    } else {
                        count = 6;
                        break;
                    }
                case 6:
                    if (i8 == 3) {
                        count = 19;
                        break;
                    } else {
                        count = 7;
                        break;
                    }
                case 7:
                    if (i8 == 5) {
                        count = 18;
                        break;
                    } else {
                        count = 8;
                        break;
                    }
                case 8:
                    iMax2 = paddingLeft;
                    count = 9;
                    break;
                case 9:
                    i12 = paddingLeft;
                    if (i9 == 16) {
                        count = 17;
                        break;
                    } else {
                        count = 10;
                        break;
                    }
                case 10:
                    if (i9 == 48) {
                        count = 16;
                        break;
                    } else {
                        count = 11;
                        break;
                    }
                case 11:
                    if (i9 == 80) {
                        count = 15;
                        break;
                    } else {
                        count = 12;
                        break;
                    }
                case 12:
                    iMax = paddingTop2;
                    count = 13;
                    break;
                case 13:
                    childAt = childAt;
                    int i15 = iMax2 + scrollX;
                    childAt.layout(i15, iMax, childAt.getMeasuredWidth() + i15, childAt.getMeasuredHeight() + iMax);
                    i13++;
                    paddingLeft = i12;
                    count = 14;
                    break;
                case 14:
                    i14++;
                    count = 2;
                    break;
                case 15:
                    childAt = childAt;
                    int count2 = childAt.getMeasuredHeight();
                    iMax = (paddingTop - paddingBottom) - count2;
                    int count3 = childAt.getMeasuredHeight();
                    paddingBottom += count3;
                    count = 13;
                    break;
                case 16:
                    childAt = childAt;
                    iMax = paddingTop2;
                    paddingTop2 += childAt.getMeasuredHeight();
                    count = 13;
                    break;
                case 17:
                    childAt = childAt;
                    iMax = Math.max((paddingTop - childAt.getMeasuredHeight()) / 2, paddingTop2);
                    count = 13;
                    break;
                case 18:
                    childAt = childAt;
                    iMax2 = (childTop - paddingRight2) - childAt.getMeasuredWidth();
                    paddingRight2 += childAt.getMeasuredWidth();
                    count = 9;
                    break;
                case 19:
                    childAt = childAt;
                    iMax2 = paddingLeft;
                    paddingLeft += childAt.getMeasuredWidth();
                    count = 9;
                    break;
                case 20:
                    childAt = childAt;
                    iMax2 = Math.max((childTop - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    count = 9;
                    break;
                case 21:
                    int i16 = childTop - paddingLeft;
                    i5 = i16 - paddingRight2;
                    i7 = 0;
                    count = 22;
                    break;
                case 22:
                    if (i7 >= childCount) {
                        count = 34;
                        break;
                    } else {
                        count = 23;
                        break;
                    }
                case 23:
                    anonymousClass39 = anonymousClass39;
                    child = anonymousClass39.getChildAt(i7);
                    int count4 = child.getVisibility();
                    if (count4 == i6) {
                        count = 33;
                        break;
                    } else {
                        count = 24;
                        break;
                    }
                case 24:
                    child = child;
                    anonymousClass32 = (AnonymousClass32) child.getLayoutParams();
                    if (!anonymousClass32.A05) {
                        count = 25;
                        break;
                    } else {
                        count = 32;
                        break;
                    }
                case 25:
                    anonymousClass39 = anonymousClass39;
                    child = child;
                    anonymousClass31A07 = anonymousClass39.A07(child);
                    if (anonymousClass31A07 == null) {
                        count = 31;
                        break;
                    } else {
                        count = 26;
                        break;
                    }
                case 26:
                    anonymousClass32 = anonymousClass32;
                    anonymousClass31A07 = anonymousClass31A07;
                    int count5 = i5;
                    i11 = childCount;
                    loff = paddingLeft + ((int) (count5 * anonymousClass31A07.A00));
                    paddingRight = paddingTop2;
                    if (!anonymousClass32.A03) {
                        count = 30;
                        break;
                    } else {
                        count = 27;
                        break;
                    }
                case 27:
                    child = child;
                    anonymousClass32 = anonymousClass32;
                    anonymousClass32.A03 = false;
                    i10 = paddingLeft;
                    child.measure(View.MeasureSpec.makeMeasureSpec((int) (i5 * anonymousClass32.A00), 1073741824), View.MeasureSpec.makeMeasureSpec((paddingTop - paddingTop2) - paddingBottom, 1073741824));
                    count = 28;
                    break;
                case 28:
                    child = child;
                    int measuredWidth = child.getMeasuredWidth() + loff;
                    int count6 = child.getMeasuredHeight();
                    child.layout(loff, paddingRight, measuredWidth, count6 + paddingRight);
                    count = 29;
                    break;
                case 29:
                    i7++;
                    childCount = i11;
                    paddingLeft = i10;
                    i6 = 8;
                    count = 22;
                    break;
                case 30:
                    i10 = paddingLeft;
                    count = 28;
                    break;
                case 31:
                    i10 = paddingLeft;
                    i11 = childCount;
                    count = 29;
                    break;
                case 32:
                    i11 = childCount;
                    i10 = paddingLeft;
                    count = 29;
                    break;
                case 33:
                    i11 = childCount;
                    i10 = paddingLeft;
                    count = 29;
                    break;
                case 34:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0Q = paddingTop2;
                    anonymousClass39.A09 = paddingTop - paddingBottom;
                    anonymousClass39.A0D = i13;
                    if (!anonymousClass39.A0i) {
                        count = 37;
                        break;
                    } else {
                        count = 35;
                        break;
                    }
                case 35:
                    anonymousClass39 = anonymousClass39;
                    z2 = false;
                    anonymousClass39.A0M(anonymousClass39.A00, false, 0, false);
                    count = 36;
                    break;
                case 36:
                    anonymousClass39.A0i = z2;
                    return;
                case 37:
                    z2 = false;
                    count = 36;
                    break;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) throws Resources.NotFoundException {
        AnonymousClass39 anonymousClass39 = this;
        int measuredWidth = 0;
        int heightMode = 0;
        int maxGutterSize = 0;
        int childWidthSize = 0;
        int childHeightSize = 0;
        int size = 0;
        int i3 = 0;
        AnonymousClass32 lp = null;
        View child = null;
        int i4 = 0;
        int i5 = 0;
        int heightMode2 = 0;
        int i6 = 0;
        View childAt = null;
        int i7 = 0;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        AnonymousClass32 anonymousClass32 = null;
        int i10 = 0;
        int i11 = 0;
        AnonymousClass39 anonymousClass392 = anonymousClass39;
        anonymousClass392.setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth2 = anonymousClass39.getMeasuredWidth();
        anonymousClass392.A0I = Math.min(measuredWidth2 / 10, anonymousClass392.A0E);
        int paddingLeft = (measuredWidth2 - anonymousClass39.getPaddingLeft()) - anonymousClass39.getPaddingRight();
        int measuredHeight = (anonymousClass39.getMeasuredHeight() - anonymousClass39.getPaddingTop()) - anonymousClass39.getPaddingBottom();
        int childCount = anonymousClass39.getChildCount();
        int i12 = 0;
        int measuredWidth3 = 2;
        while (true) {
            switch (measuredWidth3) {
                case 2:
                    i5 = 8;
                    if (i12 >= childCount) {
                        measuredWidth3 = 33;
                        break;
                    } else {
                        measuredWidth3 = 3;
                        break;
                    }
                case 3:
                    anonymousClass392 = anonymousClass392;
                    child = anonymousClass392.getChildAt(i12);
                    if (child.getVisibility() == i5) {
                        measuredWidth3 = 22;
                        break;
                    } else {
                        measuredWidth3 = 4;
                        break;
                    }
                case 4:
                    child = child;
                    lp = (AnonymousClass32) child.getLayoutParams();
                    if (lp == null) {
                        measuredWidth3 = 22;
                        break;
                    } else {
                        measuredWidth3 = 5;
                        break;
                    }
                case 5:
                    lp = lp;
                    if (!lp.A05) {
                        measuredWidth3 = 22;
                        break;
                    } else {
                        measuredWidth3 = 6;
                        break;
                    }
                case 6:
                    lp = lp;
                    i7 = lp.A04 & 7;
                    i6 = lp.A04 & 112;
                    i10 = RecyclerView.UNDEFINED_DURATION;
                    childWidthSize = RecyclerView.UNDEFINED_DURATION;
                    if (i6 == 48) {
                        measuredWidth3 = 8;
                        break;
                    } else {
                        measuredWidth3 = 7;
                        break;
                    }
                case 7:
                    if (i6 != 80) {
                        measuredWidth3 = 32;
                        break;
                    } else {
                        measuredWidth3 = 8;
                        break;
                    }
                case 8:
                    z = true;
                    measuredWidth3 = 9;
                    break;
                case 9:
                    if (i7 == 3) {
                        measuredWidth3 = 11;
                        break;
                    } else {
                        measuredWidth3 = 10;
                        break;
                    }
                case 10:
                    if (i7 != 5) {
                        measuredWidth3 = 31;
                        break;
                    } else {
                        measuredWidth3 = 11;
                        break;
                    }
                case 11:
                    heightMode2 = 1;
                    measuredWidth3 = 12;
                    break;
                case 12:
                    size = heightMode2;
                    if (!z) {
                        measuredWidth3 = 29;
                        break;
                    } else {
                        measuredWidth3 = 13;
                        break;
                    }
                case 13:
                    i10 = 1073741824;
                    measuredWidth3 = 14;
                    break;
                case 14:
                    lp = lp;
                    maxGutterSize = paddingLeft;
                    childHeightSize = measuredHeight;
                    if (lp.width == -2) {
                        measuredWidth3 = 28;
                        break;
                    } else {
                        measuredWidth3 = 15;
                        break;
                    }
                case 15:
                    lp = lp;
                    i10 = 1073741824;
                    if (lp.width == -1) {
                        measuredWidth3 = 27;
                        break;
                    } else {
                        measuredWidth3 = 16;
                        break;
                    }
                case 16:
                    lp = lp;
                    i11 = lp.width;
                    measuredWidth3 = 17;
                    break;
                case 17:
                    lp = lp;
                    if (lp.height == -2) {
                        measuredWidth3 = 26;
                        break;
                    } else {
                        measuredWidth3 = 18;
                        break;
                    }
                case 18:
                    lp = lp;
                    i9 = 1073741824;
                    if (lp.height == -1) {
                        measuredWidth3 = 25;
                        break;
                    } else {
                        measuredWidth3 = 19;
                        break;
                    }
                case 19:
                    lp = lp;
                    i8 = lp.height;
                    i3 = i9;
                    measuredWidth3 = 20;
                    break;
                case 20:
                    child = child;
                    child.measure(View.MeasureSpec.makeMeasureSpec(i11, i10), View.MeasureSpec.makeMeasureSpec(i8, i3));
                    if (!z) {
                        measuredWidth3 = 23;
                        break;
                    } else {
                        measuredWidth3 = 21;
                        break;
                    }
                case 21:
                    child = child;
                    measuredHeight -= child.getMeasuredHeight();
                    measuredWidth3 = 22;
                    break;
                case 22:
                    i12++;
                    measuredWidth3 = 2;
                    break;
                case 23:
                    if (size == 0) {
                        measuredWidth3 = 22;
                        break;
                    } else {
                        measuredWidth3 = 24;
                        break;
                    }
                case 24:
                    child = child;
                    paddingLeft -= child.getMeasuredWidth();
                    measuredWidth3 = 22;
                    break;
                case 25:
                    i3 = i9;
                    i8 = childHeightSize;
                    measuredWidth3 = 20;
                    break;
                case 26:
                    i3 = childWidthSize;
                    i8 = childHeightSize;
                    measuredWidth3 = 20;
                    break;
                case 27:
                    i11 = maxGutterSize;
                    measuredWidth3 = 17;
                    break;
                case 28:
                    i11 = maxGutterSize;
                    measuredWidth3 = 17;
                    break;
                case 29:
                    if (size == 0) {
                        measuredWidth3 = 14;
                        break;
                    } else {
                        measuredWidth3 = 30;
                        break;
                    }
                case 30:
                    childWidthSize = 1073741824;
                    measuredWidth3 = 14;
                    break;
                case 31:
                    heightMode2 = 0;
                    measuredWidth3 = 12;
                    break;
                case 32:
                    z = false;
                    measuredWidth3 = 9;
                    break;
                case 33:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass392 = anonymousClass392;
                    i4 = 1073741824;
                    anonymousClass392.A0B = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
                    anonymousClass392.A0A = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                    anonymousClass392.A0j = true;
                    anonymousClass39.A0f();
                    anonymousClass392.A0j = false;
                    heightMode = anonymousClass39.getChildCount();
                    measuredWidth = 0;
                    measuredWidth3 = 34;
                    break;
                case 34:
                    if (measuredWidth >= heightMode) {
                        measuredWidth3 = 40;
                        break;
                    } else {
                        measuredWidth3 = 35;
                        break;
                    }
                case 35:
                    anonymousClass392 = anonymousClass392;
                    childAt = anonymousClass392.getChildAt(measuredWidth);
                    if (childAt.getVisibility() == i5) {
                        measuredWidth3 = 39;
                        break;
                    } else {
                        measuredWidth3 = 36;
                        break;
                    }
                case 36:
                    childAt = childAt;
                    anonymousClass32 = (AnonymousClass32) childAt.getLayoutParams();
                    if (anonymousClass32 == null) {
                        measuredWidth3 = 38;
                        break;
                    } else {
                        measuredWidth3 = 37;
                        break;
                    }
                case 37:
                    anonymousClass32 = anonymousClass32;
                    if (!anonymousClass32.A05) {
                        measuredWidth3 = 38;
                        break;
                    } else {
                        measuredWidth3 = 39;
                        break;
                    }
                case 38:
                    anonymousClass392 = anonymousClass392;
                    childAt = childAt;
                    anonymousClass32 = anonymousClass32;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * anonymousClass32.A00), i4), anonymousClass392.A0A);
                    measuredWidth3 = 39;
                    break;
                case 39:
                    measuredWidth++;
                    measuredWidth3 = 34;
                    break;
                case 40:
                    return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int index, Rect rect) {
        AnonymousClass39 anonymousClass39 = this;
        int end = 0;
        AnonymousClass31 anonymousClass31A07 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        View childAt = null;
        int childCount = anonymousClass39.getChildCount();
        char c2 = (index & 2) != 0 ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    i = 0;
                    end = 1;
                    i2 = childCount;
                    c2 = 3;
                    break;
                case 3:
                    i3 = i;
                    c2 = 4;
                    break;
                case 4:
                    if (i3 == i2) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    anonymousClass39 = anonymousClass39;
                    childAt = anonymousClass39.getChildAt(i3);
                    if (childAt.getVisibility() != 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    anonymousClass39 = anonymousClass39;
                    childAt = childAt;
                    anonymousClass31A07 = anonymousClass39.A07(childAt);
                    if (anonymousClass31A07 == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass31A07 = anonymousClass31A07;
                    if (anonymousClass31A07.A02 != anonymousClass39.A00) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    rect = rect;
                    childAt = childAt;
                    if (!childAt.requestFocus(index, rect)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return true;
                case '\n':
                    i3 += end;
                    c2 = 4;
                    break;
                case 11:
                    i = childCount - 1;
                    end = -1;
                    i2 = -1;
                    c2 = 3;
                    break;
                case '\f':
                    return false;
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        AnonymousClass39 anonymousClass39 = this;
        ViewPager$SavedState viewPager$SavedState = null;
        char c2 = !(parcelable instanceof ViewPager$SavedState) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    super.onRestoreInstanceState(parcelable);
                    return;
                case 3:
                    anonymousClass39 = anonymousClass39;
                    parcelable = parcelable;
                    viewPager$SavedState = (ViewPager$SavedState) parcelable;
                    super.onRestoreInstanceState(viewPager$SavedState.A02());
                    if (anonymousClass39.A01 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass39 = anonymousClass39;
                    viewPager$SavedState = viewPager$SavedState;
                    anonymousClass39.A0N(viewPager$SavedState.A00, false, true);
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    anonymousClass39 = anonymousClass39;
                    viewPager$SavedState = viewPager$SavedState;
                    anonymousClass39.A0O = viewPager$SavedState.A00;
                    anonymousClass39.A0T = viewPager$SavedState.A01;
                    anonymousClass39.A0c = viewPager$SavedState.A02;
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ViewPager$SavedState viewPager$SavedState = new ViewPager$SavedState(super.onSaveInstanceState());
        viewPager$SavedState.A00 = this.A00;
        AbstractC01632g abstractC01632g = this.A01;
        if (abstractC01632g != null) {
            viewPager$SavedState.A01 = abstractC01632g.A07();
        }
        return viewPager$SavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.A0M;
            A0K(i, i3, i5, i5);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        MotionEvent motionEvent2 = motionEvent;
        AnonymousClass39 anonymousClass39 = this;
        AbstractC01632g abstractC01632g = null;
        float fAbs = 0.0f;
        int i = 0;
        float x = 0.0f;
        ViewParent parent = null;
        boolean zA0U = false;
        float y = 0.0f;
        float f = 0.0f;
        int iFindPointerIndex = 0;
        float fAbs2 = 0.0f;
        float f2 = 0.0f;
        AnonymousClass39 anonymousClass392 = anonymousClass39;
        MotionEvent motionEvent3 = motionEvent2;
        float y2 = anonymousClass392.A0h ? 2.8E-45f : 4.2E-45f;
        while (true) {
            switch (y2) {
                case 2.8E-45f:
                    return true;
                case 4.2E-45f:
                    motionEvent2 = motionEvent2;
                    if (motionEvent2.getAction() != 0) {
                        y2 = 8.4E-45f;
                        break;
                    } else {
                        y2 = 5.6E-45f;
                        break;
                    }
                case 5.6E-45f:
                    motionEvent2 = motionEvent2;
                    if (motionEvent2.getEdgeFlags() == 0) {
                        y2 = 8.4E-45f;
                        break;
                    } else {
                        y2 = 7.0E-45f;
                        break;
                    }
                case 7.0E-45f:
                    return false;
                case 8.4E-45f:
                    anonymousClass392 = anonymousClass392;
                    abstractC01632g = anonymousClass392.A01;
                    if (abstractC01632g == null) {
                        y2 = 1.1E-44f;
                        break;
                    } else {
                        y2 = 9.8E-45f;
                        break;
                    }
                case 9.8E-45f:
                    abstractC01632g = abstractC01632g;
                    if (abstractC01632g.A05() != 0) {
                        y2 = 1.3E-44f;
                        break;
                    } else {
                        y2 = 1.1E-44f;
                        break;
                    }
                case 1.1E-44f:
                    return false;
                case 1.3E-44f:
                    anonymousClass392 = anonymousClass392;
                    if (anonymousClass392.A0U != null) {
                        y2 = 1.5E-44f;
                        break;
                    } else {
                        y2 = 1.4E-44f;
                        break;
                    }
                case 1.4E-44f:
                    anonymousClass392 = anonymousClass392;
                    anonymousClass392.A0U = VelocityTracker.obtain();
                    y2 = 1.5E-44f;
                    break;
                case 1.5E-44f:
                    motionEvent2 = motionEvent2;
                    anonymousClass392 = anonymousClass392;
                    motionEvent3 = motionEvent3;
                    anonymousClass392.A0U.addMovement(motionEvent3);
                    int pointerIndex = motionEvent2.getAction();
                    zA0U = false;
                    i = pointerIndex & 255;
                    if (i == 0) {
                        y2 = 5.3E-44f;
                        break;
                    } else {
                        y2 = 1.7E-44f;
                        break;
                    }
                case 1.7E-44f:
                    if (i == 1) {
                        y2 = 5.0E-44f;
                        break;
                    } else {
                        y2 = 1.8E-44f;
                        break;
                    }
                case 1.8E-44f:
                    if (i == 2) {
                        y2 = 3.4E-44f;
                        break;
                    } else {
                        y2 = 2.0E-44f;
                        break;
                    }
                case 2.0E-44f:
                    if (i == 3) {
                        y2 = 3.1E-44f;
                        break;
                    } else {
                        y2 = 2.1E-44f;
                        break;
                    }
                case 2.1E-44f:
                    if (i == 5) {
                        y2 = 2.9E-44f;
                        break;
                    } else {
                        y2 = 2.24E-44f;
                        break;
                    }
                case 2.24E-44f:
                    if (i == 6) {
                        y2 = 2.8E-44f;
                        break;
                    } else {
                        y2 = 2.4E-44f;
                        break;
                    }
                case 2.4E-44f:
                    if (!zA0U) {
                        y2 = 2.7E-44f;
                        break;
                    } else {
                        y2 = 2.5E-44f;
                        break;
                    }
                case 2.5E-44f:
                    anonymousClass39 = anonymousClass39;
                    C2v.A07(anonymousClass39);
                    y2 = 2.7E-44f;
                    break;
                case 2.7E-44f:
                    return true;
                case 2.8E-44f:
                    anonymousClass39 = anonymousClass39;
                    motionEvent2 = motionEvent2;
                    anonymousClass392 = anonymousClass392;
                    motionEvent3 = motionEvent3;
                    anonymousClass39.A0P(motionEvent2);
                    anonymousClass392.A05 = motionEvent3.getX(motionEvent3.findPointerIndex(anonymousClass392.A08));
                    y2 = 2.4E-44f;
                    break;
                case 2.9E-44f:
                    motionEvent2 = motionEvent2;
                    anonymousClass392 = anonymousClass392;
                    motionEvent3 = motionEvent3;
                    int actionIndex = motionEvent2.getActionIndex();
                    anonymousClass392.A05 = motionEvent3.getX(actionIndex);
                    int index = motionEvent3.getPointerId(actionIndex);
                    anonymousClass392.A08 = index;
                    y2 = 2.4E-44f;
                    break;
                case 3.1E-44f:
                    anonymousClass392 = anonymousClass392;
                    if (!anonymousClass392.A0k) {
                        y2 = 2.4E-44f;
                        break;
                    } else {
                        y2 = 3.2E-44f;
                        break;
                    }
                case 3.2E-44f:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass392 = anonymousClass392;
                    anonymousClass392.A0M(anonymousClass392.A00, true, 0, false);
                    zA0U = anonymousClass39.A0U();
                    y2 = 2.4E-44f;
                    break;
                case 3.4E-44f:
                    anonymousClass392 = anonymousClass392;
                    if (!anonymousClass392.A0k) {
                        y2 = 3.5E-44f;
                        break;
                    } else {
                        y2 = 4.6E-44f;
                        break;
                    }
                case 3.5E-44f:
                    anonymousClass392 = anonymousClass392;
                    motionEvent3 = motionEvent3;
                    int index2 = anonymousClass392.A08;
                    iFindPointerIndex = motionEvent3.findPointerIndex(index2);
                    if (iFindPointerIndex != -1) {
                        y2 = 3.8E-44f;
                        break;
                    } else {
                        y2 = 3.6E-44f;
                        break;
                    }
                case 3.6E-44f:
                    anonymousClass39 = anonymousClass39;
                    zA0U = anonymousClass39.A0U();
                    y2 = 2.4E-44f;
                    break;
                case 3.8E-44f:
                    anonymousClass392 = anonymousClass392;
                    motionEvent3 = motionEvent3;
                    x = motionEvent3.getX(iFindPointerIndex);
                    fAbs = Math.abs(x - anonymousClass392.A05);
                    y = motionEvent3.getY(iFindPointerIndex);
                    float y3 = anonymousClass392.A06;
                    fAbs2 = Math.abs(y - y3);
                    float y4 = anonymousClass392.A0R;
                    if (fAbs <= y4) {
                        y2 = 4.6E-44f;
                        break;
                    } else {
                        y2 = 3.9E-44f;
                        break;
                    }
                case 3.9E-44f:
                    if (fAbs <= fAbs2) {
                        y2 = 4.6E-44f;
                        break;
                    } else {
                        y2 = 4.1E-44f;
                        break;
                    }
                case 4.1E-44f:
                    anonymousClass392 = anonymousClass392;
                    anonymousClass392.A0k = true;
                    anonymousClass392.A0T(true);
                    f2 = anonymousClass392.A03;
                    if (x - f2 <= 0.0f) {
                        y2 = 4.9E-44f;
                        break;
                    } else {
                        y2 = 4.2E-44f;
                        break;
                    }
                case 4.2E-44f:
                    anonymousClass392 = anonymousClass392;
                    f = f2 + anonymousClass392.A0R;
                    y2 = 4.3E-44f;
                    break;
                case 4.3E-44f:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass392 = anonymousClass392;
                    anonymousClass392.A05 = f;
                    anonymousClass392.A06 = y;
                    anonymousClass392.setScrollState(1);
                    anonymousClass392.setScrollingCacheEnabled(true);
                    parent = anonymousClass39.getParent();
                    if (parent == null) {
                        y2 = 4.6E-44f;
                        break;
                    } else {
                        y2 = 4.5E-44f;
                        break;
                    }
                case 4.5E-44f:
                    parent = parent;
                    parent.requestDisallowInterceptTouchEvent(true);
                    y2 = 4.6E-44f;
                    break;
                case 4.6E-44f:
                    anonymousClass392 = anonymousClass392;
                    if (!anonymousClass392.A0k) {
                        y2 = 2.4E-44f;
                        break;
                    } else {
                        y2 = 4.8E-44f;
                        break;
                    }
                case 4.8E-44f:
                    anonymousClass392 = anonymousClass392;
                    motionEvent3 = motionEvent3;
                    int activePointerIndex = motionEvent3.findPointerIndex(anonymousClass392.A08);
                    float y5 = motionEvent3.getX(activePointerIndex);
                    zA0U = false | anonymousClass392.A0X(y5);
                    y2 = 2.4E-44f;
                    break;
                case 4.9E-44f:
                    anonymousClass392 = anonymousClass392;
                    f = f2 - anonymousClass392.A0R;
                    y2 = 4.3E-44f;
                    break;
                case 5.0E-44f:
                    anonymousClass392 = anonymousClass392;
                    if (!anonymousClass392.A0k) {
                        y2 = 2.4E-44f;
                        break;
                    } else {
                        y2 = 5.2E-44f;
                        break;
                    }
                case 5.2E-44f:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass392 = anonymousClass392;
                    motionEvent3 = motionEvent3;
                    VelocityTracker velocityTracker = anonymousClass392.A0U;
                    velocityTracker.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, anonymousClass392.A0J);
                    int xVelocity = (int) velocityTracker.getXVelocity(anonymousClass392.A08);
                    anonymousClass392.A0o = true;
                    int clientWidth = anonymousClass39.getClientWidth();
                    int scrollX = anonymousClass39.getScrollX();
                    AnonymousClass31 anonymousClass31A03 = anonymousClass39.A03();
                    int scrollX2 = anonymousClass392.A0M;
                    int scrollX3 = anonymousClass31A03.A02;
                    float f3 = ((scrollX / clientWidth) - anonymousClass31A03.A00) / (anonymousClass31A03.A01 + (scrollX2 / clientWidth));
                    int scrollX4 = anonymousClass392.A08;
                    int activePointerIndex2 = (int) (motionEvent3.getX(motionEvent3.findPointerIndex(scrollX4)) - anonymousClass392.A03);
                    anonymousClass392.A0O(anonymousClass392.A01(scrollX3, f3, xVelocity, activePointerIndex2), true, true, xVelocity);
                    zA0U = anonymousClass39.A0U();
                    y2 = 2.4E-44f;
                    break;
                case 5.3E-44f:
                    anonymousClass39 = anonymousClass39;
                    motionEvent2 = motionEvent2;
                    anonymousClass392 = anonymousClass392;
                    motionEvent3 = motionEvent3;
                    anonymousClass392.A0X.abortAnimation();
                    anonymousClass392.A0o = false;
                    anonymousClass39.A0f();
                    float x2 = motionEvent2.getX();
                    anonymousClass392.A03 = x2;
                    anonymousClass392.A05 = x2;
                    float y6 = motionEvent2.getY();
                    anonymousClass392.A04 = y6;
                    anonymousClass392.A06 = y6;
                    anonymousClass392.A08 = motionEvent3.getPointerId(0);
                    y2 = 2.4E-44f;
                    break;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        AnonymousClass39 anonymousClass39 = this;
        char c2 = anonymousClass39.A0j ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    view = view;
                    anonymousClass39.removeViewInLayout(view);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    anonymousClass39 = anonymousClass39;
                    view = view;
                    super.removeView(view);
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [com.facebook.ads.redexgen.X.36] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.os.Parcelable, java.lang.ClassLoader] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public void setAdapter(AbstractC01632g abstractC01632g) throws Resources.NotFoundException {
        final AnonymousClass39 anonymousClass39 = this;
        int size = 0;
        int i = 0;
        List<ViewPager.OnAdapterChangeListener> list = null;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        AbstractC01632g abstractC01632g2 = anonymousClass39.A01;
        ?? r2 = 0;
        boolean z3 = false;
        char c2 = abstractC01632g2 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    abstractC01632g2 = abstractC01632g2;
                    r2 = 0;
                    abstractC01632g2.A0A(null);
                    i2 = 0;
                    c2 = 3;
                    break;
                case 3:
                    anonymousClass39 = anonymousClass39;
                    if (i2 >= anonymousClass39.A0t.size()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass39 = anonymousClass39;
                    AnonymousClass31 anonymousClass31 = anonymousClass39.A0t.get(i2);
                    anonymousClass39.A01.A0B(anonymousClass39, anonymousClass31.A02, anonymousClass31.A03);
                    i2++;
                    c2 = 3;
                    break;
                case 5:
                    anonymousClass39 = anonymousClass39;
                    z3 = false;
                    anonymousClass39.A0t.clear();
                    anonymousClass39.A0A();
                    anonymousClass39.A00 = 0;
                    anonymousClass39.scrollTo(0, 0);
                    c2 = 6;
                    break;
                case 6:
                    anonymousClass39 = anonymousClass39;
                    abstractC01632g = abstractC01632g;
                    anonymousClass39.A01 = abstractC01632g;
                    anonymousClass39.A0G = z3 ? 1 : 0;
                    if (anonymousClass39.A01 == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    anonymousClass39 = anonymousClass39;
                    if (anonymousClass39.A0b != null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0b = new DataSetObserver() { // from class: com.facebook.ads.redexgen.X.36
                        @Override // android.database.DataSetObserver
                        public final void onChanged() throws Resources.NotFoundException {
                            this.A00.A0e();
                        }

                        @Override // android.database.DataSetObserver
                        public final void onInvalidated() throws Resources.NotFoundException {
                            this.A00.A0e();
                        }
                    };
                    c2 = '\t';
                    break;
                case '\t':
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A01.A0A(anonymousClass39.A0b);
                    anonymousClass39.A0o = z3;
                    z = anonymousClass39.A0i;
                    z2 = true;
                    anonymousClass39.A0i = true;
                    anonymousClass39.A0G = anonymousClass39.A01.A05();
                    if (anonymousClass39.A0O < 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0N(anonymousClass39.A0O, z3, z2);
                    anonymousClass39.A0O = -1;
                    anonymousClass39.A0T = r2;
                    anonymousClass39.A0c = r2;
                    c2 = 11;
                    break;
                case 11:
                    anonymousClass39 = anonymousClass39;
                    list = anonymousClass39.A0e;
                    if (list == null) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    list = list;
                    if (!list.isEmpty()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case '\r':
                    anonymousClass39 = anonymousClass39;
                    i = 0;
                    size = anonymousClass39.A0e.size();
                    c2 = 14;
                    break;
                case 14:
                    if (i >= size) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0e.get(i);
                    i++;
                    c2 = 14;
                    break;
                case 16:
                    if (!z) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 17:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0f();
                    c2 = 11;
                    break;
                case 18:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.requestLayout();
                    c2 = 11;
                    break;
                case 19:
                    return;
            }
        }
    }

    public void setCurrentItem(int i) {
        this.A0o = false;
        A0N(i, !this.A0i, false);
    }

    public void setOffscreenPageLimit(int i) throws Resources.NotFoundException {
        AnonymousClass39 anonymousClass39 = this;
        char c2 = i < 1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    Log.w(A08(357, 9, 22), A08(72, 31, 88) + i + A08(103, 26, k.AppCompatTheme_windowActionModeOverlay) + 1);
                    i = 1;
                    c2 = 3;
                    break;
                case 3:
                    anonymousClass39 = anonymousClass39;
                    if (i == anonymousClass39.A0L) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0L = i;
                    anonymousClass39.A0f();
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    @Deprecated
    public void setOnPageChangeListener(AnonymousClass34 anonymousClass34) {
        this.A0Z = anonymousClass34;
    }

    public void setPageMargin(int width) {
        int i = this.A0M;
        this.A0M = width;
        int width2 = getWidth();
        A0K(width2, width2, width, i);
        requestLayout();
    }

    public void setPageMarginDrawable(@DrawableRes int i) {
        setPageMarginDrawable(C2C.A00(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        AnonymousClass39 anonymousClass39 = this;
        boolean z = false;
        anonymousClass39.A0S = drawable;
        char c2 = drawable != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.refreshDrawableState();
                    c2 = 3;
                    break;
                case 3:
                    drawable = drawable;
                    if (drawable != null) {
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
                    AnonymousClass39 anonymousClass392 = anonymousClass39;
                    anonymousClass392.setWillNotDraw(z);
                    anonymousClass392.invalidate();
                    return;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    public void setScrollState(int i) {
        AnonymousClass39 anonymousClass39 = this;
        boolean z = false;
        char c2 = anonymousClass39.A0P == i ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0P = i;
                    if (anonymousClass39.A0a == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z = true;
                    c2 = 6;
                    break;
                case 6:
                    anonymousClass39 = anonymousClass39;
                    anonymousClass39.A0S(z);
                    c2 = 7;
                    break;
                case 7:
                    anonymousClass39.A0F(i);
                    return;
                case '\b':
                    z = false;
                    c2 = 6;
                    break;
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.A0p != z) {
            this.A0p = z;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        AnonymousClass39 anonymousClass39 = this;
        boolean z = false;
        char c2 = !super.verifyDrawable(drawable) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass39 = anonymousClass39;
                    drawable = drawable;
                    if (drawable != anonymousClass39.A0S) {
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
}

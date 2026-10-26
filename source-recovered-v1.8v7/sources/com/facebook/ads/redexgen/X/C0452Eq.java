package com.facebook.ads.redexgen.X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Eq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0452Eq extends ViewGroup implements InterfaceC0799Sj {
    public static byte[] A18;
    public static final Interpolator A19;
    public static final boolean A1A;
    public static final boolean A1B;
    public static final boolean A1C;
    public static final boolean A1D;
    public static final boolean A1E;
    public static final boolean A1F;
    public static final int[] A1G;
    public static final int[] A1H;
    public static final Class<?>[] A1I;
    public C0813Sy A00;
    public C01863e A01;
    public C0814Sz A02;
    public RunnableC01993r A03;
    public AnonymousClass44 A04;
    public C4C A05;

    @VisibleForTesting
    public C4G A06;
    public C4P A07;
    public C4X A08;
    public TG A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    @VisibleForTesting
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public float A0L;
    public float A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public VelocityTracker A0Y;
    public EdgeEffect A0Z;
    public EdgeEffect A0a;
    public EdgeEffect A0b;
    public EdgeEffect A0c;
    public C01602d A0d;
    public AnonymousClass47 A0e;
    public C4A A0f;
    public C4J A0g;
    public C4K A0h;
    public C4L A0i;
    public RecyclerView$SavedState A0j;
    public Runnable A0k;
    public List<RecyclerView.OnChildAttachStateChangeListener> A0l;
    public List<C4L> A0m;
    public boolean A0n;
    public boolean A0o;
    public final Rect A0p;
    public final RectF A0q;
    public final C4O A0r;
    public final C4V A0s;
    public final C02134g A0t;
    public final Runnable A0u;
    public final ArrayList<C4D> A0v;

    @VisibleForTesting
    public final List<C4Y> A0w;
    public final int A0x;
    public final int A0y;
    public final Rect A0z;
    public final AccessibilityManager A10;
    public final TC A11;
    public final InterfaceC02124f A12;
    public final ArrayList<C4K> A13;
    public final int[] A14;
    public final int[] A15;
    public final int[] A16;
    public final int[] A17;

    public static String A0H(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A18, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 14);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0V() {
        A18 = new byte[]{92, 95, Byte.MIN_VALUE, 49, 125, 114, -118, Byte.MIN_VALUE, -122, -123, 49, 126, 114, Byte.MAX_VALUE, 114, 120, 118, -125, 49, 114, -123, -123, 114, 116, 121, 118, 117, 76, 49, -124, 124, 122, -127, -127, 122, Byte.MAX_VALUE, 120, 49, 125, 114, -118, Byte.MIN_VALUE, -122, -123, -55, -25, -14, -14, -21, -22, -90, -8, -21, -13, -11, -4, -21, -54, -21, -6, -25, -23, -18, -21, -22, -36, -17, -21, -3, -90, -3, -17, -6, -18, -90, -25, -90, -4, -17, -21, -3, -90, -3, -18, -17, -23, -18, -90, -17, -7, -90, -12, -11, -6, -90, -20, -14, -25, -19, -19, -21, -22, -90, -25, -7, -90, -6, -13, -10, -90, -22, -21, -6, -25, -23, -18, -21, -22, -76, -75, -71, -125, -77, -60, -43, -41, -52, -60, -49, -84, -47, -39, -60, -49, -52, -57, -60, -41, -56, -55, -51, -105, -58, -27, -61, -40, -16, -26, -20, -21, -100, -22, -21, -16, -100, -30, -21, -15, -22, -32, -86, -100, -64, -27, -32, -100, -35, -22, -11, -100, -55, -21, -16, -27, -21, -22, -63, -14, -31, -22, -16, -17, -100, -29, -31, -16, -100, -17, -25, -27, -20, -20, -31, -32, -69, -64, -21, -100, -22, -21, -16, -100, -17, -31, -16, -56, -35, -11, -21, -15, -16, -62, -18, -21, -10, -31, -22, -100, -27, -22, -100, -24, -35, -11, -21, -15, -16, -100, -21, -18, -100, -17, -33, -18, -21, -24, -24, 120, -69, -71, -58, -58, -57, -52, 120, -70, -67, 120, -66, -57, -51, -58, -68, 120, -70, -51, -52, 120, -63, -52, 120, -63, -53, 120, -58, -67, -69, -67, -53, -53, -71, -54, -47, 120, -66, -57, -54, 120, -7, -21, -6, -39, -23, -8, -11, -14, -14, -17, -12, -19, -38, -11, -5, -23, -18, -39, -14, -11, -10, -82, -81, -64, -90, -24, -25, -22, -90, -25, -8, -19, -5, -13, -21, -12, -6, -90, -23, -11, -12, -7, -6, -25, -12, -6, -90, -87, -57, -44, -44, -43, -38, -122, -55, -57, -46, -46, -122, -38, -50, -49, -39, -122, -45, -53, -38, -50, -43, -54, -122, -49, -44, -122, -57, -122, -39, -55, -40, -43, -46, -46, -122, -55, -57, -46, -46, -56, -57, -55, -47, -108, -122, -71, -55, -40, -43, -46, -46, -122, -55, -57, -46, -46, -56, -57, -55, -47, -39, -122, -45, -49, -51, -50, -38, -56, -53, -122, -40, -37, -44, -122, -54, -37, -40, -49, -44, -51, -122, -57, -122, -45, -53, -57, -39, -37, -40, -53, -122, -116, -122, -46, -57, -33, -43, -37, -38, -122, -42, -57, -39, -39, -122, -35, -50, -53, -40, -53, -122, -33, -43, -37, -122, -55, -57, -44, -44, -43, -38, -122, -55, -50, -57, -44, -51, -53, -122, -38, -50, -53, -72, -53, -55, -33, -55, -46, -53, -40, -68, -49, -53, -35, -122, -54, -57, -38, -57, -108, -122, -89, -44, -33, -122, -45, -53, -38, -50, -43, -54, -122, -55, -57, -46, -46, -122, -38, -50, -57, -38, -122, -45, -49, -51, -50, -38, -122, -55, -50, -57, -44, -51, -53, -122, -38, -50, -53, -122, -39, -38, -40, -37, -55, -38, -37, -40, -53, -43, -52, -122, -38, -50, -53, -122, -72, -53, -55, -33, -55, -46, -53, -40, -68, -49, -53, -35, -122, -43, -40, -122, -38, -50, -53, -122, -57, -54, -57, -42, -38, -53, -40, -122, -55, -43, -44, -38, -53, -44, -38, -39, -122, -39, -50, -43, -37, -46, -54, -122, -56, -53, -122, -42, -43, -39, -38, -42, -43, -44, -53, -54, -122, -38, -43, -38, -50, -53, -122, -44, -53, -34, -38, -122, -52, -40, -57, -45, -53, -108, -118, 111, -60, -62, -72, -67, -74, 111, -77, -76, -75, -80, -60, -69, -61, 111, -59, -80, -69, -60, -76, -94, -73, -49, -59, -53, -54, -93, -73, -60, -73, -67, -69, -56, 118, -67, -22, -22, -25, -22, -104, -24, -22, -25, -37, -35, -21, -21, -31, -26, -33, -104, -21, -37, -22, -25, -28, -28, -77, -104, -24, -25, -31, -26, -20, -35, -22, -104, -31, -26, -36, -35, -16, -104, -34, -25, -22, -104, -31, -36, -104, -72, -53, -55, -33, -55, -46, -53, -40, -68, -49, -53, -35, -122, -54, -43, -53, -39, -122, -44, -43, -38, -122, -39, -37, -42, -42, -43, -40, -38, -122, -39, -55, -40, -43, -46, -46, -49, -44, -51, -122, -38, -43, -122, -57, -44, -122, -57, -56, -39, -43, -46, -37, -38, -53, -122, -42, -43, -39, -49, -38, -49, -43, -44, -108, -122, -69, -39, -53, -122, -39, -55, -40, -43, -46, -46, -70, -43, -74, -43, -39, -49, -38, -49, -43, -44, -122, -49, -44, -39, -38, -53, -57, -54, -86, -13, -3, -86, -21, -10, -4, -17, -21, -18, 3, -86, -21, -2, -2, -21, -19, -14, -17, -18, -86, -2, -7, -86, -21, -86, -36, -17, -19, 3, -19, -10, -17, -4, -32, -13, -17, 1, -60, -104, -71, 106, -85, -82, -85, -70, -66, -81, -68, 106, -85, -66, -66, -85, -83, -78, -81, -82, -123, 106, -67, -75, -77, -70, -70, -77, -72, -79, 106, -74, -85, -61, -71, -65, -66, -126, -107, -111, -93, 76, 82, 112, 125, 125, 126, -125, 47, -126, 114, -127, 126, 123, 123, 47, -122, 120, -125, 119, 126, -124, -125, 47, 112, 47, 91, 112, -120, 126, -124, -125, 92, 112, 125, 112, 118, 116, -127, 47, -126, 116, -125, 61, 47, 82, 112, 123, 123, 47, -126, 116, -125, 91, 112, -120, 126, -124, -125, 92, 112, 125, 112, 118, 116, -127, 47, -122, 120, -125, 119, 47, 112, 47, 125, 126, 125, 60, 125, -124, 123, 123, 47, 112, -127, 118, -124, 124, 116, 125, -125, 61, -82, -80, -80, -78, -64, -64, -74, -81, -74, -71, -74, -63, -58, 121, -100, -108, 69, -119, -114, -117, -117, -118, -105, -118, -109, -103, 69, 123, -114, -118, -100, 109, -108, -111, -119, -118, -105, -104, 69, -115, -122, -101, -118, 69, -103, -115, -118, 69, -104, -122, -110, 
        -118, 69, -120, -115, -122, -109, -116, -118, 69, 110, 105, 83, 69, 121, -115, -114, -104, 69, -110, -114, -116, -115, -103, 69, -115, -122, -107, -107, -118, -109, 69, -119, -102, -118, 69, -103, -108, 69, -114, -109, -120, -108, -109, -104, -114, -104, -103, -118, -109, -103, 69, 102, -119, -122, -107, -103, -118, -105, 69, -102, -107, -119, -122, -103, -118, 69, -118, -101, -118, -109, -103, -104, 69, -108, -105, 69, -114, -117, 69, -103, -115, -118, 69, 113, -122, -98, -108, -102, -103, 114, -122, -109, -122, -116, -118, -105, 69, -111, -122, -98, -104, 69, -108, -102, -103, 69, -103, -115, -118, 69, -104, -122, -110, -118, 69, 123, -114, -118, -100, 69, -110, -102, -111, -103, -114, -107, -111, -118, 69, -103, -114, -110, -118, -104, 83, 47, 69, 123, -114, -118, -100, 109, -108, -111, -119, -118, -105, 69, 86, 95, -112, -82, -69, -69, -68, -63, 109, -80, -82, -71, -71, 109, -63, -75, -74, -64, 109, -70, -78, -63, -75, -68, -79, 109, -60, -75, -74, -71, -78, 109, -97, -78, -80, -58, -80, -71, -78, -65, -93, -74, -78, -60, 109, -74, -64, 109, -80, -68, -70, -67, -62, -63, -74, -69, -76, 109, -82, 109, -71, -82, -58, -68, -62, -63, 109, -68, -65, 109, -64, -80, -65, -68, -71, -71, -74, -69, -76, -122, -117, -108, -121, -123, -106, -117, -111, -112, 66, -113, -105, -107, -106, 66, -124, -121, 66, -125, -124, -107, -111, -114, -105, -106, -121, 80, 66, -108, -121, -123, -121, -117, -104, -121, -122, 92, -103, -115, -48, -36, -37, -31, -46, -27, -31, -89, -106, -71, -79, 98, -90, -85, -88, -88, -89, -76, -89, -80, -74, 98, -104, -85, -89, -71, -118, -79, -82, -90, -89, -76, -75, 98, -86, -93, -72, -89, 98, -74, -86, -89, 98, -75, -93, -81, -89, 98, -75, -74, -93, -92, -82, -89, 98, -117, -122, 112, 98, -107, -74, -93, -92, -82, -89, 98, -117, -122, -75, 98, -85, -80, 98, -69, -79, -73, -76, 98, -93, -90, -93, -78, -74, -89, -76, 98, -113, -105, -107, -106, 98, -124, -121, 98, -73, -80, -85, -77, -73, -89, 98, -93, -80, -90, 98, -107, -118, -111, -105, -114, -122, 98, -112, -111, -106, 98, -91, -86, -93, -80, -87, -89, 112, 76, 98, -104, -85, -89, -71, -118, -79, -82, -90, -89, -76, 98, 115, 124, Byte.MAX_VALUE, -99, -86, -86, -85, -80, 92, -81, -87, -85, -85, -80, -92, 92, -81, -97, -82, -85, -88, -88, 92, -77, -91, -80, -92, -85, -79, -80, 92, -99, 92, -120, -99, -75, -85, -79, -80, -119, -99, -86, -99, -93, -95, -82, 92, -81, -95, -80, 106, 92, Byte.MAX_VALUE, -99, -88, -88, 92, -81, -95, -80, -120, -99, -75, -85, -79, -80, -119, -99, -86, -99, -93, -95, -82, 92, -77, -91, -80, -92, 92, -99, 92, -86, -85, -86, 105, -86, -79, -88, -88, 92, -99, -82, -93, -79, -87, -95, -86, -80, 106, Byte.MIN_VALUE, -124, 78, -127, -111, -96, -99, -102, -102, -56, -26, -13, -13, -12, -7, -91, -8, -24, -9, -12, -15, -15, -91, -7, -12, -91, -11, -12, -8, -18, -7, -18, -12, -13, -91, -26, -91, -47, -26, -2, -12, -6, -7, -46, -26, -13, -26, -20, -22, -9, -91, -8, -22, -7, -77, -91, -56, -26, -15, -15, -91, -8, -22, -7, -47, -26, -2, -12, -6, -7, -46, -26, -13, -26, -20, -22, -9, -91, -4, -18, -7, -19, -91, -26, -91, -13, -12, -13, -78, -13, -6, -15, -15, -91, -26, -9, -20, -6, -14, -22, -13, -7, -77, 109, -74, -64, 109, -69, -68, -63, 109, -82, 109, -79, -74, -65, -78, -80, -63, 109, -80, -75, -74, -71, -79, 109, -68, -77, 109, -93, -63, -50, -50, -49, -44, Byte.MIN_VALUE, -58, -52, -55, -50, -57, Byte.MIN_VALUE, -41, -55, -44, -56, -49, -43, -44, Byte.MIN_VALUE, -63, Byte.MIN_VALUE, -84, -63, -39, -49, -43, -44, -83, -63, -50, -63, -57, -59, -46, Byte.MIN_VALUE, -45, -59, -44, -114, Byte.MIN_VALUE, -93, -63, -52, -52, Byte.MIN_VALUE, -45, -59, -44, -84, -63, -39, -49, -43, -44, -83, -63, -50, -63, -57, -59, -46, Byte.MIN_VALUE, -41, -55, -44, -56, Byte.MIN_VALUE, -63, Byte.MIN_VALUE, -50, -49, -50, -115, -50, -43, -52, -52, Byte.MIN_VALUE, -63, -46, -57, -43, -51, -59, -50, -44, -114, -78, -90, -14, -25, -1, -11, -5, -6, -64, 104, 92, -99, -96, -99, -84, -80, -95, -82, 118, 119, 97, 119, -83, -64, -68, -50, 119, -97, -58, -61, -69, -68, -55, 119, -119, -111, -95, -76, -78, -56, -78, -69, -76, -63, -91, -72, -76, -58, 111, -73, -80, -62, 111, -67, -66, 111, -101, -80, -56, -66, -60, -61, -100, -80, -67, -80, -74, -76, -63, -56, -37, -39, -17, -39, -30, -37, -24, -52, -33, -37, -19, -33, -29, -83, -45, 2, -7, -7, -42, -5, 3, -18, -7, -10, -15, -18, 1, -14, -93, -59, -62, -75, -65, -72, -64, 115, -54, -69, -68, -65, -72, 115, -64, -76, -57, -74, -69, -68, -63, -70, 115, -74, -69, -76, -63, -70, -72, -73, 115, -55, -68, -72, -54, 115, -69, -62, -65, -73, -72, -59, -58, 115, -54, -68, -57, -69, 115, -57, -69, -72, 115, -63, -72, -54, -62, -63, -72, -58, -127, 115, -89, -69, -72, 115, -61, -59, -72, Byte.MIN_VALUE, -65, -76, -52, -62, -56, -57, 115, -68, -63, -71, -62, -59, -64, -76, -57, -68, -62, -63, 115, -71, -62, -59, 115, -57, -69, -72, 115, -74, -69, -76, -63, -70, -72, 115, -69, -62, -65, -73, -72, -59, 115};
    }

    static {
        A0V();
        A1H = new int[]{R.attr.nestedScrollingEnabled};
        A1G = new int[]{R.attr.clipToPadding};
        A1B = Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 20;
        A1A = Build.VERSION.SDK_INT >= 23;
        A1C = Build.VERSION.SDK_INT >= 16;
        A1D = Build.VERSION.SDK_INT >= 21;
        A1E = Build.VERSION.SDK_INT <= 15;
        A1F = Build.VERSION.SDK_INT <= 15;
        A1I = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        A19 = new Interpolator() { // from class: com.facebook.ads.redexgen.X.43
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
    }

    public C0452Eq(Context context) {
        this(context, null);
    }

    public C0452Eq(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0452Eq(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A11 = new TC(this);
        this.A0r = new C4O(this);
        this.A0t = new C02134g();
        this.A0u = new Runnable() { // from class: com.facebook.ads.redexgen.X.41
            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass41 anonymousClass41 = this;
                char c2 = anonymousClass41.A00.A0D ? (char) 2 : (char) 3;
                while (true) {
                    switch (c2) {
                        case 2:
                            anonymousClass41 = anonymousClass41;
                            if (!anonymousClass41.A00.isLayoutRequested()) {
                                c2 = 4;
                                break;
                            } else {
                                c2 = 3;
                                break;
                            }
                        case 3:
                            return;
                        case 4:
                            anonymousClass41 = anonymousClass41;
                            if (!anonymousClass41.A00.A0F) {
                                c2 = 5;
                                break;
                            } else {
                                c2 = 6;
                                break;
                            }
                        case 5:
                            anonymousClass41.A00.requestLayout();
                            return;
                        case 6:
                            anonymousClass41 = anonymousClass41;
                            if (!anonymousClass41.A00.A0I) {
                                c2 = '\b';
                                break;
                            } else {
                                c2 = 7;
                                break;
                            }
                        case 7:
                            anonymousClass41.A00.A0J = true;
                            return;
                        case '\b':
                            anonymousClass41.A00.A1H();
                            return;
                    }
                }
            }
        };
        this.A0p = new Rect();
        this.A0z = new Rect();
        this.A0q = new RectF();
        this.A0v = new ArrayList<>();
        this.A13 = new ArrayList<>();
        this.A0O = 0;
        this.A0C = false;
        this.A0U = 0;
        this.A0N = 0;
        this.A05 = new C0455Et();
        this.A0W = 0;
        this.A0V = -1;
        this.A0L = Float.MIN_VALUE;
        this.A0M = Float.MIN_VALUE;
        this.A0o = true;
        this.A08 = new C4X(this);
        this.A02 = A1D ? new C0814Sz() : null;
        this.A0s = new C4V();
        this.A0G = false;
        this.A0H = false;
        this.A0f = new T9(this);
        this.A0K = false;
        this.A14 = new int[2];
        this.A17 = new int[2];
        this.A16 = new int[2];
        this.A15 = new int[2];
        this.A0w = new ArrayList();
        this.A0k = new Runnable() { // from class: com.facebook.ads.redexgen.X.42
            @Override // java.lang.Runnable
            public final void run() {
                if (this.A00.A05 != null) {
                    this.A00.A05.A0H();
                }
                this.A00.A0K = false;
            }
        };
        this.A12 = new T6(this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1G, i, 0);
            this.A0B = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.A0B = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0X = viewConfiguration.getScaledTouchSlop();
        this.A0L = C01782w.A00(viewConfiguration, context);
        this.A0M = C01782w.A01(viewConfiguration, context);
        this.A0y = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A0x = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.A05.A09(this.A0f);
        A0d();
        A0N();
        if (C2v.A00(this) == 0) {
            C2v.A09(this, 1);
        }
        this.A10 = (AccessibilityManager) getContext().getSystemService(A0H(949, 13, 63));
        setAccessibilityDelegateCompat(new TG(this));
        setDescendantFocusability(262144);
        setNestedScrollingEnabled(true);
    }

    private int A09(View view) {
        int id = view.getId();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    view = view;
                    if (!view.isFocused()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 3:
                    view = view;
                    if (!(view instanceof ViewGroup)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    view = view;
                    if (!view.hasFocus()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    view = view;
                    id = view.getId();
                    c2 = 2;
                    break;
                case 7:
                    return id;
            }
        }
    }

    private final long A0A(C4Y c4y) {
        long jA0K = 0;
        char c2 = this.A04.A0A() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c4y = c4y;
                    jA0K = c4y.A0K();
                    c2 = 3;
                    break;
                case 3:
                    return jA0K;
                case 4:
                    c4y = c4y;
                    jA0K = c4y.A03;
                    c2 = 3;
                    break;
            }
        }
    }

    @Nullable
    private View A0B() {
        C0452Eq c0452Eq = this;
        C4Y c4yA0C = null;
        C4Y c4yA0C2 = null;
        int i = 0;
        int iA03 = 0;
        int i2 = 0;
        int iMin = 0;
        char c2 = c0452Eq.A0s.A01 != -1 ? (char) 2 : (char) 16;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    i = c0452Eq.A0s.A01;
                    c2 = 3;
                    break;
                case 3:
                    c0452Eq = c0452Eq;
                    iA03 = c0452Eq.A0s.A03();
                    i2 = i;
                    c2 = 4;
                    break;
                case 4:
                    if (i2 >= iA03) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0452Eq = c0452Eq;
                    c4yA0C = c0452Eq.A0C(i2);
                    if (c4yA0C != null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    iMin = Math.min(iA03, i) - 1;
                    c2 = 7;
                    break;
                case 7:
                    if (iMin < 0) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0452Eq = c0452Eq;
                    c4yA0C2 = c0452Eq.A0C(iMin);
                    if (c4yA0C2 != null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return (View) null;
                case '\n':
                    c4yA0C2 = c4yA0C2;
                    if (!c4yA0C2.A0H.hasFocusable()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return c4yA0C2.A0H;
                case '\f':
                    iMin--;
                    c2 = 7;
                    break;
                case '\r':
                    c4yA0C = c4yA0C;
                    if (!c4yA0C.A0H.hasFocusable()) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    return c4yA0C.A0H;
                case 15:
                    i2++;
                    c2 = 4;
                    break;
                case 16:
                    i = 0;
                    c2 = 3;
                    break;
                case 17:
                    return (View) null;
            }
        }
    }

    private final C4Y A0C(int i) {
        C0452Eq c0452Eq = this;
        C4Y c4y = null;
        C4Y c4yA0E = null;
        int i2 = 0;
        int iA06 = 0;
        char c2 = c0452Eq.A0C ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (C4Y) null;
                case 3:
                    c0452Eq = c0452Eq;
                    iA06 = c0452Eq.A01.A06();
                    c4y = null;
                    i2 = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i2 >= iA06) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0452Eq = c0452Eq;
                    c4yA0E = A0E(c0452Eq.A01.A0A(i2));
                    if (c4yA0E == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0c()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case 7:
                    c0452Eq = c0452Eq;
                    c4yA0E = c4yA0E;
                    if (c0452Eq.A1B(c4yA0E) != i) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0452Eq = c0452Eq;
                    c4yA0E = c4yA0E;
                    if (!c0452Eq.A01.A0K(c4yA0E.A0H)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c4yA0E = c4yA0E;
                    c4y = c4yA0E;
                    c2 = '\n';
                    break;
                case '\n':
                    i2++;
                    c2 = 4;
                    break;
                case 11:
                    return c4yA0E;
                case '\f':
                    return c4y;
            }
        }
    }

    private final C4Y A0D(long j) {
        C0452Eq c0452Eq = this;
        C4Y holder = null;
        int iA06 = 0;
        int i = 0;
        C4Y c4yA0E = null;
        AnonymousClass44 anonymousClass44 = c0452Eq.A04;
        char c2 = anonymousClass44 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass44 = anonymousClass44;
                    if (!anonymousClass44.A0A()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return (C4Y) null;
                case 4:
                    c0452Eq = c0452Eq;
                    iA06 = c0452Eq.A01.A06();
                    holder = null;
                    i = 0;
                    c2 = 5;
                    break;
                case 5:
                    if (i >= iA06) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    c4yA0E = A0E(c0452Eq.A01.A0A(i));
                    if (c4yA0E == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0c()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case '\b':
                    c4yA0E = c4yA0E;
                    if (c4yA0E.A0K() != j) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0452Eq = c0452Eq;
                    c4yA0E = c4yA0E;
                    if (!c0452Eq.A01.A0K(c4yA0E.A0H)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c4yA0E = c4yA0E;
                    holder = c4yA0E;
                    c2 = 11;
                    break;
                case 11:
                    i++;
                    c2 = 5;
                    break;
                case '\f':
                    return c4yA0E;
                case '\r':
                    return holder;
            }
        }
    }

    public static C4Y A0E(View view) {
        if (view == null) {
            return null;
        }
        return ((C4H) view.getLayoutParams()).A00;
    }

    @Nullable
    private final C4Y A0F(View view) {
        C0452Eq c0452Eq = this;
        C4Y c4yA1F = null;
        View viewA1D = c0452Eq.A1D(view);
        char c2 = viewA1D == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c4yA1F = null;
                    c2 = 3;
                    break;
                case 3:
                    return c4yA1F;
                case 4:
                    c0452Eq = c0452Eq;
                    viewA1D = viewA1D;
                    c4yA1F = c0452Eq.A1F(viewA1D);
                    c2 = 3;
                    break;
            }
        }
    }

    @Nullable
    public static C0452Eq A0G(@NonNull View view) {
        C0452Eq c0452EqA0G = null;
        int i = 0;
        int i2 = 0;
        ViewGroup viewGroup = null;
        char c2 = !(view instanceof ViewGroup) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (C0452Eq) null;
                case 3:
                    view = view;
                    if (!(view instanceof C0452Eq)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    ViewGroup parent = view;
                    return (C0452Eq) parent;
                case 5:
                    view = view;
                    viewGroup = (ViewGroup) view;
                    i = viewGroup.getChildCount();
                    i2 = 0;
                    c2 = 6;
                    break;
                case 6:
                    if (i2 >= i) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    viewGroup = viewGroup;
                    c0452EqA0G = A0G(viewGroup.getChildAt(i2));
                    if (c0452EqA0G == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return c0452EqA0G;
                case '\t':
                    i2++;
                    c2 = 6;
                    break;
                case '\n':
                    return (C0452Eq) null;
            }
        }
    }

    private void A0I() {
        A0S();
        setScrollState(0);
    }

    private void A0J() {
        C0452Eq c0452Eq = this;
        int i = c0452Eq.A0P;
        c0452Eq.A0P = 0;
        char c2 = i != 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A1q()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    C3E.A01(accessibilityEventObtain, i);
                    c0452Eq.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A0K() {
        C0452Eq c0452Eq = this;
        C4B c4bA07 = null;
        boolean zA0k = false;
        int iA00 = 0;
        C4Y c4yA0E = null;
        int i = 0;
        C4Y c4yA0E2 = null;
        int iA05 = 0;
        int i2 = 0;
        boolean z = true;
        c0452Eq.A0s.A04(1);
        c0452Eq.A1j(c0452Eq.A0s);
        c0452Eq.A0s.A0A = false;
        c0452Eq.A1I();
        c0452Eq.A0t.A06();
        c0452Eq.A1J();
        c0452Eq.A0O();
        c0452Eq.A0T();
        C4V c4v = c0452Eq.A0s;
        char c2 = c4v.A0C ? (char) 2 : (char) 16;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0H) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    c4v = c4v;
                    c4v.A0E = z;
                    c0452Eq.A0H = false;
                    c0452Eq.A0G = false;
                    C4V c4v2 = c0452Eq.A0s;
                    c4v2.A09 = c4v2.A0B;
                    c0452Eq.A0s.A03 = c0452Eq.A04.A0D();
                    c0452Eq.A0w(c0452Eq.A14);
                    if (!c0452Eq.A0s.A0C) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    iA05 = c0452Eq.A01.A05();
                    i2 = 0;
                    c2 = 5;
                    break;
                case 5:
                    if (i2 >= iA05) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    c4yA0E = A0E(c0452Eq.A01.A09(i2));
                    if (!c4yA0E.A0h()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 7:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0b()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A04.A0A()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\t':
                    i2++;
                    c2 = 5;
                    break;
                case '\n':
                    c0452Eq = c0452Eq;
                    c4yA0E = c4yA0E;
                    c0452Eq.A0t.A0F(c4yA0E, c0452Eq.A05.A07(c0452Eq.A0s, c4yA0E, C4C.A00(c4yA0E), c4yA0E.A0L()));
                    if (!c0452Eq.A0s.A0E) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0f()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0c()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\r':
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0h()) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 14:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0b()) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 15:
                    c0452Eq = c0452Eq;
                    c4yA0E = c4yA0E;
                    c0452Eq.A0t.A08(c0452Eq.A0A(c4yA0E), c4yA0E);
                    c2 = '\t';
                    break;
                case 16:
                    z = false;
                    c2 = 3;
                    break;
                case 17:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0s.A0B) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0h();
                    boolean z2 = c0452Eq.A0s.A0D;
                    C4V c4v3 = c0452Eq.A0s;
                    c4v3.A0D = false;
                    c0452Eq.A06.A1y(c0452Eq.A0r, c4v3);
                    c0452Eq.A0s.A0D = z2;
                    i = 0;
                    c2 = 19;
                    break;
                case 19:
                    c0452Eq = c0452Eq;
                    if (i >= c0452Eq.A01.A05()) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c0452Eq = c0452Eq;
                    c4yA0E2 = A0E(c0452Eq.A01.A09(i));
                    if (!c4yA0E2.A0h()) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    i++;
                    c2 = 19;
                    break;
                case 22:
                    c0452Eq = c0452Eq;
                    c4yA0E2 = c4yA0E2;
                    if (!c0452Eq.A0t.A0I(c4yA0E2)) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 23:
                    c4yA0E2 = c4yA0E2;
                    iA00 = C4C.A00(c4yA0E2);
                    zA0k = c4yA0E2.A0k(8192);
                    if (!zA0k) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 24:
                    iA00 |= 4096;
                    c2 = 25;
                    break;
                case 25:
                    c0452Eq = c0452Eq;
                    c4yA0E2 = c4yA0E2;
                    c4bA07 = c0452Eq.A05.A07(c0452Eq.A0s, c4yA0E2, iA00, c4yA0E2.A0L());
                    if (!zA0k) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    c0452Eq = c0452Eq;
                    c4yA0E2 = c4yA0E2;
                    c4bA07 = c4bA07;
                    c0452Eq.A1k(c4yA0E2, c4bA07);
                    c2 = 21;
                    break;
                case 27:
                    c0452Eq = c0452Eq;
                    c4yA0E2 = c4yA0E2;
                    c4bA07 = c4bA07;
                    c0452Eq.A0t.A0D(c4yA0E2, c4bA07);
                    c2 = 21;
                    break;
                case 28:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0W();
                    c2 = 30;
                    break;
                case 29:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0W();
                    c2 = 30;
                    break;
                case 30:
                    C0452Eq c0452Eq2 = c0452Eq;
                    c0452Eq2.A1K();
                    c0452Eq2.A1p(false);
                    c0452Eq2.A0s.A04 = 2;
                    return;
            }
        }
    }

    private void A0L() {
        C0452Eq c0452Eq = this;
        boolean z = false;
        c0452Eq.A1I();
        c0452Eq.A1J();
        c0452Eq.A0s.A04(6);
        c0452Eq.A00.A0G();
        c0452Eq.A0s.A03 = c0452Eq.A04.A0D();
        C4V c4v = c0452Eq.A0s;
        c4v.A00 = 0;
        c4v.A09 = false;
        c0452Eq.A06.A1y(c0452Eq.A0r, c4v);
        C4V c4v2 = c0452Eq.A0s;
        c4v2.A0D = false;
        c0452Eq.A0j = null;
        char c2 = c4v2.A0C ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A05 == null) {
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
                    C0452Eq c0452Eq2 = c0452Eq;
                    c4v2.A0C = z;
                    c0452Eq2.A0s.A04 = 4;
                    c0452Eq2.A1K();
                    c0452Eq2.A1p(false);
                    return;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    private void A0M() {
        C0452Eq c0452Eq = this;
        C4B c4bA04 = null;
        boolean zA0H = false;
        boolean zA0H2 = false;
        C4B c4bA03 = null;
        long jA0A = 0;
        C4B c4bA06 = null;
        int iA05 = 0;
        boolean z = false;
        C4Y c4yA0E = null;
        C4Y c4yA05 = null;
        C0452Eq c0452Eq2 = c0452Eq;
        c0452Eq2.A0s.A04(4);
        c0452Eq.A1I();
        c0452Eq.A1J();
        C4V c4v = c0452Eq2.A0s;
        c4v.A04 = 1;
        int i = c4v.A0C ? 2 : 16;
        while (true) {
            switch (i) {
                case 2:
                    c0452Eq2 = c0452Eq2;
                    iA05 = c0452Eq2.A01.A05() - 1;
                    i = 3;
                    break;
                case 3:
                    if (iA05 < 0) {
                        i = 15;
                        break;
                    } else {
                        i = 4;
                        break;
                    }
                case 4:
                    c0452Eq2 = c0452Eq2;
                    c4yA0E = A0E(c0452Eq2.A01.A09(iA05));
                    if (!c4yA0E.A0h()) {
                        i = 6;
                        break;
                    } else {
                        i = 5;
                        break;
                    }
                case 5:
                    iA05--;
                    i = 3;
                    break;
                case 6:
                    c0452Eq2 = c0452Eq2;
                    c4yA0E = c4yA0E;
                    jA0A = c0452Eq2.A0A(c4yA0E);
                    c4bA06 = c0452Eq2.A05.A06(c0452Eq2.A0s, c4yA0E);
                    c4yA05 = c0452Eq2.A0t.A05(jA0A);
                    if (c4yA05 == null) {
                        i = 14;
                        break;
                    } else {
                        i = 7;
                        break;
                    }
                case 7:
                    c4yA05 = c4yA05;
                    if (!c4yA05.A0h()) {
                        i = 8;
                        break;
                    } else {
                        i = 14;
                        break;
                    }
                case 8:
                    c0452Eq2 = c0452Eq2;
                    c4yA0E = c4yA0E;
                    c4yA05 = c4yA05;
                    zA0H2 = c0452Eq2.A0t.A0H(c4yA05);
                    zA0H = c0452Eq2.A0t.A0H(c4yA0E);
                    if (!zA0H2) {
                        i = 11;
                        break;
                    } else {
                        i = 9;
                        break;
                    }
                case 9:
                    c4yA0E = c4yA0E;
                    c4yA05 = c4yA05;
                    if (c4yA05 != c4yA0E) {
                        i = 11;
                        break;
                    } else {
                        i = 10;
                        break;
                    }
                case 10:
                    c0452Eq2 = c0452Eq2;
                    c4yA0E = c4yA0E;
                    c4bA06 = c4bA06;
                    c0452Eq2.A0t.A0E(c4yA0E, c4bA06);
                    i = 5;
                    break;
                case 11:
                    c0452Eq2 = c0452Eq2;
                    c4yA0E = c4yA0E;
                    c4bA06 = c4bA06;
                    c4yA05 = c4yA05;
                    c4bA04 = c0452Eq2.A0t.A04(c4yA05);
                    c0452Eq2.A0t.A0E(c4yA0E, c4bA06);
                    c4bA03 = c0452Eq2.A0t.A03(c4yA0E);
                    if (c4bA04 != null) {
                        i = 13;
                        break;
                    } else {
                        i = 12;
                        break;
                    }
                case 12:
                    c0452Eq2 = c0452Eq2;
                    c4yA0E = c4yA0E;
                    c4yA05 = c4yA05;
                    c0452Eq2.A0l(jA0A, c4yA0E, c4yA05);
                    i = 5;
                    break;
                case 13:
                    c0452Eq = c0452Eq;
                    c4yA0E = c4yA0E;
                    c4yA05 = c4yA05;
                    c4bA04 = c4bA04;
                    c4bA03 = c4bA03;
                    c0452Eq.A0s(c4yA05, c4yA0E, c4bA04, c4bA03, zA0H2, zA0H);
                    i = 5;
                    break;
                case 14:
                    c0452Eq2 = c0452Eq2;
                    c4yA0E = c4yA0E;
                    c4bA06 = c4bA06;
                    c0452Eq2.A0t.A0E(c4yA0E, c4bA06);
                    i = 5;
                    break;
                case 15:
                    c0452Eq2 = c0452Eq2;
                    c0452Eq2.A0t.A0G(c0452Eq2.A12);
                    i = 16;
                    break;
                case 16:
                    c0452Eq2 = c0452Eq2;
                    c0452Eq2.A06.A1G(c0452Eq2.A0r);
                    C4V c4v2 = c0452Eq2.A0s;
                    c4v2.A05 = c4v2.A03;
                    z = false;
                    z = false;
                    c0452Eq2.A0C = false;
                    C4V c4v3 = c0452Eq2.A0s;
                    c4v3.A0C = false;
                    c4v3.A0B = false;
                    c0452Eq2.A06.A09 = false;
                    if (c0452Eq2.A0r.A02 == null) {
                        i = 18;
                        break;
                    } else {
                        i = 17;
                        break;
                    }
                case 17:
                    c0452Eq2 = c0452Eq2;
                    c0452Eq2.A0r.A02.clear();
                    i = 18;
                    break;
                case 18:
                    c0452Eq2 = c0452Eq2;
                    if (!c0452Eq2.A06.A08) {
                        i = 20;
                        break;
                    } else {
                        i = 19;
                        break;
                    }
                case 19:
                    c0452Eq2 = c0452Eq2;
                    C4G c4g = c0452Eq2.A06;
                    c4g.A00 = z ? 1 : 0;
                    c4g.A08 = z;
                    c0452Eq2.A0r.A0O();
                    i = 20;
                    break;
                case 20:
                    c0452Eq = c0452Eq;
                    c0452Eq2 = c0452Eq2;
                    c0452Eq2.A06.A1z(c0452Eq2.A0s);
                    c0452Eq.A1K();
                    c0452Eq2.A1p(z);
                    c0452Eq2.A0t.A06();
                    int[] iArr = c0452Eq2.A14;
                    if (!c0452Eq2.A10(iArr[z ? 1 : 0], iArr[1])) {
                        i = 22;
                        break;
                    } else {
                        i = 21;
                        break;
                    }
                case 21:
                    c0452Eq2 = c0452Eq2;
                    c0452Eq2.A1Z(z ? 1 : 0, z ? 1 : 0);
                    i = 22;
                    break;
                case 22:
                    C0452Eq c0452Eq3 = c0452Eq;
                    c0452Eq3.A0P();
                    c0452Eq3.A0R();
                    return;
            }
        }
    }

    private void A0N() {
        this.A01 = new C01863e(new T7(this));
    }

    private void A0O() {
        C0452Eq c0452Eq = this;
        C4V c4v = null;
        boolean z = false;
        C4V c4v2 = null;
        boolean z2 = false;
        boolean z3 = false;
        char c2 = c0452Eq.A0C ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    c0452Eq.A00.A0I();
                    c0452Eq.A06.A1M(c0452Eq);
                    c2 = 3;
                    break;
                case 3:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0y()) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    c0452Eq.A00.A0H();
                    c2 = 5;
                    break;
                case 5:
                    c0452Eq = c0452Eq;
                    z2 = false;
                    if (!c0452Eq.A0G) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0H) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    z3 = true;
                    c2 = '\b';
                    break;
                case '\b':
                    c0452Eq = c0452Eq;
                    c4v2 = c0452Eq.A0s;
                    if (!c0452Eq.A0D) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A05 == null) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0C) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case 11:
                    if (!z3) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\f':
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A06.A09) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0C) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A04.A0A()) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    z = true;
                    c2 = 16;
                    break;
                case 16:
                    c0452Eq = c0452Eq;
                    c4v2 = c4v2;
                    c4v2.A0C = z;
                    c4v = c0452Eq.A0s;
                    if (!c4v.A0C) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    if (!z3) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0C) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 19:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0y()) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    z2 = true;
                    c2 = 21;
                    break;
                case 21:
                    c4v.A0B = z2;
                    return;
                case 22:
                    z = false;
                    c2 = 16;
                    break;
                case 23:
                    z3 = false;
                    c2 = '\b';
                    break;
                case 24:
                    c0452Eq = c0452Eq;
                    c0452Eq.A00.A0G();
                    c2 = 5;
                    break;
            }
        }
    }

    private void A0P() {
        C0452Eq c0452Eq = this;
        long j = 0;
        View viewA0B = null;
        C4Y c4yA0D = null;
        View viewFindViewById = null;
        View focusedChild = null;
        char c2 = c0452Eq.A0o ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A04 == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.hasFocus()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.getDescendantFocusability() == 393216) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.getDescendantFocusability() != 131072) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.isFocused()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return;
                case '\b':
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.isFocused()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case '\t':
                    c0452Eq = c0452Eq;
                    focusedChild = c0452Eq.getFocusedChild();
                    if (!A1F) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    focusedChild = focusedChild;
                    if (focusedChild.getParent() == null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    focusedChild = focusedChild;
                    if (!focusedChild.hasFocus()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case '\f':
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A01.A05() != 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c0452Eq.requestFocus();
                    return;
                case 14:
                    c0452Eq = c0452Eq;
                    focusedChild = focusedChild;
                    if (!c0452Eq.A01.A0K(focusedChild)) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 15:
                    return;
                case 16:
                    c0452Eq = c0452Eq;
                    c4yA0D = null;
                    j = -1;
                    if (c0452Eq.A0s.A08 == -1) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A04.A0A()) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c0452Eq = c0452Eq;
                    c4yA0D = c0452Eq.A0D(c0452Eq.A0s.A08);
                    c2 = 19;
                    break;
                case 19:
                    viewA0B = null;
                    if (c4yA0D == null) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A01.A0K(c4yA0D.A0H)) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 21:
                    if (!c4yA0D.A0H.hasFocusable()) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 31;
                        break;
                    }
                case 22:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A01.A05() <= 0) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    c0452Eq = c0452Eq;
                    viewA0B = c0452Eq.A0B();
                    c2 = 24;
                    break;
                case 24:
                    if (viewA0B == null) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A0s.A02 == j) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    c0452Eq = c0452Eq;
                    viewFindViewById = viewA0B.findViewById(c0452Eq.A0s.A02);
                    if (viewFindViewById == null) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    viewFindViewById = viewFindViewById;
                    if (!viewFindViewById.isFocusable()) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    viewFindViewById = viewFindViewById;
                    viewA0B = viewFindViewById;
                    c2 = 29;
                    break;
                case 29:
                    viewA0B.requestFocus();
                    c2 = 30;
                    break;
                case 30:
                    return;
                case 31:
                    viewA0B = c4yA0D.A0H;
                    c2 = 24;
                    break;
            }
        }
    }

    private void A0Q() {
        C0452Eq c0452Eq = this;
        EdgeEffect edgeEffect = null;
        EdgeEffect edgeEffect2 = null;
        EdgeEffect edgeEffect3 = null;
        boolean zIsFinished = false;
        EdgeEffect edgeEffect4 = c0452Eq.A0a;
        char c2 = edgeEffect4 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    edgeEffect4 = edgeEffect4;
                    edgeEffect4.onRelease();
                    zIsFinished = c0452Eq.A0a.isFinished();
                    c2 = 3;
                    break;
                case 3:
                    c0452Eq = c0452Eq;
                    edgeEffect2 = c0452Eq.A0c;
                    if (edgeEffect2 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    edgeEffect2 = edgeEffect2;
                    edgeEffect2.onRelease();
                    zIsFinished |= c0452Eq.A0c.isFinished();
                    c2 = 5;
                    break;
                case 5:
                    c0452Eq = c0452Eq;
                    edgeEffect3 = c0452Eq.A0b;
                    if (edgeEffect3 == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    edgeEffect3 = edgeEffect3;
                    edgeEffect3.onRelease();
                    zIsFinished |= c0452Eq.A0b.isFinished();
                    c2 = 7;
                    break;
                case 7:
                    c0452Eq = c0452Eq;
                    edgeEffect = c0452Eq.A0Z;
                    if (edgeEffect == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0452Eq = c0452Eq;
                    edgeEffect = edgeEffect;
                    edgeEffect.onRelease();
                    zIsFinished |= c0452Eq.A0Z.isFinished();
                    c2 = '\t';
                    break;
                case '\t':
                    if (!zIsFinished) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c0452Eq = c0452Eq;
                    C2v.A07(c0452Eq);
                    c2 = 11;
                    break;
                case 11:
                    return;
            }
        }
    }

    private void A0R() {
        C4V c4v = this.A0s;
        c4v.A08 = -1L;
        c4v.A01 = -1;
        c4v.A02 = -1;
    }

    private void A0S() {
        VelocityTracker velocityTracker = this.A0Y;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        A1V(0);
        A0Q();
    }

    private void A0T() {
        C0452Eq c0452Eq = this;
        int iA0G = 0;
        C4Y c4yA0F = null;
        C4V c4v = null;
        long jA0K = 0;
        C4V c4v2 = null;
        View focusedChild = null;
        char c2 = c0452Eq.A0o ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.hasFocus()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A04 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    focusedChild = c0452Eq.getFocusedChild();
                    c2 = 5;
                    break;
                case 5:
                    if (focusedChild != null) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c4yA0F = null;
                    c2 = 7;
                    break;
                case 7:
                    if (c4yA0F != null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0452Eq = c0452Eq;
                    c0452Eq.A0R();
                    c2 = '\t';
                    break;
                case '\t':
                    return;
                case '\n':
                    c0452Eq = c0452Eq;
                    c4v = c0452Eq.A0s;
                    if (!c0452Eq.A04.A0A()) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    jA0K = c4yA0F.A0K();
                    c2 = '\f';
                    break;
                case '\f':
                    c0452Eq = c0452Eq;
                    c4v = c4v;
                    c4v.A08 = jA0K;
                    c4v2 = c0452Eq.A0s;
                    if (!c0452Eq.A0C) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    iA0G = -1;
                    c2 = 14;
                    break;
                case 14:
                    c0452Eq = c0452Eq;
                    c4v2 = c4v2;
                    c4v2.A01 = iA0G;
                    c0452Eq.A0s.A02 = c0452Eq.A09(c4yA0F.A0H);
                    c2 = '\t';
                    break;
                case 15:
                    if (!c4yA0F.A0c()) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    iA0G = c4yA0F.A01;
                    c2 = 14;
                    break;
                case 17:
                    iA0G = c4yA0F.A0G();
                    c2 = 14;
                    break;
                case 18:
                    jA0K = -1;
                    c2 = '\f';
                    break;
                case 19:
                    c0452Eq = c0452Eq;
                    c4yA0F = c0452Eq.A0F(focusedChild);
                    c2 = 7;
                    break;
            }
        }
    }

    private void A0U() {
        this.A08.A08();
        C4G c4g = this.A06;
        if (c4g != null) {
            c4g.A0x();
        }
    }

    private final void A0W() {
        C0452Eq c0452Eq = this;
        C4Y holder = null;
        int iA06 = c0452Eq.A01.A06();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= iA06) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    holder = A0E(c0452Eq.A01.A0A(i));
                    if (!holder.A0h()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    holder = holder;
                    holder.A0M();
                    c2 = 5;
                    break;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    c0452Eq.A0r.A0K();
                    return;
            }
        }
    }

    private final void A0X() {
        C0452Eq c0452Eq = this;
        AnonymousClass44 anonymousClass44 = c0452Eq.A04;
        String strA0H = A0H(1788, 12, 104);
        char c2 = anonymousClass44 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    Log.e(strA0H, A0H(818, 36, 60));
                    return;
                case 3:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A06 != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    Log.e(strA0H, A0H(1, 43, 3));
                    return;
                case 5:
                    c0452Eq = c0452Eq;
                    C4V c4v = c0452Eq.A0s;
                    c4v.A0A = false;
                    if (c4v.A04 != 1) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0K();
                    c0452Eq.A06.A1O(c0452Eq);
                    c0452Eq.A0L();
                    c2 = 7;
                    break;
                case 7:
                    c0452Eq.A0M();
                    return;
                case '\b':
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A00.A0K()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case '\t':
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A06.A0h() != c0452Eq.getWidth()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A06.A0X() == c0452Eq.getHeight()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0452Eq = c0452Eq;
                    c0452Eq.A06.A1O(c0452Eq);
                    c0452Eq.A0L();
                    c2 = 7;
                    break;
                case '\f':
                    c0452Eq = c0452Eq;
                    c0452Eq.A06.A1O(c0452Eq);
                    c2 = 7;
                    break;
            }
        }
    }

    private final void A0Y() {
        C0452Eq c0452Eq = this;
        int i = 0;
        C4Y c4y = null;
        int i2 = 0;
        int size = c0452Eq.A0w.size() - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (size < 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    c4y = c0452Eq.A0w.get(size);
                    if (c4y.A0H.getParent() != c0452Eq) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4y = c4y;
                    if (!c4y.A0h()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    size--;
                    c2 = 2;
                    break;
                case 6:
                    c4y = c4y;
                    i2 = c4y.A02;
                    i = -1;
                    if (i2 == -1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c4y = c4y;
                    C2v.A09(c4y.A0H, i2);
                    c4y.A02 = i;
                    c2 = 5;
                    break;
                case '\b':
                    c0452Eq.A0w.clear();
                    return;
            }
        }
    }

    private final void A0Z() {
        C0452Eq c0452Eq = this;
        char c2 = c0452Eq.A0Z != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0Z = new EdgeEffect(c0452Eq.getContext());
                    if (!c0452Eq.A0B) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0Z.setSize((c0452Eq.getMeasuredWidth() - c0452Eq.getPaddingLeft()) - c0452Eq.getPaddingRight(), (c0452Eq.getMeasuredHeight() - c0452Eq.getPaddingTop()) - c0452Eq.getPaddingBottom());
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0Z.setSize(c0452Eq.getMeasuredWidth(), c0452Eq.getMeasuredHeight());
                    c2 = 5;
                    break;
            }
        }
    }

    private final void A0a() {
        C0452Eq c0452Eq = this;
        char c2 = c0452Eq.A0a != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0a = new EdgeEffect(c0452Eq.getContext());
                    if (!c0452Eq.A0B) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0a.setSize((c0452Eq.getMeasuredHeight() - c0452Eq.getPaddingTop()) - c0452Eq.getPaddingBottom(), (c0452Eq.getMeasuredWidth() - c0452Eq.getPaddingLeft()) - c0452Eq.getPaddingRight());
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0a.setSize(c0452Eq.getMeasuredHeight(), c0452Eq.getMeasuredWidth());
                    c2 = 5;
                    break;
            }
        }
    }

    private final void A0b() {
        C0452Eq c0452Eq = this;
        char c2 = c0452Eq.A0b != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0b = new EdgeEffect(c0452Eq.getContext());
                    if (!c0452Eq.A0B) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0b.setSize((c0452Eq.getMeasuredHeight() - c0452Eq.getPaddingTop()) - c0452Eq.getPaddingBottom(), (c0452Eq.getMeasuredWidth() - c0452Eq.getPaddingLeft()) - c0452Eq.getPaddingRight());
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0b.setSize(c0452Eq.getMeasuredHeight(), c0452Eq.getMeasuredWidth());
                    c2 = 5;
                    break;
            }
        }
    }

    private final void A0c() {
        C0452Eq c0452Eq = this;
        char c2 = c0452Eq.A0c != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0c = new EdgeEffect(c0452Eq.getContext());
                    if (!c0452Eq.A0B) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0c.setSize((c0452Eq.getMeasuredWidth() - c0452Eq.getPaddingLeft()) - c0452Eq.getPaddingRight(), (c0452Eq.getMeasuredHeight() - c0452Eq.getPaddingTop()) - c0452Eq.getPaddingBottom());
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0c.setSize(c0452Eq.getMeasuredWidth(), c0452Eq.getMeasuredHeight());
                    c2 = 5;
                    break;
            }
        }
    }

    private final void A0d() {
        this.A00 = new C0813Sy(new T8(this));
    }

    private final void A0e() {
        this.A0Z = null;
        this.A0c = null;
        this.A0b = null;
        this.A0a = null;
    }

    private final void A0f() {
        C0452Eq c0452Eq = this;
        int iA06 = c0452Eq.A01.A06();
        int i = 0;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    if (i >= iA06) {
                        i2 = 4;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    View child = c0452Eq.A01.A0A(i);
                    ((C4H) child.getLayoutParams()).A01 = true;
                    i++;
                    i2 = 2;
                    break;
                case 4:
                    c0452Eq.A0r.A0M();
                    return;
            }
        }
    }

    private final void A0g() {
        C0452Eq c0452Eq = this;
        C4Y holder = null;
        int iA06 = c0452Eq.A01.A06();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= iA06) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    holder = A0E(c0452Eq.A01.A0A(i));
                    if (holder == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    holder = holder;
                    if (!holder.A0h()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    holder = holder;
                    holder.A0T(6);
                    c2 = 6;
                    break;
                case 6:
                    i++;
                    c2 = 2;
                    break;
                case 7:
                    C0452Eq c0452Eq2 = c0452Eq;
                    c0452Eq2.A0f();
                    c0452Eq2.A0r.A0N();
                    return;
            }
        }
    }

    private final void A0h() {
        C0452Eq c0452Eq = this;
        C4Y holder = null;
        int iA06 = c0452Eq.A01.A06();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= iA06) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    holder = A0E(c0452Eq.A01.A0A(i));
                    if (!holder.A0h()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    holder = holder;
                    holder.A0R();
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

    private void A0i(float f, float f2, float f3, float f4) {
        C0452Eq c0452Eq = this;
        boolean z = false;
        char c2 = f2 < 0.0f ? (char) 2 : '\f';
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0a();
                    C3V.A00(c0452Eq.A0a, (-f2) / c0452Eq.getWidth(), 1.0f - (f3 / c0452Eq.getHeight()));
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    if (f4 >= 0.0f) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0c();
                    C3V.A00(c0452Eq.A0c, (-f4) / c0452Eq.getHeight(), f / c0452Eq.getWidth());
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 6:
                    if (f2 != 0.0f) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (f4 == 0.0f) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0452Eq = c0452Eq;
                    C2v.A07(c0452Eq);
                    c2 = '\t';
                    break;
                case '\t':
                    return;
                case '\n':
                    if (f4 <= 0.0f) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0Z();
                    C3V.A00(c0452Eq.A0Z, f4 / c0452Eq.getHeight(), 1.0f - (f / c0452Eq.getWidth()));
                    z = true;
                    c2 = 5;
                    break;
                case '\f':
                    if (f2 <= 0.0f) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c0452Eq = c0452Eq;
                    c0452Eq.A0b();
                    C3V.A00(c0452Eq.A0b, f2 / c0452Eq.getWidth(), f3 / c0452Eq.getHeight());
                    z = true;
                    c2 = 3;
                    break;
            }
        }
    }

    private final void A0j(int i) {
        C0452Eq c0452Eq = this;
        int size = 0;
        List<C4L> list = null;
        C4L c4l = null;
        char c2 = c0452Eq.A06 != null ? (char) 2 : (char) 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    c4l = c0452Eq.A0i;
                    if (c4l == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    c4l = c4l;
                    c4l.A0U(c0452Eq, i);
                    c2 = 4;
                    break;
                case 4:
                    c0452Eq = c0452Eq;
                    list = c0452Eq.A0m;
                    if (list == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    list = list;
                    size = list.size() - 1;
                    c2 = 6;
                    break;
                case 6:
                    if (size < 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0m.get(size).A0U(c0452Eq, i);
                    size--;
                    c2 = 6;
                    break;
                case '\b':
                    return;
            }
        }
    }

    private final void A0k(int i, int i2, Interpolator interpolator) {
        C0452Eq c0452Eq = this;
        C4G c4g = c0452Eq.A06;
        char c2 = c4g == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    Log.e(A0H(1788, 12, 104), A0H(1404, 97, 46));
                    return;
                case 3:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0I) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    c4g = c4g;
                    if (!c4g.A24()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    i = 0;
                    c2 = 7;
                    break;
                case 7:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A06.A25()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    i2 = 0;
                    c2 = '\t';
                    break;
                case '\t':
                    if (i != 0) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (i2 == 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0452Eq = c0452Eq;
                    interpolator = interpolator;
                    c0452Eq.A08.A0D(i, i2, interpolator);
                    c2 = '\f';
                    break;
                case '\f':
                    return;
            }
        }
    }

    private void A0l(long j, C4Y other, C4Y c4y) {
        C0452Eq c0452Eq = this;
        AnonymousClass44 anonymousClass44 = null;
        C4Y c4yA0E = null;
        String strA0H = null;
        int iA05 = c0452Eq.A01.A05();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= iA05) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    other = other;
                    c4yA0E = A0E(c0452Eq.A01.A09(i));
                    if (c4yA0E != other) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i++;
                    c2 = 2;
                    break;
                case 5:
                    c0452Eq = c0452Eq;
                    c4yA0E = c4yA0E;
                    if (c0452Eq.A0A(c4yA0E) != j) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    anonymousClass44 = c0452Eq.A04;
                    strA0H = A0H(1738, 17, 73);
                    if (anonymousClass44 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    anonymousClass44 = anonymousClass44;
                    if (!anonymousClass44.A0A()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    throw new IllegalStateException(A0H(1274, 130, 52) + c4yA0E + strA0H + other + c0452Eq.A1G());
                case '\t':
                    throw new IllegalStateException(A0H(962, 188, 23) + c4yA0E + strA0H + other + c0452Eq.A1G());
                case '\n':
                    Log.e(A0H(1788, 12, 104), A0H(1817, 111, 69) + c4y + A0H(237, 41, 74) + other + c0452Eq.A1G());
                    return;
            }
        }
    }

    private void A0m(MotionEvent motionEvent) {
        C0452Eq c0452Eq = this;
        int i = 0;
        int actionIndex = motionEvent.getActionIndex();
        char c2 = motionEvent.getPointerId(actionIndex) == c0452Eq.A0V ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (actionIndex != 0) {
                        c2 = 6;
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
                    c0452Eq = c0452Eq;
                    motionEvent = motionEvent;
                    c0452Eq.A0V = motionEvent.getPointerId(i);
                    int x = (int) (motionEvent.getX(i) + 0.5f);
                    c0452Eq.A0S = x;
                    c0452Eq.A0Q = x;
                    int y = (int) (motionEvent.getY(i) + 0.5f);
                    c0452Eq.A0T = y;
                    c0452Eq.A0R = y;
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    i = 0;
                    c2 = 4;
                    break;
            }
        }
    }

    public static void A0n(View view, Rect insets) {
        C4H c4h = (C4H) view.getLayoutParams();
        Rect rect = c4h.A03;
        insets.set((view.getLeft() - rect.left) - c4h.leftMargin, (view.getTop() - rect.top) - c4h.topMargin, view.getRight() + rect.right + c4h.rightMargin, view.getBottom() + rect.bottom + c4h.bottomMargin);
    }

    private void A0o(@NonNull View view, @Nullable View view2) {
        View view3 = view;
        C0452Eq c0452Eq = this;
        Rect insets = null;
        C4G c4g = null;
        boolean z = false;
        View view4 = null;
        ViewGroup.LayoutParams layoutParams = null;
        boolean z2 = false;
        C4H c4h = null;
        char c2 = view2 != null ? (char) 2 : '\f';
        while (true) {
            switch (c2) {
                case 2:
                    view2 = view2;
                    view4 = view2;
                    c2 = 3;
                    break;
                case 3:
                    c0452Eq = c0452Eq;
                    view4 = view4;
                    c0452Eq.A0p.set(0, 0, view4.getWidth(), view4.getHeight());
                    layoutParams = view4.getLayoutParams();
                    if (!(layoutParams instanceof C4H)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    layoutParams = layoutParams;
                    c4h = (C4H) layoutParams;
                    if (!c4h.A01) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    c0452Eq = c0452Eq;
                    c4h = c4h;
                    Rect rect = c4h.A03;
                    c0452Eq.A0p.left -= rect.left;
                    c0452Eq.A0p.right += rect.right;
                    c0452Eq.A0p.top -= rect.top;
                    c0452Eq.A0p.bottom += rect.bottom;
                    c2 = 6;
                    break;
                case 6:
                    view2 = view2;
                    if (view2 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0452Eq = c0452Eq;
                    view3 = view3;
                    view2 = view2;
                    c0452Eq.offsetDescendantRectToMyCoords(view2, c0452Eq.A0p);
                    c0452Eq.offsetRectIntoDescendantCoords(view3, c0452Eq.A0p);
                    c2 = '\b';
                    break;
                case '\b':
                    c0452Eq = c0452Eq;
                    view2 = view2;
                    c4g = c0452Eq.A06;
                    insets = c0452Eq.A0p;
                    z2 = !c0452Eq.A0D;
                    if (view2 != null) {
                        c2 = 11;
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
                    c4g.A1e(c0452Eq, view3, insets, z2, z);
                    return;
                case 11:
                    z = false;
                    c2 = '\n';
                    break;
                case '\f':
                    view3 = view3;
                    view4 = view3;
                    c2 = 3;
                    break;
            }
        }
    }

    private void A0p(AnonymousClass44 anonymousClass44, boolean z, boolean z2) {
        C0452Eq c0452Eq = this;
        AnonymousClass44 anonymousClass442 = null;
        AnonymousClass44 anonymousClass443 = c0452Eq.A04;
        char c2 = anonymousClass443 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    anonymousClass443 = anonymousClass443;
                    anonymousClass443.A08(c0452Eq.A11);
                    c2 = 3;
                    break;
                case 3:
                    if (!z) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (!z2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0452Eq = c0452Eq;
                    c0452Eq.A1M();
                    c2 = 6;
                    break;
                case 6:
                    c0452Eq = c0452Eq;
                    anonymousClass44 = anonymousClass44;
                    c0452Eq.A00.A0I();
                    anonymousClass442 = c0452Eq.A04;
                    c0452Eq.A04 = anonymousClass44;
                    if (anonymousClass44 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0452Eq = c0452Eq;
                    anonymousClass44 = anonymousClass44;
                    anonymousClass44.A07(c0452Eq.A11);
                    c2 = '\b';
                    break;
                case '\b':
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A06 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    C0452Eq c0452Eq2 = c0452Eq;
                    c0452Eq2.A0r.A0Y(anonymousClass442, c0452Eq2.A04, z);
                    c0452Eq2.A0s.A0D = true;
                    c0452Eq2.A1O();
                    return;
            }
        }
    }

    private void A0q(C4Y c4y) {
        C0452Eq c0452Eq = this;
        boolean z = false;
        View view = c4y.A0H;
        char c2 = view.getParent() == c0452Eq ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    c0452Eq = c0452Eq;
                    c4y = c4y;
                    view = view;
                    c0452Eq.A0r.A0c(c0452Eq.A1F(view));
                    if (!c4y.A0e()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    view = view;
                    c0452Eq.A01.A0H(view, -1, view.getLayoutParams(), true);
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    if (!z) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    c0452Eq = c0452Eq;
                    view = view;
                    c0452Eq.A01.A0J(view, true);
                    c2 = 5;
                    break;
                case '\b':
                    c0452Eq = c0452Eq;
                    view = view;
                    c0452Eq.A01.A0E(view);
                    c2 = 5;
                    break;
                case '\t':
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public static void A0r(@NonNull C4Y c4y) {
        Object parent = null;
        C0452Eq c0452Eq = null;
        char c2 = c4y.A09 != null ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    c4y = c4y;
                    c0452Eq = c4y.A09.get();
                    c2 = 3;
                    break;
                case 3:
                    if (c0452Eq == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4y = c4y;
                    if (c0452Eq != c4y.A0H) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return;
                case 6:
                    parent = c0452Eq.getParent();
                    if (!(parent instanceof View)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    parent = (ViewParent) parent;
                    c0452Eq = (View) parent;
                    c2 = 3;
                    break;
                case '\b':
                    c0452Eq = null;
                    c2 = 3;
                    break;
                case '\t':
                    c4y = c4y;
                    c4y.A09 = null;
                    c2 = '\n';
                    break;
                case '\n':
                    return;
            }
        }
    }

    private void A0s(@NonNull C4Y c4y, @NonNull C4Y c4y2, @NonNull C4B c4b, @NonNull C4B c4b2, boolean z, boolean z2) {
        C0452Eq c0452Eq = this;
        c4y.A0Z(false);
        char c2 = z ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    c4y = c4y;
                    c0452Eq.A0q(c4y);
                    c2 = 3;
                    break;
                case 3:
                    c4y = c4y;
                    c4y2 = c4y2;
                    if (c4y == c4y2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (!z2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0452Eq = c0452Eq;
                    c4y2 = c4y2;
                    c0452Eq.A0q(c4y2);
                    c2 = 6;
                    break;
                case 6:
                    c0452Eq = c0452Eq;
                    c4y = c4y;
                    c4y2 = c4y2;
                    c4y.A06 = c4y2;
                    c0452Eq.A0q(c4y);
                    c0452Eq.A0r.A0c(c4y);
                    c4y2.A0Z(false);
                    c4y2.A07 = c4y;
                    c2 = 7;
                    break;
                case 7:
                    c0452Eq = c0452Eq;
                    c4y = c4y;
                    c4y2 = c4y2;
                    c4b = c4b;
                    c4b2 = c4b2;
                    if (!c0452Eq.A05.A0F(c4y, c4y2, c4b, c4b2)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0452Eq = c0452Eq;
                    c0452Eq.A1L();
                    c2 = '\t';
                    break;
                case '\t':
                    return;
            }
        }
    }

    private void A0w(int[] iArr) {
        C0452Eq c0452Eq = this;
        int i = 0;
        int minPositionPreLayout = 0;
        C4Y c4yA0E = null;
        int i2 = 0;
        int i3 = 0;
        int iA05 = c0452Eq.A01.A05();
        int pos = iA05 == 0 ? 2 : 3;
        while (true) {
            switch (pos) {
                case 2:
                    int[] iArr2 = iArr;
                    iArr2[0] = -1;
                    iArr2[1] = -1;
                    return;
                case 3:
                    i2 = Integer.MAX_VALUE;
                    i = androidx.recyclerview.widget.RecyclerView.UNDEFINED_DURATION;
                    i3 = 0;
                    pos = 4;
                    break;
                case 4:
                    if (i3 >= iA05) {
                        pos = 11;
                        break;
                    } else {
                        pos = 5;
                        break;
                    }
                case 5:
                    c0452Eq = c0452Eq;
                    c4yA0E = A0E(c0452Eq.A01.A09(i3));
                    if (!c4yA0E.A0h()) {
                        pos = 7;
                        break;
                    } else {
                        pos = 6;
                        break;
                    }
                case 6:
                    i3++;
                    pos = 4;
                    break;
                case 7:
                    c4yA0E = c4yA0E;
                    minPositionPreLayout = c4yA0E.A0I();
                    if (minPositionPreLayout >= i2) {
                        pos = 9;
                        break;
                    } else {
                        pos = 8;
                        break;
                    }
                case 8:
                    i2 = minPositionPreLayout;
                    pos = 9;
                    break;
                case 9:
                    if (minPositionPreLayout <= i) {
                        pos = 6;
                        break;
                    } else {
                        pos = 10;
                        break;
                    }
                case 10:
                    i = minPositionPreLayout;
                    pos = 6;
                    break;
                case 11:
                    int[] iArr3 = iArr;
                    iArr3[0] = i2;
                    iArr3[1] = i;
                    return;
            }
        }
    }

    private boolean A0x() {
        C0452Eq c0452Eq = this;
        C4Y holder = null;
        int iA05 = c0452Eq.A01.A05();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= iA05) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    holder = A0E(c0452Eq.A01.A09(i));
                    if (holder == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    holder = holder;
                    if (!holder.A0h()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    holder = holder;
                    if (!holder.A0f()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return true;
                case '\b':
                    return false;
            }
        }
    }

    private boolean A0y() {
        C0452Eq c0452Eq = this;
        boolean z = false;
        char c2 = c0452Eq.A05 != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A06.A26()) {
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

    private boolean A10(int i, int i2) {
        A0w(this.A14);
        int[] iArr = this.A14;
        boolean z = false;
        char c2 = iArr[0] == i ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    iArr = iArr;
                    if (iArr[1] == i2) {
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
                    return z;
            }
        }
    }

    private final boolean A11(int i, int i2) {
        C0452Eq c0452Eq = this;
        int i3 = 0;
        boolean z = false;
        C4J c4j = null;
        boolean z2 = false;
        boolean zA24 = false;
        boolean zA25 = false;
        C4G c4g = c0452Eq.A06;
        char c2 = c4g == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    Log.e(A0H(1788, 12, 104), A0H(1630, 89, 82));
                    return false;
                case 3:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0I) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    c0452Eq = c0452Eq;
                    c4g = c4g;
                    zA24 = c4g.A24();
                    zA25 = c0452Eq.A06.A25();
                    if (!zA24) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    if (Math.abs(i) >= c0452Eq.A0y) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    i = 0;
                    c2 = '\b';
                    break;
                case '\b':
                    if (!zA25) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0452Eq = c0452Eq;
                    if (Math.abs(i2) >= c0452Eq.A0y) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    i2 = 0;
                    c2 = 11;
                    break;
                case 11:
                    if (i != 0) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    if (i2 != 0) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    return false;
                case 14:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.dispatchNestedPreFling(i, i2)) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 15:
                    z = true;
                    z = true;
                    if (!zA24) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 16:
                    if (!zA25) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    z2 = true;
                    c2 = 18;
                    break;
                case 18:
                    c0452Eq = c0452Eq;
                    c0452Eq.dispatchNestedFling(i, i2, z2);
                    c4j = c0452Eq.A0g;
                    if (c4j == null) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    c4j = c4j;
                    if (!c4j.A0B(i, i2)) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    return z;
                case 21:
                    z2 = false;
                    c2 = 18;
                    break;
                case 22:
                    if (!z2) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    i3 = 0;
                    if (!zA24) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    i3 = 0 | 1;
                    c2 = 25;
                    break;
                case 25:
                    if (!zA25) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    i3 |= 2;
                    c2 = 27;
                    break;
                case 27:
                    C0452Eq c0452Eq2 = c0452Eq;
                    c0452Eq2.A1u(i3, z ? 1 : 0);
                    int i4 = c0452Eq2.A0x;
                    int iMax = Math.max(-i4, Math.min(i, i4));
                    int i5 = c0452Eq2.A0x;
                    c0452Eq2.A08.A09(iMax, Math.max(-i5, Math.min(i2, i5)));
                    return z;
                case 28:
                    return false;
            }
        }
    }

    private final boolean A12(int i, int i2, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        C0452Eq c0452Eq = this;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        int[] iArr = null;
        C0452Eq c0452Eq2 = c0452Eq;
        MotionEvent motionEvent3 = motionEvent2;
        int i7 = 0;
        int i8 = 0;
        int iA1h = 0;
        int iA1i = 0;
        c0452Eq.A1H();
        char c2 = 0;
        int i9 = c0452Eq2.A04 != null ? 2 : 27;
        while (true) {
            switch (i9) {
                case 2:
                    c0452Eq = c0452Eq;
                    c0452Eq2 = c0452Eq2;
                    c0452Eq.A1I();
                    c0452Eq.A1J();
                    C2I.A01(A0H(1501, 9, 32));
                    c0452Eq2.A1j(c0452Eq2.A0s);
                    if (i == 0) {
                        i9 = 4;
                        break;
                    } else {
                        i9 = 3;
                        break;
                    }
                case 3:
                    c0452Eq2 = c0452Eq2;
                    iA1h = c0452Eq2.A06.A1h(i, c0452Eq2.A0r, c0452Eq2.A0s);
                    i7 = i - iA1h;
                    i9 = 4;
                    break;
                case 4:
                    if (i2 == 0) {
                        i9 = 6;
                        break;
                    } else {
                        i9 = 5;
                        break;
                    }
                case 5:
                    c0452Eq2 = c0452Eq2;
                    iA1i = c0452Eq2.A06.A1i(i2, c0452Eq2.A0r, c0452Eq2.A0s);
                    i8 = i2 - iA1i;
                    i9 = 6;
                    break;
                case 6:
                    c0452Eq = c0452Eq;
                    c0452Eq2 = c0452Eq2;
                    c2 = 0;
                    C2I.A00();
                    c0452Eq.A1N();
                    c0452Eq.A1K();
                    c0452Eq2.A1p(false);
                    i4 = i7;
                    i3 = i8;
                    i5 = iA1h;
                    i6 = iA1i;
                    i9 = 7;
                    break;
                case 7:
                    c0452Eq2 = c0452Eq2;
                    if (!c0452Eq2.A0v.isEmpty()) {
                        i9 = 8;
                        break;
                    } else {
                        i9 = 9;
                        break;
                    }
                case 8:
                    c0452Eq = c0452Eq;
                    c0452Eq.invalidate();
                    i9 = 9;
                    break;
                case 9:
                    c0452Eq = c0452Eq;
                    c0452Eq2 = c0452Eq2;
                    z = true;
                    z = true;
                    if (!c0452Eq.A1v(i5, i6, i4, i3, c0452Eq2.A17, 0)) {
                        i9 = 22;
                        break;
                    } else {
                        i9 = 10;
                        break;
                    }
                case 10:
                    c0452Eq2 = c0452Eq2;
                    motionEvent3 = motionEvent3;
                    int i10 = c0452Eq2.A0S;
                    iArr = c0452Eq2.A17;
                    c0452Eq2.A0S = i10 - iArr[c2];
                    c0452Eq2.A0T -= iArr[z ? 1 : 0];
                    if (motionEvent3 == null) {
                        i9 = 12;
                        break;
                    } else {
                        i9 = 11;
                        break;
                    }
                case 11:
                    motionEvent3 = motionEvent3;
                    iArr = iArr;
                    motionEvent3.offsetLocation(iArr[c2], iArr[z ? 1 : 0]);
                    i9 = 12;
                    break;
                case 12:
                    c0452Eq2 = c0452Eq2;
                    int[] iArr2 = c0452Eq2.A15;
                    int i11 = iArr2[c2];
                    int[] iArr3 = c0452Eq2.A17;
                    iArr2[c2] = i11 + iArr3[c2];
                    iArr2[z ? 1 : 0] = iArr2[z ? 1 : 0] + iArr3[z ? 1 : 0];
                    i9 = 13;
                    break;
                case 13:
                    if (i5 != 0) {
                        i9 = 15;
                        break;
                    } else {
                        i9 = 14;
                        break;
                    }
                case 14:
                    if (i6 == 0) {
                        i9 = 16;
                        break;
                    } else {
                        i9 = 15;
                        break;
                    }
                case 15:
                    c0452Eq2 = c0452Eq2;
                    c0452Eq2.A1Z(i5, i6);
                    i9 = 16;
                    break;
                case 16:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.awakenScrollBars()) {
                        i9 = 17;
                        break;
                    } else {
                        i9 = 18;
                        break;
                    }
                case 17:
                    c0452Eq = c0452Eq;
                    c0452Eq.invalidate();
                    i9 = 18;
                    break;
                case 18:
                    if (i5 != 0) {
                        i9 = 20;
                        break;
                    } else {
                        i9 = 19;
                        break;
                    }
                case 19:
                    if (i6 == 0) {
                        i9 = 21;
                        break;
                    } else {
                        i9 = 20;
                        break;
                    }
                case 20:
                    return z;
                case 21:
                    z = false;
                    i9 = 20;
                    break;
                case 22:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.getOverScrollMode() == 2) {
                        i9 = 13;
                        break;
                    } else {
                        i9 = 23;
                        break;
                    }
                case 23:
                    motionEvent3 = motionEvent3;
                    if (motionEvent3 == null) {
                        i9 = 26;
                        break;
                    } else {
                        i9 = 24;
                        break;
                    }
                case 24:
                    motionEvent3 = motionEvent3;
                    if (!C01582b.A00(motionEvent3, 8194)) {
                        i9 = 25;
                        break;
                    } else {
                        i9 = 26;
                        break;
                    }
                case 25:
                    motionEvent2 = motionEvent2;
                    c0452Eq2 = c0452Eq2;
                    c0452Eq2.A0i(motionEvent2.getX(), i4, motionEvent2.getY(), i3);
                    i9 = 26;
                    break;
                case 26:
                    c0452Eq = c0452Eq;
                    c0452Eq.A1X(i, i2);
                    i9 = 13;
                    break;
                case 27:
                    iA1i = 0;
                    iA1h = 0;
                    i7 = 0;
                    i8 = 0;
                    i4 = 0;
                    i3 = 0;
                    i5 = 0;
                    i6 = 0;
                    i9 = 7;
                    break;
            }
        }
    }

    private boolean A13(MotionEvent motionEvent) {
        C0452Eq c0452Eq = this;
        C4K c4k = null;
        int size = 0;
        int i = 0;
        int action = motionEvent.getAction();
        char c2 = c0452Eq.A0h != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (action != 0) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0h = null;
                    c2 = 4;
                    break;
                case 4:
                    if (action == 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0452Eq = c0452Eq;
                    size = c0452Eq.A13.size();
                    i = 0;
                    c2 = 6;
                    break;
                case 6:
                    if (i >= size) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0452Eq = c0452Eq;
                    motionEvent = motionEvent;
                    c4k = c0452Eq.A13.get(i);
                    if (!c4k.onInterceptTouchEvent(c0452Eq, motionEvent)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0452Eq.A0h = c4k;
                    return true;
                case '\t':
                    i++;
                    c2 = 6;
                    break;
                case '\n':
                    return false;
                case 11:
                    if (action == 3) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    if (action != 1) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c0452Eq = c0452Eq;
                    c0452Eq.A0h = null;
                    c2 = 14;
                    break;
                case 14:
                    return true;
            }
        }
    }

    private boolean A14(MotionEvent motionEvent) {
        C0452Eq c0452Eq = this;
        C4K c4k = null;
        int i = 0;
        int size = 0;
        int action = motionEvent.getAction();
        char c2 = action != 3 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (action != 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0h = null;
                    c2 = 4;
                    break;
                case 4:
                    c0452Eq = c0452Eq;
                    size = c0452Eq.A13.size();
                    i = 0;
                    c2 = 5;
                    break;
                case 5:
                    if (i >= size) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    motionEvent = motionEvent;
                    c4k = c0452Eq.A13.get(i);
                    if (!c4k.onInterceptTouchEvent(c0452Eq, motionEvent)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (action == 3) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0452Eq.A0h = c4k;
                    return true;
                case '\t':
                    i++;
                    c2 = 5;
                    break;
                case '\n':
                    return false;
            }
        }
    }

    private boolean A15(View view, View view2, int i) {
        C0452Eq c0452Eq = this;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        char c2 = view2 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    view2 = view2;
                    if (view2 != c0452Eq) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    view = view;
                    z2 = true;
                    if (view != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return z2;
                case 6:
                    i3 = 2;
                    if (i == 2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i != z2) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A06.A0a() != z2) {
                        c2 = 17;
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
                    if (i != i3) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    z3 = true;
                    c2 = '\f';
                    break;
                case '\f':
                    if (!(z3 ^ z)) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    i2 = 66;
                    c2 = 14;
                    break;
                case 14:
                    c0452Eq = c0452Eq;
                    view = view;
                    view2 = view2;
                    if (!c0452Eq.A16(view, view2, i2)) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    return z2;
                case 16:
                    i2 = 17;
                    c2 = 14;
                    break;
                case 17:
                    z = false;
                    c2 = '\n';
                    break;
                case 18:
                    if (i != i3) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    return c0452Eq.A16(view, view2, 130);
                case 20:
                    return c0452Eq.A16(view, view2, 33);
                case 21:
                    return c0452Eq.A16(view, view2, i);
            }
        }
    }

    private boolean A16(View view, View view2, int i) {
        C0452Eq c0452Eq = this;
        c0452Eq.A0p.set(0, 0, view.getWidth(), view.getHeight());
        c0452Eq.A0z.set(0, 0, view2.getWidth(), view2.getHeight());
        c0452Eq.offsetDescendantRectToMyCoords(view, c0452Eq.A0p);
        c0452Eq.offsetDescendantRectToMyCoords(view2, c0452Eq.A0z);
        boolean z = true;
        char c2 = i != 17 ? (char) 2 : (char) 21;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 33) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 66) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i != 130) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A0p.top < c0452Eq.A0z.top) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A0p.bottom > c0452Eq.A0z.top) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A0p.bottom >= c0452Eq.A0z.bottom) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return z;
                case '\t':
                    z = false;
                    c2 = '\b';
                    break;
                case '\n':
                    throw new IllegalArgumentException(A0H(1227, 37, 20) + i + c0452Eq.A1G());
                case 11:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A0p.left < c0452Eq.A0z.left) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A0p.right > c0452Eq.A0z.left) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A0p.right >= c0452Eq.A0z.right) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    return z;
                case 15:
                    z = false;
                    c2 = 14;
                    break;
                case 16:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A0p.bottom > c0452Eq.A0z.bottom) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A0p.top < c0452Eq.A0z.bottom) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A0p.top <= c0452Eq.A0z.top) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    return z;
                case 20:
                    z = false;
                    c2 = 19;
                    break;
                case 21:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A0p.right > c0452Eq.A0z.right) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A0p.left < c0452Eq.A0z.right) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A0p.left <= c0452Eq.A0z.left) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    return z;
                case 25:
                    z = false;
                    c2 = 24;
                    break;
            }
        }
    }

    private final boolean A17(AccessibilityEvent accessibilityEvent) {
        int iA00 = 0;
        char c2 = A1s() ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    accessibilityEvent = accessibilityEvent;
                    iA00 = 0;
                    if (accessibilityEvent == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    accessibilityEvent = accessibilityEvent;
                    iA00 = C3E.A00(accessibilityEvent);
                    c2 = 4;
                    break;
                case 4:
                    if (iA00 != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    iA00 = 0;
                    c2 = 6;
                    break;
                case 6:
                    this.A0P |= iA00;
                    return true;
                case 7:
                    return false;
            }
        }
    }

    public final int A1A(View view) {
        int iA0I = 0;
        C4Y c4yA0E = A0E(view);
        char c2 = c4yA0E != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c4yA0E = c4yA0E;
                    iA0I = c4yA0E.A0I();
                    c2 = 3;
                    break;
                case 3:
                    return iA0I;
                case 4:
                    iA0I = -1;
                    c2 = 3;
                    break;
            }
        }
    }

    public final int A1B(C4Y c4y) {
        char c2 = !c4y.A0k(524) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4y = c4y;
                    if (!c4y.A0a()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return -1;
                case 4:
                    return this.A00.A0E(c4y.A03);
            }
        }
    }

    public final Rect A1C(View view) {
        C0452Eq c0452Eq = this;
        boolean z = false;
        int size = 0;
        int i = 0;
        Rect rect = null;
        C4H c4h = (C4H) view.getLayoutParams();
        int i2 = !c4h.A01 ? 2 : 3;
        while (true) {
            switch (i2) {
                case 2:
                    return c4h.A03;
                case 3:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0s.A07()) {
                        i2 = 7;
                        break;
                    } else {
                        i2 = 4;
                        break;
                    }
                case 4:
                    c4h = c4h;
                    if (!c4h.A01()) {
                        i2 = 5;
                        break;
                    } else {
                        i2 = 6;
                        break;
                    }
                case 5:
                    c4h = c4h;
                    if (!c4h.A03()) {
                        i2 = 7;
                        break;
                    } else {
                        i2 = 6;
                        break;
                    }
                case 6:
                    return c4h.A03;
                case 7:
                    c0452Eq = c0452Eq;
                    c4h = c4h;
                    rect = c4h.A03;
                    z = false;
                    rect.set(0, 0, 0, 0);
                    size = c0452Eq.A0v.size();
                    i = 0;
                    i2 = 8;
                    break;
                case 8:
                    if (i >= size) {
                        i2 = 10;
                        break;
                    } else {
                        i2 = 9;
                        break;
                    }
                case 9:
                    c0452Eq = c0452Eq;
                    view = view;
                    rect = rect;
                    c0452Eq.A0p.set(z ? 1 : 0, z ? 1 : 0, z ? 1 : 0, z ? 1 : 0);
                    c0452Eq.A0v.get(i).A01(c0452Eq.A0p, view, c0452Eq, c0452Eq.A0s);
                    rect.left += c0452Eq.A0p.left;
                    rect.top += c0452Eq.A0p.top;
                    rect.right += c0452Eq.A0p.right;
                    rect.bottom += c0452Eq.A0p.bottom;
                    i++;
                    i2 = 8;
                    break;
                case 10:
                    c4h.A01 = z;
                    return rect;
            }
        }
    }

    @Nullable
    public final View A1D(View view) {
        Object obj = this;
        View view2 = null;
        Object parent = view.getParent();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    parent = (ViewParent) parent;
                    if (parent == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    obj = (C0452Eq) obj;
                    parent = (ViewParent) parent;
                    if (parent == obj) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    parent = (ViewParent) parent;
                    if (!(parent instanceof View)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    view = (View) ((ViewParent) parent);
                    parent = view.getParent();
                    c2 = 2;
                    break;
                case 6:
                    obj = (C0452Eq) obj;
                    parent = (ViewParent) parent;
                    if (parent != obj) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    view = view;
                    view2 = view;
                    c2 = '\b';
                    break;
                case '\b':
                    return view2;
                case '\t':
                    view2 = null;
                    c2 = '\b';
                    break;
            }
        }
    }

    public final C4Y A1E(int i, boolean z) {
        C0452Eq c0452Eq = this;
        C4Y c4yA0E = null;
        int iA06 = c0452Eq.A01.A06();
        C4Y c4y = null;
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= iA06) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    c4yA0E = A0E(c0452Eq.A01.A0A(i2));
                    if (c4yA0E == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0c()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 5:
                    if (!z) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c4yA0E = c4yA0E;
                    if (c4yA0E.A03 == i) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    i2++;
                    c2 = 2;
                    break;
                case '\b':
                    c4yA0E = c4yA0E;
                    if (c4yA0E.A0I() == i) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case '\t':
                    c0452Eq = c0452Eq;
                    c4yA0E = c4yA0E;
                    if (!c0452Eq.A01.A0K(c4yA0E.A0H)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c4yA0E = c4yA0E;
                    c4y = c4yA0E;
                    c2 = 7;
                    break;
                case 11:
                    return c4yA0E;
                case '\f':
                    return c4y;
            }
        }
    }

    public final C4Y A1F(View view) {
        ViewParent parent = this;
        ViewParent parent2 = view.getParent();
        char c2 = parent2 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    parent = (C0452Eq) parent;
                    parent2 = parent2;
                    if (parent2 != parent) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return A0E(view);
                case 4:
                    throw new IllegalArgumentException(A0H(854, 5, 30) + view + A0H(1604, 26, 63) + ((C0452Eq) parent));
            }
        }
    }

    public final String A1G() {
        return A0H(0, 1, 46) + super.toString() + A0H(1728, 10, 46) + this.A04 + A0H(1719, 9, k.AppCompatTheme_windowFixedWidthMajor) + this.A06 + A0H(1264, 10, 95) + getContext();
    }

    public final void A1H() {
        C0452Eq c0452Eq = this;
        boolean z = c0452Eq.A0D;
        String strA0H = A0H(1800, 17, 127);
        char c2 = z ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0C) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    C2I.A01(strA0H);
                    c0452Eq.A0X();
                    C2I.A00();
                    return;
                case 4:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A00.A0J()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    return;
                case 6:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A00.A0L(4)) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A00.A0L(11)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case '\b':
                    c0452Eq = c0452Eq;
                    C2I.A01(A0H(k.AppCompatTheme_windowFixedHeightMinor, 20, 85));
                    c0452Eq.A1I();
                    c0452Eq.A1J();
                    c0452Eq.A00.A0H();
                    if (!c0452Eq.A0J) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case '\t':
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0x()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c0452Eq = c0452Eq;
                    c0452Eq.A0X();
                    c2 = 11;
                    break;
                case 11:
                    c0452Eq = c0452Eq;
                    c0452Eq.A1p(true);
                    c0452Eq.A1K();
                    C2I.A00();
                    c2 = '\f';
                    break;
                case '\f':
                    return;
                case '\r':
                    c0452Eq = c0452Eq;
                    c0452Eq.A00.A0F();
                    c2 = 11;
                    break;
                case 14:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A00.A0J()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c0452Eq = c0452Eq;
                    strA0H = strA0H;
                    C2I.A01(strA0H);
                    c0452Eq.A0X();
                    C2I.A00();
                    c2 = '\f';
                    break;
            }
        }
    }

    public final void A1I() {
        C0452Eq c0452Eq = this;
        c0452Eq.A0O++;
        char c2 = c0452Eq.A0O == 1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0I) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0J = false;
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A1J() {
        this.A0U++;
    }

    public final void A1K() {
        A1o(true);
    }

    public final void A1L() {
        C0452Eq c0452Eq = this;
        char c2 = !c0452Eq.A0K ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0F) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    C2v.A0C(c0452Eq, c0452Eq.A0k);
                    c0452Eq.A0K = true;
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A1M() {
        C0452Eq c0452Eq = this;
        C4G c4g = null;
        C4C c4c = c0452Eq.A05;
        char c2 = c4c != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4c = c4c;
                    c4c.A0G();
                    c2 = 3;
                    break;
                case 3:
                    c0452Eq = c0452Eq;
                    c4g = c0452Eq.A06;
                    if (c4g == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    c4g = c4g;
                    c4g.A1I(c0452Eq.A0r);
                    c0452Eq.A06.A1G(c0452Eq.A0r);
                    c2 = 5;
                    break;
                case 5:
                    c0452Eq.A0r.A0P();
                    return;
            }
        }
    }

    public final void A1N() {
        C0452Eq c0452Eq = this;
        int i = 0;
        int top = 0;
        View view = null;
        C4Y c4yA1F = null;
        View viewA09 = null;
        int iA05 = c0452Eq.A01.A05();
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= iA05) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    viewA09 = c0452Eq.A01.A09(i2);
                    c4yA1F = c0452Eq.A1F(viewA09);
                    if (c4yA1F == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4yA1F = c4yA1F;
                    if (c4yA1F.A07 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    viewA09 = viewA09;
                    c4yA1F = c4yA1F;
                    view = c4yA1F.A07.A0H;
                    i = viewA09.getLeft();
                    top = viewA09.getTop();
                    if (i != view.getLeft()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    view = view;
                    if (top == view.getTop()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    view = view;
                    view.layout(i, top, view.getWidth() + i, view.getHeight() + top);
                    c2 = '\b';
                    break;
                case '\b':
                    i2++;
                    c2 = 2;
                    break;
                case '\t':
                    return;
            }
        }
    }

    public final void A1O() {
        this.A0C = true;
        A0g();
    }

    public final void A1P() {
        setScrollState(0);
        A0U();
    }

    public final void A1Q(int i) {
        C4G c4g = this.A06;
        if (c4g == null) {
            return;
        }
        c4g.A1t(i);
        awakenScrollBars();
    }

    public final void A1R(int i) {
        C0452Eq c0452Eq = this;
        int iA05 = c0452Eq.A01.A05();
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= iA05) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    c0452Eq.A01.A09(i2).offsetLeftAndRight(i);
                    i2++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A1S(int i) {
        C0452Eq c0452Eq = this;
        int iA05 = c0452Eq.A01.A05();
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= iA05) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    c0452Eq.A01.A09(i2).offsetTopAndBottom(i);
                    i2++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A1T(int i) {
        C0452Eq c0452Eq = this;
        C4G c4g = null;
        char c2 = c0452Eq.A0I ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0452Eq = c0452Eq;
                    c0452Eq.A1P();
                    c4g = c0452Eq.A06;
                    if (c4g != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    Log.e(A0H(1788, 12, 104), A0H(1510, 94, k.AppCompatTheme_windowFixedHeightMinor));
                    return;
                case 5:
                    c4g.A1t(i);
                    c0452Eq.awakenScrollBars();
                    return;
            }
        }
    }

    public final void A1U(int i) {
        C0452Eq c0452Eq = this;
        C4G c4g = null;
        char c2 = c0452Eq.A0I ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0452Eq = c0452Eq;
                    c4g = c0452Eq.A06;
                    if (c4g != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    Log.e(A0H(1788, 12, 104), A0H(1404, 97, 46));
                    return;
                case 5:
                    C0452Eq c0452Eq2 = c0452Eq;
                    c4g.A21(c0452Eq2, c0452Eq2.A0s, i);
                    return;
            }
        }
    }

    public final void A1V(int i) {
        getScrollingChildHelper().A03(i);
    }

    public final void A1W(int i, int i2) {
        C0452Eq c0452Eq = this;
        char c2 = i < 0 ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0a();
                    c0452Eq.A0a.onAbsorb(-i);
                    c2 = 3;
                    break;
                case 3:
                    if (i2 >= 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0c();
                    c0452Eq.A0c.onAbsorb(-i2);
                    c2 = 5;
                    break;
                case 5:
                    if (i != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i2 == 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0452Eq = c0452Eq;
                    C2v.A07(c0452Eq);
                    c2 = '\b';
                    break;
                case '\b':
                    return;
                case '\t':
                    if (i2 <= 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c0452Eq = c0452Eq;
                    c0452Eq.A0Z();
                    c0452Eq.A0Z.onAbsorb(i2);
                    c2 = 5;
                    break;
                case 11:
                    if (i <= 0) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c0452Eq = c0452Eq;
                    c0452Eq.A0b();
                    c0452Eq.A0b.onAbsorb(i);
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A1X(int i, int i2) {
        C0452Eq c0452Eq = this;
        EdgeEffect edgeEffect = null;
        EdgeEffect edgeEffect2 = null;
        EdgeEffect edgeEffect3 = null;
        boolean zIsFinished = false;
        EdgeEffect edgeEffect4 = c0452Eq.A0a;
        char c2 = edgeEffect4 != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    edgeEffect4 = edgeEffect4;
                    if (!edgeEffect4.isFinished()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 3:
                    if (i <= 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0a.onRelease();
                    zIsFinished = c0452Eq.A0a.isFinished();
                    c2 = 5;
                    break;
                case 5:
                    c0452Eq = c0452Eq;
                    edgeEffect2 = c0452Eq.A0b;
                    if (edgeEffect2 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    edgeEffect2 = edgeEffect2;
                    if (!edgeEffect2.isFinished()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 7:
                    if (i >= 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0452Eq = c0452Eq;
                    c0452Eq.A0b.onRelease();
                    zIsFinished |= c0452Eq.A0b.isFinished();
                    c2 = '\t';
                    break;
                case '\t':
                    c0452Eq = c0452Eq;
                    edgeEffect3 = c0452Eq.A0c;
                    if (edgeEffect3 == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    edgeEffect3 = edgeEffect3;
                    if (!edgeEffect3.isFinished()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case 11:
                    if (i2 <= 0) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c0452Eq = c0452Eq;
                    c0452Eq.A0c.onRelease();
                    zIsFinished |= c0452Eq.A0c.isFinished();
                    c2 = '\r';
                    break;
                case '\r':
                    c0452Eq = c0452Eq;
                    edgeEffect = c0452Eq.A0Z;
                    if (edgeEffect == null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    edgeEffect = edgeEffect;
                    if (!edgeEffect.isFinished()) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 15:
                    if (i2 >= 0) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0Z.onRelease();
                    zIsFinished |= c0452Eq.A0Z.isFinished();
                    c2 = 17;
                    break;
                case 17:
                    if (!zIsFinished) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c0452Eq = c0452Eq;
                    C2v.A07(c0452Eq);
                    c2 = 19;
                    break;
                case 19:
                    return;
            }
        }
    }

    public final void A1Y(int i, int i2) {
        setMeasuredDimension(C4G.A00(i, getPaddingLeft() + getPaddingRight(), C2v.A03(this)), C4G.A00(i2, getPaddingTop() + getPaddingBottom(), C2v.A02(this)));
    }

    public final void A1Z(int scrollY, int i) {
        C0452Eq c0452Eq = this;
        int size = 0;
        List<C4L> list = null;
        c0452Eq.A0N++;
        int scrollX = c0452Eq.getScrollX();
        int scrollY2 = c0452Eq.getScrollY();
        c0452Eq.onScrollChanged(scrollX, scrollY2, scrollX, scrollY2);
        C4L c4l = c0452Eq.A0i;
        char c2 = c4l != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    c4l = c4l;
                    c4l.A0V(c0452Eq, scrollY, i);
                    c2 = 3;
                    break;
                case 3:
                    c0452Eq = c0452Eq;
                    list = c0452Eq.A0m;
                    if (list == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    list = list;
                    size = list.size() - 1;
                    c2 = 5;
                    break;
                case 5:
                    if (size < 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0m.get(size).A0V(c0452Eq, scrollY, i);
                    size--;
                    c2 = 5;
                    break;
                case 7:
                    C0452Eq c0452Eq2 = c0452Eq;
                    c0452Eq2.A0N--;
                    return;
            }
        }
    }

    public final void A1a(int i, int i2) {
        C0452Eq c0452Eq = this;
        C4Y c4yA0E = null;
        int iA06 = c0452Eq.A01.A06();
        int i3 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 >= iA06) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    c4yA0E = A0E(c0452Eq.A01.A0A(i3));
                    if (c4yA0E == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0h()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 5:
                    c4yA0E = c4yA0E;
                    if (c4yA0E.A03 < i) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    c4yA0E = c4yA0E;
                    c4yA0E.A0W(i2, false);
                    c0452Eq.A0s.A0D = true;
                    c2 = 7;
                    break;
                case 7:
                    i3++;
                    c2 = 2;
                    break;
                case '\b':
                    C0452Eq c0452Eq2 = c0452Eq;
                    c0452Eq2.A0r.A0R(i, i2);
                    c0452Eq2.requestLayout();
                    return;
            }
        }
    }

    public final void A1b(int start, int end) {
        C0452Eq c0452Eq = this;
        int i = 0;
        int i2 = 0;
        C4Y c4yA0E = null;
        int i3 = 0;
        int i4 = 0;
        int iA06 = c0452Eq.A01.A06();
        int i5 = start < end ? 2 : 13;
        while (true) {
            switch (i5) {
                case 2:
                    i4 = start;
                    i2 = end;
                    i = -1;
                    i5 = 3;
                    break;
                case 3:
                    i3 = 0;
                    i5 = 4;
                    break;
                case 4:
                    if (i3 >= iA06) {
                        i5 = 14;
                        break;
                    } else {
                        i5 = 5;
                        break;
                    }
                case 5:
                    c0452Eq = c0452Eq;
                    c4yA0E = A0E(c0452Eq.A01.A0A(i3));
                    if (c4yA0E == null) {
                        i5 = 8;
                        break;
                    } else {
                        i5 = 6;
                        break;
                    }
                case 6:
                    c4yA0E = c4yA0E;
                    if (c4yA0E.A03 < i4) {
                        i5 = 8;
                        break;
                    } else {
                        i5 = 7;
                        break;
                    }
                case 7:
                    c4yA0E = c4yA0E;
                    int i6 = c4yA0E.A03;
                    if (i6 <= i2) {
                        i5 = 9;
                        break;
                    } else {
                        i5 = 8;
                        break;
                    }
                case 8:
                    i3++;
                    i5 = 4;
                    break;
                case 9:
                    c4yA0E = c4yA0E;
                    if (c4yA0E.A03 != start) {
                        i5 = 12;
                        break;
                    } else {
                        i5 = 10;
                        break;
                    }
                case 10:
                    c4yA0E = c4yA0E;
                    int i7 = end - start;
                    c4yA0E.A0W(i7, false);
                    i5 = 11;
                    break;
                case 11:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0s.A0D = true;
                    i5 = 8;
                    break;
                case 12:
                    c4yA0E = c4yA0E;
                    c4yA0E.A0W(i, false);
                    i5 = 11;
                    break;
                case 13:
                    i4 = end;
                    i2 = start;
                    i = 1;
                    i5 = 3;
                    break;
                case 14:
                    C0452Eq c0452Eq2 = c0452Eq;
                    c0452Eq2.A0r.A0S(start, end);
                    c0452Eq2.requestLayout();
                    return;
            }
        }
    }

    public final void A1c(int i, int i2) {
        A0k(i, i2, null);
    }

    public final void A1d(int positionEnd, int i, Object obj) {
        C0452Eq c0452Eq = this;
        View viewA0A = null;
        C4Y c4yA0E = null;
        int iA06 = c0452Eq.A01.A06();
        int i2 = positionEnd + i;
        int i3 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 >= iA06) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    viewA0A = c0452Eq.A01.A0A(i3);
                    c4yA0E = A0E(viewA0A);
                    if (c4yA0E == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0h()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i3++;
                    c2 = 2;
                    break;
                case 6:
                    c4yA0E = c4yA0E;
                    if (c4yA0E.A03 < positionEnd) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c4yA0E = c4yA0E;
                    if (c4yA0E.A03 >= i2) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    obj = obj;
                    viewA0A = viewA0A;
                    c4yA0E = c4yA0E;
                    c4yA0E.A0T(2);
                    c4yA0E.A0Y(obj);
                    ((C4H) viewA0A.getLayoutParams()).A01 = true;
                    c2 = 5;
                    break;
                case '\t':
                    c0452Eq.A0r.A0T(positionEnd, i);
                    return;
            }
        }
    }

    public final void A1e(int childCount, int i, boolean z) {
        C0452Eq c0452Eq = this;
        boolean z2 = false;
        C4Y c4yA0E = null;
        int i2 = childCount + i;
        int iA06 = c0452Eq.A01.A06();
        int i3 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 >= iA06) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    c4yA0E = A0E(c0452Eq.A01.A0A(i3));
                    if (c4yA0E == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0h()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 5:
                    c4yA0E = c4yA0E;
                    z2 = true;
                    if (c4yA0E.A03 < i2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    c4yA0E = c4yA0E;
                    c4yA0E.A0W(-i, z);
                    c0452Eq.A0s.A0D = z2;
                    c2 = 7;
                    break;
                case 7:
                    i3++;
                    c2 = 2;
                    break;
                case '\b':
                    c4yA0E = c4yA0E;
                    if (c4yA0E.A03 < childCount) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0452Eq = c0452Eq;
                    c4yA0E = c4yA0E;
                    c4yA0E.A0V(childCount - 1, -i, z);
                    c0452Eq.A0s.A0D = z2;
                    c2 = 7;
                    break;
                case '\n':
                    C0452Eq c0452Eq2 = c0452Eq;
                    c0452Eq2.A0r.A0U(childCount, i, z);
                    c0452Eq2.requestLayout();
                    return;
            }
        }
    }

    public final void A1f(View view) {
        C0452Eq c0452Eq = this;
        int i = 0;
        List<RecyclerView.OnChildAttachStateChangeListener> list = null;
        C4Y c4yA0E = A0E(view);
        char c2 = c0452Eq.A04 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4yA0E = c4yA0E;
                    if (c4yA0E == null) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    list = c0452Eq.A0l;
                    if (list == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    list = list;
                    i = list.size() - 1;
                    c2 = 5;
                    break;
                case 5:
                    if (i < 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0l.get(i);
                    i--;
                    c2 = 5;
                    break;
                case 7:
                    return;
            }
        }
    }

    public final void A1g(View view) {
        C0452Eq c0452Eq = this;
        int i = 0;
        List<RecyclerView.OnChildAttachStateChangeListener> list = null;
        C4Y c4yA0E = A0E(view);
        char c2 = c0452Eq.A04 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4yA0E = c4yA0E;
                    if (c4yA0E == null) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    list = c0452Eq.A0l;
                    if (list == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    list = list;
                    i = list.size() - 1;
                    c2 = 5;
                    break;
                case 5:
                    if (i < 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0l.get(i);
                    i--;
                    c2 = 5;
                    break;
                case 7:
                    return;
            }
        }
    }

    public final void A1h(C4L c4l) {
        if (this.A0m == null) {
            this.A0m = new ArrayList();
        }
        this.A0m.add(c4l);
    }

    public final void A1i(C4L c4l) {
        List<C4L> list = this.A0m;
        if (list != null) {
            list.remove(c4l);
        }
    }

    public final void A1j(C4V c4v) {
        C0452Eq c0452Eq = this;
        char c2 = c0452Eq.getScrollState() == 2 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    c4v = c4v;
                    OverScroller overScroller = c0452Eq.A08.A01;
                    c4v.A06 = overScroller.getFinalX() - overScroller.getCurrX();
                    c4v.A07 = overScroller.getFinalY() - overScroller.getCurrY();
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c4v = c4v;
                    c4v.A06 = 0;
                    c4v.A07 = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A1k(C4Y c4y, C4B c4b) {
        C0452Eq c0452Eq = this;
        c4y.A0U(0, 8192);
        char c2 = c0452Eq.A0s.A0E ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c4y = c4y;
                    if (!c4y.A0f()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4y = c4y;
                    if (!c4y.A0c()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 4:
                    c4y = c4y;
                    if (!c4y.A0h()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    c0452Eq = c0452Eq;
                    c4y = c4y;
                    c0452Eq.A0t.A08(c0452Eq.A0A(c4y), c4y);
                    c2 = 6;
                    break;
                case 6:
                    c0452Eq.A0t.A0F(c4y, c4b);
                    return;
            }
        }
    }

    public final void A1l(@NonNull C4Y c4y, @Nullable C4B c4b, @NonNull C4B c4b2) {
        c4y.A0Z(false);
        if (this.A05.A0C(c4y, c4b, c4b2)) {
            A1L();
        }
    }

    public final void A1m(@NonNull C4Y c4y, @NonNull C4B c4b, @Nullable C4B c4b2) {
        A0q(c4y);
        c4y.A0Z(false);
        if (this.A05.A0D(c4y, c4b, c4b2)) {
            A1L();
        }
    }

    public final void A1n(String str) {
        C0452Eq c0452Eq = this;
        char c2 = c0452Eq.A1s() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (str != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    throw new IllegalStateException(A0H(1150, 77, 63) + c0452Eq.A1G());
                case 4:
                    throw new IllegalStateException(str);
                case 5:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A0N <= 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    Log.w(A0H(1788, 12, 104), A0H(325, 280, 88), new IllegalStateException(A0H(195, 0, 109) + c0452Eq.A1G()));
                    c2 = 7;
                    break;
                case 7:
                    return;
            }
        }
    }

    public final void A1o(boolean z) {
        C0452Eq c0452Eq = this;
        c0452Eq.A0U--;
        char c2 = c0452Eq.A0U < 1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0U = 0;
                    if (!z) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0J();
                    c0452Eq.A0Y();
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A1p(boolean z) {
        C0452Eq c0452Eq = this;
        boolean z2 = false;
        char c2 = c0452Eq.A0O < 1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0O = 1;
                    c2 = 3;
                    break;
                case 3:
                    z2 = false;
                    if (!z) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    z2 = false;
                    c0452Eq.A0J = false;
                    c2 = 5;
                    break;
                case 5:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A0O != 1) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (!z) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0J) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0I) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\t':
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A06 == null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A04 == null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0X();
                    c2 = '\f';
                    break;
                case '\f':
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0I) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case '\r':
                    c0452Eq = c0452Eq;
                    c0452Eq.A0J = z2;
                    c2 = 14;
                    break;
                case 14:
                    c0452Eq.A0O--;
                    return;
            }
        }
    }

    public final boolean A1q() {
        boolean z = false;
        AccessibilityManager accessibilityManager = this.A10;
        char c2 = accessibilityManager != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    accessibilityManager = accessibilityManager;
                    if (!accessibilityManager.isEnabled()) {
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

    public final boolean A1r() {
        C0452Eq c0452Eq = this;
        boolean z = false;
        char c2 = c0452Eq.A0D ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0C) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A00.A0J()) {
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

    public final boolean A1s() {
        boolean z = false;
        char c2 = this.A0U > 0 ? (char) 2 : (char) 4;
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

    public final boolean A1t(int i) {
        return getScrollingChildHelper().A09(i);
    }

    public final boolean A1u(int i, int i2) {
        return getScrollingChildHelper().A0B(i, i2);
    }

    public final boolean A1v(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().A0D(i, i2, i3, i4, iArr, i5);
    }

    public final boolean A1w(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().A0F(i, i2, iArr, iArr2, i3);
    }

    public final boolean A1x(View view) {
        A1I();
        boolean zA0L = this.A01.A0L(view);
        if (zA0L) {
            C4Y c4yA0E = A0E(view);
            this.A0r.A0c(c4yA0E);
            this.A0r.A0b(c4yA0E);
        }
        A1p(!zA0L);
        return zA0L;
    }

    public final boolean A1y(C4Y c4y) {
        boolean z = false;
        C4C c4c = this.A05;
        char c2 = c4c != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4y = c4y;
                    c4c = c4c;
                    if (!c4c.A0K(c4y, c4y.A0L())) {
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

    @VisibleForTesting
    public final boolean A1z(C4Y c4y, int i) {
        if (A1s()) {
            c4y.A02 = i;
            this.A0w.add(c4y);
            return false;
        }
        C2v.A09(c4y.A0H, i);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0452Eq c0452Eq = this;
        C4G c4g = c0452Eq.A06;
        char c2 = c4g != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    arrayList = arrayList;
                    c4g = c4g;
                    if (!c4g.A1g(c0452Eq, arrayList, i, i2)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    arrayList = arrayList;
                    super.addFocusables(arrayList, i, i2);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0452Eq c0452Eq = this;
        boolean z = false;
        char c2 = layoutParams instanceof C4H ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    layoutParams = layoutParams;
                    if (!c0452Eq.A06.A1c((C4H) layoutParams)) {
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
    public final int computeHorizontalScrollExtent() {
        C0452Eq c0452Eq = this;
        C4G c4g = c0452Eq.A06;
        int iA1j = 0;
        char c2 = c4g == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 0;
                case 3:
                    c4g = c4g;
                    if (!c4g.A24()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    iA1j = c0452Eq.A06.A1j(c0452Eq.A0s);
                    c2 = 5;
                    break;
                case 5:
                    return iA1j;
            }
        }
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        C0452Eq c0452Eq = this;
        C4G c4g = c0452Eq.A06;
        int iA1k = 0;
        char c2 = c4g == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 0;
                case 3:
                    c4g = c4g;
                    if (!c4g.A24()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    iA1k = c0452Eq.A06.A1k(c0452Eq.A0s);
                    c2 = 5;
                    break;
                case 5:
                    return iA1k;
            }
        }
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        C0452Eq c0452Eq = this;
        C4G c4g = c0452Eq.A06;
        int iA1l = 0;
        char c2 = c4g == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 0;
                case 3:
                    c4g = c4g;
                    if (!c4g.A24()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    iA1l = c0452Eq.A06.A1l(c0452Eq.A0s);
                    c2 = 5;
                    break;
                case 5:
                    return iA1l;
            }
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        C0452Eq c0452Eq = this;
        C4G c4g = c0452Eq.A06;
        int iA1m = 0;
        char c2 = c4g == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 0;
                case 3:
                    c4g = c4g;
                    if (!c4g.A25()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    iA1m = c0452Eq.A06.A1m(c0452Eq.A0s);
                    c2 = 5;
                    break;
                case 5:
                    return iA1m;
            }
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        C0452Eq c0452Eq = this;
        C4G c4g = c0452Eq.A06;
        int iA1n = 0;
        char c2 = c4g == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 0;
                case 3:
                    c4g = c4g;
                    if (!c4g.A25()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    iA1n = c0452Eq.A06.A1n(c0452Eq.A0s);
                    c2 = 5;
                    break;
                case 5:
                    return iA1n;
            }
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        C0452Eq c0452Eq = this;
        C4G c4g = c0452Eq.A06;
        int iA1o = 0;
        char c2 = c4g == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 0;
                case 3:
                    c4g = c4g;
                    if (!c4g.A25()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    iA1o = c0452Eq.A06.A1o(c0452Eq.A0s);
                    c2 = 5;
                    break;
                case 5:
                    return iA1o;
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().A08(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().A07(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().A0E(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().A0C(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        dispatchThawSelfOnly(container);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        dispatchFreezeSelfOnly(container);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        C0452Eq c0452Eq = this;
        int restore = 0;
        EdgeEffect edgeEffect = null;
        int i = 0;
        int iSave = 0;
        int iSave2 = 0;
        int paddingBottom = 0;
        int paddingTop = 0;
        EdgeEffect edgeEffect2 = null;
        EdgeEffect edgeEffect3 = null;
        int iSave3 = 0;
        int i2 = 0;
        EdgeEffect edgeEffect4 = null;
        int width = 0;
        EdgeEffect edgeEffect5 = null;
        int iSave4 = 0;
        EdgeEffect edgeEffect6 = null;
        EdgeEffect edgeEffect7 = null;
        int i3 = 0;
        int i4 = 0;
        EdgeEffect edgeEffect8 = null;
        super.draw(canvas2);
        int size = c0452Eq.A0v.size();
        int i5 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i5 >= size) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0v.get(i5);
                    i5++;
                    c2 = 2;
                    break;
                case 4:
                    c0452Eq = c0452Eq;
                    i3 = 0;
                    edgeEffect3 = c0452Eq.A0a;
                    restore = 1;
                    if (edgeEffect3 == null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    edgeEffect3 = edgeEffect3;
                    if (!edgeEffect3.isFinished()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    canvas2 = canvas2;
                    iSave4 = canvas2.save();
                    if (!c0452Eq.A0B) {
                        c2 = '1';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0452Eq = c0452Eq;
                    paddingBottom = c0452Eq.getPaddingBottom();
                    c2 = '\b';
                    break;
                case '\b':
                    c0452Eq = c0452Eq;
                    canvas2 = canvas2;
                    canvas2.rotate(270.0f);
                    canvas2.translate((-c0452Eq.getHeight()) + paddingBottom, 0.0f);
                    edgeEffect4 = c0452Eq.A0a;
                    if (edgeEffect4 == null) {
                        c2 = '0';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    canvas2 = canvas2;
                    edgeEffect4 = edgeEffect4;
                    if (!edgeEffect4.draw(canvas2)) {
                        c2 = '0';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    i2 = 1;
                    c2 = 11;
                    break;
                case 11:
                    canvas2 = canvas2;
                    i3 = i2;
                    canvas2.restoreToCount(iSave4);
                    c2 = '\f';
                    break;
                case '\f':
                    c0452Eq = c0452Eq;
                    edgeEffect6 = c0452Eq.A0c;
                    if (edgeEffect6 == null) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    edgeEffect6 = edgeEffect6;
                    if (!edgeEffect6.isFinished()) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 14:
                    c0452Eq = c0452Eq;
                    canvas2 = canvas2;
                    iSave3 = canvas2.save();
                    if (!c0452Eq.A0B) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c0452Eq = c0452Eq;
                    canvas2 = canvas2;
                    canvas2.translate(c0452Eq.getPaddingLeft(), c0452Eq.getPaddingTop());
                    c2 = 16;
                    break;
                case 16:
                    c0452Eq = c0452Eq;
                    edgeEffect7 = c0452Eq.A0c;
                    if (edgeEffect7 == null) {
                        c2 = '/';
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    canvas2 = canvas2;
                    edgeEffect7 = edgeEffect7;
                    if (!edgeEffect7.draw(canvas2)) {
                        c2 = '/';
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    i4 = 1;
                    c2 = 19;
                    break;
                case 19:
                    canvas2 = canvas2;
                    i3 |= i4;
                    canvas2.restoreToCount(iSave3);
                    c2 = 20;
                    break;
                case 20:
                    c0452Eq = c0452Eq;
                    edgeEffect8 = c0452Eq.A0b;
                    if (edgeEffect8 == null) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    edgeEffect8 = edgeEffect8;
                    if (!edgeEffect8.isFinished()) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 22:
                    c0452Eq = c0452Eq;
                    canvas2 = canvas2;
                    iSave = canvas2.save();
                    width = c0452Eq.getWidth();
                    if (!c0452Eq.A0B) {
                        c2 = '.';
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    c0452Eq = c0452Eq;
                    paddingTop = c0452Eq.getPaddingTop();
                    c2 = 24;
                    break;
                case 24:
                    c0452Eq = c0452Eq;
                    canvas2 = canvas2;
                    canvas2.rotate(90.0f);
                    canvas2.translate(-paddingTop, -width);
                    edgeEffect2 = c0452Eq.A0b;
                    if (edgeEffect2 == null) {
                        c2 = '-';
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    canvas2 = canvas2;
                    edgeEffect2 = edgeEffect2;
                    if (!edgeEffect2.draw(canvas2)) {
                        c2 = '-';
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    i = 1;
                    c2 = 27;
                    break;
                case 27:
                    canvas2 = canvas2;
                    i3 |= i;
                    canvas2.restoreToCount(iSave);
                    c2 = 28;
                    break;
                case 28:
                    c0452Eq = c0452Eq;
                    edgeEffect5 = c0452Eq.A0Z;
                    if (edgeEffect5 == null) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = 29;
                        break;
                    }
                case 29:
                    edgeEffect5 = edgeEffect5;
                    if (!edgeEffect5.isFinished()) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = '#';
                        break;
                    }
                case 30:
                    c0452Eq = c0452Eq;
                    canvas2 = canvas2;
                    iSave2 = canvas2.save();
                    canvas2.rotate(180.0f);
                    if (!c0452Eq.A0B) {
                        c2 = ',';
                        break;
                    } else {
                        c2 = 31;
                        break;
                    }
                case 31:
                    c0452Eq = c0452Eq;
                    canvas2 = canvas2;
                    canvas2.translate((-c0452Eq.getWidth()) + c0452Eq.getPaddingRight(), (-c0452Eq.getHeight()) + c0452Eq.getPaddingBottom());
                    c2 = ' ';
                    break;
                case ' ':
                    c0452Eq = c0452Eq;
                    edgeEffect = c0452Eq.A0Z;
                    if (edgeEffect == null) {
                        c2 = '+';
                        break;
                    } else {
                        c2 = '!';
                        break;
                    }
                case '!':
                    canvas2 = canvas2;
                    edgeEffect = edgeEffect;
                    if (!edgeEffect.draw(canvas2)) {
                        c2 = '+';
                        break;
                    } else {
                        c2 = '\"';
                        break;
                    }
                case '\"':
                    canvas2 = canvas2;
                    i3 |= restore;
                    canvas2.restoreToCount(iSave2);
                    c2 = '#';
                    break;
                case '#':
                    if (i3 != 0) {
                        c2 = '(';
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case '$':
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A05 == null) {
                        c2 = '(';
                        break;
                    } else {
                        c2 = '%';
                        break;
                    }
                case '%':
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A0v.size() <= 0) {
                        c2 = '(';
                        break;
                    } else {
                        c2 = '&';
                        break;
                    }
                case '&':
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A05.A0J()) {
                        c2 = '(';
                        break;
                    } else {
                        c2 = '\'';
                        break;
                    }
                case '\'':
                    i3 = 1;
                    c2 = '(';
                    break;
                case '(':
                    if (i3 == 0) {
                        c2 = '*';
                        break;
                    } else {
                        c2 = ')';
                        break;
                    }
                case ')':
                    c0452Eq = c0452Eq;
                    C2v.A07(c0452Eq);
                    c2 = '*';
                    break;
                case '*':
                    return;
                case '+':
                    restore = 0;
                    c2 = '\"';
                    break;
                case ',':
                    c0452Eq = c0452Eq;
                    canvas2 = canvas2;
                    canvas2.translate(-c0452Eq.getWidth(), -c0452Eq.getHeight());
                    c2 = ' ';
                    break;
                case '-':
                    i = 0;
                    c2 = 27;
                    break;
                case '.':
                    paddingTop = 0;
                    c2 = 24;
                    break;
                case '/':
                    i4 = 0;
                    c2 = 19;
                    break;
                case '0':
                    i2 = 0;
                    c2 = 11;
                    break;
                case '1':
                    paddingBottom = 0;
                    c2 = '\b';
                    break;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        int i2 = i;
        View view2 = view;
        C0452Eq c0452Eq = this;
        View viewFocusSearch = null;
        View viewFindNextFocus = null;
        int i3 = 0;
        int absDir = 0;
        int i4 = 0;
        int i5 = 0;
        FocusFinder focusFinder = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        boolean z = false;
        boolean z2 = false;
        View viewA0u = c0452Eq.A06.A0u(view2, i2);
        char c2 = viewA0u != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return viewA0u;
                case 3:
                    c0452Eq = c0452Eq;
                    i3 = 1;
                    if (c0452Eq.A04 == null) {
                        c2 = '&';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A06 == null) {
                        c2 = '&';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A1s()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '&';
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0I) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '&';
                        break;
                    }
                case 7:
                    absDir = 1;
                    c2 = '\b';
                    break;
                case '\b':
                    focusFinder = FocusFinder.getInstance();
                    if (absDir == 0) {
                        c2 = '\'';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    i4 = 2;
                    if (i2 == 2) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (i2 != i3) {
                        c2 = '\'';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0452Eq = c0452Eq;
                    i8 = 0;
                    if (!c0452Eq.A06.A25()) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    if (i2 != i4) {
                        c2 = '%';
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    i5 = 130;
                    c2 = 14;
                    break;
                case 14:
                    c0452Eq = c0452Eq;
                    view2 = view2;
                    focusFinder = focusFinder;
                    View found = focusFinder.findNextFocus(c0452Eq, view2, i5);
                    if (found != null) {
                        c2 = '$';
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    i7 = 1;
                    c2 = 16;
                    break;
                case 16:
                    i8 = i7;
                    if (!A1E) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    i2 = i5;
                    c2 = 18;
                    break;
                case 18:
                    if (i8 != 0) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A06.A24()) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A06.A0a() != i3) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    z = true;
                    c2 = 22;
                    break;
                case 22:
                    if (i2 != i4) {
                        c2 = '\"';
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    z2 = true;
                    c2 = 24;
                    break;
                case 24:
                    if (!(z2 ^ z)) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    i6 = 66;
                    c2 = 26;
                    break;
                case 26:
                    c0452Eq = c0452Eq;
                    view2 = view2;
                    focusFinder = focusFinder;
                    if (focusFinder.findNextFocus(c0452Eq, view2, i6) != null) {
                        c2 = ' ';
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    i8 = i3;
                    if (!A1E) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    i2 = i6;
                    c2 = 29;
                    break;
                case 29:
                    if (i8 == 0) {
                        c2 = '-';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    c0452Eq = c0452Eq;
                    view2 = view2;
                    c0452Eq.A1H();
                    if (c0452Eq.A1D(view2) != null) {
                        c2 = ',';
                        break;
                    } else {
                        c2 = 31;
                        break;
                    }
                case 31:
                    View found2 = (View) null;
                    return found2;
                case ' ':
                    i3 = 0;
                    c2 = 27;
                    break;
                case '!':
                    i6 = 17;
                    c2 = 26;
                    break;
                case '\"':
                    z2 = false;
                    c2 = 24;
                    break;
                case '#':
                    z = false;
                    c2 = 22;
                    break;
                case '$':
                    i7 = 0;
                    c2 = 16;
                    break;
                case '%':
                    i5 = 33;
                    c2 = 14;
                    break;
                case '&':
                    absDir = 0;
                    c2 = '\b';
                    break;
                case '\'':
                    c0452Eq = c0452Eq;
                    view2 = view2;
                    focusFinder = focusFinder;
                    viewFindNextFocus = focusFinder.findNextFocus(c0452Eq, view2, i2);
                    if (viewFindNextFocus != null) {
                        c2 = '.';
                        break;
                    } else {
                        c2 = '(';
                        break;
                    }
                case '(':
                    if (absDir == 0) {
                        c2 = '.';
                        break;
                    } else {
                        c2 = ')';
                        break;
                    }
                case ')':
                    c0452Eq = c0452Eq;
                    view2 = view2;
                    c0452Eq.A1H();
                    View found3 = c0452Eq.A1D(view2);
                    if (found3 != null) {
                        c2 = '+';
                        break;
                    } else {
                        c2 = '*';
                        break;
                    }
                case '*':
                    View found4 = (View) null;
                    return found4;
                case '+':
                    c0452Eq = c0452Eq;
                    view2 = view2;
                    c0452Eq.A1I();
                    viewFindNextFocus = c0452Eq.A06.A1r(view2, i2, c0452Eq.A0r, c0452Eq.A0s);
                    c0452Eq.A1p(false);
                    c2 = '.';
                    break;
                case ',':
                    c0452Eq = c0452Eq;
                    view2 = view2;
                    c0452Eq.A1I();
                    c0452Eq.A06.A1r(view2, i2, c0452Eq.A0r, c0452Eq.A0s);
                    c0452Eq.A1p(false);
                    c2 = '-';
                    break;
                case '-':
                    c0452Eq = c0452Eq;
                    view2 = view2;
                    focusFinder = focusFinder;
                    viewFindNextFocus = focusFinder.findNextFocus(c0452Eq, view2, i2);
                    c2 = '.';
                    break;
                case '.':
                    viewFindNextFocus = viewFindNextFocus;
                    if (viewFindNextFocus == null) {
                        c2 = '3';
                        break;
                    } else {
                        c2 = '/';
                        break;
                    }
                case '/':
                    viewFindNextFocus = viewFindNextFocus;
                    if (!viewFindNextFocus.hasFocusable()) {
                        c2 = '0';
                        break;
                    } else {
                        c2 = '3';
                        break;
                    }
                case '0':
                    c0452Eq = c0452Eq;
                    if (c0452Eq.getFocusedChild() != null) {
                        c2 = '2';
                        break;
                    } else {
                        c2 = '1';
                        break;
                    }
                case '1':
                    View found5 = super.focusSearch(view2, i2);
                    return found5;
                case '2':
                    c0452Eq.A0o(viewFindNextFocus, null);
                    return view2;
                case '3':
                    c0452Eq = c0452Eq;
                    view2 = view2;
                    viewFindNextFocus = viewFindNextFocus;
                    if (!c0452Eq.A15(view2, viewFindNextFocus, i2)) {
                        c2 = '6';
                        break;
                    } else {
                        c2 = '4';
                        break;
                    }
                case '4':
                    viewFindNextFocus = viewFindNextFocus;
                    viewFocusSearch = viewFindNextFocus;
                    c2 = '5';
                    break;
                case '5':
                    return viewFocusSearch;
                case '6':
                    c0452Eq = c0452Eq;
                    view2 = view2;
                    viewFocusSearch = super.focusSearch(view2, i2);
                    c2 = '5';
                    break;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C4G c4g = this.A06;
        if (c4g != null) {
            return c4g.A1s();
        }
        throw new IllegalStateException(A0H(1755, 33, 65) + A1G());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C4G c4g = this.A06;
        if (c4g != null) {
            return c4g.A0v(getContext(), attributeSet);
        }
        throw new IllegalStateException(A0H(1755, 33, 65) + A1G());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C4G c4g = this.A06;
        if (c4g != null) {
            return c4g.A0w(layoutParams);
        }
        throw new IllegalStateException(A0H(1755, 33, 65) + A1G());
    }

    public AnonymousClass44 getAdapter() {
        return this.A04;
    }

    @Override // android.view.View
    public int getBaseline() {
        C4G c4g = this.A06;
        if (c4g != null) {
            return c4g.A0V();
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        AnonymousClass47 anonymousClass47 = this.A0e;
        if (anonymousClass47 == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return anonymousClass47.onGetChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.A0B;
    }

    public TG getCompatAccessibilityDelegate() {
        return this.A09;
    }

    public C4C getItemAnimator() {
        return this.A05;
    }

    public C4G getLayoutManager() {
        return this.A06;
    }

    public int getMaxFlingVelocity() {
        return this.A0x;
    }

    public int getMinFlingVelocity() {
        return this.A0y;
    }

    public long getNanoTime() {
        if (A1D) {
            return System.nanoTime();
        }
        return 0L;
    }

    @Nullable
    public C4J getOnFlingListener() {
        return this.A0g;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0o;
    }

    public C4N getRecycledViewPool() {
        return this.A0r.A0H();
    }

    public int getScrollState() {
        return this.A0W;
    }

    private C01602d getScrollingChildHelper() {
        if (this.A0d == null) {
            this.A0d = new C01602d(this);
        }
        return this.A0d;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().A05();
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.A0F;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().A06();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C0452Eq c0452Eq = this;
        float refreshRate = 0.0f;
        C4G c4g = null;
        Display displayA04 = null;
        float refreshRate2 = 0.0f;
        super.onAttachedToWindow();
        c0452Eq.A0U = 0;
        boolean z = true;
        c0452Eq.A0F = true;
        float displayRefreshRate = c0452Eq.A0D ? 2.8E-45f : 2.0E-44f;
        while (true) {
            switch (displayRefreshRate) {
                case 2.8E-45f:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.isLayoutRequested()) {
                        displayRefreshRate = 4.2E-45f;
                        break;
                    } else {
                        displayRefreshRate = 2.0E-44f;
                        break;
                    }
                case 4.2E-45f:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0D = z;
                    c4g = c0452Eq.A06;
                    if (c4g == null) {
                        displayRefreshRate = 7.0E-45f;
                        break;
                    } else {
                        displayRefreshRate = 5.6E-45f;
                        break;
                    }
                case 5.6E-45f:
                    c0452Eq = c0452Eq;
                    c4g = c4g;
                    c4g.A1N(c0452Eq);
                    displayRefreshRate = 7.0E-45f;
                    break;
                case 7.0E-45f:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0K = false;
                    if (!A1D) {
                        displayRefreshRate = 1.8E-44f;
                        break;
                    } else {
                        displayRefreshRate = 8.4E-45f;
                        break;
                    }
                case 8.4E-45f:
                    c0452Eq = c0452Eq;
                    c0452Eq.A03 = RunnableC01993r.A06.get();
                    if (c0452Eq.A03 != null) {
                        displayRefreshRate = 1.7E-44f;
                        break;
                    } else {
                        displayRefreshRate = 9.8E-45f;
                        break;
                    }
                case 9.8E-45f:
                    c0452Eq = c0452Eq;
                    c0452Eq.A03 = new RunnableC01993r();
                    displayA04 = C2v.A04(c0452Eq);
                    refreshRate = 60.0f;
                    if (!c0452Eq.isInEditMode()) {
                        displayRefreshRate = 1.1E-44f;
                        break;
                    } else {
                        displayRefreshRate = 1.5E-44f;
                        break;
                    }
                case 1.1E-44f:
                    displayA04 = displayA04;
                    if (displayA04 == null) {
                        displayRefreshRate = 1.5E-44f;
                        break;
                    } else {
                        displayRefreshRate = 1.3E-44f;
                        break;
                    }
                case 1.3E-44f:
                    displayA04 = displayA04;
                    refreshRate2 = displayA04.getRefreshRate();
                    if (refreshRate2 < 30.0f) {
                        displayRefreshRate = 1.5E-44f;
                        break;
                    } else {
                        displayRefreshRate = 1.4E-44f;
                        break;
                    }
                case 1.4E-44f:
                    refreshRate = refreshRate2;
                    displayRefreshRate = 1.5E-44f;
                    break;
                case 1.5E-44f:
                    c0452Eq = c0452Eq;
                    c0452Eq.A03.A00 = (long) (1.0E9f / refreshRate);
                    RunnableC01993r.A06.set(c0452Eq.A03);
                    displayRefreshRate = 1.7E-44f;
                    break;
                case 1.7E-44f:
                    c0452Eq = c0452Eq;
                    c0452Eq.A03.A09(c0452Eq);
                    displayRefreshRate = 1.8E-44f;
                    break;
                case 1.8E-44f:
                    return;
                case 2.0E-44f:
                    z = false;
                    displayRefreshRate = 4.2E-45f;
                    break;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0452Eq c0452Eq = this;
        RunnableC01993r runnableC01993r = null;
        C4G c4g = null;
        super.onDetachedFromWindow();
        C4C c4c = c0452Eq.A05;
        char c2 = c4c != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c4c = c4c;
                    c4c.A0G();
                    c2 = 3;
                    break;
                case 3:
                    c0452Eq = c0452Eq;
                    c0452Eq.A1P();
                    c0452Eq.A0F = false;
                    c4g = c0452Eq.A06;
                    if (c4g == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    c4g = c4g;
                    c4g.A1U(c0452Eq, c0452Eq.A0r);
                    c2 = 5;
                    break;
                case 5:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0w.clear();
                    c0452Eq.removeCallbacks(c0452Eq.A0k);
                    c0452Eq.A0t.A07();
                    if (!A1D) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    runnableC01993r = c0452Eq.A03;
                    if (runnableC01993r == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0452Eq = c0452Eq;
                    runnableC01993r = runnableC01993r;
                    runnableC01993r.A0A(c0452Eq);
                    c0452Eq.A03 = null;
                    c2 = '\b';
                    break;
                case '\b':
                    return;
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C0452Eq c0452Eq = this;
        super.onDraw(canvas);
        int size = c0452Eq.A0v.size();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= size) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0v.get(i);
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        C0452Eq c0452Eq = this;
        float hScroll = 0.0f;
        float axisValue = 0.0f;
        float f = 0.0f;
        float f2 = 0.0f;
        char c2 = c0452Eq.A06 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0I) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    motionEvent = motionEvent;
                    if (motionEvent.getAction() != 8) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    motionEvent = motionEvent;
                    if ((motionEvent.getSource() & 2) == 0) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A06.A25()) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    motionEvent = motionEvent;
                    f = -motionEvent.getAxisValue(9);
                    c2 = '\t';
                    break;
                case '\t':
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A06.A24()) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    motionEvent = motionEvent;
                    axisValue = motionEvent.getAxisValue(10);
                    c2 = 11;
                    break;
                case 11:
                    f2 = 0.0f;
                    if (f != 0.0f) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    if (axisValue == f2) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c0452Eq = c0452Eq;
                    motionEvent = motionEvent;
                    c0452Eq.A12((int) (c0452Eq.A0L * axisValue), (int) (c0452Eq.A0M * f), motionEvent);
                    c2 = 14;
                    break;
                case 14:
                    return false;
                case 15:
                    axisValue = 0.0f;
                    c2 = 11;
                    break;
                case 16:
                    f = 0.0f;
                    c2 = '\t';
                    break;
                case 17:
                    motionEvent = motionEvent;
                    if ((motionEvent.getSource() & 4194304) == 0) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c0452Eq = c0452Eq;
                    motionEvent = motionEvent;
                    hScroll = motionEvent.getAxisValue(26);
                    if (!c0452Eq.A06.A25()) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    f = -hScroll;
                    axisValue = 0.0f;
                    c2 = 11;
                    break;
                case 20:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A06.A24()) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    f = 0.0f;
                    axisValue = hScroll;
                    c2 = 11;
                    break;
                case 22:
                    f = 0.0f;
                    axisValue = 0.0f;
                    c2 = 11;
                    break;
                case 23:
                    f = 0.0f;
                    axisValue = 0.0f;
                    c2 = 11;
                    break;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        C0452Eq c0452Eq = this;
        int i = 0;
        boolean z = false;
        int x = 0;
        C4G c4g = null;
        boolean z2 = false;
        int i2 = 0;
        int actionIndex = 0;
        int actionMasked = 0;
        int y = 0;
        int iFindPointerIndex = 0;
        boolean zA24 = false;
        float f = 0.0f;
        int i3 = 0;
        boolean zA25 = false;
        int i4 = 0;
        boolean z3 = false;
        int i5 = c0452Eq.A0I ? 2 : 3;
        while (true) {
            switch (i5) {
                case 2:
                    return false;
                case 3:
                    c0452Eq = c0452Eq;
                    motionEvent2 = motionEvent2;
                    z2 = true;
                    z2 = true;
                    if (!c0452Eq.A14(motionEvent2)) {
                        i5 = 5;
                        break;
                    } else {
                        i5 = 4;
                        break;
                    }
                case 4:
                    c0452Eq.A0I();
                    return z2;
                case 5:
                    c0452Eq = c0452Eq;
                    c4g = c0452Eq.A06;
                    if (c4g != null) {
                        i5 = 7;
                        break;
                    } else {
                        i5 = 6;
                        break;
                    }
                case 6:
                    return false;
                case 7:
                    c0452Eq = c0452Eq;
                    c4g = c4g;
                    zA24 = c4g.A24();
                    zA25 = c0452Eq.A06.A25();
                    if (c0452Eq.A0Y != null) {
                        i5 = 9;
                        break;
                    } else {
                        i5 = 8;
                        break;
                    }
                case 8:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0Y = VelocityTracker.obtain();
                    i5 = 9;
                    break;
                case 9:
                    c0452Eq = c0452Eq;
                    motionEvent2 = motionEvent2;
                    c0452Eq.A0Y.addMovement(motionEvent2);
                    actionMasked = motionEvent2.getActionMasked();
                    actionIndex = motionEvent2.getActionIndex();
                    i2 = 2;
                    f = 0.5f;
                    if (actionMasked == 0) {
                        i5 = 33;
                        break;
                    } else {
                        i5 = 10;
                        break;
                    }
                case 10:
                    if (actionMasked == z2) {
                        i5 = 32;
                        break;
                    } else {
                        i5 = 11;
                        break;
                    }
                case 11:
                    if (actionMasked == i2) {
                        i5 = 21;
                        break;
                    } else {
                        i5 = 12;
                        break;
                    }
                case 12:
                    if (actionMasked == 3) {
                        i5 = 20;
                        break;
                    } else {
                        i5 = 13;
                        break;
                    }
                case 13:
                    if (actionMasked == 5) {
                        i5 = 19;
                        break;
                    } else {
                        i5 = 14;
                        break;
                    }
                case 14:
                    if (actionMasked == 6) {
                        i5 = 18;
                        break;
                    } else {
                        i5 = 15;
                        break;
                    }
                case 15:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A0W != z2) {
                        i5 = 17;
                        break;
                    } else {
                        i5 = 16;
                        break;
                    }
                case 16:
                    z3 = true;
                    i5 = 17;
                    break;
                case 17:
                    return z3;
                case 18:
                    c0452Eq = c0452Eq;
                    motionEvent2 = motionEvent2;
                    c0452Eq.A0m(motionEvent2);
                    i5 = 15;
                    break;
                case 19:
                    c0452Eq = c0452Eq;
                    motionEvent2 = motionEvent2;
                    c0452Eq.A0V = motionEvent2.getPointerId(actionIndex);
                    int x2 = (int) (motionEvent2.getX(actionIndex) + f);
                    c0452Eq.A0S = x2;
                    c0452Eq.A0Q = x2;
                    int y2 = (int) (motionEvent2.getY(actionIndex) + f);
                    c0452Eq.A0T = y2;
                    c0452Eq.A0R = y2;
                    i5 = 15;
                    break;
                case 20:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0I();
                    i5 = 15;
                    break;
                case 21:
                    c0452Eq = c0452Eq;
                    motionEvent2 = motionEvent2;
                    iFindPointerIndex = motionEvent2.findPointerIndex(c0452Eq.A0V);
                    if (iFindPointerIndex >= 0) {
                        i5 = 23;
                        break;
                    } else {
                        i5 = 22;
                        break;
                    }
                case 22:
                    Log.e(A0H(1788, 12, 104), A0H(640, 46, 106) + c0452Eq.A0V + A0H(150, 45, 110));
                    return false;
                case 23:
                    c0452Eq = c0452Eq;
                    motionEvent2 = motionEvent2;
                    x = (int) (motionEvent2.getX(iFindPointerIndex) + f);
                    y = (int) (motionEvent2.getY(iFindPointerIndex) + f);
                    if (c0452Eq.A0W == z2) {
                        i5 = 15;
                        break;
                    } else {
                        i5 = 24;
                        break;
                    }
                case 24:
                    c0452Eq = c0452Eq;
                    i3 = x - c0452Eq.A0Q;
                    i4 = y - c0452Eq.A0R;
                    z = false;
                    if (!zA24) {
                        i5 = 27;
                        break;
                    } else {
                        i5 = 25;
                        break;
                    }
                case 25:
                    c0452Eq = c0452Eq;
                    if (Math.abs(i3) <= c0452Eq.A0X) {
                        i5 = 27;
                        break;
                    } else {
                        i5 = 26;
                        break;
                    }
                case 26:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0S = x;
                    z = true;
                    i5 = 27;
                    break;
                case 27:
                    if (!zA25) {
                        i5 = 30;
                        break;
                    } else {
                        i5 = 28;
                        break;
                    }
                case 28:
                    c0452Eq = c0452Eq;
                    if (Math.abs(i4) <= c0452Eq.A0X) {
                        i5 = 30;
                        break;
                    } else {
                        i5 = 29;
                        break;
                    }
                case 29:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0T = y;
                    z = true;
                    i5 = 30;
                    break;
                case 30:
                    if (!z) {
                        i5 = 15;
                        break;
                    } else {
                        i5 = 31;
                        break;
                    }
                case 31:
                    c0452Eq = c0452Eq;
                    c0452Eq.setScrollState(z2 ? 1 : 0);
                    i5 = 15;
                    break;
                case 32:
                    c0452Eq = c0452Eq;
                    z3 = false;
                    c0452Eq.A0Y.clear();
                    c0452Eq.A1V(0);
                    i5 = 15;
                    break;
                case 33:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0n) {
                        i5 = 35;
                        break;
                    } else {
                        i5 = 34;
                        break;
                    }
                case 34:
                    c0452Eq = c0452Eq;
                    z3 = false;
                    c0452Eq.A0n = false;
                    i5 = 35;
                    break;
                case 35:
                    c0452Eq = c0452Eq;
                    motionEvent2 = motionEvent2;
                    c0452Eq.A0V = motionEvent2.getPointerId(z3 ? 1 : 0);
                    int x3 = (int) (motionEvent2.getX() + f);
                    c0452Eq.A0S = x3;
                    c0452Eq.A0Q = x3;
                    int y3 = (int) (motionEvent2.getY() + f);
                    c0452Eq.A0T = y3;
                    c0452Eq.A0R = y3;
                    if (c0452Eq.A0W != i2) {
                        i5 = 37;
                        break;
                    } else {
                        i5 = 36;
                        break;
                    }
                case 36:
                    c0452Eq = c0452Eq;
                    c0452Eq.getParent().requestDisallowInterceptTouchEvent(z2);
                    c0452Eq.setScrollState(z2 ? 1 : 0);
                    i5 = 37;
                    break;
                case 37:
                    c0452Eq = c0452Eq;
                    int[] iArr = c0452Eq.A15;
                    iArr[z2 ? 1 : 0] = z3 ? 1 : 0;
                    iArr[z3 ? 1 : 0] = z3 ? 1 : 0;
                    i = 0;
                    if (!zA24) {
                        i5 = 39;
                        break;
                    } else {
                        i5 = 38;
                        break;
                    }
                case 38:
                    i = 0 | 1;
                    i5 = 39;
                    break;
                case 39:
                    if (!zA25) {
                        i5 = 41;
                        break;
                    } else {
                        i5 = 40;
                        break;
                    }
                case 40:
                    i |= 2;
                    i5 = 41;
                    break;
                case 41:
                    c0452Eq = c0452Eq;
                    c0452Eq.A1u(i, z3 ? 1 : 0);
                    i5 = 15;
                    break;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C2I.A01(A0H(139, 11, 105));
        A0X();
        C2I.A00();
        this.A0D = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C0452Eq c0452Eq = this;
        boolean z = false;
        boolean z2 = false;
        int mode = 0;
        AnonymousClass44 anonymousClass44 = null;
        int i3 = 0;
        C4G c4g = c0452Eq.A06;
        char c2 = c4g == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq.A1Y(i, i2);
                    return;
                case 3:
                    c4g = c4g;
                    z = true;
                    z2 = false;
                    z2 = false;
                    if (!c4g.A06) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    int mode2 = View.MeasureSpec.getMode(i);
                    mode = View.MeasureSpec.getMode(i2);
                    i3 = 1073741824;
                    if (mode2 != 1073741824) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (mode != i3) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    z2 = true;
                    c2 = 7;
                    break;
                case 7:
                    c0452Eq = c0452Eq;
                    c0452Eq.A06.A1J(c0452Eq.A0r, c0452Eq.A0s, i, i2);
                    if (!z2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A04 != null) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return;
                case '\n':
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0E) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    C0452Eq c0452Eq2 = c0452Eq;
                    c0452Eq2.A06.A1J(c0452Eq2.A0r, c0452Eq2.A0s, i, i2);
                    return;
                case '\f':
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0A) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c0452Eq = c0452Eq;
                    c0452Eq.A1I();
                    c0452Eq.A1J();
                    c0452Eq.A0O();
                    c0452Eq.A1K();
                    if (!c0452Eq.A0s.A0B) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0s.A09 = z;
                    c2 = 15;
                    break;
                case 15:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0A = z2;
                    c0452Eq.A1p(z2);
                    c2 = 16;
                    break;
                case 16:
                    c0452Eq = c0452Eq;
                    anonymousClass44 = c0452Eq.A04;
                    if (anonymousClass44 == null) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c0452Eq = c0452Eq;
                    anonymousClass44 = anonymousClass44;
                    c0452Eq.A0s.A03 = anonymousClass44.A0D();
                    c2 = 18;
                    break;
                case 18:
                    c0452Eq = c0452Eq;
                    c0452Eq.A1I();
                    c0452Eq.A06.A1J(c0452Eq.A0r, c0452Eq.A0s, i, i2);
                    c0452Eq.A1p(z2);
                    c0452Eq.A0s.A09 = z2;
                    c2 = 27;
                    break;
                case 19:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0s.A03 = z2 ? 1 : 0;
                    c2 = 18;
                    break;
                case 20:
                    c0452Eq = c0452Eq;
                    z2 = false;
                    c0452Eq.A00.A0G();
                    c0452Eq.A0s.A09 = false;
                    c2 = 15;
                    break;
                case 21:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0s.A0B) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    C0452Eq c0452Eq3 = c0452Eq;
                    c0452Eq3.setMeasuredDimension(c0452Eq3.getMeasuredWidth(), c0452Eq3.getMeasuredHeight());
                    return;
                case 23:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A0s.A04 != z) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0K();
                    c2 = 25;
                    break;
                case 25:
                    c0452Eq = c0452Eq;
                    c0452Eq.A06.A11(i, i2);
                    c0452Eq.A0s.A0A = z;
                    c0452Eq.A0L();
                    c0452Eq.A06.A12(i, i2);
                    if (!c0452Eq.A06.A23()) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    c0452Eq = c0452Eq;
                    c0452Eq.A06.A11(View.MeasureSpec.makeMeasureSpec(c0452Eq.getMeasuredWidth(), i3), View.MeasureSpec.makeMeasureSpec(c0452Eq.getMeasuredHeight(), i3));
                    c0452Eq.A0s.A0A = z;
                    c0452Eq.A0L();
                    c0452Eq.A06.A12(i, i2);
                    c2 = 27;
                    break;
                case 27:
                    return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (A1s()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C0452Eq c0452Eq = this;
        char c2 = !(parcelable instanceof RecyclerView$SavedState) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    super.onRestoreInstanceState(parcelable);
                    return;
                case 3:
                    c0452Eq = c0452Eq;
                    parcelable = parcelable;
                    c0452Eq.A0j = (RecyclerView$SavedState) parcelable;
                    super.onRestoreInstanceState(c0452Eq.A0j.A02());
                    if (c0452Eq.A06 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A0j.A00 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0452Eq = c0452Eq;
                    c0452Eq.A06.A1w(c0452Eq.A0j.A00);
                    c2 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0452Eq c0452Eq = this;
        C4G c4g = null;
        RecyclerView$SavedState recyclerView$SavedState = new RecyclerView$SavedState(super.onSaveInstanceState());
        RecyclerView$SavedState recyclerView$SavedState2 = c0452Eq.A0j;
        char c2 = recyclerView$SavedState2 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    recyclerView$SavedState = recyclerView$SavedState;
                    recyclerView$SavedState2 = recyclerView$SavedState2;
                    recyclerView$SavedState.A03(recyclerView$SavedState2);
                    c2 = 3;
                    break;
                case 3:
                    return recyclerView$SavedState;
                case 4:
                    c0452Eq = c0452Eq;
                    c4g = c0452Eq.A06;
                    if (c4g == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    recyclerView$SavedState = recyclerView$SavedState;
                    c4g = c4g;
                    recyclerView$SavedState.A00 = c4g.A1p();
                    c2 = 3;
                    break;
                case 6:
                    recyclerView$SavedState = recyclerView$SavedState;
                    recyclerView$SavedState.A00 = null;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        C0452Eq c0452Eq = this;
        super.onSizeChanged(i, i2, i3, i4);
        char c2 = i == i3 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 == i4) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0e();
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        C0452Eq c0452Eq = this;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int y = 0;
        boolean z = false;
        int i4 = 0;
        float f = 0.0f;
        boolean zA25 = false;
        int i5 = 0;
        float f2 = 0.0f;
        boolean z2 = false;
        int x = 0;
        int actionIndex = 0;
        int actionMasked = 0;
        C4G c4g = null;
        int iFindPointerIndex = 0;
        float f3 = 0.0f;
        MotionEvent motionEventObtain = null;
        boolean z3 = false;
        float f4 = 0.0f;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        boolean zA24 = false;
        C0452Eq c0452Eq2 = c0452Eq;
        MotionEvent motionEvent3 = motionEvent2;
        boolean z4 = 0;
        int i9 = !c0452Eq2.A0I ? 2 : 3;
        while (true) {
            switch (i9) {
                case 2:
                    c0452Eq2 = c0452Eq2;
                    if (!c0452Eq2.A0n) {
                        i9 = 4;
                        break;
                    } else {
                        i9 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    c0452Eq = c0452Eq;
                    motionEvent2 = motionEvent2;
                    z2 = true;
                    z2 = true;
                    if (!c0452Eq.A13(motionEvent2)) {
                        i9 = 6;
                        break;
                    } else {
                        i9 = 5;
                        break;
                    }
                case 5:
                    c0452Eq.A0I();
                    return z2;
                case 6:
                    c0452Eq2 = c0452Eq2;
                    c4g = c0452Eq2.A06;
                    if (c4g != null) {
                        i9 = 8;
                        break;
                    } else {
                        i9 = 7;
                        break;
                    }
                case 7:
                    return false;
                case 8:
                    c0452Eq2 = c0452Eq2;
                    c4g = c4g;
                    zA24 = c4g.A24();
                    zA25 = c0452Eq2.A06.A25();
                    if (c0452Eq2.A0Y != null) {
                        i9 = 10;
                        break;
                    } else {
                        i9 = 9;
                        break;
                    }
                case 9:
                    c0452Eq2 = c0452Eq2;
                    c0452Eq2.A0Y = VelocityTracker.obtain();
                    i9 = 10;
                    break;
                case 10:
                    motionEvent2 = motionEvent2;
                    z3 = false;
                    motionEventObtain = MotionEvent.obtain(motionEvent2);
                    actionMasked = motionEvent2.getActionMasked();
                    actionIndex = motionEvent2.getActionIndex();
                    if (actionMasked != 0) {
                        i9 = 12;
                        break;
                    } else {
                        i9 = 11;
                        break;
                    }
                case 11:
                    c0452Eq2 = c0452Eq2;
                    z4 = 0;
                    int[] iArr = c0452Eq2.A15;
                    iArr[z2 ? 1 : 0] = 0;
                    iArr[0] = 0;
                    i9 = 12;
                    break;
                case 12:
                    c0452Eq2 = c0452Eq2;
                    motionEventObtain = motionEventObtain;
                    int[] iArr2 = c0452Eq2.A15;
                    motionEventObtain.offsetLocation(iArr2[z4 ? 1 : 0], iArr2[z2 ? 1 : 0]);
                    f4 = 0.5f;
                    if (actionMasked == 0) {
                        i9 = 68;
                        break;
                    } else {
                        i9 = 13;
                        break;
                    }
                case 13:
                    if (actionMasked == z2) {
                        i9 = 57;
                        break;
                    } else {
                        i9 = 14;
                        break;
                    }
                case 14:
                    if (actionMasked == 2) {
                        i9 = 24;
                        break;
                    } else {
                        i9 = 15;
                        break;
                    }
                case 15:
                    if (actionMasked == 3) {
                        i9 = 23;
                        break;
                    } else {
                        i9 = 16;
                        break;
                    }
                case 16:
                    if (actionMasked == 5) {
                        i9 = 22;
                        break;
                    } else {
                        i9 = 17;
                        break;
                    }
                case 17:
                    if (actionMasked == 6) {
                        i9 = 21;
                        break;
                    } else {
                        i9 = 18;
                        break;
                    }
                case 18:
                    if (!z3) {
                        i9 = 19;
                        break;
                    } else {
                        i9 = 20;
                        break;
                    }
                case 19:
                    c0452Eq2 = c0452Eq2;
                    motionEventObtain = motionEventObtain;
                    c0452Eq2.A0Y.addMovement(motionEventObtain);
                    i9 = 20;
                    break;
                case 20:
                    motionEventObtain.recycle();
                    return z2;
                case 21:
                    c0452Eq = c0452Eq;
                    motionEvent2 = motionEvent2;
                    c0452Eq.A0m(motionEvent2);
                    i9 = 18;
                    break;
                case 22:
                    c0452Eq2 = c0452Eq2;
                    motionEvent3 = motionEvent3;
                    c0452Eq2.A0V = motionEvent3.getPointerId(actionIndex);
                    int x2 = (int) (motionEvent3.getX(actionIndex) + f4);
                    c0452Eq2.A0S = x2;
                    c0452Eq2.A0Q = x2;
                    int y2 = (int) (motionEvent3.getY(actionIndex) + f4);
                    c0452Eq2.A0T = y2;
                    c0452Eq2.A0R = y2;
                    i9 = 18;
                    break;
                case 23:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0I();
                    i9 = 18;
                    break;
                case 24:
                    c0452Eq2 = c0452Eq2;
                    motionEvent3 = motionEvent3;
                    iFindPointerIndex = motionEvent3.findPointerIndex(c0452Eq2.A0V);
                    if (iFindPointerIndex >= 0) {
                        i9 = 26;
                        break;
                    } else {
                        i9 = 25;
                        break;
                    }
                case 25:
                    Log.e(A0H(1788, 12, 104), A0H(640, 46, 106) + c0452Eq2.A0V + A0H(150, 45, 110));
                    return z4;
                case 26:
                    c0452Eq = c0452Eq;
                    c0452Eq2 = c0452Eq2;
                    motionEvent3 = motionEvent3;
                    x = (int) (motionEvent3.getX(iFindPointerIndex) + f4);
                    y = (int) (motionEvent3.getY(iFindPointerIndex) + f4);
                    i6 = c0452Eq2.A0S - x;
                    i8 = c0452Eq2.A0T - y;
                    if (!c0452Eq.A1w(i6, i8, c0452Eq2.A16, c0452Eq2.A17, 0)) {
                        i9 = 28;
                        break;
                    } else {
                        i9 = 27;
                        break;
                    }
                case 27:
                    c0452Eq2 = c0452Eq2;
                    motionEventObtain = motionEventObtain;
                    int[] iArr3 = c0452Eq2.A16;
                    i6 -= iArr3[z4 ? 1 : 0];
                    i8 -= iArr3[z2 ? 1 : 0];
                    int[] iArr4 = c0452Eq2.A17;
                    motionEventObtain.offsetLocation(iArr4[z4 ? 1 : 0], iArr4[z2 ? 1 : 0]);
                    int[] iArr5 = c0452Eq2.A15;
                    int i10 = iArr5[z4 ? 1 : 0];
                    int[] iArr6 = c0452Eq2.A17;
                    iArr5[z4 ? 1 : 0] = i10 + iArr6[z4 ? 1 : 0];
                    iArr5[z2 ? 1 : 0] = iArr5[z2 ? 1 : 0] + iArr6[z2 ? 1 : 0];
                    i9 = 28;
                    break;
                case 28:
                    c0452Eq2 = c0452Eq2;
                    if (c0452Eq2.A0W == z2) {
                        i9 = 56;
                        break;
                    } else {
                        i9 = 29;
                        break;
                    }
                case 29:
                    z = false;
                    if (!zA24) {
                        i9 = 34;
                        break;
                    } else {
                        i9 = 30;
                        break;
                    }
                case 30:
                    c0452Eq2 = c0452Eq2;
                    int iAbs = Math.abs(i6);
                    i5 = c0452Eq2.A0X;
                    if (iAbs <= i5) {
                        i9 = 34;
                        break;
                    } else {
                        i9 = 31;
                        break;
                    }
                case 31:
                    if (i6 <= 0) {
                        i9 = 55;
                        break;
                    } else {
                        i9 = 32;
                        break;
                    }
                case 32:
                    i6 -= i5;
                    i9 = 33;
                    break;
                case 33:
                    z = true;
                    i9 = 34;
                    break;
                case 34:
                    if (!zA25) {
                        i9 = 39;
                        break;
                    } else {
                        i9 = 35;
                        break;
                    }
                case 35:
                    c0452Eq2 = c0452Eq2;
                    int iAbs2 = Math.abs(i8);
                    i4 = c0452Eq2.A0X;
                    if (iAbs2 <= i4) {
                        i9 = 39;
                        break;
                    } else {
                        i9 = 36;
                        break;
                    }
                case 36:
                    if (i8 <= 0) {
                        i9 = 54;
                        break;
                    } else {
                        i9 = 37;
                        break;
                    }
                case 37:
                    i8 -= i4;
                    i9 = 38;
                    break;
                case 38:
                    z = true;
                    i9 = 39;
                    break;
                case 39:
                    if (!z) {
                        i9 = 41;
                        break;
                    } else {
                        i9 = 40;
                        break;
                    }
                case 40:
                    c0452Eq2 = c0452Eq2;
                    c0452Eq2.setScrollState(z2 ? 1 : 0);
                    i9 = 41;
                    break;
                case 41:
                    i7 = i6;
                    i3 = i8;
                    i9 = 42;
                    break;
                case 42:
                    c0452Eq2 = c0452Eq2;
                    if (c0452Eq2.A0W != z2) {
                        i9 = 18;
                        break;
                    } else {
                        i9 = 43;
                        break;
                    }
                case 43:
                    c0452Eq2 = c0452Eq2;
                    int[] iArr7 = c0452Eq2.A17;
                    c0452Eq2.A0S = x - iArr7[z4 ? 1 : 0];
                    c0452Eq2.A0T = y - iArr7[z2 ? 1 : 0];
                    if (!zA24) {
                        i9 = 53;
                        break;
                    } else {
                        i9 = 44;
                        break;
                    }
                case 44:
                    i2 = i7;
                    i9 = 45;
                    break;
                case 45:
                    if (!zA25) {
                        i9 = 47;
                        break;
                    } else {
                        i9 = 46;
                        break;
                    }
                case 46:
                    z4 = i3;
                    i9 = 47;
                    break;
                case 47:
                    c0452Eq2 = c0452Eq2;
                    motionEventObtain = motionEventObtain;
                    if (!c0452Eq2.A12(i2, z4 ? 1 : 0, motionEventObtain)) {
                        i9 = 49;
                        break;
                    } else {
                        i9 = 48;
                        break;
                    }
                case 48:
                    c0452Eq = c0452Eq;
                    c0452Eq.getParent().requestDisallowInterceptTouchEvent(z2);
                    i9 = 49;
                    break;
                case 49:
                    c0452Eq2 = c0452Eq2;
                    if (c0452Eq2.A03 == null) {
                        i9 = 18;
                        break;
                    } else {
                        i9 = 50;
                        break;
                    }
                case 50:
                    if (i7 != 0) {
                        i9 = 52;
                        break;
                    } else {
                        i9 = 51;
                        break;
                    }
                case 51:
                    if (i3 == 0) {
                        i9 = 18;
                        break;
                    } else {
                        i9 = 52;
                        break;
                    }
                case 52:
                    c0452Eq2 = c0452Eq2;
                    c0452Eq2.A03.A0B(c0452Eq2, i7, i3);
                    i9 = 18;
                    break;
                case 53:
                    i2 = 0;
                    i9 = 45;
                    break;
                case 54:
                    i8 += i4;
                    i9 = 38;
                    break;
                case 55:
                    i6 += i5;
                    i9 = 33;
                    break;
                case 56:
                    i7 = i6;
                    i3 = i8;
                    i9 = 42;
                    break;
                case 57:
                    c0452Eq2 = c0452Eq2;
                    motionEventObtain = motionEventObtain;
                    c0452Eq2.A0Y.addMovement(motionEventObtain);
                    z3 = true;
                    c0452Eq2.A0Y.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, c0452Eq2.A0x);
                    f2 = 0.0f;
                    if (!zA24) {
                        i9 = 67;
                        break;
                    } else {
                        i9 = 58;
                        break;
                    }
                case 58:
                    c0452Eq2 = c0452Eq2;
                    f = -c0452Eq2.A0Y.getXVelocity(c0452Eq2.A0V);
                    i9 = 59;
                    break;
                case 59:
                    if (!zA25) {
                        i9 = 66;
                        break;
                    } else {
                        i9 = 60;
                        break;
                    }
                case 60:
                    c0452Eq2 = c0452Eq2;
                    f3 = -c0452Eq2.A0Y.getYVelocity(c0452Eq2.A0V);
                    i9 = 61;
                    break;
                case 61:
                    f2 = 0.0f;
                    if (f != 0.0f) {
                        i9 = 63;
                        break;
                    } else {
                        i9 = 62;
                        break;
                    }
                case 62:
                    if (f3 == f2) {
                        i9 = 64;
                        break;
                    } else {
                        i9 = 63;
                        break;
                    }
                case 63:
                    c0452Eq2 = c0452Eq2;
                    if (!c0452Eq2.A11((int) f, (int) f3)) {
                        i9 = 64;
                        break;
                    } else {
                        i9 = 65;
                        break;
                    }
                case 64:
                    c0452Eq2 = c0452Eq2;
                    c0452Eq2.setScrollState(z4 ? 1 : 0);
                    i9 = 65;
                    break;
                case 65:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0S();
                    i9 = 18;
                    break;
                case 66:
                    f3 = 0.0f;
                    i9 = 61;
                    break;
                case 67:
                    f = 0.0f;
                    i9 = 59;
                    break;
                case 68:
                    motionEvent2 = motionEvent2;
                    c0452Eq2 = c0452Eq2;
                    motionEvent3 = motionEvent3;
                    c0452Eq2.A0V = motionEvent3.getPointerId(z4 ? 1 : 0);
                    int x3 = (int) (motionEvent2.getX() + f4);
                    c0452Eq2.A0S = x3;
                    c0452Eq2.A0Q = x3;
                    int y3 = (int) (motionEvent2.getY() + f4);
                    c0452Eq2.A0T = y3;
                    c0452Eq2.A0R = y3;
                    i = 0;
                    if (!zA24) {
                        i9 = 70;
                        break;
                    } else {
                        i9 = 69;
                        break;
                    }
                case 69:
                    i = 0 | 1;
                    i9 = 70;
                    break;
                case 70:
                    if (!zA25) {
                        i9 = 72;
                        break;
                    } else {
                        i9 = 71;
                        break;
                    }
                case 71:
                    i |= 2;
                    i9 = 72;
                    break;
                case 72:
                    c0452Eq2 = c0452Eq2;
                    c0452Eq2.A1u(i, z4 ? 1 : 0);
                    i9 = 18;
                    break;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        C4Y c4yA0E = A0E(view);
        char c2 = c4yA0E != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0e()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4yA0E = c4yA0E;
                    c4yA0E.A0P();
                    c2 = 4;
                    break;
                case 4:
                    C0452Eq c0452Eq = this;
                    View view2 = view;
                    view2.clearAnimation();
                    c0452Eq.A1g(view2);
                    super.removeDetachedView(view2, z);
                    return;
                case 5:
                    c4yA0E = c4yA0E;
                    if (!c4yA0E.A0h()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 6:
                    throw new IllegalArgumentException(A0H(44, 75, k.AppCompatTheme_windowFixedWidthMajor) + c4yA0E + A1G());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0452Eq c0452Eq = this;
        char c2 = !c0452Eq.A06.A1f(c0452Eq, c0452Eq.A0s, view, view2) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    view2 = view2;
                    if (view2 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    view = view;
                    view2 = view2;
                    c0452Eq.A0o(view, view2);
                    c2 = 4;
                    break;
                case 4:
                    super.requestChildFocus(view, view2);
                    return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.A06.A1d(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        C0452Eq c0452Eq = this;
        int size = c0452Eq.A13.size();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= size) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    c0452Eq.A13.get(i);
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    super.requestDisallowInterceptTouchEvent(z);
                    return;
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        C0452Eq c0452Eq = this;
        char c2 = c0452Eq.A0O == 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0I) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    super.requestLayout();
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0J = true;
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        C0452Eq c0452Eq = this;
        int i3 = 0;
        int i4 = 0;
        boolean zA25 = false;
        boolean zA24 = false;
        C4G c4g = c0452Eq.A06;
        char c2 = c4g == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    Log.e(A0H(1788, 12, 104), A0H(859, 90, 1));
                    return;
                case 3:
                    c0452Eq = c0452Eq;
                    if (!c0452Eq.A0I) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    c0452Eq = c0452Eq;
                    c4g = c4g;
                    zA24 = c4g.A24();
                    zA25 = c0452Eq.A06.A25();
                    if (!zA24) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    if (!zA25) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    i3 = 0;
                    if (!zA24) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    i4 = i;
                    c2 = '\t';
                    break;
                case '\t':
                    if (!zA25) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    i3 = i2;
                    c2 = 11;
                    break;
                case 11:
                    c0452Eq = c0452Eq;
                    c0452Eq.A12(i4, i3, null);
                    c2 = '\f';
                    break;
                case '\f':
                    return;
                case '\r':
                    i4 = 0;
                    c2 = '\t';
                    break;
            }
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w(A0H(1788, 12, 104), A0H(686, 93, 88));
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (A17(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(TG tg) {
        this.A09 = tg;
        C2v.A0A(this, this.A09);
    }

    public void setAdapter(AnonymousClass44 anonymousClass44) {
        setLayoutFrozen(false);
        A0p(anonymousClass44, false, true);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(AnonymousClass47 anonymousClass47) {
        C0452Eq c0452Eq = this;
        boolean z = false;
        char c2 = anonymousClass47 == c0452Eq.A0e ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0452Eq = c0452Eq;
                    anonymousClass47 = anonymousClass47;
                    c0452Eq.A0e = anonymousClass47;
                    if (c0452Eq.A0e == null) {
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
                    c0452Eq.setChildrenDrawingOrderEnabled(z);
                    return;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        C0452Eq c0452Eq = this;
        char c2 = z != c0452Eq.A0B ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0e();
                    c2 = 3;
                    break;
                case 3:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0B = z;
                    super.setClipToPadding(z);
                    if (!c0452Eq.A0D) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    c0452Eq.requestLayout();
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    public void setHasFixedSize(boolean z) {
        this.A0E = z;
    }

    public void setItemAnimator(C4C c4c) {
        C0452Eq c0452Eq = this;
        C4C c4c2 = null;
        C4C c4c3 = c0452Eq.A05;
        char c2 = c4c3 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    c4c3 = c4c3;
                    c4c3.A0G();
                    c0452Eq.A05.A09(null);
                    c2 = 3;
                    break;
                case 3:
                    c0452Eq = c0452Eq;
                    c4c = c4c;
                    c0452Eq.A05 = c4c;
                    c4c2 = c0452Eq.A05;
                    if (c4c2 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    c4c2 = c4c2;
                    c4c2.A09(c0452Eq.A0f);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    public void setItemViewCacheSize(int i) {
        this.A0r.A0Q(i);
    }

    public void setLayoutFrozen(boolean z) {
        C0452Eq c0452Eq = this;
        boolean z2 = false;
        char c2 = z != c0452Eq.A0I ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    c0452Eq = c0452Eq;
                    c0452Eq.A1n(A0H(195, 42, 110));
                    if (!z) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 3:
                    c0452Eq = c0452Eq;
                    z2 = false;
                    c0452Eq.A0I = false;
                    if (!c0452Eq.A0J) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A06 == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0452Eq = c0452Eq;
                    if (c0452Eq.A04 == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0452Eq = c0452Eq;
                    c0452Eq.requestLayout();
                    c2 = 7;
                    break;
                case 7:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0J = z2;
                    c2 = '\b';
                    break;
                case '\b':
                    return;
                case '\t':
                    c0452Eq = c0452Eq;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    c0452Eq.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                    c0452Eq.A0I = true;
                    c0452Eq.A0n = true;
                    c0452Eq.A1P();
                    c2 = '\b';
                    break;
            }
        }
    }

    public void setLayoutManager(C4G c4g) {
        C0452Eq c0452Eq = this;
        C4C c4c = null;
        char c2 = c4g == c0452Eq.A06 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0452Eq = c0452Eq;
                    c0452Eq.A1P();
                    if (c0452Eq.A06 == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    c4c = c0452Eq.A05;
                    if (c4c == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c4c = c4c;
                    c4c.A0G();
                    c2 = 6;
                    break;
                case 6:
                    c0452Eq = c0452Eq;
                    c0452Eq.A06.A1I(c0452Eq.A0r);
                    c0452Eq.A06.A1G(c0452Eq.A0r);
                    c0452Eq.A0r.A0P();
                    if (!c0452Eq.A0F) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0452Eq = c0452Eq;
                    c0452Eq.A06.A1U(c0452Eq, c0452Eq.A0r);
                    c2 = '\b';
                    break;
                case '\b':
                    c0452Eq = c0452Eq;
                    c0452Eq.A06.A1P(null);
                    c0452Eq.A06 = null;
                    c2 = '\t';
                    break;
                case '\t':
                    c0452Eq = c0452Eq;
                    c4g = c4g;
                    c0452Eq.A01.A0B();
                    c0452Eq.A06 = c4g;
                    if (c4g == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c4g = c4g;
                    if (c4g.A03 != null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0452Eq = c0452Eq;
                    c0452Eq.A06.A1P(c0452Eq);
                    if (!c0452Eq.A0F) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c0452Eq = c0452Eq;
                    c0452Eq.A06.A1N(c0452Eq);
                    c2 = '\r';
                    break;
                case '\r':
                    C0452Eq c0452Eq2 = c0452Eq;
                    c0452Eq2.A0r.A0O();
                    c0452Eq2.requestLayout();
                    return;
                case 14:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0r.A0P();
                    c2 = '\t';
                    break;
                case 15:
                    C4G c4g2 = c4g;
                    throw new IllegalArgumentException(A0H(626, 14, 72) + c4g2 + A0H(779, 39, k.AppCompatTheme_windowNoTitle) + c4g2.A03.A1G());
            }
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().A04(z);
    }

    public void setOnFlingListener(@Nullable C4J c4j) {
        this.A0g = c4j;
    }

    @Deprecated
    public void setOnScrollListener(C4L c4l) {
        this.A0i = c4l;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.A0o = z;
    }

    public void setRecycledViewPool(C4N c4n) {
        this.A0r.A0Z(c4n);
    }

    public void setRecyclerListener(C4P c4p) {
        this.A07 = c4p;
    }

    public void setScrollState(int i) {
        C0452Eq c0452Eq = this;
        char c2 = i == c0452Eq.A0W ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0W = i;
                    if (i == 2) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0452Eq = c0452Eq;
                    c0452Eq.A0U();
                    c2 = 5;
                    break;
                case 5:
                    c0452Eq.A0j(i);
                    return;
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        C0452Eq c0452Eq = this;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(c0452Eq.getContext());
        char c2 = i != 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    Log.w(A0H(1788, 12, 104), A0H(278, 47, k.AppCompatTheme_windowFixedWidthMajor) + i + A0H(605, 21, 65));
                    c2 = 4;
                    break;
                case 4:
                    c0452Eq = c0452Eq;
                    viewConfiguration = viewConfiguration;
                    c0452Eq.A0X = viewConfiguration.getScaledTouchSlop();
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c0452Eq = c0452Eq;
                    viewConfiguration = viewConfiguration;
                    c0452Eq.A0X = viewConfiguration.getScaledPagingTouchSlop();
                    c2 = 5;
                    break;
            }
        }
    }

    public void setViewCacheExtension(C4W c4w) {
        this.A0r.A0a(c4w);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().A0A(i);
    }

    @Override // android.view.View, com.facebook.ads.redexgen.X.InterfaceC01592c
    public final void stopNestedScroll() {
        getScrollingChildHelper().A02();
    }
}

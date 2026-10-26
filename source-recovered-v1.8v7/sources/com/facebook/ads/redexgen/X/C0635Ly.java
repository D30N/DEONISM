package com.facebook.ads.redexgen.X;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import android.widget.Toast;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.redexgen.X.Ly, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0635Ly {
    public static byte[] A00;
    public static final float A01;
    public static final DisplayMetrics A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final ConcurrentHashMap<Integer, Integer> A07;
    public static final AtomicInteger A08;

    public static String A0F(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 7);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0G() {
        A00 = new byte[]{-26, -44, -31, -26, -96, -26, -40, -27, -36, -39, -96, -32, -40, -41, -36, -24, -32};
    }

    static {
        A0G();
        A05 = C2H.A01(-1, 0);
        A03 = C2H.A01(-16777216, k.AppCompatTheme_windowActionBar);
        A06 = C2H.A01(-16777216, 0);
        A04 = C2H.A01(-16777216, 225);
        A02 = Resources.getSystem().getDisplayMetrics();
        A01 = A02.density;
        A08 = new AtomicInteger(1);
        A07 = new ConcurrentHashMap<>();
    }

    public static int A00() {
        int newValue;
        int i;
        do {
            newValue = A08.get();
            i = newValue + 1;
            if (i > 16777215) {
                i = 1;
            }
        } while (!A08.compareAndSet(newValue, i));
        return newValue;
    }

    public static int A01(int i) {
        return (int) TypedValue.applyDimension(2, i, A02);
    }

    public static int A02(int i) {
        if (A0e(i)) {
            return C2H.A02(i, -1, 0.4f);
        }
        return C2H.A02(i, -16777216, 0.2f);
    }

    public static int A03(@Nullable Context context) {
        int i = 0;
        char c2 = context == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = 0;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    context = context;
                    i = context.getResources().getConfiguration().orientation;
                    c2 = 3;
                    break;
            }
        }
    }

    public static int A04(TextView textView) {
        int lineCount = 0;
        Layout layout = null;
        char c2 = textView != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    textView = textView;
                    if (textView.getLayout() != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return 0;
                case 4:
                    textView = textView;
                    layout = textView.getLayout();
                    lineCount = layout.getLineCount();
                    if (lineCount <= 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    double ellipsisCount = layout.getEllipsisCount(lineCount - 1);
                    double charsInFirstLine = textView.getText().length() - ellipsisCount;
                    double ellipsisCount2 = Math.ceil(ellipsisCount / charsInFirstLine);
                    return (int) ellipsisCount2;
                case 6:
                    return 0;
            }
        }
    }

    public static int A05(TextView textView, int lines) {
        int iA04 = A04(textView);
        int i = 0;
        int lineHeight = textView.getLineHeight();
        int lineHeightTitle = 2;
        while (true) {
            switch (lineHeightTitle) {
                case 2:
                    if (lines <= lineHeight) {
                        lineHeightTitle = 5;
                        break;
                    } else {
                        lineHeightTitle = 3;
                        break;
                    }
                case 3:
                    if (i >= iA04) {
                        lineHeightTitle = 5;
                        break;
                    } else {
                        lineHeightTitle = 4;
                        break;
                    }
                case 4:
                    i++;
                    lines -= lineHeight;
                    lineHeightTitle = 2;
                    break;
                case 5:
                    return i;
            }
        }
    }

    public static Drawable A06(int i, int i2) {
        return A09(i, A02(i), i2);
    }

    public static Drawable A07(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(i2);
        return gradientDrawable;
    }

    public static Drawable A08(int i, int i2) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, i2);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }

    public static Drawable A09(int i, int i2, int i3) {
        return A0A(i, i2, i, i3);
    }

    public static Drawable A0A(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new RippleDrawable(ColorStateList.valueOf(i2), A07(i, i4), A08(i3, i4));
        }
        return A0C(i, i2, i4);
    }

    public static Drawable A0B(int i, float[] fArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadii(fArr);
        return gradientDrawable;
    }

    public static StateListDrawable A0C(int i, int i2, int i3) {
        return A0D(new int[][]{new int[]{R.attr.state_pressed}, new int[0]}, new int[]{i2, i}, i3);
    }

    public static StateListDrawable A0D(int[][] iArr, int[] iArr2, int i) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    iArr = iArr;
                    if (i2 >= iArr.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    iArr = iArr;
                    iArr2 = iArr2;
                    stateListDrawable = stateListDrawable;
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(iArr2[i2]);
                    gradientDrawable.setCornerRadius(i);
                    stateListDrawable.addState(iArr[i2], gradientDrawable);
                    i2++;
                    c2 = 2;
                    break;
                case 4:
                    return stateListDrawable;
            }
        }
    }

    @Nullable
    public static TextView A0E(ViewGroup viewGroup) {
        View v = null;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    viewGroup = viewGroup;
                    if (i >= viewGroup.getChildCount()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    viewGroup = viewGroup;
                    v = viewGroup.getChildAt(i);
                    if (!(v instanceof TextView)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return (TextView) v;
                case 5:
                    v = v;
                    if (!(v instanceof ViewGroup)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    v = v;
                    A0E((ViewGroup) v);
                    c2 = 7;
                    break;
                case 7:
                    i++;
                    c2 = 2;
                    break;
                case '\b':
                    return (TextView) null;
            }
        }
    }

    public static void A0H(int i, float f, View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, f, 1.0f, f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(i / 2);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setRepeatCount(1);
        scaleAnimation.setRepeatMode(2);
        view.startAnimation(scaleAnimation);
    }

    public static void A0I(int i, View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(i / 3);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration((i / 3) * 2);
        scaleAnimation2.setInterpolator(new BounceInterpolator());
        scaleAnimation.setAnimationListener(new C1164cp(view, scaleAnimation2));
        view.startAnimation(scaleAnimation);
    }

    public static void A0J(int i, View view) {
        Integer num = A07.get(Integer.valueOf(i));
        if (num != null) {
            view.setId(num.intValue());
        } else {
            A0N(view);
        }
    }

    public static void A0K(@Nullable View view) {
        A0Q(view, 8);
    }

    public static void A0L(View view) {
        ViewParent parent = view.getParent();
        char c2 = parent != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    parent = parent;
                    if (!(parent instanceof ViewGroup)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    parent = parent;
                    A0X((ViewGroup) parent);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    public static void A0M(@Nullable View view) {
        ViewGroup viewGroup = null;
        char c2 = view == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    view = view;
                    viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    view = view;
                    viewGroup = viewGroup;
                    viewGroup.removeView(view);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    public static void A0N(View view) {
        char c2 = Build.VERSION.SDK_INT >= 17 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    view = view;
                    view.setId(View.generateViewId());
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    view = view;
                    view.setId(A00());
                    c2 = 3;
                    break;
            }
        }
    }

    public static void A0O(@Nullable View view) {
        A0Q(view, 0);
    }

    public static void A0P(View view, int i) {
        char c2 = Build.VERSION.SDK_INT >= 16 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    view = view;
                    view.setBackground(new ColorDrawable(i));
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    view = view;
                    view.setBackgroundDrawable(new ColorDrawable(i));
                    c2 = 3;
                    break;
            }
        }
    }

    public static void A0Q(@Nullable View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public static void A0R(View view, int i, int i2) {
        A0W(view, A07(i, i2));
    }

    public static void A0S(View view, int i, int i2) {
        A0W(view, A09(i, A02(i), i2));
    }

    public static void A0T(View view, int i, int i2, int i3) {
        A0W(view, A0A(i, A02(i), i2, i3));
    }

    public static void A0U(View view, int i, float[] fArr) {
        A0W(view, A0B(i, fArr));
    }

    public static void A0V(View view, Context context) {
        GradientDrawable gradientDrawable = null;
        char c2 = context != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    context = context;
                    if (!JQ.A1I(context)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A06, A04});
                    c2 = 4;
                    break;
                case 4:
                    GradientDrawable gradientDrawable2 = gradientDrawable;
                    gradientDrawable2.setCornerRadius(0.0f);
                    A0W(view, gradientDrawable2);
                    return;
                case 5:
                    gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A05, A03});
                    c2 = 4;
                    break;
            }
        }
    }

    public static void A0W(View view, Drawable drawable) {
        char c2 = Build.VERSION.SDK_INT >= 16 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    view = view;
                    drawable = drawable;
                    view.setBackground(drawable);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    view = view;
                    drawable = drawable;
                    view.setBackgroundDrawable(drawable);
                    c2 = 3;
                    break;
            }
        }
    }

    public static void A0X(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT > 19) {
            A0Y(viewGroup, 200);
        }
    }

    public static void A0Y(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT > 19) {
            A0a(viewGroup, new AutoTransition(), i);
        }
    }

    public static void A0Z(ViewGroup viewGroup, Transition transition) {
        if (Build.VERSION.SDK_INT > 19) {
            A0a(viewGroup, transition, 200);
        }
    }

    @TargetApi(19)
    public static void A0a(ViewGroup viewGroup, Transition transition, int i) {
        transition.setDuration(i);
        transition.setInterpolator(new AccelerateDecelerateInterpolator());
        TransitionManager.beginDelayedTransition(viewGroup, transition);
    }

    public static void A0b(TextView textView, boolean z, int i) {
        Typeface typefaceCreate = null;
        char c2 = z ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (Build.VERSION.SDK_INT < 21) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    typefaceCreate = Typeface.create(A0F(0, 17, 108), 0);
                    c2 = 4;
                    break;
                case 4:
                    TextView textView2 = textView;
                    textView2.setTypeface(typefaceCreate);
                    textView2.setTextSize(2, i);
                    return;
                case 5:
                    typefaceCreate = Typeface.create(Typeface.SANS_SERIF, 1);
                    c2 = 4;
                    break;
                case 6:
                    typefaceCreate = Typeface.create(Typeface.SANS_SERIF, 0);
                    c2 = 4;
                    break;
            }
        }
    }

    public static void A0c(@Nullable Toast toast, String str, int i, int i2, int i3) {
        TextView textViewA0E = null;
        char c2 = toast == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    toast = toast;
                    toast.setGravity(i, i2, i3);
                    textViewA0E = A0E((ViewGroup) toast.getView());
                    if (textViewA0E == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    str = str;
                    textViewA0E = textViewA0E;
                    textViewA0E.setText(str);
                    textViewA0E.setGravity(17);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    public static void A0d(View... viewArr) {
        int length = viewArr.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    viewArr = viewArr;
                    View v = viewArr[i];
                    A0M(v);
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    public static boolean A0e(int i) {
        boolean z = false;
        char c2 = C2H.A00(i) < 0.5d ? (char) 2 : (char) 4;
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
}

package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ge, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0490Ge {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final List<C0489Gd> A06 = new ArrayList();
    public final List<SpannableString> A07 = new ArrayList();
    public final StringBuilder A05 = new StringBuilder();

    public C0490Ge(int i, int i2) {
        A09(i);
        A0A(i2);
    }

    private final SpannableString A00() {
        int i = 0;
        int colorStartPosition = 0;
        int color = 0;
        int i2 = 0;
        int nextPosition = 0;
        C0489Gd cueStyle = null;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        C0490Ge c0490Ge = this;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c0490Ge.A05);
        int length = spannableStringBuilder.length();
        int i5 = -1;
        int i6 = -1;
        int i7 = 0;
        int i8 = -1;
        int i9 = 0;
        int i10 = -1;
        int i11 = 0;
        int nextColor = 2;
        while (true) {
            switch (nextColor) {
                case 2:
                    c0490Ge = c0490Ge;
                    if (i11 >= c0490Ge.A06.size()) {
                        nextColor = 30;
                        break;
                    } else {
                        nextColor = 3;
                        break;
                    }
                case 3:
                    c0490Ge = c0490Ge;
                    cueStyle = c0490Ge.A06.get(i11);
                    z = cueStyle.A02;
                    i2 = cueStyle.A01;
                    if (i2 == 8) {
                        nextColor = 9;
                        break;
                    } else {
                        nextColor = 4;
                        break;
                    }
                case 4:
                    color = 7;
                    if (i2 != 7) {
                        nextColor = 29;
                        break;
                    } else {
                        nextColor = 5;
                        break;
                    }
                case 5:
                    colorStartPosition = 1;
                    nextColor = 6;
                    break;
                case 6:
                    i9 = colorStartPosition;
                    if (i2 != color) {
                        nextColor = 28;
                        break;
                    } else {
                        nextColor = 7;
                        break;
                    }
                case 7:
                    nextPosition = i10;
                    nextColor = 8;
                    break;
                case 8:
                    i10 = nextPosition;
                    nextColor = 9;
                    break;
                case 9:
                    c0490Ge = c0490Ge;
                    cueStyle = cueStyle;
                    i3 = cueStyle.A00;
                    if (i11 + 1 >= c0490Ge.A06.size()) {
                        nextColor = 27;
                        break;
                    } else {
                        nextColor = 10;
                        break;
                    }
                case 10:
                    c0490Ge = c0490Ge;
                    i4 = c0490Ge.A06.get(i11 + 1).A00;
                    nextColor = 11;
                    break;
                case 11:
                    if (i3 != i4) {
                        nextColor = 13;
                        break;
                    } else {
                        nextColor = 12;
                        break;
                    }
                case 12:
                    i11++;
                    nextColor = 2;
                    break;
                case 13:
                    if (i5 == -1) {
                        nextColor = 24;
                        break;
                    } else {
                        nextColor = 14;
                        break;
                    }
                case 14:
                    if (!z) {
                        nextColor = 15;
                        break;
                    } else {
                        nextColor = 24;
                        break;
                    }
                case 15:
                    spannableStringBuilder = spannableStringBuilder;
                    A02(spannableStringBuilder, i5, i3);
                    i5 = -1;
                    nextColor = 16;
                    break;
                case 16:
                    if (i6 == -1) {
                        nextColor = 21;
                        break;
                    } else {
                        nextColor = 17;
                        break;
                    }
                case 17:
                    if (i9 != 0) {
                        nextColor = 21;
                        break;
                    } else {
                        nextColor = 18;
                        break;
                    }
                case 18:
                    spannableStringBuilder = spannableStringBuilder;
                    A01(spannableStringBuilder, i6, i3);
                    i6 = -1;
                    nextColor = 19;
                    break;
                case 19:
                    int nextColor2 = i10;
                    if (nextColor2 == i8) {
                        nextColor = 12;
                        break;
                    } else {
                        nextColor = 20;
                        break;
                    }
                case 20:
                    spannableStringBuilder = spannableStringBuilder;
                    A03(spannableStringBuilder, i7, i3, i8);
                    i8 = i10;
                    i7 = i3;
                    nextColor = 12;
                    break;
                case 21:
                    if (i6 != -1) {
                        nextColor = 19;
                        break;
                    } else {
                        nextColor = 22;
                        break;
                    }
                case 22:
                    if (i9 == 0) {
                        nextColor = 19;
                        break;
                    } else {
                        nextColor = 23;
                        break;
                    }
                case 23:
                    i6 = i3;
                    nextColor = 19;
                    break;
                case 24:
                    if (i5 != -1) {
                        nextColor = 16;
                        break;
                    } else {
                        nextColor = 25;
                        break;
                    }
                case 25:
                    if (!z) {
                        nextColor = 16;
                        break;
                    } else {
                        nextColor = 26;
                        break;
                    }
                case 26:
                    i5 = i3;
                    nextColor = 16;
                    break;
                case 27:
                    i4 = length;
                    nextColor = 11;
                    break;
                case 28:
                    nextPosition = C01752s.A0J[i2];
                    nextColor = 8;
                    break;
                case 29:
                    colorStartPosition = 0;
                    nextColor = 6;
                    break;
                case 30:
                    i = -1;
                    if (i5 == -1) {
                        nextColor = 33;
                        break;
                    } else {
                        nextColor = 31;
                        break;
                    }
                case 31:
                    if (i5 == length) {
                        nextColor = 33;
                        break;
                    } else {
                        nextColor = 32;
                        break;
                    }
                case 32:
                    spannableStringBuilder = spannableStringBuilder;
                    A02(spannableStringBuilder, i5, length);
                    nextColor = 33;
                    break;
                case 33:
                    if (i6 == i) {
                        nextColor = 36;
                        break;
                    } else {
                        nextColor = 34;
                        break;
                    }
                case 34:
                    if (i6 == length) {
                        nextColor = 36;
                        break;
                    } else {
                        nextColor = 35;
                        break;
                    }
                case 35:
                    spannableStringBuilder = spannableStringBuilder;
                    A01(spannableStringBuilder, i6, length);
                    nextColor = 36;
                    break;
                case 36:
                    if (i7 == length) {
                        nextColor = 38;
                        break;
                    } else {
                        nextColor = 37;
                        break;
                    }
                case 37:
                    spannableStringBuilder = spannableStringBuilder;
                    A03(spannableStringBuilder, i7, length, i8);
                    nextColor = 38;
                    break;
                case 38:
                    return new SpannableString(spannableStringBuilder);
            }
        }
    }

    public static void A01(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
    }

    public static void A02(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
    }

    public static void A03(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        if (i3 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
    }

    public final int A04() {
        return this.A03;
    }

    public final GX A05() {
        float f;
        int i;
        int i2;
        int line;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i3 = 0; i3 < this.A07.size(); i3++) {
            spannableStringBuilder.append((CharSequence) this.A07.get(i3));
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append((CharSequence) A00());
        if (spannableStringBuilder.length() != 0) {
            int positionAnchor = this.A02 + this.A04;
            int startPadding = spannableStringBuilder.length();
            int lineAnchor = (32 - positionAnchor) - startPadding;
            int line2 = positionAnchor - lineAnchor;
            int endPadding = this.A00;
            if (endPadding == 2 && (Math.abs(line2) < 3 || lineAnchor < 0)) {
                f = 0.5f;
                i = 1;
            } else if (this.A00 == 2 && line2 > 0) {
                f = (0.8f * ((32 - lineAnchor) / 32.0f)) + 0.1f;
                i = 2;
            } else {
                float position = positionAnchor;
                f = (0.8f * (position / 32.0f)) + 0.1f;
                i = 0;
            }
            if (this.A00 == 1 || this.A03 > 7) {
                i2 = 2;
                line = (this.A03 - 15) - 2;
            } else {
                i2 = 0;
                line = this.A03;
            }
            return new GX(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, line, 1, i2, f, i, Float.MIN_VALUE);
        }
        return null;
    }

    public final void A06() {
        C0490Ge c0490Ge = this;
        C0489Gd style = null;
        int size = 0;
        int length = c0490Ge.A05.length();
        char c2 = length > 0 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c0490Ge = c0490Ge;
                    c0490Ge.A05.delete(length - 1, length);
                    size = c0490Ge.A06.size() - 1;
                    c2 = 3;
                    break;
                case 3:
                    if (size < 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0490Ge = c0490Ge;
                    style = c0490Ge.A06.get(size);
                    if (style.A00 != length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    style = style;
                    style.A00--;
                    size--;
                    c2 = 3;
                    break;
                case 6:
                    return;
            }
        }
    }

    public final void A07() {
        C0490Ge c0490Ge = this;
        c0490Ge.A07.add(c0490Ge.A00());
        c0490Ge.A05.setLength(0);
        c0490Ge.A06.clear();
        int iMin = Math.min(c0490Ge.A01, c0490Ge.A03);
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0490Ge = c0490Ge;
                    if (c0490Ge.A07.size() < iMin) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0490Ge = c0490Ge;
                    c0490Ge.A07.remove(0);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A08(char c2) {
        this.A05.append(c2);
    }

    public final void A09(int i) {
        this.A00 = i;
        this.A06.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
    }

    public final void A0A(int i) {
        this.A01 = i;
    }

    public final void A0B(int i) {
        this.A02 = i;
    }

    public final void A0C(int i) {
        this.A03 = i;
    }

    public final void A0D(int i) {
        this.A04 = i;
    }

    public final void A0E(int i, boolean z) {
        this.A06.add(new C0489Gd(i, z, this.A05.length()));
    }

    public final boolean A0F() {
        C0490Ge c0490Ge = this;
        boolean z = false;
        char c2 = c0490Ge.A06.isEmpty() ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c0490Ge = c0490Ge;
                    if (!c0490Ge.A07.isEmpty()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0490Ge = c0490Ge;
                    if (c0490Ge.A05.length() != 0) {
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

    public final String toString() {
        return this.A05.toString();
    }
}

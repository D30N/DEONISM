package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Sp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0804Sp extends C4L {
    public static byte[] A0G;

    @Nullable
    public InterfaceC0699Ol A02;
    public List<C0698Ok> A03;
    public boolean A07;
    public final int A08;
    public final T2 A09;
    public final C4T A0A;
    public final Q1 A0E;
    public final Set<Integer> A0F = new HashSet();
    public boolean A06 = true;
    public boolean A04 = true;
    public boolean A05 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final OP A0D = new T1(this);
    public final ON A0B = new T0(this);
    public final OO A0C = new C0811Sw(this);

    static {
        A08();
    }

    public static String A05(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 79);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A08() {
        A0G = new byte[]{-71, -78, -81, -72, -80, -88, -62, -81, -88, -71, -88, -81, -62, -77, -92, -75, -92, -80, -42, -22, -23, -28, -12, -27, -31, -42, -18, -12, -38, -29, -42, -41, -31, -38, -39, -12, -27, -42, -25, -42, -30, -96, -86, -74, -99, -96, -87, -86, -85, -74, -83, -96, -101, -100, -90, -74, -89, -104, -87, -104, -92};
    }

    public C0804Sp(C2S c2s, int i, List<C0698Ok> list, Q1 q1, @Nullable Bundle bundle) {
        this.A09 = c2s.getLayoutManager();
        this.A08 = i;
        this.A03 = list;
        this.A0E = q1;
        this.A0A = new T3(c2s.getContext());
        c2s.A1h(this);
        A0H(bundle);
    }

    @Nullable
    private YQ A02(int i, int i2) {
        return A03(i, i2, true);
    }

    @Nullable
    private YQ A03(int i, int i2, boolean z) {
        C0804Sp c0804Sp = this;
        YQ yq = null;
        boolean zA0O = false;
        YQ yq2 = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i > i2) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0804Sp = c0804Sp;
                    yq = (YQ) c0804Sp.A09.A1q(i);
                    if (yq == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    yq = yq;
                    if (!yq.A0j()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return (YQ) null;
                case 6:
                    yq = yq;
                    zA0O = A0O(yq);
                    if (yq2 != null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    yq = yq;
                    if (!yq.A0k()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (!zA0O) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0804Sp = c0804Sp;
                    if (!c0804Sp.A0F.contains(Integer.valueOf(i))) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\n':
                    if (!z) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    yq = yq;
                    if (!A0Q(yq)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    yq = yq;
                    yq2 = yq;
                    c2 = '\r';
                    break;
                case '\r':
                    yq = yq;
                    if (!yq.A0k()) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    if (!zA0O) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 15:
                    c0804Sp = c0804Sp;
                    c0804Sp.A0G(i, false);
                    c2 = 16;
                    break;
                case 16:
                    i++;
                    c2 = 2;
                    break;
                case 17:
                    return yq2;
            }
        }
    }

    private void A06() {
        C0804Sp c0804Sp = this;
        YQ firstAutoplayableVideo = null;
        char c2 = !c0804Sp.A05 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0804Sp = c0804Sp;
                    int lastVisibleItem = c0804Sp.A09.A28();
                    firstAutoplayableVideo = c0804Sp.A02(lastVisibleItem, c0804Sp.A09.A29());
                    if (firstAutoplayableVideo == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    firstAutoplayableVideo = firstAutoplayableVideo;
                    firstAutoplayableVideo.A0f();
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        C0804Sp c0804Sp = this;
        int iA27 = c0804Sp.A09.A27();
        char c2 = iA27 != -1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0804Sp = c0804Sp;
                    if (iA27 >= c0804Sp.A03.size() - 1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0804Sp = c0804Sp;
                    c0804Sp.A0C(iA27 + 1);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A09(int i) {
        C0804Sp c0804Sp = this;
        YQ yq = (YQ) c0804Sp.A09.A1q(i);
        char c2 = yq != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    yq = yq;
                    if (!A0O(yq)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c0804Sp = c0804Sp;
                    yq = yq;
                    c0804Sp.A0J(yq, false);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A0A(int i) {
        C0804Sp c0804Sp = this;
        float f = 0.0f;
        OP op = null;
        YQ yq = (YQ) c0804Sp.A09.A1q(i);
        char c2 = yq == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    yq = yq;
                    if (!A0O(yq)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0804Sp = c0804Sp;
                    yq = yq;
                    c0804Sp.A0J(yq, true);
                    c2 = 5;
                    break;
                case 5:
                    c0804Sp = c0804Sp;
                    yq = yq;
                    if (!c0804Sp.A0P(yq)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0804Sp = c0804Sp;
                    yq = yq;
                    C0698Ok c0698Ok = c0804Sp.A03.get(((Integer) yq.getTag(-1593835536)).intValue());
                    op = c0804Sp.A0D;
                    if (!c0698Ok.A03().A0D().A09()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    f = 0.0f;
                    c2 = '\b';
                    break;
                case '\b':
                    op = op;
                    op.setVolume(f);
                    c2 = '\t';
                    break;
                case '\t':
                    return;
                case '\n':
                    f = 1.0f;
                    c2 = '\b';
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B(int i) {
        YQ yqA03 = A03(i + 1, this.A09.A29(), false);
        if (yqA03 != null) {
            yqA03.A0f();
            A0C(((Integer) yqA03.getTag(-1593835536)).intValue());
        }
    }

    private void A0C(int i) {
        this.A0A.A0A(i);
        this.A09.A1L(this.A0A);
    }

    private void A0D(int i, int i2) {
        A09(i);
        A09(i2);
    }

    private void A0E(int i, int i2) {
        C0804Sp c0804Sp = this;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i > i2) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0804Sp = c0804Sp;
                    c0804Sp.A0A(i);
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A0F(int i, int i2, int i3) {
        C0804Sp c0804Sp = this;
        int i4 = 0;
        int iA27 = 0;
        char c2 = c0804Sp.A0N() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0804Sp = c0804Sp;
                    if (c0804Sp.A02 != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    c0804Sp = c0804Sp;
                    iA27 = c0804Sp.A09.A27();
                    if (iA27 == -1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i4 = iA27;
                    c2 = 6;
                    break;
                case 6:
                    c0804Sp.A02.ACB(i4);
                    return;
                case 7:
                    if (i3 >= 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    i4 = i;
                    c2 = 6;
                    break;
                case '\t':
                    i4 = i2;
                    c2 = 6;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(int i, boolean z) {
        C0804Sp c0804Sp = this;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0804Sp = c0804Sp;
                    c0804Sp.A0F.add(Integer.valueOf(i));
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c0804Sp = c0804Sp;
                    c0804Sp.A0F.remove(Integer.valueOf(i));
                    c2 = 3;
                    break;
            }
        }
    }

    private void A0H(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(0, 18, 20), 0.0f);
        this.A05 = bundle.getBoolean(A05(18, 23, 70), true);
        this.A06 = bundle.getBoolean(A05(41, 20, 8), true);
    }

    public static void A0I(View view, boolean z) {
        float f = 0.0f;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    f = 1.0f;
                    c2 = 3;
                    break;
                case 3:
                    view.setAlpha(f);
                    return;
                case 4:
                    f = 0.5f;
                    c2 = 3;
                    break;
            }
        }
    }

    private void A0J(YQ yq, boolean z) {
        char c2 = A0N() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    yq = yq;
                    A0I(yq, z);
                    c2 = 3;
                    break;
                case 3:
                    if (!z) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 4:
                    yq = yq;
                    if (!yq.A0j()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    yq = yq;
                    yq.A0e();
                    c2 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0N() {
        return this.A08 == 1;
    }

    public static boolean A0O(View view) {
        boolean z = false;
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        char c2 = ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f ? (char) 2 : (char) 4;
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

    private boolean A0P(YQ yq) {
        char c2 = this.A06 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    yq = yq;
                    if (!yq.A0k()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    this.A06 = false;
                    return true;
                case 4:
                    return false;
            }
        }
    }

    public static boolean A0Q(YQ yq) {
        boolean z = false;
        char c2 = ((int) (yq.getX() + ((float) yq.getWidth()))) <= ((int) (((float) yq.getWidth()) * 1.3f)) ? (char) 2 : (char) 4;
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

    @Override // com.facebook.ads.redexgen.X.C4L
    public final void A0U(C0452Eq c0452Eq, int i) {
        super.A0U(c0452Eq, i);
        if (i == 0) {
            this.A07 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4L
    public final void A0V(C0452Eq c0452Eq, int i, int i2) {
        super.A0V(c0452Eq, i, i2);
        this.A07 = false;
        if (this.A04) {
            this.A07 = true;
            A06();
            this.A04 = false;
        }
        int iA28 = this.A09.A28();
        int iA29 = this.A09.A29();
        A0D(iA28, iA29);
        A0E(iA28, iA29);
        A0F(iA28, iA29, i);
    }

    public final ON A0W() {
        return this.A0B;
    }

    public final OO A0X() {
        return this.A0C;
    }

    public final OP A0Y() {
        return this.A0D;
    }

    public final void A0Z() {
        C0804Sp c0804Sp = this;
        YQ yq = null;
        c0804Sp.A01 = -1;
        int iA28 = c0804Sp.A09.A28();
        int iA29 = c0804Sp.A09.A29();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (iA28 > iA29) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (iA28 < 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0804Sp = c0804Sp;
                    yq = (YQ) c0804Sp.A09.A1q(iA28);
                    if (yq == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    yq = yq;
                    if (!yq.A0j()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0804Sp = c0804Sp;
                    yq = yq;
                    c0804Sp.A01 = iA28;
                    yq.A0e();
                    c2 = 7;
                    break;
                case 7:
                    return;
                case '\b':
                    iA28++;
                    c2 = 2;
                    break;
            }
        }
    }

    public final void A0a() {
        C0804Sp c0804Sp = this;
        YQ yq = (YQ) c0804Sp.A09.A1q(c0804Sp.A01);
        char c2 = yq != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0804Sp = c0804Sp;
                    if (c0804Sp.A01 < 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    yq = yq;
                    yq.A0f();
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A0b(Bundle bundle) {
        bundle.putFloat(A05(0, 18, 20), this.A00);
        bundle.putBoolean(A05(18, 23, 70), this.A05);
        bundle.putBoolean(A05(41, 20, 8), this.A06);
    }

    public final void A0c(InterfaceC0699Ol interfaceC0699Ol) {
        this.A02 = interfaceC0699Ol;
    }
}

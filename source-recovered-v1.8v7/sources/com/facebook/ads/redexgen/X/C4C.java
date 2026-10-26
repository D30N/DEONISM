package com.facebook.ads.redexgen.X;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C4C {
    public C4A A04 = null;
    public ArrayList<RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> A05 = new ArrayList<>();
    public long A00 = 120;
    public long A03 = 120;
    public long A02 = 250;
    public long A01 = 250;

    public abstract boolean A0C(@NonNull C4Y c4y, @Nullable C4B c4b, @NonNull C4B c4b2);

    public abstract boolean A0D(@NonNull C4Y c4y, @NonNull C4B c4b, @Nullable C4B c4b2);

    public abstract boolean A0E(@NonNull C4Y c4y, @NonNull C4B c4b, @NonNull C4B c4b2);

    public abstract boolean A0F(@NonNull C4Y c4y, @NonNull C4Y c4y2, @NonNull C4B c4b, @NonNull C4B c4b2);

    public abstract void A0G();

    public abstract void A0H();

    public abstract void A0I(C4Y c4y);

    public abstract boolean A0J();

    public static int A00(C4Y c4y) {
        int oldPos = 0;
        int pos = 0;
        int iA0G = 0;
        int i = c4y.A0C & 14;
        char c2 = c4y.A0b() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 4;
                case 3:
                    if ((i & 4) != 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4y = c4y;
                    oldPos = c4y.A0J();
                    iA0G = c4y.A0G();
                    pos = -1;
                    if (oldPos == -1) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (iA0G == pos) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (oldPos == iA0G) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    i |= 2048;
                    c2 = '\b';
                    break;
                case '\b':
                    return i;
            }
        }
    }

    private final C4B A01() {
        return new C4B();
    }

    public final long A02() {
        return this.A00;
    }

    public final long A03() {
        return this.A01;
    }

    public final long A04() {
        return this.A02;
    }

    public final long A05() {
        return this.A03;
    }

    @NonNull
    public final C4B A06(@NonNull C4V c4v, @NonNull C4Y c4y) {
        return A01().A01(c4y);
    }

    @NonNull
    public final C4B A07(@NonNull C4V c4v, @NonNull C4Y c4y, int i, @NonNull List<Object> list) {
        return A01().A01(c4y);
    }

    public final void A08() {
        C4C c4c = this;
        int size = c4c.A05.size();
        int i = 0;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    if (i >= size) {
                        i2 = 4;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    c4c = c4c;
                    c4c.A05.get(i);
                    i++;
                    i2 = 2;
                    break;
                case 4:
                    c4c.A05.clear();
                    return;
            }
        }
    }

    public final void A09(C4A c4a) {
        this.A04 = c4a;
    }

    public final void A0A(C4Y c4y) {
        C4A c4a = this.A04;
        if (c4a != null) {
            c4a.A8s(c4y);
        }
    }

    public boolean A0B(@NonNull C4Y c4y) {
        return true;
    }

    public boolean A0K(@NonNull C4Y c4y, @NonNull List<Object> list) {
        return A0B(c4y);
    }
}

package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.CheckResult;
import android.support.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: assets/audience_network.dex */
public final class FL {
    public final int A00;

    @Nullable
    public final F8 A01;
    public final long A02;
    public final CopyOnWriteArrayList<FK> A03;

    public FL() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public FL(CopyOnWriteArrayList<FK> copyOnWriteArrayList, int i, @Nullable F8 f8, long j) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = f8;
        this.A02 = j;
    }

    private long A00(long j) {
        long jA01 = C03419q.A01(j);
        if (jA01 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.A02 + jA01;
    }

    private void A01(Handler handler, Runnable runnable) {
        char c2 = handler.getLooper() == Looper.myLooper() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    runnable = runnable;
                    runnable.run();
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    handler = handler;
                    runnable = runnable;
                    handler.post(runnable);
                    c2 = 3;
                    break;
            }
        }
    }

    @CheckResult
    public final FL A02(int i, @Nullable F8 f8, long j) {
        return new FL(this.A03, i, f8, j);
    }

    public final void A03() {
        FL fl = this;
        Iterator<FK> it = null;
        boolean z = false;
        char c2 = fl.A01 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    fl = fl;
                    IJ.A04(z);
                    it = fl.A03.iterator();
                    c2 = 4;
                    break;
                case 4:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    fl = fl;
                    it = it;
                    FK next = it.next();
                    fl.A01(next.A00, new FB(fl, next.A01));
                    c2 = 4;
                    break;
                case 6:
                    z = false;
                    c2 = 3;
                    break;
                case 7:
                    return;
            }
        }
    }

    public final void A04() {
        FL fl = this;
        Iterator<FK> it = null;
        boolean z = false;
        char c2 = fl.A01 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    fl = fl;
                    IJ.A04(z);
                    it = fl.A03.iterator();
                    c2 = 4;
                    break;
                case 4:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    fl = fl;
                    it = it;
                    FK next = it.next();
                    fl.A01(next.A00, new FC(fl, next.A01));
                    c2 = 4;
                    break;
                case 6:
                    z = false;
                    c2 = 3;
                    break;
                case 7:
                    return;
            }
        }
    }

    public final void A05() {
        FL fl = this;
        Iterator<FK> it = null;
        boolean z = false;
        char c2 = fl.A01 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    fl = fl;
                    IJ.A04(z);
                    it = fl.A03.iterator();
                    c2 = 4;
                    break;
                case 4:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    fl = fl;
                    it = it;
                    FK next = it.next();
                    fl.A01(next.A00, new FH(fl, next.A01));
                    c2 = 4;
                    break;
                case 6:
                    z = false;
                    c2 = 3;
                    break;
                case 7:
                    return;
            }
        }
    }

    public final void A06(int i, @Nullable Format format, int i2, @Nullable Object obj, long j) {
        A0C(new FN(1, i, format, i2, obj, A00(j), -9223372036854775807L));
    }

    public final void A07(Handler handler, FO fo) {
        boolean z = false;
        char c2 = handler != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    fo = fo;
                    if (fo == null) {
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
                    IJ.A03(z);
                    this.A03.add(new FK(handler, fo));
                    return;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public final void A08(FM fm, FN fn) {
        FL fl = this;
        Iterator<FK> it = fl.A03.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    fl = fl;
                    fm = fm;
                    fn = fn;
                    it = it;
                    FK next = it.next();
                    fl.A01(next.A00, new FF(fl, next.A01, fm, fn));
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A09(FM fm, FN fn) {
        FL fl = this;
        Iterator<FK> it = fl.A03.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    fl = fl;
                    fm = fm;
                    fn = fn;
                    it = it;
                    FK next = it.next();
                    fl.A01(next.A00, new FE(fl, next.A01, fm, fn));
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A0A(FM fm, FN fn) {
        FL fl = this;
        Iterator<FK> it = fl.A03.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    fl = fl;
                    fm = fm;
                    fn = fn;
                    it = it;
                    FK next = it.next();
                    fl.A01(next.A00, new FD(fl, next.A01, fm, fn));
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A0B(FM fm, FN fn, IOException iOException, boolean z) {
        Iterator<FK> it = this.A03.iterator();
        while (it.hasNext()) {
            FK listenerAndHandler = it.next();
            A01(listenerAndHandler.A00, new FG(this, listenerAndHandler.A01, fm, fn, iOException, z));
        }
    }

    public final void A0C(FN fn) {
        FL fl = this;
        Iterator<FK> it = fl.A03.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    fl = fl;
                    fn = fn;
                    it = it;
                    FK next = it.next();
                    fl.A01(next.A00, new FJ(fl, next.A01, fn));
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A0D(FO fo) {
        FL fl = this;
        FK next = null;
        Iterator<FK> it = fl.A03.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    fo = fo;
                    it = it;
                    next = it.next();
                    if (next.A01 != fo) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    fl = fl;
                    next = next;
                    fl.A03.remove(next);
                    c2 = 2;
                    break;
                case 5:
                    return;
            }
        }
    }

    public final void A0E(C0520Hi c0520Hi, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3) {
        A0A(new FM(c0520Hi, j3, 0L, 0L), new FN(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0F(C0520Hi c0520Hi, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
        A08(new FM(c0520Hi, j3, j4, j5), new FN(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0G(C0520Hi c0520Hi, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
        A09(new FM(c0520Hi, j3, j4, j5), new FN(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0H(C0520Hi c0520Hi, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        A0B(new FM(c0520Hi, j3, j4, j5), new FN(i, i2, format, i3, obj, A00(j), A00(j2)), iOException, z);
    }
}

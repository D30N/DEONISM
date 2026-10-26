package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import d.b.a.b.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.redexgen.X.Ea, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0438Ea {
    public static byte[] A0F;
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Handler A06;
    public final Handler A07;
    public final HandlerThread A08;
    public final EG A09;
    public final C0443Ef A0A;
    public final ArrayList<EX> A0B;
    public final ArrayList<EX> A0C;
    public final CopyOnWriteArraySet<ET> A0D;
    public final DownloadAction.Deserializer[] A0E;

    static {
        A0C();
    }

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 126);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0C() {
        A0F = new byte[]{48, 22, -35, -22, -4, -12, -87, -14, -4, -87, -22, -19, -19, -18, -19, 23, 90, 99, 88, 106, 95, 92, 106, 23, 110, 96, 107, 95, 23, 55, 98, 106, 97, 95, 98, 84, 87, 64, 84, 97, 84, 90, 88, 101, 19, 89, 92, 95, 88, 19, 92, 34, 98, -46, 5, -79, -3, -10, -14, 4, 5, -79, 0, -1, -10, -79, -43, -10, 4, -10, 3, -6, -14, -3, -6, 11, -10, 3, -79, -6, 4, -79, 3, -10, 2, 6, -6, 3, -10, -11, -65, 11, 24, 42, 34, -41, 42, 43, 24, 43, 28, -41, 32, 42, -41, 26, 31, 24, 37, 30, 28, 27};
    }

    public C0438Ea(C0443Ef c0443Ef, int i, int i2, File file, DownloadAction.Deserializer... deserializerArr) {
        IJ.A05(deserializerArr.length > 0, A05(53, 38, 19));
        this.A0A = c0443Ef;
        this.A04 = i;
        this.A05 = i2;
        this.A09 = new EG(file);
        this.A0E = deserializerArr;
        this.A01 = true;
        this.A0C = new ArrayList<>();
        this.A0B = new ArrayList<>();
        Looper looperMyLooper = Looper.myLooper();
        this.A07 = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper);
        this.A08 = new HandlerThread(A05(29, 24, k.AppCompatTheme_windowActionModeOverlay));
        this.A08.start();
        this.A06 = new Handler(this.A08.getLooper());
        this.A0D = new CopyOnWriteArraySet<>();
        A08();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EX A02(DownloadAction downloadAction) {
        int i = this.A00;
        this.A00 = i + 1;
        EX ex = new EX(i, this, downloadAction, this.A05, null);
        this.A0C.add(ex);
        A0J(A05(2, 13, 11), ex);
        return ex;
    }

    private void A08() {
        this.A06.post(new ER(this));
    }

    private void A09() {
        C0438Ea c0438Ea = this;
        Iterator<ET> it = null;
        char c2 = !c0438Ea.A0R() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0438Ea = c0438Ea;
                    it = c0438Ea.A0D.iterator();
                    c2 = 4;
                    break;
                case 4:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0438Ea = c0438Ea;
                    it = it;
                    it.next().A9g(c0438Ea);
                    c2 = 4;
                    break;
                case 6:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        C0438Ea c0438Ea = this;
        EX ex = null;
        boolean z = false;
        int i = 0;
        DownloadAction action = null;
        boolean canStartTask = false;
        int j = 0;
        EX otherTask = null;
        int i2 = 0;
        int i3 = 0;
        char c2 = c0438Ea.A02 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0438Ea = c0438Ea;
                    if (!c0438Ea.A03) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    c0438Ea = c0438Ea;
                    if (!c0438Ea.A01) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    c0438Ea = c0438Ea;
                    if (c0438Ea.A0B.size() != c0438Ea.A04) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    j = 1;
                    c2 = 7;
                    break;
                case 7:
                    i = 0;
                    c2 = '\b';
                    break;
                case '\b':
                    c0438Ea = c0438Ea;
                    if (i >= c0438Ea.A0C.size()) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0438Ea = c0438Ea;
                    EX otherTask2 = c0438Ea.A0C.get(i);
                    otherTask = otherTask2;
                    if (!otherTask.A0E()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case '\n':
                    i++;
                    c2 = '\b';
                    break;
                case 11:
                    otherTask = otherTask;
                    action = otherTask.A04;
                    z = action.A03;
                    if (!z) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\f':
                    if (j == 0) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\r':
                    canStartTask = true;
                    i3 = 0;
                    c2 = 14;
                    break;
                case 14:
                    if (i3 >= i) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c0438Ea = c0438Ea;
                    action = action;
                    ex = c0438Ea.A0C.get(i3);
                    if (!ex.A04.A0A(action)) {
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
                    otherTask = otherTask;
                    ex = ex;
                    canStartTask = false;
                    String str = otherTask + A05(15, 14, k.AppCompatTheme_windowFixedWidthMinor) + ex;
                    ex.A08();
                    c2 = 18;
                    break;
                case 18:
                    i3++;
                    c2 = 14;
                    break;
                case 19:
                    ex = ex;
                    if (!ex.A04.A03) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    canStartTask = false;
                    j = 1;
                    c2 = 21;
                    break;
                case 21:
                    if (!canStartTask) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    otherTask = otherTask;
                    otherTask.A0A();
                    if (!z) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case 23:
                    c0438Ea = c0438Ea;
                    otherTask = otherTask;
                    c0438Ea.A0B.add(otherTask);
                    if (c0438Ea.A0B.size() != c0438Ea.A04) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    i2 = 1;
                    c2 = 25;
                    break;
                case 25:
                    j = i2;
                    c2 = '\n';
                    break;
                case 26:
                    i2 = 0;
                    c2 = 25;
                    break;
                case 27:
                    j = 0;
                    c2 = 7;
                    break;
                case 28:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        C0438Ea c0438Ea = this;
        DownloadAction[] downloadActionArr = null;
        int i = 0;
        char c2 = c0438Ea.A03 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0438Ea = c0438Ea;
                    downloadActionArr = new DownloadAction[c0438Ea.A0C.size()];
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    c0438Ea = c0438Ea;
                    if (i >= c0438Ea.A0C.size()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0438Ea = c0438Ea;
                    downloadActionArr = downloadActionArr;
                    downloadActionArr[i] = c0438Ea.A0C.get(i).A04;
                    i++;
                    c2 = 4;
                    break;
                case 6:
                    C0438Ea c0438Ea2 = c0438Ea;
                    c0438Ea2.A06.post(new ES(c0438Ea2, downloadActionArr));
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(EX ex) {
        C0438Ea c0438Ea = this;
        A0J(A05(91, 21, 57), ex);
        EZ ezA0K = ex.A0K();
        Iterator<ET> it = c0438Ea.A0D.iterator();
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
                    c0438Ea = c0438Ea;
                    ezA0K = ezA0K;
                    it = it;
                    ET listener = it.next();
                    listener.ABA(c0438Ea, ezA0K);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(EX ex) {
        C0438Ea c0438Ea = this;
        boolean z = false;
        char c2 = c0438Ea.A03 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    ex = ex;
                    z = !ex.A0L();
                    if (!z) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0438Ea = c0438Ea;
                    ex = ex;
                    c0438Ea.A0B.remove(ex);
                    c2 = 5;
                    break;
                case 5:
                    c0438Ea = c0438Ea;
                    ex = ex;
                    c0438Ea.A0D(ex);
                    if (!ex.A0M()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0438Ea = c0438Ea;
                    ex = ex;
                    c0438Ea.A0C.remove(ex);
                    c0438Ea.A0B();
                    c2 = 7;
                    break;
                case 7:
                    if (!z) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0438Ea = c0438Ea;
                    c0438Ea.A0A();
                    c0438Ea.A09();
                    c2 = '\t';
                    break;
                case '\t':
                    return;
            }
        }
    }

    public static void A0J(String str, EX ex) {
        String str2 = str + A05(0, 2, k.AppCompatTheme_windowFixedWidthMajor) + ex;
    }

    public final int A0O(DownloadAction downloadAction) {
        C0438Ea c0438Ea = this;
        IJ.A04(!c0438Ea.A03);
        EX exA02 = c0438Ea.A02(downloadAction);
        char c2 = c0438Ea.A02 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0438Ea = c0438Ea;
                    exA02 = exA02;
                    c0438Ea.A0B();
                    c0438Ea.A0A();
                    if (exA02.A06 != 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0438Ea = c0438Ea;
                    exA02 = exA02;
                    c0438Ea.A0D(exA02);
                    c2 = 4;
                    break;
                case 4:
                    return exA02.A02;
            }
        }
    }

    public final void A0P() {
        IJ.A04(!this.A03);
        if (this.A01) {
            this.A01 = false;
            A0A();
        }
    }

    public final void A0Q(ET et) {
        this.A0D.add(et);
    }

    public final boolean A0R() {
        C0438Ea c0438Ea = this;
        int i = 0;
        IJ.A04(!c0438Ea.A03);
        char c2 = !c0438Ea.A02 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    c0438Ea = c0438Ea;
                    if (i >= c0438Ea.A0C.size()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0438Ea = c0438Ea;
                    if (!c0438Ea.A0C.get(i).A0L()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return false;
                case 7:
                    i++;
                    c2 = 4;
                    break;
                case '\b':
                    return true;
            }
        }
    }

    public final EZ[] A0S() {
        C0438Ea c0438Ea = this;
        IJ.A04(!c0438Ea.A03);
        EZ[] ezArr = new EZ[c0438Ea.A0C.size()];
        int i = 0;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    ezArr = ezArr;
                    int i3 = ezArr.length;
                    if (i >= i3) {
                        i2 = 4;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    c0438Ea = c0438Ea;
                    ezArr = ezArr;
                    ezArr[i] = c0438Ea.A0C.get(i).A0K();
                    i++;
                    i2 = 2;
                    break;
                case 4:
                    return ezArr;
            }
        }
    }
}

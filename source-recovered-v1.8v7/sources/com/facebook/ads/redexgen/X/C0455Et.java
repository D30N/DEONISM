package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Et, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0455Et extends TH {
    public static TimeInterpolator A0B;
    public ArrayList<C4Y> A0A = new ArrayList<>();
    public ArrayList<C4Y> A07 = new ArrayList<>();
    public ArrayList<C01963o> A09 = new ArrayList<>();
    public ArrayList<C01953n> A08 = new ArrayList<>();
    public ArrayList<ArrayList<C4Y>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<C01963o>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<C01953n>> A03 = new ArrayList<>();
    public ArrayList<C4Y> A00 = new ArrayList<>();
    public ArrayList<C4Y> A04 = new ArrayList<>();
    public ArrayList<C4Y> A06 = new ArrayList<>();
    public ArrayList<C4Y> A02 = new ArrayList<>();

    private void A01(C01953n c01953n) {
        C0455Et c0455Et = this;
        char c2 = c01953n.A05 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0455Et = c0455Et;
                    c01953n = c01953n;
                    c0455Et.A06(c01953n, c01953n.A05);
                    c2 = 3;
                    break;
                case 3:
                    c01953n = c01953n;
                    if (c01953n.A04 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0455Et = c0455Et;
                    c01953n = c01953n;
                    c0455Et.A06(c01953n, c01953n.A04);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    private void A02(final C4Y c4y) {
        final View view = c4y.A0H;
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A06.add(c4y);
        viewPropertyAnimatorAnimate.setDuration(A05()).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3i
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                view.setAlpha(1.0f);
                this.A02.A0P(c4y);
                this.A02.A06.remove(c4y);
                this.A02.A0X();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                this.A02.A0Q(c4y);
            }
        }).start();
    }

    private void A03(C4Y c4y) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        c4y.A0H.animate().setInterpolator(A0B);
        A0I(c4y);
    }

    private final void A04(List<C4Y> list) {
        int size = list.size() - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (size < 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    list = list;
                    list.get(size).A0H.animate().cancel();
                    size--;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A05(List<C01953n> list, C4Y c4y) {
        C0455Et c0455Et = this;
        C01953n c01953n = null;
        int size = list.size() - 1;
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
                    c0455Et = c0455Et;
                    list = list;
                    c4y = c4y;
                    c01953n = list.get(size);
                    if (!c0455Et.A06(c01953n, c4y)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c01953n = c01953n;
                    if (c01953n.A05 != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c01953n = c01953n;
                    if (c01953n.A04 != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    list = list;
                    c01953n = c01953n;
                    list.remove(c01953n);
                    c2 = 7;
                    break;
                case 7:
                    size--;
                    c2 = 2;
                    break;
                case '\b':
                    return;
            }
        }
    }

    private boolean A06(C01953n c01953n, C4Y c4y) {
        boolean z = false;
        char c2 = c01953n.A04 == c4y ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c01953n = c01953n;
                    c01953n.A04 = null;
                    c2 = 3;
                    break;
                case 3:
                    C4Y c4y2 = c4y;
                    c4y2.A0H.setAlpha(1.0f);
                    c4y2.A0H.setTranslationX(0.0f);
                    c4y2.A0H.setTranslationY(0.0f);
                    A0R(c4y2, z);
                    return true;
                case 4:
                    c01953n = c01953n;
                    c4y = c4y;
                    if (c01953n.A05 != c4y) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c01953n = c01953n;
                    c01953n.A05 = null;
                    z = true;
                    c2 = 3;
                    break;
                case 6:
                    return false;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4C
    public final void A0G() {
        C0455Et c0455Et = this;
        ArrayList<C01953n> arrayList = null;
        int size = 0;
        int size2 = 0;
        int j = 0;
        ArrayList<C01963o> arrayList2 = null;
        int size3 = 0;
        int size4 = 0;
        int size5 = 0;
        int size6 = 0;
        int size7 = 0;
        int size8 = 0;
        float f = 0.0f;
        ArrayList<C4Y> arrayList3 = null;
        float f2 = 0.0f;
        int size9 = c0455Et.A09.size() - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    f = 0.0f;
                    if (size9 < 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0455Et = c0455Et;
                    f = 0.0f;
                    C01963o c01963o = c0455Et.A09.get(size9);
                    View view = c01963o.A04.A0H;
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c0455Et.A0N(c01963o.A04);
                    c0455Et.A09.remove(size9);
                    size9--;
                    c2 = 2;
                    break;
                case 4:
                    c0455Et = c0455Et;
                    size5 = c0455Et.A0A.size() - 1;
                    c2 = 5;
                    break;
                case 5:
                    if (size5 < 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0455Et = c0455Et;
                    c0455Et.A0P(c0455Et.A0A.get(size5));
                    c0455Et.A0A.remove(size5);
                    size5--;
                    c2 = 5;
                    break;
                case 7:
                    c0455Et = c0455Et;
                    size8 = c0455Et.A07.size() - 1;
                    c2 = '\b';
                    break;
                case '\b':
                    f2 = 1.0f;
                    if (size8 < 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0455Et = c0455Et;
                    C4Y c4y = c0455Et.A07.get(size8);
                    c4y.A0H.setAlpha(f2);
                    c0455Et.A0L(c4y);
                    c0455Et.A07.remove(size8);
                    size8--;
                    c2 = '\b';
                    break;
                case '\n':
                    c0455Et = c0455Et;
                    size4 = c0455Et.A08.size() - 1;
                    c2 = 11;
                    break;
                case 11:
                    if (size4 < 0) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c0455Et = c0455Et;
                    c0455Et.A01(c0455Et.A08.get(size4));
                    size4--;
                    c2 = 11;
                    break;
                case '\r':
                    c0455Et = c0455Et;
                    c0455Et.A08.clear();
                    if (!c0455Et.A0J()) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 14:
                    return;
                case 15:
                    c0455Et = c0455Et;
                    size7 = c0455Et.A05.size() - 1;
                    c2 = 16;
                    break;
                case 16:
                    if (size7 < 0) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c0455Et = c0455Et;
                    arrayList2 = c0455Et.A05.get(size7);
                    size3 = arrayList2.size() - 1;
                    c2 = 18;
                    break;
                case 18:
                    if (size3 < 0) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    c0455Et = c0455Et;
                    arrayList2 = arrayList2;
                    C01963o c01963o2 = arrayList2.get(size3);
                    View view2 = c01963o2.A04.A0H;
                    view2.setTranslationY(f);
                    view2.setTranslationX(f);
                    c0455Et.A0N(c01963o2.A04);
                    arrayList2.remove(size3);
                    if (!arrayList2.isEmpty()) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c0455Et = c0455Et;
                    arrayList2 = arrayList2;
                    c0455Et.A05.remove(arrayList2);
                    c2 = 21;
                    break;
                case 21:
                    size3--;
                    c2 = 18;
                    break;
                case 22:
                    size7--;
                    c2 = 16;
                    break;
                case 23:
                    c0455Et = c0455Et;
                    size2 = c0455Et.A01.size() - 1;
                    c2 = 24;
                    break;
                case 24:
                    if (size2 < 0) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    c0455Et = c0455Et;
                    arrayList3 = c0455Et.A01.get(size2);
                    j = arrayList3.size() - 1;
                    c2 = 26;
                    break;
                case 26:
                    if (j < 0) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    c0455Et = c0455Et;
                    arrayList3 = arrayList3;
                    C4Y c4y2 = arrayList3.get(j);
                    c4y2.A0H.setAlpha(f2);
                    c0455Et.A0L(c4y2);
                    arrayList3.remove(j);
                    if (!arrayList3.isEmpty()) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    c0455Et = c0455Et;
                    arrayList3 = arrayList3;
                    c0455Et.A01.remove(arrayList3);
                    c2 = 29;
                    break;
                case 29:
                    j--;
                    c2 = 26;
                    break;
                case 30:
                    size2--;
                    c2 = 24;
                    break;
                case 31:
                    c0455Et = c0455Et;
                    size = c0455Et.A03.size() - 1;
                    c2 = ' ';
                    break;
                case ' ':
                    if (size < 0) {
                        c2 = '\'';
                        break;
                    } else {
                        c2 = '!';
                        break;
                    }
                case '!':
                    c0455Et = c0455Et;
                    arrayList = c0455Et.A03.get(size);
                    size6 = arrayList.size() - 1;
                    c2 = '\"';
                    break;
                case '\"':
                    if (size6 < 0) {
                        c2 = '&';
                        break;
                    } else {
                        c2 = '#';
                        break;
                    }
                case '#':
                    c0455Et = c0455Et;
                    arrayList = arrayList;
                    size6 = size6;
                    c0455Et.A01(arrayList.get(size6));
                    if (!arrayList.isEmpty()) {
                        c2 = '%';
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case '$':
                    c0455Et = c0455Et;
                    arrayList = arrayList;
                    c0455Et.A03.remove(arrayList);
                    c2 = '%';
                    break;
                case '%':
                    size6--;
                    c2 = '\"';
                    break;
                case '&':
                    size--;
                    c2 = ' ';
                    break;
                case '\'':
                    C0455Et c0455Et2 = c0455Et;
                    c0455Et2.A04(c0455Et2.A06);
                    c0455Et2.A04(c0455Et2.A04);
                    c0455Et2.A04(c0455Et2.A00);
                    c0455Et2.A04(c0455Et2.A02);
                    c0455Et2.A08();
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4C
    public final void A0H() {
        final C0455Et c0455Et = this;
        long jA05 = 0;
        long jA03 = 0;
        final ArrayList<C4Y> arrayList = null;
        Runnable runnable = null;
        Runnable runnable2 = null;
        int i = 0;
        Runnable runnable3 = null;
        long jA04 = 0;
        final ArrayList<C01953n> arrayList2 = null;
        Iterator<C4Y> it = null;
        final ArrayList<C01963o> arrayList3 = null;
        boolean z = !c0455Et.A0A.isEmpty();
        boolean z2 = !c0455Et.A09.isEmpty();
        boolean z3 = !c0455Et.A08.isEmpty();
        boolean z4 = !c0455Et.A07.isEmpty();
        char c2 = !z ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (!z2) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 3:
                    if (!z4) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 4:
                    if (!z3) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    return;
                case 6:
                    c0455Et = c0455Et;
                    it = c0455Et.A0A.iterator();
                    c2 = 7;
                    break;
                case 7:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0455Et = c0455Et;
                    it = it;
                    c0455Et.A02(it.next());
                    c2 = 7;
                    break;
                case '\t':
                    c0455Et = c0455Et;
                    c0455Et.A0A.clear();
                    i = 0;
                    if (!z2) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c0455Et = c0455Et;
                    arrayList3 = new ArrayList<>();
                    arrayList3.addAll(c0455Et.A09);
                    c0455Et.A05.add(arrayList3);
                    c0455Et.A09.clear();
                    runnable2 = new Runnable() { // from class: com.facebook.ads.redexgen.X.3f
                        @Override // java.lang.Runnable
                        public final void run() {
                            RunnableC01873f runnableC01873f = this;
                            Iterator it2 = arrayList3.iterator();
                            char c3 = 2;
                            while (true) {
                                switch (c3) {
                                    case 2:
                                        it2 = it2;
                                        if (!it2.hasNext()) {
                                            c3 = 4;
                                            break;
                                        } else {
                                            c3 = 3;
                                            break;
                                        }
                                    case 3:
                                        runnableC01873f = runnableC01873f;
                                        it2 = it2;
                                        C01963o moveInfo = (C01963o) it2.next();
                                        runnableC01873f.A00.A0a(moveInfo.A04, moveInfo.A00, moveInfo.A01, moveInfo.A02, moveInfo.A03);
                                        c3 = 2;
                                        break;
                                    case 4:
                                        RunnableC01873f runnableC01873f2 = runnableC01873f;
                                        arrayList3.clear();
                                        runnableC01873f2.A00.A05.remove(arrayList3);
                                        return;
                                }
                            }
                        }
                    };
                    if (!z) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0455Et = c0455Et;
                    arrayList3 = arrayList3;
                    runnable2 = (RunnableC01873f) runnable2;
                    i = 0;
                    C2v.A0D(arrayList3.get(0).A04.A0H, runnable2, c0455Et.A05());
                    c2 = '\f';
                    break;
                case '\f':
                    if (!z3) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c0455Et = c0455Et;
                    arrayList2 = new ArrayList<>();
                    arrayList2.addAll(c0455Et.A08);
                    c0455Et.A03.add(arrayList2);
                    c0455Et.A08.clear();
                    runnable = new Runnable() { // from class: com.facebook.ads.redexgen.X.3g
                        @Override // java.lang.Runnable
                        public final void run() {
                            RunnableC01883g runnableC01883g = this;
                            Iterator it2 = arrayList2.iterator();
                            char c3 = 2;
                            while (true) {
                                switch (c3) {
                                    case 2:
                                        it2 = it2;
                                        if (!it2.hasNext()) {
                                            c3 = 4;
                                            break;
                                        } else {
                                            c3 = 3;
                                            break;
                                        }
                                    case 3:
                                        runnableC01883g = runnableC01883g;
                                        it2 = it2;
                                        runnableC01883g.A00.A0Y((C01953n) it2.next());
                                        c3 = 2;
                                        break;
                                    case 4:
                                        RunnableC01883g runnableC01883g2 = runnableC01883g;
                                        arrayList2.clear();
                                        runnableC01883g2.A00.A03.remove(arrayList2);
                                        return;
                                }
                            }
                        }
                    };
                    if (!z) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c0455Et = c0455Et;
                    arrayList2 = arrayList2;
                    runnable = (RunnableC01883g) runnable;
                    C2v.A0D(arrayList2.get(i).A05.A0H, runnable, c0455Et.A05());
                    c2 = 15;
                    break;
                case 15:
                    if (!z4) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c0455Et = c0455Et;
                    arrayList = new ArrayList<>();
                    arrayList.addAll(c0455Et.A07);
                    c0455Et.A01.add(arrayList);
                    c0455Et.A07.clear();
                    runnable3 = new Runnable() { // from class: com.facebook.ads.redexgen.X.3h
                        @Override // java.lang.Runnable
                        public final void run() {
                            RunnableC01893h runnableC01893h = this;
                            Iterator it2 = arrayList.iterator();
                            char c3 = 2;
                            while (true) {
                                switch (c3) {
                                    case 2:
                                        it2 = it2;
                                        if (!it2.hasNext()) {
                                            c3 = 4;
                                            break;
                                        } else {
                                            c3 = 3;
                                            break;
                                        }
                                    case 3:
                                        runnableC01893h = runnableC01893h;
                                        it2 = it2;
                                        runnableC01893h.A00.A0Z((C4Y) it2.next());
                                        c3 = 2;
                                        break;
                                    case 4:
                                        RunnableC01893h runnableC01893h2 = runnableC01893h;
                                        arrayList.clear();
                                        runnableC01893h2.A00.A01.remove(arrayList);
                                        return;
                                }
                            }
                        }
                    };
                    if (!z) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 17:
                    if (!z2) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 18:
                    if (!z3) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    jA03 = 0;
                    if (!z) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c0455Et = c0455Et;
                    jA05 = c0455Et.A05();
                    c2 = 21;
                    break;
                case 21:
                    if (!z2) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    c0455Et = c0455Et;
                    jA04 = c0455Et.A04();
                    c2 = 23;
                    break;
                case 23:
                    if (!z3) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    c0455Et = c0455Et;
                    jA03 = c0455Et.A03();
                    c2 = 25;
                    break;
                case 25:
                    arrayList = arrayList;
                    runnable3 = (RunnableC01893h) runnable3;
                    C2v.A0D(arrayList.get(i).A0H, runnable3, Math.max(jA04, jA03) + jA05);
                    c2 = 26;
                    break;
                case 26:
                    return;
                case 27:
                    jA04 = jA03;
                    c2 = 23;
                    break;
                case 28:
                    jA05 = jA03;
                    c2 = 21;
                    break;
                case 29:
                    runnable3 = (RunnableC01893h) runnable3;
                    runnable3.run();
                    c2 = 26;
                    break;
                case 30:
                    runnable = (RunnableC01883g) runnable;
                    runnable.run();
                    c2 = 15;
                    break;
                case 31:
                    runnable2 = (RunnableC01873f) runnable2;
                    runnable2.run();
                    c2 = '\f';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4C
    public final void A0I(C4Y c4y) {
        C0455Et c0455Et = this;
        ArrayList<C4Y> arrayList = null;
        int size = 0;
        ArrayList<C01963o> arrayList2 = null;
        int size2 = 0;
        int size3 = 0;
        int size4 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        View view = c4y.A0H;
        view.animate().cancel();
        int size5 = c0455Et.A09.size() - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    f = 0.0f;
                    if (size5 < 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0455Et = c0455Et;
                    c4y = c4y;
                    if (c0455Et.A09.get(size5).A04 != c4y) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0455Et = c0455Et;
                    c4y = c4y;
                    view = view;
                    f = 0.0f;
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c0455Et.A0N(c4y);
                    c0455Et.A09.remove(size5);
                    c2 = 5;
                    break;
                case 5:
                    size5--;
                    c2 = 2;
                    break;
                case 6:
                    c0455Et = c0455Et;
                    c4y = c4y;
                    c0455Et.A05(c0455Et.A08, c4y);
                    f2 = 1.0f;
                    if (!c0455Et.A0A.remove(c4y)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0455Et = c0455Et;
                    c4y = c4y;
                    view = view;
                    view.setAlpha(f2);
                    c0455Et.A0P(c4y);
                    c2 = '\b';
                    break;
                case '\b':
                    c0455Et = c0455Et;
                    c4y = c4y;
                    if (!c0455Et.A07.remove(c4y)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0455Et = c0455Et;
                    c4y = c4y;
                    view = view;
                    view.setAlpha(f2);
                    c0455Et.A0L(c4y);
                    c2 = '\n';
                    break;
                case '\n':
                    c0455Et = c0455Et;
                    size3 = c0455Et.A03.size() - 1;
                    c2 = 11;
                    break;
                case 11:
                    if (size3 < 0) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c0455Et = c0455Et;
                    c4y = c4y;
                    ArrayList<C01953n> arrayList3 = c0455Et.A03.get(size3);
                    c0455Et.A05(arrayList3, c4y);
                    if (!arrayList3.isEmpty()) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c0455Et = c0455Et;
                    c0455Et.A03.remove(size3);
                    c2 = 14;
                    break;
                case 14:
                    size3--;
                    c2 = 11;
                    break;
                case 15:
                    c0455Et = c0455Et;
                    size2 = c0455Et.A05.size() - 1;
                    c2 = 16;
                    break;
                case 16:
                    if (size2 < 0) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c0455Et = c0455Et;
                    arrayList2 = c0455Et.A05.get(size2);
                    size4 = arrayList2.size() - 1;
                    c2 = 18;
                    break;
                case 18:
                    if (size4 < 0) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    c4y = c4y;
                    arrayList2 = arrayList2;
                    if (arrayList2.get(size4).A04 != c4y) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c0455Et = c0455Et;
                    c4y = c4y;
                    view = view;
                    arrayList2 = arrayList2;
                    view.setTranslationY(f);
                    view.setTranslationX(f);
                    c0455Et.A0N(c4y);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    c0455Et = c0455Et;
                    c0455Et.A05.remove(size2);
                    c2 = 22;
                    break;
                case 22:
                    size2--;
                    c2 = 16;
                    break;
                case 23:
                    size4--;
                    c2 = 18;
                    break;
                case 24:
                    c0455Et = c0455Et;
                    size = c0455Et.A01.size() - 1;
                    c2 = 25;
                    break;
                case 25:
                    if (size < 0) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    c0455Et = c0455Et;
                    c4y = c4y;
                    arrayList = c0455Et.A01.get(size);
                    if (!arrayList.remove(c4y)) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    c0455Et = c0455Et;
                    c4y = c4y;
                    view = view;
                    arrayList = arrayList;
                    view.setAlpha(f2);
                    c0455Et.A0L(c4y);
                    if (!arrayList.isEmpty()) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    c0455Et = c0455Et;
                    c0455Et.A01.remove(size);
                    c2 = 29;
                    break;
                case 29:
                    size--;
                    c2 = 25;
                    break;
                case 30:
                    C0455Et c0455Et2 = c0455Et;
                    C4Y c4y2 = c4y;
                    c0455Et2.A06.remove(c4y2);
                    c0455Et2.A00.remove(c4y2);
                    c0455Et2.A02.remove(c4y2);
                    c0455Et2.A04.remove(c4y2);
                    c0455Et2.A0X();
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4C
    public final boolean A0J() {
        C0455Et c0455Et = this;
        boolean z = false;
        char c2 = c0455Et.A07.isEmpty() ? (char) 2 : '\f';
        while (true) {
            switch (c2) {
                case 2:
                    c0455Et = c0455Et;
                    if (!c0455Et.A08.isEmpty()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0455Et = c0455Et;
                    if (!c0455Et.A09.isEmpty()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0455Et = c0455Et;
                    if (!c0455Et.A0A.isEmpty()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0455Et = c0455Et;
                    if (!c0455Et.A04.isEmpty()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0455Et = c0455Et;
                    if (!c0455Et.A06.isEmpty()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0455Et = c0455Et;
                    if (!c0455Et.A00.isEmpty()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0455Et = c0455Et;
                    if (!c0455Et.A02.isEmpty()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0455Et = c0455Et;
                    if (!c0455Et.A05.isEmpty()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c0455Et = c0455Et;
                    if (!c0455Et.A01.isEmpty()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0455Et = c0455Et;
                    if (!c0455Et.A03.isEmpty()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case '\f':
                    z = true;
                    c2 = '\r';
                    break;
                case '\r':
                    return z;
                case 14:
                    z = false;
                    c2 = '\r';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4C
    public final boolean A0K(@NonNull C4Y c4y, @NonNull List<Object> list) {
        C0455Et c0455Et = this;
        boolean z = false;
        char c2 = list.isEmpty() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0455Et = c0455Et;
                    c4y = c4y;
                    list = list;
                    if (!super.A0K(c4y, list)) {
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

    @Override // com.facebook.ads.redexgen.X.TH
    public final boolean A0T(C4Y c4y) {
        A03(c4y);
        c4y.A0H.setAlpha(0.0f);
        this.A07.add(c4y);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.TH
    public final boolean A0U(C4Y c4y) {
        A03(c4y);
        this.A0A.add(c4y);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.TH
    public final boolean A0V(C4Y c4y, int i, int i2, int i3, int i4) {
        View view = c4y.A0H;
        int deltaY = i + ((int) c4y.A0H.getTranslationX());
        int fromX = (int) c4y.A0H.getTranslationY();
        int i5 = i2 + fromX;
        A03(c4y);
        int fromY = i3 - deltaY;
        int i6 = i4 - i5;
        if (fromY == 0 && i6 == 0) {
            A0N(c4y);
            return false;
        }
        if (fromY != 0) {
            int deltaX = -fromY;
            view.setTranslationX(deltaX);
        }
        if (i6 != 0) {
            int deltaX2 = -i6;
            view.setTranslationY(deltaX2);
        }
        this.A09.add(new C01963o(c4y, deltaY, i5, i3, i4));
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.TH
    public final boolean A0W(C4Y c4y, C4Y c4y2, int deltaX, int deltaY, int i, int i2) {
        if (c4y == c4y2) {
            return A0V(c4y, deltaX, deltaY, i, i2);
        }
        float translationX = c4y.A0H.getTranslationX();
        float translationY = c4y.A0H.getTranslationY();
        float alpha = c4y.A0H.getAlpha();
        A03(c4y);
        int i3 = (int) ((i - deltaX) - translationX);
        int i4 = (int) ((i2 - deltaY) - translationY);
        c4y.A0H.setTranslationX(translationX);
        c4y.A0H.setTranslationY(translationY);
        c4y.A0H.setAlpha(alpha);
        if (c4y2 != null) {
            A03(c4y2);
            c4y2.A0H.setTranslationX(-i3);
            c4y2.A0H.setTranslationY(-i4);
            c4y2.A0H.setAlpha(0.0f);
        }
        this.A08.add(new C01953n(c4y, c4y2, deltaX, deltaY, i, i2));
        return true;
    }

    public final void A0X() {
        if (!A0J()) {
            A08();
        }
    }

    public final void A0Y(final C01953n c01953n) {
        final C0455Et c0455Et = this;
        C4Y c4y = null;
        final View view = null;
        float f = 0.0f;
        C4Y c4y2 = c01953n.A05;
        final View view2 = null;
        char c2 = c4y2 == null ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    view2 = null;
                    view = null;
                    c2 = 3;
                    break;
                case 3:
                    c01953n = c01953n;
                    c4y = c01953n.A04;
                    if (c4y == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4y = c4y;
                    view2 = c4y.A0H;
                    c2 = 5;
                    break;
                case 5:
                    f = 0.0f;
                    if (view == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0455Et = c0455Et;
                    c01953n = c01953n;
                    f = 0.0f;
                    final ViewPropertyAnimator duration = view.animate().setDuration(c0455Et.A03());
                    c0455Et.A02.add(c01953n.A05);
                    duration.translationX(c01953n.A02 - c01953n.A00);
                    duration.translationY(c01953n.A03 - c01953n.A01);
                    ViewPropertyAnimator oldViewAnim = duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3l
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            duration.setListener(null);
                            view.setAlpha(1.0f);
                            view.setTranslationX(0.0f);
                            view.setTranslationY(0.0f);
                            this.A03.A0R(c01953n.A05, true);
                            this.A03.A02.remove(c01953n.A05);
                            this.A03.A0X();
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            this.A03.A0S(c01953n.A05, true);
                        }
                    });
                    oldViewAnim.start();
                    c2 = 7;
                    break;
                case 7:
                    if (view2 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0455Et = c0455Et;
                    c01953n = c01953n;
                    final ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                    c0455Et.A02.add(c01953n.A04);
                    ViewPropertyAnimator newViewAnimation = viewPropertyAnimatorAnimate.translationX(f);
                    newViewAnimation.translationY(f).setDuration(c0455Et.A03()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3m
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            viewPropertyAnimatorAnimate.setListener(null);
                            view2.setAlpha(1.0f);
                            view2.setTranslationX(0.0f);
                            view2.setTranslationY(0.0f);
                            this.A03.A0R(c01953n.A04, false);
                            this.A03.A02.remove(c01953n.A04);
                            this.A03.A0X();
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            this.A03.A0S(c01953n.A04, false);
                        }
                    }).start();
                    c2 = '\t';
                    break;
                case '\t':
                    return;
                case '\n':
                    c4y2 = c4y2;
                    view = c4y2.A0H;
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A0Z(final C4Y c4y) {
        final View view = c4y.A0H;
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A00.add(c4y);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(A02()).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3j
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                this.A02.A0L(c4y);
                this.A02.A00.remove(c4y);
                this.A02.A0X();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                this.A02.A0M(c4y);
            }
        }).start();
    }

    public final void A0a(final C4Y c4y, int i, int i2, int i3, int deltaX) {
        final View view = c4y.A0H;
        final int i4 = i3 - i;
        final int deltaX2 = deltaX - i2;
        if (i4 != 0) {
            view.animate().translationX(0.0f);
        }
        if (deltaX2 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A04.add(c4y);
        ViewPropertyAnimator animation = viewPropertyAnimatorAnimate.setDuration(A04());
        animation.setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3k
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                C01923k c01923k = this;
                float f = 0.0f;
                char c2 = i4 != 0 ? (char) 2 : (char) 3;
                while (true) {
                    switch (c2) {
                        case 2:
                            c01923k = c01923k;
                            f = 0.0f;
                            view.setTranslationX(0.0f);
                            c2 = 3;
                            break;
                        case 3:
                            c01923k = c01923k;
                            if (deltaX2 == 0) {
                                c2 = 5;
                                break;
                            } else {
                                c2 = 4;
                                break;
                            }
                        case 4:
                            c01923k = c01923k;
                            view.setTranslationY(f);
                            c2 = 5;
                            break;
                        case 5:
                            return;
                    }
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                this.A04.A0N(c4y);
                this.A04.A04.remove(c4y);
                this.A04.A0X();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                this.A04.A0O(c4y);
            }
        }).start();
    }
}

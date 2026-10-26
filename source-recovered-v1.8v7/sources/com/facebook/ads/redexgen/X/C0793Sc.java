package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.facebook.ads.internal.adquality.AdQualityRule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Sc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0793Sc implements InterfaceC0619Li<Bundle> {
    public static byte[] A04;
    public AnonymousClass23 A00;
    public final View A01;
    public final XI A02;
    public final List<C0794Sd> A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 55);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A04 = new byte[]{-29, -28, -47, -28, -39, -29, -28, -39, -45, -29, -78, -93, -79, -78, -79};
    }

    public C0793Sc(View view, List<AnonymousClass21> list, Bundle bundle, XI xi) {
        this.A02 = xi;
        this.A01 = view;
        List<AdQualityRule> rules = new ArrayList<>(list.size());
        this.A03 = rules;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 39));
        for (int i = 0; i < list.size(); i++) {
            this.A03.add(new C0794Sd(list.get(i), (Bundle) parcelableArrayList.get(i)));
        }
        this.A00 = (AnonymousClass23) C0614Lc.A00(bundle.getByteArray(A00(0, 10, 89)));
    }

    public C0793Sc(View view, List<AnonymousClass21> list, XI xi) {
        this.A02 = xi;
        this.A01 = view;
        this.A03 = new ArrayList(list.size());
        Iterator<AnonymousClass21> it = list.iterator();
        while (it.hasNext()) {
            this.A03.add(new C0794Sd(it.next()));
        }
        this.A00 = new AnonymousClass23();
    }

    public final AnonymousClass23 A02() {
        return this.A00;
    }

    public final void A03() {
        this.A00.A03();
        Iterator<C0794Sd> it = this.A03.iterator();
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
                    it = it;
                    C0794Sd test = it.next();
                    test.A05();
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A04() {
        this.A00.A02();
    }

    public final void A05(double viewableRatio, double d2) {
        C0793Sc c0793Sc = this;
        Iterator<C0794Sd> it = null;
        double dA00 = 0.0d;
        char c2 = d2 >= 0.0d ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0793Sc = c0793Sc;
                    c0793Sc.A00.A05(viewableRatio, d2);
                    c2 = 3;
                    break;
                case 3:
                    c0793Sc = c0793Sc;
                    dA00 = Q1.A0E(c0793Sc.A01, 0, c0793Sc.A02).A00();
                    c0793Sc.A00.A04(viewableRatio, dA00);
                    it = c0793Sc.A03.iterator();
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
                    it = it;
                    it.next().A06(viewableRatio, dA00);
                    c2 = 4;
                    break;
                case 6:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0619Li
    public final Bundle getSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, 89), C0614Lc.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A03.size());
        Iterator<C0794Sd> it = this.A03.iterator();
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
                    arrayList = arrayList;
                    it = it;
                    C0794Sd test = it.next();
                    arrayList.add(test.getSaveInstanceState());
                    c2 = 2;
                    break;
                case 4:
                    Bundle bundle2 = bundle;
                    bundle2.putParcelableArrayList(A00(10, 5, 39), arrayList);
                    return bundle2;
            }
        }
    }
}

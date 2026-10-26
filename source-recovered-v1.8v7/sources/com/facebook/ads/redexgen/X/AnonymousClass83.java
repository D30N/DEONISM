package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.83, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass83 extends AbstractC1055b1 {
    public static byte[] A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public int A00;
    public int A01;

    @Nullable
    public LinearLayout A02;
    public C0786Rv A03;
    public C7C A04;

    @Nullable
    public C2S A05;

    @Nullable
    public C0686Ny A06;
    public C0804Sp A07;

    @DoNotStrip
    public Q0 A08;
    public Q1 A09;
    public String A0A;
    public List<C0698Ok> A0B;
    public final XI A0C;
    public final C0628Lr A0D;

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 63);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0A() {
        A0E = new byte[]{64, 69, 126, 69, 64, 85, 64, 126, 67, 84, 79, 69, 77, 68};
    }

    static {
        A0A();
        A0F = (int) (C0635Ly.A01 * 48.0f);
        A0G = (int) (C0635Ly.A01 * 8.0f);
        A0H = (int) (C0635Ly.A01 * 8.0f);
        A0J = (int) (C0635Ly.A01 * 56.0f);
        A0I = (int) (C0635Ly.A01 * 12.0f);
    }

    public AnonymousClass83(XI xi, JW jw, C7C c7c, MQ mq, C0786Rv c0786Rv) {
        super(xi, jw, mq, c0786Rv);
        this.A0D = new C0628Lr();
        this.A04 = c7c;
        this.A0C = xi;
    }

    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.ads.redexgen.X.2S, com.facebook.ads.redexgen.X.Ny] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    private final void A0B() {
        AnonymousClass83 anonymousClass83 = this;
        C0686Ny c0686Ny = null;
        C2S c2s = null;
        LinearLayout linearLayout = anonymousClass83.A02;
        ?? r1 = 0;
        char c2 = linearLayout != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass83 = anonymousClass83;
                    linearLayout = linearLayout;
                    r1 = 0;
                    linearLayout.removeAllViews();
                    anonymousClass83.A02 = null;
                    c2 = 3;
                    break;
                case 3:
                    anonymousClass83 = anonymousClass83;
                    c2s = anonymousClass83.A05;
                    if (c2s == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass83 = anonymousClass83;
                    c2s = c2s;
                    c2s.removeAllViews();
                    anonymousClass83.A05 = r1;
                    c2 = 5;
                    break;
                case 5:
                    anonymousClass83 = anonymousClass83;
                    c0686Ny = anonymousClass83.A06;
                    if (c0686Ny == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    anonymousClass83 = anonymousClass83;
                    c0686Ny = c0686Ny;
                    c0686Ny.removeAllViews();
                    anonymousClass83.A06 = r1;
                    c2 = 7;
                    break;
                case 7:
                    return;
            }
        }
    }

    private final void A0C(int i, @Nullable Bundle bundle) throws IllegalStateException {
        int childSpacing;
        int i2;
        int i3;
        AnonymousClass83 anonymousClass83;
        this.A02 = new LinearLayout(getContext());
        if (i == 1) {
            this.A02.setGravity(17);
        } else {
            this.A02.setGravity(48);
        }
        this.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A02.setOrientation(1);
        int i4 = C0635Ly.A02.widthPixels;
        int childSpacing2 = C0635Ly.A02.heightPixels;
        if (i == 1) {
            int width = A0G;
            int i5 = i4 - (width * 4);
            int width2 = childSpacing2 / 2;
            childSpacing = Math.min(i5, width2);
            i2 = (i4 - childSpacing) / 8;
            i3 = i2 * 4;
        } else {
            int height = A0J;
            int width3 = A0F;
            int height2 = height + width3;
            int width4 = A0G;
            childSpacing = childSpacing2 - (height2 + (width4 * 4));
            i2 = A0G;
            i3 = i2 * 2;
        }
        this.A08 = new R7(this);
        this.A09 = new Q1(this, 1, new WeakReference(this.A08), this.A0C);
        Q1 q1 = this.A09;
        int extraSpacing = this.A00;
        q1.A0X(extraSpacing);
        Q1 q12 = this.A09;
        int extraSpacing2 = this.A01;
        q12.A0Y(extraSpacing2);
        this.A05 = new C2S(this.A0C);
        this.A05.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.A07 = new C0804Sp(this.A05, i, this.A0B, this.A09, bundle);
        this.A05.setAdapter(new R8(this.A0C, this.A0B, this.A03, super.A0B, this.A04, this.A09, this.A0D, getAudienceNetworkListener(), this.A0A, childSpacing, i2, i3, i, this.A07));
        if (i == 1) {
            anonymousClass83 = this;
            anonymousClass83.A0E(anonymousClass83.A07);
        } else {
            anonymousClass83 = this;
        }
        anonymousClass83.A02.addView(anonymousClass83.A05);
        C0686Ny c0686Ny = anonymousClass83.A06;
        if (c0686Ny != null) {
            anonymousClass83.A02.addView(c0686Ny);
        }
        anonymousClass83.A0a(anonymousClass83.A02, false, i, true);
    }

    private void A0D(C0786Rv c0786Rv) {
        AnonymousClass83 anonymousClass83 = this;
        anonymousClass83.A03 = c0786Rv;
        anonymousClass83.A0A = anonymousClass83.A03.A0P();
        anonymousClass83.A00 = anonymousClass83.A03.A0F();
        anonymousClass83.A01 = anonymousClass83.A03.A0G();
        List<C1A> listA0V = anonymousClass83.A03.A0V();
        anonymousClass83.A0B = new ArrayList(listA0V.size());
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    listA0V = listA0V;
                    if (i >= listA0V.size()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    anonymousClass83 = anonymousClass83;
                    listA0V = listA0V;
                    anonymousClass83.A0B.add(new C0698Ok(i, listA0V.size(), listA0V.get(i)));
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A0E(C0804Sp c0804Sp) throws IllegalStateException {
        new C0453Er().A0G(this.A05);
        c0804Sp.A0c(new R6(this));
        this.A06 = new C0686Ny(this.A0C, super.A06.A01(), this.A0B.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0H);
        layoutParams.setMargins(0, A0I, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1055b1
    public final void A0X() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1055b1
    public final boolean A0h() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A7s(Intent intent, Bundle bundle, C02304x c02304x) throws IllegalStateException {
        C0786Rv c0786Rv = (C0786Rv) intent.getSerializableExtra(A08(0, 14, 30));
        super.A0b(c02304x);
        A0D(c0786Rv);
        A0C(c02304x.A0H().getResources().getConfiguration().orientation, bundle);
        c02304x.A0K(new R5(this, c02304x));
        int iA03 = super.A09.A0L().A0D().A03();
        if (iA03 > 0) {
            A0Y(iA03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1055b1, com.facebook.ads.redexgen.X.MR
    public final void AAT(boolean z) {
        super.AAT(z);
        C0804Sp c0804Sp = this.A07;
        if (c0804Sp != null) {
            c0804Sp.A0Z();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1055b1, com.facebook.ads.redexgen.X.MR
    public final void AAq(boolean z) {
        super.AAq(z);
        this.A07.A0a();
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void ACm(Bundle bundle) {
        C0804Sp c0804Sp = this.A07;
        if (c0804Sp != null) {
            c0804Sp.A0b(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1055b1
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) throws IllegalStateException {
        Bundle bundle = new Bundle();
        ACm(bundle);
        A0B();
        A0C(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1055b1, com.facebook.ads.redexgen.X.MR
    public final void onDestroy() {
        super.onDestroy();
        if (!TextUtils.isEmpty(this.A0A)) {
            super.A0B.A81(this.A0A, new C0676No().A03(this.A09).A02(this.A0D).A05());
        }
        A0B();
        this.A09.A0W();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0D.A06(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}

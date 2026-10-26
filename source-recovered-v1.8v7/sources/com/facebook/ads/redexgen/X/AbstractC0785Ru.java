package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ru, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0785Ru extends AnonymousClass44<C1111bw> {
    public static final int A05 = (int) (C0635Ly.A01 * 4.0f);

    @Nullable
    public AnonymousClass16 A00;
    public final List<C1141cR> A01;
    public final int A02;
    public final XI A03;

    @DoNotStrip
    public final Q0 A04 = new C0783Rs(this);

    public AbstractC0785Ru(C1V c1v, List<C1141cR> list, XI xi) {
        this.A03 = xi;
        this.A02 = c1v.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A04(int i) {
        AbstractC0785Ru abstractC0785Ru = this;
        int i2 = 0;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i3 = abstractC0785Ru.A02;
        char c2 = i == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    i3 *= 2;
                    c2 = 3;
                    break;
                case 3:
                    abstractC0785Ru = abstractC0785Ru;
                    if (i < abstractC0785Ru.A01.size() - 1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    abstractC0785Ru = abstractC0785Ru;
                    i2 = abstractC0785Ru.A02 * 2;
                    c2 = 5;
                    break;
                case 5:
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                    marginLayoutParams2.setMargins(i3, 0, i2, 0);
                    return marginLayoutParams2;
                case 6:
                    abstractC0785Ru = abstractC0785Ru;
                    i2 = abstractC0785Ru.A02;
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass44
    public final int A0D() {
        return this.A01.size();
    }

    public final void A0F(ImageView imageView, int i) {
        C1141cR c1141cR = this.A01.get(i);
        C0580Js adCoverImage = c1141cR.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC1002aA asyncTaskC1002aAA04 = new AsyncTaskC1002aA(imageView, this.A03).A04();
            asyncTaskC1002aAA04.A06(new C0784Rt(this, i, c1141cR));
            asyncTaskC1002aAA04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0G(AnonymousClass16 anonymousClass16) {
        this.A00 = anonymousClass16;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass44
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public void A0E(C1111bw c1111bw, int i) {
        c1111bw.A0l().setLayoutParams(A04(i));
    }
}

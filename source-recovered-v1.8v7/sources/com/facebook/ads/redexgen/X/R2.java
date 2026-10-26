package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public final class R2 extends C4Y {

    @DoNotStrip
    public Q0 A00;
    public Q1 A01;

    @Nullable
    public Q1 A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final SparseBooleanArray A07;
    public final XI A08;
    public final YQ A09;

    public R2(YQ yq, SparseBooleanArray sparseBooleanArray, Q1 q1, int i, int i2, int i3, int i4, XI xi) {
        super(yq);
        this.A08 = xi;
        this.A09 = yq;
        this.A07 = sparseBooleanArray;
        this.A01 = q1;
        this.A03 = i;
        this.A04 = i2;
        this.A05 = i3;
        this.A06 = i4;
    }

    private void A08(JW jw, C0628Lr c0628Lr, String str, C0698Ok c0698Ok) {
        if (this.A07.get(c0698Ok.A02())) {
            return;
        }
        Q1 q1 = this.A02;
        if (q1 != null) {
            q1.A0W();
            this.A02 = null;
        }
        this.A00 = new R4(this, str, c0698Ok, jw, c0698Ok.A04(), c0628Lr);
        this.A02 = new Q1(this.A09, 10, new WeakReference(this.A00), this.A08);
        this.A02.A0Z(false);
        this.A02.A0X(100);
        this.A02.A0Y(100);
        this.A09.setOnAssetsLoadedListener(new R3(this, c0698Ok));
    }

    public final void A0l(C0698Ok c0698Ok, JW jw, C7C c7c, C0628Lr c0628Lr, String videoUrl) {
        R2 r2 = this;
        String strA07 = null;
        String strA08 = null;
        int i = 0;
        int i2 = 0;
        int iA02 = c0698Ok.A02();
        r2.A09.setTag(-1593835536, Integer.valueOf(iA02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(r2.A03, -2);
        char c2 = iA02 == 0 ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    r2 = r2;
                    i = r2.A04;
                    c2 = 3;
                    break;
                case 3:
                    r2 = r2;
                    if (iA02 < r2.A06 - 1) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    r2 = r2;
                    i2 = r2.A04;
                    c2 = 5;
                    break;
                case 5:
                    r2 = r2;
                    c0698Ok = c0698Ok;
                    marginLayoutParams = marginLayoutParams;
                    marginLayoutParams.setMargins(i, 0, i2, 0);
                    strA07 = c0698Ok.A03().A0D().A07();
                    strA08 = c0698Ok.A03().A0D().A08();
                    r2.A09.setIsVideo(!TextUtils.isEmpty(strA08));
                    if (!r2.A09.A0k()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    r2 = r2;
                    c7c = c7c;
                    strA07 = strA07;
                    strA08 = strA08;
                    r2.A09.setVideoPlaceholderUrl(strA07);
                    r2.A09.setVideoUrl(c7c.A0L(strA08));
                    c2 = 7;
                    break;
                case 7:
                    R2 r22 = r2;
                    C0698Ok c0698Ok2 = c0698Ok;
                    r22.A09.setLayoutParams(marginLayoutParams);
                    r22.A09.setAdTitleAndDescription(c0698Ok2.A03().A0E().A06(), c0698Ok2.A03().A0E().A01());
                    r22.A09.setCTAInfo(c0698Ok2.A03().A0F(), c0698Ok2.A04());
                    r22.A09.A0i(c0698Ok2.A04());
                    r22.A08(jw, c0628Lr, videoUrl, c0698Ok2);
                    return;
                case '\b':
                    r2 = r2;
                    strA07 = strA07;
                    r2.A09.setImageUrl(strA07);
                    c2 = 7;
                    break;
                case '\t':
                    r2 = r2;
                    i2 = r2.A05;
                    c2 = 5;
                    break;
                case '\n':
                    r2 = r2;
                    i = r2.A05;
                    c2 = 3;
                    break;
            }
        }
    }
}

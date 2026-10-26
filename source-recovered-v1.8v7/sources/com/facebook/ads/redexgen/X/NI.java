package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Iterator;

/* loaded from: assets/audience_network.dex */
public final class NI extends LinearLayout {
    public static final int A03 = (int) (C0635Ly.A01 * 40.0f);
    public static final int A04 = (int) (C0635Ly.A01 * 20.0f);
    public static final int A05 = (int) (C0635Ly.A01 * 10.0f);
    public final AnonymousClass27 A00;
    public final XI A01;
    public final N2 A02;

    public NI(XI xi, AnonymousClass27 anonymousClass27, N2 n2, M6 m6) {
        this(xi, anonymousClass27, n2, null, m6);
    }

    public NI(XI xi, AnonymousClass27 anonymousClass27, N2 n2, @Nullable String str, M6 m6) {
        super(xi);
        this.A01 = xi;
        this.A00 = anonymousClass27;
        this.A02 = n2;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View viewA02 = A02(str);
            viewA02.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            C0635Ly.A0P(view, -10459280);
            addView(viewA02, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(this.A00.A03())) {
            View viewA01 = A01(m6, this.A00.A03());
            int i = A05;
            viewA01.setPadding(0, i, 0, i);
            addView(viewA01, layoutParams);
        }
        View viewA00 = A00();
        viewA00.setPadding(0, A05, 0, 0);
        addView(viewA00, layoutParams);
    }

    private View A00() {
        NI ni = this;
        NO no = new NO(ni.A01);
        Iterator<AnonymousClass27> it = ni.A00.A05().iterator();
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
                    ni = ni;
                    no = no;
                    it = it;
                    AnonymousClass27 next = it.next();
                    N4 n4 = new N4(ni.A01);
                    n4.setData(next.A04(), null);
                    n4.setOnClickListener(new NH(ni, n4, next));
                    no.addView(n4);
                    c2 = 2;
                    break;
                case 4:
                    return no;
            }
        }
    }

    private View A01(M6 m6, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        int i = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(M7.A00(m6));
        TextView textView = new TextView(getContext());
        C0635Ly.A0b(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A02(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(M7.A00(M6.BACK_ARROW));
        int i = A05;
        imageView.setPadding(0, i, i * 2, i);
        int i2 = A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        imageView.setOnClickListener(new NG(this));
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        C0635Ly.A0b(textView, true, 16);
        textView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, A03, 0);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }
}

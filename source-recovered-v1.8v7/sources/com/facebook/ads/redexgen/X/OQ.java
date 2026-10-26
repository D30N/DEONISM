package com.facebook.ads.redexgen.X;

import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class OQ {
    public static YQ A00(final OC oc, int i, final String str, final C0804Sp c0804Sp) {
        YQ yq = null;
        char c2 = i == 1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    oc = oc;
                    str = str;
                    c0804Sp = c0804Sp;
                    yq = new YQ(oc, str, c0804Sp) { // from class: com.facebook.ads.redexgen.X.8p
                        public static final int A00 = (int) (C0635Ly.A01 * 20.0f);
                        public static final int A01 = (int) (C0635Ly.A01 * 16.0f);

                        @Override // com.facebook.ads.redexgen.X.O8
                        public final boolean A0O() {
                            return false;
                        }

                        @Override // com.facebook.ads.redexgen.X.YQ
                        public final void A0h(XI xi) {
                            O5 titleDescContainer = getTitleDescContainer();
                            titleDescContainer.setAlignment(3);
                            titleDescContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                            titleDescContainer.setPadding(0, 0, 0, A00);
                            getCtaButton().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                            LinearLayout linearLayout = new LinearLayout(xi);
                            C0635Ly.A0W(linearLayout, new ColorDrawable(-1));
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                            layoutParams.addRule(3, getMediaContainer().getId());
                            linearLayout.setLayoutParams(layoutParams);
                            linearLayout.setOrientation(1);
                            int i2 = A01;
                            linearLayout.setPadding(i2, i2, i2, i2);
                            linearLayout.addView(titleDescContainer);
                            linearLayout.addView(getCtaButton());
                            addView(getMediaContainer());
                            addView(linearLayout);
                        }
                    };
                    c2 = 3;
                    break;
                case 3:
                    return yq;
                case 4:
                    oc = oc;
                    str = str;
                    c0804Sp = c0804Sp;
                    yq = new YQ(oc, str, c0804Sp) { // from class: com.facebook.ads.redexgen.X.9c
                        public static final int A00 = (int) (C0635Ly.A01 * 12.0f);

                        @Override // com.facebook.ads.redexgen.X.YQ, com.facebook.ads.redexgen.X.O8
                        public final boolean A0M() {
                            return false;
                        }

                        @Override // com.facebook.ads.redexgen.X.O8
                        public final boolean A0N() {
                            return false;
                        }

                        @Override // com.facebook.ads.redexgen.X.YQ
                        public final void A0h(XI xi) {
                            O5 titleDescContainer = getTitleDescContainer();
                            titleDescContainer.setAlignment(3);
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                            layoutParams.addRule(8, getMediaContainer().getId());
                            titleDescContainer.setLayoutParams(layoutParams);
                            int i2 = A00;
                            titleDescContainer.setPadding(i2, i2, i2, i2);
                            C0635Ly.A0V(titleDescContainer, getAdContextWrapper());
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                            layoutParams2.addRule(3, getMediaContainer().getId());
                            getCtaButton().setLayoutParams(layoutParams2);
                            addView(getMediaContainer());
                            addView(titleDescContainer);
                            addView(getCtaButton());
                        }
                    };
                    c2 = 3;
                    break;
            }
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class TF extends C2Z {
    public final TG A00;

    public TF(TG tg) {
        this.A00 = tg;
    }

    @Override // com.facebook.ads.redexgen.X.C2Z
    public final void A08(View view, C3K c3k) {
        TF tf = this;
        super.A08(view, c3k);
        char c2 = !tf.A00.A0B() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    tf = tf;
                    if (tf.A00.A01.getLayoutManager() == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    tf = tf;
                    view = view;
                    c3k = c3k;
                    tf.A00.A01.getLayoutManager().A1C(view, c3k);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2Z
    public final boolean A09(View view, int i, Bundle bundle) {
        TF tf = this;
        char c2 = super.A09(view, i, bundle) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return true;
                case 3:
                    tf = tf;
                    if (!tf.A00.A0B()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 4:
                    tf = tf;
                    if (tf.A00.A01.getLayoutManager() == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return tf.A00.A01.getLayoutManager().A1b(view, i, bundle);
                case 6:
                    return false;
            }
        }
    }
}

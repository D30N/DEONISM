package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class LT {
    public static void A00(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, @Nullable Context context) {
        char c2 = context != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    context = context;
                    if (!(context instanceof Activity)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    onClickListener.onClick(null, 0);
                    return;
                case 4:
                    Context context2 = context;
                    new AlertDialog.Builder(context2).setTitle(JQ.A0S(context2)).setMessage(JQ.A0Q(context2)).setPositiveButton(JQ.A0R(context2), new LS(onClickListener)).setNegativeButton(JQ.A0P(context2), new LR(onClickListener2)).show();
                    return;
            }
        }
    }
}

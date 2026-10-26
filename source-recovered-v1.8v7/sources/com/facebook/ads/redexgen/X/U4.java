package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/* loaded from: assets/audience_network.dex */
public class U4 implements LB {
    @Override // com.facebook.ads.redexgen.X.LB
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        U4 u4 = this;
        Window.Callback callback = null;
        char c2 = activity.getWindow() != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    activity = activity;
                    callback = activity.getWindow().getCallback();
                    c2 = 3;
                    break;
                case 3:
                    if (callback == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    u4 = u4;
                    activity = activity;
                    L8 l8 = new L8(callback, activity);
                    L8.A00(new U3(u4));
                    activity.getWindow().setCallback(l8);
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    callback = null;
                    c2 = 3;
                    break;
            }
        }
    }
}

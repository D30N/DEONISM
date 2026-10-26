package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class PF implements View.OnTouchListener {
    public final /* synthetic */ PK A00;

    public PF(PK pk) {
        this.A00 = pk;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        PF pf = this;
        char c2 = motionEvent.getAction() == 0 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    pf = pf;
                    if (!pf.A00.A02) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    pf = pf;
                    if (!TextUtils.isEmpty(pf.A00.A05)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    pf = pf;
                    LG.A08(new LG(), pf.A00.A04, Uri.parse(pf.A00.A05), pf.A00.A07);
                    c2 = 5;
                    break;
                case 5:
                    return true;
                case 6:
                    pf = pf;
                    pf.A00.A07();
                    c2 = 5;
                    break;
                case 7:
                    return false;
            }
        }
    }
}

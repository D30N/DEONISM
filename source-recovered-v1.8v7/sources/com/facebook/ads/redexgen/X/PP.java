package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.view.View;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public class PP implements View.OnClickListener {
    public final /* synthetic */ C7Y A00;

    public PP(C7Y c7y) {
        this.A00 = c7y;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0601Ko.A02(this)) {
            return;
        }
        try {
            View view2 = this.A00.getVideoView();
            if (view2 != null) {
                Uri uri = Uri.parse(this.A00.A06);
                this.A00.getVideoView().getEventBus().A02(new C0645Mi(uri));
                AbstractC01100f adAction = C01110g.A00(this.A00.A03, this.A00.A04, this.A00.A05, uri, new HashMap());
                if (adAction != null) {
                    adAction.A0B();
                }
            }
        } catch (Throwable th) {
            C0601Ko.A00(th, this);
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MI implements View.OnClickListener {
    public final /* synthetic */ C1R A00;
    public final /* synthetic */ C0565Jd A01;
    public final /* synthetic */ MJ A02;
    public final /* synthetic */ MQ A03;
    public final /* synthetic */ String A04;

    public MI(MJ mj, C0565Jd c0565Jd, MQ mq, String str, C1R c1r) {
        this.A02 = mj;
        this.A01 = c0565Jd;
        this.A03 = mq;
        this.A04 = str;
        this.A00 = c1r;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0601Ko.A02(this)) {
            return;
        }
        try {
            this.A01.A02(EnumC0564Jc.A09, null);
            if (AnonymousClass24.A0P(this.A02.A02.A00(), true)) {
                this.A03.A7o(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                LG.A08(new LG(), this.A02.A02, Uri.parse(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            C0601Ko.A00(th, this);
        }
    }
}

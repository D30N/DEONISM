package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.ads.AdError;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.a5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class ViewOnClickListenerC0998a5 extends C0685Nx implements View.OnClickListener {

    @Nullable
    public String A00;

    @Nullable
    public String A01;
    public final C0683Nv A02;
    public final Map<String, String> A03;

    public ViewOnClickListenerC0998a5(XI xi, String str, C1I c1i, JW jw, MQ mq, Q1 q1, C0628Lr c0628Lr) {
        super(xi, c1i);
        this.A03 = new HashMap();
        this.A02 = new C0683Nv(xi, str, q1, c0628Lr, jw, mq);
        setOnClickListener(this);
        C0635Ly.A0J(AdError.NO_FILL_ERROR_CODE, this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        ViewOnClickListenerC0998a5 viewOnClickListenerC0998a5 = this;
        ViewOnClickListenerC0998a5 viewOnClickListenerC0998a52 = null;
        char c2 = C0601Ko.A02(viewOnClickListenerC0998a5) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    viewOnClickListenerC0998a5 = viewOnClickListenerC0998a5;
                    viewOnClickListenerC0998a52 = viewOnClickListenerC0998a5;
                    c2 = 4;
                case 4:
                    viewOnClickListenerC0998a52 = viewOnClickListenerC0998a52;
                    c2 = !TextUtils.isEmpty(viewOnClickListenerC0998a52.A00) ? (char) 7 : (char) 16;
                case 7:
                    try {
                        viewOnClickListenerC0998a52 = viewOnClickListenerC0998a52;
                        c2 = TextUtils.isEmpty(viewOnClickListenerC0998a52.A01) ? (char) 16 : '\n';
                    } catch (Throwable th) {
                        C0601Ko.A00(th, viewOnClickListenerC0998a52);
                        return;
                    }
                case '\n':
                    viewOnClickListenerC0998a52 = viewOnClickListenerC0998a52;
                    viewOnClickListenerC0998a52.A02.A08(viewOnClickListenerC0998a52.A00, viewOnClickListenerC0998a52.A01, viewOnClickListenerC0998a52.A03);
                    return;
                case 16:
                    return;
            }
            C0601Ko.A00(th, viewOnClickListenerC0998a52);
            return;
        }
    }

    public void setCta(C1J c1j, String str, Map<String, String> map) {
        setCta(c1j, str, map, null);
    }

    public void setCta(C1J c1j, String str, Map<String, String> map, @Nullable InterfaceC0682Nu interfaceC0682Nu) {
        ViewOnClickListenerC0998a5 viewOnClickListenerC0998a5 = this;
        viewOnClickListenerC0998a5.A00 = str;
        viewOnClickListenerC0998a5.A01 = c1j.A04();
        Map<String, String> extraData = viewOnClickListenerC0998a5.A03;
        extraData.putAll(map);
        viewOnClickListenerC0998a5.A02.A07(interfaceC0682Nu);
        String strA03 = c1j.A03();
        char c2 = !TextUtils.isEmpty(strA03) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    viewOnClickListenerC0998a5 = viewOnClickListenerC0998a5;
                    if (!TextUtils.isEmpty(viewOnClickListenerC0998a5.A01)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    viewOnClickListenerC0998a5.setVisibility(8);
                    return;
                case 4:
                    viewOnClickListenerC0998a5.setText(strA03);
                    return;
            }
        }
    }

    public void setIsInAppBrowser(boolean z) {
        this.A02.A09(z);
    }
}

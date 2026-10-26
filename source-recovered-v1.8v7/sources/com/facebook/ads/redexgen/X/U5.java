package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public final class U5 implements AnonymousClass65 {
    public final U7 A00;
    public final XJ A01;

    public U5(XJ xj) {
        this.A01 = xj;
        this.A00 = new U7(xj);
    }

    public final U7 A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass65
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public final void ACa(Throwable th) throws JSONException {
        Throwable th2 = th;
        U5 u5 = this;
        String stackTrace = null;
        HashMap map = null;
        String strA02 = null;
        String message = null;
        String string = null;
        int i = 0;
        String strA022 = null;
        U7 u7 = null;
        char c2 = th2 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    u5 = u5;
                    if (C02495r.A00(u5.A01) < Math.random()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    u5 = u5;
                    th2 = th2;
                    StringWriter stringWriter = new StringWriter();
                    th2.printStackTrace(new PrintWriter(stringWriter));
                    string = stringWriter.toString();
                    u7 = u5.A00;
                    strA022 = AnonymousClass60.A03.A02();
                    strA02 = AnonymousClass61.A06.A02();
                    map = new HashMap();
                    message = th2.getMessage();
                    if (string == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    string = string;
                    i = 500;
                    if (string.length() <= 500) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    string = string;
                    stackTrace = string.substring(0, i);
                    c2 = 7;
                    break;
                case 7:
                    u7.A8C(strA022, strA02, map, null, message, stackTrace, th2.getClass().getSimpleName());
                    return;
                case '\b':
                    string = string;
                    stackTrace = string;
                    c2 = 7;
                    break;
            }
        }
    }
}

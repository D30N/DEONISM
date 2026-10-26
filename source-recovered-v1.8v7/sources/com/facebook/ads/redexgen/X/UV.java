package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public class UV implements InterfaceC02616d {
    public final /* synthetic */ C0848Ui A00;

    public UV(C0848Ui c0848Ui) {
        this.A00 = c0848Ui;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() throws PackageManager.NameNotFoundException, NoSuchAlgorithmException, CertificateException {
        Signature[] signatureArr = this.A00.A00.getPackageManager().getPackageInfo(this.A00.A00.getPackageName(), 64).signatures;
        HashMap map = new HashMap();
        int i = 0;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    signatureArr = signatureArr;
                    int i3 = signatureArr.length;
                    if (i >= i3) {
                        i2 = 4;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    signatureArr = signatureArr;
                    map = map;
                    map.put(Integer.valueOf(i), new C0847Uh(signatureArr[i]));
                    i++;
                    i2 = 2;
                    break;
                case 4:
                    return this.A00.A05(map);
            }
        }
    }
}

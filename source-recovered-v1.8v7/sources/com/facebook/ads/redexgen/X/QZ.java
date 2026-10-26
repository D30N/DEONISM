package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class QZ implements Runnable {
    public final /* synthetic */ C0739Qa A00;

    public QZ(C0739Qa c0739Qa) {
        this.A00 = c0739Qa;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        QZ qz = this;
        QZ qz2 = null;
        char c2 = C0601Ko.A02(qz) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    qz = qz;
                    qz2 = qz;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        qz2 = qz2;
                        qz2.A00.A00();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, qz2);
                        return;
                    }
            }
        }
    }
}

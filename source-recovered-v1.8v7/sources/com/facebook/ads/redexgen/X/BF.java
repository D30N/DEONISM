package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;

/* loaded from: assets/audience_network.dex */
public class BF extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ YL A01;

    public BF(YL yl, AudioTrack audioTrack) {
        this.A01 = yl;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        BF bf = this;
        BF bf2 = null;
        char c2 = C0601Ko.A02(bf) ? (char) 2 : (char) 3;
        while (true) {
            try {
                switch (c2) {
                    case 2:
                        return;
                    case 3:
                        bf = bf;
                        bf2 = bf;
                        c2 = 4;
                        continue;
                    case 4:
                        try {
                            bf2 = bf2;
                            bf2.A00.flush();
                            bf2.A00.release();
                            return;
                        } finally {
                            bf2.A01.A0f.open();
                        }
                }
            } catch (Throwable th) {
                C0601Ko.A00(th, bf2);
                return;
            }
            C0601Ko.A00(th, bf2);
            return;
        }
    }
}

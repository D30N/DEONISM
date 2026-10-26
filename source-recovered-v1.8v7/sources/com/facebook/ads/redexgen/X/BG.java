package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;

/* loaded from: assets/audience_network.dex */
public class BG extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ YL A01;

    public BG(YL yl, AudioTrack audioTrack) {
        this.A01 = yl;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        BG bg = this;
        BG bg2 = null;
        char c2 = C0601Ko.A02(bg) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    bg = bg;
                    bg2 = bg;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        bg2 = bg2;
                        bg2.A00.release();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, bg2);
                        return;
                    }
            }
        }
    }
}

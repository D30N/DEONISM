package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
/* loaded from: assets/audience_network.dex */
public final class B9 {
    public long A00;
    public long A01;
    public long A02;
    public final AudioTimestamp A03 = new AudioTimestamp();
    public final AudioTrack A04;

    public B9(AudioTrack audioTrack) {
        this.A04 = audioTrack;
    }

    public final long A00() {
        return this.A00;
    }

    public final long A01() {
        return this.A03.nanoTime / 1000;
    }

    public final boolean A02() {
        B9 b9 = this;
        long j = 0;
        boolean timestamp = b9.A04.getTimestamp(b9.A03);
        char c2 = timestamp ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    b9 = b9;
                    j = b9.A03.framePosition;
                    if (b9.A01 <= j) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    b9 = b9;
                    b9.A02++;
                    c2 = 4;
                    break;
                case 4:
                    b9 = b9;
                    b9.A01 = j;
                    b9.A00 = (b9.A02 << 32) + j;
                    c2 = 5;
                    break;
                case 5:
                    return timestamp;
            }
        }
    }
}

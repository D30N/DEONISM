package com.facebook.ads.redexgen.X;

import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.Pq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0729Pq implements MediaController.MediaPlayerControl {
    public final /* synthetic */ HN A00;

    public C0729Pq(HN hn) {
        this.A00 = hn;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        C0729Pq c0729Pq = this;
        int iA04 = 0;
        char c2 = c0729Pq.A00.A0C != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0729Pq = c0729Pq;
                    iA04 = c0729Pq.A00.A0C.A04();
                    c2 = 3;
                    break;
                case 3:
                    return iA04;
                case 4:
                    iA04 = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        C0729Pq c0729Pq = this;
        int iA05 = 0;
        char c2 = c0729Pq.A00.A0C != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0729Pq = c0729Pq;
                    iA05 = c0729Pq.A00.A0C.A05();
                    c2 = 3;
                    break;
                case 3:
                    return iA05;
                case 4:
                    iA05 = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        C0729Pq c0729Pq = this;
        boolean z = false;
        char c2 = c0729Pq.A00.A0C != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0729Pq = c0729Pq;
                    if (!c0729Pq.A00.A0C.A0J()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        this.A00.ABd(true, 4);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        this.A00.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        this.A00.ADN(PC.A05, 6);
    }
}

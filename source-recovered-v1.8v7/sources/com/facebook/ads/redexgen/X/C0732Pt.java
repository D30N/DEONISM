package com.facebook.ads.redexgen.X;

import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.Pt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0732Pt implements MediaController.MediaPlayerControl {
    public final /* synthetic */ HK A00;

    public C0732Pt(HK hk) {
        this.A00 = hk;
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
        C0732Pt c0732Pt = this;
        int audioSessionId = 0;
        char c2 = c0732Pt.A00.A06 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0732Pt = c0732Pt;
                    audioSessionId = c0732Pt.A00.A06.getAudioSessionId();
                    c2 = 3;
                    break;
                case 3:
                    return audioSessionId;
                case 4:
                    audioSessionId = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        return 0;
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
        C0732Pt c0732Pt = this;
        boolean z = false;
        char c2 = c0732Pt.A00.A06 != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0732Pt = c0732Pt;
                    if (!c0732Pt.A00.A06.isPlaying()) {
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
    public final void pause() throws IllegalStateException {
        this.A00.ABd(true, 4);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) throws IllegalStateException {
        this.A00.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() throws Throwable {
        this.A00.ADN(PC.A05, 6);
    }
}

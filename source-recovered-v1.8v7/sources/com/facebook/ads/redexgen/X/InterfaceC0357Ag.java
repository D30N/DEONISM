package com.facebook.ads.redexgen.X;

import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ag, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC0357Ag {
    void onAudioSessionId(C0356Af c0356Af, int i);

    void onAudioUnderrun(C0356Af c0356Af, int i, long j, long j2);

    void onDecoderDisabled(C0356Af c0356Af, int i, BW bw);

    void onDecoderEnabled(C0356Af c0356Af, int i, BW bw);

    void onDecoderInitialized(C0356Af c0356Af, int i, String str, long j);

    void onDecoderInputFormatChanged(C0356Af c0356Af, int i, Format format);

    void onDownstreamFormatChanged(C0356Af c0356Af, FN fn);

    void onDrmKeysLoaded(C0356Af c0356Af);

    void onDrmKeysRemoved(C0356Af c0356Af);

    void onDrmKeysRestored(C0356Af c0356Af);

    void onDrmSessionManagerError(C0356Af c0356Af, Exception exc);

    void onDroppedVideoFrames(C0356Af c0356Af, int i, long j);

    void onLoadError(C0356Af c0356Af, FM fm, FN fn, IOException iOException, boolean z);

    void onLoadingChanged(C0356Af c0356Af, boolean z);

    void onMediaPeriodCreated(C0356Af c0356Af);

    void onMediaPeriodReleased(C0356Af c0356Af);

    void onMetadata(C0356Af c0356Af, Metadata metadata);

    void onPlaybackParametersChanged(C0356Af c0356Af, AH ah);

    void onPlayerError(C0356Af c0356Af, C03479w c03479w);

    void onPlayerStateChanged(C0356Af c0356Af, boolean z, int i);

    void onPositionDiscontinuity(C0356Af c0356Af, int i);

    void onReadingStarted(C0356Af c0356Af);

    void onRenderedFirstFrame(C0356Af c0356Af, Surface surface);

    void onSeekProcessed(C0356Af c0356Af);

    void onSeekStarted(C0356Af c0356Af);

    void onTimelineChanged(C0356Af c0356Af, int i);

    void onTracksChanged(C0356Af c0356Af, TrackGroupArray trackGroupArray, HR hr);

    void onVideoSizeChanged(C0356Af c0356Af, int i, int i2, int i3, float f);
}

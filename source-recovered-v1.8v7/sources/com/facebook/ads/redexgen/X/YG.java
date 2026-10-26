package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.view.Surface;
import com.facebook.ads.internal.checkerframework.checker.nullness.qual.MonotonicNonNull;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: assets/audience_network.dex */
public final class YG implements AK, InterfaceC0431Dt, B3, JM, FO, HY, InterfaceC0387Bk {

    @MonotonicNonNull
    public AP A00;
    public final IM A03;
    public final CopyOnWriteArraySet<InterfaceC0357Ag> A04 = new CopyOnWriteArraySet<>();
    public final C0354Ad A02 = new C0354Ad();
    public final C0351Aa A01 = new C0351Aa();

    public YG(@Nullable AP ap, IM im) {
        this.A00 = ap;
        this.A03 = (IM) IJ.A01(im);
    }

    private C0356Af A00() {
        return A05(this.A02.A03());
    }

    private C0356Af A01() {
        return A05(this.A02.A04());
    }

    private C0356Af A02() {
        return A05(this.A02.A05());
    }

    private C0356Af A03() {
        return A05(this.A02.A06());
    }

    private final C0356Af A04(int i, @Nullable F8 f8) {
        long jA00;
        IJ.A01(this.A00);
        long jA4r = this.A03.A4r();
        AbstractC0352Ab timeline = this.A00.A5w();
        if (i == this.A00.A5x()) {
            if (f8 != null && f8.A01()) {
                if (this.A00.A5r() == f8.A00 && this.A00.A5s() == f8.A01) {
                    jA00 = this.A00.A5u();
                } else {
                    jA00 = 0;
                }
            } else {
                jA00 = this.A00.A5p();
            }
        } else if (i >= timeline.A01() || (f8 != null && f8.A01())) {
            jA00 = 0;
        } else {
            jA00 = timeline.A0B(i, this.A01).A00();
        }
        return new C0356Af(jA4r, timeline, i, f8, jA00, this.A00.A5u(), this.A00.A5X() - this.A00.A5p());
    }

    private C0356Af A05(@Nullable C0355Ae c0355Ae) {
        if (c0355Ae == null) {
            int iA5x = ((AP) IJ.A01(this.A00)).A5x();
            return A04(iA5x, this.A02.A07(iA5x));
        }
        return A04(c0355Ae.A00, c0355Ae.A01);
    }

    public final void A06() {
        YG yg = this;
        C0356Af c0356AfA02 = null;
        Iterator<InterfaceC0357Ag> it = null;
        char c2 = !yg.A02.A0F() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    yg = yg;
                    c0356AfA02 = yg.A02();
                    yg.A02.A09();
                    it = yg.A04.iterator();
                    c2 = 3;
                    break;
                case 3:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0356AfA02 = c0356AfA02;
                    it = it;
                    it.next().onSeekStarted(c0356AfA02);
                    c2 = 3;
                    break;
                case 5:
                    return;
            }
        }
    }

    public final void A07() {
        YG yg = this;
        Iterator it = new ArrayList(yg.A02.A05).iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    yg = yg;
                    it = it;
                    C0355Ae mediaPeriod = (C0355Ae) it.next();
                    yg.AAG(mediaPeriod.A00, mediaPeriod.A01);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B3
    public final void A8v(String str, long j, long j2) {
        String str2 = str;
        C0356Af c0356AfA03 = A03();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str2 = str2;
                    c0356AfA03 = c0356AfA03;
                    it = it;
                    it.next().onDecoderInitialized(c0356AfA03, 1, str2, j2);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B3
    public final void A8w(BW bw) {
        C0356Af c0356AfA00 = A00();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bw = bw;
                    c0356AfA00 = c0356AfA00;
                    it = it;
                    it.next().onDecoderDisabled(c0356AfA00, 1, bw);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B3
    public final void A8x(BW bw) {
        C0356Af c0356AfA02 = A02();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bw = bw;
                    c0356AfA02 = c0356AfA02;
                    it = it;
                    it.next().onDecoderEnabled(c0356AfA02, 1, bw);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B3
    public final void A8y(Format format) {
        C0356Af c0356AfA03 = A03();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    format = format;
                    c0356AfA03 = c0356AfA03;
                    it = it;
                    it.next().onDecoderInputFormatChanged(c0356AfA03, 1, format);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B3
    public final void A8z(int i) {
        C0356Af c0356AfA03 = A03();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0356AfA03 = c0356AfA03;
                    it = it;
                    InterfaceC0357Ag listener = it.next();
                    listener.onAudioSessionId(c0356AfA03, i);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B3
    public final void A90(int i, long j, long j2) {
        C0356Af c0356AfA03 = A03();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0356AfA03 = c0356AfA03;
                    it = it;
                    it.next().onAudioUnderrun(c0356AfA03, i, j, j2);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.HY
    public final void A91(int i, long j, long j2) {
        A01();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    it = it;
                    it.next();
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.FO
    public final void A9P(int i, @Nullable F8 f8, FN fn) {
        C0356Af c0356AfA04 = A04(i, f8);
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    fn = fn;
                    c0356AfA04 = c0356AfA04;
                    it = it;
                    it.next().onDownstreamFormatChanged(c0356AfA04, fn);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0387Bk
    public final void A9Q() {
        C0356Af c0356AfA03 = A03();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0356AfA03 = c0356AfA03;
                    it = it;
                    InterfaceC0357Ag listener = it.next();
                    listener.onDrmKeysLoaded(c0356AfA03);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0387Bk
    public final void A9R() {
        C0356Af c0356AfA03 = A03();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0356AfA03 = c0356AfA03;
                    it = it;
                    InterfaceC0357Ag listener = it.next();
                    listener.onDrmKeysRemoved(c0356AfA03);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0387Bk
    public final void A9S() {
        C0356Af c0356AfA03 = A03();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0356AfA03 = c0356AfA03;
                    it = it;
                    InterfaceC0357Ag listener = it.next();
                    listener.onDrmKeysRestored(c0356AfA03);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0387Bk
    public final void A9T(Exception exc) {
        C0356Af c0356AfA03 = A03();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    exc = exc;
                    c0356AfA03 = c0356AfA03;
                    it = it;
                    InterfaceC0357Ag listener = it.next();
                    listener.onDrmSessionManagerError(c0356AfA03, exc);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void A9U(int i, long j) {
        C0356Af c0356AfA00 = A00();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0356AfA00 = c0356AfA00;
                    it = it;
                    it.next().onDroppedVideoFrames(c0356AfA00, i, j);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.FO
    public final void AA3(int i, @Nullable F8 f8, FM fm, FN fn) {
        A04(i, f8);
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    it = it;
                    it.next();
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.FO
    public final void AA5(int i, @Nullable F8 f8, FM fm, FN fn) {
        A04(i, f8);
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    it = it;
                    it.next();
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.FO
    public final void AA8(int i, @Nullable F8 f8, FM fm, FN fn, IOException iOException, boolean z) {
        IOException iOException2 = iOException;
        FM fm2 = fm;
        FN fn2 = fn;
        C0356Af c0356AfA04 = A04(i, f8);
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    fm2 = fm2;
                    fn2 = fn2;
                    iOException2 = iOException2;
                    c0356AfA04 = c0356AfA04;
                    it = it;
                    it.next().onLoadError(c0356AfA04, fm2, fn2, iOException2, z);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.FO
    public final void AAA(int i, @Nullable F8 f8, FM fm, FN fn) {
        A04(i, f8);
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    it = it;
                    it.next();
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final void AAC(boolean z) {
        C0356Af c0356AfA02 = A02();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0356AfA02 = c0356AfA02;
                    it = it;
                    InterfaceC0357Ag listener = it.next();
                    listener.onLoadingChanged(c0356AfA02, z);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.FO
    public final void AAF(int i, F8 f8) {
        this.A02.A0B(i, f8);
        C0356Af c0356AfA04 = A04(i, f8);
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0356AfA04 = c0356AfA04;
                    it = it;
                    it.next().onMediaPeriodCreated(c0356AfA04);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.FO
    public final void AAG(int i, F8 f8) {
        this.A02.A0C(i, f8);
        C0356Af c0356AfA04 = A04(i, f8);
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0356AfA04 = c0356AfA04;
                    it = it;
                    it.next().onMediaPeriodReleased(c0356AfA04);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0431Dt
    public final void AAJ(Metadata metadata) {
        C0356Af c0356AfA02 = A02();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    metadata = metadata;
                    c0356AfA02 = c0356AfA02;
                    it = it;
                    InterfaceC0357Ag listener = it.next();
                    listener.onMetadata(c0356AfA02, metadata);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final void AAY(AH ah) {
        C0356Af c0356AfA02 = A02();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ah = ah;
                    c0356AfA02 = c0356AfA02;
                    it = it;
                    InterfaceC0357Ag listener = it.next();
                    listener.onPlaybackParametersChanged(c0356AfA02, ah);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final void AAa(C03479w c03479w) {
        C0356Af c0356AfA02 = A02();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c03479w = c03479w;
                    c0356AfA02 = c0356AfA02;
                    it = it;
                    InterfaceC0357Ag listener = it.next();
                    listener.onPlayerError(c0356AfA02, c03479w);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final void AAc(boolean z, int i) {
        C0356Af c0356AfA02 = A02();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0356AfA02 = c0356AfA02;
                    it = it;
                    it.next().onPlayerStateChanged(c0356AfA02, z, i);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final void AAe(int i) {
        this.A02.A0A(i);
        C0356Af c0356AfA02 = A02();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0356AfA02 = c0356AfA02;
                    it = it;
                    InterfaceC0357Ag listener = it.next();
                    listener.onPositionDiscontinuity(c0356AfA02, i);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.FO
    public final void AAm(int i, F8 f8) {
        this.A02.A0D(i, f8);
        C0356Af c0356AfA04 = A04(i, f8);
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0356AfA04 = c0356AfA04;
                    it = it;
                    it.next().onReadingStarted(c0356AfA04);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void AAp(Surface surface) {
        C0356Af c0356AfA03 = A03();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    surface = surface;
                    c0356AfA03 = c0356AfA03;
                    it = it;
                    InterfaceC0357Ag listener = it.next();
                    listener.onRenderedFirstFrame(c0356AfA03, surface);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final void AAz() {
        YG yg = this;
        C0356Af c0356AfA02 = null;
        Iterator<InterfaceC0357Ag> it = null;
        char c2 = yg.A02.A0F() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    yg = yg;
                    yg.A02.A08();
                    c0356AfA02 = yg.A02();
                    it = yg.A04.iterator();
                    c2 = 3;
                    break;
                case 3:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0356AfA02 = c0356AfA02;
                    it = it;
                    it.next().onSeekProcessed(c0356AfA02);
                    c2 = 3;
                    break;
                case 5:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final void ABB(AbstractC0352Ab abstractC0352Ab, @Nullable Object obj, int i) {
        this.A02.A0E(abstractC0352Ab);
        C0356Af c0356AfA02 = A02();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0356AfA02 = c0356AfA02;
                    it = it;
                    it.next().onTimelineChanged(c0356AfA02, i);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AK
    public final void ABC(TrackGroupArray trackGroupArray, HR hr) {
        C0356Af c0356AfA02 = A02();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    trackGroupArray = trackGroupArray;
                    hr = hr;
                    c0356AfA02 = c0356AfA02;
                    it = it;
                    it.next().onTracksChanged(c0356AfA02, trackGroupArray, hr);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void ABK(String str, long j, long j2) {
        String str2 = str;
        C0356Af c0356AfA03 = A03();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str2 = str2;
                    c0356AfA03 = c0356AfA03;
                    it = it;
                    it.next().onDecoderInitialized(c0356AfA03, 2, str2, j2);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void ABL(BW bw) {
        C0356Af c0356AfA00 = A00();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bw = bw;
                    c0356AfA00 = c0356AfA00;
                    it = it;
                    it.next().onDecoderDisabled(c0356AfA00, 2, bw);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void ABM(BW bw) {
        C0356Af c0356AfA02 = A02();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bw = bw;
                    c0356AfA02 = c0356AfA02;
                    it = it;
                    it.next().onDecoderEnabled(c0356AfA02, 2, bw);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void ABO(Format format) {
        C0356Af c0356AfA03 = A03();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    format = format;
                    c0356AfA03 = c0356AfA03;
                    it = it;
                    it.next().onDecoderInputFormatChanged(c0356AfA03, 2, format);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void ABR(int i, int i2, int i3, float f) {
        C0356Af c0356AfA03 = A03();
        Iterator<InterfaceC0357Ag> it = this.A04.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0356AfA03 = c0356AfA03;
                    it = it;
                    it.next().onVideoSizeChanged(c0356AfA03, i, i2, i3, f);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }
}

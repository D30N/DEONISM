package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

@TargetApi(14)
/* loaded from: assets/audience_network.dex */
public final class HN extends TextureView implements TextureView.SurfaceTextureListener, InterfaceC0721Pi, InterfaceC0735Pw, InterfaceC0723Pk {
    public static byte[] A0O;
    public static final String A0P;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public Uri A06;

    @Nullable
    public Surface A07;
    public View A08;

    @Nullable
    public MediaController A09;
    public XI A0A;
    public PC A0B;

    @Nullable
    public C0724Pl A0C;
    public EnumC0737Py A0D;
    public EnumC0737Py A0E;
    public EnumC0737Py A0F;
    public InterfaceC0738Pz A0G;

    @Nullable
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0O, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 31);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A0O = new byte[]{6, 46, 46, 38, 45, 36, 97, 32, 45, 54, 32, 56, 50, 97, 53, 41, 51, 46, 54, 97, 32, 47, 97, 36, 57, 34, 36, 49, 53, 40, 46, 47, 97, 54, 40, 53, 41, 97, 50, 36, 53, 7, 46, 51, 36, 38, 51, 46, 52, 47, 37, 97, 46, 47, 97, 15, 46, 52, 38, 32, 53, 97, 32, 35, 46, 55, 36, 111, 97, 50, 46, 97, 54, 36, 97, 50, 40, 45, 36, 47, 53, 45, 56, 97, 40, 38, 47, 46, 51, 36, 97, 40, 53, 111, 60, 20, 20, 28, 23, 30, 91, 26, 23, 12, 26, 2, 8, 91, 15, 19, 9, 20, 12, 91, 26, 21, 91, 30, 3, 24, 30, 11, 15, 18, 20, 21, 91, 12, 18, 15, 19, 91, 8, 30, 15, 57, 26, 24, 16, 28, 9, 20, 14, 21, 31, 63, 9, 26, 12, 26, 25, 23, 30, 91, 20, 21, 91, 53, 20, 14, 28, 26, 15, 91, 26, 25, 20, 13, 30, 85, 91, 8, 20, 91, 12, 30, 91, 8, 18, 23, 30, 21, 15, 23, 2, 91, 18, 28, 21, 20, 9, 30, 91, 18, 15, 85, 120, 71, 74, 75, 65, 14, 93, 90, 79, 90, 75, 14, 77, 70, 79, 64, 73, 75, 74, 14, 90, 65, 14, 125, Byte.MAX_VALUE, 116, Byte.MAX_VALUE, 104, 115, 121};
    }

    static {
        A06();
        A0P = HN.class.getSimpleName();
    }

    public HN(XI xi) {
        super(xi);
        this.A0D = EnumC0737Py.A04;
        this.A0F = EnumC0737Py.A04;
        this.A0E = EnumC0737Py.A04;
        this.A0N = false;
        this.A0M = false;
        this.A0K = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0J = false;
        this.A0I = false;
        this.A0B = PC.A04;
        this.A0L = false;
        this.A0A = xi;
    }

    public HN(XI xi, AttributeSet attributeSet) {
        super(xi, attributeSet);
        this.A0D = EnumC0737Py.A04;
        this.A0F = EnumC0737Py.A04;
        this.A0E = EnumC0737Py.A04;
        this.A0N = false;
        this.A0M = false;
        this.A0K = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0J = false;
        this.A0I = false;
        this.A0B = PC.A04;
        this.A0L = false;
        this.A0A = xi;
    }

    public HN(XI xi, AttributeSet attributeSet, int i) {
        super(xi, attributeSet, i);
        this.A0D = EnumC0737Py.A04;
        this.A0F = EnumC0737Py.A04;
        this.A0E = EnumC0737Py.A04;
        this.A0N = false;
        this.A0M = false;
        this.A0K = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0J = false;
        this.A0I = false;
        this.A0B = PC.A04;
        this.A0L = false;
        this.A0A = xi;
    }

    private void A03() {
        HN hn = this;
        String str = null;
        View view = null;
        MediaController mediaController = null;
        Activity activityA09 = null;
        hn.A0C = new C0724Pl(hn.A0A);
        hn.A0C.A0H(hn);
        hn.A0C.A0G(hn);
        hn.A0C.A0I(false);
        char c2 = hn.A0K ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    hn = hn;
                    if (!hn.A0J) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 3:
                    hn = hn;
                    activityA09 = hn.A0A.A09();
                    if (activityA09 == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    hn = hn;
                    activityA09 = activityA09;
                    hn.A09 = new MediaController(activityA09);
                    mediaController = hn.A09;
                    view = hn.A08;
                    if (view != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    hn = hn;
                    view = hn;
                    c2 = 6;
                    break;
                case 6:
                    hn = hn;
                    mediaController = mediaController;
                    mediaController.setAnchorView(view);
                    hn.A09.setMediaPlayer(new C0729Pq(hn));
                    hn.A09.setEnabled(true);
                    c2 = 7;
                    break;
                case 7:
                    hn = hn;
                    str = hn.A0H;
                    if (str == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    str = str;
                    if (str.length() == 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    hn = hn;
                    if (!hn.A0L) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    hn = hn;
                    hn.A0C.A0E(hn.getContext(), hn.A06);
                    c2 = 11;
                    break;
                case 11:
                    hn = hn;
                    hn.setVideoState(EnumC0737Py.A08);
                    if (!hn.isAvailable()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    hn = hn;
                    hn.onSurfaceTextureAvailable(hn.getSurfaceTexture(), 0, 0);
                    c2 = '\r';
                    break;
                case '\r':
                    return;
                case 14:
                    hn = hn;
                    hn.A09 = null;
                    c2 = 7;
                    break;
            }
        }
    }

    private void A04() {
        HN hn = this;
        C0722Pj c0722PjA08 = null;
        C0724Pl c0724Pl = hn.A0C;
        char c2 = c0724Pl == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0724Pl = c0724Pl;
                    c0722PjA08 = c0724Pl.A08();
                    if (c0722PjA08 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    hn = hn;
                    c0722PjA08 = c0722PjA08;
                    hn.A07(c0722PjA08.A01, c0722PjA08.A00);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.MediaController, com.facebook.ads.redexgen.X.Pl] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    private void A05() {
        HN hn = this;
        C0724Pl c0724Pl = null;
        Surface surface = hn.A07;
        ?? r1 = 0;
        char c2 = surface != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    hn = hn;
                    surface = surface;
                    r1 = 0;
                    surface.release();
                    hn.A07 = null;
                    c2 = 3;
                    break;
                case 3:
                    hn = hn;
                    c0724Pl = hn.A0C;
                    if (c0724Pl == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    hn = hn;
                    c0724Pl = c0724Pl;
                    c0724Pl.A09();
                    hn.A0C = r1;
                    c2 = 5;
                    break;
                case 5:
                    HN hn2 = hn;
                    hn2.A09 = r1;
                    hn2.A0M = false;
                    hn2.setVideoState(EnumC0737Py.A04);
                    return;
            }
        }
    }

    private void A07(int i, int i2) {
        HN hn = this;
        char c2 = i == hn.A03 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    hn = hn;
                    if (i2 == hn.A02) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    hn = hn;
                    hn.A03 = i;
                    hn.A02 = i2;
                    if (hn.A03 == 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    hn = hn;
                    if (hn.A02 == 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    hn = hn;
                    hn.requestLayout();
                    c2 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }

    public static boolean A08() {
        return C0724Pl.A03();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public final void A7H() {
        if (!this.A0I) {
            ABd(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public final boolean A7O() {
        boolean z = false;
        C0724Pl c0724Pl = this.A0C;
        char c2 = c0724Pl != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0724Pl = c0724Pl;
                    if (!c0724Pl.A0K()) {
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

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public final boolean A7P() {
        return this.A0M;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0721Pi
    public final void AAb(String str, Exception exc) {
        this.A0A.A0A().A8Z(str);
        this.A0A.A0A().A2y(1);
        setVideoState(EnumC0737Py.A03);
        this.A0A.A04().A83(A02(219, 7, 5), C03008a.A14, new C03018b(exc));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0721Pi
    public final void AAc(boolean z, int i) {
        HN hn = this;
        long j = 0;
        C0724Pl c0724Pl = null;
        long j2 = 0;
        boolean z2 = false;
        char c2 = hn.A0C == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    if (i == 1) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 2) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == 3) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i == 4) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return;
                case '\b':
                    if (!z) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    hn = hn;
                    hn.setVideoState(EnumC0737Py.A06);
                    c2 = '\n';
                    break;
                case '\n':
                    hn = hn;
                    c0724Pl = hn.A0C;
                    z2 = false;
                    if (c0724Pl == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0724Pl = c0724Pl;
                    z2 = false;
                    c0724Pl.A0I(false);
                    if (!z) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\f':
                    hn = hn;
                    hn.A0C.A0A();
                    c2 = '\r';
                    break;
                case '\r':
                    hn = hn;
                    hn.A0M = z2;
                    c2 = 7;
                    break;
                case 14:
                    hn = hn;
                    hn.A04();
                    hn.A04 = System.currentTimeMillis();
                    hn.setRequestedVolume(hn.A00);
                    j = hn.A05;
                    j2 = 0;
                    if (j <= 0) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    hn = hn;
                    if (j >= hn.A0C.A07()) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    hn = hn;
                    hn.A0C.A0D(hn.A05);
                    hn.A05 = j2;
                    c2 = 17;
                    break;
                case 17:
                    hn = hn;
                    if (hn.A0C.A06() == j2) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    if (!z) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 19:
                    hn = hn;
                    if (!hn.A0M) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    hn = hn;
                    hn.setVideoState(EnumC0737Py.A05);
                    c2 = 7;
                    break;
                case 21:
                    if (!z) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 22:
                    hn = hn;
                    if (hn.A0D == EnumC0737Py.A06) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    hn = hn;
                    hn.setVideoState(EnumC0737Py.A07);
                    if (hn.A0F != EnumC0737Py.A0A) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    hn = hn;
                    hn.ADN(hn.A0B, 8);
                    hn.A0F = EnumC0737Py.A04;
                    c2 = 7;
                    break;
                case 25:
                    hn = hn;
                    hn.A04();
                    if (hn.A01 < 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    hn = hn;
                    int i2 = hn.A01;
                    hn.A01 = -1;
                    hn.A0G.AAy(i2, hn.getCurrentPosition());
                    c2 = 7;
                    break;
                case 27:
                    hn = hn;
                    hn.setVideoState(EnumC0737Py.A04);
                    c2 = 7;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Pk
    public final void ABR(int i, int i2, int i3, float f) {
        A07(i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public final void ABd(boolean z, int i) {
        HN hn = this;
        hn.A0A.A0A().A2u(i);
        C0724Pl c0724Pl = hn.A0C;
        char c2 = c0724Pl != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0724Pl = c0724Pl;
                    c0724Pl.A0I(false);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    hn = hn;
                    hn.setVideoState(EnumC0737Py.A04);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public final void ADJ(int i) {
        this.A0A.A0A().A8a(i);
        setVideoState(EnumC0737Py.A09);
        ADT(5);
        this.A05 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public final void ADN(PC pc, int i) {
        HN hn = this;
        hn.A0A.A0A().A35(i);
        hn.A0F = EnumC0737Py.A0A;
        hn.A0B = pc;
        char c2 = hn.A0C == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    hn = hn;
                    hn.setup(hn.A06);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    hn = hn;
                    if (hn.A0D == EnumC0737Py.A07) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    hn = hn;
                    if (hn.A0D == EnumC0737Py.A05) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    hn = hn;
                    if (hn.A0D != EnumC0737Py.A06) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    hn = hn;
                    hn.A0C.A0I(true);
                    hn.setVideoState(EnumC0737Py.A0A);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public final void ADT(int i) {
        this.A0A.A0A().A37(i);
        this.A0F = EnumC0737Py.A04;
        C0724Pl c0724Pl = this.A0C;
        if (c0724Pl != null) {
            c0724Pl.A0B();
            this.A0C.A09();
            this.A0C = null;
        }
        setVideoState(EnumC0737Py.A04);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public final void destroy() {
        A05();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public int getCurrentPosition() {
        int iA06 = 0;
        C0724Pl c0724Pl = this.A0C;
        char c2 = c0724Pl != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0724Pl = c0724Pl;
                    iA06 = (int) c0724Pl.A06();
                    c2 = 3;
                    break;
                case 3:
                    return iA06;
                case 4:
                    iA06 = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public int getDuration() {
        C0724Pl c0724Pl = this.A0C;
        if (c0724Pl == null) {
            return 0;
        }
        return (int) c0724Pl.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public long getInitialBufferTime() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public PC getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public EnumC0737Py getState() {
        return this.A0D;
    }

    public EnumC0737Py getTargetState() {
        return this.A0F;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public int getVideoHeight() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public int getVideoWidth() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        HN hn = this;
        C0724Pl c0724Pl = null;
        Surface surface = hn.A07;
        char c2 = surface != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    surface = surface;
                    surface.release();
                    c2 = 3;
                    break;
                case 3:
                    hn = hn;
                    surfaceTexture = surfaceTexture;
                    hn.A07 = new Surface(surfaceTexture);
                    c0724Pl = hn.A0C;
                    if (c0724Pl != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    hn = hn;
                    c0724Pl = c0724Pl;
                    c0724Pl.A0F(hn.A07);
                    hn.A0N = false;
                    if (hn.A0D != EnumC0737Py.A05) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    hn = hn;
                    if (hn.A0E == EnumC0737Py.A05) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    hn = hn;
                    hn.ADN(hn.A0B, 7);
                    c2 = '\b';
                    break;
                case '\b':
                    return;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        HN hn = this;
        EnumC0737Py enumC0737Py = null;
        boolean z = false;
        C0724Pl c0724Pl = null;
        Surface surface = null;
        Surface surface2 = hn.A07;
        char c2 = surface2 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    hn = hn;
                    surface2 = surface2;
                    surface2.release();
                    surface = null;
                    hn.A07 = null;
                    c0724Pl = hn.A0C;
                    if (c0724Pl == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0724Pl = c0724Pl;
                    c0724Pl.A0F(surface);
                    c2 = 4;
                    break;
                case 4:
                    hn = hn;
                    z = true;
                    if (!hn.A0N) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 5:
                    hn = hn;
                    if (!hn.A0K) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    enumC0737Py = EnumC0737Py.A0A;
                    c2 = 7;
                    break;
                case 7:
                    hn = hn;
                    enumC0737Py = enumC0737Py;
                    hn.A0E = enumC0737Py;
                    hn.A0N = z;
                    c2 = '\b';
                    break;
                case '\b':
                    hn = hn;
                    if (hn.A0D == EnumC0737Py.A05) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    hn = hn;
                    hn.ABd(false, 5);
                    c2 = '\n';
                    break;
                case '\n':
                    return z;
                case 11:
                    hn = hn;
                    enumC0737Py = hn.A0D;
                    c2 = 7;
                    break;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        HN hn = this;
        EnumC0737Py enumC0737Py = null;
        MediaController mediaController = null;
        super.onWindowFocusChanged(z);
        char c2 = hn.A0C == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    hn = hn;
                    mediaController = hn.A09;
                    if (mediaController == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    mediaController = mediaController;
                    if (!mediaController.isShowing()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return;
                case 6:
                    if (!z) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 7:
                    hn = hn;
                    if (!hn.A0N) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case '\b':
                    hn = hn;
                    if (!hn.A0K) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    enumC0737Py = EnumC0737Py.A0A;
                    c2 = '\n';
                    break;
                case '\n':
                    hn = hn;
                    enumC0737Py = enumC0737Py;
                    hn.A0E = enumC0737Py;
                    hn.A0N = true;
                    c2 = 11;
                    break;
                case 11:
                    hn = hn;
                    if (hn.A0D == EnumC0737Py.A05) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    hn = hn;
                    hn.A7H();
                    c2 = '\r';
                    break;
                case '\r':
                    return;
                case 14:
                    hn = hn;
                    enumC0737Py = hn.A0D;
                    c2 = '\n';
                    break;
                case 15:
                    hn = hn;
                    hn.A0N = false;
                    if (hn.A0D != EnumC0737Py.A05) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    hn = hn;
                    if (hn.A0E == EnumC0737Py.A05) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    hn = hn;
                    hn.ADN(hn.A0B, 9);
                    c2 = '\r';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public final void seekTo(int i) {
        HN hn = this;
        char c2 = hn.A0C != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    hn = hn;
                    hn.A01 = hn.getCurrentPosition();
                    hn.A0C.A0D(i);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    hn = hn;
                    hn.A05 = i;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        HN hn = this;
        char c2 = Build.VERSION.SDK_INT < 24 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    hn = hn;
                    drawable = drawable;
                    super.setBackgroundDrawable(drawable);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    if (!AdInternalSettings.isDebugBuild()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    Log.w(A0P, A02(94, 102, 100));
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.A0I = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public void setControlsAnchorView(View view) {
        this.A08 = view;
        view.setOnTouchListener(new ViewOnTouchListenerC0731Ps(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        HN hn = this;
        char c2 = Build.VERSION.SDK_INT < 24 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    hn = hn;
                    drawable = drawable;
                    super.setForeground(drawable);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    if (!AdInternalSettings.isDebugBuild()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    Log.w(A0P, A02(0, 94, 94));
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public void setFullScreen(boolean z) {
        HN hn = this;
        hn.A0K = z;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    hn = hn;
                    if (!hn.A0J) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    hn = hn;
                    hn.setOnTouchListener(new ViewOnTouchListenerC0730Pr(hn));
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public void setRequestedVolume(float f) {
        HN hn = this;
        hn.A00 = f;
        char c2 = hn.A0C != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    hn = hn;
                    if (hn.A0D == EnumC0737Py.A08) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    hn = hn;
                    if (hn.A0D == EnumC0737Py.A04) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    hn = hn;
                    hn.A0C.A0C(f);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    public void setTestMode(boolean z) {
        this.A0L = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public void setVideoMPD(@Nullable String str) {
        this.A0H = str;
    }

    private void setVideoState(EnumC0737Py enumC0737Py) {
        HN hn = this;
        InterfaceC0738Pz interfaceC0738Pz = null;
        char c2 = enumC0737Py != hn.A0D ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    if (!BuildConfigApi.isDebug()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    enumC0737Py = enumC0737Py;
                    String str = A02(196, 23, 49) + enumC0737Py;
                    c2 = 4;
                    break;
                case 4:
                    hn = hn;
                    enumC0737Py = enumC0737Py;
                    hn.A0D = enumC0737Py;
                    if (hn.A0D != EnumC0737Py.A0A) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    hn = hn;
                    hn.A0M = true;
                    c2 = 6;
                    break;
                case 6:
                    hn = hn;
                    interfaceC0738Pz = hn.A0G;
                    if (interfaceC0738Pz == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    enumC0737Py = enumC0737Py;
                    interfaceC0738Pz = interfaceC0738Pz;
                    interfaceC0738Pz.ABS(enumC0737Py);
                    c2 = '\b';
                    break;
                case '\b':
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public void setVideoStateChangeListener(InterfaceC0738Pz interfaceC0738Pz) {
        this.A0G = interfaceC0738Pz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public void setup(Uri uri) {
        this.A0A.A0A().A2x();
        if (this.A0C != null) {
            A05();
        }
        this.A06 = uri;
        setSurfaceTextureListener(this);
        A03();
    }
}

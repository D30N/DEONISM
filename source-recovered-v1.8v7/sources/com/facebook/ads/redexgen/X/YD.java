package com.facebook.ads.redexgen.X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class YD implements JM, B3, InterfaceC0487Gb, InterfaceC0431Dt, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ EK A00;

    public YD(EK ek) {
        this.A00 = ek;
    }

    @Override // com.facebook.ads.redexgen.X.B3
    public final void A8v(String str, long j, long j2) {
        String str2 = str;
        Iterator it = this.A00.A0I.iterator();
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
                    it = it;
                    ((B3) it.next()).A8v(str2, j, j2);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B3
    public final void A8w(BW bw) {
        Iterator it = this.A00.A0I.iterator();
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
                    it = it;
                    ((B3) it.next()).A8w(bw);
                    c2 = 2;
                    break;
                case 4:
                    YD yd = this;
                    yd.A00.A06 = null;
                    yd.A00.A09 = null;
                    yd.A00.A01 = 0;
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B3
    public final void A8x(BW bw) {
        this.A00.A09 = bw;
        Iterator it = this.A00.A0I.iterator();
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
                    it = it;
                    ((B3) it.next()).A8x(bw);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B3
    public final void A8y(Format format) {
        this.A00.A06 = format;
        Iterator it = this.A00.A0I.iterator();
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
                    it = it;
                    ((B3) it.next()).A8y(format);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B3
    public final void A8z(int i) {
        this.A00.A01 = i;
        Iterator it = this.A00.A0I.iterator();
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
                    ((B3) it.next()).A8z(i);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B3
    public final void A90(int i, long j, long j2) {
        Iterator it = this.A00.A0I.iterator();
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
                    ((B3) it.next()).A90(i, j, j2);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0487Gb
    public final void A9J(List<GX> list) {
        this.A00.A0C = list;
        Iterator it = this.A00.A0K.iterator();
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
                    list = list;
                    it = it;
                    ((InterfaceC0487Gb) it.next()).A9J(list);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void A9U(int i, long j) {
        Iterator it = this.A00.A0L.iterator();
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
                    ((JM) it.next()).A9U(i, j);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0431Dt
    public final void AAJ(Metadata metadata) {
        Iterator it = this.A00.A0J.iterator();
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
                    it = it;
                    ((InterfaceC0431Dt) it.next()).AAJ(metadata);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void AAp(Surface surface) {
        YD yd = this;
        Iterator it = null;
        Iterator it2 = null;
        char c2 = yd.A00.A03 == surface ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    yd = yd;
                    it2 = yd.A00.A0M.iterator();
                    c2 = 3;
                    break;
                case 3:
                    it2 = it2;
                    if (!it2.hasNext()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    it2 = it2;
                    it2.next();
                    c2 = 3;
                    break;
                case 5:
                    yd = yd;
                    it = yd.A00.A0L.iterator();
                    c2 = 6;
                    break;
                case 6:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    surface = surface;
                    it = it;
                    ((JM) it.next()).AAp(surface);
                    c2 = 6;
                    break;
                case '\b':
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void ABK(String str, long j, long j2) {
        String str2 = str;
        Iterator it = this.A00.A0L.iterator();
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
                    it = it;
                    ((JM) it.next()).ABK(str2, j, j2);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void ABL(BW bw) {
        Iterator it = this.A00.A0L.iterator();
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
                    it = it;
                    ((JM) it.next()).ABL(bw);
                    c2 = 2;
                    break;
                case 4:
                    YD yd = this;
                    yd.A00.A07 = null;
                    yd.A00.A0A = null;
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void ABM(BW bw) {
        this.A00.A0A = bw;
        Iterator it = this.A00.A0L.iterator();
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
                    it = it;
                    ((JM) it.next()).ABM(bw);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void ABO(Format format) {
        this.A00.A07 = format;
        Iterator it = this.A00.A0L.iterator();
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
                    it = it;
                    ((JM) it.next()).ABO(format);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void ABR(int i, int i2, int i3, float f) {
        YD yd = this;
        Iterator it = null;
        Iterator it2 = yd.A00.A0M.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it2 = it2;
                    if (!it2.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    it2 = it2;
                    ((JD) it2.next()).ABR(i, i2, i3, f);
                    c2 = 2;
                    break;
                case 4:
                    yd = yd;
                    it = yd.A00.A0L.iterator();
                    c2 = 5;
                    break;
                case 5:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    it = it;
                    ((JM) it.next()).ABR(i, i2, i3, f);
                    c2 = 5;
                    break;
                case 7:
                    return;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00.A0G(new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.A0G(null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A00.A0G(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A00.A0G(null, false);
    }
}

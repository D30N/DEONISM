package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.EOFException;

/* loaded from: assets/audience_network.dex */
public final class CH {
    public final C0544Ii A00 = new C0544Ii(10);

    @Nullable
    public final Metadata A00(CD cd, @Nullable E2 e2) throws Throwable {
        CH ch = this;
        int iA0D = 0;
        int i = 0;
        int tagLength = 0;
        int i2 = 0;
        int i3 = 0;
        Metadata metadataA0O = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        ch = ch;
                        i = 10;
                        tagLength = 0;
                        cd.ABf(ch.A00.A00, 0, 10);
                        ch.A00.A0Y(0);
                    } catch (EOFException unused) {
                    }
                    if (ch.A00.A0G() != C0991Zw.A02) {
                        cd.ACg();
                        cd.A3L(i3);
                        return metadataA0O;
                    }
                    ch.A00.A0Z(3);
                    iA0D = ch.A00.A0D();
                    i2 = iA0D + 10;
                    if (metadataA0O != null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    ch = ch;
                    cd = cd;
                    e2 = e2;
                    byte[] bArr = new byte[i2];
                    System.arraycopy(ch.A00.A00, tagLength, bArr, tagLength, i);
                    cd.ABf(bArr, i, iA0D);
                    metadataA0O = new C0991Zw(e2).A0O(bArr, i2);
                    c2 = '\t';
                    break;
                case '\t':
                    i3 += i2;
                    c2 = 2;
                    break;
                case '\n':
                    cd = cd;
                    cd.A3L(iA0D);
                    c2 = '\t';
                    break;
            }
        }
    }
}

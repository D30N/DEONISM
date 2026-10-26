package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.support.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Bo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0391Bo extends a8<GN> {
    public static byte[] A00;
    public static final DownloadAction.Deserializer A01;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 49);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{18, 15, 33, 22};
    }

    static {
        A02();
        A01 = new C0395Bu(A01(0, 4, 125), 0);
    }

    public C0391Bo(Uri uri, boolean z, @Nullable byte[] bArr, List<GN> list) {
        super(A01(0, 4, 125), 0, uri, z, bArr, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0377Ba A08(C0443Ef c0443Ef) {
        return new C0377Ba(this.A01, ((a8) this).A00, c0443Ef);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.a8
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void A0B(DataOutputStream dataOutputStream, GN gn) throws IOException {
        dataOutputStream.writeInt(gn.A01);
        dataOutputStream.writeInt(gn.A00);
        dataOutputStream.writeInt(gn.A02);
    }
}

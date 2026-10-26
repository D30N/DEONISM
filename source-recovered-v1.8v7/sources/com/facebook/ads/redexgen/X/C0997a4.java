package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.support.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.a4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0997a4 extends DownloadAction {
    public static byte[] A01;
    public static final DownloadAction.Deserializer A02;

    @Nullable
    public final String A00;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 88);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A01 = new byte[]{-25, -23, -26, -34, -23, -36, -22, -22, -32, -19, -36};
    }

    static {
        A03();
        A02 = new C0996a3(A02(0, 11, 31), 0);
    }

    public C0997a4(Uri uri, boolean z, @Nullable byte[] bArr, @Nullable String str) {
        super(A02(0, 11, 31), 0, uri, z, bArr);
        this.A00 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0999a6 A08(C0443Ef c0443Ef) {
        return new C0999a6(this.A01, this.A00, c0443Ef);
    }

    private String A01() {
        String str = this.A00;
        return str != null ? str : I9.A01(this.A01);
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final void A09(DataOutputStream dataOutputStream) throws IOException {
        C0997a4 c0997a4 = this;
        boolean z = false;
        dataOutputStream.writeUTF(c0997a4.A01.toString());
        dataOutputStream.writeBoolean(c0997a4.A03);
        dataOutputStream.writeInt(c0997a4.A04.length);
        dataOutputStream.write(c0997a4.A04);
        char c2 = c0997a4.A00 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    dataOutputStream = dataOutputStream;
                    dataOutputStream.writeBoolean(z);
                    if (!z) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0997a4 = c0997a4;
                    dataOutputStream = dataOutputStream;
                    dataOutputStream.writeUTF(c0997a4.A00);
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final boolean A0A(DownloadAction downloadAction) {
        C0997a4 c0997a4 = this;
        boolean z = false;
        char c2 = downloadAction instanceof C0997a4 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0997a4 = c0997a4;
                    downloadAction = downloadAction;
                    if (!c0997a4.A01().equals(((C0997a4) downloadAction).A01())) {
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

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final boolean equals(@Nullable Object obj) {
        C0997a4 c0997a4 = this;
        char c2 = c0997a4 == obj ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return true;
                case 3:
                    c0997a4 = c0997a4;
                    obj = obj;
                    if (!super.equals(obj)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    C0997a4 that = c0997a4;
                    return C0560Iy.A0j(that.A00, ((C0997a4) obj).A00);
            }
        }
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = super.hashCode() * 31;
        String str = this.A00;
        char c2 = str != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    iHashCode = str.hashCode();
                    c2 = 3;
                    break;
                case 3:
                    return iHashCode2 + iHashCode;
                case 4:
                    iHashCode = 0;
                    c2 = 3;
                    break;
            }
        }
    }
}

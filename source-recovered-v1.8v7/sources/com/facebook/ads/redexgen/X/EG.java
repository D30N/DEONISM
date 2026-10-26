package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import d.b.a.b.k;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class EG {
    public static byte[] A02;
    public final IL A00;
    public final File A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowFixedHeightMinor);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{59, 0, 29, 27, 30, 30, 1, 28, 26, 11, 10, 78, 15, 13, 26, 7, 1, 0, 78, 8, 7, 2, 11, 78, 24, 11, 28, 29, 7, 1, 0, 84, 78};
    }

    public EG(File file) {
        this.A01 = file;
        this.A00 = new IL(file);
    }

    public final void A02(DownloadAction... downloadActionArr) throws IOException {
        DataOutputStream dataOutputStream = null;
        try {
            dataOutputStream = new DataOutputStream(this.A00.A04());
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(downloadActionArr.length);
            for (DownloadAction downloadAction : downloadActionArr) {
                DownloadAction.A07(downloadAction, dataOutputStream);
            }
            this.A00.A06(dataOutputStream);
            C0560Iy.A0a(null);
        } catch (Throwable th) {
            C0560Iy.A0a(dataOutputStream);
            throw th;
        }
    }

    public final DownloadAction[] A03(DownloadAction.Deserializer... deserializerArr) throws IOException {
        if (!this.A01.exists()) {
            return new DownloadAction[0];
        }
        try {
            InputStream inputStreamA03 = this.A00.A03();
            DataInputStream dataInputStream = new DataInputStream(inputStreamA03);
            int i = dataInputStream.readInt();
            if (i <= 0) {
                int i2 = dataInputStream.readInt();
                DownloadAction[] downloadActionArr = new DownloadAction[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    downloadActionArr[i3] = DownloadAction.A04(deserializerArr, dataInputStream);
                }
                C0560Iy.A0a(inputStreamA03);
                return downloadActionArr;
            }
            throw new IOException(A00(0, 33, 25) + i);
        } catch (Throwable th) {
            C0560Iy.A0a(null);
            throw th;
        }
    }
}

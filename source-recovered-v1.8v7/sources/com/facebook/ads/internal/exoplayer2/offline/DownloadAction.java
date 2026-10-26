package com.facebook.ads.internal.exoplayer2.offline;

import android.net.Uri;
import android.support.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0443Ef;
import com.facebook.ads.redexgen.X.EJ;
import com.facebook.ads.redexgen.X.InterfaceC0442Ee;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class DownloadAction {
    public static byte[] A05;
    public final int A00;
    public final Uri A01;
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    static {
        A06();
    }

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 119);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A05 = new byte[]{5, -7, 40, 73, -6, 62, 63, 77, 63, 76, 67, 59, 70, 67, 84, 63, 76, -6, 64, 73, 79, 72, 62, -6, 64, 73, 76, 20};
    }

    public abstract InterfaceC0442Ee A08(C0443Ef c0443Ef);

    public abstract void A09(DataOutputStream dataOutputStream) throws IOException;

    public static abstract class Deserializer {
        public final int A00;
        public final String A01;

        public abstract DownloadAction A01(int i, DataInputStream dataInputStream) throws IOException;

        public Deserializer(String str, int i) {
            this.A01 = str;
            this.A00 = i;
        }
    }

    public DownloadAction(String str, int i, Uri uri, boolean z, @Nullable byte[] bArr) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = uri;
        this.A03 = z;
        this.A04 = bArr == null ? new byte[0] : bArr;
    }

    public static DownloadAction A04(Deserializer[] deserializerArr, InputStream inputStream) throws IOException {
        Deserializer deserializer = null;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String utf = dataInputStream.readUTF();
        int i = dataInputStream.readInt();
        int length = deserializerArr.length;
        int i2 = 0;
        int version = 2;
        while (true) {
            switch (version) {
                case 2:
                    if (i2 >= length) {
                        version = 7;
                        break;
                    } else {
                        version = 3;
                        break;
                    }
                case 3:
                    deserializerArr = deserializerArr;
                    utf = utf;
                    deserializer = deserializerArr[i2];
                    if (!utf.equals(deserializer.A01)) {
                        version = 6;
                        break;
                    } else {
                        version = 4;
                        break;
                    }
                case 4:
                    deserializer = deserializer;
                    if (deserializer.A00 < i) {
                        version = 6;
                        break;
                    } else {
                        version = 5;
                        break;
                    }
                case 5:
                    return deserializer.A01(i, dataInputStream);
                case 6:
                    i2++;
                    version = 2;
                    break;
                case 7:
                    throw new EJ(A05(2, 26, 99) + utf + A05(0, 2, 98) + i);
            }
        }
    }

    public static void A07(DownloadAction downloadAction, OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(downloadAction.A02);
        dataOutputStream.writeInt(downloadAction.A00);
        downloadAction.A09(dataOutputStream);
        dataOutputStream.flush();
    }

    public boolean A0A(DownloadAction downloadAction) {
        return this.A01.equals(downloadAction.A01);
    }

    public boolean equals(@Nullable Object obj) {
        DownloadAction downloadAction = this;
        DownloadAction downloadAction2 = null;
        boolean z = false;
        char c2 = obj != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    downloadAction = downloadAction;
                    obj = obj;
                    if (downloadAction.getClass() == obj.getClass()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    downloadAction = downloadAction;
                    obj = obj;
                    downloadAction2 = (DownloadAction) obj;
                    if (!downloadAction.A02.equals(downloadAction2.A02)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    downloadAction = downloadAction;
                    downloadAction2 = downloadAction2;
                    if (downloadAction.A00 != downloadAction2.A00) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    downloadAction = downloadAction;
                    downloadAction2 = downloadAction2;
                    if (!downloadAction.A01.equals(downloadAction2.A01)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    downloadAction = downloadAction;
                    downloadAction2 = downloadAction2;
                    if (downloadAction.A03 != downloadAction2.A03) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    downloadAction = downloadAction;
                    downloadAction2 = downloadAction2;
                    if (!Arrays.equals(downloadAction.A04, downloadAction2.A04)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    z = true;
                    c2 = '\n';
                    break;
                case '\n':
                    return z;
            }
        }
    }

    public int hashCode() {
        return (((this.A01.hashCode() * 31) + (this.A03 ? 1 : 0)) * 31) + Arrays.hashCode(this.A04);
    }
}

package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.a3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0996a3 extends DownloadAction.Deserializer {
    public C0996a3(String str, int i) {
        super(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction.Deserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0997a4 A01(int i, DataInputStream dataInputStream) throws IOException {
        String utf = null;
        Uri uri = Uri.parse(dataInputStream.readUTF());
        boolean z = dataInputStream.readBoolean();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        char c2 = dataInputStream.readBoolean() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    dataInputStream = dataInputStream;
                    utf = dataInputStream.readUTF();
                    c2 = 3;
                    break;
                case 3:
                    return new C0997a4(uri, z, bArr, utf);
                case 4:
                    utf = null;
                    c2 = 3;
                    break;
            }
        }
    }
}

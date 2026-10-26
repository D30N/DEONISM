package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Bu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0395Bu extends AbstractC1000a7<GN> {
    public C0395Bu(String str, int i) {
        super(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1000a7
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final GN A03(DataInputStream dataInputStream) throws IOException {
        return new GN(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readInt());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1000a7
    public final DownloadAction A02(Uri uri, boolean z, byte[] bArr, List<GN> list) {
        return new C0391Bo(uri, z, bArr, list);
    }
}

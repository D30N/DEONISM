package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.a7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1000a7<K> extends DownloadAction.Deserializer {
    public abstract DownloadAction A02(Uri uri, boolean z, byte[] bArr, List<K> list);

    public abstract K A03(DataInputStream dataInputStream) throws IOException;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a7 != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloadAction$SegmentDownloadActionDeserializer<K> */
    public AbstractC1000a7(String str, int i) {
        super(str, i);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a7 != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloadAction$SegmentDownloadActionDeserializer<K> */
    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction.Deserializer
    public final DownloadAction A01(int i, DataInputStream dataInputStream) throws IOException {
        AbstractC1000a7<K> abstractC1000a7 = this;
        Uri uri = Uri.parse(dataInputStream.readUTF());
        boolean z = dataInputStream.readBoolean();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        int i2 = dataInputStream.readInt();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 2;
        while (true) {
            switch (i4) {
                case 2:
                    if (i3 >= i2) {
                        i4 = 4;
                        break;
                    } else {
                        i4 = 3;
                        break;
                    }
                case 3:
                    abstractC1000a7 = abstractC1000a7;
                    dataInputStream = dataInputStream;
                    arrayList = arrayList;
                    arrayList.add(abstractC1000a7.A03(dataInputStream));
                    i3++;
                    i4 = 2;
                    break;
                case 4:
                    return abstractC1000a7.A02(uri, z, bArr, arrayList);
            }
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.support.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public abstract class a8<K extends Comparable<K>> extends DownloadAction {
    public final List<K> A00;

    public abstract void A0B(DataOutputStream dataOutputStream, K k) throws IOException;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a8 != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloadAction<K extends java.lang.Comparable<K>> */
    public a8(String str, int i, Uri uri, boolean z, @Nullable byte[] bArr, List<K> list) {
        super(str, i, uri, z, bArr);
        if (z) {
            IJ.A03(list.isEmpty());
            this.A00 = Collections.emptyList();
        } else {
            List<K> keys = new ArrayList<>(list);
            Collections.sort(keys);
            this.A00 = Collections.unmodifiableList(keys);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a8 != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloadAction<K extends java.lang.Comparable<K>> */
    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final void A09(DataOutputStream dataOutputStream) throws IOException {
        a8<K> a8Var = this;
        dataOutputStream.writeUTF(a8Var.A01.toString());
        dataOutputStream.writeBoolean(a8Var.A03);
        dataOutputStream.writeInt(a8Var.A04.length);
        dataOutputStream.write(a8Var.A04);
        dataOutputStream.writeInt(a8Var.A00.size());
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    a8Var = a8Var;
                    if (i >= a8Var.A00.size()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    a8Var = a8Var;
                    dataOutputStream = dataOutputStream;
                    a8Var.A0B(dataOutputStream, a8Var.A00.get(i));
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a8 != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloadAction<?> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a8 != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloadAction<K extends java.lang.Comparable<K>> */
    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final boolean equals(@Nullable Object obj) {
        a8<K> a8Var = this;
        char c2 = a8Var == obj ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return true;
                case 3:
                    a8Var = a8Var;
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
                    return a8Var.A00.equals(((a8) obj).A00);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a8 != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloadAction<K extends java.lang.Comparable<K>> */
    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final int hashCode() {
        return (super.hashCode() * 31) + this.A00.hashCode();
    }
}

package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class BZ extends YV<BX, BP, GZ> implements InterfaceC1056b2 {
    public static byte[] A01;
    public final String A00;

    static {
        A0J();
    }

    public static String A0I(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 78);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0J() {
        A01 = new byte[]{18, 43, 34, 53, 45, 34, 32, 49, 34, 33, -35, 33, 34, 32, 44, 33, 34, -35, 34, 47, 47, 44, 47};
    }

    public abstract GY A0b(byte[] bArr, int i, boolean z) throws GZ;

    public BZ(String str) {
        super(new BX[2], new BP[2]);
        this.A00 = str;
        A0Y(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.YV
    /* renamed from: A0E, reason: merged with bridge method [inline-methods] */
    public final GZ A0W(BX bx, BP bp, boolean z) {
        try {
            ByteBuffer byteBuffer = bx.A01;
            bp.A09(((YT) bx).A00, A0b(byteBuffer.array(), byteBuffer.limit(), z), bx.A00);
            bp.A01(RecyclerView.UNDEFINED_DURATION);
            return null;
        } catch (GZ e) {
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.YV
    /* renamed from: A0F, reason: merged with bridge method [inline-methods] */
    public final GZ A0X(Throwable th) {
        return new GZ(A0I(0, 23, 111), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.YV
    /* renamed from: A0G, reason: merged with bridge method [inline-methods] */
    public final BX A0T() {
        return new BX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.YV
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final BP A0V() {
        return new BP(this) { // from class: com.facebook.ads.redexgen.X.3F
            public final BZ A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.X.BP
            public final void A08() {
                this.A00.A0a(this);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.X.YV
    /* renamed from: A0c, reason: merged with bridge method [inline-methods] */
    public final void A0a(BP bp) {
        super.A0a(bp);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1056b2
    public final void ADA(long j) {
    }
}

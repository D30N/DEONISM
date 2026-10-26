package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02897i extends AbstractC0604Ks {
    public static byte[] A01;
    public final /* synthetic */ C02887h A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 7);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{8, 28, 13, 0, 6};
    }

    public C02897i(C02887h c02887h) {
        this.A00 = c02887h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9C
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(L4 l4) {
        C02897i c02897i = this;
        char c2 = c02897i.A00.A00 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c02897i = c02897i;
                    if (c02897i.A00.A00.get() != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c02897i = c02897i;
                    c02897i.A00.A00 = new WeakReference(new PL(c02897i));
                    c2 = 4;
                    break;
                case 4:
                    C02897i c02897i2 = c02897i;
                    ((AudioManager) c02897i2.A00.getContext().getApplicationContext().getSystemService(A00(0, 5, 110))).requestAudioFocus((AudioManager.OnAudioFocusChangeListener) c02897i2.A00.A00.get(), 3, 1);
                    return;
            }
        }
    }
}

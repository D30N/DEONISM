package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class NR implements View.OnClickListener {
    public static byte[] A02;
    public final /* synthetic */ XI A00;
    public final /* synthetic */ NT A01;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 39);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{41, 38, 44, 58, 39, 33, 44, 102, 33, 38, 60, 45, 38, 60, 102, 41, 43, 60, 33, 39, 38, 102, 30, 1, 13, 31, 64, 67, 78, 84, 85, 27, 67, 77, 64, 79, 74};
    }

    public NR(NT nt, XI xi) {
        this.A01 = nt;
        this.A00 = xi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0601Ko.A02(this)) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.A01.A04) && !A00(26, 11, 6).equals(this.A01.A04)) {
                Intent intent = new Intent(A00(0, 26, 111), Uri.parse(this.A01.A04));
                intent.addFlags(268435456);
                LA.A0B(this.A00, intent);
            }
        } catch (Throwable th) {
            C0601Ko.A00(th, this);
        }
    }
}

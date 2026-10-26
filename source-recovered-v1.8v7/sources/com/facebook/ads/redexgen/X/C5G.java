package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5G, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C5G extends AsyncTask<C5I, Void, Drawable> {
    public static byte[] A03;
    public final C5H A00;
    public final XI A01;
    public final boolean A02;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 52);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A03 = new byte[]{105, 107, 96, 107, 124, 103, 109};
    }

    public C5G(XI xi, C5H c5h, boolean z) {
        this.A01 = xi;
        this.A00 = c5h;
        this.A02 = z;
    }

    public /* synthetic */ C5G(XI xi, C5H c5h, boolean z, C0828To c0828To) {
        this(xi, c5h, z);
    }

    @SuppressLint({"CatchGeneralException"})
    private final Drawable A00(C5I... c5iArr) throws Throwable {
        if (!C0601Ko.A02(this) && c5iArr != null) {
            try {
                if (c5iArr.length >= 1) {
                    String str = c5iArr[0].A01;
                    String str2 = c5iArr[0].A00;
                    Bitmap bitmapA0I = null;
                    try {
                        bitmapA0I = new C7C(this.A01).A0I(str, -1, -1);
                    } catch (Throwable th) {
                        this.A01.A04().A83(A01(0, 7, 58), C03008a.A1C, new C03018b(th));
                    }
                    if (bitmapA0I != null) {
                        return C1141cR.A05(this.A01, bitmapA0I, this.A02, str2);
                    }
                    return null;
                }
            } catch (Throwable th2) {
                C0601Ko.A00(th2, this);
                return null;
            }
        }
        return null;
    }

    private final void A03(Drawable drawable) throws Throwable {
        C5G c5g = this;
        C5G c5g2 = null;
        char c2 = C0601Ko.A02(c5g) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c5g = c5g;
                    c5g2 = c5g;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        c5g2 = c5g2;
                        c5g2.A00.A9i(drawable);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, c5g2);
                        return;
                    }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.graphics.drawable.Drawable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.graphics.drawable.Drawable, java.lang.Object] */
    @Override // android.os.AsyncTask
    @SuppressLint({"CatchGeneralException"})
    public final /* bridge */ /* synthetic */ Drawable doInBackground(C5I[] c5iArr) throws Throwable {
        C5G c5g = this;
        C5G c5g2 = null;
        char c2 = C0601Ko.A02(c5g) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (Object) 0;
                case 3:
                    c5g = c5g;
                    c5g2 = c5g;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        return c5g2.A00(c5iArr);
                    } catch (Throwable th) {
                        C0601Ko.A00(th, c5g2);
                        return (Object) 0;
                    }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) throws Throwable {
        C5G c5g = this;
        C5G c5g2 = null;
        char c2 = C0601Ko.A02(c5g) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c5g = c5g;
                    c5g2 = c5g;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        c5g2.A03(drawable);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, c5g2);
                        return;
                    }
            }
        }
    }
}

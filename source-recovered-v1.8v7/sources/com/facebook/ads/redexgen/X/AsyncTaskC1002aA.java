package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC1002aA extends AsyncTask<String, Void, Bitmap[]> implements C8A {
    public static byte[] A0A;
    public int A00;
    public int A01;
    public InterfaceC0675Nn A02;
    public boolean A03;
    public final int A04;
    public final int A05;

    @Nullable
    public final WeakReference<C0673Nl> A06;
    public final WeakReference<XI> A07;

    @Nullable
    public final WeakReference<ImageView> A08;

    @Nullable
    public final WeakReference<ViewGroup> A09;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 72);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A0A = new byte[]{-68, -70, -61, -70, -57, -66, -72};
    }

    public AsyncTaskC1002aA(ViewGroup viewGroup, int i, int i2, XI xi) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(xi);
        this.A06 = null;
        this.A08 = null;
        this.A09 = new WeakReference<>(viewGroup);
        this.A04 = i;
        this.A05 = i2;
    }

    public AsyncTaskC1002aA(ViewGroup viewGroup, XI xi) {
        this(viewGroup, 12, 16, xi);
    }

    public AsyncTaskC1002aA(ImageView imageView, XI xi) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(xi);
        this.A06 = null;
        this.A08 = new WeakReference<>(imageView);
        this.A09 = null;
        this.A04 = 0;
        this.A05 = 1;
    }

    public AsyncTaskC1002aA(C0673Nl c0673Nl, XI xi) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(xi);
        this.A06 = new WeakReference<>(c0673Nl);
        this.A08 = null;
        this.A09 = null;
        this.A04 = 12;
        this.A05 = 16;
    }

    private final void A02(Bitmap[] bitmapArr) throws Throwable {
        C0673Nl c0673Nl;
        if (C0601Ko.A02(this)) {
            return;
        }
        try {
            if (this.A08 != null) {
                ImageView imageView = this.A08.get();
                if (bitmapArr[1] != null && !this.A03 && this.A04 != 0 && imageView != null) {
                    imageView.setImageBitmap(bitmapArr[1]);
                    return;
                } else if (imageView != null) {
                    imageView.setImageBitmap(bitmapArr[0]);
                }
            }
            if (this.A06 != null && (c0673Nl = this.A06.get()) != null) {
                c0673Nl.setImage(bitmapArr[0], bitmapArr[1]);
            }
            if (this.A09 != null && this.A09.get() != null && bitmapArr[1] != null) {
                C0635Ly.A0W(this.A09.get(), new BitmapDrawable(this.A07.get().getResources(), bitmapArr[1]));
            }
            if (this.A02 != null) {
                this.A02.A9h(bitmapArr[0] != null);
            }
        } catch (Throwable th) {
            C0601Ko.A00(th, this);
        }
    }

    private final Bitmap[] A03(String... strArr) throws Throwable {
        if (C0601Ko.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            Bitmap bitmapA0I = null;
            Bitmap bitmapA01 = null;
            XI xi = this.A07.get();
            if (xi == null) {
                return new Bitmap[]{null, null};
            }
            try {
                bitmapA0I = new C7C(xi).A0I(str, this.A00, this.A01);
                if (bitmapA0I != null && !this.A03) {
                    bitmapA01 = M5.A01(xi, bitmapA0I, this.A04, this.A05);
                }
            } catch (Throwable th) {
                xi.A04().A83(A00(0, 7, 13), C03008a.A1C, new C03018b(th));
            }
            return new Bitmap[]{bitmapA0I, bitmapA01};
        } catch (Throwable th2) {
            C0601Ko.A00(th2, this);
            return null;
        }
    }

    public final AsyncTaskC1002aA A04() {
        this.A00 = -1;
        this.A01 = -1;
        return this;
    }

    public final AsyncTaskC1002aA A05(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        return this;
    }

    public final AsyncTaskC1002aA A06(InterfaceC0675Nn interfaceC0675Nn) {
        this.A02 = interfaceC0675Nn;
        return this;
    }

    public final void A07(String str) {
        AsyncTaskC1002aA asyncTaskC1002aA = this;
        InterfaceC0675Nn interfaceC0675Nn = null;
        char c2 = TextUtils.isEmpty(str) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    asyncTaskC1002aA = asyncTaskC1002aA;
                    interfaceC0675Nn = asyncTaskC1002aA.A02;
                    if (interfaceC0675Nn == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    interfaceC0675Nn = interfaceC0675Nn;
                    interfaceC0675Nn.A9h(false);
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    asyncTaskC1002aA.executeOnExecutor(M3.A05, str);
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C8A
    @Nullable
    public final XI A5G() {
        return this.A07.get();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.graphics.Bitmap[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.graphics.Bitmap[], java.lang.Object] */
    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Bitmap[] doInBackground(String[] strArr) throws Throwable {
        AsyncTaskC1002aA asyncTaskC1002aA = this;
        AsyncTaskC1002aA asyncTaskC1002aA2 = null;
        char c2 = C0601Ko.A02(asyncTaskC1002aA) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (Object) 0;
                case 3:
                    asyncTaskC1002aA = asyncTaskC1002aA;
                    asyncTaskC1002aA2 = asyncTaskC1002aA;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        return asyncTaskC1002aA2.A03(strArr);
                    } catch (Throwable th) {
                        C0601Ko.A00(th, asyncTaskC1002aA2);
                        return (Object) 0;
                    }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Bitmap[] bitmapArr) throws Throwable {
        AsyncTaskC1002aA asyncTaskC1002aA = this;
        AsyncTaskC1002aA asyncTaskC1002aA2 = null;
        char c2 = C0601Ko.A02(asyncTaskC1002aA) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    asyncTaskC1002aA = asyncTaskC1002aA;
                    asyncTaskC1002aA2 = asyncTaskC1002aA;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        asyncTaskC1002aA2.A02(bitmapArr);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, asyncTaskC1002aA2);
                        return;
                    }
            }
        }
    }
}

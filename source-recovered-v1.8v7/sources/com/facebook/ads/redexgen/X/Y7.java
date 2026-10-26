package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Y7 implements AW {
    public static byte[] A04;
    public final int A00;
    public final long A01;
    public final Context A02;

    @Nullable
    public final InterfaceC0397Bw<C0948Ye> A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 46);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A04 = new byte[]{32, 44, 46, 109, 37, 34, 32, 38, 33, 44, 44, 40, 109, 34, 39, 48, 109, 42, 45, 55, 38, 49, 45, 34, 47, 109, 38, 59, 44, 51, 47, 34, 58, 38, 49, 113, 109, 38, 59, 55, 109, 37, 47, 34, 32, 109, 15, 42, 33, 37, 47, 34, 32, 2, 54, 39, 42, 44, 17, 38, 45, 39, 38, 49, 38, 49, 61, 30, 16, 21, 20, 21, 81, 55, 23, 28, 1, 20, 22, 48, 4, 21, 24, 30, 35, 20, 31, 21, 20, 3, 20, 3, 95, 65, 118, 118, 107, 118, 36, 109, 106, 119, 112, 101, 106, 112, 109, 101, 112, 109, 106, 99, 36, 66, 72, 69, 71, 36, 97, 124, 112, 97, 106, 119, 109, 107, 106, 63, 28, 18, 23, 22, 23, 83, 63, 26, 17, 21, 31, 18, 16, 50, 6, 23, 26, 28, 33, 22, 29, 23, 22, 1, 22, 1, 93, 79, 108, 98, 103, 102, 103, 35, 79, 106, 97, 117, 115, 123, 85, 106, 103, 102, 108, 81, 102, 109, 103, 102, 113, 102, 113, 45, 50, 19, 16, 23, 3, 26, 2, 36, 19, 24, 18, 19, 4, 19, 4, 5, 48, 23, 21, 2, 25, 4, 15, 39, 43, 41, 106, 34, 37, 39, 33, 38, 43, 43, 47, 106, 37, 32, 55, 106, 45, 42, 48, 33, 54, 42, 37, 40, 106, 33, 60, 43, 52, 40, 37, 61, 33, 54, 118, 106, 33, 60, 48, 106, 50, 52, 125, 106, 8, 45, 38, 50, 52, 60, 18, 45, 32, 33, 43, 22, 33, 42, 32, 33, 54, 33, 54, 82, 94, 92, 31, 87, 80, 82, 84, 83, 94, 94, 90, 31, 80, 85, 66, 31, 88, 95, 69, 84, 67, 95, 80, 93, 31, 84, 73, 94, 65, 93, 80, 72, 84, 67, 3, 31, 84, 73, 69, 31, 94, 65, 68, 66, 31, 125, 88, 83, 94, 65, 68, 66, 112, 68, 85, 88, 94, 99, 84, 95, 85, 84, 67, 84, 67, 32, 23, 23, 10, 23, 69, 12, 11, 22, 17, 4, 11, 17, 12, 4, 17, 12, 11, 2, 69, 35, 35, 8, 21, 0, 2, 69, 0, 29, 17, 0, 11, 22, 12, 10, 11, 114, 126, 124, 63, 119, 112, 114, 116, 115, 126, 126, 122, 63, 112, 117, 98, 63, 120, Byte.MAX_VALUE, 101, 116, 99, Byte.MAX_VALUE, 112, 125, 63, 116, 105, 126, 97, 125, 112, 104, 116, 99, 35, 63, 116, 105, 101, 63, 119, 119, 124, 97, 116, 118, 63, 87, 119, 124, 97, 116, 118, 80, 100, 117, 120, 126, 67, 116, Byte.MAX_VALUE, 117, 116, 99, 116, 99, 110, 89, 89, 68, 89, 11, 66, 69, 88, 95, 74, 69, 95, 66, 74, 95, 66, 69, 76, 11, 100, 91, 94, 88, 11, 78, 83, 95, 78, 69, 88, 66, 68, 69, 94, 105, 105, 116, 105, 59, 114, 117, 104, 111, 122, 117, 111, 114, 122, 111, 114, 117, 124, 59, 77, 75, 34, 59, 126, 99, 111, 126, 117, 104, 114, 116, 117, 70, 101, 107, 110, 111, 110, 42, 70, 99, 104, 101, 122, Byte.MAX_VALUE, 121, 75, Byte.MAX_VALUE, 110, 99, 101, 88, 111, 100, 110, 111, 120, 111, 120, 36};
    }

    public Y7(Context context) {
        this(context, 0);
    }

    public Y7(Context context, int i) {
        this(context, null, i, 5000L);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bw != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    @Deprecated
    public Y7(Context context, @Nullable InterfaceC0397Bw<C0948Ye> interfaceC0397Bw, int i, long j) {
        this.A02 = context;
        this.A00 = i;
        this.A01 = j;
        this.A03 = interfaceC0397Bw;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bw != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    private final void A02(Context context, @Nullable InterfaceC0397Bw<C0948Ye> interfaceC0397Bw, long j, Handler handler, JM jm, int i, ArrayList<YC> arrayList) {
        arrayList.add(new C01561z(context, Dg.A00, j, interfaceC0397Bw, false, handler, jm, 50));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                try {
                    arrayList.add(size, (YC) Class.forName(A00(205, 64, 106)).getConstructor(Boolean.TYPE, Long.TYPE, Handler.class, JM.class, Integer.TYPE).newInstance(true, Long.valueOf(j), handler, jm, 50));
                    Log.i(A00(182, 23, 88), A00(155, 27, 45));
                } catch (Exception e) {
                    e = e;
                    throw new RuntimeException(A00(472, 33, 53), e);
                }
            } catch (ClassNotFoundException unused) {
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bw != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    private final void A03(Context context, @Nullable InterfaceC0397Bw<C0948Ye> interfaceC0397Bw, InterfaceC0372Av[] interfaceC0372AvArr, Handler handler, B3 b3, int i, ArrayList<YC> arrayList) {
        int i2;
        int i3;
        YC renderer;
        YC renderer2;
        String strA00 = A00(182, 23, 88);
        arrayList.add(new AnonymousClass28(context, Dg.A00, interfaceC0397Bw, false, handler, b3, C0365Ao.A00(context), interfaceC0372AvArr));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            i2 = size + 1;
        } catch (ClassNotFoundException unused) {
            i2 = size;
        } catch (Exception e) {
            e = e;
        }
        try {
            arrayList.add(size, (YC) Class.forName(A00(269, 66, 31)).getConstructor(Handler.class, B3.class, InterfaceC0372Av[].class).newInstance(handler, b3, interfaceC0372AvArr));
            Log.i(strA00, A00(505, 28, 36));
        } catch (ClassNotFoundException unused2) {
        } catch (Exception e2) {
            e = e2;
            throw new RuntimeException(A00(438, 34, 5), e);
        }
        try {
            renderer2 = (YC) Class.forName(A00(0, 66, 109)).getConstructor(Handler.class, B3.class, InterfaceC0372Av[].class).newInstance(handler, b3, interfaceC0372AvArr);
            i3 = i2 + 1;
        } catch (ClassNotFoundException unused3) {
            i3 = i2;
        } catch (Exception e3) {
            e = e3;
        }
        try {
            arrayList.add(i2, renderer2);
            Log.i(strA00, A00(127, 28, 93));
        } catch (ClassNotFoundException unused4) {
        } catch (Exception e4) {
            e = e4;
            throw new RuntimeException(A00(93, 34, 42), e);
        }
        try {
            try {
                renderer = (YC) Class.forName(A00(371, 67, 63)).getConstructor(Handler.class, B3.class, InterfaceC0372Av[].class).newInstance(handler, b3, interfaceC0372AvArr);
            } catch (Exception e5) {
                e = e5;
            }
            try {
                arrayList.add(i3, renderer);
                Log.i(strA00, A00(66, 27, 95));
            } catch (Exception e6) {
                e = e6;
                throw new RuntimeException(A00(335, 36, 75), e);
            }
        } catch (ClassNotFoundException unused5) {
        }
    }

    private final void A04(Context context, InterfaceC0431Dt interfaceC0431Dt, Looper looper, int i, ArrayList<YC> arrayList) {
        arrayList.add(new C3J(interfaceC0431Dt, looper));
    }

    private final void A05(Context context, InterfaceC0487Gb interfaceC0487Gb, Looper looper, int i, ArrayList<YC> arrayList) {
        arrayList.add(new AnonymousClass33(interfaceC0487Gb, looper));
    }

    private final InterfaceC0372Av[] A06() {
        return new InterfaceC0372Av[0];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bw != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    @Override // com.facebook.ads.redexgen.X.AW
    public final YC[] A4Q(Handler handler, JM jm, B3 b3, InterfaceC0487Gb interfaceC0487Gb, InterfaceC0431Dt interfaceC0431Dt, @Nullable InterfaceC0397Bw<C0948Ye> interfaceC0397Bw) {
        InterfaceC0397Bw<C0948Ye> interfaceC0397Bw2 = interfaceC0397Bw;
        InterfaceC0397Bw<C0948Ye> interfaceC0397Bw3 = null;
        Y7 y7 = this;
        char c2 = interfaceC0397Bw2 == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    y7 = y7;
                    interfaceC0397Bw3 = y7.A03;
                    c2 = 3;
                    break;
                case 3:
                    Y7 y72 = this;
                    Handler handler2 = handler;
                    Y7 y73 = y7;
                    InterfaceC0397Bw<C0948Ye> interfaceC0397Bw4 = interfaceC0397Bw3;
                    ArrayList<YC> arrayList = new ArrayList<>();
                    y72.A02(y73.A02, interfaceC0397Bw4, y73.A01, handler2, jm, y73.A00, arrayList);
                    y72.A03(y73.A02, interfaceC0397Bw4, y72.A06(), handler2, b3, y73.A00, arrayList);
                    y72.A05(y73.A02, interfaceC0487Gb, handler2.getLooper(), y73.A00, arrayList);
                    y72.A04(y73.A02, interfaceC0431Dt, handler2.getLooper(), y73.A00, arrayList);
                    return (YC[]) arrayList.toArray(new YC[arrayList.size()]);
                case 4:
                    interfaceC0397Bw2 = interfaceC0397Bw2;
                    interfaceC0397Bw3 = interfaceC0397Bw2;
                    c2 = 3;
                    break;
            }
        }
    }
}

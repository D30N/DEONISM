package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import com.facebook.ads.internal.bridge.gms.AdvertisingId;
import d.b.a.b.k;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02385g {
    public static byte[] A00;
    public static final String A01;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 83);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A00 = new byte[]{48, 60, 62, 125, 52, 60, 60, 52, 63, 54, 125, 50, 61, 55, 33, 60, 58, 55, 125, 52, 62, 32, 125, 50, 55, 32, 125, 58, 55, 54, 61, 39, 58, 53, 58, 54, 33, 125, 18, 55, 37, 54, 33, 39, 58, 32, 58, 61, 52, 26, 55, 16, 63, 58, 54, 61, 39, 106, 112, 68, 108, 108, 100, 111, 102, 83, 111, 98, 122, 80, 102, 113, 117, 106, 96, 102, 112, 66, 117, 98, 106, 111, 98, 97, 111, 102, 32, 44, 46, 109, 36, 44, 44, 36, 47, 38, 109, 34, 45, 39, 49, 44, 42, 39, 109, 36, 46, 48, 98, 64, 79, 79, 78, 85, 1, 70, 68, 85, 1, 64, 69, 87, 68, 83, 85, 72, 82, 72, 79, 70, 1, 72, 79, 71, 78, 1, 78, 79, 1, 76, 64, 72, 79, 1, 85, 73, 83, 68, 64, 69, 15, 108, 118, 73, 108, 104, 108, 113, 68, 97, 81, 119, 100, 102, 110, 108, 107, 98, 64, 107, 100, 103, 105, 96, 97, 30, 28, 13, 56, 29, 15, 28, 11, 13, 16, 10, 16, 23, 30, 48, 29, 48, 23, 31, 22, 42, 40, 35, 40, 63, 36, 46, 9, 5, 7, 68, 13, 5, 5, 13, 6, 15, 68, 11, 4, 14, 24, 5, 3, 14, 68, 13, 7, 25, 68, 9, 5, 7, 7, 5, 4, 68, 45, 5, 5, 13, 6, 15, 58, 6, 11, 19, 57, 15, 24, 28, 3, 9, 15, 25, 63, 30, 3, 6, 99, 97, 112, 77, 96, 17, 29, 31, 92, 21, 29, 29, 21, 30, 23, 92, 19, 28, 22, 0, 29, 27, 22, 92, 21, 31, 1, 92, 19, 22, 1, 92, 27, 22, 23, 28, 6, 27, 20, 27, 23, 0, 92, 1, 23, 0, 4, 27, 17, 23, 92, 33, 38, 51, 32, 38};
    }

    static {
        A05();
        A01 = C5Y.class.getSimpleName();
    }

    public static C5Y A00(C8C c8c) throws ClassNotFoundException {
        C5Y c5yA03 = null;
        char c2 = Looper.myLooper() != Looper.getMainLooper() ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    c8c = c8c;
                    c5yA03 = A01(c8c);
                    if (c5yA03 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c5yA03 = c5yA03;
                    if (!TextUtils.isEmpty(c5yA03.A03())) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c8c = c8c;
                    c5yA03 = A02(c8c);
                    c2 = 5;
                    break;
                case 5:
                    c5yA03 = c5yA03;
                    if (c5yA03 == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c5yA03 = c5yA03;
                    if (!TextUtils.isEmpty(c5yA03.A03())) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c8c = c8c;
                    c5yA03 = A03(c8c);
                    c2 = '\b';
                    break;
                case '\b':
                    return c5yA03;
                case '\t':
                    throw new IllegalStateException(A04(108, 43, k.AppCompatTheme_viewInflaterClass));
            }
        }
    }

    @VisibleForTesting
    @Nullable
    public static C5Y A01(C8C c8c) {
        AdvertisingId advertisingIdInfoDirectly = AdvertisingId.getAdvertisingIdInfoDirectly(c8c);
        if (advertisingIdInfoDirectly != null) {
            return new C5Y(advertisingIdInfoDirectly.getId(), advertisingIdInfoDirectly.isLimitAdTracking(), C5X.A02);
        }
        return null;
    }

    @VisibleForTesting
    @Nullable
    public static C5Y A02(C8C c8c) throws ClassNotFoundException {
        Object objA00;
        Method methodA02;
        Object objA002;
        Method methodA022 = C02395h.A02(A04(202, 52, 57), A04(57, 29, 80), Context.class);
        if (methodA022 == null || (objA00 = C02395h.A00(null, methodA022, c8c)) == null || ((Integer) objA00).intValue() != 0 || (methodA02 = C02395h.A02(A04(0, 57, 0), A04(175, 20, 42), Context.class)) == null || (objA002 = C02395h.A00(null, methodA02, c8c)) == null) {
            return null;
        }
        Method methodA01 = C02395h.A01(objA002.getClass(), A04(254, 5, 87), new Class[0]);
        Method methodA012 = C02395h.A01(objA002.getClass(), A04(151, 24, 86), new Class[0]);
        if (methodA01 == null || methodA012 == null) {
            return null;
        }
        String id = (String) C02395h.A00(objA002, methodA01, new Object[0]);
        Boolean bool = (Boolean) C02395h.A00(objA002, methodA012, new Object[0]);
        if (id == null) {
            return null;
        }
        return new C5Y(id, bool != null && bool.booleanValue(), C5X.A06);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo] */
    @VisibleForTesting
    @SuppressLint({"CatchGeneralException"})
    public static C5Y A03(C8C c8c) {
        ServiceConnectionC02375f serviceConnectionC02375f = new ServiceConnectionC02375f();
        Intent intent = new Intent(A04(259, 51, 33));
        intent.setPackage(A04(86, 22, 16));
        if (c8c.bindService(intent, serviceConnectionC02375f, 1)) {
            try {
                final IBinder iBinderA02 = serviceConnectionC02375f.A02();
                ?? r1 = new IInterface(iBinderA02) { // from class: com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo
                    public static byte[] A01;
                    public IBinder A00;

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
                                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 54);
                                    i4++;
                                    c2 = 2;
                                    break;
                                case 4:
                                    return new String(bArrCopyOfRange);
                            }
                        }
                    }

                    public static void A01() {
                        A01 = new byte[]{53, 57, 59, 120, 49, 57, 57, 49, 58, 51, 120, 55, 56, 50, 36, 57, 63, 50, 120, 49, 59, 37, 120, 55, 50, 37, 120, 63, 50, 51, 56, 34, 63, 48, 63, 51, 36, 120, 63, 56, 34, 51, 36, 56, 55, 58, 120, 31, 23, 50, 32, 51, 36, 34, 63, 37, 63, 56, 49, 31, 50, 5, 51, 36, 32, 63, 53, 51};
                    }

                    {
                        this.A00 = iBinderA02;
                    }

                    public final String A02() throws RemoteException {
                        Parcel reply = Parcel.obtain();
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            reply.writeInterfaceToken(A00(0, 68, 96));
                            this.A00.transact(1, reply, parcelObtain, 0);
                            parcelObtain.readException();
                            return parcelObtain.readString();
                        } finally {
                            parcelObtain.recycle();
                            reply.recycle();
                        }
                    }

                    public final boolean A03() throws RemoteException {
                        boolean z = false;
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        char c2 = 2;
                        while (true) {
                            switch (c2) {
                                case 2:
                                    try {
                                        parcelObtain.writeInterfaceToken(A00(0, 68, 96));
                                        z = true;
                                        parcelObtain.writeInt(1);
                                        this.A00.transact(2, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        if (parcelObtain2.readInt() == 0) {
                                            c2 = '\n';
                                            break;
                                        } else {
                                            c2 = 11;
                                            break;
                                        }
                                    } catch (Throwable th) {
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                case '\n':
                                    z = false;
                                    c2 = 11;
                                    break;
                                case 11:
                                    parcelObtain2.recycle();
                                    parcelObtain.recycle();
                                    return z;
                            }
                        }
                    }

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.A00;
                    }
                };
                return new C5Y(r1.A02(), r1.A03(), C5X.A07);
            } catch (Throwable th) {
                try {
                    c8c.A04().A83(A04(195, 7, 30), C03008a.A17, new C03018b(th));
                } finally {
                    c8c.unbindService(serviceConnectionC02375f);
                }
            }
        }
        return null;
    }
}

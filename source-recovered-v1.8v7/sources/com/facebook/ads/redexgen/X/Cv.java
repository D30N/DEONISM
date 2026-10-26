package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class Cv {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A02(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 65);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A00 = new byte[]{69, 102, 102, 125, 84, 97, 122, 120, 64, 97, 124, 121, 75, 112, 109, 107, 110, 110, 113, 108, 106, 123, 122, 62, 110, 109, 109, 118, 62, 104, 123, 108, 109, 119, 113, 112, 36, 62};
    }

    public static int A00(byte[] bArr) {
        C0414Cu parsedAtom = A01(bArr);
        if (parsedAtom != null) {
            return parsedAtom.A00;
        }
        return -1;
    }

    @Nullable
    public static C0414Cu A01(byte[] bArr) {
        int iA0H = 0;
        UUID uuid = null;
        int iA01 = 0;
        int i = 0;
        int i2 = 0;
        C0544Ii c0544Ii = new C0544Ii(bArr);
        int atomSize = c0544Ii.A07() < 32 ? 2 : 3;
        while (true) {
            switch (atomSize) {
                case 2:
                    return (C0414Cu) null;
                case 3:
                    c0544Ii = c0544Ii;
                    i = 0;
                    c0544Ii.A0Y(0);
                    int iA08 = c0544Ii.A08();
                    int atomSize2 = c0544Ii.A04();
                    if (iA08 == atomSize2 + 4) {
                        atomSize = 5;
                        break;
                    } else {
                        atomSize = 4;
                        break;
                    }
                case 4:
                    return (C0414Cu) null;
                case 5:
                    c0544Ii = c0544Ii;
                    int iA082 = c0544Ii.A08();
                    int atomType = AbstractC0402Cd.A0r;
                    if (iA082 == atomType) {
                        atomSize = 7;
                        break;
                    } else {
                        atomSize = 6;
                        break;
                    }
                case 6:
                    return (C0414Cu) null;
                case 7:
                    c0544Ii = c0544Ii;
                    int atomType2 = c0544Ii.A08();
                    iA01 = AbstractC0402Cd.A01(atomType2);
                    i2 = 1;
                    if (iA01 <= 1) {
                        atomSize = 9;
                        break;
                    } else {
                        atomSize = 8;
                        break;
                    }
                case 8:
                    Log.w(A02(0, 12, 84), A02(12, 26, 95) + iA01);
                    return (C0414Cu) null;
                case 9:
                    c0544Ii = c0544Ii;
                    uuid = new UUID(c0544Ii.A0L(), c0544Ii.A0L());
                    if (iA01 != i2) {
                        atomSize = 11;
                        break;
                    } else {
                        atomSize = 10;
                        break;
                    }
                case 10:
                    c0544Ii = c0544Ii;
                    int atomType3 = c0544Ii.A0H();
                    c0544Ii.A0Z(atomType3 * 16);
                    atomSize = 11;
                    break;
                case 11:
                    c0544Ii = c0544Ii;
                    iA0H = c0544Ii.A0H();
                    int atomType4 = c0544Ii.A04();
                    if (iA0H == atomType4) {
                        atomSize = 13;
                        break;
                    } else {
                        atomSize = 12;
                        break;
                    }
                case 12:
                    return (C0414Cu) null;
                case 13:
                    byte[] bArr2 = new byte[iA0H];
                    c0544Ii.A0c(bArr2, i, iA0H);
                    return new C0414Cu(uuid, iA01, bArr2);
            }
        }
    }

    @Nullable
    public static UUID A03(byte[] bArr) {
        C0414Cu parsedAtom = A01(bArr);
        if (parsedAtom != null) {
            return parsedAtom.A01;
        }
        return null;
    }

    public static byte[] A05(UUID uuid, @Nullable byte[] bArr) {
        return A06(uuid, null, bArr);
    }

    public static byte[] A06(UUID uuid, @Nullable UUID[] uuidArr, @Nullable byte[] bArr) {
        int i = 0;
        ByteBuffer byteBufferAllocate = null;
        boolean z = false;
        int length = 0;
        int length2 = 0;
        int i2 = 0;
        int i3 = 0;
        int psshBoxLength = uuidArr != null ? 2 : 15;
        while (true) {
            switch (psshBoxLength) {
                case 2:
                    z = true;
                    psshBoxLength = 3;
                    break;
                case 3:
                    bArr = bArr;
                    if (bArr == null) {
                        psshBoxLength = 14;
                        break;
                    } else {
                        psshBoxLength = 4;
                        break;
                    }
                case 4:
                    bArr = bArr;
                    length = bArr.length;
                    psshBoxLength = 5;
                    break;
                case 5:
                    i2 = length + 32;
                    if (!z) {
                        psshBoxLength = 7;
                        break;
                    } else {
                        psshBoxLength = 6;
                        break;
                    }
                case 6:
                    uuidArr = uuidArr;
                    int psshBoxLength2 = uuidArr.length;
                    i2 += (psshBoxLength2 * 16) + 4;
                    psshBoxLength = 7;
                    break;
                case 7:
                    byteBufferAllocate = ByteBuffer.allocate(i2);
                    byteBufferAllocate.putInt(i2);
                    byteBufferAllocate.putInt(AbstractC0402Cd.A0r);
                    if (!z) {
                        psshBoxLength = 13;
                        break;
                    } else {
                        psshBoxLength = 8;
                        break;
                    }
                case 8:
                    i = 16777216;
                    psshBoxLength = 9;
                    break;
                case 9:
                    uuid = uuid;
                    byteBufferAllocate = byteBufferAllocate;
                    byteBufferAllocate.putInt(i);
                    byteBufferAllocate.putLong(uuid.getMostSignificantBits());
                    byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
                    if (!z) {
                        psshBoxLength = 16;
                        break;
                    } else {
                        psshBoxLength = 10;
                        break;
                    }
                case 10:
                    uuidArr = uuidArr;
                    byteBufferAllocate = byteBufferAllocate;
                    byteBufferAllocate.putInt(uuidArr.length);
                    length2 = uuidArr.length;
                    psshBoxLength = 11;
                    break;
                case 11:
                    if (i3 >= length2) {
                        psshBoxLength = 16;
                        break;
                    } else {
                        psshBoxLength = 12;
                        break;
                    }
                case 12:
                    uuidArr = uuidArr;
                    byteBufferAllocate = byteBufferAllocate;
                    UUID uuid2 = uuidArr[i3];
                    byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                    byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
                    i3++;
                    psshBoxLength = 11;
                    break;
                case 13:
                    i = 0;
                    psshBoxLength = 9;
                    break;
                case 14:
                    length = 0;
                    psshBoxLength = 5;
                    break;
                case 15:
                    z = false;
                    psshBoxLength = 3;
                    break;
                case 16:
                    if (length == 0) {
                        psshBoxLength = 18;
                        break;
                    } else {
                        psshBoxLength = 17;
                        break;
                    }
                case 17:
                    bArr = bArr;
                    byteBufferAllocate = byteBufferAllocate;
                    int psshBoxLength3 = bArr.length;
                    byteBufferAllocate.putInt(psshBoxLength3);
                    byteBufferAllocate.put(bArr);
                    psshBoxLength = 18;
                    break;
                case 18:
                    return byteBufferAllocate.array();
            }
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import d.b.a.b.k;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1108bs implements ID {
    public static byte[] A02;
    public static final C1108bs A03;
    public int A00;
    public final Map<String, byte[]> A01;

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 84);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A02 = new byte[]{33, 53, 50, -19, 64, 54, 71, 50, -19, 60, 51, -19, -14, 64, -19, -11, -14, 49, -10, -19, 54, 64, -19, 52, 63, 50, 46, 65, 50, 63, -19, 65, 53, 46, 59, -19, 58, 46, 69, 54, 58, 66, 58, -19, 46, 57, 57, 60, 68, 50, 49, 7, -19, -14, 49, -87, -50, -42, -63, -52, -55, -60, Byte.MIN_VALUE, -42, -63, -52, -43, -59, Byte.MIN_VALUE, -45, -55, -38, -59, -102, Byte.MIN_VALUE, -6, -7, -21, -46, -35};
    }

    static {
        A03();
        A03 = new C1108bs(Collections.emptyMap());
    }

    public C1108bs(Map<String, byte[]> map) {
        Map<String, byte[]> metadata = Collections.unmodifiableMap(map);
        this.A01 = metadata;
    }

    public static C1108bs A00(DataInputStream dataInputStream) throws IOException {
        String utf = null;
        int i = 0;
        int i2 = dataInputStream.readInt();
        HashMap map = new HashMap();
        int i3 = 0;
        int valueSize = 2;
        while (true) {
            switch (valueSize) {
                case 2:
                    if (i3 >= i2) {
                        valueSize = 7;
                        break;
                    } else {
                        valueSize = 3;
                        break;
                    }
                case 3:
                    dataInputStream = dataInputStream;
                    utf = dataInputStream.readUTF();
                    i = dataInputStream.readInt();
                    if (i < 0) {
                        valueSize = 6;
                        break;
                    } else {
                        valueSize = 4;
                        break;
                    }
                case 4:
                    if (i > 10485760) {
                        valueSize = 6;
                        break;
                    } else {
                        valueSize = 5;
                        break;
                    }
                case 5:
                    dataInputStream = dataInputStream;
                    map = map;
                    utf = utf;
                    byte[] bArr = new byte[i];
                    dataInputStream.readFully(bArr);
                    map.put(utf, bArr);
                    i3++;
                    valueSize = 2;
                    break;
                case 6:
                    throw new IOException(A01(55, 20, 12) + i);
                case 7:
                    return new C1108bs(map);
            }
        }
    }

    public static Map<String, byte[]> A02(Map<String, byte[]> map, IF r3) {
        HashMap map2 = new HashMap(map);
        A04(map2, r3.A04());
        A05(map2, r3.A05());
        return map2;
    }

    public static void A04(HashMap<String, byte[]> map, List<String> list) {
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    list = list;
                    if (i >= list.size()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    map = map;
                    list = list;
                    map.remove(list.get(i));
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    public static void A05(HashMap<String, byte[]> map, Map<String, Object> map2) {
        String next = null;
        int i = 0;
        byte[] bArrA07 = null;
        Iterator<String> it = map2.keySet().iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    map2 = map2;
                    it = it;
                    next = it.next();
                    bArrA07 = A07(map2.get(next));
                    i = 10485760;
                    if (bArrA07.length > 10485760) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    map = map;
                    next = next;
                    bArrA07 = bArrA07;
                    map.put(next, bArrA07);
                    c2 = 2;
                    break;
                case 5:
                    throw new IllegalArgumentException(String.format(A01(0, 55, k.AppCompatTheme_windowFixedWidthMinor), next, Integer.valueOf(bArrA07.length), Integer.valueOf(i)));
                case 6:
                    return;
            }
        }
    }

    private boolean A06(Map<String, byte[]> map) {
        C1108bs c1108bs = this;
        Iterator<Map.Entry<String, byte[]>> it = null;
        char c2 = c1108bs.A01.size() != map.size() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    c1108bs = c1108bs;
                    it = c1108bs.A01.entrySet().iterator();
                    c2 = 4;
                    break;
                case 4:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    map = map;
                    it = it;
                    Map.Entry<String, byte[]> next = it.next();
                    byte[] value = next.getValue();
                    byte[] otherValue = map.get(next.getKey());
                    if (!Arrays.equals(value, otherValue)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 6:
                    return false;
                case 7:
                    return true;
            }
        }
    }

    public static byte[] A07(Object obj) {
        char c2 = obj instanceof Long ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
                case 3:
                    obj = obj;
                    if (!(obj instanceof String)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return ((String) obj).getBytes(Charset.forName(A01(75, 5, 81)));
                case 5:
                    obj = obj;
                    if (!(obj instanceof byte[])) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return (byte[]) obj;
                case 7:
                    throw new IllegalArgumentException();
            }
        }
    }

    public final C1108bs A08(IF r3) {
        Map<String, byte[]> mapA02 = A02(this.A01, r3);
        if (A06(mapA02)) {
            return this;
        }
        return new C1108bs(mapA02);
    }

    public final void A09(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A01.size());
        Iterator<Map.Entry<String, byte[]>> it = this.A01.entrySet().iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    dataOutputStream = dataOutputStream;
                    it = it;
                    Map.Entry<String, byte[]> next = it.next();
                    dataOutputStream.writeUTF(next.getKey());
                    byte[] value = next.getValue();
                    dataOutputStream.writeInt(value.length);
                    dataOutputStream.write(value);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.ID
    public final long A5D(String str, long j) {
        if (this.A01.containsKey(str)) {
            return ByteBuffer.wrap(this.A01.get(str)).getLong();
        }
        return j;
    }

    @Override // com.facebook.ads.redexgen.X.ID
    public final String A5E(String str, String str2) {
        if (this.A01.containsKey(str)) {
            return new String(this.A01.get(str), Charset.forName(A01(75, 5, 81)));
        }
        return str2;
    }

    public final boolean equals(@Nullable Object obj) {
        C1108bs c1108bs = this;
        char c2 = c1108bs == obj ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return true;
                case 3:
                    obj = obj;
                    if (obj == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1108bs = c1108bs;
                    obj = obj;
                    if (c1108bs.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    return c1108bs.A06(((C1108bs) obj).A01);
            }
        }
    }

    public final int hashCode() {
        C1108bs c1108bs = this;
        int iHashCode = 0;
        Iterator<Map.Entry<String, byte[]>> it = null;
        char c2 = c1108bs.A00 == 0 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c1108bs = c1108bs;
                    iHashCode = 0;
                    it = c1108bs.A01.entrySet().iterator();
                    c2 = 3;
                    break;
                case 3:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    it = it;
                    Map.Entry<String, byte[]> next = it.next();
                    iHashCode += next.getKey().hashCode() ^ Arrays.hashCode(next.getValue());
                    c2 = 3;
                    break;
                case 5:
                    c1108bs = c1108bs;
                    c1108bs.A00 = iHashCode;
                    c2 = 6;
                    break;
                case 6:
                    return c1108bs.A00;
            }
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.support.annotation.VisibleForTesting;
import d.b.a.b.k;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.9Y, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9Y implements Closeable {
    public static byte[] A03;
    public final C9O A01;
    public final Deque<C9X> A02 = new LinkedList();
    public boolean A00 = false;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 4);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A03 = new byte[]{99, 118, 116, Byte.MIN_VALUE, -125, 117, 87, 122, 125, 118, 100, 118, -126, -122, 118, Byte.MAX_VALUE, 116, 118, 49, 114, 125, -125, 118, 114, 117, -118, 49, 116, 125, Byte.MIN_VALUE, -124, 118, 117, -105, -61, -55, -64, -72, 116, -62, -61, -56, 116, -75, -72, -72, 116, -58, -71, -73, -61, -58, -72, 116, -56, -61, 116, -62, -71, -53, -64, -51, 116, -75, -72, -72, -71, -72, 116, -70, -67, -64, -71, -59, -32, -24, -21, -28, -29, -97, -13, -18, -97, -29, -28, -21, -28, -13, -28, -97, -27, -24, -21, -28, -97, -90, -92, -14, -90, -106, -79, -71, -68, -75, -76, 112, -60, -65, 112, -68, -65, -79, -76, 112, -74, -71, -68, -75, 112, 119, 117, -61, 119, 124, 112, -61, -69, -71, -64, -64, -71, -66, -73, 112, -79, -68, -68, 112, -64, -62, -75, -58, -71, -65, -59, -61, 112, -74, -71, -68, -75, -61, 112, -59, -66, -60, -71, -68, 112, 117, -76, 90, 117, 125, Byte.MIN_VALUE, 121, 120, 52, -120, -125, 52, Byte.MIN_VALUE, 125, -121, -120, 52, 122, 125, Byte.MIN_VALUE, 121, 120, 52, 125, -126, 52, 120, 125, -122, 121, 119, -120, -125, -122, -115, 52, 59, 57, -121, 59, -94, -61, -62, -127, -73, -61, -62, -56, -67, -69, -55, -61, -55, -57, 116, -62, -75, -63, -71, -72, 116, -70, -67, -64, -71, 116, -67, -62, 116, -64, -61, -69, -69, -67, -62, -69, 116, -72, -67, -58, -71, -73, -56, -61, -58, -51, -114, 116, 121, -72, Byte.MIN_VALUE, 116, -63, -67, -62, 116, -67, -57, 116, 121, -72, 105, -126, Byte.MAX_VALUE, -126, -125, -117, -126, 52, 122, 125, Byte.MIN_VALUE, 121, 52, 125, -126, 52, Byte.MIN_VALUE, -125, 123, 123, 125, -126, 123, 52, 120, 125, -122, 121, 119, -120, -125, -122, -115, 78, 52, 59, 57, -121, 59};
    }

    public C9Y(C9O c9o, C9W c9w) throws NumberFormatException, IOException {
        this.A01 = c9o;
        A05(c9o, c9w);
        if (this.A02.isEmpty()) {
            A00();
        }
    }

    private C9X A00() throws IOException {
        int iA00 = -1;
        if (!this.A02.isEmpty()) {
            iA00 = this.A02.getLast().A00();
        }
        int i = iA00 + 1;
        this.A02.add(new C9X(i, new C9U(new File(this.A01.A05(), A01(i)))));
        return this.A02.getLast();
    }

    @VisibleForTesting
    public static String A01(int i) {
        return Integer.toString(i);
    }

    private void A04(int i, File file) throws IOException {
        C9U c9u = new C9U(file);
        c9u.A05();
        this.A02.addFirst(new C9X(i, c9u));
    }

    private void A05(C9O c9o, C9W c9w) throws NumberFormatException, IOException {
        C9W c9w2 = c9w;
        C9Y c9y = this;
        File file = null;
        Iterator it = null;
        HashMap map = null;
        File file2 = null;
        int length = 0;
        HashSet hashSet = null;
        int i = 0;
        File file3 = null;
        int i2 = 0;
        Iterator it2 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int iIntValue = 0;
        File[] fileArrListFiles = c9o.A05().listFiles();
        char c2 = fileArrListFiles != null ? (char) 2 : '\"';
        while (true) {
            switch (c2) {
                case 2:
                    fileArrListFiles = fileArrListFiles;
                    map = new HashMap();
                    hashSet = new HashSet();
                    i = -1;
                    length = fileArrListFiles.length;
                    i3 = 0;
                    c2 = 3;
                    break;
                case 3:
                    if (i3 >= length) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    fileArrListFiles = fileArrListFiles;
                    file2 = fileArrListFiles[i3];
                    c2 = 5;
                    break;
                case 5:
                    try {
                        file2 = file2;
                        i2 = Integer.parseInt(file2.getName());
                        map.put(Integer.valueOf(i2), file2);
                        if (i2 <= i) {
                            c2 = '\f';
                            break;
                        } else {
                            c2 = 11;
                            break;
                        }
                    } catch (NumberFormatException unused) {
                        hashSet.add(file2);
                        c9w2.ACb(String.format(Locale.US, A02(260, 39, 16), file2.getCanonicalPath()));
                        c2 = '\f';
                        break;
                    }
                case 11:
                    i = i2;
                    c2 = '\f';
                    break;
                case '\f':
                    i3++;
                    c2 = 3;
                    break;
                case '\r':
                    map = map;
                    if (!map.isEmpty()) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 29;
                        break;
                    }
                case 14:
                    i5 = i;
                    c2 = 15;
                    break;
                case 15:
                    map = map;
                    if (!map.containsKey(Integer.valueOf(i5 - 1))) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    i5--;
                    c2 = 15;
                    break;
                case 17:
                    map = map;
                    it2 = new HashSet(map.keySet()).iterator();
                    c2 = 18;
                    break;
                case 18:
                    it2 = it2;
                    i6 = 2;
                    if (!it2.hasNext()) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    it2 = it2;
                    iIntValue = ((Integer) it2.next()).intValue();
                    if (iIntValue >= i5) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c9w2 = c9w2;
                    map = map;
                    hashSet = hashSet;
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[i6];
                    objArr[0] = Integer.valueOf(iIntValue);
                    objArr[1] = Integer.valueOf(i5);
                    c9w2.ACb(String.format(locale, A02(199, 61, 80), objArr));
                    hashSet.add(map.remove(Integer.valueOf(iIntValue)));
                    c2 = 18;
                    break;
                case 21:
                    i4 = i;
                    c2 = 22;
                    break;
                case 22:
                    if (i4 < i5) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    map = map;
                    file3 = (File) map.get(Integer.valueOf(i4));
                    c2 = 24;
                    break;
                case 24:
                    try {
                        c9y = c9y;
                        file3 = file3;
                        c9y.A04(i4, file3);
                        map.remove(Integer.valueOf(i4));
                        i4--;
                        c2 = 22;
                        break;
                    } catch (IOException e) {
                        Locale locale2 = Locale.US;
                        Object[] objArr2 = new Object[i6];
                        objArr2[0] = file3.getCanonicalPath();
                        objArr2[1] = Integer.valueOf(i4);
                        c9w2.ACc(String.format(locale2, A02(99, 62, 76), objArr2), e);
                        hashSet.addAll(map.values());
                        c2 = 29;
                        break;
                    }
                case 29:
                    hashSet = hashSet;
                    it = hashSet.iterator();
                    c2 = 30;
                    break;
                case 30:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 31;
                        break;
                    }
                case 31:
                    it = it;
                    file = (File) it.next();
                    if (!file.delete()) {
                        c2 = ' ';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case ' ':
                    c9w2 = c9w2;
                    file = file;
                    c9w2.ACb(String.format(Locale.US, A02(73, 26, k.AppCompatTheme_windowMinWidthMinor), file.getCanonicalPath()));
                    c2 = 30;
                    break;
                case '!':
                    return;
                case '\"':
                    throw new IOException(String.format(Locale.US, A02(161, 38, 16), c9o.A05().getCanonicalPath()));
            }
        }
    }

    public final synchronized int A06() throws IOException {
        if (!this.A00) {
            if (this.A02.isEmpty()) {
                return -1;
            }
            return this.A02.getFirst().A00();
        }
        throw new IOException(A02(0, 33, 13));
    }

    public final synchronized int A07() throws IOException {
        if (!this.A00) {
            if (this.A02.isEmpty()) {
                return 0;
            }
            return this.A02.getFirst().A01();
        }
        throw new IOException(A02(0, 33, 13));
    }

    public final synchronized int A08() throws IOException {
        if (!this.A00) {
        } else {
            throw new IOException(A02(0, 33, 13));
        }
        return this.A02.size();
    }

    public final synchronized int A09() throws IOException {
        int iA01;
        if (!this.A00) {
            iA01 = 0;
            Iterator<C9X> it = this.A02.iterator();
            while (it.hasNext()) {
                iA01 += it.next().A01();
            }
        } else {
            throw new IOException(A02(0, 33, 13));
        }
        return iA01;
    }

    public final synchronized C9M A0A(int i, int i2, byte[] bArr, int i3, int[] iArr, int i4) throws IOException {
        if (!this.A00) {
            for (C9X c9x : this.A02) {
                if (c9x.A00() == i) {
                    return new C9M(i, c9x.A02(i2, bArr, i3, iArr, i4));
                }
            }
            return new C9M(-1, new C9L(C9K.A04, -1, -1, 0));
        }
        throw new IOException(A02(0, 33, 13));
    }

    public final synchronized void A0B() throws IOException {
        if (!this.A00) {
            for (C9X file : this.A02) {
                file.A04();
            }
            this.A02.clear();
            A00();
        } else {
            throw new IOException(A02(0, 33, 13));
        }
    }

    public final synchronized void A0C(byte[] bArr) throws IOException {
        if (!this.A00) {
            if ((this.A02.isEmpty() || !this.A02.getLast().A05(bArr)) && !A00().A05(bArr)) {
                throw new IOException(A02(33, 40, 80));
            }
        } else {
            throw new IOException(A02(0, 33, 13));
        }
    }

    public final synchronized boolean A0D() throws IOException {
        if (!this.A00) {
            if (this.A02.size() > 1) {
                C9X first = this.A02.getFirst();
                this.A02.removeFirst();
                first.A04();
                return true;
            }
            return false;
        }
        throw new IOException(A02(0, 33, 13));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        for (C9X file : this.A02) {
            file.A03();
        }
    }
}

package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public final class Y3<T> implements C9R<T> {
    public static byte[] A06;
    public C9J A00;
    public C9J A01;
    public List<Y3<T>.RecordFileBasedFetch> A02 = new ArrayList();
    public boolean A03;
    public final C9I A04;
    public final C9Y A05;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 106);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A06 = new byte[]{22, 52, 65, -13, 66, 65, 63, 76, -13, 55, 56, 63, 56, 71, 56, -13, 54, 72, 69, 70, 66, 69, 70, -13, 67, 66, 60, 65, 71, 60, 65, 58, -13, 52, 71, -13, 71, 59, 56, -13, 55, 52, 71, 52, 53, 52, 70, 56, -13, 70, 71, 52, 69, 71, -62, -35, -27, -24, -31, -32, -100, -16, -21, -100, -15, -20, -32, -35, -16, -31, -100, -30, -27, -24, -31, -100, -17, -31, -19, -15, -31, -22, -33, -31, 61, 79, 76, 77, 73, 76, -39, -12, -4, -1, -8, -9, -77, 7, 2, -77, -7, -8, 7, -10, -5, -77, -9, -12, 7, -12, -77, -7, 5, 2, 0, -77, -1, 2, -6, -17, 33, 30, 31, 27, 30, -52, 28, 27, 31, 21, 32, 21, 27, 26, -52, 21, 31, -52, 13, 32, -52, -44, -47, 16, -40, -47, 16, -43, -40, -52, 13, 26, 16, -52, 30, 17, 15, 27, 30, 16, -52, 18, 21, 24, 17, -52, 31, 17, 29, 33, 17, 26, 15, 17, -52, 31, 32, 13, 30, 32, 31, -52, 13, 32, -52, -44, -47, 16, -40, -47, 16, -43, -26, -52, 16, 13, 32, 13, -52, 20, 13, 31, -52, 28, 30, 27, 14, 13, 14, 24, 37, -52, 14, 17, 17, 26, -52, 24, 27, 31, 32, -67, -40, -32, -29, -36, -37, -105, -21, -26, -105, -40, -37, -37, -105, -37, -40, -21, -40, -105, -21, -26, -105, -29, -26, -34, 40, 67, 75, 78, 71, 70, 2, 86, 81, 2, 73, 71, 86, 2, 84, 71, 69, 81, 84, 70, 2, 69, 81, 87, 80, 86, -16, 34, 31, 32, 28, 31, -51, 29, 28, 32, 22, 33, 22, 28, 27, -51, 22, 32, -51, 14, 33, -51, -43, -46, 17, -39, -46, 17, -42, -39, -51, 15, 34, 33, -51, 31, 18, 16, 28, 31, 17, -51, 19, 22, 25, 18, -51, 32, 18, 30, 34, 18, 27, 16, 18, -51, 28, 27, 25, 38, -51, 21, 14, 32, -51, 19, 22, 25, 18, -51, -46, 17, -25, -51, 17, 14, 33, 14, -51, 21, 14, 32, -51, 29, 31, 28, 15, 14, 15, 25, 38, -51, 15, 18, 18, 27, -51, 25, 28, 32, 33, 38, 63, 60, 63, 64, 72, 63, -15, 35, 54, 52, 64, 67, 53, 23, 58, 61, 54, 19, 50, 68, 54, 53, 35, 54, 52, 64, 67, 53, 21, 50, 69, 50, 51, 50, 68, 54, -15, 55, 54, 69, 52, 57, -12, 15, 23, 26, 19, 18, -50, 34, 29, -50, 17, 26, 19, 15, 32, -50, 18, 15, 34, 15, 16, 15, 33, 19, 7, 4, 23, 4, -28, -9, -11, 1, 4, -10, -40, -5, -2, -9, -44, -13, 5, -9, -10, -28, -9, -11, 1, 4, -10, -42, -13, 6, -13, -12, -13, 5, -9, -78, -5, 5, -78, -11, -2, 1, 5, -9, -10, 33, 52, 50, 62, 65, 51, 21, 56, 59, 52, 17, 48, 66, 52, 51, 33, 52, 50, 62, 65, 51, 19, 48, 67, 48, 49, 48, 66, 52, -17, 50, 59, 62, 66, 52, 51};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    public Y3(C9O c9o, C9W c9w) throws IOException {
        this.A05 = new C9Y(c9o.A04(A00(440, 4, 57)), c9w);
        this.A04 = new C9I(new File(c9o.A05(), A00(84, 6, 112)));
        this.A00 = this.A04.A03();
        A05(c9w);
        this.A01 = this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A02(int i, int i2) throws IOException {
        this.A00 = new C9J(i, i2);
        this.A04.A04(this.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y2 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/Y3<TT;>.RecordFileBasedFetch;)V */
    public synchronized void A03(Y2 y2) throws C03259a {
        if (!this.A03) {
            if (A06(y2)) {
                if (y2.A54() == 0) {
                    return;
                }
                if (this.A00.A04(y2.A00().A02) == 0) {
                    try {
                        Iterator<C9V> it = y2.A00.iterator();
                        while (it.hasNext()) {
                            if (it.next().A00 == this.A05.A07() && this.A05.A0D()) {
                                A02(this.A05.A06(), 0);
                            } else {
                                A02(this.A05.A06(), y2.A00().A00);
                                break;
                            }
                        }
                        if (this.A01.A04(this.A00) < 0) {
                            this.A01 = this.A00;
                        }
                        return;
                    } catch (IOException e) {
                        throw new C03259a(A00(54, 30, 18), e);
                    }
                }
                throw new C03259a(A00(0, 54, 105));
            }
            throw new C03259a(A00(373, 43, 103));
        }
        throw new C03259a(A00(444, 39, 40));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A05(C9W c9w) throws IOException {
        Y3<T> y3 = this;
        C9J c9j = new C9J(y3.A05.A06(), 0);
        char c2 = c9j.A04(y3.A00) > 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    y3 = y3;
                    c9w = c9w;
                    c9j = c9j;
                    c9w.ACb(String.format(Locale.US, A00(k.AppCompatTheme_windowFixedHeightMinor, 102, 66), Integer.valueOf(y3.A00.A02()), Integer.valueOf(y3.A00.A03()), Integer.valueOf(c9j.A02()), Integer.valueOf(c9j.A03())));
                    y3.A00 = c9j;
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    y3 = y3;
                    c9j = c9j;
                    if (c9j.A02() >= y3.A00.A02()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    y3 = y3;
                    if (!y3.A05.A0D()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    y3 = y3;
                    c9j = new C9J(y3.A05.A06(), 0);
                    c2 = 4;
                    break;
                case 7:
                    y3 = y3;
                    c9w = c9w;
                    c9j = c9j;
                    c9w.ACb(String.format(Locale.US, A00(272, 101, 67), Integer.valueOf(y3.A00.A02()), Integer.valueOf(y3.A00.A03()), Integer.valueOf(c9j.A02())));
                    y3.A00 = new C9J(y3.A05.A06(), y3.A05.A07());
                    y3.A04.A04(y3.A00);
                    c2 = 4;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y2 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/Y3<TT;>.RecordFileBasedFetch;)Z */
    public synchronized boolean A06(Y2 y2) {
        if (!this.A02.remove(y2)) {
            return false;
        }
        if (y2.A54() > 0 && y2.A01().A02.A05(y2.A01().A01).equals(this.A01)) {
            this.A01 = y2.A00().A02;
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y2 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.C9R
    public final synchronized C9Q A53(byte[] bArr, int[] iArr) throws C03259a {
        Y3<T>.RecordFileBasedFetch y2;
        if (!this.A03) {
            int iA02 = 0;
            int i = 0;
            try {
                ArrayList arrayList = new ArrayList();
                boolean z = true;
                while (true) {
                    C9M c9mA0A = this.A05.A0A(this.A01.A02(), this.A01.A03(), bArr, iA02, iArr, i);
                    int iA00 = c9mA0A.A01().A00() - c9mA0A.A01().A01();
                    iA02 += c9mA0A.A01().A02();
                    i += iA00;
                    if (c9mA0A.A01().A03() == C9K.A02) {
                        arrayList.add(c9mA0A);
                    }
                    if (c9mA0A.A01().A03() == C9K.A03) {
                        break;
                    }
                    if (c9mA0A.A01().A03() == C9K.A04) {
                        if (this.A05.A06() + this.A05.A08() == this.A01.A02() + 1) {
                            z = false;
                            break;
                        }
                        this.A01 = new C9J(this.A01.A02() + 1, 0);
                    } else {
                        this.A01 = this.A01.A05(iA00);
                    }
                }
                y2 = new Y2(this, arrayList, z);
                this.A02.add(y2);
                if (!arrayList.isEmpty()) {
                    this.A01 = y2.A01().A02.A05(y2.A01().A01);
                }
            } catch (IOException e) {
                throw new C03259a(A00(90, 29, 41), e);
            }
        } else {
            throw new C03259a(A00(483, 36, 101));
        }
        return y2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.C9R
    public final synchronized int A6q() throws C03259a {
        int iA09;
        if (!this.A03) {
            try {
                iA09 = this.A05.A09();
                if (this.A00.A02() == this.A05.A06()) {
                    iA09 -= this.A00.A03();
                }
            } catch (IOException e) {
                throw new C03259a(A00(246, 26, k.AppCompatTheme_windowFixedWidthMajor), e);
            }
        } else {
            throw new C03259a(A00(444, 39, 40));
        }
        return iA09;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.C9R
    public final synchronized void ADV(byte[] bArr) throws C03259a {
        if (!this.A03) {
            try {
                this.A05.A0C(bArr);
            } catch (IOException e) {
                throw new C03259a(A00(221, 25, 13), e);
            }
        } else {
            throw new C03259a(A00(444, 39, 40));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.C9R
    public final synchronized void clear() throws C03259a {
        try {
            this.A05.A0B();
            A02(this.A05.A06(), 0);
            this.A02.clear();
        } catch (IOException e) {
            throw new C03259a(A00(416, 24, 68), e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A02.clear();
        this.A04.close();
        this.A05.close();
    }
}

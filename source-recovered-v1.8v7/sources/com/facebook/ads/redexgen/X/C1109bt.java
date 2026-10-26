package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;
import android.support.annotation.NonNull;
import android.util.Log;
import d.b.a.b.k;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.bt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1109bt implements I3 {
    public static boolean A06;
    public static byte[] A07;
    public static final HashSet<File> A08;
    public long A00;
    public boolean A01;
    public final InterfaceC1106bq A02;
    public final IB A03;
    public final File A04;
    public final HashMap<String, ArrayList<I2>> A05;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 63);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A07 = new byte[]{77, 119, 115, 110, 114, 123, 93, Byte.MAX_VALUE, 125, 118, 123, 48, 119, 112, 119, 106, 119, Byte.MAX_VALUE, 114, 119, 100, 123, 54, 55, 120, 66, 70, 91, 71, 78, 104, 74, 72, 67, 78, 125, 82, 83, 72, 84, 89, 78, 28, 111, 85, 81, 76, 80, 89, Byte.MAX_VALUE, 93, 95, 84, 89, 28, 85, 82, 79, 72, 93, 82, 95, 89, 28, 73, 79, 89, 79, 28, 72, 84, 89, 28, 90, 83, 80, 88, 89, 78, 6, 28, 20, 51, 40, 53, 46, 41, 32, 103, 46, 41, 35, 34, 63, 103, 33, 46, 43, 34, 103, 33, 38, 46, 43, 34, 35, 78, 76, 78, 69, 72, 73, 114, 78, 66, 67, 89, 72, 67, 89, 114, 68, 67, 73, 72, 85, 3, 72, 85, 68};
    }

    static {
        A06();
        A08 = new HashSet<>();
    }

    public C1109bt(File file, InterfaceC1106bq interfaceC1106bq) {
        this(file, interfaceC1106bq, null, false);
    }

    public C1109bt(File file, InterfaceC1106bq interfaceC1106bq, IB ib) {
        if (A0D(file)) {
            this.A04 = file;
            this.A02 = interfaceC1106bq;
            this.A03 = ib;
            this.A05 = new HashMap<>();
            ConditionVariable conditionVariable = new ConditionVariable();
            new IG(this, A03(0, 24, 33), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A03(35, 46, 3) + file);
    }

    public C1109bt(File file, InterfaceC1106bq interfaceC1106bq, byte[] bArr, boolean z) {
        this(file, interfaceC1106bq, new IB(file, bArr, z));
    }

    private C1110bu A00(String str, long j) throws IOException {
        C1109bt c1109bt = this;
        C1110bu c1110buA06 = null;
        IA iaA09 = c1109bt.A03.A09(str);
        char c2 = iaA09 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return C1110bu.A02(str, j);
                case 3:
                    iaA09 = iaA09;
                    c1110buA06 = iaA09.A06(j);
                    if (!c1110buA06.A05) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1110buA06 = c1110buA06;
                    if (!c1110buA06.A03.exists()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    c1109bt = c1109bt;
                    c1109bt.A05();
                    c2 = 3;
                    break;
                case 6:
                    return c1110buA06;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.I3
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final synchronized C1110bu ADQ(String str, long j) throws InterruptedException, I1 {
        C1110bu c1110buADR;
        while (true) {
            c1110buADR = ADR(str, j);
            if (c1110buADR == null) {
                wait();
            }
        }
        return c1110buADR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.I3
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final synchronized C1110bu ADR(String str, long j) throws I1 {
        IJ.A04(!this.A01);
        C1110bu c1110buA00 = A00(str, j);
        if (c1110buA00.A05) {
            C1110bu c1110buA07 = this.A03.A09(str).A07(c1110buA00);
            A0C(c1110buA00, c1110buA07);
            return c1110buA07;
        }
        IA iaA0A = this.A03.A0A(str);
        if (!iaA0A.A0D()) {
            iaA0A.A0B(true);
            return c1110buA00;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() throws IOException, NumberFormatException {
        C1109bt c1109bt = this;
        File file = null;
        C1110bu span = null;
        int i = 0;
        int length = 0;
        File[] fileArrListFiles = null;
        char c2 = !c1109bt.A04.exists() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1109bt.A04.mkdirs();
                    return;
                case 3:
                    c1109bt = c1109bt;
                    c1109bt.A03.A0E();
                    fileArrListFiles = c1109bt.A04.listFiles();
                    if (fileArrListFiles != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    fileArrListFiles = fileArrListFiles;
                    length = fileArrListFiles.length;
                    i = 0;
                    c2 = 6;
                    break;
                case 6:
                    if (i >= length) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    fileArrListFiles = fileArrListFiles;
                    file = fileArrListFiles[i];
                    if (!file.getName().equals(A03(106, 24, 18))) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    i++;
                    c2 = 6;
                    break;
                case '\t':
                    file = file;
                    if (file.length() <= 0) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c1109bt = c1109bt;
                    file = file;
                    span = C1110bu.A00(file, c1109bt.A03);
                    c2 = 11;
                    break;
                case 11:
                    if (span == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c1109bt = c1109bt;
                    c1109bt.A0A(span);
                    c2 = '\b';
                    break;
                case '\r':
                    span = null;
                    c2 = 11;
                    break;
                case 14:
                    file = file;
                    file.delete();
                    c2 = '\b';
                    break;
                case 15:
                    c1109bt = c1109bt;
                    c1109bt.A03.A0F();
                    c2 = 16;
                    break;
                case 16:
                    try {
                        c1109bt.A03.A0G();
                        return;
                    } catch (I1 e) {
                        Log.e(A03(24, 11, 20), A03(81, 25, k.AppCompatTheme_windowFixedWidthMajor), e);
                        return;
                    }
            }
        }
    }

    private void A05() throws IOException {
        C1109bt c1109bt = this;
        C1110bu next = null;
        int i = 0;
        Iterator<C1110bu> it = null;
        ArrayList arrayList = new ArrayList();
        Iterator<IA> it2 = c1109bt.A03.A0D().iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it2 = it2;
                    if (!it2.hasNext()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    it2 = it2;
                    it = it2.next().A08().iterator();
                    c2 = 4;
                    break;
                case 4:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    it = it;
                    next = it.next();
                    if (!next.A03.exists()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 6:
                    arrayList = arrayList;
                    next = next;
                    arrayList.add(next);
                    c2 = 4;
                    break;
                case 7:
                    i = 0;
                    c2 = '\b';
                    break;
                case '\b':
                    arrayList = arrayList;
                    if (i >= arrayList.size()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c1109bt = c1109bt;
                    arrayList = arrayList;
                    c1109bt.A08((I7) arrayList.get(i), false);
                    i++;
                    c2 = '\b';
                    break;
                case '\n':
                    C1109bt c1109bt2 = c1109bt;
                    c1109bt2.A03.A0F();
                    c1109bt2.A03.A0G();
                    return;
            }
        }
    }

    private void A07(I7 i7) {
        C1109bt c1109bt = this;
        int size = 0;
        ArrayList<I2> arrayList = c1109bt.A05.get(i7.A04);
        char c2 = arrayList != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    arrayList = arrayList;
                    size = arrayList.size() - 1;
                    c2 = 3;
                    break;
                case 3:
                    if (size < 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1109bt = c1109bt;
                    i7 = i7;
                    arrayList = arrayList;
                    arrayList.get(size).AB4(c1109bt, i7);
                    size--;
                    c2 = 3;
                    break;
                case 5:
                    C1109bt c1109bt2 = c1109bt;
                    c1109bt2.A02.AB4(c1109bt2, i7);
                    return;
            }
        }
    }

    private void A08(I7 i7, boolean z) throws I1 {
        IA iaA09 = this.A03.A09(i7.A04);
        char c2 = iaA09 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    i7 = i7;
                    iaA09 = iaA09;
                    if (!iaA09.A0E(i7)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    C1109bt c1109bt = this;
                    I7 i72 = i7;
                    c1109bt.A00 -= i72.A01;
                    if (z) {
                        try {
                            c1109bt.A03.A0H(iaA09.A03);
                            c1109bt.A03.A0G();
                        } finally {
                            c1109bt.A07(i72);
                        }
                    }
                    return;
            }
        }
    }

    private void A0A(C1110bu c1110bu) {
        this.A03.A0A(c1110bu.A04).A09(c1110bu);
        this.A00 += c1110bu.A01;
        A0B(c1110bu);
    }

    private void A0B(C1110bu c1110bu) {
        C1109bt c1109bt = this;
        int size = 0;
        ArrayList<I2> arrayList = c1109bt.A05.get(c1110bu.A04);
        char c2 = arrayList != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    arrayList = arrayList;
                    size = arrayList.size() - 1;
                    c2 = 3;
                    break;
                case 3:
                    if (size < 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1109bt = c1109bt;
                    c1110bu = c1110bu;
                    arrayList = arrayList;
                    arrayList.get(size).AB3(c1109bt, c1110bu);
                    size--;
                    c2 = 3;
                    break;
                case 5:
                    C1109bt c1109bt2 = c1109bt;
                    c1109bt2.A02.AB3(c1109bt2, c1110bu);
                    return;
            }
        }
    }

    private void A0C(C1110bu c1110bu, I7 i7) {
        C1109bt c1109bt = this;
        int size = 0;
        ArrayList<I2> arrayList = c1109bt.A05.get(c1110bu.A04);
        char c2 = arrayList != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    arrayList = arrayList;
                    size = arrayList.size() - 1;
                    c2 = 3;
                    break;
                case 3:
                    if (size < 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1109bt = c1109bt;
                    c1110bu = c1110bu;
                    i7 = i7;
                    arrayList = arrayList;
                    arrayList.get(size).AB5(c1109bt, c1110bu, i7);
                    size--;
                    c2 = 3;
                    break;
                case 5:
                    C1109bt c1109bt2 = c1109bt;
                    c1109bt2.A02.AB5(c1109bt2, c1110bu, i7);
                    return;
            }
        }
    }

    public static synchronized boolean A0D(File file) {
        if (A06) {
            return true;
        }
        return A08.add(file.getAbsoluteFile());
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final synchronized void A3P(String str, IF r3) throws I1 {
        IJ.A04(!this.A01);
        this.A03.A0I(str, r3);
        this.A03.A0G();
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final synchronized void A43(File file) throws I1 {
        IJ.A04(!this.A01);
        C1110bu c1110buA00 = C1110bu.A00(file, this.A03);
        IJ.A04(c1110buA00 != null);
        IA iaA09 = this.A03.A09(c1110buA00.A04);
        IJ.A01(iaA09);
        IJ.A04(iaA09.A0D());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long jA00 = IE.A00(iaA09.A05());
            if (jA00 != -1) {
                long j = c1110buA00.A02;
                long length = c1110buA00.A01;
                IJ.A04(j + length <= jA00);
            }
            A0A(c1110buA00);
            this.A03.A0G();
            notifyAll();
        }
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final synchronized long A5Z() {
        IJ.A04(!this.A01);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final synchronized long A5b(String str, long j, long j2) {
        IA iaA09;
        IJ.A04(!this.A01);
        iaA09 = this.A03.A09(str);
        return iaA09 != null ? iaA09.A04(j, j2) : -j2;
    }

    @Override // com.facebook.ads.redexgen.X.I3
    @NonNull
    public final synchronized NavigableSet<I7> A5c(String str) {
        IA iaA09;
        IJ.A04(!this.A01);
        iaA09 = this.A03.A09(str);
        return (iaA09 == null || iaA09.A0C()) ? new TreeSet() : new TreeSet((Collection) iaA09.A08());
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final synchronized long A5n(String str) {
        return IE.A00(A5o(str));
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final synchronized ID A5o(String str) {
        IJ.A04(!this.A01);
        return this.A03.A0B(str);
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final synchronized void ACN(I7 i7) {
        IJ.A04(!this.A01);
        IA iaA09 = this.A03.A09(i7.A04);
        IJ.A01(iaA09);
        IJ.A04(iaA09.A0D());
        iaA09.A0B(false);
        this.A03.A0H(iaA09.A03);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final synchronized void ACU(I7 i7) throws I1 {
        IJ.A04(!this.A01);
        A08(i7, true);
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final synchronized void AD0(String str, long j) throws I1 {
        IF r0 = new IF();
        IE.A05(r0, j);
        A3P(str, r0);
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final synchronized File ADO(String str, long j, long j2) throws I1 {
        IA iaA09;
        IJ.A04(!this.A01);
        iaA09 = this.A03.A09(str);
        IJ.A01(iaA09);
        IJ.A04(iaA09.A0D());
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            A05();
        }
        this.A02.AB6(this, str, j, j2);
        return C1110bu.A04(this.A04, iaA09.A02, j, System.currentTimeMillis());
    }
}

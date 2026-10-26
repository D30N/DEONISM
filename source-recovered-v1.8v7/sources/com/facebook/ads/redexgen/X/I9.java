package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.support.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class I9 {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 24
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0089: INVOKE (r3 I:com.facebook.ads.redexgen.X.He) STATIC call: com.facebook.ads.redexgen.X.Iy.A0Z(com.facebook.ads.redexgen.X.He):void A[MD:(com.facebook.ads.redexgen.X.He):void (m)], block:B:33:0x0089 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0093: INVOKE (r3 I:com.facebook.ads.redexgen.X.He) STATIC call: com.facebook.ads.redexgen.X.Iy.A0Z(com.facebook.ads.redexgen.X.He):void A[MD:(com.facebook.ads.redexgen.X.He):void (m)], block:B:37:0x0093 */
    public static long A00(C0520Hi c0520Hi, long j, long j2, InterfaceC0516He interfaceC0516He, byte[] bArr, C0548Im c0548Im, int i, I8 i8) throws InterruptedException, IOException {
        InterfaceC0516He interfaceC0516He2;
        while (true) {
            if (c0548Im != null) {
                c0548Im.A01(i);
            }
            try {
                break;
            } catch (C0547Il unused) {
            } finally {
                C0560Iy.A0Z(interfaceC0516He2);
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        C0520Hi c0520Hi2 = new C0520Hi(c0520Hi.A04, c0520Hi.A06, j, (c0520Hi.A03 + j) - c0520Hi.A01, -1L, c0520Hi.A05, c0520Hi.A00 | 2);
        long jABU = interfaceC0516He2.ABU(c0520Hi2);
        if (i8.A01 == -1 && jABU != -1) {
            i8.A01 = c0520Hi2.A01 + jABU;
        }
        long j3 = 0;
        while (true) {
            if (j3 == j2) {
                break;
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            int i2 = interfaceC0516He2.read(bArr, 0, j2 != -1 ? (int) Math.min(bArr.length, j2 - j3) : bArr.length);
            if (i2 != -1) {
                j3 += i2;
                i8.A02 += i2;
            } else if (i8.A01 == -1) {
                i8.A01 = c0520Hi2.A01 + j3;
            }
        }
        return j3;
    }

    public static String A01(Uri uri) {
        return uri.toString();
    }

    public static String A02(C0520Hi c0520Hi) {
        String strA01 = null;
        char c2 = c0520Hi.A05 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0520Hi = c0520Hi;
                    strA01 = c0520Hi.A05;
                    c2 = 3;
                    break;
                case 3:
                    return strA01;
                case 4:
                    c0520Hi = c0520Hi;
                    strA01 = A01(c0520Hi.A04);
                    c2 = 3;
                    break;
            }
        }
    }

    public static void A03(C0520Hi c0520Hi, I3 i3, C1104bo c1104bo, byte[] bArr, C0548Im c0548Im, int i, @Nullable I8 i8, @Nullable AtomicBoolean atomicBoolean, boolean z) throws InterruptedException, IOException {
        C0548Im c0548Im2 = c0548Im;
        I3 i32 = i3;
        C0520Hi c0520Hi2 = c0520Hi;
        AtomicBoolean atomicBoolean2 = atomicBoolean;
        I8 i82 = i8;
        C1104bo c1104bo2 = c1104bo;
        byte[] bArr2 = bArr;
        long j = 0;
        I8 counters = null;
        long jA5n = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long left = 0;
        long jA5b = 0;
        String strA02 = null;
        long j5 = 0;
        long j6 = 0;
        C0520Hi c0520Hi3 = c0520Hi2;
        I3 i33 = i32;
        IJ.A01(c1104bo2);
        IJ.A01(bArr2);
        char c2 = i82 != null ? (char) 2 : (char) 22;
        while (true) {
            switch (c2) {
                case 2:
                    c0520Hi3 = c0520Hi3;
                    i33 = i33;
                    i82 = i82;
                    A04(c0520Hi3, i33, i82);
                    counters = i82;
                    c2 = 3;
                    break;
                case 3:
                    c0520Hi2 = c0520Hi2;
                    c0520Hi3 = c0520Hi3;
                    strA02 = A02(c0520Hi2);
                    j2 = c0520Hi3.A01;
                    left = -1;
                    if (c0520Hi3.A02 == -1) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0520Hi3 = c0520Hi3;
                    jA5n = c0520Hi3.A02;
                    c2 = 5;
                    break;
                case 5:
                    j5 = j2;
                    j4 = jA5n;
                    c2 = 6;
                    break;
                case 6:
                    j3 = 0;
                    if (j4 == 0) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    atomicBoolean2 = atomicBoolean2;
                    if (atomicBoolean2 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    atomicBoolean2 = atomicBoolean2;
                    if (!atomicBoolean2.get()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case '\t':
                    if (j4 == left) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    j6 = j4;
                    c2 = 11;
                    break;
                case 11:
                    i32 = i32;
                    strA02 = strA02;
                    jA5b = i32.A5b(strA02, j5, j6);
                    if (jA5b <= j3) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    j5 += jA5b;
                    if (j4 != left) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    j4 -= j3;
                    c2 = 6;
                    break;
                case 14:
                    j3 = jA5b;
                    c2 = '\r';
                    break;
                case 15:
                    j6 = Long.MAX_VALUE;
                    c2 = 11;
                    break;
                case 16:
                    c0520Hi2 = c0520Hi2;
                    c1104bo2 = c1104bo2;
                    bArr2 = bArr2;
                    c0548Im2 = c0548Im2;
                    counters = counters;
                    long j7 = -jA5b;
                    j = j7;
                    if (A00(c0520Hi2, j5, j7, c1104bo2, bArr2, c0548Im2, i, counters) >= j) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    if (!z) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    if (j4 != left) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    return;
                case 20:
                    jA5b = j;
                    c2 = '\f';
                    break;
                case 21:
                    i33 = i33;
                    strA02 = strA02;
                    jA5n = i33.A5n(strA02);
                    c2 = 5;
                    break;
                case 22:
                    counters = new I8();
                    c2 = 3;
                    break;
                case 23:
                    throw new InterruptedException();
                case 24:
                    throw new EOFException();
            }
        }
    }

    public static void A04(C0520Hi c0520Hi, I3 i3, I8 i8) {
        I3 i32 = i3;
        I8 i82 = i8;
        C0520Hi c0520Hi2 = c0520Hi;
        long jA5b = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long left = 0;
        long j5 = 0;
        long j6 = 0;
        String key = A02(c0520Hi2);
        long j7 = c0520Hi2.A01;
        char c2 = c0520Hi2.A02 != -1 ? (char) 2 : (char) 16;
        while (true) {
            switch (c2) {
                case 2:
                    c0520Hi2 = c0520Hi2;
                    left = c0520Hi2.A02;
                    c2 = 3;
                    break;
                case 3:
                    i82 = i82;
                    i82.A01 = left;
                    j5 = 0;
                    i82.A00 = 0L;
                    i82.A02 = 0L;
                    j2 = j7;
                    j6 = left;
                    c2 = 4;
                    break;
                case 4:
                    if (j6 == j5) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    j3 = Long.MAX_VALUE;
                    if (j6 == -1) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    j = j6;
                    c2 = 7;
                    break;
                case 7:
                    i32 = i32;
                    key = key;
                    jA5b = i32.A5b(key, j2, j);
                    if (jA5b <= j5) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    i82 = i82;
                    i82.A00 += jA5b;
                    c2 = '\t';
                    break;
                case '\t':
                    j2 += jA5b;
                    if (j6 != -1) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    j4 = j5;
                    c2 = 11;
                    break;
                case 11:
                    j6 -= j4;
                    c2 = 4;
                    break;
                case '\f':
                    j4 = jA5b;
                    c2 = 11;
                    break;
                case '\r':
                    jA5b = -jA5b;
                    if (jA5b != j3) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    return;
                case 15:
                    j = j3;
                    c2 = 7;
                    break;
                case 16:
                    i32 = i32;
                    key = key;
                    left = i32.A5n(key);
                    c2 = 3;
                    break;
                case 17:
                    return;
            }
        }
    }

    public static void A05(I3 i3, String str) {
        I7 cachedSpan = null;
        Iterator<I7> it = i3.A5c(str).iterator();
        while (true) {
            char c2 = it.hasNext() ? (char) 3 : (char) 5;
            while (true) {
                switch (c2) {
                    case 3:
                        it = it;
                        cachedSpan = it.next();
                        c2 = 4;
                        break;
                    case 4:
                        try {
                            i3 = i3;
                            cachedSpan = cachedSpan;
                            i3.ACU(cachedSpan);
                        } catch (I1 unused) {
                        }
                    case 5:
                        return;
                }
            }
        }
    }
}

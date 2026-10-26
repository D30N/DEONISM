package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.facebook.ads.AdError;
import d.b.a.b.k;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.9U, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9U {

    @VisibleForTesting
    public static int A03;
    public static byte[] A04;

    @Nullable
    public C9T A00;
    public boolean A01;
    public final File A02;

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 1);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A04 = new byte[]{-70, -35, -32, -39, -108, -101, -103, -25, -101, -108, -35, -25, -108, -30, -29, -24, -108, -43, -108, -26, -39, -43, -40, -43, -42, -32, -39, -108, -38, -35, -32, -39, 85, 112, 120, 123, 116, 115, 47, -125, 126, 47, 115, 116, 123, 116, -125, 116, 47, 117, 120, 123, 116, 47, 54, 52, -126, 121, -98, -90, -111, -100, -103, -108, 80, -106, -107, -92, -109, -104, 80, -93, -92, -111, -94, -92, 80, -103, -98, -108, -107, -88, 106, 80, 85, -108, -108, -89, -91, -79, -76, -90, 98, -88, -85, -82, -89, 98, -93, -82, -76, -89, -93, -90, -69, 98, -90, -85, -75, -78, -79, -75, -89, -90};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized C9L A06(int i, byte[] bArr, int i2, int[] iArr, int i3) throws IOException {
        C9T c9tA00 = A00();
        boolean z = false;
        int i4 = 1;
        if (i < 0) {
            throw new IOException(String.format(Locale.US, A01(57, 29, 47), Integer.valueOf(i)));
        }
        int i5 = i;
        int i6 = 0;
        long j = -1;
        while (true) {
            if (i5 >= c9tA00.A00) {
                break;
            }
            if ((i5 - i) + i3 >= iArr.length) {
                z = true;
                break;
            }
            long j2 = c9tA00.A03[i5];
            long j3 = (i5 == c9tA00.A00 - i4 ? c9tA00.A01 : c9tA00.A03[i5 + 1]) - j2;
            if (j == -1) {
                j = j2;
            }
            if (((int) j3) + i6 + i2 > bArr.length) {
                z = true;
                break;
            }
            i6 += (int) j3;
            iArr[(i5 - i) + i3] = (int) j3;
            i5++;
            i4 = 1;
        }
        if (i5 <= i) {
            return new C9L(z ? C9K.A03 : C9K.A04, i, i, 0);
        }
        c9tA00.A02.seek(j);
        c9tA00.A02.read(bArr, i2, i6);
        return new C9L(C9K.A02, i, i5, i6);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized boolean A09(byte[] bArr) throws IOException {
        C9T c9tA00 = A00();
        if (A05() == A03) {
            return false;
        }
        A03(c9tA00.A00, c9tA00.A01);
        A04(c9tA00.A01, bArr);
        c9tA00.A02.getFD().sync();
        c9tA00.A00++;
        c9tA00.A01 += bArr.length;
        return true;
    }

    static {
        A02();
        A03 = AdError.NETWORK_ERROR_CODE;
    }

    public C9U(File file) throws IOException {
        this.A02 = file;
        if (!file.exists()) {
            this.A00 = C9T.A03(file);
        } else if (file.isFile()) {
        } else {
            throw new IOException(String.format(Locale.US, A01(0, 32, k.AppCompatTheme_windowActionBar), file.getCanonicalPath()));
        }
    }

    private C9T A00() throws IOException {
        C9U c9u = this;
        char c2 = !c9u.A01 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c9u = c9u;
                    if (c9u.A00 != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c9u = c9u;
                    c9u.A00 = C9T.A04(c9u.A02);
                    c2 = 4;
                    break;
                case 4:
                    return c9u.A00;
                case 5:
                    throw new IOException(A01(86, 28, 65));
            }
        }
    }

    private void A03(int i, long j) throws IOException {
        this.A00.A03[i] = j;
        this.A00.A02.seek(C9T.A02(i));
        this.A00.A02.writeLong(j);
    }

    private void A04(long j, byte[] bArr) throws IOException {
        this.A00.A02.seek(j);
        this.A00.A02.write(bArr);
    }

    public final synchronized int A05() throws IOException {
        return A00().A00;
    }

    public final synchronized void A07() throws IOException {
        this.A01 = true;
        if (this.A00 == null) {
            return;
        }
        RandomAccessFile randomAccessFile = this.A00.A02;
        this.A00 = null;
        randomAccessFile.close();
    }

    public final synchronized void A08() throws IOException {
        if (!this.A01) {
            A07();
            if (!this.A02.delete()) {
                throw new IOException(String.format(Locale.US, A01(32, 25, 14), this.A02.getCanonicalPath()));
            }
        } else {
            throw new IOException(A01(86, 28, 65));
        }
    }
}

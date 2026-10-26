package com.facebook.ads.redexgen.X;

import android.util.Log;
import d.b.a.b.k;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: assets/audience_network.dex */
public abstract class RC implements C0C {
    public static byte[] A01;
    public static final String A02;
    public final ExecutorService A00 = Executors.newSingleThreadExecutor();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private long A02(List<File> list) {
        long length = 0;
        Iterator<File> it = list.iterator();
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
                    it = it;
                    length += it.next().length();
                    c2 = 2;
                    break;
                case 4:
                    return length;
            }
        }
    }

    public static String A03(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 57);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A01 = new byte[]{-79, -34, -34, -37, -34, -116, -48, -47, -40, -47, -32, -43, -38, -45, -116, -46, -43, -40, -47, -116, -79, -49, -47, -42, -45, -114, -44, -41, -38, -45, -114, -52, 18, 27, 30, -52, 32, 30, 21, 25, 25, 21, 26, 19, -52, 15, 13, 15, 20, 17, -125, -52, -42, -125, -57, -56, -49, -56, -41, -56, -57, -125, -59, -56, -58, -60, -40, -42, -56, -125, -52, -41, -125, -56, -37, -58, -56, -56, -57, -42, -125, -58, -60, -58, -53, -56, -125, -49, -52, -48, -52, -41};
    }

    public abstract boolean A08(File file, long j, int i);

    static {
        A04();
        A02 = RC.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(File file) throws IOException {
        C0F.A03(file);
        A07(C0F.A01(file.getParentFile()));
    }

    private void A07(List<File> list) {
        RC rc = this;
        long length = 0;
        File file = null;
        long jA02 = rc.A02(list);
        int size = list.size();
        Iterator<File> it = list.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    rc = rc;
                    it = it;
                    file = it.next();
                    if (!rc.A08(file, jA02, size)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 2;
                        break;
                    }
                case 4:
                    file = file;
                    length = file.length();
                    if (!file.delete()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    file = file;
                    size--;
                    jA02 -= length;
                    Log.i(A02, A03(20, 11, 53) + file + A03(50, 42, 42));
                    c2 = 2;
                    break;
                case 6:
                    file = file;
                    Log.e(A02, A03(0, 20, 51) + file + A03(31, 19, k.AppCompatTheme_windowActionBar));
                    c2 = 2;
                    break;
                case 7:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0C
    public void ADc(final File file) throws IOException {
        this.A00.submit(new Callable<Void>(file) { // from class: com.facebook.ads.redexgen.X.0G
            public final File A00;

            {
                this.A00 = file;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final Void call() throws Exception {
                this.A01.A06(this.A00);
                return null;
            }
        });
    }
}

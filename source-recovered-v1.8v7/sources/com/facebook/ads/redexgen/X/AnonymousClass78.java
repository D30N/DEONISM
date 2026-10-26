package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* renamed from: com.facebook.ads.redexgen.X.78, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass78 implements Callable<Boolean> {
    public static byte[] A02;
    public final C7B A00;
    public final /* synthetic */ C7C A01;

    static {
        A02();
    }

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 28);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{-24, -37, -42, -41, -31, -34, -46, -29, -36, -26, -31};
    }

    public AnonymousClass78(C7C c7c, C7B c7b) {
        this.A01 = c7c;
        this.A00 = c7b;
    }

    private final Boolean A00() throws Throwable {
        if (C0601Ko.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            AnonymousClass06 anonymousClass06 = new AnonymousClass06(this.A00.A08, this.A00.A07, this.A00.A06, this.A00.A04 ? A01(5, 6, 85) : A01(0, 5, 86), this.A00.A02, this.A00.A05);
            anonymousClass06.A04 = this.A00.A03;
            anonymousClass06.A02 = this.A00.A01;
            anonymousClass06.A05 = this.A00.A04;
            if (C7F.A06(this.A01.A04)) {
                C7C.A0D.put(this.A00.A08, anonymousClass06);
            }
            return Boolean.valueOf(C7C.A02(this.A01.A04.A00()).ACe(anonymousClass06) != null);
        } catch (Throwable th) {
            C0601Ko.A00(th, this);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Boolean, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        AnonymousClass78 anonymousClass78 = this;
        AnonymousClass78 anonymousClass782 = null;
        char c2 = C0601Ko.A02(anonymousClass78) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (Object) 0;
                case 3:
                    anonymousClass78 = anonymousClass78;
                    anonymousClass782 = anonymousClass78;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        anonymousClass782 = anonymousClass782;
                        return anonymousClass782.A00();
                    } catch (Throwable th) {
                        C0601Ko.A00(th, anonymousClass782);
                        return (Object) 0;
                    }
            }
        }
    }
}

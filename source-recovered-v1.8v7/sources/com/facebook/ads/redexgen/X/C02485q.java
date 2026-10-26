package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.ads.redexgen.X.5q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02485q {
    public static byte[] A00;
    public static final AtomicReference<C02535v> A01;

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 48);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{76, 88, 73, 68, 72, 67, 78, 72, 114, 67, 72, 89, 90, 66, 95, 70, 3, 73, 72, 85, 36, 38, 45, 38, 49, 42, 32};
    }

    static {
        A01();
        A01 = new AtomicReference<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(@javax.annotation.Nullable android.app.Activity r4, android.view.MotionEvent r5) {
        /*
            r0 = 0
            r0 = 0
            r0 = 0
            r0 = 2
        L4:
            switch(r0) {
                case 2: goto L8;
                case 3: goto L7;
                case 4: goto L22;
                case 5: goto L14;
                default: goto L7;
            }
        L7:
            goto L4
        L8:
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L23
            boolean r0 = com.facebook.ads.redexgen.X.C02495r.A0P(r4)     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L12
            r0 = 4
            goto L4
        L12:
            r0 = 5
            goto L4
        L14:
            java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.X.5v> r0 = com.facebook.ads.redexgen.X.C02485q.A01     // Catch: java.lang.Throwable -> L23
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L23
            com.facebook.ads.redexgen.X.5v r0 = (com.facebook.ads.redexgen.X.C02535v) r0     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L41
            r0.A05(r5)     // Catch: java.lang.Throwable -> L23
            goto L41
        L22:
            return
        L23:
            r1 = move-exception
            com.facebook.ads.redexgen.X.XJ r0 = com.facebook.ads.redexgen.X.C8B.A00()
            if (r0 == 0) goto L41
            com.facebook.ads.redexgen.X.8Z r5 = r0.A04()
            int r4 = com.facebook.ads.redexgen.X.C03008a.A0z
            com.facebook.ads.redexgen.X.8b r3 = new com.facebook.ads.redexgen.X.8b
            r3.<init>(r1)
            r2 = 20
            r1 = 7
            r0 = 115(0x73, float:1.61E-43)
            java.lang.String r0 = A00(r2, r1, r0)
            r5.A83(r0, r4, r3)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C02485q.A02(android.app.Activity, android.view.MotionEvent):void");
    }

    public static void A03(Context context) {
        if (!(context instanceof Application)) {
            return;
        }
        LC.A04(new U4());
    }

    public static void A04(XJ xj, @Nullable String str) {
        M3.A05.execute(new U1(xj, str));
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A05(XJ xj, String str) {
        C02535v c02535v = null;
        char c2 = !C02495r.A0P(xj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    if (A01.get() != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    str = str;
                    if (!AnonymousClass71.A0E(AnonymousClass71.A03(str))) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    A04(xj, str);
                    return;
                case 6:
                    c02535v = A01.get();
                    if (c02535v == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    xj = xj;
                    str = str;
                    c02535v = c02535v;
                    M3.A05.execute(new U2(c02535v, str, xj));
                    c2 = '\b';
                    break;
                case '\b':
                    return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.facebook.ads.redexgen.X.5t] */
    @SuppressLint({"CatchGeneralException"})
    public static synchronized void A07(XJ xj, @Nullable String str) {
        try {
        } finally {
        }
        if (A01.get() != null) {
            return;
        }
        if (C02495r.A0P(xj)) {
            U6 u6 = new U6(xj);
            U5 u5 = new U5(xj);
            C02525u c02525uA0J = new Object() { // from class: com.facebook.ads.redexgen.X.5t
                public double A00;
                public float A01;
                public int A02;
                public int A03;
                public int A04;
                public int A05;
                public int A06;
                public long A07;
                public long A08;
                public long A09;
                public AnonymousClass63 A0A;
                public AnonymousClass64 A0B;
                public AnonymousClass65 A0C;
                public EnumC02656h A0D;
                public InterfaceC02776t A0E;
                public InterfaceC02786u A0F;
                public Class A0G;

                @Nullable
                public String A0H;

                @Nullable
                public String A0I;
                public String A0J;
                public HashMap<Integer, Integer> A0K;
                public Map<Integer, String> A0L;
                public ScheduledExecutorService A0M;
                public boolean A0N;

                public final C02515t A00(double d2) {
                    this.A00 = d2;
                    return this;
                }

                public final C02515t A01(float f) {
                    this.A01 = f;
                    return this;
                }

                public final C02515t A02(int i) {
                    this.A02 = i;
                    return this;
                }

                public final C02515t A03(int i) {
                    this.A03 = i;
                    return this;
                }

                public final C02515t A04(int i) {
                    this.A04 = i;
                    return this;
                }

                public final C02515t A05(int i) {
                    this.A05 = i;
                    return this;
                }

                public final C02515t A06(int i) {
                    this.A06 = i;
                    return this;
                }

                public final C02515t A07(long j) {
                    this.A07 = j;
                    return this;
                }

                public final C02515t A08(long j) {
                    this.A08 = j;
                    return this;
                }

                public final C02515t A09(AnonymousClass63 anonymousClass63) {
                    this.A0A = anonymousClass63;
                    return this;
                }

                public final C02515t A0A(AnonymousClass64 anonymousClass64) {
                    this.A0B = anonymousClass64;
                    return this;
                }

                public final C02515t A0B(AnonymousClass65 anonymousClass65) {
                    this.A0C = anonymousClass65;
                    return this;
                }

                public final C02515t A0C(EnumC02656h enumC02656h) {
                    this.A0D = enumC02656h;
                    return this;
                }

                public final C02515t A0D(Class cls) {
                    this.A0G = cls;
                    return this;
                }

                public final C02515t A0E(@Nullable String str2) {
                    this.A0I = str2;
                    return this;
                }

                public final C02515t A0F(String str2) {
                    this.A0J = str2;
                    return this;
                }

                public final C02515t A0G(HashMap<Integer, Integer> circularBufferLengthMap) {
                    this.A0K = circularBufferLengthMap;
                    return this;
                }

                public final C02515t A0H(Map map) {
                    this.A0L = map;
                    return this;
                }

                public final C02515t A0I(boolean z) {
                    this.A0N = z;
                    return this;
                }

                public final C02525u A0J() {
                    C02525u c02525u = new C02525u();
                    c02525u.A0J = this.A0N;
                    c02525u.A02 = this.A04;
                    c02525u.A0G = this.A0K;
                    c02525u.A01 = this.A03;
                    c02525u.A00 = this.A02;
                    c02525u.A04 = this.A06;
                    c02525u.A0F = this.A0J;
                    c02525u.A07 = this.A0B;
                    c02525u.A06 = this.A0A;
                    double unused = C02525u.A0K = this.A00;
                    c02525u.A09 = this.A0D;
                    c02525u.A0H = this.A0L;
                    c02525u.A03 = this.A05;
                    c02525u.A0C = this.A0G;
                    c02525u.A08 = this.A0C;
                    float unused2 = C02525u.A0L = this.A01;
                    long unused3 = C02525u.A0N = this.A08;
                    long unused4 = C02525u.A0M = this.A07;
                    c02525u.A05 = this.A09;
                    c02525u.A0B = this.A0F;
                    c02525u.A0A = this.A0E;
                    c02525u.A0I = this.A0M;
                    c02525u.A0D = this.A0H;
                    c02525u.A0E = this.A0I;
                    return c02525u;
                }
            }.A0I(true).A04(C02495r.A05(xj)).A02(C02495r.A03(xj)).A03(C02495r.A04(xj)).A06(C02495r.A07(xj)).A0G(C02495r.A0M()).A0A(u6).A09(u5.A00()).A00(C02495r.A01(xj)).A0C(EnumC02656h.A0F).A0F(C02495r.A0D(xj)).A0H(C02495r.A0N(xj)).A05(C02495r.A06(xj)).A0D(Build.class).A01(C02495r.A02(xj)).A08(C02495r.A09(xj)).A07(C02495r.A08(xj)).A0B(u5).A0E(A00(0, 20, 29)).A0J();
            if (C02495r.A0Q(xj)) {
                A03(xj.getApplicationContext());
            }
            C02535v c02535v = new C02535v(xj, c02525uA0J, C02495r.A0A(xj));
            if (str != null) {
                c02535v.A06(str);
            }
            A01.set(c02535v);
        }
    }
}

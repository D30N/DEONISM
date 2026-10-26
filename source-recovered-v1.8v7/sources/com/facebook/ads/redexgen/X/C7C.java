package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.util.Log;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.7C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7C {
    public static AnonymousClass00 A0A;
    public static byte[] A0B;
    public static final String A0C;
    public static final Map<String, AnonymousClass06> A0D;
    public long A00;
    public C0565Jd A01;
    public final C7D A03;
    public final C8C A04;
    public final boolean A08;
    public final boolean A09;
    public final Map<String, Bitmap> A07 = Collections.synchronizedMap(new HashMap());
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final List<Callable<Boolean>> A05 = new ArrayList();
    public final List<Callable<Boolean>> A06 = new ArrayList();

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 30);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0D() {
        A0B = new byte[]{-42, -12, -10, -5, -8, -77, 6, 7, -12, 5, 7, -8, -9, -63, -104, -101, -115, -112, -117, -96, -107, -103, -111, -117, -103, -97, -90, -60, -58, -53, -52, -47, -54, -125, -55, -60, -52, -49, -56, -57, -118, -120, -118, -113, -116, 106, -106, -108, -105, -109, -116, -101, -112, -106, -107, 111, -106, -106, -110, -103, -102, -107, -54, -99, -55, -106, -101, -108, -57, -78, -76, -65, -61, -72, -66, -67, 111, -58, -73, -72, -69, -76, 111, -76, -57, -76, -78, -60, -61, -72, -67, -74, 111, -78, -80, -78, -73, -76, 111, -77, -66, -58, -67, -69, -66, -80, -77, -62, 125, -50, -61, -54, -46, -77, -79, -77, -72, -75, -106, -79, -71, -68, -59, -62, -75, -104, -65, -65, -69, -125, -118, -120, -76, -76, -75, -125, -124, -88, -58, -56, -51, -50, -45, -52, -123, -40, -39, -58, -41, -39, -54, -55, -109, -109, -109, -5, 14, -5, -7, 11, 10, -5, -29, -26, -40, -37, -102, -49, -102, -98, -53, -53, -53, 98, Byte.MIN_VALUE, -126, -121, -120, -115, -122, 63, -126, -114, -116, -113, -117, -124, -109, -124};
    }

    static {
        A0D();
        A0C = C7C.class.getSimpleName();
        A0D = Collections.synchronizedMap(new HashMap());
    }

    public C7C(C8C c8c) {
        this.A04 = c8c;
        this.A03 = C7D.A06(c8c.A00());
        this.A08 = JQ.A1Y(c8c);
        this.A09 = C0724Pl.A03() && JQ.A1b(c8c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.07] */
    public static AnonymousClass00 A02(XJ xj) {
        if (A0A == null) {
            A0A = AnonymousClass01.A00(xj, new Object() { // from class: com.facebook.ads.redexgen.X.07
                public int A00;
                public int A01;
                public boolean A02;
                public boolean A03;
                public boolean A04;

                public final AnonymousClass07 A00(int i) {
                    this.A00 = i;
                    return this;
                }

                public final AnonymousClass07 A01(int i) {
                    this.A01 = i;
                    return this;
                }

                public final AnonymousClass07 A02(boolean z) {
                    this.A02 = z;
                    return this;
                }

                public final AnonymousClass07 A03(boolean z) {
                    this.A03 = z;
                    return this;
                }

                public final AnonymousClass07 A04(boolean z) {
                    this.A04 = z;
                    return this;
                }

                public final AnonymousClass08 A05() {
                    return new AnonymousClass08(this.A00, this.A02, this.A01, this.A03, this.A04);
                }
            }.A00(JQ.A04(xj)).A02(xj.A03().A7a()).A01(-1).A03(JQ.A0e(xj)).A04(JQ.A1g(xj)).A05(), A05(xj));
        }
        return A0A;
    }

    public static AnonymousClass06 A04(C8C c8c, String str) {
        AnonymousClass06 anonymousClass06 = null;
        AnonymousClass06 anonymousClass062 = A0D.get(str);
        char c2 = C7F.A06(c8c) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass062 = anonymousClass062;
                    if (anonymousClass062 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    anonymousClass062 = anonymousClass062;
                    anonymousClass06 = new AnonymousClass06(anonymousClass062);
                    c2 = 4;
                    break;
                case 4:
                    return anonymousClass06;
                case 5:
                    str = str;
                    anonymousClass06 = new AnonymousClass06(str);
                    c2 = 4;
                    break;
            }
        }
    }

    public static C0M A05(XJ xj) {
        return new XF(xj);
    }

    public static AtomicBoolean A0B(ArrayList<Callable<Boolean>> arrayList) {
        Exception e = null;
        Future future = null;
        Iterator it = null;
        AtomicBoolean atomicBoolean = null;
        boolean z = false;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<Callable<Boolean>> it2 = arrayList.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it2 = it2;
                    if (it2.hasNext()) {
                        c2 = 3;
                    } else {
                        c2 = 4;
                        continue;
                    }
                case 3:
                    arrayList2 = arrayList2;
                    it2 = it2;
                    Future<Boolean> future2 = M3.A02().submit(it2.next());
                    arrayList2.add(future2);
                    c2 = 2;
                    continue;
                case 4:
                    atomicBoolean = new AtomicBoolean(true);
                    c2 = 5;
                    continue;
                case 5:
                    arrayList2 = arrayList2;
                    it = arrayList2.iterator();
                    break;
                case '\t':
                    it = it;
                    future = (Future) it.next();
                    if (atomicBoolean.get()) {
                        c2 = '\r';
                    } else {
                        c2 = 18;
                        continue;
                    }
                case '\r':
                    try {
                        future = future;
                        if (((Boolean) future.get()).booleanValue()) {
                            c2 = 17;
                        } else {
                            c2 = 18;
                            continue;
                        }
                    } catch (InterruptedException e2) {
                        e = e2;
                        c2 = 22;
                    } catch (ExecutionException e3) {
                        e = e3;
                        c2 = 22;
                    }
                case 17:
                    z = true;
                    c2 = 19;
                    continue;
                case 18:
                    z = false;
                    c2 = 19;
                    continue;
                case 19:
                    atomicBoolean = atomicBoolean;
                    atomicBoolean.set(z);
                    break;
                case 22:
                    atomicBoolean = atomicBoolean;
                    e = e;
                    Log.e(A0C, A08(67, 42, 49), e);
                    atomicBoolean.set(false);
                    c2 = 23;
                    continue;
                case 23:
                    return atomicBoolean;
            }
            c2 = it.hasNext() ? '\t' : (char) 23;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(EnumC0564Jc enumC0564Jc) {
        if (this.A01 == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(A08(14, 12, 14), C0627Lq.A04(this.A00));
        this.A01.A02(enumC0564Jc, map);
    }

    @Nullable
    public final Bitmap A0H(String str) {
        return this.A07.get(str);
    }

    @Nullable
    public final Bitmap A0I(String str, int i, int i2) {
        if (this.A08) {
            AnonymousClass06 anonymousClass06A04 = A04(this.A04, str);
            anonymousClass06A04.A03 = A08(109, 4, 61);
            anonymousClass06A04.A01 = i2;
            anonymousClass06A04.A00 = i;
            return A02(this.A04.A00()).ACd(anonymousClass06A04, true).A00();
        }
        return this.A03.A0D(this.A04, str, i, i2, A08(162, 4, 89));
    }

    public final String A0J(String cachedUrl) {
        C7C c7c = this;
        String str = null;
        String strACf = null;
        char c2 = c7c.A08 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c7c = c7c;
                    cachedUrl = cachedUrl;
                    AnonymousClass06 anonymousClass06A04 = A04(c7c.A04, cachedUrl);
                    anonymousClass06A04.A03 = A08(109, 4, 61);
                    strACf = A02(c7c.A04.A00()).ACf(anonymousClass06A04);
                    if (strACf == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    strACf = strACf;
                    str = strACf;
                    c2 = 4;
                    break;
                case 4:
                    return str;
                case 5:
                    cachedUrl = cachedUrl;
                    str = cachedUrl;
                    c2 = 4;
                    break;
                case 6:
                    return c7c.A03.A0E(cachedUrl);
            }
        }
    }

    public final String A0K(String cachedUrl) {
        String str = null;
        AnonymousClass06 anonymousClass06A04 = A04(this.A04, cachedUrl);
        anonymousClass06A04.A03 = A08(109, 4, 61);
        String strACf = A02(this.A04.A00()).ACf(anonymousClass06A04);
        char c2 = strACf != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    strACf = strACf;
                    str = strACf;
                    c2 = 3;
                    break;
                case 3:
                    return str;
                case 4:
                    cachedUrl = cachedUrl;
                    str = cachedUrl;
                    c2 = 3;
                    break;
            }
        }
    }

    public final String A0L(String cachedUrl) {
        C7C c7c = this;
        String str = null;
        String strACf = null;
        char c2 = c7c.A09 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return cachedUrl;
                case 3:
                    c7c = c7c;
                    cachedUrl = cachedUrl;
                    AnonymousClass06 anonymousClass06A04 = A04(c7c.A04, cachedUrl);
                    anonymousClass06A04.A03 = A08(109, 4, 61);
                    strACf = A02(c7c.A04.A00()).ACf(anonymousClass06A04);
                    if (strACf == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    strACf = strACf;
                    str = strACf;
                    c2 = 5;
                    break;
                case 5:
                    return str;
                case 6:
                    cachedUrl = cachedUrl;
                    str = cachedUrl;
                    c2 = 5;
                    break;
            }
        }
    }

    public final void A0M() {
        KJ.A05(A08(40, 19, 9), A08(173, 16, 1), A08(59, 8, 71));
    }

    public final void A0N() {
        KJ.A05(A08(113, 16, 50), A08(26, 14, 69), A08(166, 7, 75));
    }

    public final void A0O() {
        this.A07.clear();
    }

    public final void A0P(@Nullable AnonymousClass74 anonymousClass74, AnonymousClass75 anonymousClass75) {
        KJ.A05(A08(155, 7, k.AppCompatTheme_windowFixedWidthMajor), A08(137, 18, 71), A08(129, 8, 52));
        this.A00 = System.currentTimeMillis();
        C7F.A02(this.A04, anonymousClass75, C7F.A07, A08(0, 14, k.AppCompatTheme_windowActionModeOverlay), -1L);
        M3.A03().execute(new XE(this, new ArrayList(this.A05), anonymousClass74, anonymousClass75, new ArrayList(this.A06)));
        this.A05.clear();
        this.A06.clear();
    }

    public final void A0Q(final AnonymousClass79 anonymousClass79) {
        final C7C c7c = this;
        Callable<Boolean> callable = new Callable<Boolean>(anonymousClass79) { // from class: com.facebook.ads.redexgen.X.7A
            public static byte[] A02;
            public final AnonymousClass79 A00;

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
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 72);
                            i4++;
                            c2 = 2;
                            break;
                        case 4:
                            return new String(bArrCopyOfRange);
                    }
                }
            }

            public static void A02() {
                A02 = new byte[]{42, 46, 34, 36, 38};
            }

            {
                this.A00 = anonymousClass79;
            }

            private final Boolean A00() throws Throwable {
                if (C0601Ko.A02(this)) {
                    return null;
                }
                try {
                    TrafficStats.setThreadStatsTag(61453);
                    AnonymousClass06 anonymousClass06 = new AnonymousClass06(this.A00.A07, this.A00.A06, this.A00.A05, A01(0, 5, 11), this.A00.A01, this.A00.A02);
                    anonymousClass06.A01 = this.A00.A04;
                    anonymousClass06.A00 = this.A00.A03;
                    if (C7F.A06(this.A01.A04)) {
                        C7C.A0D.put(this.A00.A07, anonymousClass06);
                    }
                    boolean zA01 = false;
                    if (this.A01.A08) {
                        zA01 = C7C.A02(this.A01.A04.A00()).ACd(anonymousClass06, false).A01();
                    } else if (this.A01.A03.A0C(this.A00) != null) {
                        zA01 = true;
                    }
                    C7H c7h = this.A00.A00;
                    if (c7h != null && c7h.A02()) {
                        int iA00 = c7h.A00();
                        int iA01 = c7h.A01();
                        if (iA00 <= 0 || iA01 <= 0) {
                            if (this.A01.A08) {
                                A04(this.A00.A07, anonymousClass06);
                            } else {
                                A03(this.A00.A03, this.A00.A04);
                            }
                        } else if (this.A01.A08) {
                            anonymousClass06.A00 = iA00;
                            anonymousClass06.A01 = iA01;
                            A04(this.A00.A07, anonymousClass06);
                        } else {
                            A03(iA00, iA01);
                        }
                    }
                    return Boolean.valueOf(zA01);
                } catch (Throwable th) {
                    C0601Ko.A00(th, this);
                    return null;
                }
            }

            private void A03(int i, int i2) {
                Bitmap bitmapA0D = this.A01.A03.A0D(this.A01.A04, this.A00.A07, i, i2, this.A00.A01);
                if (bitmapA0D == null) {
                    return;
                }
                this.A01.A07.put(this.A00.A07, bitmapA0D);
            }

            private void A04(String str, AnonymousClass06 anonymousClass06) {
                Bitmap bitmapA00 = C7C.A02(this.A01.A04.A00()).ACd(anonymousClass06, true).A00();
                if (bitmapA00 == null) {
                    return;
                }
                this.A01.A07.put(str, bitmapA00);
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Boolean, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Boolean, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
                C7A c7a = this;
                C7A c7a2 = null;
                char c2 = C0601Ko.A02(c7a) ? (char) 2 : (char) 3;
                while (true) {
                    switch (c2) {
                        case 2:
                            return (Object) 0;
                        case 3:
                            c7a = c7a;
                            c7a2 = c7a;
                            c2 = 4;
                            break;
                        case 4:
                            try {
                                c7a2 = c7a2;
                                return c7a2.A00();
                            } catch (Throwable th) {
                                C0601Ko.A00(th, c7a2);
                                return (Object) 0;
                            }
                    }
                }
            }
        };
        char c2 = !anonymousClass79.A02 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c7c = c7c;
                    callable = (C7A) callable;
                    c7c.A05.add(callable);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c7c = c7c;
                    callable = (C7A) callable;
                    c7c.A06.add(callable);
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A0R(AnonymousClass79 anonymousClass79) {
        anonymousClass79.A02 = true;
        A0Q(anonymousClass79);
    }

    public final void A0S(C7B c7b) {
        this.A05.add(new AnonymousClass78(this, c7b));
    }

    public final void A0T(C7B c7b) {
        c7b.A05 = true;
        this.A06.add(new AnonymousClass78(this, c7b));
    }

    public final void A0U(C7B c7b) {
        C7C c7c = this;
        c7b.A05 = true;
        char c2 = c7c.A09 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c7c = c7c;
                    c7b = c7b;
                    c7c.A06.add(new AnonymousClass77(c7c, c7b));
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c7c = c7c;
                    c7b = c7b;
                    c7c.A06.add(new AnonymousClass78(c7c, c7b));
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A0V(C7B c7b) {
        C7C c7c = this;
        char c2 = c7c.A09 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c7c = c7c;
                    c7b = c7b;
                    c7c.A05.add(new AnonymousClass77(c7c, c7b));
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c7c = c7c;
                    c7b = c7b;
                    c7c.A05.add(new AnonymousClass78(c7c, c7b));
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A0W(C0565Jd c0565Jd) {
        this.A01 = c0565Jd;
    }

    public final boolean A0X(String str) {
        boolean z = false;
        AnonymousClass06 anonymousClass06A04 = A04(this.A04, str);
        anonymousClass06A04.A03 = A08(109, 4, 61);
        char c2 = A02(this.A04.A00()).ACf(anonymousClass06A04) != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.6s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC02766s<T> {
    public static byte[] A04;
    public static final String A05;
    public final long A00;

    @Nullable
    public final C02746q A01;
    public final EnumC02756r A02;
    public final T A03;

    public static String A03(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 6);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A04 = new byte[]{-74, -57, -53, -116, -36};
    }

    public abstract int A06() throws Exception;

    public abstract JSONObject A08(JSONObject jSONObject) throws JSONException;

    public abstract boolean A0A(AbstractC02766s<T> abstractC02766s);

    static {
        A04();
        A05 = AbstractC02766s.class.getSimpleName();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    public AbstractC02766s(long j, @Nullable C02746q c02746q, T signalValue, EnumC02756r enumC02756r) {
        this.A00 = j;
        this.A01 = c02746q;
        this.A03 = signalValue;
        this.A02 = enumC02756r;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    private final long A00() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    @Nullable
    private final C02746q A01() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    private final EnumC02756r A02() {
        return this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    @SuppressLint({"CatchGeneralException"})
    public final int A05() {
        AbstractC02766s<T> abstractC02766s = this;
        int i = 0;
        int length = 0;
        char c2 = abstractC02766s.A01() != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    abstractC02766s = abstractC02766s;
                    length = abstractC02766s.A01().A02().getBytes().length;
                    c2 = 3;
                    break;
                case 3:
                    i = length + 8;
                    c2 = 5;
                    break;
                case 4:
                    length = 0;
                    c2 = 3;
                    break;
                case 5:
                    try {
                        return abstractC02766s.A06() + i;
                    } catch (Exception e) {
                        AnonymousClass66.A03(e);
                        return i;
                    }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    public final T A07() {
        return this.A03;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #0 {all -> 0x006d, blocks: (B:4:0x0007, B:5:0x0019, B:8:0x001f, B:9:0x0030, B:11:0x0036, B:13:0x003c, B:14:0x0040, B:17:0x004e, B:18:0x005a, B:20:0x005e), top: B:24:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[Catch: all -> 0x006d, TRY_ENTER, TryCatch #0 {all -> 0x006d, blocks: (B:4:0x0007, B:5:0x0019, B:8:0x001f, B:9:0x0030, B:11:0x0036, B:13:0x003c, B:14:0x0040, B:17:0x004e, B:18:0x005a, B:20:0x005e), top: B:24:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:4:0x0007, B:5:0x0019, B:8:0x001f, B:9:0x0030, B:11:0x0036, B:13:0x003c, B:14:0x0040, B:17:0x004e, B:18:0x005a, B:20:0x005e), top: B:24:0x0007 }] */
    @android.annotation.SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject A09(boolean r7) {
        /*
            r6 = this;
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            if (r7 == 0) goto L19
            r2 = 4
            r1 = 1
            r0 = 98
            java.lang.String r4 = A03(r2, r1, r0)     // Catch: java.lang.Throwable -> L6d
            long r2 = r6.A00     // Catch: java.lang.Throwable -> L6d
            float r1 = (float) r2     // Catch: java.lang.Throwable -> L6d
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r0
            double r0 = (double) r1     // Catch: java.lang.Throwable -> L6d
            r5.put(r4, r0)     // Catch: java.lang.Throwable -> L6d
        L19:
            com.facebook.ads.redexgen.X.6q r0 = r6.A01     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L30
            if (r7 == 0) goto L30
            r2 = 0
            r1 = 3
            r0 = 77
            java.lang.String r1 = A03(r2, r1, r0)     // Catch: java.lang.Throwable -> L6d
            com.facebook.ads.redexgen.X.6q r0 = r6.A01     // Catch: java.lang.Throwable -> L6d
            org.json.JSONObject r0 = r0.A03()     // Catch: java.lang.Throwable -> L6d
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L6d
        L30:
            com.facebook.ads.redexgen.X.6r r1 = r6.A02     // Catch: java.lang.Throwable -> L6d
            com.facebook.ads.redexgen.X.6r r0 = com.facebook.ads.redexgen.X.EnumC02756r.A04     // Catch: java.lang.Throwable -> L6d
            if (r1 == r0) goto L40
            java.lang.Object r0 = r6.A07()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L40
            r6.A08(r5)     // Catch: java.lang.Throwable -> L6d
            goto L71
        L40:
            com.facebook.ads.redexgen.X.6r r4 = r6.A02     // Catch: java.lang.Throwable -> L6d
            com.facebook.ads.redexgen.X.6r r3 = com.facebook.ads.redexgen.X.EnumC02756r.A04     // Catch: java.lang.Throwable -> L6d
            r2 = 3
            r1 = 1
            r0 = 33
            java.lang.String r2 = A03(r2, r1, r0)
            if (r4 != r3) goto L5a
            T r0 = r6.A03     // Catch: java.lang.Throwable -> L6d
            com.facebook.ads.redexgen.X.6p r0 = (com.facebook.ads.redexgen.X.C02736p) r0     // Catch: java.lang.Throwable -> L6d
            org.json.JSONObject r0 = r0.A08()     // Catch: java.lang.Throwable -> L6d
            r5.put(r2, r0)     // Catch: java.lang.Throwable -> L6d
            goto L71
        L5a:
            T r0 = r6.A03     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L71
            com.facebook.ads.redexgen.X.6p r1 = new com.facebook.ads.redexgen.X.6p     // Catch: java.lang.Throwable -> L6d
            com.facebook.ads.redexgen.X.6o r0 = com.facebook.ads.redexgen.X.EnumC02726o.A06     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L6d
            org.json.JSONObject r0 = r1.A08()     // Catch: java.lang.Throwable -> L6d
            r5.put(r2, r0)     // Catch: java.lang.Throwable -> L6d
            goto L71
        L6d:
            r0 = move-exception
            com.facebook.ads.redexgen.X.AnonymousClass66.A03(r0)
        L71:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC02766s.A09(boolean):org.json.JSONObject");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    public final boolean A0B(@Nullable AbstractC02766s<T> abstractC02766s, EnumSet<EnumC02656h> enumSet) {
        AbstractC02766s<T> abstractC02766s2 = this;
        long jA08 = 0;
        boolean z = false;
        boolean zA0A = false;
        boolean z2 = false;
        char c2 = abstractC02766s == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    abstractC02766s2 = abstractC02766s2;
                    abstractC02766s = abstractC02766s;
                    if (abstractC02766s2.A02() == abstractC02766s.A02()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    abstractC02766s2 = abstractC02766s2;
                    if (abstractC02766s2.A02() != EnumC02756r.A04) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    abstractC02766s = abstractC02766s;
                    if (abstractC02766s.A02() != EnumC02756r.A04) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return abstractC02766s2.A0A(abstractC02766s);
                case '\b':
                    enumSet = enumSet;
                    zA0A = false;
                    if (!enumSet.contains(EnumC02656h.A0D)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    abstractC02766s2 = abstractC02766s2;
                    abstractC02766s = abstractC02766s;
                    zA0A = abstractC02766s2.A0A(abstractC02766s);
                    c2 = '\n';
                    break;
                case '\n':
                    enumSet = enumSet;
                    if (!enumSet.contains(EnumC02656h.A0B)) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    abstractC02766s2 = abstractC02766s2;
                    if (abstractC02766s2.A01() == null) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    abstractC02766s = abstractC02766s;
                    if (abstractC02766s.A01() == null) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    abstractC02766s2 = abstractC02766s2;
                    abstractC02766s = abstractC02766s;
                    if (!abstractC02766s2.A01().A02().equals(abstractC02766s.A01().A02())) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    z = true;
                    c2 = 15;
                    break;
                case 15:
                    zA0A &= z;
                    c2 = 16;
                    break;
                case 16:
                    enumSet = enumSet;
                    if (!enumSet.contains(EnumC02656h.A0C)) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    abstractC02766s2 = abstractC02766s2;
                    if (abstractC02766s2.A02() == EnumC02756r.A0D) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    abstractC02766s2 = abstractC02766s2;
                    if (abstractC02766s2.A02() != EnumC02756r.A0B) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    jA08 = C02525u.A08();
                    c2 = 20;
                    break;
                case 20:
                    abstractC02766s2 = abstractC02766s2;
                    abstractC02766s = abstractC02766s;
                    if (Math.abs(abstractC02766s2.A00 - abstractC02766s.A00()) >= jA08) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    z2 = true;
                    c2 = 22;
                    break;
                case 22:
                    zA0A &= z2;
                    c2 = 23;
                    break;
                case 23:
                    return zA0A;
                case 24:
                    jA08 = C02525u.A09();
                    c2 = 20;
                    break;
                case 25:
                    z = false;
                    c2 = 15;
                    break;
            }
        }
    }
}

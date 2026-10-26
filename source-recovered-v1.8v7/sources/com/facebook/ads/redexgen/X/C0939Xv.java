package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.util.common.Preconditions;
import d.b.a.b.k;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Xv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0939Xv implements C9G {
    public static byte[] A03;
    public static final String A04;
    public final XJ A00;
    public final C9R<JT> A01;
    public final C9R<JT> A02;

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowMinWidthMinor);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A03 = new byte[]{99, 68, 76, 73, 64, 65, 5, 81, 74, 5, 87, 64, 68, 65, 5, 81, 77, 64, 5, 75, 80, 72, 71, 64, 87, 5, 74, 67, 5, 64, 83, 64, 75, 81, 86, 5, 67, 87, 74, 72, 5, 65, 68, 81, 68, 71, 68, 86, 64, 15, 46, 39, 46, 63, 46, 47, 107, 46, 61, 46, 37, 63, 113, 107, 105, 6, 29, 24, 29, 28, 4, 29, 22, 0, 22, 22, 12, 10, 11, 58, 12, 1, 51, 49, 126, 119, 49, 101, 104, 97, 116, 43, 49, 8, 5, 12, 25, 62, 27, 58, 9, 26, 17, 11, 44, 11, 16, 13, 30, 24, 26, 45, 26, 28, 16, 13, 27, 59, 30, 11, 30, 29, 30, 12, 26, 16, 55, 63, 58, 51, 50, 118, 34, 57, 118, 53, 58, 51, 55, 36, 118, 51, 32, 51, 56, 34, 37, 118, 37, 34, 57, 36, 55, 49, 51, 95, 120, 112, 117, 124, 125, 57, 109, 118, 57, 105, 120, 107, 106, 124, 57, 120, 119, 57, 124, 111, 124, 119, 109, 57, Byte.MAX_VALUE, 107, 118, 116, 57, 112, 119, 52, Byte.MAX_VALUE, 117, 112, 126, 113, 109, 57, 106, 109, 118, 107, 120, 126, 124, 38, 51, 51, 34, 42, 55, 51, 56, 31, 23, 18, 27, 26, 94, 10, 17, 94, 19, 17, 8, 27, 94, 27, 8, 27, 16, 10, 13, 94, 24, 12, 17, 19, 94, 23, 16, 83, 24, 18, 23, 25, 22, 10, 94, 13, 10, 17, 12, 31, 25, 27, 94, 28, 31, 29, 21, 94, 10, 17, 94, 27, 8, 27, 16, 10, 13, 94, 26, 31, 10, 31, 28, 31, 13, 27, 121, 94, 86, 83, 90, 91, 31, 75, 80, 31, 76, 90, 77, 86, 94, 83, 86, 69, 90, 31, 94, 91, 31, 90, 73, 90, 81, 75, 105, 126, 120, 116, 105, Byte.MAX_VALUE, 68, Byte.MAX_VALUE, 122, 111, 122, 121, 122, 104, 126, 96, 87, 81, 93, 64, 86, 18, 86, 83, 70, 83, 80, 83, 65, 87, 18, 84, 83, 91, 94, 71, 64, 87, 18, 93, 81, 81, 71, 64, 64, 87, 86, 18, 69, 90, 87, 92, 18, 64, 87, 83, 86, 91, 92, 85, 18, 87, 68, 87, 92, 70, 65, 28, 54, 17, 25, 28, 21, 20, 80, 4, 31, 80, 20, 21, 3, 21, 2, 25, 17, 28, 25, 10, 21, 80, 17, 30, 80, 21, 6, 21, 30, 4, 80, 22, 2, 31, 29, 80, 20, 17, 4, 17, 18, 17, 3, 21, 80, 17, 54, 62, 52, 49, 63, 48, 44, 117, 25, 60, 29, 46, 61, 54, 44, 11, 44, 55, 42, 57, 63, 61, 10, 61, 59, 55, 42, 60, 28, 57, 44, 57, 58, 57, 43, 61, 89, 92, 73, 92, Byte.MAX_VALUE, 105, Byte.MAX_VALUE, Byte.MAX_VALUE, 101, 99, 98, 83, 120, 101, 97, 105, 114, Byte.MAX_VALUE, 118, 107, 111, 103, 116, 111, 107, 101, 110};
    }

    static {
        A03();
        A04 = C0939Xv.class.getSimpleName();
    }

    public C0939Xv(XJ xj) throws IOException {
        this.A00 = xj;
        this.A01 = new Y3(C9O.A00(A00(97, 28, 4), xj), new C0937Xt(this));
        this.A02 = new Y3(C9O.A00(A00(418, 37, 35), xj), new C0938Xu(this));
    }

    private List<JSONObject> A01(List<JSONObject> list, byte[] bArr, int[] iArr) {
        C0939Xv c0939Xv = this;
        JSONException jsone = null;
        int i = 0;
        int i2 = 0;
        int length = iArr.length;
        int i3 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 < length) {
                        c2 = 3;
                    } else {
                        c2 = 4;
                        continue;
                    }
                case 3:
                    iArr = iArr;
                    i = iArr[i3];
                    if (i == 0) {
                        c2 = 4;
                    } else {
                        c2 = 5;
                        continue;
                    }
                case 4:
                    return list;
                case 5:
                    try {
                        bArr = bArr;
                        list.add(A02(bArr, i2, i));
                        break;
                    } catch (JSONException e) {
                        jsone = e;
                        if (!BuildConfigApi.isDebug()) {
                            c2 = '\t';
                            break;
                        } else {
                            c2 = '\b';
                            break;
                        }
                    }
                case '\b':
                    jsone = jsone;
                    Log.e(A04, A00(373, 45, 11), jsone);
                    c2 = '\t';
                    continue;
                case '\t':
                    c0939Xv = c0939Xv;
                    jsone = jsone;
                    c0939Xv.A05(C03008a.A1s, jsone);
                    break;
            }
            i2 += i;
            i3++;
            c2 = 2;
        }
    }

    public static JSONObject A02(byte[] bArr, int i, int i2) throws JSONException {
        return new JSONObject(new String(Arrays.copyOfRange(bArr, i, i + i2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i, String str) {
        C03018b c03018b = new C03018b(str);
        c03018b.A03(1);
        this.A00.A04().A84(A00(305, 15, 96), i, c03018b);
    }

    private void A05(int i, Throwable th) {
        this.A00.A04().A83(A00(305, 15, 96), i, new C03018b(th));
    }

    public static byte[] A07(String str, JT jt) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(471, 2, 96), str);
            jSONObject.put(A00(477, 5, k.AppCompatTheme_windowMinWidthMinor), jt.A08());
            jSONObject.put(A00(93, 4, 7), jt.A06().toString());
            jSONObject.put(A00(473, 4, k.AppCompatTheme_windowFixedWidthMinor), C0627Lq.A02(jt.A04()));
            jSONObject.put(A00(459, 12, k.AppCompatTheme_windowFixedHeightMinor), C0627Lq.A02(jt.A03()));
            jSONObject.put(A00(72, 10, 30), jt.A07());
            jSONObject.put(A00(455, 4, 70), new JSONObject(jt.A09()));
            jSONObject.put(A00(202, 7, 60), 0);
        } catch (JSONException e) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A04, A00(277, 28, 68), e);
            }
        }
        return jSONObject.toString().getBytes();
    }

    public static byte[] A09(JSONObject jSONObject) {
        return jSONObject.toString().getBytes();
    }

    public final int A0A() {
        C0939Xv c0939Xv = this;
        C03259a e = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0939Xv = c0939Xv;
                        return c0939Xv.A01.A6q();
                    } catch (C03259a e2) {
                        e = e2;
                        if (!BuildConfigApi.isDebug()) {
                            c2 = 7;
                            break;
                        } else {
                            c2 = 6;
                            break;
                        }
                    }
                case 6:
                    e = e;
                    Log.e(A04, A00(0, 49, 94), e);
                    c2 = 7;
                    break;
                case 7:
                    return 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2 A[Catch: 9a -> 0x0128, TryCatch #3 {9a -> 0x0128, blocks: (B:33:0x00dc, B:35:0x00e2, B:36:0x00f1, B:22:0x0089, B:24:0x008f, B:26:0x0095, B:27:0x00d2, B:39:0x00fa, B:40:0x00fe, B:42:0x0104, B:43:0x0114, B:44:0x0118, B:46:0x011e), top: B:61:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0B(int r13, java.util.Set<java.lang.String> r14, java.util.Set<java.lang.String> r15) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0939Xv.A0B(int, java.util.Set, java.util.Set):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0043 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<org.json.JSONObject> A0C(int r17) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0939Xv.A0C(int):java.util.List");
    }

    @Override // com.facebook.ads.redexgen.X.C9G
    public final void A3z() {
        C0939Xv c0939Xv = this;
        C03259a e = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c0939Xv = c0939Xv;
                        c0939Xv.A01.clear();
                        c0939Xv.A02.clear();
                        return;
                    } catch (C03259a e2) {
                        e = e2;
                        if (!BuildConfigApi.isDebug()) {
                            c2 = '\b';
                            break;
                        } else {
                            c2 = 7;
                            break;
                        }
                    }
                case 7:
                    e = e;
                    Log.e(A04, A00(125, 30, 45), e);
                    c2 = '\b';
                    break;
                case '\b':
                    c0939Xv.A05(C03008a.A1m, e);
                    return;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9D != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.C9G
    public final void AE0(final JT jt, final C9D<String> c9d) {
        Executor executor = M3.A06;
        final C9R<JT> c9r = this.A01;
        final XJ xj = this.A00;
        M0.A00(executor, new AsyncTask<Void, Void, String>(jt, c9d, c9r, xj) { // from class: com.facebook.ads.redexgen.X.9H
            public static byte[] A05;

            @Nullable
            public C03259a A00;
            public final C8C A01;
            public final C9D<String> A02;
            public final C9R<JT> A03;
            public final JT A04;

            static {
                A02();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 119);
                            i4++;
                            c2 = 2;
                            break;
                        case 4:
                            return new String(bArrCopyOfRange);
                    }
                }
            }

            public static void A02() {
                A05 = new byte[]{-33, -10, 35, 35, 32, 35, -47, 30, 22, 36, 36, 18, 24, 22, -47, 20, 18, 31, 31, 32, 37, -47, 19, 22, -47, 31, 38, 29, 29, -28, 7, -1, -1, 1, 6, -1, -72, -3, 14, -3, 6, 12, -46, -72, 42, 29, 27, 39, 42, 28, 23, 28, 25, 44, 25, 26, 25, 43, 29};
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9D != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9R != com.facebook.ads.internal.eventstorage.record.RecordDatabase<com.facebook.ads.internal.logging.AdEvent> */
            {
                this.A04 = jt;
                this.A03 = c9r;
                this.A02 = c9d;
                this.A01 = xj;
            }

            @Nullable
            private final String A01(Void... voidArr) throws Throwable {
                String eventId;
                if (C0601Ko.A02(this)) {
                    return null;
                }
                String string = null;
                try {
                    try {
                        string = UUID.randomUUID().toString();
                        C8Z c8zA04 = this.A01.A04();
                        String eventId2 = this.A04.A06().toString();
                        c8zA04.A7Q(eventId2);
                        eventId = this.A04.A08();
                    } catch (C03259a e) {
                        this.A00 = e;
                        this.A01.A04().A83(A00(44, 15, 65), C03008a.A1q, new C03018b(e));
                    }
                    if (TextUtils.isEmpty(eventId)) {
                        return null;
                    }
                    StringBuilder sb = new StringBuilder();
                    String eventId3 = A00(29, 15, 33);
                    sb.append(eventId3);
                    String eventId4 = this.A04.A06().toString();
                    sb.append(eventId4);
                    String eventId5 = A00(0, 1, 72);
                    sb.append(eventId5);
                    String eventId6 = this.A04.A09().toString();
                    sb.append(eventId6);
                    sb.toString();
                    this.A03.ADV(C0939Xv.A07(string, this.A04));
                    return string;
                } catch (Throwable th) {
                    C0601Ko.A00(th, this);
                    return null;
                }
            }

            private final void A03(String str) throws Throwable {
                C9H c9h = this;
                C9H c9h2 = null;
                char c2 = C0601Ko.A02(c9h) ? (char) 2 : (char) 3;
                while (true) {
                    switch (c2) {
                        case 2:
                            return;
                        case 3:
                            c9h = c9h;
                            c9h2 = c9h;
                            c2 = 4;
                            break;
                        case 4:
                            try {
                                c9h2 = c9h2;
                                if (c9h2.A00 != null) {
                                    c2 = '\b';
                                    break;
                                } else {
                                    c2 = 6;
                                    break;
                                }
                            } catch (Throwable th) {
                                C0601Ko.A00(th, c9h2);
                                return;
                            }
                        case 6:
                            c9h2.A02.A02(str);
                            return;
                        case '\b':
                            C9H c9h3 = c9h2;
                            C9D<String> c9d2 = c9h3.A02;
                            String message = c9h3.A00.getMessage();
                            String result = A00(1, 28, 58);
                            c9d2.A01(0, (String) Preconditions.checkNotNull(message, result));
                            return;
                    }
                }
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.String] */
            @Override // android.os.AsyncTask
            @Nullable
            public final /* bridge */ /* synthetic */ String doInBackground(Void[] voidArr) throws Throwable {
                C9H c9h = this;
                C9H c9h2 = null;
                char c2 = C0601Ko.A02(c9h) ? (char) 2 : (char) 3;
                while (true) {
                    switch (c2) {
                        case 2:
                            return (Object) 0;
                        case 3:
                            c9h = c9h;
                            c9h2 = c9h;
                            c2 = 4;
                            break;
                        case 4:
                            try {
                                return c9h2.A01(voidArr);
                            } catch (Throwable th) {
                                C0601Ko.A00(th, c9h2);
                                return (Object) 0;
                            }
                    }
                }
            }

            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ void onPostExecute(String str) throws Throwable {
                C9H c9h = this;
                C9H c9h2 = null;
                char c2 = C0601Ko.A02(c9h) ? (char) 2 : (char) 3;
                while (true) {
                    switch (c2) {
                        case 2:
                            return;
                        case 3:
                            c9h = c9h;
                            c9h2 = c9h;
                            c2 = 4;
                            break;
                        case 4:
                            try {
                                c9h2.A03(str);
                                return;
                            } catch (Throwable th) {
                                C0601Ko.A00(th, c9h2);
                                return;
                            }
                    }
                }
            }
        }, new Void[0]);
    }
}

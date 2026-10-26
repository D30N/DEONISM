package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import com.facebook.ads.internal.bridge.fbsdk.FBLoginASID;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.util.process.ProcessUtils;
import d.b.a.b.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.DeflaterOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Xq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0934Xq implements AnonymousClass93 {

    @Nullable
    public static String A03;
    public static byte[] A04;
    public static final LP A05;
    public static final AtomicBoolean A06;
    public static final AtomicInteger A07;
    public static final AtomicReference<Map<String, String>> A08;
    public final C02465o A00;
    public final C8C A01;
    public final C03108k A02;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 87);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A04 = new byte[]{25, 31, 9, 30, 19, 13, 11, 9, 2, 24, 46, 62, 47, 56, 56, 51, 34, 42, 52, 57, 41, 53, 25, 27, 27, 29, 11, 11, 17, 26, 17, 20, 17, 12, 1, 7, 29, 22, 25, 26, 20, 29, 28, 0, 7, 17, 93, 74, 69, 81, 77, 79, 94, 79, 76, 71, 66, 71, 90, 87, 9, 4, 6, 1, 122, 104, 114, Byte.MAX_VALUE, 11, 7, 13, 3, 111, 103, 102, 107, 99, 118, 107, 109, 108, 125, 113, 103, 112, 116, 107, 97, 103, 85, 94, 79, 76, 84, 73, 80, 68, 79, 66, 75, 94, 111, 98, 121, 101, 103, 101, 110, 99, 121, 114, 117, 121, 107, 117, 67, 84, 79, 69, 77, 68, 94, 83, 72, 68, 88, 66, 69, 84, 82, 123, 121, 104, 104, 125, 124, 103, 113, 124, 107, 30, 5, 2, 31, 18, 35, 50, 50, 61, 47, 43, 44, 61, 49, 38, 41, 61, 52, 39, 48, 49, 43, 45, 44, 109, 100, 118, 122, 96, 125, 106, 117, 105, 100, 124, 96, 119, 27, 12, 1, 29, 12, 31, 12, 0, 30, 38, 48, 38, 38, 60, 58, 59, 42, 33, 60, 56, 48, 111, 109, 126, 126, 101, 105, 126, 16, 113, 118, 107, 108, 121, 116, 116, 125, 106, 108, 124, 109, 122, 122, 113, 96, 119, 122, 118, 120, 119, 107, 24, 28, 31, 58, 14, 44, 59, 56, 45, 54, 52, 63, 52, 35, 56, 50, 84, 95, 82, 82, 83, 68, 73, 66, 89, 93, 83, 88, 73, 83, 78, 66, 68, 87, 69, 85, 82, 68, 47, 84, 65, 65, 71, 92, 87, 64, 65, 92, 90, 91, 74, 92, 81, 2, 37, 45, 40, 33, 32, 100, 48, 43, 100, 38, 49, 45, 40, 32, 100, 49, 55, 33, 54, 100, 48, 43, 47, 33, 42, 18, 0, 27, 18, 0, 32, 47, 32, 45, 46, 38, 109, 108, 103, 122, 96, 125, 112, 75, 72, 68, 70, 75, 66, 6, 27, 27, 0, 17, 16};
    }

    static {
        A07();
        A06 = new AtomicBoolean();
        A07 = new AtomicInteger(0);
        A03 = null;
        A05 = LQ.A00();
        A08 = new AtomicReference<>();
    }

    public C0934Xq(C8C c8c, boolean z, C02465o c02465o) throws ExecutionException, InterruptedException {
        this.A01 = c8c;
        this.A02 = new C03108k(c8c);
        this.A00 = c02465o;
        A08(c8c, z);
    }

    @SuppressLint({"CatchGeneralException"})
    @Nullable
    public static String A02(C8C c8c, String str) {
        Exception e = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c8c = c8c;
                        return LV.A02(c8c.getPackageManager().getApplicationInfo(str, 0).sourceDir);
                    } catch (Exception e2) {
                        e = e2;
                        if (!A06.compareAndSet(false, true)) {
                            c2 = '\t';
                            break;
                        } else {
                            c2 = '\b';
                            break;
                        }
                    }
                case '\b':
                    c8c = c8c;
                    e = e;
                    c8c.A04().A83(A01(237, 7, 6), C03008a.A16, new C03018b(e));
                    c2 = '\t';
                    break;
                case '\t':
                    return (String) null;
            }
        }
    }

    @Nullable
    public static Map<String, String> A05() {
        return A08.get();
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A08(final C8C c8c, boolean z) throws ExecutionException, InterruptedException {
        if (!A07.compareAndSet(0, 1)) {
            return;
        }
        try {
            final SharedPreferences sharedPreferences = c8c.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(228, 9, 9), c8c), 0);
            final String str = A01(263, 4, 67) + new C03108k(c8c).A05();
            A03 = sharedPreferences.getString(str, null);
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.95
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                public final Boolean call() throws Exception {
                    C8C c8c2 = c8c;
                    String unused = C0934Xq.A03 = C0934Xq.A02(c8c2, c8c2.getPackageName());
                    sharedPreferences.edit().putString(str, C0934Xq.A03).apply();
                    C0934Xq.A07.set(2);
                    return true;
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (Exception unused) {
            A07.set(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass93
    public final Map<String, String> A69() throws ExecutionException, JSONException, InterruptedException {
        C0934Xq c0934Xq = this;
        String strA03 = null;
        String strA02 = null;
        String mediationService = null;
        String fBLoginASID = null;
        A08(c0934Xq.A01, false);
        C03098j.A0B(c0934Xq.A01);
        C03098j.A08(c0934Xq.A01);
        HashMap map = new HashMap();
        AnonymousClass90.A02(c0934Xq.A01, map);
        map.put(A01(325, 6, 80), Locale.getDefault().toString());
        float f = C0635Ly.A01;
        int i = c0934Xq.A01.getResources().getDisplayMetrics().widthPixels;
        int i2 = c0934Xq.A01.getResources().getDisplayMetrics().heightPixels;
        map.put(A01(318, 7, 126), String.valueOf(f));
        int screenHeight = (int) (i / f);
        map.put(A01(10, 12, 42), String.valueOf(screenHeight));
        int screenHeight2 = (int) (i2 / f);
        map.put(A01(215, 13, 104), String.valueOf(screenHeight2));
        map.put(A01(267, 14, 66), C02335a.A03());
        map.put(A01(k.AppCompatTheme_windowFixedWidthMinor, 9, 64), C02335a.A00().A02().name());
        map.put(A01(101, 14, 113), String.valueOf(C02335a.A00().A01()));
        map.put(A01(k.AppCompatTheme_windowActionBar, 6, 86), AnonymousClass98.A03(c0934Xq.A01, c0934Xq.A02));
        map.put(A01(198, 7, k.AppCompatTheme_windowMinWidthMinor), c0934Xq.A02.A07());
        map.put(A01(68, 4, 17), c0934Xq.A02.A08());
        int screenHeight3 = A05.A00;
        map.put(A01(331, 6, 3), String.valueOf(screenHeight3));
        map.put(A01(206, 9, 111), c0934Xq.A02.A0A());
        map.put(A01(46, 14, 89), LI.A01());
        int screenHeight4 = C0625Lo.A00(c0934Xq.A01).A00;
        map.put(A01(89, 12, 76), String.valueOf(screenHeight4));
        map.put(A01(186, 12, 34), C0627Lq.A02(c0934Xq.A01.A05().A01()));
        String str = A03;
        int screenHeight5 = str != null ? 2 : 3;
        while (true) {
            switch (screenHeight5) {
                case 2:
                    map = map;
                    str = str;
                    String mediationService2 = A01(43, 3, 22);
                    map.put(mediationService2, str);
                    screenHeight5 = 3;
                    break;
                case 3:
                    c0934Xq = c0934Xq;
                    strA02 = LQ.A02(c0934Xq.A01);
                    if (strA02 == null) {
                        screenHeight5 = 5;
                        break;
                    } else {
                        screenHeight5 = 4;
                        break;
                    }
                case 4:
                    map = map;
                    strA02 = strA02;
                    String mediationService3 = A01(307, 5, 4);
                    map.put(mediationService3, strA02);
                    screenHeight5 = 5;
                    break;
                case 5:
                    c0934Xq = c0934Xq;
                    map = map;
                    String strValueOf = String.valueOf(LU.A05(c0934Xq.A01));
                    String app_certs = A01(140, 5, 28);
                    map.put(app_certs, strValueOf);
                    mediationService = AdInternalSettings.getMediationService();
                    if (mediationService == null) {
                        screenHeight5 = 7;
                        break;
                    } else {
                        screenHeight5 = 6;
                        break;
                    }
                case 6:
                    map = map;
                    mediationService = mediationService;
                    map.put(A01(72, 17, k.AppCompatTheme_windowActionModeOverlay), mediationService);
                    screenHeight5 = 7;
                    break;
                case 7:
                    c0934Xq = c0934Xq;
                    map = map;
                    String strValueOf2 = String.valueOf(c0934Xq.A02.A0B());
                    String mediationService4 = A01(22, 21, 15);
                    map.put(mediationService4, strValueOf2);
                    if (c0934Xq.A02.A02() == -1) {
                        screenHeight5 = 9;
                        break;
                    } else {
                        screenHeight5 = 8;
                        break;
                    }
                case 8:
                    c0934Xq = c0934Xq;
                    map = map;
                    String strValueOf3 = String.valueOf(c0934Xq.A02.A02());
                    String mediationService5 = A01(145, 19, 53);
                    map.put(mediationService5, strValueOf3);
                    screenHeight5 = 9;
                    break;
                case 9:
                    c0934Xq = c0934Xq;
                    map = map;
                    String strA05 = C03238y.A05(c0934Xq.A01);
                    String mediationService6 = A01(177, 9, 26);
                    map.put(mediationService6, strA05);
                    String strA01 = LX.A01(C03098j.A02());
                    String mediationService7 = A01(312, 6, 54);
                    map.put(mediationService7, strA01);
                    if (!JP.A05(c0934Xq.A01)) {
                        screenHeight5 = 12;
                        break;
                    } else {
                        screenHeight5 = 10;
                        break;
                    }
                case 10:
                    fBLoginASID = FBLoginASID.getFBLoginASID();
                    if (fBLoginASID == null) {
                        screenHeight5 = 12;
                        break;
                    } else {
                        screenHeight5 = 11;
                        break;
                    }
                case 11:
                    map = map;
                    fBLoginASID = fBLoginASID;
                    String fbLoginASID = A01(64, 4, 108);
                    map.put(fbLoginASID, fBLoginASID);
                    screenHeight5 = 12;
                    break;
                case 12:
                    c0934Xq = c0934Xq;
                    map = map;
                    A08.set(map);
                    map.put(A01(130, 10, 111), C01250u.A00());
                    strA03 = c0934Xq.A00.A03(c0934Xq.A01);
                    if (strA03 == null) {
                        screenHeight5 = 15;
                        break;
                    } else {
                        screenHeight5 = 13;
                        break;
                    }
                case 13:
                    strA03 = strA03;
                    if (!TextUtils.isEmpty(strA03)) {
                        screenHeight5 = 14;
                        break;
                    } else {
                        screenHeight5 = 15;
                        break;
                    }
                case 14:
                    map = map;
                    strA03 = strA03;
                    String mediationService8 = A01(244, 19, 65);
                    map.put(mediationService8, strA03);
                    screenHeight5 = 15;
                    break;
                case 15:
                    HashMap map2 = map;
                    String strValueOf4 = String.valueOf(HN.A08());
                    String bidderTokenExtras = A01(164, 13, k.AppCompatTheme_viewInflaterClass);
                    map2.put(bidderTokenExtras, strValueOf4);
                    return map2;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass93
    public final String A75() {
        return A76(AnonymousClass92.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass93
    public final String A76(AnonymousClass91 anonymousClass91) throws ExecutionException, InterruptedException, IOException {
        A08(this.A01, true);
        ByteArrayOutputStream byteArrayOutputStream = null;
        Base64OutputStream base64OutputStream = null;
        DeflaterOutputStream deflaterOutputStream = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
                deflaterOutputStream = new DeflaterOutputStream(base64OutputStream);
                Map<String, String> mapA69 = A69();
                if (TextUtils.isEmpty(C02335a.A00().A03())) {
                    C02335a.A07(this.A01);
                }
                mapA69.put(A01(60, 4, 23), C02335a.A00().A03());
                mapA69.put(A01(0, 10, 27), AnonymousClass98.A06(this.A02, this.A01, false));
                Iterator<Map.Entry<String, String>> it = mapA69.entrySet().iterator();
                while (it.hasNext()) {
                    if (!anonymousClass91.A2N(it.next().getKey())) {
                        it.remove();
                    }
                }
                deflaterOutputStream.write(new JSONObject(mapA69).toString().getBytes());
                deflaterOutputStream.close();
                String strReplaceAll = byteArrayOutputStream.toString().replaceAll(A01(205, 1, 77), A01(68, 0, k.AppCompatTheme_windowMinWidthMajor));
                try {
                    deflaterOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                return strReplaceAll;
            } catch (IOException e) {
                throw new RuntimeException(A01(281, 26, 19), e);
            }
        } catch (Throwable e2) {
            if (deflaterOutputStream != null) {
                try {
                    deflaterOutputStream.close();
                } catch (IOException unused2) {
                    throw e2;
                }
            }
            if (base64OutputStream != null) {
                base64OutputStream.close();
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            throw e2;
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.util.process.ProcessUtils;
import d.b.a.b.k;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03028c {
    public static AtomicInteger A00;
    public static byte[] A01;
    public static final Object A02;
    public static final String A03;
    public static final Map<String, Integer> A04;
    public static final Set<String> A05;

    public static String A02(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 27);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A01 = new byte[]{17, 16, 23, 0, 18, 10, 5, 7, 16, 19, 120, 83, 66, 74, 87, 33, 37, 38, 18, 3, 14, 2, 9, 4, 2, 41, 2, 19, 16, 8, 21, 12, 69, 103, 104, 33, 114, 38, 98, 99, 106, 99, 114, 99, 38, 96, 111, 106, 99, 39, 123, 109, 123, 123, 97, 103, 102, 87, 97, 108, 62, 63, 5, 54, 53, 61, 61, 51, 52, 61, Byte.MAX_VALUE, 71, 69, 92, 92, 69, 66, 75, 12, 79, 67, 94, 94, 89, 92, 88, 73, 72, 12, 72, 73, 78, 89, 75, 12, 73, 90, 73, 66, 88, 12, 64, 69, 66, 73, 2, 54, 19, 20, 1, 3, 70, 2, 3, 4, 19, 1, 70, 3, 16, 3, 8, 18, 21, 70, 0, 15, 10, 3, 72, 108, 32, 15, 10, 3, 70, 21, 15, 28, 3, 92, 70, 17, 28, 21, 0, 94, 88, 79, 89, 84, 93, 72, 18, 7, 7, 22, 30, 3, 7, 61, 37, 39, 62, 62, 43, 42, 11, 56, 43, 32, 58, 61, 110, 115, 110, 85, 65, 99, 108, 37, 118, 34, 102, 103, 110, 103, 118, 103, 34, 102, 103, 96, 119, 101, 34, 103, 116, 103, 108, 118, 113, 34, 100, 107, 110, 103, 44, 78, 72, 95, 73, 68, 77, 88, 98, 94, 82, 89, 88, 83, 95, 59, 13, 16, 15, 60, 16, 10, 17, 11, 26, 13, 69, 95, 7, 2, 23, 2, 112, 102, 112, 112, 106, 108, 109, 92, 119, 106, 110, 102, 124, 125, 122, 109, Byte.MAX_VALUE, 116, 119, Byte.MAX_VALUE, 107, 93, 123, 112, 96, 103, 110, 41, 125, 102, 41, 124, 121, 109, 104, 125, 108, 41, 124, 103, 123, 108, 106, 102, 123, 109, 108, 109, 41, 109, 108, 107, 124, 110, 69, 102, 110, 76, Byte.MAX_VALUE, 108, 103, 125, 39, 41, 104, 109, 109, 96, 103, 110, 41, 125, 102, 41, 70, 103, 110, 102, 96, 103, 110, 76, Byte.MAX_VALUE, 108, 103, 125, 39, 120, 75, 88, 83, 73, 126, 82, 72, 83, 73, 21, 45, 47, 54, 54, 35, 34, 102, 35, 48, 35, 40, 50, 53, 104, 88, 85, 81, 76, 72, 64, 3, 12, 11, 12, 22, 13, 0, 1, 69, 0, 19, 0, 11, 17, 69, 22, 13, 10, 16, 9, 1, 69, 11, 10, 17, 69, 7, 0, 69, 16, 21, 1, 4, 17, 0, 1, 69, 17, 10, 69, 42, 11, 2, 10, 12, 11, 2, 32, 19, 0, 11, 17, 75};
    }

    static {
        A06();
        A03 = C03028c.class.getName();
        A02 = new Object();
        A05 = Collections.synchronizedSet(new HashSet());
        A04 = Collections.synchronizedMap(new HashMap());
        A00 = new AtomicInteger();
    }

    public static int A00(Context context) {
        return context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(0, 10, 78), context), 0).getInt(A02(326, 10, 38), 0) - A05.size();
    }

    public static C03048e A01(String str, C8C c8c, Map<String, String> staticEnvironmentData) {
        C03048e c03048e = null;
        try {
            c03048e = new C03048e(c8c.A05().A01(), c8c.A05().A02(), new C8O(str, staticEnvironmentData, true).A02());
            A0B(c03048e, c8c);
            return c03048e;
        } catch (Exception unused) {
            return c03048e;
        }
    }

    public static JSONArray A03(C8C c8c) {
        return A04(c8c, -1);
    }

    public static JSONArray A04(C8C c8c, int i) {
        C8Z c8zA04;
        JSONArray jSONArray = new JSONArray();
        synchronized (A02) {
            FileInputStream fileInputStreamOpenFileInput = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            try {
                try {
                    if (new File(c8c.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(251, 9, 3), c8c)).exists()) {
                        fileInputStreamOpenFileInput = c8c.openFileInput(ProcessUtils.getProcessSpecificName(A02(251, 9, 3), c8c));
                        inputStreamReader = new InputStreamReader(fileInputStreamOpenFileInput);
                        bufferedReader = new BufferedReader(inputStreamReader);
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null || i == 0) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(line);
                            if (!jSONObject.has(A02(153, 7, 104))) {
                                jSONObject.put(A02(153, 7, 104), String.valueOf(0));
                            }
                            String line2 = jSONObject.getString(A02(351, 2, 42));
                            if (!A05.contains(line2)) {
                                int i2 = jSONObject.getInt(A02(153, 7, 104));
                                if (A04.containsKey(line2)) {
                                    jSONObject.put(A02(153, 7, 104), String.valueOf(A04.get(line2)));
                                } else {
                                    A0E(line2, i2);
                                }
                                jSONArray.put(jSONObject);
                                if (i > 0) {
                                    i--;
                                }
                            }
                        }
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                            e = e;
                            c8zA04 = c8c.A04();
                            c8zA04.A3R(e);
                            return jSONArray;
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                } catch (IOException | JSONException e2) {
                    c8c.A04().A3R(e2);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            e = e3;
                            c8zA04 = c8c.A04();
                            c8zA04.A3R(e);
                            return jSONArray;
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                }
            } finally {
                if (bufferedReader != null) {
                    try {
                    } catch (IOException e4) {
                    }
                }
            }
        }
        return jSONArray;
    }

    public static JSONObject A05(C03048e c03048e) throws JSONException {
        JSONObject jSONObject = null;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A02(351, 2, 42), UUID.randomUUID().toString());
        jSONObject2.put(A02(142, 4, 126), c03048e.A03());
        jSONObject2.put(A02(353, 4, 62), C0627Lq.A02(c03048e.A01()));
        jSONObject2.put(A02(239, 12, 24), C0627Lq.A02(c03048e.A00()));
        jSONObject2.put(A02(50, 10, 19), c03048e.A02());
        char c2 = c03048e.A04() != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c03048e = c03048e;
                    jSONObject = new JSONObject(c03048e.A04());
                    c2 = 3;
                    break;
                case 3:
                    JSONObject jSONObject3 = jSONObject2;
                    jSONObject3.put(A02(235, 4, k.AppCompatTheme_windowFixedWidthMajor), jSONObject);
                    jSONObject3.put(A02(153, 7, 104), String.valueOf(0));
                    return jSONObject3;
                case 4:
                    jSONObject = new JSONObject();
                    c2 = 3;
                    break;
            }
        }
    }

    public static void A07(Context context) {
        synchronized (A02) {
            File file = new File(context.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(251, 9, 3), context));
            if (file.exists()) {
                file.delete();
            }
            A09(context, 0);
            A05.clear();
            A04.clear();
        }
    }

    public static void A08(Context context) {
        A09(context, context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(0, 10, 78), context), 0).getInt(A02(326, 10, 38), 0) + 1);
    }

    public static void A09(Context context, int i) {
        int i2 = 0;
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(0, 10, 78), context), 0).edit();
        if (i >= 0) {
            i2 = i;
        }
        editorEdit.putInt(A02(326, 10, 38), i2).apply();
    }

    public static void A0A(C8C c8c, String str) {
        File file = new File(c8c.getFilesDir(), str);
        char c2 = file.exists() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    file = file;
                    if (!file.delete()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c8c = c8c;
                    c8c.A04().A3R(new RuntimeException(A02(32, 18, 29)));
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    public static void A0B(C03048e c03048e, C8C c8c) {
        if (c03048e != null && c8c != null) {
            synchronized (A02) {
                try {
                    String processSpecificName = ProcessUtils.getProcessSpecificName(A02(251, 9, 3), c8c);
                    File file = new File(c8c.getFilesDir(), processSpecificName);
                    if (file.exists()) {
                        int iA07 = JR.A07(c8c);
                        long fileSize = file.length();
                        if (iA07 > 0 && fileSize > iA07) {
                            boolean zDelete = file.delete();
                            A09(c8c, 0);
                            A05.clear();
                            A04.clear();
                            if (zDelete) {
                                Map<String, String> mapA4S = c8c.A02().A4S();
                                mapA4S.put(A02(146, 7, 54), A02(60, 10, 65));
                                mapA4S.put(A02(208, 12, 38), String.valueOf(2401));
                                A01(A02(106, 36, 125) + fileSize + A02(220, 15, 100) + A00.getAndIncrement(), c8c, mapA4S);
                                return;
                            }
                            Log.e(A02(15, 17, k.AppCompatTheme_windowNoTitle), A02(177, 31, 25));
                        }
                    }
                    JSONObject jSONObjectA05 = A05(c03048e);
                    FileOutputStream fileOutputStreamOpenFileOutput = c8c.openFileOutput(processSpecificName, 32768);
                    String line = jSONObjectA05.toString() + A02(176, 1, 68);
                    fileOutputStreamOpenFileOutput.write(line.getBytes());
                    fileOutputStreamOpenFileOutput.close();
                    A08(c8c);
                } catch (Exception e) {
                    c8c.A04().A3R(e);
                }
            }
        }
    }

    public static void A0C(String str) {
        A04.remove(str);
        A05.add(str);
    }

    public static void A0D(String str) {
        Integer num = A04.get(str);
        char c2 = num == null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (!BuildConfigApi.isDebug()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    Log.e(A03, A02(260, 66, 18));
                    c2 = 4;
                    break;
                case 4:
                    num = 0;
                    c2 = 5;
                    break;
                case 5:
                    A04.put(str, Integer.valueOf(num.intValue() + 1));
                    return;
                case 6:
                    str = str;
                    A04.remove(str);
                    c2 = 5;
                    break;
            }
        }
    }

    public static void A0E(String str, int i) {
        char c2 = !A05.contains(str) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!A04.containsKey(str)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str = str;
                    A04.remove(str);
                    c2 = 4;
                    break;
                case 4:
                    A04.put(str, Integer.valueOf(i));
                    return;
                case 5:
                    throw new RuntimeException(A02(357, 53, 126));
            }
        }
    }

    public static boolean A0F(C8C c8c) {
        if (JR.A0N(c8c)) {
            return A0H(c8c);
        }
        return A0G(c8c);
    }

    public static boolean A0G(C8C c8c) {
        JSONArray debugLogEvents = new JSONArray();
        synchronized (A02) {
            int i = 0;
            FileInputStream fileInputStreamOpenFileInput = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            FileOutputStream fileOutputStreamOpenFileOutput = null;
            try {
                try {
                    File debugFile = new File(c8c.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(251, 9, 3), c8c));
                    if (debugFile.exists()) {
                        fileInputStreamOpenFileInput = c8c.openFileInput(ProcessUtils.getProcessSpecificName(A02(251, 9, 3), c8c));
                        inputStreamReader = new InputStreamReader(fileInputStreamOpenFileInput);
                        bufferedReader = new BufferedReader(inputStreamReader);
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(line);
                            String string = jSONObject.getString(A02(351, 2, 42));
                            if (!A05.contains(string)) {
                                if (A04.containsKey(string)) {
                                    Integer num = A04.get(string);
                                    int retryLimit = num != null ? num.intValue() : 0;
                                    Integer numValueOf = Integer.valueOf(retryLimit);
                                    int iA02 = JR.A02(c8c);
                                    if (iA02 > -1) {
                                        int retryLimit2 = iA02 - 1;
                                        if (numValueOf.intValue() > retryLimit2) {
                                            A0C(string);
                                            i++;
                                        }
                                    }
                                    jSONObject.put(A02(153, 7, 104), String.valueOf(numValueOf));
                                    debugLogEvents.put(jSONObject);
                                } else {
                                    debugLogEvents.put(jSONObject);
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        int i2 = debugLogEvents.length();
                        for (int i3 = 0; i3 < i2; i3++) {
                            sb.append(debugLogEvents.getJSONObject(i3).toString());
                            sb.append('\n');
                        }
                        fileOutputStreamOpenFileOutput = c8c.openFileOutput(ProcessUtils.getProcessSpecificName(A02(251, 9, 3), c8c), 0);
                        fileOutputStreamOpenFileOutput.write(sb.toString().getBytes());
                    }
                    int retryLimit3 = A00(c8c);
                    A09(c8c, retryLimit3);
                    if (i > 0) {
                        c8c.A04().A83(A02(60, 10, 65), C03008a.A1z, new C03018b(A02(336, 15, 93), A02(160, 16, 85) + i));
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                            c8c.A04().A3R(e);
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                    A05.clear();
                    A04.clear();
                    return true;
                } catch (IOException | JSONException e2) {
                    c8c.A04().A3R(e2);
                    if (bufferedReader != null) {
                        try {
                        } catch (IOException e3) {
                            return false;
                        }
                    }
                    return false;
                }
            } finally {
                if (0 != 0) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e32) {
                        c8c.A04().A3R(e32);
                        A05.clear();
                        A04.clear();
                    }
                }
                if (0 != 0) {
                    inputStreamReader.close();
                }
                if (0 != 0) {
                    fileInputStreamOpenFileInput.close();
                }
                if (0 != 0) {
                    fileOutputStreamOpenFileOutput.close();
                }
                A05.clear();
                A04.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f0 A[Catch: IOException -> 0x01fe, all -> 0x0248, TryCatch #5 {IOException -> 0x01fe, blocks: (B:94:0x01e1, B:96:0x01e6, B:98:0x01eb, B:100:0x01f0, B:102:0x01f5, B:104:0x01fa), top: B:141:0x01e1, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f5 A[Catch: IOException -> 0x01fe, all -> 0x0248, TryCatch #5 {IOException -> 0x01fe, blocks: (B:94:0x01e1, B:96:0x01e6, B:98:0x01eb, B:100:0x01f0, B:102:0x01f5, B:104:0x01fa), top: B:141:0x01e1, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01fa A[Catch: IOException -> 0x01fe, all -> 0x0248, TRY_LEAVE, TryCatch #5 {IOException -> 0x01fe, blocks: (B:94:0x01e1, B:96:0x01e6, B:98:0x01eb, B:100:0x01f0, B:102:0x01f5, B:104:0x01fa), top: B:141:0x01e1, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021d A[Catch: IOException -> 0x0235, all -> 0x0248, TryCatch #1 {IOException -> 0x0235, blocks: (B:115:0x0218, B:117:0x021d, B:119:0x0222, B:121:0x0227, B:123:0x022c, B:125:0x0231), top: B:133:0x0218, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0222 A[Catch: IOException -> 0x0235, all -> 0x0248, TryCatch #1 {IOException -> 0x0235, blocks: (B:115:0x0218, B:117:0x021d, B:119:0x0222, B:121:0x0227, B:123:0x022c, B:125:0x0231), top: B:133:0x0218, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0227 A[Catch: IOException -> 0x0235, all -> 0x0248, TryCatch #1 {IOException -> 0x0235, blocks: (B:115:0x0218, B:117:0x021d, B:119:0x0222, B:121:0x0227, B:123:0x022c, B:125:0x0231), top: B:133:0x0218, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022c A[Catch: IOException -> 0x0235, all -> 0x0248, TryCatch #1 {IOException -> 0x0235, blocks: (B:115:0x0218, B:117:0x021d, B:119:0x0222, B:121:0x0227, B:123:0x022c, B:125:0x0231), top: B:133:0x0218, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0231 A[Catch: IOException -> 0x0235, all -> 0x0248, TRY_LEAVE, TryCatch #1 {IOException -> 0x0235, blocks: (B:115:0x0218, B:117:0x021d, B:119:0x0222, B:121:0x0227, B:123:0x022c, B:125:0x0231), top: B:133:0x0218, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0218 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e6 A[Catch: IOException -> 0x01fe, all -> 0x0248, TryCatch #5 {IOException -> 0x01fe, blocks: (B:94:0x01e1, B:96:0x01e6, B:98:0x01eb, B:100:0x01f0, B:102:0x01f5, B:104:0x01fa), top: B:141:0x01e1, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01eb A[Catch: IOException -> 0x01fe, all -> 0x0248, TryCatch #5 {IOException -> 0x01fe, blocks: (B:94:0x01e1, B:96:0x01e6, B:98:0x01eb, B:100:0x01f0, B:102:0x01f5, B:104:0x01fa), top: B:141:0x01e1, outer: #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0H(com.facebook.ads.redexgen.X.C8C r18) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C03028c.A0H(com.facebook.ads.redexgen.X.8C):boolean");
    }

    public static boolean A0I(String str) {
        boolean z = false;
        char c2 = !A05.contains(str) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!A04.containsKey(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }
}

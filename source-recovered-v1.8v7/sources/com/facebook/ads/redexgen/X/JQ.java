package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.process.ProcessUtils;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class JQ {
    public static JQ A01;
    public static byte[] A02;
    public final SharedPreferences A00;

    static {
        A0W();
    }

    public static String A0M(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 66);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0W() {
        A02 = new byte[]{76, 73, 67, 90, 114, 72, 67, 76, 79, 65, 72, 114, 68, 67, 65, 68, 67, 72, 114, 85, 114, 66, 88, 89, 114, 67, 66, 67, 114, 75, 88, 65, 65, 94, 78, 95, 72, 72, 67, 114, 66, 67, 114, 94, 73, 70, 65, 68, 78, 87, Byte.MAX_VALUE, 69, 78, 65, 66, 76, 69, Byte.MAX_VALUE, 79, 76, 68, Byte.MAX_VALUE, 83, 89, 78, 67, Byte.MAX_VALUE, 67, 65, 76, 76, 93, 88, 82, 75, 99, 93, 95, 95, 89, 76, 72, 93, 94, 80, 89, 99, 79, 72, 93, 95, 87, 72, 78, 93, 95, 89, 99, 80, 89, 82, 91, 72, 84, 17, 20, 30, 7, 47, 17, 30, 20, 2, 31, 25, 20, 47, 7, 24, 25, 4, 21, 28, 25, 3, 4, 21, 20, 47, 25, 30, 4, 21, 30, 4, 47, 5, 2, 28, 47, 0, 2, 21, 22, 25, 8, 21, 3, 81, 84, 94, 71, 111, 69, 67, 85, 111, 83, 81, 83, 88, 85, 84, 111, 85, 72, 85, 83, 69, 68, 95, 66, 111, 86, 95, 66, 111, 94, 85, 68, 71, 95, 66, 91, 25, 28, 22, 15, 39, 25, 22, 28, 10, 23, 17, 28, 39, 21, 10, 27, 39, 17, 21, 8, 10, 29, 11, 11, 17, 23, 22, 39, 30, 23, 10, 39, 22, 25, 12, 17, 14, 29, 39, 14, 17, 28, 29, 23, 39, 25, 28, 11, 9, 11, 11, 1, 12, 13, 6, 28, 9, 4, 55, 11, 4, 1, 11, 3, 27, 55, 11, 7, 6, 14, 1, 15, 70, 28, 31, 7, 55, 27, 28, 13, 24, 55, 11, 7, 6, 14, 1, 26, 5, 9, 28, 1, 7, 6, 55, 10, 7, 12, 17, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 79, 88, 76, 72, 89, 108, 105, 99, 122, 82, 121, Byte.MAX_VALUE, 100, 106, 106, 104, Byte.MAX_VALUE, 82, 99, 108, 121, 100, 123, 104, 82, Byte.MAX_VALUE, 104, 106, 100, 126, 121, 104, Byte.MAX_VALUE, 82, 123, 100, 104, 122, 82, 104, Byte.MAX_VALUE, Byte.MAX_VALUE, 98, Byte.MAX_VALUE, 82, 110, 108, 97, 97, 111, 108, 110, 102, 16, 21, 31, 6, 46, 20, 31, 16, 19, 29, 20, 46, 23, 4, 31, 31, 20, 29, 45, 47, 47, 37, 40, 41, 34, 56, 45, 32, 19, 47, 32, 37, 47, 39, 63, 19, 47, 35, 34, 42, 37, 43, 98, 56, 59, 35, 19, 63, 56, 41, 60, 19, 47, 35, 34, 42, 37, 62, 33, 45, 56, 37, 35, 34, 19, 56, 37, 56, 32, 41, 102, 99, 105, 112, 88, 110, 105, 115, 98, 117, 116, 115, 110, 115, 110, 102, 107, 88, 116, 118, 114, 102, 117, 98, 88, 112, 102, 115, 100, 111, 88, 102, 105, 99, 88, 101, 117, 104, 112, 116, 98, 88, 100, 115, 102, 115, 118, 124, 101, 77, 97, 101, 115, 98, 77, 96, 119, 98, 125, 96, 102, 77, 115, 124, 118, 77, 113, 126, 125, 97, 119, 98, 96, 96, 106, 103, 102, 109, 119, 98, 111, 92, 96, 111, 106, 96, 104, 112, 92, 96, 108, 109, 101, 106, 100, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 84, 95, 78, 77, 85, 72, 81, 101, 94, 95, 92, 91, 79, 86, 78, 101, 89, 85, 84, 84, 95, 89, 78, 83, 85, 84, 101, 78, 83, 87, 95, 85, 79, 78, 101, 87, 73, 25, 28, 22, 15, 39, 25, 22, 28, 10, 23, 17, 28, 39, 22, 29, 12, 15, 23, 10, 19, 39, 28, 29, 30, 25, 13, 20, 12, 39, 10, 29, 25, 28, 39, 12, 17, 21, 29, 23, 13, 12, 39, 21, 11, 77, 72, 66, 91, 115, 94, 90, 115, 92, 64, 77, 85, 78, 77, 79, 71, 115, 79, 94, 77, 95, 68, 115, 74, 77, 64, 64, 78, 77, 79, 71, 33, 36, 46, 55, 31, 46, 33, 52, 41, 54, 37, 31, 35, 33, 50, 47, 53, 51, 37, 44, 31, 35, 47, 45, 48, 33, 35, 52, 31, 52, 40, 50, 37, 51, 40, 47, 44, 36, 63, 58, 48, 41, 1, 63, 48, 58, 44, 49, 55, 58, 1, 63, 50, 50, 49, 41, 1, 50, 49, 63, 58, 1, 58, 43, 44, 55, 48, 57, 1, 45, 54, 49, 41, 55, 48, 57, 69, 64, 74, 83, 123, 84, 72, 69, 93, 69, 70, 72, 65, 87, 123, 72, 75, 67, 67, 77, 74, 67, 123, 65, 74, 69, 70, 72, 65, 64, 24, 29, 23, 14, 38, 24, 23, 29, 11, 22, 16, 29, 38, 23, 28, 13, 14, 22, 11, 18, 38, 29, 28, 31, 24, 12, 21, 13, 38, 13, 16, 20, 28, 22, 12, 13, 38, 20, 10, 104, 109, 103, 126, 86, 122, 97, 102, 124, 101, 109, 86, 104, 109, 109, 86, 108, 113, 125, 108, 103, 122, 96, 102, 103, 86, 125, 102, 86, 121, 101, 104, 112, 104, 107, 101, 108, 122, 35, 60, 49, 48, 58, 10, 52, 59, 49, 10, 48, 59, 49, 54, 52, 39, 49, 10, 52, 32, 33, 58, 39, 58, 33, 52, 33, 48, 88, 93, 87, 78, 102, 91, 85, 86, 90, 82, 102, 85, 86, 90, 82, 74, 90, 75, 92, 92, 87, 17, 20, 30, 7, 47, 3, 9, 30, 19, 47, 21, 30, 20, 0, 31, 25, 30, 4, 47, 0, 2, 21, 22, 25, 8, 34, 39, 45, 52, 28, 34, 45, 39, 49, 44, 42, 39, 28, 37, 34, 42, 47, 28, 44, 45, 28, 52, 38, 33, 53, 42, 38, 52, 28, 38, 49, 49, 44, 49, 48, 1, 4, 14, 23, 63, 16, 12, 1, 25, 1, 2, 12, 5, 19, 63, 19, 8, 15, 23, 63, 5, 14, 4, 3, 1, 18, 4, 13, 11, 112, 117, Byte.MAX_VALUE, 102, 78, 112, Byte.MAX_VALUE, 117, 99, 126, 120, 117, 78, Byte.MAX_VALUE, 116, 101, 102, 126, 99, 122, 78, 117, 116, 119, 112, 100, 125, 101, 78, 101, 121, 99, 126, 101, 101, 125, 116, 78, 101, 120, 
        124, 116, 126, 100, 101, 78, 124, 98, 98, 103, 109, 116, 92, 98, 109, 103, 113, 108, 106, 103, 92, 113, 102, 115, 108, 113, 119, 92, 115, 113, 102, 112, 102, 109, 119, 98, 119, 106, 108, 109, 92, 102, 113, 113, 108, 113, 92, 116, 107, 102, 109, 92, 109, 108, 92, 106, 110, 115, 113, 102, 112, 112, 106, 108, 109, 22, 19, 25, 0, 40, 4, 14, 25, 20, 40, 22, 17, 3, 18, 5, 40, 22, 19, 40, 27, 24, 22, 19, 54, 51, 57, 32, 8, 36, 63, 56, 34, 59, 51, 8, 62, 48, 57, 56, 37, 50, 8, 51, 50, 36, 35, 37, 56, 46, 8, 52, 54, 59, 59, 55, 50, 56, 33, 9, 37, 62, 57, 35, 58, 50, 9, 63, 56, 53, 36, 51, 59, 51, 56, 34, 9, 36, 51, 34, 36, 47, 9, 53, 57, 35, 56, 34, 51, 36, 9, 57, 56, 9, 51, 59, 38, 34, 47, 9, 36, 51, 37, 38, 57, 56, 37, 51, 118, 115, 121, 96, 72, 103, 120, 100, 126, 99, 126, 120, 121, 72, 116, 99, 118, 72, 99, 120, 72, 101, 126, 112, Byte.MAX_VALUE, 99, 53, 48, 58, 35, 11, 36, 56, 53, 45, 53, 54, 56, 49, 11, 55, 56, 61, 55, 63, 11, 57, 53, 44, 11, 48, 49, 56, 53, 45, 11, 57, 39, 13, 8, 2, 27, 51, 13, 2, 8, 30, 3, 5, 8, 51, 30, 9, 28, 3, 30, 24, 51, 28, 30, 9, 31, 9, 2, 24, 13, 24, 5, 3, 2, 51, 9, 30, 30, 3, 30, 31, 51, 5, 2, 31, 24, 9, 13, 8, 51, 3, 10, 51, 5, 2, 24, 9, 30, 2, 13, 0, 82, 87, 93, 68, 108, 93, 86, 68, 108, 95, 82, 93, 87, 64, 80, 82, 67, 86, 108, 86, 93, 87, 80, 82, 65, 87, 66, 71, 77, 84, 124, 86, 77, 74, 82, 86, 70, 124, 71, 65, 124, 77, 66, 78, 70, 124, 83, 70, 81, 124, 83, 81, 76, 64, 70, 80, 80, 58, 63, 53, 44, 4, 58, 53, 63, 41, 52, 50, 63, 4, 54, 41, 56, 4, 50, 54, 43, 41, 62, 40, 40, 50, 52, 53, 4, 61, 52, 41, 4, 53, 58, 47, 50, 45, 62, 4, 45, 50, 63, 62, 52, 4, 58, 63, 40, 4, 45, 105, 37, 32, 42, 51, 27, 48, 45, 41, 33, 27, 48, 43, 27, 51, 37, 45, 48, 27, 34, 43, 54, 27, 50, 45, 32, 33, 43, 27, 52, 40, 37, 61, 27, 41, 55, 59, 62, 52, 45, 5, 53, 52, 62, 63, 44, 51, 57, 63, 5, 50, 51, 41, 46, 53, 40, 35, 5, 62, 59, 46, 59, 5, 63, 52, 59, 56, 54, 63, 62, 47, 18, 23, 29, 4, 44, 7, 26, 30, 22, 28, 6, 7, 44, 1, 22, 4, 18, 1, 23, 22, 23, 44, 5, 26, 23, 22, 28, 106, 102, 100, 39, 111, 104, 106, 108, 107, 102, 102, 98, 39, 104, 109, 122, 39, 79, 76, 72, 93, 92, 91, 76, 86, 74, 70, 71, 79, 64, 78, 84, 81, 91, 66, 106, 84, 91, 81, 71, 90, 92, 81, 106, 88, 80, 88, 90, 71, 76, 106, 90, 69, 65, 58, 63, 53, 44, 4, 58, 53, 63, 41, 52, 50, 63, 4, 46, 40, 62, 4, 56, 58, 56, 51, 62, 4, 54, 52, 63, 46, 55, 62, 4, 61, 52, 41, 4, 50, 54, 58, 60, 62, 40, 55, 50, 56, 33, 9, 35, 37, 51, 9, 55, 38, 38, 9, 63, 56, 37, 34, 55, 58, 58, 9, 34, 57, 57, 58, 52, 55, 36, 46, 43, 33, 56, 16, 44, 61, 46, 60, 39, 16, 60, 39, 38, 42, 35, 43, 16, 42, 33, 46, 45, 35, 42, 43, 45, 40, 34, 59, 19, 45, 34, 40, 62, 35, 37, 40, 19, 47, 45, 47, 36, 41, 19, 33, 35, 40, 57, 32, 41, 19, 33, 45, 52, 19, 63, 37, 54, 41, 53, 48, 58, 35, 11, 61, 58, 32, 49, 38, 39, 32, 61, 32, 61, 53, 56, 11, 58, 49, 35, 11, 61, 57, 53, 51, 49, 11, 48, 49, 39, 61, 51, 58, 38, 35, 41, 48, 24, 53, 49, 24, 37, 50, 33, 33, 34, 53, 24, 36, 47, 34, 36, 44, 24, 34, 41, 38, 37, 43, 34, 35, 77, 86, 79, 79, 62, 59, 49, 40, 0, 42, 44, 58, 0, 56, 45, 58, 58, 49, 0, 60, 43, 62, 121, 85, 84, 78, 83, 84, 79, 95, 116, 113, 123, 98, 74, 113, 122, 74, 123, 122, 97, 74, 103, 112, 121, 122, 116, 113, 74, 124, 123, 97, 112, 103, 102, 97, 124, 97, 124, 116, 121, 74, 116, 113, 116, 101, 97, 112, 103, 80, 85, 95, 70, 110, 68, 66, 84, 110, 82, 80, 82, 89, 84, 85, 110, 84, 73, 84, 82, 68, 69, 94, 67, 110, 88, 95, 110, 82, 80, 82, 89, 84, 110, 92, 80, 95, 80, 86, 84, 67, 22, 19, 25, 0, 40, 22, 25, 19, 5, 24, 30, 19, 40, 19, 30, 4, 22, 21, 27, 18, 40, 7, 27, 22, 14, 22, 21, 27, 18, 40, 7, 5, 18, 20, 22, 20, 31, 18, 90, 95, 85, 76, 100, 72, 83, 84, 78, 87, 95, 100, 82, 85, 82, 79, 100, 84, 85, 100, 88, 87, 90, 72, 72, 100, 87, 84, 90, 95, 82, 85, 92, 106, 111, 101, 124, 84, 110, 101, 106, 105, 103, 110, 84, 110, 115, 100, 123, 103, 106, 114, 110, 121, 84, 104, 106, 104, 99, 110, 116, 113, 123, 98, 74, 101, 121, 116, 108, 116, 119, 121, 112, 102, 74, 123, 112, 98, 74, 113, 112, 102, 124, 114, 123, 16, 31, 26, 16, 24, 20, 6, 18, 1, 23, 44, 7, 26, 30, 22, 44, 30, 0, 38, 35, 41, 48, 24, 52, 47, 40, 50, 43, 35, 24, 
        46, 41, 46, 51, 24, 33, 53, 40, 42, 24, 36, 40, 41, 51, 34, 41, 51, 24, 55, 53, 40, 49, 46, 35, 34, 53, 115, 118, 124, 101, 77, 119, 124, 115, 112, 126, 119, 77, 119, 106, 125, 98, 126, 115, 107, 119, 96, 77, 100, 32, 3, 23, 22, 13, 16, 13, 22, 3, 22, 7, 61, 7, 12, 3, 0, 14, 7, 6, 36, 33, 43, 50, 26, 32, 43, 36, 39, 41, 32, 26, 33, 32, 39, 48, 34, 26, 42, 51, 32, 55, 41, 36, 60, 14, 11, 1, 24, 48, 14, 1, 11, 29, 0, 6, 11, 48, 10, 1, 14, 13, 3, 10, 48, 1, 14, 27, 6, 25, 10, 48, 9, 26, 1, 1, 10, 3, 26, 30, 25, 30, 26, 2, 26, 40, 18, 27, 22, 7, 4, 18, 19, 40, 3, 30, 26, 18, 40, 22, 17, 3, 18, 5, 40, 30, 26, 7, 5, 18, 4, 4, 30, 24, 25, 83, 86, 92, 69, 109, 83, 81, 81, 87, 66, 70, 83, 80, 94, 87, 109, 65, 70, 83, 81, 89, 70, 64, 83, 81, 87, 109, 81, 93, 92, 70, 87, 74, 70, 109, 84, 91, 94, 70, 87, 64, 109, 65, 91, 72, 87, 101, 96, 106, 115, 91, 103, 112, 101, 91, 101, 106, 109, 105, 101, 112, 109, 107, 106, 91, 96, 97, 104, 101, 125, 91, 105, 119, 82, 87, 93, 68, 108, 70, 64, 86, 108, 65, 90, 67, 67, 95, 86, 108, 82, 93, 90, 94, 82, 71, 90, 92, 93, 62, 59, 49, 40, 0, 61, 62, 49, 49, 58, 45, 0, 49, 48, 43, 54, 57, 38, 0, 62, 59, 0, 51, 48, 62, 59, 58, 59, 0, 48, 49, 0, 62, 44, 44, 58, 43, 44, 0, 51, 48, 62, 59, 58, 59, 39, 34, 40, 49, 25, 32, 47, 42, 50, 35, 52, 25, 36, 47, 34, 34, 47, 40, 33, 25, 50, 41, 45, 35, 40, 62, 59, 49, 40, 0, 62, 49, 59, 45, 48, 54, 59, 0, 60, 62, 60, 55, 58, 0, 50, 48, 59, 42, 51, 58, 0, 45, 58, 43, 45, 38, 0, 51, 54, 50, 54, 43, 106, 111, 101, 124, 84, 106, 101, 111, 121, 100, 98, 111, 84, 98, 102, 106, 108, 110, 84, 104, 106, 104, 99, 110, 84, 120, Byte.MAX_VALUE, 100, 121, 110, 84, 105, 114, Byte.MAX_VALUE, 110, 84, 104, 100, 126, 101, Byte.MAX_VALUE, 3, 6, 12, 21, 61, 22, 11, 15, 7, 61, 22, 13, 61, 21, 3, 11, 22, 61, 4, 13, 16, 61, 20, 11, 6, 7, 13, 61, 18, 16, 7, 18, 3, 16, 7, 6, 61, 15, 17, 14, 11, 1, 24, 48, 14, 1, 11, 29, 0, 6, 11, 48, 13, 3, 14, 12, 4, 3, 6, 28, 27, 10, 11, 48, 6, 1, 27, 10, 1, 27, 48, 26, 29, 3, 48, 31, 29, 10, 9, 6, 23, 10, 28, 109, 104, 98, 123, 83, 96, 99, 107, 107, 101, 98, 107, 83, 105, 98, 104, 124, 99, 101, 98, 120, 83, 124, 126, 105, 106, 101, 116, 21, 21, 21, 68, 65, 75, 82, 122, 83, 76, 64, 82, 68, 71, 76, 73, 76, 81, 92, 122, 70, 77, 64, 70, 78, 122, 68, 87, 64, 68, 122, 71, 68, 86, 64, 65, 20, 17, 27, 2, 42, 16, 27, 20, 23, 25, 16, 42, 27, 16, 1, 2, 26, 7, 30, 99, 102, 108, 117, 93, 108, 99, 118, 107, 116, 103, 93, 116, 107, 103, 117, 93, 113, 108, 99, 114, 113, 106, 109, 118, 93, 110, 109, 101, 101, 107, 108, 101, 93, 103, 108, 99, 96, 110, 103, 102, 13, 8, 2, 27, 51, 9, 2, 13, 14, 0, 9, 51, 14, 5, 8, 8, 9, 30, 51, 24, 3, 7, 9, 2, 51, 5, 2, 10, 3, 77, 72, 66, 91, 115, 77, 66, 72, 94, 67, 69, 72, 115, 72, 73, 74, 77, 89, 64, 88, 115, 77, 95, 95, 73, 88, 115, 92, 94, 73, 64, 67, 77, 72, 115, 95, 69, 86, 73, 115, 78, 85, 88, 73, 95, 53, 48, 58, 35, 11, 36, 33, 38, 51, 49, 11, 59, 58, 11, 96, 101, 103, 11, 38, 49, 39, 36, 59, 58, 39, 49, 117, 119, 119, 125, 112, 113, 122, 96, 117, 120, 75, 119, 120, 125, 119, Byte.MAX_VALUE, 103, 75, 119, 123, 122, 114, 125, 115, 58, 96, 99, 123, 75, 103, 96, 113, 100, 75, 119, 123, 122, 114, 125, 102, 121, 75, 118, 97, 96, 96, 123, 122, 75, 96, 113, 108, 96, 51, 39, 38, 61, 32, 61, 38, 51, 38, 55, 13, 54, 59, 33, 51, 48, 62, 55, 54, 58, 63, 53, 44, 4, 56, 47, 58, 4, 54, 50, 53, 4, 40, 56, 58, 55, 62, 4, 58, 53, 50, 54, 58, 47, 50, 52, 53, 4, 43, 62, 41, 56, 62, 53, 47, 58, 60, 62, 103, 98, 104, 113, 89, 99, 104, 103, 100, 106, 99, 89, 117, Byte.MAX_VALUE, 104, 101, 38, 33, 52, 54, 62, 10, 33, 39, 52, 54, 48, 10, 38, 52, 56, 37, 57, 48, 10, 39, 52, 33, 48, 23, 53, 58, 55, 49, 56, 72, 77, 71, 94, 118, 90, 93, 72, 74, 66, 93, 91, 72, 74, 76, 118, 78, 91, 70, 92, 89, 64, 71, 78, 118, 76, 71, 72, 75, 69, 76, 77, 36, 33, 43, 50, 26, 54, 45, 42, 50, 26, 36, 33, 26, 33, 32, 49, 36, 44, 41, 54, 26, 38, 36, 55, 33, 26, 39, 36, 38, 46, 34, 55, 42, 48, 43, 33, 105, 108, 102, Byte.MAX_VALUE, 87, 105, 102, 108, 122, 103, 97, 108, 87, 102, 109, 124, Byte.MAX_VALUE, 103, 122, 99, 87, 108, 109, 110, 105, 125, 100, 124, 87, 122, 109, 124, 122, 97, 109, 123, 87, 102, 125, 101, 26, 24, 24, 18, 31, 30, 21, 15, 26, 23, 36, 24, 23, 18, 24, 16, 8, 36, 24, 20, 
        21, 29, 18, 28, 85, 15, 12, 20, 36, 8, 15, 30, 11, 36, 24, 20, 21, 29, 18, 9, 22, 26, 15, 18, 20, 21, 46, 43, 33, 56, 16, 63, 61, 42, 57, 42, 33, 59, 16, 63, 35, 46, 54, 46, 45, 35, 42, 16, 46, 58, 59, 32, 16, 44, 35, 38, 44, 36, 18, 23, 29, 4, 44, 1, 22, 30, 28, 5, 22, 44, 27, 22, 18, 23, 31, 26, 29, 22, 44, 21, 28, 1, 44, 18, 23, 44, 23, 22, 7, 18, 26, 31, 0, 65, 68, 78, 87, Byte.MAX_VALUE, 66, 69, 78, 67, 72, 77, 65, 82, 75, Byte.MAX_VALUE, 82, 69, 80, 79, 82, 84, Byte.MAX_VALUE, 73, 78, 84, 69, 82, 86, 65, 76, Byte.MAX_VALUE, 77, 83, 59, 23, 22, 12, 17, 22, 13, 29, 71, 30, 27, 17, 8, 32, 26, 17, 30, 29, 19, 26, 32, 15, 13, 26, 19, 16, 30, 27, 100, 97, 107, 114, 90, 96, 107, 100, 103, 105, 96, 90, 100, 112, 113, 106, 90, 97, 96, 118, 113, 119, 106, 124, 90, 105, 96, 100, 110, 118, 53, 48, 58, 35, 11, 39, 60, 59, 33, 56, 48, 11, 56, 59, 51, 11, 53, 39, 39, 49, 32, 11, 33, 38, 56, 34, 39, 45, 52, 28, 38, 45, 34, 33, 47, 38, 28, 42, 34, 33, 1, 4, 14, 23, 63, 19, 8, 15, 21, 12, 4, 63, 3, 12, 5, 1, 18, 63, 6, 5, 1, 20, 21, 18, 5, 63, 3, 15, 14, 6, 9, 7, 63, 15, 14, 63, 3, 18, 1, 19, 8, 5, 19, 123, 126, 116, 109, 69, 123, 116, 126, 104, 117, 115, 126, 69, 121, 117, 119, 106, 104, Byte.MAX_VALUE, 105, 105, 69, 115, 119, 123, 125, Byte.MAX_VALUE, 105, 69, 126, 111, 104, 115, 116, 125, 69, 126, 117, 109, 116, 118, 117, 123, 126, 110, 108, 108, 102, 107, 106, 97, 123, 110, 99, 80, 108, 99, 102, 108, 100, 124, 80, 108, 96, 97, 105, 102, 104, 33, 123, 120, 96, 80, 124, 123, 106, Byte.MAX_VALUE, 80, 108, 110, 97, 108, 106, 99, 80, 109, 122, 123, 123, 96, 97, 80, 123, 106, 119, 123, 26, 31, 21, 12, 36, 8, 19, 20, 12, 36, 26, 11, 11, 36, 18, 21, 8, 15, 26, 23, 23, 36, 26, 31, 36, 31, 30, 15, 26, 18, 23, 8, 90, 108, 118, 35, 116, 106, 111, 111, 35, 97, 102, 35, 119, 98, 104, 102, 109, 35, 119, 108, 35, 98, 109, 108, 119, 107, 102, 113, 35, 103, 102, 112, 119, 106, 109, 98, 119, 106, 108, 109, 45, 82, 87, 93, 68, 108, 64, 91, 65, 90, 93, 88, 108, 71, 86, 75, 71, 108, 64, 90, 73, 86, 108, 85, 92, 65, 108, 82, 87, 108, 87, 86, 71, 82, 90, 95, 64, 110, 107, 97, 120, 80, 110, 97, 107, 125, 96, 102, 107, 80, 122, 124, 106, 80, 124, 123, 106, 110, 98, 102, 97, 104, 80, 102, 98, 110, 104, 106, 80, 107, 106, 108, 96, 107, 102, 97, 104, 67, 70, 76, 85, 125, 80, 71, 65, 77, 79, 82, 87, 86, 71, 125, 64, 86, 125, 67, 68, 86, 71, 80, 125, 71, 90, 86, 80, 67, 81, 125, 65, 74, 67, 76, 69, 71, 32, 37, 47, 54, 30, 36, 47, 32, 35, 45, 36, 30, 51, 32, 38, 36, 30, 50, 41, 32, 42, 36};
    }

    public JQ(Context context) {
        this.A00 = context.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A0M(1494, 31, 75), context), 0);
    }

    public static float A00(Context context) {
        return A0L(context).A1i(A0M(2788, 39, 25), 0.98f);
    }

    public static int A01(Context context) {
        return A0L(context).A1j(A0M(71, 33, 126), 100);
    }

    public static int A02(Context context) {
        return A0L(context).A1j(A0M(3093, 33, 98), 0);
    }

    public static int A03(Context context) {
        return A0L(context).A1j(A0M(2209, 27, 70), -1);
    }

    public static int A04(Context context) {
        return A0L(context).A1j(A0M(2331, 37, 29), 3);
    }

    public static int A05(Context context) {
        return A0L(context).A1j(A0M(1970, 18, 49), 0);
    }

    public static int A06(Context context) {
        return A0L(context).A1j(A0M(514, 50, k.AppCompatTheme_windowFixedWidthMajor), 30000);
    }

    public static int A07(Context context) {
        return A0L(context).A1j(A0M(2940, 40, 74), 3);
    }

    public static int A08(Context context) {
        return A0L(context).A1j(A0M(564, 44, 58), 8000);
    }

    public static int A09(Context context) {
        return A0L(context).A1j(A0M(960, 48, 83), 100);
    }

    public static int A0A(Context context) {
        return A0L(context).A1j(A0M(745, 39, 59), 60000);
    }

    public static int A0B(Context context) {
        return A0L(context).A1j(A0M(639, 38, 2), 225);
    }

    public static int A0C(Context context) {
        return A0L(context).A1j(A0M(2368, 41, 73), 3145728);
    }

    public static int A0D(Context context) {
        return A0L(context).A1j(A0M(2126, 37, 53), -1);
    }

    public static int A0E(Context context) {
        return A0L(context).A1j(A0M(1198, 32, 22), AdError.SERVER_ERROR_CODE);
    }

    public static int A0F(Context context) {
        return A0L(context).A1j(A0M(2163, 46, 112), -1);
    }

    public static int A0G(Context context) {
        return A0L(context).A1j(A0M(2843, 23, 23), 0);
    }

    public static int A0H(Context context) {
        return A0L(context).A1j(A0M(1397, 35, 6), AdError.NETWORK_ERROR_CODE);
    }

    public static int A0I(Context context) {
        return A0L(context).A1j(A0M(2409, 39, 32), 3000);
    }

    public static long A0J(Context context) {
        return A0L(context).A1k(A0M(1641, 34, 14), 67108864L);
    }

    public static long A0K(Context context) {
        return A0L(context).A1k(A0M(2645, 45, 110), 1048576L);
    }

    public static synchronized JQ A0L(Context context) {
        if (A01 == null) {
            A01 = new JQ(context);
        }
        return A01;
    }

    public static String A0N(Context context) {
        return A0L(context).A1l(A0M(2492, 28, 78), A0M(2520, 3, 32));
    }

    public static String A0O(Context context) {
        return A0L(context).A1l(A0M(871, 25, 50), A0M(2520, 3, 32));
    }

    public static String A0P(Context context) {
        return A0L(context).A1l(A0M(3311, 52, 77), A0M(2866, 6, 22));
    }

    public static String A0Q(Context context) {
        return A0L(context).A1l(A0M(232, 51, 42), A0M(3395, 41, 65));
    }

    public static String A0R(Context context) {
        return A0L(context).A1l(A0M(2716, 53, 86), A0M(1759, 8, k.AppCompatTheme_windowFixedWidthMajor));
    }

    public static String A0S(Context context) {
        return A0L(context).A1l(A0M(367, 52, 14), A0M(3126, 9, 58));
    }

    public static Set<String> A0T(Context context) {
        return A0V(context, A0M(2448, 44, 45));
    }

    public static Set<String> A0U(Context context) {
        return A0V(context, A0M(104, 44, 50));
    }

    @SuppressLint({"CatchGeneralException"})
    public static Set<String> A0V(Context context, String str) {
        try {
            JSONArray jsonArray = new JSONArray(A0L(context).A1l(str, A0M(958, 2, 20)));
            int listSize = jsonArray.length();
            Set<String> result = new HashSet<>(listSize);
            for (int i = 0; i < listSize; i++) {
                result.add(jsonArray.getString(i));
            }
            return result;
        } catch (Exception unused) {
            return new HashSet();
        }
    }

    public static void A0X(Context context) {
        A0L(context).A00.edit().clear().commit();
    }

    private void A0Y(@Nullable String str, @Nullable String str2) throws JSONException {
        JQ jq = this;
        SharedPreferences.Editor editorEdit = null;
        String str3 = null;
        String next = null;
        Iterator<String> itKeys = null;
        JSONObject jSONObject = null;
        char c2 = str != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!str.isEmpty()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    str = str;
                    if (!str.equals(A0M(958, 2, 20))) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    jq = jq;
                    str = str;
                    editorEdit = jq.A00.edit();
                    jSONObject = new JSONObject(str);
                    itKeys = jSONObject.keys();
                    c2 = 6;
                    break;
                case 6:
                    itKeys = itKeys;
                    if (!itKeys.hasNext()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    itKeys = itKeys;
                    next = itKeys.next();
                    if (!next.equals(A0M(490, 24, 65))) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    jq = jq;
                    jSONObject = jSONObject;
                    next = next;
                    jq.A0Y(jSONObject.getString(next), next);
                    c2 = 6;
                    break;
                case '\t':
                    str2 = str2;
                    next = next;
                    str3 = next;
                    if (str2 == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    str2 = str2;
                    str3 = str2 + A0M(1466, 1, 67) + str3;
                    c2 = 11;
                    break;
                case 11:
                    editorEdit = editorEdit;
                    jSONObject = jSONObject;
                    next = next;
                    str3 = str3;
                    editorEdit.putString(str3, jSONObject.getString(next));
                    c2 = 6;
                    break;
                case '\f':
                    editorEdit.apply();
                    return;
            }
        }
    }

    public static boolean A0Z(Context context) {
        return A0L(context).A1l(A0M(822, 28, 23), A0M(2769, 19, 16)).equals(A0M(2050, 18, 32));
    }

    public static boolean A0a(Context context) {
        return A0L(context).A1n(A0M(677, 38, 28), false);
    }

    public static boolean A0b(Context context) {
        return A0L(context).A1n(A0M(3512, 37, 96), false);
    }

    public static boolean A0c(Context context) {
        return A0L(context).A1n(A0M(2616, 29, 46), true);
    }

    public static boolean A0d(Context context) {
        return A0L(context).A1n(A0M(931, 27, 34), false);
    }

    public static boolean A0e(Context context) {
        return A0L(context).A1n(A0M(3267, 44, 88), true);
    }

    public static boolean A0f(Context context) {
        return A0L(context).A1n(A0M(1616, 25, 13), true);
    }

    public static boolean A0g(Context context) {
        return A0L(context).A1n(A0M(1767, 39, 87), true);
    }

    public static boolean A0h(Context context) {
        return A0L(context).A1n(A0M(3154, 30, 71), false);
    }

    public static boolean A0i(Context context) {
        return A0L(context).A1n(A0M(2093, 33, 45), true);
    }

    public static boolean A0j(Context context) {
        return A0L(context).A1n(A0M(896, 35, 1), false);
    }

    public static boolean A0k(Context context) {
        return A0L(context).A1n(A0M(349, 18, 51), false);
    }

    public static boolean A0l(Context context) {
        return A0L(context).A1n(A0M(2306, 25, 4), false);
    }

    public static boolean A0m(Context context) {
        boolean z = false;
        char c2 = Build.VERSION.SDK_INT >= 18 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    context = context;
                    z = false;
                    if (!A0L(context).A1n(A0M(2068, 25, 7), false)) {
                        c2 = 4;
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
            }
        }
    }

    public static boolean A0n(Context context) {
        return A0L(context).A1n(A0M(1432, 34, 24), false);
    }

    public static boolean A0o(Context context) {
        boolean z = false;
        char c2 = Build.VERSION.SDK_INT >= 19 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    context = context;
                    z = false;
                    if (!A0L(context).A1n(A0M(3209, 15, 1), false)) {
                        c2 = 4;
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
            }
        }
    }

    public static boolean A0p(Context context) {
        return A0L(context).A1n(A0M(1525, 23, k.AppCompatTheme_windowFixedHeightMinor), false);
    }

    public static boolean A0q(Context context) {
        return A0L(context).A1n(A0M(2575, 41, 64), false);
    }

    public static boolean A0r(Context context) {
        return A0L(context).A1n(A0M(3549, 22, 3), false);
    }

    public static boolean A0s(Context context) {
        return A0L(context).A1n(A0M(1709, 28, 5), true);
    }

    public static boolean A0t(Context context) {
        return A0L(context).A1n(A0M(608, 31, 110), true);
    }

    public static boolean A0u(Context context) {
        return A0L(context).A1n(A0M(2872, 32, 107), false);
    }

    public static boolean A0v(Context context) {
        return A0L(context).A1n(A0M(2980, 46, 57), false);
    }

    public static boolean A0w(Context context) {
        return A0L(context).A1n(A0M(2556, 19, 55), true);
    }

    public static boolean A0x(Context context) {
        return A0L(context).A1n(A0M(2261, 45, 29), false);
    }

    public static boolean A0y(Context context) {
        return A0L(context).A1n(A0M(46, 25, 98), false);
    }

    public static boolean A0z(Context context) {
        return A0L(context).A1n(A0M(3135, 19, 61), true);
    }

    public static boolean A10(Context context) {
        return A0L(context).A1n(A0M(3026, 32, 13), true);
    }

    public static boolean A11(Context context) {
        return A0L(context).A1n(A0M(1008, 57, 65), false);
    }

    public static boolean A12(Context context) {
        return A0L(context).A1n(A0M(1230, 59, 46), true);
    }

    public static boolean A13(Context context) {
        return A0L(context).A1n(A0M(784, 38, 75), true);
    }

    public static boolean A14(Context context) {
        return A0L(context).A1n(A0M(850, 21, k.AppCompatTheme_windowMinWidthMinor), false);
    }

    public static boolean A15(Context context) {
        return A0L(context).A1n(A0M(3224, 43, 34), true);
    }

    public static boolean A16(Context context) {
        return A0L(context).A1n(A0M(1847, 38, 53), false);
    }

    public static boolean A17(Context context) {
        return A0L(context).A1n(A0M(715, 30, 102), true);
    }

    public static boolean A18(Context context) {
        return A0L(context).A1n(A0M(184, 48, 58), false);
    }

    public static boolean A19(Context context) {
        return A0L(context).A1n(A0M(1346, 51, 25), false);
    }

    public static boolean A1A(Context context) {
        return A0L(context).A1n(A0M(1088, 31, 21), false);
    }

    public static boolean A1B(Context context) {
        return A0L(context).A1n(A0M(1119, 53, 20), false);
    }

    public static boolean A1C(Context context) {
        return A0L(context).A1n(A0M(1988, 38, 5), true);
    }

    public static boolean A1D(Context context) {
        return A0L(context).A1n(A0M(1885, 33, k.AppCompatTheme_windowFixedWidthMinor), false);
    }

    public static boolean A1E(Context context) {
        return A0L(context).A1n(A0M(3184, 25, 22), false);
    }

    public static boolean A1F(Context context) {
        return A0L(context).A1n(A0M(1172, 26, 85), false);
    }

    public static boolean A1G(Context context) {
        return A0L(context).A1n(A0M(2690, 26, 22), false);
    }

    public static boolean A1H(Context context) {
        return A0L(context).A1n(A0M(3058, 35, 49), false);
    }

    public static boolean A1I(Context context) {
        return A0L(context).A1n(A0M(2904, 36, 7), false);
    }

    public static boolean A1J(Context context) {
        return A0L(context).A1n(A0M(3363, 32, 57), false);
    }

    public static boolean A1K(Context context) {
        return A0L(context).A1n(A0M(3436, 36, 113), false);
    }

    public static boolean A1L(Context context) {
        return A0L(context).A1n(A0M(464, 26, 80), false);
    }

    public static boolean A1M(Context context) {
        return A0L(context).A1n(A0M(1065, 23, 53), true);
    }

    public static boolean A1N(Context context) {
        return A0L(context).A1n(A0M(1467, 27, 49), false);
    }

    public static boolean A1O(Context context) {
        return A0L(context).A1n(A0M(1588, 28, 20), false);
    }

    public static boolean A1P(Context context) {
        return A0L(context).A1n(A0M(2523, 33, 103), false);
    }

    public static boolean A1Q(Context context) {
        return A0L(context).A1n(A0M(0, 46, 111), true);
    }

    public static boolean A1R(Context context) {
        return A0L(context).A1n(A0M(1675, 34, 22), false);
    }

    public static boolean A1S(Context context) {
        return A0L(context).A1n(A0M(2236, 25, 113), false);
    }

    public static boolean A1T(Context context) {
        return A0L(context).A1n(A0M(419, 45, 69), false);
    }

    public static boolean A1U(Context context) {
        return A0L(context).A1n(A0M(1315, 31, 97), false);
    }

    public static boolean A1V(Context context) {
        return A0L(context).A1n(A0M(2827, 16, 68), true);
    }

    public static boolean A1W(Context context) {
        return A0L(context).A1n(A0M(301, 48, 79), false);
    }

    public static boolean A1X(Context context) {
        return A0L(context).A1n(A0M(283, 18, k.AppCompatTheme_windowFixedWidthMajor), false);
    }

    public static boolean A1Y(Context context) {
        return A0L(context).A1n(A0M(1548, 40, 25), false);
    }

    public static boolean A1Z(Context context) {
        return A0L(context).A1n(A0M(148, 36, k.AppCompatTheme_viewInflaterClass), false);
    }

    public static boolean A1a(Context context) {
        return A0L(context).A1n(A0M(1806, 41, k.AppCompatTheme_windowActionBar), true);
    }

    public static boolean A1b(Context context) {
        boolean z = false;
        char c2 = A1c(context) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    context = context;
                    z = false;
                    if (!A0L(context).A1n(A0M(1918, 27, 73), false)) {
                        c2 = 4;
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
            }
        }
    }

    public static boolean A1c(Context context) {
        boolean z = false;
        char c2 = Build.VERSION.SDK_INT >= 19 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    context = context;
                    z = false;
                    if (!A0L(context).A1n(A0M(2026, 24, 80), false)) {
                        c2 = 4;
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
            }
        }
    }

    public static boolean A1d(Context context) {
        return A0L(context).A1n(A0M(1289, 26, 113), false);
    }

    public static boolean A1e(Context context) {
        return A0L(context).A1n(A0M(1741, 18, 29), false);
    }

    public static boolean A1f(Context context) {
        return A0L(context).A1n(A0M(1945, 25, 87), false);
    }

    public static boolean A1g(Context context) {
        return A0L(context).A1n(A0M(3472, 40, 77), true);
    }

    public final double A1h(String str, double d2) {
        double dDoubleValue = 0.0d;
        String string = this.A00.getString(str, String.valueOf(d2));
        char c2 = string != null ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        if (!string.equals(A0M(1737, 4, 97))) {
                            c2 = 5;
                            break;
                        } else {
                            c2 = '\b';
                            break;
                        }
                    } catch (NumberFormatException unused) {
                        return d2;
                    }
                case 5:
                    string = string;
                    dDoubleValue = Double.valueOf(string).doubleValue();
                    c2 = '\t';
                    break;
                case '\b':
                    dDoubleValue = d2;
                    c2 = '\t';
                    break;
                case '\t':
                    return dDoubleValue;
                case 11:
                    return d2;
            }
        }
    }

    public final float A1i(String str, float f) {
        float fFloatValue = 0.0f;
        String string = this.A00.getString(str, String.valueOf(f));
        char c2 = string != null ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    if (!string.equals(A0M(1737, 4, 97))) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 5:
                    try {
                        string = string;
                        fFloatValue = Float.valueOf(string).floatValue();
                        c2 = '\t';
                        break;
                    } catch (NumberFormatException unused) {
                        return f;
                    }
                case '\b':
                    fFloatValue = f;
                    c2 = '\t';
                    break;
                case '\t':
                    return fFloatValue;
                case 11:
                    return f;
            }
        }
    }

    public final int A1j(String str, int i) {
        int iIntValue = 0;
        String string = this.A00.getString(str, String.valueOf(i));
        char c2 = string != null ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    if (!string.equals(A0M(1737, 4, 97))) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 5:
                    try {
                        string = string;
                        iIntValue = Integer.valueOf(string).intValue();
                        c2 = '\t';
                        break;
                    } catch (NumberFormatException unused) {
                        return i;
                    }
                case '\b':
                    iIntValue = i;
                    c2 = '\t';
                    break;
                case '\t':
                    return iIntValue;
                case 11:
                    return i;
            }
        }
    }

    public final long A1k(String str, long j) {
        long jLongValue = 0;
        String string = this.A00.getString(str, String.valueOf(j));
        char c2 = string != null ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    if (!string.equals(A0M(1737, 4, 97))) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 5:
                    try {
                        string = string;
                        jLongValue = Long.valueOf(string).longValue();
                        c2 = '\t';
                        break;
                    } catch (NumberFormatException unused) {
                        return j;
                    }
                case '\b':
                    jLongValue = j;
                    c2 = '\t';
                    break;
                case '\t':
                    return jLongValue;
                case 11:
                    return j;
            }
        }
    }

    public final String A1l(String str, String str2) {
        String str3 = null;
        String string = this.A00.getString(str, str2);
        char c2 = string != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    string = string;
                    if (!string.equals(A0M(1737, 4, 97))) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str2 = str2;
                    str3 = str2;
                    c2 = 4;
                    break;
                case 4:
                    return str3;
                case 5:
                    string = string;
                    str3 = string;
                    c2 = 4;
                    break;
            }
        }
    }

    public final void A1m(@Nullable String str) throws JSONException {
        A0Y(str, null);
    }

    public final boolean A1n(String str, boolean z) {
        boolean zBooleanValue = false;
        String string = this.A00.getString(str, String.valueOf(z));
        char c2 = string != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    string = string;
                    if (!string.equals(A0M(1737, 4, 97))) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    zBooleanValue = z;
                    c2 = 4;
                    break;
                case 4:
                    return zBooleanValue;
                case 5:
                    string = string;
                    zBooleanValue = Boolean.valueOf(string).booleanValue();
                    c2 = 4;
                    break;
                case 6:
                    return z;
            }
        }
    }
}

package com.facebook.imageutils;

import d.a.b.d.i;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class c {
    public static int a(int i) {
        return e.a(i);
    }

    public static int b(InputStream inputStream) {
        try {
            int iD = d(inputStream);
            if (iD == 0) {
                return 0;
            }
            return e.d(inputStream, iD);
        } catch (IOException unused) {
            return 0;
        }
    }

    private static boolean c(int i) {
        switch (i) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 197:
            case 198:
            case 199:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            case 196:
            case 200:
            case 204:
            default:
                return false;
        }
    }

    private static int d(InputStream inputStream) throws IOException {
        int iA;
        if (e(inputStream, 225) && (iA = d.a(inputStream, 2, false) - 2) > 6) {
            int iA2 = d.a(inputStream, 4, false);
            int iA3 = d.a(inputStream, 2, false);
            int i = (iA - 4) - 2;
            if (iA2 == 1165519206 && iA3 == 0) {
                return i;
            }
        }
        return 0;
    }

    public static boolean e(InputStream inputStream, int i) throws IOException {
        i.g(inputStream);
        while (d.a(inputStream, 1, false) == 255) {
            int iA = 255;
            while (iA == 255) {
                iA = d.a(inputStream, 1, false);
            }
            if ((i == 192 && c(iA)) || iA == i) {
                return true;
            }
            if (iA != 216 && iA != 1) {
                if (iA == 217 || iA == 218) {
                    break;
                }
                inputStream.skip(d.a(inputStream, 2, false) - 2);
            }
        }
        return false;
    }
}

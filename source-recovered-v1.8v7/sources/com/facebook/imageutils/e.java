package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
class e {
    private static final Class<?> a = e.class;

    private static class b {
        boolean a;

        /* renamed from: b, reason: collision with root package name */
        int f1434b;

        /* renamed from: c, reason: collision with root package name */
        int f1435c;

        private b() {
        }
    }

    e() {
    }

    public static int a(int i) {
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    private static int b(InputStream inputStream, int i, boolean z) throws IOException {
        if (i < 10 || d.a(inputStream, 2, z) != 3 || d.a(inputStream, 4, z) != 1) {
            return 0;
        }
        int iA = d.a(inputStream, 2, z);
        d.a(inputStream, 2, z);
        return iA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int c(java.io.InputStream r6, int r7, boolean r8, int r9) throws java.io.IOException {
        /*
            r0 = 0
            r1 = 14
            if (r7 >= r1) goto L6
            return r0
        L6:
            r1 = 2
            int r2 = com.facebook.imageutils.d.a(r6, r1, r8)
            int r7 = r7 + (-2)
        Ld:
            int r3 = r2 + (-1)
            if (r2 <= 0) goto L27
            r2 = 12
            if (r7 < r2) goto L27
            int r2 = com.facebook.imageutils.d.a(r6, r1, r8)
            int r7 = r7 + (-2)
            if (r2 != r9) goto L1e
            return r7
        L1e:
            r4 = 10
            r6.skip(r4)
            int r7 = r7 + (-10)
            r2 = r3
            goto Ld
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imageutils.e.c(java.io.InputStream, int, boolean, int):int");
    }

    public static int d(InputStream inputStream, int i) throws IOException {
        b bVar = new b();
        int iE = e(inputStream, i, bVar);
        int i2 = bVar.f1435c - 8;
        if (iE == 0 || i2 > iE) {
            return 0;
        }
        inputStream.skip(i2);
        return b(inputStream, c(inputStream, iE - i2, bVar.a, 274), bVar.a);
    }

    private static int e(InputStream inputStream, int i, b bVar) throws IOException {
        Class<?> cls;
        String str;
        if (i <= 8) {
            return 0;
        }
        int iA = d.a(inputStream, 4, false);
        bVar.f1434b = iA;
        int i2 = i - 4;
        if (iA == 1229531648 || iA == 1296891946) {
            boolean z = bVar.f1434b == 1229531648;
            bVar.a = z;
            int iA2 = d.a(inputStream, 4, z);
            bVar.f1435c = iA2;
            int i3 = i2 - 4;
            if (iA2 >= 8 && iA2 - 8 <= i3) {
                return i3;
            }
            cls = a;
            str = "Invalid offset";
        } else {
            cls = a;
            str = "Invalid TIFF header";
        }
        d.a.b.e.a.d(cls, str);
        return 0;
    }
}

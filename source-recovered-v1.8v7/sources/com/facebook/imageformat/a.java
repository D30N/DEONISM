package com.facebook.imageformat;

import com.facebook.imageformat.c;
import d.a.b.d.g;
import d.a.b.d.i;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class a implements c.a {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f1239b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f1240c;

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f1241d;
    private static final int e;
    private static final byte[] f = e.a("GIF87a");
    private static final byte[] g = e.a("GIF89a");
    private static final byte[] h;
    private static final int i;
    private static final byte[] j;
    private static final int k;
    private static final byte[] l;
    private static final byte[][] m;
    private static final byte[] n;
    private static final byte[] o;
    private static final int p;
    final int a = g.a(21, 20, f1240c, e, 6, i, k, 12);

    static {
        byte[] bArr = {-1, -40, -1};
        f1239b = bArr;
        f1240c = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f1241d = bArr2;
        e = bArr2.length;
        byte[] bArrA = e.a("BM");
        h = bArrA;
        i = bArrA.length;
        byte[] bArr3 = {0, 0, 1, 0};
        j = bArr3;
        k = bArr3.length;
        l = e.a("ftyp");
        m = new byte[][]{e.a("heic"), e.a("heix"), e.a("hevc"), e.a("hevx"), e.a("mif1"), e.a("msf1")};
        byte[] bArr4 = {73, 73, 42, 0};
        n = bArr4;
        o = new byte[]{77, 77, 0, 42};
        p = bArr4.length;
    }

    private static c c(byte[] bArr, int i2) {
        i.b(d.a.b.l.c.h(bArr, 0, i2));
        return d.a.b.l.c.g(bArr, 0) ? b.f : d.a.b.l.c.f(bArr, 0) ? b.g : d.a.b.l.c.c(bArr, 0, i2) ? d.a.b.l.c.b(bArr, 0) ? b.j : d.a.b.l.c.d(bArr, 0) ? b.i : b.h : c.f1245b;
    }

    private static boolean d(byte[] bArr, int i2) {
        byte[] bArr2 = h;
        if (i2 < bArr2.length) {
            return false;
        }
        return e.c(bArr, bArr2);
    }

    private static boolean e(byte[] bArr, int i2) {
        return i2 >= p && (e.c(bArr, n) || e.c(bArr, o));
    }

    private static boolean f(byte[] bArr, int i2) {
        if (i2 < 6) {
            return false;
        }
        return e.c(bArr, f) || e.c(bArr, g);
    }

    private static boolean g(byte[] bArr, int i2) {
        if (i2 < 12 || bArr[3] < 8 || !e.b(bArr, l, 4)) {
            return false;
        }
        for (byte[] bArr2 : m) {
            if (e.b(bArr, bArr2, 8)) {
                return true;
            }
        }
        return false;
    }

    private static boolean h(byte[] bArr, int i2) {
        byte[] bArr2 = j;
        if (i2 < bArr2.length) {
            return false;
        }
        return e.c(bArr, bArr2);
    }

    private static boolean i(byte[] bArr, int i2) {
        byte[] bArr2 = f1239b;
        return i2 >= bArr2.length && e.c(bArr, bArr2);
    }

    private static boolean j(byte[] bArr, int i2) {
        byte[] bArr2 = f1241d;
        return i2 >= bArr2.length && e.c(bArr, bArr2);
    }

    @Override // com.facebook.imageformat.c.a
    public int a() {
        return this.a;
    }

    @Override // com.facebook.imageformat.c.a
    @Nullable
    public final c b(byte[] bArr, int i2) {
        i.g(bArr);
        return d.a.b.l.c.h(bArr, 0, i2) ? c(bArr, i2) : i(bArr, i2) ? b.a : j(bArr, i2) ? b.f1242b : f(bArr, i2) ? b.f1243c : d(bArr, i2) ? b.f1244d : h(bArr, i2) ? b.e : g(bArr, i2) ? b.k : e(bArr, i2) ? b.l : c.f1245b;
    }
}

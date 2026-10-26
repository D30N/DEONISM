package d.b.a.a.e.e;

/* loaded from: classes.dex */
final class h3 {
    static int a(int i, byte[] bArr, int i2, int i3, g3 g3Var) {
        if ((i >>> 3) == 0) {
            throw y4.c();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return k(bArr, i2, g3Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return i(bArr, i2, g3Var) + g3Var.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw y4.c();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = i(bArr, i2, g3Var);
            i6 = g3Var.a;
            if (i6 == i5) {
                break;
            }
            i2 = a(i6, bArr, i2, i3, g3Var);
        }
        if (i2 > i3 || i6 != i5) {
            throw y4.e();
        }
        return i2;
    }

    static int b(int i, byte[] bArr, int i2, int i3, z4<?> z4Var, g3 g3Var) {
        s4 s4Var = (s4) z4Var;
        int i4 = i(bArr, i2, g3Var);
        while (true) {
            s4Var.j(g3Var.a);
            if (i4 >= i3) {
                break;
            }
            int i5 = i(bArr, i4, g3Var);
            if (i != g3Var.a) {
                break;
            }
            i4 = i(bArr, i5, g3Var);
        }
        return i4;
    }

    static int c(int i, byte[] bArr, int i2, int i3, k7 k7Var, g3 g3Var) {
        if ((i >>> 3) == 0) {
            throw y4.c();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iK = k(bArr, i2, g3Var);
            k7Var.c(i, Long.valueOf(g3Var.f2693b));
            return iK;
        }
        if (i4 == 1) {
            k7Var.c(i, Long.valueOf(l(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int i5 = i(bArr, i2, g3Var);
            int i6 = g3Var.a;
            if (i6 < 0) {
                throw y4.b();
            }
            if (i6 > bArr.length - i5) {
                throw y4.a();
            }
            k7Var.c(i, i6 == 0 ? l3.f2755c : l3.l(bArr, i5, i6));
            return i5 + i6;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw y4.c();
            }
            k7Var.c(i, Integer.valueOf(h(bArr, i2)));
            return i2 + 4;
        }
        k7 k7VarG = k7.g();
        int i7 = (i & (-8)) | 4;
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int i9 = i(bArr, i2, g3Var);
            int i10 = g3Var.a;
            i8 = i10;
            if (i10 == i7) {
                i2 = i9;
                break;
            }
            int iC = c(i8, bArr, i9, i3, k7VarG, g3Var);
            i8 = i10;
            i2 = iC;
        }
        if (i2 > i3 || i8 != i7) {
            throw y4.e();
        }
        k7Var.c(i, k7VarG);
        return i2;
    }

    static int d(int i, byte[] bArr, int i2, g3 g3Var) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b3 = bArr[i6];
            if (b3 >= 0) {
                i3 = b3 << 14;
            } else {
                i5 = i7 | ((b3 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b4 = bArr[i8];
                if (b4 >= 0) {
                    i4 = b4 << 21;
                } else {
                    i7 = i5 | ((b4 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b5 = bArr[i6];
                    if (b5 >= 0) {
                        i3 = b5 << 28;
                    } else {
                        int i9 = i7 | ((b5 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                g3Var.a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            g3Var.a = i7 | i3;
            return i8;
        }
        i4 = b2 << 7;
        g3Var.a = i5 | i4;
        return i6;
    }

    static int e(s6<?> s6Var, int i, byte[] bArr, int i2, int i3, z4<?> z4Var, g3 g3Var) {
        int iG = g(s6Var, bArr, i2, i3, g3Var);
        while (true) {
            z4Var.add(g3Var.f2694c);
            if (iG >= i3) {
                break;
            }
            int i4 = i(bArr, iG, g3Var);
            if (i != g3Var.a) {
                break;
            }
            iG = g(s6Var, bArr, i4, i3, g3Var);
        }
        return iG;
    }

    static int f(s6 s6Var, byte[] bArr, int i, int i2, int i3, g3 g3Var) {
        e6 e6Var = (e6) s6Var;
        Object objA = e6Var.a();
        int iO = e6Var.o(objA, bArr, i, i2, i3, g3Var);
        e6Var.d(objA);
        g3Var.f2694c = objA;
        return iO;
    }

    static int g(s6 s6Var, byte[] bArr, int i, int i2, g3 g3Var) {
        int iD = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iD = d(i3, bArr, iD, g3Var);
            i3 = g3Var.a;
        }
        int i4 = iD;
        if (i3 < 0 || i3 > i2 - i4) {
            throw y4.a();
        }
        Object objA = s6Var.a();
        int i5 = i3 + i4;
        s6Var.i(objA, bArr, i4, i5, g3Var);
        s6Var.d(objA);
        g3Var.f2694c = objA;
        return i5;
    }

    static int h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static int i(byte[] bArr, int i, g3 g3Var) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return d(b2, bArr, i2, g3Var);
        }
        g3Var.a = b2;
        return i2;
    }

    static int j(byte[] bArr, int i, z4<?> z4Var, g3 g3Var) {
        s4 s4Var = (s4) z4Var;
        int i2 = i(bArr, i, g3Var);
        int i3 = g3Var.a + i2;
        while (i2 < i3) {
            i2 = i(bArr, i2, g3Var);
            s4Var.j(g3Var.a);
        }
        if (i2 == i3) {
            return i2;
        }
        throw y4.a();
    }

    static int k(byte[] bArr, int i, g3 g3Var) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            g3Var.f2693b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        g3Var.f2693b = j2;
        return i3;
    }

    static long l(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    static double m(byte[] bArr, int i) {
        return Double.longBitsToDouble(l(bArr, i));
    }

    static int n(byte[] bArr, int i, g3 g3Var) throws y4 {
        int i2 = i(bArr, i, g3Var);
        int i3 = g3Var.a;
        if (i3 < 0) {
            throw y4.b();
        }
        if (i3 == 0) {
            g3Var.f2694c = "";
            return i2;
        }
        g3Var.f2694c = new String(bArr, i2, i3, u4.a);
        return i2 + i3;
    }

    static float o(byte[] bArr, int i) {
        return Float.intBitsToFloat(h(bArr, i));
    }

    static int p(byte[] bArr, int i, g3 g3Var) throws y4 {
        int i2 = i(bArr, i, g3Var);
        int i3 = g3Var.a;
        if (i3 < 0) {
            throw y4.b();
        }
        if (i3 == 0) {
            g3Var.f2694c = "";
            return i2;
        }
        g3Var.f2694c = t7.k(bArr, i2, i3);
        return i2 + i3;
    }

    static int q(byte[] bArr, int i, g3 g3Var) {
        int i2 = i(bArr, i, g3Var);
        int i3 = g3Var.a;
        if (i3 < 0) {
            throw y4.b();
        }
        if (i3 > bArr.length - i2) {
            throw y4.a();
        }
        if (i3 == 0) {
            g3Var.f2694c = l3.f2755c;
            return i2;
        }
        g3Var.f2694c = l3.l(bArr, i2, i3);
        return i2 + i3;
    }
}

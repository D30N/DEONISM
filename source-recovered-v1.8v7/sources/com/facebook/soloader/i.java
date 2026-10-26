package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class i {

    private static class a extends RuntimeException {
        a(String str) {
            super(str);
        }
    }

    public enum b {
        NOT_SO("not_so"),
        X86("x86"),
        ARM("armeabi-v7a"),
        X86_64("x86_64"),
        AARCH64("arm64-v8a"),
        OTHERS("others");


        /* renamed from: b, reason: collision with root package name */
        private final String f1460b;

        b(String str) {
            this.f1460b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f1460b;
        }
    }

    public static String[] a(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return b(fileInputStream.getChannel());
        } finally {
            fileInputStream.close();
        }
    }

    public static String[] b(FileChannel fileChannel) {
        long jF;
        long j;
        long jF2;
        long j2;
        long jC;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        if (f(fileChannel, byteBufferAllocate, 0L) != 1179403647) {
            throw new a("file is not ELF");
        }
        boolean z = g(fileChannel, byteBufferAllocate, 4L) == 1;
        if (g(fileChannel, byteBufferAllocate, 5L) == 2) {
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        }
        long jF3 = z ? f(fileChannel, byteBufferAllocate, 28L) : c(fileChannel, byteBufferAllocate, 32L);
        long jE = z ? e(fileChannel, byteBufferAllocate, 44L) : e(fileChannel, byteBufferAllocate, 56L);
        int iE = e(fileChannel, byteBufferAllocate, z ? 42L : 54L);
        if (jE == 65535) {
            long jF4 = z ? f(fileChannel, byteBufferAllocate, 32L) : c(fileChannel, byteBufferAllocate, 40L);
            jE = f(fileChannel, byteBufferAllocate, z ? jF4 + 28 : jF4 + 44);
        }
        long j3 = jF3;
        long j4 = 0;
        while (true) {
            if (j4 >= jE) {
                jF = 0;
                break;
            }
            if (f(fileChannel, byteBufferAllocate, j3 + 0) == 2) {
                jF = z ? f(fileChannel, byteBufferAllocate, j3 + 4) : c(fileChannel, byteBufferAllocate, j3 + 8);
            } else {
                j3 += iE;
                j4++;
            }
        }
        long j5 = 0;
        if (jF == 0) {
            throw new a("ELF file does not contain dynamic linking information");
        }
        long j6 = jF;
        long jF5 = 0;
        int i = 0;
        while (true) {
            boolean z2 = z;
            long jF6 = z ? f(fileChannel, byteBufferAllocate, j6 + j5) : c(fileChannel, byteBufferAllocate, j6 + j5);
            if (jF6 == 1) {
                j = jF;
                if (i == Integer.MAX_VALUE) {
                    throw new a("malformed DT_NEEDED section");
                }
                i++;
            } else {
                j = jF;
                if (jF6 == 5) {
                    jF5 = z2 ? f(fileChannel, byteBufferAllocate, j6 + 4) : c(fileChannel, byteBufferAllocate, j6 + 8);
                }
            }
            long j7 = 16;
            j6 += z2 ? 8L : 16L;
            j5 = 0;
            if (jF6 != 0) {
                z = z2;
                jF = j;
            } else {
                if (jF5 == 0) {
                    throw new a("Dynamic section string-table not found");
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= jE) {
                        jF2 = 0;
                        break;
                    }
                    if (f(fileChannel, byteBufferAllocate, jF3 + j5) == 1) {
                        long jF7 = z2 ? f(fileChannel, byteBufferAllocate, jF3 + 8) : c(fileChannel, byteBufferAllocate, jF3 + j7);
                        if (z2) {
                            j2 = jE;
                            jC = f(fileChannel, byteBufferAllocate, jF3 + 20);
                        } else {
                            j2 = jE;
                            jC = c(fileChannel, byteBufferAllocate, jF3 + 40);
                        }
                        if (jF7 <= jF5 && jF5 < jC + jF7) {
                            jF2 = (z2 ? f(fileChannel, byteBufferAllocate, jF3 + 4) : c(fileChannel, byteBufferAllocate, jF3 + 8)) + (jF5 - jF7);
                        }
                    } else {
                        j2 = jE;
                    }
                    jF3 += iE;
                    i2++;
                    jE = j2;
                    j7 = 16;
                    j5 = 0;
                }
                long j8 = 0;
                if (jF2 == 0) {
                    throw new a("did not find file offset of DT_STRTAB table");
                }
                String[] strArr = new String[i];
                int i3 = 0;
                while (true) {
                    long j9 = j + j8;
                    long jF8 = z2 ? f(fileChannel, byteBufferAllocate, j9) : c(fileChannel, byteBufferAllocate, j9);
                    if (jF8 == 1) {
                        strArr[i3] = d(fileChannel, byteBufferAllocate, (z2 ? f(fileChannel, byteBufferAllocate, j + 4) : c(fileChannel, byteBufferAllocate, j + 8)) + jF2);
                        if (i3 == Integer.MAX_VALUE) {
                            throw new a("malformed DT_NEEDED section");
                        }
                        i3++;
                    }
                    j += z2 ? 8L : 16L;
                    if (jF8 == 0) {
                        if (i3 == i) {
                            return strArr;
                        }
                        throw new a("malformed DT_NEEDED section");
                    }
                    j8 = 0;
                }
            }
        }
    }

    private static long c(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        h(fileChannel, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    private static String d(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short sG = g(fileChannel, byteBuffer, j);
            if (sG == 0) {
                return sb.toString();
            }
            sb.append((char) sG);
            j = j2;
        }
    }

    private static int e(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        h(fileChannel, byteBuffer, 2, j);
        return byteBuffer.getShort() & 65535;
    }

    private static long f(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        h(fileChannel, byteBuffer, 4, j);
        return byteBuffer.getInt() & 4294967295L;
    }

    private static short g(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        h(fileChannel, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }

    private static void h(FileChannel fileChannel, ByteBuffer byteBuffer, int i, long j) {
        int i2;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (i2 = fileChannel.read(byteBuffer, j)) != -1) {
            j += i2;
        }
        if (byteBuffer.remaining() > 0) {
            throw new a("ELF file truncated");
        }
        byteBuffer.position(0);
    }
}

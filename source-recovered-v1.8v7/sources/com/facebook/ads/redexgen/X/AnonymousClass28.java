package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import d.b.a.b.k;
import java.nio.ByteBuffer;
import java.util.Arrays;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.28, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass28 extends C3T implements IZ {
    public static byte[] A0E;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaFormat A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final B2 A0C;
    public final B8 A0D;

    static {
        A06();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 10);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A0E = new byte[]{49, 60, 43, 54, 40, 53, 45, 60, 121, 107, 103, 122, 102, 111, 39, 120, 107, 126, 111, 16, 28, 5, 80, 20, 19, 13, 8, 9, 80, 14, 20, 7, 24, 72, 71, 77, 91, 70, 64, 77, 7, 90, 70, 79, 93, 94, 72, 91, 76, 7, 69, 76, 72, 71, 75, 72, 74, 66, 40, 42, 63, 73, 52, 34, 36, 73, 6, 6, 4, 73, 3, 2, 4, 102, 100, 113, 7, 78, 70, 70, 78, 69, 76, 7, 91, 72, 94, 7, 77, 76, 74, 70, 77, 76, 91, 3, 1, 26, 28, 1, 26, 7, 10, 48, 47, 56, 37, 44, 38, 62, 47, 118, 100, 104, 118, 112, 107, 98, 92, 87, 94, 81, 81, 90, 83, 18, 92, 80, 74, 81, 75, 59, 54, 33, 60, 63, 39, 54, 92, 72, 89, 84, 82, 18, 79, 92, 74, 106, 110, 106, 98};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bw != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public AnonymousClass28(Context context, Dg dg, @Nullable InterfaceC0397Bw<C0948Ye> interfaceC0397Bw, boolean z, @Nullable Handler handler, @Nullable B3 b3, @Nullable C0365Ao c0365Ao, InterfaceC0372Av... interfaceC0372AvArr) {
        this(context, dg, interfaceC0397Bw, z, handler, b3, new YL(c0365Ao, interfaceC0372AvArr));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bw != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public AnonymousClass28(Context context, Dg dg, @Nullable InterfaceC0397Bw<C0948Ye> interfaceC0397Bw, boolean z, @Nullable Handler handler, @Nullable B3 b3, B8 b8) {
        super(1, dg, interfaceC0397Bw, z);
        this.A0B = context.getApplicationContext();
        this.A0D = b8;
        this.A0C = new B2(handler, b3);
        b8.AD5(new YN(this));
    }

    private int A00(C0418Da c0418Da, Format format) {
        AnonymousClass28 anonymousClass28 = this;
        boolean z = false;
        PackageManager packageManager = null;
        char c2 = C0560Iy.A01 < 24 ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    c0418Da = c0418Da;
                    if (!A04(73, 22, 35).equals(c0418Da.A02)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    if (C0560Iy.A01 != 23) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass28 = anonymousClass28;
                    packageManager = anonymousClass28.A0B.getPackageManager();
                    if (packageManager == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    packageManager = packageManager;
                    if (!packageManager.hasSystemFeature(A04(33, 25, 35))) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    z = false;
                    c2 = 7;
                    break;
                case 7:
                    if (!z) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return -1;
                case '\t':
                    return format.A09;
            }
        }
    }

    private final int A01(C0418Da c0418Da, Format format, Format[] formatArr) {
        return A00(c0418Da, format);
    }

    @SuppressLint({"InlinedApi"})
    private final MediaFormat A02(Format format, String str, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A04(147, 4, 13), str);
        mediaFormat.setInteger(A04(k.AppCompatTheme_windowFixedHeightMajor, 13, 53), format.A05);
        mediaFormat.setInteger(A04(8, 11, 0), format.A0C);
        C0427Dm.A06(mediaFormat, format.A0P);
        C0427Dm.A04(mediaFormat, A04(19, 14, k.AppCompatTheme_windowFixedHeightMinor), i);
        if (C0560Iy.A01 >= 23) {
            mediaFormat.setInteger(A04(95, 8, k.AppCompatTheme_windowFixedWidthMinor), 0);
        }
        return mediaFormat;
    }

    private void A05() {
        AnonymousClass28 anonymousClass28 = this;
        long jMax = 0;
        long jA5v = anonymousClass28.A0D.A5v(anonymousClass28.A7c());
        char c2 = jA5v != Long.MIN_VALUE ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass28 = anonymousClass28;
                    if (!anonymousClass28.A08) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    jMax = jA5v;
                    c2 = 4;
                    break;
                case 4:
                    anonymousClass28 = anonymousClass28;
                    anonymousClass28.A05 = jMax;
                    anonymousClass28.A08 = false;
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    anonymousClass28 = anonymousClass28;
                    jMax = Math.max(anonymousClass28.A05, jA5v);
                    c2 = 4;
                    break;
            }
        }
    }

    public static boolean A08(String str) {
        boolean z = false;
        char c2 = C0560Iy.A01 < 24 ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!A04(58, 15, 109).equals(str)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (!A04(111, 7, 15).equals(C0560Iy.A04)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (!C0560Iy.A02.startsWith(A04(103, 8, 64))) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 5:
                    if (!C0560Iy.A02.startsWith(A04(131, 7, 89))) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    if (!C0560Iy.A02.startsWith(A04(0, 8, 83))) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    z = true;
                    c2 = '\b';
                    break;
                case '\b':
                    return z;
                case '\t':
                    z = false;
                    c2 = '\b';
                    break;
            }
        }
    }

    private final boolean A09(String str) {
        AnonymousClass28 anonymousClass28 = this;
        boolean z = false;
        int iA00 = C0537Ib.A00(str);
        char c2 = iA00 != 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass28 = anonymousClass28;
                    if (!anonymousClass28.A0D.A7b(iA00)) {
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

    @Override // com.facebook.ads.redexgen.X.C3T, com.facebook.ads.redexgen.X.EN
    public final void A12() {
        try {
            this.A0D.ACJ();
            try {
                super.A12();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.A12();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T, com.facebook.ads.redexgen.X.EN
    public final void A13() {
        super.A13();
        this.A0D.ABm();
    }

    @Override // com.facebook.ads.redexgen.X.C3T, com.facebook.ads.redexgen.X.EN
    public final void A14() {
        A05();
        this.A0D.pause();
        super.A14();
    }

    @Override // com.facebook.ads.redexgen.X.C3T, com.facebook.ads.redexgen.X.EN
    public final void A15(long j, boolean z) throws C03479w {
        super.A15(j, z);
        this.A0D.reset();
        this.A05 = j;
        this.A07 = true;
        this.A08 = true;
    }

    @Override // com.facebook.ads.redexgen.X.C3T, com.facebook.ads.redexgen.X.EN
    public final void A16(boolean z) throws C03479w {
        AnonymousClass28 anonymousClass28 = this;
        super.A16(z);
        anonymousClass28.A0C.A05(anonymousClass28.A0U);
        int i = anonymousClass28.A11().A00;
        char c2 = i != 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass28 = anonymousClass28;
                    anonymousClass28.A0D.A4u(i);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    anonymousClass28 = anonymousClass28;
                    anonymousClass28.A0D.A4l();
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final int A1A(MediaCodec mediaCodec, C0418Da c0418Da, Format format, Format format2) {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bw != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    @Override // com.facebook.ads.redexgen.X.C3T
    public final int A1B(Dg dg, InterfaceC0397Bw<C0948Ye> interfaceC0397Bw, Format format) throws C0424Dj {
        InterfaceC0397Bw<C0948Ye> interfaceC0397Bw2 = interfaceC0397Bw;
        Format format2 = format;
        Dg dg2 = dg;
        AnonymousClass28 anonymousClass28 = this;
        C0418Da c0418DaA60 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        DrmInitData drmInitData = null;
        int i5 = 0;
        boolean zA0x = false;
        int i6 = 0;
        int i7 = 0;
        String str = format2.A0O;
        boolean z2 = false;
        char c2 = !C0537Ib.A0B(str) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 0;
                case 3:
                    i7 = 21;
                    if (C0560Iy.A01 < 21) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i2 = 32;
                    c2 = 5;
                    break;
                case 5:
                    interfaceC0397Bw2 = interfaceC0397Bw2;
                    format2 = format2;
                    zA0x = EN.A0x(interfaceC0397Bw2, format2.A0H);
                    i3 = 4;
                    if (!zA0x) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    anonymousClass28 = anonymousClass28;
                    str = str;
                    boolean requiresSecureDecryption = anonymousClass28.A09(str);
                    if (!requiresSecureDecryption) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    dg2 = dg2;
                    if (dg2.A6h() == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return i2 | 8 | i3;
                case '\t':
                    i2 = 0;
                    c2 = 5;
                    break;
                case '\n':
                    str = str;
                    boolean requiresSecureDecryption2 = A04(138, 9, 55).equals(str);
                    i4 = 1;
                    if (!requiresSecureDecryption2) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    anonymousClass28 = anonymousClass28;
                    format2 = format2;
                    boolean requiresSecureDecryption3 = anonymousClass28.A0D.A7b(format2.A0A);
                    if (!requiresSecureDecryption3) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    anonymousClass28 = anonymousClass28;
                    i6 = 2;
                    boolean requiresSecureDecryption4 = anonymousClass28.A0D.A7b(2);
                    if (!requiresSecureDecryption4) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case '\r':
                    return i4;
                case 14:
                    format2 = format2;
                    z = false;
                    drmInitData = format2.A0H;
                    if (drmInitData == null) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    i5 = 0;
                    c2 = 16;
                    break;
                case 16:
                    drmInitData = drmInitData;
                    if (i5 >= drmInitData.A01) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    drmInitData = drmInitData;
                    boolean requiresSecureDecryption5 = drmInitData.A03(i5).A03;
                    z |= requiresSecureDecryption5;
                    i5++;
                    c2 = 16;
                    break;
                case 18:
                    dg2 = dg2;
                    str = str;
                    c0418DaA60 = dg2.A60(str, z);
                    if (c0418DaA60 != null) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    if (!z) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    dg2 = dg2;
                    str = str;
                    z2 = false;
                    if (dg2.A60(str, false) == null) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    i4 = 2;
                    c2 = 22;
                    break;
                case 22:
                    return i4;
                case 23:
                    if (!zA0x) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 24:
                    return i6;
                case 25:
                    if (C0560Iy.A01 < i7) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    format2 = format2;
                    i = -1;
                    if (format2.A0C == -1) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    format2 = format2;
                    c0418DaA60 = c0418DaA60;
                    boolean requiresSecureDecryption6 = c0418DaA60.A0G(format2.A0C);
                    if (!requiresSecureDecryption6) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    format2 = format2;
                    if (format2.A05 == i) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 29;
                        break;
                    }
                case 29:
                    format2 = format2;
                    c0418DaA60 = c0418DaA60;
                    boolean requiresSecureDecryption7 = c0418DaA60.A0F(format2.A05);
                    if (!requiresSecureDecryption7) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    z2 = true;
                    c2 = 31;
                    break;
                case 31:
                    if (!z2) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = ' ';
                        break;
                    }
                case ' ':
                    return i2 | 8 | i3;
                case '!':
                    i3 = 3;
                    c2 = ' ';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final C0418Da A1E(Dg dg, Format format, boolean z) throws C0424Dj {
        C0418Da c0418DaA6h = null;
        char c2 = A09(format.A0O) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    dg = dg;
                    c0418DaA6h = dg.A6h();
                    if (c0418DaA6h == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return c0418DaA6h;
                case 4:
                    return super.A1E(dg, format, z);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final void A1H() throws C03479w {
        try {
            this.A0D.ABn();
        } catch (B7 e) {
            throw C03479w.A01(e, A0y());
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final void A1K(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C03479w {
        MediaFormat mediaFormat2 = mediaFormat;
        AnonymousClass28 anonymousClass28 = this;
        int iA00 = 0;
        int[] iArr = null;
        int channelCount = 0;
        int sampleRate = 0;
        int[] iArr2 = null;
        MediaFormat mediaFormat3 = null;
        int integer = 0;
        int i = 0;
        int i2 = 0;
        MediaFormat mediaFormat4 = anonymousClass28.A06;
        int i3 = mediaFormat4 != null ? 2 : 9;
        while (true) {
            switch (i3) {
                case 2:
                    anonymousClass28 = anonymousClass28;
                    mediaFormat4 = mediaFormat4;
                    iA00 = C0537Ib.A00(mediaFormat4.getString(A04(147, 4, 13)));
                    mediaFormat3 = anonymousClass28.A06;
                    i3 = 3;
                    break;
                case 3:
                    anonymousClass28 = anonymousClass28;
                    mediaFormat3 = mediaFormat3;
                    integer = mediaFormat3.getInteger(A04(k.AppCompatTheme_windowFixedHeightMajor, 13, 53));
                    sampleRate = mediaFormat3.getInteger(A04(8, 11, 0));
                    if (!anonymousClass28.A09) {
                        i3 = 11;
                        break;
                    } else {
                        i3 = 4;
                        break;
                    }
                case 4:
                    i = 6;
                    if (integer != 6) {
                        i3 = 11;
                        break;
                    } else {
                        i3 = 5;
                        break;
                    }
                case 5:
                    anonymousClass28 = anonymousClass28;
                    i2 = anonymousClass28.A00;
                    if (i2 >= i) {
                        i3 = 11;
                        break;
                    } else {
                        i3 = 6;
                        break;
                    }
                case 6:
                    iArr = new int[i2];
                    channelCount = 0;
                    i3 = 7;
                    break;
                case 7:
                    anonymousClass28 = anonymousClass28;
                    int i4 = anonymousClass28.A00;
                    if (channelCount >= i4) {
                        i3 = 10;
                        break;
                    } else {
                        i3 = 8;
                        break;
                    }
                case 8:
                    iArr = iArr;
                    iArr[channelCount] = channelCount;
                    channelCount++;
                    i3 = 7;
                    break;
                case 9:
                    anonymousClass28 = anonymousClass28;
                    mediaFormat2 = mediaFormat2;
                    iA00 = anonymousClass28.A04;
                    mediaFormat3 = mediaFormat2;
                    i3 = 3;
                    break;
                case 10:
                    iArr = iArr;
                    iArr2 = iArr;
                    i3 = 12;
                    break;
                case 11:
                    iArr2 = null;
                    i3 = 12;
                    break;
                case 12:
                    try {
                        anonymousClass28 = anonymousClass28;
                        anonymousClass28.A0D.A45(iA00, integer, sampleRate, 0, iArr2, anonymousClass28.A02, anonymousClass28.A03);
                        return;
                    } catch (B4 e) {
                        throw C03479w.A01(e, anonymousClass28.A0y());
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final void A1L(Format format) throws C03479w {
        int i = 0;
        super.A1L(format);
        this.A0C.A03(format);
        char c2 = A04(138, 9, 55).equals(format.A0O) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    format = format;
                    i = format.A0A;
                    c2 = 3;
                    break;
                case 3:
                    AnonymousClass28 anonymousClass28 = this;
                    Format format2 = format;
                    anonymousClass28.A04 = i;
                    anonymousClass28.A00 = format2.A05;
                    anonymousClass28.A02 = format2.A06;
                    anonymousClass28.A03 = format2.A07;
                    return;
                case 4:
                    i = 2;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final void A1M(YT yt) {
        AnonymousClass28 anonymousClass28 = this;
        char c2 = anonymousClass28.A07 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    yt = yt;
                    if (!yt.A03()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 3:
                    anonymousClass28 = anonymousClass28;
                    yt = yt;
                    if (Math.abs(yt.A00 - anonymousClass28.A05) <= 500000) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass28 = anonymousClass28;
                    yt = yt;
                    anonymousClass28.A05 = yt.A00;
                    c2 = 5;
                    break;
                case 5:
                    anonymousClass28 = anonymousClass28;
                    anonymousClass28.A07 = false;
                    c2 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final void A1N(C0418Da c0418Da, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        AnonymousClass28 anonymousClass28 = this;
        MediaFormat mediaFormat = null;
        MediaFormat mediaFormatA02 = null;
        String strA04 = null;
        anonymousClass28.A01 = anonymousClass28.A01(c0418Da, format, anonymousClass28.A19());
        anonymousClass28.A09 = A08(c0418Da.A02);
        anonymousClass28.A0A = c0418Da.A04;
        char c2 = c0418Da.A01 == null ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    strA04 = A04(138, 9, 55);
                    c2 = 3;
                    break;
                case 3:
                    anonymousClass28 = anonymousClass28;
                    mediaCodec = mediaCodec;
                    format = format;
                    mediaCrypto = mediaCrypto;
                    strA04 = strA04;
                    mediaFormatA02 = anonymousClass28.A02(format, strA04, anonymousClass28.A01);
                    mediaFormat = null;
                    mediaCodec.configure(mediaFormatA02, (Surface) null, mediaCrypto, 0);
                    if (!anonymousClass28.A0A) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    anonymousClass28 = anonymousClass28;
                    format = format;
                    mediaFormatA02 = mediaFormatA02;
                    anonymousClass28.A06 = mediaFormatA02;
                    anonymousClass28.A06.setString(A04(147, 4, 13), format.A0O);
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    anonymousClass28 = anonymousClass28;
                    anonymousClass28.A06 = mediaFormat;
                    c2 = 5;
                    break;
                case 7:
                    c0418Da = c0418Da;
                    strA04 = c0418Da.A01;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final void A1O(String str, long j, long j2) {
        this.A0C.A06(str, j, j2);
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final boolean A1P(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C03479w {
        AnonymousClass28 anonymousClass28 = this;
        Exception e = null;
        char c2 = anonymousClass28.A0A ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c2 = (i2 & 2) != 0 ? (char) 3 : (char) 4;
                case 3:
                    mediaCodec.releaseOutputBuffer(i, false);
                    return true;
                case 4:
                    c2 = z ? (char) 5 : (char) 6;
                case 5:
                    AnonymousClass28 anonymousClass282 = anonymousClass28;
                    mediaCodec.releaseOutputBuffer(i, false);
                    anonymousClass282.A0U.A08++;
                    anonymousClass282.A0D.A7J();
                    return true;
                case 6:
                    try {
                        anonymousClass28 = anonymousClass28;
                        c2 = anonymousClass28.A0D.A7I(byteBuffer, j3) ? '\t' : (char) 14;
                    } catch (B5 e2) {
                        e = e2;
                        c2 = 17;
                    } catch (B7 e3) {
                        e = e3;
                        c2 = 17;
                    }
                case '\t':
                    mediaCodec = mediaCodec;
                    mediaCodec.releaseOutputBuffer(i, false);
                    anonymousClass28.A0U.A06++;
                    return true;
                case 14:
                    return false;
                case 17:
                    throw C03479w.A01(e, anonymousClass28.A0y());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.EN, com.facebook.ads.redexgen.X.YC
    public final IZ A6W() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final AH A6m() {
        return this.A0D.A6m();
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final long A6p() {
        if (A73() == 2) {
            A05();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.EN, com.facebook.ads.redexgen.X.AR
    public final void A7K(int i, Object obj) throws C03479w {
        AnonymousClass28 anonymousClass28 = this;
        char c2 = i != 2 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 3) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    anonymousClass28 = anonymousClass28;
                    obj = obj;
                    super.A7K(i, obj);
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    anonymousClass28 = anonymousClass28;
                    obj = obj;
                    anonymousClass28.A0D.ACy((C0364An) obj);
                    c2 = 4;
                    break;
                case 6:
                    anonymousClass28 = anonymousClass28;
                    obj = obj;
                    anonymousClass28.A0D.setVolume(((Float) obj).floatValue());
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T, com.facebook.ads.redexgen.X.YC
    public final boolean A7c() {
        AnonymousClass28 anonymousClass28 = this;
        boolean z = false;
        char c2 = super.A7c() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass28 = anonymousClass28;
                    if (!anonymousClass28.A0D.A7c()) {
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

    @Override // com.facebook.ads.redexgen.X.C3T, com.facebook.ads.redexgen.X.YC
    public final boolean A7k() {
        AnonymousClass28 anonymousClass28 = this;
        boolean z = false;
        char c2 = !anonymousClass28.A0D.A7M() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass28 = anonymousClass28;
                    if (!super.A7k()) {
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

    @Override // com.facebook.ads.redexgen.X.IZ
    public final AH AD9(AH ah) {
        return this.A0D.AD9(ah);
    }
}

package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.util.Log;
import d.b.a.b.k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class YL implements B8 {
    public static boolean A0p;
    public static boolean A0q;
    public static byte[] A0r;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public AudioTrack A0M;

    @Nullable
    public AudioTrack A0N;

    @Nullable
    public AH A0O;
    public AH A0P;
    public C0364An A0Q;

    @Nullable
    public B6 A0R;

    @Nullable
    public ByteBuffer A0S;

    @Nullable
    public ByteBuffer A0T;

    @Nullable
    public ByteBuffer A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public byte[] A0c;
    public InterfaceC0372Av[] A0d;
    public ByteBuffer[] A0e;
    public final ConditionVariable A0f;

    @Nullable
    public final C0365Ao A0g;
    public final BE A0h;
    public final YI A0i;
    public final BH A0j;
    public final YS A0k;
    public final ArrayDeque<BJ> A0l;
    public final boolean A0m;
    public final InterfaceC0372Av[] A0n;
    public final InterfaceC0372Av[] A0o;

    public static String A0I(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0r, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 18);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0O() {
        A0r = new byte[]{104, 97, 125, 122, 107, 124, 38, 42, 109, 101, 126, 42, 112, 93, 71, 87, 91, 90, 64, 93, 90, 65, 93, 64, 77, 20, 80, 81, 64, 81, 87, 64, 81, 80, 20, 111, 81, 76, 68, 81, 87, 64, 81, 80, 20, 11, 85, 110, 115, 117, 112, 112, 111, 114, 116, 101, 100, 32, 99, 104, 97, 110, 110, 101, 108, 32, 99, 111, 117, 110, 116, 58, 32, 29, 41, 56, 53, 51, 8, 46, 61, 63, 55, 115, 96, 114, 96, 101, 125, 98, 111, 98, 106, 103, 92, 87, 74, 66, 87, 81, 70, 87, 86, 18, 83, 71, 86, 91, 93, 18, 87, 92, 81, 93, 86, 91, 92, 85, 8, 18, 78, 121, 111, 121, 104, 104, 117, 114, 123, 60, 111, 104, 125, 112, 112, 121, 120, 60, 125, 105, 120, 117, 115, 60, 104, 110, 125, Byte.MAX_VALUE, 119};
    }

    static {
        A0O();
        A0p = false;
        A0q = false;
    }

    public YL(@Nullable C0365Ao c0365Ao, BH bh, boolean z) {
        this.A0g = c0365Ao;
        this.A0j = (BH) IJ.A01(bh);
        this.A0m = z;
        this.A0f = new ConditionVariable(true);
        this.A0h = new BE(new YK(this, null));
        this.A0i = new YI();
        this.A0k = new YS();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new YO(), this.A0i, this.A0k);
        Collections.addAll(arrayList, bh.A5Q());
        this.A0o = (InterfaceC0372Av[]) arrayList.toArray(new InterfaceC0372Av[arrayList.size()]);
        this.A0n = new InterfaceC0372Av[]{new YM()};
        this.A00 = 1.0f;
        this.A0D = 0;
        this.A0Q = C0364An.A04;
        this.A01 = 0;
        this.A0P = AH.A04;
        this.A04 = -1;
        this.A0d = new InterfaceC0372Av[0];
        this.A0e = new ByteBuffer[0];
        this.A0l = new ArrayDeque<>();
    }

    public YL(@Nullable C0365Ao c0365Ao, InterfaceC0372Av[] interfaceC0372AvArr) {
        this(c0365Ao, interfaceC0372AvArr, false);
    }

    public YL(@Nullable C0365Ao c0365Ao, InterfaceC0372Av[] interfaceC0372AvArr, boolean z) {
        this(c0365Ao, new YJ(interfaceC0372AvArr), z);
    }

    public static int A00(int i, ByteBuffer byteBuffer) {
        int iA02 = 0;
        int iA04 = 0;
        char c2 = i != 7 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (i != 8) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return BL.A00(byteBuffer);
                case 4:
                    if (i != 5) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return C0361Ak.A00();
                case 6:
                    if (i != 6) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return C0361Ak.A03(byteBuffer);
                case '\b':
                    if (i != 14) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    byteBuffer = byteBuffer;
                    iA02 = C0361Ak.A02(byteBuffer);
                    if (iA02 != -1) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    iA04 = 0;
                    c2 = 11;
                    break;
                case 11:
                    return iA04;
                case '\f':
                    byteBuffer = byteBuffer;
                    iA04 = C0361Ak.A04(byteBuffer, iA02) * 16;
                    c2 = 11;
                    break;
                case '\r':
                    throw new IllegalStateException(A0I(93, 27, 32) + i);
            }
        }
    }

    @TargetApi(21)
    public static int A01(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    @TargetApi(21)
    private int A02(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        YL yl = this;
        int iA01 = 0;
        int iWrite = 0;
        int i2 = 0;
        int iRemaining = 0;
        char c2 = yl.A0S == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    yl = yl;
                    yl.A0S = ByteBuffer.allocate(16);
                    yl.A0S.order(ByteOrder.BIG_ENDIAN);
                    yl.A0S.putInt(1431633921);
                    c2 = 3;
                    break;
                case 3:
                    yl = yl;
                    i2 = 0;
                    if (yl.A03 != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    yl = yl;
                    i2 = 0;
                    yl.A0S.putInt(4, i);
                    yl.A0S.putLong(8, 1000 * j);
                    yl.A0S.position(0);
                    yl.A03 = i;
                    c2 = 5;
                    break;
                case 5:
                    yl = yl;
                    iRemaining = yl.A0S.remaining();
                    if (iRemaining <= 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    yl = yl;
                    audioTrack = audioTrack;
                    iWrite = audioTrack.write(yl.A0S, iRemaining, 1);
                    if (iWrite >= 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    yl.A03 = i2;
                    return iWrite;
                case '\b':
                    if (iWrite >= iRemaining) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return i2;
                case '\n':
                    audioTrack = audioTrack;
                    byteBuffer = byteBuffer;
                    iA01 = A01(audioTrack, byteBuffer, i);
                    if (iA01 >= 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    yl.A03 = i2;
                    return iA01;
                case '\f':
                    yl.A03 -= iA01;
                    return iA01;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A03() {
        YL yl = this;
        long j = 0;
        char c2 = yl.A0X ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    yl = yl;
                    j = yl.A0J / yl.A0B;
                    c2 = 3;
                    break;
                case 3:
                    return j;
                case 4:
                    yl = yl;
                    j = yl.A0I;
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A04() {
        YL yl = this;
        long j = 0;
        char c2 = yl.A0X ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    yl = yl;
                    j = yl.A0L / yl.A09;
                    c2 = 3;
                    break;
                case 3:
                    return j;
                case 4:
                    yl = yl;
                    j = yl.A0K;
                    c2 = 3;
                    break;
            }
        }
    }

    private long A05(long j) {
        return A08(this.A0j.A72()) + j;
    }

    private long A06(long j) {
        YL yl = this;
        BJ bjRemove = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    yl = yl;
                    if (!yl.A0l.isEmpty()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 3:
                    yl = yl;
                    if (j < yl.A0l.getFirst().A01) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    yl = yl;
                    bjRemove = yl.A0l.remove();
                    c2 = 2;
                    break;
                case 5:
                    if (bjRemove == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    yl = yl;
                    yl.A0P = bjRemove.A02;
                    yl.A0G = bjRemove.A01;
                    yl.A0F = bjRemove.A00 - yl.A0H;
                    c2 = 7;
                    break;
                case 7:
                    yl = yl;
                    if (yl.A0P.A01 != 1.0f) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    YL yl2 = yl;
                    return (yl2.A0F + j) - yl2.A0G;
                case '\t':
                    yl = yl;
                    if (!yl.A0l.isEmpty()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    YL yl3 = yl;
                    return yl3.A0F + yl3.A0j.A6Y(j - yl3.A0G);
                case 11:
                    YL yl4 = yl;
                    return yl4.A0F + C0560Iy.A0C(j - yl4.A0G, yl4.A0P.A01);
            }
        }
    }

    private long A07(long j) {
        return (this.A0A * j) / 1000000;
    }

    private long A08(long j) {
        return (1000000 * j) / this.A0A;
    }

    private long A09(long j) {
        return (1000000 * j) / this.A06;
    }

    @TargetApi(21)
    private AudioTrack A0D() {
        AudioAttributes audioAttributesA00;
        if (this.A0b) {
            audioAttributesA00 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            audioAttributesA00 = this.A0Q.A00();
        }
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setChannelMask(this.A07).setEncoding(this.A08).setSampleRate(this.A0A).build();
        int i = this.A01;
        if (i == 0) {
            i = 0;
        }
        return new AudioTrack(audioAttributesA00, audioFormatBuild, this.A02, 1, i);
    }

    private AudioTrack A0E() throws B5 {
        AudioTrack audioTrack;
        if (C0560Iy.A01 >= 21) {
            audioTrack = A0D();
        } else {
            int iA03 = C0560Iy.A03(this.A0Q.A03);
            int i = this.A01;
            if (i == 0) {
                audioTrack = new AudioTrack(iA03, this.A0A, this.A07, this.A08, this.A02, 1);
            } else {
                audioTrack = new AudioTrack(iA03, this.A0A, this.A07, this.A08, this.A02, 1, i);
            }
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new B5(state, this.A0A, this.A07, this.A02);
    }

    private AudioTrack A0F(int i) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i);
    }

    private void A0J() {
        YL yl = this;
        InterfaceC0372Av[] interfaceC0372AvArr = null;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    yl = yl;
                    interfaceC0372AvArr = yl.A0d;
                    if (i >= interfaceC0372AvArr.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    yl = yl;
                    interfaceC0372AvArr = interfaceC0372AvArr;
                    InterfaceC0372Av interfaceC0372Av = interfaceC0372AvArr[i];
                    interfaceC0372Av.flush();
                    yl.A0e[i] = interfaceC0372Av.A6b();
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A0K() throws B5 {
        YL yl = this;
        AH ahA3Q = null;
        B6 b6 = null;
        AudioTrack audioTrack = null;
        yl.A0f.block();
        yl.A0M = yl.A0E();
        int audioSessionId = yl.A0M.getAudioSessionId();
        char c2 = A0p ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    if (C0560Iy.A01 >= 21) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    yl = yl;
                    audioTrack = yl.A0N;
                    if (audioTrack == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    audioTrack = audioTrack;
                    if (audioSessionId == audioTrack.getAudioSessionId()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    yl = yl;
                    yl.A0L();
                    c2 = 6;
                    break;
                case 6:
                    yl = yl;
                    if (yl.A0N != null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    yl = yl;
                    yl.A0N = yl.A0F(audioSessionId);
                    c2 = '\b';
                    break;
                case '\b':
                    yl = yl;
                    if (yl.A01 == audioSessionId) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    yl = yl;
                    yl.A01 = audioSessionId;
                    b6 = yl.A0R;
                    if (b6 == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    b6 = b6;
                    b6.A8z(audioSessionId);
                    c2 = 11;
                    break;
                case 11:
                    yl = yl;
                    if (!yl.A0V) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    yl = yl;
                    ahA3Q = yl.A0j.A3Q(yl.A0P);
                    c2 = '\r';
                    break;
                case '\r':
                    YL yl2 = yl;
                    yl2.A0P = ahA3Q;
                    yl2.A0N();
                    yl2.A0h.A0G(yl2.A0M, yl2.A08, yl2.A09, yl2.A02);
                    yl2.A0M();
                    return;
                case 14:
                    ahA3Q = AH.A04;
                    c2 = '\r';
                    break;
            }
        }
    }

    private void A0L() {
        if (this.A0N == null) {
            return;
        }
        AudioTrack audioTrack = this.A0N;
        this.A0N = null;
        new BG(this, audioTrack).start();
    }

    private void A0M() {
        YL yl = this;
        char c2 = !yl.A0U() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    if (C0560Iy.A01 < 21) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    yl = yl;
                    A0Q(yl.A0M, yl.A00);
                    c2 = 2;
                    break;
                case 5:
                    yl = yl;
                    A0R(yl.A0M, yl.A00);
                    c2 = 2;
                    break;
            }
        }
    }

    private void A0N() {
        InterfaceC0372Av interfaceC0372Av = null;
        ArrayList arrayList = new ArrayList();
        InterfaceC0372Av[] interfaceC0372AvArrA0V = A0V();
        int length = interfaceC0372AvArrA0V.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    interfaceC0372AvArrA0V = interfaceC0372AvArrA0V;
                    interfaceC0372Av = interfaceC0372AvArrA0V[i];
                    if (!interfaceC0372Av.A7Y()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    arrayList = arrayList;
                    interfaceC0372Av = interfaceC0372Av;
                    arrayList.add(interfaceC0372Av);
                    c2 = 5;
                    break;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    interfaceC0372Av = interfaceC0372Av;
                    interfaceC0372Av.flush();
                    c2 = 5;
                    break;
                case 7:
                    YL yl = this;
                    ArrayList arrayList2 = arrayList;
                    int size = arrayList2.size();
                    yl.A0d = (InterfaceC0372Av[]) arrayList2.toArray(new InterfaceC0372Av[size]);
                    yl.A0e = new ByteBuffer[size];
                    yl.A0J();
                    return;
            }
        }
    }

    private void A0P(long j) throws B7 {
        YL yl = this;
        ByteBuffer output = null;
        int length = yl.A0d.length;
        int i = length;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i < 0) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i <= 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    yl = yl;
                    output = yl.A0e[i - 1];
                    c2 = 5;
                    break;
                case 5:
                    if (i != length) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    yl = yl;
                    output = output;
                    yl.A0S(output, j);
                    c2 = 7;
                    break;
                case 7:
                    output = output;
                    if (!output.hasRemaining()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return;
                case '\t':
                    i--;
                    c2 = 2;
                    break;
                case '\n':
                    yl = yl;
                    output = output;
                    InterfaceC0372Av interfaceC0372Av = yl.A0d[i];
                    interfaceC0372Av.AC1(output);
                    ByteBuffer byteBufferA6b = interfaceC0372Av.A6b();
                    yl.A0e[i] = byteBufferA6b;
                    if (!byteBufferA6b.hasRemaining()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    i++;
                    c2 = 2;
                    break;
                case '\f':
                    yl = yl;
                    output = yl.A0T;
                    if (output == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case '\r':
                    output = InterfaceC0372Av.A00;
                    c2 = 5;
                    break;
                case 14:
                    return;
            }
        }
    }

    @TargetApi(21)
    public static void A0Q(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    public static void A0R(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    private void A0S(ByteBuffer byteBuffer, long j) throws B7 {
        ByteBuffer byteBuffer2 = byteBuffer;
        YL yl = this;
        int iRemaining = 0;
        boolean z = false;
        int iA01 = 0;
        int iA0B = 0;
        int i = 0;
        byte[] bArr = null;
        ByteBuffer byteBuffer3 = null;
        boolean z2 = false;
        int iRemaining2 = 0;
        int bytesWritten = !byteBuffer2.hasRemaining() ? 2 : 3;
        while (true) {
            switch (bytesWritten) {
                case 2:
                    return;
                case 3:
                    yl = yl;
                    byteBuffer3 = yl.A0U;
                    z = true;
                    i = 21;
                    if (byteBuffer3 == null) {
                        bytesWritten = 25;
                        break;
                    } else {
                        bytesWritten = 4;
                        break;
                    }
                case 4:
                    byteBuffer2 = byteBuffer2;
                    byteBuffer3 = byteBuffer3;
                    if (byteBuffer3 != byteBuffer2) {
                        bytesWritten = 24;
                        break;
                    } else {
                        bytesWritten = 5;
                        break;
                    }
                case 5:
                    z2 = true;
                    bytesWritten = 6;
                    break;
                case 6:
                    IJ.A03(z2);
                    bytesWritten = 7;
                    break;
                case 7:
                    byteBuffer2 = byteBuffer2;
                    iRemaining2 = byteBuffer2.remaining();
                    iA01 = 0;
                    int bytesWritten2 = C0560Iy.A01;
                    if (bytesWritten2 >= i) {
                        bytesWritten = 19;
                        break;
                    } else {
                        bytesWritten = 8;
                        break;
                    }
                case 8:
                    yl = yl;
                    iA0B = yl.A0h.A0B(yl.A0L);
                    if (iA0B <= 0) {
                        bytesWritten = 11;
                        break;
                    } else {
                        bytesWritten = 9;
                        break;
                    }
                case 9:
                    yl = yl;
                    int iMin = Math.min(iRemaining2, iA0B);
                    AudioTrack audioTrack = yl.A0M;
                    byte[] bArr2 = yl.A0c;
                    int bytesWritten3 = yl.A0C;
                    iA01 = audioTrack.write(bArr2, bytesWritten3, iMin);
                    if (iA01 <= 0) {
                        bytesWritten = 11;
                        break;
                    } else {
                        bytesWritten = 10;
                        break;
                    }
                case 10:
                    yl = yl;
                    byteBuffer2 = byteBuffer2;
                    yl.A0C += iA01;
                    byteBuffer2.position(byteBuffer2.position() + iA01);
                    bytesWritten = 11;
                    break;
                case 11:
                    yl = yl;
                    yl.A0E = SystemClock.elapsedRealtime();
                    if (iA01 < 0) {
                        bytesWritten = 30;
                        break;
                    } else {
                        bytesWritten = 12;
                        break;
                    }
                case 12:
                    yl = yl;
                    if (!yl.A0X) {
                        bytesWritten = 14;
                        break;
                    } else {
                        bytesWritten = 13;
                        break;
                    }
                case 13:
                    yl = yl;
                    yl.A0L += iA01;
                    bytesWritten = 14;
                    break;
                case 14:
                    if (iA01 != iRemaining2) {
                        bytesWritten = 18;
                        break;
                    } else {
                        bytesWritten = 15;
                        break;
                    }
                case 15:
                    yl = yl;
                    if (!yl.A0X) {
                        bytesWritten = 16;
                        break;
                    } else {
                        bytesWritten = 17;
                        break;
                    }
                case 16:
                    yl = yl;
                    yl.A0K += yl.A05;
                    bytesWritten = 17;
                    break;
                case 17:
                    yl = yl;
                    yl.A0U = null;
                    bytesWritten = 18;
                    break;
                case 18:
                    return;
                case 19:
                    yl = yl;
                    if (!yl.A0b) {
                        bytesWritten = 23;
                        break;
                    } else {
                        bytesWritten = 20;
                        break;
                    }
                case 20:
                    if (j == -9223372036854775807L) {
                        bytesWritten = 22;
                        break;
                    } else {
                        bytesWritten = 21;
                        break;
                    }
                case 21:
                    yl = yl;
                    byteBuffer2 = byteBuffer2;
                    IJ.A04(z);
                    iA01 = yl.A02(yl.A0M, byteBuffer2, iRemaining2, j);
                    bytesWritten = 11;
                    break;
                case 22:
                    z = false;
                    bytesWritten = 21;
                    break;
                case 23:
                    yl = yl;
                    byteBuffer2 = byteBuffer2;
                    iA01 = A01(yl.A0M, byteBuffer2, iRemaining2);
                    bytesWritten = 11;
                    break;
                case 24:
                    z2 = false;
                    bytesWritten = 6;
                    break;
                case 25:
                    yl = yl;
                    byteBuffer2 = byteBuffer2;
                    yl.A0U = byteBuffer2;
                    int bytesWritten4 = C0560Iy.A01;
                    if (bytesWritten4 >= i) {
                        bytesWritten = 7;
                        break;
                    } else {
                        bytesWritten = 26;
                        break;
                    }
                case 26:
                    yl = yl;
                    byteBuffer2 = byteBuffer2;
                    iRemaining = byteBuffer2.remaining();
                    bArr = yl.A0c;
                    if (bArr == null) {
                        bytesWritten = 28;
                        break;
                    } else {
                        bytesWritten = 27;
                        break;
                    }
                case 27:
                    bArr = bArr;
                    if (bArr.length >= iRemaining) {
                        bytesWritten = 29;
                        break;
                    } else {
                        bytesWritten = 28;
                        break;
                    }
                case 28:
                    yl = yl;
                    yl.A0c = new byte[iRemaining];
                    bytesWritten = 29;
                    break;
                case 29:
                    yl = yl;
                    byteBuffer2 = byteBuffer2;
                    int iPosition = byteBuffer2.position();
                    byteBuffer2.get(yl.A0c, 0, iRemaining);
                    byteBuffer2.position(iPosition);
                    yl.A0C = 0;
                    bytesWritten = 7;
                    break;
                case 30:
                    throw new B7(iA01);
            }
        }
    }

    private boolean A0T() throws B7 {
        YL yl = this;
        boolean z = false;
        long j = 0;
        int length = 0;
        InterfaceC0372Av interfaceC0372Av = null;
        int i = 0;
        ByteBuffer byteBuffer = null;
        InterfaceC0372Av[] interfaceC0372AvArr = null;
        boolean z2 = false;
        char c2 = yl.A04 == -1 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    yl = yl;
                    if (!yl.A0Z) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    length = 0;
                    c2 = 4;
                    break;
                case 4:
                    yl = yl;
                    yl.A04 = length;
                    z2 = true;
                    c2 = 5;
                    break;
                case 5:
                    yl = yl;
                    i = yl.A04;
                    interfaceC0372AvArr = yl.A0d;
                    j = -9223372036854775807L;
                    z = true;
                    z = true;
                    if (i >= interfaceC0372AvArr.length) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    interfaceC0372AvArr = interfaceC0372AvArr;
                    interfaceC0372Av = interfaceC0372AvArr[i];
                    if (!z2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    interfaceC0372Av = interfaceC0372Av;
                    interfaceC0372Av.AC0();
                    c2 = '\b';
                    break;
                case '\b':
                    yl = yl;
                    interfaceC0372Av = interfaceC0372Av;
                    yl.A0P(j);
                    if (!interfaceC0372Av.A7c()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\t':
                    return false;
                case '\n':
                    yl = yl;
                    z2 = true;
                    yl.A04 += z ? 1 : 0;
                    c2 = 5;
                    break;
                case 11:
                    yl = yl;
                    length = yl.A0d.length;
                    c2 = 4;
                    break;
                case '\f':
                    yl = yl;
                    byteBuffer = yl.A0U;
                    if (byteBuffer == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    yl = yl;
                    byteBuffer = byteBuffer;
                    yl.A0S(byteBuffer, j);
                    if (yl.A0U == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    return false;
                case 15:
                    yl.A04 = -1;
                    return z;
            }
        }
    }

    private boolean A0U() {
        boolean z = false;
        char c2 = this.A0M != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    private InterfaceC0372Av[] A0V() {
        YL yl = this;
        InterfaceC0372Av[] interfaceC0372AvArr = null;
        char c2 = yl.A0a ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    yl = yl;
                    interfaceC0372AvArr = yl.A0n;
                    c2 = 3;
                    break;
                case 3:
                    return interfaceC0372AvArr;
                case 4:
                    yl = yl;
                    interfaceC0372AvArr = yl.A0o;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final void A45(int i, int i2, int i3, int channelConfig, @Nullable int[] iArr, int channelCount, int sampleRate) throws IllegalStateException, B4 {
        int sampleRate2 = i2;
        int[] iArr2 = iArr;
        int i4 = i3;
        YL yl = this;
        int encoding = 0;
        int minBufferSize = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        InterfaceC0372Av interfaceC0372Av = null;
        int channelConfig2 = 0;
        InterfaceC0372Av[] interfaceC0372AvArrA0V = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int iA6c = 0;
        int length = 0;
        boolean z5 = false;
        int iA6e = 0;
        boolean zA46 = false;
        int i7 = 0;
        int i8 = 0;
        int sampleRate3 = 0;
        YL yl2 = yl;
        boolean z6 = false;
        yl2.A06 = i4;
        yl2.A0X = C0560Iy.A0f(i);
        int multipliedBufferSize = yl2.A0m ? 2 : 24;
        while (true) {
            switch (multipliedBufferSize) {
                case 2:
                    yl2 = yl2;
                    if (!yl2.A7b(1073741824)) {
                        multipliedBufferSize = 24;
                        break;
                    } else {
                        multipliedBufferSize = 3;
                        break;
                    }
                case 3:
                    if (!C0560Iy.A0e(i)) {
                        multipliedBufferSize = 24;
                        break;
                    } else {
                        multipliedBufferSize = 4;
                        break;
                    }
                case 4:
                    z3 = true;
                    multipliedBufferSize = 5;
                    break;
                case 5:
                    yl2 = yl2;
                    yl2.A0a = z3;
                    if (!yl2.A0X) {
                        multipliedBufferSize = 7;
                        break;
                    } else {
                        multipliedBufferSize = 6;
                        break;
                    }
                case 6:
                    yl2 = yl2;
                    yl2.A0B = C0560Iy.A05(i, sampleRate2);
                    multipliedBufferSize = 7;
                    break;
                case 7:
                    yl2 = yl2;
                    i8 = i;
                    if (!yl2.A0X) {
                        multipliedBufferSize = 23;
                        break;
                    } else {
                        multipliedBufferSize = 8;
                        break;
                    }
                case 8:
                    if (i == 4) {
                        multipliedBufferSize = 23;
                        break;
                    } else {
                        multipliedBufferSize = 9;
                        break;
                    }
                case 9:
                    z2 = true;
                    multipliedBufferSize = 10;
                    break;
                case 10:
                    if (!z2) {
                        multipliedBufferSize = 22;
                        break;
                    } else {
                        multipliedBufferSize = 11;
                        break;
                    }
                case 11:
                    yl2 = yl2;
                    if (!yl2.A0a) {
                        multipliedBufferSize = 12;
                        break;
                    } else {
                        multipliedBufferSize = 22;
                        break;
                    }
                case 12:
                    z5 = true;
                    multipliedBufferSize = 13;
                    break;
                case 13:
                    yl2 = yl2;
                    yl2.A0V = z5;
                    if (!z2) {
                        multipliedBufferSize = 26;
                        break;
                    } else {
                        multipliedBufferSize = 14;
                        break;
                    }
                case 14:
                    yl = yl;
                    iArr2 = iArr2;
                    yl2 = yl2;
                    z6 = false;
                    yl2.A0k.A00(channelCount, sampleRate);
                    yl2.A0i.A00(iArr2);
                    interfaceC0372AvArrA0V = yl.A0V();
                    length = interfaceC0372AvArrA0V.length;
                    channelConfig2 = i8;
                    iA6e = i4;
                    iA6c = sampleRate2;
                    z = false;
                    sampleRate3 = 0;
                    multipliedBufferSize = 15;
                    break;
                case 15:
                    if (sampleRate3 >= length) {
                        multipliedBufferSize = 27;
                        break;
                    } else {
                        multipliedBufferSize = 16;
                        break;
                    }
                case 16:
                    interfaceC0372AvArrA0V = interfaceC0372AvArrA0V;
                    interfaceC0372Av = interfaceC0372AvArrA0V[sampleRate3];
                    multipliedBufferSize = 17;
                    break;
                case 17:
                    try {
                        InterfaceC0372Av audioProcessor = interfaceC0372Av;
                        interfaceC0372Av = audioProcessor;
                        zA46 = interfaceC0372Av.A46(iA6e, iA6c, channelConfig2);
                        multipliedBufferSize = 19;
                        break;
                    } catch (C0371Au e) {
                        throw new B4(e);
                    }
                case 19:
                    interfaceC0372Av = interfaceC0372Av;
                    z |= zA46;
                    if (!interfaceC0372Av.A7Y()) {
                        multipliedBufferSize = 21;
                        break;
                    } else {
                        multipliedBufferSize = 20;
                        break;
                    }
                case 20:
                    interfaceC0372Av = interfaceC0372Av;
                    iA6c = interfaceC0372Av.A6c();
                    iA6e = interfaceC0372Av.A6e();
                    channelConfig2 = interfaceC0372Av.A6d();
                    multipliedBufferSize = 21;
                    break;
                case 21:
                    sampleRate3++;
                    multipliedBufferSize = 15;
                    break;
                case 22:
                    z5 = false;
                    multipliedBufferSize = 13;
                    break;
                case 23:
                    z2 = false;
                    multipliedBufferSize = 10;
                    break;
                case 24:
                    z3 = false;
                    multipliedBufferSize = 5;
                    break;
                case 26:
                    channelConfig2 = i8;
                    multipliedBufferSize = 28;
                    break;
                case 27:
                    z6 = z;
                    sampleRate2 = iA6c;
                    i4 = iA6e;
                    multipliedBufferSize = 28;
                    break;
                case 28:
                    switch (sampleRate2) {
                        case 1:
                            multipliedBufferSize = 30;
                            break;
                        case 2:
                            multipliedBufferSize = 31;
                            break;
                        case 3:
                            multipliedBufferSize = 32;
                            break;
                        case 4:
                            multipliedBufferSize = 33;
                            break;
                        case 5:
                            multipliedBufferSize = 34;
                            break;
                        case 6:
                            multipliedBufferSize = 35;
                            break;
                        case 7:
                            multipliedBufferSize = 36;
                            break;
                        case 8:
                            multipliedBufferSize = 37;
                            break;
                        default:
                            multipliedBufferSize = 29;
                            break;
                    }
                case 29:
                    throw new B4(A0I(46, 27, 18) + sampleRate2);
                case 30:
                    i5 = 4;
                    multipliedBufferSize = 38;
                    break;
                case 31:
                    i5 = 12;
                    multipliedBufferSize = 38;
                    break;
                case 32:
                    i5 = 28;
                    multipliedBufferSize = 38;
                    break;
                case 33:
                    i5 = 204;
                    multipliedBufferSize = 38;
                    break;
                case 34:
                    i5 = 220;
                    multipliedBufferSize = 38;
                    break;
                case 35:
                    i5 = 252;
                    multipliedBufferSize = 38;
                    break;
                case 36:
                    i5 = 1276;
                    multipliedBufferSize = 38;
                    break;
                case 37:
                    i5 = C03419q.A00;
                    multipliedBufferSize = 38;
                    break;
                case 38:
                    i6 = 5;
                    if (C0560Iy.A01 > 23) {
                        multipliedBufferSize = 44;
                        break;
                    } else {
                        multipliedBufferSize = 39;
                        break;
                    }
                case 39:
                    if (!A0I(0, 6, 28).equals(C0560Iy.A02)) {
                        multipliedBufferSize = 44;
                        break;
                    } else {
                        multipliedBufferSize = 40;
                        break;
                    }
                case 40:
                    if (!A0I(87, 6, 57).equals(C0560Iy.A04)) {
                        multipliedBufferSize = 44;
                        break;
                    } else {
                        multipliedBufferSize = 41;
                        break;
                    }
                case 41:
                    if (sampleRate2 == 3) {
                        multipliedBufferSize = 57;
                        break;
                    } else {
                        multipliedBufferSize = 42;
                        break;
                    }
                case 42:
                    if (sampleRate2 == i6) {
                        multipliedBufferSize = 57;
                        break;
                    } else {
                        multipliedBufferSize = 43;
                        break;
                    }
                case 43:
                    if (sampleRate2 == 7) {
                        multipliedBufferSize = 56;
                        break;
                    } else {
                        multipliedBufferSize = 44;
                        break;
                    }
                case 44:
                    if (C0560Iy.A01 > 25) {
                        multipliedBufferSize = 55;
                        break;
                    } else {
                        multipliedBufferSize = 45;
                        break;
                    }
                case 45:
                    if (!A0I(83, 4, 7).equals(C0560Iy.A02)) {
                        multipliedBufferSize = 55;
                        break;
                    } else {
                        multipliedBufferSize = 46;
                        break;
                    }
                case 46:
                    yl2 = yl2;
                    if (!yl2.A0X) {
                        multipliedBufferSize = 47;
                        break;
                    } else {
                        multipliedBufferSize = 55;
                        break;
                    }
                case 47:
                    z4 = true;
                    if (sampleRate2 != 1) {
                        multipliedBufferSize = 49;
                        break;
                    } else {
                        multipliedBufferSize = 48;
                        break;
                    }
                case 48:
                    i5 = 12;
                    multipliedBufferSize = 49;
                    break;
                case 49:
                    if (!z6) {
                        multipliedBufferSize = 50;
                        break;
                    } else {
                        multipliedBufferSize = 58;
                        break;
                    }
                case 50:
                    yl = yl;
                    if (!yl.A0U()) {
                        multipliedBufferSize = 58;
                        break;
                    } else {
                        multipliedBufferSize = 51;
                        break;
                    }
                case 51:
                    yl2 = yl2;
                    if (yl2.A08 != channelConfig2) {
                        multipliedBufferSize = 58;
                        break;
                    } else {
                        multipliedBufferSize = 52;
                        break;
                    }
                case 52:
                    yl2 = yl2;
                    if (yl2.A0A != i4) {
                        multipliedBufferSize = 58;
                        break;
                    } else {
                        multipliedBufferSize = 53;
                        break;
                    }
                case 53:
                    yl2 = yl2;
                    if (yl2.A07 != i5) {
                        multipliedBufferSize = 58;
                        break;
                    } else {
                        multipliedBufferSize = 54;
                        break;
                    }
                case 54:
                    return;
                case 55:
                    z4 = true;
                    multipliedBufferSize = 49;
                    break;
                case 56:
                    i5 = C03419q.A00;
                    multipliedBufferSize = 44;
                    break;
                case 57:
                    i5 = 252;
                    multipliedBufferSize = 44;
                    break;
                case 58:
                    yl = yl;
                    yl2 = yl2;
                    yl.reset();
                    yl2.A0Z = z2;
                    yl2.A0A = i4;
                    yl2.A07 = i5;
                    yl2.A08 = channelConfig2;
                    if (!yl2.A0X) {
                        multipliedBufferSize = 73;
                        break;
                    } else {
                        multipliedBufferSize = 59;
                        break;
                    }
                case 59:
                    yl2 = yl2;
                    encoding = C0560Iy.A05(yl2.A08, sampleRate2);
                    multipliedBufferSize = 60;
                    break;
                case 60:
                    yl2 = yl2;
                    yl2.A09 = encoding;
                    if (channelConfig == 0) {
                        multipliedBufferSize = 63;
                        break;
                    } else {
                        multipliedBufferSize = 61;
                        break;
                    }
                case 61:
                    yl2 = yl2;
                    yl2.A02 = channelConfig;
                    multipliedBufferSize = 62;
                    break;
                case 62:
                    return;
                case 63:
                    yl2 = yl2;
                    if (!yl2.A0X) {
                        multipliedBufferSize = 67;
                        break;
                    } else {
                        multipliedBufferSize = 64;
                        break;
                    }
                case 64:
                    yl2 = yl2;
                    minBufferSize = AudioTrack.getMinBufferSize(i4, i5, yl2.A08);
                    if (minBufferSize == -2) {
                        multipliedBufferSize = 66;
                        break;
                    } else {
                        multipliedBufferSize = 65;
                        break;
                    }
                case 65:
                    yl2 = yl2;
                    IJ.A04(z4);
                    int iA07 = (int) yl2.A07(250000L);
                    int multipliedBufferSize2 = yl2.A09;
                    int i9 = iA07 * multipliedBufferSize2;
                    long jA07 = yl2.A07(750000L);
                    int multipliedBufferSize3 = yl2.A09;
                    yl2.A02 = C0560Iy.A06(minBufferSize * 4, i9, (int) Math.max(minBufferSize, jA07 * multipliedBufferSize3));
                    multipliedBufferSize = 62;
                    break;
                case 66:
                    z4 = false;
                    multipliedBufferSize = 65;
                    break;
                case 67:
                    yl2 = yl2;
                    i7 = yl2.A08;
                    if (i7 == i6) {
                        multipliedBufferSize = 69;
                        break;
                    } else {
                        multipliedBufferSize = 68;
                        break;
                    }
                case 68:
                    if (i7 != 6) {
                        multipliedBufferSize = 70;
                        break;
                    } else {
                        multipliedBufferSize = 69;
                        break;
                    }
                case 69:
                    yl2 = yl2;
                    yl2.A02 = 20480;
                    multipliedBufferSize = 62;
                    break;
                case 70:
                    if (i7 != 7) {
                        multipliedBufferSize = 72;
                        break;
                    } else {
                        multipliedBufferSize = 71;
                        break;
                    }
                case 71:
                    yl2 = yl2;
                    yl2.A02 = 49152;
                    multipliedBufferSize = 62;
                    break;
                case 72:
                    yl2 = yl2;
                    yl2.A02 = 294912;
                    multipliedBufferSize = 62;
                    break;
                case 73:
                    encoding = -1;
                    multipliedBufferSize = 60;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final void A4l() throws IllegalStateException {
        if (this.A0b) {
            this.A0b = false;
            this.A01 = 0;
            reset();
        }
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final void A4u(int i) throws IllegalStateException {
        YL yl = this;
        boolean z = false;
        char c2 = C0560Iy.A01 >= 21 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    yl = yl;
                    IJ.A04(z);
                    if (!yl.A0b) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    yl = yl;
                    if (yl.A01 == i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    yl = yl;
                    yl.A0b = true;
                    yl.A01 = i;
                    yl.reset();
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final long A5v(boolean z) {
        YL yl = this;
        char c2 = yl.A0U() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    yl = yl;
                    if (yl.A0D != 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return Long.MIN_VALUE;
                case 4:
                    YL yl2 = yl;
                    return yl2.A0H + yl2.A05(yl2.A06(Math.min(yl2.A0h.A0C(z), yl2.A08(yl2.A04()))));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final AH A6m() {
        return this.A0P;
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final boolean A7I(ByteBuffer byteBuffer, long j) throws B5, IllegalStateException, B7 {
        ByteBuffer byteBuffer2 = this.A0T;
        IJ.A03(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!A0U()) {
            A0K();
            if (this.A0Y) {
                ABm();
            }
        }
        if (!this.A0h.A0L(A04())) {
            return false;
        }
        ByteBuffer byteBuffer3 = this.A0T;
        String strA0I = A0I(73, 10, 78);
        if (byteBuffer3 == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.A0X && this.A05 == 0) {
                this.A05 = A00(this.A08, byteBuffer);
                if (this.A05 == 0) {
                    return true;
                }
            }
            if (this.A0O != null) {
                if (!A0T()) {
                    return false;
                }
                AH ah = this.A0O;
                this.A0O = null;
                this.A0l.add(new BJ(this.A0j.A3Q(ah), Math.max(0L, j), A08(A04()), null));
                A0N();
            }
            if (this.A0D == 0) {
                this.A0H = Math.max(0L, j);
                this.A0D = 1;
            } else {
                long jA09 = this.A0H + A09(A03());
                if (this.A0D == 1 && Math.abs(jA09 - j) > 200000) {
                    Log.e(strA0I, A0I(12, 33, 38) + jA09 + A0I(6, 6, 24) + j + A0I(45, 1, 68));
                    this.A0D = 2;
                }
                if (this.A0D == 2) {
                    this.A0H += j - jA09;
                    this.A0D = 1;
                    B6 b6 = this.A0R;
                    if (b6 != null) {
                        b6.AAd();
                    }
                }
            }
            if (this.A0X) {
                this.A0J += byteBuffer.remaining();
            } else {
                this.A0I += this.A05;
            }
            this.A0T = byteBuffer;
        }
        if (!this.A0Z) {
            A0S(this.A0T, j);
        } else {
            A0P(j);
        }
        if (!this.A0T.hasRemaining()) {
            this.A0T = null;
            return true;
        }
        if (this.A0h.A0K(A04())) {
            Log.w(strA0I, A0I(k.AppCompatTheme_windowFixedWidthMajor, 29, 14));
            reset();
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final void A7J() {
        if (this.A0D == 1) {
            this.A0D = 2;
        }
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final boolean A7M() {
        YL yl = this;
        boolean z = false;
        char c2 = yl.A0U() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    yl = yl;
                    if (!yl.A0h.A0J(yl.A04())) {
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

    @Override // com.facebook.ads.redexgen.X.B8
    public final boolean A7b(int i) {
        YL yl = this;
        C0365Ao c0365Ao = null;
        boolean z = true;
        char c2 = C0560Iy.A0f(i) ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (i != 4) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (C0560Iy.A01 < 21) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
                case 6:
                    yl = yl;
                    c0365Ao = yl.A0g;
                    if (c0365Ao == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0365Ao = c0365Ao;
                    if (!c0365Ao.A04(i)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return z;
                case '\t':
                    z = false;
                    c2 = '\b';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final boolean A7c() {
        YL yl = this;
        boolean z = false;
        char c2 = yl.A0U() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    yl = yl;
                    if (!yl.A0W) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    yl = yl;
                    if (!yl.A7M()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final void ABm() throws IllegalStateException {
        this.A0Y = true;
        if (A0U()) {
            this.A0h.A0E();
            this.A0M.play();
        }
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final void ABn() throws IllegalStateException, B7 {
        YL yl = this;
        char c2 = !yl.A0W ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    yl = yl;
                    if (!yl.A0U()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    yl = yl;
                    if (!yl.A0T()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    yl = yl;
                    yl.A0h.A0F(yl.A04());
                    yl.A0M.stop();
                    yl.A03 = 0;
                    yl.A0W = true;
                    c2 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final void ACJ() throws IllegalStateException {
        YL yl = this;
        InterfaceC0372Av[] interfaceC0372AvArr = null;
        int i = 0;
        int length = 0;
        yl.reset();
        yl.A0L();
        InterfaceC0372Av[] interfaceC0372AvArr2 = yl.A0o;
        int length2 = interfaceC0372AvArr2.length;
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= length2) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    interfaceC0372AvArr2 = interfaceC0372AvArr2;
                    InterfaceC0372Av audioProcessor = interfaceC0372AvArr2[i2];
                    audioProcessor.reset();
                    i2++;
                    c2 = 2;
                    break;
                case 4:
                    yl = yl;
                    interfaceC0372AvArr = yl.A0n;
                    length = interfaceC0372AvArr.length;
                    i = 0;
                    c2 = 5;
                    break;
                case 5:
                    if (i >= length) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    interfaceC0372AvArr = interfaceC0372AvArr;
                    InterfaceC0372Av audioProcessor2 = interfaceC0372AvArr[i];
                    audioProcessor2.reset();
                    i++;
                    c2 = 5;
                    break;
                case 7:
                    YL yl2 = yl;
                    yl2.A01 = 0;
                    yl2.A0Y = false;
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final void ACy(C0364An c0364An) throws IllegalStateException {
        YL yl = this;
        char c2 = yl.A0Q.equals(c0364An) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    yl = yl;
                    c0364An = c0364An;
                    yl.A0Q = c0364An;
                    if (!yl.A0b) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    YL yl2 = yl;
                    yl2.reset();
                    yl2.A01 = 0;
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final void AD5(B6 b6) {
        this.A0R = b6;
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final AH AD9(AH ah) {
        YL yl = this;
        AH ah2 = null;
        char c2 = yl.A0U() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    yl = yl;
                    if (!yl.A0V) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    YL yl2 = yl;
                    yl2.A0P = AH.A04;
                    return yl2.A0P;
                case 4:
                    yl = yl;
                    ah2 = yl.A0O;
                    if (ah2 == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    ah = ah;
                    ah2 = ah2;
                    if (!ah.equals(ah2)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 6:
                    yl = yl;
                    if (!yl.A0U()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    yl = yl;
                    ah = ah;
                    yl.A0O = ah;
                    c2 = '\b';
                    break;
                case '\b':
                    return yl.A0P;
                case '\t':
                    yl = yl;
                    ah = ah;
                    yl.A0P = yl.A0j.A3Q(ah);
                    c2 = '\b';
                    break;
                case '\n':
                    yl = yl;
                    if (!yl.A0l.isEmpty()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case 11:
                    yl = yl;
                    ah2 = yl.A0l.getLast().A02;
                    c2 = 5;
                    break;
                case '\f':
                    yl = yl;
                    ah2 = yl.A0P;
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final void pause() throws IllegalStateException {
        YL yl = this;
        yl.A0Y = false;
        char c2 = yl.A0U() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    yl = yl;
                    if (!yl.A0h.A0I()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    yl = yl;
                    yl.A0M.pause();
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.media.AudioTrack, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // com.facebook.ads.redexgen.X.B8
    public final void reset() throws IllegalStateException {
        YL yl = this;
        boolean z = false;
        long j = 0;
        ?? r4 = 0;
        AH ah = null;
        char c2 = yl.A0U() ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    yl = yl;
                    j = 0;
                    yl.A0J = 0L;
                    yl.A0I = 0L;
                    yl.A0L = 0L;
                    yl.A0K = 0L;
                    z = false;
                    z = false;
                    yl.A05 = 0;
                    ah = yl.A0O;
                    r4 = 0;
                    r4 = 0;
                    if (ah == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    yl = yl;
                    ah = ah;
                    r4 = 0;
                    yl.A0P = ah;
                    yl.A0O = null;
                    c2 = 4;
                    break;
                case 4:
                    yl = yl;
                    yl.A0l.clear();
                    yl.A0F = j;
                    yl.A0G = j;
                    yl.A0T = r4;
                    yl.A0U = r4;
                    yl.A0J();
                    yl.A0W = z;
                    yl.A04 = -1;
                    yl.A0S = r4;
                    yl.A03 = z ? 1 : 0;
                    yl.A0D = z ? 1 : 0;
                    if (!yl.A0h.A0H()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    yl = yl;
                    yl.A0M.pause();
                    c2 = 6;
                    break;
                case 6:
                    yl = yl;
                    AudioTrack audioTrack = yl.A0M;
                    yl.A0M = r4;
                    yl.A0h.A0D();
                    yl.A0f.close();
                    new BF(yl, audioTrack).start();
                    c2 = 7;
                    break;
                case 7:
                    return;
                case '\b':
                    yl = yl;
                    if (!yl.A0l.isEmpty()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case '\t':
                    yl = yl;
                    yl.A0P = yl.A0l.getLast().A02;
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final void setVolume(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            A0M();
        }
    }
}

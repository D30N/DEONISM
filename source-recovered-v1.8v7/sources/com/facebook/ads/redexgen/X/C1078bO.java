package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1078bO implements InterfaceC0516He {
    public static byte[] A07;
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public FileInputStream A03;
    public boolean A04;
    public final ContentResolver A05;
    public final InterfaceC0535Hz<? super C1078bO> A06;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 108);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A07 = new byte[]{62, 18, 8, 17, 25, 93, 19, 18, 9, 93, 18, 13, 24, 19, 93, 27, 20, 17, 24, 93, 25, 24, 14, 30, 15, 20, 13, 9, 18, 15, 93, 27, 18, 15, 71, 93, 46};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hz != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.ContentDataSource> */
    public C1078bO(Context context, InterfaceC0535Hz<? super C1078bO> interfaceC0535Hz) {
        this.A05 = context.getContentResolver();
        this.A06 = interfaceC0535Hz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final Uri A7F() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final long ABU(C0520Hi c0520Hi) throws IOException {
        try {
            this.A02 = c0520Hi.A04;
            this.A01 = this.A05.openAssetFileDescriptor(this.A02, A00(36, 1, 48));
            if (this.A01 != null) {
                this.A03 = new FileInputStream(this.A01.getFileDescriptor());
                long startOffset = this.A01.getStartOffset();
                long jSkip = this.A03.skip(c0520Hi.A03 + startOffset) - startOffset;
                if (jSkip == c0520Hi.A03) {
                    long assetFileDescriptorLength = -1;
                    if (c0520Hi.A02 != -1) {
                        long skipped = c0520Hi.A02;
                        this.A00 = skipped;
                    } else {
                        long length = this.A01.getLength();
                        if (length == -1) {
                            FileChannel channel = this.A03.getChannel();
                            long size = channel.size();
                            if (size != 0) {
                                long channelSize = channel.position();
                                assetFileDescriptorLength = size - channelSize;
                            }
                            this.A00 = assetFileDescriptorLength;
                        } else {
                            this.A00 = length - jSkip;
                        }
                    }
                    this.A04 = true;
                    InterfaceC0535Hz<? super C1078bO> interfaceC0535Hz = this.A06;
                    if (interfaceC0535Hz != null) {
                        interfaceC0535Hz.ABF(this, c0520Hi);
                    }
                    return this.A00;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException(A00(0, 36, 17) + this.A02);
        } catch (IOException e) {
            throw new C0512Ha(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final void close() throws C0512Ha {
        this.A02 = null;
        try {
            try {
                if (this.A03 != null) {
                    this.A03.close();
                }
                this.A03 = null;
            } catch (Throwable th) {
                this.A03 = null;
                try {
                    try {
                        if (this.A01 != null) {
                            this.A01.close();
                        }
                        this.A01 = null;
                        if (this.A04) {
                            this.A04 = false;
                            InterfaceC0535Hz<? super C1078bO> interfaceC0535Hz = this.A06;
                            if (interfaceC0535Hz != null) {
                                interfaceC0535Hz.ABE(this);
                            }
                        }
                        throw th;
                    } catch (IOException e) {
                        throw new C0512Ha(e);
                    }
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        InterfaceC0535Hz<? super C1078bO> interfaceC0535Hz2 = this.A06;
                        if (interfaceC0535Hz2 != null) {
                            interfaceC0535Hz2.ABE(this);
                        }
                    }
                }
            }
            try {
                try {
                    if (this.A01 != null) {
                        this.A01.close();
                    }
                } catch (IOException e2) {
                    throw new C0512Ha(e2);
                }
            } finally {
                this.A01 = null;
                if (this.A04) {
                    this.A04 = false;
                    InterfaceC0535Hz<? super C1078bO> interfaceC0535Hz3 = this.A06;
                    if (interfaceC0535Hz3 != null) {
                        interfaceC0535Hz3.ABE(this);
                    }
                }
            }
        } catch (IOException e3) {
            throw new C0512Ha(e3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C1078bO c1078bO = this;
        long j = 0;
        long j2 = 0;
        InterfaceC0535Hz<? super C1078bO> interfaceC0535Hz = null;
        int i3 = 0;
        int iMin = 0;
        int i4 = 0;
        long j3 = 0;
        long j4 = 0;
        char c2 = i2 == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 0;
                case 3:
                    c1078bO = c1078bO;
                    j3 = c1078bO.A00;
                    i3 = -1;
                    if (j3 != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return i3;
                case 5:
                    j2 = -1;
                    if (j3 != -1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    iMin = i2;
                    c2 = '\n';
                    break;
                case 7:
                    j4 = i2;
                    c2 = '\b';
                    break;
                case '\b':
                    try {
                        iMin = (int) Math.min(j3, j4);
                        c2 = '\n';
                        break;
                    } catch (IOException e) {
                        throw new C0512Ha(e);
                    }
                case '\n':
                    c1078bO = c1078bO;
                    i4 = c1078bO.A03.read(bArr, i, iMin);
                    if (i4 != i3) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c1078bO = c1078bO;
                    if (c1078bO.A00 != j2) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    return i3;
                case 15:
                    throw new C0512Ha(new EOFException());
                case 16:
                    c1078bO = c1078bO;
                    j = c1078bO.A00;
                    if (j == j2) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c1078bO = c1078bO;
                    c1078bO.A00 = j - i4;
                    c2 = 18;
                    break;
                case 18:
                    c1078bO = c1078bO;
                    interfaceC0535Hz = c1078bO.A06;
                    if (interfaceC0535Hz == null) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    c1078bO = c1078bO;
                    interfaceC0535Hz = interfaceC0535Hz;
                    interfaceC0535Hz.A96(c1078bO, i4);
                    c2 = 20;
                    break;
                case 20:
                    return i4;
            }
        }
    }
}

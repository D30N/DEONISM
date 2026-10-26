package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.PrivateCommand;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.SpliceCommand;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.Zz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0992Zz implements InterfaceC0429Dq {
    public C0556Iu A00;
    public final C0544Ii A02 = new C0544Ii();
    public final C0543Ih A01 = new C0543Ih();

    @Override // com.facebook.ads.redexgen.X.InterfaceC0429Dq
    public final Metadata A4e(C0420Dd c0420Dd) throws C0430Dr {
        C0992Zz c0992Zz = this;
        int size = 0;
        int i = 0;
        Metadata metadata = null;
        int iA04 = 0;
        SpliceCommand command = null;
        long jA04 = 0;
        char c2 = c0992Zz.A00 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0992Zz = c0992Zz;
                    c0420Dd = c0420Dd;
                    if (c0420Dd.A00 == c0992Zz.A00.A05()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0992Zz = c0992Zz;
                    c0420Dd = c0420Dd;
                    c0992Zz.A00 = new C0556Iu(((YT) c0420Dd).A00);
                    c0992Zz.A00.A06(((YT) c0420Dd).A00 - c0420Dd.A00);
                    c2 = 4;
                    break;
                case 4:
                    c0992Zz = c0992Zz;
                    c0420Dd = c0420Dd;
                    ByteBuffer byteBuffer = c0420Dd.A01;
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    c0992Zz.A02.A0b(bArrArray, iLimit);
                    c0992Zz.A01.A0C(bArrArray, iLimit);
                    c0992Zz.A01.A08(39);
                    i = 1;
                    jA04 = (c0992Zz.A01.A04(1) << 32) | c0992Zz.A01.A04(32);
                    c0992Zz.A01.A08(20);
                    size = c0992Zz.A01.A04(12);
                    iA04 = c0992Zz.A01.A04(8);
                    command = null;
                    c0992Zz.A02.A0Z(14);
                    if (iA04 == 0) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (iA04 == 255) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (iA04 == 4) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (iA04 == 5) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (iA04 == 6) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (command != null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    metadata = new Metadata(new Metadata.Entry[0]);
                    c2 = 11;
                    break;
                case 11:
                    return metadata;
                case '\f':
                    Metadata.Entry[] entryArr = new Metadata.Entry[i];
                    entryArr[0] = command;
                    metadata = new Metadata(entryArr);
                    c2 = 11;
                    break;
                case '\r':
                    c0992Zz = c0992Zz;
                    command = TimeSignalCommand.A01(c0992Zz.A02, jA04, c0992Zz.A00);
                    c2 = '\t';
                    break;
                case 14:
                    c0992Zz = c0992Zz;
                    command = SpliceInsertCommand.A00(c0992Zz.A02, jA04, c0992Zz.A00);
                    c2 = '\t';
                    break;
                case 15:
                    c0992Zz = c0992Zz;
                    command = SpliceScheduleCommand.A00(c0992Zz.A02);
                    c2 = '\t';
                    break;
                case 16:
                    c0992Zz = c0992Zz;
                    command = PrivateCommand.A00(c0992Zz.A02, size, jA04);
                    c2 = '\t';
                    break;
                case 17:
                    command = new SpliceNullCommand();
                    c2 = '\t';
                    break;
            }
        }
    }
}

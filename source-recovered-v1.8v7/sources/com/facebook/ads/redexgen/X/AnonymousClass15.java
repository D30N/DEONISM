package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.15, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass15 extends BroadcastReceiver {
    public static byte[] A03;
    public Context A00;
    public C03409p A01;
    public boolean A02 = false;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 55);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A03 = new byte[]{108, 96, 98, 33, 105, 110, 108, 106, 109, 96, 96, 100, 33, 110, 107, 124, 33, 102, 97, 123, 106, 125, 124, 123, 102, 123, 102, 110, 99, 33, 107, 102, 124, Byte.MAX_VALUE, 99, 110, 118, 106, 107, 109, 114, Byte.MAX_VALUE, 126, 116, 82, 117, 111, 126, 105, 104, 111, 114, 111, 122, 119, 94, 109, 126, 117, 111, 103, 120, 117, 116, 126, 88, Byte.MAX_VALUE, 101, 116, 99, 98, 101, 120, 101, 112, 125, 84, 103, 116, Byte.MAX_VALUE, 101, 43, 39, 50, 37, 49, 56, 37, 58, 20, 35, 54, 20, 59, 62, 52, 60, 109, Byte.MAX_VALUE, 115, 113, 50, 122, 125, Byte.MAX_VALUE, 121, 126, 115, 115, 119, 50, 125, 120, 111, 50, 117, 114, 104, 121, 110, 111, 104, 117, 104, 117, 125, 112, 50, 120, 117, 111, 108, 112, 125, 101, 121, 120, 38, 39, 64, 85, 66, 86, 95, 66, 93, 115, 68, 81, 115, 92, 89, 83, 91, 27, 8, 27, 16, 10};
    }

    public AnonymousClass15(C03409p c03409p, Context context) {
        this.A01 = c03409p;
        this.A00 = context;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(98, 40, 43) + this.A01.getUniqueId());
        intentFilter.addAction(A00(60, 22, 38) + this.A01.getUniqueId());
        intentFilter.addAction(A00(82, 16, 96) + this.A01.getUniqueId());
        C2G.A00(this.A00).A06(this, intentFilter);
    }

    public final void A03() {
        try {
            C2G.A00(this.A00).A05(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AnonymousClass15 anonymousClass15 = this;
        Serializable serializableExtra = null;
        boolean z = false;
        boolean z2 = false;
        String[] strArrSplit = intent.getAction().split(A00(138, 1, 42));
        char c2 = strArrSplit.length != 2 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    anonymousClass15 = anonymousClass15;
                    strArrSplit = strArrSplit;
                    z = true;
                    z = true;
                    if (!strArrSplit[1].equals(anonymousClass15.A01.getUniqueId())) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    strArrSplit = strArrSplit;
                    z2 = false;
                    z2 = false;
                    if (!strArrSplit[0].equals(A00(0, 39, 56))) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    anonymousClass15 = anonymousClass15;
                    if (anonymousClass15.A01.getListener() == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    anonymousClass15 = anonymousClass15;
                    anonymousClass15.A01.getListener().A9V();
                    anonymousClass15.A01.getListener().ABT();
                    c2 = '\b';
                    break;
                case '\b':
                    return;
                case '\t':
                    strArrSplit = strArrSplit;
                    if (!strArrSplit[z2 ? 1 : 0].equals(A00(39, 21, 44))) {
                        c2 = '\"';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    intent = intent;
                    serializableExtra = intent.getSerializableExtra(A00(154, 5, 73));
                    if (!(serializableExtra instanceof C0595Ki)) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    anonymousClass15 = anonymousClass15;
                    if (anonymousClass15.A01.getListener() == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    anonymousClass15 = anonymousClass15;
                    anonymousClass15.A01.getListener().A9b();
                    anonymousClass15.A01.getListener().ABT();
                    c2 = '\r';
                    break;
                case '\r':
                    anonymousClass15 = anonymousClass15;
                    if (!anonymousClass15.A02) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    anonymousClass15 = anonymousClass15;
                    anonymousClass15.A01.A0U(z ? 1 : 0);
                    c2 = 15;
                    break;
                case 15:
                    anonymousClass15 = anonymousClass15;
                    anonymousClass15.A01.setVisibility(z2 ? 1 : 0);
                    anonymousClass15.A01.A0Y(PC.A05, z ? 1 : 0);
                    c2 = '\b';
                    break;
                case 16:
                    anonymousClass15 = anonymousClass15;
                    serializableExtra = serializableExtra;
                    anonymousClass15.A01.A0U(((C0595Ki) serializableExtra).A01());
                    c2 = 15;
                    break;
                case 17:
                    serializableExtra = serializableExtra;
                    if (!(serializableExtra instanceof C0632Lv)) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    anonymousClass15 = anonymousClass15;
                    if (anonymousClass15.A01.getListener() == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    anonymousClass15 = anonymousClass15;
                    anonymousClass15.A01.getListener().A9e();
                    c2 = '\b';
                    break;
                case 20:
                    serializableExtra = serializableExtra;
                    if (!(serializableExtra instanceof C0629Ls)) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    anonymousClass15 = anonymousClass15;
                    if (anonymousClass15.A01.getListener() == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    anonymousClass15 = anonymousClass15;
                    anonymousClass15.A01.getListener().A9f();
                    c2 = '\b';
                    break;
                case 23:
                    serializableExtra = serializableExtra;
                    if (!(serializableExtra instanceof C02987x)) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    anonymousClass15 = anonymousClass15;
                    if (anonymousClass15.A01.getListener() == null) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    anonymousClass15 = anonymousClass15;
                    anonymousClass15.A01.getListener().A9C();
                    c2 = 26;
                    break;
                case 26:
                    anonymousClass15 = anonymousClass15;
                    anonymousClass15.A02 = z;
                    c2 = '\b';
                    break;
                case 27:
                    serializableExtra = serializableExtra;
                    if (!(serializableExtra instanceof L4)) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    anonymousClass15 = anonymousClass15;
                    if (anonymousClass15.A01.getListener() == null) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 29;
                        break;
                    }
                case 29:
                    anonymousClass15 = anonymousClass15;
                    anonymousClass15.A01.getListener().AAV();
                    c2 = 30;
                    break;
                case 30:
                    anonymousClass15 = anonymousClass15;
                    anonymousClass15.A02 = z2;
                    c2 = '\b';
                    break;
                case 31:
                    serializableExtra = serializableExtra;
                    if (!(serializableExtra instanceof C02977v)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = ' ';
                        break;
                    }
                case ' ':
                    anonymousClass15 = anonymousClass15;
                    if (anonymousClass15.A01.getListener() == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '!';
                        break;
                    }
                case '!':
                    anonymousClass15 = anonymousClass15;
                    anonymousClass15.A01.getListener().onPause();
                    c2 = '\b';
                    break;
                case '\"':
                    strArrSplit = strArrSplit;
                    if (!strArrSplit[z2 ? 1 : 0].equals(A00(139, 15, 7))) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '#';
                        break;
                    }
                case '#':
                    anonymousClass15 = anonymousClass15;
                    anonymousClass15.A01.A0j();
                    c2 = '\b';
                    break;
            }
        }
    }
}

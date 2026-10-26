package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Up, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0855Up extends C6U {
    public static byte[] A01;
    public final AudioManager A00;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 23);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A01 = new byte[]{34, 54, 39, 42, 44};
    }

    public C0855Up(Context context, C02525u c02525u) {
        super(context, c02525u);
        this.A00 = (AudioManager) context.getSystemService(A04(0, 5, 84));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public AbstractC02766s A03(HashMap<Integer, C0854Uo> map) {
        return new X9(SystemClock.elapsedRealtime(), A02(), map, EnumC02756r.A06);
    }

    public final InterfaceC02616d A0G() {
        return new C0852Um(this);
    }

    public final InterfaceC02616d A0H() {
        return new C0849Uj(this);
    }

    public final InterfaceC02616d A0I() {
        return new C0850Uk(this);
    }

    public final InterfaceC02616d A0J() {
        return new C0851Ul(this);
    }

    public final InterfaceC02616d A0K(List<C02606c> list) {
        return new C0853Un(this, list);
    }
}

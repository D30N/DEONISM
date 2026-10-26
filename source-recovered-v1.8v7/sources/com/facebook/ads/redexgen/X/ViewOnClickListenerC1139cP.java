package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.cP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1139cP implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, C8A {
    public static byte[] A02;
    public final XI A00;
    public final /* synthetic */ C1141cR A01;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 62);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A02 = new byte[]{81, 112, 63, 107, 112, 106, 124, 119, 63, 123, 126, 107, 126, 63, 109, 122, 124, 112, 109, 123, 122, 123, 51, 63, 111, 115, 122, 126, 108, 122, 63, 122, 113, 108, 106, 109, 122, 63, 107, 112, 106, 124, 119, 63, 122, 105, 122, 113, 107, 108, 63, 109, 122, 126, 124, 119, 63, 107, 119, 122, 63, 126, 123, 63, 73, 118, 122, 104, 63, 125, 102, 63, 109, 122, 107, 106, 109, 113, 118, 113, 120, 63, 121, 126, 115, 108, 122, 63, 118, 121, 63, 102, 112, 106, 63, 118, 113, 107, 122, 109, 124, 122, 111, 107, 63, 107, 119, 122, 63, 122, 105, 122, 113, 107, 49, 74, 111, 43, 104, 106, 101, 101, 100, Byte.MAX_VALUE, 43, 105, 110, 43, 104, 103, 98, 104, 96, 110, 111, 43, 105, 110, 109, 100, 121, 110, 43, 98, Byte.MAX_VALUE, 43, 98, 120, 43, 125, 98, 110, 124, 110, 111, 37, 58, 32, 61, 91, 116, 113, 123, 115, 107, 56, 112, 121, 104, 104, 125, 118, 125, 124, 56, 108, 119, 119, 56, 126, 121, 107, 108, 54, 13, 9, 10, 62, 47, 34, 46, 37, 40, 46, 5, 46, 63, 60, 36, 57, 32, 7, 36, 44, 119, 113, 106};
    }

    public ViewOnClickListenerC1139cP(C1141cR c1141cR, XI xi) {
        this.A01 = c1141cR;
        this.A00 = xi;
    }

    public /* synthetic */ ViewOnClickListenerC1139cP(C1141cR c1141cR, XI xi, C1132cI c1132cI) {
        this(c1141cR, xi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01() {
        ViewOnClickListenerC1139cP viewOnClickListenerC1139cP = this;
        Map<String, String> mapA05 = new C0676No().A03(viewOnClickListenerC1139cP.A01.A0N).A02(viewOnClickListenerC1139cP.A01.A0b).A05();
        char c2 = viewOnClickListenerC1139cP.A01.A0H != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    viewOnClickListenerC1139cP = viewOnClickListenerC1139cP;
                    mapA05 = mapA05;
                    mapA05.put(A00(156, 3, 106), String.valueOf(viewOnClickListenerC1139cP.A01.A0H.A04()));
                    c2 = 3;
                    break;
                case 3:
                    viewOnClickListenerC1139cP = viewOnClickListenerC1139cP;
                    if (!viewOnClickListenerC1139cP.A01.A0S) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    viewOnClickListenerC1139cP = viewOnClickListenerC1139cP;
                    mapA05 = mapA05;
                    mapA05.put(A00(204, 3, 39), String.valueOf(viewOnClickListenerC1139cP.A01.A0S));
                    c2 = 5;
                    break;
                case 5:
                    return mapA05;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(Map<String, String> map) {
        if (this.A01.A0W != null) {
            this.A01.A0W.A0Y(map);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C8A
    public final XI A5G() {
        return this.A00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0601Ko.A02(this)) {
            return;
        }
        try {
            boolean zA08 = this.A01.A0b.A08();
            String strA00 = A00(184, 20, k.AppCompatTheme_windowActionModeOverlay);
            if (!zA08) {
                Log.e(strA00, A00(0, k.AppCompatTheme_windowActionBar, 33));
            }
            int iA0D = JQ.A0D(this.A01.A0Y);
            if (iA0D < 0 || this.A01.A0b.A03() >= iA0D) {
                if (this.A01.A0b.A09(this.A01.A0Y)) {
                    if (this.A01.A0W != null) {
                        this.A01.A0W.A0Z(A01());
                        return;
                    }
                    return;
                } else {
                    if (JQ.A0v(this.A01.A0Y)) {
                        if (this.A01.A0W != null) {
                            this.A01.A0W.A0c(A01());
                        }
                        LT.A00(new DialogInterfaceOnClickListenerC0577Jp(this), new DialogInterfaceOnClickListenerC0578Jq(this), LC.A00());
                        return;
                    }
                    A05(A01());
                    return;
                }
            }
            if (!this.A01.A0b.A07()) {
                Log.e(strA00, A00(k.AppCompatTheme_windowActionBar, 41, 53));
            } else {
                Log.e(strA00, A00(159, 25, 38));
            }
        } catch (Throwable th) {
            C0601Ko.A00(th, this);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ViewOnClickListenerC1139cP viewOnClickListenerC1139cP = this;
        char c2 = viewOnClickListenerC1139cP.A01.A03 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    viewOnClickListenerC1139cP = viewOnClickListenerC1139cP;
                    if (viewOnClickListenerC1139cP.A01.A0K != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    ViewOnClickListenerC1139cP viewOnClickListenerC1139cP2 = viewOnClickListenerC1139cP;
                    viewOnClickListenerC1139cP2.A01.A0K.setBounds(0, 0, viewOnClickListenerC1139cP2.A01.A03.getWidth(), viewOnClickListenerC1139cP2.A01.A03.getHeight());
                    viewOnClickListenerC1139cP2.A01.A0K.A0D(!viewOnClickListenerC1139cP2.A01.A0K.A0E());
                    return true;
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewOnClickListenerC1139cP viewOnClickListenerC1139cP = this;
        boolean z = false;
        viewOnClickListenerC1139cP.A01.A0b.A06(motionEvent, viewOnClickListenerC1139cP.A01.A03, view);
        char c2 = viewOnClickListenerC1139cP.A01.A02 != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    viewOnClickListenerC1139cP = viewOnClickListenerC1139cP;
                    view = view;
                    motionEvent = motionEvent;
                    if (!viewOnClickListenerC1139cP.A01.A02.onTouch(view, motionEvent)) {
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
}

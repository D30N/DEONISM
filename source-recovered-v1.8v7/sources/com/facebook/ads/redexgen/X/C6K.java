package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;

/* renamed from: com.facebook.ads.redexgen.X.6K, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6K {
    public final Context A00;
    public final C6E A01;
    public final EnumC02656h A02;

    public C6K(Context context, C6E c6e, EnumC02656h enumC02656h) {
        this.A01 = c6e;
        this.A00 = context;
        this.A02 = enumC02656h;
    }

    public final void A00(MotionEvent motionEvent) {
        int toolType;
        int toolType2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Context context = this.A00;
        C02746q c02746q = this.A02 == EnumC02656h.A0F ? null : new C02746q(context == null ? "" : context.getPackageName());
        float f = 1.0f;
        char c2 = 1;
        switch (motionEvent.getActionMasked()) {
            case 0:
            case 1:
            case 3:
            case 5:
            case 6:
                int actionIndex = motionEvent.getActionIndex();
                int pointerId = motionEvent.getPointerId(actionIndex);
                int pointerId2 = Build.VERSION.SDK_INT;
                if (pointerId2 >= 14) {
                    toolType = motionEvent.getToolType(actionIndex);
                } else {
                    toolType = -1;
                }
                this.A01.A02(new XC(jElapsedRealtime, c02746q, new C6O(motionEvent.getActionMasked(), pointerId, toolType, new float[]{motionEvent.getRawX(), motionEvent.getRawY()}, motionEvent.getSize(actionIndex), Math.min(motionEvent.getPressure(actionIndex), 1.0f), motionEvent.getOrientation(actionIndex))), C6D.A0D);
                break;
            case 2:
            case 4:
                int toolTypeMove = 0;
                while (toolTypeMove < motionEvent.getPointerCount()) {
                    int pointerId3 = motionEvent.getPointerId(toolTypeMove);
                    if (Build.VERSION.SDK_INT >= 14) {
                        toolType2 = motionEvent.getToolType(toolTypeMove);
                    } else {
                        toolType2 = -1;
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    float[] fArr = new float[2];
                    fArr[0] = motionEvent.getRawX();
                    fArr[c2] = motionEvent.getRawY();
                    this.A01.A02(new XC(jElapsedRealtime, c02746q, new C6O(actionMasked, pointerId3, toolType2, fArr, motionEvent.getSize(toolTypeMove), Math.min(motionEvent.getPressure(toolTypeMove), f), motionEvent.getOrientation(toolTypeMove))), C6D.A0D);
                    toolTypeMove++;
                    f = 1.0f;
                    c2 = 1;
                }
                break;
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.widget.Toast;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: assets/audience_network.dex */
public final class ME implements SensorEventListener {
    public static byte[] A0A;
    public long A04;
    public long A05;
    public long A06;

    @Nullable
    public SensorManager A07;
    public final XI A08;
    public int A03 = 0;
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = -1.0f;
    public final Set<MD> A09 = new CopyOnWriteArraySet();

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 73);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A0A = new byte[]{58, 44, 53, 58, 54, 57, -53, -32, -39, -29, -31, -26, -33, -104, -26, -25, -20, -104, -21, -19, -24, -24, -25, -22, -20, -35, -36, -99, -81, -72, -67, -71, -68, -67, 106, -72, -71, -66, 106, -67, -65, -70, -70, -71, -68, -66, -81, -82};
    }

    public ME(XI xi) {
        this.A08 = xi;
    }

    private void A01() {
        ME me = this;
        SensorManager sensorManager = null;
        boolean zRegisterListener = false;
        me.A07 = (SensorManager) me.A08.getSystemService(A00(0, 6, 126));
        char c2 = me.A07 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    me = me;
                    Toast.makeText(me.A08, A00(27, 21, 1), 1).show();
                    c2 = 3;
                    break;
                case 3:
                    zRegisterListener = false;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        me = me;
                        zRegisterListener = me.A07.registerListener(me, me.A07.getDefaultSensor(1), 3);
                        c2 = '\n';
                        break;
                    } catch (Exception unused) {
                        Toast.makeText(me.A08, A00(6, 21, 47), 1).show();
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (!zRegisterListener) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case 11:
                    me = me;
                    sensorManager = me.A07;
                    if (sensorManager == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    me = me;
                    sensorManager = sensorManager;
                    sensorManager.unregisterListener(me);
                    c2 = '\r';
                    break;
                case '\r':
                    return;
            }
        }
    }

    public final void A03(MD md) {
        ME me = this;
        char c2 = me.A09.isEmpty() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    me = me;
                    me.A01();
                    c2 = 3;
                    break;
                case 3:
                    me.A09.add(md);
                    return;
                case 4:
                    me = me;
                    md = md;
                    if (!me.A09.contains(md)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return;
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        SensorEvent sensorEvent2 = sensorEvent;
        ME me = this;
        Iterator<MD> it = null;
        char c2 = 0;
        int i = 0;
        long jElapsedRealtime = 0;
        long j = 0;
        char c3 = sensorEvent2.sensor.getType() != 1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c3) {
                case 2:
                    return;
                case 3:
                    me = me;
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    i = 0;
                    if (jElapsedRealtime - me.A04 <= 500) {
                        c3 = 5;
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    me = me;
                    i = 0;
                    me.A03 = 0;
                    c3 = 5;
                    break;
                case 5:
                    me = me;
                    j = me.A06;
                    if (jElapsedRealtime - j <= 100) {
                        c3 = 14;
                        break;
                    } else {
                        c3 = 6;
                        break;
                    }
                case 6:
                    me = me;
                    sensorEvent2 = sensorEvent2;
                    c2 = 2;
                    if ((Math.abs(((((sensorEvent2.values[i] + sensorEvent2.values[1]) + sensorEvent2.values[2]) - me.A00) - me.A01) - me.A02) / (jElapsedRealtime - j)) * 10000.0f <= 800.0f) {
                        c3 = '\r';
                        break;
                    } else {
                        c3 = 7;
                        break;
                    }
                case 7:
                    me = me;
                    int i2 = me.A03 + 1;
                    me.A03 = i2;
                    if (i2 < 3) {
                        c3 = '\f';
                        break;
                    } else {
                        c3 = '\b';
                        break;
                    }
                case '\b':
                    me = me;
                    if (jElapsedRealtime - me.A05 <= 1000) {
                        c3 = '\f';
                        break;
                    } else {
                        c3 = '\t';
                        break;
                    }
                case '\t':
                    me = me;
                    me.A05 = jElapsedRealtime;
                    me.A03 = i;
                    it = me.A09.iterator();
                    c3 = '\n';
                    break;
                case '\n':
                    it = it;
                    if (!it.hasNext()) {
                        c3 = '\f';
                        break;
                    } else {
                        c3 = 11;
                        break;
                    }
                case 11:
                    it = it;
                    it.next().AB0();
                    c3 = '\n';
                    break;
                case '\f':
                    me = me;
                    me.A04 = jElapsedRealtime;
                    c3 = '\r';
                    break;
                case '\r':
                    me = me;
                    sensorEvent2 = sensorEvent2;
                    me.A06 = jElapsedRealtime;
                    me.A00 = sensorEvent2.values[i];
                    me.A01 = sensorEvent2.values[1];
                    me.A02 = sensorEvent2.values[c2];
                    c3 = 14;
                    break;
                case 14:
                    return;
            }
        }
    }
}

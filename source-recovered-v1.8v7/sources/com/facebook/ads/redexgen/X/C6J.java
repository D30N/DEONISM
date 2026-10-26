package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6J, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6J implements SensorEventListener {
    public static byte[] A09;
    public static final String A0A;
    public C6H A00;
    public final Context A01;
    public final SensorManager A02;
    public final C6E A04;
    public final C6G A05;
    public final EnumC02656h A06;
    public final List<Sensor> A07;
    public final Map<Integer, C6N> A08 = new HashMap();
    public final Handler A03 = new Handler(C02826y.A00().A03().getLooper());

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 84);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A09 = new byte[]{104, 126, 117, 104, 116, 105};
    }

    static {
        A01();
        A0A = C6J.class.getSimpleName();
    }

    public C6J(Context context, C6E c6e, EnumC02656h enumC02656h) {
        this.A01 = context;
        this.A02 = (SensorManager) context.getSystemService(A00(0, 6, 79));
        this.A07 = this.A02.getSensorList(-1);
        this.A04 = c6e;
        this.A05 = new C6G(this.A04, enumC02656h);
        this.A06 = enumC02656h;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.ads.redexgen.X.6H] */
    @SuppressLint({"CatchGeneralException"})
    public final synchronized void A02(List<C6N> list) {
        int iA02;
        try {
            for (C6N c6n : list) {
                if (c6n != null && (iA02 = c6n.A02()) != -1 && this.A08.get(Integer.valueOf(c6n.ordinal())) == null) {
                    if (iA02 == 0) {
                        if (C6I.A00[c6n.ordinal()] == 1) {
                            this.A05.A02(this.A01);
                        }
                    } else {
                        for (Sensor sensor : this.A07) {
                            if (iA02 == sensor.getType()) {
                                this.A00 = new SensorEventListener(this) { // from class: com.facebook.ads.redexgen.X.6H
                                    public final SensorEventListener A00;

                                    {
                                        this.A00 = this;
                                    }

                                    @Override // android.hardware.SensorEventListener
                                    @SuppressLint({"CatchGeneralException"})
                                    public final void onAccuracyChanged(Sensor sensor2, int i) {
                                        try {
                                            this.A00.onAccuracyChanged(sensor2, i);
                                        } catch (Throwable th) {
                                            AnonymousClass66.A03(th);
                                        }
                                    }

                                    @Override // android.hardware.SensorEventListener
                                    @SuppressLint({"CatchGeneralException"})
                                    public final void onSensorChanged(SensorEvent sensorEvent) {
                                        try {
                                            this.A00.onSensorChanged(sensorEvent);
                                        } catch (Throwable th) {
                                            AnonymousClass66.A03(th);
                                        }
                                    }
                                };
                                this.A02.registerListener(this.A00, sensor, 3, this.A03);
                                this.A08.put(Integer.valueOf(c6n.ordinal()), c6n);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            AnonymousClass66.A03(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        r6.A02.unregisterListener(r6.A00, r2);
        r6.A08.remove(java.lang.Integer.valueOf(r4.ordinal()));
     */
    @android.annotation.SuppressLint({"CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A03(java.util.List<com.facebook.ads.redexgen.X.C6N> r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Map<java.lang.Integer, com.facebook.ads.redexgen.X.6N> r0 = r6.A08     // Catch: java.lang.Throwable -> L8e
            if (r0 != 0) goto L7
            monitor-exit(r6)
            return
        L7:
            if (r7 != 0) goto L1c
            android.hardware.SensorManager r1 = r6.A02     // Catch: java.lang.Throwable -> L8e
            com.facebook.ads.redexgen.X.6H r0 = r6.A00     // Catch: java.lang.Throwable -> L8e
            r1.unregisterListener(r0)     // Catch: java.lang.Throwable -> L8e
            com.facebook.ads.redexgen.X.6G r0 = r6.A05     // Catch: java.lang.Throwable -> L8e
            r0.A01()     // Catch: java.lang.Throwable -> L8e
            java.util.Map<java.lang.Integer, com.facebook.ads.redexgen.X.6N> r0 = r6.A08     // Catch: java.lang.Throwable -> L8e
            r0.clear()     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r6)
            return
        L1c:
            java.util.Iterator r5 = r7.iterator()     // Catch: java.lang.Throwable -> L8e
        L20:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L92
            java.lang.Object r4 = r5.next()     // Catch: java.lang.Throwable -> L8e
            com.facebook.ads.redexgen.X.6N r4 = (com.facebook.ads.redexgen.X.C6N) r4     // Catch: java.lang.Throwable -> L8e
            int r1 = r4.A02()     // Catch: java.lang.Throwable -> L8e
            r0 = -1
            if (r1 != r0) goto L34
            goto L20
        L34:
            int r0 = r4.A02()     // Catch: java.lang.Throwable -> L8e
            if (r0 != 0) goto L52
            java.util.Map<java.lang.Integer, com.facebook.ads.redexgen.X.6N> r1 = r6.A08     // Catch: java.lang.Throwable -> L8e
            int r0 = r4.ordinal()     // Catch: java.lang.Throwable -> L8e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L8e
            r1.remove(r0)     // Catch: java.lang.Throwable -> L8e
            int[] r1 = com.facebook.ads.redexgen.X.C6I.A00     // Catch: java.lang.Throwable -> L8e
            int r0 = r4.ordinal()     // Catch: java.lang.Throwable -> L8e
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L8e
            r0 = 1
            if (r1 == r0) goto L88
        L52:
            java.util.List<android.hardware.Sensor> r0 = r6.A07     // Catch: java.lang.Throwable -> L8e
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L8e
        L58:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L20
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L8e
            android.hardware.Sensor r2 = (android.hardware.Sensor) r2     // Catch: java.lang.Throwable -> L8e
            int r1 = r4.A02()     // Catch: java.lang.Throwable -> L8e
            int r0 = r2.getType()     // Catch: java.lang.Throwable -> L8e
            if (r1 != r0) goto L58
            android.hardware.SensorManager r1 = r6.A02     // Catch: java.lang.Throwable -> L83
            com.facebook.ads.redexgen.X.6H r0 = r6.A00     // Catch: java.lang.Throwable -> L83
            r1.unregisterListener(r0, r2)     // Catch: java.lang.Throwable -> L83
            java.util.Map<java.lang.Integer, com.facebook.ads.redexgen.X.6N> r1 = r6.A08     // Catch: java.lang.Throwable -> L83
            int r0 = r4.ordinal()     // Catch: java.lang.Throwable -> L83
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L83
            r1.remove(r0)     // Catch: java.lang.Throwable -> L83
            goto L20
        L83:
            r0 = move-exception
            com.facebook.ads.redexgen.X.AnonymousClass66.A03(r0)     // Catch: java.lang.Throwable -> L8e
            goto L20
        L88:
            com.facebook.ads.redexgen.X.6G r0 = r6.A05     // Catch: java.lang.Throwable -> L8e
            r0.A01()     // Catch: java.lang.Throwable -> L8e
            goto L20
        L8e:
            r0 = move-exception
            com.facebook.ads.redexgen.X.AnonymousClass66.A03(r0)     // Catch: java.lang.Throwable -> L94
        L92:
            monitor-exit(r6)
            return
        L94:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C6J.A03(java.util.List):void");
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    @SuppressLint({"CatchGeneralException"})
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C02746q c02746q = this.A06 == EnumC02656h.A0F ? null : new C02746q(this.A01 == null ? A00(6, 0, 48) : this.A01.getPackageName());
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                this.A04.A02(new XA(jElapsedRealtime, c02746q, new C6M(new float[]{sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]})), C6D.A02);
                return;
            }
            if (type == 2) {
                this.A04.A02(new XA(jElapsedRealtime, c02746q, new C6M(new float[]{sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]})), C6D.A08);
                return;
            }
            if (type == 4) {
                this.A04.A02(new XA(jElapsedRealtime, c02746q, new C6M(new float[]{sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]})), C6D.A06);
                return;
            }
            if (type == 5) {
                this.A04.A02(new X4(jElapsedRealtime, c02746q, sensorEvent.values[0]), C6D.A07);
                return;
            }
            if (type == 6) {
                this.A04.A02(new X4(jElapsedRealtime, c02746q, sensorEvent.values[0]), C6D.A04);
                return;
            }
            if (type == 8) {
                this.A04.A02(new X4(jElapsedRealtime, c02746q, sensorEvent.values[0]), C6D.A0A);
                return;
            }
            if (type == 18) {
                this.A04.A02(new X4(jElapsedRealtime, c02746q, sensorEvent.values[0]), C6D.A0C);
                return;
            }
            if (type == 20) {
                this.A04.A02(new XA(jElapsedRealtime, c02746q, new C6M(new float[]{sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2], sensorEvent.values[3]})), C6D.A05);
            } else if (type == 12) {
                this.A04.A02(new X4(jElapsedRealtime, c02746q, sensorEvent.values[0]), C6D.A0B);
            } else if (type == 13) {
                this.A04.A02(new X4(jElapsedRealtime, c02746q, sensorEvent.values[0]), C6D.A03);
            }
        } catch (Throwable th) {
            AnonymousClass66.A03(th);
        }
    }
}

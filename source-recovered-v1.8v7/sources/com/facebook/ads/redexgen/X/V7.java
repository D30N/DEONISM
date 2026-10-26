package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.os.Build;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class V7 implements InterfaceC02676j {
    public static byte[] A06;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
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

    public static void A02() {
        A06 = new byte[]{104, 126, 57, 9, 14, 49, 54, 111, 51, 58, 61};
    }

    @SuppressLint({"MissingPermission"})
    public V7(BluetoothDevice bluetoothDevice) {
        this.A05 = bluetoothDevice.getName();
        this.A03 = bluetoothDevice.getBondState();
        if (Build.VERSION.SDK_INT >= 18) {
            this.A04 = bluetoothDevice.getType();
        } else {
            this.A04 = -1;
        }
        this.A00 = bluetoothDevice.getBluetoothClass().getDeviceClass();
        this.A01 = bluetoothDevice.getBluetoothClass().getMajorDeviceClass();
        this.A02 = A00(bluetoothDevice.getBluetoothClass());
    }

    public static int A00(BluetoothClass bluetoothClass) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 >= 31) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bluetoothClass = bluetoothClass;
                    i = 1;
                    if (!bluetoothClass.hasService(1 << i3)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i2 |= i << i3;
                    c2 = 5;
                    break;
                case 5:
                    i3++;
                    c2 = 2;
                    break;
                case 6:
                    return i2;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02676j
    public final boolean A7d(Object obj) {
        V7 customObjectSignalValueDef = this;
        boolean z = false;
        V7 v7 = (V7) obj;
        char c2 = customObjectSignalValueDef.A05 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    v7 = v7;
                    if (v7.A05 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    customObjectSignalValueDef = customObjectSignalValueDef;
                    v7 = v7;
                    if (!customObjectSignalValueDef.A05.equals(v7.A05)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    customObjectSignalValueDef = customObjectSignalValueDef;
                    v7 = v7;
                    if (customObjectSignalValueDef.A03 != v7.A03) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    customObjectSignalValueDef = customObjectSignalValueDef;
                    v7 = v7;
                    if (customObjectSignalValueDef.A04 != v7.A04) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    customObjectSignalValueDef = customObjectSignalValueDef;
                    v7 = v7;
                    if (customObjectSignalValueDef.A00 != v7.A00) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    customObjectSignalValueDef = customObjectSignalValueDef;
                    v7 = v7;
                    if (customObjectSignalValueDef.A01 != v7.A01) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    customObjectSignalValueDef = customObjectSignalValueDef;
                    v7 = v7;
                    if (customObjectSignalValueDef.A02 != v7.A02) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    z = true;
                    c2 = '\n';
                    break;
                case '\n':
                    return z;
                case 11:
                    z = false;
                    c2 = '\n';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02676j
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public final int ADH() {
        V7 v7 = this;
        int length = 0;
        char c2 = v7.A05 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    v7 = v7;
                    length = A01(2, 1, 3).length() + v7.A05.length();
                    c2 = 3;
                    break;
                case 3:
                    return length + A01(3, 2, 46).length() + 4 + A01(7, 1, 79).length() + 4 + A01(5, 2, 1).length() + 4 + A01(8, 3, 10).length() + 4 + A01(0, 2, 79).length() + 4;
                case 4:
                    length = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02676j
    public final JSONObject ADa() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(A01(2, 1, 3), this.A05);
        jSONObject.put(A01(3, 2, 46), this.A03);
        jSONObject.put(A01(7, 1, 79), this.A04);
        jSONObject.put(A01(5, 2, 1), this.A00);
        jSONObject.put(A01(8, 3, 10), this.A01);
        jSONObject.put(A01(0, 2, 79), this.A02);
        return jSONObject;
    }
}

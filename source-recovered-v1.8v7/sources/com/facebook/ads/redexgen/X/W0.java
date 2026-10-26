package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import d.b.a.b.k;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class W0 implements InterfaceC02686k<String> {
    public static byte[] A01;
    public final Map<String, String> A00;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 112);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A01 = new byte[]{63, Byte.MAX_VALUE, 44, 64, 2};
    }

    public W0(Enumeration<InetAddress> enumeration) {
        this.A00 = A01(enumeration);
    }

    public /* synthetic */ W0(Enumeration enumeration, C0891Vz c0891Vz) {
        this(enumeration);
    }

    public static Map<String, String> A01(Enumeration<InetAddress> enumeration) {
        String strA00 = null;
        String strSubstring = null;
        String hostAddress = null;
        InetAddress inetAddressNextElement = null;
        HashMap map = new HashMap();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    enumeration = enumeration;
                    if (!enumeration.hasMoreElements()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    enumeration = enumeration;
                    inetAddressNextElement = enumeration.nextElement();
                    if (!(inetAddressNextElement instanceof Inet4Address)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    inetAddressNextElement = inetAddressNextElement;
                    if (!(inetAddressNextElement instanceof Inet6Address)) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    inetAddressNextElement = inetAddressNextElement;
                    hostAddress = inetAddressNextElement.getHostAddress();
                    if (!(inetAddressNextElement instanceof Inet4Address)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    strA00 = A00(3, 2, 70);
                    c2 = 7;
                    break;
                case 7:
                    hostAddress = hostAddress;
                    if (!hostAddress.contains(A00(2, 1, k.AppCompatTheme_windowFixedWidthMinor))) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    hostAddress = hostAddress;
                    strSubstring = hostAddress.substring(0, hostAddress.indexOf(37));
                    c2 = '\t';
                    break;
                case '\t':
                    map = map;
                    strA00 = strA00;
                    strSubstring = strSubstring;
                    map.put(strA00, strSubstring);
                    c2 = 2;
                    break;
                case '\n':
                    hostAddress = hostAddress;
                    strSubstring = hostAddress;
                    c2 = '\t';
                    break;
                case 11:
                    strA00 = A00(0, 2, 57);
                    c2 = 7;
                    break;
                case '\f':
                    return map;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final JSONObject ADb(String str, JSONObject jSONObject) throws JSONException {
        Map.Entry<String, String> next = null;
        JSONObject jSONObject2 = new JSONObject();
        Iterator<Map.Entry<String, String>> it = this.A00.entrySet().iterator();
        boolean z = false;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    it = it;
                    next = it.next();
                    if (next.getKey() == null) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    next = next;
                    if (!next.getKey().isEmpty()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 2;
                        break;
                    }
                case 5:
                    next = next;
                    if (next.getValue() == null) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    next = next;
                    if (!next.getValue().isEmpty()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 2;
                        break;
                    }
                case 7:
                    jSONObject2 = jSONObject2;
                    next = next;
                    z = true;
                    jSONObject2.put(next.getKey(), next.getValue());
                    c2 = 2;
                    break;
                case '\b':
                    if (!z) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return jSONObject.put(str, jSONObject2);
                case '\n':
                    return jSONObject;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    public final boolean A7d(Object obj) {
        W0 newIpAddressValueObject = this;
        Iterator<Map.Entry<String, String>> it = null;
        Map.Entry<String, String> next = null;
        Map.Entry<String, String> next2 = null;
        Iterator<Map.Entry<String, String>> it2 = null;
        W0 w0 = (W0) obj;
        Map<String, String> map = newIpAddressValueObject.A00;
        boolean z = true;
        char c2 = map != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    w0 = w0;
                    if (w0.A00 != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    newIpAddressValueObject = newIpAddressValueObject;
                    if (newIpAddressValueObject.A00 != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    w0 = w0;
                    if (w0.A00 != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
                case 7:
                    w0 = w0;
                    map = map;
                    if (map.size() == w0.A00.size()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return false;
                case '\t':
                    newIpAddressValueObject = newIpAddressValueObject;
                    w0 = w0;
                    it2 = newIpAddressValueObject.A00.entrySet().iterator();
                    it = w0.A00.entrySet().iterator();
                    c2 = '\n';
                    break;
                case '\n':
                    it2 = it2;
                    if (!it2.hasNext()) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    it2 = it2;
                    it = it;
                    next = it2.next();
                    next2 = it.next();
                    if (next == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    next2 = next2;
                    if (next2 != null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    next = next;
                    if (next != null) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    next2 = next2;
                    if (next2 != null) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    return z;
                case 16:
                    z = false;
                    c2 = 15;
                    break;
                case 17:
                    next = next;
                    if (next.getKey() == null) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    next = next;
                    next2 = next2;
                    if (!next.getKey().equals(next2.getKey())) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 19:
                    return false;
                case 20:
                    next = next;
                    if (next.getValue() == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    next = next;
                    next2 = next2;
                    if (!next.getValue().equals(next2.getValue())) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case 22:
                    return false;
                case 23:
                    return z;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public final int ADH() {
        Iterator<Map.Entry<String, String>> it = this.A00.entrySet().iterator();
        int length = 0;
        int size = 2;
        while (true) {
            switch (size) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        size = 4;
                        break;
                    } else {
                        size = 3;
                        break;
                    }
                case 3:
                    it = it;
                    Map.Entry<String, String> next = it.next();
                    length += next.getKey().length() + next.getValue().length();
                    size = 2;
                    break;
                case 4:
                    return length;
            }
        }
    }
}

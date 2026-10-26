package com.facebook.ads.redexgen.X;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: assets/audience_network.dex */
public final class QK implements Map<String, String> {
    public static byte[] A01;
    public Map<String, String> A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 63);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A01 = new byte[]{-125, -85, -27, -28, -42, -67, -56};
    }

    public QK() {
        this.A00 = new HashMap();
    }

    public QK(Map<String, String> map) {
        this.A00 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Map
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final String get(Object obj) {
        return this.A00.get(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Map
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final String remove(Object obj) {
        return this.A00.remove(obj);
    }

    public final QK A04(String str, String str2) {
        this.A00.put(str, str2);
        return this;
    }

    public final QK A05(Map<? extends String, ? extends String> arg) {
        putAll(arg);
        return this;
    }

    public final String A06() {
        QK qk = this;
        String key = null;
        String value = null;
        StringBuilder sb = null;
        Iterator<String> it = null;
        char c2 = qk.A00 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return A00(1, 0, 104);
                case 3:
                    qk = qk;
                    sb = new StringBuilder();
                    it = qk.A00.keySet().iterator();
                    break;
                case 5:
                    sb = sb;
                    it = it;
                    key = it.next();
                    c2 = sb.length() > 0 ? (char) 6 : (char) 7;
                case 6:
                    sb = sb;
                    sb.append(A00(1, 1, 70));
                    c2 = 7;
                case 7:
                    qk = qk;
                    sb = sb;
                    key = key;
                    sb.append(key);
                    value = qk.A00.get(key);
                    if (value == null) {
                        break;
                    } else {
                        sb.append(A00(0, 1, 7));
                        c2 = '\t';
                    }
                case '\t':
                    try {
                        sb.append(URLEncoder.encode(value, A00(2, 5, 81)));
                        break;
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                        break;
                    }
                case '\r':
                    return sb.toString();
            }
            c2 = it.hasNext() ? (char) 5 : '\r';
        }
    }

    @Override // java.util.Map
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final String put(String str, String str2) {
        return this.A00.put(str, str2);
    }

    public final byte[] A08() throws UnsupportedEncodingException {
        byte[] bytes = null;
        try {
            bytes = A06().getBytes(A00(2, 5, 81));
            return bytes;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return bytes;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, String>> entrySet() {
        return this.A00.entrySet();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.A00.keySet();
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends String> map) {
        Map<? extends String, ? extends String> arg = this.A00;
        arg.putAll(map);
    }

    @Override // java.util.Map
    public final int size() {
        return this.A00.size();
    }

    @Override // java.util.Map
    public final Collection<String> values() {
        return this.A00.values();
    }
}

package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.Gv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0507Gv {
    public static byte[] A0B;
    public List<C0507Gv> A00;
    public final long A01;
    public final long A02;
    public final H1 A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final HashMap<String, Integer> A08;
    public final HashMap<String, Integer> A09;
    public final String[] A0A;

    static {
        A07();
    }

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 59);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A0B = new byte[]{96, 104, 121, 108, 105, 108, 121, 108, 32, 90, 74};
    }

    public C0507Gv(String str, String str2, long j, long j2, H1 h1, String[] strArr, String str3) {
        this.A05 = str;
        this.A06 = str2;
        this.A03 = h1;
        this.A0A = strArr;
        this.A07 = str2 != null;
        this.A02 = j;
        this.A01 = j2;
        this.A04 = (String) IJ.A01(str3);
        this.A09 = new HashMap<>();
        this.A08 = new HashMap<>();
    }

    private final int A00() {
        int size = 0;
        List<C0507Gv> list = this.A00;
        char c2 = list == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    size = 0;
                    c2 = 3;
                    break;
                case 3:
                    return size;
                case 4:
                    list = list;
                    size = list.size();
                    c2 = 3;
                    break;
            }
        }
    }

    private SpannableStringBuilder A01(SpannableStringBuilder spannableStringBuilder) {
        int spacesToDelete = 0;
        int j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        char c2 = 0;
        int i4 = 0;
        int length = spannableStringBuilder.length();
        int i5 = 0;
        char c3 = 2;
        while (true) {
            switch (c3) {
                case 2:
                    c2 = ' ';
                    if (i5 >= length) {
                        c3 = 11;
                        break;
                    } else {
                        c3 = 3;
                        break;
                    }
                case 3:
                    spannableStringBuilder = spannableStringBuilder;
                    if (spannableStringBuilder.charAt(i5) != c2) {
                        c3 = '\n';
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    i4 = i5 + 1;
                    c3 = 5;
                    break;
                case 5:
                    spannableStringBuilder = spannableStringBuilder;
                    if (i4 >= spannableStringBuilder.length()) {
                        c3 = '\b';
                        break;
                    } else {
                        c3 = 6;
                        break;
                    }
                case 6:
                    spannableStringBuilder = spannableStringBuilder;
                    if (spannableStringBuilder.charAt(i4) != c2) {
                        c3 = '\b';
                        break;
                    } else {
                        c3 = 7;
                        break;
                    }
                case 7:
                    i4++;
                    c3 = 5;
                    break;
                case '\b':
                    i3 = i4 - (i5 + 1);
                    if (i3 <= 0) {
                        c3 = '\n';
                        break;
                    } else {
                        c3 = '\t';
                        break;
                    }
                case '\t':
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.delete(i5, i5 + i3);
                    length -= i3;
                    c3 = '\n';
                    break;
                case '\n':
                    i5++;
                    c3 = 2;
                    break;
                case 11:
                    if (length <= 0) {
                        c3 = 14;
                        break;
                    } else {
                        c3 = '\f';
                        break;
                    }
                case '\f':
                    spannableStringBuilder = spannableStringBuilder;
                    i2 = 0;
                    if (spannableStringBuilder.charAt(0) != c2) {
                        c3 = 14;
                        break;
                    } else {
                        c3 = '\r';
                        break;
                    }
                case '\r':
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.delete(i2, 1);
                    length--;
                    c3 = 14;
                    break;
                case 14:
                    i = 0;
                    c3 = 15;
                    break;
                case 15:
                    j = 10;
                    if (i >= length - 1) {
                        c3 = 20;
                        break;
                    } else {
                        c3 = 16;
                        break;
                    }
                case 16:
                    spannableStringBuilder = spannableStringBuilder;
                    if (spannableStringBuilder.charAt(i) != j) {
                        c3 = 19;
                        break;
                    } else {
                        c3 = 17;
                        break;
                    }
                case 17:
                    spannableStringBuilder = spannableStringBuilder;
                    if (spannableStringBuilder.charAt(i + 1) != c2) {
                        c3 = 19;
                        break;
                    } else {
                        c3 = 18;
                        break;
                    }
                case 18:
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.delete(i + 1, i + 2);
                    length--;
                    c3 = 19;
                    break;
                case 19:
                    i++;
                    c3 = 15;
                    break;
                case 20:
                    if (length <= 0) {
                        c3 = 23;
                        break;
                    } else {
                        c3 = 21;
                        break;
                    }
                case 21:
                    spannableStringBuilder = spannableStringBuilder;
                    if (spannableStringBuilder.charAt(length - 1) != c2) {
                        c3 = 23;
                        break;
                    } else {
                        c3 = 22;
                        break;
                    }
                case 22:
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.delete(length - 1, length);
                    length--;
                    c3 = 23;
                    break;
                case 23:
                    spacesToDelete = 0;
                    c3 = 24;
                    break;
                case 24:
                    if (spacesToDelete >= length - 1) {
                        c3 = 29;
                        break;
                    } else {
                        c3 = 25;
                        break;
                    }
                case 25:
                    spannableStringBuilder = spannableStringBuilder;
                    if (spannableStringBuilder.charAt(spacesToDelete) != c2) {
                        c3 = 28;
                        break;
                    } else {
                        c3 = 26;
                        break;
                    }
                case 26:
                    spannableStringBuilder = spannableStringBuilder;
                    if (spannableStringBuilder.charAt(spacesToDelete + 1) != j) {
                        c3 = 28;
                        break;
                    } else {
                        c3 = 27;
                        break;
                    }
                case 27:
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.delete(spacesToDelete, spacesToDelete + 1);
                    length--;
                    c3 = 28;
                    break;
                case 28:
                    spacesToDelete++;
                    c3 = 24;
                    break;
                case 29:
                    if (length <= 0) {
                        c3 = ' ';
                        break;
                    } else {
                        c3 = 30;
                        break;
                    }
                case 30:
                    spannableStringBuilder = spannableStringBuilder;
                    if (spannableStringBuilder.charAt(length - 1) != j) {
                        c3 = ' ';
                        break;
                    } else {
                        c3 = 31;
                        break;
                    }
                case 31:
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.delete(length - 1, length);
                    c3 = ' ';
                    break;
                case ' ':
                    return spannableStringBuilder;
            }
        }
    }

    public static SpannableStringBuilder A02(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return map.get(str);
    }

    private final C0507Gv A03(int i) {
        List<C0507Gv> list = this.A00;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public static C0507Gv A04(String str) {
        return new C0507Gv(null, C0509Gx.A02(str), -9223372036854775807L, -9223372036854775807L, null, null, A06(9, 0, 73));
    }

    public static C0507Gv A05(String str, long j, long j2, H1 h1, String[] strArr, String str2) {
        return new C0507Gv(str, null, j, j2, h1, strArr, str2);
    }

    private void A08(long j, Map<String, H1> map, Map<String, SpannableStringBuilder> map2) {
        C0507Gv c0507Gv = this;
        int iIntValue = 0;
        int i = 0;
        Iterator<Map.Entry<String, Integer>> it = null;
        String key = null;
        Map.Entry<String, Integer> next = null;
        int iIntValue2 = 0;
        char c2 = !c0507Gv.A0C(j) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0507Gv = c0507Gv;
                    it = c0507Gv.A08.entrySet().iterator();
                    c2 = 4;
                    break;
                case 4:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0507Gv = c0507Gv;
                    it = it;
                    next = it.next();
                    key = next.getKey();
                    if (!c0507Gv.A09.containsKey(key)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0507Gv = c0507Gv;
                    key = key;
                    iIntValue2 = c0507Gv.A09.get(key).intValue();
                    c2 = 7;
                    break;
                case 7:
                    next = next;
                    iIntValue = next.getValue().intValue();
                    if (iIntValue2 == iIntValue) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0507Gv = c0507Gv;
                    map = map;
                    map2 = map2;
                    key = key;
                    c0507Gv.A0A(map, map2.get(key), iIntValue2, iIntValue);
                    c2 = 4;
                    break;
                case '\t':
                    iIntValue2 = 0;
                    c2 = 7;
                    break;
                case '\n':
                    i = 0;
                    c2 = 11;
                    break;
                case 11:
                    c0507Gv = c0507Gv;
                    if (i >= c0507Gv.A00()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c0507Gv = c0507Gv;
                    map = map;
                    map2 = map2;
                    c0507Gv.A03(i).A08(j, map, map2);
                    i++;
                    c2 = 11;
                    break;
                case '\r':
                    return;
            }
        }
    }

    private void A09(long j, boolean z, String str, Map<String, SpannableStringBuilder> map) {
        Map<String, SpannableStringBuilder> map2 = map;
        String str2 = str;
        C0507Gv c0507Gv = this;
        Iterator<Map.Entry<String, SpannableStringBuilder>> it = null;
        C0507Gv c0507GvA03 = null;
        boolean zEquals = false;
        int i = 0;
        Iterator<Map.Entry<String, SpannableStringBuilder>> it2 = null;
        boolean z2 = false;
        String str3 = null;
        c0507Gv.A09.clear();
        c0507Gv.A08.clear();
        char c2 = A06(0, 8, 54).equals(c0507Gv.A05) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0507Gv = c0507Gv;
                    if (!A06(9, 0, 73).equals(c0507Gv.A04)) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    str2 = str2;
                    str3 = str2;
                    c2 = 5;
                    break;
                case 5:
                    c0507Gv = c0507Gv;
                    if (!c0507Gv.A07) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (!z) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0507Gv = c0507Gv;
                    map2 = map2;
                    str3 = str3;
                    A02(str3, map2).append((CharSequence) c0507Gv.A06);
                    c2 = '\b';
                    break;
                case '\b':
                    return;
                case '\t':
                    c0507Gv = c0507Gv;
                    if (!A06(9, 2, 3).equals(c0507Gv.A05)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (!z) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    map2 = map2;
                    str3 = str3;
                    A02(str3, map2).append('\n');
                    c2 = '\b';
                    break;
                case '\f':
                    c0507Gv = c0507Gv;
                    if (!c0507Gv.A0C(j)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    map2 = map2;
                    it2 = map2.entrySet().iterator();
                    c2 = 14;
                    break;
                case 14:
                    it2 = it2;
                    if (!it2.hasNext()) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c0507Gv = c0507Gv;
                    it2 = it2;
                    Map.Entry<String, SpannableStringBuilder> next = it2.next();
                    c0507Gv.A09.put(next.getKey(), Integer.valueOf(next.getValue().length()));
                    c2 = 14;
                    break;
                case 16:
                    c0507Gv = c0507Gv;
                    zEquals = A06(8, 1, 107).equals(c0507Gv.A05);
                    i = 0;
                    c2 = 17;
                    break;
                case 17:
                    c0507Gv = c0507Gv;
                    if (i >= c0507Gv.A00()) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c0507Gv = c0507Gv;
                    c0507GvA03 = c0507Gv.A03(i);
                    if (!z) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 19:
                    if (!zEquals) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    z2 = true;
                    c2 = 21;
                    break;
                case 21:
                    map2 = map2;
                    str3 = str3;
                    c0507GvA03 = c0507GvA03;
                    c0507GvA03.A09(j, z2, str3, map2);
                    i++;
                    c2 = 17;
                    break;
                case 22:
                    z2 = false;
                    c2 = 21;
                    break;
                case 23:
                    if (!zEquals) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    map2 = map2;
                    str3 = str3;
                    C0509Gx.A04(A02(str3, map2));
                    c2 = 25;
                    break;
                case 25:
                    map2 = map2;
                    it = map2.entrySet().iterator();
                    c2 = 26;
                    break;
                case 26:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    c0507Gv = c0507Gv;
                    it = it;
                    Map.Entry<String, SpannableStringBuilder> next2 = it.next();
                    c0507Gv.A08.put(next2.getKey(), Integer.valueOf(next2.getValue().length()));
                    c2 = 26;
                    break;
                case 28:
                    c0507Gv = c0507Gv;
                    str3 = c0507Gv.A04;
                    c2 = 5;
                    break;
            }
        }
    }

    private void A0A(Map<String, H1> map, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        H1 h1A00 = C0509Gx.A00(this.A03, this.A0A, map);
        if (h1A00 != null) {
            C0509Gx.A05(spannableStringBuilder, i, i2, h1A00);
        }
    }

    private void A0B(TreeSet<Long> treeSet, boolean z) {
        C0507Gv c0507Gv = this;
        int i = 0;
        C0507Gv c0507Gv2 = null;
        long j = 0;
        boolean z2 = false;
        long j2 = 0;
        long j3 = 0;
        boolean zEquals = A06(8, 1, 107).equals(c0507Gv.A05);
        char c2 = !z ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (!zEquals) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0507Gv = c0507Gv;
                    j2 = c0507Gv.A02;
                    j3 = -9223372036854775807L;
                    if (j2 == -9223372036854775807L) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    treeSet = treeSet;
                    treeSet.add(Long.valueOf(j2));
                    c2 = 5;
                    break;
                case 5:
                    c0507Gv = c0507Gv;
                    j = c0507Gv.A01;
                    if (j == j3) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    treeSet = treeSet;
                    treeSet.add(Long.valueOf(j));
                    c2 = 7;
                    break;
                case 7:
                    c0507Gv = c0507Gv;
                    if (c0507Gv.A00 != null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return;
                case '\t':
                    i = 0;
                    c2 = '\n';
                    break;
                case '\n':
                    c0507Gv = c0507Gv;
                    if (i >= c0507Gv.A00.size()) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0507Gv = c0507Gv;
                    c0507Gv2 = c0507Gv.A00.get(i);
                    if (!z) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\f':
                    if (!zEquals) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    z2 = true;
                    c2 = 14;
                    break;
                case 14:
                    treeSet = treeSet;
                    c0507Gv2 = c0507Gv2;
                    c0507Gv2.A0B(treeSet, z2);
                    i++;
                    c2 = '\n';
                    break;
                case 15:
                    z2 = false;
                    c2 = 14;
                    break;
                case 16:
                    return;
            }
        }
    }

    private final boolean A0C(long j) {
        C0507Gv c0507Gv = this;
        boolean z = false;
        char c2 = c0507Gv.A02 == -9223372036854775807L ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0507Gv = c0507Gv;
                    if (c0507Gv.A01 == -9223372036854775807L) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0507Gv = c0507Gv;
                    if (c0507Gv.A02 > j) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0507Gv = c0507Gv;
                    if (c0507Gv.A01 == -9223372036854775807L) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0507Gv = c0507Gv;
                    if (c0507Gv.A02 != -9223372036854775807L) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0507Gv = c0507Gv;
                    if (j < c0507Gv.A01) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0507Gv = c0507Gv;
                    if (c0507Gv.A02 > j) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0507Gv = c0507Gv;
                    if (j >= c0507Gv.A01) {
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

    public final List<GX> A0D(long j, Map<String, H1> map, Map<String, C0508Gw> map2) {
        TreeMap<String, SpannableStringBuilder> regionOutputs = new TreeMap<>();
        A09(j, false, this.A04, regionOutputs);
        A08(j, map, regionOutputs);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, SpannableStringBuilder> entry : regionOutputs.entrySet()) {
            C0508Gw c0508Gw = map2.get(entry.getKey());
            arrayList.add(new GX(A01(entry.getValue()), (Layout.Alignment) null, c0508Gw.A00, c0508Gw.A05, c0508Gw.A04, c0508Gw.A01, RecyclerView.UNDEFINED_DURATION, c0508Gw.A03, c0508Gw.A06, c0508Gw.A02));
        }
        return arrayList;
    }

    public final void A0E(C0507Gv c0507Gv) {
        if (this.A00 == null) {
            this.A00 = new ArrayList();
        }
        this.A00.add(c0507Gv);
    }

    public final long[] A0F() {
        TreeSet<Long> treeSet = new TreeSet<>();
        A0B(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        int i = 0;
        Iterator<Long> it = treeSet.iterator();
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        i2 = 4;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    jArr = jArr;
                    it = it;
                    int i3 = i + 1;
                    jArr[i] = it.next().longValue();
                    i = i3;
                    i2 = 2;
                    break;
                case 4:
                    return jArr;
            }
        }
    }
}

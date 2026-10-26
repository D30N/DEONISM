package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.6P, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6P {
    public static final String A08 = C6P.class.getSimpleName();
    public final int A00;
    public final Context A01;
    public final C02525u A02;
    public final C6B A03;
    public final U9 A04;
    public final UA A05;
    public final UB A06;
    public final C02806w A07;

    /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.ads.redexgen.X.6S] */
    public C6P(final Context context, final C02525u c02525u) {
        final C6T c6t = new C6T(new C6V(context, c02525u));
        ?? r2 = new Object(context, c6t, c02525u) { // from class: com.facebook.ads.redexgen.X.6S
            public static byte[] A07;
            public int A00;
            public final C02525u A01;
            public final U9 A02;
            public final UA A03;
            public final UB A04;
            public final C6T A05;
            public final C02806w A06;

            static {
                A04();
            }

            public static String A02(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 48);
                            i4++;
                            c2 = 2;
                            break;
                        case 4:
                            return new String(bArrCopyOfRange);
                    }
                }
            }

            public static void A04() {
                A07 = new byte[]{82, 124};
            }

            {
                this.A03 = new UA(context, c02525u);
                this.A04 = new UB(context, c02525u);
                this.A02 = new U9(context, c02525u);
                this.A06 = new C02806w(context, c02525u);
                this.A05 = c6t;
                this.A01 = c02525u;
                A05();
            }

            @Nullable
            public static C02606c A00(int i, String str, int i2, int i3) {
                char c2 = i != 10300 ? (char) 2 : '\b';
                while (true) {
                    switch (c2) {
                        case 2:
                            if (i == 10920) {
                                c2 = 7;
                                break;
                            } else {
                                c2 = 3;
                                break;
                            }
                        case 3:
                            if (i == 10940) {
                                c2 = '\b';
                                break;
                            } else {
                                c2 = 4;
                                break;
                            }
                        case 4:
                            if (i == 10941) {
                                c2 = '\b';
                                break;
                            } else {
                                c2 = 5;
                                break;
                            }
                        case 5:
                            switch (i) {
                                case 10943:
                                    c2 = '\b';
                                    break;
                                case 10944:
                                    c2 = '\b';
                                    break;
                                case 10945:
                                    c2 = '\b';
                                    break;
                                default:
                                    c2 = 6;
                                    break;
                            }
                        case 6:
                            return (C02606c) null;
                        case 7:
                            return A01(str, i2, i3, EnumC02596b.A02);
                        case '\b':
                            return A01(str, i2, i3, EnumC02596b.A03);
                    }
                }
            }

            @Nullable
            public static C02606c A01(String str, int i, int i2, EnumC02596b enumC02596b) {
                C02606c c02606c = null;
                int i3 = C6R.A00[enumC02596b.ordinal()];
                char c2 = i3 != 1 ? (char) 2 : (char) 5;
                while (true) {
                    switch (c2) {
                        case 2:
                            if (i3 == 2) {
                                c2 = 4;
                                break;
                            } else {
                                c2 = 3;
                                break;
                            }
                        case 3:
                            return c02606c;
                        case 4:
                            str = str;
                            c02606c = new C02606c(str, i, i2);
                            c2 = 3;
                            break;
                        case 5:
                            str = str;
                            c02606c = new C02606c(Integer.valueOf(Integer.parseInt(str)), i, i2);
                            c2 = 3;
                            break;
                    }
                }
            }

            @Nullable
            private List<C02606c> A03(int i) throws JSONException {
                String next = null;
                JSONObject jSONObject = null;
                JSONArray jSONArray = null;
                Iterator<String> itKeys = null;
                ArrayList arrayList = new ArrayList();
                Map<Integer, String> mapA0i = this.A01.A0i();
                int deprecatedApiLevel = mapA0i != null ? 2 : 4;
                while (true) {
                    switch (deprecatedApiLevel) {
                        case 2:
                            mapA0i = mapA0i;
                            if (!mapA0i.isEmpty()) {
                                deprecatedApiLevel = 3;
                                break;
                            } else {
                                deprecatedApiLevel = 4;
                                break;
                            }
                        case 3:
                            mapA0i = mapA0i;
                            if (!mapA0i.containsKey(Integer.valueOf(i))) {
                                deprecatedApiLevel = 4;
                                break;
                            } else {
                                deprecatedApiLevel = 5;
                                break;
                            }
                        case 4:
                            return arrayList;
                        case 5:
                            mapA0i = mapA0i;
                            jSONObject = new JSONObject(mapA0i.get(Integer.valueOf(i)));
                            itKeys = jSONObject.keys();
                            deprecatedApiLevel = 6;
                            break;
                        case 6:
                            itKeys = itKeys;
                            if (!itKeys.hasNext()) {
                                deprecatedApiLevel = 10;
                                break;
                            } else {
                                deprecatedApiLevel = 7;
                                break;
                            }
                        case 7:
                            jSONObject = jSONObject;
                            itKeys = itKeys;
                            next = itKeys.next();
                            jSONArray = jSONObject.getJSONArray(next);
                            if (jSONArray == null) {
                                deprecatedApiLevel = 6;
                                break;
                            } else {
                                deprecatedApiLevel = 8;
                                break;
                            }
                        case 8:
                            jSONArray = jSONArray;
                            if (jSONArray.length() == 2) {
                                deprecatedApiLevel = 9;
                                break;
                            } else {
                                deprecatedApiLevel = 6;
                                break;
                            }
                        case 9:
                            arrayList = arrayList;
                            next = next;
                            jSONArray = jSONArray;
                            int i2 = jSONArray.getInt(0);
                            int minApiLevel = jSONArray.getInt(1);
                            arrayList.add(A00(i, next, i2, minApiLevel));
                            deprecatedApiLevel = 6;
                            break;
                        case 10:
                            return arrayList;
                    }
                }
            }

            @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
            private final void A05() {
                String strA02 = A02(1, 1, 56);
                try {
                    JSONObject jSONObject = new JSONObject(this.A01.A0h());
                    Integer numValueOf = jSONObject.has(strA02) ? Integer.valueOf(jSONObject.getInt(strA02)) : null;
                    if (numValueOf == null) {
                        return;
                    }
                    this.A00 = numValueOf.intValue();
                    this.A06.A04(this.A00);
                    A06(jSONObject.getJSONArray(A02(0, 1, 1)));
                } catch (Throwable th) {
                    AnonymousClass66.A03(th);
                }
            }

            @SuppressLint({"BadMethodUse-android.util.Log.e"})
            private void A06(JSONArray jSONArray) throws Exception {
                JSONArray jSONArray2;
                InterfaceC02616d interfaceC02616dA01;
                Map<Integer, InterfaceC02616d> mapA02 = this.A05.A02();
                if (mapA02 == null) {
                    return;
                }
                for (int signalFlagsEncoded = 0; signalFlagsEncoded < jSONArray.length() && (jSONArray2 = jSONArray.getJSONArray(signalFlagsEncoded)) != null && jSONArray2.length() == 2; signalFlagsEncoded++) {
                    if ((jSONArray2.get(0) instanceof Integer) && (jSONArray2.get(1) instanceof Integer)) {
                        int i = jSONArray2.getInt(0);
                        EnumSet<EnumC02656h> enumSetA02 = EnumC02656h.A02(jSONArray2.getInt(1));
                        if (!A07(enumSetA02)) {
                            if (enumSetA02.contains(EnumC02656h.A07)) {
                                this.A02.A02(new C02586a(i, enumSetA02, mapA02.get(Integer.valueOf(i))));
                            } else {
                                List<C02606c> listA03 = null;
                                boolean z = false;
                                if (enumSetA02.contains(EnumC02656h.A08)) {
                                    listA03 = A03(i);
                                    z = true;
                                }
                                if (mapA02.containsKey(Integer.valueOf(i)) || z) {
                                    if (z) {
                                        interfaceC02616dA01 = this.A05.A01(i, listA03);
                                    } else {
                                        interfaceC02616dA01 = mapA02.get(Integer.valueOf(i));
                                    }
                                    C02586a c02586a = new C02586a(i, enumSetA02, interfaceC02616dA01);
                                    if (enumSetA02.contains(EnumC02656h.A06)) {
                                        this.A06.A05(c02586a);
                                    }
                                    if (enumSetA02.contains(EnumC02656h.A0A)) {
                                        this.A03.A03(c02586a);
                                    } else {
                                        this.A04.A02(c02586a);
                                    }
                                }
                            }
                        }
                    }
                }
            }

            private final boolean A07(EnumSet<EnumC02656h> enumSet) {
                boolean z = false;
                char c2 = enumSet.contains(this.A01.A0a()) ? (char) 2 : (char) 5;
                while (true) {
                    switch (c2) {
                        case 2:
                            enumSet = enumSet;
                            if (!enumSet.contains(EnumC02656h.A04)) {
                                c2 = 5;
                                break;
                            } else {
                                c2 = 3;
                                break;
                            }
                        case 3:
                            enumSet = enumSet;
                            if (!enumSet.contains(EnumC02656h.A05)) {
                                c2 = 5;
                                break;
                            } else {
                                c2 = 4;
                                break;
                            }
                        case 4:
                            enumSet = enumSet;
                            if (!enumSet.contains(EnumC02656h.A09)) {
                                c2 = 7;
                                break;
                            } else {
                                c2 = 5;
                                break;
                            }
                        case 5:
                            z = true;
                            c2 = 6;
                            break;
                        case 6:
                            return z;
                        case 7:
                            z = false;
                            c2 = 6;
                            break;
                    }
                }
            }

            public final int A08() {
                return this.A00;
            }

            public final U9 A09() {
                return this.A02;
            }

            public final UA A0A() {
                return this.A03;
            }

            public final UB A0B() {
                return this.A04;
            }

            public final C02806w A0C() {
                return this.A06;
            }
        };
        this.A01 = context;
        this.A05 = r2.A0A();
        this.A06 = r2.A0B();
        this.A04 = r2.A09();
        this.A00 = r2.A08();
        this.A02 = c02525u;
        this.A03 = new C6B();
        this.A03.A01(this.A04);
        this.A07 = r2.A0C();
        this.A07.A03();
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
    public static JSONObject A00() {
        JSONObject jsonSignalObject = new JSONObject();
        Map<Integer, C02575z<AbstractC02766s>> mapA03 = C02636f.A01().A03();
        if (mapA03 == null || mapA03.isEmpty()) {
            return jsonSignalObject;
        }
        try {
            for (Integer num : mapA03.keySet()) {
                List<AbstractC02766s> listA03 = mapA03.get(num).A03();
                JSONArray jSONArray = new JSONArray();
                Iterator<AbstractC02766s> it = listA03.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().A09(true));
                }
                jsonSignalObject.put(num.toString(), jSONArray);
            }
        } catch (Throwable th) {
            AnonymousClass66.A03(th);
        }
        return jsonSignalObject;
    }

    @SuppressLint({"BadMethodUse-java.lang.System.currentTimeMillis"})
    private void A01(String str, EnumC02626e enumC02626e, EnumC02666i enumC02666i) {
        AnonymousClass64 anonymousClass64A0Y = this.A02.A0Y();
        if (anonymousClass64A0Y != null) {
            int sessionEndTime = (int) (System.currentTimeMillis() / 1000);
            anonymousClass64A0Y.A8J(AnonymousClass71.A05(), str, this.A00, enumC02626e.A03(), sessionEndTime, A00(), enumC02666i);
        }
        AnonymousClass71.A0B(this.A02, AnonymousClass61.A07.A02(), str);
    }

    public final void A02() {
        this.A03.A00();
    }

    public final void A03(EnumC02626e enumC02626e) {
        this.A04.A03(enumC02626e, this.A01);
    }

    public final void A04(EnumC02646g enumC02646g, EnumC02626e enumC02626e, @Nullable String str) {
        A05(enumC02646g, enumC02626e, str, EnumC02666i.A04);
    }

    public final void A05(EnumC02646g enumC02646g, EnumC02626e enumC02626e, @Nullable String str, EnumC02666i enumC02666i) {
        C6P c6p = this;
        c6p.A05.A04(enumC02626e);
        char c2 = enumC02646g == EnumC02646g.A02 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c6p = c6p;
                    enumC02626e = enumC02626e;
                    str = str;
                    c6p.A06.A03(enumC02626e);
                    if (str == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c6p = c6p;
                    enumC02626e = enumC02626e;
                    str = str;
                    enumC02666i = enumC02666i;
                    c6p.A01(str, enumC02626e, enumC02666i);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final boolean A06() {
        boolean z = false;
        List<C02586a> listA02 = this.A05.A02();
        char c2 = listA02 != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    listA02 = listA02;
                    if (!listA02.isEmpty()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
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

package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.facebook.ads.sync.SyncModifiableBundle;
import d.b.a.b.k;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: assets/audience_network.dex */
public final class G4 implements InterfaceC0746Qh {
    public static byte[] A09;

    @VisibleForTesting
    public final Runnable A00;
    public final Q6 A01;
    public final C0744Qf A03;
    public final InterfaceC0745Qg A04;
    public final String A05;
    public final Map<QW, GC> A08 = new HashMap();
    public final Map<QW, AnonymousClass49> A07 = new HashMap();
    public final List<InterfaceC0750Ql> A06 = new ArrayList();
    public final C0739Qa A02 = new C0739Qa(this);

    static {
        A05();
    }

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 67);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A09 = new byte[]{121, 94, 70, 81, 92, 89, 84, 16, 66, 85, 86, 66, 85, 67, 88, 16, 68, 89, 93, 85, 10, 16, 21, 84, 114, 103, 116, 97, 99, 114, 89, 116, 99, 96, 116, 99, 117, 110, 89, 117, 33, 3, 12, 12, 13, 22, 66, 1, 16, 7, 3, 22, 7, 66, 17, 7, 16, 20, 7, 16, 66, 0, 23, 12, 6, 14, 7, 66, 21, 11, 22, 10, 66, 12, 13, 12, 79, 17, 7, 16, 20, 7, 16, 66, 13, 21, 12, 7, 6, 66, 0, 23, 12, 6, 14, 7, 66, 43, 38, 68, 83, 80, 68, 83, 69, 94, 93, 119, 96, 109, 102, 124, 97, 96, 103, 116, 111, 122, 103, 97, 96, 46, 124, 123, 96, 46, 104, 111, 103, 98, 107, 106, 53, 46, 104, 97, 124, 109, 103, 96, 105, 46, 103, 96, 46, 43, 106, 46, 125, 107, 109, 97, 96, 106, 125, 23, 6, 30, 11, 8, 6, 3, 90, 11, 33, 54, 59, 48, 42, 55, 54, 49, 34, 57, 44, 49, 55, 54, 120, 42, 61, 41, 45, 61, 43, 44, 120, 44, 55, 120, 125, 43, 98, 82, 125, 43, 96, 119, 99, 103, 119, 97, 102, 70, 67, 86, 67, 118, 121, 126, 119, 117, 98, 96, 98, 121, 126, 100, 64, 107, 121, 46, 125, 107, 124, 120, 107, 124, 35, 97, 121, 96, 107, 106, 46, 108, 123, 96, 106, 98, 107, 46, 109, 124, 107, 111, 122, 107, 106, 52, 46, 43, 125, 38, 12, 27, 22, 29, 7, 26, 27, 28, 15, 20, 1, 28, 26, 27, 85, 7, 16, 6, 5, 26, 27, 6, 16, 79, Byte.MAX_VALUE, 80, 6, 103, 112, 107, 97, 105, 96, 118, 45, 58, 44, 47, 48, 49, 44, 58, 43, 39, 38, 60, 45, 48, 60};
    }

    public G4(Q6 q6, String str, InterfaceC0745Qg interfaceC0745Qg, C0744Qf c0744Qf) {
        this.A01 = q6;
        this.A05 = str;
        this.A04 = interfaceC0745Qg;
        this.A03 = c0744Qf;
    }

    public static int A00(JSONObject jSONObject) throws JSONException {
        int i = jSONObject.getJSONObject(A01(99, 7, k.AppCompatTheme_windowActionModeOverlay)).getInt(A01(24, 16, 69));
        if (i > 0) {
            return i;
        }
        throw new JSONException(String.format(Locale.US, A01(0, 24, k.AppCompatTheme_windowActionBar), Integer.valueOf(i)));
    }

    private Set<InterfaceC0749Qk> A02(JSONObject responseObject) throws JSONException {
        G4 g4 = this;
        int i = 0;
        final GC next = null;
        Iterator<AnonymousClass49> it = null;
        final AnonymousClass49 next2 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        HashSet hashSet = new HashSet();
        JSONObject jSONObject = responseObject.getJSONObject(A01(288, 8, 28));
        JSONObject jSONObject2 = responseObject.getJSONObject(A01(281, 7, 70));
        Iterator<GC> it2 = g4.A08.values().iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it2 = it2;
                    i3 = 2;
                    i2 = 1;
                    if (!it2.hasNext()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    jSONObject = jSONObject;
                    it2 = it2;
                    next = it2.next();
                    EnumC0753Qo responseForBundle = EnumC0753Qo.A00(jSONObject.getString(next.A6N().A03()));
                    i4 = C0748Qj.A01[responseForBundle.ordinal()];
                    if (i4 == i2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i4 != i3) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    hashSet = hashSet;
                    next = next;
                    hashSet.add(new G5(next) { // from class: com.facebook.ads.redexgen.X.3Z
                        {
                            EnumC0753Qo enumC0753Qo = EnumC0753Qo.A04;
                        }
                    });
                    c2 = 2;
                    break;
                case 6:
                    hashSet = hashSet;
                    jSONObject2 = jSONObject2;
                    next = next;
                    final JSONObject jSONObject3 = jSONObject2.getJSONObject(next.A6N().A03()).getJSONObject(A01(203, 4, 97));
                    final JSONObject jSONObjectOptJSONObject = jSONObject2.getJSONObject(next.A6N().A03()).optJSONObject(A01(207, 11, 83));
                    hashSet.add(new G5(next, jSONObject3, jSONObjectOptJSONObject) { // from class: com.facebook.ads.redexgen.X.3s
                        public final JSONObject A00;

                        @Nullable
                        public final JSONObject A01;

                        {
                            EnumC0753Qo enumC0753Qo = EnumC0753Qo.A03;
                            this.A00 = jSONObject3;
                            this.A01 = jSONObjectOptJSONObject;
                        }

                        @Override // com.facebook.ads.redexgen.X.G5, com.facebook.ads.redexgen.X.InterfaceC0749Qk
                        public final void A3O(Map<QV, EnumC0753Qo> map, Map<GB, EnumC0741Qc> map2) {
                            super.A00.A05(this.A00, this.A01);
                            super.A3O(map, map2);
                        }
                    });
                    c2 = 2;
                    break;
                case 7:
                    throw new AssertionError();
                case '\b':
                    g4 = g4;
                    it = g4.A07.values().iterator();
                    c2 = '\t';
                    break;
                case '\t':
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    jSONObject = jSONObject;
                    it = it;
                    next2 = it.next();
                    EnumC0741Qc responseForBundle2 = EnumC0741Qc.A00(jSONObject.getString(next2.A6N().A03()));
                    i = C0748Qj.A00[responseForBundle2.ordinal()];
                    if (i == i2) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    if (i != i3) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    hashSet = hashSet;
                    next2 = next2;
                    hashSet.add(new G6(next2) { // from class: com.facebook.ads.redexgen.X.3Y
                        {
                            EnumC0741Qc enumC0741Qc = EnumC0741Qc.A04;
                        }

                        @Override // com.facebook.ads.redexgen.X.G6, com.facebook.ads.redexgen.X.InterfaceC0749Qk
                        public final void A3O(Map<QV, EnumC0753Qo> map, Map<GB, EnumC0741Qc> map2) {
                            this.A01.A06();
                            super.A3O(map, map2);
                        }
                    });
                    c2 = '\t';
                    break;
                case '\r':
                    hashSet = hashSet;
                    next2 = next2;
                    hashSet.add(new G6(next2) { // from class: com.facebook.ads.redexgen.X.48
                        {
                            EnumC0741Qc enumC0741Qc = EnumC0741Qc.A03;
                        }
                    });
                    c2 = '\t';
                    break;
                case 14:
                    throw new AssertionError();
                case 15:
                    return hashSet;
            }
        }
    }

    private JSONObject A03(Map<QV, EnumC0752Qn> map, Map<GB, EnumC0740Qb> map2, Map<GB, JSONObject> map3, Map<GB, JSONObject> map4) throws JSONException {
        Map<GB, JSONObject> map5 = map4;
        Map<QV, EnumC0752Qn> map6 = map;
        Map<GB, JSONObject> map7 = map3;
        Map<GB, EnumC0740Qb> map8 = map2;
        G4 g4 = this;
        Map.Entry<String, String> next = null;
        Iterator<Map.Entry<String, String>> it = null;
        Iterator<Map.Entry<QV, EnumC0752Qn>> it2 = null;
        JSONObject jSONObject = null;
        Map.Entry<QV, EnumC0752Qn> next2 = null;
        Iterator<Map.Entry<GB, EnumC0740Qb>> it3 = null;
        Iterator<Map.Entry<GB, EnumC0740Qb>> it4 = null;
        JSONObject jSONObject2 = null;
        String strA01 = null;
        JSONObject jSONObject3 = null;
        QV key = null;
        JSONObject jSONObject4 = null;
        QV key2 = null;
        JSONObject jSONObject5 = new JSONObject();
        Iterator<Map.Entry<QV, EnumC0752Qn>> it5 = map6.entrySet().iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it5 = it5;
                    if (!it5.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    jSONObject5 = jSONObject5;
                    it5 = it5;
                    Map.Entry<QV, EnumC0752Qn> next3 = it5.next();
                    jSONObject5.put(next3.getKey().A6N().A03(), next3.getValue().A02());
                    c2 = 2;
                    break;
                case 4:
                    map8 = map8;
                    it3 = map8.entrySet().iterator();
                    c2 = 5;
                    break;
                case 5:
                    it3 = it3;
                    if (!it3.hasNext()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    jSONObject5 = jSONObject5;
                    it3 = it3;
                    Map.Entry<GB, EnumC0740Qb> next4 = it3.next();
                    jSONObject5.put(next4.getKey().A6N().A03(), next4.getValue().A02());
                    c2 = 5;
                    break;
                case 7:
                    map6 = map6;
                    jSONObject2 = new JSONObject();
                    it2 = map6.entrySet().iterator();
                    c2 = '\b';
                    break;
                case '\b':
                    it2 = it2;
                    boolean zHasNext = it2.hasNext();
                    strA01 = A01(207, 11, 83);
                    if (!zHasNext) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    it2 = it2;
                    next2 = it2.next();
                    if (next2.getValue() != EnumC0752Qn.A04) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    jSONObject2 = jSONObject2;
                    next2 = next2;
                    jSONObject3 = new JSONObject();
                    key = next2.getKey();
                    jSONObject2.put(key.A6N().A03(), jSONObject3);
                    if (!next2.getKey().A6N().A04()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    strA01 = strA01;
                    jSONObject3 = jSONObject3;
                    key = key;
                    jSONObject3.put(strA01, key.A6I());
                    c2 = '\f';
                    break;
                case '\f':
                    jSONObject2 = jSONObject2;
                    jSONObject3 = jSONObject3;
                    key = key;
                    jSONObject2.put(key.A6N().A03(), jSONObject3);
                    c2 = '\b';
                    break;
                case '\r':
                    strA01 = strA01;
                    jSONObject3 = jSONObject3;
                    jSONObject3.put(strA01, JSONObject.NULL);
                    c2 = '\f';
                    break;
                case 14:
                    map8 = map8;
                    it4 = map8.entrySet().iterator();
                    c2 = 15;
                    break;
                case 15:
                    it4 = it4;
                    if (!it4.hasNext()) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    map5 = map5;
                    strA01 = strA01;
                    it4 = it4;
                    Map.Entry<GB, EnumC0740Qb> next5 = it4.next();
                    jSONObject4 = new JSONObject();
                    key2 = next5.getKey();
                    jSONObject4.put(strA01, map5.get(next5.getKey()));
                    if (next5.getValue() != EnumC0740Qb.A04) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    map7 = map7;
                    jSONObject2 = jSONObject2;
                    jSONObject4 = jSONObject4;
                    key2 = key2;
                    jSONObject4.put(A01(203, 4, 97), map7.get(key2));
                    jSONObject2.put(key2.A6N().A03(), jSONObject4);
                    c2 = 15;
                    break;
                case 18:
                    jSONObject2 = jSONObject2;
                    jSONObject4 = jSONObject4;
                    key2 = key2;
                    jSONObject2.put(key2.A6N().A03(), jSONObject4);
                    c2 = 15;
                    break;
                case 19:
                    g4 = g4;
                    jSONObject = new JSONObject();
                    it = g4.A04.A6A().entrySet().iterator();
                    c2 = 20;
                    break;
                case 20:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    it = it;
                    next = it.next();
                    if (next.getValue() == null) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    jSONObject = jSONObject;
                    next = next;
                    jSONObject.put(next.getKey(), next.getValue());
                    c2 = 20;
                    break;
                case 23:
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put(A01(196, 7, 81), jSONObject5);
                    jSONObject6.put(A01(281, 7, 70), jSONObject2);
                    jSONObject6.put(A01(296, 7, 11), jSONObject);
                    return jSONObject6;
            }
        }
    }

    private void A04() throws Throwable {
        Map<QV, EnumC0752Qn> clientBundleRequests = new HashMap<>();
        Map<GB, EnumC0740Qb> clientBundleData = new HashMap<>();
        Map<GB, JSONObject> clientBundleFingerprint = new HashMap<>();
        Map<GB, JSONObject> map = new HashMap<>();
        synchronized (this) {
            for (QV qv : this.A08.values()) {
                if (qv.A7k()) {
                    clientBundleRequests.put(qv, EnumC0752Qn.A04);
                } else {
                    clientBundleRequests.put(qv, EnumC0752Qn.A03);
                }
            }
            AtomicReference<JSONObject> atomicReference = new AtomicReference<>();
            AtomicReference<JSONObject> atomicReference2 = new AtomicReference<>();
            for (AnonymousClass49 anonymousClass49 : this.A07.values()) {
                if (anonymousClass49.A7k()) {
                    if (anonymousClass49.A07(atomicReference, atomicReference2)) {
                        clientBundleData.put(anonymousClass49, EnumC0740Qb.A04);
                        clientBundleFingerprint.put(anonymousClass49, atomicReference.get());
                    } else {
                        clientBundleData.put(anonymousClass49, EnumC0740Qb.A03);
                    }
                    map.put(anonymousClass49, atomicReference2.get());
                }
            }
            Iterator<InterfaceC0750Ql> it = this.A06.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference<Throwable> failureContainer = new AtomicReference<>();
        AtomicReference atomicReference3 = new AtomicReference();
        JSONObject jSONObjectA03 = A03(clientBundleRequests, clientBundleData, clientBundleFingerprint, map);
        String.format(Locale.US, A01(163, 33, 27), this.A05, jSONObjectA03.toString(2));
        this.A01.ABk(this.A05, (A01(155, 8, 36) + URLEncoder.encode(jSONObjectA03.toString())).getBytes(), new G7(this, failureContainer, atomicReference3, countDownLatch));
        while (countDownLatch.getCount() > 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this) {
            if (atomicReference3.get() == null) {
                JSONObject syncRequest = (JSONObject) failureContainer.get();
                Set<InterfaceC0749Qk> setA02 = A02(syncRequest);
                Map<SyncModifiableBundle, JSONObject> clientBundleFingerprint2 = new HashMap<>();
                HashMap map2 = new HashMap();
                for (InterfaceC0749Qk response : setA02) {
                    response.A3O(clientBundleFingerprint2, map2);
                }
                this.A02.A03(A00((JSONObject) failureContainer.get()));
                Iterator<InterfaceC0750Ql> it2 = this.A06.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            } else {
                throw ((Throwable) atomicReference3.get());
            }
        }
    }

    public static void A06(String str, AtomicReference<JSONObject> atomicReference, AtomicReference<Throwable> atomicReference2) {
        String.format(Locale.US, A01(253, 28, 54), str);
        try {
            atomicReference.set((JSONObject) new JSONTokener(str).nextValue());
        } catch (ClassCastException | JSONException e) {
            atomicReference2.set(e);
        }
    }

    public final void A08() {
        try {
            A04();
        } catch (Throwable unused) {
            String.format(Locale.US, A01(106, 49, 77), Integer.valueOf(this.A03.A01()));
            synchronized (this) {
                Iterator<InterfaceC0750Ql> it = this.A06.iterator();
                while (it.hasNext()) {
                    it.next();
                    new HashMap();
                    new HashMap();
                }
                this.A02.A03(this.A03.A01());
            }
        }
        Runnable runnable = this.A00;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0746Qh
    public final synchronized QV A4N(QW qw) {
        if (qw.A02() == QY.A03) {
            if (this.A08.containsKey(qw)) {
                return this.A08.get(qw);
            }
            GC gc = new GC(qw);
            this.A08.put(qw, gc);
            Iterator<InterfaceC0750Ql> it = this.A06.iterator();
            while (it.hasNext()) {
                it.next();
            }
            String.format(Locale.US, A01(218, 35, 77), qw);
            return gc;
        }
        throw new IllegalArgumentException(A01(40, 59, 33));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0746Qh
    public final void A59() {
        this.A02.A02();
    }
}

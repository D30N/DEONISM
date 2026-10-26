package com.google.android.gms.measurement.internal;

import d.b.a.a.e.e.f1;
import d.b.a.a.e.e.x0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class ia {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1737b;

    /* renamed from: c, reason: collision with root package name */
    private d.b.a.a.e.e.e1 f1738c;

    /* renamed from: d, reason: collision with root package name */
    private BitSet f1739d;
    private BitSet e;
    private Map<Integer, Long> f;
    private Map<Integer, List<Long>> g;
    private final /* synthetic */ ga h;

    private ia(ga gaVar, String str) {
        this.h = gaVar;
        this.a = str;
        this.f1737b = true;
        this.f1739d = new BitSet();
        this.e = new BitSet();
        this.f = new b.d.a();
        this.g = new b.d.a();
    }

    /* synthetic */ ia(ga gaVar, String str, ja jaVar) {
        this(gaVar, str);
    }

    private ia(ga gaVar, String str, d.b.a.a.e.e.e1 e1Var, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.h = gaVar;
        this.a = str;
        this.f1739d = bitSet;
        this.e = bitSet2;
        this.f = map;
        this.g = new b.d.a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.g.put(num, arrayList);
            }
        }
        this.f1737b = false;
        this.f1738c = e1Var;
    }

    /* synthetic */ ia(ga gaVar, String str, d.b.a.a.e.e.e1 e1Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, ja jaVar) {
        this(gaVar, str, e1Var, bitSet, bitSet2, map, map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [d.b.a.a.e.e.r4$a, d.b.a.a.e.e.w0$a] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v3, types: [d.b.a.a.e.e.e1$a] */
    final d.b.a.a.e.e.w0 a(int i) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? T = d.b.a.a.e.e.w0.T();
        T.w(i);
        T.z(this.f1737b);
        d.b.a.a.e.e.e1 e1Var = this.f1738c;
        if (e1Var != null) {
            T.y(e1Var);
        }
        ?? C0 = d.b.a.a.e.e.e1.c0();
        C0.B(v9.F(this.f1739d));
        C0.y(v9.F(this.e));
        if (this.f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f.size());
            Iterator<Integer> it = this.f.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                x0.a aVarM = d.b.a.a.e.e.x0.M();
                aVarM.w(iIntValue);
                aVarM.x(this.f.get(Integer.valueOf(iIntValue)).longValue());
                arrayList.add((d.b.a.a.e.e.x0) ((d.b.a.a.e.e.r4) aVarM.i()));
            }
        }
        C0.C(arrayList);
        if (this.g == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.g.size());
            for (Integer num : this.g.keySet()) {
                f1.a aVarN = d.b.a.a.e.e.f1.N();
                aVarN.w(num.intValue());
                List<Long> list = this.g.get(num);
                if (list != null) {
                    Collections.sort(list);
                    aVarN.x(list);
                }
                arrayList2.add((d.b.a.a.e.e.f1) ((d.b.a.a.e.e.r4) aVarN.i()));
            }
        }
        C0.D(arrayList2);
        T.x(C0);
        return (d.b.a.a.e.e.w0) ((d.b.a.a.e.e.r4) T.i());
    }

    final void c(na naVar) {
        int iA = naVar.a();
        Boolean bool = naVar.f1814c;
        if (bool != null) {
            this.e.set(iA, bool.booleanValue());
        }
        Boolean bool2 = naVar.f1815d;
        if (bool2 != null) {
            this.f1739d.set(iA, bool2.booleanValue());
        }
        if (naVar.e != null) {
            Long l = this.f.get(Integer.valueOf(iA));
            long jLongValue = naVar.e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                this.f.put(Integer.valueOf(iA), Long.valueOf(jLongValue));
            }
        }
        if (naVar.f != null) {
            List<Long> arrayList = this.g.get(Integer.valueOf(iA));
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.g.put(Integer.valueOf(iA), arrayList);
            }
            if (naVar.i()) {
                arrayList.clear();
            }
            if (d.b.a.a.e.e.o9.b() && this.h.n().z(this.a, r.g0) && naVar.j()) {
                arrayList.clear();
            }
            if (!d.b.a.a.e.e.o9.b() || !this.h.n().z(this.a, r.g0)) {
                arrayList.add(Long.valueOf(naVar.f.longValue() / 1000));
                return;
            }
            long jLongValue2 = naVar.f.longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }
}

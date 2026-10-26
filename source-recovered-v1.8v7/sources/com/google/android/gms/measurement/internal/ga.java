package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class ga extends o9 {

    /* renamed from: d, reason: collision with root package name */
    private String f1718d;
    private Set<Integer> e;
    private Map<Integer, ia> f;
    private Long g;
    private Long h;

    ga(r9 r9Var) {
        super(r9Var);
    }

    private final ia v(int i) {
        if (this.f.containsKey(Integer.valueOf(i))) {
            return this.f.get(Integer.valueOf(i));
        }
        ia iaVar = new ia(this, this.f1718d, null);
        this.f.put(Integer.valueOf(i), iaVar);
        return iaVar;
    }

    private final boolean x(int i, int i2) {
        if (this.f.get(Integer.valueOf(i)) == null) {
            return false;
        }
        return this.f.get(Integer.valueOf(i)).f1739d.get(i2);
    }

    @Override // com.google.android.gms.measurement.internal.o9
    protected final boolean u() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x062e, code lost:
    
        r7 = m().J();
        r9 = com.google.android.gms.measurement.internal.z3.x(r46.f1718d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0640, code lost:
    
        if (r8.G() == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0642, code lost:
    
        r8 = java.lang.Integer.valueOf(r8.H());
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x064b, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x064c, code lost:
    
        r7.c("Invalid property filter ID. appId, id", r9, java.lang.String.valueOf(r8));
        r8 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.List<d.b.a.a.e.e.w0> w(java.lang.String r47, java.util.List<d.b.a.a.e.e.y0> r48, java.util.List<d.b.a.a.e.e.g1> r49, java.lang.Long r50, java.lang.Long r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ga.w(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}

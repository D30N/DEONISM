package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public abstract class StatsEvent extends com.google.android.gms.common.internal.v.a implements ReflectedParcelable {
    public abstract int h();

    public abstract long i();

    public abstract long k();

    public abstract String l();

    public String toString() {
        long jI = i();
        int iH = h();
        long jK = k();
        String strL = l();
        StringBuilder sb = new StringBuilder(String.valueOf(strL).length() + 53);
        sb.append(jI);
        sb.append("\t");
        sb.append(iH);
        sb.append("\t");
        sb.append(jK);
        sb.append(strL);
        return sb.toString();
    }
}

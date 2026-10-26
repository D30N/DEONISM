package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.v.b;
import d.b.a.a.e.e.a1;
import d.b.a.a.e.e.c1;
import d.b.a.a.e.e.g1;
import d.b.a.a.e.e.y0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final class v9 extends o9 {
    v9(r9 r9Var) {
        super(r9Var);
    }

    static <Builder extends d.b.a.a.e.e.c6> Builder A(Builder builder, byte[] bArr) {
        d.b.a.a.e.e.e4 e4VarC = d.b.a.a.e.e.e4.c();
        if (e4VarC != null) {
            builder.m(bArr, e4VarC);
            return builder;
        }
        builder.l(bArr);
        return builder;
    }

    private static String E(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    static List<Long> F(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 < bitSet.length()) {
                    if (bitSet.get(i3)) {
                        j |= 1 << i2;
                    }
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    private static List<d.b.a.a.e.e.a1> H(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                a1.a aVarG0 = d.b.a.a.e.e.a1.g0();
                for (String str : bundle.keySet()) {
                    a1.a aVarG02 = d.b.a.a.e.e.a1.g0();
                    aVarG02.B(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        aVarG02.y(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        aVarG02.D((String) obj);
                    } else if (obj instanceof Double) {
                        aVarG02.x(((Double) obj).doubleValue());
                    }
                    aVarG0.z(aVarG02);
                }
                if (aVarG0.F() > 0) {
                    arrayList.add((d.b.a.a.e.e.a1) ((d.b.a.a.e.e.r4) aVarG0.i()));
                }
            }
        }
        return arrayList;
    }

    private static void L(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private final void M(StringBuilder sb, int i, d.b.a.a.e.e.k0 k0Var) {
        if (k0Var == null) {
            return;
        }
        L(sb, i);
        sb.append("filter {\n");
        if (k0Var.K()) {
            P(sb, i, "complement", Boolean.valueOf(k0Var.L()));
        }
        if (k0Var.M()) {
            P(sb, i, "param_name", e().z(k0Var.N()));
        }
        if (k0Var.G()) {
            int i2 = i + 1;
            d.b.a.a.e.e.n0 n0VarH = k0Var.H();
            if (n0VarH != null) {
                L(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (n0VarH.E()) {
                    P(sb, i2, "match_type", n0VarH.F().name());
                }
                if (n0VarH.G()) {
                    P(sb, i2, "expression", n0VarH.H());
                }
                if (n0VarH.I()) {
                    P(sb, i2, "case_sensitive", Boolean.valueOf(n0VarH.J()));
                }
                if (n0VarH.L() > 0) {
                    L(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str : n0VarH.K()) {
                        L(sb, i2 + 2);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                L(sb, i2);
                sb.append("}\n");
            }
        }
        if (k0Var.I()) {
            N(sb, i + 1, "number_filter", k0Var.J());
        }
        L(sb, i);
        sb.append("}\n");
    }

    private final void N(StringBuilder sb, int i, String str, d.b.a.a.e.e.l0 l0Var) {
        if (l0Var == null) {
            return;
        }
        L(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (l0Var.E()) {
            P(sb, i, "comparison_type", l0Var.F().name());
        }
        if (l0Var.G()) {
            P(sb, i, "match_as_float", Boolean.valueOf(l0Var.H()));
        }
        if (l0Var.I()) {
            P(sb, i, "comparison_value", l0Var.J());
        }
        if (l0Var.K()) {
            P(sb, i, "min_comparison_value", l0Var.L());
        }
        if (l0Var.M()) {
            P(sb, i, "max_comparison_value", l0Var.N());
        }
        L(sb, i);
        sb.append("}\n");
    }

    private static void O(StringBuilder sb, int i, String str, d.b.a.a.e.e.e1 e1Var, String str2) {
        if (e1Var == null) {
            return;
        }
        L(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (e1Var.T() != 0) {
            L(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : e1Var.Q()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (e1Var.K() != 0) {
            L(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : e1Var.F()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (e1Var.Z() != 0) {
            L(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (d.b.a.a.e.e.x0 x0Var : e1Var.X()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(x0Var.I() ? Integer.valueOf(x0Var.J()) : null);
                sb.append(":");
                sb.append(x0Var.K() ? Long.valueOf(x0Var.L()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (e1Var.b0() != 0) {
            L(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (d.b.a.a.e.e.f1 f1Var : e1Var.a0()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(f1Var.I() ? Integer.valueOf(f1Var.J()) : null);
                sb.append(": [");
                Iterator<Long> it = f1Var.L().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        L(sb, 3);
        sb.append("}\n");
    }

    private static void P(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        L(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private final void Q(StringBuilder sb, int i, List<d.b.a.a.e.e.a1> list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        for (d.b.a.a.e.e.a1 a1Var : list) {
            if (a1Var != null) {
                L(sb, i2);
                sb.append("param {\n");
                if (d.b.a.a.e.e.b9.b() && n().t(r.E0)) {
                    P(sb, i2, "name", a1Var.O() ? e().z(a1Var.P()) : null);
                    P(sb, i2, "string_value", a1Var.U() ? a1Var.V() : null);
                    P(sb, i2, "int_value", a1Var.Y() ? Long.valueOf(a1Var.Z()) : null);
                    P(sb, i2, "double_value", a1Var.c0() ? Double.valueOf(a1Var.d0()) : null);
                    if (a1Var.f0() > 0) {
                        Q(sb, i2, a1Var.e0());
                    }
                } else {
                    P(sb, i2, "name", e().z(a1Var.P()));
                    P(sb, i2, "string_value", a1Var.V());
                    P(sb, i2, "int_value", a1Var.Y() ? Long.valueOf(a1Var.Z()) : null);
                    P(sb, i2, "double_value", a1Var.c0() ? Double.valueOf(a1Var.d0()) : null);
                }
                L(sb, i2);
                sb.append("}\n");
            }
        }
    }

    static boolean S(p pVar, fa faVar) {
        com.google.android.gms.common.internal.q.k(pVar);
        com.google.android.gms.common.internal.q.k(faVar);
        return (TextUtils.isEmpty(faVar.f1703c) && TextUtils.isEmpty(faVar.s)) ? false : true;
    }

    static boolean T(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean U(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
        }
        return false;
    }

    static int v(c1.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i = 0; i < aVar.W(); i++) {
            if (str.equals(aVar.U(i).S())) {
                return i;
            }
        }
        return -1;
    }

    static d.b.a.a.e.e.a1 z(d.b.a.a.e.e.y0 y0Var, String str) {
        for (d.b.a.a.e.e.a1 a1Var : y0Var.F()) {
            if (a1Var.P().equals(str)) {
                return a1Var;
            }
        }
        return null;
    }

    final String B(d.b.a.a.e.e.j0 j0Var) {
        if (j0Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (j0Var.J()) {
            P(sb, 0, "filter_id", Integer.valueOf(j0Var.K()));
        }
        P(sb, 0, "event_name", e().w(j0Var.L()));
        String strE = E(j0Var.Q(), j0Var.R(), j0Var.T());
        if (!strE.isEmpty()) {
            P(sb, 0, "filter_type", strE);
        }
        if (j0Var.O()) {
            N(sb, 1, "event_count_filter", j0Var.P());
        }
        if (j0Var.N() > 0) {
            sb.append("  filters {\n");
            Iterator<d.b.a.a.e.e.k0> it = j0Var.M().iterator();
            while (it.hasNext()) {
                M(sb, 2, it.next());
            }
        }
        L(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    final String C(d.b.a.a.e.e.m0 m0Var) {
        if (m0Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (m0Var.G()) {
            P(sb, 0, "filter_id", Integer.valueOf(m0Var.H()));
        }
        P(sb, 0, "property_name", e().A(m0Var.I()));
        String strE = E(m0Var.K(), m0Var.L(), m0Var.N());
        if (!strE.isEmpty()) {
            P(sb, 0, "filter_type", strE);
        }
        M(sb, 1, m0Var.J());
        sb.append("}\n");
        return sb.toString();
    }

    final String D(d.b.a.a.e.e.b1 b1Var) {
        if (b1Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (d.b.a.a.e.e.c1 c1Var : b1Var.F()) {
            if (c1Var != null) {
                L(sb, 1);
                sb.append("bundle {\n");
                if (c1Var.X()) {
                    P(sb, 1, "protocol_version", Integer.valueOf(c1Var.y0()));
                }
                P(sb, 1, "platform", c1Var.B2());
                if (c1Var.K2()) {
                    P(sb, 1, "gmp_version", Long.valueOf(c1Var.Y()));
                }
                if (c1Var.Z()) {
                    P(sb, 1, "uploading_gmp_version", Long.valueOf(c1Var.a0()));
                }
                if (c1Var.K0()) {
                    P(sb, 1, "dynamite_version", Long.valueOf(c1Var.L0()));
                }
                if (c1Var.s0()) {
                    P(sb, 1, "config_version", Long.valueOf(c1Var.t0()));
                }
                P(sb, 1, "gmp_app_id", c1Var.k0());
                P(sb, 1, "admob_app_id", c1Var.J0());
                P(sb, 1, "app_id", c1Var.I2());
                P(sb, 1, "app_version", c1Var.J2());
                if (c1Var.p0()) {
                    P(sb, 1, "app_version_major", Integer.valueOf(c1Var.q0()));
                }
                P(sb, 1, "firebase_instance_id", c1Var.o0());
                if (c1Var.f0()) {
                    P(sb, 1, "dev_cert_hash", Long.valueOf(c1Var.g0()));
                }
                P(sb, 1, "app_store", c1Var.H2());
                if (c1Var.M1()) {
                    P(sb, 1, "upload_timestamp_millis", Long.valueOf(c1Var.N1()));
                }
                if (c1Var.Y1()) {
                    P(sb, 1, "start_timestamp_millis", Long.valueOf(c1Var.Z1()));
                }
                if (c1Var.j2()) {
                    P(sb, 1, "end_timestamp_millis", Long.valueOf(c1Var.k2()));
                }
                if (c1Var.r2()) {
                    P(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c1Var.s2()));
                }
                if (c1Var.x2()) {
                    P(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c1Var.y2()));
                }
                P(sb, 1, "app_instance_id", c1Var.e0());
                P(sb, 1, "resettable_device_id", c1Var.b0());
                P(sb, 1, "device_id", c1Var.r0());
                P(sb, 1, "ds_id", c1Var.w0());
                if (c1Var.c0()) {
                    P(sb, 1, "limited_ad_tracking", Boolean.valueOf(c1Var.d0()));
                }
                P(sb, 1, "os_version", c1Var.C2());
                P(sb, 1, "device_model", c1Var.D2());
                P(sb, 1, "user_default_language", c1Var.E2());
                if (c1Var.F2()) {
                    P(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c1Var.G2()));
                }
                if (c1Var.h0()) {
                    P(sb, 1, "bundle_sequential_index", Integer.valueOf(c1Var.i0()));
                }
                if (c1Var.l0()) {
                    P(sb, 1, "service_upload", Boolean.valueOf(c1Var.m0()));
                }
                P(sb, 1, "health_monitor", c1Var.j0());
                if (!n().t(r.M0) && c1Var.u0() && c1Var.v0() != 0) {
                    P(sb, 1, "android_id", Long.valueOf(c1Var.v0()));
                }
                if (c1Var.x0()) {
                    P(sb, 1, "retry_counter", Integer.valueOf(c1Var.I0()));
                }
                List<d.b.a.a.e.e.g1> listQ1 = c1Var.q1();
                if (listQ1 != null) {
                    for (d.b.a.a.e.e.g1 g1Var : listQ1) {
                        if (g1Var != null) {
                            L(sb, 2);
                            sb.append("user_property {\n");
                            P(sb, 2, "set_timestamp_millis", g1Var.L() ? Long.valueOf(g1Var.M()) : null);
                            P(sb, 2, "name", e().A(g1Var.S()));
                            P(sb, 2, "string_value", g1Var.V());
                            P(sb, 2, "int_value", g1Var.W() ? Long.valueOf(g1Var.X()) : null);
                            P(sb, 2, "double_value", g1Var.Y() ? Double.valueOf(g1Var.Z()) : null);
                            L(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<d.b.a.a.e.e.w0> listN0 = c1Var.n0();
                String strI2 = c1Var.I2();
                if (listN0 != null) {
                    for (d.b.a.a.e.e.w0 w0Var : listN0) {
                        if (w0Var != null) {
                            L(sb, 2);
                            sb.append("audience_membership {\n");
                            if (w0Var.K()) {
                                P(sb, 2, "audience_id", Integer.valueOf(w0Var.L()));
                            }
                            if (w0Var.R()) {
                                P(sb, 2, "new_audience", Boolean.valueOf(w0Var.S()));
                            }
                            O(sb, 2, "current_data", w0Var.O(), strI2);
                            if (w0Var.P()) {
                                O(sb, 2, "previous_data", w0Var.Q(), strI2);
                            }
                            L(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<d.b.a.a.e.e.y0> listX0 = c1Var.X0();
                if (listX0 != null) {
                    for (d.b.a.a.e.e.y0 y0Var : listX0) {
                        if (y0Var != null) {
                            L(sb, 2);
                            sb.append("event {\n");
                            P(sb, 2, "name", e().w(y0Var.W()));
                            if (y0Var.X()) {
                                P(sb, 2, "timestamp_millis", Long.valueOf(y0Var.Y()));
                            }
                            if (y0Var.Z()) {
                                P(sb, 2, "previous_timestamp_millis", Long.valueOf(y0Var.a0()));
                            }
                            if (y0Var.b0()) {
                                P(sb, 2, "count", Integer.valueOf(y0Var.c0()));
                            }
                            if (y0Var.S() != 0) {
                                Q(sb, 2, y0Var.F());
                            }
                            L(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                L(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    final List<Long> G(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                m().J().b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    m().J().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & ((1 << (num.intValue() % 64)) ^ (-1))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    final void I(y0.a aVar, String str, Object obj) {
        List<d.b.a.a.e.e.a1> listE = aVar.E();
        int i = 0;
        while (true) {
            if (i >= listE.size()) {
                i = -1;
                break;
            } else if (str.equals(listE.get(i).P())) {
                break;
            } else {
                i++;
            }
        }
        a1.a aVarG0 = d.b.a.a.e.e.a1.g0();
        aVarG0.B(str);
        if (obj instanceof Long) {
            aVarG0.y(((Long) obj).longValue());
        } else if (obj instanceof String) {
            aVarG0.D((String) obj);
        } else if (obj instanceof Double) {
            aVarG0.x(((Double) obj).doubleValue());
        } else if (d.b.a.a.e.e.b9.b() && n().t(r.G0) && (obj instanceof Bundle[])) {
            aVarG0.A(H((Bundle[]) obj));
        }
        if (i >= 0) {
            aVar.w(i, aVarG0);
        } else {
            aVar.z(aVarG0);
        }
    }

    final void J(a1.a aVar, Object obj) {
        com.google.android.gms.common.internal.q.k(obj);
        aVar.w();
        aVar.C();
        aVar.E();
        aVar.G();
        if (obj instanceof String) {
            aVar.D((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.y(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            aVar.x(((Double) obj).doubleValue());
        } else if (d.b.a.a.e.e.b9.b() && n().t(r.G0) && (obj instanceof Bundle[])) {
            aVar.A(H((Bundle[]) obj));
        } else {
            m().G().b("Ignoring invalid (type) event param value", obj);
        }
    }

    final void K(g1.a aVar, Object obj) {
        com.google.android.gms.common.internal.q.k(obj);
        aVar.w();
        aVar.A();
        aVar.D();
        if (obj instanceof String) {
            aVar.C((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.B(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.x(((Double) obj).doubleValue());
        } else {
            m().G().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    final boolean R(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(k().a() - j) > j2;
    }

    final Object V(d.b.a.a.e.e.y0 y0Var, String str) {
        d.b.a.a.e.e.a1 a1VarZ = z(y0Var, str);
        if (a1VarZ == null) {
            return null;
        }
        if (a1VarZ.U()) {
            return a1VarZ.V();
        }
        if (a1VarZ.Y()) {
            return Long.valueOf(a1VarZ.Z());
        }
        if (a1VarZ.c0()) {
            return Double.valueOf(a1VarZ.d0());
        }
        if (!d.b.a.a.e.e.b9.b() || !n().t(r.G0) || a1VarZ.f0() <= 0) {
            return null;
        }
        List<d.b.a.a.e.e.a1> listE0 = a1VarZ.e0();
        ArrayList arrayList = new ArrayList();
        for (d.b.a.a.e.e.a1 a1Var : listE0) {
            if (a1Var != null) {
                Bundle bundle = new Bundle();
                for (d.b.a.a.e.e.a1 a1Var2 : a1Var.e0()) {
                    if (a1Var2.U()) {
                        bundle.putString(a1Var2.P(), a1Var2.V());
                    } else if (a1Var2.Y()) {
                        bundle.putLong(a1Var2.P(), a1Var2.Z());
                    } else if (a1Var2.c0()) {
                        bundle.putDouble(a1Var2.P(), a1Var2.d0());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    final byte[] W(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i = gZIPInputStream.read(bArr2);
                if (i <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i);
            }
        } catch (IOException e) {
            m().G().b("Failed to ungzip content", e);
            throw e;
        }
    }

    final byte[] X(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            m().G().b("Failed to gzip content", e);
            throw e;
        }
    }

    final List<Integer> Y() throws NumberFormatException {
        Map<String, String> mapC = r.c(this.f1845b.f());
        if (mapC == null || mapC.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = r.P.a(null).intValue();
        for (Map.Entry<String, String> entry : mapC.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int i = Integer.parseInt(entry.getValue());
                    if (i != 0) {
                        arrayList.add(Integer.valueOf(i));
                        if (arrayList.size() >= iIntValue) {
                            m().J().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    m().J().b("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.o9
    protected final boolean u() {
        return false;
    }

    final long w(byte[] bArr) {
        com.google.android.gms.common.internal.q.k(bArr);
        g().c();
        MessageDigest messageDigestJ0 = z9.J0();
        if (messageDigestJ0 != null) {
            return z9.z(messageDigestJ0.digest(bArr));
        }
        m().G().a("Failed to get MD5");
        return 0L;
    }

    final <T extends Parcelable> T x(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } catch (b.a unused) {
            m().G().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    final d.b.a.a.e.e.y0 y(m mVar) {
        y0.a aVarD0 = d.b.a.a.e.e.y0.d0();
        aVarD0.H(mVar.e);
        Iterator<String> it = mVar.f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            a1.a aVarG0 = d.b.a.a.e.e.a1.g0();
            aVarG0.B(next);
            J(aVarG0, mVar.f.k(next));
            aVarD0.z(aVarG0);
        }
        return (d.b.a.a.e.e.y0) ((d.b.a.a.e.e.r4) aVarD0.i());
    }
}

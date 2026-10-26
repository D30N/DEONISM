package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;

/* loaded from: classes.dex */
public final class z3 extends b6 {

    /* renamed from: c, reason: collision with root package name */
    private char f1967c;

    /* renamed from: d, reason: collision with root package name */
    private long f1968d;
    private String e;
    private final b4 f;
    private final b4 g;
    private final b4 h;
    private final b4 i;
    private final b4 j;
    private final b4 k;
    private final b4 l;
    private final b4 m;
    private final b4 n;

    z3(d5 d5Var) {
        super(d5Var);
        this.f1967c = (char) 0;
        this.f1968d = -1L;
        this.f = new b4(this, 6, false, false);
        this.g = new b4(this, 6, true, false);
        this.h = new b4(this, 6, false, true);
        this.i = new b4(this, 5, false, false);
        this.j = new b4(this, 5, true, false);
        this.k = new b4(this, 5, false, true);
        this.l = new b4(this, 4, false, false);
        this.m = new b4(this, 3, false, false);
        this.n = new b4(this, 2, false, false);
    }

    private final String D() {
        String str;
        String strM;
        synchronized (this) {
            if (this.e == null) {
                if (this.a.M() != null) {
                    strM = this.a.M();
                } else {
                    n().h();
                    strM = "FA";
                }
                this.e = strM;
            }
            str = this.e;
        }
        return str;
    }

    private static String F(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
    }

    protected static Object x(String str) {
        if (str == null) {
            return null;
        }
        return new e4(str);
    }

    private static String y(boolean z, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof e4 ? ((e4) obj).a : z ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String strF = F(d5.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && F(className).equals(strF)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i++;
        }
        return sb2.toString();
    }

    static String z(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strY = y(z, obj);
        String strY2 = y(z, obj2);
        String strY3 = y(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strY)) {
            sb.append(str2);
            sb.append(strY);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strY2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strY2);
        }
        if (!TextUtils.isEmpty(strY3)) {
            sb.append(str3);
            sb.append(strY3);
        }
        return sb.toString();
    }

    protected final void A(int i, String str) {
        Log.println(i, D(), str);
    }

    protected final void B(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z && C(i)) {
            A(i, z(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        com.google.android.gms.common.internal.q.k(str);
        a5 a5VarE = this.a.E();
        if (a5VarE == null) {
            str2 = "Scheduler not set. Not logging error/warn";
        } else {
            if (a5VarE.t()) {
                if (i < 0) {
                    i = 0;
                }
                a5VarE.z(new c4(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
                return;
            }
            str2 = "Scheduler not initialized. Not logging error/warn";
        }
        A(6, str2);
    }

    protected final boolean C(int i) {
        return Log.isLoggable(D(), i);
    }

    public final b4 G() {
        return this.f;
    }

    public final b4 H() {
        return this.g;
    }

    public final b4 I() {
        return this.h;
    }

    public final b4 J() {
        return this.i;
    }

    public final b4 K() {
        return this.j;
    }

    public final b4 L() {
        return this.k;
    }

    public final b4 M() {
        return this.l;
    }

    public final b4 N() {
        return this.m;
    }

    public final b4 O() {
        return this.n;
    }

    public final String P() {
        Pair<String, Long> pairA = l().f1788d.a();
        if (pairA == null || pairA == m4.D) {
            return null;
        }
        String strValueOf = String.valueOf(pairA.second);
        String str = (String) pairA.first;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(str).length());
        sb.append(strValueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // com.google.android.gms.measurement.internal.b6
    protected final boolean s() {
        return false;
    }
}

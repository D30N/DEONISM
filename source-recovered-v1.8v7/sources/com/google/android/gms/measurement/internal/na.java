package com.google.android.gms.measurement.internal;

import d.b.a.a.e.e.l0;
import d.b.a.a.e.e.n0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes.dex */
abstract class na {
    String a;

    /* renamed from: b, reason: collision with root package name */
    int f1813b;

    /* renamed from: c, reason: collision with root package name */
    Boolean f1814c;

    /* renamed from: d, reason: collision with root package name */
    Boolean f1815d;
    Long e;
    Long f;

    na(String str, int i) {
        this.a = str;
        this.f1813b = i;
    }

    static Boolean b(double d2, d.b.a.a.e.e.l0 l0Var) {
        try {
            return h(new BigDecimal(d2), l0Var, Math.ulp(d2));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean c(long j, d.b.a.a.e.e.l0 l0Var) {
        try {
            return h(new BigDecimal(j), l0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean d(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    static Boolean e(String str, d.b.a.a.e.e.l0 l0Var) {
        if (!v9.T(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), l0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean f(String str, n0.b bVar, boolean z, String str2, List<String> list, String str3, z3 z3Var) {
        boolean zStartsWith;
        if (str == null) {
            return null;
        }
        if (bVar == n0.b.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && bVar != n0.b.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (ja.a[bVar.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (z3Var != null) {
                        z3Var.J().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                zStartsWith = str.startsWith(str2);
                break;
            case 3:
                zStartsWith = str.endsWith(str2);
                break;
            case 4:
                zStartsWith = str.contains(str2);
                break;
            case 5:
                zStartsWith = str.equals(str2);
                break;
            case 6:
                zStartsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(zStartsWith);
    }

    static Boolean g(String str, d.b.a.a.e.e.n0 n0Var, z3 z3Var) {
        List<String> list;
        com.google.android.gms.common.internal.q.k(n0Var);
        if (str == null || !n0Var.E() || n0Var.F() == n0.b.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (n0Var.F() == n0.b.IN_LIST) {
            if (n0Var.L() == 0) {
                return null;
            }
        } else if (!n0Var.G()) {
            return null;
        }
        n0.b bVarF = n0Var.F();
        boolean zJ = n0Var.J();
        String strH = (zJ || bVarF == n0.b.REGEXP || bVarF == n0.b.IN_LIST) ? n0Var.H() : n0Var.H().toUpperCase(Locale.ENGLISH);
        if (n0Var.L() == 0) {
            list = null;
        } else {
            List<String> listK = n0Var.K();
            if (!zJ) {
                ArrayList arrayList = new ArrayList(listK.size());
                Iterator<String> it = listK.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                listK = Collections.unmodifiableList(arrayList);
            }
            list = listK;
        }
        return f(str, bVarF, zJ, strH, list, bVarF == n0.b.REGEXP ? strH : null, z3Var);
    }

    private static Boolean h(BigDecimal bigDecimal, d.b.a.a.e.e.l0 l0Var, double d2) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        com.google.android.gms.common.internal.q.k(l0Var);
        if (l0Var.E() && l0Var.F() != l0.a.UNKNOWN_COMPARISON_TYPE) {
            if (l0Var.F() == l0.a.BETWEEN) {
                if (!l0Var.K() || !l0Var.M()) {
                    return null;
                }
            } else if (!l0Var.I()) {
                return null;
            }
            l0.a aVarF = l0Var.F();
            if (l0Var.F() == l0.a.BETWEEN) {
                if (v9.T(l0Var.L()) && v9.T(l0Var.N())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(l0Var.L());
                        bigDecimal4 = new BigDecimal(l0Var.N());
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            }
            if (!v9.T(l0Var.J())) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(l0Var.J());
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (NumberFormatException unused2) {
            }
            if (aVarF == l0.a.BETWEEN) {
                if (bigDecimal3 == null) {
                    return null;
                }
            } else if (bigDecimal2 != null) {
            }
            int i = ja.f1752b[aVarF.ordinal()];
            if (i == 1) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == -1);
            }
            if (i == 2) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 1);
            }
            if (i == 3) {
                if (d2 == 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                }
                if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d2).multiply(new BigDecimal(2)))) == 1 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d2).multiply(new BigDecimal(2)))) == -1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if (i == 4) {
                if (bigDecimal.compareTo(bigDecimal3) != -1 && bigDecimal.compareTo(bigDecimal4) != 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    abstract int a();

    abstract boolean i();

    abstract boolean j();
}

package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import d.b.a.a.e.e.ed;
import d.b.a.a.e.e.ta;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public final class z9 extends b6 {
    private static final String[] g = {"firebase_", "google_", "ga_"};
    private static final String[] h = {"_err"};

    /* renamed from: c, reason: collision with root package name */
    private SecureRandom f1977c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f1978d;
    private int e;
    private Integer f;

    z9(d5 d5Var) {
        super(d5Var);
        this.f = null;
        this.f1978d = new AtomicLong(0L);
    }

    static boolean A0(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    static boolean C0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static Bundle D(List<y9> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (y9 y9Var : list) {
            String str = y9Var.f;
            if (str != null) {
                bundle.putString(y9Var.f1965c, str);
            } else {
                Long l = y9Var.e;
                if (l != null) {
                    bundle.putLong(y9Var.f1965c, l.longValue());
                } else {
                    Double d2 = y9Var.h;
                    if (d2 != null) {
                        bundle.putDouble(y9Var.f1965c, d2.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    private final Object F(int i, Object obj, boolean z, boolean z2) {
        Bundle bundleB;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return H(String.valueOf(obj), i, z);
        }
        if (!d.b.a.a.e.e.b9.b() || !n().t(r.H0) || !n().t(r.G0) || !z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if ((parcelable instanceof Bundle) && (bundleB = B((Bundle) parcelable)) != null && !bundleB.isEmpty()) {
                arrayList.add(bundleB);
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static boolean F0(String str) {
        for (String str2 : h) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final int G0(String str) {
        if (!g0("event param", str)) {
            return 3;
        }
        if (l0("event param", null, str)) {
            return !f0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    public static String H(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    private final int I0(String str) {
        if (!u0("event param", str)) {
            return 3;
        }
        if (l0("event param", null, str)) {
            return !f0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    static MessageDigest J0() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    private static void K(Bundle bundle, int i, String str, String str2, Object obj) {
        if (t0(bundle, i)) {
            bundle.putString("_ev", H(str, 40, true));
            if (obj != null) {
                com.google.android.gms.common.internal.q.k(bundle);
                if (obj != null) {
                    if ((obj instanceof String) || (obj instanceof CharSequence)) {
                        bundle.putLong("_el", String.valueOf(obj).length());
                    }
                }
            }
        }
    }

    private static boolean L0(String str) {
        com.google.android.gms.common.internal.q.k(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int M0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return (n().t(r.l0) && "_lgclid".equals(str)) ? 100 : 36;
    }

    private final void X(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int iG0;
        String str4;
        int iV;
        String string;
        if (bundle == null) {
            return;
        }
        boolean zT = n().t(r.I0);
        int iA = zT ? 0 : n().A();
        int i = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                iG0 = z ? G0(str5) : 0;
                if (iG0 == 0) {
                    iG0 = I0(str5);
                }
            } else {
                iG0 = 0;
            }
            if (iG0 != 0) {
                K(bundle, iG0, str5, str5, iG0 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (c0(bundle.get(str5))) {
                    m().L().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    iV = 22;
                    str4 = str5;
                } else {
                    str4 = str5;
                    iV = v(str, str2, str5, bundle.get(str5), bundle, list, z, false);
                }
                if (iV != 0 && !"_ev".equals(str4)) {
                    K(bundle, iV, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (d0(str4) && (!zT || !k0(str4, f6.f1696d))) {
                    int i2 = i + 1;
                    if (i2 > iA) {
                        if (zT) {
                            string = "Item cannot contain custom parameters";
                        } else {
                            StringBuilder sb = new StringBuilder(63);
                            sb.append("Child bundles can't contain more than ");
                            sb.append(iA);
                            sb.append(" custom params");
                            string = sb.toString();
                        }
                        m().I().c(string, e().w(str2), e().u(bundle));
                        t0(bundle, zT ? 23 : 5);
                        bundle.remove(str4);
                    }
                    i = i2;
                }
            }
        }
    }

    static boolean Y(Context context, boolean z) {
        com.google.android.gms.common.internal.q.k(context);
        return s0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    static boolean Z(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    static boolean a0(Bundle bundle, int i) {
        int i2 = 0;
        if (bundle.size() <= i) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i2++;
            if (i2 > i) {
                bundle.remove(str);
            }
        }
        return true;
    }

    static boolean b0(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool == null) {
            return false;
        }
        return bool.equals(bool2);
    }

    static boolean c0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    static boolean d0(String str) {
        com.google.android.gms.common.internal.q.g(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    static boolean j0(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    private static boolean k0(String str, String[] strArr) {
        com.google.android.gms.common.internal.q.k(strArr);
        for (String str2 : strArr) {
            if (A0(str, str2)) {
                return true;
            }
        }
        return false;
    }

    static boolean m0(List<String> list, List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        return list.equals(list2);
    }

    static byte[] n0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static Bundle q0(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    public static ArrayList<Bundle> r0(List<oa> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (oa oaVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", oaVar.f1829b);
            bundle.putString("origin", oaVar.f1830c);
            bundle.putLong("creation_timestamp", oaVar.e);
            bundle.putString("name", oaVar.f1831d.f1965c);
            d6.b(bundle, oaVar.f1831d.h());
            bundle.putBoolean("active", oaVar.f);
            String str = oaVar.g;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            p pVar = oaVar.h;
            if (pVar != null) {
                bundle.putString("timed_out_event_name", pVar.f1832b);
                o oVar = oaVar.h.f1833c;
                if (oVar != null) {
                    bundle.putBundle("timed_out_event_params", oVar.l());
                }
            }
            bundle.putLong("trigger_timeout", oaVar.i);
            p pVar2 = oaVar.j;
            if (pVar2 != null) {
                bundle.putString("triggered_event_name", pVar2.f1832b);
                o oVar2 = oaVar.j.f1833c;
                if (oVar2 != null) {
                    bundle.putBundle("triggered_event_params", oVar2.l());
                }
            }
            bundle.putLong("triggered_timestamp", oaVar.f1831d.f1966d);
            bundle.putLong("time_to_live", oaVar.k);
            p pVar3 = oaVar.l;
            if (pVar3 != null) {
                bundle.putString("expired_event_name", pVar3.f1832b);
                o oVar3 = oaVar.l.f1833c;
                if (oVar3 != null) {
                    bundle.putBundle("expired_event_params", oVar3.l());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private static boolean s0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    private static boolean t0(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0166 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int v(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Object r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.z9.v(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    private final boolean v0(String str, String str2, int i, Object obj) {
        int size;
        if (!(obj instanceof Parcelable[])) {
            if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            }
            return true;
        }
        size = ((Parcelable[]) obj).length;
        if (size > i) {
            m().L().d("Parameter array is too long; discarded. Value kind, name, array length", str, str2, Integer.valueOf(size));
            return false;
        }
        return true;
    }

    public static long w(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    static Bundle[] w0(Object obj) {
        Object[] array;
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else {
            if (!(obj instanceof ArrayList)) {
                return null;
            }
            ArrayList arrayList = (ArrayList) obj;
            array = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) array;
    }

    public static long y(o oVar) {
        long length = 0;
        if (oVar == null) {
            return 0L;
        }
        Iterator<String> it = oVar.iterator();
        while (it.hasNext()) {
            if (oVar.k(it.next()) instanceof Parcelable[]) {
                length += ((Parcelable[]) r3).length;
            }
        }
        return length;
    }

    static long z(byte[] bArr) {
        com.google.android.gms.common.internal.q.k(bArr);
        int i = 0;
        com.google.android.gms.common.internal.q.n(bArr.length > 0);
        long j = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j += (bArr[length] & 255) << i;
            i += 8;
        }
        return j;
    }

    private final boolean z0(Context context, String str) {
        b4 b4VarG;
        String str2;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoE = d.b.a.a.c.n.c.a(context).e(str, 64);
            if (packageInfoE == null || packageInfoE.signatures == null || packageInfoE.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfoE.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            b4VarG = m().G();
            str2 = "Package name not found";
            b4VarG.b(str2, e);
            return true;
        } catch (CertificateException e2) {
            e = e2;
            b4VarG = m().G();
            str2 = "Error obtaining certificate";
            b4VarG.b(str2, e);
            return true;
        }
    }

    final Bundle A(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("term", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("content", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("aclid", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("cp1", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("anid", queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            m().J().b("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    final Bundle B(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objG = G(str, bundle.get(str));
                if (objG == null) {
                    m().L().b("Param value can't be null", e().z(str));
                } else {
                    N(bundle2, str, objG);
                }
            }
        }
        return bundle2;
    }

    final boolean B0(String str) {
        c();
        if (d.b.a.a.c.n.c.a(f()).a(str) == 0) {
            return true;
        }
        m().N().b("Permission not granted", str);
        return false;
    }

    final Bundle C(String str, String str2, Bundle bundle, List<String> list, boolean z, boolean z2) {
        int iG0;
        int i;
        Bundle bundle2;
        z9 z9Var = this;
        List<String> list2 = list;
        boolean z3 = d.b.a.a.e.e.b9.b() && n().t(r.I0);
        boolean zK0 = z3 ? k0(str2, c6.f1652c) : z2;
        if (bundle == null) {
            return null;
        }
        Bundle bundle3 = new Bundle(bundle);
        int iA = n().A();
        int i2 = 0;
        for (String str3 : n().C(str, r.b0) ? new TreeSet<>(bundle.keySet()) : bundle.keySet()) {
            if (list2 == null || !list2.contains(str3)) {
                iG0 = z ? z9Var.G0(str3) : 0;
                if (iG0 == 0) {
                    iG0 = z9Var.I0(str3);
                }
            } else {
                iG0 = 0;
            }
            if (iG0 != 0) {
                K(bundle3, iG0, str3, str3, iG0 == 3 ? str3 : null);
                bundle3.remove(str3);
                i = iA;
                bundle2 = bundle3;
            } else {
                i = iA;
                bundle2 = bundle3;
                int iV = v(str, str2, str3, bundle.get(str3), bundle3, list, z, zK0);
                if (z3 && iV == 17) {
                    K(bundle2, iV, str3, str3, Boolean.FALSE);
                } else if (iV != 0 && !"_ev".equals(str3)) {
                    K(bundle2, iV, iV == 21 ? str2 : str3, str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (d0(str3)) {
                    int i3 = i2 + 1;
                    if (i3 > i) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Event can't contain more than ");
                        sb.append(i);
                        sb.append(" params");
                        m().I().c(sb.toString(), e().w(str2), e().u(bundle));
                        t0(bundle2, 5);
                        bundle2.remove(str3);
                        i2 = i3;
                    } else {
                        i2 = i3;
                    }
                }
                iA = i;
                bundle3 = bundle2;
                z9Var = this;
                list2 = list;
            }
            iA = i;
            bundle3 = bundle2;
            z9Var = this;
            list2 = list;
        }
        return bundle3;
    }

    final boolean D0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strP = n().P();
        h();
        return strP.equals(str);
    }

    final p E(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (o0(str2) != 0) {
            m().G().b("Invalid conditional property event name", e().A(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        return new p(str2, new o(B(C(str, str2, bundle2, com.google.android.gms.common.util.f.b("_o"), false, false))), str3, j);
    }

    public final long E0() {
        long j = this.f1978d.get();
        synchronized (this.f1978d) {
            if (j != 0) {
                this.f1978d.compareAndSet(-1L, 1L);
                return this.f1978d.getAndIncrement();
            }
            long jNextLong = new Random(System.nanoTime() ^ k().a()).nextLong();
            int i = this.e + 1;
            this.e = i;
            return jNextLong + i;
        }
    }

    final Object G(String str, Object obj) {
        if ("_ev".equals(str)) {
            return F(256, obj, true, true);
        }
        return F(C0(str) ? 256 : 100, obj, false, true);
    }

    final SecureRandom H0() {
        c();
        if (this.f1977c == null) {
            this.f1977c = new SecureRandom();
        }
        return this.f1977c;
    }

    public final URL I(long j, String str, String str2, long j2) {
        try {
            com.google.android.gms.common.internal.q.g(str2);
            com.google.android.gms.common.internal.q.g(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j), Integer.valueOf(K0())), str2, str, Long.valueOf(j2));
            if (str.equals(n().Q())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException | MalformedURLException e) {
            m().G().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final void J(int i, String str, String str2, int i2) {
        W(null, i, str, str2, i2);
    }

    public final int K0() {
        if (this.f == null) {
            this.f = Integer.valueOf(d.b.a.a.c.f.f().a(f()) / AdError.NETWORK_ERROR_CODE);
        }
        return this.f.intValue();
    }

    final void L(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            m().J().b("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    final void M(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                g().N(bundle, str, bundle2.get(str));
            }
        }
    }

    final void N(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (d.b.a.a.e.e.b9.b() && n().t(r.H0) && n().t(r.G0) && (obj instanceof Bundle[])) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            m().L().c("Not putting event parameter. Invalid value type. name, type", e().z(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    final String N0() {
        byte[] bArr = new byte[16];
        H0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void O(ed edVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            edVar.f(bundle);
        } catch (RemoteException e) {
            this.a.m().J().b("Error returning int value to wrapper", e);
        }
    }

    public final boolean O0() throws ClassNotFoundException {
        try {
            f().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void P(ed edVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            edVar.f(bundle);
        } catch (RemoteException e) {
            this.a.m().J().b("Error returning long value to wrapper", e);
        }
    }

    public final void Q(ed edVar, Bundle bundle) {
        try {
            edVar.f(bundle);
        } catch (RemoteException e) {
            this.a.m().J().b("Error returning bundle value to wrapper", e);
        }
    }

    public final void R(ed edVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            edVar.f(bundle);
        } catch (RemoteException e) {
            this.a.m().J().b("Error returning string value to wrapper", e);
        }
    }

    public final void S(ed edVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            edVar.f(bundle);
        } catch (RemoteException e) {
            this.a.m().J().b("Error returning bundle list to wrapper", e);
        }
    }

    public final void T(ed edVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            edVar.f(bundle);
        } catch (RemoteException e) {
            this.a.m().J().b("Error returning boolean value to wrapper", e);
        }
    }

    public final void U(ed edVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            edVar.f(bundle);
        } catch (RemoteException e) {
            this.a.m().J().b("Error returning byte array to wrapper", e);
        }
    }

    final void V(d4 d4Var, int i) {
        int i2 = 0;
        for (String str : new TreeSet(d4Var.f1663d.keySet())) {
            if (d0(str) && (i2 = i2 + 1) > i) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i);
                sb.append(" params");
                m().I().c(sb.toString(), e().w(d4Var.a), e().u(d4Var.f1663d));
                t0(d4Var.f1663d, 5);
                d4Var.f1663d.remove(str);
            }
        }
    }

    final void W(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        t0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        this.a.h();
        this.a.F().R("auto", "_err", bundle);
    }

    @SuppressLint({"ApplySharedPref"})
    final boolean e0(String str, double d2) {
        try {
            SharedPreferences.Editor editorEdit = f().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(d2));
            return editorEdit.commit();
        } catch (Exception e) {
            m().G().b("Failed to persist Deferred Deep Link. exception", e);
            return false;
        }
    }

    final boolean f0(String str, int i, String str2) {
        if (str2 == null) {
            m().I().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        m().I().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    final boolean g0(String str, String str2) {
        if (str2 == null) {
            m().I().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            m().I().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            m().I().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                m().I().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final boolean h0(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i) {
                m().L().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    final boolean i0(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (L0(str)) {
                return true;
            }
            if (this.a.J()) {
                m().I().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", z3.x(str));
            }
            return false;
        }
        if (ta.b() && n().t(r.o0) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.a.J()) {
                m().I().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (L0(str2)) {
            return true;
        }
        m().I().b("Invalid admob_app_id. Analytics disabled.", z3.x(str2));
        return false;
    }

    final boolean l0(String str, String[] strArr, String str2) {
        boolean z;
        if (str2 == null) {
            m().I().b("Name is required and can't be null. Type", str);
            return false;
        }
        com.google.android.gms.common.internal.q.k(str2);
        String[] strArr2 = g;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            m().I().c("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr == null || !k0(str2, strArr)) {
            return true;
        }
        m().I().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.b6
    protected final void o() {
        c();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                m().J().a("Utils falling back to Random for random id");
            }
        }
        this.f1978d.set(jNextLong);
    }

    final int o0(String str) {
        if (!u0("event", str)) {
            return 2;
        }
        if (l0("event", c6.a, str)) {
            return !f0("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    final int p0(String str, Object obj) {
        int iM0;
        String str2;
        if ("_ldl".equals(str)) {
            iM0 = M0(str);
            str2 = "user property referrer";
        } else {
            iM0 = M0(str);
            str2 = "user property";
        }
        return h0(str2, str, iM0, obj) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.b6
    protected final boolean s() {
        return true;
    }

    public final int u(int i) {
        return d.b.a.a.c.f.f().h(f(), 12451000);
    }

    final boolean u0(String str, String str2) {
        if (str2 == null) {
            m().I().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            m().I().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            m().I().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                m().I().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0069 -> B:17:0x0076). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final long x(android.content.Context r7, java.lang.String r8) {
        /*
            r6 = this;
            r6.c()
            com.google.android.gms.common.internal.q.k(r7)
            com.google.android.gms.common.internal.q.g(r8)
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            java.security.MessageDigest r1 = J0()
            r2 = -1
            r4 = 0
            if (r1 != 0) goto L25
            com.google.android.gms.measurement.internal.z3 r7 = r6.m()
            com.google.android.gms.measurement.internal.b4 r7 = r7.G()
            java.lang.String r8 = "Could not get MD5 instance"
            r7.a(r8)
            goto L77
        L25:
            if (r0 == 0) goto L76
            boolean r8 = r6.z0(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            if (r8 != 0) goto L76
            d.b.a.a.c.n.b r7 = d.b.a.a.c.n.c.a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            android.content.Context r8 = r6.f()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            java.lang.String r8 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            r0 = 64
            android.content.pm.PackageInfo r7 = r7.e(r8, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            android.content.pm.Signature[] r8 = r7.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            if (r8 == 0) goto L5a
            android.content.pm.Signature[] r8 = r7.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            int r8 = r8.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            if (r8 <= 0) goto L5a
            android.content.pm.Signature[] r7 = r7.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            r8 = 0
            r7 = r7[r8]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            byte[] r7 = r1.digest(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            long r2 = z(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            goto L77
        L5a:
            com.google.android.gms.measurement.internal.z3 r7 = r6.m()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            com.google.android.gms.measurement.internal.b4 r7 = r7.J()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            java.lang.String r8 = "Could not get signatures"
            r7.a(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            goto L77
        L68:
            r7 = move-exception
            com.google.android.gms.measurement.internal.z3 r8 = r6.m()
            com.google.android.gms.measurement.internal.b4 r8 = r8.G()
            java.lang.String r0 = "Package name not found"
            r8.b(r0, r7)
        L76:
            r2 = r4
        L77:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.z9.x(android.content.Context, java.lang.String):long");
    }

    final int x0(String str) {
        if (!u0("user property", str)) {
            return 6;
        }
        if (l0("user property", e6.a, str)) {
            return !f0("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    final Object y0(String str, Object obj) {
        boolean zEquals = "_ldl".equals(str);
        int iM0 = M0(str);
        return zEquals ? F(iM0, obj, true, false) : F(iM0, obj, false, false);
    }
}

package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class p {
    private static final Method a;

    /* renamed from: b, reason: collision with root package name */
    private static final Method f1590b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f1591c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f1592d;

    static {
        Process.myUid();
        a = l();
        f1590b = m();
        f1591c = n();
        h();
        f1592d = i();
        j();
        k();
    }

    public static WorkSource a(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfoC = d.b.a.a.c.n.c.a(context).c(str, 0);
                if (applicationInfoC != null) {
                    return e(applicationInfoC.uid, str);
                }
                String strValueOf = String.valueOf(str);
                Log.e("WorkSourceUtil", strValueOf.length() != 0 ? "Could not get applicationInfo from package: ".concat(strValueOf) : new String("Could not get applicationInfo from package: "));
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                String strValueOf2 = String.valueOf(str);
                Log.e("WorkSourceUtil", strValueOf2.length() != 0 ? "Could not find package: ".concat(strValueOf2) : new String("Could not find package: "));
            }
        }
        return null;
    }

    public static List<String> b(WorkSource workSource) {
        int iD = workSource == null ? 0 : d(workSource);
        if (iD == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iD; i++) {
            String strF = f(workSource, i);
            if (!n.a(strF)) {
                arrayList.add(strF);
            }
        }
        return arrayList;
    }

    public static boolean c(Context context) {
        return (context == null || context.getPackageManager() == null || d.b.a.a.c.n.c.a(context).b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    private static int d(WorkSource workSource) {
        Method method = f1591c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(workSource, new Object[0])).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    private static WorkSource e(int i, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        WorkSource workSource = new WorkSource();
        g(workSource, i, str);
        return workSource;
    }

    private static String f(WorkSource workSource, int i) {
        Method method = f1592d;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, Integer.valueOf(i));
        } catch (Exception e) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            return null;
        }
    }

    private static void g(WorkSource workSource, int i, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (f1590b != null) {
            if (str == null) {
                str = "";
            }
            try {
                f1590b.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    private static Method h() {
        try {
            return WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method i() {
        if (l.d()) {
            try {
                return WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static final Method j() {
        if (l.j()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static final Method k() {
        if (l.j()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e);
            }
        }
        return null;
    }

    private static Method l() {
        try {
            return WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method m() {
        if (l.d()) {
            try {
                return WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static Method n() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

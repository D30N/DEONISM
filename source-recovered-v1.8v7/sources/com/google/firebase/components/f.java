package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f<T> {
    private final T a;

    /* renamed from: b, reason: collision with root package name */
    private final c<T> f2182b;

    private static class b implements c<Context> {
        private final Class<? extends Service> a;

        private b(Class<? extends Service> cls) {
            this.a = cls;
        }

        private Bundle b(Context context) throws PackageManager.NameNotFoundException {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // com.google.firebase.components.f.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> a(Context context) throws PackageManager.NameNotFoundException {
            Bundle bundleB = b(context);
            if (bundleB == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleB.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleB.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    interface c<T> {
        List<String> a(T t);
    }

    f(T t, c<T> cVar) {
        this.a = t;
        this.f2182b = cVar;
    }

    public static f<Context> b(Context context, Class<? extends Service> cls) {
        return new f<>(context, new b(cls));
    }

    private static List<h> c(List<String> list) throws ClassNotFoundException {
        String str;
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            try {
                Class<?> cls = Class.forName(str2);
                if (h.class.isAssignableFrom(cls)) {
                    arrayList.add((h) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } else {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an instance of %s", str2, "com.google.firebase.components.ComponentRegistrar"));
                }
            } catch (ClassNotFoundException e) {
                e = e;
                str = String.format("Class %s is not an found.", str2);
                Log.w("ComponentDiscovery", str, e);
            } catch (IllegalAccessException e2) {
                e = e2;
                str = String.format("Could not instantiate %s.", str2);
                Log.w("ComponentDiscovery", str, e);
            } catch (InstantiationException e3) {
                e = e3;
                str = String.format("Could not instantiate %s.", str2);
                Log.w("ComponentDiscovery", str, e);
            } catch (NoSuchMethodException e4) {
                e = e4;
                str = String.format("Could not instantiate %s", str2);
                Log.w("ComponentDiscovery", str, e);
            } catch (InvocationTargetException e5) {
                e = e5;
                str = String.format("Could not instantiate %s", str2);
                Log.w("ComponentDiscovery", str, e);
            }
        }
        return arrayList;
    }

    public List<h> a() {
        return c(this.f2182b.a(this.a));
    }
}

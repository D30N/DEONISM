package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public class SoLoader {
    static final boolean a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    static k f1436b;

    @GuardedBy("sSoSourcesLock")
    @Nullable
    private static n[] f;

    @GuardedBy("sSoSourcesLock")
    @Nullable
    private static com.facebook.soloader.b g;

    @GuardedBy("sSoSourcesLock")
    private static int l;
    private static boolean m;

    /* renamed from: c, reason: collision with root package name */
    private static final ReentrantReadWriteLock f1437c = new ReentrantReadWriteLock();

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("sSoSourcesLock")
    @Nullable
    private static l[] f1438d = null;
    private static int e = 0;

    @GuardedBy("SoLoader.class")
    private static final HashSet<String> h = new HashSet<>();

    @GuardedBy("SoLoader.class")
    private static final Map<String, Object> i = new HashMap();
    private static final Set<String> j = Collections.newSetFromMap(new ConcurrentHashMap());

    @Nullable
    private static m k = null;

    @d
    @TargetApi(14)
    private static class Api14Utils {
        private Api14Utils() {
        }

        public static String a() throws NoSuchMethodException, SecurityException {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e);
                }
            }
            throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
        }
    }

    static class a implements k {
        final /* synthetic */ boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f1439b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f1440c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Runtime f1441d;
        final /* synthetic */ Method e;

        a(boolean z, String str, String str2, Runtime runtime, Method method) {
            this.a = z;
            this.f1439b = str;
            this.f1440c = str2;
            this.f1441d = runtime;
            this.e = method;
        }

        private String b(String str) throws NoSuchAlgorithmException, IOException {
            try {
                File file = new File(str);
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i <= 0) {
                            return String.format("%32x", new BigInteger(1, messageDigest.digest()));
                        }
                        messageDigest.update(bArr, 0, i);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (IOException e) {
                return e.toString();
            } catch (SecurityException e2) {
                return e2.toString();
            } catch (NoSuchAlgorithmException e3) {
                return e3.toString();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        
            if (r1 == null) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        
            android.util.Log.e("SoLoader", "Error when loading lib: " + r1 + " lib hash: " + b(r9) + " search path is " + r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
        
            return;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:45:0x009e  */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v2 */
        @Override // com.facebook.soloader.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(java.lang.String r9, int r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.a.a(java.lang.String, int):void");
        }
    }

    public static final class b extends UnsatisfiedLinkError {
        b(Throwable th) {
            super("APK was built for a different platform");
            initCause(th);
        }
    }

    static {
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                z = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        a = z;
    }

    private static void a() {
        f1437c.readLock().lock();
        try {
            if (f1438d != null) {
            } else {
                throw new RuntimeException("SoLoader.init() not yet called");
            }
        } finally {
            f1437c.readLock().unlock();
        }
    }

    private static boolean b(Context context) {
        return (context == null || (context.getApplicationInfo().flags & 129) == 0) ? false : true;
    }

    private static void c(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        UnsatisfiedLinkError unsatisfiedLinkError;
        boolean z2;
        f1437c.readLock().lock();
        try {
            if (f1438d == null) {
                Log.e("SoLoader", "Could not load: " + str + " because no SO source exists");
                throw new UnsatisfiedLinkError("couldn't find DSO to load: " + str);
            }
            f1437c.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z = true;
            } else {
                z = false;
            }
            if (a) {
                Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");
            }
            int iA = 0;
            do {
                try {
                    f1437c.readLock().lock();
                    int i3 = e;
                    int i4 = 0;
                    while (true) {
                        if (iA != 0) {
                            break;
                        }
                        try {
                            if (i4 < f1438d.length) {
                                iA = f1438d[i4].a(str, i2, threadPolicy);
                                if (iA == 3 && f != null) {
                                    Log.d("SoLoader", "Trying backup SoSource for " + str);
                                    n[] nVarArr = f;
                                    int length = nVarArr.length;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= length) {
                                            break;
                                        }
                                        n nVar = nVarArr[i5];
                                        nVar.m(str);
                                        int iA2 = nVar.a(str, i2, threadPolicy);
                                        if (iA2 == 1) {
                                            iA = iA2;
                                            break;
                                        }
                                        i5++;
                                    }
                                } else {
                                    i4++;
                                }
                            } else {
                                break;
                            }
                        } finally {
                        }
                    }
                    f1437c.readLock().unlock();
                    if ((i2 & 2) == 2 && iA == 0) {
                        f1437c.writeLock().lock();
                        try {
                            if (g != null && g.c()) {
                                e++;
                            }
                            z2 = e != i3;
                            f1437c.writeLock().unlock();
                        } catch (Throwable th) {
                            f1437c.writeLock().unlock();
                            throw th;
                        }
                    } else {
                        z2 = false;
                    }
                } finally {
                    if (iA == 0 || iA == i) {
                    }
                }
            } while (z2);
            if (a) {
                Api18TraceUtils.b();
            }
            if (z) {
                StrictMode.setThreadPolicy(threadPolicy);
            }
            if (iA == 0 || iA == 3) {
                String str2 = "couldn't find DSO to load: " + str;
                Log.e("SoLoader", str2);
                throw new UnsatisfiedLinkError(str2);
            }
        } finally {
        }
    }

    @Nullable
    private static Method d() throws NoSuchMethodException, SecurityException {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23 && i2 <= 27) {
            try {
                Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException | SecurityException e2) {
                Log.w("SoLoader", "Cannot get nativeLoad method", e2);
            }
        }
        return null;
    }

    private static void e(Context context, int i2, @Nullable k kVar) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            m = b(context);
            f(kVar);
            g(context, i2, kVar);
            if (!com.facebook.soloader.o.a.b()) {
                com.facebook.soloader.o.a.a(new j());
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        }
    }

    private static synchronized void f(@Nullable k kVar) {
        if (kVar != null) {
            f1436b = kVar;
            return;
        }
        Runtime runtime = Runtime.getRuntime();
        Method methodD = d();
        boolean z = methodD != null;
        String strA = z ? Api14Utils.a() : null;
        f1436b = new a(z, strA, l(strA), runtime, methodD);
    }

    private static void g(Context context, int i2, @Nullable k kVar) {
        int i3;
        f1437c.writeLock().lock();
        try {
            if (f1438d == null) {
                Log.d("SoLoader", "init start");
                l = i2;
                ArrayList arrayList = new ArrayList();
                String str = System.getenv("LD_LIBRARY_PATH");
                if (str == null) {
                    str = "/vendor/lib:/system/lib";
                }
                String[] strArrSplit = str.split(":");
                for (int i4 = 0; i4 < strArrSplit.length; i4++) {
                    Log.d("SoLoader", "adding system library source: " + strArrSplit[i4]);
                    arrayList.add(new c(new File(strArrSplit[i4]), 2));
                }
                if (context != null) {
                    if ((i2 & 1) != 0) {
                        f = null;
                        Log.d("SoLoader", "adding exo package source: lib-main");
                        arrayList.add(0, new e(context, "lib-main"));
                    } else {
                        if (m) {
                            i3 = 0;
                        } else {
                            g = new com.facebook.soloader.b(context, Build.VERSION.SDK_INT <= 17 ? 1 : 0);
                            Log.d("SoLoader", "adding application source: " + g.toString());
                            arrayList.add(0, g);
                            i3 = 1;
                        }
                        if ((l & 8) != 0) {
                            f = null;
                        } else {
                            File file = new File(context.getApplicationInfo().sourceDir);
                            ArrayList arrayList2 = new ArrayList();
                            com.facebook.soloader.a aVar = new com.facebook.soloader.a(context, file, "lib-main", i3);
                            arrayList2.add(aVar);
                            Log.d("SoLoader", "adding backup source from : " + aVar.toString());
                            if (Build.VERSION.SDK_INT >= 21 && context.getApplicationInfo().splitSourceDirs != null) {
                                Log.d("SoLoader", "adding backup sources from split apks");
                                String[] strArr = context.getApplicationInfo().splitSourceDirs;
                                int length = strArr.length;
                                int i5 = 0;
                                int i6 = 0;
                                while (i5 < length) {
                                    File file2 = new File(strArr[i5]);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("lib-");
                                    sb.append(i6);
                                    com.facebook.soloader.a aVar2 = new com.facebook.soloader.a(context, file2, sb.toString(), i3);
                                    Log.d("SoLoader", "adding backup source: " + aVar2.toString());
                                    arrayList2.add(aVar2);
                                    i5++;
                                    i6++;
                                }
                            }
                            f = (n[]) arrayList2.toArray(new n[arrayList2.size()]);
                            arrayList.addAll(0, arrayList2);
                        }
                    }
                }
                l[] lVarArr = (l[]) arrayList.toArray(new l[arrayList.size()]);
                int iM = m();
                int length2 = lVarArr.length;
                while (true) {
                    int i7 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    Log.d("SoLoader", "Preparing SO source: " + lVarArr[i7]);
                    lVarArr[i7].b(iM);
                    length2 = i7;
                }
                f1438d = lVarArr;
                e++;
                Log.d("SoLoader", "init finish: " + f1438d.length + " SO sources prepared");
            }
        } finally {
            Log.d("SoLoader", "init exiting");
            f1437c.writeLock().unlock();
        }
    }

    public static boolean h(String str) {
        return i(str, 0);
    }

    public static boolean i(String str, int i2) {
        m mVar;
        boolean z;
        f1437c.readLock().lock();
        try {
            if (f1438d == null) {
                if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    synchronized (SoLoader.class) {
                        z = !h.contains(str);
                        if (z) {
                            if (k != null) {
                                k.a(str);
                            } else {
                                System.loadLibrary(str);
                            }
                        }
                    }
                    return z;
                }
                a();
            }
            f1437c.readLock().unlock();
            if (!m || (mVar = k) == null) {
                String strB = h.b(str);
                return k(System.mapLibraryName(strB != null ? strB : str), str, strB, i2 | 2, null);
            }
            mVar.a(str);
            return true;
        } finally {
            f1437c.readLock().unlock();
        }
    }

    public static void init(Context context, int i2) {
        e(context, i2, null);
    }

    static void j(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        k(str, null, null, i2, threadPolicy);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac A[Catch: all -> 0x00fe, PHI: r1
      0x00ac: PHI (r1v7 boolean) = (r1v4 boolean), (r1v5 boolean), (r1v5 boolean) binds: [B:21:0x003e, B:31:0x0050, B:36:0x0088] A[DONT_GENERATE, DONT_INLINE], TryCatch #6 {, blocks: (B:22:0x0040, B:27:0x004c, B:32:0x0052, B:33:0x006b, B:39:0x008b, B:41:0x008d, B:43:0x0093, B:45:0x009b, B:46:0x00a0, B:47:0x00a1, B:49:0x00a3, B:50:0x00a8, B:53:0x00ab, B:54:0x00ac, B:56:0x00b0, B:58:0x00b6, B:63:0x00c3, B:65:0x00c7, B:70:0x00f2, B:72:0x00f6, B:73:0x00f9, B:74:0x00fa, B:75:0x00fb, B:66:0x00ce, B:34:0x006c, B:35:0x0087, B:23:0x0041, B:26:0x004b, B:30:0x004f), top: B:89:0x0040, inners: #0, #2, #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0 A[Catch: all -> 0x00fe, TryCatch #6 {, blocks: (B:22:0x0040, B:27:0x004c, B:32:0x0052, B:33:0x006b, B:39:0x008b, B:41:0x008d, B:43:0x0093, B:45:0x009b, B:46:0x00a0, B:47:0x00a1, B:49:0x00a3, B:50:0x00a8, B:53:0x00ab, B:54:0x00ac, B:56:0x00b0, B:58:0x00b6, B:63:0x00c3, B:65:0x00c7, B:70:0x00f2, B:72:0x00f6, B:73:0x00f9, B:74:0x00fa, B:75:0x00fb, B:66:0x00ce, B:34:0x006c, B:35:0x0087, B:23:0x0041, B:26:0x004b, B:30:0x004f), top: B:89:0x0040, inners: #0, #2, #4, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean k(java.lang.String r8, @javax.annotation.Nullable java.lang.String r9, @javax.annotation.Nullable java.lang.String r10, int r11, @javax.annotation.Nullable android.os.StrictMode.ThreadPolicy r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.k(java.lang.String, java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }

    @Nullable
    public static String l(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(":");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (!str2.contains("!")) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(":", arrayList);
    }

    private static int m() {
        f1437c.writeLock().lock();
        try {
            return (l & 2) != 0 ? 1 : 0;
        } finally {
            f1437c.writeLock().unlock();
        }
    }
}

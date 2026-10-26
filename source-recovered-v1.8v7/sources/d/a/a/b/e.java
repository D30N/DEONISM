package d.a.a.b;

import android.content.Context;
import d.a.a.a.a;
import d.a.a.a.c;
import d.a.a.b.d;
import d.a.b.i.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public class e implements i, d.a.b.a.a {
    private static final Class<?> q = e.class;
    private static final long r = TimeUnit.HOURS.toMillis(2);
    private static final long s = TimeUnit.MINUTES.toMillis(30);
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final long f2347b;

    /* renamed from: c, reason: collision with root package name */
    private final CountDownLatch f2348c;

    /* renamed from: d, reason: collision with root package name */
    private long f2349d;
    private final d.a.a.a.c e;

    @GuardedBy("mLock")
    final Set<String> f;
    private long g;
    private final d.a.b.i.a h;
    private final d i;
    private final h j;
    private final d.a.a.a.a k;
    private final boolean l;
    private final b m;
    private final com.facebook.common.time.a n;
    private final Object o = new Object();
    private boolean p;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (e.this.o) {
                e.this.l();
            }
            e.this.p = true;
            e.this.f2348c.countDown();
        }
    }

    static class b {
        private boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        private long f2351b = -1;

        /* renamed from: c, reason: collision with root package name */
        private long f2352c = -1;

        b() {
        }

        public synchronized long a() {
            return this.f2352c;
        }

        public synchronized long b() {
            return this.f2351b;
        }

        public synchronized void c(long j, long j2) {
            if (this.a) {
                this.f2351b += j;
                this.f2352c += j2;
            }
        }

        public synchronized boolean d() {
            return this.a;
        }

        public synchronized void e() {
            this.a = false;
            this.f2352c = -1L;
            this.f2351b = -1L;
        }

        public synchronized void f(long j, long j2) {
            this.f2352c = j2;
            this.f2351b = j;
            this.a = true;
        }
    }

    public static class c {
        public final long a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2353b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2354c;

        public c(long j, long j2, long j3) {
            this.a = j;
            this.f2353b = j2;
            this.f2354c = j3;
        }
    }

    public e(d dVar, h hVar, c cVar, d.a.a.a.c cVar2, d.a.a.a.a aVar, @Nullable d.a.b.a.b bVar, Context context, Executor executor, boolean z) {
        this.a = cVar.f2353b;
        long j = cVar.f2354c;
        this.f2347b = j;
        this.f2349d = j;
        this.h = d.a.b.i.a.d();
        this.i = dVar;
        this.j = hVar;
        this.g = -1L;
        this.e = cVar2;
        long j2 = cVar.a;
        this.k = aVar;
        this.m = new b();
        this.n = com.facebook.common.time.c.a();
        this.l = z;
        this.f = new HashSet();
        if (bVar != null) {
            bVar.a(this);
        }
        if (!this.l) {
            this.f2348c = new CountDownLatch(0);
        } else {
            this.f2348c = new CountDownLatch(1);
            executor.execute(new a());
        }
    }

    private com.facebook.binaryresource.a h(d.b bVar, d.a.a.a.d dVar, String str) {
        com.facebook.binaryresource.a aVarC;
        synchronized (this.o) {
            aVarC = bVar.c(dVar);
            this.f.add(str);
            this.m.c(aVarC.size(), 1L);
        }
        return aVarC;
    }

    @GuardedBy("mLock")
    private void i(long j, c.a aVar) throws IOException {
        try {
            Collection<d.a> collectionJ = j(this.i.a());
            long jB = this.m.b();
            long j2 = jB - j;
            int i = 0;
            long j3 = 0;
            for (d.a aVar2 : collectionJ) {
                if (j3 > j2) {
                    break;
                }
                long jF = this.i.f(aVar2);
                this.f.remove(aVar2.getId());
                if (jF > 0) {
                    i++;
                    j3 += jF;
                    j jVarA = j.a();
                    jVarA.j(aVar2.getId());
                    jVarA.g(aVar);
                    jVarA.i(jF);
                    jVarA.f(jB - j3);
                    jVarA.e(j);
                    this.e.f(jVarA);
                    jVarA.b();
                }
            }
            this.m.c(-j3, -i);
            this.i.e();
        } catch (IOException e) {
            this.k.a(a.EnumC0081a.EVICTION, q, "evictAboveSize: " + e.getMessage(), e);
            throw e;
        }
    }

    private Collection<d.a> j(Collection<d.a> collection) {
        long jNow = this.n.now() + r;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (d.a aVar : collection) {
            if (aVar.b() > jNow) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.j.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private void k() {
        synchronized (this.o) {
            boolean zL = l();
            o();
            long jB = this.m.b();
            if (jB > this.f2349d && !zL) {
                this.m.e();
                l();
            }
            if (jB > this.f2349d) {
                i((this.f2349d * 9) / 10, c.a.CACHE_FULL);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public boolean l() {
        long jNow = this.n.now();
        if (this.m.d()) {
            long j = this.g;
            if (j != -1 && jNow - j <= s) {
                return false;
            }
        }
        return m();
    }

    @GuardedBy("mLock")
    private boolean m() {
        long j;
        long jNow = this.n.now();
        long j2 = r + jNow;
        Set<String> hashSet = (this.l && this.f.isEmpty()) ? this.f : this.l ? new HashSet<>() : null;
        try {
            long jA = 0;
            long jMax = -1;
            int iA = 0;
            boolean z = false;
            int i = 0;
            int i2 = 0;
            for (d.a aVar : this.i.a()) {
                i++;
                jA += aVar.a();
                if (aVar.b() > j2) {
                    i2++;
                    iA = (int) (iA + aVar.a());
                    j = j2;
                    jMax = Math.max(aVar.b() - jNow, jMax);
                    z = true;
                } else {
                    j = j2;
                    if (this.l) {
                        hashSet.add(aVar.getId());
                    }
                }
                j2 = j;
            }
            if (z) {
                this.k.a(a.EnumC0081a.READ_INVALID_ENTRY, q, "Future timestamp found in " + i2 + " files , with a total size of " + iA + " bytes, and a maximum time delta of " + jMax + "ms", null);
            }
            long j3 = i;
            if (this.m.a() != j3 || this.m.b() != jA) {
                if (this.l && this.f != hashSet) {
                    this.f.clear();
                    this.f.addAll(hashSet);
                }
                this.m.f(jA, j3);
            }
            this.g = jNow;
            return true;
        } catch (IOException e) {
            this.k.a(a.EnumC0081a.GENERIC_IO, q, "calcFileCacheSize: " + e.getMessage(), e);
            return false;
        }
    }

    private d.b n(String str, d.a.a.a.d dVar) {
        k();
        return this.i.b(str, dVar);
    }

    @GuardedBy("mLock")
    private void o() {
        this.f2349d = this.h.f(this.i.c() ? a.EnumC0086a.EXTERNAL : a.EnumC0086a.INTERNAL, this.f2347b - this.m.b()) ? this.a : this.f2347b;
    }

    @Override // d.a.a.b.i
    @Nullable
    public com.facebook.binaryresource.a a(d.a.a.a.d dVar) {
        com.facebook.binaryresource.a aVarG;
        j jVarA = j.a();
        jVarA.d(dVar);
        try {
            synchronized (this.o) {
                List<String> listB = d.a.a.a.e.b(dVar);
                String str = null;
                aVarG = null;
                for (int i = 0; i < listB.size(); i++) {
                    str = listB.get(i);
                    jVarA.j(str);
                    aVarG = this.i.g(str, dVar);
                    if (aVarG != null) {
                        break;
                    }
                }
                if (aVarG == null) {
                    this.e.a(jVarA);
                    this.f.remove(str);
                } else {
                    this.e.c(jVarA);
                    this.f.add(str);
                }
            }
            return aVarG;
        } catch (IOException e) {
            this.k.a(a.EnumC0081a.GENERIC_IO, q, "getResource", e);
            jVarA.h(e);
            this.e.g(jVarA);
            return null;
        } finally {
            jVarA.b();
        }
    }

    @Override // d.a.a.b.i
    public void b(d.a.a.a.d dVar) {
        synchronized (this.o) {
            try {
                List<String> listB = d.a.a.a.e.b(dVar);
                for (int i = 0; i < listB.size(); i++) {
                    String str = listB.get(i);
                    this.i.d(str);
                    this.f.remove(str);
                }
            } catch (IOException e) {
                this.k.a(a.EnumC0081a.DELETE_FILE, q, "delete: " + e.getMessage(), e);
            }
        }
    }

    @Override // d.a.a.b.i
    public com.facebook.binaryresource.a c(d.a.a.a.d dVar, d.a.a.a.j jVar) {
        String strA;
        j jVarA = j.a();
        jVarA.d(dVar);
        this.e.d(jVarA);
        synchronized (this.o) {
            strA = d.a.a.a.e.a(dVar);
        }
        jVarA.j(strA);
        try {
            try {
                d.b bVarN = n(strA, dVar);
                try {
                    bVarN.b(jVar, dVar);
                    com.facebook.binaryresource.a aVarH = h(bVarN, dVar, strA);
                    jVarA.i(aVarH.size());
                    jVarA.f(this.m.b());
                    this.e.e(jVarA);
                    return aVarH;
                } finally {
                    if (!bVarN.a()) {
                        d.a.b.e.a.d(q, "Failed to delete temp file");
                    }
                }
            } catch (IOException e) {
                jVarA.h(e);
                this.e.b(jVarA);
                d.a.b.e.a.e(q, "Failed inserting a file into the cache", e);
                throw e;
            }
        } finally {
            jVarA.b();
        }
    }
}

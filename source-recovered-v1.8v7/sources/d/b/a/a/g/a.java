package d.b.a.a.g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.n;
import com.google.android.gms.common.util.p;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public class a {
    private static ScheduledExecutorService l;
    private final Object a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f2919b;

    /* renamed from: c, reason: collision with root package name */
    private WorkSource f2920c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2921d;
    private final String e;
    private final String f;
    private final Context g;
    private boolean h;
    private final Map<String, Integer[]> i;
    private int j;
    private AtomicInteger k;

    public a(Context context, int i, String str) {
        this(context, i, str, null, context == null ? null : context.getPackageName());
    }

    private a(Context context, int i, String str, String str2, String str3) {
        this(context, i, str, null, str3, null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private a(Context context, int i, String str, String str2, String str3, String str4) {
        this.a = this;
        this.h = true;
        this.i = new HashMap();
        Collections.synchronizedSet(new HashSet());
        this.k = new AtomicInteger(0);
        q.l(context, "WakeLock: context must not be null");
        q.h(str, "WakeLock: wakeLockName must not be empty");
        this.f2921d = i;
        this.f = null;
        this.g = context.getApplicationContext();
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.e = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.e = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        this.f2919b = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (p.c(context)) {
            WorkSource workSourceA = p.a(context, n.a(str3) ? context.getPackageName() : str3);
            this.f2920c = workSourceA;
            if (workSourceA != null && p.c(this.g)) {
                WorkSource workSource = this.f2920c;
                if (workSource != null) {
                    workSource.add(workSourceA);
                } else {
                    this.f2920c = workSourceA;
                }
                try {
                    this.f2919b.setWorkSource(this.f2920c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        if (l == null) {
            l = d.b.a.a.c.m.a.a().a();
        }
    }

    private final String c(String str) {
        return (!this.h || TextUtils.isEmpty(str)) ? this.f : str;
    }

    private final List<String> d() {
        return p.b(this.f2920c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(int i) {
        if (this.f2919b.isHeld()) {
            try {
                this.f2919b.release();
            } catch (RuntimeException e) {
                if (!e.getClass().equals(RuntimeException.class)) {
                    throw e;
                }
                Log.e("WakeLock", String.valueOf(this.e).concat(" was already released!"), e);
            }
            this.f2919b.isHeld();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[Catch: all -> 0x0096, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x0016, B:11:0x0029, B:13:0x002e, B:15:0x0038, B:22:0x005e, B:23:0x007d, B:16:0x0047, B:18:0x0056, B:20:0x005a, B:8:0x001a, B:10:0x0022), top: B:31:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[Catch: all -> 0x0096, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x0016, B:11:0x0029, B:13:0x002e, B:15:0x0038, B:22:0x005e, B:23:0x007d, B:16:0x0047, B:18:0x0056, B:20:0x005a, B:8:0x001a, B:10:0x0022), top: B:31:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r13.k
            r0.incrementAndGet()
            r0 = 0
            java.lang.String r6 = r13.c(r0)
            java.lang.Object r0 = r13.a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.i     // Catch: java.lang.Throwable -> L96
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L96
            r2 = 0
            if (r1 == 0) goto L1a
            int r1 = r13.j     // Catch: java.lang.Throwable -> L96
            if (r1 <= 0) goto L29
        L1a:
            android.os.PowerManager$WakeLock r1 = r13.f2919b     // Catch: java.lang.Throwable -> L96
            boolean r1 = r1.isHeld()     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L29
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.i     // Catch: java.lang.Throwable -> L96
            r1.clear()     // Catch: java.lang.Throwable -> L96
            r13.j = r2     // Catch: java.lang.Throwable -> L96
        L29:
            boolean r1 = r13.h     // Catch: java.lang.Throwable -> L96
            r12 = 1
            if (r1 == 0) goto L56
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.i     // Catch: java.lang.Throwable -> L96
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L96
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L47
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.i     // Catch: java.lang.Throwable -> L96
            java.lang.Integer[] r3 = new java.lang.Integer[r12]     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L96
            r3[r2] = r4     // Catch: java.lang.Throwable -> L96
            r1.put(r6, r3)     // Catch: java.lang.Throwable -> L96
            r2 = 1
            goto L54
        L47:
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L96
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L96
            int r3 = r3 + r12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L96
            r1[r2] = r3     // Catch: java.lang.Throwable -> L96
        L54:
            if (r2 != 0) goto L5e
        L56:
            boolean r1 = r13.h     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L7d
            int r1 = r13.j     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L7d
        L5e:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.d.a()     // Catch: java.lang.Throwable -> L96
            android.content.Context r2 = r13.g     // Catch: java.lang.Throwable -> L96
            android.os.PowerManager$WakeLock r3 = r13.f2919b     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = com.google.android.gms.common.stats.c.a(r3, r6)     // Catch: java.lang.Throwable -> L96
            r4 = 7
            java.lang.String r5 = r13.e     // Catch: java.lang.Throwable -> L96
            r7 = 0
            int r8 = r13.f2921d     // Catch: java.lang.Throwable -> L96
            java.util.List r9 = r13.d()     // Catch: java.lang.Throwable -> L96
            r10 = r14
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L96
            int r1 = r13.j     // Catch: java.lang.Throwable -> L96
            int r1 = r1 + r12
            r13.j = r1     // Catch: java.lang.Throwable -> L96
        L7d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            android.os.PowerManager$WakeLock r0 = r13.f2919b
            r0.acquire()
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L95
            java.util.concurrent.ScheduledExecutorService r0 = d.b.a.a.g.a.l
            d.b.a.a.g.b r1 = new d.b.a.a.g.b
            r1.<init>(r13)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r14, r2)
        L95:
            return
        L96:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.a.a.g.a.a(long):void");
    }

    public void b(boolean z) {
        this.f2919b.setReferenceCounted(z);
        this.h = z;
    }
}

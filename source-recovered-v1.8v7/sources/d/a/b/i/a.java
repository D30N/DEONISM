package d.a.b.i;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import d.a.b.d.m;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public class a {
    private static a h;
    private static final long i = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: b, reason: collision with root package name */
    private volatile File f2393b;

    /* renamed from: d, reason: collision with root package name */
    private volatile File f2395d;

    @GuardedBy("lock")
    private long e;

    @Nullable
    private volatile StatFs a = null;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private volatile StatFs f2394c = null;
    private volatile boolean g = false;
    private final Lock f = new ReentrantLock();

    /* renamed from: d.a.b.i.a$a, reason: collision with other inner class name */
    public enum EnumC0086a {
        INTERNAL,
        EXTERNAL
    }

    protected a() {
    }

    protected static StatFs a(String str) {
        return new StatFs(str);
    }

    private void b() {
        if (this.g) {
            return;
        }
        this.f.lock();
        try {
            if (!this.g) {
                this.f2393b = Environment.getDataDirectory();
                this.f2395d = Environment.getExternalStorageDirectory();
                g();
                this.g = true;
            }
        } finally {
            this.f.unlock();
        }
    }

    public static synchronized a d() {
        if (h == null) {
            h = new a();
        }
        return h;
    }

    private void e() {
        if (this.f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.e > i) {
                    g();
                }
            } finally {
                this.f.unlock();
            }
        }
    }

    @GuardedBy("lock")
    private void g() {
        this.a = h(this.a, this.f2393b);
        this.f2394c = h(this.f2394c, this.f2395d);
        this.e = SystemClock.uptimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.StatFs] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.StatFs] */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Nullable
    private StatFs h(@Nullable StatFs statFs, @Nullable File file) throws X {
        ?? r0 = 0;
        r0 = 0;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == null) {
                statFs = a(file.getAbsolutePath());
            } else {
                statFs.restat(file.getAbsolutePath());
            }
            r0 = statFs;
            return r0;
        } catch (IllegalArgumentException unused) {
            return r0;
        } catch (Throwable th) {
            m.a(th);
            throw r0;
        }
    }

    @SuppressLint({"DeprecatedMethod"})
    public long c(EnumC0086a enumC0086a) {
        long blockSize;
        long availableBlocks;
        b();
        e();
        StatFs statFs = enumC0086a == EnumC0086a.INTERNAL ? this.a : this.f2394c;
        if (statFs == null) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            blockSize = statFs.getBlockSizeLong();
            availableBlocks = statFs.getAvailableBlocksLong();
        } else {
            blockSize = statFs.getBlockSize();
            availableBlocks = statFs.getAvailableBlocks();
        }
        return blockSize * availableBlocks;
    }

    public boolean f(EnumC0086a enumC0086a, long j) {
        b();
        long jC = c(enumC0086a);
        return jC <= 0 || jC < j;
    }
}

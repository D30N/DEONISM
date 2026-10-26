package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.facebook.soloader.i;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class SysUtil {

    @d
    @TargetApi(21)
    private static final class LollipopSysdeps {

        static class a implements Comparator<String> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ArrayList f1442b;

            a(ArrayList arrayList) {
                this.f1442b = arrayList;
            }

            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(String str, String str2) {
                if (this.f1442b.contains(str)) {
                    return -1;
                }
                return this.f1442b.contains(str2) ? 1 : 0;
            }
        }

        private LollipopSysdeps() {
        }

        @d
        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) throws IOException, ErrnoException {
            try {
                Os.posix_fallocate(fileDescriptor, 0L, j);
            } catch (ErrnoException e) {
                int i = e.errno;
                if (i != OsConstants.EOPNOTSUPP && i != OsConstants.ENOSYS && i != OsConstants.EINVAL) {
                    throw new IOException(e.toString(), e);
                }
            }
        }

        @d
        public static String[] getSupportedAbis() {
            String string;
            String[] strArr = Build.SUPPORTED_ABIS;
            ArrayList arrayList = new ArrayList();
            try {
                if (Os.readlink("/proc/self/exe").contains("64")) {
                    arrayList.add(i.b.AARCH64.toString());
                    string = i.b.X86_64.toString();
                } else {
                    arrayList.add(i.b.ARM.toString());
                    string = i.b.X86.toString();
                }
                arrayList.add(string);
                Arrays.sort(strArr, new a(arrayList));
                return strArr;
            } catch (ErrnoException e) {
                Log.e("SysUtil", "Could not read /proc/self/exe. Falling back to default ABI list.", e);
                return Build.SUPPORTED_ABIS;
            }
        }
    }

    static int a(RandomAccessFile randomAccessFile, InputStream inputStream, int i, byte[] bArr) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, 0, Math.min(bArr.length, i - i2));
            if (i3 == -1) {
                break;
            }
            randomAccessFile.write(bArr, 0, i3);
            i2 += i3;
        }
        return i2;
    }

    public static void b(File file) throws IOException {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                b(file2);
            }
        }
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("could not delete: " + file);
    }

    public static void c(FileDescriptor fileDescriptor, long j) throws IOException, ErrnoException {
        if (Build.VERSION.SDK_INT >= 21) {
            LollipopSysdeps.fallocateIfSupported(fileDescriptor, j);
        }
    }

    public static int d(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    static void e(File file) throws IOException {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                throw new IOException("cannot list directory " + file);
            }
            for (File file2 : fileArrListFiles) {
                e(file2);
            }
            return;
        }
        if (file.getPath().endsWith("_lock")) {
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public static int f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }

    public static String[] g() {
        return Build.VERSION.SDK_INT < 21 ? new String[]{Build.CPU_ABI, Build.CPU_ABI2} : LollipopSysdeps.getSupportedAbis();
    }

    static void h(File file) throws IOException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        throw new IOException("cannot mkdir: " + file);
    }
}

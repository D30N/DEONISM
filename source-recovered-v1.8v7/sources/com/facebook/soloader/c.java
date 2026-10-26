package com.facebook.soloader;

import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c extends l {
    protected final File a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f1445b;

    public c(File file, int i) {
        this.a = file;
        this.f1445b = i;
    }

    private static String[] c(File file) {
        if (SoLoader.a) {
            Api18TraceUtils.a("SoLoader.getElfDependencies[", file.getName(), "]");
        }
        try {
            return i.a(file);
        } finally {
            if (SoLoader.a) {
                Api18TraceUtils.b();
            }
        }
    }

    private void d(File file, int i, StrictMode.ThreadPolicy threadPolicy) {
        String[] strArrC = c(file);
        Log.d("SoLoader", "Loading lib dependencies: " + Arrays.toString(strArrC));
        for (String str : strArrC) {
            if (!str.startsWith("/")) {
                SoLoader.j(str, (i | 1) & (-3), threadPolicy);
            }
        }
    }

    @Override // com.facebook.soloader.l
    public int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return e(str, i, this.a, threadPolicy);
    }

    protected int e(String str, int i, File file, StrictMode.ThreadPolicy threadPolicy) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            Log.d("SoLoader", str + " not found on " + file.getCanonicalPath());
            return 0;
        }
        Log.d("SoLoader", str + " found on " + file.getCanonicalPath());
        if ((i & 1) != 0 && (this.f1445b & 2) != 0) {
            Log.d("SoLoader", str + " loaded implicitly");
            return 2;
        }
        if ((this.f1445b & 1) != 0) {
            d(file2, i, threadPolicy);
        } else {
            Log.d("SoLoader", "Not resolving dependencies for " + str);
        }
        try {
            SoLoader.f1436b.a(file2.getAbsolutePath(), i);
            return 1;
        } catch (UnsatisfiedLinkError e) {
            if (!e.getMessage().contains("bad ELF magic")) {
                throw e;
            }
            Log.d("SoLoader", "Corrupted lib file detected");
            return 3;
        }
    }

    @Override // com.facebook.soloader.l
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.a.getCanonicalPath());
        } catch (IOException unused) {
            name = this.a.getName();
        }
        return getClass().getName() + "[root = " + name + " flags = " + this.f1445b + ']';
    }
}

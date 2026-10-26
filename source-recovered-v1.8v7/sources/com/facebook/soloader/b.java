package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;

/* loaded from: classes.dex */
public class b extends l {
    private Context a;

    /* renamed from: b, reason: collision with root package name */
    private int f1443b;

    /* renamed from: c, reason: collision with root package name */
    private c f1444c;

    public b(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        if (applicationContext == null) {
            Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.");
            this.a = context;
        }
        this.f1443b = i;
        this.f1444c = new c(new File(this.a.getApplicationInfo().nativeLibraryDir), i);
    }

    @Override // com.facebook.soloader.l
    public int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return this.f1444c.a(str, i, threadPolicy);
    }

    @Override // com.facebook.soloader.l
    protected void b(int i) {
        this.f1444c.b(i);
    }

    public boolean c() throws PackageManager.NameNotFoundException {
        try {
            File file = this.f1444c.a;
            Context contextCreatePackageContext = this.a.createPackageContext(this.a.getPackageName(), 0);
            File file2 = new File(contextCreatePackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            Log.d("SoLoader", "Native library directory updated from " + file + " to " + file2);
            int i = this.f1443b | 1;
            this.f1443b = i;
            c cVar = new c(file2, i);
            this.f1444c = cVar;
            cVar.b(this.f1443b);
            this.a = contextCreatePackageContext;
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.facebook.soloader.l
    public String toString() {
        return this.f1444c.toString();
    }
}

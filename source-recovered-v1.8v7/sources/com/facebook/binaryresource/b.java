package com.facebook.binaryresource;

import d.a.b.d.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class b implements a {
    private final File a;

    private b(File file) {
        i.g(file);
        this.a = file;
    }

    @Nullable
    public static b b(File file) {
        if (file != null) {
            return new b(file);
        }
        return null;
    }

    @Override // com.facebook.binaryresource.a
    public InputStream a() {
        return new FileInputStream(this.a);
    }

    public File c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return this.a.equals(((b) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.facebook.binaryresource.a
    public long size() {
        return this.a.length();
    }
}

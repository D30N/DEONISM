package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class g implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    private final FileOutputStream f1456b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final FileLock f1457c;

    private g(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f1456b = fileOutputStream;
        try {
            FileLock fileLockLock = fileOutputStream.getChannel().lock();
            if (fileLockLock == null) {
            }
            this.f1457c = fileLockLock;
        } finally {
            this.f1456b.close();
        }
    }

    public static g a(File file) {
        return new g(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (this.f1457c != null) {
                this.f1457c.release();
            }
        } finally {
            this.f1456b.close();
        }
    }
}

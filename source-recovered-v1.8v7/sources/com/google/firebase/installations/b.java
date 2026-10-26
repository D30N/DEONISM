package com.google.firebase.installations;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes.dex */
class b {
    private final FileChannel a;

    /* renamed from: b, reason: collision with root package name */
    private final FileLock f2279b;

    private b(FileChannel fileChannel, FileLock fileLock) {
        this.a = fileChannel;
        this.f2279b = fileLock;
    }

    static b a(Context context, String str) throws IOException {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), str), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
            } catch (IOException e) {
                e = e;
                fileLockLock = null;
            }
        } catch (IOException e2) {
            e = e2;
            channel = null;
            fileLockLock = null;
        }
        try {
            return new b(channel, fileLockLock);
        } catch (IOException e3) {
            e = e3;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLockLock != null) {
                try {
                    fileLockLock.release();
                } catch (IOException unused) {
                }
            }
            if (channel != null) {
                try {
                    channel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        }
    }

    void b() throws IOException {
        try {
            this.f2279b.release();
            this.a.close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }
}

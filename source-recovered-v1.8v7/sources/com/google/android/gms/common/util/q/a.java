package com.google.android.gms.common.util.q;

import com.google.android.gms.common.internal.q;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class a implements ThreadFactory {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadFactory f1593b;

    public a(String str) {
        this(str, 0);
    }

    private a(String str, int i) {
        this.f1593b = Executors.defaultThreadFactory();
        q.l(str, "Name must not be null");
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f1593b.newThread(new b(runnable, 0));
        threadNewThread.setName(this.a);
        return threadNewThread;
    }
}

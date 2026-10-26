package com.google.android.gms.common.util.q;

import android.os.Process;

/* loaded from: classes.dex */
final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f1594b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1595c;

    public b(Runnable runnable, int i) {
        this.f1594b = runnable;
        this.f1595c = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f1595c);
        this.f1594b.run();
    }
}

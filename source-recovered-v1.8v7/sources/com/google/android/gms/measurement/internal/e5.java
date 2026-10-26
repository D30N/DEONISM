package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
final class e5 extends Thread {

    /* renamed from: b, reason: collision with root package name */
    private final Object f1679b;

    /* renamed from: c, reason: collision with root package name */
    private final BlockingQueue<b5<?>> f1680c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1681d = false;
    private final /* synthetic */ a5 e;

    public e5(a5 a5Var, String str, BlockingQueue<b5<?>> blockingQueue) {
        this.e = a5Var;
        com.google.android.gms.common.internal.q.k(str);
        com.google.android.gms.common.internal.q.k(blockingQueue);
        this.f1679b = new Object();
        this.f1680c = blockingQueue;
        setName(str);
    }

    private final void b(InterruptedException interruptedException) {
        this.e.m().J().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    private final void c() {
        synchronized (this.e.i) {
            if (!this.f1681d) {
                this.e.j.release();
                this.e.i.notifyAll();
                if (this == this.e.f1615c) {
                    a5.u(this.e, null);
                } else if (this == this.e.f1616d) {
                    a5.A(this.e, null);
                } else {
                    this.e.m().G().a("Current scheduler thread is neither worker nor network");
                }
                this.f1681d = true;
            }
        }
    }

    public final void a() {
        synchronized (this.f1679b) {
            this.f1679b.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z = false;
        while (!z) {
            try {
                this.e.j.acquire();
                z = true;
            } catch (InterruptedException e) {
                b(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                b5<?> b5VarPoll = this.f1680c.poll();
                if (b5VarPoll == null) {
                    synchronized (this.f1679b) {
                        if (this.f1680c.peek() == null && !this.e.k) {
                            try {
                                this.f1679b.wait(30000L);
                            } catch (InterruptedException e2) {
                                b(e2);
                            }
                        }
                    }
                    synchronized (this.e.i) {
                        if (this.f1680c.peek() == null) {
                            break;
                        }
                    }
                } else {
                    Process.setThreadPriority(b5VarPoll.f1634c ? threadPriority : 10);
                    b5VarPoll.run();
                }
            }
            if (this.e.n().t(r.y0)) {
                c();
            }
        } finally {
            c();
        }
    }
}

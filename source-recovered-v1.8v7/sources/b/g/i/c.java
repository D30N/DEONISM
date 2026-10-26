package b.g.i;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private HandlerThread f870b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f871c;
    private final int f;
    private final int g;
    private final String h;
    private final Object a = new Object();
    private Handler.Callback e = new a();

    /* renamed from: d, reason: collision with root package name */
    private int f872d = 0;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                c.this.a();
                return true;
            }
            if (i != 1) {
                return true;
            }
            c.this.b((Runnable) message.obj);
            return true;
        }
    }

    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callable f873b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Handler f874c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f875d;

        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f876b;

            a(Object obj) {
                this.f876b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f875d.a(this.f876b);
            }
        }

        b(c cVar, Callable callable, Handler handler, d dVar) {
            this.f873b = callable;
            this.f874c = handler;
            this.f875d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Exception {
            Object objCall;
            try {
                objCall = this.f873b.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f874c.post(new a(objCall));
        }
    }

    /* renamed from: b.g.i.c$c, reason: collision with other inner class name */
    class RunnableC0026c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f878b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Callable f879c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReentrantLock f880d;
        final /* synthetic */ AtomicBoolean e;
        final /* synthetic */ Condition f;

        RunnableC0026c(c cVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f878b = atomicReference;
            this.f879c = callable;
            this.f880d = reentrantLock;
            this.e = atomicBoolean;
            this.f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f878b.set(this.f879c.call());
            } catch (Exception unused) {
            }
            this.f880d.lock();
            try {
                this.e.set(false);
                this.f.signal();
            } finally {
                this.f880d.unlock();
            }
        }
    }

    public interface d<T> {
        void a(T t);
    }

    public c(String str, int i, int i2) {
        this.h = str;
        this.g = i;
        this.f = i2;
    }

    private void c(Runnable runnable) {
        synchronized (this.a) {
            if (this.f870b == null) {
                HandlerThread handlerThread = new HandlerThread(this.h, this.g);
                this.f870b = handlerThread;
                handlerThread.start();
                this.f871c = new Handler(this.f870b.getLooper(), this.e);
                this.f872d++;
            }
            this.f871c.removeMessages(0);
            this.f871c.sendMessage(this.f871c.obtainMessage(1, runnable));
        }
    }

    void a() {
        synchronized (this.a) {
            if (this.f871c.hasMessages(1)) {
                return;
            }
            this.f870b.quit();
            this.f870b = null;
            this.f871c = null;
        }
    }

    void b(Runnable runnable) {
        runnable.run();
        synchronized (this.a) {
            this.f871c.removeMessages(0);
            this.f871c.sendMessageDelayed(this.f871c.obtainMessage(0), this.f);
        }
    }

    public <T> void d(Callable<T> callable, d<T> dVar) {
        c(new b(this, callable, new Handler(), dVar));
    }

    public <T> T e(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        c(new RunnableC0026c(this, atomicReference, callable, reentrantLock, atomicBoolean, conditionNewCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }
}

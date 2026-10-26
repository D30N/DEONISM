package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class e {
    private static e e;
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Handler f2126b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c, reason: collision with root package name */
    private c f2127c;

    /* renamed from: d, reason: collision with root package name */
    private c f2128d;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            e.this.c((c) message.obj);
            return true;
        }
    }

    interface b {
        void a(int i);
    }

    private static class c {
        final WeakReference<b> a;

        /* renamed from: b, reason: collision with root package name */
        int f2129b;

        /* renamed from: c, reason: collision with root package name */
        boolean f2130c;

        boolean a(b bVar) {
            return bVar != null && this.a.get() == bVar;
        }
    }

    private e() {
    }

    private boolean a(c cVar, int i) {
        b bVar = cVar.a.get();
        if (bVar == null) {
            return false;
        }
        this.f2126b.removeCallbacksAndMessages(cVar);
        bVar.a(i);
        return true;
    }

    static e b() {
        if (e == null) {
            e = new e();
        }
        return e;
    }

    private boolean d(b bVar) {
        c cVar = this.f2127c;
        return cVar != null && cVar.a(bVar);
    }

    private void g(c cVar) {
        int i = cVar.f2129b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        this.f2126b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f2126b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
    }

    void c(c cVar) {
        synchronized (this.a) {
            if (this.f2127c == cVar || this.f2128d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public void e(b bVar) {
        synchronized (this.a) {
            if (d(bVar) && !this.f2127c.f2130c) {
                this.f2127c.f2130c = true;
                this.f2126b.removeCallbacksAndMessages(this.f2127c);
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.a) {
            if (d(bVar) && this.f2127c.f2130c) {
                this.f2127c.f2130c = false;
                g(this.f2127c);
            }
        }
    }
}

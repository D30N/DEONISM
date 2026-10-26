package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class f implements ServiceConnection {

    @GuardedBy("this")
    int a;

    /* renamed from: b, reason: collision with root package name */
    final Messenger f2232b;

    /* renamed from: c, reason: collision with root package name */
    n f2233c;

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("this")
    final Queue<p<?>> f2234d;

    @GuardedBy("this")
    final SparseArray<p<?>> e;
    final /* synthetic */ e f;

    private f(e eVar) {
        this.f = eVar;
        this.a = 0;
        this.f2232b = new Messenger(new d.b.a.a.e.d.e(Looper.getMainLooper(), new Handler.Callback(this) { // from class: com.google.firebase.iid.i
            private final f a;

            {
                this.a = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.a.d(message);
            }
        }));
        this.f2234d = new ArrayDeque();
        this.e = new SparseArray<>();
    }

    final void a() {
        this.f.f2223b.execute(new Runnable(this) { // from class: com.google.firebase.iid.j

            /* renamed from: b, reason: collision with root package name */
            private final f f2238b;

            {
                this.f2238b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final p<?> pVarPoll;
                final f fVar = this.f2238b;
                while (true) {
                    synchronized (fVar) {
                        if (fVar.a != 2) {
                            return;
                        }
                        if (fVar.f2234d.isEmpty()) {
                            fVar.f();
                            return;
                        } else {
                            pVarPoll = fVar.f2234d.poll();
                            fVar.e.put(pVarPoll.a, pVarPoll);
                            fVar.f.f2223b.schedule(new Runnable(fVar, pVarPoll) { // from class: com.google.firebase.iid.l

                                /* renamed from: b, reason: collision with root package name */
                                private final f f2245b;

                                /* renamed from: c, reason: collision with root package name */
                                private final p f2246c;

                                {
                                    this.f2245b = fVar;
                                    this.f2246c = pVarPoll;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f2245b.b(this.f2246c.a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String strValueOf = String.valueOf(pVarPoll);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 8);
                        sb.append("Sending ");
                        sb.append(strValueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    Context context = fVar.f.a;
                    Messenger messenger = fVar.f2232b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = pVarPoll.f2254c;
                    messageObtain.arg1 = pVarPoll.a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", pVarPoll.d());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", pVarPoll.f2255d);
                    messageObtain.setData(bundle);
                    try {
                        fVar.f2233c.a(messageObtain);
                    } catch (RemoteException e) {
                        fVar.c(2, e.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void b(int i) {
        p<?> pVar = this.e.get(i);
        if (pVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.e.remove(i);
            pVar.b(new o(3, "Timed out waiting for response"));
            f();
        }
    }

    final synchronized void c(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
        }
        int i2 = this.a;
        if (i2 == 0) {
            throw new IllegalStateException();
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                this.a = 4;
                return;
            } else {
                if (i2 == 4) {
                    return;
                }
                int i3 = this.a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
            }
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.a = 4;
        com.google.android.gms.common.stats.a.b().c(this.f.a, this);
        o oVar = new o(i, str);
        Iterator<p<?>> it = this.f2234d.iterator();
        while (it.hasNext()) {
            it.next().b(oVar);
        }
        this.f2234d.clear();
        for (int i4 = 0; i4 < this.e.size(); i4++) {
            this.e.valueAt(i4).b(oVar);
        }
        this.e.clear();
    }

    final boolean d(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Received response to request: ");
            sb.append(i);
            Log.d("MessengerIpcClient", sb.toString());
        }
        synchronized (this) {
            p<?> pVar = this.e.get(i);
            if (pVar == null) {
                StringBuilder sb2 = new StringBuilder(50);
                sb2.append("Received response for unknown request: ");
                sb2.append(i);
                Log.w("MessengerIpcClient", sb2.toString());
                return true;
            }
            this.e.remove(i);
            f();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                pVar.b(new o(4, "Not supported by GmsCore"));
            } else {
                pVar.a(data);
            }
            return true;
        }
    }

    final synchronized boolean e(p<?> pVar) {
        int i = this.a;
        if (i == 0) {
            this.f2234d.add(pVar);
            com.google.android.gms.common.internal.q.n(this.a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (com.google.android.gms.common.stats.a.b().a(this.f.a, intent, this, 1)) {
                this.f.f2223b.schedule(new Runnable(this) { // from class: com.google.firebase.iid.h

                    /* renamed from: b, reason: collision with root package name */
                    private final f f2237b;

                    {
                        this.f2237b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2237b.g();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                c(0, "Unable to bind to service");
            }
            return true;
        }
        if (i == 1) {
            this.f2234d.add(pVar);
            return true;
        }
        if (i == 2) {
            this.f2234d.add(pVar);
            a();
            return true;
        }
        if (i != 3 && i != 4) {
            int i2 = this.a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
        return false;
    }

    final synchronized void f() {
        if (this.a == 2 && this.f2234d.isEmpty() && this.e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = 3;
            com.google.android.gms.common.stats.a.b().c(this.f.a, this);
        }
    }

    final synchronized void g() {
        if (this.a == 1) {
            c(1, "Timed out while binding");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f.f2223b.execute(new Runnable(this, iBinder) { // from class: com.google.firebase.iid.k

            /* renamed from: b, reason: collision with root package name */
            private final f f2240b;

            /* renamed from: c, reason: collision with root package name */
            private final IBinder f2241c;

            {
                this.f2240b = this;
                this.f2241c = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f fVar = this.f2240b;
                IBinder iBinder2 = this.f2241c;
                synchronized (fVar) {
                    try {
                        if (iBinder2 == null) {
                            fVar.c(0, "Null service connection");
                            return;
                        }
                        try {
                            fVar.f2233c = new n(iBinder2);
                            fVar.a = 2;
                            fVar.a();
                        } catch (RemoteException e) {
                            fVar.c(0, e.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f.f2223b.execute(new Runnable(this) { // from class: com.google.firebase.iid.m

            /* renamed from: b, reason: collision with root package name */
            private final f f2247b;

            {
                this.f2247b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f2247b.c(2, "Service disconnected");
            }
        });
    }
}

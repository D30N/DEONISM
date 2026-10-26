package com.facebook.drawee.c;

import android.os.Handler;
import android.os.Looper;
import com.facebook.drawee.c.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
class b extends com.facebook.drawee.c.a {

    /* renamed from: c, reason: collision with root package name */
    private final Object f1155c = new Object();
    private final Runnable g = new a();
    private ArrayList<a.InterfaceC0049a> e = new ArrayList<>();
    private ArrayList<a.InterfaceC0049a> f = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final Handler f1156d = new Handler(Looper.getMainLooper());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this.f1155c) {
                ArrayList arrayList = b.this.f;
                b.this.f = b.this.e;
                b.this.e = arrayList;
            }
            int size = b.this.f.size();
            for (int i = 0; i < size; i++) {
                ((a.InterfaceC0049a) b.this.f.get(i)).a();
            }
            b.this.f.clear();
        }
    }

    @Override // com.facebook.drawee.c.a
    public void a(a.InterfaceC0049a interfaceC0049a) {
        synchronized (this.f1155c) {
            this.e.remove(interfaceC0049a);
        }
    }

    @Override // com.facebook.drawee.c.a
    public void d(a.InterfaceC0049a interfaceC0049a) {
        if (!com.facebook.drawee.c.a.c()) {
            interfaceC0049a.a();
            return;
        }
        synchronized (this.f1155c) {
            if (this.e.contains(interfaceC0049a)) {
                return;
            }
            this.e.add(interfaceC0049a);
            boolean z = true;
            if (this.e.size() != 1) {
                z = false;
            }
            if (z) {
                this.f1156d.post(this.g);
            }
        }
    }
}

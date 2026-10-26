package com.facebook.drawee.c;

import android.os.Handler;
import android.os.Looper;
import com.facebook.drawee.c.a;
import d.a.b.d.i;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
class c extends com.facebook.drawee.c.a {
    private final Runnable e = new a();

    /* renamed from: c, reason: collision with root package name */
    protected final Set<a.InterfaceC0049a> f1158c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    protected final Handler f1159d = new Handler(Looper.getMainLooper());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.f();
            Iterator<a.InterfaceC0049a> it = c.this.f1158c.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            c.this.f1158c.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f() {
        i.i(com.facebook.drawee.c.a.c());
    }

    @Override // com.facebook.drawee.c.a
    public void a(a.InterfaceC0049a interfaceC0049a) {
        if (com.facebook.drawee.c.a.c()) {
            this.f1158c.remove(interfaceC0049a);
        }
    }

    @Override // com.facebook.drawee.c.a
    public void d(a.InterfaceC0049a interfaceC0049a) {
        if (!com.facebook.drawee.c.a.c()) {
            interfaceC0049a.a();
        } else if (this.f1158c.add(interfaceC0049a) && this.f1158c.size() == 1) {
            this.f1159d.post(this.e);
        }
    }
}

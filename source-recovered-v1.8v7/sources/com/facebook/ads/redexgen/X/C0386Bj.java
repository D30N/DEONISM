package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Bj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0386Bj {
    public final CopyOnWriteArrayList<C0385Bi> A00 = new CopyOnWriteArrayList<>();

    public final void A00() {
        C0386Bj c0386Bj = this;
        Iterator<C0385Bi> it = c0386Bj.A00.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0386Bj = c0386Bj;
                    it = it;
                    C0385Bi handlerAndListener = it.next();
                    handlerAndListener.A00.post(new RunnableC0381Be(c0386Bj, handlerAndListener.A01));
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A01() {
        C0386Bj c0386Bj = this;
        Iterator<C0385Bi> it = c0386Bj.A00.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0386Bj = c0386Bj;
                    it = it;
                    C0385Bi handlerAndListener = it.next();
                    handlerAndListener.A00.post(new RunnableC0384Bh(c0386Bj, handlerAndListener.A01));
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A02() {
        C0386Bj c0386Bj = this;
        Iterator<C0385Bi> it = c0386Bj.A00.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0386Bj = c0386Bj;
                    it = it;
                    C0385Bi handlerAndListener = it.next();
                    handlerAndListener.A00.post(new RunnableC0383Bg(c0386Bj, handlerAndListener.A01));
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A03(Handler handler, InterfaceC0387Bk interfaceC0387Bk) {
        boolean z = false;
        char c2 = handler != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    interfaceC0387Bk = interfaceC0387Bk;
                    if (interfaceC0387Bk == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    IJ.A03(z);
                    this.A00.add(new C0385Bi(handler, interfaceC0387Bk));
                    return;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public final void A04(Exception exc) {
        C0386Bj c0386Bj = this;
        Iterator<C0385Bi> it = c0386Bj.A00.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0386Bj = c0386Bj;
                    exc = exc;
                    it = it;
                    C0385Bi next = it.next();
                    next.A00.post(new RunnableC0382Bf(c0386Bj, next.A01, exc));
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }
}

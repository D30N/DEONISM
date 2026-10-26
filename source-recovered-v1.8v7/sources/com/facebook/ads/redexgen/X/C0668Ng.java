package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ng, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0668Ng {
    public final String A00 = C0668Ng.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<C0S> A03;
    public final WeakReference<InterfaceC0669Nh> A04;
    public final WeakReference<Q1> A05;
    public final WeakReference<C1004aC> A06;

    public C0668Ng(C1004aC c1004aC, InterfaceC0669Nh interfaceC0669Nh, Q1 q1, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, XI xi) {
        this.A06 = new WeakReference<>(c1004aC);
        this.A04 = new WeakReference<>(interfaceC0669Nh);
        this.A05 = new WeakReference<>(q1);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(xi.A0A());
    }

    private C0S A00() {
        C0S c0s = this.A03.get();
        if (c0s == null) {
            return new RN();
        }
        return c0s;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return LX.A01(C03098j.A02());
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        C0668Ng c0668Ng = this;
        InterfaceC0669Nh interfaceC0669Nh = null;
        c0668Ng.A00().ADn();
        char c2 = c0668Ng.A06.get() != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0668Ng = c0668Ng;
                    if (c0668Ng.A01.get() == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0668Ng = c0668Ng;
                    if (c0668Ng.A02.get() != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    c0668Ng = c0668Ng;
                    if (!c0668Ng.A02.get().get()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0668Ng = c0668Ng;
                    c0668Ng.A01.get().set(true);
                    c0668Ng.A00().ADo();
                    if (!c0668Ng.A06.get().isShown()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0668Ng = c0668Ng;
                    c0668Ng.A00().ADp();
                    new Handler(Looper.getMainLooper()).post(new C1008aG(c0668Ng.A05));
                    c2 = '\b';
                    break;
                case '\b':
                    c0668Ng = c0668Ng;
                    interfaceC0669Nh = c0668Ng.A04.get();
                    if (interfaceC0669Nh == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0668Ng = c0668Ng;
                    interfaceC0669Nh = interfaceC0669Nh;
                    new Handler(Looper.getMainLooper()).post(new RunnableC0667Nf(c0668Ng, interfaceC0669Nh));
                    c2 = '\n';
                    break;
                case '\n':
                    return;
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        C0668Ng c0668Ng = this;
        InterfaceC0669Nh listener = null;
        C1004aC c1004aC = c0668Ng.A06.get();
        char c2 = c1004aC != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1004aC = c1004aC;
                    if (!c1004aC.A03()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0668Ng.A00().ADq(true);
                    return;
                case 4:
                    c0668Ng = c0668Ng;
                    listener = c0668Ng.A04.get();
                    if (listener == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0668Ng = c0668Ng;
                    listener = listener;
                    c0668Ng.A00().ADq(false);
                    listener.AAR();
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    c0668Ng = c0668Ng;
                    c0668Ng.A00().ADq(true);
                    c2 = 6;
                    break;
            }
        }
    }
}

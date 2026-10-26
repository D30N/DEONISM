package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Ko, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0601Ko {
    public static final Set<Object> A00 = Collections.newSetFromMap(new WeakHashMap());
    public static final AtomicBoolean A01 = new AtomicBoolean(true);
    public static final AtomicReference<InterfaceC0599Km> A02 = new AtomicReference<>();

    @SuppressLint({"RethrownThrowableArgument"})
    public static void A00(Throwable th, Object obj) throws Throwable {
        InterfaceC0599Km interfaceC0599Km = null;
        char c2 = A01.get() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    th = th;
                    obj = obj;
                    A00.add(obj);
                    L3.A00().A7u(3306, th);
                    interfaceC0599Km = A02.get();
                    if (interfaceC0599Km == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    th = th;
                    obj = obj;
                    interfaceC0599Km = interfaceC0599Km;
                    interfaceC0599Km.ACX(th, obj);
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    throw th;
            }
        }
    }

    public static void A01(boolean z, InterfaceC0599Km interfaceC0599Km) {
        A01.set(z);
        A02.set(interfaceC0599Km);
    }

    public static boolean A02(Object obj) {
        return A00.contains(obj);
    }
}

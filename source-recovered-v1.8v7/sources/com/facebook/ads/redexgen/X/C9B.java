package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.redexgen.X.C9A;
import com.facebook.ads.redexgen.X.C9C;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.facebook.ads.redexgen.X.9B, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9B<T extends C9C, E extends C9A> {
    public final Map<Class<E>, List<WeakReference<T>>> A00 = new HashMap();
    public final Queue<E> A01 = new ArrayDeque();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9B != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.9C, E extends com.facebook.ads.redexgen.X.9A> */
    private void A00(E e) {
        C9B<T, E> c9b = this;
        C9C c9c = null;
        List<WeakReference<T>> list = null;
        Iterator it = null;
        Map<Class<E>, List<WeakReference<T>>> map = c9b.A00;
        char c2 = map == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    e = e;
                    map = map;
                    list = map.get(e.getClass());
                    if (list != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    c9b = c9b;
                    list = list;
                    c9b.A01(list);
                    if (!list.isEmpty()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return;
                case 7:
                    list = list;
                    it = new ArrayList(list).iterator();
                    c2 = '\b';
                    break;
                case '\b':
                    it = it;
                    if (!it.hasNext()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    it = it;
                    c9c = (C9C) ((WeakReference) it.next()).get();
                    if (c9c == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    e = e;
                    c9c = c9c;
                    if (!c9c.A00(e)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    e = e;
                    c9c = c9c;
                    c9c.A03(e);
                    c2 = '\b';
                    break;
                case '\f':
                    return;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9B != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.9C, E extends com.facebook.ads.redexgen.X.9A> */
    private void A01(List<WeakReference<T>> list) {
        WeakReference<T> item = null;
        int i = 0;
        int size = 0;
        int i2 = 0;
        char c2 = list != null ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    i = 0;
                    i2 = 0;
                    c2 = 3;
                    break;
                case 3:
                    list = list;
                    if (i2 >= list.size()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    list = list;
                    item = list.get(i2);
                    if (item.get() == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    list = list;
                    item = item;
                    list.set(i, item);
                    i++;
                    c2 = 6;
                    break;
                case 6:
                    i2++;
                    c2 = 3;
                    break;
                case 7:
                    list = list;
                    size = list.size() - 1;
                    c2 = '\b';
                    break;
                case '\b':
                    if (size < i) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    list = list;
                    list.remove(size);
                    size--;
                    c2 = '\b';
                    break;
                case '\n':
                    return;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9B != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.9C, E extends com.facebook.ads.redexgen.X.9A> */
    public final synchronized void A02(E e) {
        if (this.A01.isEmpty()) {
            this.A01.add(e);
            while (!this.A01.isEmpty()) {
                E event = this.A01.peek();
                A00(event);
                this.A01.remove();
            }
        } else {
            this.A01.add(e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9B != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.9C, E extends com.facebook.ads.redexgen.X.9A> */
    public final synchronized void A03(T... tArr) {
        if (tArr == null) {
            return;
        }
        for (T t : tArr) {
            A05(t);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9B != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.9C, E extends com.facebook.ads.redexgen.X.9A> */
    public final synchronized void A04(T... tArr) {
        if (tArr == null) {
            return;
        }
        for (T t : tArr) {
            A06(t);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9B != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.9C, E extends com.facebook.ads.redexgen.X.9A> */
    public final synchronized boolean A05(T t) {
        if (t == null) {
            return false;
        }
        Class<E> clsA01 = t.A01();
        if (this.A00.get(clsA01) == null) {
            this.A00.put(clsA01, new ArrayList());
        }
        List<WeakReference<T>> list = this.A00.get(clsA01);
        A01(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).get() == t) {
                return false;
            }
        }
        return list.add(new WeakReference<>(t));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9B != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.9C, E extends com.facebook.ads.redexgen.X.9A> */
    public final synchronized boolean A06(@Nullable T t) {
        if (t == null) {
            return false;
        }
        List<WeakReference<T>> list = this.A00.get(t.A01());
        if (list == null) {
            return false;
        }
        int len = list.size();
        for (int i = 0; i < len; i++) {
            if (list.get(i).get() == t) {
                list.get(i).clear();
                return true;
            }
        }
        return false;
    }
}

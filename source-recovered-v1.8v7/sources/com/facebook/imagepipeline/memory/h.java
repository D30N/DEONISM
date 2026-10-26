package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import com.facebook.infer.annotation.ThreadSafe;
import java.util.LinkedList;
import javax.annotation.Nullable;

@ThreadSafe
/* loaded from: classes.dex */
public class h<T> {
    protected final SparseArray<b<T>> a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    b<T> f1279b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    b<T> f1280c;

    static class b<I> {

        @Nullable
        b<I> a;

        /* renamed from: b, reason: collision with root package name */
        int f1281b;

        /* renamed from: c, reason: collision with root package name */
        LinkedList<I> f1282c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        b<I> f1283d;

        private b(@Nullable b<I> bVar, int i, LinkedList<I> linkedList, @Nullable b<I> bVar2) {
            this.a = bVar;
            this.f1281b = i;
            this.f1282c = linkedList;
            this.f1283d = bVar2;
        }

        public String toString() {
            return "LinkedEntry(key: " + this.f1281b + ")";
        }
    }

    private void b(b<T> bVar) {
        if (bVar == null || !bVar.f1282c.isEmpty()) {
            return;
        }
        d(bVar);
        this.a.remove(bVar.f1281b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c(b<T> bVar) {
        if (this.f1279b == bVar) {
            return;
        }
        d(bVar);
        b<T> bVar2 = this.f1279b;
        if (bVar2 == 0) {
            this.f1279b = bVar;
            this.f1280c = bVar;
        } else {
            bVar.f1283d = bVar2;
            bVar2.a = bVar;
            this.f1279b = bVar;
        }
    }

    private synchronized void d(b<T> bVar) {
        b bVar2 = (b<T>) bVar.a;
        b bVar3 = (b<T>) bVar.f1283d;
        if (bVar2 != null) {
            bVar2.f1283d = bVar3;
        }
        if (bVar3 != null) {
            bVar3.a = bVar2;
        }
        bVar.a = null;
        bVar.f1283d = null;
        if (bVar == this.f1279b) {
            this.f1279b = bVar3;
        }
        if (bVar == this.f1280c) {
            this.f1280c = bVar2;
        }
    }

    @Nullable
    public synchronized T a(int i) {
        b<T> bVar = this.a.get(i);
        if (bVar == null) {
            return null;
        }
        T tPollFirst = bVar.f1282c.pollFirst();
        c(bVar);
        return tPollFirst;
    }

    public synchronized void e(int i, T t) {
        b<T> bVar = this.a.get(i);
        if (bVar == null) {
            bVar = new b<>(null, i, new LinkedList(), null);
            this.a.put(i, bVar);
        }
        bVar.f1282c.addLast(t);
        c(bVar);
    }

    @Nullable
    public synchronized T f() {
        b<T> bVar = this.f1280c;
        if (bVar == null) {
            return null;
        }
        T tPollLast = bVar.f1282c.pollLast();
        b(bVar);
        return tPollLast;
    }
}

package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d<T> {
    private final Set<Class<? super T>> a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<n> f2176b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2177c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2178d;
    private final g<T> e;
    private final Set<Class<?>> f;

    public static class b<T> {
        private final Set<Class<? super T>> a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<n> f2179b;

        /* renamed from: c, reason: collision with root package name */
        private int f2180c;

        /* renamed from: d, reason: collision with root package name */
        private int f2181d;
        private g<T> e;
        private Set<Class<?>> f;

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.a = new HashSet();
            this.f2179b = new HashSet();
            this.f2180c = 0;
            this.f2181d = 0;
            this.f = new HashSet();
            u.c(cls, "Null interface");
            this.a.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                u.c(cls2, "Null interface");
            }
            Collections.addAll(this.a, clsArr);
        }

        static /* synthetic */ b a(b bVar) {
            bVar.g();
            return bVar;
        }

        private b<T> g() {
            this.f2181d = 1;
            return this;
        }

        private b<T> h(int i) {
            u.d(this.f2180c == 0, "Instantiation type has already been set.");
            this.f2180c = i;
            return this;
        }

        private void i(Class<?> cls) {
            u.a(!this.a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(n nVar) {
            u.c(nVar, "Null dependency");
            i(nVar.a());
            this.f2179b.add(nVar);
            return this;
        }

        public b<T> c() {
            h(1);
            return this;
        }

        public d<T> d() {
            u.d(this.e != null, "Missing required property: factory.");
            return new d<>(new HashSet(this.a), new HashSet(this.f2179b), this.f2180c, this.f2181d, this.e, this.f);
        }

        public b<T> e() {
            h(2);
            return this;
        }

        public b<T> f(g<T> gVar) {
            u.c(gVar, "Null factory");
            this.e = gVar;
            return this;
        }
    }

    private d(Set<Class<? super T>> set, Set<n> set2, int i, int i2, g<T> gVar, Set<Class<?>> set3) {
        this.a = Collections.unmodifiableSet(set);
        this.f2176b = Collections.unmodifiableSet(set2);
        this.f2177c = i;
        this.f2178d = i2;
        this.e = gVar;
        this.f = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> b(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> d<T> g(T t, Class<T> cls) {
        b bVarH = h(cls);
        bVarH.f(c.b(t));
        return bVarH.d();
    }

    public static <T> b<T> h(Class<T> cls) {
        b<T> bVarA = a(cls);
        b.a(bVarA);
        return bVarA;
    }

    static /* synthetic */ Object l(Object obj, e eVar) {
        return obj;
    }

    static /* synthetic */ Object m(Object obj, e eVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> d<T> n(T t, Class<T> cls, Class<? super T>... clsArr) {
        b bVarB = b(cls, clsArr);
        bVarB.f(com.google.firebase.components.b.b(t));
        return bVarB.d();
    }

    public Set<n> c() {
        return this.f2176b;
    }

    public g<T> d() {
        return this.e;
    }

    public Set<Class<? super T>> e() {
        return this.a;
    }

    public Set<Class<?>> f() {
        return this.f;
    }

    public boolean i() {
        return this.f2177c == 1;
    }

    public boolean j() {
        return this.f2177c == 2;
    }

    public boolean k() {
        return this.f2178d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.f2177c + ", type=" + this.f2178d + ", deps=" + Arrays.toString(this.f2176b.toArray()) + "}";
    }
}

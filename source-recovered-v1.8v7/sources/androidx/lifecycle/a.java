package androidx.lifecycle;

import androidx.lifecycle.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class a {

    /* renamed from: c, reason: collision with root package name */
    static a f520c = new a();
    private final Map<Class, C0011a> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class, Boolean> f521b = new HashMap();

    /* renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    static class C0011a {
        final Map<d.a, List<b>> a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map<b, d.a> f522b;

        C0011a(Map<b, d.a> map) {
            this.f522b = map;
            for (Map.Entry<b, d.a> entry : map.entrySet()) {
                d.a value = entry.getValue();
                List<b> arrayList = this.a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        private static void b(List<b> list, g gVar, d.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(gVar, aVar, obj);
                }
            }
        }

        void a(g gVar, d.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            b(this.a.get(aVar), gVar, aVar, obj);
            b(this.a.get(d.a.ON_ANY), gVar, aVar, obj);
        }
    }

    static class b {
        final int a;

        /* renamed from: b, reason: collision with root package name */
        final Method f523b;

        b(int i, Method method) {
            this.a = i;
            this.f523b = method;
            method.setAccessible(true);
        }

        void a(g gVar, d.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                int i = this.a;
                if (i == 0) {
                    this.f523b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f523b.invoke(obj, gVar);
                } else {
                    if (i != 2) {
                        return;
                    }
                    this.f523b.invoke(obj, gVar, aVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.f523b.getName().equals(bVar.f523b.getName());
        }

        public int hashCode() {
            return (this.a * 31) + this.f523b.getName().hashCode();
        }
    }

    a() {
    }

    private C0011a a(Class cls, Method[] methodArr) {
        int i;
        C0011a c0011aC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (c0011aC = c(superclass)) != null) {
            map.putAll(c0011aC.f522b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, d.a> entry : c(cls2).f522b.entrySet()) {
                e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            n nVar = (n) method.getAnnotation(n.class);
            if (nVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(g.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                d.a aVarValue = nVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(d.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != d.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i, method), aVarValue, cls);
                z = true;
            }
        }
        C0011a c0011a = new C0011a(map);
        this.a.put(cls, c0011a);
        this.f521b.put(cls, Boolean.valueOf(z));
        return c0011a;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    private void e(Map<b, d.a> map, b bVar, d.a aVar, Class cls) {
        d.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f523b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    C0011a c(Class cls) {
        C0011a c0011a = this.a.get(cls);
        return c0011a != null ? c0011a : a(cls, null);
    }

    boolean d(Class cls) {
        Boolean bool = this.f521b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((n) method.getAnnotation(n.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f521b.put(cls, Boolean.FALSE);
        return false;
    }
}

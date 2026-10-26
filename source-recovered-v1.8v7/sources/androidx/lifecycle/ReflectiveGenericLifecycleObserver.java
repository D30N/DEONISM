package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.d;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements e {
    private final Object a;

    /* renamed from: b, reason: collision with root package name */
    private final a.C0011a f519b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.f519b = a.f520c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f519b.a(gVar, aVar, this.a);
    }
}

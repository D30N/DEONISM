package androidx.fragment.app;

import androidx.lifecycle.d;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: b, reason: collision with root package name */
    int f479b;

    /* renamed from: c, reason: collision with root package name */
    int f480c;

    /* renamed from: d, reason: collision with root package name */
    int f481d;
    int e;
    int f;
    int g;
    boolean h;
    String i;
    int j;
    CharSequence k;
    int l;
    CharSequence m;
    ArrayList<String> n;
    ArrayList<String> o;
    ArrayList<Runnable> q;
    ArrayList<a> a = new ArrayList<>();
    boolean p = false;

    static final class a {
        int a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f482b;

        /* renamed from: c, reason: collision with root package name */
        int f483c;

        /* renamed from: d, reason: collision with root package name */
        int f484d;
        int e;
        int f;
        d.b g;
        d.b h;

        a() {
        }

        a(int i, Fragment fragment) {
            this.a = i;
            this.f482b = fragment;
            d.b bVar = d.b.RESUMED;
            this.g = bVar;
            this.h = bVar;
        }
    }

    public n b(Fragment fragment, String str) {
        f(0, fragment, str, 1);
        return this;
    }

    void c(a aVar) {
        this.a.add(aVar);
        aVar.f483c = this.f479b;
        aVar.f484d = this.f480c;
        aVar.e = this.f481d;
        aVar.f = this.e;
    }

    public abstract int d();

    public abstract int e();

    void f(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.y;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.y + " now " + str);
            }
            fragment.y = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.w;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.w + " now " + i);
            }
            fragment.w = i;
            fragment.x = i;
        }
        c(new a(i2, fragment));
    }

    public n g(Fragment fragment) {
        c(new a(3, fragment));
        return this;
    }
}

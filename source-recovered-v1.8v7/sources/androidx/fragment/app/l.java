package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.q;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
class l extends androidx.lifecycle.p {
    private static final q.a h = new a();
    private final boolean e;

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<Fragment> f473b = new HashSet<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, l> f474c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, androidx.lifecycle.r> f475d = new HashMap<>();
    private boolean f = false;
    private boolean g = false;

    static class a implements q.a {
        a() {
        }

        @Override // androidx.lifecycle.q.a
        public <T extends androidx.lifecycle.p> T a(Class<T> cls) {
            return new l(true);
        }
    }

    l(boolean z) {
        this.e = z;
    }

    static l g(androidx.lifecycle.r rVar) {
        return (l) new androidx.lifecycle.q(rVar, h).a(l.class);
    }

    @Override // androidx.lifecycle.p
    protected void c() {
        if (j.I) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    boolean d(Fragment fragment) {
        return this.f473b.add(fragment);
    }

    void e(Fragment fragment) {
        if (j.I) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        l lVar = this.f474c.get(fragment.f);
        if (lVar != null) {
            lVar.c();
            this.f474c.remove(fragment.f);
        }
        androidx.lifecycle.r rVar = this.f475d.get(fragment.f);
        if (rVar != null) {
            rVar.a();
            this.f475d.remove(fragment.f);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f473b.equals(lVar.f473b) && this.f474c.equals(lVar.f474c) && this.f475d.equals(lVar.f475d);
    }

    l f(Fragment fragment) {
        l lVar = this.f474c.get(fragment.f);
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this.e);
        this.f474c.put(fragment.f, lVar2);
        return lVar2;
    }

    Collection<Fragment> h() {
        return this.f473b;
    }

    public int hashCode() {
        return (((this.f473b.hashCode() * 31) + this.f474c.hashCode()) * 31) + this.f475d.hashCode();
    }

    androidx.lifecycle.r i(Fragment fragment) {
        androidx.lifecycle.r rVar = this.f475d.get(fragment.f);
        if (rVar != null) {
            return rVar;
        }
        androidx.lifecycle.r rVar2 = new androidx.lifecycle.r();
        this.f475d.put(fragment.f, rVar2);
        return rVar2;
    }

    boolean j() {
        return this.f;
    }

    boolean k(Fragment fragment) {
        return this.f473b.remove(fragment);
    }

    boolean l(Fragment fragment) {
        if (this.f473b.contains(fragment)) {
            return this.e ? this.f : !this.g;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f473b.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f474c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f475d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}

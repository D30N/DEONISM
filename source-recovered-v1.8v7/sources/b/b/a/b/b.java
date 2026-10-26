package b.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b, reason: collision with root package name */
    c<K, V> f727b;

    /* renamed from: c, reason: collision with root package name */
    private c<K, V> f728c;

    /* renamed from: d, reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f729d = new WeakHashMap<>();
    private int e = 0;

    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // b.b.a.b.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.e;
        }

        @Override // b.b.a.b.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f732d;
        }
    }

    /* renamed from: b.b.a.b.b$b, reason: collision with other inner class name */
    private static class C0020b<K, V> extends e<K, V> {
        C0020b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // b.b.a.b.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f732d;
        }

        @Override // b.b.a.b.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.e;
        }
    }

    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        final K f730b;

        /* renamed from: c, reason: collision with root package name */
        final V f731c;

        /* renamed from: d, reason: collision with root package name */
        c<K, V> f732d;
        c<K, V> e;

        c(K k, V v) {
            this.f730b = k;
            this.f731c = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f730b.equals(cVar.f730b) && this.f731c.equals(cVar.f731c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f730b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f731c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f730b.hashCode() ^ this.f731c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f730b + "=" + this.f731c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b, reason: collision with root package name */
        private c<K, V> f733b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f734c = true;

        d() {
        }

        @Override // b.b.a.b.b.f
        public void b(c<K, V> cVar) {
            c<K, V> cVar2 = this.f733b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.e;
                this.f733b = cVar3;
                this.f734c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f734c) {
                this.f734c = false;
                cVar = b.this.f727b;
            } else {
                c<K, V> cVar2 = this.f733b;
                cVar = cVar2 != null ? cVar2.f732d : null;
            }
            this.f733b = cVar;
            return this.f733b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f734c) {
                return b.this.f727b != null;
            }
            c<K, V> cVar = this.f733b;
            return (cVar == null || cVar.f732d == null) ? false : true;
        }
    }

    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b, reason: collision with root package name */
        c<K, V> f736b;

        /* renamed from: c, reason: collision with root package name */
        c<K, V> f737c;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f736b = cVar2;
            this.f737c = cVar;
        }

        private c<K, V> f() {
            c<K, V> cVar = this.f737c;
            c<K, V> cVar2 = this.f736b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // b.b.a.b.b.f
        public void b(c<K, V> cVar) {
            if (this.f736b == cVar && cVar == this.f737c) {
                this.f737c = null;
                this.f736b = null;
            }
            c<K, V> cVar2 = this.f736b;
            if (cVar2 == cVar) {
                this.f736b = c(cVar2);
            }
            if (this.f737c == cVar) {
                this.f737c = f();
            }
        }

        abstract c<K, V> c(c<K, V> cVar);

        abstract c<K, V> d(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f737c;
            this.f737c = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f737c != null;
        }
    }

    interface f<K, V> {
        void b(c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> c() {
        C0020b c0020b = new C0020b(this.f728c, this.f727b);
        this.f729d.put(c0020b, Boolean.FALSE);
        return c0020b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public Map.Entry<K, V> h() {
        return this.f727b;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    protected c<K, V> i(K k) {
        c<K, V> cVar = this.f727b;
        while (cVar != null && !cVar.f730b.equals(k)) {
            cVar = cVar.f732d;
        }
        return cVar;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f727b, this.f728c);
        this.f729d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public b<K, V>.d j() {
        b<K, V>.d dVar = new d();
        this.f729d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> k() {
        return this.f728c;
    }

    protected c<K, V> l(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.e++;
        c<K, V> cVar2 = this.f728c;
        if (cVar2 == null) {
            this.f727b = cVar;
        } else {
            cVar2.f732d = cVar;
            cVar.e = cVar2;
        }
        this.f728c = cVar;
        return cVar;
    }

    public V m(K k, V v) {
        c<K, V> cVarI = i(k);
        if (cVarI != null) {
            return cVarI.f731c;
        }
        l(k, v);
        return null;
    }

    public V n(K k) {
        c<K, V> cVarI = i(k);
        if (cVarI == null) {
            return null;
        }
        this.e--;
        if (!this.f729d.isEmpty()) {
            Iterator<f<K, V>> it = this.f729d.keySet().iterator();
            while (it.hasNext()) {
                it.next().b(cVarI);
            }
        }
        c<K, V> cVar = cVarI.e;
        if (cVar != null) {
            cVar.f732d = cVarI.f732d;
        } else {
            this.f727b = cVarI.f732d;
        }
        c<K, V> cVar2 = cVarI.f732d;
        if (cVar2 != null) {
            cVar2.e = cVarI.e;
        } else {
            this.f728c = cVarI.e;
        }
        cVarI.f732d = null;
        cVarI.e = null;
        return cVarI.f731c;
    }

    public int size() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

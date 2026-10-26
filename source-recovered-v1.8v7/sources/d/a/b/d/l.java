package d.a.b.d;

/* loaded from: classes.dex */
public class l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    static class a<T> implements k<T> {
        final /* synthetic */ Object a;

        a(Object obj) {
            this.a = obj;
        }

        @Override // d.a.b.d.k
        public T get() {
            return (T) this.a;
        }
    }

    public static <T> k<T> a(T t) {
        return new a(t);
    }
}

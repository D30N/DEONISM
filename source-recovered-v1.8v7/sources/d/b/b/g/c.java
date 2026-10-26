package d.b.b.g;

/* loaded from: classes.dex */
public interface c {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* renamed from: b, reason: collision with root package name */
        private final int f3036b;

        a(int i) {
            this.f3036b = i;
        }

        public int f() {
            return this.f3036b;
        }
    }

    a a(String str);
}

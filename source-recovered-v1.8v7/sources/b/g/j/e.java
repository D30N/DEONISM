package b.g.j;

import java.util.Locale;

/* loaded from: classes.dex */
public final class e {
    public static final b.g.j.d a = new C0029e(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final b.g.j.d f898b = new C0029e(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final b.g.j.d f899c = new C0029e(b.a, false);

    /* renamed from: d, reason: collision with root package name */
    public static final b.g.j.d f900d = new C0029e(b.a, true);

    private static class a implements c {

        /* renamed from: b, reason: collision with root package name */
        static final a f901b = new a(true);
        private final boolean a;

        private a(boolean z) {
            this.a = z;
        }

        @Override // b.g.j.e.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int iA = e.a(Character.getDirectionality(charSequence.charAt(i)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                        i++;
                    } else if (!this.a) {
                        return 1;
                    }
                } else if (this.a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {
        static final b a = new b();

        private b() {
        }

        @Override // b.g.j.e.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int iB = 2;
            while (i < i3 && iB == 2) {
                iB = e.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return iB;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    private static abstract class d implements b.g.j.d {
        private final c a;

        d(c cVar) {
            this.a = cVar;
        }

        private boolean c(CharSequence charSequence, int i, int i2) {
            int iA = this.a.a(charSequence, i, i2);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return b();
            }
            return false;
        }

        @Override // b.g.j.d
        public boolean a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            return this.a == null ? b() : c(charSequence, i, i2);
        }

        protected abstract boolean b();
    }

    /* renamed from: b.g.j.e$e, reason: collision with other inner class name */
    private static class C0029e extends d {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f902b;

        C0029e(c cVar, boolean z) {
            super(cVar);
            this.f902b = z;
        }

        @Override // b.g.j.e.d
        protected boolean b() {
            return this.f902b;
        }
    }

    private static class f extends d {

        /* renamed from: b, reason: collision with root package name */
        static final f f903b = new f();

        f() {
            super(null);
        }

        @Override // b.g.j.e.d
        protected boolean b() {
            return b.g.j.f.b(Locale.getDefault()) == 1;
        }
    }

    static {
        a aVar = a.f901b;
        f fVar = f.f903b;
    }

    static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}

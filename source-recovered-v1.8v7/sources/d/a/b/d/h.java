package d.a.b.d;

import java.util.Arrays;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class h {

    public static final class b {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private a f2370b;

        /* renamed from: c, reason: collision with root package name */
        private a f2371c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2372d;

        private static final class a {

            @Nullable
            String a;

            /* renamed from: b, reason: collision with root package name */
            @Nullable
            Object f2373b;

            /* renamed from: c, reason: collision with root package name */
            a f2374c;

            private a() {
            }
        }

        private b(String str) {
            a aVar = new a();
            this.f2370b = aVar;
            this.f2371c = aVar;
            this.f2372d = false;
            i.g(str);
            this.a = str;
        }

        private a d() {
            a aVar = new a();
            this.f2371c.f2374c = aVar;
            this.f2371c = aVar;
            return aVar;
        }

        private b e(String str, @Nullable Object obj) {
            a aVarD = d();
            aVarD.f2373b = obj;
            i.g(str);
            aVarD.a = str;
            return this;
        }

        public b a(String str, int i) {
            e(str, String.valueOf(i));
            return this;
        }

        public b b(String str, @Nullable Object obj) {
            e(str, obj);
            return this;
        }

        public b c(String str, boolean z) {
            e(str, String.valueOf(z));
            return this;
        }

        public String toString() {
            boolean z = this.f2372d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.a);
            sb.append('{');
            String str = "";
            for (a aVar = this.f2370b.f2374c; aVar != null; aVar = aVar.f2374c) {
                if (!z || aVar.f2373b != null) {
                    sb.append(str);
                    String str2 = aVar.a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    sb.append(aVar.f2373b);
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    @CheckReturnValue
    public static boolean a(@Nullable Object obj, @Nullable Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(@Nullable Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    private static String c(Class<?> cls) {
        String strReplaceAll = cls.getName().replaceAll("\\$[0-9]+", "\\$");
        int iLastIndexOf = strReplaceAll.lastIndexOf(36);
        if (iLastIndexOf == -1) {
            iLastIndexOf = strReplaceAll.lastIndexOf(46);
        }
        return strReplaceAll.substring(iLastIndexOf + 1);
    }

    public static b d(Object obj) {
        return new b(c(obj.getClass()));
    }
}

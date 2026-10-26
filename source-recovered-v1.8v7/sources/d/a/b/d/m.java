package d.a.b.d;

import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class m {
    public static RuntimeException a(Throwable th) throws X {
        i.g(th);
        c(th);
        throw new RuntimeException(th);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public static <X extends Throwable> void b(@Nullable Throwable th, Class<X> cls) throws X {
        if (th != null && cls.isInstance(th)) {
            throw cls.cast(th);
        }
    }

    public static void c(@Nullable Throwable th) throws X {
        b(th, Error.class);
        b(th, RuntimeException.class);
    }
}

package d.b.a.a.d;

import android.os.IBinder;
import d.b.a.a.d.a;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class b<T> extends a.AbstractBinderC0096a {
    private final T a;

    private b(T t) {
        this.a = t;
    }

    public static <T> a U(T t) {
        return new b(t);
    }

    public static <T> T h(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).a;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}

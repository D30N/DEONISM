package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.g;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes.dex */
class i {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static Field f398b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f399c;

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    static Bundle b(g.a aVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("icon", aVar.e());
        bundle.putCharSequence("title", aVar.i());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", e(aVar.f()));
        bundle.putBoolean("showsUserInterface", aVar.h());
        bundle.putInt("semanticAction", aVar.g());
        return bundle;
    }

    public static Bundle c(Notification notification) {
        String str;
        String str2;
        synchronized (a) {
            if (f399c) {
                return null;
            }
            try {
                if (f398b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f399c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f398b = declaredField;
                }
                Bundle bundle = (Bundle) f398b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f398b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                e = e;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f399c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                e = e2;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f399c = true;
                return null;
            }
        }
    }

    private static Bundle d(j jVar) {
        new Bundle();
        jVar.c();
        throw null;
    }

    private static Bundle[] e(j[] jVarArr) {
        if (jVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[jVarArr.length];
        if (jVarArr.length <= 0) {
            return bundleArr;
        }
        d(jVarArr[0]);
        throw null;
    }

    public static Bundle f(Notification.Builder builder, g.a aVar) {
        builder.addAction(aVar.e(), aVar.i(), aVar.a());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", e(aVar.f()));
        }
        if (aVar.c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", e(aVar.c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        return bundle;
    }
}

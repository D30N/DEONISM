package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) aVar.v(remoteActionCompat.a, 1);
        remoteActionCompat.f369b = aVar.l(remoteActionCompat.f369b, 2);
        remoteActionCompat.f370c = aVar.l(remoteActionCompat.f370c, 3);
        remoteActionCompat.f371d = (PendingIntent) aVar.r(remoteActionCompat.f371d, 4);
        remoteActionCompat.e = aVar.h(remoteActionCompat.e, 5);
        remoteActionCompat.f = aVar.h(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.a, 1);
        aVar.D(remoteActionCompat.f369b, 2);
        aVar.D(remoteActionCompat.f370c, 3);
        aVar.H(remoteActionCompat.f371d, 4);
        aVar.z(remoteActionCompat.e, 5);
        aVar.z(remoteActionCompat.f, 6);
    }
}

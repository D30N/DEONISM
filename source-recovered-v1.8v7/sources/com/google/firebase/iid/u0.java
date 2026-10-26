package com.google.firebase.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public class u0 implements Parcelable {
    public static final Parcelable.Creator<u0> CREATOR = new t0();

    /* renamed from: b, reason: collision with root package name */
    private Messenger f2260b;

    /* renamed from: c, reason: collision with root package name */
    private h1 f2261c;

    public static final class a extends ClassLoader {
        @Override // java.lang.ClassLoader
        protected final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (!FirebaseInstanceId.v()) {
                return u0.class;
            }
            Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            return u0.class;
        }
    }

    public u0(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2260b = new Messenger(iBinder);
        } else {
            this.f2261c = new g1(iBinder);
        }
    }

    private final IBinder a() {
        Messenger messenger = this.f2260b;
        return messenger != null ? messenger.getBinder() : this.f2261c.asBinder();
    }

    public final void b(Message message) throws RemoteException {
        Messenger messenger = this.f2260b;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f2261c.u(message);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((u0) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f2260b;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f2261c.asBinder());
    }
}

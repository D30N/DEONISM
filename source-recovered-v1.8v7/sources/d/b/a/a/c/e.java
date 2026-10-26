package d.b.a.a.c;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.g;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public class e extends f {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f2607d = new Object();
    private static final e e = new e();

    /* renamed from: c, reason: collision with root package name */
    private String f2608c;

    @SuppressLint({"HandlerLeak"})
    private class a extends d.b.a.a.e.b.d {
        private final Context a;

        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.a = context.getApplicationContext();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int iG = e.this.g(this.a);
            if (e.this.i(iG)) {
                e.this.o(this.a, iG);
            }
        }
    }

    public static e m() {
        return e;
    }

    static Dialog p(Context context, int i, com.google.android.gms.common.internal.e eVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.d.d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strC = com.google.android.gms.common.internal.d.c(context, i);
        if (strC != null) {
            builder.setPositiveButton(strC, eVar);
        }
        String strG = com.google.android.gms.common.internal.d.g(context, i);
        if (strG != null) {
            builder.setTitle(strG);
        }
        return builder.create();
    }

    static void q(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof androidx.fragment.app.d) {
            l.u1(dialog, onCancelListener).t1(((androidx.fragment.app.d) activity).o(), str);
        } else {
            c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
        }
    }

    @TargetApi(20)
    private final void s(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            r(context);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strF = com.google.android.gms.common.internal.d.f(context, i);
        String strE = com.google.android.gms.common.internal.d.e(context, i);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        g.c cVar = new g.c(context);
        cVar.k(true);
        cVar.e(true);
        cVar.i(strF);
        g.b bVar = new g.b();
        bVar.g(strE);
        cVar.n(bVar);
        if (com.google.android.gms.common.util.i.c(context)) {
            com.google.android.gms.common.internal.q.n(com.google.android.gms.common.util.l.f());
            cVar.m(context.getApplicationInfo().icon);
            cVar.l(2);
            if (com.google.android.gms.common.util.i.d(context)) {
                cVar.a(d.b.a.a.b.a.common_full_open_on_phone, resources.getString(d.b.a.a.b.b.common_open_on_phone), pendingIntent);
            } else {
                cVar.g(pendingIntent);
            }
        } else {
            cVar.m(R.drawable.stat_sys_warning);
            cVar.o(resources.getString(d.b.a.a.b.b.common_google_play_services_notification_ticker));
            cVar.p(System.currentTimeMillis());
            cVar.g(pendingIntent);
            cVar.h(strE);
        }
        if (com.google.android.gms.common.util.l.i()) {
            com.google.android.gms.common.internal.q.n(com.google.android.gms.common.util.l.i());
            String strU = u();
            if (strU == null) {
                strU = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String strB = com.google.android.gms.common.internal.d.b(context);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel("com.google.android.gms.availability", strB, 4);
                } else if (!strB.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(strB);
                }
                notificationManager.createNotificationChannel(notificationChannel);
            }
            cVar.f(strU);
        }
        Notification notificationB = cVar.b();
        if (i == 1 || i == 2 || i == 3) {
            i2 = 10436;
            i.f2613d.set(false);
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationB);
    }

    private final String u() {
        String str;
        synchronized (f2607d) {
            str = this.f2608c;
        }
        return str;
    }

    @Override // d.b.a.a.c.f
    public Intent b(Context context, int i, String str) {
        return super.b(context, i, str);
    }

    @Override // d.b.a.a.c.f
    public PendingIntent c(Context context, int i, int i2) {
        return super.c(context, i, i2);
    }

    @Override // d.b.a.a.c.f
    public final String e(int i) {
        return super.e(i);
    }

    @Override // d.b.a.a.c.f
    public int g(Context context) {
        return super.g(context);
    }

    @Override // d.b.a.a.c.f
    public int h(Context context, int i) {
        return super.h(context, i);
    }

    @Override // d.b.a.a.c.f
    public final boolean i(int i) {
        return super.i(i);
    }

    public Dialog k(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i, com.google.android.gms.common.internal.e.a(activity, b(activity, i, "d"), i2), onCancelListener);
    }

    public PendingIntent l(Context context, b bVar) {
        return bVar.l() ? bVar.k() : c(context, bVar.h(), 0);
    }

    public boolean n(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogK = k(activity, i, i2, onCancelListener);
        if (dialogK == null) {
            return false;
        }
        q(activity, dialogK, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(Context context, int i) {
        s(context, i, null, d(context, i, 0, "n"));
    }

    final void r(Context context) {
        new a(context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean t(Context context, b bVar, int i) {
        PendingIntent pendingIntentL = l(context, bVar);
        if (pendingIntentL == null) {
            return false;
        }
        s(context, bVar.h(), null, GoogleApiActivity.a(context, pendingIntentL, i));
        return true;
    }
}

package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;

/* loaded from: classes.dex */
public final class n9 extends o9 {

    /* renamed from: d, reason: collision with root package name */
    private final AlarmManager f1812d;
    private final h e;
    private Integer f;

    protected n9(r9 r9Var) {
        super(r9Var);
        this.f1812d = (AlarmManager) f().getSystemService("alarm");
        this.e = new m9(this, r9Var.g0(), r9Var);
    }

    @TargetApi(24)
    private final void x() {
        ((JobScheduler) f().getSystemService("jobscheduler")).cancel(y());
    }

    private final int y() {
        if (this.f == null) {
            String strValueOf = String.valueOf(f().getPackageName());
            this.f = Integer.valueOf((strValueOf.length() != 0 ? "measurement".concat(strValueOf) : new String("measurement")).hashCode());
        }
        return this.f.intValue();
    }

    private final PendingIntent z() {
        Context contextF = f();
        return PendingIntent.getBroadcast(contextF, 0, new Intent().setClassName(contextF, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    @Override // com.google.android.gms.measurement.internal.o9
    protected final boolean u() {
        this.f1812d.cancel(z());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        x();
        return false;
    }

    public final void v(long j) {
        s();
        h();
        Context contextF = f();
        if (!w4.b(contextF)) {
            m().N().a("Receiver not registered/enabled");
        }
        if (!z9.Y(contextF, false)) {
            m().N().a("Service not registered/enabled");
        }
        w();
        m().O().b("Scheduling upload, millis", Long.valueOf(j));
        long jB = k().b() + j;
        if (j < Math.max(0L, r.x.a(null).longValue()) && !this.e.d()) {
            this.e.c(j);
        }
        h();
        if (Build.VERSION.SDK_INT < 24) {
            this.f1812d.setInexactRepeating(2, jB, Math.max(r.s.a(null).longValue(), j), z());
            return;
        }
        Context contextF2 = f();
        ComponentName componentName = new ComponentName(contextF2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iY = y();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        d.b.a.a.e.e.d6.b(contextF2, new JobInfo.Builder(iY, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void w() {
        s();
        m().O().a("Unscheduling upload");
        this.f1812d.cancel(z());
        this.e.e();
        if (Build.VERSION.SDK_INT >= 24) {
            x();
        }
    }
}

package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import b.k.a.a;
import com.google.android.gms.measurement.internal.v8;
import com.google.android.gms.measurement.internal.z8;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements z8 {

    /* renamed from: b, reason: collision with root package name */
    private v8<AppMeasurementService> f1608b;

    private final v8<AppMeasurementService> c() {
        if (this.f1608b == null) {
            this.f1608b = new v8<>(this);
        }
        return this.f1608b;
    }

    @Override // com.google.android.gms.measurement.internal.z8
    public final void a(Intent intent) {
        a.b(intent);
    }

    @Override // com.google.android.gms.measurement.internal.z8
    public final void b(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.z8
    public final boolean f(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return c().b(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        c().c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        c().h();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        c().k(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return c().a(intent, i, i2);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return c().i(intent);
    }
}

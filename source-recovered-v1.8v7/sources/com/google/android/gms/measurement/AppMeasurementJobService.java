package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.v8;
import com.google.android.gms.measurement.internal.z8;

@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements z8 {

    /* renamed from: b, reason: collision with root package name */
    private v8<AppMeasurementJobService> f1606b;

    private final v8<AppMeasurementJobService> c() {
        if (this.f1606b == null) {
            this.f1606b = new v8<>(this);
        }
        return this.f1606b;
    }

    @Override // com.google.android.gms.measurement.internal.z8
    public final void a(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.z8
    @TargetApi(24)
    public final void b(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.measurement.internal.z8
    public final boolean f(int i) {
        throw new UnsupportedOperationException();
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return c().g(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return c().i(intent);
    }
}

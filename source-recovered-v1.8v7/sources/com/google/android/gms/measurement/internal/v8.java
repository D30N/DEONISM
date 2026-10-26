package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.z8;

/* loaded from: classes.dex */
public final class v8<T extends Context & z8> {
    private final T a;

    public v8(T t) {
        com.google.android.gms.common.internal.q.k(t);
        this.a = t;
    }

    private final void f(Runnable runnable) {
        r9 r9VarC = r9.c(this.a);
        r9VarC.j().z(new a9(this, r9VarC, runnable));
    }

    private final z3 j() {
        return d5.a(this.a, null, null).m();
    }

    public final int a(final Intent intent, int i, final int i2) {
        d5 d5VarA = d5.a(this.a, null, null);
        final z3 z3VarM = d5VarA.m();
        if (intent == null) {
            z3VarM.J().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        d5VarA.h();
        z3VarM.O().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            f(new Runnable(this, i2, z3VarM, intent) { // from class: com.google.android.gms.measurement.internal.y8

                /* renamed from: b, reason: collision with root package name */
                private final v8 f1961b;

                /* renamed from: c, reason: collision with root package name */
                private final int f1962c;

                /* renamed from: d, reason: collision with root package name */
                private final z3 f1963d;
                private final Intent e;

                {
                    this.f1961b = this;
                    this.f1962c = i2;
                    this.f1963d = z3VarM;
                    this.e = intent;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f1961b.d(this.f1962c, this.f1963d, this.e);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            j().G().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new j5(r9.c(this.a));
        }
        j().J().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        d5 d5VarA = d5.a(this.a, null, null);
        z3 z3VarM = d5VarA.m();
        d5VarA.h();
        z3VarM.O().a("Local AppMeasurementService is starting up");
    }

    final /* synthetic */ void d(int i, z3 z3Var, Intent intent) {
        if (this.a.f(i)) {
            z3Var.O().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            j().O().a("Completed wakeful intent.");
            this.a.a(intent);
        }
    }

    final /* synthetic */ void e(z3 z3Var, JobParameters jobParameters) {
        z3Var.O().a("AppMeasurementJobService processed last upload request.");
        this.a.b(jobParameters, false);
    }

    @TargetApi(24)
    public final boolean g(final JobParameters jobParameters) {
        d5 d5VarA = d5.a(this.a, null, null);
        final z3 z3VarM = d5VarA.m();
        String string = jobParameters.getExtras().getString("action");
        d5VarA.h();
        z3VarM.O().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        f(new Runnable(this, z3VarM, jobParameters) { // from class: com.google.android.gms.measurement.internal.x8

            /* renamed from: b, reason: collision with root package name */
            private final v8 f1952b;

            /* renamed from: c, reason: collision with root package name */
            private final z3 f1953c;

            /* renamed from: d, reason: collision with root package name */
            private final JobParameters f1954d;

            {
                this.f1952b = this;
                this.f1953c = z3VarM;
                this.f1954d = jobParameters;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f1952b.e(this.f1953c, this.f1954d);
            }
        });
        return true;
    }

    public final void h() {
        d5 d5VarA = d5.a(this.a, null, null);
        z3 z3VarM = d5VarA.m();
        d5VarA.h();
        z3VarM.O().a("Local AppMeasurementService is shutting down");
    }

    public final boolean i(Intent intent) {
        if (intent == null) {
            j().G().a("onUnbind called with null intent");
            return true;
        }
        j().O().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final void k(Intent intent) {
        if (intent == null) {
            j().G().a("onRebind called with null intent");
        } else {
            j().O().b("onRebind called. action", intent.getAction());
        }
    }
}

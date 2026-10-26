package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j extends b6 {

    /* renamed from: c, reason: collision with root package name */
    private long f1740c;

    /* renamed from: d, reason: collision with root package name */
    private String f1741d;
    private Boolean e;
    private AccountManager f;
    private Boolean g;
    private long h;

    j(d5 d5Var) {
        super(d5Var);
    }

    @Override // com.google.android.gms.measurement.internal.b6
    protected final boolean s() {
        Calendar calendar = Calendar.getInstance();
        this.f1740c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f1741d = sb.toString();
        return false;
    }

    public final boolean u(Context context) throws PackageManager.NameNotFoundException {
        if (this.e == null) {
            h();
            this.e = Boolean.FALSE;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.e = Boolean.TRUE;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.e.booleanValue();
    }

    public final long v() {
        p();
        return this.f1740c;
    }

    public final String w() {
        p();
        return this.f1741d;
    }

    final long x() {
        c();
        return this.h;
    }

    final void y() {
        c();
        this.g = null;
        this.h = 0L;
    }

    final boolean z() throws OperationCanceledException, IOException, AuthenticatorException {
        c();
        long jA = k().a();
        if (jA - this.h > 86400000) {
            this.g = null;
        }
        Boolean bool = this.g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (b.g.d.a.a(f(), "android.permission.GET_ACCOUNTS") != 0) {
            m().K().a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f == null) {
                this.f = AccountManager.get(f());
            }
            try {
                Account[] result = this.f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                if (result != null && result.length > 0) {
                    this.g = Boolean.TRUE;
                    this.h = jA;
                    return true;
                }
                Account[] result2 = this.f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.g = Boolean.TRUE;
                    this.h = jA;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                m().H().b("Exception checking account types", e);
            }
        }
        this.h = jA;
        this.g = Boolean.FALSE;
        return false;
    }
}

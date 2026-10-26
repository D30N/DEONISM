package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class h<E> extends e {

    /* renamed from: b, reason: collision with root package name */
    private final Activity f443b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f444c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f445d;
    private final int e;
    final j f;

    h(Activity activity, Context context, Handler handler, int i) {
        this.f = new j();
        this.f443b = activity;
        b.g.k.h.d(context, "context == null");
        this.f444c = context;
        b.g.k.h.d(handler, "handler == null");
        this.f445d = handler;
        this.e = i;
    }

    h(d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.e
    public View e(int i) {
        return null;
    }

    @Override // androidx.fragment.app.e
    public boolean f() {
        return true;
    }

    Activity h() {
        return this.f443b;
    }

    Context i() {
        return this.f444c;
    }

    Handler j() {
        return this.f445d;
    }

    void k(Fragment fragment) {
    }

    public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E m();

    public LayoutInflater n() {
        return LayoutInflater.from(this.f444c);
    }

    public int o() {
        return this.e;
    }

    public boolean p() {
        return true;
    }

    public boolean q(Fragment fragment) {
        return true;
    }

    public void r(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.f444c.startActivity(intent);
    }

    public void s() {
    }
}

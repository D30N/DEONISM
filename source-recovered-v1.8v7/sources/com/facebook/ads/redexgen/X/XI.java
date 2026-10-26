package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.annotation.Nullable;
import com.facebook.ads.internal.api.Repairable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public class XI extends C8C {
    public WeakHashMap<Repairable, Boolean> A00;
    public final WeakReference<Activity> A01;
    public final AtomicReference<C0S> A02;

    public XI(Activity activity, C8E c8e, C0S c0s) {
        super(activity.getApplicationContext(), c8e);
        this.A00 = new WeakHashMap<>();
        this.A02 = new AtomicReference<>();
        this.A02.set(c0s);
        this.A01 = new WeakReference<>(activity);
    }

    public XI(Context context, C8E c8e, C0S c0s) {
        super(context.getApplicationContext(), c8e);
        this.A00 = new WeakHashMap<>();
        this.A02 = new AtomicReference<>();
        this.A02.set(c0s);
        Activity activityA00 = A00(context);
        if (activityA00 != null) {
            this.A01 = new WeakReference<>(activityA00);
        } else {
            this.A01 = new WeakReference<>(null);
        }
    }

    @Nullable
    public static Activity A00(Context context) {
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    context = context;
                    if (!(context instanceof ContextWrapper)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    context = context;
                    if (!(context instanceof Activity)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return (Activity) context;
                case 5:
                    context = context;
                    if (!(context instanceof XI)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    context = context;
                    if (((XI) context).A09() == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return ((XI) context).A09();
                case '\b':
                    context = ((ContextWrapper) context).getBaseContext();
                    c2 = 2;
                    break;
                case '\t':
                    return (Activity) null;
            }
        }
    }

    @Nullable
    public final Activity A09() {
        return this.A01.get();
    }

    public C0S A0A() {
        C0S c0s = this.A02.get();
        if (c0s == null) {
            return new RN();
        }
        return c0s;
    }

    public final void A0B(C0S c0s) {
        this.A02.set(c0s);
    }

    public final void A0C(Repairable repairable) {
        this.A00.put(repairable, true);
    }

    public final void A0D(XI xi) {
        xi.A00.putAll(this.A00);
        this.A00 = xi.A00;
    }

    public final void A0E(Throwable th) {
        Iterator<Map.Entry<Repairable, Boolean>> it = this.A00.entrySet().iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    th = th;
                    it = it;
                    it.next().getKey().repair(th);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }
}

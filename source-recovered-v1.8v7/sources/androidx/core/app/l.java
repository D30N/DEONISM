package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l implements Iterable<Intent> {

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<Intent> f400b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final Context f401c;

    public interface a {
        Intent e();
    }

    private l(Context context) {
        this.f401c = context;
    }

    public static l j(Context context) {
        return new l(context);
    }

    public l c(Intent intent) {
        this.f400b.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l h(Activity activity) {
        Intent intentE = activity instanceof a ? ((a) activity).e() : null;
        if (intentE == null) {
            intentE = e.a(activity);
        }
        if (intentE != null) {
            ComponentName component = intentE.getComponent();
            if (component == null) {
                component = intentE.resolveActivity(this.f401c.getPackageManager());
            }
            i(component);
            c(intentE);
        }
        return this;
    }

    public l i(ComponentName componentName) {
        int size = this.f400b.size();
        try {
            Context context = this.f401c;
            while (true) {
                Intent intentB = e.b(context, componentName);
                if (intentB == null) {
                    return this;
                }
                this.f400b.add(size, intentB);
                context = this.f401c;
                componentName = intentB.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f400b.iterator();
    }

    public void k() {
        l(null);
    }

    public void l(Bundle bundle) {
        if (this.f400b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.f400b;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (b.g.d.a.i(this.f401c, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f401c.startActivity(intent);
    }
}

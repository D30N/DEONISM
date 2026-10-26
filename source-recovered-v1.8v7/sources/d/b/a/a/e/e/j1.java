package d.b.a.a.e.e;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
final class j1 extends ContentObserver {
    j1(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        k1.e.set(true);
    }
}

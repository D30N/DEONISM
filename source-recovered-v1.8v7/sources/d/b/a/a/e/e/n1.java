package d.b.a.a.e.e;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
final class n1 extends ContentObserver {
    private final /* synthetic */ l1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n1(l1 l1Var, Handler handler) {
        super(null);
        this.a = l1Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.c();
    }
}

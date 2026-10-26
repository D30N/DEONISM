package com.google.firebase.iid;

import android.os.Bundle;

/* loaded from: classes.dex */
final class r extends p<Bundle> {
    r(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // com.google.firebase.iid.p
    final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        c(bundle2);
    }

    @Override // com.google.firebase.iid.p
    final boolean d() {
        return false;
    }
}

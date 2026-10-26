package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.a;

/* loaded from: classes.dex */
final class m implements a.InterfaceC0063a {
    private final /* synthetic */ b a;

    m(b bVar) {
        this.a = bVar;
    }

    @Override // com.google.android.gms.common.api.internal.a.InterfaceC0063a
    public final void a(boolean z) {
        this.a.l.sendMessage(this.a.l.obtainMessage(1, Boolean.valueOf(z)));
    }
}

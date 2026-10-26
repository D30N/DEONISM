package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.d;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements com.google.firebase.components.h {
    static /* synthetic */ h lambda$getComponents$0(com.google.firebase.components.e eVar) {
        return new g((d.b.b.c) eVar.a(d.b.b.c.class), (d.b.b.j.h) eVar.a(d.b.b.j.h.class), (d.b.b.g.c) eVar.a(d.b.b.g.c.class));
    }

    @Override // com.google.firebase.components.h
    public List<com.google.firebase.components.d<?>> getComponents() {
        d.b bVarA = com.google.firebase.components.d.a(h.class);
        bVarA.b(com.google.firebase.components.n.e(d.b.b.c.class));
        bVarA.b(com.google.firebase.components.n.e(d.b.b.g.c.class));
        bVarA.b(com.google.firebase.components.n.e(d.b.b.j.h.class));
        bVarA.f(j.b());
        return Arrays.asList(bVarA.d(), d.b.b.j.g.a("fire-installations", "16.2.1"));
    }
}

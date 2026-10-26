package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.firebase.components.d;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public final class Registrar implements com.google.firebase.components.h {

    /* JADX INFO: Access modifiers changed from: private */
    static class a implements com.google.firebase.iid.b.a {
        public a(FirebaseInstanceId firebaseInstanceId) {
        }
    }

    @Override // com.google.firebase.components.h
    @Keep
    public final List<com.google.firebase.components.d<?>> getComponents() {
        d.b bVarA = com.google.firebase.components.d.a(FirebaseInstanceId.class);
        bVarA.b(com.google.firebase.components.n.e(d.b.b.c.class));
        bVarA.b(com.google.firebase.components.n.e(d.b.b.f.d.class));
        bVarA.b(com.google.firebase.components.n.e(d.b.b.j.h.class));
        bVarA.b(com.google.firebase.components.n.e(d.b.b.g.c.class));
        bVarA.b(com.google.firebase.components.n.e(com.google.firebase.installations.h.class));
        bVarA.f(s.a);
        bVarA.c();
        com.google.firebase.components.d dVarD = bVarA.d();
        d.b bVarA2 = com.google.firebase.components.d.a(com.google.firebase.iid.b.a.class);
        bVarA2.b(com.google.firebase.components.n.e(FirebaseInstanceId.class));
        bVarA2.f(t.a);
        return Arrays.asList(dVarD, bVarA2.d(), d.b.b.j.g.a("fire-iid", "20.1.5"));
    }
}

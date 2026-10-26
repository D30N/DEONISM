package com.google.firebase.components;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class a implements e {
    a() {
    }

    @Override // com.google.firebase.components.e
    public <T> T a(Class<T> cls) {
        d.b.b.h.a<T> aVarB = b(cls);
        if (aVarB == null) {
            return null;
        }
        return aVarB.get();
    }

    @Override // com.google.firebase.components.e
    public <T> Set<T> c(Class<T> cls) {
        return d(cls).get();
    }
}

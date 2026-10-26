package com.google.firebase.components;

import java.util.Set;

/* loaded from: classes.dex */
final /* synthetic */ class j implements d.b.b.h.a {
    private final Set a;

    private j(Set set) {
        this.a = set;
    }

    public static d.b.b.h.a a(Set set) {
        return new j(set);
    }

    @Override // d.b.b.h.a
    public Object get() {
        return l.g(this.a);
    }
}

package com.facebook.imageformat;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f1245b = new c("UNKNOWN", null);
    private final String a;

    public interface a {
        int a();

        @Nullable
        c b(@Nonnull byte[] bArr, int i);
    }

    public c(String str, @Nullable String str2) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }

    public String toString() {
        return a();
    }
}

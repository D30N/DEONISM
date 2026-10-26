package com.facebook.datasource;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public interface c<T> {
    boolean a();

    @Nullable
    T b();

    boolean c();

    boolean close();

    boolean d();

    void e(e<T> eVar, Executor executor);

    @Nullable
    Throwable f();

    float g();
}

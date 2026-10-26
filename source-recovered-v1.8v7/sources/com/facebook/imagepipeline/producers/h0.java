package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.t;
import java.io.InputStream;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public interface h0<FETCH_STATE extends t> {

    public interface a {
        void a(Throwable th);

        void b();

        void c(InputStream inputStream, int i);
    }

    FETCH_STATE a(k<d.a.e.j.e> kVar, m0 m0Var);

    void b(FETCH_STATE fetch_state, int i);

    boolean c(FETCH_STATE fetch_state);

    void d(FETCH_STATE fetch_state, a aVar);

    @Nullable
    Map<String, String> e(FETCH_STATE fetch_state, int i);
}

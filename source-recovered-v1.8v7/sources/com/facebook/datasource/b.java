package com.facebook.datasource;

import javax.annotation.Nonnull;

/* loaded from: classes.dex */
public abstract class b<T> implements e<T> {
    @Override // com.facebook.datasource.e
    public void a(@Nonnull c<T> cVar) {
    }

    @Override // com.facebook.datasource.e
    public void b(@Nonnull c<T> cVar) {
        boolean zD = cVar.d();
        try {
            f(cVar);
        } finally {
            if (zD) {
                cVar.close();
            }
        }
    }

    @Override // com.facebook.datasource.e
    public void c(@Nonnull c<T> cVar) {
        try {
            e(cVar);
        } finally {
            cVar.close();
        }
    }

    protected abstract void e(@Nonnull c<T> cVar);

    protected abstract void f(@Nonnull c<T> cVar);
}

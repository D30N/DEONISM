package com.facebook.drawee.d;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<INFO>] */
@ThreadSafe
/* loaded from: classes.dex */
public class f<INFO> implements d<INFO> {
    private final List<d<? super INFO>> a = new ArrayList(2);

    private synchronized void i(String str, Throwable th) {
        Log.e("FdingControllerListener", str, th);
    }

    @Override // com.facebook.drawee.d.d
    public synchronized void a(String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                d<? super INFO> dVar = this.a.get(i);
                if (dVar != null) {
                    dVar.a(str);
                }
            } catch (Exception e) {
                i("InternalListener exception in onRelease", e);
            }
        }
    }

    @Override // com.facebook.drawee.d.d
    public synchronized void b(String str, Object obj) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                d<? super INFO> dVar = this.a.get(i);
                if (dVar != null) {
                    dVar.b(str, obj);
                }
            } catch (Exception e) {
                i("InternalListener exception in onSubmit", e);
            }
        }
    }

    @Override // com.facebook.drawee.d.d
    public synchronized void c(String str, @Nullable INFO info, @Nullable Animatable animatable) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                d<? super INFO> dVar = this.a.get(i);
                if (dVar != null) {
                    dVar.c(str, info, animatable);
                }
            } catch (Exception e) {
                i("InternalListener exception in onFinalImageSet", e);
            }
        }
    }

    @Override // com.facebook.drawee.d.d
    public void d(String str, @Nullable INFO info) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                d<? super INFO> dVar = this.a.get(i);
                if (dVar != null) {
                    dVar.d(str, info);
                }
            } catch (Exception e) {
                i("InternalListener exception in onIntermediateImageSet", e);
            }
        }
    }

    @Override // com.facebook.drawee.d.d
    public void e(String str, Throwable th) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                d<? super INFO> dVar = this.a.get(i);
                if (dVar != null) {
                    dVar.e(str, th);
                }
            } catch (Exception e) {
                i("InternalListener exception in onIntermediateImageFailed", e);
            }
        }
    }

    @Override // com.facebook.drawee.d.d
    public synchronized void f(String str, Throwable th) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                d<? super INFO> dVar = this.a.get(i);
                if (dVar != null) {
                    dVar.f(str, th);
                }
            } catch (Exception e) {
                i("InternalListener exception in onFailure", e);
            }
        }
    }

    public synchronized void g(d<? super INFO> dVar) {
        this.a.add(dVar);
    }

    public synchronized void h() {
        this.a.clear();
    }

    public synchronized void j(d<? super INFO> dVar) {
        int iIndexOf = this.a.indexOf(dVar);
        if (iIndexOf != -1) {
            this.a.set(iIndexOf, null);
        }
    }
}

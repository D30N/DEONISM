package com.facebook.imagepipeline.platform;

import android.os.Build;
import b.g.k.g;
import com.facebook.imagepipeline.memory.e0;
import com.facebook.imagepipeline.memory.q;
import d.a.e.e.l;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class e {
    public static d a(e0 e0Var, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            int iE = e0Var.e();
            return new c(e0Var.b(), iE, new g(iE));
        }
        if (i >= 21 || !l.a()) {
            int iE2 = e0Var.e();
            return new a(e0Var.b(), iE2, new g(iE2));
        }
        if (z) {
            try {
                if (Build.VERSION.SDK_INT < 19) {
                    return (d) Class.forName("com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder").getConstructor(new Class[0]).newInstance(new Object[0]);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e5);
            }
        }
        return (d) Class.forName("com.facebook.imagepipeline.platform.KitKatPurgeableDecoder").getConstructor(q.class).newInstance(e0Var.d());
    }
}
